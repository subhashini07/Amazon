package org.test;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amaz {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SureshG\\subhaworkspace\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		WebElement srcbar= driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		srcbar.sendKeys("Vivo s1 mobile");
		WebElement src=driver.findElement(By.xpath("//input[@type='submit']"));
		src.click();
		WebElement phn=driver.findElement(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
		phn.click();
		String par=driver.getWindowHandle();
		Set<String> All=driver.getWindowHandles();
		System.out.println(par+"\n"+All);
		for (String M:All){
			if (!M. equals(par)){
				driver.switchTo().window(M);
				WebElement cart=driver.findElement(By.xpath("//input[@id='add-to-cart-button']"));
				cart.click();
				
			}
			
		}
	}

}
