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
	 * Predstavlja prazan konstruktor za ovu klasu
	 */
	public TwitterPoruka(){};
	
	/**
	 * Konstruktor za klasu, namesta ime korisnika i sadrzaj poruke.
	 * @param korisnik Predstavlja ime korisnika.
	 * @param poruka Predstavlja sadrzaj poruke
	 */
	public TwitterPoruka(String korisnik, String poruka) {
		super();
		this.korisnik = korisnik;
		this.poruka = poruka;
	}

	/**
	 * Metoda koja vraca naziv korisnika
	 * @return Ime korisnika u obliku String.
	 */
	public String getKorisnik() {
		return korisnik;
	}
	
	/**
	 * Podesava ime korisnika na ono koje je uneto.
	 * @param korisnik Predstavlja ime korisnika.
	 * @throws RuntimeException ako je korisnik null ili prazan string.
	 */
	public void setKorisnik(String korisnik) {
		if (korisnik == null || korisnik.isEmpty())
			throw new RuntimeException("Ime korisnika mora biti uneto");
		this.korisnik = korisnik;
	}
	
	/**
	 * Vraca sadrzaj poruke.
	 * @return Sadrzaj poruke je u obliku String
	 */
	public String getPoruka() {
		return poruka;
	}
	
	/**
	 * Podesava sadrzaj poruke na onaj koji je unet.
	 * @param poruka Predstavlja sadrzaj poruke
	 * @throws RuntimeException Ako je sadrzaj poruke null, prazan string ili ako duzina poruke prelazi 140 karaktera. 
	 */
	public void setPoruka(String poruka) {
		if (poruka == null || poruka == "" || poruka.length() > 140)
			throw new RuntimeException("Poruka mora biti uneta i mora imati najvise 140 znakova");
		this.poruka = poruka;
	}
	
	/**
	 * Prikazuje ime korisnika i poruku u obliku String.
	 * @return Vraca ime korisnika i sadrzaj poruke u formi sledeceg Stringa:
	 *  KORISNIK: + "korisnik" + PORUKA: + "poruka".
	 */
	public String toString() {
		return "KORISNIK:" + korisnik + " PORUKA:" + poruka;
	}
}
