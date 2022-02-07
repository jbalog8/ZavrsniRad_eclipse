package model;

import java.util.Date;

public class Evidencija extends Zaposlenik {
	private Date datum;
	private boolean prijava;
	private Zaposlenik zaposlenik;
	private VrstaRada vrstaRada;
	
	public Evidencija(String ime, String prezime, String oib, String brKartice, Odjel odjel, Date datum,
			boolean prijava, Zaposlenik zaposlenik, VrstaRada vrstaRada) {
		super(ime, prezime, oib, brKartice, odjel);
		this.datum = datum;
		this.prijava = prijava;
		this.zaposlenik = zaposlenik;
		this.vrstaRada = vrstaRada;
	}
	public Date getDatum() {
		return datum;
	}
	public void setDatum(Date datum) {
		this.datum = datum;
	}
	public boolean isPrijava() {
		return prijava;
	}
	public void setPrijava(boolean prijava) {
		this.prijava = prijava;
	}
	public Zaposlenik getZaposlenik() {
		return zaposlenik;
	}
	public void setZaposlenik(Zaposlenik zaposlenik) {
		this.zaposlenik = zaposlenik;
	}
	public VrstaRada getVrstaRada() {
		return vrstaRada;
	}
	public void setVrstaRada(VrstaRada vrstaRada) {
		this.vrstaRada = vrstaRada;
	}
	

}
