package Handlers;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.xml.crypto.Data;

public class Parsing {
	//parsing data formate
	  
	static void convertDateFormate(String inputDate) {
		try {
		
			
			
			
			
			
			SimpleDateFormat simpleDateFormat=new SimpleDateFormat("dd/mm/yyy");
			Date date=simpleDateFormat.parse(inputDate);
			SimpleDateFormat outputsdf=new SimpleDateFormat("yyy/mm/dd");
         	String outputDate= outputsdf.format(date);			
	
	System.out.println("After Changing date formst to yyy/mm/dd :"  + outputDate);
		}
		
		catch (java.text.ParseException e) {
			System.out.println("Some error ocured while converting date formats.Exception");
		}
		
		
	}
	

}
