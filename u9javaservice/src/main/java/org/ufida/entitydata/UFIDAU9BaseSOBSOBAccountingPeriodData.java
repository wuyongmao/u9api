
package org.ufida.entitydata;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import businessentity.business.ubf.ufsoft.EntityKey;
import data.util.ubf.ufsoft.MultiLangDataDict;


/**
 * &lt;p&gt;UFIDA.U9.Base.SOB.SOBAccountingPeriodData complex type的 Java 类。
 * 
 * &lt;p&gt;以下模式片段指定包含在此类中的预期内容。
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="UFIDA.U9.Base.SOB.SOBAccountingPeriodData"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://www.UFIDA.org/EntityData}UFSoft.UBF.Business.DataTransObjectBase"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="AccountPeriod" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="AccountPeriod_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="CloseUser" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="CloseUser_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="EndAccountPeriod_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Multi_ReportPeriodsDisplay" type="{UFSoft.UBF.Util.Data}MultiLangDataDict" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ReportPeriodsDisplay" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="SetofBooks_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="StartAccountPeriod_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_createdBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_createdOn" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_displayName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_endAccountPeriod" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.Base.SOB.SOBAccountingPeriodData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_iD" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isAdjustedPeriod" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_modifiedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_modifiedOn" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_number" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_periodState" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_setofBooks" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.Base.SOB.SetofBooksData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_startAccountPeriod" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.Base.SOB.SOBAccountingPeriodData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_sysVersion" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_year" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UFIDA.U9.Base.SOB.SOBAccountingPeriodData", propOrder = {
    "accountPeriod",
    "accountPeriodSKey",
    "closeUser",
    "closeUserSKey",
    "endAccountPeriodSKey",
    "multiReportPeriodsDisplay",
    "reportPeriodsDisplay",
    "setofBooksSKey",
    "startAccountPeriodSKey",
    "mCode",
    "mCreatedBy",
    "mCreatedOn",
    "mDisplayName",
    "mEndAccountPeriod",
    "mid",
    "mIsAdjustedPeriod",
    "mModifiedBy",
    "mModifiedOn",
    "mNumber",
    "mPeriodState",
    "mSetofBooks",
    "mStartAccountPeriod",
    "mSysVersion",
    "mYear"
})
public class UFIDAU9BaseSOBSOBAccountingPeriodData
    extends UFSoftUBFBusinessDataTransObjectBase
{

    @XmlElement(name = "AccountPeriod")
    protected Long accountPeriod;
    @XmlElementRef(name = "AccountPeriod_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> accountPeriodSKey;
    @XmlElement(name = "CloseUser")
    protected Long closeUser;
    @XmlElementRef(name = "CloseUser_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> closeUserSKey;
    @XmlElementRef(name = "EndAccountPeriod_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> endAccountPeriodSKey;
    @XmlElementRef(name = "Multi_ReportPeriodsDisplay", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<MultiLangDataDict> multiReportPeriodsDisplay;
    @XmlElementRef(name = "ReportPeriodsDisplay", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> reportPeriodsDisplay;
    @XmlElementRef(name = "SetofBooks_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> setofBooksSKey;
    @XmlElementRef(name = "StartAccountPeriod_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> startAccountPeriodSKey;
    @XmlElementRef(name = "m_code", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mCode;
    @XmlElementRef(name = "m_createdBy", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mCreatedBy;
    @XmlElement(name = "m_createdOn")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mCreatedOn;
    @XmlElementRef(name = "m_displayName", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mDisplayName;
    @XmlElementRef(name = "m_endAccountPeriod", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9BaseSOBSOBAccountingPeriodData> mEndAccountPeriod;
    @XmlElement(name = "m_iD")
    protected Long mid;
    @XmlElement(name = "m_isAdjustedPeriod")
    protected Boolean mIsAdjustedPeriod;
    @XmlElementRef(name = "m_modifiedBy", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mModifiedBy;
    @XmlElement(name = "m_modifiedOn")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mModifiedOn;
    @XmlElement(name = "m_number")
    protected Integer mNumber;
    @XmlElement(name = "m_periodState")
    protected Integer mPeriodState;
    @XmlElementRef(name = "m_setofBooks", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9BaseSOBSetofBooksData> mSetofBooks;
    @XmlElementRef(name = "m_startAccountPeriod", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9BaseSOBSOBAccountingPeriodData> mStartAccountPeriod;
    @XmlElement(name = "m_sysVersion")
    protected Long mSysVersion;
    @XmlElement(name = "m_year")
    protected Integer mYear;

    /**
     * 获取accountPeriod属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAccountPeriod() {
        return accountPeriod;
    }

    /**
     * 设置accountPeriod属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAccountPeriod(Long value) {
        this.accountPeriod = value;
    }

    /**
     * 获取accountPeriodSKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getAccountPeriodSKey() {
        return accountPeriodSKey;
    }

    /**
     * 设置accountPeriodSKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setAccountPeriodSKey(JAXBElement<EntityKey> value) {
        this.accountPeriodSKey = value;
    }

    /**
     * 获取closeUser属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCloseUser() {
        return closeUser;
    }

    /**
     * 设置closeUser属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCloseUser(Long value) {
        this.closeUser = value;
    }

    /**
     * 获取closeUserSKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getCloseUserSKey() {
        return closeUserSKey;
    }

    /**
     * 设置closeUserSKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setCloseUserSKey(JAXBElement<EntityKey> value) {
        this.closeUserSKey = value;
    }

    /**
     * 获取endAccountPeriodSKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getEndAccountPeriodSKey() {
        return endAccountPeriodSKey;
    }

    /**
     * 设置endAccountPeriodSKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setEndAccountPeriodSKey(JAXBElement<EntityKey> value) {
        this.endAccountPeriodSKey = value;
    }

    /**
     * 获取multiReportPeriodsDisplay属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MultiLangDataDict }{@code >}
     *     
     */
    public JAXBElement<MultiLangDataDict> getMultiReportPeriodsDisplay() {
        return multiReportPeriodsDisplay;
    }

    /**
     * 设置multiReportPeriodsDisplay属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MultiLangDataDict }{@code >}
     *     
     */
    public void setMultiReportPeriodsDisplay(JAXBElement<MultiLangDataDict> value) {
        this.multiReportPeriodsDisplay = value;
    }

    /**
     * 获取reportPeriodsDisplay属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getReportPeriodsDisplay() {
        return reportPeriodsDisplay;
    }

    /**
     * 设置reportPeriodsDisplay属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setReportPeriodsDisplay(JAXBElement<String> value) {
        this.reportPeriodsDisplay = value;
    }

    /**
     * 获取setofBooksSKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getSetofBooksSKey() {
        return setofBooksSKey;
    }

    /**
     * 设置setofBooksSKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setSetofBooksSKey(JAXBElement<EntityKey> value) {
        this.setofBooksSKey = value;
    }

    /**
     * 获取startAccountPeriodSKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getStartAccountPeriodSKey() {
        return startAccountPeriodSKey;
    }

    /**
     * 设置startAccountPeriodSKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setStartAccountPeriodSKey(JAXBElement<EntityKey> value) {
        this.startAccountPeriodSKey = value;
    }

    /**
     * 获取mCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMCode() {
        return mCode;
    }

    /**
     * 设置mCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMCode(JAXBElement<String> value) {
        this.mCode = value;
    }

    /**
     * 获取mCreatedBy属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMCreatedBy() {
        return mCreatedBy;
    }

    /**
     * 设置mCreatedBy属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMCreatedBy(JAXBElement<String> value) {
        this.mCreatedBy = value;
    }

    /**
     * 获取mCreatedOn属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMCreatedOn() {
        return mCreatedOn;
    }

    /**
     * 设置mCreatedOn属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMCreatedOn(XMLGregorianCalendar value) {
        this.mCreatedOn = value;
    }

    /**
     * 获取mDisplayName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMDisplayName() {
        return mDisplayName;
    }

    /**
     * 设置mDisplayName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMDisplayName(JAXBElement<String> value) {
        this.mDisplayName = value;
    }

    /**
     * 获取mEndAccountPeriod属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9BaseSOBSOBAccountingPeriodData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9BaseSOBSOBAccountingPeriodData> getMEndAccountPeriod() {
        return mEndAccountPeriod;
    }

    /**
     * 设置mEndAccountPeriod属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9BaseSOBSOBAccountingPeriodData }{@code >}
     *     
     */
    public void setMEndAccountPeriod(JAXBElement<UFIDAU9BaseSOBSOBAccountingPeriodData> value) {
        this.mEndAccountPeriod = value;
    }

    /**
     * 获取mid属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMID() {
        return mid;
    }

    /**
     * 设置mid属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMID(Long value) {
        this.mid = value;
    }

    /**
     * 获取mIsAdjustedPeriod属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsAdjustedPeriod() {
        return mIsAdjustedPeriod;
    }

    /**
     * 设置mIsAdjustedPeriod属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsAdjustedPeriod(Boolean value) {
        this.mIsAdjustedPeriod = value;
    }

    /**
     * 获取mModifiedBy属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMModifiedBy() {
        return mModifiedBy;
    }

    /**
     * 设置mModifiedBy属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMModifiedBy(JAXBElement<String> value) {
        this.mModifiedBy = value;
    }

    /**
     * 获取mModifiedOn属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMModifiedOn() {
        return mModifiedOn;
    }

    /**
     * 设置mModifiedOn属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMModifiedOn(XMLGregorianCalendar value) {
        this.mModifiedOn = value;
    }

    /**
     * 获取mNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMNumber() {
        return mNumber;
    }

    /**
     * 设置mNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMNumber(Integer value) {
        this.mNumber = value;
    }

    /**
     * 获取mPeriodState属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMPeriodState() {
        return mPeriodState;
    }

    /**
     * 设置mPeriodState属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMPeriodState(Integer value) {
        this.mPeriodState = value;
    }

    /**
     * 获取mSetofBooks属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9BaseSOBSetofBooksData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9BaseSOBSetofBooksData> getMSetofBooks() {
        return mSetofBooks;
    }

    /**
     * 设置mSetofBooks属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9BaseSOBSetofBooksData }{@code >}
     *     
     */
    public void setMSetofBooks(JAXBElement<UFIDAU9BaseSOBSetofBooksData> value) {
        this.mSetofBooks = value;
    }

    /**
     * 获取mStartAccountPeriod属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9BaseSOBSOBAccountingPeriodData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9BaseSOBSOBAccountingPeriodData> getMStartAccountPeriod() {
        return mStartAccountPeriod;
    }

    /**
     * 设置mStartAccountPeriod属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9BaseSOBSOBAccountingPeriodData }{@code >}
     *     
     */
    public void setMStartAccountPeriod(JAXBElement<UFIDAU9BaseSOBSOBAccountingPeriodData> value) {
        this.mStartAccountPeriod = value;
    }

    /**
     * 获取mSysVersion属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMSysVersion() {
        return mSysVersion;
    }

    /**
     * 设置mSysVersion属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMSysVersion(Long value) {
        this.mSysVersion = value;
    }

    /**
     * 获取mYear属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMYear() {
        return mYear;
    }

    /**
     * 设置mYear属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMYear(Integer value) {
        this.mYear = value;
    }

}
