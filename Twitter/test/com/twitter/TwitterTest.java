package com.twitter;

import static org.junit.Assert.*;

import java.util.LinkedList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.twitter.poruke.TwitterPoruka;

public class TwitterTest {
	
	Twitter listaPoruka;
	TwitterPoruka tweet1;
	TwitterPoruka tweet2;
	TwitterPoruka tweet3;
	@Before
	public void setUp() throws Exception {
		listaPoruka = new Twitter();
		tweet1 = new TwitterPoruka("Milos", "Hello world");
		tweet2 = new TwitterPoruka("Milos", "Hello");
		tweet3 = new TwitterPoruka("Nikola", "The world is mine");
		listaPoruka.poruke.add(tweet1);
		listaPoruka.poruke.add(tweet2);
		listaPoruka.poruke.add(tweet3);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testVratiSvePoruke() {
		assertEquals(listaPoruka.poruke, listaPoruka.vratiSvePoruke());
	}

	@Test
	public void testUnesi() {
		listaPoruka.unesi("Dzoni", "Muy loca");
		TwitterPoruka tester = new TwitterPoruka("Dzoni", "Muy loca");
		assertEquals(tester.getKorisnik(), listaPoruka.poruke.getLast().getKorisnik());
		assertEquals(tester.getPoruka(), listaPoruka.poruke.getLast().getPoruka()); 
	}
	
	@Test
	public void testVratiPoruke() {
		TwitterPoruka [] tester = listaPoruka.vratiPoruke(100, "mine");
		assertEquals("Nikola", tester[0].getKorisnik());
		assertEquals("The world is mine", tester[0].getPoruka());
		
	}
	
	
	@Test (expected = RuntimeException.class)
	public void testVratiPorukeNull() {
		listaPoruka.vratiPoruke(100, null);
	}
	
	@Test (expected = RuntimeException.class)
	public void testVratiPorukeEmpty() {
		listaPoruka.vratiPoruke(100, "");
	}

}
