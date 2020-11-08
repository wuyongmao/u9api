
package org.ufida.entitydata;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import businessentity.business.ubf.ufsoft.EntityKey;


/**
 * &lt;p&gt;UFIDA.U9.CBO.PropertyTypes.DateFirmTypeData complex type�� Java �ࡣ
 * 
 * &lt;p&gt;����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="UFIDA.U9.CBO.PropertyTypes.DateFirmTypeData"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://www.UFIDA.org/EntityData}UFSoft.UBF.Business.DataTransObjectBase"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="WorkCalendar" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="WorkCalendar_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_eOMOffsetDays" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_eOMType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_fixDayAssertRule" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_fixedDay1" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_fixedDay2" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_fixedDay3" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isProByWorkCalendar" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_monthSpanDay" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_monthSpanType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_offsetDays" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_offsetMonthes" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_wordCalendarDirection" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UFIDA.U9.CBO.PropertyTypes.DateFirmTypeData", propOrder = {
    "workCalendar",
    "workCalendarSKey",
    "meomOffsetDays",
    "meomType",
    "mFixDayAssertRule",
    "mFixedDay1",
    "mFixedDay2",
    "mFixedDay3",
    "mIsProByWorkCalendar",
    "mMonthSpanDay",
    "mMonthSpanType",
    "mOffsetDays",
    "mOffsetMonthes",
    "mWordCalendarDirection"
})
public class UFIDAU9CBOPropertyTypesDateFirmTypeData
    extends UFSoftUBFBusinessDataTransObjectBase
{

    @XmlElement(name = "WorkCalendar")
    protected Long workCalendar;
    @XmlElementRef(name = "WorkCalendar_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> workCalendarSKey;
    @XmlElement(name = "m_eOMOffsetDays")
    protected Integer meomOffsetDays;
    @XmlElement(name = "m_eOMType")
    protected Integer meomType;
    @XmlElement(name = "m_fixDayAssertRule")
    protected Integer mFixDayAssertRule;
    @XmlElement(name = "m_fixedDay1")
    protected Integer mFixedDay1;
    @XmlElement(name = "m_fixedDay2")
    protected Integer mFixedDay2;
    @XmlElement(name = "m_fixedDay3")
    protected Integer mFixedDay3;
    @XmlElement(name = "m_isProByWorkCalendar")
    protected Boolean mIsProByWorkCalendar;
    @XmlElement(name = "m_monthSpanDay")
    protected Integer mMonthSpanDay;
    @XmlElement(name = "m_monthSpanType")
    protected Integer mMonthSpanType;
    @XmlElement(name = "m_offsetDays")
    protected Integer mOffsetDays;
    @XmlElement(name = "m_offsetMonthes")
    protected Integer mOffsetMonthes;
    @XmlElement(name = "m_wordCalendarDirection")
    protected Integer mWordCalendarDirection;

    /**
     * ��ȡworkCalendar���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getWorkCalendar() {
        return workCalendar;
    }

    /**
     * ����workCalendar���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setWorkCalendar(Long value) {
        this.workCalendar = value;
    }

    /**
     * ��ȡworkCalendarSKey���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getWorkCalendarSKey() {
        return workCalendarSKey;
    }

    /**
     * ����workCalendarSKey���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setWorkCalendarSKey(JAXBElement<EntityKey> value) {
        this.workCalendarSKey = value;
    }

    /**
     * ��ȡmeomOffsetDays���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMEOMOffsetDays() {
        return meomOffsetDays;
    }

    /**
     * ����meomOffsetDays���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMEOMOffsetDays(Integer value) {
        this.meomOffsetDays = value;
    }

    /**
     * ��ȡmeomType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMEOMType() {
        return meomType;
    }

    /**
     * ����meomType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMEOMType(Integer value) {
        this.meomType = value;
    }

    /**
     * ��ȡmFixDayAssertRule���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMFixDayAssertRule() {
        return mFixDayAssertRule;
    }

    /**
     * ����mFixDayAssertRule���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMFixDayAssertRule(Integer value) {
        this.mFixDayAssertRule = value;
    }

    /**
     * ��ȡmFixedDay1���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMFixedDay1() {
        return mFixedDay1;
    }

    /**
     * ����mFixedDay1���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMFixedDay1(Integer value) {
        this.mFixedDay1 = value;
    }

    /**
     * ��ȡmFixedDay2���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMFixedDay2() {
        return mFixedDay2;
    }

    /**
     * ����mFixedDay2���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMFixedDay2(Integer value) {
        this.mFixedDay2 = value;
    }

    /**
     * ��ȡmFixedDay3���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMFixedDay3() {
        return mFixedDay3;
    }

    /**
     * ����mFixedDay3���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMFixedDay3(Integer value) {
        this.mFixedDay3 = value;
    }

    /**
     * ��ȡmIsProByWorkCalendar���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsProByWorkCalendar() {
        return mIsProByWorkCalendar;
    }

    /**
     * ����mIsProByWorkCalendar���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsProByWorkCalendar(Boolean value) {
        this.mIsProByWorkCalendar = value;
    }

    /**
     * ��ȡmMonthSpanDay���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMMonthSpanDay() {
        return mMonthSpanDay;
    }

    /**
     * ����mMonthSpanDay���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMMonthSpanDay(Integer value) {
        this.mMonthSpanDay = value;
    }

    /**
     * ��ȡmMonthSpanType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMMonthSpanType() {
        return mMonthSpanType;
    }

    /**
     * ����mMonthSpanType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMMonthSpanType(Integer value) {
        this.mMonthSpanType = value;
    }

    /**
     * ��ȡmOffsetDays���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMOffsetDays() {
        return mOffsetDays;
    }

    /**
     * ����mOffsetDays���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMOffsetDays(Integer value) {
        this.mOffsetDays = value;
    }

    /**
     * ��ȡmOffsetMonthes���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMOffsetMonthes() {
        return mOffsetMonthes;
    }

    /**
     * ����mOffsetMonthes���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMOffsetMonthes(Integer value) {
        this.mOffsetMonthes = value;
    }

    /**
     * ��ȡmWordCalendarDirection���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMWordCalendarDirection() {
        return mWordCalendarDirection;
    }

    /**
     * ����mWordCalendarDirection���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMWordCalendarDirection(Integer value) {
        this.mWordCalendarDirection = value;
    }

}
