
package icreateshipsv.com.microsoft.schemas._2003._10.serialization.arrays;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;ArrayOfKeyValueOfanyTypeanyType complex type�� Java �ࡣ
 * 
 * &lt;p&gt;����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="ArrayOfKeyValueOfanyTypeanyType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="KeyValueOfanyTypeanyType" maxOccurs="unbounded" minOccurs="0"&amp;gt;
 *           &amp;lt;complexType&amp;gt;
 *             &amp;lt;complexContent&amp;gt;
 *               &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *                 &amp;lt;sequence&amp;gt;
 *                   &amp;lt;element name="Key" type="{http://www.w3.org/2001/XMLSchema}anyType"/&amp;gt;
 *                   &amp;lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}anyType"/&amp;gt;
 *                 &amp;lt;/sequence&amp;gt;
 *               &amp;lt;/restriction&amp;gt;
 *             &amp;lt;/complexContent&amp;gt;
 *           &amp;lt;/complexType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfKeyValueOfanyTypeanyType", propOrder = {
    "keyValueOfanyTypeanyType"
})
public class ArrayOfKeyValueOfanyTypeanyType {

    @XmlElement(name = "KeyValueOfanyTypeanyType")
    protected List<KeyValueOfanyTypeanyType> keyValueOfanyTypeanyType;

    /**
     * Gets the value of the keyValueOfanyTypeanyType property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the keyValueOfanyTypeanyType property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getKeyValueOfanyTypeanyType().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link KeyValueOfanyTypeanyType }
     * 
     * 
     */
    public List<KeyValueOfanyTypeanyType> getKeyValueOfanyTypeanyType() {
        if (keyValueOfanyTypeanyType == null) {
            keyValueOfanyTypeanyType = new ArrayList<KeyValueOfanyTypeanyType>();
        }
        return this.keyValueOfanyTypeanyType;
    }


    /**
     * &lt;p&gt;anonymous complex type�� Java �ࡣ
     * 
     * &lt;p&gt;����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
     * 
     * &lt;pre&gt;
     * &amp;lt;complexType&amp;gt;
     *   &amp;lt;complexContent&amp;gt;
     *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
     *       &amp;lt;sequence&amp;gt;
     *         &amp;lt;element name="Key" type="{http://www.w3.org/2001/XMLSchema}anyType"/&amp;gt;
     *         &amp;lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}anyType"/&amp;gt;
     *       &amp;lt;/sequence&amp;gt;
     *     &amp;lt;/restriction&amp;gt;
     *   &amp;lt;/complexContent&amp;gt;
     * &amp;lt;/complexType&amp;gt;
     * &lt;/pre&gt;
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "key",
        "value"
    })
    public static class KeyValueOfanyTypeanyType {

        @XmlElement(name = "Key", required = true, nillable = true)
        protected Object key;
        @XmlElement(name = "Value", required = true, nillable = true)
        protected Object value;

        /**
         * ��ȡkey���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getKey() {
            return key;
        }

        /**
         * ����key���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setKey(Object value) {
            this.key = value;
        }

        /**
         * ��ȡvalue���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getValue() {
            return value;
        }

        /**
         * ����value���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setValue(Object value) {
            this.value = value;
        }

    }

}
