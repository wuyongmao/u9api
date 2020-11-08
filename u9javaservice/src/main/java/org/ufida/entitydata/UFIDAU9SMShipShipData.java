
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
import data.util.ubf.ufsoft.MultiLangDataDict;


/**
 * &lt;p&gt;UFIDA.U9.SM.Ship.ShipData complex type的 Java 类。
 * 
 * &lt;p&gt;以下模式片段指定包含在此类中的预期内容。
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="UFIDA.U9.SM.Ship.ShipData"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://www.UFIDA.org/EntityData}UFIDA.U9.Base.Doc.DocData"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="AC" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="AC_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="AccountOrg" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="AccountOrg_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="AimPort" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="AimPort_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Carrier" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="CarrierLinkman_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Carrier_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Channel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ConfirmAccording" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ConfirmAccording_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ConfirmTerm" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ConfirmTerm_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="CusAgentWH" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="CusAgentWH_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Destination" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Destination_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="DocumentType" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="DocumentType_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="FC" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="FC_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="IncomeConfirmTerm" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="IncomeConfirmTerm_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="InsuranceCurrency" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="InsuranceCurrency_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="InvoiceAccording" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="InvoiceAccording_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="InvoiceOrg" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="InvoiceOrg_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="KeepAccountsPeriod" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="KeepAccountsPeriod_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Linkman_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Multi_Channel" type="{UFSoft.UBF.Util.Data}MultiLangDataDict" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Multi_ShipMemo" type="{UFSoft.UBF.Util.Data}MultiLangDataDict" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="OperatingOrg" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="OperatingOrg_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="PassPort" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="PassPort_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="PreRecPolicy" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="PreRecPolicyLine" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="PreRecPolicyLine_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="PreRecPolicy_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ReceivableTerm" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ReceivableTerm_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Recipients_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ReleaseMan" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ReleaseMan_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="SailingCompany" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="SailingCompany_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="SaleDept" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="SaleDept_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Seller" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Seller_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="SettlementOrg" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="SettlementOrg_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ShipLinkman" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ShipLinkman_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ShipMemo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ShipOrg" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ShipOrg_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ShipmentRule" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ShipmentRule_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ShippingPort" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ShippingPort_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Supplier" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Supplier_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="TC" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="TC_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="TaxSchedule" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="TaxSchedule_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="TransInSite_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="TransMode" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="TransMode_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="TransportLinkman_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="WhSite" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="WhSite_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_aCToFCExRate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_aRBillKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_aRBillLineKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_aRBillLineNo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_aRBillNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_aRMoneyAC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_aRMoneyFC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_aRMoneyTC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_activityType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_actualShippingDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_aimPortLinkman" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_allotAchievement" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_approveDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_approveMan" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_bargainMode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_billOfLadingNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_billToSite" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CBO.SCM.Customer.CustomerSiteMISCInfoData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_bizType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_boxType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_boxingNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_boxingType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_cATotalTaxAC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_cATotalTaxFC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_cATotalTaxTC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_carriagePayMode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_carrierLinkman" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.SM.Ship.ShipContactData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_commonInsurance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_confirmMode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_containerNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_containerQty" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_containerSize" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_containerTotalQty" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_cooperateStatus" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_cooperateType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_customsBroker" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_demandCode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_exceptionDealAnnounce" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_exchangeRateType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_executedARMoneyAC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_executedARMoneyTC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_feeSourceBillType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_financeCloseFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_flightNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_headFee" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_headFeeFC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_headFeeTC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_incomeConfirmRule" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_innerSupersedeEnum" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_insurance" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_insuranceTerm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_insuranceType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_insureRatio" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_intendArriveDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_invoiceNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isARFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isAccountOrgChangeable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isAllowHeadPreAR" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isAutoPushTask" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isBatch" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isBeginning" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isCompensate" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isCreateAAI" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isCreatedRcv" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isDemandCodeUnChangeable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isExport" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isInnerShipment" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isInvoiceOrgChangeable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isMachiningTrade" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isMatchSO" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isModConfirmTerm" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isModPriceList" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isModRecTerm" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isModShipRule" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isModifyAC" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isModifyExRateType" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isModifyTC" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isNoCreditCheck" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isNoSOShipment" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isOutTransfer" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isPreRecChangeable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isPreRecPolicyChangeable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isPriceIncludeTax" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isRelease" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isSMDiscountFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isTransPort" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_latestArriveDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_latestShippingDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_linkman" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.SM.Ship.ShipContactData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_loadLimit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_netAccount" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_objectNeedPreRecUse" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_objectUsablePreRecUse" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_orderBy" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CBO.SCM.Customer.CustomerMISCInfoData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_payer" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CBO.SCM.Customer.CustomerMISCInfoData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_payerSite" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CBO.SCM.Customer.CustomerSiteMISCInfoData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_policyHolder" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_preRecLackMoney" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_preRecLackRate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_preRecListStr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_preRecMoney" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_preRecObject" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_preRecObjectUse" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_preRecRate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_preRecUse" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_precisionACFC" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_priceList" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_priceListName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_priceListNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_producingArea" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_productName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_recBillLineKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_recBillLineNO" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_receivalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_receiveBillKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_receiveBillNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_recipients" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.SM.Ship.ShipContactData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_releaseTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_sOBPeriods" type="{http://www.UFIDA.org/EntityData}ArrayOfUFIDA.U9.SM.Ship.SOBPeriodData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_salverQty" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_shipAchievements" type="{http://www.UFIDA.org/EntityData}ArrayOfUFIDA.U9.SM.Ship.ShipAchievementData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_shipAddresss" type="{http://www.UFIDA.org/EntityData}ArrayOfUFIDA.U9.SM.Ship.ShipAddressData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_shipCompany" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_shipConfirmDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_shipContacts" type="{http://www.UFIDA.org/EntityData}ArrayOfUFIDA.U9.SM.Ship.ShipContactData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_shipDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_shipDiscounts" type="{http://www.UFIDA.org/EntityData}ArrayOfUFIDA.U9.SM.Ship.ShipLineDiscountData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_shipFees" type="{http://www.UFIDA.org/EntityData}ArrayOfUFIDA.U9.SM.Ship.ShipFeeData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_shipLines" type="{http://www.UFIDA.org/EntityData}ArrayOfUFIDA.U9.SM.Ship.ShipLineData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_shipMode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_shipName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_shipTaxs" type="{http://www.UFIDA.org/EntityData}ArrayOfUFIDA.U9.SM.Ship.ShipTaxData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_shippingDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_shippingPortLinkman" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_signInBy" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_signInTotalTaxAC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_signInTotalTaxFC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_signInTotalTaxTC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_specialInsurance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_srcDocType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_status" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_stepBy" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_taskUpdShipSign" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_taxFreeNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_totalDiscount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_totalDiscountFC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_totalDiscountTC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_totalFee" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_totalFeeFC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_totalFeeTC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_totalMoney" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_totalMoneyFC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_totalMoneyTC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_totalNetMoneyAC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_totalNetMoneyFC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_totalNetMoneyTC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_totalPieces" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_totalTax" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_totalTaxFC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_totalTaxTC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_tradeMode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_trainNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_transInSite" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.SM.Ship.ShipAddressData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_transportLinkman" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.SM.Ship.ShipContactData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_unApproveDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_unApproveMan" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_wFCurrentState" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_wFOriginalState" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_warningMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_warpRatio" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UFIDA.U9.SM.Ship.ShipData", propOrder = {
    "ac",
    "acsKey",
    "accountOrg",
    "accountOrgSKey",
    "aimPort",
    "aimPortSKey",
    "carrier",
    "carrierLinkmanSKey",
    "carrierSKey",
    "channel",
    "confirmAccording",
    "confirmAccordingSKey",
    "confirmTerm",
    "confirmTermSKey",
    "cusAgentWH",
    "cusAgentWHSKey",
    "destination",
    "destinationSKey",
    "documentType",
    "documentTypeSKey",
    "fc",
    "fcsKey",
    "incomeConfirmTerm",
    "incomeConfirmTermSKey",
    "insuranceCurrency",
    "insuranceCurrencySKey",
    "invoiceAccording",
    "invoiceAccordingSKey",
    "invoiceOrg",
    "invoiceOrgSKey",
    "keepAccountsPeriod",
    "keepAccountsPeriodSKey",
    "linkmanSKey",
    "multiChannel",
    "multiShipMemo",
    "operatingOrg",
    "operatingOrgSKey",
    "passPort",
    "passPortSKey",
    "preRecPolicy",
    "preRecPolicyLine",
    "preRecPolicyLineSKey",
    "preRecPolicySKey",
    "receivableTerm",
    "receivableTermSKey",
    "recipientsSKey",
    "releaseMan",
    "releaseManSKey",
    "sailingCompany",
    "sailingCompanySKey",
    "saleDept",
    "saleDeptSKey",
    "seller",
    "sellerSKey",
    "settlementOrg",
    "settlementOrgSKey",
    "shipLinkman",
    "shipLinkmanSKey",
    "shipMemo",
    "shipOrg",
    "shipOrgSKey",
    "shipmentRule",
    "shipmentRuleSKey",
    "shippingPort",
    "shippingPortSKey",
    "supplier",
    "supplierSKey",
    "tc",
    "tcsKey",
    "taxSchedule",
    "taxScheduleSKey",
    "transInSiteSKey",
    "transMode",
    "transModeSKey",
    "transportLinkmanSKey",
    "whSite",
    "whSiteSKey",
    "macToFCExRate",
    "marBillKey",
    "marBillLineKey",
    "marBillLineNo",
    "marBillNo",
    "marMoneyAC",
    "marMoneyFC",
    "marMoneyTC",
    "mActivityType",
    "mActualShippingDate",
    "mAimPortLinkman",
    "mAllotAchievement",
    "mApproveDate",
    "mApproveMan",
    "mBargainMode",
    "mBillOfLadingNo",
    "mBillToSite",
    "mBizType",
    "mBoxType",
    "mBoxingNo",
    "mBoxingType",
    "mcaTotalTaxAC",
    "mcaTotalTaxFC",
    "mcaTotalTaxTC",
    "mCarriagePayMode",
    "mCarrierLinkman",
    "mCommonInsurance",
    "mConfirmMode",
    "mContainerNo",
    "mContainerQty",
    "mContainerSize",
    "mContainerTotalQty",
    "mCooperateStatus",
    "mCooperateType",
    "mCustomsBroker",
    "mDemandCode",
    "mExceptionDealAnnounce",
    "mExchangeRateType",
    "mExecutedARMoneyAC",
    "mExecutedARMoneyTC",
    "mFeeSourceBillType",
    "mFinanceCloseFlag",
    "mFlightNo",
    "mHeadFee",
    "mHeadFeeFC",
    "mHeadFeeTC",
    "mIncomeConfirmRule",
    "mInnerSupersedeEnum",
    "mInsurance",
    "mInsuranceTerm",
    "mInsuranceType",
    "mInsureRatio",
    "mIntendArriveDate",
    "mInvoiceNo",
    "mIsARFlag",
    "mIsAccountOrgChangeable",
    "mIsAllowHeadPreAR",
    "mIsAutoPushTask",
    "mIsBatch",
    "mIsBeginning",
    "mIsCompensate",
    "mIsCreateAAI",
    "mIsCreatedRcv",
    "mIsDemandCodeUnChangeable",
    "mIsExport",
    "mIsInnerShipment",
    "mIsInvoiceOrgChangeable",
    "mIsMachiningTrade",
    "mIsMatchSO",
    "mIsModConfirmTerm",
    "mIsModPriceList",
    "mIsModRecTerm",
    "mIsModShipRule",
    "mIsModifyAC",
    "mIsModifyExRateType",
    "mIsModifyTC",
    "mIsNoCreditCheck",
    "mIsNoSOShipment",
    "mIsOutTransfer",
    "mIsPreRecChangeable",
    "mIsPreRecPolicyChangeable",
    "mIsPriceIncludeTax",
    "mIsRelease",
    "mIsSMDiscountFlag",
    "mIsTransPort",
    "mLatestArriveDate",
    "mLatestShippingDate",
    "mLinkman",
    "mLoadLimit",
    "mNetAccount",
    "mObjectNeedPreRecUse",
    "mObjectUsablePreRecUse",
    "mOrderBy",
    "mPayer",
    "mPayerSite",
    "mPolicyHolder",
    "mPreRecLackMoney",
    "mPreRecLackRate",
    "mPreRecListStr",
    "mPreRecMoney",
    "mPreRecObject",
    "mPreRecObjectUse",
    "mPreRecRate",
    "mPreRecUse",
    "mPrecisionACFC",
    "mPriceList",
    "mPriceListName",
    "mPriceListNo",
    "mProducingArea",
    "mProductName",
    "mRecBillLineKey",
    "mRecBillLineNO",
    "mReceivalCode",
    "mReceiveBillKey",
    "mReceiveBillNo",
    "mRecipients",
    "mReleaseTime",
    "msobPeriods",
    "mSalverQty",
    "mShipAchievements",
    "mShipAddresss",
    "mShipCompany",
    "mShipConfirmDate",
    "mShipContacts",
    "mShipDate",
    "mShipDiscounts",
    "mShipFees",
    "mShipLines",
    "mShipMode",
    "mShipName",
    "mShipTaxs",
    "mShippingDate",
    "mShippingPortLinkman",
    "mSignInBy",
    "mSignInTotalTaxAC",
    "mSignInTotalTaxFC",
    "mSignInTotalTaxTC",
    "mSpecialInsurance",
    "mSrcDocType",
    "mStatus",
    "mStepBy",
    "mTaskUpdShipSign",
    "mTaxFreeNo",
    "mTotalDiscount",
    "mTotalDiscountFC",
    "mTotalDiscountTC",
    "mTotalFee",
    "mTotalFeeFC",
    "mTotalFeeTC",
    "mTotalMoney",
    "mTotalMoneyFC",
    "mTotalMoneyTC",
    "mTotalNetMoneyAC",
    "mTotalNetMoneyFC",
    "mTotalNetMoneyTC",
    "mTotalPieces",
    "mTotalTax",
    "mTotalTaxFC",
    "mTotalTaxTC",
    "mTradeMode",
    "mTrainNo",
    "mTransInSite",
    "mTransportLinkman",
    "mUnApproveDate",
    "mUnApproveMan",
    "mwfCurrentState",
    "mwfOriginalState",
    "mWarningMessage",
    "mWarpRatio"
})
public class UFIDAU9SMShipShipData
    extends UFIDAU9BaseDocDocData
{

    @XmlElement(name = "AC")
    protected Long ac;
    @XmlElementRef(name = "AC_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> acsKey;
    @XmlElement(name = "AccountOrg")
    protected Long accountOrg;
    @XmlElementRef(name = "AccountOrg_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> accountOrgSKey;
    @XmlElement(name = "AimPort")
    protected Long aimPort;
    @XmlElementRef(name = "AimPort_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> aimPortSKey;
    @XmlElement(name = "Carrier")
    protected Long carrier;
    @XmlElementRef(name = "CarrierLinkman_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> carrierLinkmanSKey;
    @XmlElementRef(name = "Carrier_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> carrierSKey;
    @XmlElementRef(name = "Channel", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> channel;
    @XmlElement(name = "ConfirmAccording")
    protected Long confirmAccording;
    @XmlElementRef(name = "ConfirmAccording_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> confirmAccordingSKey;
    @XmlElement(name = "ConfirmTerm")
    protected Long confirmTerm;
    @XmlElementRef(name = "ConfirmTerm_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> confirmTermSKey;
    @XmlElement(name = "CusAgentWH")
    protected Long cusAgentWH;
    @XmlElementRef(name = "CusAgentWH_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> cusAgentWHSKey;
    @XmlElement(name = "Destination")
    protected Long destination;
    @XmlElementRef(name = "Destination_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> destinationSKey;
    @XmlElement(name = "DocumentType")
    protected Long documentType;
    @XmlElementRef(name = "DocumentType_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> documentTypeSKey;
    @XmlElement(name = "FC")
    protected Long fc;
    @XmlElementRef(name = "FC_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> fcsKey;
    @XmlElement(name = "IncomeConfirmTerm")
    protected Long incomeConfirmTerm;
    @XmlElementRef(name = "IncomeConfirmTerm_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> incomeConfirmTermSKey;
    @XmlElement(name = "InsuranceCurrency")
    protected Long insuranceCurrency;
    @XmlElementRef(name = "InsuranceCurrency_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> insuranceCurrencySKey;
    @XmlElement(name = "InvoiceAccording")
    protected Long invoiceAccording;
    @XmlElementRef(name = "InvoiceAccording_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> invoiceAccordingSKey;
    @XmlElement(name = "InvoiceOrg")
    protected Long invoiceOrg;
    @XmlElementRef(name = "InvoiceOrg_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> invoiceOrgSKey;
    @XmlElement(name = "KeepAccountsPeriod")
    protected Long keepAccountsPeriod;
    @XmlElementRef(name = "KeepAccountsPeriod_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> keepAccountsPeriodSKey;
    @XmlElementRef(name = "Linkman_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> linkmanSKey;
    @XmlElementRef(name = "Multi_Channel", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<MultiLangDataDict> multiChannel;
    @XmlElementRef(name = "Multi_ShipMemo", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<MultiLangDataDict> multiShipMemo;
    @XmlElement(name = "OperatingOrg")
    protected Long operatingOrg;
    @XmlElementRef(name = "OperatingOrg_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> operatingOrgSKey;
    @XmlElement(name = "PassPort")
    protected Long passPort;
    @XmlElementRef(name = "PassPort_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> passPortSKey;
    @XmlElement(name = "PreRecPolicy")
    protected Long preRecPolicy;
    @XmlElement(name = "PreRecPolicyLine")
    protected Long preRecPolicyLine;
    @XmlElementRef(name = "PreRecPolicyLine_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> preRecPolicyLineSKey;
    @XmlElementRef(name = "PreRecPolicy_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> preRecPolicySKey;
    @XmlElement(name = "ReceivableTerm")
    protected Long receivableTerm;
    @XmlElementRef(name = "ReceivableTerm_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> receivableTermSKey;
    @XmlElementRef(name = "Recipients_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> recipientsSKey;
    @XmlElement(name = "ReleaseMan")
    protected Long releaseMan;
    @XmlElementRef(name = "ReleaseMan_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> releaseManSKey;
    @XmlElement(name = "SailingCompany")
    protected Long sailingCompany;
    @XmlElementRef(name = "SailingCompany_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> sailingCompanySKey;
    @XmlElement(name = "SaleDept")
    protected Long saleDept;
    @XmlElementRef(name = "SaleDept_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> saleDeptSKey;
    @XmlElement(name = "Seller")
    protected Long seller;
    @XmlElementRef(name = "Seller_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> sellerSKey;
    @XmlElement(name = "SettlementOrg")
    protected Long settlementOrg;
    @XmlElementRef(name = "SettlementOrg_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> settlementOrgSKey;
    @XmlElement(name = "ShipLinkman")
    protected Long shipLinkman;
    @XmlElementRef(name = "ShipLinkman_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> shipLinkmanSKey;
    @XmlElementRef(name = "ShipMemo", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> shipMemo;
    @XmlElement(name = "ShipOrg")
    protected Long shipOrg;
    @XmlElementRef(name = "ShipOrg_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> shipOrgSKey;
    @XmlElement(name = "ShipmentRule")
    protected Long shipmentRule;
    @XmlElementRef(name = "ShipmentRule_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> shipmentRuleSKey;
    @XmlElement(name = "ShippingPort")
    protected Long shippingPort;
    @XmlElementRef(name = "ShippingPort_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> shippingPortSKey;
    @XmlElement(name = "Supplier")
    protected Long supplier;
    @XmlElementRef(name = "Supplier_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> supplierSKey;
    @XmlElement(name = "TC")
    protected Long tc;
    @XmlElementRef(name = "TC_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> tcsKey;
    @XmlElement(name = "TaxSchedule")
    protected Long taxSchedule;
    @XmlElementRef(name = "TaxSchedule_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> taxScheduleSKey;
    @XmlElementRef(name = "TransInSite_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> transInSiteSKey;
    @XmlElement(name = "TransMode")
    protected Long transMode;
    @XmlElementRef(name = "TransMode_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> transModeSKey;
    @XmlElementRef(name = "TransportLinkman_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> transportLinkmanSKey;
    @XmlElement(name = "WhSite")
    protected Long whSite;
    @XmlElementRef(name = "WhSite_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> whSiteSKey;
    @XmlElement(name = "m_aCToFCExRate")
    protected BigDecimal macToFCExRate;
    @XmlElement(name = "m_aRBillKey")
    protected Long marBillKey;
    @XmlElement(name = "m_aRBillLineKey")
    protected Long marBillLineKey;
    @XmlElement(name = "m_aRBillLineNo")
    protected Integer marBillLineNo;
    @XmlElementRef(name = "m_aRBillNo", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> marBillNo;
    @XmlElement(name = "m_aRMoneyAC")
    protected BigDecimal marMoneyAC;
    @XmlElement(name = "m_aRMoneyFC")
    protected BigDecimal marMoneyFC;
    @XmlElement(name = "m_aRMoneyTC")
    protected BigDecimal marMoneyTC;
    @XmlElement(name = "m_activityType")
    protected Integer mActivityType;
    @XmlElement(name = "m_actualShippingDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mActualShippingDate;
    @XmlElementRef(name = "m_aimPortLinkman", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mAimPortLinkman;
    @XmlElement(name = "m_allotAchievement")
    protected Boolean mAllotAchievement;
    @XmlElement(name = "m_approveDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mApproveDate;
    @XmlElementRef(name = "m_approveMan", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mApproveMan;
    @XmlElement(name = "m_bargainMode")
    protected Integer mBargainMode;
    @XmlElementRef(name = "m_billOfLadingNo", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mBillOfLadingNo;
    @XmlElementRef(name = "m_billToSite", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9CBOSCMCustomerCustomerSiteMISCInfoData> mBillToSite;
    @XmlElement(name = "m_bizType")
    protected Integer mBizType;
    @XmlElementRef(name = "m_boxType", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mBoxType;
    @XmlElementRef(name = "m_boxingNo", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mBoxingNo;
    @XmlElementRef(name = "m_boxingType", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mBoxingType;
    @XmlElement(name = "m_cATotalTaxAC")
    protected BigDecimal mcaTotalTaxAC;
    @XmlElement(name = "m_cATotalTaxFC")
    protected BigDecimal mcaTotalTaxFC;
    @XmlElement(name = "m_cATotalTaxTC")
    protected BigDecimal mcaTotalTaxTC;
    @XmlElement(name = "m_carriagePayMode")
    protected Integer mCarriagePayMode;
    @XmlElementRef(name = "m_carrierLinkman", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9SMShipShipContactData> mCarrierLinkman;
    @XmlElementRef(name = "m_commonInsurance", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mCommonInsurance;
    @XmlElement(name = "m_confirmMode")
    protected Integer mConfirmMode;
    @XmlElementRef(name = "m_containerNo", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mContainerNo;
    @XmlElement(name = "m_containerQty")
    protected Integer mContainerQty;
    @XmlElementRef(name = "m_containerSize", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mContainerSize;
    @XmlElement(name = "m_containerTotalQty")
    protected Integer mContainerTotalQty;
    @XmlElement(name = "m_cooperateStatus")
    protected Integer mCooperateStatus;
    @XmlElement(name = "m_cooperateType")
    protected Integer mCooperateType;
    @XmlElementRef(name = "m_customsBroker", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mCustomsBroker;
    @XmlElement(name = "m_demandCode")
    protected Integer mDemandCode;
    @XmlElementRef(name = "m_exceptionDealAnnounce", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mExceptionDealAnnounce;
    @XmlElement(name = "m_exchangeRateType")
    protected Integer mExchangeRateType;
    @XmlElement(name = "m_executedARMoneyAC")
    protected BigDecimal mExecutedARMoneyAC;
    @XmlElement(name = "m_executedARMoneyTC")
    protected BigDecimal mExecutedARMoneyTC;
    @XmlElement(name = "m_feeSourceBillType")
    protected Integer mFeeSourceBillType;
    @XmlElement(name = "m_financeCloseFlag")
    protected Boolean mFinanceCloseFlag;
    @XmlElementRef(name = "m_flightNo", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mFlightNo;
    @XmlElement(name = "m_headFee")
    protected BigDecimal mHeadFee;
    @XmlElement(name = "m_headFeeFC")
    protected BigDecimal mHeadFeeFC;
    @XmlElement(name = "m_headFeeTC")
    protected BigDecimal mHeadFeeTC;
    @XmlElement(name = "m_incomeConfirmRule")
    protected Integer mIncomeConfirmRule;
    @XmlElement(name = "m_innerSupersedeEnum")
    protected Integer mInnerSupersedeEnum;
    @XmlElement(name = "m_insurance")
    protected BigDecimal mInsurance;
    @XmlElementRef(name = "m_insuranceTerm", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mInsuranceTerm;
    @XmlElement(name = "m_insuranceType")
    protected Integer mInsuranceType;
    @XmlElement(name = "m_insureRatio")
    protected BigDecimal mInsureRatio;
    @XmlElement(name = "m_intendArriveDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mIntendArriveDate;
    @XmlElementRef(name = "m_invoiceNo", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mInvoiceNo;
    @XmlElement(name = "m_isARFlag")
    protected Boolean mIsARFlag;
    @XmlElement(name = "m_isAccountOrgChangeable")
    protected Boolean mIsAccountOrgChangeable;
    @XmlElement(name = "m_isAllowHeadPreAR")
    protected Boolean mIsAllowHeadPreAR;
    @XmlElement(name = "m_isAutoPushTask")
    protected Boolean mIsAutoPushTask;
    @XmlElement(name = "m_isBatch")
    protected Boolean mIsBatch;
    @XmlElement(name = "m_isBeginning")
    protected Boolean mIsBeginning;
    @XmlElement(name = "m_isCompensate")
    protected Boolean mIsCompensate;
    @XmlElement(name = "m_isCreateAAI")
    protected Boolean mIsCreateAAI;
    @XmlElement(name = "m_isCreatedRcv")
    protected Boolean mIsCreatedRcv;
    @XmlElement(name = "m_isDemandCodeUnChangeable")
    protected Boolean mIsDemandCodeUnChangeable;
    @XmlElement(name = "m_isExport")
    protected Boolean mIsExport;
    @XmlElement(name = "m_isInnerShipment")
    protected Boolean mIsInnerShipment;
    @XmlElement(name = "m_isInvoiceOrgChangeable")
    protected Boolean mIsInvoiceOrgChangeable;
    @XmlElement(name = "m_isMachiningTrade")
    protected Boolean mIsMachiningTrade;
    @XmlElement(name = "m_isMatchSO")
    protected Boolean mIsMatchSO;
    @XmlElement(name = "m_isModConfirmTerm")
    protected Boolean mIsModConfirmTerm;
    @XmlElement(name = "m_isModPriceList")
    protected Boolean mIsModPriceList;
    @XmlElement(name = "m_isModRecTerm")
    protected Boolean mIsModRecTerm;
    @XmlElement(name = "m_isModShipRule")
    protected Boolean mIsModShipRule;
    @XmlElement(name = "m_isModifyAC")
    protected Boolean mIsModifyAC;
    @XmlElement(name = "m_isModifyExRateType")
    protected Boolean mIsModifyExRateType;
    @XmlElement(name = "m_isModifyTC")
    protected Boolean mIsModifyTC;
    @XmlElement(name = "m_isNoCreditCheck")
    protected Boolean mIsNoCreditCheck;
    @XmlElement(name = "m_isNoSOShipment")
    protected Boolean mIsNoSOShipment;
    @XmlElement(name = "m_isOutTransfer")
    protected Boolean mIsOutTransfer;
    @XmlElement(name = "m_isPreRecChangeable")
    protected Boolean mIsPreRecChangeable;
    @XmlElement(name = "m_isPreRecPolicyChangeable")
    protected Boolean mIsPreRecPolicyChangeable;
    @XmlElement(name = "m_isPriceIncludeTax")
    protected Boolean mIsPriceIncludeTax;
    @XmlElement(name = "m_isRelease")
    protected Boolean mIsRelease;
    @XmlElement(name = "m_isSMDiscountFlag")
    protected Boolean mIsSMDiscountFlag;
    @XmlElement(name = "m_isTransPort")
    protected Boolean mIsTransPort;
    @XmlElement(name = "m_latestArriveDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mLatestArriveDate;
    @XmlElement(name = "m_latestShippingDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mLatestShippingDate;
    @XmlElementRef(name = "m_linkman", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9SMShipShipContactData> mLinkman;
    @XmlElementRef(name = "m_loadLimit", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mLoadLimit;
    @XmlElement(name = "m_netAccount")
    protected Boolean mNetAccount;
    @XmlElement(name = "m_objectNeedPreRecUse")
    protected BigDecimal mObjectNeedPreRecUse;
    @XmlElement(name = "m_objectUsablePreRecUse")
    protected BigDecimal mObjectUsablePreRecUse;
    @XmlElementRef(name = "m_orderBy", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9CBOSCMCustomerCustomerMISCInfoData> mOrderBy;
    @XmlElementRef(name = "m_payer", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9CBOSCMCustomerCustomerMISCInfoData> mPayer;
    @XmlElementRef(name = "m_payerSite", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9CBOSCMCustomerCustomerSiteMISCInfoData> mPayerSite;
    @XmlElementRef(name = "m_policyHolder", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mPolicyHolder;
    @XmlElement(name = "m_preRecLackMoney")
    protected BigDecimal mPreRecLackMoney;
    @XmlElement(name = "m_preRecLackRate")
    protected BigDecimal mPreRecLackRate;
    @XmlElementRef(name = "m_preRecListStr", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mPreRecListStr;
    @XmlElement(name = "m_preRecMoney")
    protected BigDecimal mPreRecMoney;
    @XmlElement(name = "m_preRecObject")
    protected Integer mPreRecObject;
    @XmlElement(name = "m_preRecObjectUse")
    protected BigDecimal mPreRecObjectUse;
    @XmlElement(name = "m_preRecRate")
    protected BigDecimal mPreRecRate;
    @XmlElement(name = "m_preRecUse")
    protected BigDecimal mPreRecUse;
    @XmlElement(name = "m_precisionACFC")
    protected Integer mPrecisionACFC;
    @XmlElement(name = "m_priceList")
    protected Long mPriceList;
    @XmlElementRef(name = "m_priceListName", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mPriceListName;
    @XmlElementRef(name = "m_priceListNo", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mPriceListNo;
    @XmlElementRef(name = "m_producingArea", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mProducingArea;
    @XmlElementRef(name = "m_productName", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mProductName;
    @XmlElement(name = "m_recBillLineKey")
    protected Long mRecBillLineKey;
    @XmlElement(name = "m_recBillLineNO")
    protected Integer mRecBillLineNO;
    @XmlElementRef(name = "m_receivalCode", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mReceivalCode;
    @XmlElement(name = "m_receiveBillKey")
    protected Long mReceiveBillKey;
    @XmlElementRef(name = "m_receiveBillNo", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mReceiveBillNo;
    @XmlElementRef(name = "m_recipients", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9SMShipShipContactData> mRecipients;
    @XmlElement(name = "m_releaseTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mReleaseTime;
    @XmlElementRef(name = "m_sOBPeriods", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfUFIDAU9SMShipSOBPeriodData> msobPeriods;
    @XmlElement(name = "m_salverQty")
    protected Integer mSalverQty;
    @XmlElementRef(name = "m_shipAchievements", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfUFIDAU9SMShipShipAchievementData> mShipAchievements;
    @XmlElementRef(name = "m_shipAddresss", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfUFIDAU9SMShipShipAddressData> mShipAddresss;
    @XmlElementRef(name = "m_shipCompany", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mShipCompany;
    @XmlElement(name = "m_shipConfirmDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mShipConfirmDate;
    @XmlElementRef(name = "m_shipContacts", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfUFIDAU9SMShipShipContactData> mShipContacts;
    @XmlElement(name = "m_shipDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mShipDate;
    @XmlElementRef(name = "m_shipDiscounts", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfUFIDAU9SMShipShipLineDiscountData> mShipDiscounts;
    @XmlElementRef(name = "m_shipFees", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfUFIDAU9SMShipShipFeeData> mShipFees;
    @XmlElementRef(name = "m_shipLines", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfUFIDAU9SMShipShipLineData> mShipLines;
    @XmlElement(name = "m_shipMode")
    protected Integer mShipMode;
    @XmlElementRef(name = "m_shipName", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mShipName;
    @XmlElementRef(name = "m_shipTaxs", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfUFIDAU9SMShipShipTaxData> mShipTaxs;
    @XmlElement(name = "m_shippingDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mShippingDate;
    @XmlElementRef(name = "m_shippingPortLinkman", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mShippingPortLinkman;
    @XmlElement(name = "m_signInBy")
    protected Integer mSignInBy;
    @XmlElement(name = "m_signInTotalTaxAC")
    protected BigDecimal mSignInTotalTaxAC;
    @XmlElement(name = "m_signInTotalTaxFC")
    protected BigDecimal mSignInTotalTaxFC;
    @XmlElement(name = "m_signInTotalTaxTC")
    protected BigDecimal mSignInTotalTaxTC;
    @XmlElementRef(name = "m_specialInsurance", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mSpecialInsurance;
    @XmlElement(name = "m_srcDocType")
    protected Integer mSrcDocType;
    @XmlElement(name = "m_status")
    protected Integer mStatus;
    @XmlElement(name = "m_stepBy")
    protected Integer mStepBy;
    @XmlElement(name = "m_taskUpdShipSign")
    protected Boolean mTaskUpdShipSign;
    @XmlElementRef(name = "m_taxFreeNo", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mTaxFreeNo;
    @XmlElement(name = "m_totalDiscount")
    protected BigDecimal mTotalDiscount;
    @XmlElement(name = "m_totalDiscountFC")
    protected BigDecimal mTotalDiscountFC;
    @XmlElement(name = "m_totalDiscountTC")
    protected BigDecimal mTotalDiscountTC;
    @XmlElement(name = "m_totalFee")
    protected BigDecimal mTotalFee;
    @XmlElement(name = "m_totalFeeFC")
    protected BigDecimal mTotalFeeFC;
    @XmlElement(name = "m_totalFeeTC")
    protected BigDecimal mTotalFeeTC;
    @XmlElement(name = "m_totalMoney")
    protected BigDecimal mTotalMoney;
    @XmlElement(name = "m_totalMoneyFC")
    protected BigDecimal mTotalMoneyFC;
    @XmlElement(name = "m_totalMoneyTC")
    protected BigDecimal mTotalMoneyTC;
    @XmlElement(name = "m_totalNetMoneyAC")
    protected BigDecimal mTotalNetMoneyAC;
    @XmlElement(name = "m_totalNetMoneyFC")
    protected BigDecimal mTotalNetMoneyFC;
    @XmlElement(name = "m_totalNetMoneyTC")
    protected BigDecimal mTotalNetMoneyTC;
    @XmlElementRef(name = "m_totalPieces", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mTotalPieces;
    @XmlElement(name = "m_totalTax")
    protected BigDecimal mTotalTax;
    @XmlElement(name = "m_totalTaxFC")
    protected BigDecimal mTotalTaxFC;
    @XmlElement(name = "m_totalTaxTC")
    protected BigDecimal mTotalTaxTC;
    @XmlElement(name = "m_tradeMode")
    protected Integer mTradeMode;
    @XmlElementRef(name = "m_trainNo", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mTrainNo;
    @XmlElementRef(name = "m_transInSite", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9SMShipShipAddressData> mTransInSite;
    @XmlElementRef(name = "m_transportLinkman", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9SMShipShipContactData> mTransportLinkman;
    @XmlElement(name = "m_unApproveDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mUnApproveDate;
    @XmlElementRef(name = "m_unApproveMan", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mUnApproveMan;
    @XmlElement(name = "m_wFCurrentState")
    protected Integer mwfCurrentState;
    @XmlElement(name = "m_wFOriginalState")
    protected Integer mwfOriginalState;
    @XmlElementRef(name = "m_warningMessage", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mWarningMessage;
    @XmlElement(name = "m_warpRatio")
    protected BigDecimal mWarpRatio;

    /**
     * 获取ac属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAC() {
        return ac;
    }

    /**
     * 设置ac属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAC(Long value) {
        this.ac = value;
    }

    /**
     * 获取acsKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getACSKey() {
        return acsKey;
    }

    /**
     * 设置acsKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setACSKey(JAXBElement<EntityKey> value) {
        this.acsKey = value;
    }

    /**
     * 获取accountOrg属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAccountOrg() {
        return accountOrg;
    }

    /**
     * 设置accountOrg属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAccountOrg(Long value) {
        this.accountOrg = value;
    }

    /**
     * 获取accountOrgSKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getAccountOrgSKey() {
        return accountOrgSKey;
    }

    /**
     * 设置accountOrgSKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setAccountOrgSKey(JAXBElement<EntityKey> value) {
        this.accountOrgSKey = value;
    }

    /**
     * 获取aimPort属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAimPort() {
        return aimPort;
    }

    /**
     * 设置aimPort属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAimPort(Long value) {
        this.aimPort = value;
    }

    /**
     * 获取aimPortSKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getAimPortSKey() {
        return aimPortSKey;
    }

    /**
     * 设置aimPortSKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setAimPortSKey(JAXBElement<EntityKey> value) {
        this.aimPortSKey = value;
    }

    /**
     * 获取carrier属性的值。
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
     * 设置carrier属性的值。
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
     * 获取carrierLinkmanSKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getCarrierLinkmanSKey() {
        return carrierLinkmanSKey;
    }

    /**
     * 设置carrierLinkmanSKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setCarrierLinkmanSKey(JAXBElement<EntityKey> value) {
        this.carrierLinkmanSKey = value;
    }

    /**
     * 获取carrierSKey属性的值。
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
     * 设置carrierSKey属性的值。
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
     * 获取channel属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getChannel() {
        return channel;
    }

    /**
     * 设置channel属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setChannel(JAXBElement<String> value) {
        this.channel = value;
    }

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
     * 获取confirmTerm属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getConfirmTerm() {
        return confirmTerm;
    }

    /**
     * 设置confirmTerm属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setConfirmTerm(Long value) {
        this.confirmTerm = value;
    }

    /**
     * 获取confirmTermSKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getConfirmTermSKey() {
        return confirmTermSKey;
    }

    /**
     * 设置confirmTermSKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setConfirmTermSKey(JAXBElement<EntityKey> value) {
        this.confirmTermSKey = value;
    }

    /**
     * 获取cusAgentWH属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCusAgentWH() {
        return cusAgentWH;
    }

    /**
     * 设置cusAgentWH属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCusAgentWH(Long value) {
        this.cusAgentWH = value;
    }

    /**
     * 获取cusAgentWHSKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getCusAgentWHSKey() {
        return cusAgentWHSKey;
    }

    /**
     * 设置cusAgentWHSKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setCusAgentWHSKey(JAXBElement<EntityKey> value) {
        this.cusAgentWHSKey = value;
    }

    /**
     * 获取destination属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDestination() {
        return destination;
    }

    /**
     * 设置destination属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDestination(Long value) {
        this.destination = value;
    }

    /**
     * 获取destinationSKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getDestinationSKey() {
        return destinationSKey;
    }

    /**
     * 设置destinationSKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setDestinationSKey(JAXBElement<EntityKey> value) {
        this.destinationSKey = value;
    }

    /**
     * 获取documentType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDocumentType() {
        return documentType;
    }

    /**
     * 设置documentType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDocumentType(Long value) {
        this.documentType = value;
    }

    /**
     * 获取documentTypeSKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getDocumentTypeSKey() {
        return documentTypeSKey;
    }

    /**
     * 设置documentTypeSKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setDocumentTypeSKey(JAXBElement<EntityKey> value) {
        this.documentTypeSKey = value;
    }

    /**
     * 获取fc属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getFC() {
        return fc;
    }

    /**
     * 设置fc属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFC(Long value) {
        this.fc = value;
    }

    /**
     * 获取fcsKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getFCSKey() {
        return fcsKey;
    }

    /**
     * 设置fcsKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setFCSKey(JAXBElement<EntityKey> value) {
        this.fcsKey = value;
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
     * 获取insuranceCurrency属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getInsuranceCurrency() {
        return insuranceCurrency;
    }

    /**
     * 设置insuranceCurrency属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setInsuranceCurrency(Long value) {
        this.insuranceCurrency = value;
    }

    /**
     * 获取insuranceCurrencySKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getInsuranceCurrencySKey() {
        return insuranceCurrencySKey;
    }

    /**
     * 设置insuranceCurrencySKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setInsuranceCurrencySKey(JAXBElement<EntityKey> value) {
        this.insuranceCurrencySKey = value;
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
     * 获取invoiceOrg属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getInvoiceOrg() {
        return invoiceOrg;
    }

    /**
     * 设置invoiceOrg属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setInvoiceOrg(Long value) {
        this.invoiceOrg = value;
    }

    /**
     * 获取invoiceOrgSKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getInvoiceOrgSKey() {
        return invoiceOrgSKey;
    }

    /**
     * 设置invoiceOrgSKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setInvoiceOrgSKey(JAXBElement<EntityKey> value) {
        this.invoiceOrgSKey = value;
    }

    /**
     * 获取keepAccountsPeriod属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getKeepAccountsPeriod() {
        return keepAccountsPeriod;
    }

    /**
     * 设置keepAccountsPeriod属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setKeepAccountsPeriod(Long value) {
        this.keepAccountsPeriod = value;
    }

    /**
     * 获取keepAccountsPeriodSKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getKeepAccountsPeriodSKey() {
        return keepAccountsPeriodSKey;
    }

    /**
     * 设置keepAccountsPeriodSKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setKeepAccountsPeriodSKey(JAXBElement<EntityKey> value) {
        this.keepAccountsPeriodSKey = value;
    }

    /**
     * 获取linkmanSKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getLinkmanSKey() {
        return linkmanSKey;
    }

    /**
     * 设置linkmanSKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setLinkmanSKey(JAXBElement<EntityKey> value) {
        this.linkmanSKey = value;
    }

    /**
     * 获取multiChannel属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MultiLangDataDict }{@code >}
     *     
     */
    public JAXBElement<MultiLangDataDict> getMultiChannel() {
        return multiChannel;
    }

    /**
     * 设置multiChannel属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MultiLangDataDict }{@code >}
     *     
     */
    public void setMultiChannel(JAXBElement<MultiLangDataDict> value) {
        this.multiChannel = value;
    }

    /**
     * 获取multiShipMemo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MultiLangDataDict }{@code >}
     *     
     */
    public JAXBElement<MultiLangDataDict> getMultiShipMemo() {
        return multiShipMemo;
    }

    /**
     * 设置multiShipMemo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MultiLangDataDict }{@code >}
     *     
     */
    public void setMultiShipMemo(JAXBElement<MultiLangDataDict> value) {
        this.multiShipMemo = value;
    }

    /**
     * 获取operatingOrg属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOperatingOrg() {
        return operatingOrg;
    }

    /**
     * 设置operatingOrg属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOperatingOrg(Long value) {
        this.operatingOrg = value;
    }

    /**
     * 获取operatingOrgSKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getOperatingOrgSKey() {
        return operatingOrgSKey;
    }

    /**
     * 设置operatingOrgSKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setOperatingOrgSKey(JAXBElement<EntityKey> value) {
        this.operatingOrgSKey = value;
    }

    /**
     * 获取passPort属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPassPort() {
        return passPort;
    }

    /**
     * 设置passPort属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPassPort(Long value) {
        this.passPort = value;
    }

    /**
     * 获取passPortSKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getPassPortSKey() {
        return passPortSKey;
    }

    /**
     * 设置passPortSKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setPassPortSKey(JAXBElement<EntityKey> value) {
        this.passPortSKey = value;
    }

    /**
     * 获取preRecPolicy属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPreRecPolicy() {
        return preRecPolicy;
    }

    /**
     * 设置preRecPolicy属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPreRecPolicy(Long value) {
        this.preRecPolicy = value;
    }

    /**
     * 获取preRecPolicyLine属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPreRecPolicyLine() {
        return preRecPolicyLine;
    }

    /**
     * 设置preRecPolicyLine属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPreRecPolicyLine(Long value) {
        this.preRecPolicyLine = value;
    }

    /**
     * 获取preRecPolicyLineSKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getPreRecPolicyLineSKey() {
        return preRecPolicyLineSKey;
    }

    /**
     * 设置preRecPolicyLineSKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setPreRecPolicyLineSKey(JAXBElement<EntityKey> value) {
        this.preRecPolicyLineSKey = value;
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
     * 获取receivableTerm属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getReceivableTerm() {
        return receivableTerm;
    }

    /**
     * 设置receivableTerm属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setReceivableTerm(Long value) {
        this.receivableTerm = value;
    }

    /**
     * 获取receivableTermSKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getReceivableTermSKey() {
        return receivableTermSKey;
    }

    /**
     * 设置receivableTermSKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setReceivableTermSKey(JAXBElement<EntityKey> value) {
        this.receivableTermSKey = value;
    }

    /**
     * 获取recipientsSKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getRecipientsSKey() {
        return recipientsSKey;
    }

    /**
     * 设置recipientsSKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setRecipientsSKey(JAXBElement<EntityKey> value) {
        this.recipientsSKey = value;
    }

    /**
     * 获取releaseMan属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getReleaseMan() {
        return releaseMan;
    }

    /**
     * 设置releaseMan属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setReleaseMan(Long value) {
        this.releaseMan = value;
    }

    /**
     * 获取releaseManSKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getReleaseManSKey() {
        return releaseManSKey;
    }

    /**
     * 设置releaseManSKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setReleaseManSKey(JAXBElement<EntityKey> value) {
        this.releaseManSKey = value;
    }

    /**
     * 获取sailingCompany属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSailingCompany() {
        return sailingCompany;
    }

    /**
     * 设置sailingCompany属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSailingCompany(Long value) {
        this.sailingCompany = value;
    }

    /**
     * 获取sailingCompanySKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getSailingCompanySKey() {
        return sailingCompanySKey;
    }

    /**
     * 设置sailingCompanySKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setSailingCompanySKey(JAXBElement<EntityKey> value) {
        this.sailingCompanySKey = value;
    }

    /**
     * 获取saleDept属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSaleDept() {
        return saleDept;
    }

    /**
     * 设置saleDept属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSaleDept(Long value) {
        this.saleDept = value;
    }

    /**
     * 获取saleDeptSKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getSaleDeptSKey() {
        return saleDeptSKey;
    }

    /**
     * 设置saleDeptSKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setSaleDeptSKey(JAXBElement<EntityKey> value) {
        this.saleDeptSKey = value;
    }

    /**
     * 获取seller属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSeller() {
        return seller;
    }

    /**
     * 设置seller属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSeller(Long value) {
        this.seller = value;
    }

    /**
     * 获取sellerSKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getSellerSKey() {
        return sellerSKey;
    }

    /**
     * 设置sellerSKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setSellerSKey(JAXBElement<EntityKey> value) {
        this.sellerSKey = value;
    }

    /**
     * 获取settlementOrg属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSettlementOrg() {
        return settlementOrg;
    }

    /**
     * 设置settlementOrg属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSettlementOrg(Long value) {
        this.settlementOrg = value;
    }

    /**
     * 获取settlementOrgSKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getSettlementOrgSKey() {
        return settlementOrgSKey;
    }

    /**
     * 设置settlementOrgSKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setSettlementOrgSKey(JAXBElement<EntityKey> value) {
        this.settlementOrgSKey = value;
    }

    /**
     * 获取shipLinkman属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getShipLinkman() {
        return shipLinkman;
    }

    /**
     * 设置shipLinkman属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setShipLinkman(Long value) {
        this.shipLinkman = value;
    }

    /**
     * 获取shipLinkmanSKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getShipLinkmanSKey() {
        return shipLinkmanSKey;
    }

    /**
     * 设置shipLinkmanSKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setShipLinkmanSKey(JAXBElement<EntityKey> value) {
        this.shipLinkmanSKey = value;
    }

    /**
     * 获取shipMemo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getShipMemo() {
        return shipMemo;
    }

    /**
     * 设置shipMemo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setShipMemo(JAXBElement<String> value) {
        this.shipMemo = value;
    }

    /**
     * 获取shipOrg属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getShipOrg() {
        return shipOrg;
    }

    /**
     * 设置shipOrg属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setShipOrg(Long value) {
        this.shipOrg = value;
    }

    /**
     * 获取shipOrgSKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getShipOrgSKey() {
        return shipOrgSKey;
    }

    /**
     * 设置shipOrgSKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setShipOrgSKey(JAXBElement<EntityKey> value) {
        this.shipOrgSKey = value;
    }

    /**
     * 获取shipmentRule属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getShipmentRule() {
        return shipmentRule;
    }

    /**
     * 设置shipmentRule属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setShipmentRule(Long value) {
        this.shipmentRule = value;
    }

    /**
     * 获取shipmentRuleSKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getShipmentRuleSKey() {
        return shipmentRuleSKey;
    }

    /**
     * 设置shipmentRuleSKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setShipmentRuleSKey(JAXBElement<EntityKey> value) {
        this.shipmentRuleSKey = value;
    }

    /**
     * 获取shippingPort属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getShippingPort() {
        return shippingPort;
    }

    /**
     * 设置shippingPort属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setShippingPort(Long value) {
        this.shippingPort = value;
    }

    /**
     * 获取shippingPortSKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getShippingPortSKey() {
        return shippingPortSKey;
    }

    /**
     * 设置shippingPortSKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setShippingPortSKey(JAXBElement<EntityKey> value) {
        this.shippingPortSKey = value;
    }

    /**
     * 获取supplier属性的值。
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
     * 设置supplier属性的值。
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
     * 获取supplierSKey属性的值。
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
     * 设置supplierSKey属性的值。
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
     * 获取tc属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTC() {
        return tc;
    }

    /**
     * 设置tc属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTC(Long value) {
        this.tc = value;
    }

    /**
     * 获取tcsKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getTCSKey() {
        return tcsKey;
    }

    /**
     * 设置tcsKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setTCSKey(JAXBElement<EntityKey> value) {
        this.tcsKey = value;
    }

    /**
     * 获取taxSchedule属性的值。
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
     * 设置taxSchedule属性的值。
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
     * 获取taxScheduleSKey属性的值。
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
     * 设置taxScheduleSKey属性的值。
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
     * 获取transInSiteSKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getTransInSiteSKey() {
        return transInSiteSKey;
    }

    /**
     * 设置transInSiteSKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setTransInSiteSKey(JAXBElement<EntityKey> value) {
        this.transInSiteSKey = value;
    }

    /**
     * 获取transMode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTransMode() {
        return transMode;
    }

    /**
     * 设置transMode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTransMode(Long value) {
        this.transMode = value;
    }

    /**
     * 获取transModeSKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getTransModeSKey() {
        return transModeSKey;
    }

    /**
     * 设置transModeSKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setTransModeSKey(JAXBElement<EntityKey> value) {
        this.transModeSKey = value;
    }

    /**
     * 获取transportLinkmanSKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getTransportLinkmanSKey() {
        return transportLinkmanSKey;
    }

    /**
     * 设置transportLinkmanSKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setTransportLinkmanSKey(JAXBElement<EntityKey> value) {
        this.transportLinkmanSKey = value;
    }

    /**
     * 获取whSite属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getWhSite() {
        return whSite;
    }

    /**
     * 设置whSite属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setWhSite(Long value) {
        this.whSite = value;
    }

    /**
     * 获取whSiteSKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getWhSiteSKey() {
        return whSiteSKey;
    }

    /**
     * 设置whSiteSKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setWhSiteSKey(JAXBElement<EntityKey> value) {
        this.whSiteSKey = value;
    }

    /**
     * 获取macToFCExRate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMACToFCExRate() {
        return macToFCExRate;
    }

    /**
     * 设置macToFCExRate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMACToFCExRate(BigDecimal value) {
        this.macToFCExRate = value;
    }

    /**
     * 获取marBillKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMARBillKey() {
        return marBillKey;
    }

    /**
     * 设置marBillKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMARBillKey(Long value) {
        this.marBillKey = value;
    }

    /**
     * 获取marBillLineKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMARBillLineKey() {
        return marBillLineKey;
    }

    /**
     * 设置marBillLineKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMARBillLineKey(Long value) {
        this.marBillLineKey = value;
    }

    /**
     * 获取marBillLineNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMARBillLineNo() {
        return marBillLineNo;
    }

    /**
     * 设置marBillLineNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMARBillLineNo(Integer value) {
        this.marBillLineNo = value;
    }

    /**
     * 获取marBillNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMARBillNo() {
        return marBillNo;
    }

    /**
     * 设置marBillNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMARBillNo(JAXBElement<String> value) {
        this.marBillNo = value;
    }

    /**
     * 获取marMoneyAC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMARMoneyAC() {
        return marMoneyAC;
    }

    /**
     * 设置marMoneyAC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMARMoneyAC(BigDecimal value) {
        this.marMoneyAC = value;
    }

    /**
     * 获取marMoneyFC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMARMoneyFC() {
        return marMoneyFC;
    }

    /**
     * 设置marMoneyFC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMARMoneyFC(BigDecimal value) {
        this.marMoneyFC = value;
    }

    /**
     * 获取marMoneyTC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMARMoneyTC() {
        return marMoneyTC;
    }

    /**
     * 设置marMoneyTC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMARMoneyTC(BigDecimal value) {
        this.marMoneyTC = value;
    }

    /**
     * 获取mActivityType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMActivityType() {
        return mActivityType;
    }

    /**
     * 设置mActivityType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMActivityType(Integer value) {
        this.mActivityType = value;
    }

    /**
     * 获取mActualShippingDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMActualShippingDate() {
        return mActualShippingDate;
    }

    /**
     * 设置mActualShippingDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMActualShippingDate(XMLGregorianCalendar value) {
        this.mActualShippingDate = value;
    }

    /**
     * 获取mAimPortLinkman属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMAimPortLinkman() {
        return mAimPortLinkman;
    }

    /**
     * 设置mAimPortLinkman属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMAimPortLinkman(JAXBElement<String> value) {
        this.mAimPortLinkman = value;
    }

    /**
     * 获取mAllotAchievement属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMAllotAchievement() {
        return mAllotAchievement;
    }

    /**
     * 设置mAllotAchievement属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMAllotAchievement(Boolean value) {
        this.mAllotAchievement = value;
    }

    /**
     * 获取mApproveDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMApproveDate() {
        return mApproveDate;
    }

    /**
     * 设置mApproveDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMApproveDate(XMLGregorianCalendar value) {
        this.mApproveDate = value;
    }

    /**
     * 获取mApproveMan属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMApproveMan() {
        return mApproveMan;
    }

    /**
     * 设置mApproveMan属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMApproveMan(JAXBElement<String> value) {
        this.mApproveMan = value;
    }

    /**
     * 获取mBargainMode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMBargainMode() {
        return mBargainMode;
    }

    /**
     * 设置mBargainMode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMBargainMode(Integer value) {
        this.mBargainMode = value;
    }

    /**
     * 获取mBillOfLadingNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMBillOfLadingNo() {
        return mBillOfLadingNo;
    }

    /**
     * 设置mBillOfLadingNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMBillOfLadingNo(JAXBElement<String> value) {
        this.mBillOfLadingNo = value;
    }

    /**
     * 获取mBillToSite属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOSCMCustomerCustomerSiteMISCInfoData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9CBOSCMCustomerCustomerSiteMISCInfoData> getMBillToSite() {
        return mBillToSite;
    }

    /**
     * 设置mBillToSite属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOSCMCustomerCustomerSiteMISCInfoData }{@code >}
     *     
     */
    public void setMBillToSite(JAXBElement<UFIDAU9CBOSCMCustomerCustomerSiteMISCInfoData> value) {
        this.mBillToSite = value;
    }

    /**
     * 获取mBizType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMBizType() {
        return mBizType;
    }

    /**
     * 设置mBizType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMBizType(Integer value) {
        this.mBizType = value;
    }

    /**
     * 获取mBoxType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMBoxType() {
        return mBoxType;
    }

    /**
     * 设置mBoxType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMBoxType(JAXBElement<String> value) {
        this.mBoxType = value;
    }

    /**
     * 获取mBoxingNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMBoxingNo() {
        return mBoxingNo;
    }

    /**
     * 设置mBoxingNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMBoxingNo(JAXBElement<String> value) {
        this.mBoxingNo = value;
    }

    /**
     * 获取mBoxingType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMBoxingType() {
        return mBoxingType;
    }

    /**
     * 设置mBoxingType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMBoxingType(JAXBElement<String> value) {
        this.mBoxingType = value;
    }

    /**
     * 获取mcaTotalTaxAC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMCATotalTaxAC() {
        return mcaTotalTaxAC;
    }

    /**
     * 设置mcaTotalTaxAC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMCATotalTaxAC(BigDecimal value) {
        this.mcaTotalTaxAC = value;
    }

    /**
     * 获取mcaTotalTaxFC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMCATotalTaxFC() {
        return mcaTotalTaxFC;
    }

    /**
     * 设置mcaTotalTaxFC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMCATotalTaxFC(BigDecimal value) {
        this.mcaTotalTaxFC = value;
    }

    /**
     * 获取mcaTotalTaxTC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMCATotalTaxTC() {
        return mcaTotalTaxTC;
    }

    /**
     * 设置mcaTotalTaxTC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMCATotalTaxTC(BigDecimal value) {
        this.mcaTotalTaxTC = value;
    }

    /**
     * 获取mCarriagePayMode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMCarriagePayMode() {
        return mCarriagePayMode;
    }

    /**
     * 设置mCarriagePayMode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMCarriagePayMode(Integer value) {
        this.mCarriagePayMode = value;
    }

    /**
     * 获取mCarrierLinkman属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9SMShipShipContactData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9SMShipShipContactData> getMCarrierLinkman() {
        return mCarrierLinkman;
    }

    /**
     * 设置mCarrierLinkman属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9SMShipShipContactData }{@code >}
     *     
     */
    public void setMCarrierLinkman(JAXBElement<UFIDAU9SMShipShipContactData> value) {
        this.mCarrierLinkman = value;
    }

    /**
     * 获取mCommonInsurance属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMCommonInsurance() {
        return mCommonInsurance;
    }

    /**
     * 设置mCommonInsurance属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMCommonInsurance(JAXBElement<String> value) {
        this.mCommonInsurance = value;
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
     * 获取mContainerNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMContainerNo() {
        return mContainerNo;
    }

    /**
     * 设置mContainerNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMContainerNo(JAXBElement<String> value) {
        this.mContainerNo = value;
    }

    /**
     * 获取mContainerQty属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMContainerQty() {
        return mContainerQty;
    }

    /**
     * 设置mContainerQty属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMContainerQty(Integer value) {
        this.mContainerQty = value;
    }

    /**
     * 获取mContainerSize属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMContainerSize() {
        return mContainerSize;
    }

    /**
     * 设置mContainerSize属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMContainerSize(JAXBElement<String> value) {
        this.mContainerSize = value;
    }

    /**
     * 获取mContainerTotalQty属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMContainerTotalQty() {
        return mContainerTotalQty;
    }

    /**
     * 设置mContainerTotalQty属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMContainerTotalQty(Integer value) {
        this.mContainerTotalQty = value;
    }

    /**
     * 获取mCooperateStatus属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMCooperateStatus() {
        return mCooperateStatus;
    }

    /**
     * 设置mCooperateStatus属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMCooperateStatus(Integer value) {
        this.mCooperateStatus = value;
    }

    /**
     * 获取mCooperateType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMCooperateType() {
        return mCooperateType;
    }

    /**
     * 设置mCooperateType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMCooperateType(Integer value) {
        this.mCooperateType = value;
    }

    /**
     * 获取mCustomsBroker属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMCustomsBroker() {
        return mCustomsBroker;
    }

    /**
     * 设置mCustomsBroker属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMCustomsBroker(JAXBElement<String> value) {
        this.mCustomsBroker = value;
    }

    /**
     * 获取mDemandCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMDemandCode() {
        return mDemandCode;
    }

    /**
     * 设置mDemandCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMDemandCode(Integer value) {
        this.mDemandCode = value;
    }

    /**
     * 获取mExceptionDealAnnounce属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMExceptionDealAnnounce() {
        return mExceptionDealAnnounce;
    }

    /**
     * 设置mExceptionDealAnnounce属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMExceptionDealAnnounce(JAXBElement<String> value) {
        this.mExceptionDealAnnounce = value;
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
     * 获取mExecutedARMoneyAC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMExecutedARMoneyAC() {
        return mExecutedARMoneyAC;
    }

    /**
     * 设置mExecutedARMoneyAC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMExecutedARMoneyAC(BigDecimal value) {
        this.mExecutedARMoneyAC = value;
    }

    /**
     * 获取mExecutedARMoneyTC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMExecutedARMoneyTC() {
        return mExecutedARMoneyTC;
    }

    /**
     * 设置mExecutedARMoneyTC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMExecutedARMoneyTC(BigDecimal value) {
        this.mExecutedARMoneyTC = value;
    }

    /**
     * 获取mFeeSourceBillType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMFeeSourceBillType() {
        return mFeeSourceBillType;
    }

    /**
     * 设置mFeeSourceBillType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMFeeSourceBillType(Integer value) {
        this.mFeeSourceBillType = value;
    }

    /**
     * 获取mFinanceCloseFlag属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMFinanceCloseFlag() {
        return mFinanceCloseFlag;
    }

    /**
     * 设置mFinanceCloseFlag属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMFinanceCloseFlag(Boolean value) {
        this.mFinanceCloseFlag = value;
    }

    /**
     * 获取mFlightNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMFlightNo() {
        return mFlightNo;
    }

    /**
     * 设置mFlightNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMFlightNo(JAXBElement<String> value) {
        this.mFlightNo = value;
    }

    /**
     * 获取mHeadFee属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMHeadFee() {
        return mHeadFee;
    }

    /**
     * 设置mHeadFee属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMHeadFee(BigDecimal value) {
        this.mHeadFee = value;
    }

    /**
     * 获取mHeadFeeFC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMHeadFeeFC() {
        return mHeadFeeFC;
    }

    /**
     * 设置mHeadFeeFC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMHeadFeeFC(BigDecimal value) {
        this.mHeadFeeFC = value;
    }

    /**
     * 获取mHeadFeeTC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMHeadFeeTC() {
        return mHeadFeeTC;
    }

    /**
     * 设置mHeadFeeTC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMHeadFeeTC(BigDecimal value) {
        this.mHeadFeeTC = value;
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
     * 获取mInnerSupersedeEnum属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMInnerSupersedeEnum() {
        return mInnerSupersedeEnum;
    }

    /**
     * 设置mInnerSupersedeEnum属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMInnerSupersedeEnum(Integer value) {
        this.mInnerSupersedeEnum = value;
    }

    /**
     * 获取mInsurance属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMInsurance() {
        return mInsurance;
    }

    /**
     * 设置mInsurance属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMInsurance(BigDecimal value) {
        this.mInsurance = value;
    }

    /**
     * 获取mInsuranceTerm属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMInsuranceTerm() {
        return mInsuranceTerm;
    }

    /**
     * 设置mInsuranceTerm属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMInsuranceTerm(JAXBElement<String> value) {
        this.mInsuranceTerm = value;
    }

    /**
     * 获取mInsuranceType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMInsuranceType() {
        return mInsuranceType;
    }

    /**
     * 设置mInsuranceType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMInsuranceType(Integer value) {
        this.mInsuranceType = value;
    }

    /**
     * 获取mInsureRatio属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMInsureRatio() {
        return mInsureRatio;
    }

    /**
     * 设置mInsureRatio属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMInsureRatio(BigDecimal value) {
        this.mInsureRatio = value;
    }

    /**
     * 获取mIntendArriveDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMIntendArriveDate() {
        return mIntendArriveDate;
    }

    /**
     * 设置mIntendArriveDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMIntendArriveDate(XMLGregorianCalendar value) {
        this.mIntendArriveDate = value;
    }

    /**
     * 获取mInvoiceNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMInvoiceNo() {
        return mInvoiceNo;
    }

    /**
     * 设置mInvoiceNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMInvoiceNo(JAXBElement<String> value) {
        this.mInvoiceNo = value;
    }

    /**
     * 获取mIsARFlag属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsARFlag() {
        return mIsARFlag;
    }

    /**
     * 设置mIsARFlag属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsARFlag(Boolean value) {
        this.mIsARFlag = value;
    }

    /**
     * 获取mIsAccountOrgChangeable属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsAccountOrgChangeable() {
        return mIsAccountOrgChangeable;
    }

    /**
     * 设置mIsAccountOrgChangeable属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsAccountOrgChangeable(Boolean value) {
        this.mIsAccountOrgChangeable = value;
    }

    /**
     * 获取mIsAllowHeadPreAR属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsAllowHeadPreAR() {
        return mIsAllowHeadPreAR;
    }

    /**
     * 设置mIsAllowHeadPreAR属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsAllowHeadPreAR(Boolean value) {
        this.mIsAllowHeadPreAR = value;
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
     * 获取mIsBatch属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsBatch() {
        return mIsBatch;
    }

    /**
     * 设置mIsBatch属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsBatch(Boolean value) {
        this.mIsBatch = value;
    }

    /**
     * 获取mIsBeginning属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsBeginning() {
        return mIsBeginning;
    }

    /**
     * 设置mIsBeginning属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsBeginning(Boolean value) {
        this.mIsBeginning = value;
    }

    /**
     * 获取mIsCompensate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsCompensate() {
        return mIsCompensate;
    }

    /**
     * 设置mIsCompensate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsCompensate(Boolean value) {
        this.mIsCompensate = value;
    }

    /**
     * 获取mIsCreateAAI属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsCreateAAI() {
        return mIsCreateAAI;
    }

    /**
     * 设置mIsCreateAAI属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsCreateAAI(Boolean value) {
        this.mIsCreateAAI = value;
    }

    /**
     * 获取mIsCreatedRcv属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsCreatedRcv() {
        return mIsCreatedRcv;
    }

    /**
     * 设置mIsCreatedRcv属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsCreatedRcv(Boolean value) {
        this.mIsCreatedRcv = value;
    }

    /**
     * 获取mIsDemandCodeUnChangeable属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsDemandCodeUnChangeable() {
        return mIsDemandCodeUnChangeable;
    }

    /**
     * 设置mIsDemandCodeUnChangeable属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsDemandCodeUnChangeable(Boolean value) {
        this.mIsDemandCodeUnChangeable = value;
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
     * 获取mIsInnerShipment属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsInnerShipment() {
        return mIsInnerShipment;
    }

    /**
     * 设置mIsInnerShipment属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsInnerShipment(Boolean value) {
        this.mIsInnerShipment = value;
    }

    /**
     * 获取mIsInvoiceOrgChangeable属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsInvoiceOrgChangeable() {
        return mIsInvoiceOrgChangeable;
    }

    /**
     * 设置mIsInvoiceOrgChangeable属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsInvoiceOrgChangeable(Boolean value) {
        this.mIsInvoiceOrgChangeable = value;
    }

    /**
     * 获取mIsMachiningTrade属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsMachiningTrade() {
        return mIsMachiningTrade;
    }

    /**
     * 设置mIsMachiningTrade属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsMachiningTrade(Boolean value) {
        this.mIsMachiningTrade = value;
    }

    /**
     * 获取mIsMatchSO属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsMatchSO() {
        return mIsMatchSO;
    }

    /**
     * 设置mIsMatchSO属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsMatchSO(Boolean value) {
        this.mIsMatchSO = value;
    }

    /**
     * 获取mIsModConfirmTerm属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsModConfirmTerm() {
        return mIsModConfirmTerm;
    }

    /**
     * 设置mIsModConfirmTerm属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsModConfirmTerm(Boolean value) {
        this.mIsModConfirmTerm = value;
    }

    /**
     * 获取mIsModPriceList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsModPriceList() {
        return mIsModPriceList;
    }

    /**
     * 设置mIsModPriceList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsModPriceList(Boolean value) {
        this.mIsModPriceList = value;
    }

    /**
     * 获取mIsModRecTerm属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsModRecTerm() {
        return mIsModRecTerm;
    }

    /**
     * 设置mIsModRecTerm属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsModRecTerm(Boolean value) {
        this.mIsModRecTerm = value;
    }

    /**
     * 获取mIsModShipRule属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsModShipRule() {
        return mIsModShipRule;
    }

    /**
     * 设置mIsModShipRule属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsModShipRule(Boolean value) {
        this.mIsModShipRule = value;
    }

    /**
     * 获取mIsModifyAC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsModifyAC() {
        return mIsModifyAC;
    }

    /**
     * 设置mIsModifyAC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsModifyAC(Boolean value) {
        this.mIsModifyAC = value;
    }

    /**
     * 获取mIsModifyExRateType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsModifyExRateType() {
        return mIsModifyExRateType;
    }

    /**
     * 设置mIsModifyExRateType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsModifyExRateType(Boolean value) {
        this.mIsModifyExRateType = value;
    }

    /**
     * 获取mIsModifyTC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsModifyTC() {
        return mIsModifyTC;
    }

    /**
     * 设置mIsModifyTC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsModifyTC(Boolean value) {
        this.mIsModifyTC = value;
    }

    /**
     * 获取mIsNoCreditCheck属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsNoCreditCheck() {
        return mIsNoCreditCheck;
    }

    /**
     * 设置mIsNoCreditCheck属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsNoCreditCheck(Boolean value) {
        this.mIsNoCreditCheck = value;
    }

    /**
     * 获取mIsNoSOShipment属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsNoSOShipment() {
        return mIsNoSOShipment;
    }

    /**
     * 设置mIsNoSOShipment属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsNoSOShipment(Boolean value) {
        this.mIsNoSOShipment = value;
    }

    /**
     * 获取mIsOutTransfer属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsOutTransfer() {
        return mIsOutTransfer;
    }

    /**
     * 设置mIsOutTransfer属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsOutTransfer(Boolean value) {
        this.mIsOutTransfer = value;
    }

    /**
     * 获取mIsPreRecChangeable属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsPreRecChangeable() {
        return mIsPreRecChangeable;
    }

    /**
     * 设置mIsPreRecChangeable属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsPreRecChangeable(Boolean value) {
        this.mIsPreRecChangeable = value;
    }

    /**
     * 获取mIsPreRecPolicyChangeable属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsPreRecPolicyChangeable() {
        return mIsPreRecPolicyChangeable;
    }

    /**
     * 设置mIsPreRecPolicyChangeable属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsPreRecPolicyChangeable(Boolean value) {
        this.mIsPreRecPolicyChangeable = value;
    }

    /**
     * 获取mIsPriceIncludeTax属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsPriceIncludeTax() {
        return mIsPriceIncludeTax;
    }

    /**
     * 设置mIsPriceIncludeTax属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsPriceIncludeTax(Boolean value) {
        this.mIsPriceIncludeTax = value;
    }

    /**
     * 获取mIsRelease属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsRelease() {
        return mIsRelease;
    }

    /**
     * 设置mIsRelease属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsRelease(Boolean value) {
        this.mIsRelease = value;
    }

    /**
     * 获取mIsSMDiscountFlag属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsSMDiscountFlag() {
        return mIsSMDiscountFlag;
    }

    /**
     * 设置mIsSMDiscountFlag属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsSMDiscountFlag(Boolean value) {
        this.mIsSMDiscountFlag = value;
    }

    /**
     * 获取mIsTransPort属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsTransPort() {
        return mIsTransPort;
    }

    /**
     * 设置mIsTransPort属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsTransPort(Boolean value) {
        this.mIsTransPort = value;
    }

    /**
     * 获取mLatestArriveDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMLatestArriveDate() {
        return mLatestArriveDate;
    }

    /**
     * 设置mLatestArriveDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMLatestArriveDate(XMLGregorianCalendar value) {
        this.mLatestArriveDate = value;
    }

    /**
     * 获取mLatestShippingDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMLatestShippingDate() {
        return mLatestShippingDate;
    }

    /**
     * 设置mLatestShippingDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMLatestShippingDate(XMLGregorianCalendar value) {
        this.mLatestShippingDate = value;
    }

    /**
     * 获取mLinkman属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9SMShipShipContactData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9SMShipShipContactData> getMLinkman() {
        return mLinkman;
    }

    /**
     * 设置mLinkman属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9SMShipShipContactData }{@code >}
     *     
     */
    public void setMLinkman(JAXBElement<UFIDAU9SMShipShipContactData> value) {
        this.mLinkman = value;
    }

    /**
     * 获取mLoadLimit属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMLoadLimit() {
        return mLoadLimit;
    }

    /**
     * 设置mLoadLimit属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMLoadLimit(JAXBElement<String> value) {
        this.mLoadLimit = value;
    }

    /**
     * 获取mNetAccount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMNetAccount() {
        return mNetAccount;
    }

    /**
     * 设置mNetAccount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMNetAccount(Boolean value) {
        this.mNetAccount = value;
    }

    /**
     * 获取mObjectNeedPreRecUse属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMObjectNeedPreRecUse() {
        return mObjectNeedPreRecUse;
    }

    /**
     * 设置mObjectNeedPreRecUse属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMObjectNeedPreRecUse(BigDecimal value) {
        this.mObjectNeedPreRecUse = value;
    }

    /**
     * 获取mObjectUsablePreRecUse属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMObjectUsablePreRecUse() {
        return mObjectUsablePreRecUse;
    }

    /**
     * 设置mObjectUsablePreRecUse属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMObjectUsablePreRecUse(BigDecimal value) {
        this.mObjectUsablePreRecUse = value;
    }

    /**
     * 获取mOrderBy属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOSCMCustomerCustomerMISCInfoData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9CBOSCMCustomerCustomerMISCInfoData> getMOrderBy() {
        return mOrderBy;
    }

    /**
     * 设置mOrderBy属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOSCMCustomerCustomerMISCInfoData }{@code >}
     *     
     */
    public void setMOrderBy(JAXBElement<UFIDAU9CBOSCMCustomerCustomerMISCInfoData> value) {
        this.mOrderBy = value;
    }

    /**
     * 获取mPayer属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOSCMCustomerCustomerMISCInfoData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9CBOSCMCustomerCustomerMISCInfoData> getMPayer() {
        return mPayer;
    }

    /**
     * 设置mPayer属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOSCMCustomerCustomerMISCInfoData }{@code >}
     *     
     */
    public void setMPayer(JAXBElement<UFIDAU9CBOSCMCustomerCustomerMISCInfoData> value) {
        this.mPayer = value;
    }

    /**
     * 获取mPayerSite属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOSCMCustomerCustomerSiteMISCInfoData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9CBOSCMCustomerCustomerSiteMISCInfoData> getMPayerSite() {
        return mPayerSite;
    }

    /**
     * 设置mPayerSite属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOSCMCustomerCustomerSiteMISCInfoData }{@code >}
     *     
     */
    public void setMPayerSite(JAXBElement<UFIDAU9CBOSCMCustomerCustomerSiteMISCInfoData> value) {
        this.mPayerSite = value;
    }

    /**
     * 获取mPolicyHolder属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMPolicyHolder() {
        return mPolicyHolder;
    }

    /**
     * 设置mPolicyHolder属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMPolicyHolder(JAXBElement<String> value) {
        this.mPolicyHolder = value;
    }

    /**
     * 获取mPreRecLackMoney属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMPreRecLackMoney() {
        return mPreRecLackMoney;
    }

    /**
     * 设置mPreRecLackMoney属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMPreRecLackMoney(BigDecimal value) {
        this.mPreRecLackMoney = value;
    }

    /**
     * 获取mPreRecLackRate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMPreRecLackRate() {
        return mPreRecLackRate;
    }

    /**
     * 设置mPreRecLackRate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMPreRecLackRate(BigDecimal value) {
        this.mPreRecLackRate = value;
    }

    /**
     * 获取mPreRecListStr属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMPreRecListStr() {
        return mPreRecListStr;
    }

    /**
     * 设置mPreRecListStr属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMPreRecListStr(JAXBElement<String> value) {
        this.mPreRecListStr = value;
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
     * 获取mPreRecObject属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMPreRecObject() {
        return mPreRecObject;
    }

    /**
     * 设置mPreRecObject属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMPreRecObject(Integer value) {
        this.mPreRecObject = value;
    }

    /**
     * 获取mPreRecObjectUse属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMPreRecObjectUse() {
        return mPreRecObjectUse;
    }

    /**
     * 设置mPreRecObjectUse属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMPreRecObjectUse(BigDecimal value) {
        this.mPreRecObjectUse = value;
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
     * 获取mPreRecUse属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMPreRecUse() {
        return mPreRecUse;
    }

    /**
     * 设置mPreRecUse属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMPreRecUse(BigDecimal value) {
        this.mPreRecUse = value;
    }

    /**
     * 获取mPrecisionACFC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMPrecisionACFC() {
        return mPrecisionACFC;
    }

    /**
     * 设置mPrecisionACFC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMPrecisionACFC(Integer value) {
        this.mPrecisionACFC = value;
    }

    /**
     * 获取mPriceList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMPriceList() {
        return mPriceList;
    }

    /**
     * 设置mPriceList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMPriceList(Long value) {
        this.mPriceList = value;
    }

    /**
     * 获取mPriceListName属性的值。
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
     * 设置mPriceListName属性的值。
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
     * 获取mPriceListNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMPriceListNo() {
        return mPriceListNo;
    }

    /**
     * 设置mPriceListNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMPriceListNo(JAXBElement<String> value) {
        this.mPriceListNo = value;
    }

    /**
     * 获取mProducingArea属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMProducingArea() {
        return mProducingArea;
    }

    /**
     * 设置mProducingArea属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMProducingArea(JAXBElement<String> value) {
        this.mProducingArea = value;
    }

    /**
     * 获取mProductName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMProductName() {
        return mProductName;
    }

    /**
     * 设置mProductName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMProductName(JAXBElement<String> value) {
        this.mProductName = value;
    }

    /**
     * 获取mRecBillLineKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMRecBillLineKey() {
        return mRecBillLineKey;
    }

    /**
     * 设置mRecBillLineKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMRecBillLineKey(Long value) {
        this.mRecBillLineKey = value;
    }

    /**
     * 获取mRecBillLineNO属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMRecBillLineNO() {
        return mRecBillLineNO;
    }

    /**
     * 设置mRecBillLineNO属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMRecBillLineNO(Integer value) {
        this.mRecBillLineNO = value;
    }

    /**
     * 获取mReceivalCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMReceivalCode() {
        return mReceivalCode;
    }

    /**
     * 设置mReceivalCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMReceivalCode(JAXBElement<String> value) {
        this.mReceivalCode = value;
    }

    /**
     * 获取mReceiveBillKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMReceiveBillKey() {
        return mReceiveBillKey;
    }

    /**
     * 设置mReceiveBillKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMReceiveBillKey(Long value) {
        this.mReceiveBillKey = value;
    }

    /**
     * 获取mReceiveBillNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMReceiveBillNo() {
        return mReceiveBillNo;
    }

    /**
     * 设置mReceiveBillNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMReceiveBillNo(JAXBElement<String> value) {
        this.mReceiveBillNo = value;
    }

    /**
     * 获取mRecipients属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9SMShipShipContactData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9SMShipShipContactData> getMRecipients() {
        return mRecipients;
    }

    /**
     * 设置mRecipients属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9SMShipShipContactData }{@code >}
     *     
     */
    public void setMRecipients(JAXBElement<UFIDAU9SMShipShipContactData> value) {
        this.mRecipients = value;
    }

    /**
     * 获取mReleaseTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMReleaseTime() {
        return mReleaseTime;
    }

    /**
     * 设置mReleaseTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMReleaseTime(XMLGregorianCalendar value) {
        this.mReleaseTime = value;
    }

    /**
     * 获取msobPeriods属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUFIDAU9SMShipSOBPeriodData }{@code >}
     *     
     */
    public JAXBElement<ArrayOfUFIDAU9SMShipSOBPeriodData> getMSOBPeriods() {
        return msobPeriods;
    }

    /**
     * 设置msobPeriods属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUFIDAU9SMShipSOBPeriodData }{@code >}
     *     
     */
    public void setMSOBPeriods(JAXBElement<ArrayOfUFIDAU9SMShipSOBPeriodData> value) {
        this.msobPeriods = value;
    }

    /**
     * 获取mSalverQty属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMSalverQty() {
        return mSalverQty;
    }

    /**
     * 设置mSalverQty属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMSalverQty(Integer value) {
        this.mSalverQty = value;
    }

    /**
     * 获取mShipAchievements属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUFIDAU9SMShipShipAchievementData }{@code >}
     *     
     */
    public JAXBElement<ArrayOfUFIDAU9SMShipShipAchievementData> getMShipAchievements() {
        return mShipAchievements;
    }

    /**
     * 设置mShipAchievements属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUFIDAU9SMShipShipAchievementData }{@code >}
     *     
     */
    public void setMShipAchievements(JAXBElement<ArrayOfUFIDAU9SMShipShipAchievementData> value) {
        this.mShipAchievements = value;
    }

    /**
     * 获取mShipAddresss属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUFIDAU9SMShipShipAddressData }{@code >}
     *     
     */
    public JAXBElement<ArrayOfUFIDAU9SMShipShipAddressData> getMShipAddresss() {
        return mShipAddresss;
    }

    /**
     * 设置mShipAddresss属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUFIDAU9SMShipShipAddressData }{@code >}
     *     
     */
    public void setMShipAddresss(JAXBElement<ArrayOfUFIDAU9SMShipShipAddressData> value) {
        this.mShipAddresss = value;
    }

    /**
     * 获取mShipCompany属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMShipCompany() {
        return mShipCompany;
    }

    /**
     * 设置mShipCompany属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMShipCompany(JAXBElement<String> value) {
        this.mShipCompany = value;
    }

    /**
     * 获取mShipConfirmDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMShipConfirmDate() {
        return mShipConfirmDate;
    }

    /**
     * 设置mShipConfirmDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMShipConfirmDate(XMLGregorianCalendar value) {
        this.mShipConfirmDate = value;
    }

    /**
     * 获取mShipContacts属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUFIDAU9SMShipShipContactData }{@code >}
     *     
     */
    public JAXBElement<ArrayOfUFIDAU9SMShipShipContactData> getMShipContacts() {
        return mShipContacts;
    }

    /**
     * 设置mShipContacts属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUFIDAU9SMShipShipContactData }{@code >}
     *     
     */
    public void setMShipContacts(JAXBElement<ArrayOfUFIDAU9SMShipShipContactData> value) {
        this.mShipContacts = value;
    }

    /**
     * 获取mShipDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMShipDate() {
        return mShipDate;
    }

    /**
     * 设置mShipDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMShipDate(XMLGregorianCalendar value) {
        this.mShipDate = value;
    }

    /**
     * 获取mShipDiscounts属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUFIDAU9SMShipShipLineDiscountData }{@code >}
     *     
     */
    public JAXBElement<ArrayOfUFIDAU9SMShipShipLineDiscountData> getMShipDiscounts() {
        return mShipDiscounts;
    }

    /**
     * 设置mShipDiscounts属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUFIDAU9SMShipShipLineDiscountData }{@code >}
     *     
     */
    public void setMShipDiscounts(JAXBElement<ArrayOfUFIDAU9SMShipShipLineDiscountData> value) {
        this.mShipDiscounts = value;
    }

    /**
     * 获取mShipFees属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUFIDAU9SMShipShipFeeData }{@code >}
     *     
     */
    public JAXBElement<ArrayOfUFIDAU9SMShipShipFeeData> getMShipFees() {
        return mShipFees;
    }

    /**
     * 设置mShipFees属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUFIDAU9SMShipShipFeeData }{@code >}
     *     
     */
    public void setMShipFees(JAXBElement<ArrayOfUFIDAU9SMShipShipFeeData> value) {
        this.mShipFees = value;
    }

    /**
     * 获取mShipLines属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUFIDAU9SMShipShipLineData }{@code >}
     *     
     */
    public JAXBElement<ArrayOfUFIDAU9SMShipShipLineData> getMShipLines() {
        return mShipLines;
    }

    /**
     * 设置mShipLines属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUFIDAU9SMShipShipLineData }{@code >}
     *     
     */
    public void setMShipLines(JAXBElement<ArrayOfUFIDAU9SMShipShipLineData> value) {
        this.mShipLines = value;
    }

    /**
     * 获取mShipMode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMShipMode() {
        return mShipMode;
    }

    /**
     * 设置mShipMode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMShipMode(Integer value) {
        this.mShipMode = value;
    }

    /**
     * 获取mShipName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMShipName() {
        return mShipName;
    }

    /**
     * 设置mShipName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMShipName(JAXBElement<String> value) {
        this.mShipName = value;
    }

    /**
     * 获取mShipTaxs属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUFIDAU9SMShipShipTaxData }{@code >}
     *     
     */
    public JAXBElement<ArrayOfUFIDAU9SMShipShipTaxData> getMShipTaxs() {
        return mShipTaxs;
    }

    /**
     * 设置mShipTaxs属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUFIDAU9SMShipShipTaxData }{@code >}
     *     
     */
    public void setMShipTaxs(JAXBElement<ArrayOfUFIDAU9SMShipShipTaxData> value) {
        this.mShipTaxs = value;
    }

    /**
     * 获取mShippingDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMShippingDate() {
        return mShippingDate;
    }

    /**
     * 设置mShippingDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMShippingDate(XMLGregorianCalendar value) {
        this.mShippingDate = value;
    }

    /**
     * 获取mShippingPortLinkman属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMShippingPortLinkman() {
        return mShippingPortLinkman;
    }

    /**
     * 设置mShippingPortLinkman属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMShippingPortLinkman(JAXBElement<String> value) {
        this.mShippingPortLinkman = value;
    }

    /**
     * 获取mSignInBy属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMSignInBy() {
        return mSignInBy;
    }

    /**
     * 设置mSignInBy属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMSignInBy(Integer value) {
        this.mSignInBy = value;
    }

    /**
     * 获取mSignInTotalTaxAC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMSignInTotalTaxAC() {
        return mSignInTotalTaxAC;
    }

    /**
     * 设置mSignInTotalTaxAC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMSignInTotalTaxAC(BigDecimal value) {
        this.mSignInTotalTaxAC = value;
    }

    /**
     * 获取mSignInTotalTaxFC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMSignInTotalTaxFC() {
        return mSignInTotalTaxFC;
    }

    /**
     * 设置mSignInTotalTaxFC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMSignInTotalTaxFC(BigDecimal value) {
        this.mSignInTotalTaxFC = value;
    }

    /**
     * 获取mSignInTotalTaxTC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMSignInTotalTaxTC() {
        return mSignInTotalTaxTC;
    }

    /**
     * 设置mSignInTotalTaxTC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMSignInTotalTaxTC(BigDecimal value) {
        this.mSignInTotalTaxTC = value;
    }

    /**
     * 获取mSpecialInsurance属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMSpecialInsurance() {
        return mSpecialInsurance;
    }

    /**
     * 设置mSpecialInsurance属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMSpecialInsurance(JAXBElement<String> value) {
        this.mSpecialInsurance = value;
    }

    /**
     * 获取mSrcDocType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMSrcDocType() {
        return mSrcDocType;
    }

    /**
     * 设置mSrcDocType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMSrcDocType(Integer value) {
        this.mSrcDocType = value;
    }

    /**
     * 获取mStatus属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMStatus() {
        return mStatus;
    }

    /**
     * 设置mStatus属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMStatus(Integer value) {
        this.mStatus = value;
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

    /**
     * 获取mTaxFreeNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMTaxFreeNo() {
        return mTaxFreeNo;
    }

    /**
     * 设置mTaxFreeNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMTaxFreeNo(JAXBElement<String> value) {
        this.mTaxFreeNo = value;
    }

    /**
     * 获取mTotalDiscount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMTotalDiscount() {
        return mTotalDiscount;
    }

    /**
     * 设置mTotalDiscount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMTotalDiscount(BigDecimal value) {
        this.mTotalDiscount = value;
    }

    /**
     * 获取mTotalDiscountFC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMTotalDiscountFC() {
        return mTotalDiscountFC;
    }

    /**
     * 设置mTotalDiscountFC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMTotalDiscountFC(BigDecimal value) {
        this.mTotalDiscountFC = value;
    }

    /**
     * 获取mTotalDiscountTC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMTotalDiscountTC() {
        return mTotalDiscountTC;
    }

    /**
     * 设置mTotalDiscountTC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMTotalDiscountTC(BigDecimal value) {
        this.mTotalDiscountTC = value;
    }

    /**
     * 获取mTotalFee属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMTotalFee() {
        return mTotalFee;
    }

    /**
     * 设置mTotalFee属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMTotalFee(BigDecimal value) {
        this.mTotalFee = value;
    }

    /**
     * 获取mTotalFeeFC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMTotalFeeFC() {
        return mTotalFeeFC;
    }

    /**
     * 设置mTotalFeeFC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMTotalFeeFC(BigDecimal value) {
        this.mTotalFeeFC = value;
    }

    /**
     * 获取mTotalFeeTC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMTotalFeeTC() {
        return mTotalFeeTC;
    }

    /**
     * 设置mTotalFeeTC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMTotalFeeTC(BigDecimal value) {
        this.mTotalFeeTC = value;
    }

    /**
     * 获取mTotalMoney属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMTotalMoney() {
        return mTotalMoney;
    }

    /**
     * 设置mTotalMoney属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMTotalMoney(BigDecimal value) {
        this.mTotalMoney = value;
    }

    /**
     * 获取mTotalMoneyFC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMTotalMoneyFC() {
        return mTotalMoneyFC;
    }

    /**
     * 设置mTotalMoneyFC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMTotalMoneyFC(BigDecimal value) {
        this.mTotalMoneyFC = value;
    }

    /**
     * 获取mTotalMoneyTC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMTotalMoneyTC() {
        return mTotalMoneyTC;
    }

    /**
     * 设置mTotalMoneyTC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMTotalMoneyTC(BigDecimal value) {
        this.mTotalMoneyTC = value;
    }

    /**
     * 获取mTotalNetMoneyAC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMTotalNetMoneyAC() {
        return mTotalNetMoneyAC;
    }

    /**
     * 设置mTotalNetMoneyAC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMTotalNetMoneyAC(BigDecimal value) {
        this.mTotalNetMoneyAC = value;
    }

    /**
     * 获取mTotalNetMoneyFC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMTotalNetMoneyFC() {
        return mTotalNetMoneyFC;
    }

    /**
     * 设置mTotalNetMoneyFC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMTotalNetMoneyFC(BigDecimal value) {
        this.mTotalNetMoneyFC = value;
    }

    /**
     * 获取mTotalNetMoneyTC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMTotalNetMoneyTC() {
        return mTotalNetMoneyTC;
    }

    /**
     * 设置mTotalNetMoneyTC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMTotalNetMoneyTC(BigDecimal value) {
        this.mTotalNetMoneyTC = value;
    }

    /**
     * 获取mTotalPieces属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMTotalPieces() {
        return mTotalPieces;
    }

    /**
     * 设置mTotalPieces属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMTotalPieces(JAXBElement<String> value) {
        this.mTotalPieces = value;
    }

    /**
     * 获取mTotalTax属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMTotalTax() {
        return mTotalTax;
    }

    /**
     * 设置mTotalTax属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMTotalTax(BigDecimal value) {
        this.mTotalTax = value;
    }

    /**
     * 获取mTotalTaxFC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMTotalTaxFC() {
        return mTotalTaxFC;
    }

    /**
     * 设置mTotalTaxFC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMTotalTaxFC(BigDecimal value) {
        this.mTotalTaxFC = value;
    }

    /**
     * 获取mTotalTaxTC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMTotalTaxTC() {
        return mTotalTaxTC;
    }

    /**
     * 设置mTotalTaxTC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMTotalTaxTC(BigDecimal value) {
        this.mTotalTaxTC = value;
    }

    /**
     * 获取mTradeMode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMTradeMode() {
        return mTradeMode;
    }

    /**
     * 设置mTradeMode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMTradeMode(Integer value) {
        this.mTradeMode = value;
    }

    /**
     * 获取mTrainNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMTrainNo() {
        return mTrainNo;
    }

    /**
     * 设置mTrainNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMTrainNo(JAXBElement<String> value) {
        this.mTrainNo = value;
    }

    /**
     * 获取mTransInSite属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9SMShipShipAddressData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9SMShipShipAddressData> getMTransInSite() {
        return mTransInSite;
    }

    /**
     * 设置mTransInSite属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9SMShipShipAddressData }{@code >}
     *     
     */
    public void setMTransInSite(JAXBElement<UFIDAU9SMShipShipAddressData> value) {
        this.mTransInSite = value;
    }

    /**
     * 获取mTransportLinkman属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9SMShipShipContactData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9SMShipShipContactData> getMTransportLinkman() {
        return mTransportLinkman;
    }

    /**
     * 设置mTransportLinkman属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9SMShipShipContactData }{@code >}
     *     
     */
    public void setMTransportLinkman(JAXBElement<UFIDAU9SMShipShipContactData> value) {
        this.mTransportLinkman = value;
    }

    /**
     * 获取mUnApproveDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMUnApproveDate() {
        return mUnApproveDate;
    }

    /**
     * 设置mUnApproveDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMUnApproveDate(XMLGregorianCalendar value) {
        this.mUnApproveDate = value;
    }

    /**
     * 获取mUnApproveMan属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMUnApproveMan() {
        return mUnApproveMan;
    }

    /**
     * 设置mUnApproveMan属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMUnApproveMan(JAXBElement<String> value) {
        this.mUnApproveMan = value;
    }

    /**
     * 获取mwfCurrentState属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMWFCurrentState() {
        return mwfCurrentState;
    }

    /**
     * 设置mwfCurrentState属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMWFCurrentState(Integer value) {
        this.mwfCurrentState = value;
    }

    /**
     * 获取mwfOriginalState属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMWFOriginalState() {
        return mwfOriginalState;
    }

    /**
     * 设置mwfOriginalState属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMWFOriginalState(Integer value) {
        this.mwfOriginalState = value;
    }

    /**
     * 获取mWarningMessage属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMWarningMessage() {
        return mWarningMessage;
    }

    /**
     * 设置mWarningMessage属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMWarningMessage(JAXBElement<String> value) {
        this.mWarningMessage = value;
    }

    /**
     * 获取mWarpRatio属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMWarpRatio() {
        return mWarpRatio;
    }

    /**
     * 设置mWarpRatio属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMWarpRatio(BigDecimal value) {
        this.mWarpRatio = value;
    }

}
