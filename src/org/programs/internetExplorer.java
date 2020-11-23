package org.programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class internetExplorer {

			public static void main(String[] args) {
				
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ganesan\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe");
				
				WebDriver driver = new  ChromeDriver();
				driver.get("http://demo.automationtesting.in/Register.html");
				
				WebElement firstName = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
				firstName.sendKeys("Ganesh");
				
				WebElement lastName = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
				lastName.sendKeys("Moorthi");
				
				
				
				WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
				email.sendKeys("selenium");
				
				WebElement gender = driver.findElement(By.xpath("//input[@value='Male']"));
				gender.click();
				
				
				
			}
}
