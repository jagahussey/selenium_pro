package com.Final;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Project_Selenium {
	
	public static void main(String[] args) throws InterruptedException, Throwable {
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\ELCOT\\\\Desktop\\\\eclipse\\\\Selenium\\\\Chrome\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://automationpractice.com/index.php");
		
		driver.manage().window().maximize();
		
		WebElement womens = driver.findElement(By.xpath("(//a[@class='sf-with-ul'])[1]"));
		
	//	mouse mover on women
		
		Actions act = new Actions(driver);
		
		act.moveToElement(womens).build().perform();
		
	//	Thread.sleep(2000);
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement casul_dress = driver.findElement(By.xpath("(//a[@title='Casual Dresses'])[1]"));
		
		casul_dress.click();
		
		// scroll method
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("window.scrollBy(0,900)");
		
		WebElement instock = driver.findElement(By.xpath("//span[@class='available-now']"));
		
		act.moveToElement(instock).build().perform();
		
		WebElement addcart = driver.findElement(By.xpath("//a[@title='Add to cart']"));
		
		addcart.click();
		
		WebElement procesdcheckout = driver.findElement(By.xpath("//a[@title='Proceed to checkout']"));
		
		procesdcheckout.click();
		
		js.executeScript("window.scrollBy(0,500)");
		
		WebElement quntity = driver.findElement(By.xpath("//a[@title='Add']"));
		
		quntity.click();
		quntity.click();
		quntity.click();
		
		WebElement procesdcheck = driver.findElement(By.xpath("(//a[@title='Proceed to checkout'])[2]"));
		
		procesdcheck.click();
		
		WebElement email = driver.findElement(By.xpath("//input[@name='email_create']"));
		
		email.sendKeys("csk1996@gmail.com");
		
		WebElement creatacc = driver.findElement(By.id("SubmitCreate"));
		
		creatacc.click();
		
		WebElement Mr = driver.findElement(By.xpath("(//input[@name='id_gender'])[1]"));
		
		Mr.click();
		
		WebElement Fname = driver.findElement(By.xpath("(//input[@class='is_required validate form-control'])[1]"));
		
		Fname.sendKeys("kamal");
		
		WebElement Lname = driver.findElement(By.xpath("(//input[@class='is_required validate form-control'])[2]"));
		
		Lname.sendKeys("rajini");
		
		WebElement password = driver.findElement(By.id("passwd"));
		
		password.sendKeys("1947@india");
		
		WebElement day = driver.findElement(By.id("days"));
		
		Select Sday = new Select(day);
		
		Sday.selectByValue("19");
		
	WebElement month = driver.findElement(By.id("months"));
	
	Select Smonth = new Select(month);
	
	Smonth.selectByValue("11");
	
	WebElement year = driver.findElement(By.id("years"));
	
	Select Syear = new Select(year);
	
	Syear.selectByValue("2020");
	
	WebElement clik = driver.findElement(By.id("optin"));
	
	clik.click();
	
	WebElement companys = driver.findElement(By.id("company"));
	
	companys.sendKeys("ZOGOO");
	
	WebElement address = driver.findElement(By.id("address1"));
	
	address.sendKeys("Raja Street, LONDON");
	
	WebElement addres2 = driver.findElement(By.id("address2"));
	
	addres2.sendKeys("Califoniya Street, AUSTRIAL ");
	
	WebElement cityy = driver.findElement(By.id("city"));
	
	cityy.sendKeys("ENGLAND");
	
	WebElement country = driver.findElement(By.xpath("(//select[@class='form-control'])[4]"));
	
	Select Cname = new Select(country);
	
	Cname.selectByValue("31");
	
	WebElement pincode = driver.findElement(By.id("postcode"));
	
	pincode.sendKeys("00000");
	
	WebElement additional = driver.findElement(By.id("other"));
	
	additional.sendKeys("Really good product");
	
	WebElement landline = driver.findElement(By.id("phone"));
	
	landline.sendKeys("04423456789");
	
	WebElement Mphone = driver.findElement(By.xpath("(//input[@class='form-control'])[8]"));
	
	Mphone.sendKeys("9988776655");
	
	WebElement register = driver.findElement(By.id("submitAccount"));
	
	register.click();
	
	WebElement clikk = driver.findElement(By.xpath("//button[@class='button btn btn-default button-medium']"));
	
	clikk.click();
	
	WebElement tick = driver.findElement(By.id("cgv"));
	
	tick.click();
	
	WebElement clk = driver.findElement(By.xpath("//button[@class='button btn btn-default standard-checkout button-medium']"));
	
	clk.click();
	
	WebElement bank = driver.findElement(By.xpath("(//p[@class='payment_module'])[1]"));
	
	bank.click();
	
	WebElement cllk = driver.findElement(By.xpath("//button[@class='button btn btn-default button-medium']"));
	
	cllk.click();
	
	js.executeScript("window.scrollBy(0,500)");
	
	TakesScreenshot tkss = (TakesScreenshot) driver;
	
	File source = tkss.getScreenshotAs(OutputType.FILE);
	
	File destination = new File("C:\\Users\\ELCOT\\Desktop\\eclipse\\Selenium\\Screenshots\\error1.png");
	
	FileUtils.copyFile(source, destination);
	
	
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
