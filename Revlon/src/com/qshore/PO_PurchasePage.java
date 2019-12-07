package com.qshore;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PO_PurchasePage {
	
	// Project Name  : Revlon
	// Module Name   : Dashboard
	// Page Name     : Purchases Page
	// Author        : Kishore Kumar
	// Reviewd By    : Karthika
	// Date Created  : 1130
	//**********************************************************************************
	
	public @FindBy(xpath="//select[@id='ContentPlaceHolder3_ddlVendor']") WebElement PurchasePage_Vendordropdown;

}
