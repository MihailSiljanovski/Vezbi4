package zadacha3;

public class Proizvod {
	private String ime;
	private String proizvoditel;
	private double cena;
	private double tezina;
	public Proizvod(){
		this.ime = "Kinder";
		this.proizvoditel = "Ferrera";
		this.cena = 50;
		this.tezina = 125;
	}
	public String getIme() {
		return ime;
	}
	public void setIme(String ime) {
		this.ime = ime;
	}
	public String getProizvoditel() {
		return proizvoditel;
	}
	public void setProizvoditel(String proizvoditel) {
		this.proizvoditel = proizvoditel;
	}
	public double getCena() {
		return cena;
	}
	public void setCena(double cena) {
		this.cena = cena;
	}
	public double getTezina() {
		return tezina;
	}
	public void setTezina(double tezina) {
		this.tezina = tezina;
	}
}
