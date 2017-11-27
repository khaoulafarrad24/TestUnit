package test;

import junit.framework.TestCase;
import main.Loup;
import main.Orientation;
import org.junit.Test;
import org.junit.Assert;

public class TestLoup extends TestCase {
	protected int value1, value2;
	   
	   // assigning the values
	   protected void setUp(){
	      value1 = 2;
	      value2 = 3;
	   }

	   // test method to add two values
	   @Test
	   public void testAdd(){
	      int result = value1 + value2;
	      Assert.assertEquals(result,5);
	   }
	   
	@Test(expected = NullPointerException.class)
	public void methodCallTkkkoNullObject() {
	    Object o = 4444;
	    o.toString();
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
