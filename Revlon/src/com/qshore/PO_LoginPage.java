package com.qshore;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PO_LoginPage {
	
	// Project Name  : Revlon
	// Module Name   : Dashboard
	// Page Name     : Login Page
	// Author        : Kishore Kumar
	// Reviewd By    : Karthika
	// Date Created  : 1130
	//**********************************************************************************
	
	public @FindBy(xpath="//input[@id='ContentPlaceHolder1_txtUserId']") WebElement LoginPage_UID;
	public @FindBy(xpath="//input[@id='ContentPlaceHolder1_txtPassword']") WebElement LoginPage_PWD;
	public @FindBy(xpath="//input[@id='ContentPlaceHolder1_btnLogin']") WebElement LoginPage_SignINButton;

}
