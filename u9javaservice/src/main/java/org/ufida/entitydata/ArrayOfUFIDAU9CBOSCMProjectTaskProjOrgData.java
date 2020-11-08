
package org.ufida.entitydata;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;ArrayOfUFIDA.U9.CBO.SCM.ProjectTask.ProjOrgData complex type的 Java 类。
 * 
 * &lt;p&gt;以下模式片段指定包含在此类中的预期内容。
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="ArrayOfUFIDA.U9.CBO.SCM.ProjectTask.ProjOrgData"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="UFIDA.U9.CBO.SCM.ProjectTask.ProjOrgData" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CBO.SCM.ProjectTask.ProjOrgData" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfUFIDA.U9.CBO.SCM.ProjectTask.ProjOrgData", propOrder = {
    "ufidau9CBOSCMProjectTaskProjOrgData"
})
public class ArrayOfUFIDAU9CBOSCMProjectTaskProjOrgData {

    @XmlElement(name = "UFIDA.U9.CBO.SCM.ProjectTask.ProjOrgData", nillable = true)
    protected List<UFIDAU9CBOSCMProjectTaskProjOrgData> ufidau9CBOSCMProjectTaskProjOrgData;

    /**
     * Gets the value of the ufidau9CBOSCMProjectTaskProjOrgData property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the ufidau9CBOSCMProjectTaskProjOrgData property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getUFIDAU9CBOSCMProjectTaskProjOrgData().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link UFIDAU9CBOSCMProjectTaskProjOrgData }
     * 
     * 
     */
    public List<UFIDAU9CBOSCMProjectTaskProjOrgData> getUFIDAU9CBOSCMProjectTaskProjOrgData() {
        if (ufidau9CBOSCMProjectTaskProjOrgData == null) {
            ufidau9CBOSCMProjectTaskProjOrgData = new ArrayList<UFIDAU9CBOSCMProjectTaskProjOrgData>();
        }
        return this.ufidau9CBOSCMProjectTaskProjOrgData;
    }

}
