package org.oc_j2ee.projet3.webapp.converter;

import com.opensymphony.xwork2.conversion.TypeConversionException;
import org.apache.struts2.util.StrutsTypeConverter;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

public class StringToDateConverter extends StrutsTypeConverter {

    private DateFormat DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd");

    public Object convertFromString(Map context, String[] strings, Class toClass) {
        if (strings == null || strings.length == 0 || strings[0].trim().length() == 0) {
            return null;
        }

        try {
            return DATE_FORMAT.parse(strings[0]);
        } catch (ParseException e) {
            throw new TypeConversionException("Impossible de convertir l'objet en Date : " + strings[0]);
        }
    }

    public String convertToString(Map context, Object date) {
        if (date != null && date instanceof Date) {
            return DATE_FORMAT.format(date);
        } else {
            return null;
        }
    }
}
