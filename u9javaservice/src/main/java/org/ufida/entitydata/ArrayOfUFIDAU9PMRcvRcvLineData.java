
package org.ufida.entitydata;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;ArrayOfUFIDA.U9.PM.Rcv.RcvLineData complex type�� Java �ࡣ
 * 
 * &lt;p&gt;����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="ArrayOfUFIDA.U9.PM.Rcv.RcvLineData"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="UFIDA.U9.PM.Rcv.RcvLineData" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.PM.Rcv.RcvLineData" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfUFIDA.U9.PM.Rcv.RcvLineData", propOrder = {
    "ufidau9PMRcvRcvLineData"
})
public class ArrayOfUFIDAU9PMRcvRcvLineData {

    @XmlElement(name = "UFIDA.U9.PM.Rcv.RcvLineData", nillable = true)
    protected List<UFIDAU9PMRcvRcvLineData> ufidau9PMRcvRcvLineData;

    /**
     * Gets the value of the ufidau9PMRcvRcvLineData property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the ufidau9PMRcvRcvLineData property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getUFIDAU9PMRcvRcvLineData().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link UFIDAU9PMRcvRcvLineData }
     * 
     * 
     */
    public List<UFIDAU9PMRcvRcvLineData> getUFIDAU9PMRcvRcvLineData() {
        if (ufidau9PMRcvRcvLineData == null) {
            ufidau9PMRcvRcvLineData = new ArrayList<UFIDAU9PMRcvRcvLineData>();
        }
        return this.ufidau9PMRcvRcvLineData;
    }

}