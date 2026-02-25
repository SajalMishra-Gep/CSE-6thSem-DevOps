//Selenium Code

package SeleniumAutomationDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class ABC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	ChromeDriver dr=new ChromeDriver();
	String xpath="//a[@href=\"/SajalMishra-Gep/CSE-6thSem-DevOps\"]";
	dr.get("https://github.com/SajalMishra-Gep");
	dr.findElement(By.xpath("//a[@data-tab-item=\"repositories\"]")).click();
	dr.findElement(By.xpath(xpath)).click();
	//dr.close();
	}
	
}

