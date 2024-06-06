package day1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;


/*
 Test case
 ---
 1)Launch Browser
 2)Open URL https://chatgpt.com/?oai-dm=1
 3)validate title should be "ChatGPT"
 4)close browser
 */
public class FirstTestcase {

	public static void main(String[] args) {
		
		//1) 
		//ChromeDriver driver=new ChromeDriver();
		WebDriver driver=new ChromeDriver();
		
		// 2)Open URL https://chatgpt.com/?oai-dm=1
		
		driver.get("https://chatgpt.com/?oai-dm=1");
		
		 //3)validate title should be "ChatGPT"
		
		 String act_title=driver.getTitle();
		 
		 if(act_title.equals("ChatGPT"))
		 {
			 System.out.println("Test Passed");
		 }
		 else
		 {
			 System.out.println("Test Failed");

		 }
		 
		 //4) close browser
		 driver.close();
		 //driver.quit();


	}

}
