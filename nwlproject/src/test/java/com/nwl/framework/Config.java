package com.nwl.framework;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Config {
	
	public FileInputStream fi;
	public Properties p;
	public File f;
	String filePath;
	
	public Config(String file) throws Exception {
		this.filePath=file;
		f=new File(filePath);
		p=new Properties();
		fi=new FileInputStream(f);
	}
	
	public String getData(String key) throws Exception {
		p.load(fi);
		return p.getProperty(key);
	}

}
