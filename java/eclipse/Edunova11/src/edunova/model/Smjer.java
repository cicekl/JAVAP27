package edunova.model;

import java.math.BigDecimal;

public class Smjer extends Entitet{
	
	private String naziv;
	private int trajanje;
	private BigDecimal cijena;
	private BigDecimal upisnian;
	private boolean certificiran;
	

	
	public Smjer(int sifra, String naziv, int trajanje, BigDecimal cijena, BigDecimal upisnian, boolean certificiran) {
		super(sifra); //pozvan je konstruktor nadklase, a ne nadklasa
		this.naziv = naziv;
		this.trajanje = trajanje;
		this.cijena = cijena;
		this.upisnian = upisnian;
		this.certificiran = certificiran;
	}
	public Smjer(int sifra) {
		super(sifra);
	}
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	public int getTrajanje() {
		return trajanje;
	}
	public void setTrajanje(int trajanje) {
		this.trajanje = trajanje;
	}
	public BigDecimal getCijena() {
		return cijena;
	}
	public void setCijena(BigDecimal cijena) {
		this.cijena = cijena;
	}
	public BigDecimal getUpisnian() {
		return upisnian;
	}
	public void setUpisnian(BigDecimal upisnian) {
		this.upisnian = upisnian;
	}
	public boolean isCertificiran() {
		return certificiran;
	}
	public void setCertificiran(boolean certificiran) {
		this.certificiran = certificiran;
	}
	
	

}
