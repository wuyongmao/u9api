
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
 * &lt;p&gt;UFIDA.U9.CBO.SCM.Supplier.SupplierSiteData complex type�� Java �ࡣ
 * 
 * &lt;p&gt;����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="UFIDA.U9.CBO.SCM.Supplier.SupplierSiteData"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://www.UFIDA.org/EntityData}UFSoft.UBF.Business.DataTransObjectBase"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="APConfirmTerm" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="APConfirmTerm_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="BillTo_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="CheckCurrency" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="CheckCurrency_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="DefaultBankAccount_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="DefaultContact" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="DefaultContactPsn_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="DefaultContact_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="HoldReason" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="HoldReason_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Language" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Language_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Multi_Name" type="{UFSoft.UBF.Util.Data}MultiLangDataDict" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="OfficialLocation" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="OfficialLocation_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="PaymentTerm" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="PaymentTerm_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ReceiptRule" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ReceiptRule_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="RegisterLocation" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="RegisterLocation_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ReleaseReason" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ReleaseReason_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="RemitTo_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Supplier_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="TaxSchedule" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="TaxSchedule_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Territory" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Territory_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="TradeCurrency" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="TradeCurrency_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_billTo" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CBO.SCM.Supplier.SupplierSiteData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_createdBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_createdOn" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_defaultBankAccount" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CBO.SCM.Supplier.SupplierBankAccountData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_defaultContactPsn" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CBO.SCM.Supplier.SupplierContactData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_descFlexField" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.Base.FlexField.DescFlexField.DescFlexSegmentsData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_docVerificationOrder" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_effective" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.Base.PropertyTypes.EffectiveData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_holdDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_holdUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_iD" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_invoiceVerificationDetail" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_invoiceVerificationOrder" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isBillTo" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isClaim" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isContrast" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isDefaultBillTo" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isDefaultClaim" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isDefaultContrast" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isDefaultInquire" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isDefaultRemit" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isDefaultShipTo" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isHoldRelease" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isInquire" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isPayItemEditable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isPriceListModify" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isReceiptRuleModify" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isRemit" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isShipTo" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_modifiedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_modifiedOn" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_pledgeCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_pledgeMode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_priceListCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_priceListID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_priceListName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_qualityPledge" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_releaseDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_releaseUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_remitTo" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CBO.SCM.Supplier.SupplierSiteData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_searchCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_srcRowID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_supplier" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CBO.SCM.Supplier.SupplierData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_supplierBankAccount" type="{http://www.UFIDA.org/EntityData}ArrayOfUFIDA.U9.CBO.SCM.Supplier.SupplierBankAccountData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_supplierContacts" type="{http://www.UFIDA.org/EntityData}ArrayOfUFIDA.U9.CBO.SCM.Supplier.SupplierContactData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_sysVersion" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_transitLeadTime" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UFIDA.U9.CBO.SCM.Supplier.SupplierSiteData", propOrder = {
    "apConfirmTerm",
    "apConfirmTermSKey",
    "billToSKey",
    "checkCurrency",
    "checkCurrencySKey",
    "defaultBankAccountSKey",
    "defaultContact",
    "defaultContactPsnSKey",
    "defaultContactSKey",
    "holdReason",
    "holdReasonSKey",
    "language",
    "languageSKey",
    "multiName",
    "name",
    "officialLocation",
    "officialLocationSKey",
    "paymentTerm",
    "paymentTermSKey",
    "receiptRule",
    "receiptRuleSKey",
    "registerLocation",
    "registerLocationSKey",
    "releaseReason",
    "releaseReasonSKey",
    "remitToSKey",
    "supplierSKey",
    "taxSchedule",
    "taxScheduleSKey",
    "territory",
    "territorySKey",
    "tradeCurrency",
    "tradeCurrencySKey",
    "mBillTo",
    "mCode",
    "mCreatedBy",
    "mCreatedOn",
    "mDefaultBankAccount",
    "mDefaultContactPsn",
    "mDescFlexField",
    "mDocVerificationOrder",
    "mEffective",
    "mHoldDate",
    "mHoldUser",
    "mid",
    "mInvoiceVerificationDetail",
    "mInvoiceVerificationOrder",
    "mIsBillTo",
    "mIsClaim",
    "mIsContrast",
    "mIsDefaultBillTo",
    "mIsDefaultClaim",
    "mIsDefaultContrast",
    "mIsDefaultInquire",
    "mIsDefaultRemit",
    "mIsDefaultShipTo",
    "mIsHoldRelease",
    "mIsInquire",
    "mIsPayItemEditable",
    "mIsPriceListModify",
    "mIsReceiptRuleModify",
    "mIsRemit",
    "mIsShipTo",
    "mModifiedBy",
    "mModifiedOn",
    "mPledgeCount",
    "mPledgeMode",
    "mPriceListCode",
    "mPriceListID",
    "mPriceListName",
    "mQualityPledge",
    "mReleaseDate",
    "mReleaseUser",
    "mRemitTo",
    "mSearchCode",
    "mSrcRowID",
    "mSupplier",
    "mSupplierBankAccount",
    "mSupplierContacts",
    "mSysVersion",
    "mTransitLeadTime"
})
public class UFIDAU9CBOSCMSupplierSupplierSiteData
    extends UFSoftUBFBusinessDataTransObjectBase
{

    @XmlElement(name = "APConfirmTerm")
    protected Long apConfirmTerm;
    @XmlElementRef(name = "APConfirmTerm_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> apConfirmTermSKey;
    @XmlElementRef(name = "BillTo_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> billToSKey;
    @XmlElement(name = "CheckCurrency")
    protected Long checkCurrency;
    @XmlElementRef(name = "CheckCurrency_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> checkCurrencySKey;
    @XmlElementRef(name = "DefaultBankAccount_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> defaultBankAccountSKey;
    @XmlElement(name = "DefaultContact")
    protected Long defaultContact;
    @XmlElementRef(name = "DefaultContactPsn_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> defaultContactPsnSKey;
    @XmlElementRef(name = "DefaultContact_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> defaultContactSKey;
    @XmlElement(name = "HoldReason")
    protected Long holdReason;
    @XmlElementRef(name = "HoldReason_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> holdReasonSKey;
    @XmlElement(name = "Language")
    protected Long language;
    @XmlElementRef(name = "Language_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> languageSKey;
    @XmlElementRef(name = "Multi_Name", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<MultiLangDataDict> multiName;
    @XmlElementRef(name = "Name", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> name;
    @XmlElement(name = "OfficialLocation")
    protected Long officialLocation;
    @XmlElementRef(name = "OfficialLocation_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> officialLocationSKey;
    @XmlElement(name = "PaymentTerm")
    protected Long paymentTerm;
    @XmlElementRef(name = "PaymentTerm_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> paymentTermSKey;
    @XmlElement(name = "ReceiptRule")
    protected Long receiptRule;
    @XmlElementRef(name = "ReceiptRule_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> receiptRuleSKey;
    @XmlElement(name = "RegisterLocation")
    protected Long registerLocation;
    @XmlElementRef(name = "RegisterLocation_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> registerLocationSKey;
    @XmlElement(name = "ReleaseReason")
    protected Long releaseReason;
    @XmlElementRef(name = "ReleaseReason_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> releaseReasonSKey;
    @XmlElementRef(name = "RemitTo_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> remitToSKey;
    @XmlElementRef(name = "Supplier_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> supplierSKey;
    @XmlElement(name = "TaxSchedule")
    protected Long taxSchedule;
    @XmlElementRef(name = "TaxSchedule_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> taxScheduleSKey;
    @XmlElement(name = "Territory")
    protected Long territory;
    @XmlElementRef(name = "Territory_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> territorySKey;
    @XmlElement(name = "TradeCurrency")
    protected Long tradeCurrency;
    @XmlElementRef(name = "TradeCurrency_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> tradeCurrencySKey;
    @XmlElementRef(name = "m_billTo", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9CBOSCMSupplierSupplierSiteData> mBillTo;
    @XmlElementRef(name = "m_code", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mCode;
    @XmlElementRef(name = "m_createdBy", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mCreatedBy;
    @XmlElement(name = "m_createdOn")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mCreatedOn;
    @XmlElementRef(name = "m_defaultBankAccount", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9CBOSCMSupplierSupplierBankAccountData> mDefaultBankAccount;
    @XmlElementRef(name = "m_defaultContactPsn", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9CBOSCMSupplierSupplierContactData> mDefaultContactPsn;
    @XmlElementRef(name = "m_descFlexField", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9BaseFlexFieldDescFlexFieldDescFlexSegmentsData> mDescFlexField;
    @XmlElement(name = "m_docVerificationOrder")
    protected Integer mDocVerificationOrder;
    @XmlElementRef(name = "m_effective", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9BasePropertyTypesEffectiveData> mEffective;
    @XmlElement(name = "m_holdDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mHoldDate;
    @XmlElementRef(name = "m_holdUser", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mHoldUser;
    @XmlElement(name = "m_iD")
    protected Long mid;
    @XmlElement(name = "m_invoiceVerificationDetail")
    protected Integer mInvoiceVerificationDetail;
    @XmlElement(name = "m_invoiceVerificationOrder")
    protected Integer mInvoiceVerificationOrder;
    @XmlElement(name = "m_isBillTo")
    protected Boolean mIsBillTo;
    @XmlElement(name = "m_isClaim")
    protected Boolean mIsClaim;
    @XmlElement(name = "m_isContrast")
    protected Boolean mIsContrast;
    @XmlElement(name = "m_isDefaultBillTo")
    protected Boolean mIsDefaultBillTo;
    @XmlElement(name = "m_isDefaultClaim")
    protected Boolean mIsDefaultClaim;
    @XmlElement(name = "m_isDefaultContrast")
    protected Boolean mIsDefaultContrast;
    @XmlElement(name = "m_isDefaultInquire")
    protected Boolean mIsDefaultInquire;
    @XmlElement(name = "m_isDefaultRemit")
    protected Boolean mIsDefaultRemit;
    @XmlElement(name = "m_isDefaultShipTo")
    protected Boolean mIsDefaultShipTo;
    @XmlElement(name = "m_isHoldRelease")
    protected Boolean mIsHoldRelease;
    @XmlElement(name = "m_isInquire")
    protected Boolean mIsInquire;
    @XmlElement(name = "m_isPayItemEditable")
    protected Boolean mIsPayItemEditable;
    @XmlElement(name = "m_isPriceListModify")
    protected Boolean mIsPriceListModify;
    @XmlElement(name = "m_isReceiptRuleModify")
    protected Boolean mIsReceiptRuleModify;
    @XmlElement(name = "m_isRemit")
    protected Boolean mIsRemit;
    @XmlElement(name = "m_isShipTo")
    protected Boolean mIsShipTo;
    @XmlElementRef(name = "m_modifiedBy", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mModifiedBy;
    @XmlElement(name = "m_modifiedOn")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mModifiedOn;
    @XmlElement(name = "m_pledgeCount")
    protected Integer mPledgeCount;
    @XmlElement(name = "m_pledgeMode")
    protected Integer mPledgeMode;
    @XmlElementRef(name = "m_priceListCode", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mPriceListCode;
    @XmlElement(name = "m_priceListID")
    protected Long mPriceListID;
    @XmlElementRef(name = "m_priceListName", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mPriceListName;
    @XmlElement(name = "m_qualityPledge")
    protected Integer mQualityPledge;
    @XmlElement(name = "m_releaseDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mReleaseDate;
    @XmlElementRef(name = "m_releaseUser", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mReleaseUser;
    @XmlElementRef(name = "m_remitTo", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9CBOSCMSupplierSupplierSiteData> mRemitTo;
    @XmlElementRef(name = "m_searchCode", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mSearchCode;
    @XmlElement(name = "m_srcRowID")
    protected Long mSrcRowID;
    @XmlElementRef(name = "m_supplier", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9CBOSCMSupplierSupplierData> mSupplier;
    @XmlElementRef(name = "m_supplierBankAccount", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfUFIDAU9CBOSCMSupplierSupplierBankAccountData> mSupplierBankAccount;
    @XmlElementRef(name = "m_supplierContacts", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfUFIDAU9CBOSCMSupplierSupplierContactData> mSupplierContacts;
    @XmlElement(name = "m_sysVersion")
    protected Long mSysVersion;
    @XmlElement(name = "m_transitLeadTime")
    protected Integer mTransitLeadTime;

    /**
     * ��ȡapConfirmTerm���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAPConfirmTerm() {
        return apConfirmTerm;
    }

    /**
     * ����apConfirmTerm���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAPConfirmTerm(Long value) {
        this.apConfirmTerm = value;
    }

    /**
     * ��ȡapConfirmTermSKey���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getAPConfirmTermSKey() {
        return apConfirmTermSKey;
    }

    /**
     * ����apConfirmTermSKey���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setAPConfirmTermSKey(JAXBElement<EntityKey> value) {
        this.apConfirmTermSKey = value;
    }

    /**
     * ��ȡbillToSKey���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getBillToSKey() {
        return billToSKey;
    }

    /**
     * ����billToSKey���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setBillToSKey(JAXBElement<EntityKey> value) {
        this.billToSKey = value;
    }

    /**
     * ��ȡcheckCurrency���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCheckCurrency() {
        return checkCurrency;
    }

    /**
     * ����checkCurrency���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCheckCurrency(Long value) {
        this.checkCurrency = value;
    }

    /**
     * ��ȡcheckCurrencySKey���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getCheckCurrencySKey() {
        return checkCurrencySKey;
    }

    /**
     * ����checkCurrencySKey���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setCheckCurrencySKey(JAXBElement<EntityKey> value) {
        this.checkCurrencySKey = value;
    }

    /**
     * ��ȡdefaultBankAccountSKey���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getDefaultBankAccountSKey() {
        return defaultBankAccountSKey;
    }

    /**
     * ����defaultBankAccountSKey���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setDefaultBankAccountSKey(JAXBElement<EntityKey> value) {
        this.defaultBankAccountSKey = value;
    }

    /**
     * ��ȡdefaultContact���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDefaultContact() {
        return defaultContact;
    }

    /**
     * ����defaultContact���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDefaultContact(Long value) {
        this.defaultContact = value;
    }

    /**
     * ��ȡdefaultContactPsnSKey���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getDefaultContactPsnSKey() {
        return defaultContactPsnSKey;
    }

    /**
     * ����defaultContactPsnSKey���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setDefaultContactPsnSKey(JAXBElement<EntityKey> value) {
        this.defaultContactPsnSKey = value;
    }

    /**
     * ��ȡdefaultContactSKey���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getDefaultContactSKey() {
        return defaultContactSKey;
    }

    /**
     * ����defaultContactSKey���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setDefaultContactSKey(JAXBElement<EntityKey> value) {
        this.defaultContactSKey = value;
    }

    /**
     * ��ȡholdReason���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getHoldReason() {
        return holdReason;
    }

    /**
     * ����holdReason���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setHoldReason(Long value) {
        this.holdReason = value;
    }

    /**
     * ��ȡholdReasonSKey���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getHoldReasonSKey() {
        return holdReasonSKey;
    }

    /**
     * ����holdReasonSKey���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setHoldReasonSKey(JAXBElement<EntityKey> value) {
        this.holdReasonSKey = value;
    }

    /**
     * ��ȡlanguage���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getLanguage() {
        return language;
    }

    /**
     * ����language���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setLanguage(Long value) {
        this.language = value;
    }

    /**
     * ��ȡlanguageSKey���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getLanguageSKey() {
        return languageSKey;
    }

    /**
     * ����languageSKey���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setLanguageSKey(JAXBElement<EntityKey> value) {
        this.languageSKey = value;
    }

    /**
     * ��ȡmultiName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MultiLangDataDict }{@code >}
     *     
     */
    public JAXBElement<MultiLangDataDict> getMultiName() {
        return multiName;
    }

    /**
     * ����multiName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MultiLangDataDict }{@code >}
     *     
     */
    public void setMultiName(JAXBElement<MultiLangDataDict> value) {
        this.multiName = value;
    }

    /**
     * ��ȡname���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getName() {
        return name;
    }

    /**
     * ����name���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setName(JAXBElement<String> value) {
        this.name = value;
    }

    /**
     * ��ȡofficialLocation���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOfficialLocation() {
        return officialLocation;
    }

    /**
     * ����officialLocation���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOfficialLocation(Long value) {
        this.officialLocation = value;
    }

    /**
     * ��ȡofficialLocationSKey���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getOfficialLocationSKey() {
        return officialLocationSKey;
    }

    /**
     * ����officialLocationSKey���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setOfficialLocationSKey(JAXBElement<EntityKey> value) {
        this.officialLocationSKey = value;
    }

    /**
     * ��ȡpaymentTerm���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPaymentTerm() {
        return paymentTerm;
    }

    /**
     * ����paymentTerm���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPaymentTerm(Long value) {
        this.paymentTerm = value;
    }

    /**
     * ��ȡpaymentTermSKey���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getPaymentTermSKey() {
        return paymentTermSKey;
    }

    /**
     * ����paymentTermSKey���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setPaymentTermSKey(JAXBElement<EntityKey> value) {
        this.paymentTermSKey = value;
    }

    /**
     * ��ȡreceiptRule���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getReceiptRule() {
        return receiptRule;
    }

    /**
     * ����receiptRule���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setReceiptRule(Long value) {
        this.receiptRule = value;
    }

    /**
     * ��ȡreceiptRuleSKey���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getReceiptRuleSKey() {
        return receiptRuleSKey;
    }

    /**
     * ����receiptRuleSKey���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setReceiptRuleSKey(JAXBElement<EntityKey> value) {
        this.receiptRuleSKey = value;
    }

    /**
     * ��ȡregisterLocation���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRegisterLocation() {
        return registerLocation;
    }

    /**
     * ����registerLocation���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRegisterLocation(Long value) {
        this.registerLocation = value;
    }

    /**
     * ��ȡregisterLocationSKey���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getRegisterLocationSKey() {
        return registerLocationSKey;
    }

    /**
     * ����registerLocationSKey���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setRegisterLocationSKey(JAXBElement<EntityKey> value) {
        this.registerLocationSKey = value;
    }

    /**
     * ��ȡreleaseReason���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getReleaseReason() {
        return releaseReason;
    }

    /**
     * ����releaseReason���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setReleaseReason(Long value) {
        this.releaseReason = value;
    }

    /**
     * ��ȡreleaseReasonSKey���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getReleaseReasonSKey() {
        return releaseReasonSKey;
    }

    /**
     * ����releaseReasonSKey���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setReleaseReasonSKey(JAXBElement<EntityKey> value) {
        this.releaseReasonSKey = value;
    }

    /**
     * ��ȡremitToSKey���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getRemitToSKey() {
        return remitToSKey;
    }

    /**
     * ����remitToSKey���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setRemitToSKey(JAXBElement<EntityKey> value) {
        this.remitToSKey = value;
    }

    /**
     * ��ȡsupplierSKey���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getSupplierSKey() {
        return supplierSKey;
    }

    /**
     * ����supplierSKey���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setSupplierSKey(JAXBElement<EntityKey> value) {
        this.supplierSKey = value;
    }

    /**
     * ��ȡtaxSchedule���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTaxSchedule() {
        return taxSchedule;
    }

    /**
     * ����taxSchedule���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTaxSchedule(Long value) {
        this.taxSchedule = value;
    }

    /**
     * ��ȡtaxScheduleSKey���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getTaxScheduleSKey() {
        return taxScheduleSKey;
    }

    /**
     * ����taxScheduleSKey���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setTaxScheduleSKey(JAXBElement<EntityKey> value) {
        this.taxScheduleSKey = value;
    }

    /**
     * ��ȡterritory���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTerritory() {
        return territory;
    }

    /**
     * ����territory���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTerritory(Long value) {
        this.territory = value;
    }

    /**
     * ��ȡterritorySKey���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getTerritorySKey() {
        return territorySKey;
    }

    /**
     * ����territorySKey���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setTerritorySKey(JAXBElement<EntityKey> value) {
        this.territorySKey = value;
    }

    /**
     * ��ȡtradeCurrency���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTradeCurrency() {
        return tradeCurrency;
    }

    /**
     * ����tradeCurrency���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTradeCurrency(Long value) {
        this.tradeCurrency = value;
    }

    /**
     * ��ȡtradeCurrencySKey���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getTradeCurrencySKey() {
        return tradeCurrencySKey;
    }

    /**
     * ����tradeCurrencySKey���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setTradeCurrencySKey(JAXBElement<EntityKey> value) {
        this.tradeCurrencySKey = value;
    }

    /**
     * ��ȡmBillTo���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOSCMSupplierSupplierSiteData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9CBOSCMSupplierSupplierSiteData> getMBillTo() {
        return mBillTo;
    }

    /**
     * ����mBillTo���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOSCMSupplierSupplierSiteData }{@code >}
     *     
     */
    public void setMBillTo(JAXBElement<UFIDAU9CBOSCMSupplierSupplierSiteData> value) {
        this.mBillTo = value;
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
     * ��ȡmDefaultBankAccount���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOSCMSupplierSupplierBankAccountData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9CBOSCMSupplierSupplierBankAccountData> getMDefaultBankAccount() {
        return mDefaultBankAccount;
    }

    /**
     * ����mDefaultBankAccount���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOSCMSupplierSupplierBankAccountData }{@code >}
     *     
     */
    public void setMDefaultBankAccount(JAXBElement<UFIDAU9CBOSCMSupplierSupplierBankAccountData> value) {
        this.mDefaultBankAccount = value;
    }

    /**
     * ��ȡmDefaultContactPsn���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOSCMSupplierSupplierContactData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9CBOSCMSupplierSupplierContactData> getMDefaultContactPsn() {
        return mDefaultContactPsn;
    }

    /**
     * ����mDefaultContactPsn���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOSCMSupplierSupplierContactData }{@code >}
     *     
     */
    public void setMDefaultContactPsn(JAXBElement<UFIDAU9CBOSCMSupplierSupplierContactData> value) {
        this.mDefaultContactPsn = value;
    }

    /**
     * ��ȡmDescFlexField���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9BaseFlexFieldDescFlexFieldDescFlexSegmentsData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9BaseFlexFieldDescFlexFieldDescFlexSegmentsData> getMDescFlexField() {
        return mDescFlexField;
    }

    /**
     * ����mDescFlexField���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9BaseFlexFieldDescFlexFieldDescFlexSegmentsData }{@code >}
     *     
     */
    public void setMDescFlexField(JAXBElement<UFIDAU9BaseFlexFieldDescFlexFieldDescFlexSegmentsData> value) {
        this.mDescFlexField = value;
    }

    /**
     * ��ȡmDocVerificationOrder���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMDocVerificationOrder() {
        return mDocVerificationOrder;
    }

    /**
     * ����mDocVerificationOrder���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMDocVerificationOrder(Integer value) {
        this.mDocVerificationOrder = value;
    }

    /**
     * ��ȡmEffective���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9BasePropertyTypesEffectiveData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9BasePropertyTypesEffectiveData> getMEffective() {
        return mEffective;
    }

    /**
     * ����mEffective���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9BasePropertyTypesEffectiveData }{@code >}
     *     
     */
    public void setMEffective(JAXBElement<UFIDAU9BasePropertyTypesEffectiveData> value) {
        this.mEffective = value;
    }

    /**
     * ��ȡmHoldDate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMHoldDate() {
        return mHoldDate;
    }

    /**
     * ����mHoldDate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMHoldDate(XMLGregorianCalendar value) {
        this.mHoldDate = value;
    }

    /**
     * ��ȡmHoldUser���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMHoldUser() {
        return mHoldUser;
    }

    /**
     * ����mHoldUser���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMHoldUser(JAXBElement<String> value) {
        this.mHoldUser = value;
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
     * ��ȡmInvoiceVerificationDetail���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMInvoiceVerificationDetail() {
        return mInvoiceVerificationDetail;
    }

    /**
     * ����mInvoiceVerificationDetail���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMInvoiceVerificationDetail(Integer value) {
        this.mInvoiceVerificationDetail = value;
    }

    /**
     * ��ȡmInvoiceVerificationOrder���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMInvoiceVerificationOrder() {
        return mInvoiceVerificationOrder;
    }

    /**
     * ����mInvoiceVerificationOrder���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMInvoiceVerificationOrder(Integer value) {
        this.mInvoiceVerificationOrder = value;
    }

    /**
     * ��ȡmIsBillTo���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsBillTo() {
        return mIsBillTo;
    }

    /**
     * ����mIsBillTo���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsBillTo(Boolean value) {
        this.mIsBillTo = value;
    }

    /**
     * ��ȡmIsClaim���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsClaim() {
        return mIsClaim;
    }

    /**
     * ����mIsClaim���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsClaim(Boolean value) {
        this.mIsClaim = value;
    }

    /**
     * ��ȡmIsContrast���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsContrast() {
        return mIsContrast;
    }

    /**
     * ����mIsContrast���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsContrast(Boolean value) {
        this.mIsContrast = value;
    }

    /**
     * ��ȡmIsDefaultBillTo���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsDefaultBillTo() {
        return mIsDefaultBillTo;
    }

    /**
     * ����mIsDefaultBillTo���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsDefaultBillTo(Boolean value) {
        this.mIsDefaultBillTo = value;
    }

    /**
     * ��ȡmIsDefaultClaim���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsDefaultClaim() {
        return mIsDefaultClaim;
    }

    /**
     * ����mIsDefaultClaim���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsDefaultClaim(Boolean value) {
        this.mIsDefaultClaim = value;
    }

    /**
     * ��ȡmIsDefaultContrast���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsDefaultContrast() {
        return mIsDefaultContrast;
    }

    /**
     * ����mIsDefaultContrast���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsDefaultContrast(Boolean value) {
        this.mIsDefaultContrast = value;
    }

    /**
     * ��ȡmIsDefaultInquire���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsDefaultInquire() {
        return mIsDefaultInquire;
    }

    /**
     * ����mIsDefaultInquire���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsDefaultInquire(Boolean value) {
        this.mIsDefaultInquire = value;
    }

    /**
     * ��ȡmIsDefaultRemit���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsDefaultRemit() {
        return mIsDefaultRemit;
    }

    /**
     * ����mIsDefaultRemit���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsDefaultRemit(Boolean value) {
        this.mIsDefaultRemit = value;
    }

    /**
     * ��ȡmIsDefaultShipTo���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsDefaultShipTo() {
        return mIsDefaultShipTo;
    }

    /**
     * ����mIsDefaultShipTo���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsDefaultShipTo(Boolean value) {
        this.mIsDefaultShipTo = value;
    }

    /**
     * ��ȡmIsHoldRelease���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsHoldRelease() {
        return mIsHoldRelease;
    }

    /**
     * ����mIsHoldRelease���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsHoldRelease(Boolean value) {
        this.mIsHoldRelease = value;
    }

    /**
     * ��ȡmIsInquire���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsInquire() {
        return mIsInquire;
    }

    /**
     * ����mIsInquire���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsInquire(Boolean value) {
        this.mIsInquire = value;
    }

    /**
     * ��ȡmIsPayItemEditable���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsPayItemEditable() {
        return mIsPayItemEditable;
    }

    /**
     * ����mIsPayItemEditable���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsPayItemEditable(Boolean value) {
        this.mIsPayItemEditable = value;
    }

    /**
     * ��ȡmIsPriceListModify���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsPriceListModify() {
        return mIsPriceListModify;
    }

    /**
     * ����mIsPriceListModify���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsPriceListModify(Boolean value) {
        this.mIsPriceListModify = value;
    }

    /**
     * ��ȡmIsReceiptRuleModify���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsReceiptRuleModify() {
        return mIsReceiptRuleModify;
    }

    /**
     * ����mIsReceiptRuleModify���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsReceiptRuleModify(Boolean value) {
        this.mIsReceiptRuleModify = value;
    }

    /**
     * ��ȡmIsRemit���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsRemit() {
        return mIsRemit;
    }

    /**
     * ����mIsRemit���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsRemit(Boolean value) {
        this.mIsRemit = value;
    }

    /**
     * ��ȡmIsShipTo���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsShipTo() {
        return mIsShipTo;
    }

    /**
     * ����mIsShipTo���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsShipTo(Boolean value) {
        this.mIsShipTo = value;
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
     * ��ȡmPledgeCount���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMPledgeCount() {
        return mPledgeCount;
    }

    /**
     * ����mPledgeCount���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMPledgeCount(Integer value) {
        this.mPledgeCount = value;
    }

    /**
     * ��ȡmPledgeMode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMPledgeMode() {
        return mPledgeMode;
    }

    /**
     * ����mPledgeMode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMPledgeMode(Integer value) {
        this.mPledgeMode = value;
    }

    /**
     * ��ȡmPriceListCode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMPriceListCode() {
        return mPriceListCode;
    }

    /**
     * ����mPriceListCode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMPriceListCode(JAXBElement<String> value) {
        this.mPriceListCode = value;
    }

    /**
     * ��ȡmPriceListID���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMPriceListID() {
        return mPriceListID;
    }

    /**
     * ����mPriceListID���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMPriceListID(Long value) {
        this.mPriceListID = value;
    }

    /**
     * ��ȡmPriceListName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMPriceListName() {
        return mPriceListName;
    }

    /**
     * ����mPriceListName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMPriceListName(JAXBElement<String> value) {
        this.mPriceListName = value;
    }

    /**
     * ��ȡmQualityPledge���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMQualityPledge() {
        return mQualityPledge;
    }

    /**
     * ����mQualityPledge���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMQualityPledge(Integer value) {
        this.mQualityPledge = value;
    }

    /**
     * ��ȡmReleaseDate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMReleaseDate() {
        return mReleaseDate;
    }

    /**
     * ����mReleaseDate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMReleaseDate(XMLGregorianCalendar value) {
        this.mReleaseDate = value;
    }

    /**
     * ��ȡmReleaseUser���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMReleaseUser() {
        return mReleaseUser;
    }

    /**
     * ����mReleaseUser���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMReleaseUser(JAXBElement<String> value) {
        this.mReleaseUser = value;
    }

    /**
     * ��ȡmRemitTo���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOSCMSupplierSupplierSiteData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9CBOSCMSupplierSupplierSiteData> getMRemitTo() {
        return mRemitTo;
    }

    /**
     * ����mRemitTo���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOSCMSupplierSupplierSiteData }{@code >}
     *     
     */
    public void setMRemitTo(JAXBElement<UFIDAU9CBOSCMSupplierSupplierSiteData> value) {
        this.mRemitTo = value;
    }

    /**
     * ��ȡmSearchCode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMSearchCode() {
        return mSearchCode;
    }

    /**
     * ����mSearchCode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMSearchCode(JAXBElement<String> value) {
        this.mSearchCode = value;
    }

    /**
     * ��ȡmSrcRowID���Ե�ֵ��
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
     * ����mSrcRowID���Ե�ֵ��
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
     * ��ȡmSupplier���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOSCMSupplierSupplierData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9CBOSCMSupplierSupplierData> getMSupplier() {
        return mSupplier;
    }

    /**
     * ����mSupplier���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOSCMSupplierSupplierData }{@code >}
     *     
     */
    public void setMSupplier(JAXBElement<UFIDAU9CBOSCMSupplierSupplierData> value) {
        this.mSupplier = value;
    }

    /**
     * ��ȡmSupplierBankAccount���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUFIDAU9CBOSCMSupplierSupplierBankAccountData }{@code >}
     *     
     */
    public JAXBElement<ArrayOfUFIDAU9CBOSCMSupplierSupplierBankAccountData> getMSupplierBankAccount() {
        return mSupplierBankAccount;
    }

    /**
     * ����mSupplierBankAccount���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUFIDAU9CBOSCMSupplierSupplierBankAccountData }{@code >}
     *     
     */
    public void setMSupplierBankAccount(JAXBElement<ArrayOfUFIDAU9CBOSCMSupplierSupplierBankAccountData> value) {
        this.mSupplierBankAccount = value;
    }

    /**
     * ��ȡmSupplierContacts���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUFIDAU9CBOSCMSupplierSupplierContactData }{@code >}
     *     
     */
    public JAXBElement<ArrayOfUFIDAU9CBOSCMSupplierSupplierContactData> getMSupplierContacts() {
        return mSupplierContacts;
    }

    /**
     * ����mSupplierContacts���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUFIDAU9CBOSCMSupplierSupplierContactData }{@code >}
     *     
     */
    public void setMSupplierContacts(JAXBElement<ArrayOfUFIDAU9CBOSCMSupplierSupplierContactData> value) {
        this.mSupplierContacts = value;
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
     * ��ȡmTransitLeadTime���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMTransitLeadTime() {
        return mTransitLeadTime;
    }

    /**
     * ����mTransitLeadTime���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMTransitLeadTime(Integer value) {
        this.mTransitLeadTime = value;
    }

}
