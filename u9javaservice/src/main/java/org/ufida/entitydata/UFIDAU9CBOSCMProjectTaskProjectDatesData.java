
package org.ufida.entitydata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * &lt;p&gt;UFIDA.U9.CBO.SCM.ProjectTask.ProjectDatesData complex type的 Java 类。
 * 
 * &lt;p&gt;以下模式片段指定包含在此类中的预期内容。
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="UFIDA.U9.CBO.SCM.ProjectTask.ProjectDatesData"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://www.UFIDA.org/EntityData}UFSoft.UBF.Business.DataTransObjectBase"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="m_fromDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_toDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UFIDA.U9.CBO.SCM.ProjectTask.ProjectDatesData", propOrder = {
    "mFromDate",
    "mToDate"
})
public class UFIDAU9CBOSCMProjectTaskProjectDatesData
    extends UFSoftUBFBusinessDataTransObjectBase
{

    @XmlElement(name = "m_fromDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mFromDate;
    @XmlElement(name = "m_toDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mToDate;

    /**
     * 获取mFromDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMFromDate() {
        return mFromDate;
    }

    /**
     * 设置mFromDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMFromDate(XMLGregorianCalendar value) {
        this.mFromDate = value;
    }

    /**
     * 获取mToDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMToDate() {
        return mToDate;
    }

    /**
     * 设置mToDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMToDate(XMLGregorianCalendar value) {
        this.mToDate = value;
    }

}
