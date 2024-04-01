package TestCases;

import org.testng.annotations.Test;

import BaseClass.TestBase;
import PageObjects.Bikes;

public class TS_01Bikes extends TestBase{
	
	Bikes b;
	
	@Test(priority = 1)
	public void bike()
	{
		
		logger.info("*******Test for upcomingBikes is started********** ");
		b=new Bikes(driver);
		b.bikes();
		b.upcoming_bikes();
		b.clickManufactures();
		b.read_more();
		logger.info("read the values in table an ");
		b.table();
		logger.info("*******Test for upcomingBikes is Finished********** ");
	}

}

