
package org.datacontract.schemas._2004._07.ufsoft_ubf_util;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfanyTypeanyType;


/**
 * &lt;p&gt;ThreadContext complex type�� Java �ࡣ
 * 
 * &lt;p&gt;����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="ThreadContext"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="nameValueHas" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfKeyValueOfanyTypeanyType"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ThreadContext", propOrder = {
    "nameValueHas"
})
public class ThreadContext {

    @XmlElement(required = true, nillable = true)
    protected ArrayOfKeyValueOfanyTypeanyType nameValueHas;

    /**
     * ��ȡnameValueHas���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfKeyValueOfanyTypeanyType }
     *     
     */
    public ArrayOfKeyValueOfanyTypeanyType getNameValueHas() {
        return nameValueHas;
    }

    /**
     * ����nameValueHas���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfKeyValueOfanyTypeanyType }
     *     
     */
    public void setNameValueHas(ArrayOfKeyValueOfanyTypeanyType value) {
        this.nameValueHas = value;
    }

}