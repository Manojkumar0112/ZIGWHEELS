package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import BaseClass.TestBase;
import PageObjects.SignUp;

public class TS_03SignUp extends TestBase{
	
	
	@Test(priority = 3)
	public void signup()
	{
		SignUp s=new SignUp(driver);
		logger.info("******Test for google signup is started*******");
		s.login();
		logger.info("click on google signup and give the values");
		s.google();
		s.getEmail();
		s.next();
        logger.info("validate the error message");
		
		Assert.assertEquals(true, s.error());
		
		logger.info("******Test for google signup is Finished*******");
		
	}
	
	
}
