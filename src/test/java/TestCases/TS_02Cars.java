package TestCases;

import org.testng.annotations.Test;

import BaseClass.TestBase;
import PageObjects.Cars;

public class TS_02Cars extends TestBase{
	
	@Test(priority = 2)
	public void cars()
	{
		
		logger.info("*******Test for used cars is started*******");
		Cars c=new Cars(driver);
		c.usedCars();
		logger.info(" For Used cars in Chennai");
		c.clickChennai();
		logger.info(" extract all the popular models in a List; Display the same");
		c.models();
		logger.info("*******Test for used cars is Finished*******");
	}

}
