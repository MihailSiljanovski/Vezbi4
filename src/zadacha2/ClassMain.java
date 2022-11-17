package zadacha2;

public class ClassMain {
	public static void main(String[] args) {
		Restoran res = new Restoran();
		res.setIme("Belvedere");
		res.setLokacija("Bitola");
		res.setTelefon("047 123 456");
		res.setBrSedishta(100);
		System.out.println("Ime na restoran: " + res.getIme());
		System.out.println("Lokacija: " + res.getLokacija());
		System.out.println("Telefon: " + res.getTelefon());
		System.out.println("Broj na sedishta: " + res.getBrSedishta());
	}
}
