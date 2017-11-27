
package test;

import main.Loup;
import main.Orientation;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.Assert;

public class TestLoup1{
	protected static int value1;
	protected static int value2;
	protected static String value3;
	
	   
	   // assigning the values
	 @BeforeClass
	   public static void before() {

	      value1 = 4;
	      value2 = 3;
	      value3="45c";
	      System.out.println("in before");
	   }
		
	   //execute after test
	   @AfterClass
	   public static void after() {
	      System.out.println("in after");
	   }

	   // test method to add two values
	   @Ignore
	   @Test
	   public void testAdd(){
	      int result = value1 + value2;
	      Assert.assertEquals(result,7);
	      Assert.assertNotSame(value1,value2);
	   }
	   
	@SuppressWarnings("null")
	@Test(expected = NullPointerException.class)
	public void methodCallToNullObject() {
		Loup loup =  null;
		loup.toString();
	}
	@Test(expected = NumberFormatException.class)
	public void methodCallArithmeticExeption() {
		int result = value1 + Integer.parseInt(value3);
		Assert.assertEquals(result,7);
	}
	@Test
	public void testNordOrientation()
	{
		Loup loup = new Loup();
		Assert.assertEquals(Orientation.NORD,loup.getOrientation());

	}
	@Test
	public void testTourner()
	{
		Loup loup = new Loup();
		loup.tourner();
		Assert.assertEquals(Orientation.EST,loup.getOrientation());

	}
}
