package com.kishore;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qshore.Methods;
import com.qshore.PO_LoginPage;

public class Revlon_Module1 {
	
	// Test Name : Revlon_TC01
	// Test Case Name : Revlon_TC01
	// Author         : Kishore Kumar
	// Module Name    : Module1
	// Project Name   : Revlon
	// Date Created   : 1201
	// Reviewed By    : 
	//*****************************************************************************	
	public void Revlon_TC01() throws Exception {
		
		// Importing Methods Class By Creating Object
		Methods methods_obj=new Methods();
		
		// Importing excel_Con method
		methods_obj.excel_Con("C:\\Users\\DELL\\Desktop\\FW2PM\\Test Data\\Kishore\\Module1\\TestCase01.xls", "Sheet1");
		
		// Calling launchApp Method
		methods_obj.launchApp(methods_obj.sheet_Obj.getCell(0, 0).getContents(), "C:\\Users\\DELL\\Desktop\\FW2PM\\Test Results\\Kishore\\Module1\\TC01\\launchApp.png");
		
		// Importing Page Objects
		PO_LoginPage loginpage=PageFactory.initElements(methods_obj.driver, PO_LoginPage.class);
		
		// Verifying UID and Password available or not
		methods_obj.elementAvailable(loginpage.LoginPage_UID, true, "C:\\Users\\DELL\\Desktop\\FW2PM\\Test Results\\Kishore\\Module1\\TC01\\uidavailable.png");
		methods_obj.elementAvailable(loginpage.LoginPage_PWD, true, "C:\\Users\\DELL\\Desktop\\FW2PM\\Test Results\\Kishore\\Module1\\TC01\\pwdavailable.png");
		
		// Verifying Title contains Stock
		methods_obj.titleContains("stock", true);
		
		// Entering UID and PWD
		loginpage.LoginPage_UID.sendKeys(methods_obj.sheet_Obj.getCell(0, 1).getContents());
		loginpage.LoginPage_PWD.sendKeys(methods_obj.sheet_Obj.getCell(0, 2).getContents());
		
		// Verifying SignIN Available or not
		methods_obj.elementAvailable(loginpage.LoginPage_SignINButton, true, "C:\\Users\\DELL\\Desktop\\FW2PM\\Test Results\\Kishore\\Module1\\TC01\\SignInAvailable.png");
		// Verifying SignIN enabled or not
		methods_obj.elementEnabled(loginpage.LoginPage_SignINButton, true, "C:\\Users\\DELL\\Desktop\\FW2PM\\Test Results\\Kishore\\Module1\\TC01\\SignInEnabled.png");
		
		// Click on SignIN Button
		loginpage.LoginPage_SignINButton.click();
		
		// Importing WebDriverWait
		WebDriverWait ww=new WebDriverWait(methods_obj.driver, 30);
		
		// Waiting until dashboard page loads
		ww.until(ExpectedConditions.urlContains("DashBoard"));
		
		// Verifying number of links are 20 or not
		methods_obj.elementsCount("a", 20);
		
		// Closing App
		methods_obj.closeApp();	}
	//*****************************************************************************************
	

}
