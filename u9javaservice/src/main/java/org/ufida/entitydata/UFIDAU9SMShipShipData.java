
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
 * &lt;p&gt;UFIDA.U9.SM.Ship.ShipData complex type�� Java �ࡣ
 * 
 * &lt;p&gt;����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡac���Ե�ֵ��
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
     * ����ac���Ե�ֵ��
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
     * ��ȡacsKey���Ե�ֵ��
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
     * ����acsKey���Ե�ֵ��
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
     * ��ȡaccountOrg���Ե�ֵ��
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
     * ����accountOrg���Ե�ֵ��
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
     * ��ȡaccountOrgSKey���Ե�ֵ��
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
     * ����accountOrgSKey���Ե�ֵ��
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
     * ��ȡaimPort���Ե�ֵ��
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
     * ����aimPort���Ե�ֵ��
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
     * ��ȡaimPortSKey���Ե�ֵ��
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
     * ����aimPortSKey���Ե�ֵ��
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
     * ��ȡcarrierLinkmanSKey���Ե�ֵ��
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
     * ����carrierLinkmanSKey���Ե�ֵ��
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
     * ��ȡchannel���Ե�ֵ��
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
     * ����channel���Ե�ֵ��
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
     * ��ȡconfirmTerm���Ե�ֵ��
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
     * ����confirmTerm���Ե�ֵ��
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
     * ��ȡconfirmTermSKey���Ե�ֵ��
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
     * ����confirmTermSKey���Ե�ֵ��
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
     * ��ȡcusAgentWH���Ե�ֵ��
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
     * ����cusAgentWH���Ե�ֵ��
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
     * ��ȡcusAgentWHSKey���Ե�ֵ��
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
     * ����cusAgentWHSKey���Ե�ֵ��
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
     * ��ȡdestination���Ե�ֵ��
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
     * ����destination���Ե�ֵ��
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
     * ��ȡdestinationSKey���Ե�ֵ��
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
     * ����destinationSKey���Ե�ֵ��
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
     * ��ȡdocumentType���Ե�ֵ��
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
     * ����documentType���Ե�ֵ��
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
     * ��ȡdocumentTypeSKey���Ե�ֵ��
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
     * ����documentTypeSKey���Ե�ֵ��
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
     * ��ȡfc���Ե�ֵ��
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
     * ����fc���Ե�ֵ��
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
     * ��ȡfcsKey���Ե�ֵ��
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
     * ����fcsKey���Ե�ֵ��
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
     * ��ȡinsuranceCurrency���Ե�ֵ��
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
     * ����insuranceCurrency���Ե�ֵ��
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
     * ��ȡinsuranceCurrencySKey���Ե�ֵ��
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
     * ����insuranceCurrencySKey���Ե�ֵ��
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
     * ��ȡinvoiceOrg���Ե�ֵ��
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
     * ����invoiceOrg���Ե�ֵ��
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
     * ��ȡinvoiceOrgSKey���Ե�ֵ��
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
     * ����invoiceOrgSKey���Ե�ֵ��
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
     * ��ȡkeepAccountsPeriod���Ե�ֵ��
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
     * ����keepAccountsPeriod���Ե�ֵ��
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
     * ��ȡkeepAccountsPeriodSKey���Ե�ֵ��
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
     * ����keepAccountsPeriodSKey���Ե�ֵ��
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
     * ��ȡlinkmanSKey���Ե�ֵ��
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
     * ����linkmanSKey���Ե�ֵ��
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
     * ��ȡmultiChannel���Ե�ֵ��
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
     * ����multiChannel���Ե�ֵ��
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
     * ��ȡmultiShipMemo���Ե�ֵ��
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
     * ����multiShipMemo���Ե�ֵ��
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
     * ��ȡoperatingOrg���Ե�ֵ��
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
     * ����operatingOrg���Ե�ֵ��
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
     * ��ȡoperatingOrgSKey���Ե�ֵ��
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
     * ����operatingOrgSKey���Ե�ֵ��
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
     * ��ȡpassPort���Ե�ֵ��
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
     * ����passPort���Ե�ֵ��
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
     * ��ȡpassPortSKey���Ե�ֵ��
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
     * ����passPortSKey���Ե�ֵ��
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
     * ��ȡpreRecPolicy���Ե�ֵ��
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
     * ����preRecPolicy���Ե�ֵ��
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
     * ��ȡpreRecPolicyLine���Ե�ֵ��
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
     * ����preRecPolicyLine���Ե�ֵ��
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
     * ��ȡpreRecPolicyLineSKey���Ե�ֵ��
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
     * ����preRecPolicyLineSKey���Ե�ֵ��
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
     * ��ȡpreRecPolicySKey���Ե�ֵ��
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
     * ����preRecPolicySKey���Ե�ֵ��
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
     * ��ȡreceivableTerm���Ե�ֵ��
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
     * ����receivableTerm���Ե�ֵ��
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
     * ��ȡreceivableTermSKey���Ե�ֵ��
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
     * ����receivableTermSKey���Ե�ֵ��
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
     * ��ȡrecipientsSKey���Ե�ֵ��
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
     * ����recipientsSKey���Ե�ֵ��
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
     * ��ȡreleaseMan���Ե�ֵ��
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
     * ����releaseMan���Ե�ֵ��
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
     * ��ȡreleaseManSKey���Ե�ֵ��
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
     * ����releaseManSKey���Ե�ֵ��
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
     * ��ȡsailingCompany���Ե�ֵ��
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
     * ����sailingCompany���Ե�ֵ��
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
     * ��ȡsailingCompanySKey���Ե�ֵ��
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
     * ����sailingCompanySKey���Ե�ֵ��
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
     * ��ȡsaleDept���Ե�ֵ��
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
     * ����saleDept���Ե�ֵ��
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
     * ��ȡsaleDeptSKey���Ե�ֵ��
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
     * ����saleDeptSKey���Ե�ֵ��
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
     * ��ȡseller���Ե�ֵ��
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
     * ����seller���Ե�ֵ��
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
     * ��ȡsellerSKey���Ե�ֵ��
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
     * ����sellerSKey���Ե�ֵ��
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
     * ��ȡsettlementOrg���Ե�ֵ��
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
     * ����settlementOrg���Ե�ֵ��
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
     * ��ȡsettlementOrgSKey���Ե�ֵ��
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
     * ����settlementOrgSKey���Ե�ֵ��
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
     * ��ȡshipLinkman���Ե�ֵ��
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
     * ����shipLinkman���Ե�ֵ��
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
     * ��ȡshipLinkmanSKey���Ե�ֵ��
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
     * ����shipLinkmanSKey���Ե�ֵ��
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
     * ��ȡshipMemo���Ե�ֵ��
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
     * ����shipMemo���Ե�ֵ��
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
     * ��ȡshipOrg���Ե�ֵ��
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
     * ����shipOrg���Ե�ֵ��
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
     * ��ȡshipOrgSKey���Ե�ֵ��
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
     * ����shipOrgSKey���Ե�ֵ��
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
     * ��ȡshipmentRule���Ե�ֵ��
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
     * ����shipmentRule���Ե�ֵ��
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
     * ��ȡshipmentRuleSKey���Ե�ֵ��
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
     * ����shipmentRuleSKey���Ե�ֵ��
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
     * ��ȡshippingPort���Ե�ֵ��
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
     * ����shippingPort���Ե�ֵ��
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
     * ��ȡshippingPortSKey���Ե�ֵ��
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
     * ����shippingPortSKey���Ե�ֵ��
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
     * ��ȡtc���Ե�ֵ��
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
     * ����tc���Ե�ֵ��
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
     * ��ȡtcsKey���Ե�ֵ��
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
     * ����tcsKey���Ե�ֵ��
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
     * ��ȡtransInSiteSKey���Ե�ֵ��
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
     * ����transInSiteSKey���Ե�ֵ��
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
     * ��ȡtransMode���Ե�ֵ��
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
     * ����transMode���Ե�ֵ��
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
     * ��ȡtransModeSKey���Ե�ֵ��
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
     * ����transModeSKey���Ե�ֵ��
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
     * ��ȡtransportLinkmanSKey���Ե�ֵ��
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
     * ����transportLinkmanSKey���Ե�ֵ��
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
     * ��ȡwhSite���Ե�ֵ��
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
     * ����whSite���Ե�ֵ��
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
     * ��ȡwhSiteSKey���Ե�ֵ��
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
     * ����whSiteSKey���Ե�ֵ��
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
     * ��ȡmacToFCExRate���Ե�ֵ��
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
     * ����macToFCExRate���Ե�ֵ��
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
     * ��ȡmarBillKey���Ե�ֵ��
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
     * ����marBillKey���Ե�ֵ��
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
     * ��ȡmarBillLineKey���Ե�ֵ��
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
     * ����marBillLineKey���Ե�ֵ��
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
     * ��ȡmarBillLineNo���Ե�ֵ��
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
     * ����marBillLineNo���Ե�ֵ��
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
     * ��ȡmarBillNo���Ե�ֵ��
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
     * ����marBillNo���Ե�ֵ��
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
     * ��ȡmarMoneyAC���Ե�ֵ��
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
     * ����marMoneyAC���Ե�ֵ��
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
     * ��ȡmarMoneyFC���Ե�ֵ��
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
     * ����marMoneyFC���Ե�ֵ��
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
     * ��ȡmarMoneyTC���Ե�ֵ��
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
     * ����marMoneyTC���Ե�ֵ��
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
     * ��ȡmActivityType���Ե�ֵ��
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
     * ����mActivityType���Ե�ֵ��
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
     * ��ȡmActualShippingDate���Ե�ֵ��
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
     * ����mActualShippingDate���Ե�ֵ��
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
     * ��ȡmAimPortLinkman���Ե�ֵ��
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
     * ����mAimPortLinkman���Ե�ֵ��
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
     * ��ȡmAllotAchievement���Ե�ֵ��
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
     * ����mAllotAchievement���Ե�ֵ��
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
     * ��ȡmApproveDate���Ե�ֵ��
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
     * ����mApproveDate���Ե�ֵ��
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
     * ��ȡmApproveMan���Ե�ֵ��
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
     * ����mApproveMan���Ե�ֵ��
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
     * ��ȡmBargainMode���Ե�ֵ��
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
     * ����mBargainMode���Ե�ֵ��
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
     * ��ȡmBillOfLadingNo���Ե�ֵ��
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
     * ����mBillOfLadingNo���Ե�ֵ��
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
     * ��ȡmBillToSite���Ե�ֵ��
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
     * ����mBillToSite���Ե�ֵ��
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
     * ��ȡmBizType���Ե�ֵ��
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
     * ����mBizType���Ե�ֵ��
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
     * ��ȡmBoxType���Ե�ֵ��
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
     * ����mBoxType���Ե�ֵ��
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
     * ��ȡmBoxingNo���Ե�ֵ��
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
     * ����mBoxingNo���Ե�ֵ��
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
     * ��ȡmBoxingType���Ե�ֵ��
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
     * ����mBoxingType���Ե�ֵ��
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
     * ��ȡmcaTotalTaxAC���Ե�ֵ��
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
     * ����mcaTotalTaxAC���Ե�ֵ��
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
     * ��ȡmcaTotalTaxFC���Ե�ֵ��
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
     * ����mcaTotalTaxFC���Ե�ֵ��
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
     * ��ȡmcaTotalTaxTC���Ե�ֵ��
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
     * ����mcaTotalTaxTC���Ե�ֵ��
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
     * ��ȡmCarriagePayMode���Ե�ֵ��
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
     * ����mCarriagePayMode���Ե�ֵ��
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
     * ��ȡmCarrierLinkman���Ե�ֵ��
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
     * ����mCarrierLinkman���Ե�ֵ��
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
     * ��ȡmCommonInsurance���Ե�ֵ��
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
     * ����mCommonInsurance���Ե�ֵ��
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
     * ��ȡmContainerNo���Ե�ֵ��
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
     * ����mContainerNo���Ե�ֵ��
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
     * ��ȡmContainerQty���Ե�ֵ��
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
     * ����mContainerQty���Ե�ֵ��
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
     * ��ȡmContainerSize���Ե�ֵ��
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
     * ����mContainerSize���Ե�ֵ��
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
     * ��ȡmContainerTotalQty���Ե�ֵ��
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
     * ����mContainerTotalQty���Ե�ֵ��
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
     * ��ȡmCooperateStatus���Ե�ֵ��
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
     * ����mCooperateStatus���Ե�ֵ��
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
     * ��ȡmCooperateType���Ե�ֵ��
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
     * ����mCooperateType���Ե�ֵ��
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
     * ��ȡmCustomsBroker���Ե�ֵ��
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
     * ����mCustomsBroker���Ե�ֵ��
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
     * ��ȡmDemandCode���Ե�ֵ��
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
     * ����mDemandCode���Ե�ֵ��
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
     * ��ȡmExceptionDealAnnounce���Ե�ֵ��
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
     * ����mExceptionDealAnnounce���Ե�ֵ��
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
     * ��ȡmExchangeRateType���Ե�ֵ��
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
     * ����mExchangeRateType���Ե�ֵ��
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
     * ��ȡmExecutedARMoneyAC���Ե�ֵ��
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
     * ����mExecutedARMoneyAC���Ե�ֵ��
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
     * ��ȡmExecutedARMoneyTC���Ե�ֵ��
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
     * ����mExecutedARMoneyTC���Ե�ֵ��
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
     * ��ȡmFeeSourceBillType���Ե�ֵ��
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
     * ����mFeeSourceBillType���Ե�ֵ��
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
     * ��ȡmFinanceCloseFlag���Ե�ֵ��
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
     * ����mFinanceCloseFlag���Ե�ֵ��
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
     * ��ȡmFlightNo���Ե�ֵ��
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
     * ����mFlightNo���Ե�ֵ��
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
     * ��ȡmHeadFee���Ե�ֵ��
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
     * ����mHeadFee���Ե�ֵ��
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
     * ��ȡmHeadFeeFC���Ե�ֵ��
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
     * ����mHeadFeeFC���Ե�ֵ��
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
     * ��ȡmHeadFeeTC���Ե�ֵ��
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
     * ����mHeadFeeTC���Ե�ֵ��
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
     * ��ȡmInnerSupersedeEnum���Ե�ֵ��
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
     * ����mInnerSupersedeEnum���Ե�ֵ��
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
     * ��ȡmInsurance���Ե�ֵ��
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
     * ����mInsurance���Ե�ֵ��
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
     * ��ȡmInsuranceTerm���Ե�ֵ��
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
     * ����mInsuranceTerm���Ե�ֵ��
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
     * ��ȡmInsuranceType���Ե�ֵ��
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
     * ����mInsuranceType���Ե�ֵ��
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
     * ��ȡmInsureRatio���Ե�ֵ��
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
     * ����mInsureRatio���Ե�ֵ��
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
     * ��ȡmIntendArriveDate���Ե�ֵ��
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
     * ����mIntendArriveDate���Ե�ֵ��
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
     * ��ȡmInvoiceNo���Ե�ֵ��
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
     * ����mInvoiceNo���Ե�ֵ��
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
     * ��ȡmIsARFlag���Ե�ֵ��
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
     * ����mIsARFlag���Ե�ֵ��
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
     * ��ȡmIsAccountOrgChangeable���Ե�ֵ��
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
     * ����mIsAccountOrgChangeable���Ե�ֵ��
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
     * ��ȡmIsAllowHeadPreAR���Ե�ֵ��
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
     * ����mIsAllowHeadPreAR���Ե�ֵ��
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
     * ��ȡmIsBatch���Ե�ֵ��
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
     * ����mIsBatch���Ե�ֵ��
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
     * ��ȡmIsBeginning���Ե�ֵ��
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
     * ����mIsBeginning���Ե�ֵ��
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
     * ��ȡmIsCompensate���Ե�ֵ��
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
     * ����mIsCompensate���Ե�ֵ��
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
     * ��ȡmIsCreateAAI���Ե�ֵ��
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
     * ����mIsCreateAAI���Ե�ֵ��
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
     * ��ȡmIsCreatedRcv���Ե�ֵ��
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
     * ����mIsCreatedRcv���Ե�ֵ��
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
     * ��ȡmIsDemandCodeUnChangeable���Ե�ֵ��
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
     * ����mIsDemandCodeUnChangeable���Ե�ֵ��
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
     * ��ȡmIsInnerShipment���Ե�ֵ��
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
     * ����mIsInnerShipment���Ե�ֵ��
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
     * ��ȡmIsInvoiceOrgChangeable���Ե�ֵ��
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
     * ����mIsInvoiceOrgChangeable���Ե�ֵ��
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
     * ��ȡmIsMachiningTrade���Ե�ֵ��
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
     * ����mIsMachiningTrade���Ե�ֵ��
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
     * ��ȡmIsMatchSO���Ե�ֵ��
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
     * ����mIsMatchSO���Ե�ֵ��
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
     * ��ȡmIsModConfirmTerm���Ե�ֵ��
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
     * ����mIsModConfirmTerm���Ե�ֵ��
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
     * ��ȡmIsModPriceList���Ե�ֵ��
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
     * ����mIsModPriceList���Ե�ֵ��
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
     * ��ȡmIsModRecTerm���Ե�ֵ��
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
     * ����mIsModRecTerm���Ե�ֵ��
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
     * ��ȡmIsModShipRule���Ե�ֵ��
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
     * ����mIsModShipRule���Ե�ֵ��
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
     * ��ȡmIsModifyAC���Ե�ֵ��
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
     * ����mIsModifyAC���Ե�ֵ��
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
     * ��ȡmIsModifyExRateType���Ե�ֵ��
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
     * ����mIsModifyExRateType���Ե�ֵ��
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
     * ��ȡmIsModifyTC���Ե�ֵ��
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
     * ����mIsModifyTC���Ե�ֵ��
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
     * ��ȡmIsNoCreditCheck���Ե�ֵ��
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
     * ����mIsNoCreditCheck���Ե�ֵ��
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
     * ��ȡmIsNoSOShipment���Ե�ֵ��
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
     * ����mIsNoSOShipment���Ե�ֵ��
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
     * ��ȡmIsOutTransfer���Ե�ֵ��
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
     * ����mIsOutTransfer���Ե�ֵ��
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
     * ��ȡmIsPreRecChangeable���Ե�ֵ��
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
     * ����mIsPreRecChangeable���Ե�ֵ��
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
     * ��ȡmIsPreRecPolicyChangeable���Ե�ֵ��
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
     * ����mIsPreRecPolicyChangeable���Ե�ֵ��
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
     * ��ȡmIsPriceIncludeTax���Ե�ֵ��
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
     * ����mIsPriceIncludeTax���Ե�ֵ��
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
     * ��ȡmIsRelease���Ե�ֵ��
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
     * ����mIsRelease���Ե�ֵ��
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
     * ��ȡmIsSMDiscountFlag���Ե�ֵ��
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
     * ����mIsSMDiscountFlag���Ե�ֵ��
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
     * ��ȡmIsTransPort���Ե�ֵ��
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
     * ����mIsTransPort���Ե�ֵ��
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
     * ��ȡmLatestArriveDate���Ե�ֵ��
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
     * ����mLatestArriveDate���Ե�ֵ��
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
     * ��ȡmLatestShippingDate���Ե�ֵ��
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
     * ����mLatestShippingDate���Ե�ֵ��
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
     * ��ȡmLinkman���Ե�ֵ��
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
     * ����mLinkman���Ե�ֵ��
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
     * ��ȡmLoadLimit���Ե�ֵ��
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
     * ����mLoadLimit���Ե�ֵ��
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
     * ��ȡmNetAccount���Ե�ֵ��
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
     * ����mNetAccount���Ե�ֵ��
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
     * ��ȡmObjectNeedPreRecUse���Ե�ֵ��
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
     * ����mObjectNeedPreRecUse���Ե�ֵ��
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
     * ��ȡmObjectUsablePreRecUse���Ե�ֵ��
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
     * ����mObjectUsablePreRecUse���Ե�ֵ��
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
     * ��ȡmOrderBy���Ե�ֵ��
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
     * ����mOrderBy���Ե�ֵ��
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
     * ��ȡmPayer���Ե�ֵ��
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
     * ����mPayer���Ե�ֵ��
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
     * ��ȡmPayerSite���Ե�ֵ��
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
     * ����mPayerSite���Ե�ֵ��
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
     * ��ȡmPolicyHolder���Ե�ֵ��
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
     * ����mPolicyHolder���Ե�ֵ��
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
     * ��ȡmPreRecLackMoney���Ե�ֵ��
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
     * ����mPreRecLackMoney���Ե�ֵ��
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
     * ��ȡmPreRecLackRate���Ե�ֵ��
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
     * ����mPreRecLackRate���Ե�ֵ��
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
     * ��ȡmPreRecListStr���Ե�ֵ��
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
     * ����mPreRecListStr���Ե�ֵ��
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
     * ��ȡmPreRecMoney���Ե�ֵ��
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
     * ����mPreRecMoney���Ե�ֵ��
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
     * ��ȡmPreRecObject���Ե�ֵ��
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
     * ����mPreRecObject���Ե�ֵ��
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
     * ��ȡmPreRecObjectUse���Ե�ֵ��
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
     * ����mPreRecObjectUse���Ե�ֵ��
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
     * ��ȡmPreRecRate���Ե�ֵ��
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
     * ����mPreRecRate���Ե�ֵ��
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
     * ��ȡmPreRecUse���Ե�ֵ��
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
     * ����mPreRecUse���Ե�ֵ��
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
     * ��ȡmPrecisionACFC���Ե�ֵ��
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
     * ����mPrecisionACFC���Ե�ֵ��
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
     * ��ȡmPriceList���Ե�ֵ��
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
     * ����mPriceList���Ե�ֵ��
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
     * ��ȡmPriceListNo���Ե�ֵ��
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
     * ����mPriceListNo���Ե�ֵ��
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
     * ��ȡmProducingArea���Ե�ֵ��
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
     * ����mProducingArea���Ե�ֵ��
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
     * ��ȡmProductName���Ե�ֵ��
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
     * ����mProductName���Ե�ֵ��
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
     * ��ȡmRecBillLineKey���Ե�ֵ��
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
     * ����mRecBillLineKey���Ե�ֵ��
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
     * ��ȡmRecBillLineNO���Ե�ֵ��
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
     * ����mRecBillLineNO���Ե�ֵ��
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
     * ��ȡmReceivalCode���Ե�ֵ��
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
     * ����mReceivalCode���Ե�ֵ��
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
     * ��ȡmReceiveBillKey���Ե�ֵ��
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
     * ����mReceiveBillKey���Ե�ֵ��
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
     * ��ȡmReceiveBillNo���Ե�ֵ��
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
     * ����mReceiveBillNo���Ե�ֵ��
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
     * ��ȡmRecipients���Ե�ֵ��
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
     * ����mRecipients���Ե�ֵ��
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
     * ��ȡmReleaseTime���Ե�ֵ��
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
     * ����mReleaseTime���Ե�ֵ��
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
     * ��ȡmsobPeriods���Ե�ֵ��
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
     * ����msobPeriods���Ե�ֵ��
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
     * ��ȡmSalverQty���Ե�ֵ��
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
     * ����mSalverQty���Ե�ֵ��
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
     * ��ȡmShipAchievements���Ե�ֵ��
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
     * ����mShipAchievements���Ե�ֵ��
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
     * ��ȡmShipAddresss���Ե�ֵ��
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
     * ����mShipAddresss���Ե�ֵ��
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
     * ��ȡmShipCompany���Ե�ֵ��
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
     * ����mShipCompany���Ե�ֵ��
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
     * ��ȡmShipConfirmDate���Ե�ֵ��
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
     * ����mShipConfirmDate���Ե�ֵ��
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
     * ��ȡmShipContacts���Ե�ֵ��
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
     * ����mShipContacts���Ե�ֵ��
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
     * ��ȡmShipDate���Ե�ֵ��
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
     * ����mShipDate���Ե�ֵ��
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
     * ��ȡmShipDiscounts���Ե�ֵ��
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
     * ����mShipDiscounts���Ե�ֵ��
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
     * ��ȡmShipFees���Ե�ֵ��
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
     * ����mShipFees���Ե�ֵ��
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
     * ��ȡmShipLines���Ե�ֵ��
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
     * ����mShipLines���Ե�ֵ��
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
     * ��ȡmShipMode���Ե�ֵ��
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
     * ����mShipMode���Ե�ֵ��
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
     * ��ȡmShipName���Ե�ֵ��
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
     * ����mShipName���Ե�ֵ��
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
     * ��ȡmShipTaxs���Ե�ֵ��
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
     * ����mShipTaxs���Ե�ֵ��
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
     * ��ȡmShippingDate���Ե�ֵ��
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
     * ����mShippingDate���Ե�ֵ��
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
     * ��ȡmShippingPortLinkman���Ե�ֵ��
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
     * ����mShippingPortLinkman���Ե�ֵ��
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
     * ��ȡmSignInBy���Ե�ֵ��
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
     * ����mSignInBy���Ե�ֵ��
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
     * ��ȡmSignInTotalTaxAC���Ե�ֵ��
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
     * ����mSignInTotalTaxAC���Ե�ֵ��
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
     * ��ȡmSignInTotalTaxFC���Ե�ֵ��
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
     * ����mSignInTotalTaxFC���Ե�ֵ��
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
     * ��ȡmSignInTotalTaxTC���Ե�ֵ��
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
     * ����mSignInTotalTaxTC���Ե�ֵ��
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
     * ��ȡmSpecialInsurance���Ե�ֵ��
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
     * ����mSpecialInsurance���Ե�ֵ��
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
     * ��ȡmSrcDocType���Ե�ֵ��
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
     * ����mSrcDocType���Ե�ֵ��
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
     * ��ȡmStatus���Ե�ֵ��
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
     * ����mStatus���Ե�ֵ��
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
     * ��ȡmStepBy���Ե�ֵ��
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
     * ����mStepBy���Ե�ֵ��
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

    /**
     * ��ȡmTaxFreeNo���Ե�ֵ��
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
     * ����mTaxFreeNo���Ե�ֵ��
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
     * ��ȡmTotalDiscount���Ե�ֵ��
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
     * ����mTotalDiscount���Ե�ֵ��
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
     * ��ȡmTotalDiscountFC���Ե�ֵ��
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
     * ����mTotalDiscountFC���Ե�ֵ��
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
     * ��ȡmTotalDiscountTC���Ե�ֵ��
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
     * ����mTotalDiscountTC���Ե�ֵ��
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
     * ��ȡmTotalFee���Ե�ֵ��
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
     * ����mTotalFee���Ե�ֵ��
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
     * ��ȡmTotalFeeFC���Ե�ֵ��
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
     * ����mTotalFeeFC���Ե�ֵ��
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
     * ��ȡmTotalFeeTC���Ե�ֵ��
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
     * ����mTotalFeeTC���Ե�ֵ��
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
     * ��ȡmTotalMoney���Ե�ֵ��
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
     * ����mTotalMoney���Ե�ֵ��
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
     * ��ȡmTotalMoneyFC���Ե�ֵ��
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
     * ����mTotalMoneyFC���Ե�ֵ��
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
     * ��ȡmTotalMoneyTC���Ե�ֵ��
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
     * ����mTotalMoneyTC���Ե�ֵ��
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
     * ��ȡmTotalNetMoneyAC���Ե�ֵ��
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
     * ����mTotalNetMoneyAC���Ե�ֵ��
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
     * ��ȡmTotalNetMoneyFC���Ե�ֵ��
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
     * ����mTotalNetMoneyFC���Ե�ֵ��
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
     * ��ȡmTotalNetMoneyTC���Ե�ֵ��
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
     * ����mTotalNetMoneyTC���Ե�ֵ��
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
     * ��ȡmTotalPieces���Ե�ֵ��
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
     * ����mTotalPieces���Ե�ֵ��
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
     * ��ȡmTotalTax���Ե�ֵ��
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
     * ����mTotalTax���Ե�ֵ��
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
     * ��ȡmTotalTaxFC���Ե�ֵ��
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
     * ����mTotalTaxFC���Ե�ֵ��
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
     * ��ȡmTotalTaxTC���Ե�ֵ��
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
     * ����mTotalTaxTC���Ե�ֵ��
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
     * ��ȡmTradeMode���Ե�ֵ��
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
     * ����mTradeMode���Ե�ֵ��
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
     * ��ȡmTrainNo���Ե�ֵ��
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
     * ����mTrainNo���Ե�ֵ��
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
     * ��ȡmTransInSite���Ե�ֵ��
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
     * ����mTransInSite���Ե�ֵ��
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
     * ��ȡmTransportLinkman���Ե�ֵ��
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
     * ����mTransportLinkman���Ե�ֵ��
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
     * ��ȡmUnApproveDate���Ե�ֵ��
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
     * ����mUnApproveDate���Ե�ֵ��
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
     * ��ȡmUnApproveMan���Ե�ֵ��
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
     * ����mUnApproveMan���Ե�ֵ��
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
     * ��ȡmwfCurrentState���Ե�ֵ��
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
     * ����mwfCurrentState���Ե�ֵ��
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
     * ��ȡmwfOriginalState���Ե�ֵ��
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
     * ����mwfOriginalState���Ե�ֵ��
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
     * ��ȡmWarningMessage���Ե�ֵ��
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
     * ����mWarningMessage���Ե�ֵ��
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
     * ��ȡmWarpRatio���Ե�ֵ��
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
     * ����mWarpRatio���Ե�ֵ��
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
