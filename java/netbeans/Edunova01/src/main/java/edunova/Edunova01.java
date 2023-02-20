/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package edunova;

import com.github.javafaker.Faker;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Lorena
 */
public class Edunova01 {

    String myDriver = "org.mariadb.jdbc.Driver";
    String myUrl = "jdbc:mariadb://localhost/edunovajp27"; //DNS - DataSource Name
    private Statement st;
    private Connection con;
    private Faker faker;

    public Edunova01() { //dio za konstruktor
        faker = new Faker(new Locale.Builder().setLanguage("hr").setRegion("HR").build());
        spojiSeNaBazu();
        long pocetak = System.currentTimeMillis();
       // primjerSelect();
       // unesiSmjerBrze(100);
        long kraj=System.currentTimeMillis();
        System.out.println((kraj-pocetak)/(float)(1000));

        odspojiSe();
    }

    private void spojiSeNaBazu() {
        try {
            Class.forName(myDriver);
            con = DriverManager.getConnection(
                    myUrl, "root", "");
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Edunova01(); //zove konstruktor
    }

    private void primjerSelect() {
        System.out.println("Podaci u tablici smjer:");
        String query = "select * from smjer";

        try {
           st = con.createStatement();
            //bolje je koristitit
            //preparedStatement
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) { //sve dok ima slj. zapis ti njega citaj
                System.out.println(rs.getString("naziv"));

            }
            rs.close();
            st.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }

    private void odspojiSe() {
        try {
            con.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    private void unesiSmjer(int komada) {
          
        try {
            st = con.createStatement();
            for (int i = 0; i < komada; i++) {
            st.executeUpdate("insert into smjer(naziv) values('Smjer iz jave " + i + "')");
        }
        } catch (SQLException ex) {
        ex.printStackTrace();        }

        
    }

    private void unesiSmjerBrze(int komada) {

          
        try {
            st = con.createStatement();
            StringBuilder sb= new StringBuilder();
            sb.append("insert into smjer values");
            for (int i = 0; i < komada; i++) {
         sb.append("('");
        sb.append(faker.book().title().replace("'", "\\'"));
        sb.append("'),");
            
            }
           sb.deleteCharAt(sb.length()-1);
            st.executeUpdate(sb.toString());
        } catch (SQLException ex) {
        ex.printStackTrace();        }

        
       }

}
