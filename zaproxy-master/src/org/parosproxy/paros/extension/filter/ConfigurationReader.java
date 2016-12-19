package org.parosproxy.paros.extension.filter;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ConfigurationReader {
	private String filePath;
	
	public ConfigurationReader(String filePath){
		this.filePath = filePath;
	}
	
	public void getConfiguration(){
		FileReader fr = new FileReader("resources/config.txt");
	    BufferedReader textReader = new BufferedReader(fr);
	    while(textReader.ready()){
	    	
	    }
	    textReader.close();
    	
		}
	}
}
