package com.mydomain;

import org.hibernate.SessionFactory;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;



public class HibernateTest {

	private static SessionFactory sf;
	
	@BeforeClass
	public void initHibernate(){
		//inti hibernate code
	}
	
	
	@Test
	public void testUserLoading() {
		int x = 3 + 4;
		Assert.assertEquals(7, x);
	}
	
	@Test
	public void testUserLoading2() {
		int x = 3 + 4;
		Assert.assertEquals(17, x);
	}
}
