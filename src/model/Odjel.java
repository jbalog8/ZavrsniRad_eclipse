package model;

public class Odjel extends Entitet {
	private String naziv;

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
		
	}
	
	
	
	public Odjel(String naziv) {
		
		this.naziv = naziv;
	}

	public Odjel() {
		
	}
	
	@Override
	public String toString() {
		
		return "Odjel -> " + " Sifra: " + getSifra() + " Naziv: " + naziv;
	}

}
