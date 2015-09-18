package m00;

import static org.junit.Assert.*;

import java.math.BigInteger;
import java.util.Arrays;

import org.junit.Test;

public class SearchTest {

	@Test
	public void testSearch1() {
		int num = 5;
		int mas[] = new int[]{1,5,6,9,11};
		
		int rez1 = 1;
		assertEquals(rez1, Search.find(num, mas));
	}
	
	@Test
	public void testSearch2() {
		int num = 8;
		int mas[] = new int[]{1,5,6,9,11};
		
		int rez1 = -1;
		System.out.println(Search.find(num, mas));
		assertEquals(rez1, Search.find(num, mas));
	}
	
	@Test
	public void testSearch3() {
		int num = 18;
		int mas[] = new int[]{1,5,6,9,11};
		
		int rez1 = 5;
		assertEquals(rez1, Search.find(num, mas));
	}
	
	@Test
	public void testSearch4() {
		int num = 6;
		int mas[] = new int[]{1,5,6,9,11};
		
		int rez1 = 3;
		assertEquals(rez1, Search.find(num, mas));
	}
	
	@Test
	public void testSearch5() {
		int num = 18;
		int mas[] = new int[]{1,5,6,9,11};
		
		int rez1 = 5;
		assertEquals(rez1, Search.find(num, mas));
	}
	
	

}
