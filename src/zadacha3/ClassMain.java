package zadacha3;

public class ClassMain {
	public static void main(String[] args) {
		Proizvod pr = new Proizvod();
		System.out.println("Ime na prizvod: " + pr.getIme());
		System.out.println("Proizvoditel: " + pr.getProizvoditel());
		System.out.println("Cena: " + pr.getCena());
		System.out.println("Tezina: " + pr.getTezina());
	}
}
