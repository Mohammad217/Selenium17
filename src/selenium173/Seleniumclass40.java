package selenium173;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seleniumclass40 {


		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\alaud\\eclipse-workspace\\Jars\\chromedriver_win32\\chromedriver.exe");
		
	     WebDriver dcss=new ChromeDriver();
	     dcss.get("https://www.facebook.com/");
	     
	     dcss.manage().window().maximize();
	     dcss.manage().timeouts().pageLoadTimeout(200,TimeUnit.SECONDS);
			
	     System.out.println(dcss.getCurrentUrl());
	     System.out.println(dcss.getTitle());
	     
	     dcss.manage().timeouts().implicitlyWait(100, TimeUnit.NANOSECONDS);
	     
	     dcss.findElement(By.cssSelector("#u_0_m")).sendKeys("Mohammad");
	 	 dcss.findElement(By.cssSelector("#u_0_o")).sendKeys("uddin");
	 	 dcss.findElement(By.cssSelector("#u_0_r")).sendKeys("arhaansamil0508@gmail.com");
	 	 dcss.findElement(By.cssSelector("input[name='reg_email_confirmation__']")).sendKeys("arhaansamil0508@gmail.com");
	     dcss.findElement(By.cssSelector("#u_0_w")).sendKeys("12345690");
	     dcss.findElement(By.cssSelector("#month > option:nth-child(12)")).click();
	    dcss.findElement(By.cssSelector("#day > option:nth-child(31)")).click();
	     dcss.findElement(By.cssSelector("#year > option:nth-child(42)")).click();;
	     dcss.findElement(By.cssSelector("#u_0_7")).click();
	     dcss.findElement(By.cssSelector("#u_0_13")).click();
	     
//	     dcss.findElement(By.cssSelector("#email")).sendKeys("alauddinripon@gmail.com");
//	     dcss.findElement(By.cssSelector("#pass")).sendKeys("Lizahossain217");
//	     dcss.findElement(By.cssSelector("#u_0_b")).click();
//	     
//	     
	    
	     
	     Thread.sleep(4000);
	     dcss.close();

	}

}
