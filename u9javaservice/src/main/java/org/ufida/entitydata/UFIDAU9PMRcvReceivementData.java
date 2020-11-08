
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
 * &lt;p&gt;UFIDA.U9.PM.Rcv.ReceivementData complex type的 Java 类。
 * 
 * &lt;p&gt;以下模式片段指定包含在此类中的预期内容。
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="UFIDA.U9.PM.Rcv.ReceivementData"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://www.UFIDA.org/EntityData}UFIDA.U9.Base.Doc.DocData"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="AC" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="AC_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="APBillNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="AccountOrg" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="AccountOrg_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="BalanceOrg" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="BalanceOrg_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Carrier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ConfirmTerm" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ConfirmTerm_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ContainerNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="DeliverBillNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="FC" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="FC_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Memo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Multi_APBillNo" type="{UFSoft.UBF.Util.Data}MultiLangDataDict" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Multi_Carrier" type="{UFSoft.UBF.Util.Data}MultiLangDataDict" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Multi_ContainerNO" type="{UFSoft.UBF.Util.Data}MultiLangDataDict" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Multi_DeliverBillNo" type="{UFSoft.UBF.Util.Data}MultiLangDataDict" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Multi_Memo" type="{UFSoft.UBF.Util.Data}MultiLangDataDict" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Multi_PriceListName" type="{UFSoft.UBF.Util.Data}MultiLangDataDict" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Multi_VehicleNo" type="{UFSoft.UBF.Util.Data}MultiLangDataDict" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="PaymentTerm" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="PaymentTerm_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="PostPeriod" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="PostPeriod_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="PrePayPolicy" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="PrePayPolicy_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="PriceListName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="PurOrg" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="PurOrg_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="RcvBy" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="RcvBy_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="RcvDocType" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="RcvDocType_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ShipOrg" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ShipOrg_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="TC" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="TC_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="TaxSchedule" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="TaxSchedule_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="VehicleNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_aCToFCExRate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_aPBill" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_aPBillLine" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_aPBillLineNo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_aPMny" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_activateType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_approvedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_approvedOn" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_bizType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_confirmMode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_cooperateStatus" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_cooperateType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_curOperationNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_disusedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_disusedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_disusedReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_doingReqFundAC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_executedAPMny" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_findPriceDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_headFeeAC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_headFeeFC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_headFeeTC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isACFromSrc" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isBizClose" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isConfirmTermChangeable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isDisused" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isExchRateType" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isFIClose" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isInitEvaluation" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isLineApprove" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isMatchPO" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isMergerAPConfirm" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isNeedWarning" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isOutTransfer" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isPLFromShipSite" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isPaymentTermChangeable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isPriceIncludeTax" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isPriceListChangeable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isProcessAssChild" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isProcessTrade" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isRcvByChangeable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isRelationCompany" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isTCFromSrc" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_maxPrePayMnyAC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_maxPrePayPercent" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_maxPrepayPercentEditable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_payer" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CBO.SCM.Supplier.SupplierMISCInfoData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_payerSite" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CBO.SCM.Supplier.SupplierSiteMISCInfoData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_paymentBill" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_paymentBillLine" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_paymentBillLineNo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_paymentBillNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_paymentCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_prePayPolicyEditable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_priceList" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_priceListCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_priceStatus" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_promptInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_rCVParam" type="{http://www.UFIDA.org/EntityData}ArrayOfUFIDA.U9.PM.Rcv.RCVParamData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_rcvDiscount" type="{http://www.UFIDA.org/EntityData}ArrayOfUFIDA.U9.PM.Rcv.RcvDiscountData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_rcvParamSerialize" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_rcvTax" type="{http://www.UFIDA.org/EntityData}ArrayOfUFIDA.U9.PM.Rcv.RcvTaxData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_receivementType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_rejectMode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_reverseRtnDocRed" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_rtnCustomer" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CBO.SCM.Customer.CustomerMISCInfoData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_rtnType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_saleReturnRcvType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_shipID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_showUniqueID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_showWarningMessageFormID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_srcDocType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_status" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_supplier" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CBO.SCM.Supplier.SupplierMISCInfoData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_tCToACExRate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_tCToACExRateType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_totalArriveMnyAC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_totalArriveMnyFC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_totalArriveMnyTC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_totalArriveNetMnyAC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_totalArriveNetMnyFC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_totalArriveNetMnyTC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_totalArriveTaxAC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_totalArriveTaxFC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_totalArriveTaxTC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_totalFeeAC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_totalFeeFC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_totalFeeTC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_totalMnyAC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_totalMnyFC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_totalMnyTC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_totalNetMnyAC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_totalNetMnyFC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_totalNetMnyTC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_totalRejectMnyAC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_totalRejectMnyFC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_totalRejectMnyTC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_totalRejectNetMnyAC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_totalRejectNetMnyFC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_totalRejectNetMnyTC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_totalRejectTaxAC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_totalRejectTaxFC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_totalRejectTaxTC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_totalRtnDeductMnyAC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_totalRtnDeductMnyFC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_totalRtnDeductMnyTC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_totalRtnDeductNetMnyAC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_totalRtnDeductNetMnyFC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_totalRtnDeductNetMnyTC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_totalRtnDeductTaxAC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_totalRtnDeductTaxFC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_totalRtnDeductTaxTC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_totalTaxAC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_totalTaxFC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_totalTaxTC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_unApprovedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_unApprovedOn" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_wFCurrentState" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_wFOriginalState" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_warrantNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UFIDA.U9.PM.Rcv.ReceivementData", propOrder = {
    "ac",
    "acsKey",
    "apBillNo",
    "accountOrg",
    "accountOrgSKey",
    "balanceOrg",
    "balanceOrgSKey",
    "carrier",
    "confirmTerm",
    "confirmTermSKey",
    "containerNO",
    "deliverBillNo",
    "fc",
    "fcsKey",
    "memo",
    "multiAPBillNo",
    "multiCarrier",
    "multiContainerNO",
    "multiDeliverBillNo",
    "multiMemo",
    "multiPriceListName",
    "multiVehicleNo",
    "paymentTerm",
    "paymentTermSKey",
    "postPeriod",
    "postPeriodSKey",
    "prePayPolicy",
    "prePayPolicySKey",
    "priceListName",
    "purOrg",
    "purOrgSKey",
    "rcvBy",
    "rcvBySKey",
    "rcvDocType",
    "rcvDocTypeSKey",
    "shipOrg",
    "shipOrgSKey",
    "tc",
    "tcsKey",
    "taxSchedule",
    "taxScheduleSKey",
    "vehicleNo",
    "macToFCExRate",
    "mapBill",
    "mapBillLine",
    "mapBillLineNo",
    "mapMny",
    "mActivateType",
    "mApprovedBy",
    "mApprovedOn",
    "mBizType",
    "mConfirmMode",
    "mCooperateStatus",
    "mCooperateType",
    "mCurOperationNO",
    "mDisusedBy",
    "mDisusedDate",
    "mDisusedReason",
    "mDoingReqFundAC",
    "mExecutedAPMny",
    "mFindPriceDate",
    "mHeadFeeAC",
    "mHeadFeeFC",
    "mHeadFeeTC",
    "mIsACFromSrc",
    "mIsBizClose",
    "mIsConfirmTermChangeable",
    "mIsDisused",
    "mIsExchRateType",
    "mIsFIClose",
    "mIsInitEvaluation",
    "mIsLineApprove",
    "mIsMatchPO",
    "mIsMergerAPConfirm",
    "mIsNeedWarning",
    "mIsOutTransfer",
    "mIsPLFromShipSite",
    "mIsPaymentTermChangeable",
    "mIsPriceIncludeTax",
    "mIsPriceListChangeable",
    "mIsProcessAssChild",
    "mIsProcessTrade",
    "mIsRcvByChangeable",
    "mIsRelationCompany",
    "mIsTCFromSrc",
    "mMaxPrePayMnyAC",
    "mMaxPrePayPercent",
    "mMaxPrepayPercentEditable",
    "mPayer",
    "mPayerSite",
    "mPaymentBill",
    "mPaymentBillLine",
    "mPaymentBillLineNo",
    "mPaymentBillNo",
    "mPaymentCode",
    "mPrePayPolicyEditable",
    "mPriceList",
    "mPriceListCode",
    "mPriceStatus",
    "mPromptInfo",
    "mrcvParam",
    "mRcvDiscount",
    "mRcvParamSerialize",
    "mRcvTax",
    "mReceivementType",
    "mRejectMode",
    "mReverseRtnDocRed",
    "mRtnCustomer",
    "mRtnType",
    "mSaleReturnRcvType",
    "mShipID",
    "mShowUniqueID",
    "mShowWarningMessageFormID",
    "mSrcDocType",
    "mStatus",
    "mSupplier",
    "mtcToACExRate",
    "mtcToACExRateType",
    "mTotalArriveMnyAC",
    "mTotalArriveMnyFC",
    "mTotalArriveMnyTC",
    "mTotalArriveNetMnyAC",
    "mTotalArriveNetMnyFC",
    "mTotalArriveNetMnyTC",
    "mTotalArriveTaxAC",
    "mTotalArriveTaxFC",
    "mTotalArriveTaxTC",
    "mTotalFeeAC",
    "mTotalFeeFC",
    "mTotalFeeTC",
    "mTotalMnyAC",
    "mTotalMnyFC",
    "mTotalMnyTC",
    "mTotalNetMnyAC",
    "mTotalNetMnyFC",
    "mTotalNetMnyTC",
    "mTotalRejectMnyAC",
    "mTotalRejectMnyFC",
    "mTotalRejectMnyTC",
    "mTotalRejectNetMnyAC",
    "mTotalRejectNetMnyFC",
    "mTotalRejectNetMnyTC",
    "mTotalRejectTaxAC",
    "mTotalRejectTaxFC",
    "mTotalRejectTaxTC",
    "mTotalRtnDeductMnyAC",
    "mTotalRtnDeductMnyFC",
    "mTotalRtnDeductMnyTC",
    "mTotalRtnDeductNetMnyAC",
    "mTotalRtnDeductNetMnyFC",
    "mTotalRtnDeductNetMnyTC",
    "mTotalRtnDeductTaxAC",
    "mTotalRtnDeductTaxFC",
    "mTotalRtnDeductTaxTC",
    "mTotalTaxAC",
    "mTotalTaxFC",
    "mTotalTaxTC",
    "mUnApprovedBy",
    "mUnApprovedOn",
    "mwfCurrentState",
    "mwfOriginalState",
    "mWarrantNo"
})
public class UFIDAU9PMRcvReceivementData
    extends UFIDAU9BaseDocDocData
{

    @XmlElement(name = "AC")
    protected Long ac;
    @XmlElementRef(name = "AC_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> acsKey;
    @XmlElementRef(name = "APBillNo", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> apBillNo;
    @XmlElement(name = "AccountOrg")
    protected Long accountOrg;
    @XmlElementRef(name = "AccountOrg_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> accountOrgSKey;
    @XmlElement(name = "BalanceOrg")
    protected Long balanceOrg;
    @XmlElementRef(name = "BalanceOrg_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> balanceOrgSKey;
    @XmlElementRef(name = "Carrier", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> carrier;
    @XmlElement(name = "ConfirmTerm")
    protected Long confirmTerm;
    @XmlElementRef(name = "ConfirmTerm_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> confirmTermSKey;
    @XmlElementRef(name = "ContainerNO", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> containerNO;
    @XmlElementRef(name = "DeliverBillNo", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> deliverBillNo;
    @XmlElement(name = "FC")
    protected Long fc;
    @XmlElementRef(name = "FC_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> fcsKey;
    @XmlElementRef(name = "Memo", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> memo;
    @XmlElementRef(name = "Multi_APBillNo", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<MultiLangDataDict> multiAPBillNo;
    @XmlElementRef(name = "Multi_Carrier", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<MultiLangDataDict> multiCarrier;
    @XmlElementRef(name = "Multi_ContainerNO", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<MultiLangDataDict> multiContainerNO;
    @XmlElementRef(name = "Multi_DeliverBillNo", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<MultiLangDataDict> multiDeliverBillNo;
    @XmlElementRef(name = "Multi_Memo", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<MultiLangDataDict> multiMemo;
    @XmlElementRef(name = "Multi_PriceListName", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<MultiLangDataDict> multiPriceListName;
    @XmlElementRef(name = "Multi_VehicleNo", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<MultiLangDataDict> multiVehicleNo;
    @XmlElement(name = "PaymentTerm")
    protected Long paymentTerm;
    @XmlElementRef(name = "PaymentTerm_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> paymentTermSKey;
    @XmlElement(name = "PostPeriod")
    protected Long postPeriod;
    @XmlElementRef(name = "PostPeriod_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> postPeriodSKey;
    @XmlElement(name = "PrePayPolicy")
    protected Long prePayPolicy;
    @XmlElementRef(name = "PrePayPolicy_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> prePayPolicySKey;
    @XmlElementRef(name = "PriceListName", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> priceListName;
    @XmlElement(name = "PurOrg")
    protected Long purOrg;
    @XmlElementRef(name = "PurOrg_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> purOrgSKey;
    @XmlElement(name = "RcvBy")
    protected Long rcvBy;
    @XmlElementRef(name = "RcvBy_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> rcvBySKey;
    @XmlElement(name = "RcvDocType")
    protected Long rcvDocType;
    @XmlElementRef(name = "RcvDocType_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> rcvDocTypeSKey;
    @XmlElement(name = "ShipOrg")
    protected Long shipOrg;
    @XmlElementRef(name = "ShipOrg_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> shipOrgSKey;
    @XmlElement(name = "TC")
    protected Long tc;
    @XmlElementRef(name = "TC_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> tcsKey;
    @XmlElement(name = "TaxSchedule")
    protected Long taxSchedule;
    @XmlElementRef(name = "TaxSchedule_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> taxScheduleSKey;
    @XmlElementRef(name = "VehicleNo", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> vehicleNo;
    @XmlElement(name = "m_aCToFCExRate")
    protected BigDecimal macToFCExRate;
    @XmlElement(name = "m_aPBill")
    protected Long mapBill;
    @XmlElement(name = "m_aPBillLine")
    protected Long mapBillLine;
    @XmlElement(name = "m_aPBillLineNo")
    protected Integer mapBillLineNo;
    @XmlElement(name = "m_aPMny")
    protected BigDecimal mapMny;
    @XmlElement(name = "m_activateType")
    protected Integer mActivateType;
    @XmlElementRef(name = "m_approvedBy", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mApprovedBy;
    @XmlElement(name = "m_approvedOn")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mApprovedOn;
    @XmlElement(name = "m_bizType")
    protected Integer mBizType;
    @XmlElement(name = "m_confirmMode")
    protected Integer mConfirmMode;
    @XmlElement(name = "m_cooperateStatus")
    protected Integer mCooperateStatus;
    @XmlElement(name = "m_cooperateType")
    protected Integer mCooperateType;
    @XmlElementRef(name = "m_curOperationNO", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mCurOperationNO;
    @XmlElementRef(name = "m_disusedBy", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mDisusedBy;
    @XmlElement(name = "m_disusedDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mDisusedDate;
    @XmlElementRef(name = "m_disusedReason", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mDisusedReason;
    @XmlElement(name = "m_doingReqFundAC")
    protected BigDecimal mDoingReqFundAC;
    @XmlElement(name = "m_executedAPMny")
    protected BigDecimal mExecutedAPMny;
    @XmlElement(name = "m_findPriceDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mFindPriceDate;
    @XmlElement(name = "m_headFeeAC")
    protected BigDecimal mHeadFeeAC;
    @XmlElement(name = "m_headFeeFC")
    protected BigDecimal mHeadFeeFC;
    @XmlElement(name = "m_headFeeTC")
    protected BigDecimal mHeadFeeTC;
    @XmlElement(name = "m_isACFromSrc")
    protected Boolean mIsACFromSrc;
    @XmlElement(name = "m_isBizClose")
    protected Boolean mIsBizClose;
    @XmlElement(name = "m_isConfirmTermChangeable")
    protected Boolean mIsConfirmTermChangeable;
    @XmlElement(name = "m_isDisused")
    protected Boolean mIsDisused;
    @XmlElement(name = "m_isExchRateType")
    protected Boolean mIsExchRateType;
    @XmlElement(name = "m_isFIClose")
    protected Boolean mIsFIClose;
    @XmlElement(name = "m_isInitEvaluation")
    protected Boolean mIsInitEvaluation;
    @XmlElement(name = "m_isLineApprove")
    protected Boolean mIsLineApprove;
    @XmlElement(name = "m_isMatchPO")
    protected Boolean mIsMatchPO;
    @XmlElement(name = "m_isMergerAPConfirm")
    protected Boolean mIsMergerAPConfirm;
    @XmlElement(name = "m_isNeedWarning")
    protected Boolean mIsNeedWarning;
    @XmlElement(name = "m_isOutTransfer")
    protected Boolean mIsOutTransfer;
    @XmlElement(name = "m_isPLFromShipSite")
    protected Boolean mIsPLFromShipSite;
    @XmlElement(name = "m_isPaymentTermChangeable")
    protected Boolean mIsPaymentTermChangeable;
    @XmlElement(name = "m_isPriceIncludeTax")
    protected Boolean mIsPriceIncludeTax;
    @XmlElement(name = "m_isPriceListChangeable")
    protected Boolean mIsPriceListChangeable;
    @XmlElement(name = "m_isProcessAssChild")
    protected Boolean mIsProcessAssChild;
    @XmlElement(name = "m_isProcessTrade")
    protected Boolean mIsProcessTrade;
    @XmlElement(name = "m_isRcvByChangeable")
    protected Boolean mIsRcvByChangeable;
    @XmlElement(name = "m_isRelationCompany")
    protected Boolean mIsRelationCompany;
    @XmlElement(name = "m_isTCFromSrc")
    protected Boolean mIsTCFromSrc;
    @XmlElement(name = "m_maxPrePayMnyAC")
    protected BigDecimal mMaxPrePayMnyAC;
    @XmlElement(name = "m_maxPrePayPercent")
    protected BigDecimal mMaxPrePayPercent;
    @XmlElement(name = "m_maxPrepayPercentEditable")
    protected Boolean mMaxPrepayPercentEditable;
    @XmlElementRef(name = "m_payer", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9CBOSCMSupplierSupplierMISCInfoData> mPayer;
    @XmlElementRef(name = "m_payerSite", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9CBOSCMSupplierSupplierSiteMISCInfoData> mPayerSite;
    @XmlElement(name = "m_paymentBill")
    protected Long mPaymentBill;
    @XmlElement(name = "m_paymentBillLine")
    protected Long mPaymentBillLine;
    @XmlElement(name = "m_paymentBillLineNo")
    protected Integer mPaymentBillLineNo;
    @XmlElementRef(name = "m_paymentBillNo", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mPaymentBillNo;
    @XmlElementRef(name = "m_paymentCode", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mPaymentCode;
    @XmlElement(name = "m_prePayPolicyEditable")
    protected Boolean mPrePayPolicyEditable;
    @XmlElement(name = "m_priceList")
    protected Long mPriceList;
    @XmlElementRef(name = "m_priceListCode", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mPriceListCode;
    @XmlElement(name = "m_priceStatus")
    protected Boolean mPriceStatus;
    @XmlElementRef(name = "m_promptInfo", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mPromptInfo;
    @XmlElementRef(name = "m_rCVParam", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfUFIDAU9PMRcvRCVParamData> mrcvParam;
    @XmlElementRef(name = "m_rcvDiscount", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfUFIDAU9PMRcvRcvDiscountData> mRcvDiscount;
    @XmlElementRef(name = "m_rcvParamSerialize", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mRcvParamSerialize;
    @XmlElementRef(name = "m_rcvTax", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfUFIDAU9PMRcvRcvTaxData> mRcvTax;
    @XmlElement(name = "m_receivementType")
    protected Integer mReceivementType;
    @XmlElement(name = "m_rejectMode")
    protected Integer mRejectMode;
    @XmlElement(name = "m_reverseRtnDocRed")
    protected Integer mReverseRtnDocRed;
    @XmlElementRef(name = "m_rtnCustomer", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9CBOSCMCustomerCustomerMISCInfoData> mRtnCustomer;
    @XmlElement(name = "m_rtnType")
    protected Integer mRtnType;
    @XmlElement(name = "m_saleReturnRcvType")
    protected Integer mSaleReturnRcvType;
    @XmlElement(name = "m_shipID")
    protected Long mShipID;
    @XmlElementRef(name = "m_showUniqueID", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mShowUniqueID;
    @XmlElementRef(name = "m_showWarningMessageFormID", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mShowWarningMessageFormID;
    @XmlElement(name = "m_srcDocType")
    protected Integer mSrcDocType;
    @XmlElement(name = "m_status")
    protected Integer mStatus;
    @XmlElementRef(name = "m_supplier", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9CBOSCMSupplierSupplierMISCInfoData> mSupplier;
    @XmlElement(name = "m_tCToACExRate")
    protected BigDecimal mtcToACExRate;
    @XmlElement(name = "m_tCToACExRateType")
    protected Integer mtcToACExRateType;
    @XmlElement(name = "m_totalArriveMnyAC")
    protected BigDecimal mTotalArriveMnyAC;
    @XmlElement(name = "m_totalArriveMnyFC")
    protected BigDecimal mTotalArriveMnyFC;
    @XmlElement(name = "m_totalArriveMnyTC")
    protected BigDecimal mTotalArriveMnyTC;
    @XmlElement(name = "m_totalArriveNetMnyAC")
    protected BigDecimal mTotalArriveNetMnyAC;
    @XmlElement(name = "m_totalArriveNetMnyFC")
    protected BigDecimal mTotalArriveNetMnyFC;
    @XmlElement(name = "m_totalArriveNetMnyTC")
    protected BigDecimal mTotalArriveNetMnyTC;
    @XmlElement(name = "m_totalArriveTaxAC")
    protected BigDecimal mTotalArriveTaxAC;
    @XmlElement(name = "m_totalArriveTaxFC")
    protected BigDecimal mTotalArriveTaxFC;
    @XmlElement(name = "m_totalArriveTaxTC")
    protected BigDecimal mTotalArriveTaxTC;
    @XmlElement(name = "m_totalFeeAC")
    protected BigDecimal mTotalFeeAC;
    @XmlElement(name = "m_totalFeeFC")
    protected BigDecimal mTotalFeeFC;
    @XmlElement(name = "m_totalFeeTC")
    protected BigDecimal mTotalFeeTC;
    @XmlElement(name = "m_totalMnyAC")
    protected BigDecimal mTotalMnyAC;
    @XmlElement(name = "m_totalMnyFC")
    protected BigDecimal mTotalMnyFC;
    @XmlElement(name = "m_totalMnyTC")
    protected BigDecimal mTotalMnyTC;
    @XmlElement(name = "m_totalNetMnyAC")
    protected BigDecimal mTotalNetMnyAC;
    @XmlElement(name = "m_totalNetMnyFC")
    protected BigDecimal mTotalNetMnyFC;
    @XmlElement(name = "m_totalNetMnyTC")
    protected BigDecimal mTotalNetMnyTC;
    @XmlElement(name = "m_totalRejectMnyAC")
    protected BigDecimal mTotalRejectMnyAC;
    @XmlElement(name = "m_totalRejectMnyFC")
    protected BigDecimal mTotalRejectMnyFC;
    @XmlElement(name = "m_totalRejectMnyTC")
    protected BigDecimal mTotalRejectMnyTC;
    @XmlElement(name = "m_totalRejectNetMnyAC")
    protected BigDecimal mTotalRejectNetMnyAC;
    @XmlElement(name = "m_totalRejectNetMnyFC")
    protected BigDecimal mTotalRejectNetMnyFC;
    @XmlElement(name = "m_totalRejectNetMnyTC")
    protected BigDecimal mTotalRejectNetMnyTC;
    @XmlElement(name = "m_totalRejectTaxAC")
    protected BigDecimal mTotalRejectTaxAC;
    @XmlElement(name = "m_totalRejectTaxFC")
    protected BigDecimal mTotalRejectTaxFC;
    @XmlElement(name = "m_totalRejectTaxTC")
    protected BigDecimal mTotalRejectTaxTC;
    @XmlElement(name = "m_totalRtnDeductMnyAC")
    protected BigDecimal mTotalRtnDeductMnyAC;
    @XmlElement(name = "m_totalRtnDeductMnyFC")
    protected BigDecimal mTotalRtnDeductMnyFC;
    @XmlElement(name = "m_totalRtnDeductMnyTC")
    protected BigDecimal mTotalRtnDeductMnyTC;
    @XmlElement(name = "m_totalRtnDeductNetMnyAC")
    protected BigDecimal mTotalRtnDeductNetMnyAC;
    @XmlElement(name = "m_totalRtnDeductNetMnyFC")
    protected BigDecimal mTotalRtnDeductNetMnyFC;
    @XmlElement(name = "m_totalRtnDeductNetMnyTC")
    protected BigDecimal mTotalRtnDeductNetMnyTC;
    @XmlElement(name = "m_totalRtnDeductTaxAC")
    protected BigDecimal mTotalRtnDeductTaxAC;
    @XmlElement(name = "m_totalRtnDeductTaxFC")
    protected BigDecimal mTotalRtnDeductTaxFC;
    @XmlElement(name = "m_totalRtnDeductTaxTC")
    protected BigDecimal mTotalRtnDeductTaxTC;
    @XmlElement(name = "m_totalTaxAC")
    protected BigDecimal mTotalTaxAC;
    @XmlElement(name = "m_totalTaxFC")
    protected BigDecimal mTotalTaxFC;
    @XmlElement(name = "m_totalTaxTC")
    protected BigDecimal mTotalTaxTC;
    @XmlElementRef(name = "m_unApprovedBy", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mUnApprovedBy;
    @XmlElement(name = "m_unApprovedOn")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mUnApprovedOn;
    @XmlElement(name = "m_wFCurrentState")
    protected Integer mwfCurrentState;
    @XmlElement(name = "m_wFOriginalState")
    protected Integer mwfOriginalState;
    @XmlElementRef(name = "m_warrantNo", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mWarrantNo;

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
     * 获取apBillNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAPBillNo() {
        return apBillNo;
    }

    /**
     * 设置apBillNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAPBillNo(JAXBElement<String> value) {
        this.apBillNo = value;
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
     * 获取balanceOrg属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getBalanceOrg() {
        return balanceOrg;
    }

    /**
     * 设置balanceOrg属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setBalanceOrg(Long value) {
        this.balanceOrg = value;
    }

    /**
     * 获取balanceOrgSKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getBalanceOrgSKey() {
        return balanceOrgSKey;
    }

    /**
     * 设置balanceOrgSKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setBalanceOrgSKey(JAXBElement<EntityKey> value) {
        this.balanceOrgSKey = value;
    }

    /**
     * 获取carrier属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCarrier() {
        return carrier;
    }

    /**
     * 设置carrier属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCarrier(JAXBElement<String> value) {
        this.carrier = value;
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
     * 获取containerNO属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getContainerNO() {
        return containerNO;
    }

    /**
     * 设置containerNO属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setContainerNO(JAXBElement<String> value) {
        this.containerNO = value;
    }

    /**
     * 获取deliverBillNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDeliverBillNo() {
        return deliverBillNo;
    }

    /**
     * 设置deliverBillNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDeliverBillNo(JAXBElement<String> value) {
        this.deliverBillNo = value;
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
     * 获取memo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMemo() {
        return memo;
    }

    /**
     * 设置memo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMemo(JAXBElement<String> value) {
        this.memo = value;
    }

    /**
     * 获取multiAPBillNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MultiLangDataDict }{@code >}
     *     
     */
    public JAXBElement<MultiLangDataDict> getMultiAPBillNo() {
        return multiAPBillNo;
    }

    /**
     * 设置multiAPBillNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MultiLangDataDict }{@code >}
     *     
     */
    public void setMultiAPBillNo(JAXBElement<MultiLangDataDict> value) {
        this.multiAPBillNo = value;
    }

    /**
     * 获取multiCarrier属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MultiLangDataDict }{@code >}
     *     
     */
    public JAXBElement<MultiLangDataDict> getMultiCarrier() {
        return multiCarrier;
    }

    /**
     * 设置multiCarrier属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MultiLangDataDict }{@code >}
     *     
     */
    public void setMultiCarrier(JAXBElement<MultiLangDataDict> value) {
        this.multiCarrier = value;
    }

    /**
     * 获取multiContainerNO属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MultiLangDataDict }{@code >}
     *     
     */
    public JAXBElement<MultiLangDataDict> getMultiContainerNO() {
        return multiContainerNO;
    }

    /**
     * 设置multiContainerNO属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MultiLangDataDict }{@code >}
     *     
     */
    public void setMultiContainerNO(JAXBElement<MultiLangDataDict> value) {
        this.multiContainerNO = value;
    }

    /**
     * 获取multiDeliverBillNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MultiLangDataDict }{@code >}
     *     
     */
    public JAXBElement<MultiLangDataDict> getMultiDeliverBillNo() {
        return multiDeliverBillNo;
    }

    /**
     * 设置multiDeliverBillNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MultiLangDataDict }{@code >}
     *     
     */
    public void setMultiDeliverBillNo(JAXBElement<MultiLangDataDict> value) {
        this.multiDeliverBillNo = value;
    }

    /**
     * 获取multiMemo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MultiLangDataDict }{@code >}
     *     
     */
    public JAXBElement<MultiLangDataDict> getMultiMemo() {
        return multiMemo;
    }

    /**
     * 设置multiMemo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MultiLangDataDict }{@code >}
     *     
     */
    public void setMultiMemo(JAXBElement<MultiLangDataDict> value) {
        this.multiMemo = value;
    }

    /**
     * 获取multiPriceListName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MultiLangDataDict }{@code >}
     *     
     */
    public JAXBElement<MultiLangDataDict> getMultiPriceListName() {
        return multiPriceListName;
    }

    /**
     * 设置multiPriceListName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MultiLangDataDict }{@code >}
     *     
     */
    public void setMultiPriceListName(JAXBElement<MultiLangDataDict> value) {
        this.multiPriceListName = value;
    }

    /**
     * 获取multiVehicleNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MultiLangDataDict }{@code >}
     *     
     */
    public JAXBElement<MultiLangDataDict> getMultiVehicleNo() {
        return multiVehicleNo;
    }

    /**
     * 设置multiVehicleNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MultiLangDataDict }{@code >}
     *     
     */
    public void setMultiVehicleNo(JAXBElement<MultiLangDataDict> value) {
        this.multiVehicleNo = value;
    }

    /**
     * 获取paymentTerm属性的值。
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
     * 设置paymentTerm属性的值。
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
     * 获取paymentTermSKey属性的值。
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
     * 设置paymentTermSKey属性的值。
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
     * 获取postPeriod属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPostPeriod() {
        return postPeriod;
    }

    /**
     * 设置postPeriod属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPostPeriod(Long value) {
        this.postPeriod = value;
    }

    /**
     * 获取postPeriodSKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getPostPeriodSKey() {
        return postPeriodSKey;
    }

    /**
     * 设置postPeriodSKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setPostPeriodSKey(JAXBElement<EntityKey> value) {
        this.postPeriodSKey = value;
    }

    /**
     * 获取prePayPolicy属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPrePayPolicy() {
        return prePayPolicy;
    }

    /**
     * 设置prePayPolicy属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPrePayPolicy(Long value) {
        this.prePayPolicy = value;
    }

    /**
     * 获取prePayPolicySKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getPrePayPolicySKey() {
        return prePayPolicySKey;
    }

    /**
     * 设置prePayPolicySKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setPrePayPolicySKey(JAXBElement<EntityKey> value) {
        this.prePayPolicySKey = value;
    }

    /**
     * 获取priceListName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPriceListName() {
        return priceListName;
    }

    /**
     * 设置priceListName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPriceListName(JAXBElement<String> value) {
        this.priceListName = value;
    }

    /**
     * 获取purOrg属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPurOrg() {
        return purOrg;
    }

    /**
     * 设置purOrg属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPurOrg(Long value) {
        this.purOrg = value;
    }

    /**
     * 获取purOrgSKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getPurOrgSKey() {
        return purOrgSKey;
    }

    /**
     * 设置purOrgSKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setPurOrgSKey(JAXBElement<EntityKey> value) {
        this.purOrgSKey = value;
    }

    /**
     * 获取rcvBy属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRcvBy() {
        return rcvBy;
    }

    /**
     * 设置rcvBy属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRcvBy(Long value) {
        this.rcvBy = value;
    }

    /**
     * 获取rcvBySKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getRcvBySKey() {
        return rcvBySKey;
    }

    /**
     * 设置rcvBySKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setRcvBySKey(JAXBElement<EntityKey> value) {
        this.rcvBySKey = value;
    }

    /**
     * 获取rcvDocType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRcvDocType() {
        return rcvDocType;
    }

    /**
     * 设置rcvDocType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRcvDocType(Long value) {
        this.rcvDocType = value;
    }

    /**
     * 获取rcvDocTypeSKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getRcvDocTypeSKey() {
        return rcvDocTypeSKey;
    }

    /**
     * 设置rcvDocTypeSKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setRcvDocTypeSKey(JAXBElement<EntityKey> value) {
        this.rcvDocTypeSKey = value;
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
     * 获取vehicleNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getVehicleNo() {
        return vehicleNo;
    }

    /**
     * 设置vehicleNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setVehicleNo(JAXBElement<String> value) {
        this.vehicleNo = value;
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
     * 获取mapBill属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMAPBill() {
        return mapBill;
    }

    /**
     * 设置mapBill属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMAPBill(Long value) {
        this.mapBill = value;
    }

    /**
     * 获取mapBillLine属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMAPBillLine() {
        return mapBillLine;
    }

    /**
     * 设置mapBillLine属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMAPBillLine(Long value) {
        this.mapBillLine = value;
    }

    /**
     * 获取mapBillLineNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMAPBillLineNo() {
        return mapBillLineNo;
    }

    /**
     * 设置mapBillLineNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMAPBillLineNo(Integer value) {
        this.mapBillLineNo = value;
    }

    /**
     * 获取mapMny属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMAPMny() {
        return mapMny;
    }

    /**
     * 设置mapMny属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMAPMny(BigDecimal value) {
        this.mapMny = value;
    }

    /**
     * 获取mActivateType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMActivateType() {
        return mActivateType;
    }

    /**
     * 设置mActivateType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMActivateType(Integer value) {
        this.mActivateType = value;
    }

    /**
     * 获取mApprovedBy属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMApprovedBy() {
        return mApprovedBy;
    }

    /**
     * 设置mApprovedBy属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMApprovedBy(JAXBElement<String> value) {
        this.mApprovedBy = value;
    }

    /**
     * 获取mApprovedOn属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMApprovedOn() {
        return mApprovedOn;
    }

    /**
     * 设置mApprovedOn属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMApprovedOn(XMLGregorianCalendar value) {
        this.mApprovedOn = value;
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
     * 获取mCurOperationNO属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMCurOperationNO() {
        return mCurOperationNO;
    }

    /**
     * 设置mCurOperationNO属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMCurOperationNO(JAXBElement<String> value) {
        this.mCurOperationNO = value;
    }

    /**
     * 获取mDisusedBy属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMDisusedBy() {
        return mDisusedBy;
    }

    /**
     * 设置mDisusedBy属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMDisusedBy(JAXBElement<String> value) {
        this.mDisusedBy = value;
    }

    /**
     * 获取mDisusedDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMDisusedDate() {
        return mDisusedDate;
    }

    /**
     * 设置mDisusedDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMDisusedDate(XMLGregorianCalendar value) {
        this.mDisusedDate = value;
    }

    /**
     * 获取mDisusedReason属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMDisusedReason() {
        return mDisusedReason;
    }

    /**
     * 设置mDisusedReason属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMDisusedReason(JAXBElement<String> value) {
        this.mDisusedReason = value;
    }

    /**
     * 获取mDoingReqFundAC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMDoingReqFundAC() {
        return mDoingReqFundAC;
    }

    /**
     * 设置mDoingReqFundAC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMDoingReqFundAC(BigDecimal value) {
        this.mDoingReqFundAC = value;
    }

    /**
     * 获取mExecutedAPMny属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMExecutedAPMny() {
        return mExecutedAPMny;
    }

    /**
     * 设置mExecutedAPMny属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMExecutedAPMny(BigDecimal value) {
        this.mExecutedAPMny = value;
    }

    /**
     * 获取mFindPriceDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMFindPriceDate() {
        return mFindPriceDate;
    }

    /**
     * 设置mFindPriceDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMFindPriceDate(XMLGregorianCalendar value) {
        this.mFindPriceDate = value;
    }

    /**
     * 获取mHeadFeeAC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMHeadFeeAC() {
        return mHeadFeeAC;
    }

    /**
     * 设置mHeadFeeAC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMHeadFeeAC(BigDecimal value) {
        this.mHeadFeeAC = value;
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
     * 获取mIsACFromSrc属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsACFromSrc() {
        return mIsACFromSrc;
    }

    /**
     * 设置mIsACFromSrc属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsACFromSrc(Boolean value) {
        this.mIsACFromSrc = value;
    }

    /**
     * 获取mIsBizClose属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsBizClose() {
        return mIsBizClose;
    }

    /**
     * 设置mIsBizClose属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsBizClose(Boolean value) {
        this.mIsBizClose = value;
    }

    /**
     * 获取mIsConfirmTermChangeable属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsConfirmTermChangeable() {
        return mIsConfirmTermChangeable;
    }

    /**
     * 设置mIsConfirmTermChangeable属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsConfirmTermChangeable(Boolean value) {
        this.mIsConfirmTermChangeable = value;
    }

    /**
     * 获取mIsDisused属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsDisused() {
        return mIsDisused;
    }

    /**
     * 设置mIsDisused属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsDisused(Boolean value) {
        this.mIsDisused = value;
    }

    /**
     * 获取mIsExchRateType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsExchRateType() {
        return mIsExchRateType;
    }

    /**
     * 设置mIsExchRateType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsExchRateType(Boolean value) {
        this.mIsExchRateType = value;
    }

    /**
     * 获取mIsFIClose属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsFIClose() {
        return mIsFIClose;
    }

    /**
     * 设置mIsFIClose属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsFIClose(Boolean value) {
        this.mIsFIClose = value;
    }

    /**
     * 获取mIsInitEvaluation属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsInitEvaluation() {
        return mIsInitEvaluation;
    }

    /**
     * 设置mIsInitEvaluation属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsInitEvaluation(Boolean value) {
        this.mIsInitEvaluation = value;
    }

    /**
     * 获取mIsLineApprove属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsLineApprove() {
        return mIsLineApprove;
    }

    /**
     * 设置mIsLineApprove属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsLineApprove(Boolean value) {
        this.mIsLineApprove = value;
    }

    /**
     * 获取mIsMatchPO属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsMatchPO() {
        return mIsMatchPO;
    }

    /**
     * 设置mIsMatchPO属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsMatchPO(Boolean value) {
        this.mIsMatchPO = value;
    }

    /**
     * 获取mIsMergerAPConfirm属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsMergerAPConfirm() {
        return mIsMergerAPConfirm;
    }

    /**
     * 设置mIsMergerAPConfirm属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsMergerAPConfirm(Boolean value) {
        this.mIsMergerAPConfirm = value;
    }

    /**
     * 获取mIsNeedWarning属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsNeedWarning() {
        return mIsNeedWarning;
    }

    /**
     * 设置mIsNeedWarning属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsNeedWarning(Boolean value) {
        this.mIsNeedWarning = value;
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
     * 获取mIsPLFromShipSite属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsPLFromShipSite() {
        return mIsPLFromShipSite;
    }

    /**
     * 设置mIsPLFromShipSite属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsPLFromShipSite(Boolean value) {
        this.mIsPLFromShipSite = value;
    }

    /**
     * 获取mIsPaymentTermChangeable属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsPaymentTermChangeable() {
        return mIsPaymentTermChangeable;
    }

    /**
     * 设置mIsPaymentTermChangeable属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsPaymentTermChangeable(Boolean value) {
        this.mIsPaymentTermChangeable = value;
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
     * 获取mIsPriceListChangeable属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsPriceListChangeable() {
        return mIsPriceListChangeable;
    }

    /**
     * 设置mIsPriceListChangeable属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsPriceListChangeable(Boolean value) {
        this.mIsPriceListChangeable = value;
    }

    /**
     * 获取mIsProcessAssChild属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsProcessAssChild() {
        return mIsProcessAssChild;
    }

    /**
     * 设置mIsProcessAssChild属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsProcessAssChild(Boolean value) {
        this.mIsProcessAssChild = value;
    }

    /**
     * 获取mIsProcessTrade属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsProcessTrade() {
        return mIsProcessTrade;
    }

    /**
     * 设置mIsProcessTrade属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsProcessTrade(Boolean value) {
        this.mIsProcessTrade = value;
    }

    /**
     * 获取mIsRcvByChangeable属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsRcvByChangeable() {
        return mIsRcvByChangeable;
    }

    /**
     * 设置mIsRcvByChangeable属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsRcvByChangeable(Boolean value) {
        this.mIsRcvByChangeable = value;
    }

    /**
     * 获取mIsRelationCompany属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsRelationCompany() {
        return mIsRelationCompany;
    }

    /**
     * 设置mIsRelationCompany属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsRelationCompany(Boolean value) {
        this.mIsRelationCompany = value;
    }

    /**
     * 获取mIsTCFromSrc属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsTCFromSrc() {
        return mIsTCFromSrc;
    }

    /**
     * 设置mIsTCFromSrc属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsTCFromSrc(Boolean value) {
        this.mIsTCFromSrc = value;
    }

    /**
     * 获取mMaxPrePayMnyAC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMMaxPrePayMnyAC() {
        return mMaxPrePayMnyAC;
    }

    /**
     * 设置mMaxPrePayMnyAC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMMaxPrePayMnyAC(BigDecimal value) {
        this.mMaxPrePayMnyAC = value;
    }

    /**
     * 获取mMaxPrePayPercent属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMMaxPrePayPercent() {
        return mMaxPrePayPercent;
    }

    /**
     * 设置mMaxPrePayPercent属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMMaxPrePayPercent(BigDecimal value) {
        this.mMaxPrePayPercent = value;
    }

    /**
     * 获取mMaxPrepayPercentEditable属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMMaxPrepayPercentEditable() {
        return mMaxPrepayPercentEditable;
    }

    /**
     * 设置mMaxPrepayPercentEditable属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMMaxPrepayPercentEditable(Boolean value) {
        this.mMaxPrepayPercentEditable = value;
    }

    /**
     * 获取mPayer属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOSCMSupplierSupplierMISCInfoData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9CBOSCMSupplierSupplierMISCInfoData> getMPayer() {
        return mPayer;
    }

    /**
     * 设置mPayer属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOSCMSupplierSupplierMISCInfoData }{@code >}
     *     
     */
    public void setMPayer(JAXBElement<UFIDAU9CBOSCMSupplierSupplierMISCInfoData> value) {
        this.mPayer = value;
    }

    /**
     * 获取mPayerSite属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOSCMSupplierSupplierSiteMISCInfoData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9CBOSCMSupplierSupplierSiteMISCInfoData> getMPayerSite() {
        return mPayerSite;
    }

    /**
     * 设置mPayerSite属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOSCMSupplierSupplierSiteMISCInfoData }{@code >}
     *     
     */
    public void setMPayerSite(JAXBElement<UFIDAU9CBOSCMSupplierSupplierSiteMISCInfoData> value) {
        this.mPayerSite = value;
    }

    /**
     * 获取mPaymentBill属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMPaymentBill() {
        return mPaymentBill;
    }

    /**
     * 设置mPaymentBill属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMPaymentBill(Long value) {
        this.mPaymentBill = value;
    }

    /**
     * 获取mPaymentBillLine属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMPaymentBillLine() {
        return mPaymentBillLine;
    }

    /**
     * 设置mPaymentBillLine属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMPaymentBillLine(Long value) {
        this.mPaymentBillLine = value;
    }

    /**
     * 获取mPaymentBillLineNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMPaymentBillLineNo() {
        return mPaymentBillLineNo;
    }

    /**
     * 设置mPaymentBillLineNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMPaymentBillLineNo(Integer value) {
        this.mPaymentBillLineNo = value;
    }

    /**
     * 获取mPaymentBillNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMPaymentBillNo() {
        return mPaymentBillNo;
    }

    /**
     * 设置mPaymentBillNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMPaymentBillNo(JAXBElement<String> value) {
        this.mPaymentBillNo = value;
    }

    /**
     * 获取mPaymentCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMPaymentCode() {
        return mPaymentCode;
    }

    /**
     * 设置mPaymentCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMPaymentCode(JAXBElement<String> value) {
        this.mPaymentCode = value;
    }

    /**
     * 获取mPrePayPolicyEditable属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMPrePayPolicyEditable() {
        return mPrePayPolicyEditable;
    }

    /**
     * 设置mPrePayPolicyEditable属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMPrePayPolicyEditable(Boolean value) {
        this.mPrePayPolicyEditable = value;
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
     * 获取mPriceListCode属性的值。
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
     * 设置mPriceListCode属性的值。
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
     * 获取mPriceStatus属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMPriceStatus() {
        return mPriceStatus;
    }

    /**
     * 设置mPriceStatus属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMPriceStatus(Boolean value) {
        this.mPriceStatus = value;
    }

    /**
     * 获取mPromptInfo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMPromptInfo() {
        return mPromptInfo;
    }

    /**
     * 设置mPromptInfo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMPromptInfo(JAXBElement<String> value) {
        this.mPromptInfo = value;
    }

    /**
     * 获取mrcvParam属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUFIDAU9PMRcvRCVParamData }{@code >}
     *     
     */
    public JAXBElement<ArrayOfUFIDAU9PMRcvRCVParamData> getMRCVParam() {
        return mrcvParam;
    }

    /**
     * 设置mrcvParam属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUFIDAU9PMRcvRCVParamData }{@code >}
     *     
     */
    public void setMRCVParam(JAXBElement<ArrayOfUFIDAU9PMRcvRCVParamData> value) {
        this.mrcvParam = value;
    }

    /**
     * 获取mRcvDiscount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUFIDAU9PMRcvRcvDiscountData }{@code >}
     *     
     */
    public JAXBElement<ArrayOfUFIDAU9PMRcvRcvDiscountData> getMRcvDiscount() {
        return mRcvDiscount;
    }

    /**
     * 设置mRcvDiscount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUFIDAU9PMRcvRcvDiscountData }{@code >}
     *     
     */
    public void setMRcvDiscount(JAXBElement<ArrayOfUFIDAU9PMRcvRcvDiscountData> value) {
        this.mRcvDiscount = value;
    }

    /**
     * 获取mRcvParamSerialize属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMRcvParamSerialize() {
        return mRcvParamSerialize;
    }

    /**
     * 设置mRcvParamSerialize属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMRcvParamSerialize(JAXBElement<String> value) {
        this.mRcvParamSerialize = value;
    }

    /**
     * 获取mRcvTax属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUFIDAU9PMRcvRcvTaxData }{@code >}
     *     
     */
    public JAXBElement<ArrayOfUFIDAU9PMRcvRcvTaxData> getMRcvTax() {
        return mRcvTax;
    }

    /**
     * 设置mRcvTax属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUFIDAU9PMRcvRcvTaxData }{@code >}
     *     
     */
    public void setMRcvTax(JAXBElement<ArrayOfUFIDAU9PMRcvRcvTaxData> value) {
        this.mRcvTax = value;
    }

    /**
     * 获取mReceivementType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMReceivementType() {
        return mReceivementType;
    }

    /**
     * 设置mReceivementType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMReceivementType(Integer value) {
        this.mReceivementType = value;
    }

    /**
     * 获取mRejectMode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMRejectMode() {
        return mRejectMode;
    }

    /**
     * 设置mRejectMode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMRejectMode(Integer value) {
        this.mRejectMode = value;
    }

    /**
     * 获取mReverseRtnDocRed属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMReverseRtnDocRed() {
        return mReverseRtnDocRed;
    }

    /**
     * 设置mReverseRtnDocRed属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMReverseRtnDocRed(Integer value) {
        this.mReverseRtnDocRed = value;
    }

    /**
     * 获取mRtnCustomer属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOSCMCustomerCustomerMISCInfoData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9CBOSCMCustomerCustomerMISCInfoData> getMRtnCustomer() {
        return mRtnCustomer;
    }

    /**
     * 设置mRtnCustomer属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOSCMCustomerCustomerMISCInfoData }{@code >}
     *     
     */
    public void setMRtnCustomer(JAXBElement<UFIDAU9CBOSCMCustomerCustomerMISCInfoData> value) {
        this.mRtnCustomer = value;
    }

    /**
     * 获取mRtnType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMRtnType() {
        return mRtnType;
    }

    /**
     * 设置mRtnType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMRtnType(Integer value) {
        this.mRtnType = value;
    }

    /**
     * 获取mSaleReturnRcvType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMSaleReturnRcvType() {
        return mSaleReturnRcvType;
    }

    /**
     * 设置mSaleReturnRcvType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMSaleReturnRcvType(Integer value) {
        this.mSaleReturnRcvType = value;
    }

    /**
     * 获取mShipID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMShipID() {
        return mShipID;
    }

    /**
     * 设置mShipID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMShipID(Long value) {
        this.mShipID = value;
    }

    /**
     * 获取mShowUniqueID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMShowUniqueID() {
        return mShowUniqueID;
    }

    /**
     * 设置mShowUniqueID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMShowUniqueID(JAXBElement<String> value) {
        this.mShowUniqueID = value;
    }

    /**
     * 获取mShowWarningMessageFormID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMShowWarningMessageFormID() {
        return mShowWarningMessageFormID;
    }

    /**
     * 设置mShowWarningMessageFormID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMShowWarningMessageFormID(JAXBElement<String> value) {
        this.mShowWarningMessageFormID = value;
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
     * 获取mSupplier属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOSCMSupplierSupplierMISCInfoData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9CBOSCMSupplierSupplierMISCInfoData> getMSupplier() {
        return mSupplier;
    }

    /**
     * 设置mSupplier属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOSCMSupplierSupplierMISCInfoData }{@code >}
     *     
     */
    public void setMSupplier(JAXBElement<UFIDAU9CBOSCMSupplierSupplierMISCInfoData> value) {
        this.mSupplier = value;
    }

    /**
     * 获取mtcToACExRate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMTCToACExRate() {
        return mtcToACExRate;
    }

    /**
     * 设置mtcToACExRate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMTCToACExRate(BigDecimal value) {
        this.mtcToACExRate = value;
    }

    /**
     * 获取mtcToACExRateType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMTCToACExRateType() {
        return mtcToACExRateType;
    }

    /**
     * 设置mtcToACExRateType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMTCToACExRateType(Integer value) {
        this.mtcToACExRateType = value;
    }

    /**
     * 获取mTotalArriveMnyAC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMTotalArriveMnyAC() {
        return mTotalArriveMnyAC;
    }

    /**
     * 设置mTotalArriveMnyAC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMTotalArriveMnyAC(BigDecimal value) {
        this.mTotalArriveMnyAC = value;
    }

    /**
     * 获取mTotalArriveMnyFC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMTotalArriveMnyFC() {
        return mTotalArriveMnyFC;
    }

    /**
     * 设置mTotalArriveMnyFC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMTotalArriveMnyFC(BigDecimal value) {
        this.mTotalArriveMnyFC = value;
    }

    /**
     * 获取mTotalArriveMnyTC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMTotalArriveMnyTC() {
        return mTotalArriveMnyTC;
    }

    /**
     * 设置mTotalArriveMnyTC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMTotalArriveMnyTC(BigDecimal value) {
        this.mTotalArriveMnyTC = value;
    }

    /**
     * 获取mTotalArriveNetMnyAC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMTotalArriveNetMnyAC() {
        return mTotalArriveNetMnyAC;
    }

    /**
     * 设置mTotalArriveNetMnyAC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMTotalArriveNetMnyAC(BigDecimal value) {
        this.mTotalArriveNetMnyAC = value;
    }

    /**
     * 获取mTotalArriveNetMnyFC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMTotalArriveNetMnyFC() {
        return mTotalArriveNetMnyFC;
    }

    /**
     * 设置mTotalArriveNetMnyFC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMTotalArriveNetMnyFC(BigDecimal value) {
        this.mTotalArriveNetMnyFC = value;
    }

    /**
     * 获取mTotalArriveNetMnyTC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMTotalArriveNetMnyTC() {
        return mTotalArriveNetMnyTC;
    }

    /**
     * 设置mTotalArriveNetMnyTC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMTotalArriveNetMnyTC(BigDecimal value) {
        this.mTotalArriveNetMnyTC = value;
    }

    /**
     * 获取mTotalArriveTaxAC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMTotalArriveTaxAC() {
        return mTotalArriveTaxAC;
    }

    /**
     * 设置mTotalArriveTaxAC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMTotalArriveTaxAC(BigDecimal value) {
        this.mTotalArriveTaxAC = value;
    }

    /**
     * 获取mTotalArriveTaxFC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMTotalArriveTaxFC() {
        return mTotalArriveTaxFC;
    }

    /**
     * 设置mTotalArriveTaxFC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMTotalArriveTaxFC(BigDecimal value) {
        this.mTotalArriveTaxFC = value;
    }

    /**
     * 获取mTotalArriveTaxTC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMTotalArriveTaxTC() {
        return mTotalArriveTaxTC;
    }

    /**
     * 设置mTotalArriveTaxTC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMTotalArriveTaxTC(BigDecimal value) {
        this.mTotalArriveTaxTC = value;
    }

    /**
     * 获取mTotalFeeAC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMTotalFeeAC() {
        return mTotalFeeAC;
    }

    /**
     * 设置mTotalFeeAC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMTotalFeeAC(BigDecimal value) {
        this.mTotalFeeAC = value;
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
     * 获取mTotalMnyAC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMTotalMnyAC() {
        return mTotalMnyAC;
    }

    /**
     * 设置mTotalMnyAC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMTotalMnyAC(BigDecimal value) {
        this.mTotalMnyAC = value;
    }

    /**
     * 获取mTotalMnyFC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMTotalMnyFC() {
        return mTotalMnyFC;
    }

    /**
     * 设置mTotalMnyFC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMTotalMnyFC(BigDecimal value) {
        this.mTotalMnyFC = value;
    }

    /**
     * 获取mTotalMnyTC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMTotalMnyTC() {
        return mTotalMnyTC;
    }

    /**
     * 设置mTotalMnyTC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMTotalMnyTC(BigDecimal value) {
        this.mTotalMnyTC = value;
    }

    /**
     * 获取mTotalNetMnyAC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMTotalNetMnyAC() {
        return mTotalNetMnyAC;
    }

    /**
     * 设置mTotalNetMnyAC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMTotalNetMnyAC(BigDecimal value) {
        this.mTotalNetMnyAC = value;
    }

    /**
     * 获取mTotalNetMnyFC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMTotalNetMnyFC() {
        return mTotalNetMnyFC;
    }

    /**
     * 设置mTotalNetMnyFC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMTotalNetMnyFC(BigDecimal value) {
        this.mTotalNetMnyFC = value;
    }

    /**
     * 获取mTotalNetMnyTC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMTotalNetMnyTC() {
        return mTotalNetMnyTC;
    }

    /**
     * 设置mTotalNetMnyTC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMTotalNetMnyTC(BigDecimal value) {
        this.mTotalNetMnyTC = value;
    }

    /**
     * 获取mTotalRejectMnyAC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMTotalRejectMnyAC() {
        return mTotalRejectMnyAC;
    }

    /**
     * 设置mTotalRejectMnyAC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMTotalRejectMnyAC(BigDecimal value) {
        this.mTotalRejectMnyAC = value;
    }

    /**
     * 获取mTotalRejectMnyFC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMTotalRejectMnyFC() {
        return mTotalRejectMnyFC;
    }

    /**
     * 设置mTotalRejectMnyFC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMTotalRejectMnyFC(BigDecimal value) {
        this.mTotalRejectMnyFC = value;
    }

    /**
     * 获取mTotalRejectMnyTC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMTotalRejectMnyTC() {
        return mTotalRejectMnyTC;
    }

    /**
     * 设置mTotalRejectMnyTC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMTotalRejectMnyTC(BigDecimal value) {
        this.mTotalRejectMnyTC = value;
    }

    /**
     * 获取mTotalRejectNetMnyAC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMTotalRejectNetMnyAC() {
        return mTotalRejectNetMnyAC;
    }

    /**
     * 设置mTotalRejectNetMnyAC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMTotalRejectNetMnyAC(BigDecimal value) {
        this.mTotalRejectNetMnyAC = value;
    }

    /**
     * 获取mTotalRejectNetMnyFC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMTotalRejectNetMnyFC() {
        return mTotalRejectNetMnyFC;
    }

    /**
     * 设置mTotalRejectNetMnyFC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMTotalRejectNetMnyFC(BigDecimal value) {
        this.mTotalRejectNetMnyFC = value;
    }

    /**
     * 获取mTotalRejectNetMnyTC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMTotalRejectNetMnyTC() {
        return mTotalRejectNetMnyTC;
    }

    /**
     * 设置mTotalRejectNetMnyTC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMTotalRejectNetMnyTC(BigDecimal value) {
        this.mTotalRejectNetMnyTC = value;
    }

    /**
     * 获取mTotalRejectTaxAC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMTotalRejectTaxAC() {
        return mTotalRejectTaxAC;
    }

    /**
     * 设置mTotalRejectTaxAC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMTotalRejectTaxAC(BigDecimal value) {
        this.mTotalRejectTaxAC = value;
    }

    /**
     * 获取mTotalRejectTaxFC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMTotalRejectTaxFC() {
        return mTotalRejectTaxFC;
    }

    /**
     * 设置mTotalRejectTaxFC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMTotalRejectTaxFC(BigDecimal value) {
        this.mTotalRejectTaxFC = value;
    }

    /**
     * 获取mTotalRejectTaxTC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMTotalRejectTaxTC() {
        return mTotalRejectTaxTC;
    }

    /**
     * 设置mTotalRejectTaxTC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMTotalRejectTaxTC(BigDecimal value) {
        this.mTotalRejectTaxTC = value;
    }

    /**
     * 获取mTotalRtnDeductMnyAC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMTotalRtnDeductMnyAC() {
        return mTotalRtnDeductMnyAC;
    }

    /**
     * 设置mTotalRtnDeductMnyAC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMTotalRtnDeductMnyAC(BigDecimal value) {
        this.mTotalRtnDeductMnyAC = value;
    }

    /**
     * 获取mTotalRtnDeductMnyFC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMTotalRtnDeductMnyFC() {
        return mTotalRtnDeductMnyFC;
    }

    /**
     * 设置mTotalRtnDeductMnyFC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMTotalRtnDeductMnyFC(BigDecimal value) {
        this.mTotalRtnDeductMnyFC = value;
    }

    /**
     * 获取mTotalRtnDeductMnyTC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMTotalRtnDeductMnyTC() {
        return mTotalRtnDeductMnyTC;
    }

    /**
     * 设置mTotalRtnDeductMnyTC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMTotalRtnDeductMnyTC(BigDecimal value) {
        this.mTotalRtnDeductMnyTC = value;
    }

    /**
     * 获取mTotalRtnDeductNetMnyAC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMTotalRtnDeductNetMnyAC() {
        return mTotalRtnDeductNetMnyAC;
    }

    /**
     * 设置mTotalRtnDeductNetMnyAC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMTotalRtnDeductNetMnyAC(BigDecimal value) {
        this.mTotalRtnDeductNetMnyAC = value;
    }

    /**
     * 获取mTotalRtnDeductNetMnyFC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMTotalRtnDeductNetMnyFC() {
        return mTotalRtnDeductNetMnyFC;
    }

    /**
     * 设置mTotalRtnDeductNetMnyFC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMTotalRtnDeductNetMnyFC(BigDecimal value) {
        this.mTotalRtnDeductNetMnyFC = value;
    }

    /**
     * 获取mTotalRtnDeductNetMnyTC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMTotalRtnDeductNetMnyTC() {
        return mTotalRtnDeductNetMnyTC;
    }

    /**
     * 设置mTotalRtnDeductNetMnyTC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMTotalRtnDeductNetMnyTC(BigDecimal value) {
        this.mTotalRtnDeductNetMnyTC = value;
    }

    /**
     * 获取mTotalRtnDeductTaxAC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMTotalRtnDeductTaxAC() {
        return mTotalRtnDeductTaxAC;
    }

    /**
     * 设置mTotalRtnDeductTaxAC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMTotalRtnDeductTaxAC(BigDecimal value) {
        this.mTotalRtnDeductTaxAC = value;
    }

    /**
     * 获取mTotalRtnDeductTaxFC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMTotalRtnDeductTaxFC() {
        return mTotalRtnDeductTaxFC;
    }

    /**
     * 设置mTotalRtnDeductTaxFC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMTotalRtnDeductTaxFC(BigDecimal value) {
        this.mTotalRtnDeductTaxFC = value;
    }

    /**
     * 获取mTotalRtnDeductTaxTC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMTotalRtnDeductTaxTC() {
        return mTotalRtnDeductTaxTC;
    }

    /**
     * 设置mTotalRtnDeductTaxTC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMTotalRtnDeductTaxTC(BigDecimal value) {
        this.mTotalRtnDeductTaxTC = value;
    }

    /**
     * 获取mTotalTaxAC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMTotalTaxAC() {
        return mTotalTaxAC;
    }

    /**
     * 设置mTotalTaxAC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMTotalTaxAC(BigDecimal value) {
        this.mTotalTaxAC = value;
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
     * 获取mUnApprovedBy属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMUnApprovedBy() {
        return mUnApprovedBy;
    }

    /**
     * 设置mUnApprovedBy属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMUnApprovedBy(JAXBElement<String> value) {
        this.mUnApprovedBy = value;
    }

    /**
     * 获取mUnApprovedOn属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMUnApprovedOn() {
        return mUnApprovedOn;
    }

    /**
     * 设置mUnApprovedOn属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMUnApprovedOn(XMLGregorianCalendar value) {
        this.mUnApprovedOn = value;
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
     * 获取mWarrantNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMWarrantNo() {
        return mWarrantNo;
    }

    /**
     * 设置mWarrantNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMWarrantNo(JAXBElement<String> value) {
        this.mWarrantNo = value;
    }

}
