package com.twitter.poruke;
/**
 * Ova klasa predstavlja poruku na Twitter-u.
 * @author Milos Mirkovic
 * @version 0.0.1
 */
public class TwitterPoruka {
	
	/**
	 * Predstavlja ime korisnika u String-u
	 */
	private String korisnik;
	
	/**
	 * Predstavlja sadrzaj poruke u String-u.
	 */
	private String poruka;
	
	
	/**
	 * Konstruktor za klasu, namesta ime korisnika i sadrzaj poruke.
	 * @param korisnik
	 * @param poruka
	 */
	public TwitterPoruka(String korisnik, String poruka) {
		super();
		this.korisnik = korisnik;
		this.poruka = poruka;
	}

	/**
	 * Metoda koja vraca naziv korisnika
	 * @return String
	 */
	public String getKorisnik() {
		return korisnik;
	}
	
	/**
	 * Podesava ime korisnika na ono koje je uneto.
	 * @param korisnik
	 */
	public void setKorisnik(String korisnik) {
		if (korisnik == null || korisnik.isEmpty())
			throw new RuntimeException("Ime korisnika mora biti uneto");
		this.korisnik = korisnik;
	}
	
	/**
	 * Vraca sadrzaj poruke.
	 * @return String
	 */
	public String getPoruka() {
		return poruka;
	}
	
	/**
	 * Podesava sadrzaj poruke na onaj koji je unet.
	 * @param poruka
	 */
	public void setPoruka(String poruka) {
		if (poruka == null || poruka == "" || poruka.length() > 140)
			throw new RuntimeException("Poruka mora biti uneta i mora imati najvise 140 znakova");
		this.poruka = poruka;
	}
	
	/**
	 * Prikazuje ime korisnika i poruku u obliku String.
	 * @return String
	 */
	public String toString() {
		return "KORISNIK:" + korisnik + " PORUKA:" + poruka;
	}
}
