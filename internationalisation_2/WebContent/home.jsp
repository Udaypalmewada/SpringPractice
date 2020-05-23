<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="Cp1252">
<title>Insert title here</title>
</head>
<body>
	<%@ page language="java" import="java.util.*"%>

	<%@ page import="java.io.FileInputStream"%>
	<%@ page import="java.io.File"%>
	<% try
{
	Locale language=request.getLocale();
	String lang=language.getLanguage();
	out.println("lanuage::"+language);
	//getting file from fileSystem
    FileInputStream fis = new FileInputStream("F:\\study\\Spring\\internationalisation\\src\\internationalisation_common\\title.properties");
    Properties props = new Properties();
    props.load(fis);
    if(language.equals("en")){
    String LogFileName = props.getProperty("welcome.msg.en");
    out.println("<br>msg:"+LogFileName);
    }
    else if(language.equals("cn")){
        String LogFileName = props.getProperty("welcome.msg.cn");
        out.println("<br>msg:"+LogFileName);
        } 
    if(language.equals("hi")){
        String LogFileName = props.getProperty("welcome.msg.hi");
        out.println("<br>msg:"+LogFileName);
        }
    }
catch (Exception e)
{// Catch exception if any
    out.println("invalid file location");
}%>
</body>
</html>