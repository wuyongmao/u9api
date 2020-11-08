
package org.ufida.entitydata;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;ArrayOfUFIDA.U9.CS.Workflow.WorkflowInstanceBE.FlowInteroperData complex type的 Java 类。
 * 
 * &lt;p&gt;以下模式片段指定包含在此类中的预期内容。
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="ArrayOfUFIDA.U9.CS.Workflow.WorkflowInstanceBE.FlowInteroperData"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="UFIDA.U9.CS.Workflow.WorkflowInstanceBE.FlowInteroperData" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CS.Workflow.WorkflowInstanceBE.FlowInteroperData" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfUFIDA.U9.CS.Workflow.WorkflowInstanceBE.FlowInteroperData", propOrder = {
    "ufidau9CSWorkflowWorkflowInstanceBEFlowInteroperData"
})
public class ArrayOfUFIDAU9CSWorkflowWorkflowInstanceBEFlowInteroperData {

    @XmlElement(name = "UFIDA.U9.CS.Workflow.WorkflowInstanceBE.FlowInteroperData", nillable = true)
    protected List<UFIDAU9CSWorkflowWorkflowInstanceBEFlowInteroperData> ufidau9CSWorkflowWorkflowInstanceBEFlowInteroperData;

    /**
     * Gets the value of the ufidau9CSWorkflowWorkflowInstanceBEFlowInteroperData property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the ufidau9CSWorkflowWorkflowInstanceBEFlowInteroperData property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getUFIDAU9CSWorkflowWorkflowInstanceBEFlowInteroperData().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link UFIDAU9CSWorkflowWorkflowInstanceBEFlowInteroperData }
     * 
     * 
     */
    public List<UFIDAU9CSWorkflowWorkflowInstanceBEFlowInteroperData> getUFIDAU9CSWorkflowWorkflowInstanceBEFlowInteroperData() {
        if (ufidau9CSWorkflowWorkflowInstanceBEFlowInteroperData == null) {
            ufidau9CSWorkflowWorkflowInstanceBEFlowInteroperData = new ArrayList<UFIDAU9CSWorkflowWorkflowInstanceBEFlowInteroperData>();
        }
        return this.ufidau9CSWorkflowWorkflowInstanceBEFlowInteroperData;
    }

}
