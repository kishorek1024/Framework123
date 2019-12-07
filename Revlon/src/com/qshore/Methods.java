package com.qshore;

import java.io.File;
import java.io.FileInputStream;
import java.util.List;
import java.util.concurrent.TimeUnit;

import jxl.Sheet;
import jxl.Workbook;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Methods {
	
	public WebDriver driver;
	public FileInputStream file_obj;
	public Workbook workbook_obj;
	public Sheet sheet_Obj;
	
	
	// Method Name  : launchApp
	// Description  : To Launch Application
	// Author       : Kishore Kumar
	// Reviewd By   : Sushma
	// Date         : 1130
	// Arguments/Parameters : String url, STring sspath;
	//***************************************************************	
	public void launchApp(String url, String sspath) throws Exception {
		driver=new FirefoxDriver();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f, new File(sspath));}
	//*****************************************************************
	// Method Name  : closeApp
	// Description  : To Close Application
	// Author       : Kishore Kumar
	// Reviewd By   : Sushma
	// Date         : 1130
	// Arguments/Parameters : NA
	//***************************************************************	
	public void closeApp(){
		driver.close();
	}
	//********************************************************************
	public void excel_Con(String path, String sname) throws Exception {
		file_obj=new FileInputStream(path);
		workbook_obj=Workbook.getWorkbook(file_obj);
		sheet_Obj=workbook_obj.getSheet(sname);}
	//*********************************************************************
	public void elementAvailable(WebElement element, boolean expresult, String sspath) throws Exception {
		boolean element_Available=element.isDisplayed();
		if(element_Available==expresult)
		{
			System.out.println("Pass");
			File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(f, new File(sspath));
		}
		else
		{
			System.out.println("Fail");
			File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(f, new File(sspath));
		}
	}
	//********************************************************************************
	public void titleContains(String exptext, boolean expresult){
		String title=driver.getTitle();
		if(title.contains(exptext)==expresult)
			System.out.println("Pass");
		else
			System.out.println("Fail");
	}
	//**********************************************************************************
	public void elementEnabled(WebElement element, boolean expresult, String sspath) throws Exception {
		boolean element_Enabled=element.isEnabled();
		if(element_Enabled==expresult)
		{
			System.out.println("Pass");
			File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(f, new File(sspath));
		}
		else
		{
			System.out.println("Fail");
			File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(f, new File(sspath));
		}
	}
	//***********************************************************************************
	public void elementsCount(String loc, int exp){
		List<WebElement> elements=driver.findElements(By.tagName(loc));
		if(elements.size()==exp)
			System.out.println("Pass");
		else
			System.out.println("Fail");
	}
	

}
