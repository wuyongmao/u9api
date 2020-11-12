
package icreateshipsv.org.ufida.entitydata;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;ArrayOfUFIDA.U9.CBO.SCM.Sn.SnCodingRuleData complex type的 Java 类。
 * 
 * &lt;p&gt;以下模式片段指定包含在此类中的预期内容。
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="ArrayOfUFIDA.U9.CBO.SCM.Sn.SnCodingRuleData"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="UFIDA.U9.CBO.SCM.Sn.SnCodingRuleData" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CBO.SCM.Sn.SnCodingRuleData" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfUFIDA.U9.CBO.SCM.Sn.SnCodingRuleData", propOrder = {
    "ufidau9CBOSCMSnSnCodingRuleData"
})
public class ArrayOfUFIDAU9CBOSCMSnSnCodingRuleData {

    @XmlElement(name = "UFIDA.U9.CBO.SCM.Sn.SnCodingRuleData", nillable = true)
    protected List<UFIDAU9CBOSCMSnSnCodingRuleData> ufidau9CBOSCMSnSnCodingRuleData;

    /**
     * Gets the value of the ufidau9CBOSCMSnSnCodingRuleData property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the ufidau9CBOSCMSnSnCodingRuleData property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getUFIDAU9CBOSCMSnSnCodingRuleData().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link UFIDAU9CBOSCMSnSnCodingRuleData }
     * 
     * 
     */
    public List<UFIDAU9CBOSCMSnSnCodingRuleData> getUFIDAU9CBOSCMSnSnCodingRuleData() {
        if (ufidau9CBOSCMSnSnCodingRuleData == null) {
            ufidau9CBOSCMSnSnCodingRuleData = new ArrayList<UFIDAU9CBOSCMSnSnCodingRuleData>();
        }
        return this.ufidau9CBOSCMSnSnCodingRuleData;
    }

}
