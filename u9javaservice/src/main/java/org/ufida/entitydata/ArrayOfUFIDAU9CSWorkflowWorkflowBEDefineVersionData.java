
package org.ufida.entitydata;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;ArrayOfUFIDA.U9.CS.Workflow.WorkflowBE.DefineVersionData complex type的 Java 类。
 * 
 * &lt;p&gt;以下模式片段指定包含在此类中的预期内容。
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="ArrayOfUFIDA.U9.CS.Workflow.WorkflowBE.DefineVersionData"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="UFIDA.U9.CS.Workflow.WorkflowBE.DefineVersionData" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CS.Workflow.WorkflowBE.DefineVersionData" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfUFIDA.U9.CS.Workflow.WorkflowBE.DefineVersionData", propOrder = {
    "ufidau9CSWorkflowWorkflowBEDefineVersionData"
})
public class ArrayOfUFIDAU9CSWorkflowWorkflowBEDefineVersionData {

    @XmlElement(name = "UFIDA.U9.CS.Workflow.WorkflowBE.DefineVersionData", nillable = true)
    protected List<UFIDAU9CSWorkflowWorkflowBEDefineVersionData> ufidau9CSWorkflowWorkflowBEDefineVersionData;

    /**
     * Gets the value of the ufidau9CSWorkflowWorkflowBEDefineVersionData property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the ufidau9CSWorkflowWorkflowBEDefineVersionData property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getUFIDAU9CSWorkflowWorkflowBEDefineVersionData().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link UFIDAU9CSWorkflowWorkflowBEDefineVersionData }
     * 
     * 
     */
    public List<UFIDAU9CSWorkflowWorkflowBEDefineVersionData> getUFIDAU9CSWorkflowWorkflowBEDefineVersionData() {
        if (ufidau9CSWorkflowWorkflowBEDefineVersionData == null) {
            ufidau9CSWorkflowWorkflowBEDefineVersionData = new ArrayList<UFIDAU9CSWorkflowWorkflowBEDefineVersionData>();
        }
        return this.ufidau9CSWorkflowWorkflowBEDefineVersionData;
    }

}
