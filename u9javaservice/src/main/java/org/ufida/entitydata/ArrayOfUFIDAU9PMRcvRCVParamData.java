
package org.ufida.entitydata;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;ArrayOfUFIDA.U9.PM.Rcv.RCVParamData complex type�� Java �ࡣ
 * 
 * &lt;p&gt;����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="ArrayOfUFIDA.U9.PM.Rcv.RCVParamData"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="UFIDA.U9.PM.Rcv.RCVParamData" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.PM.Rcv.RCVParamData" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfUFIDA.U9.PM.Rcv.RCVParamData", propOrder = {
    "ufidau9PMRcvRCVParamData"
})
public class ArrayOfUFIDAU9PMRcvRCVParamData {

    @XmlElement(name = "UFIDA.U9.PM.Rcv.RCVParamData", nillable = true)
    protected List<UFIDAU9PMRcvRCVParamData> ufidau9PMRcvRCVParamData;

    /**
     * Gets the value of the ufidau9PMRcvRCVParamData property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the ufidau9PMRcvRCVParamData property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getUFIDAU9PMRcvRCVParamData().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link UFIDAU9PMRcvRCVParamData }
     * 
     * 
     */
    public List<UFIDAU9PMRcvRCVParamData> getUFIDAU9PMRcvRCVParamData() {
        if (ufidau9PMRcvRCVParamData == null) {
            ufidau9PMRcvRCVParamData = new ArrayList<UFIDAU9PMRcvRCVParamData>();
        }
        return this.ufidau9PMRcvRCVParamData;
    }

}
