package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.Zaposlenik;
import model.Odjel;
import utility.Unos;

public class Start {
	private List<Zaposlenik> zaposlenici;
	private List<Odjel> odjeli;
	private Scanner ulaz;
	private Zaposlenik zaposlenik;
	private Odjel odjel;

	public Start() {
		zaposlenici = new ArrayList<>();
		odjeli = new ArrayList<>();
		ulaz = new Scanner(System.in);
		program();

		ulaz.close();

	}

	private void glavniIzbornik() {
		naslovGlavniIzbornik();
		System.out.println("\n1. Rad s odjelima");
		System.out.println("2. Rad s zaposlenicima");
		System.out.println("3. Kraj rada");
		switch (Unos.unesiInt(ulaz, "Odaberi ", 1, 3)) {
		case 1 -> izbornikOdjel();
		case 2 -> izbornikZaposlenici();
		case 3 -> System.out.println("\nŽelimo Vam uspješan nastavak rada!");

		}

	}

	private void izbornikOdjel() {
		naslovOdjel();
		System.out.println("\n1. Unos novog odjela");
		System.out.println("2. Brisanje odjela");
		System.out.println("3. Pregled odjela");
		System.out.println("4. Izlaz iz programa");

		switch (Unos.unesiInt(ulaz, "Odaberite akciju")) {
		case 1:
			unosOdjela();
			break;
		case 2:
			brisanjeOdjela();
			break;
		case 3:
			pregledOdjela();
			izbornikOdjel();
			break;
		case 4:
			System.out.println("\nŽelimo Vam uspješan nastavak rada!");
			glavniIzbornik();
			break;
		default:
			System.out.println("Nije dobra opcija izbornika");
			izbornikOdjel();

		}

	}

	private void pregledOdjela() {
		int b = 1;
		for (Odjel o : odjeli) {
			System.out.println(b++ + " . " + o);
		}

	}

	private void brisanjeOdjela() {
		pregledOdjela();
		odjeli.remove(Unos.unesiInt(ulaz, "Unesi odjel koji zelis obrisati") - 1);
		izbornikOdjel();

	}

	private void unosOdjela() {
		odjel = new Odjel();
		odjel.setSifra(Unos.unesiInt(ulaz, "Unesi sifru odjela"));
		odjel.setNaziv(Unos.unesiString(ulaz, "Unesi naziv odjela"));
		odjeli.add(odjel);
		izbornikOdjel();

	}

	private void program() {

		glavniIzbornik();
	}

	private void izbornikZaposlenici() {
		naslovZaposlenici();
		System.out.println("\n1. Unos novog zaposlenika");
		System.out.println("2. Brisanje zaposlenika");
		System.out.println("3. Pregled zaposlenika");
		System.out.println("4. Izlaz iz programa");

		switch (Unos.unesiInt(ulaz, "Odaberite akciju")) {
		case 1:
			unos();
			break;
		case 2:
			brisanje();
			break;
		case 3:
			pregled();
			izbornikZaposlenici();
			break;
		case 4:
			System.out.println("\nŽelimo Vam uspješan nastavak rada!");
			glavniIzbornik();
			break;
		default:
			System.out.println("Nije dobra opcija izbornika");
			izbornikZaposlenici();

		}

	}

	private void pregled() {
		int b = 1;
		for (Zaposlenik z : zaposlenici) {
			System.out.println(b++ + " . " + z);
		}

	}

	private void brisanje() {
		pregled();
		zaposlenici.remove(Unos.unesiInt(ulaz, "Odaberi radni broj zaposlenika kojeg zelis obrisati") - 1);
		izbornikZaposlenici();

	}

	private String brKartice() {
		String brKartice = "0000";
		if (zaposlenik.getSifra() >= 100) {
			brKartice = "00";
		} else if (zaposlenik.getSifra() >= 10) {
			brKartice = "000";
		}
		return brKartice;
	}

	private void unos() {
		zaposlenik = new Zaposlenik();
		zaposlenik.setSifra(Unos.unesiInt(ulaz, "Unesi sifru zaposlenika"));
		zaposlenik.setIme(Unos.unesiString(ulaz, "Unesi ime zaposlenika"));
		zaposlenik.setPrezime(Unos.unesiString(ulaz, "Unesi prezime zaposlenika"));
		zaposlenik.setOib(Unos.unesiString(ulaz, "Unesi oib zaposlenika"));
		zaposlenik.setBrKartice(brKartice() + zaposlenik.getSifra());
		zaposlenik.setUserName(zaposlenik.getIme().toLowerCase() + zaposlenik.getPrezime().toLowerCase());
		zaposlenik.setOdjel(null);
		zaposlenik.setPassword(zaposlenik.getBrKartice());
		zaposlenici.add(zaposlenik);
		izbornikZaposlenici();

	}

	private void naslovZaposlenici() {
		System.out.println();
		System.out.println("*****************************");
		System.out.println("******** Zaposlenici ********");
		System.out.println("*****************************");
	}

	private void naslovOdjel() {
		System.out.println();
		System.out.println("*****************************");
		System.out.println("*********** Odjel ***********");
		System.out.println("*****************************");
	}

	private void naslovGlavniIzbornik() {
		System.out.println();
		System.out.println("*****************************");
		System.out.println("*****  Glavni Izbornik  *****");
		System.out.println("*****************************");
	}

	public static void main(String[] args) {
		new Start();
	}
}
