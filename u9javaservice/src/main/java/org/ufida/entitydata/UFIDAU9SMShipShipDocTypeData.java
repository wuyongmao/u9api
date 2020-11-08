
package org.ufida.entitydata;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import businessentity.business.ubf.ufsoft.EntityKey;


/**
 * &lt;p&gt;UFIDA.U9.SM.Ship.ShipDocTypeData complex type的 Java 类。
 * 
 * &lt;p&gt;以下模式片段指定包含在此类中的预期内容。
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="UFIDA.U9.SM.Ship.ShipDocTypeData"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://www.UFIDA.org/EntityData}UFIDA.U9.Base.Doc.DocTypeData"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="ConfirmAccording" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ConfirmAccording_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="IncomeConfirmTerm" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="IncomeConfirmTerm_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="InvoiceAccording" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="InvoiceAccording_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="MasterEntity_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="MasterOrg" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="MasterOrg_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_aRBillType" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_checkAccountStrategy" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_confirmMode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_creditCheckTime" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_defaultShipConfirmDate" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_dupExportFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_forPreShip" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_goodsManagementType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_hasBusinessInvoice" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_hasContract" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_incomeConfirmRule" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isApproveCheckCredit" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isAutoPushTask" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isExport" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isModIncomeConfirmRule" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isModIncomeConfirmTerm" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isNoCheckCredit" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isSaveCheckCredit" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isSubmitCheckCredit" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_masterEntity" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.SM.Ship.ShipDocTypeData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_pPFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_preRecCheckTime" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_prepayFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_rPFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_referenceFlag" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_shipLCCheck" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_signInInterval" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_signInStrategy" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_taskUpdShipSign" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UFIDA.U9.SM.Ship.ShipDocTypeData", propOrder = {
    "confirmAccording",
    "confirmAccordingSKey",
    "incomeConfirmTerm",
    "incomeConfirmTermSKey",
    "invoiceAccording",
    "invoiceAccordingSKey",
    "masterEntitySKey",
    "masterOrg",
    "masterOrgSKey",
    "marBillType",
    "mCheckAccountStrategy",
    "mConfirmMode",
    "mCreditCheckTime",
    "mDefaultShipConfirmDate",
    "mDupExportFlag",
    "mForPreShip",
    "mGoodsManagementType",
    "mHasBusinessInvoice",
    "mHasContract",
    "mIncomeConfirmRule",
    "mIsApproveCheckCredit",
    "mIsAutoPushTask",
    "mIsExport",
    "mIsModIncomeConfirmRule",
    "mIsModIncomeConfirmTerm",
    "mIsNoCheckCredit",
    "mIsSaveCheckCredit",
    "mIsSubmitCheckCredit",
    "mMasterEntity",
    "mppFlag",
    "mPreRecCheckTime",
    "mPrepayFlag",
    "mrpFlag",
    "mReferenceFlag",
    "mShipLCCheck",
    "mSignInInterval",
    "mSignInStrategy",
    "mTaskUpdShipSign"
})
public class UFIDAU9SMShipShipDocTypeData
    extends UFIDAU9BaseDocDocTypeData
{

    @XmlElement(name = "ConfirmAccording")
    protected Long confirmAccording;
    @XmlElementRef(name = "ConfirmAccording_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> confirmAccordingSKey;
    @XmlElement(name = "IncomeConfirmTerm")
    protected Long incomeConfirmTerm;
    @XmlElementRef(name = "IncomeConfirmTerm_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> incomeConfirmTermSKey;
    @XmlElement(name = "InvoiceAccording")
    protected Long invoiceAccording;
    @XmlElementRef(name = "InvoiceAccording_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> invoiceAccordingSKey;
    @XmlElementRef(name = "MasterEntity_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> masterEntitySKey;
    @XmlElement(name = "MasterOrg")
    protected Long masterOrg;
    @XmlElementRef(name = "MasterOrg_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> masterOrgSKey;
    @XmlElement(name = "m_aRBillType")
    protected Long marBillType;
    @XmlElement(name = "m_checkAccountStrategy")
    protected Integer mCheckAccountStrategy;
    @XmlElement(name = "m_confirmMode")
    protected Integer mConfirmMode;
    @XmlElement(name = "m_creditCheckTime")
    protected Integer mCreditCheckTime;
    @XmlElement(name = "m_defaultShipConfirmDate")
    protected Integer mDefaultShipConfirmDate;
    @XmlElement(name = "m_dupExportFlag")
    protected Boolean mDupExportFlag;
    @XmlElement(name = "m_forPreShip")
    protected Boolean mForPreShip;
    @XmlElement(name = "m_goodsManagementType")
    protected Integer mGoodsManagementType;
    @XmlElement(name = "m_hasBusinessInvoice")
    protected Boolean mHasBusinessInvoice;
    @XmlElement(name = "m_hasContract")
    protected Boolean mHasContract;
    @XmlElement(name = "m_incomeConfirmRule")
    protected Integer mIncomeConfirmRule;
    @XmlElement(name = "m_isApproveCheckCredit")
    protected Boolean mIsApproveCheckCredit;
    @XmlElement(name = "m_isAutoPushTask")
    protected Boolean mIsAutoPushTask;
    @XmlElement(name = "m_isExport")
    protected Boolean mIsExport;
    @XmlElement(name = "m_isModIncomeConfirmRule")
    protected Boolean mIsModIncomeConfirmRule;
    @XmlElement(name = "m_isModIncomeConfirmTerm")
    protected Boolean mIsModIncomeConfirmTerm;
    @XmlElement(name = "m_isNoCheckCredit")
    protected Boolean mIsNoCheckCredit;
    @XmlElement(name = "m_isSaveCheckCredit")
    protected Boolean mIsSaveCheckCredit;
    @XmlElement(name = "m_isSubmitCheckCredit")
    protected Boolean mIsSubmitCheckCredit;
    @XmlElementRef(name = "m_masterEntity", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9SMShipShipDocTypeData> mMasterEntity;
    @XmlElement(name = "m_pPFlag")
    protected Boolean mppFlag;
    @XmlElement(name = "m_preRecCheckTime")
    protected Integer mPreRecCheckTime;
    @XmlElement(name = "m_prepayFlag")
    protected Boolean mPrepayFlag;
    @XmlElement(name = "m_rPFlag")
    protected Boolean mrpFlag;
    @XmlElement(name = "m_referenceFlag")
    protected Integer mReferenceFlag;
    @XmlElement(name = "m_shipLCCheck")
    protected Integer mShipLCCheck;
    @XmlElement(name = "m_signInInterval")
    protected Short mSignInInterval;
    @XmlElement(name = "m_signInStrategy")
    protected Integer mSignInStrategy;
    @XmlElement(name = "m_taskUpdShipSign")
    protected Boolean mTaskUpdShipSign;

    /**
     * 获取confirmAccording属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getConfirmAccording() {
        return confirmAccording;
    }

    /**
     * 设置confirmAccording属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setConfirmAccording(Long value) {
        this.confirmAccording = value;
    }

    /**
     * 获取confirmAccordingSKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getConfirmAccordingSKey() {
        return confirmAccordingSKey;
    }

    /**
     * 设置confirmAccordingSKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setConfirmAccordingSKey(JAXBElement<EntityKey> value) {
        this.confirmAccordingSKey = value;
    }

    /**
     * 获取incomeConfirmTerm属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIncomeConfirmTerm() {
        return incomeConfirmTerm;
    }

    /**
     * 设置incomeConfirmTerm属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIncomeConfirmTerm(Long value) {
        this.incomeConfirmTerm = value;
    }

    /**
     * 获取incomeConfirmTermSKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getIncomeConfirmTermSKey() {
        return incomeConfirmTermSKey;
    }

    /**
     * 设置incomeConfirmTermSKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setIncomeConfirmTermSKey(JAXBElement<EntityKey> value) {
        this.incomeConfirmTermSKey = value;
    }

    /**
     * 获取invoiceAccording属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getInvoiceAccording() {
        return invoiceAccording;
    }

    /**
     * 设置invoiceAccording属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setInvoiceAccording(Long value) {
        this.invoiceAccording = value;
    }

    /**
     * 获取invoiceAccordingSKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getInvoiceAccordingSKey() {
        return invoiceAccordingSKey;
    }

    /**
     * 设置invoiceAccordingSKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setInvoiceAccordingSKey(JAXBElement<EntityKey> value) {
        this.invoiceAccordingSKey = value;
    }

    /**
     * 获取masterEntitySKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getMasterEntitySKey() {
        return masterEntitySKey;
    }

    /**
     * 设置masterEntitySKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setMasterEntitySKey(JAXBElement<EntityKey> value) {
        this.masterEntitySKey = value;
    }

    /**
     * 获取masterOrg属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMasterOrg() {
        return masterOrg;
    }

    /**
     * 设置masterOrg属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMasterOrg(Long value) {
        this.masterOrg = value;
    }

    /**
     * 获取masterOrgSKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getMasterOrgSKey() {
        return masterOrgSKey;
    }

    /**
     * 设置masterOrgSKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setMasterOrgSKey(JAXBElement<EntityKey> value) {
        this.masterOrgSKey = value;
    }

    /**
     * 获取marBillType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMARBillType() {
        return marBillType;
    }

    /**
     * 设置marBillType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMARBillType(Long value) {
        this.marBillType = value;
    }

    /**
     * 获取mCheckAccountStrategy属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMCheckAccountStrategy() {
        return mCheckAccountStrategy;
    }

    /**
     * 设置mCheckAccountStrategy属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMCheckAccountStrategy(Integer value) {
        this.mCheckAccountStrategy = value;
    }

    /**
     * 获取mConfirmMode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMConfirmMode() {
        return mConfirmMode;
    }

    /**
     * 设置mConfirmMode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMConfirmMode(Integer value) {
        this.mConfirmMode = value;
    }

    /**
     * 获取mCreditCheckTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMCreditCheckTime() {
        return mCreditCheckTime;
    }

    /**
     * 设置mCreditCheckTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMCreditCheckTime(Integer value) {
        this.mCreditCheckTime = value;
    }

    /**
     * 获取mDefaultShipConfirmDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMDefaultShipConfirmDate() {
        return mDefaultShipConfirmDate;
    }

    /**
     * 设置mDefaultShipConfirmDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMDefaultShipConfirmDate(Integer value) {
        this.mDefaultShipConfirmDate = value;
    }

    /**
     * 获取mDupExportFlag属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMDupExportFlag() {
        return mDupExportFlag;
    }

    /**
     * 设置mDupExportFlag属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMDupExportFlag(Boolean value) {
        this.mDupExportFlag = value;
    }

    /**
     * 获取mForPreShip属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMForPreShip() {
        return mForPreShip;
    }

    /**
     * 设置mForPreShip属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMForPreShip(Boolean value) {
        this.mForPreShip = value;
    }

    /**
     * 获取mGoodsManagementType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMGoodsManagementType() {
        return mGoodsManagementType;
    }

    /**
     * 设置mGoodsManagementType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMGoodsManagementType(Integer value) {
        this.mGoodsManagementType = value;
    }

    /**
     * 获取mHasBusinessInvoice属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMHasBusinessInvoice() {
        return mHasBusinessInvoice;
    }

    /**
     * 设置mHasBusinessInvoice属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMHasBusinessInvoice(Boolean value) {
        this.mHasBusinessInvoice = value;
    }

    /**
     * 获取mHasContract属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMHasContract() {
        return mHasContract;
    }

    /**
     * 设置mHasContract属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMHasContract(Boolean value) {
        this.mHasContract = value;
    }

    /**
     * 获取mIncomeConfirmRule属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMIncomeConfirmRule() {
        return mIncomeConfirmRule;
    }

    /**
     * 设置mIncomeConfirmRule属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMIncomeConfirmRule(Integer value) {
        this.mIncomeConfirmRule = value;
    }

    /**
     * 获取mIsApproveCheckCredit属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsApproveCheckCredit() {
        return mIsApproveCheckCredit;
    }

    /**
     * 设置mIsApproveCheckCredit属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsApproveCheckCredit(Boolean value) {
        this.mIsApproveCheckCredit = value;
    }

    /**
     * 获取mIsAutoPushTask属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsAutoPushTask() {
        return mIsAutoPushTask;
    }

    /**
     * 设置mIsAutoPushTask属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsAutoPushTask(Boolean value) {
        this.mIsAutoPushTask = value;
    }

    /**
     * 获取mIsExport属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsExport() {
        return mIsExport;
    }

    /**
     * 设置mIsExport属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsExport(Boolean value) {
        this.mIsExport = value;
    }

    /**
     * 获取mIsModIncomeConfirmRule属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsModIncomeConfirmRule() {
        return mIsModIncomeConfirmRule;
    }

    /**
     * 设置mIsModIncomeConfirmRule属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsModIncomeConfirmRule(Boolean value) {
        this.mIsModIncomeConfirmRule = value;
    }

    /**
     * 获取mIsModIncomeConfirmTerm属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsModIncomeConfirmTerm() {
        return mIsModIncomeConfirmTerm;
    }

    /**
     * 设置mIsModIncomeConfirmTerm属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsModIncomeConfirmTerm(Boolean value) {
        this.mIsModIncomeConfirmTerm = value;
    }

    /**
     * 获取mIsNoCheckCredit属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsNoCheckCredit() {
        return mIsNoCheckCredit;
    }

    /**
     * 设置mIsNoCheckCredit属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsNoCheckCredit(Boolean value) {
        this.mIsNoCheckCredit = value;
    }

    /**
     * 获取mIsSaveCheckCredit属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsSaveCheckCredit() {
        return mIsSaveCheckCredit;
    }

    /**
     * 设置mIsSaveCheckCredit属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsSaveCheckCredit(Boolean value) {
        this.mIsSaveCheckCredit = value;
    }

    /**
     * 获取mIsSubmitCheckCredit属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsSubmitCheckCredit() {
        return mIsSubmitCheckCredit;
    }

    /**
     * 设置mIsSubmitCheckCredit属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsSubmitCheckCredit(Boolean value) {
        this.mIsSubmitCheckCredit = value;
    }

    /**
     * 获取mMasterEntity属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9SMShipShipDocTypeData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9SMShipShipDocTypeData> getMMasterEntity() {
        return mMasterEntity;
    }

    /**
     * 设置mMasterEntity属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9SMShipShipDocTypeData }{@code >}
     *     
     */
    public void setMMasterEntity(JAXBElement<UFIDAU9SMShipShipDocTypeData> value) {
        this.mMasterEntity = value;
    }

    /**
     * 获取mppFlag属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMPPFlag() {
        return mppFlag;
    }

    /**
     * 设置mppFlag属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMPPFlag(Boolean value) {
        this.mppFlag = value;
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
     * 获取mPrepayFlag属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMPrepayFlag() {
        return mPrepayFlag;
    }

    /**
     * 设置mPrepayFlag属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMPrepayFlag(Boolean value) {
        this.mPrepayFlag = value;
    }

    /**
     * 获取mrpFlag属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMRPFlag() {
        return mrpFlag;
    }

    /**
     * 设置mrpFlag属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMRPFlag(Boolean value) {
        this.mrpFlag = value;
    }

    /**
     * 获取mReferenceFlag属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMReferenceFlag() {
        return mReferenceFlag;
    }

    /**
     * 设置mReferenceFlag属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMReferenceFlag(Integer value) {
        this.mReferenceFlag = value;
    }

    /**
     * 获取mShipLCCheck属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMShipLCCheck() {
        return mShipLCCheck;
    }

    /**
     * 设置mShipLCCheck属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMShipLCCheck(Integer value) {
        this.mShipLCCheck = value;
    }

    /**
     * 获取mSignInInterval属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getMSignInInterval() {
        return mSignInInterval;
    }

    /**
     * 设置mSignInInterval属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setMSignInInterval(Short value) {
        this.mSignInInterval = value;
    }

    /**
     * 获取mSignInStrategy属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMSignInStrategy() {
        return mSignInStrategy;
    }

    /**
     * 设置mSignInStrategy属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMSignInStrategy(Integer value) {
        this.mSignInStrategy = value;
    }

    /**
     * 获取mTaskUpdShipSign属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMTaskUpdShipSign() {
        return mTaskUpdShipSign;
    }

    /**
     * 设置mTaskUpdShipSign属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMTaskUpdShipSign(Boolean value) {
        this.mTaskUpdShipSign = value;
    }

}
