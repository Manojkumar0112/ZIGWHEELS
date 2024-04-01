package PageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import BaseClass.BaseObject;

public class Cars extends BaseObject{
	
	 public Cars(WebDriver driver) {
		super(driver);
	}
	 
	 @FindBy(xpath = "//a[normalize-space()='Used Cars']")
	 WebElement usedCars;
	 
	 @FindBy(xpath = "//span[@onclick=\"goToUrl('/used-car/Chennai')\"]")
	 WebElement btn_chennai;
	 
	 @FindBy(xpath = "//*[@class=\"zw-sr-secLev usedCarMakeModelList popularModels ml-20 mt-10\"]//li")
	 List<WebElement> models;
	 
	 
	 public void usedCars()
	 {
		 Actions action = new Actions(driver);
		 action.moveToElement(usedCars).perform();
	 }
	 
	 public void clickChennai()
	 {
		 btn_chennai.click();
	 }
	 
	 public void models()
	 {
		 for (WebElement model : models) {
			    System.out.println(model.getText());
			}
	 }

}
