
package org.ufida.entitydata;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import businessentity.business.ubf.ufsoft.EntityKey;


/**
 * &lt;p&gt;UFIDA.U9.CBO.SCM.PreRecPolicy.PreRecPolicyLineData complex type的 Java 类。
 * 
 * &lt;p&gt;以下模式片段指定包含在此类中的预期内容。
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="UFIDA.U9.CBO.SCM.PreRecPolicy.PreRecPolicyLineData"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://www.UFIDA.org/EntityData}UFSoft.UBF.Business.DataTransObjectBase"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="Org" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Org_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="PreRecCurrency" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="PreRecCurrency_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="PreRecPolicy_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_aimSetMode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_controlPoint" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_createdBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_createdOn" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_docLineNo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_exceptionHandleRule" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_exchangeRateType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_iD" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isStep" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_modifiedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_modifiedOn" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_preRecCheckTime" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_preRecControlObject" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_preRecConvertMethod" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_preRecMoney" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_preRecPolicy" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CBO.SCM.PreRecPolicy.PreRecPolicyData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_preRecPolicySubLines" type="{http://www.UFIDA.org/EntityData}ArrayOfUFIDA.U9.CBO.SCM.PreRecPolicy.PreRecPolicySubLineData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_preRecRate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_srcRowID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_stepBy" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_sysVersion" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UFIDA.U9.CBO.SCM.PreRecPolicy.PreRecPolicyLineData", propOrder = {
    "org",
    "orgSKey",
    "preRecCurrency",
    "preRecCurrencySKey",
    "preRecPolicySKey",
    "mAimSetMode",
    "mControlPoint",
    "mCreatedBy",
    "mCreatedOn",
    "mDocLineNo",
    "mExceptionHandleRule",
    "mExchangeRateType",
    "mid",
    "mIsStep",
    "mModifiedBy",
    "mModifiedOn",
    "mPreRecCheckTime",
    "mPreRecControlObject",
    "mPreRecConvertMethod",
    "mPreRecMoney",
    "mPreRecPolicy",
    "mPreRecPolicySubLines",
    "mPreRecRate",
    "mSrcRowID",
    "mStepBy",
    "mSysVersion"
})
public class UFIDAU9CBOSCMPreRecPolicyPreRecPolicyLineData
    extends UFSoftUBFBusinessDataTransObjectBase
{

    @XmlElement(name = "Org")
    protected Long org;
    @XmlElementRef(name = "Org_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> orgSKey;
    @XmlElement(name = "PreRecCurrency")
    protected Long preRecCurrency;
    @XmlElementRef(name = "PreRecCurrency_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> preRecCurrencySKey;
    @XmlElementRef(name = "PreRecPolicy_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> preRecPolicySKey;
    @XmlElement(name = "m_aimSetMode")
    protected Integer mAimSetMode;
    @XmlElement(name = "m_controlPoint")
    protected Integer mControlPoint;
    @XmlElementRef(name = "m_createdBy", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mCreatedBy;
    @XmlElement(name = "m_createdOn")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mCreatedOn;
    @XmlElement(name = "m_docLineNo")
    protected Integer mDocLineNo;
    @XmlElement(name = "m_exceptionHandleRule")
    protected Integer mExceptionHandleRule;
    @XmlElement(name = "m_exchangeRateType")
    protected Integer mExchangeRateType;
    @XmlElement(name = "m_iD")
    protected Long mid;
    @XmlElement(name = "m_isStep")
    protected Boolean mIsStep;
    @XmlElementRef(name = "m_modifiedBy", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mModifiedBy;
    @XmlElement(name = "m_modifiedOn")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mModifiedOn;
    @XmlElement(name = "m_preRecCheckTime")
    protected Integer mPreRecCheckTime;
    @XmlElement(name = "m_preRecControlObject")
    protected Integer mPreRecControlObject;
    @XmlElement(name = "m_preRecConvertMethod")
    protected Integer mPreRecConvertMethod;
    @XmlElement(name = "m_preRecMoney")
    protected BigDecimal mPreRecMoney;
    @XmlElementRef(name = "m_preRecPolicy", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9CBOSCMPreRecPolicyPreRecPolicyData> mPreRecPolicy;
    @XmlElementRef(name = "m_preRecPolicySubLines", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfUFIDAU9CBOSCMPreRecPolicyPreRecPolicySubLineData> mPreRecPolicySubLines;
    @XmlElement(name = "m_preRecRate")
    protected BigDecimal mPreRecRate;
    @XmlElement(name = "m_srcRowID")
    protected Long mSrcRowID;
    @XmlElement(name = "m_stepBy")
    protected Integer mStepBy;
    @XmlElement(name = "m_sysVersion")
    protected Long mSysVersion;

    /**
     * 获取org属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOrg() {
        return org;
    }

    /**
     * 设置org属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOrg(Long value) {
        this.org = value;
    }

    /**
     * 获取orgSKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getOrgSKey() {
        return orgSKey;
    }

    /**
     * 设置orgSKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setOrgSKey(JAXBElement<EntityKey> value) {
        this.orgSKey = value;
    }

    /**
     * 获取preRecCurrency属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPreRecCurrency() {
        return preRecCurrency;
    }

    /**
     * 设置preRecCurrency属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPreRecCurrency(Long value) {
        this.preRecCurrency = value;
    }

    /**
     * 获取preRecCurrencySKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getPreRecCurrencySKey() {
        return preRecCurrencySKey;
    }

    /**
     * 设置preRecCurrencySKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setPreRecCurrencySKey(JAXBElement<EntityKey> value) {
        this.preRecCurrencySKey = value;
    }

    /**
     * 获取preRecPolicySKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getPreRecPolicySKey() {
        return preRecPolicySKey;
    }

    /**
     * 设置preRecPolicySKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setPreRecPolicySKey(JAXBElement<EntityKey> value) {
        this.preRecPolicySKey = value;
    }

    /**
     * 获取mAimSetMode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMAimSetMode() {
        return mAimSetMode;
    }

    /**
     * 设置mAimSetMode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMAimSetMode(Integer value) {
        this.mAimSetMode = value;
    }

    /**
     * 获取mControlPoint属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMControlPoint() {
        return mControlPoint;
    }

    /**
     * 设置mControlPoint属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMControlPoint(Integer value) {
        this.mControlPoint = value;
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
     * 获取mDocLineNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMDocLineNo() {
        return mDocLineNo;
    }

    /**
     * 设置mDocLineNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMDocLineNo(Integer value) {
        this.mDocLineNo = value;
    }

    /**
     * 获取mExceptionHandleRule属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMExceptionHandleRule() {
        return mExceptionHandleRule;
    }

    /**
     * 设置mExceptionHandleRule属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMExceptionHandleRule(Integer value) {
        this.mExceptionHandleRule = value;
    }

    /**
     * 获取mExchangeRateType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMExchangeRateType() {
        return mExchangeRateType;
    }

    /**
     * 设置mExchangeRateType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMExchangeRateType(Integer value) {
        this.mExchangeRateType = value;
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
     * 获取mIsStep属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsStep() {
        return mIsStep;
    }

    /**
     * 设置mIsStep属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsStep(Boolean value) {
        this.mIsStep = value;
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
     * 获取mPreRecCheckTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMPreRecCheckTime() {
        return mPreRecCheckTime;
    }

    /**
     * 设置mPreRecCheckTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMPreRecCheckTime(Integer value) {
        this.mPreRecCheckTime = value;
    }

    /**
     * 获取mPreRecControlObject属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMPreRecControlObject() {
        return mPreRecControlObject;
    }

    /**
     * 设置mPreRecControlObject属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMPreRecControlObject(Integer value) {
        this.mPreRecControlObject = value;
    }

    /**
     * 获取mPreRecConvertMethod属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMPreRecConvertMethod() {
        return mPreRecConvertMethod;
    }

    /**
     * 设置mPreRecConvertMethod属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMPreRecConvertMethod(Integer value) {
        this.mPreRecConvertMethod = value;
    }

    /**
     * 获取mPreRecMoney属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMPreRecMoney() {
        return mPreRecMoney;
    }

    /**
     * 设置mPreRecMoney属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMPreRecMoney(BigDecimal value) {
        this.mPreRecMoney = value;
    }

    /**
     * 获取mPreRecPolicy属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOSCMPreRecPolicyPreRecPolicyData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9CBOSCMPreRecPolicyPreRecPolicyData> getMPreRecPolicy() {
        return mPreRecPolicy;
    }

    /**
     * 设置mPreRecPolicy属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOSCMPreRecPolicyPreRecPolicyData }{@code >}
     *     
     */
    public void setMPreRecPolicy(JAXBElement<UFIDAU9CBOSCMPreRecPolicyPreRecPolicyData> value) {
        this.mPreRecPolicy = value;
    }

    /**
     * 获取mPreRecPolicySubLines属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUFIDAU9CBOSCMPreRecPolicyPreRecPolicySubLineData }{@code >}
     *     
     */
    public JAXBElement<ArrayOfUFIDAU9CBOSCMPreRecPolicyPreRecPolicySubLineData> getMPreRecPolicySubLines() {
        return mPreRecPolicySubLines;
    }

    /**
     * 设置mPreRecPolicySubLines属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUFIDAU9CBOSCMPreRecPolicyPreRecPolicySubLineData }{@code >}
     *     
     */
    public void setMPreRecPolicySubLines(JAXBElement<ArrayOfUFIDAU9CBOSCMPreRecPolicyPreRecPolicySubLineData> value) {
        this.mPreRecPolicySubLines = value;
    }

    /**
     * 获取mPreRecRate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMPreRecRate() {
        return mPreRecRate;
    }

    /**
     * 设置mPreRecRate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMPreRecRate(BigDecimal value) {
        this.mPreRecRate = value;
    }

    /**
     * 获取mSrcRowID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMSrcRowID() {
        return mSrcRowID;
    }

    /**
     * 设置mSrcRowID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMSrcRowID(Long value) {
        this.mSrcRowID = value;
    }

    /**
     * 获取mStepBy属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMStepBy() {
        return mStepBy;
    }

    /**
     * 设置mStepBy属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMStepBy(Integer value) {
        this.mStepBy = value;
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

}
