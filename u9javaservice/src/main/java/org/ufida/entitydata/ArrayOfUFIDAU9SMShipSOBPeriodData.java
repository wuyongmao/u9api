
package org.ufida.entitydata;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;ArrayOfUFIDA.U9.SM.Ship.SOBPeriodData complex type�� Java �ࡣ
 * 
 * &lt;p&gt;����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="ArrayOfUFIDA.U9.SM.Ship.SOBPeriodData"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="UFIDA.U9.SM.Ship.SOBPeriodData" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.SM.Ship.SOBPeriodData" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfUFIDA.U9.SM.Ship.SOBPeriodData", propOrder = {
    "ufidau9SMShipSOBPeriodData"
})
public class ArrayOfUFIDAU9SMShipSOBPeriodData {

    @XmlElement(name = "UFIDA.U9.SM.Ship.SOBPeriodData", nillable = true)
    protected List<UFIDAU9SMShipSOBPeriodData> ufidau9SMShipSOBPeriodData;

    /**
     * Gets the value of the ufidau9SMShipSOBPeriodData property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the ufidau9SMShipSOBPeriodData property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getUFIDAU9SMShipSOBPeriodData().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link UFIDAU9SMShipSOBPeriodData }
     * 
     * 
     */
    public List<UFIDAU9SMShipSOBPeriodData> getUFIDAU9SMShipSOBPeriodData() {
        if (ufidau9SMShipSOBPeriodData == null) {
            ufidau9SMShipSOBPeriodData = new ArrayList<UFIDAU9SMShipSOBPeriodData>();
        }
        return this.ufidau9SMShipSOBPeriodData;
    }

}
