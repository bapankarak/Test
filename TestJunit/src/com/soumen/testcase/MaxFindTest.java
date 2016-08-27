package com.soumen.testcase;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.soumen.logic.MaxFind;

public class MaxFindTest {
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {  
        System.out.println("Before class");  
    }  
	@Before
	public void setUp() throws Exception {  
        System.out.println("before");  
    }  
	@Test
	public void testfindMax(){
		 assertEquals(4,MaxFind.findMax(new int[]{1,3,4,2}));  
	     assertEquals(-1,MaxFind.findMax(new int[]{-12,-1,-3,-4,-2})); 
	}
	@Test
	public void testcube(){
		 System.out.println("test case cube");  
	     assertEquals(27,MaxFind.cube(3));  
	}
	@Test
	public void testreverseWord(){
		System.out.println("test case reverse word");  
        assertEquals("nemuos karak",MaxFind.reverseWord("soumen karak")); 
	}
	@After
	public void testDown(){
		System.out.println("after");
	}
}
