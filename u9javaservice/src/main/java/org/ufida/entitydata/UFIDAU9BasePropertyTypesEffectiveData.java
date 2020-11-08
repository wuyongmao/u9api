
package org.ufida.entitydata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * &lt;p&gt;UFIDA.U9.Base.PropertyTypes.EffectiveData complex type�� Java �ࡣ
 * 
 * &lt;p&gt;����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="UFIDA.U9.Base.PropertyTypes.EffectiveData"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://www.UFIDA.org/EntityData}UFSoft.UBF.Business.DataTransObjectBase"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="m_disableDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_effectiveDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isEffective" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UFIDA.U9.Base.PropertyTypes.EffectiveData", propOrder = {
    "mDisableDate",
    "mEffectiveDate",
    "mIsEffective"
})
public class UFIDAU9BasePropertyTypesEffectiveData
    extends UFSoftUBFBusinessDataTransObjectBase
{

    @XmlElement(name = "m_disableDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mDisableDate;
    @XmlElement(name = "m_effectiveDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mEffectiveDate;
    @XmlElement(name = "m_isEffective")
    protected Boolean mIsEffective;

    /**
     * ��ȡmDisableDate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMDisableDate() {
        return mDisableDate;
    }

    /**
     * ����mDisableDate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMDisableDate(XMLGregorianCalendar value) {
        this.mDisableDate = value;
    }

    /**
     * ��ȡmEffectiveDate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMEffectiveDate() {
        return mEffectiveDate;
    }

    /**
     * ����mEffectiveDate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMEffectiveDate(XMLGregorianCalendar value) {
        this.mEffectiveDate = value;
    }

    /**
     * ��ȡmIsEffective���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsEffective() {
        return mIsEffective;
    }

    /**
     * ����mIsEffective���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsEffective(Boolean value) {
        this.mIsEffective = value;
    }

}
