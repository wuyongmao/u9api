
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
 * &lt;p&gt;UFIDA.U9.PM.Rcv.ReceivementData complex type�� Java �ࡣ
 * 
 * &lt;p&gt;����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡapBillNo���Ե�ֵ��
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
     * ����apBillNo���Ե�ֵ��
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
     * ��ȡbalanceOrg���Ե�ֵ��
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
     * ����balanceOrg���Ե�ֵ��
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
     * ��ȡbalanceOrgSKey���Ե�ֵ��
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
     * ����balanceOrgSKey���Ե�ֵ��
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
     * ��ȡcarrier���Ե�ֵ��
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
     * ����carrier���Ե�ֵ��
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
     * ��ȡcontainerNO���Ե�ֵ��
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
     * ����containerNO���Ե�ֵ��
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
     * ��ȡdeliverBillNo���Ե�ֵ��
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
     * ����deliverBillNo���Ե�ֵ��
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
     * ��ȡmemo���Ե�ֵ��
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
     * ����memo���Ե�ֵ��
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
     * ��ȡmultiAPBillNo���Ե�ֵ��
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
     * ����multiAPBillNo���Ե�ֵ��
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
     * ��ȡmultiCarrier���Ե�ֵ��
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
     * ����multiCarrier���Ե�ֵ��
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
     * ��ȡmultiContainerNO���Ե�ֵ��
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
     * ����multiContainerNO���Ե�ֵ��
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
     * ��ȡmultiDeliverBillNo���Ե�ֵ��
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
     * ����multiDeliverBillNo���Ե�ֵ��
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
     * ��ȡmultiMemo���Ե�ֵ��
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
     * ����multiMemo���Ե�ֵ��
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
     * ��ȡmultiPriceListName���Ե�ֵ��
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
     * ����multiPriceListName���Ե�ֵ��
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
     * ��ȡmultiVehicleNo���Ե�ֵ��
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
     * ����multiVehicleNo���Ե�ֵ��
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
     * ��ȡpostPeriod���Ե�ֵ��
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
     * ����postPeriod���Ե�ֵ��
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
     * ��ȡpostPeriodSKey���Ե�ֵ��
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
     * ����postPeriodSKey���Ե�ֵ��
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
     * ��ȡprePayPolicy���Ե�ֵ��
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
     * ����prePayPolicy���Ե�ֵ��
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
     * ��ȡprePayPolicySKey���Ե�ֵ��
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
     * ����prePayPolicySKey���Ե�ֵ��
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
     * ��ȡpriceListName���Ե�ֵ��
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
     * ����priceListName���Ե�ֵ��
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
     * ��ȡpurOrg���Ե�ֵ��
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
     * ����purOrg���Ե�ֵ��
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
     * ��ȡpurOrgSKey���Ե�ֵ��
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
     * ����purOrgSKey���Ե�ֵ��
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
     * ��ȡrcvBy���Ե�ֵ��
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
     * ����rcvBy���Ե�ֵ��
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
     * ��ȡrcvBySKey���Ե�ֵ��
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
     * ����rcvBySKey���Ե�ֵ��
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
     * ��ȡrcvDocType���Ե�ֵ��
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
     * ����rcvDocType���Ե�ֵ��
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
     * ��ȡrcvDocTypeSKey���Ե�ֵ��
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
     * ����rcvDocTypeSKey���Ե�ֵ��
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
     * ��ȡvehicleNo���Ե�ֵ��
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
     * ����vehicleNo���Ե�ֵ��
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
     * ��ȡmapBill���Ե�ֵ��
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
     * ����mapBill���Ե�ֵ��
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
     * ��ȡmapBillLine���Ե�ֵ��
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
     * ����mapBillLine���Ե�ֵ��
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
     * ��ȡmapBillLineNo���Ե�ֵ��
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
     * ����mapBillLineNo���Ե�ֵ��
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
     * ��ȡmapMny���Ե�ֵ��
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
     * ����mapMny���Ե�ֵ��
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
     * ��ȡmActivateType���Ե�ֵ��
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
     * ����mActivateType���Ե�ֵ��
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
     * ��ȡmApprovedBy���Ե�ֵ��
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
     * ����mApprovedBy���Ե�ֵ��
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
     * ��ȡmApprovedOn���Ե�ֵ��
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
     * ����mApprovedOn���Ե�ֵ��
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
     * ��ȡmCurOperationNO���Ե�ֵ��
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
     * ����mCurOperationNO���Ե�ֵ��
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
     * ��ȡmDisusedBy���Ե�ֵ��
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
     * ����mDisusedBy���Ե�ֵ��
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
     * ��ȡmDisusedDate���Ե�ֵ��
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
     * ����mDisusedDate���Ե�ֵ��
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
     * ��ȡmDisusedReason���Ե�ֵ��
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
     * ����mDisusedReason���Ե�ֵ��
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
     * ��ȡmDoingReqFundAC���Ե�ֵ��
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
     * ����mDoingReqFundAC���Ե�ֵ��
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
     * ��ȡmExecutedAPMny���Ե�ֵ��
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
     * ����mExecutedAPMny���Ե�ֵ��
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
     * ��ȡmFindPriceDate���Ե�ֵ��
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
     * ����mFindPriceDate���Ե�ֵ��
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
     * ��ȡmHeadFeeAC���Ե�ֵ��
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
     * ����mHeadFeeAC���Ե�ֵ��
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
     * ��ȡmIsACFromSrc���Ե�ֵ��
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
     * ����mIsACFromSrc���Ե�ֵ��
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
     * ��ȡmIsBizClose���Ե�ֵ��
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
     * ����mIsBizClose���Ե�ֵ��
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
     * ��ȡmIsConfirmTermChangeable���Ե�ֵ��
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
     * ����mIsConfirmTermChangeable���Ե�ֵ��
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
     * ��ȡmIsDisused���Ե�ֵ��
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
     * ����mIsDisused���Ե�ֵ��
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
     * ��ȡmIsExchRateType���Ե�ֵ��
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
     * ����mIsExchRateType���Ե�ֵ��
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
     * ��ȡmIsFIClose���Ե�ֵ��
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
     * ����mIsFIClose���Ե�ֵ��
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
     * ��ȡmIsInitEvaluation���Ե�ֵ��
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
     * ����mIsInitEvaluation���Ե�ֵ��
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
     * ��ȡmIsLineApprove���Ե�ֵ��
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
     * ����mIsLineApprove���Ե�ֵ��
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
     * ��ȡmIsMatchPO���Ե�ֵ��
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
     * ����mIsMatchPO���Ե�ֵ��
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
     * ��ȡmIsMergerAPConfirm���Ե�ֵ��
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
     * ����mIsMergerAPConfirm���Ե�ֵ��
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
     * ��ȡmIsNeedWarning���Ե�ֵ��
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
     * ����mIsNeedWarning���Ե�ֵ��
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
     * ��ȡmIsPLFromShipSite���Ե�ֵ��
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
     * ����mIsPLFromShipSite���Ե�ֵ��
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
     * ��ȡmIsPaymentTermChangeable���Ե�ֵ��
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
     * ����mIsPaymentTermChangeable���Ե�ֵ��
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
     * ��ȡmIsPriceListChangeable���Ե�ֵ��
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
     * ����mIsPriceListChangeable���Ե�ֵ��
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
     * ��ȡmIsProcessAssChild���Ե�ֵ��
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
     * ����mIsProcessAssChild���Ե�ֵ��
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
     * ��ȡmIsProcessTrade���Ե�ֵ��
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
     * ����mIsProcessTrade���Ե�ֵ��
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
     * ��ȡmIsRcvByChangeable���Ե�ֵ��
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
     * ����mIsRcvByChangeable���Ե�ֵ��
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
     * ��ȡmIsRelationCompany���Ե�ֵ��
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
     * ����mIsRelationCompany���Ե�ֵ��
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
     * ��ȡmIsTCFromSrc���Ե�ֵ��
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
     * ����mIsTCFromSrc���Ե�ֵ��
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
     * ��ȡmMaxPrePayMnyAC���Ե�ֵ��
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
     * ����mMaxPrePayMnyAC���Ե�ֵ��
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
     * ��ȡmMaxPrePayPercent���Ե�ֵ��
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
     * ����mMaxPrePayPercent���Ե�ֵ��
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
     * ��ȡmMaxPrepayPercentEditable���Ե�ֵ��
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
     * ����mMaxPrepayPercentEditable���Ե�ֵ��
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
     * ��ȡmPayer���Ե�ֵ��
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
     * ����mPayer���Ե�ֵ��
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
     * ��ȡmPayerSite���Ե�ֵ��
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
     * ����mPayerSite���Ե�ֵ��
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
     * ��ȡmPaymentBill���Ե�ֵ��
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
     * ����mPaymentBill���Ե�ֵ��
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
     * ��ȡmPaymentBillLine���Ե�ֵ��
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
     * ����mPaymentBillLine���Ե�ֵ��
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
     * ��ȡmPaymentBillLineNo���Ե�ֵ��
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
     * ����mPaymentBillLineNo���Ե�ֵ��
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
     * ��ȡmPaymentBillNo���Ե�ֵ��
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
     * ����mPaymentBillNo���Ե�ֵ��
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
     * ��ȡmPaymentCode���Ե�ֵ��
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
     * ����mPaymentCode���Ե�ֵ��
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
     * ��ȡmPrePayPolicyEditable���Ե�ֵ��
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
     * ����mPrePayPolicyEditable���Ե�ֵ��
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
     * ��ȡmPriceStatus���Ե�ֵ��
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
     * ����mPriceStatus���Ե�ֵ��
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
     * ��ȡmPromptInfo���Ե�ֵ��
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
     * ����mPromptInfo���Ե�ֵ��
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
     * ��ȡmrcvParam���Ե�ֵ��
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
     * ����mrcvParam���Ե�ֵ��
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
     * ��ȡmRcvDiscount���Ե�ֵ��
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
     * ����mRcvDiscount���Ե�ֵ��
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
     * ��ȡmRcvParamSerialize���Ե�ֵ��
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
     * ����mRcvParamSerialize���Ե�ֵ��
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
     * ��ȡmRcvTax���Ե�ֵ��
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
     * ����mRcvTax���Ե�ֵ��
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
     * ��ȡmReceivementType���Ե�ֵ��
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
     * ����mReceivementType���Ե�ֵ��
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
     * ��ȡmRejectMode���Ե�ֵ��
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
     * ����mRejectMode���Ե�ֵ��
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
     * ��ȡmReverseRtnDocRed���Ե�ֵ��
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
     * ����mReverseRtnDocRed���Ե�ֵ��
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
     * ��ȡmRtnCustomer���Ե�ֵ��
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
     * ����mRtnCustomer���Ե�ֵ��
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
     * ��ȡmRtnType���Ե�ֵ��
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
     * ����mRtnType���Ե�ֵ��
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
     * ��ȡmSaleReturnRcvType���Ե�ֵ��
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
     * ����mSaleReturnRcvType���Ե�ֵ��
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
     * ��ȡmShipID���Ե�ֵ��
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
     * ����mShipID���Ե�ֵ��
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
     * ��ȡmShowUniqueID���Ե�ֵ��
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
     * ����mShowUniqueID���Ե�ֵ��
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
     * ��ȡmShowWarningMessageFormID���Ե�ֵ��
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
     * ����mShowWarningMessageFormID���Ե�ֵ��
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
     * ��ȡmSupplier���Ե�ֵ��
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
     * ����mSupplier���Ե�ֵ��
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
     * ��ȡmtcToACExRate���Ե�ֵ��
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
     * ����mtcToACExRate���Ե�ֵ��
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
     * ��ȡmtcToACExRateType���Ե�ֵ��
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
     * ����mtcToACExRateType���Ե�ֵ��
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
     * ��ȡmTotalArriveMnyAC���Ե�ֵ��
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
     * ����mTotalArriveMnyAC���Ե�ֵ��
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
     * ��ȡmTotalArriveMnyFC���Ե�ֵ��
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
     * ����mTotalArriveMnyFC���Ե�ֵ��
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
     * ��ȡmTotalArriveMnyTC���Ե�ֵ��
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
     * ����mTotalArriveMnyTC���Ե�ֵ��
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
     * ��ȡmTotalArriveNetMnyAC���Ե�ֵ��
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
     * ����mTotalArriveNetMnyAC���Ե�ֵ��
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
     * ��ȡmTotalArriveNetMnyFC���Ե�ֵ��
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
     * ����mTotalArriveNetMnyFC���Ե�ֵ��
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
     * ��ȡmTotalArriveNetMnyTC���Ե�ֵ��
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
     * ����mTotalArriveNetMnyTC���Ե�ֵ��
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
     * ��ȡmTotalArriveTaxAC���Ե�ֵ��
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
     * ����mTotalArriveTaxAC���Ե�ֵ��
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
     * ��ȡmTotalArriveTaxFC���Ե�ֵ��
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
     * ����mTotalArriveTaxFC���Ե�ֵ��
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
     * ��ȡmTotalArriveTaxTC���Ե�ֵ��
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
     * ����mTotalArriveTaxTC���Ե�ֵ��
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
     * ��ȡmTotalFeeAC���Ե�ֵ��
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
     * ����mTotalFeeAC���Ե�ֵ��
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
     * ��ȡmTotalMnyAC���Ե�ֵ��
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
     * ����mTotalMnyAC���Ե�ֵ��
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
     * ��ȡmTotalMnyFC���Ե�ֵ��
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
     * ����mTotalMnyFC���Ե�ֵ��
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
     * ��ȡmTotalMnyTC���Ե�ֵ��
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
     * ����mTotalMnyTC���Ե�ֵ��
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
     * ��ȡmTotalNetMnyAC���Ե�ֵ��
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
     * ����mTotalNetMnyAC���Ե�ֵ��
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
     * ��ȡmTotalNetMnyFC���Ե�ֵ��
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
     * ����mTotalNetMnyFC���Ե�ֵ��
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
     * ��ȡmTotalNetMnyTC���Ե�ֵ��
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
     * ����mTotalNetMnyTC���Ե�ֵ��
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
     * ��ȡmTotalRejectMnyAC���Ե�ֵ��
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
     * ����mTotalRejectMnyAC���Ե�ֵ��
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
     * ��ȡmTotalRejectMnyFC���Ե�ֵ��
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
     * ����mTotalRejectMnyFC���Ե�ֵ��
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
     * ��ȡmTotalRejectMnyTC���Ե�ֵ��
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
     * ����mTotalRejectMnyTC���Ե�ֵ��
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
     * ��ȡmTotalRejectNetMnyAC���Ե�ֵ��
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
     * ����mTotalRejectNetMnyAC���Ե�ֵ��
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
     * ��ȡmTotalRejectNetMnyFC���Ե�ֵ��
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
     * ����mTotalRejectNetMnyFC���Ե�ֵ��
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
     * ��ȡmTotalRejectNetMnyTC���Ե�ֵ��
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
     * ����mTotalRejectNetMnyTC���Ե�ֵ��
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
     * ��ȡmTotalRejectTaxAC���Ե�ֵ��
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
     * ����mTotalRejectTaxAC���Ե�ֵ��
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
     * ��ȡmTotalRejectTaxFC���Ե�ֵ��
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
     * ����mTotalRejectTaxFC���Ե�ֵ��
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
     * ��ȡmTotalRejectTaxTC���Ե�ֵ��
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
     * ����mTotalRejectTaxTC���Ե�ֵ��
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
     * ��ȡmTotalRtnDeductMnyAC���Ե�ֵ��
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
     * ����mTotalRtnDeductMnyAC���Ե�ֵ��
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
     * ��ȡmTotalRtnDeductMnyFC���Ե�ֵ��
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
     * ����mTotalRtnDeductMnyFC���Ե�ֵ��
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
     * ��ȡmTotalRtnDeductMnyTC���Ե�ֵ��
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
     * ����mTotalRtnDeductMnyTC���Ե�ֵ��
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
     * ��ȡmTotalRtnDeductNetMnyAC���Ե�ֵ��
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
     * ����mTotalRtnDeductNetMnyAC���Ե�ֵ��
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
     * ��ȡmTotalRtnDeductNetMnyFC���Ե�ֵ��
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
     * ����mTotalRtnDeductNetMnyFC���Ե�ֵ��
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
     * ��ȡmTotalRtnDeductNetMnyTC���Ե�ֵ��
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
     * ����mTotalRtnDeductNetMnyTC���Ե�ֵ��
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
     * ��ȡmTotalRtnDeductTaxAC���Ե�ֵ��
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
     * ����mTotalRtnDeductTaxAC���Ե�ֵ��
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
     * ��ȡmTotalRtnDeductTaxFC���Ե�ֵ��
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
     * ����mTotalRtnDeductTaxFC���Ե�ֵ��
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
     * ��ȡmTotalRtnDeductTaxTC���Ե�ֵ��
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
     * ����mTotalRtnDeductTaxTC���Ե�ֵ��
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
     * ��ȡmTotalTaxAC���Ե�ֵ��
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
     * ����mTotalTaxAC���Ե�ֵ��
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
     * ��ȡmUnApprovedBy���Ե�ֵ��
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
     * ����mUnApprovedBy���Ե�ֵ��
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
     * ��ȡmUnApprovedOn���Ե�ֵ��
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
     * ����mUnApprovedOn���Ե�ֵ��
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
     * ��ȡmWarrantNo���Ե�ֵ��
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
     * ����mWarrantNo���Ե�ֵ��
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
