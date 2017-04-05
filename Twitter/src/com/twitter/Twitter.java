package com.twitter;

import java.util.LinkedList;

import com.twitter.poruke.TwitterPoruka;

/**Klasa predstavlja twitter.
 * 
 * @author Milos Mirkovic
 * @version 1.0.0
 */
public class Twitter {
	
	/**
	 * Predstavlja listu sacuvanih poruka.
	 */
	private LinkedList<TwitterPoruka> poruke = new LinkedList<TwitterPoruka>();
	
	/**
	 * Vraca sve sacuvane poruke
	 * @return LinkedList tipa TwitterPoruke
	 */
	public LinkedList<TwitterPoruka> vratiSvePoruke() {
		return poruke;
	}
	
	/**
	 * Pravi novu poruku na osnovu unesenih parametara.
	 * Unosi je na kraj liste.
	 * @param korisnik Predstavlja ime korisnika
	 * @param poruka Predstavlja sadrzaj poruke 
	 */
	public void unesi(String korisnik, String poruka) {
		// Pravi se nova poruka i puni podacima.
		TwitterPoruka tp = new TwitterPoruka();
		tp.setKorisnik(korisnik);
		tp.setPoruka(poruka);
		// Poruka se unosi u listu na kraj
		poruke.addLast(tp);
	}
	
	
	/**Pretrazuje sve poruke u listi, i trazi one koje sadrze tag koji je dat kroz parametar.
	 * Sve poruke koje sadrze tag se vracaju u vidu niza.
	 * 
	 * @throws RuntimeException Ako je uneti tag null ili prazan string.
	 * @param maxBroj Parametar odredjuje koliko najvise poruka zelite da vratite u vidu niza
	 * @param tag Predstavlja rec koju pretrazujete u porukama 
	 * @return	TwitterPoruka[] Sve poruke koje sadrze uneseni tag.
	 */
	public TwitterPoruka[] vratiPoruke(int maxBroj, String tag) {
		if (tag == null || tag.isEmpty())
			throw new RuntimeException("Morate uneti tag");
		// Ako je maxBroj <=0, vraca maxBroj se postavlja na 100 poruka
		if (maxBroj <= 0)
			maxBroj = 100;
		// Pomocna promenljiva koja predstavlja brojac upisanih poruka
		int brojac = 0;
		// Pomocni niz koja predstavlja rezultat pretrage tj. sadrzace
		// sve poruke koje u sebi imaju zadati tag
		TwitterPoruka[] rezultat = new TwitterPoruka[maxBroj];
		// Pretrazuju se poruke i traze se one koje sadrze tag.
		// Ako se nadje neka takva, i ako nije prekoracen maxBroj
		// ona se upisuje u niz. Ako je prekoracen maxBroj,pretraga
		// se prekida.
		for (int i = 0; i < poruke.size(); i++)
			if (poruke.get(i).getPoruka().indexOf(tag) != -1)
				if (brojac < maxBroj) {
					rezultat[brojac] = poruke.get(i);
					brojac++;
				} else
					break;
		return rezultat;
	}

	public LinkedList<TwitterPoruka> getPoruke() {
		return poruke;
	}

	public void setPoruke(LinkedList<TwitterPoruka> poruke) {
		this.poruke = poruke;
	}

}
