package com.Test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Sample_Selenium{
	
	public static void main(String[] args) throws InterruptedException, IOException, AWTException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\Desktop\\eclipse\\Selenium\\Chrome\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
   		driver.get("https://www.flipkart.com/");
//		
	//	driver.get("https://www.facebook.com/");
		
		
	//	driver.get("http://leafground.com/pages/drop.html");
		
	//	driver.get("http://demo.automationtesting.in/Frames.html");
		
		driver.manage().window().maximize();
		
		//   DAY 2 Navigation methods
		
//		driver.navigate().to("https://www.facebook.com/");
//		
//		Thread.sleep(1000);                                 // if you want you apply
//		
//		driver.navigate().back();
//		
//		driver.navigate().forward();
//		
//		driver.navigate().refresh();
//		
//		driver.close();
		
		// WEBDRIVER METHODS
		
//		String title = driver.getTitle();
//		
//		System.out.println(title);
		
		//      DAY 3 HOW TO MINIMIZE
		
//		Dimension   d  =  new Dimension(350, 350);
//		driver.manage().window().setSize(d);
//		
//		Point p = new Point(250,  250);
//		driver.manage().window().setPosition(p);
		
//	WebElement emails = driver.findElement(By.id("email"));
//		
//		emails.sendKeys("jagan@gmail.com");
//		
//		WebElement password = driver.findElement(By.id("pass"));
//		
//		password.sendKeys("LIFE123");
//		
//		WebElement Login = driver.findElement(By.name("login"));
//		
//		Login.click();
//		

//			WebElement amazon = driver.findElement(By.id("twotabsearchtextbox"));	
//		
//	    	amazon.sendKeys("Realme");
//		
		//       DAY   4 X-PATH 
		
//		WebElement creatAcc = driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']"));
//		
//		creatAcc.click();
//		
//		Thread.sleep(3000);
//		
//		WebElement fname = driver.findElement(By.name("firstname"));
//		
//		fname.sendKeys("raja raja");
//		
//		WebElement lname = driver.findElement(By.name("lastname"));
//		
//		lname.sendKeys("cholan");
//		
//		WebElement mobileNo = driver.findElement(By.name("reg_email__"));
//		
//		mobileNo.sendKeys("990099001");
//		
//		WebElement password = driver.findElement(By.name("reg_passwd__"));
//		
//		password.sendKeys("123@tailor");
//		
//		WebElement males = driver.findElement(By.xpath("(//input[@class='_8esa'])[2]"));
//		
//		males.click();	
//		
//		WebElement cliks = driver.findElement(By.name("websubmit"));	
//		
//		cliks.click();
		
		//    SCREENSHOT ONLY
		
//		TakesScreenshot tss = (TakesScreenshot) driver;
//		
//		File source = tss.getScreenshotAs(OutputType.FILE);
//		
//		File destination = new File("C:\\Users\\ELCOT\\Desktop\\eclipse\\Selenium\\Screenshots\\error1.png");
//		
//		FileUtils.copyFile(source, destination);
		
		//    SELECT PROCESS
		
//		WebElement day = driver.findElement(By.id("day"));
//		
//		Select s = new Select(day);
//		
//		s.selectByValue("8");
//		
//		WebElement month = driver.findElement(By.id("month"));
//		
//		Select s1 = new Select(month);
//		
//		s1.selectByIndex(4);
//		
//		WebElement year = driver.findElement(By.id("year"));
//		
//		Select s2 = new Select(year);
//				
//	    s2.selectByVisibleText("1996");
		
		//     MULTIPLE DROPDOWN
		
//		WebElement multi = driver.findElement(By.xpath("(//select)[6]"));
//		
//		Select m = new Select(multi);
//		
//		boolean multiple = m.isMultiple();
//		
//		System.out.println("To check multiple : " + multiple);
//		
//		m.selectByValue("1");
//		
//		m.selectByIndex(2);
//		
//		m.selectByVisibleText("Loadrunner");
//		
//		System.out.println("------------------------------------------------------------");
//		
//		List<WebElement> options = m.getOptions();
//		
//		for (WebElement webElement : options) {
//			
//			System.out.println(webElement.getText());
//			
//		}
//		
//		System.out.println("----------------------------------------------------------------");
//		
//		List<WebElement> allSelectedOptions = m.getAllSelectedOptions();
//		
//		for (WebElement webElement : allSelectedOptions) {
//			
//			System.out.println(webElement.getText());
//			
//		}
		
//		System.out.println("---------------------------------------------------------------");
//		
//		WebElement firstSelectedOption = m.getFirstSelectedOption();
//		
//		System.out.println(firstSelectedOption.getText());
//		
//		System.out.println("-----------------------------------------------------------------");
		
		// IF YOU WANT DESELECT OT USE THIS
		
	//	  m.deselectByVisibleText("Loadrunner");
		
//	    m.deselectByValue("1");
		
//		  m.deselectByIndex(2);
		
		//  SIMPLE ALERT
		
//		WebElement simple_Mthd = driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
//		
//		simple_Mthd.click();
//		
//		driver.switchTo().alert().accept();
		
		//   CONFIRM ALERT
//		
//		WebElement multiple = driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));
//		
//		multiple.click();
//		
//		WebElement multi = driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
//		
//		multi.click();
//		
//		driver.switchTo().alert().dismiss();
		
		//     PROMPT ALERT
		
//		WebElement prompt = driver.findElement(By.xpath("(//a[@class='analystic'])[3]"));
//		
//		prompt.click();
//		
//		WebElement prompt1 = driver.findElement(By.xpath("//button[@class='btn btn-info']"));
//		
//		prompt1.click();
//		
//		driver.switchTo().alert().sendKeys("ERAIVA");
//		
//		driver.switchTo().alert().accept();
		
//		WebElement single = driver.findElement(By.id("singleframe"));
//		
//		driver.switchTo().frame(single);
//		
//		WebElement text_Btn = driver.findElement(By.xpath("//input[@type='text']"));
//		
//		text_Btn.sendKeys("Welcome to JAVA");
//		
//		driver.switchTo().defaultContent();
//		
//		WebElement multi = driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));
//		
//		multi.click();
//		
//		WebElement multi_Lvl = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
//		
//		driver.switchTo().frame(multi_Lvl);
//		
//		WebElement multi_Lvl1 = driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));
//		
//		driver.switchTo().frame(multi_Lvl1);
//		
//		WebElement multi_Fnl = driver.findElement(By.xpath("//input[@type='text']"));
//		
//		multi_Fnl.sendKeys("Welcome to SELENIUM");
		
		//   ACTION
		
//		Actions a = new Actions(driver);
//		
//	WebElement from_Element = driver.findElement(By.id("draggable"));
//	
//		WebElement to_Element = driver.findElement(By.id("droppable"));
//		
//		a.dragAndDrop(from_Element, to_Element).build().perform();
//		
		//    MOUSE BASED ACTION 
		
//		Actions a = new Actions(driver);
//		
//		WebElement best = driver.findElement(By.xpath("//a[@data-csa-c-content-id='nav_cs_bestsellers']"));
//		
//		a.contextClick(best).perform();
//		
//	Actions a = new Actions(driver);
//	
//	WebElement notselect = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
//	
//	a.click(notselect).perform();
//	
//	WebElement flipcart = driver.findElement(By.xpath("(//img[@class='_396cs4 _3exPp9'])[1]"));
//	
//	a.contextClick(flipcart).build().perform();
	
//	//   ROBOT 
//	
//	Robot r = new Robot();
//	
//	r.keyPress(KeyEvent.VK_DOWN);
//	
//	r.keyRelease(KeyEvent.VK_DOWN);
//	
//	r.keyPress(KeyEvent.VK_ENTER);
//	
//	r.keyRelease(KeyEvent.VK_ENTER);
//	
//	WebElement flight = driver.findElement(By.xpath("(//img[@class='_396cs4  _3exPp9'])[8]"));
//	
//	a.contextClick(flight).perform();
//	
//    r.keyPress(KeyEvent.VK_DOWN);
//	
//	r.keyRelease(KeyEvent.VK_DOWN);
//	
//	r.keyPress(KeyEvent.VK_ENTER);
//	
//	r.keyRelease(KeyEvent.VK_ENTER);
//	
//	Set<String> windowHandles = driver.getWindowHandles();
//	
//	for (String s5 : windowHandles) {
//		
//		System.out.println(driver.switchTo().window(s5).getTitle());
//		
//	}
//	
//	String s = "flipcart.com - Mobiles";
//	
//	for (String s10 : windowHandles) {
//		
//		if (driver.switchTo().window(s10).getTitle().equalsIgnoreCase(s)); {
//			
//			break;
//			
	//	}
	
		
	//	JavascriptExecutor js=(JavascriptExecutor) driver;
		
//	JavascriptExecutor js = (JavascriptExecutor) driver;
//	
//	js.executeScript("window.scrollBy(0, 1000)");
		
		
	
	
		
		
		
		
		
	}

}
