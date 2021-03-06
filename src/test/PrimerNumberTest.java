package test;
import java.util.Arrays;
import java.util.Collection;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import main.PrimeNumberChecker;

@RunWith(Parameterized.class)
public class PrimerNumberTest {
	private Integer inputNumber;
	   private Boolean expectedResult;
	   private PrimeNumberChecker primeNumberChecker;

	   @Before
	   public void initialize() {
	      primeNumberChecker = new PrimeNumberChecker();
	   }

	   // Each parameter should be placed as an argument here
	   // Every time runner triggers, it will pass the arguments
	   // from parameters we defined in primeNumbers() method
		
	   public PrimerNumberTest(Integer inputNumber, Boolean expectedResult) {
	      this.inputNumber = inputNumber;
	      this.expectedResult = expectedResult;
	   }

	   @SuppressWarnings("rawtypes")
	@Parameterized.Parameters
	   public static Collection primeNumber() {
	      return Arrays.asList(new Object[][] {
	         { 2, true },
	         { 6, false },
	         { 19, true },
	         { 22, false },
	         { 29, true },
	         { 51, false },
	      });
	   }

	   // This test will run 4 times since we have 5 parameters defined
	   @Test
	   public void testPrimeNumberChecker() {
	      System.out.println("Parameterized Number is : " + inputNumber);
	      Assert.assertEquals(expectedResult, 
	      primeNumberChecker.validate(inputNumber));
	   }
}
