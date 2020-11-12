
package icreateshipsv.org.ufida.entitydata;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

import icreateshipsv.businessentity.business.ubf.ufsoft.EntityKey;
import icreateshipsv.com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring;
import icreateshipsv.data.util.ubf.ufsoft.MultiLangDataDict;


/**
 * &lt;p&gt;UFIDA.U9.ISV.SM.ShipDTOForIndustryChainData complex type�� Java �ࡣ
 * 
 * &lt;p&gt;����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="UFIDA.U9.ISV.SM.ShipDTOForIndustryChainData"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://www.UFIDA.org/EntityData}UFSoft.UBF.Business.DataTransObjectBase"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="CarrierLinkman" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="CarrierLinkman_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Channel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Linkman" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Linkman_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Multi_Channel" type="{UFSoft.UBF.Util.Data}MultiLangDataDict" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Recipients" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Recipients_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ShipLinkman" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ShipLinkman_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="TransInSite" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="TransInSite_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="TransportLinkman" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="TransportLinkman_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_aC" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CBO.Pub.Controller.CommonArchiveDataDTOData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_aCToFCExRate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_aRBillKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_aRBillLineKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_aRBillLineNo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_aRBillNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_aRMoneyAC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_aRMoneyFC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_aRMoneyTC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_accountOrg" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CBO.Pub.Controller.CommonArchiveDataDTOData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_actualShippingDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_aimPort" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CBO.Pub.Controller.CommonArchiveDataDTOData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_aimPortLinkman" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_bargainMode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_billOfLadingNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_billToSite" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CBO.Pub.Controller.CommonArchiveDataDTOData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_bizType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_boxType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_boxingNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_boxingType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_businessDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_cATotalTaxAC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_cATotalTaxFC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_cATotalTaxTC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_carriagePayMode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_carrier" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CBO.Pub.Controller.CommonArchiveDataDTOData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_changeFieldList" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_commonInsurance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_confirmAccording" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CBO.Pub.Controller.CommonArchiveDataDTOData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_confirmMode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_confirmTerm" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CBO.Pub.Controller.CommonArchiveDataDTOData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_containerNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_containerQty" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_containerSize" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_containerTotalQty" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_createdBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_createdOn" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_cusAgentWH" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CBO.Pub.Controller.CommonArchiveDataDTOData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_customsBroker" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_demandCode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_descFlexField" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.Base.FlexField.DescFlexField.DescFlexSegmentsData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_destination" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CBO.Pub.Controller.CommonArchiveDataDTOData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_docNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_documentType" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CBO.Pub.Controller.CommonArchiveDataDTOData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_exceptionDealAnnounce" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_exchangeRateType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_fC" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CBO.Pub.Controller.CommonArchiveDataDTOData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_feeSourceBillType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_flightNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_headFee" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_headFeeFC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_headFeeTC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_iD" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_incomeConfirmRule" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_incomeConfirmTerm" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CBO.Pub.Controller.CommonArchiveDataDTOData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_innerSupersedeEnum" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_insurance" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_insuranceCurrency" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CBO.Pub.Controller.CommonArchiveDataDTOData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_insuranceTerm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_insuranceType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_insureRatio" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_intendArriveDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_invoiceAccording" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CBO.Pub.Controller.CommonArchiveDataDTOData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_invoiceNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_invoiceOrg" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CBO.Pub.Controller.CommonArchiveDataDTOData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isARFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isAccountOrgChangeable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isBatch" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isBeginning" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isCompensate" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isDemandCodeUnChangeable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isExport" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isFromECO" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isInnerShipment" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isInvoiceOrgChangeable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
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
 *         &amp;lt;element name="m_isPriceIncludeTax" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isTransPort" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_keepAccountsPeriod" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CBO.Pub.Controller.CommonArchiveDataDTOData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_latestArriveDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_latestShippingDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_loadLimit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_modifiedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_modifiedOn" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_netAccount" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_operatingOrg" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CBO.Pub.Controller.CommonArchiveDataDTOData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_orderBy" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CBO.Pub.Controller.CommonArchiveDataDTOData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_org" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CBO.Pub.Controller.CommonArchiveDataDTOData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_passPort" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CBO.Pub.Controller.CommonArchiveDataDTOData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_payer" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CBO.Pub.Controller.CommonArchiveDataDTOData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_payerSite" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CBO.Pub.Controller.CommonArchiveDataDTOData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_policyHolder" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_precisionACFC" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_priceList" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_priceListName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_priceListNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_producingArea" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_productName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_recBillLineKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_recBillLineNO" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_receivableTerm" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CBO.Pub.Controller.CommonArchiveDataDTOData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_receivableTermName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_receivableTerm_Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_receivalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_receiveBillKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_receiveBillNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_sOBPeriods" type="{http://www.UFIDA.org/EntityData}ArrayOfUFIDA.U9.ISV.SM.SOBPeriodSRVDTOForIndustryChainData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_saleDept" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CBO.Pub.Controller.CommonArchiveDataDTOData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_salverQty" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_seller" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CBO.Pub.Controller.CommonArchiveDataDTOData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_settlementOrg" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CBO.Pub.Controller.CommonArchiveDataDTOData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_shipAchievements" type="{http://www.UFIDA.org/EntityData}ArrayOfUFIDA.U9.ISV.SM.ShipAchievementDTOForIndustryChainData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_shipAddresss" type="{http://www.UFIDA.org/EntityData}ArrayOfUFIDA.U9.ISV.SM.ShipAddressDTOForIndustryChainData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_shipConfirmDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_shipContacts" type="{http://www.UFIDA.org/EntityData}ArrayOfUFIDA.U9.ISV.SM.ShipContactDTOForIndustryChainData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_shipDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_shipFees" type="{http://www.UFIDA.org/EntityData}ArrayOfUFIDA.U9.ISV.SM.ShipFeeDTOForIndustryChainData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_shipLines" type="{http://www.UFIDA.org/EntityData}ArrayOfUFIDA.U9.ISV.SM.ShipLineDTOForIndustryChainData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_shipMemo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_shipMode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_shipName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_shipOrg" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CBO.Pub.Controller.CommonArchiveDataDTOData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_shipTaxs" type="{http://www.UFIDA.org/EntityData}ArrayOfUFIDA.U9.ISV.SM.ShipTaxDTOForIndustryChainData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_shipmentRule" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CBO.Pub.Controller.CommonArchiveDataDTOData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_shippingDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_shippingPort" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CBO.Pub.Controller.CommonArchiveDataDTOData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_shippingPortLinkman" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_signInBy" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_signInTotalTaxAC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_signInTotalTaxFC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_signInTotalTaxTC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_specialInsurance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_srcDocType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_supplier" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CBO.Pub.Controller.CommonArchiveDataDTOData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_sysVersion" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_tC" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CBO.Pub.Controller.CommonArchiveDataDTOData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_taxFreeNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_taxSchedule" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CBO.Pub.Controller.CommonArchiveDataDTOData" minOccurs="0"/&amp;gt;
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
 *         &amp;lt;element name="m_transMode" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CBO.Pub.Controller.CommonArchiveDataDTOData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_warpRatio" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_whSite" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CBO.Pub.Controller.CommonArchiveDataDTOData" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UFIDA.U9.ISV.SM.ShipDTOForIndustryChainData", propOrder = {
    "carrierLinkman",
    "carrierLinkmanSKey",
    "channel",
    "linkman",
    "linkmanSKey",
    "multiChannel",
    "recipients",
    "recipientsSKey",
    "shipLinkman",
    "shipLinkmanSKey",
    "transInSite",
    "transInSiteSKey",
    "transportLinkman",
    "transportLinkmanSKey",
    "mac",
    "macToFCExRate",
    "marBillKey",
    "marBillLineKey",
    "marBillLineNo",
    "marBillNo",
    "marMoneyAC",
    "marMoneyFC",
    "marMoneyTC",
    "mAccountOrg",
    "mActualShippingDate",
    "mAimPort",
    "mAimPortLinkman",
    "mBargainMode",
    "mBillOfLadingNo",
    "mBillToSite",
    "mBizType",
    "mBoxType",
    "mBoxingNo",
    "mBoxingType",
    "mBusinessDate",
    "mcaTotalTaxAC",
    "mcaTotalTaxFC",
    "mcaTotalTaxTC",
    "mCarriagePayMode",
    "mCarrier",
    "mChangeFieldList",
    "mCommonInsurance",
    "mConfirmAccording",
    "mConfirmMode",
    "mConfirmTerm",
    "mContainerNo",
    "mContainerQty",
    "mContainerSize",
    "mContainerTotalQty",
    "mCreatedBy",
    "mCreatedOn",
    "mCusAgentWH",
    "mCustomsBroker",
    "mDemandCode",
    "mDescFlexField",
    "mDestination",
    "mDocNo",
    "mDocumentType",
    "mExceptionDealAnnounce",
    "mExchangeRateType",
    "mfc",
    "mFeeSourceBillType",
    "mFlightNo",
    "mHeadFee",
    "mHeadFeeFC",
    "mHeadFeeTC",
    "mid",
    "mIncomeConfirmRule",
    "mIncomeConfirmTerm",
    "mInnerSupersedeEnum",
    "mInsurance",
    "mInsuranceCurrency",
    "mInsuranceTerm",
    "mInsuranceType",
    "mInsureRatio",
    "mIntendArriveDate",
    "mInvoiceAccording",
    "mInvoiceNo",
    "mInvoiceOrg",
    "mIsARFlag",
    "mIsAccountOrgChangeable",
    "mIsBatch",
    "mIsBeginning",
    "mIsCompensate",
    "mIsDemandCodeUnChangeable",
    "mIsExport",
    "mIsFromECO",
    "mIsInnerShipment",
    "mIsInvoiceOrgChangeable",
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
    "mIsPriceIncludeTax",
    "mIsTransPort",
    "mKeepAccountsPeriod",
    "mLatestArriveDate",
    "mLatestShippingDate",
    "mLoadLimit",
    "mModifiedBy",
    "mModifiedOn",
    "mNetAccount",
    "mOperatingOrg",
    "mOrderBy",
    "mOrg",
    "mPassPort",
    "mPayer",
    "mPayerSite",
    "mPolicyHolder",
    "mPrecisionACFC",
    "mPriceList",
    "mPriceListName",
    "mPriceListNo",
    "mProducingArea",
    "mProductName",
    "mRecBillLineKey",
    "mRecBillLineNO",
    "mReceivableTerm",
    "mReceivableTermName",
    "mReceivableTermCode",
    "mReceivalCode",
    "mReceiveBillKey",
    "mReceiveBillNo",
    "msobPeriods",
    "mSaleDept",
    "mSalverQty",
    "mSeller",
    "mSettlementOrg",
    "mShipAchievements",
    "mShipAddresss",
    "mShipConfirmDate",
    "mShipContacts",
    "mShipDate",
    "mShipFees",
    "mShipLines",
    "mShipMemo",
    "mShipMode",
    "mShipName",
    "mShipOrg",
    "mShipTaxs",
    "mShipmentRule",
    "mShippingDate",
    "mShippingPort",
    "mShippingPortLinkman",
    "mSignInBy",
    "mSignInTotalTaxAC",
    "mSignInTotalTaxFC",
    "mSignInTotalTaxTC",
    "mSpecialInsurance",
    "mSrcDocType",
    "mSupplier",
    "mSysVersion",
    "mtc",
    "mTaxFreeNo",
    "mTaxSchedule",
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
    "mTransMode",
    "mWarpRatio",
    "mWhSite"
})
public class UFIDAU9ISVSMShipDTOForIndustryChainData
    extends UFSoftUBFBusinessDataTransObjectBase
{

    @XmlElement(name = "CarrierLinkman")
    protected Long carrierLinkman;
    @XmlElementRef(name = "CarrierLinkman_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> carrierLinkmanSKey;
    @XmlElementRef(name = "Channel", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> channel;
    @XmlElement(name = "Linkman")
    protected Long linkman;
    @XmlElementRef(name = "Linkman_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> linkmanSKey;
    @XmlElementRef(name = "Multi_Channel", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<MultiLangDataDict> multiChannel;
    @XmlElement(name = "Recipients")
    protected Long recipients;
    @XmlElementRef(name = "Recipients_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> recipientsSKey;
    @XmlElement(name = "ShipLinkman")
    protected Long shipLinkman;
    @XmlElementRef(name = "ShipLinkman_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> shipLinkmanSKey;
    @XmlElement(name = "TransInSite")
    protected Long transInSite;
    @XmlElementRef(name = "TransInSite_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> transInSiteSKey;
    @XmlElement(name = "TransportLinkman")
    protected Long transportLinkman;
    @XmlElementRef(name = "TransportLinkman_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> transportLinkmanSKey;
    @XmlElementRef(name = "m_aC", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> mac;
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
    @XmlElementRef(name = "m_accountOrg", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> mAccountOrg;
    @XmlElement(name = "m_actualShippingDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mActualShippingDate;
    @XmlElementRef(name = "m_aimPort", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> mAimPort;
    @XmlElementRef(name = "m_aimPortLinkman", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mAimPortLinkman;
    @XmlElement(name = "m_bargainMode")
    protected Integer mBargainMode;
    @XmlElementRef(name = "m_billOfLadingNo", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mBillOfLadingNo;
    @XmlElementRef(name = "m_billToSite", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> mBillToSite;
    @XmlElement(name = "m_bizType")
    protected Integer mBizType;
    @XmlElementRef(name = "m_boxType", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mBoxType;
    @XmlElementRef(name = "m_boxingNo", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mBoxingNo;
    @XmlElementRef(name = "m_boxingType", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mBoxingType;
    @XmlElement(name = "m_businessDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mBusinessDate;
    @XmlElement(name = "m_cATotalTaxAC")
    protected BigDecimal mcaTotalTaxAC;
    @XmlElement(name = "m_cATotalTaxFC")
    protected BigDecimal mcaTotalTaxFC;
    @XmlElement(name = "m_cATotalTaxTC")
    protected BigDecimal mcaTotalTaxTC;
    @XmlElement(name = "m_carriagePayMode")
    protected Integer mCarriagePayMode;
    @XmlElementRef(name = "m_carrier", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> mCarrier;
    @XmlElementRef(name = "m_changeFieldList", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfstring> mChangeFieldList;
    @XmlElementRef(name = "m_commonInsurance", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mCommonInsurance;
    @XmlElementRef(name = "m_confirmAccording", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> mConfirmAccording;
    @XmlElement(name = "m_confirmMode")
    protected Integer mConfirmMode;
    @XmlElementRef(name = "m_confirmTerm", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> mConfirmTerm;
    @XmlElementRef(name = "m_containerNo", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mContainerNo;
    @XmlElement(name = "m_containerQty")
    protected Integer mContainerQty;
    @XmlElementRef(name = "m_containerSize", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mContainerSize;
    @XmlElement(name = "m_containerTotalQty")
    protected Integer mContainerTotalQty;
    @XmlElementRef(name = "m_createdBy", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mCreatedBy;
    @XmlElement(name = "m_createdOn")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mCreatedOn;
    @XmlElementRef(name = "m_cusAgentWH", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> mCusAgentWH;
    @XmlElementRef(name = "m_customsBroker", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mCustomsBroker;
    @XmlElement(name = "m_demandCode")
    protected Integer mDemandCode;
    @XmlElementRef(name = "m_descFlexField", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9BaseFlexFieldDescFlexFieldDescFlexSegmentsData> mDescFlexField;
    @XmlElementRef(name = "m_destination", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> mDestination;
    @XmlElementRef(name = "m_docNo", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mDocNo;
    @XmlElementRef(name = "m_documentType", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> mDocumentType;
    @XmlElementRef(name = "m_exceptionDealAnnounce", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mExceptionDealAnnounce;
    @XmlElement(name = "m_exchangeRateType")
    protected Integer mExchangeRateType;
    @XmlElementRef(name = "m_fC", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> mfc;
    @XmlElement(name = "m_feeSourceBillType")
    protected Integer mFeeSourceBillType;
    @XmlElementRef(name = "m_flightNo", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mFlightNo;
    @XmlElement(name = "m_headFee")
    protected BigDecimal mHeadFee;
    @XmlElement(name = "m_headFeeFC")
    protected BigDecimal mHeadFeeFC;
    @XmlElement(name = "m_headFeeTC")
    protected BigDecimal mHeadFeeTC;
    @XmlElement(name = "m_iD")
    protected Long mid;
    @XmlElement(name = "m_incomeConfirmRule")
    protected Integer mIncomeConfirmRule;
    @XmlElementRef(name = "m_incomeConfirmTerm", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> mIncomeConfirmTerm;
    @XmlElement(name = "m_innerSupersedeEnum")
    protected Integer mInnerSupersedeEnum;
    @XmlElement(name = "m_insurance")
    protected BigDecimal mInsurance;
    @XmlElementRef(name = "m_insuranceCurrency", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> mInsuranceCurrency;
    @XmlElementRef(name = "m_insuranceTerm", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mInsuranceTerm;
    @XmlElement(name = "m_insuranceType")
    protected Integer mInsuranceType;
    @XmlElement(name = "m_insureRatio")
    protected BigDecimal mInsureRatio;
    @XmlElement(name = "m_intendArriveDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mIntendArriveDate;
    @XmlElementRef(name = "m_invoiceAccording", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> mInvoiceAccording;
    @XmlElementRef(name = "m_invoiceNo", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mInvoiceNo;
    @XmlElementRef(name = "m_invoiceOrg", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> mInvoiceOrg;
    @XmlElement(name = "m_isARFlag")
    protected Boolean mIsARFlag;
    @XmlElement(name = "m_isAccountOrgChangeable")
    protected Boolean mIsAccountOrgChangeable;
    @XmlElement(name = "m_isBatch")
    protected Boolean mIsBatch;
    @XmlElement(name = "m_isBeginning")
    protected Boolean mIsBeginning;
    @XmlElement(name = "m_isCompensate")
    protected Boolean mIsCompensate;
    @XmlElement(name = "m_isDemandCodeUnChangeable")
    protected Boolean mIsDemandCodeUnChangeable;
    @XmlElement(name = "m_isExport")
    protected Boolean mIsExport;
    @XmlElement(name = "m_isFromECO")
    protected Boolean mIsFromECO;
    @XmlElement(name = "m_isInnerShipment")
    protected Boolean mIsInnerShipment;
    @XmlElement(name = "m_isInvoiceOrgChangeable")
    protected Boolean mIsInvoiceOrgChangeable;
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
    @XmlElement(name = "m_isPriceIncludeTax")
    protected Boolean mIsPriceIncludeTax;
    @XmlElement(name = "m_isTransPort")
    protected Boolean mIsTransPort;
    @XmlElementRef(name = "m_keepAccountsPeriod", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> mKeepAccountsPeriod;
    @XmlElement(name = "m_latestArriveDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mLatestArriveDate;
    @XmlElement(name = "m_latestShippingDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mLatestShippingDate;
    @XmlElementRef(name = "m_loadLimit", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mLoadLimit;
    @XmlElementRef(name = "m_modifiedBy", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mModifiedBy;
    @XmlElement(name = "m_modifiedOn")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mModifiedOn;
    @XmlElement(name = "m_netAccount")
    protected Boolean mNetAccount;
    @XmlElementRef(name = "m_operatingOrg", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> mOperatingOrg;
    @XmlElementRef(name = "m_orderBy", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> mOrderBy;
    @XmlElementRef(name = "m_org", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> mOrg;
    @XmlElementRef(name = "m_passPort", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> mPassPort;
    @XmlElementRef(name = "m_payer", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> mPayer;
    @XmlElementRef(name = "m_payerSite", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> mPayerSite;
    @XmlElementRef(name = "m_policyHolder", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mPolicyHolder;
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
    @XmlElementRef(name = "m_receivableTerm", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> mReceivableTerm;
    @XmlElementRef(name = "m_receivableTermName", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mReceivableTermName;
    @XmlElementRef(name = "m_receivableTerm_Code", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mReceivableTermCode;
    @XmlElementRef(name = "m_receivalCode", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mReceivalCode;
    @XmlElement(name = "m_receiveBillKey")
    protected Long mReceiveBillKey;
    @XmlElementRef(name = "m_receiveBillNo", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mReceiveBillNo;
    @XmlElementRef(name = "m_sOBPeriods", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfUFIDAU9ISVSMSOBPeriodSRVDTOForIndustryChainData> msobPeriods;
    @XmlElementRef(name = "m_saleDept", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> mSaleDept;
    @XmlElement(name = "m_salverQty")
    protected Integer mSalverQty;
    @XmlElementRef(name = "m_seller", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> mSeller;
    @XmlElementRef(name = "m_settlementOrg", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> mSettlementOrg;
    @XmlElementRef(name = "m_shipAchievements", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfUFIDAU9ISVSMShipAchievementDTOForIndustryChainData> mShipAchievements;
    @XmlElementRef(name = "m_shipAddresss", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfUFIDAU9ISVSMShipAddressDTOForIndustryChainData> mShipAddresss;
    @XmlElement(name = "m_shipConfirmDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mShipConfirmDate;
    @XmlElementRef(name = "m_shipContacts", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfUFIDAU9ISVSMShipContactDTOForIndustryChainData> mShipContacts;
    @XmlElement(name = "m_shipDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mShipDate;
    @XmlElementRef(name = "m_shipFees", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfUFIDAU9ISVSMShipFeeDTOForIndustryChainData> mShipFees;
    @XmlElementRef(name = "m_shipLines", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfUFIDAU9ISVSMShipLineDTOForIndustryChainData> mShipLines;
    @XmlElementRef(name = "m_shipMemo", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mShipMemo;
    @XmlElement(name = "m_shipMode")
    protected Integer mShipMode;
    @XmlElementRef(name = "m_shipName", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mShipName;
    @XmlElementRef(name = "m_shipOrg", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> mShipOrg;
    @XmlElementRef(name = "m_shipTaxs", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfUFIDAU9ISVSMShipTaxDTOForIndustryChainData> mShipTaxs;
    @XmlElementRef(name = "m_shipmentRule", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> mShipmentRule;
    @XmlElement(name = "m_shippingDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mShippingDate;
    @XmlElementRef(name = "m_shippingPort", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> mShippingPort;
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
    @XmlElementRef(name = "m_supplier", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> mSupplier;
    @XmlElement(name = "m_sysVersion")
    protected Long mSysVersion;
    @XmlElementRef(name = "m_tC", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> mtc;
    @XmlElementRef(name = "m_taxFreeNo", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mTaxFreeNo;
    @XmlElementRef(name = "m_taxSchedule", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> mTaxSchedule;
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
    @XmlElementRef(name = "m_transMode", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> mTransMode;
    @XmlElement(name = "m_warpRatio")
    protected BigDecimal mWarpRatio;
    @XmlElementRef(name = "m_whSite", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> mWhSite;

    /**
     * ��ȡcarrierLinkman���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCarrierLinkman() {
        return carrierLinkman;
    }

    /**
     * ����carrierLinkman���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCarrierLinkman(Long value) {
        this.carrierLinkman = value;
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
     * ��ȡlinkman���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getLinkman() {
        return linkman;
    }

    /**
     * ����linkman���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setLinkman(Long value) {
        this.linkman = value;
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
     * ��ȡrecipients���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRecipients() {
        return recipients;
    }

    /**
     * ����recipients���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRecipients(Long value) {
        this.recipients = value;
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
     * ��ȡtransInSite���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTransInSite() {
        return transInSite;
    }

    /**
     * ����transInSite���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTransInSite(Long value) {
        this.transInSite = value;
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
     * ��ȡtransportLinkman���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTransportLinkman() {
        return transportLinkman;
    }

    /**
     * ����transportLinkman���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTransportLinkman(Long value) {
        this.transportLinkman = value;
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
     * ��ȡmac���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> getMAC() {
        return mac;
    }

    /**
     * ����mac���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public void setMAC(JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> value) {
        this.mac = value;
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
     * ��ȡmAccountOrg���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> getMAccountOrg() {
        return mAccountOrg;
    }

    /**
     * ����mAccountOrg���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public void setMAccountOrg(JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> value) {
        this.mAccountOrg = value;
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
     * ��ȡmAimPort���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> getMAimPort() {
        return mAimPort;
    }

    /**
     * ����mAimPort���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public void setMAimPort(JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> value) {
        this.mAimPort = value;
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
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> getMBillToSite() {
        return mBillToSite;
    }

    /**
     * ����mBillToSite���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public void setMBillToSite(JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> value) {
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
     * ��ȡmBusinessDate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMBusinessDate() {
        return mBusinessDate;
    }

    /**
     * ����mBusinessDate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMBusinessDate(XMLGregorianCalendar value) {
        this.mBusinessDate = value;
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
     * ��ȡmCarrier���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> getMCarrier() {
        return mCarrier;
    }

    /**
     * ����mCarrier���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public void setMCarrier(JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> value) {
        this.mCarrier = value;
    }

    /**
     * ��ȡmChangeFieldList���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public JAXBElement<ArrayOfstring> getMChangeFieldList() {
        return mChangeFieldList;
    }

    /**
     * ����mChangeFieldList���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public void setMChangeFieldList(JAXBElement<ArrayOfstring> value) {
        this.mChangeFieldList = value;
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
     * ��ȡmConfirmAccording���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> getMConfirmAccording() {
        return mConfirmAccording;
    }

    /**
     * ����mConfirmAccording���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public void setMConfirmAccording(JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> value) {
        this.mConfirmAccording = value;
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
     * ��ȡmConfirmTerm���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> getMConfirmTerm() {
        return mConfirmTerm;
    }

    /**
     * ����mConfirmTerm���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public void setMConfirmTerm(JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> value) {
        this.mConfirmTerm = value;
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
     * ��ȡmCusAgentWH���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> getMCusAgentWH() {
        return mCusAgentWH;
    }

    /**
     * ����mCusAgentWH���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public void setMCusAgentWH(JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> value) {
        this.mCusAgentWH = value;
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
     * ��ȡmDestination���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> getMDestination() {
        return mDestination;
    }

    /**
     * ����mDestination���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public void setMDestination(JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> value) {
        this.mDestination = value;
    }

    /**
     * ��ȡmDocNo���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMDocNo() {
        return mDocNo;
    }

    /**
     * ����mDocNo���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMDocNo(JAXBElement<String> value) {
        this.mDocNo = value;
    }

    /**
     * ��ȡmDocumentType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> getMDocumentType() {
        return mDocumentType;
    }

    /**
     * ����mDocumentType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public void setMDocumentType(JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> value) {
        this.mDocumentType = value;
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
     * ��ȡmfc���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> getMFC() {
        return mfc;
    }

    /**
     * ����mfc���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public void setMFC(JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> value) {
        this.mfc = value;
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
     * ��ȡmIncomeConfirmTerm���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> getMIncomeConfirmTerm() {
        return mIncomeConfirmTerm;
    }

    /**
     * ����mIncomeConfirmTerm���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public void setMIncomeConfirmTerm(JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> value) {
        this.mIncomeConfirmTerm = value;
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
     * ��ȡmInsuranceCurrency���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> getMInsuranceCurrency() {
        return mInsuranceCurrency;
    }

    /**
     * ����mInsuranceCurrency���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public void setMInsuranceCurrency(JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> value) {
        this.mInsuranceCurrency = value;
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
     * ��ȡmInvoiceAccording���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> getMInvoiceAccording() {
        return mInvoiceAccording;
    }

    /**
     * ����mInvoiceAccording���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public void setMInvoiceAccording(JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> value) {
        this.mInvoiceAccording = value;
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
     * ��ȡmInvoiceOrg���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> getMInvoiceOrg() {
        return mInvoiceOrg;
    }

    /**
     * ����mInvoiceOrg���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public void setMInvoiceOrg(JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> value) {
        this.mInvoiceOrg = value;
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
     * ��ȡmIsFromECO���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsFromECO() {
        return mIsFromECO;
    }

    /**
     * ����mIsFromECO���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsFromECO(Boolean value) {
        this.mIsFromECO = value;
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
     * ��ȡmKeepAccountsPeriod���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> getMKeepAccountsPeriod() {
        return mKeepAccountsPeriod;
    }

    /**
     * ����mKeepAccountsPeriod���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public void setMKeepAccountsPeriod(JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> value) {
        this.mKeepAccountsPeriod = value;
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
     * ��ȡmOperatingOrg���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> getMOperatingOrg() {
        return mOperatingOrg;
    }

    /**
     * ����mOperatingOrg���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public void setMOperatingOrg(JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> value) {
        this.mOperatingOrg = value;
    }

    /**
     * ��ȡmOrderBy���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> getMOrderBy() {
        return mOrderBy;
    }

    /**
     * ����mOrderBy���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public void setMOrderBy(JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> value) {
        this.mOrderBy = value;
    }

    /**
     * ��ȡmOrg���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> getMOrg() {
        return mOrg;
    }

    /**
     * ����mOrg���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public void setMOrg(JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> value) {
        this.mOrg = value;
    }

    /**
     * ��ȡmPassPort���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> getMPassPort() {
        return mPassPort;
    }

    /**
     * ����mPassPort���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public void setMPassPort(JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> value) {
        this.mPassPort = value;
    }

    /**
     * ��ȡmPayer���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> getMPayer() {
        return mPayer;
    }

    /**
     * ����mPayer���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public void setMPayer(JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> value) {
        this.mPayer = value;
    }

    /**
     * ��ȡmPayerSite���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> getMPayerSite() {
        return mPayerSite;
    }

    /**
     * ����mPayerSite���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public void setMPayerSite(JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> value) {
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
     * ��ȡmReceivableTerm���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> getMReceivableTerm() {
        return mReceivableTerm;
    }

    /**
     * ����mReceivableTerm���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public void setMReceivableTerm(JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> value) {
        this.mReceivableTerm = value;
    }

    /**
     * ��ȡmReceivableTermName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMReceivableTermName() {
        return mReceivableTermName;
    }

    /**
     * ����mReceivableTermName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMReceivableTermName(JAXBElement<String> value) {
        this.mReceivableTermName = value;
    }

    /**
     * ��ȡmReceivableTermCode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMReceivableTermCode() {
        return mReceivableTermCode;
    }

    /**
     * ����mReceivableTermCode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMReceivableTermCode(JAXBElement<String> value) {
        this.mReceivableTermCode = value;
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
     * ��ȡmsobPeriods���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUFIDAU9ISVSMSOBPeriodSRVDTOForIndustryChainData }{@code >}
     *     
     */
    public JAXBElement<ArrayOfUFIDAU9ISVSMSOBPeriodSRVDTOForIndustryChainData> getMSOBPeriods() {
        return msobPeriods;
    }

    /**
     * ����msobPeriods���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUFIDAU9ISVSMSOBPeriodSRVDTOForIndustryChainData }{@code >}
     *     
     */
    public void setMSOBPeriods(JAXBElement<ArrayOfUFIDAU9ISVSMSOBPeriodSRVDTOForIndustryChainData> value) {
        this.msobPeriods = value;
    }

    /**
     * ��ȡmSaleDept���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> getMSaleDept() {
        return mSaleDept;
    }

    /**
     * ����mSaleDept���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public void setMSaleDept(JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> value) {
        this.mSaleDept = value;
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
     * ��ȡmSeller���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> getMSeller() {
        return mSeller;
    }

    /**
     * ����mSeller���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public void setMSeller(JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> value) {
        this.mSeller = value;
    }

    /**
     * ��ȡmSettlementOrg���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> getMSettlementOrg() {
        return mSettlementOrg;
    }

    /**
     * ����mSettlementOrg���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public void setMSettlementOrg(JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> value) {
        this.mSettlementOrg = value;
    }

    /**
     * ��ȡmShipAchievements���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUFIDAU9ISVSMShipAchievementDTOForIndustryChainData }{@code >}
     *     
     */
    public JAXBElement<ArrayOfUFIDAU9ISVSMShipAchievementDTOForIndustryChainData> getMShipAchievements() {
        return mShipAchievements;
    }

    /**
     * ����mShipAchievements���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUFIDAU9ISVSMShipAchievementDTOForIndustryChainData }{@code >}
     *     
     */
    public void setMShipAchievements(JAXBElement<ArrayOfUFIDAU9ISVSMShipAchievementDTOForIndustryChainData> value) {
        this.mShipAchievements = value;
    }

    /**
     * ��ȡmShipAddresss���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUFIDAU9ISVSMShipAddressDTOForIndustryChainData }{@code >}
     *     
     */
    public JAXBElement<ArrayOfUFIDAU9ISVSMShipAddressDTOForIndustryChainData> getMShipAddresss() {
        return mShipAddresss;
    }

    /**
     * ����mShipAddresss���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUFIDAU9ISVSMShipAddressDTOForIndustryChainData }{@code >}
     *     
     */
    public void setMShipAddresss(JAXBElement<ArrayOfUFIDAU9ISVSMShipAddressDTOForIndustryChainData> value) {
        this.mShipAddresss = value;
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
     *     {@link JAXBElement }{@code <}{@link ArrayOfUFIDAU9ISVSMShipContactDTOForIndustryChainData }{@code >}
     *     
     */
    public JAXBElement<ArrayOfUFIDAU9ISVSMShipContactDTOForIndustryChainData> getMShipContacts() {
        return mShipContacts;
    }

    /**
     * ����mShipContacts���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUFIDAU9ISVSMShipContactDTOForIndustryChainData }{@code >}
     *     
     */
    public void setMShipContacts(JAXBElement<ArrayOfUFIDAU9ISVSMShipContactDTOForIndustryChainData> value) {
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
     * ��ȡmShipFees���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUFIDAU9ISVSMShipFeeDTOForIndustryChainData }{@code >}
     *     
     */
    public JAXBElement<ArrayOfUFIDAU9ISVSMShipFeeDTOForIndustryChainData> getMShipFees() {
        return mShipFees;
    }

    /**
     * ����mShipFees���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUFIDAU9ISVSMShipFeeDTOForIndustryChainData }{@code >}
     *     
     */
    public void setMShipFees(JAXBElement<ArrayOfUFIDAU9ISVSMShipFeeDTOForIndustryChainData> value) {
        this.mShipFees = value;
    }

    /**
     * ��ȡmShipLines���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUFIDAU9ISVSMShipLineDTOForIndustryChainData }{@code >}
     *     
     */
    public JAXBElement<ArrayOfUFIDAU9ISVSMShipLineDTOForIndustryChainData> getMShipLines() {
        return mShipLines;
    }

    /**
     * ����mShipLines���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUFIDAU9ISVSMShipLineDTOForIndustryChainData }{@code >}
     *     
     */
    public void setMShipLines(JAXBElement<ArrayOfUFIDAU9ISVSMShipLineDTOForIndustryChainData> value) {
        this.mShipLines = value;
    }

    /**
     * ��ȡmShipMemo���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMShipMemo() {
        return mShipMemo;
    }

    /**
     * ����mShipMemo���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMShipMemo(JAXBElement<String> value) {
        this.mShipMemo = value;
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
     * ��ȡmShipOrg���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> getMShipOrg() {
        return mShipOrg;
    }

    /**
     * ����mShipOrg���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public void setMShipOrg(JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> value) {
        this.mShipOrg = value;
    }

    /**
     * ��ȡmShipTaxs���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUFIDAU9ISVSMShipTaxDTOForIndustryChainData }{@code >}
     *     
     */
    public JAXBElement<ArrayOfUFIDAU9ISVSMShipTaxDTOForIndustryChainData> getMShipTaxs() {
        return mShipTaxs;
    }

    /**
     * ����mShipTaxs���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUFIDAU9ISVSMShipTaxDTOForIndustryChainData }{@code >}
     *     
     */
    public void setMShipTaxs(JAXBElement<ArrayOfUFIDAU9ISVSMShipTaxDTOForIndustryChainData> value) {
        this.mShipTaxs = value;
    }

    /**
     * ��ȡmShipmentRule���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> getMShipmentRule() {
        return mShipmentRule;
    }

    /**
     * ����mShipmentRule���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public void setMShipmentRule(JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> value) {
        this.mShipmentRule = value;
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
     * ��ȡmShippingPort���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> getMShippingPort() {
        return mShippingPort;
    }

    /**
     * ����mShippingPort���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public void setMShippingPort(JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> value) {
        this.mShippingPort = value;
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
     * ��ȡmSupplier���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> getMSupplier() {
        return mSupplier;
    }

    /**
     * ����mSupplier���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public void setMSupplier(JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> value) {
        this.mSupplier = value;
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
     * ��ȡmtc���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> getMTC() {
        return mtc;
    }

    /**
     * ����mtc���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public void setMTC(JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> value) {
        this.mtc = value;
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
     * ��ȡmTaxSchedule���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> getMTaxSchedule() {
        return mTaxSchedule;
    }

    /**
     * ����mTaxSchedule���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public void setMTaxSchedule(JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> value) {
        this.mTaxSchedule = value;
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
     * ��ȡmTransMode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> getMTransMode() {
        return mTransMode;
    }

    /**
     * ����mTransMode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public void setMTransMode(JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> value) {
        this.mTransMode = value;
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

    /**
     * ��ȡmWhSite���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> getMWhSite() {
        return mWhSite;
    }

    /**
     * ����mWhSite���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public void setMWhSite(JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> value) {
        this.mWhSite = value;
    }

}
