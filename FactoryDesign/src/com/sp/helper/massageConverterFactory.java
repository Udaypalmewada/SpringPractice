package com.sp.helper;

import com.sb.convert.HtmlMessageConverterImpl;
import com.sb.convert.IMessageConverter;
import com.sb.convert.PdfMessageConverterImpl;

public class massageConverterFactory {
	
	public static IMessageConverter CreateMassageconveretr(String type) {
		
		IMessageConverter massageConveretr=null;
		
		
		if(type.equals("html")) {
			massageConveretr = new HtmlMessageConverterImpl();
			
		}
		else if(type.equals("pdf")){
			massageConveretr = new PdfMessageConverterImpl();
		}
		return massageConveretr;
	} 

}
