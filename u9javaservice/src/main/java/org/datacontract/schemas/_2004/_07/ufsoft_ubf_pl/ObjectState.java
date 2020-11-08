
package org.datacontract.schemas._2004._07.ufsoft_ubf_pl;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;ObjectState的 Java 类。
 * 
 * &lt;p&gt;以下模式片段指定包含在此类中的预期内容。
 * &lt;pre&gt;
 * &amp;lt;simpleType name="ObjectState"&amp;gt;
 *   &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *     &amp;lt;enumeration value="NotExist"/&amp;gt;
 *     &amp;lt;enumeration value="Unchanged"/&amp;gt;
 *     &amp;lt;enumeration value="Unknown"/&amp;gt;
 *     &amp;lt;enumeration value="Inserted"/&amp;gt;
 *     &amp;lt;enumeration value="Updated"/&amp;gt;
 *     &amp;lt;enumeration value="Deleted"/&amp;gt;
 *     &amp;lt;enumeration value="Operating"/&amp;gt;
 *     &amp;lt;enumeration value="NeedLoad"/&amp;gt;
 *   &amp;lt;/restriction&amp;gt;
 * &amp;lt;/simpleType&amp;gt;
 * &lt;/pre&gt;
 * 
 */
@XmlType(name = "ObjectState", namespace = "http://schemas.datacontract.org/2004/07/UFSoft.UBF.PL.Engine")
@XmlEnum
public enum ObjectState {

    @XmlEnumValue("NotExist")
    NOT_EXIST("NotExist"),
    @XmlEnumValue("Unchanged")
    UNCHANGED("Unchanged"),
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    @XmlEnumValue("Inserted")
    INSERTED("Inserted"),
    @XmlEnumValue("Updated")
    UPDATED("Updated"),
    @XmlEnumValue("Deleted")
    DELETED("Deleted"),
    @XmlEnumValue("Operating")
    OPERATING("Operating"),
    @XmlEnumValue("NeedLoad")
    NEED_LOAD("NeedLoad");
    private final String value;

    ObjectState(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ObjectState fromValue(String v) {
        for (ObjectState c: ObjectState.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
