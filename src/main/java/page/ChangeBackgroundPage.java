package page;



import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;



public class ChangeBackgroundPage {
	
  WebDriver driver;
	
	public ChangeBackgroundPage (WebDriver driver) {
		this.driver = driver;
	}
	
	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Set SkyBlue Background')]")
	WebElement Sky_Blue_Button;
	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Set White Background')]")
	WebElement White_button;
	
	public void verifySkyBlueButton() {
		String skyBlueButtonText = Sky_Blue_Button.getText();
		System.out.println(skyBlueButtonText);
		if(skyBlueButtonText.equalsIgnoreCase("Set SkyBlue Background")){
			System.out.println("Sky blue button exists.");
		}else {
			System.out.println("Sky Blue Button not found!");
		}
		
	}
    public void verifySkyWhiteButton() {
    	String skyWhiteButtonText = White_button.getText();
    	
		System.out.println(skyWhiteButtonText);
		if(skyWhiteButtonText.equalsIgnoreCase("Set White Background")) {
			
			System.out.println("SkyWhite button exists");
		}else {
			System.out.println("SkyWhite button not found!");
		}
	
   
    	
    }

    public void takeScreenshotAtEndOfTest() throws IOException {
		TakesScreenshot ts = ((TakesScreenshot) driver);
		String currentDir = System.getProperty("user.dir");
		File sourceFile = ts.getScreenshotAs(OutputType.FILE);
		File destinationFile=new File(currentDir + "/screenshots/" + System.currentTimeMillis() + ".png");		
		FileUtils.copyFile(sourceFile,destinationFile );
	}
    
	public void changeToSkyBlue() {
		Sky_Blue_Button.click();
	}
	public void changeToWhite() {
		White_button.click();
	}

}
