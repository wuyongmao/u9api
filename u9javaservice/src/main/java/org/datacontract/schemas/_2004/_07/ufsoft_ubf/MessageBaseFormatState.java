
package org.datacontract.schemas._2004._07.ufsoft_ubf;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;MessageBase.FormatState的 Java 类。
 * 
 * &lt;p&gt;以下模式片段指定包含在此类中的预期内容。
 * &lt;pre&gt;
 * &amp;lt;simpleType name="MessageBase.FormatState"&amp;gt;
 *   &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *     &amp;lt;enumeration value="None"/&amp;gt;
 *     &amp;lt;enumeration value="Formatting"/&amp;gt;
 *     &amp;lt;enumeration value="Formatted"/&amp;gt;
 *   &amp;lt;/restriction&amp;gt;
 * &amp;lt;/simpleType&amp;gt;
 * &lt;/pre&gt;
 * 
 */
@XmlType(name = "MessageBase.FormatState", namespace = "http://schemas.datacontract.org/2004/07/UFSoft.UBF.Exceptions")
@XmlEnum
public enum MessageBaseFormatState {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("Formatting")
    FORMATTING("Formatting"),
    @XmlEnumValue("Formatted")
    FORMATTED("Formatted");
    private final String value;

    MessageBaseFormatState(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MessageBaseFormatState fromValue(String v) {
        for (MessageBaseFormatState c: MessageBaseFormatState.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
