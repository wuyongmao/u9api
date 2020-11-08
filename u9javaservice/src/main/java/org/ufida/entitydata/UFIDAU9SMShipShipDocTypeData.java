
package org.ufida.entitydata;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import businessentity.business.ubf.ufsoft.EntityKey;


/**
 * &lt;p&gt;UFIDA.U9.SM.Ship.ShipDocTypeData complex type�� Java �ࡣ
 * 
 * &lt;p&gt;����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡconfirmAccording���Ե�ֵ��
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
     * ����confirmAccording���Ե�ֵ��
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
     * ��ȡconfirmAccordingSKey���Ե�ֵ��
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
     * ����confirmAccordingSKey���Ե�ֵ��
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
     * ��ȡincomeConfirmTerm���Ե�ֵ��
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
     * ����incomeConfirmTerm���Ե�ֵ��
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
     * ��ȡincomeConfirmTermSKey���Ե�ֵ��
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
     * ����incomeConfirmTermSKey���Ե�ֵ��
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
     * ��ȡinvoiceAccording���Ե�ֵ��
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
     * ����invoiceAccording���Ե�ֵ��
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
     * ��ȡinvoiceAccordingSKey���Ե�ֵ��
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
     * ����invoiceAccordingSKey���Ե�ֵ��
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
     * ��ȡmasterEntitySKey���Ե�ֵ��
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
     * ����masterEntitySKey���Ե�ֵ��
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
     * ��ȡmasterOrg���Ե�ֵ��
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
     * ����masterOrg���Ե�ֵ��
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
     * ��ȡmasterOrgSKey���Ե�ֵ��
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
     * ����masterOrgSKey���Ե�ֵ��
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
     * ��ȡmarBillType���Ե�ֵ��
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
     * ����marBillType���Ե�ֵ��
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
     * ��ȡmCheckAccountStrategy���Ե�ֵ��
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
     * ����mCheckAccountStrategy���Ե�ֵ��
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
     * ��ȡmConfirmMode���Ե�ֵ��
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
     * ����mConfirmMode���Ե�ֵ��
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
     * ��ȡmCreditCheckTime���Ե�ֵ��
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
     * ����mCreditCheckTime���Ե�ֵ��
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
     * ��ȡmDefaultShipConfirmDate���Ե�ֵ��
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
     * ����mDefaultShipConfirmDate���Ե�ֵ��
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
     * ��ȡmDupExportFlag���Ե�ֵ��
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
     * ����mDupExportFlag���Ե�ֵ��
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
     * ��ȡmForPreShip���Ե�ֵ��
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
     * ����mForPreShip���Ե�ֵ��
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
     * ��ȡmGoodsManagementType���Ե�ֵ��
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
     * ����mGoodsManagementType���Ե�ֵ��
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
     * ��ȡmHasBusinessInvoice���Ե�ֵ��
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
     * ����mHasBusinessInvoice���Ե�ֵ��
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
     * ��ȡmHasContract���Ե�ֵ��
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
     * ����mHasContract���Ե�ֵ��
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
     * ��ȡmIncomeConfirmRule���Ե�ֵ��
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
     * ����mIncomeConfirmRule���Ե�ֵ��
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
     * ��ȡmIsApproveCheckCredit���Ե�ֵ��
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
     * ����mIsApproveCheckCredit���Ե�ֵ��
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
     * ��ȡmIsAutoPushTask���Ե�ֵ��
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
     * ����mIsAutoPushTask���Ե�ֵ��
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
     * ��ȡmIsExport���Ե�ֵ��
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
     * ����mIsExport���Ե�ֵ��
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
     * ��ȡmIsModIncomeConfirmRule���Ե�ֵ��
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
     * ����mIsModIncomeConfirmRule���Ե�ֵ��
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
     * ��ȡmIsModIncomeConfirmTerm���Ե�ֵ��
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
     * ����mIsModIncomeConfirmTerm���Ե�ֵ��
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
     * ��ȡmIsNoCheckCredit���Ե�ֵ��
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
     * ����mIsNoCheckCredit���Ե�ֵ��
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
     * ��ȡmIsSaveCheckCredit���Ե�ֵ��
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
     * ����mIsSaveCheckCredit���Ե�ֵ��
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
     * ��ȡmIsSubmitCheckCredit���Ե�ֵ��
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
     * ����mIsSubmitCheckCredit���Ե�ֵ��
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
     * ��ȡmMasterEntity���Ե�ֵ��
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
     * ����mMasterEntity���Ե�ֵ��
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
     * ��ȡmppFlag���Ե�ֵ��
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
     * ����mppFlag���Ե�ֵ��
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
     * ��ȡmPreRecCheckTime���Ե�ֵ��
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
     * ����mPreRecCheckTime���Ե�ֵ��
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
     * ��ȡmPrepayFlag���Ե�ֵ��
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
     * ����mPrepayFlag���Ե�ֵ��
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
     * ��ȡmrpFlag���Ե�ֵ��
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
     * ����mrpFlag���Ե�ֵ��
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
     * ��ȡmReferenceFlag���Ե�ֵ��
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
     * ����mReferenceFlag���Ե�ֵ��
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
     * ��ȡmShipLCCheck���Ե�ֵ��
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
     * ����mShipLCCheck���Ե�ֵ��
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
     * ��ȡmSignInInterval���Ե�ֵ��
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
     * ����mSignInInterval���Ե�ֵ��
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
     * ��ȡmSignInStrategy���Ե�ֵ��
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
     * ����mSignInStrategy���Ե�ֵ��
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
     * ��ȡmTaskUpdShipSign���Ե�ֵ��
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
     * ����mTaskUpdShipSign���Ե�ֵ��
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
