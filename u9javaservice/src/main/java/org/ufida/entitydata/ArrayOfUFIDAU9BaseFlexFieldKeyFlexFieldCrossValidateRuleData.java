
package org.ufida.entitydata;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;ArrayOfUFIDA.U9.Base.FlexField.KeyFlexField.CrossValidateRuleData complex type的 Java 类。
 * 
 * &lt;p&gt;以下模式片段指定包含在此类中的预期内容。
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="ArrayOfUFIDA.U9.Base.FlexField.KeyFlexField.CrossValidateRuleData"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="UFIDA.U9.Base.FlexField.KeyFlexField.CrossValidateRuleData" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.Base.FlexField.KeyFlexField.CrossValidateRuleData" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfUFIDA.U9.Base.FlexField.KeyFlexField.CrossValidateRuleData", propOrder = {
    "ufidau9BaseFlexFieldKeyFlexFieldCrossValidateRuleData"
})
public class ArrayOfUFIDAU9BaseFlexFieldKeyFlexFieldCrossValidateRuleData {

    @XmlElement(name = "UFIDA.U9.Base.FlexField.KeyFlexField.CrossValidateRuleData", nillable = true)
    protected List<UFIDAU9BaseFlexFieldKeyFlexFieldCrossValidateRuleData> ufidau9BaseFlexFieldKeyFlexFieldCrossValidateRuleData;

    /**
     * Gets the value of the ufidau9BaseFlexFieldKeyFlexFieldCrossValidateRuleData property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the ufidau9BaseFlexFieldKeyFlexFieldCrossValidateRuleData property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getUFIDAU9BaseFlexFieldKeyFlexFieldCrossValidateRuleData().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link UFIDAU9BaseFlexFieldKeyFlexFieldCrossValidateRuleData }
     * 
     * 
     */
    public List<UFIDAU9BaseFlexFieldKeyFlexFieldCrossValidateRuleData> getUFIDAU9BaseFlexFieldKeyFlexFieldCrossValidateRuleData() {
        if (ufidau9BaseFlexFieldKeyFlexFieldCrossValidateRuleData == null) {
            ufidau9BaseFlexFieldKeyFlexFieldCrossValidateRuleData = new ArrayList<UFIDAU9BaseFlexFieldKeyFlexFieldCrossValidateRuleData>();
        }
        return this.ufidau9BaseFlexFieldKeyFlexFieldCrossValidateRuleData;
    }

}
