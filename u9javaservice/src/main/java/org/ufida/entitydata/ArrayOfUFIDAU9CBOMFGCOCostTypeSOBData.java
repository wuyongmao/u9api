
package org.ufida.entitydata;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;ArrayOfUFIDA.U9.CBO.MFG.CO.CostTypeSOBData complex type�� Java �ࡣ
 * 
 * &lt;p&gt;����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="ArrayOfUFIDA.U9.CBO.MFG.CO.CostTypeSOBData"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="UFIDA.U9.CBO.MFG.CO.CostTypeSOBData" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CBO.MFG.CO.CostTypeSOBData" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfUFIDA.U9.CBO.MFG.CO.CostTypeSOBData", propOrder = {
    "ufidau9CBOMFGCOCostTypeSOBData"
})
public class ArrayOfUFIDAU9CBOMFGCOCostTypeSOBData {

    @XmlElement(name = "UFIDA.U9.CBO.MFG.CO.CostTypeSOBData", nillable = true)
    protected List<UFIDAU9CBOMFGCOCostTypeSOBData> ufidau9CBOMFGCOCostTypeSOBData;

    /**
     * Gets the value of the ufidau9CBOMFGCOCostTypeSOBData property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the ufidau9CBOMFGCOCostTypeSOBData property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getUFIDAU9CBOMFGCOCostTypeSOBData().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link UFIDAU9CBOMFGCOCostTypeSOBData }
     * 
     * 
     */
    public List<UFIDAU9CBOMFGCOCostTypeSOBData> getUFIDAU9CBOMFGCOCostTypeSOBData() {
        if (ufidau9CBOMFGCOCostTypeSOBData == null) {
            ufidau9CBOMFGCOCostTypeSOBData = new ArrayList<UFIDAU9CBOMFGCOCostTypeSOBData>();
        }
        return this.ufidau9CBOMFGCOCostTypeSOBData;
    }

}
