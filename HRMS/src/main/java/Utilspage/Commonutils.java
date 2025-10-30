package Utilspage;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Commonutils {
	static WebDriver driver;
	static Properties book;
	public static void readproperties()
	{
		try
		{
			FileInputStream look = new FileInputStream("C:\\Users\\hp\\Desktop\\coding siva\\hrms\\HRMS\\src\\test\\resource\\config.properties");
			book = new Properties();
			book.load(look);
			
		}catch(Exception e)
		{
			System.out.println("not verify page");
			
		}
		
		
	}
	public static void openbrowserurl()
	{
		try {
			String browser = book.getProperty("open");
			if(browser.equals("FireFox"))
			{
				driver =new FirefoxDriver();
			}else
			{
				System.out.println("not verify");
			}
			driver.get(book.getProperty("Url"));
			
			
		}catch(Exception e)
		{
			System.out.println("not verify");
		}
	}
	WebElement findElement(By by)
	{
		WebElement element = null;
		try
		{
		element = driver.findElement(by);
			
		}catch(Exception e)
		{
			System.out.println("system is error");
		}
		return element;
	}
	static void clearWholeText(By by)
	{
		try
		{
			driver.findElement(by).clear();
			
			
		}catch(Exception e)
		{
			System.out.println("not verified");
		}
	}
	public static void enterUsername(By by,String value,boolean eClear)
	{
		try
		{
			if(eClear)
				clearWholeText(by);
			driver.findElement(by).sendKeys();
			
		}catch(Exception e)
		{
			System.out.println("not verified");
		}
	}
	
	void getClick(By by)
	{
		driver.findElement(by).click();
	}
	
	}


