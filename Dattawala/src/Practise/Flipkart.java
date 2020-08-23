package Practise;


	import java.util.Iterator;
	import java.util.Set;
	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class Flipkart 
	{
		
		public static void main(String[] args) throws InterruptedException 
		{
			
			System.setProperty("webdriver.chrome.driver",
					"C:\\Selenium\\Eclipse\\Flipkart\\src\\test\\resources\\chromedriver.exe");
			WebDriver driver =new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.get("https://www.flipkart.com/");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@class='_2zrpKA _1dBPDZ']")).sendKeys("7219014441");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@class='_2zrpKA _3v41xv _1dBPDZ']")).sendKeys("timfp@2383");
			driver.findElement(By.xpath("//button[@class='_2AkmmA _1LctnI _7UHT_c']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']")).sendKeys("Apple iPhone 11 (Black, 64 GB)");
			driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']")).sendKeys(Keys.ENTER);
			driver.findElement(By.xpath("//div[@class='_3wU53n']")).click();
			String parent=driver.getWindowHandle();
			Set<String> s =driver.getWindowHandles();
			Iterator<String> I1= s.iterator();
			while(I1.hasNext())
			{
			String child_window=I1.next();
			if(!parent.equals(child_window))
			{
			driver.switchTo().window(child_window);

			System.out.println(driver.switchTo().window(child_window).getTitle());
			driver.findElement(By.xpath("//button[@class='_2AkmmA _2Npkh4 _2MWPVK']")).click();

			// driver.close();
			}

			}
			//button[@class='_2AkmmA _2Npkh4 _2MWPVK']
			//driver.close();
			
			

		}
	}
