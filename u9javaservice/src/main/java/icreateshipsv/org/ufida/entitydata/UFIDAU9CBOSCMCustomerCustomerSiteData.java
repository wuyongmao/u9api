
package icreateshipsv.org.ufida.entitydata;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

import icreateshipsv.businessentity.business.ubf.ufsoft.EntityKey;
import icreateshipsv.data.util.ubf.ufsoft.MultiLangDataDict;


/**
 * &lt;p&gt;UFIDA.U9.CBO.SCM.Customer.CustomerSiteData complex type�� Java �ࡣ
 * 
 * &lt;p&gt;����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="UFIDA.U9.CBO.SCM.Customer.CustomerSiteData"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://www.UFIDA.org/EntityData}UFSoft.UBF.Business.DataTransObjectBase"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="ARConfirmTerm" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ARConfirmTerm_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="BankStatementFormat" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="BankStatementFormat_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="BillToSite_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="BusinessBillStyle" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="BusinessBillStyle_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="BuyerBankAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="BuyerBankAccountCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="BuyerNoteName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Carrier" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Carrier_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="CheckTakerMail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="CheckTakerPhoneNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Customer_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="DefaultBankAccount_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="DefaultContact" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="DefaultContactPsn_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="DefaultContact_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="DistrictTaxNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="HoldReason" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="HoldReason_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Language" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Language_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Multi_BuyerBankAccount" type="{UFSoft.UBF.Util.Data}MultiLangDataDict" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Multi_BuyerBankAccountCode" type="{UFSoft.UBF.Util.Data}MultiLangDataDict" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Multi_BuyerNoteName" type="{UFSoft.UBF.Util.Data}MultiLangDataDict" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Multi_CheckTakerMail" type="{UFSoft.UBF.Util.Data}MultiLangDataDict" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Multi_CheckTakerPhoneNo" type="{UFSoft.UBF.Util.Data}MultiLangDataDict" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Multi_DistrictTaxNo" type="{UFSoft.UBF.Util.Data}MultiLangDataDict" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Multi_Name" type="{UFSoft.UBF.Util.Data}MultiLangDataDict" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Multi_StateTaxNo" type="{UFSoft.UBF.Util.Data}MultiLangDataDict" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Multi_TradeRule" type="{UFSoft.UBF.Util.Data}MultiLangDataDict" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="OfficeSite" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="OfficeSite_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Payee" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Payee_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="PaymentCurrency" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="PaymentCurrency_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="PaymentTerm" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="PaymentTerm_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="PressPaymentStyle" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="PressPaymentStyle_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="RegisterAddress" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="RegisterAddress_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ReleaseReason" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ReleaseReason_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="SaleOrderStyle" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="SaleOrderStyle_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ShippmentRule" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ShippmentRule_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="StateTaxNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Supplier" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Supplier_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="SupplyOrg" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="SupplyOrg_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="TaxSchedule" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="TaxSchedule_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Territory" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Territory_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="TradeCurrency" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="TradeCurrency_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="TradeRule" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="TransitMode" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="TransitMode_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="WH" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="WH_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_bankCheckPeriod" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_billToDisableDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_billToSite" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CBO.SCM.Customer.CustomerSiteData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_claimDisableDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_contrastDisableDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_controlPDiff" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_controlPoint" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_createdBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_createdOn" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_creditLevel1" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_creditLevel1Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_creditLevel1Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_creditLevel2" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_creditLevel2Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_creditLevel2Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_creditPolicy" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_creditPolicyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_creditPolicyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_customer" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CBO.SCM.Customer.CustomerData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_customerBankAccount" type="{http://www.UFIDA.org/EntityData}ArrayOfUFIDA.U9.CBO.SCM.Customer.CustomerBankAccountData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_customerContacts" type="{http://www.UFIDA.org/EntityData}ArrayOfUFIDA.U9.CBO.SCM.Customer.CustomerContactData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_customerState" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_defaultBankAccount" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CBO.SCM.Customer.CustomerBankAccountData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_defaultContactPsn" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CBO.SCM.Customer.CustomerContactData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_demandTransType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_descFlexField" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.Base.FlexField.DescFlexField.DescFlexSegmentsData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_effective" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.Base.PropertyTypes.EffectiveData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_holdDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_holdUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_iD" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isBillTo" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isClaim" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isContrast" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isDefaultBillTo" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isDefaultClaim" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isDefaultContrast" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isDefaultPayment" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isDefaultShipTo" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isHoldRelease" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isPayment" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isPaymentTermEditable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isPostBankCheckList" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isPrePayment" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isPriceListModify" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isSalesDiscount" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isShipTo" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isShippmentRuleEditable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_latelyPrintDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_modifiedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_modifiedOn" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_needDeposit" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_nextPrintDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_officeDisableDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_paymentDisableDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_priceListID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_priceListName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_qualityGuaranteeType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_registerDisableDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_releaseDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_releaseUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_searchCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_shipmentMode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_shippingHavenCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_shippingHavenID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_shippingHavenName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_shiptoDisableDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_srcRowID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_supplySource" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_sysVersion" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_targetHavenCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_targetHavenID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_targetHavenName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_transitLeadTime" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_verificationMode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UFIDA.U9.CBO.SCM.Customer.CustomerSiteData", propOrder = {
    "arConfirmTerm",
    "arConfirmTermSKey",
    "bankStatementFormat",
    "bankStatementFormatSKey",
    "billToSiteSKey",
    "businessBillStyle",
    "businessBillStyleSKey",
    "buyerBankAccount",
    "buyerBankAccountCode",
    "buyerNoteName",
    "carrier",
    "carrierSKey",
    "checkTakerMail",
    "checkTakerPhoneNo",
    "customerSKey",
    "defaultBankAccountSKey",
    "defaultContact",
    "defaultContactPsnSKey",
    "defaultContactSKey",
    "districtTaxNo",
    "holdReason",
    "holdReasonSKey",
    "language",
    "languageSKey",
    "multiBuyerBankAccount",
    "multiBuyerBankAccountCode",
    "multiBuyerNoteName",
    "multiCheckTakerMail",
    "multiCheckTakerPhoneNo",
    "multiDistrictTaxNo",
    "multiName",
    "multiStateTaxNo",
    "multiTradeRule",
    "name",
    "officeSite",
    "officeSiteSKey",
    "payee",
    "payeeSKey",
    "paymentCurrency",
    "paymentCurrencySKey",
    "paymentTerm",
    "paymentTermSKey",
    "pressPaymentStyle",
    "pressPaymentStyleSKey",
    "registerAddress",
    "registerAddressSKey",
    "releaseReason",
    "releaseReasonSKey",
    "saleOrderStyle",
    "saleOrderStyleSKey",
    "shippmentRule",
    "shippmentRuleSKey",
    "stateTaxNo",
    "supplier",
    "supplierSKey",
    "supplyOrg",
    "supplyOrgSKey",
    "taxSchedule",
    "taxScheduleSKey",
    "territory",
    "territorySKey",
    "tradeCurrency",
    "tradeCurrencySKey",
    "tradeRule",
    "transitMode",
    "transitModeSKey",
    "wh",
    "whsKey",
    "mBankCheckPeriod",
    "mBillToDisableDate",
    "mBillToSite",
    "mClaimDisableDate",
    "mCode",
    "mContrastDisableDate",
    "mControlPDiff",
    "mControlPoint",
    "mCreatedBy",
    "mCreatedOn",
    "mCreditLevel1",
    "mCreditLevel1Code",
    "mCreditLevel1Name",
    "mCreditLevel2",
    "mCreditLevel2Code",
    "mCreditLevel2Name",
    "mCreditPolicy",
    "mCreditPolicyCode",
    "mCreditPolicyName",
    "mCustomer",
    "mCustomerBankAccount",
    "mCustomerContacts",
    "mCustomerState",
    "mDefaultBankAccount",
    "mDefaultContactPsn",
    "mDemandTransType",
    "mDescFlexField",
    "mEffective",
    "mHoldDate",
    "mHoldUser",
    "mid",
    "mIsBillTo",
    "mIsClaim",
    "mIsContrast",
    "mIsDefaultBillTo",
    "mIsDefaultClaim",
    "mIsDefaultContrast",
    "mIsDefaultPayment",
    "mIsDefaultShipTo",
    "mIsHoldRelease",
    "mIsPayment",
    "mIsPaymentTermEditable",
    "mIsPostBankCheckList",
    "mIsPrePayment",
    "mIsPriceListModify",
    "mIsSalesDiscount",
    "mIsShipTo",
    "mIsShippmentRuleEditable",
    "mLatelyPrintDate",
    "mModifiedBy",
    "mModifiedOn",
    "mNeedDeposit",
    "mNextPrintDate",
    "mOfficeDisableDate",
    "mPaymentDisableDate",
    "mPriceListID",
    "mPriceListName",
    "mQualityGuaranteeType",
    "mRegisterDisableDate",
    "mReleaseDate",
    "mReleaseUser",
    "mSearchCode",
    "mShipmentMode",
    "mShippingHavenCode",
    "mShippingHavenID",
    "mShippingHavenName",
    "mShiptoDisableDate",
    "mSrcRowID",
    "mSupplySource",
    "mSysVersion",
    "mTargetHavenCode",
    "mTargetHavenID",
    "mTargetHavenName",
    "mTransitLeadTime",
    "mVerificationMode"
})
public class UFIDAU9CBOSCMCustomerCustomerSiteData
    extends UFSoftUBFBusinessDataTransObjectBase
{

    @XmlElement(name = "ARConfirmTerm")
    protected Long arConfirmTerm;
    @XmlElementRef(name = "ARConfirmTerm_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> arConfirmTermSKey;
    @XmlElement(name = "BankStatementFormat")
    protected Long bankStatementFormat;
    @XmlElementRef(name = "BankStatementFormat_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> bankStatementFormatSKey;
    @XmlElementRef(name = "BillToSite_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> billToSiteSKey;
    @XmlElement(name = "BusinessBillStyle")
    protected Long businessBillStyle;
    @XmlElementRef(name = "BusinessBillStyle_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> businessBillStyleSKey;
    @XmlElementRef(name = "BuyerBankAccount", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> buyerBankAccount;
    @XmlElementRef(name = "BuyerBankAccountCode", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> buyerBankAccountCode;
    @XmlElementRef(name = "BuyerNoteName", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> buyerNoteName;
    @XmlElement(name = "Carrier")
    protected Long carrier;
    @XmlElementRef(name = "Carrier_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> carrierSKey;
    @XmlElementRef(name = "CheckTakerMail", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> checkTakerMail;
    @XmlElementRef(name = "CheckTakerPhoneNo", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> checkTakerPhoneNo;
    @XmlElementRef(name = "Customer_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> customerSKey;
    @XmlElementRef(name = "DefaultBankAccount_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> defaultBankAccountSKey;
    @XmlElement(name = "DefaultContact")
    protected Long defaultContact;
    @XmlElementRef(name = "DefaultContactPsn_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> defaultContactPsnSKey;
    @XmlElementRef(name = "DefaultContact_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> defaultContactSKey;
    @XmlElementRef(name = "DistrictTaxNo", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> districtTaxNo;
    @XmlElement(name = "HoldReason")
    protected Long holdReason;
    @XmlElementRef(name = "HoldReason_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> holdReasonSKey;
    @XmlElement(name = "Language")
    protected Long language;
    @XmlElementRef(name = "Language_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> languageSKey;
    @XmlElementRef(name = "Multi_BuyerBankAccount", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<MultiLangDataDict> multiBuyerBankAccount;
    @XmlElementRef(name = "Multi_BuyerBankAccountCode", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<MultiLangDataDict> multiBuyerBankAccountCode;
    @XmlElementRef(name = "Multi_BuyerNoteName", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<MultiLangDataDict> multiBuyerNoteName;
    @XmlElementRef(name = "Multi_CheckTakerMail", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<MultiLangDataDict> multiCheckTakerMail;
    @XmlElementRef(name = "Multi_CheckTakerPhoneNo", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<MultiLangDataDict> multiCheckTakerPhoneNo;
    @XmlElementRef(name = "Multi_DistrictTaxNo", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<MultiLangDataDict> multiDistrictTaxNo;
    @XmlElementRef(name = "Multi_Name", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<MultiLangDataDict> multiName;
    @XmlElementRef(name = "Multi_StateTaxNo", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<MultiLangDataDict> multiStateTaxNo;
    @XmlElementRef(name = "Multi_TradeRule", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<MultiLangDataDict> multiTradeRule;
    @XmlElementRef(name = "Name", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> name;
    @XmlElement(name = "OfficeSite")
    protected Long officeSite;
    @XmlElementRef(name = "OfficeSite_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> officeSiteSKey;
    @XmlElement(name = "Payee")
    protected Long payee;
    @XmlElementRef(name = "Payee_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> payeeSKey;
    @XmlElement(name = "PaymentCurrency")
    protected Long paymentCurrency;
    @XmlElementRef(name = "PaymentCurrency_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> paymentCurrencySKey;
    @XmlElement(name = "PaymentTerm")
    protected Long paymentTerm;
    @XmlElementRef(name = "PaymentTerm_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> paymentTermSKey;
    @XmlElement(name = "PressPaymentStyle")
    protected Long pressPaymentStyle;
    @XmlElementRef(name = "PressPaymentStyle_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> pressPaymentStyleSKey;
    @XmlElement(name = "RegisterAddress")
    protected Long registerAddress;
    @XmlElementRef(name = "RegisterAddress_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> registerAddressSKey;
    @XmlElement(name = "ReleaseReason")
    protected Long releaseReason;
    @XmlElementRef(name = "ReleaseReason_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> releaseReasonSKey;
    @XmlElement(name = "SaleOrderStyle")
    protected Long saleOrderStyle;
    @XmlElementRef(name = "SaleOrderStyle_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> saleOrderStyleSKey;
    @XmlElement(name = "ShippmentRule")
    protected Long shippmentRule;
    @XmlElementRef(name = "ShippmentRule_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> shippmentRuleSKey;
    @XmlElementRef(name = "StateTaxNo", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> stateTaxNo;
    @XmlElement(name = "Supplier")
    protected Long supplier;
    @XmlElementRef(name = "Supplier_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> supplierSKey;
    @XmlElement(name = "SupplyOrg")
    protected Long supplyOrg;
    @XmlElementRef(name = "SupplyOrg_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> supplyOrgSKey;
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
    @XmlElementRef(name = "TradeRule", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tradeRule;
    @XmlElement(name = "TransitMode")
    protected Long transitMode;
    @XmlElementRef(name = "TransitMode_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> transitModeSKey;
    @XmlElement(name = "WH")
    protected Long wh;
    @XmlElementRef(name = "WH_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> whsKey;
    @XmlElement(name = "m_bankCheckPeriod")
    protected Integer mBankCheckPeriod;
    @XmlElement(name = "m_billToDisableDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mBillToDisableDate;
    @XmlElementRef(name = "m_billToSite", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9CBOSCMCustomerCustomerSiteData> mBillToSite;
    @XmlElement(name = "m_claimDisableDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mClaimDisableDate;
    @XmlElementRef(name = "m_code", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mCode;
    @XmlElement(name = "m_contrastDisableDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mContrastDisableDate;
    @XmlElement(name = "m_controlPDiff")
    protected Boolean mControlPDiff;
    @XmlElement(name = "m_controlPoint")
    protected Short mControlPoint;
    @XmlElementRef(name = "m_createdBy", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mCreatedBy;
    @XmlElement(name = "m_createdOn")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mCreatedOn;
    @XmlElement(name = "m_creditLevel1")
    protected Long mCreditLevel1;
    @XmlElementRef(name = "m_creditLevel1Code", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mCreditLevel1Code;
    @XmlElementRef(name = "m_creditLevel1Name", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mCreditLevel1Name;
    @XmlElement(name = "m_creditLevel2")
    protected Long mCreditLevel2;
    @XmlElementRef(name = "m_creditLevel2Code", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mCreditLevel2Code;
    @XmlElementRef(name = "m_creditLevel2Name", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mCreditLevel2Name;
    @XmlElement(name = "m_creditPolicy")
    protected Long mCreditPolicy;
    @XmlElementRef(name = "m_creditPolicyCode", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mCreditPolicyCode;
    @XmlElementRef(name = "m_creditPolicyName", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mCreditPolicyName;
    @XmlElementRef(name = "m_customer", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9CBOSCMCustomerCustomerData> mCustomer;
    @XmlElementRef(name = "m_customerBankAccount", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfUFIDAU9CBOSCMCustomerCustomerBankAccountData> mCustomerBankAccount;
    @XmlElementRef(name = "m_customerContacts", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfUFIDAU9CBOSCMCustomerCustomerContactData> mCustomerContacts;
    @XmlElement(name = "m_customerState")
    protected Integer mCustomerState;
    @XmlElementRef(name = "m_defaultBankAccount", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9CBOSCMCustomerCustomerBankAccountData> mDefaultBankAccount;
    @XmlElementRef(name = "m_defaultContactPsn", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9CBOSCMCustomerCustomerContactData> mDefaultContactPsn;
    @XmlElement(name = "m_demandTransType")
    protected Integer mDemandTransType;
    @XmlElementRef(name = "m_descFlexField", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9BaseFlexFieldDescFlexFieldDescFlexSegmentsData> mDescFlexField;
    @XmlElementRef(name = "m_effective", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9BasePropertyTypesEffectiveData> mEffective;
    @XmlElement(name = "m_holdDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mHoldDate;
    @XmlElementRef(name = "m_holdUser", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mHoldUser;
    @XmlElement(name = "m_iD")
    protected Long mid;
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
    @XmlElement(name = "m_isDefaultPayment")
    protected Boolean mIsDefaultPayment;
    @XmlElement(name = "m_isDefaultShipTo")
    protected Boolean mIsDefaultShipTo;
    @XmlElement(name = "m_isHoldRelease")
    protected Boolean mIsHoldRelease;
    @XmlElement(name = "m_isPayment")
    protected Boolean mIsPayment;
    @XmlElement(name = "m_isPaymentTermEditable")
    protected Boolean mIsPaymentTermEditable;
    @XmlElement(name = "m_isPostBankCheckList")
    protected Boolean mIsPostBankCheckList;
    @XmlElement(name = "m_isPrePayment")
    protected Boolean mIsPrePayment;
    @XmlElement(name = "m_isPriceListModify")
    protected Boolean mIsPriceListModify;
    @XmlElement(name = "m_isSalesDiscount")
    protected Boolean mIsSalesDiscount;
    @XmlElement(name = "m_isShipTo")
    protected Boolean mIsShipTo;
    @XmlElement(name = "m_isShippmentRuleEditable")
    protected Boolean mIsShippmentRuleEditable;
    @XmlElement(name = "m_latelyPrintDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mLatelyPrintDate;
    @XmlElementRef(name = "m_modifiedBy", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mModifiedBy;
    @XmlElement(name = "m_modifiedOn")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mModifiedOn;
    @XmlElement(name = "m_needDeposit")
    protected Boolean mNeedDeposit;
    @XmlElement(name = "m_nextPrintDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mNextPrintDate;
    @XmlElement(name = "m_officeDisableDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mOfficeDisableDate;
    @XmlElement(name = "m_paymentDisableDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mPaymentDisableDate;
    @XmlElement(name = "m_priceListID")
    protected Long mPriceListID;
    @XmlElementRef(name = "m_priceListName", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mPriceListName;
    @XmlElement(name = "m_qualityGuaranteeType")
    protected Integer mQualityGuaranteeType;
    @XmlElement(name = "m_registerDisableDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mRegisterDisableDate;
    @XmlElement(name = "m_releaseDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mReleaseDate;
    @XmlElementRef(name = "m_releaseUser", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mReleaseUser;
    @XmlElementRef(name = "m_searchCode", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mSearchCode;
    @XmlElement(name = "m_shipmentMode")
    protected Integer mShipmentMode;
    @XmlElementRef(name = "m_shippingHavenCode", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mShippingHavenCode;
    @XmlElement(name = "m_shippingHavenID")
    protected Long mShippingHavenID;
    @XmlElementRef(name = "m_shippingHavenName", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mShippingHavenName;
    @XmlElement(name = "m_shiptoDisableDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mShiptoDisableDate;
    @XmlElement(name = "m_srcRowID")
    protected Long mSrcRowID;
    @XmlElement(name = "m_supplySource")
    protected Integer mSupplySource;
    @XmlElement(name = "m_sysVersion")
    protected Long mSysVersion;
    @XmlElementRef(name = "m_targetHavenCode", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mTargetHavenCode;
    @XmlElement(name = "m_targetHavenID")
    protected Long mTargetHavenID;
    @XmlElementRef(name = "m_targetHavenName", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mTargetHavenName;
    @XmlElement(name = "m_transitLeadTime")
    protected Integer mTransitLeadTime;
    @XmlElement(name = "m_verificationMode")
    protected Integer mVerificationMode;

    /**
     * ��ȡarConfirmTerm���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getARConfirmTerm() {
        return arConfirmTerm;
    }

    /**
     * ����arConfirmTerm���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setARConfirmTerm(Long value) {
        this.arConfirmTerm = value;
    }

    /**
     * ��ȡarConfirmTermSKey���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getARConfirmTermSKey() {
        return arConfirmTermSKey;
    }

    /**
     * ����arConfirmTermSKey���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setARConfirmTermSKey(JAXBElement<EntityKey> value) {
        this.arConfirmTermSKey = value;
    }

    /**
     * ��ȡbankStatementFormat���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getBankStatementFormat() {
        return bankStatementFormat;
    }

    /**
     * ����bankStatementFormat���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setBankStatementFormat(Long value) {
        this.bankStatementFormat = value;
    }

    /**
     * ��ȡbankStatementFormatSKey���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getBankStatementFormatSKey() {
        return bankStatementFormatSKey;
    }

    /**
     * ����bankStatementFormatSKey���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setBankStatementFormatSKey(JAXBElement<EntityKey> value) {
        this.bankStatementFormatSKey = value;
    }

    /**
     * ��ȡbillToSiteSKey���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getBillToSiteSKey() {
        return billToSiteSKey;
    }

    /**
     * ����billToSiteSKey���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setBillToSiteSKey(JAXBElement<EntityKey> value) {
        this.billToSiteSKey = value;
    }

    /**
     * ��ȡbusinessBillStyle���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getBusinessBillStyle() {
        return businessBillStyle;
    }

    /**
     * ����businessBillStyle���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setBusinessBillStyle(Long value) {
        this.businessBillStyle = value;
    }

    /**
     * ��ȡbusinessBillStyleSKey���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getBusinessBillStyleSKey() {
        return businessBillStyleSKey;
    }

    /**
     * ����businessBillStyleSKey���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setBusinessBillStyleSKey(JAXBElement<EntityKey> value) {
        this.businessBillStyleSKey = value;
    }

    /**
     * ��ȡbuyerBankAccount���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBuyerBankAccount() {
        return buyerBankAccount;
    }

    /**
     * ����buyerBankAccount���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBuyerBankAccount(JAXBElement<String> value) {
        this.buyerBankAccount = value;
    }

    /**
     * ��ȡbuyerBankAccountCode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBuyerBankAccountCode() {
        return buyerBankAccountCode;
    }

    /**
     * ����buyerBankAccountCode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBuyerBankAccountCode(JAXBElement<String> value) {
        this.buyerBankAccountCode = value;
    }

    /**
     * ��ȡbuyerNoteName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBuyerNoteName() {
        return buyerNoteName;
    }

    /**
     * ����buyerNoteName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBuyerNoteName(JAXBElement<String> value) {
        this.buyerNoteName = value;
    }

    /**
     * ��ȡcarrier���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCarrier() {
        return carrier;
    }

    /**
     * ����carrier���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCarrier(Long value) {
        this.carrier = value;
    }

    /**
     * ��ȡcarrierSKey���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getCarrierSKey() {
        return carrierSKey;
    }

    /**
     * ����carrierSKey���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setCarrierSKey(JAXBElement<EntityKey> value) {
        this.carrierSKey = value;
    }

    /**
     * ��ȡcheckTakerMail���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCheckTakerMail() {
        return checkTakerMail;
    }

    /**
     * ����checkTakerMail���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCheckTakerMail(JAXBElement<String> value) {
        this.checkTakerMail = value;
    }

    /**
     * ��ȡcheckTakerPhoneNo���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCheckTakerPhoneNo() {
        return checkTakerPhoneNo;
    }

    /**
     * ����checkTakerPhoneNo���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCheckTakerPhoneNo(JAXBElement<String> value) {
        this.checkTakerPhoneNo = value;
    }

    /**
     * ��ȡcustomerSKey���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getCustomerSKey() {
        return customerSKey;
    }

    /**
     * ����customerSKey���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setCustomerSKey(JAXBElement<EntityKey> value) {
        this.customerSKey = value;
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
     * ��ȡdistrictTaxNo���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDistrictTaxNo() {
        return districtTaxNo;
    }

    /**
     * ����districtTaxNo���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDistrictTaxNo(JAXBElement<String> value) {
        this.districtTaxNo = value;
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
     * ��ȡmultiBuyerBankAccount���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MultiLangDataDict }{@code >}
     *     
     */
    public JAXBElement<MultiLangDataDict> getMultiBuyerBankAccount() {
        return multiBuyerBankAccount;
    }

    /**
     * ����multiBuyerBankAccount���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MultiLangDataDict }{@code >}
     *     
     */
    public void setMultiBuyerBankAccount(JAXBElement<MultiLangDataDict> value) {
        this.multiBuyerBankAccount = value;
    }

    /**
     * ��ȡmultiBuyerBankAccountCode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MultiLangDataDict }{@code >}
     *     
     */
    public JAXBElement<MultiLangDataDict> getMultiBuyerBankAccountCode() {
        return multiBuyerBankAccountCode;
    }

    /**
     * ����multiBuyerBankAccountCode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MultiLangDataDict }{@code >}
     *     
     */
    public void setMultiBuyerBankAccountCode(JAXBElement<MultiLangDataDict> value) {
        this.multiBuyerBankAccountCode = value;
    }

    /**
     * ��ȡmultiBuyerNoteName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MultiLangDataDict }{@code >}
     *     
     */
    public JAXBElement<MultiLangDataDict> getMultiBuyerNoteName() {
        return multiBuyerNoteName;
    }

    /**
     * ����multiBuyerNoteName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MultiLangDataDict }{@code >}
     *     
     */
    public void setMultiBuyerNoteName(JAXBElement<MultiLangDataDict> value) {
        this.multiBuyerNoteName = value;
    }

    /**
     * ��ȡmultiCheckTakerMail���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MultiLangDataDict }{@code >}
     *     
     */
    public JAXBElement<MultiLangDataDict> getMultiCheckTakerMail() {
        return multiCheckTakerMail;
    }

    /**
     * ����multiCheckTakerMail���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MultiLangDataDict }{@code >}
     *     
     */
    public void setMultiCheckTakerMail(JAXBElement<MultiLangDataDict> value) {
        this.multiCheckTakerMail = value;
    }

    /**
     * ��ȡmultiCheckTakerPhoneNo���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MultiLangDataDict }{@code >}
     *     
     */
    public JAXBElement<MultiLangDataDict> getMultiCheckTakerPhoneNo() {
        return multiCheckTakerPhoneNo;
    }

    /**
     * ����multiCheckTakerPhoneNo���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MultiLangDataDict }{@code >}
     *     
     */
    public void setMultiCheckTakerPhoneNo(JAXBElement<MultiLangDataDict> value) {
        this.multiCheckTakerPhoneNo = value;
    }

    /**
     * ��ȡmultiDistrictTaxNo���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MultiLangDataDict }{@code >}
     *     
     */
    public JAXBElement<MultiLangDataDict> getMultiDistrictTaxNo() {
        return multiDistrictTaxNo;
    }

    /**
     * ����multiDistrictTaxNo���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MultiLangDataDict }{@code >}
     *     
     */
    public void setMultiDistrictTaxNo(JAXBElement<MultiLangDataDict> value) {
        this.multiDistrictTaxNo = value;
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
     * ��ȡmultiStateTaxNo���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MultiLangDataDict }{@code >}
     *     
     */
    public JAXBElement<MultiLangDataDict> getMultiStateTaxNo() {
        return multiStateTaxNo;
    }

    /**
     * ����multiStateTaxNo���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MultiLangDataDict }{@code >}
     *     
     */
    public void setMultiStateTaxNo(JAXBElement<MultiLangDataDict> value) {
        this.multiStateTaxNo = value;
    }

    /**
     * ��ȡmultiTradeRule���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MultiLangDataDict }{@code >}
     *     
     */
    public JAXBElement<MultiLangDataDict> getMultiTradeRule() {
        return multiTradeRule;
    }

    /**
     * ����multiTradeRule���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MultiLangDataDict }{@code >}
     *     
     */
    public void setMultiTradeRule(JAXBElement<MultiLangDataDict> value) {
        this.multiTradeRule = value;
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
     * ��ȡofficeSite���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOfficeSite() {
        return officeSite;
    }

    /**
     * ����officeSite���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOfficeSite(Long value) {
        this.officeSite = value;
    }

    /**
     * ��ȡofficeSiteSKey���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getOfficeSiteSKey() {
        return officeSiteSKey;
    }

    /**
     * ����officeSiteSKey���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setOfficeSiteSKey(JAXBElement<EntityKey> value) {
        this.officeSiteSKey = value;
    }

    /**
     * ��ȡpayee���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPayee() {
        return payee;
    }

    /**
     * ����payee���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPayee(Long value) {
        this.payee = value;
    }

    /**
     * ��ȡpayeeSKey���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getPayeeSKey() {
        return payeeSKey;
    }

    /**
     * ����payeeSKey���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setPayeeSKey(JAXBElement<EntityKey> value) {
        this.payeeSKey = value;
    }

    /**
     * ��ȡpaymentCurrency���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPaymentCurrency() {
        return paymentCurrency;
    }

    /**
     * ����paymentCurrency���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPaymentCurrency(Long value) {
        this.paymentCurrency = value;
    }

    /**
     * ��ȡpaymentCurrencySKey���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getPaymentCurrencySKey() {
        return paymentCurrencySKey;
    }

    /**
     * ����paymentCurrencySKey���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setPaymentCurrencySKey(JAXBElement<EntityKey> value) {
        this.paymentCurrencySKey = value;
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
     * ��ȡpressPaymentStyle���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPressPaymentStyle() {
        return pressPaymentStyle;
    }

    /**
     * ����pressPaymentStyle���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPressPaymentStyle(Long value) {
        this.pressPaymentStyle = value;
    }

    /**
     * ��ȡpressPaymentStyleSKey���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getPressPaymentStyleSKey() {
        return pressPaymentStyleSKey;
    }

    /**
     * ����pressPaymentStyleSKey���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setPressPaymentStyleSKey(JAXBElement<EntityKey> value) {
        this.pressPaymentStyleSKey = value;
    }

    /**
     * ��ȡregisterAddress���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRegisterAddress() {
        return registerAddress;
    }

    /**
     * ����registerAddress���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRegisterAddress(Long value) {
        this.registerAddress = value;
    }

    /**
     * ��ȡregisterAddressSKey���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getRegisterAddressSKey() {
        return registerAddressSKey;
    }

    /**
     * ����registerAddressSKey���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setRegisterAddressSKey(JAXBElement<EntityKey> value) {
        this.registerAddressSKey = value;
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
     * ��ȡsaleOrderStyle���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSaleOrderStyle() {
        return saleOrderStyle;
    }

    /**
     * ����saleOrderStyle���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSaleOrderStyle(Long value) {
        this.saleOrderStyle = value;
    }

    /**
     * ��ȡsaleOrderStyleSKey���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getSaleOrderStyleSKey() {
        return saleOrderStyleSKey;
    }

    /**
     * ����saleOrderStyleSKey���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setSaleOrderStyleSKey(JAXBElement<EntityKey> value) {
        this.saleOrderStyleSKey = value;
    }

    /**
     * ��ȡshippmentRule���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getShippmentRule() {
        return shippmentRule;
    }

    /**
     * ����shippmentRule���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setShippmentRule(Long value) {
        this.shippmentRule = value;
    }

    /**
     * ��ȡshippmentRuleSKey���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getShippmentRuleSKey() {
        return shippmentRuleSKey;
    }

    /**
     * ����shippmentRuleSKey���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setShippmentRuleSKey(JAXBElement<EntityKey> value) {
        this.shippmentRuleSKey = value;
    }

    /**
     * ��ȡstateTaxNo���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStateTaxNo() {
        return stateTaxNo;
    }

    /**
     * ����stateTaxNo���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStateTaxNo(JAXBElement<String> value) {
        this.stateTaxNo = value;
    }

    /**
     * ��ȡsupplier���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSupplier() {
        return supplier;
    }

    /**
     * ����supplier���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSupplier(Long value) {
        this.supplier = value;
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
     * ��ȡsupplyOrg���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSupplyOrg() {
        return supplyOrg;
    }

    /**
     * ����supplyOrg���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSupplyOrg(Long value) {
        this.supplyOrg = value;
    }

    /**
     * ��ȡsupplyOrgSKey���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getSupplyOrgSKey() {
        return supplyOrgSKey;
    }

    /**
     * ����supplyOrgSKey���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setSupplyOrgSKey(JAXBElement<EntityKey> value) {
        this.supplyOrgSKey = value;
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
     * ��ȡtradeRule���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTradeRule() {
        return tradeRule;
    }

    /**
     * ����tradeRule���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTradeRule(JAXBElement<String> value) {
        this.tradeRule = value;
    }

    /**
     * ��ȡtransitMode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTransitMode() {
        return transitMode;
    }

    /**
     * ����transitMode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTransitMode(Long value) {
        this.transitMode = value;
    }

    /**
     * ��ȡtransitModeSKey���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getTransitModeSKey() {
        return transitModeSKey;
    }

    /**
     * ����transitModeSKey���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setTransitModeSKey(JAXBElement<EntityKey> value) {
        this.transitModeSKey = value;
    }

    /**
     * ��ȡwh���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getWH() {
        return wh;
    }

    /**
     * ����wh���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setWH(Long value) {
        this.wh = value;
    }

    /**
     * ��ȡwhsKey���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getWHSKey() {
        return whsKey;
    }

    /**
     * ����whsKey���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setWHSKey(JAXBElement<EntityKey> value) {
        this.whsKey = value;
    }

    /**
     * ��ȡmBankCheckPeriod���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMBankCheckPeriod() {
        return mBankCheckPeriod;
    }

    /**
     * ����mBankCheckPeriod���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMBankCheckPeriod(Integer value) {
        this.mBankCheckPeriod = value;
    }

    /**
     * ��ȡmBillToDisableDate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMBillToDisableDate() {
        return mBillToDisableDate;
    }

    /**
     * ����mBillToDisableDate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMBillToDisableDate(XMLGregorianCalendar value) {
        this.mBillToDisableDate = value;
    }

    /**
     * ��ȡmBillToSite���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOSCMCustomerCustomerSiteData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9CBOSCMCustomerCustomerSiteData> getMBillToSite() {
        return mBillToSite;
    }

    /**
     * ����mBillToSite���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOSCMCustomerCustomerSiteData }{@code >}
     *     
     */
    public void setMBillToSite(JAXBElement<UFIDAU9CBOSCMCustomerCustomerSiteData> value) {
        this.mBillToSite = value;
    }

    /**
     * ��ȡmClaimDisableDate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMClaimDisableDate() {
        return mClaimDisableDate;
    }

    /**
     * ����mClaimDisableDate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMClaimDisableDate(XMLGregorianCalendar value) {
        this.mClaimDisableDate = value;
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
     * ��ȡmContrastDisableDate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMContrastDisableDate() {
        return mContrastDisableDate;
    }

    /**
     * ����mContrastDisableDate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMContrastDisableDate(XMLGregorianCalendar value) {
        this.mContrastDisableDate = value;
    }

    /**
     * ��ȡmControlPDiff���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMControlPDiff() {
        return mControlPDiff;
    }

    /**
     * ����mControlPDiff���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMControlPDiff(Boolean value) {
        this.mControlPDiff = value;
    }

    /**
     * ��ȡmControlPoint���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getMControlPoint() {
        return mControlPoint;
    }

    /**
     * ����mControlPoint���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setMControlPoint(Short value) {
        this.mControlPoint = value;
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
     * ��ȡmCreditLevel1���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMCreditLevel1() {
        return mCreditLevel1;
    }

    /**
     * ����mCreditLevel1���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMCreditLevel1(Long value) {
        this.mCreditLevel1 = value;
    }

    /**
     * ��ȡmCreditLevel1Code���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMCreditLevel1Code() {
        return mCreditLevel1Code;
    }

    /**
     * ����mCreditLevel1Code���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMCreditLevel1Code(JAXBElement<String> value) {
        this.mCreditLevel1Code = value;
    }

    /**
     * ��ȡmCreditLevel1Name���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMCreditLevel1Name() {
        return mCreditLevel1Name;
    }

    /**
     * ����mCreditLevel1Name���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMCreditLevel1Name(JAXBElement<String> value) {
        this.mCreditLevel1Name = value;
    }

    /**
     * ��ȡmCreditLevel2���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMCreditLevel2() {
        return mCreditLevel2;
    }

    /**
     * ����mCreditLevel2���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMCreditLevel2(Long value) {
        this.mCreditLevel2 = value;
    }

    /**
     * ��ȡmCreditLevel2Code���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMCreditLevel2Code() {
        return mCreditLevel2Code;
    }

    /**
     * ����mCreditLevel2Code���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMCreditLevel2Code(JAXBElement<String> value) {
        this.mCreditLevel2Code = value;
    }

    /**
     * ��ȡmCreditLevel2Name���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMCreditLevel2Name() {
        return mCreditLevel2Name;
    }

    /**
     * ����mCreditLevel2Name���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMCreditLevel2Name(JAXBElement<String> value) {
        this.mCreditLevel2Name = value;
    }

    /**
     * ��ȡmCreditPolicy���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMCreditPolicy() {
        return mCreditPolicy;
    }

    /**
     * ����mCreditPolicy���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMCreditPolicy(Long value) {
        this.mCreditPolicy = value;
    }

    /**
     * ��ȡmCreditPolicyCode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMCreditPolicyCode() {
        return mCreditPolicyCode;
    }

    /**
     * ����mCreditPolicyCode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMCreditPolicyCode(JAXBElement<String> value) {
        this.mCreditPolicyCode = value;
    }

    /**
     * ��ȡmCreditPolicyName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMCreditPolicyName() {
        return mCreditPolicyName;
    }

    /**
     * ����mCreditPolicyName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMCreditPolicyName(JAXBElement<String> value) {
        this.mCreditPolicyName = value;
    }

    /**
     * ��ȡmCustomer���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOSCMCustomerCustomerData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9CBOSCMCustomerCustomerData> getMCustomer() {
        return mCustomer;
    }

    /**
     * ����mCustomer���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOSCMCustomerCustomerData }{@code >}
     *     
     */
    public void setMCustomer(JAXBElement<UFIDAU9CBOSCMCustomerCustomerData> value) {
        this.mCustomer = value;
    }

    /**
     * ��ȡmCustomerBankAccount���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUFIDAU9CBOSCMCustomerCustomerBankAccountData }{@code >}
     *     
     */
    public JAXBElement<ArrayOfUFIDAU9CBOSCMCustomerCustomerBankAccountData> getMCustomerBankAccount() {
        return mCustomerBankAccount;
    }

    /**
     * ����mCustomerBankAccount���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUFIDAU9CBOSCMCustomerCustomerBankAccountData }{@code >}
     *     
     */
    public void setMCustomerBankAccount(JAXBElement<ArrayOfUFIDAU9CBOSCMCustomerCustomerBankAccountData> value) {
        this.mCustomerBankAccount = value;
    }

    /**
     * ��ȡmCustomerContacts���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUFIDAU9CBOSCMCustomerCustomerContactData }{@code >}
     *     
     */
    public JAXBElement<ArrayOfUFIDAU9CBOSCMCustomerCustomerContactData> getMCustomerContacts() {
        return mCustomerContacts;
    }

    /**
     * ����mCustomerContacts���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUFIDAU9CBOSCMCustomerCustomerContactData }{@code >}
     *     
     */
    public void setMCustomerContacts(JAXBElement<ArrayOfUFIDAU9CBOSCMCustomerCustomerContactData> value) {
        this.mCustomerContacts = value;
    }

    /**
     * ��ȡmCustomerState���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMCustomerState() {
        return mCustomerState;
    }

    /**
     * ����mCustomerState���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMCustomerState(Integer value) {
        this.mCustomerState = value;
    }

    /**
     * ��ȡmDefaultBankAccount���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOSCMCustomerCustomerBankAccountData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9CBOSCMCustomerCustomerBankAccountData> getMDefaultBankAccount() {
        return mDefaultBankAccount;
    }

    /**
     * ����mDefaultBankAccount���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOSCMCustomerCustomerBankAccountData }{@code >}
     *     
     */
    public void setMDefaultBankAccount(JAXBElement<UFIDAU9CBOSCMCustomerCustomerBankAccountData> value) {
        this.mDefaultBankAccount = value;
    }

    /**
     * ��ȡmDefaultContactPsn���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOSCMCustomerCustomerContactData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9CBOSCMCustomerCustomerContactData> getMDefaultContactPsn() {
        return mDefaultContactPsn;
    }

    /**
     * ����mDefaultContactPsn���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOSCMCustomerCustomerContactData }{@code >}
     *     
     */
    public void setMDefaultContactPsn(JAXBElement<UFIDAU9CBOSCMCustomerCustomerContactData> value) {
        this.mDefaultContactPsn = value;
    }

    /**
     * ��ȡmDemandTransType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMDemandTransType() {
        return mDemandTransType;
    }

    /**
     * ����mDemandTransType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMDemandTransType(Integer value) {
        this.mDemandTransType = value;
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
     * ��ȡmIsDefaultPayment���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsDefaultPayment() {
        return mIsDefaultPayment;
    }

    /**
     * ����mIsDefaultPayment���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsDefaultPayment(Boolean value) {
        this.mIsDefaultPayment = value;
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
     * ��ȡmIsPayment���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsPayment() {
        return mIsPayment;
    }

    /**
     * ����mIsPayment���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsPayment(Boolean value) {
        this.mIsPayment = value;
    }

    /**
     * ��ȡmIsPaymentTermEditable���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsPaymentTermEditable() {
        return mIsPaymentTermEditable;
    }

    /**
     * ����mIsPaymentTermEditable���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsPaymentTermEditable(Boolean value) {
        this.mIsPaymentTermEditable = value;
    }

    /**
     * ��ȡmIsPostBankCheckList���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsPostBankCheckList() {
        return mIsPostBankCheckList;
    }

    /**
     * ����mIsPostBankCheckList���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsPostBankCheckList(Boolean value) {
        this.mIsPostBankCheckList = value;
    }

    /**
     * ��ȡmIsPrePayment���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsPrePayment() {
        return mIsPrePayment;
    }

    /**
     * ����mIsPrePayment���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsPrePayment(Boolean value) {
        this.mIsPrePayment = value;
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
     * ��ȡmIsSalesDiscount���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsSalesDiscount() {
        return mIsSalesDiscount;
    }

    /**
     * ����mIsSalesDiscount���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsSalesDiscount(Boolean value) {
        this.mIsSalesDiscount = value;
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
     * ��ȡmIsShippmentRuleEditable���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsShippmentRuleEditable() {
        return mIsShippmentRuleEditable;
    }

    /**
     * ����mIsShippmentRuleEditable���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsShippmentRuleEditable(Boolean value) {
        this.mIsShippmentRuleEditable = value;
    }

    /**
     * ��ȡmLatelyPrintDate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMLatelyPrintDate() {
        return mLatelyPrintDate;
    }

    /**
     * ����mLatelyPrintDate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMLatelyPrintDate(XMLGregorianCalendar value) {
        this.mLatelyPrintDate = value;
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
     * ��ȡmNeedDeposit���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMNeedDeposit() {
        return mNeedDeposit;
    }

    /**
     * ����mNeedDeposit���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMNeedDeposit(Boolean value) {
        this.mNeedDeposit = value;
    }

    /**
     * ��ȡmNextPrintDate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMNextPrintDate() {
        return mNextPrintDate;
    }

    /**
     * ����mNextPrintDate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMNextPrintDate(XMLGregorianCalendar value) {
        this.mNextPrintDate = value;
    }

    /**
     * ��ȡmOfficeDisableDate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMOfficeDisableDate() {
        return mOfficeDisableDate;
    }

    /**
     * ����mOfficeDisableDate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMOfficeDisableDate(XMLGregorianCalendar value) {
        this.mOfficeDisableDate = value;
    }

    /**
     * ��ȡmPaymentDisableDate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMPaymentDisableDate() {
        return mPaymentDisableDate;
    }

    /**
     * ����mPaymentDisableDate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMPaymentDisableDate(XMLGregorianCalendar value) {
        this.mPaymentDisableDate = value;
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
     * ��ȡmQualityGuaranteeType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMQualityGuaranteeType() {
        return mQualityGuaranteeType;
    }

    /**
     * ����mQualityGuaranteeType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMQualityGuaranteeType(Integer value) {
        this.mQualityGuaranteeType = value;
    }

    /**
     * ��ȡmRegisterDisableDate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMRegisterDisableDate() {
        return mRegisterDisableDate;
    }

    /**
     * ����mRegisterDisableDate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMRegisterDisableDate(XMLGregorianCalendar value) {
        this.mRegisterDisableDate = value;
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
     * ��ȡmShipmentMode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMShipmentMode() {
        return mShipmentMode;
    }

    /**
     * ����mShipmentMode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMShipmentMode(Integer value) {
        this.mShipmentMode = value;
    }

    /**
     * ��ȡmShippingHavenCode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMShippingHavenCode() {
        return mShippingHavenCode;
    }

    /**
     * ����mShippingHavenCode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMShippingHavenCode(JAXBElement<String> value) {
        this.mShippingHavenCode = value;
    }

    /**
     * ��ȡmShippingHavenID���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMShippingHavenID() {
        return mShippingHavenID;
    }

    /**
     * ����mShippingHavenID���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMShippingHavenID(Long value) {
        this.mShippingHavenID = value;
    }

    /**
     * ��ȡmShippingHavenName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMShippingHavenName() {
        return mShippingHavenName;
    }

    /**
     * ����mShippingHavenName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMShippingHavenName(JAXBElement<String> value) {
        this.mShippingHavenName = value;
    }

    /**
     * ��ȡmShiptoDisableDate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMShiptoDisableDate() {
        return mShiptoDisableDate;
    }

    /**
     * ����mShiptoDisableDate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMShiptoDisableDate(XMLGregorianCalendar value) {
        this.mShiptoDisableDate = value;
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
     * ��ȡmSupplySource���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMSupplySource() {
        return mSupplySource;
    }

    /**
     * ����mSupplySource���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMSupplySource(Integer value) {
        this.mSupplySource = value;
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
     * ��ȡmTargetHavenCode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMTargetHavenCode() {
        return mTargetHavenCode;
    }

    /**
     * ����mTargetHavenCode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMTargetHavenCode(JAXBElement<String> value) {
        this.mTargetHavenCode = value;
    }

    /**
     * ��ȡmTargetHavenID���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMTargetHavenID() {
        return mTargetHavenID;
    }

    /**
     * ����mTargetHavenID���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMTargetHavenID(Long value) {
        this.mTargetHavenID = value;
    }

    /**
     * ��ȡmTargetHavenName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMTargetHavenName() {
        return mTargetHavenName;
    }

    /**
     * ����mTargetHavenName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMTargetHavenName(JAXBElement<String> value) {
        this.mTargetHavenName = value;
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

    /**
     * ��ȡmVerificationMode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMVerificationMode() {
        return mVerificationMode;
    }

    /**
     * ����mVerificationMode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMVerificationMode(Integer value) {
        this.mVerificationMode = value;
    }

}
