package com.twitter.poruke;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TwitterPorukaTest {

	TwitterPoruka a;

	@Before
	public void setUp() throws Exception {
		a = new TwitterPoruka("Milos", "Hello world");
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetKorisnik() {
		assertEquals("Milos", a.getKorisnik());
	}

	@Test
	public void testSetKorisnik() {
		a.setKorisnik("Menjam");

		assertEquals("Menjam", a.getKorisnik());
	}

	@Test(expected = RuntimeException.class)
	public void testSetKorisnikPrazan() {
		a.setKorisnik("");

	}

	@Test(expected = RuntimeException.class)
	public void testSetKorisnikNull() {
		a.setKorisnik(null);

	}

	@Test
	public void testGetPoruka() {
		assertEquals("Hello world", a.getPoruka());
	}

	@Test
	public void testSetPoruka() {
		a.setPoruka("Menjam");

		assertEquals("Menjam", a.getPoruka());
	}

	@Test(expected = RuntimeException.class)
	public void testSetPorukaPrazan() {
		a.setPoruka("");

	}

	@Test(expected = RuntimeException.class)
	public void testSetPorukaNull() {
		a.setPoruka(null);

	}

	@Test (expected = RuntimeException.class)
	public void testSetPorukaPreko140() {
		a.setPoruka("ajajajajajajaajajajajajajajajaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
		
	}

	@Test
	public void testToString() {
		assertEquals("KORISNIK:Milos PORUKA:Hello world", a.toString());
	}

}
