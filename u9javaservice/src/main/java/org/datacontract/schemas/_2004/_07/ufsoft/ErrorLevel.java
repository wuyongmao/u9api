
package org.datacontract.schemas._2004._07.ufsoft;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;ErrorLevel的 Java 类。
 * 
 * &lt;p&gt;以下模式片段指定包含在此类中的预期内容。
 * &lt;pre&gt;
 * &amp;lt;simpleType name="ErrorLevel"&amp;gt;
 *   &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *     &amp;lt;enumeration value="Debug"/&amp;gt;
 *     &amp;lt;enumeration value="Info"/&amp;gt;
 *     &amp;lt;enumeration value="Warn"/&amp;gt;
 *     &amp;lt;enumeration value="Error"/&amp;gt;
 *     &amp;lt;enumeration value="Fatal"/&amp;gt;
 *   &amp;lt;/restriction&amp;gt;
 * &amp;lt;/simpleType&amp;gt;
 * &lt;/pre&gt;
 * 
 */
@XmlType(name = "ErrorLevel")
@XmlEnum
public enum ErrorLevel {

    @XmlEnumValue("Debug")
    DEBUG("Debug"),
    @XmlEnumValue("Info")
    INFO("Info"),
    @XmlEnumValue("Warn")
    WARN("Warn"),
    @XmlEnumValue("Error")
    ERROR("Error"),
    @XmlEnumValue("Fatal")
    FATAL("Fatal");
    private final String value;

    ErrorLevel(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ErrorLevel fromValue(String v) {
        for (ErrorLevel c: ErrorLevel.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
