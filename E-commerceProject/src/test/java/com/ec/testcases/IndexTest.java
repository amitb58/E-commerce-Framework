package com.ec.testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.ec.base.TestBase;
import com.ec.pages.IndexPage;
import com.ec.utility.DataReadWrite;

public class IndexTest extends TestBase{
	
	
	
	@Test
	public void validSignup() throws IOException {
		IndexPage ref= new IndexPage(driver);
		String firstname=DataReadWrite.readData(2,0);
		String lastname=DataReadWrite.readData(3, 0);
		String email=DataReadWrite.readData(4, 0);
		String pwd=DataReadWrite.readData(5, 0);
		String cpwd=DataReadWrite.readData(6, 0);
		
		
		ref.verifysignup(firstname,lastname,email,pwd,cpwd);
	}

}
