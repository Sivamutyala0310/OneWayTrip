package com.cleartrip.tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Calendar extends LoginDriver 
{
	@Test
	public void calendar()
	{
		driver.get("https://www.cleartrip.com");
		driver.findElement(By.xpath("//div[1]/dl/dd/div/a/i[@class='icon ir datePicker']")).click();
		/*
		 * WebElement element=driver.findElement(By.xpath(nDateOfJourney ));
		 * 
		 * driver.findElement(By.xpath(nDateOfJourney
		 * )).sendKeys("Wed, 4 Dec, 2019");//a[text()='26']
		 * 
		 * WebElement element=driver.findElement(By.xpath(nDateOfJourney ));
		 * Thread.sleep(3000); Actions action = new Actions(driver);
		 * driver.findElement(By.linkText("3")).click();
		 * 
		 * action.moveToElement(element).sendKeys(Keys.ENTER).build().perform();
		 * 
		 * JavascriptExecutor js=(JavascriptExecutor)driver;
		 * js.executeScript("document.xPath(@'nDateOfJourney').value='Wed, 4 Dec, 2019'"
		 * );
		 */
	}

}
