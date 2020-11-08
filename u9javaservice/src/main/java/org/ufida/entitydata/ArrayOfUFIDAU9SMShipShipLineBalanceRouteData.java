
package org.ufida.entitydata;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;ArrayOfUFIDA.U9.SM.Ship.ShipLineBalanceRouteData complex type�� Java �ࡣ
 * 
 * &lt;p&gt;����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="ArrayOfUFIDA.U9.SM.Ship.ShipLineBalanceRouteData"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="UFIDA.U9.SM.Ship.ShipLineBalanceRouteData" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.SM.Ship.ShipLineBalanceRouteData" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfUFIDA.U9.SM.Ship.ShipLineBalanceRouteData", propOrder = {
    "ufidau9SMShipShipLineBalanceRouteData"
})
public class ArrayOfUFIDAU9SMShipShipLineBalanceRouteData {

    @XmlElement(name = "UFIDA.U9.SM.Ship.ShipLineBalanceRouteData", nillable = true)
    protected List<UFIDAU9SMShipShipLineBalanceRouteData> ufidau9SMShipShipLineBalanceRouteData;

    /**
     * Gets the value of the ufidau9SMShipShipLineBalanceRouteData property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the ufidau9SMShipShipLineBalanceRouteData property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getUFIDAU9SMShipShipLineBalanceRouteData().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link UFIDAU9SMShipShipLineBalanceRouteData }
     * 
     * 
     */
    public List<UFIDAU9SMShipShipLineBalanceRouteData> getUFIDAU9SMShipShipLineBalanceRouteData() {
        if (ufidau9SMShipShipLineBalanceRouteData == null) {
            ufidau9SMShipShipLineBalanceRouteData = new ArrayList<UFIDAU9SMShipShipLineBalanceRouteData>();
        }
        return this.ufidau9SMShipShipLineBalanceRouteData;
    }

}