
package org.datacontract.schemas._2004._07.ufsoft;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;ExceptionBase.FormatState的 Java 类。
 * 
 * &lt;p&gt;以下模式片段指定包含在此类中的预期内容。
 * &lt;pre&gt;
 * &amp;lt;simpleType name="ExceptionBase.FormatState"&amp;gt;
 *   &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *     &amp;lt;enumeration value="None"/&amp;gt;
 *     &amp;lt;enumeration value="Formatting"/&amp;gt;
 *     &amp;lt;enumeration value="Formatted"/&amp;gt;
 *   &amp;lt;/restriction&amp;gt;
 * &amp;lt;/simpleType&amp;gt;
 * &lt;/pre&gt;
 * 
 */
@XmlType(name = "ExceptionBase.FormatState")
@XmlEnum
public enum ExceptionBaseFormatState {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("Formatting")
    FORMATTING("Formatting"),
    @XmlEnumValue("Formatted")
    FORMATTED("Formatted");
    private final String value;

    ExceptionBaseFormatState(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ExceptionBaseFormatState fromValue(String v) {
        for (ExceptionBaseFormatState c: ExceptionBaseFormatState.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
