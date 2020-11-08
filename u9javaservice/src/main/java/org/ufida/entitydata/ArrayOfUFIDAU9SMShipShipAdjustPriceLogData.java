
package org.ufida.entitydata;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;ArrayOfUFIDA.U9.SM.Ship.ShipAdjustPriceLogData complex type的 Java 类。
 * 
 * &lt;p&gt;以下模式片段指定包含在此类中的预期内容。
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="ArrayOfUFIDA.U9.SM.Ship.ShipAdjustPriceLogData"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="UFIDA.U9.SM.Ship.ShipAdjustPriceLogData" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.SM.Ship.ShipAdjustPriceLogData" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfUFIDA.U9.SM.Ship.ShipAdjustPriceLogData", propOrder = {
    "ufidau9SMShipShipAdjustPriceLogData"
})
public class ArrayOfUFIDAU9SMShipShipAdjustPriceLogData {

    @XmlElement(name = "UFIDA.U9.SM.Ship.ShipAdjustPriceLogData", nillable = true)
    protected List<UFIDAU9SMShipShipAdjustPriceLogData> ufidau9SMShipShipAdjustPriceLogData;

    /**
     * Gets the value of the ufidau9SMShipShipAdjustPriceLogData property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the ufidau9SMShipShipAdjustPriceLogData property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getUFIDAU9SMShipShipAdjustPriceLogData().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link UFIDAU9SMShipShipAdjustPriceLogData }
     * 
     * 
     */
    public List<UFIDAU9SMShipShipAdjustPriceLogData> getUFIDAU9SMShipShipAdjustPriceLogData() {
        if (ufidau9SMShipShipAdjustPriceLogData == null) {
            ufidau9SMShipShipAdjustPriceLogData = new ArrayList<UFIDAU9SMShipShipAdjustPriceLogData>();
        }
        return this.ufidau9SMShipShipAdjustPriceLogData;
    }

}
