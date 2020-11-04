package it.unical.ingsw2020.ProvaIngsw;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import org.joda.time.*;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

public class MyListUtilTest {

	private static MyListUtil m;
	private static Random r;
	private static ArrayList<Integer> numeri;
	
	private static int cont = 1;	
	private DateTime time;
	
	@BeforeClass
	public static void before() {
		m = new MyListUtil();
		r = new Random();
	}
	
	@Before
	public void numeriRandom() {
		
		time = new DateTime();
		System.out.println("Data inizio test " + cont + " : " + time.hourOfDay().get() + ":" + time.minuteOfHour().get() + ":" + time.secondOfMinute().get()
							+ ":" + time.millisOfSecond().get());
		numeri = new ArrayList<Integer>();
		for(int i = 0; i < 20; i++) {
			numeri.add(r.nextInt(100)+1);
		}
	}
	
	@Test
	public void crescente() {
		
		ArrayList<Integer> dieciNumeri = new ArrayList();
		for(int i = 10; i > 0; i--) {
			dieciNumeri.add(i);
		}
		
		assertEquals(Arrays.asList(1,2,3,4,5,6,7,8,9,10),m.ordinaNumeri(dieciNumeri, 'c'));
		
		
		numeri = m.ordinaNumeri(numeri, 'c');
		
		for(int i = 0; i+1 < numeri.size(); i++) {
			assertTrue(numeri.get(i) <= numeri.get(i+1));			
			assertFalse(numeri.get(i) > numeri.get(i+1));
		}
	}
	
	@Test
	public void decrescente() {
		
		ArrayList<Integer> dieciNumeri = new ArrayList();
		for(int i = 1; i <= 10; i++) {
			dieciNumeri.add(i);
		}
		
		assertEquals(Arrays.asList(10,9,8,7,6,5,4,3,2,1),m.ordinaNumeri(dieciNumeri, 'd'));
		
		numeri = m.ordinaNumeri(numeri, 'd');
		
		for(int i = 0; i+1 < numeri.size(); i++) {
			assertTrue(numeri.get(i) >= numeri.get(i+1));	
			assertFalse(numeri.get(i) < numeri.get(i+1));

		}
	
	}
	
	@After
	public void after() {
		time = new DateTime();
		System.out.println("Data fine test " + cont + " : " + time.hourOfDay().get() + ":" + time.minuteOfHour().get() + ":" + time.secondOfMinute().get()
				+ ":" + time.millisOfSecond().get());
		cont++;
	}
}
