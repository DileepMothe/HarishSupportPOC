package com.support.automation.config;

import java.util.Properties;

import org.apache.log4j.Logger;

import com.support.automation.utils.PathHelper;

public class PropertyFileReader {
	
	public static Logger log=Logger.getLogger(PropertyFileReader.class);
	Properties prop=new Properties();
	Properties Urlprop=new Properties();
	
	public PropertyFileReader(){
		try{   
			prop.load(PathHelper.getInputStreamresourcePath("/src/main/resources/ConfigFile/config.properties"));
			Urlprop.load(PathHelper.getInputStreamresourcePath("/src/main/resources/ConfigFile/"+getEnviroment().toUpperCase()+".properties"));
		}
		catch(Exception e){
			log.info("The Config File is not found and error message is: "+e.getMessage());
		}
	}
	
	public String getEnviroment(){
		return prop.getProperty("Environment");
	}
	
	public String getBrowser(){
		return prop.getProperty("Browser");
	}
	
	public String getUserName(){
		return prop.getProperty("UserName");
	}
	
	public String getPassword(){
		return prop.getProperty("Password");
	}
	
	public String getApplicationNumber(){
		return prop.getProperty("ApplicationNumber");
	}
	
	public String geApplicationUrl1(){
		return Urlprop.getProperty("Application1");
	}
	
	public String geApplicationUrl2(){
		return Urlprop.getProperty("Application2");
	}
	
	
	public String geApplicationUrl3(){
		return Urlprop.getProperty("Application3");
	}
	
	public String geApplicationUrl4(){
		return Urlprop.getProperty("Application4");
	}
	
	public String geApplicationUrl5(){
		return Urlprop.getProperty("Application5");
	}
	
	public String geApplicationUrl6(){
		return Urlprop.getProperty("Application6");
	}
	
public String getReportConfigPath(){
	String reportConfigPath=PathHelper.getResourcePath("/src/main/resources/ConfigFile/extent-config.xml");
	if(reportConfigPath!=null) return reportConfigPath;
	else throw new RuntimeException("Report Config path not specified");
}
}
