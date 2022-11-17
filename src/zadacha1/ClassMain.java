package zadacha1;

public class ClassMain {
	public static void main(String[] args) {
		Covek covek = new Covek();
		covek.setIme("Zarko");
		covek.setPrezime("Zarkoski");
		covek.setMatichen("22101999");
		System.out.println("Ime: " + covek.getIme());
		System.out.println("Prezime: " + covek.getPrezime());
		System.out.println("Matichen: " + covek.getMatichen());
	}
}
