package model;

public class Zaposlenik extends Entitet {
	private String ime;
	private String prezime;
	private String oib;
	private String brKartice;
	private Odjel odjel;
	private String userName;
	private String password;
	
	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public Zaposlenik() {
		
	}
	
	
	public Zaposlenik(String ime, String prezime, String oib, String brKartice, Odjel odjel) {
		super();
		this.ime = ime;
		this.prezime = prezime;
		this.oib = oib;
		this.brKartice = brKartice;
		this.odjel = odjel;
	}
	public String getIme() {
		return ime;
	}
	public void setIme(String ime) {
		this.ime = ime;
	}
	public String getPrezime() {
		return prezime;
	}
	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}
	public String getOib() {
		return oib;
	}
	public void setOib(String oib) {
		this.oib = oib;
	}
	public String getBrKartice() {
		return brKartice;
	}
	public void setBrKartice(String brKartice) {
		this.brKartice = brKartice;
	}
	public Odjel getOdjel() {
		return odjel;
	}
	public void setOdjel(Odjel odjel) {
		this.odjel = odjel;
	}
	
	@Override
	public String toString() {
		
		return "Zaposlenik -> Sifra: " + getSifra() + " " + " Ime: "+ ime + " "+" Prezime: "  + prezime+ " "+ " OIB: " + oib+ " "+ " Odijel: "  + odjel+ " " +" Broj Kartice: " + brKartice + " username:" + userName+ " "+" password " + password;  
	}

}
