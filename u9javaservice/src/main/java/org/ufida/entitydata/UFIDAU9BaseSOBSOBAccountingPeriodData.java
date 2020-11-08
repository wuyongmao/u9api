
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
 * &lt;p&gt;UFIDA.U9.Base.SOB.SOBAccountingPeriodData complex type�� Java �ࡣ
 * 
 * &lt;p&gt;����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡaccountPeriod���Ե�ֵ��
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
     * ����accountPeriod���Ե�ֵ��
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
     * ��ȡaccountPeriodSKey���Ե�ֵ��
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
     * ����accountPeriodSKey���Ե�ֵ��
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
     * ��ȡcloseUser���Ե�ֵ��
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
     * ����closeUser���Ե�ֵ��
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
     * ��ȡcloseUserSKey���Ե�ֵ��
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
     * ����closeUserSKey���Ե�ֵ��
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
     * ��ȡendAccountPeriodSKey���Ե�ֵ��
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
     * ����endAccountPeriodSKey���Ե�ֵ��
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
     * ��ȡmultiReportPeriodsDisplay���Ե�ֵ��
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
     * ����multiReportPeriodsDisplay���Ե�ֵ��
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
     * ��ȡreportPeriodsDisplay���Ե�ֵ��
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
     * ����reportPeriodsDisplay���Ե�ֵ��
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
     * ��ȡsetofBooksSKey���Ե�ֵ��
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
     * ����setofBooksSKey���Ե�ֵ��
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
     * ��ȡstartAccountPeriodSKey���Ե�ֵ��
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
     * ����startAccountPeriodSKey���Ե�ֵ��
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
     * ��ȡmCode���Ե�ֵ��
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
     * ����mCode���Ե�ֵ��
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
     * ��ȡmCreatedBy���Ե�ֵ��
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
     * ����mCreatedBy���Ե�ֵ��
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
     * ��ȡmCreatedOn���Ե�ֵ��
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
     * ����mCreatedOn���Ե�ֵ��
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
     * ��ȡmDisplayName���Ե�ֵ��
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
     * ����mDisplayName���Ե�ֵ��
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
     * ��ȡmEndAccountPeriod���Ե�ֵ��
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
     * ����mEndAccountPeriod���Ե�ֵ��
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
     * ��ȡmid���Ե�ֵ��
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
     * ����mid���Ե�ֵ��
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
     * ��ȡmIsAdjustedPeriod���Ե�ֵ��
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
     * ����mIsAdjustedPeriod���Ե�ֵ��
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
     * ��ȡmModifiedBy���Ե�ֵ��
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
     * ����mModifiedBy���Ե�ֵ��
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
     * ��ȡmModifiedOn���Ե�ֵ��
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
     * ����mModifiedOn���Ե�ֵ��
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
     * ��ȡmNumber���Ե�ֵ��
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
     * ����mNumber���Ե�ֵ��
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
     * ��ȡmPeriodState���Ե�ֵ��
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
     * ����mPeriodState���Ե�ֵ��
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
     * ��ȡmSetofBooks���Ե�ֵ��
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
     * ����mSetofBooks���Ե�ֵ��
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
     * ��ȡmStartAccountPeriod���Ե�ֵ��
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
     * ����mStartAccountPeriod���Ե�ֵ��
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
     * ��ȡmSysVersion���Ե�ֵ��
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
     * ����mSysVersion���Ե�ֵ��
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
     * ��ȡmYear���Ե�ֵ��
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
     * ����mYear���Ե�ֵ��
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
