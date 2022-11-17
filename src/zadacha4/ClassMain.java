package zadacha4;

public class ClassMain {
	public static void main(String[] args) {
		Avtomobil obj = new Avtomobil("Toyota", "Corolla", 15400, "Bela");
		System.out.println("Marka: " + obj.getMarka());
		System.out.println("Model: " + obj.getModel());
		System.out.println("Kilometri pred mnozenje: " + obj.getPominatiKM());
		System.out.println("Kilometri posle mnozenje: " + obj.mnozenjeKM(5));
		System.out.println("Boja: " + obj.getBoja());
		
	}
}
