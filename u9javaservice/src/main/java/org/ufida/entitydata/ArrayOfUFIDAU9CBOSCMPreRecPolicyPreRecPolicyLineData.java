
package org.ufida.entitydata;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;ArrayOfUFIDA.U9.CBO.SCM.PreRecPolicy.PreRecPolicyLineData complex type�� Java �ࡣ
 * 
 * &lt;p&gt;����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="ArrayOfUFIDA.U9.CBO.SCM.PreRecPolicy.PreRecPolicyLineData"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="UFIDA.U9.CBO.SCM.PreRecPolicy.PreRecPolicyLineData" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CBO.SCM.PreRecPolicy.PreRecPolicyLineData" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfUFIDA.U9.CBO.SCM.PreRecPolicy.PreRecPolicyLineData", propOrder = {
    "ufidau9CBOSCMPreRecPolicyPreRecPolicyLineData"
})
public class ArrayOfUFIDAU9CBOSCMPreRecPolicyPreRecPolicyLineData {

    @XmlElement(name = "UFIDA.U9.CBO.SCM.PreRecPolicy.PreRecPolicyLineData", nillable = true)
    protected List<UFIDAU9CBOSCMPreRecPolicyPreRecPolicyLineData> ufidau9CBOSCMPreRecPolicyPreRecPolicyLineData;

    /**
     * Gets the value of the ufidau9CBOSCMPreRecPolicyPreRecPolicyLineData property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the ufidau9CBOSCMPreRecPolicyPreRecPolicyLineData property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getUFIDAU9CBOSCMPreRecPolicyPreRecPolicyLineData().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link UFIDAU9CBOSCMPreRecPolicyPreRecPolicyLineData }
     * 
     * 
     */
    public List<UFIDAU9CBOSCMPreRecPolicyPreRecPolicyLineData> getUFIDAU9CBOSCMPreRecPolicyPreRecPolicyLineData() {
        if (ufidau9CBOSCMPreRecPolicyPreRecPolicyLineData == null) {
            ufidau9CBOSCMPreRecPolicyPreRecPolicyLineData = new ArrayList<UFIDAU9CBOSCMPreRecPolicyPreRecPolicyLineData>();
        }
        return this.ufidau9CBOSCMPreRecPolicyPreRecPolicyLineData;
    }

}
