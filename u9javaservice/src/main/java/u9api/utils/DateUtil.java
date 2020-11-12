package u9api.utils;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateUtil {
public static XMLGregorianCalendar getXMLGregorianCalendar(String ts) {
	
	return getXMLGregorianCalendar(getDate(ts));
}
public static XMLGregorianCalendar getXMLGregorianCalendar(Date ts) {
	
	GregorianCalendar gc = new GregorianCalendar();
	gc.setTime(ts);
	XMLGregorianCalendar cal=null;
	try {
		cal = DatatypeFactory.newInstance().newXMLGregorianCalendar(gc);
	} catch (DatatypeConfigurationException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return cal;
}
public static XMLGregorianCalendar getXMLGregorianCalendar2() {
	return getXMLGregorianCalendar("2021-01-02 00:00:00");
}
public static XMLGregorianCalendar getXMLGregorianCalendar() {
	return getXMLGregorianCalendar(new Date());
}
public static Date getDate(String date) {
try {
	return	new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(date);
} catch (ParseException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
	return null;
}

}
}
