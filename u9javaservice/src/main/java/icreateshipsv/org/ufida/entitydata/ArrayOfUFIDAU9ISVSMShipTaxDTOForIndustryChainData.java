
package icreateshipsv.org.ufida.entitydata;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;ArrayOfUFIDA.U9.ISV.SM.ShipTaxDTOForIndustryChainData complex type�� Java �ࡣ
 * 
 * &lt;p&gt;����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="ArrayOfUFIDA.U9.ISV.SM.ShipTaxDTOForIndustryChainData"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="UFIDA.U9.ISV.SM.ShipTaxDTOForIndustryChainData" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.ISV.SM.ShipTaxDTOForIndustryChainData" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfUFIDA.U9.ISV.SM.ShipTaxDTOForIndustryChainData", propOrder = {
    "ufidau9ISVSMShipTaxDTOForIndustryChainData"
})
public class ArrayOfUFIDAU9ISVSMShipTaxDTOForIndustryChainData {

    @XmlElement(name = "UFIDA.U9.ISV.SM.ShipTaxDTOForIndustryChainData", nillable = true)
    protected List<UFIDAU9ISVSMShipTaxDTOForIndustryChainData> ufidau9ISVSMShipTaxDTOForIndustryChainData;

    /**
     * Gets the value of the ufidau9ISVSMShipTaxDTOForIndustryChainData property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the ufidau9ISVSMShipTaxDTOForIndustryChainData property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getUFIDAU9ISVSMShipTaxDTOForIndustryChainData().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link UFIDAU9ISVSMShipTaxDTOForIndustryChainData }
     * 
     * 
     */
    public List<UFIDAU9ISVSMShipTaxDTOForIndustryChainData> getUFIDAU9ISVSMShipTaxDTOForIndustryChainData() {
        if (ufidau9ISVSMShipTaxDTOForIndustryChainData == null) {
            ufidau9ISVSMShipTaxDTOForIndustryChainData = new ArrayList<UFIDAU9ISVSMShipTaxDTOForIndustryChainData>();
        }
        return this.ufidau9ISVSMShipTaxDTOForIndustryChainData;
    }

}
