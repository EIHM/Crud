package com.tm.conversion;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

import org.apache.struts2.util.StrutsTypeConverter;

public class DateConvert extends StrutsTypeConverter {

	public DateConvert() {
		// TODO Auto-generated constructor stub
	}
    
	private DateFormat dateformat;
	
	
	public Object convertFromString(Map arg0, String[] value, Class toclass) {
		if(Date.class==toclass){
			dateformat=new SimpleDateFormat("yyyy-MM-dd");
			try {
				return dateformat.parse(value[0]);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}		
		}		
		return null;
	}
	@Override
	public String convertToString(Map arg0, Object obj) {
		if(obj instanceof Date){
			
			dateformat=new SimpleDateFormat("yyyy-MM-dd");
			return dateformat.format((Date)obj);
		}
				return null;
	}

}
