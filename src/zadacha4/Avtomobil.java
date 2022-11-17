package zadacha4;

public class Avtomobil {
	private String marka;
	private String model;
	private double pominatiKM;
	private String boja;
	public Avtomobil(String marka, String model, double pominatiKM, String boja) {
		this.marka = marka;
		this.model = model;
		this.pominatiKM = pominatiKM;
		this.boja = boja;
	}
	public double mnozenjeKM(double pomnoziKM) {
		double vkupnoKM = this.pominatiKM * pomnoziKM;
		return vkupnoKM;
	}
	public String getMarka() {
		return marka;
	}
	public void setMarka(String marka) {
		this.marka = marka;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public double getPominatiKM() {
		return pominatiKM;
	}
	public void setPominatiKM(double pominatiKM) {
		this.pominatiKM = pominatiKM;
	}
	public String getBoja() {
		return boja;
	}
	public void setBoja(String boja) {
		this.boja = boja;
	}
}
