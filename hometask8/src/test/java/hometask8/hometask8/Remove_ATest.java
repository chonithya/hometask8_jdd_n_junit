package hometask8.hometask8;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Remove_ATest {
	/*       “ABCD” => “BCD” 
             “AACD” => “CD”  
             “BACD” => “BCD” 
             “BBAA” => “BBAA”        
             “AABAA” => “BAA” 
 */
		

	@Test
	void test1() {	
		Remove_A remove=new Remove_A();
		assertEquals("BCD",remove.del("ABCD"));
	}
	@Test
	void test2() {
		Remove_A remove=new Remove_A();
		assertEquals("CD",remove.del("AACD"));
	}
	@Test
	void test3() {		
		Remove_A remove=new Remove_A();
		assertEquals("BCD",remove.del("BACD"));
	}
	@Test
	void test4() {		
		Remove_A remove=new Remove_A();
		assertEquals("BBAA",remove.del("BBAA"));
	}
	@Test
	void test5() {		
		Remove_A remove=new Remove_A();
		assertEquals("BAA",remove.del("AABAA"));
	}

}
