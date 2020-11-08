
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
 * &lt;p&gt;UFIDA.U9.CBO.SCM.Supplier.SupplierData complex type的 Java 类。
 * 
 * &lt;p&gt;以下模式片段指定包含在此类中的预期内容。
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="UFIDA.U9.CBO.SCM.Supplier.SupplierData"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://www.UFIDA.org/EntityData}UFSoft.UBF.Business.DataTransObjectBase"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="APConfirmTerm" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="APConfirmTerm_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="AliasName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="AppPortal" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="AppPortal_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Category" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Category_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="CheckCurrency" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="CheckCurrency_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="CombineName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ContactObject" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ContactObject_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Country" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Country_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="DefaultBillTo_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="DefaultClaim_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="DefaultContrast_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="DefaultRFQ_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="DefaultRemit_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="DefaultShipTo_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Department" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Department_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="HoldReason" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="HoldReason_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="KeyFlexFieldStru" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="KeyFlexFieldStru_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Language" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Language_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="MasterOrg" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="MasterOrg_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Multi_AliasName" type="{UFSoft.UBF.Util.Data}MultiLangDataDict" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Multi_CombineName" type="{UFSoft.UBF.Util.Data}MultiLangDataDict" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Multi_Description" type="{UFSoft.UBF.Util.Data}MultiLangDataDict" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Multi_Name" type="{UFSoft.UBF.Util.Data}MultiLangDataDict" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="OfficialLocation" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="OfficialLocation_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Org" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Org_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="PaymentTerm" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="PaymentTerm_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Purchaser" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Purchaser_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ReceiptRule" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ReceiptRule_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="RegisterCapitalCurrency" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="RegisterCapitalCurrency_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="RegisterLocation" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="RegisterLocation_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ReleaseReason" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ReleaseReason_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="StateUser" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="StateUser_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="TaxSchedule" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="TaxSchedule_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Territory" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Territory_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="TradeCurrency" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="TradeCurrency_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="TurnoverCurrency" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="TurnoverCurrency_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_bargain" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_carrier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_commissionRate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_contractTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_contractTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_corpUnifyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_createdBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_createdOn" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_defaultBillTo" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CBO.SCM.Supplier.SupplierSiteData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_defaultClaim" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CBO.SCM.Supplier.SupplierSiteData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_defaultContractType" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_defaultContrast" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CBO.SCM.Supplier.SupplierSiteData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_defaultRFQ" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CBO.SCM.Supplier.SupplierSiteData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_defaultRemit" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CBO.SCM.Supplier.SupplierSiteData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_defaultShipTo" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CBO.SCM.Supplier.SupplierSiteData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_descFlexField" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.Base.FlexField.DescFlexField.DescFlexSegmentsData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_districtTaxNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_docVerificationOrder" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_effective" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.Base.PropertyTypes.EffectiveData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_employeeCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_establishDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_evaluateLevel" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_holdDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_holdUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_iD" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_insuranceRate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_invoiceVerificationDetai" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_invoiceVerificationOrder" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isAPConfirmTermEditable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isAssistance" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isBGLineNO" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isHaveContract" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isHoldRelease" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isMISC" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isPaymentTermModify" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isPrePay" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isPrePayPolicyModify" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isPriceListModify" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isReceiptRuleEditable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isUseAppPortal" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_lastEvaluateDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_modifiedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_modifiedOn" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_ourSideSupplyRecRefStd" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_pledgeCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_pledgeMode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_prePayPolicy" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_prePayPolicyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_prePayPolicyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_priceListCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_priceListID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_priceListName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_qualityPledge" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_registerCapital" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_releaseDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_releaseUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_searchCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_segment1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_segment10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_segment11" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_segment12" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_segment13" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_segment14" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_segment15" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_segment16" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_segment17" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_segment18" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_segment19" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_segment2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_segment20" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_segment21" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_segment22" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_segment23" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_segment24" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_segment25" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_segment26" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_segment27" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_segment28" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_segment29" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_segment3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_segment30" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_segment4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_segment5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_segment6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_segment7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_segment8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_segment9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_shortName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_state" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_stateTaxNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_stateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_supplierBankAccount" type="{http://www.UFIDA.org/EntityData}ArrayOfUFIDA.U9.CBO.SCM.Supplier.SupplierBankAccountData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_supplierContacts" type="{http://www.UFIDA.org/EntityData}ArrayOfUFIDA.U9.CBO.SCM.Supplier.SupplierContactData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_supplierSites" type="{http://www.UFIDA.org/EntityData}ArrayOfUFIDA.U9.CBO.SCM.Supplier.SupplierSiteData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_sysVersion" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_tradeCategory" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_transitLeadTime" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_turnover" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_vMIRule" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_vMIRuleCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_vMIRuleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UFIDA.U9.CBO.SCM.Supplier.SupplierData", propOrder = {
    "apConfirmTerm",
    "apConfirmTermSKey",
    "aliasName",
    "appPortal",
    "appPortalSKey",
    "category",
    "categorySKey",
    "checkCurrency",
    "checkCurrencySKey",
    "combineName",
    "contactObject",
    "contactObjectSKey",
    "country",
    "countrySKey",
    "defaultBillToSKey",
    "defaultClaimSKey",
    "defaultContrastSKey",
    "defaultRFQSKey",
    "defaultRemitSKey",
    "defaultShipToSKey",
    "department",
    "departmentSKey",
    "description",
    "holdReason",
    "holdReasonSKey",
    "keyFlexFieldStru",
    "keyFlexFieldStruSKey",
    "language",
    "languageSKey",
    "masterOrg",
    "masterOrgSKey",
    "multiAliasName",
    "multiCombineName",
    "multiDescription",
    "multiName",
    "name",
    "officialLocation",
    "officialLocationSKey",
    "org",
    "orgSKey",
    "paymentTerm",
    "paymentTermSKey",
    "purchaser",
    "purchaserSKey",
    "receiptRule",
    "receiptRuleSKey",
    "registerCapitalCurrency",
    "registerCapitalCurrencySKey",
    "registerLocation",
    "registerLocationSKey",
    "releaseReason",
    "releaseReasonSKey",
    "stateUser",
    "stateUserSKey",
    "taxSchedule",
    "taxScheduleSKey",
    "territory",
    "territorySKey",
    "tradeCurrency",
    "tradeCurrencySKey",
    "turnoverCurrency",
    "turnoverCurrencySKey",
    "mBargain",
    "mCarrier",
    "mCode",
    "mCommissionRate",
    "mContractTypeCode",
    "mContractTypeName",
    "mCorpUnifyCode",
    "mCreatedBy",
    "mCreatedOn",
    "mDefaultBillTo",
    "mDefaultClaim",
    "mDefaultContractType",
    "mDefaultContrast",
    "mDefaultRFQ",
    "mDefaultRemit",
    "mDefaultShipTo",
    "mDescFlexField",
    "mDistrictTaxNo",
    "mDocVerificationOrder",
    "mEffective",
    "mEmployeeCount",
    "mEstablishDate",
    "mEvaluateLevel",
    "mHoldDate",
    "mHoldUser",
    "mid",
    "mInsuranceRate",
    "mInvoiceVerificationDetai",
    "mInvoiceVerificationOrder",
    "mIsAPConfirmTermEditable",
    "mIsAssistance",
    "mIsBGLineNO",
    "mIsHaveContract",
    "mIsHoldRelease",
    "mIsMISC",
    "mIsPaymentTermModify",
    "mIsPrePay",
    "mIsPrePayPolicyModify",
    "mIsPriceListModify",
    "mIsReceiptRuleEditable",
    "mIsUseAppPortal",
    "mLastEvaluateDate",
    "mModifiedBy",
    "mModifiedOn",
    "mOurSideSupplyRecRefStd",
    "mPledgeCount",
    "mPledgeMode",
    "mPrePayPolicy",
    "mPrePayPolicyCode",
    "mPrePayPolicyName",
    "mPriceListCode",
    "mPriceListID",
    "mPriceListName",
    "mQualityPledge",
    "mRegisterCapital",
    "mReleaseDate",
    "mReleaseUser",
    "mSearchCode",
    "mSegment1",
    "mSegment10",
    "mSegment11",
    "mSegment12",
    "mSegment13",
    "mSegment14",
    "mSegment15",
    "mSegment16",
    "mSegment17",
    "mSegment18",
    "mSegment19",
    "mSegment2",
    "mSegment20",
    "mSegment21",
    "mSegment22",
    "mSegment23",
    "mSegment24",
    "mSegment25",
    "mSegment26",
    "mSegment27",
    "mSegment28",
    "mSegment29",
    "mSegment3",
    "mSegment30",
    "mSegment4",
    "mSegment5",
    "mSegment6",
    "mSegment7",
    "mSegment8",
    "mSegment9",
    "mShortName",
    "mState",
    "mStateTaxNo",
    "mStateTime",
    "mSupplierBankAccount",
    "mSupplierContacts",
    "mSupplierSites",
    "mSysVersion",
    "mTradeCategory",
    "mTransitLeadTime",
    "mTurnover",
    "mvmiRule",
    "mvmiRuleCode",
    "mvmiRuleName"
})
public class UFIDAU9CBOSCMSupplierSupplierData
    extends UFSoftUBFBusinessDataTransObjectBase
{

    @XmlElement(name = "APConfirmTerm")
    protected Long apConfirmTerm;
    @XmlElementRef(name = "APConfirmTerm_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> apConfirmTermSKey;
    @XmlElementRef(name = "AliasName", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> aliasName;
    @XmlElement(name = "AppPortal")
    protected Long appPortal;
    @XmlElementRef(name = "AppPortal_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> appPortalSKey;
    @XmlElement(name = "Category")
    protected Long category;
    @XmlElementRef(name = "Category_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> categorySKey;
    @XmlElement(name = "CheckCurrency")
    protected Long checkCurrency;
    @XmlElementRef(name = "CheckCurrency_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> checkCurrencySKey;
    @XmlElementRef(name = "CombineName", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> combineName;
    @XmlElement(name = "ContactObject")
    protected Long contactObject;
    @XmlElementRef(name = "ContactObject_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> contactObjectSKey;
    @XmlElement(name = "Country")
    protected Long country;
    @XmlElementRef(name = "Country_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> countrySKey;
    @XmlElementRef(name = "DefaultBillTo_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> defaultBillToSKey;
    @XmlElementRef(name = "DefaultClaim_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> defaultClaimSKey;
    @XmlElementRef(name = "DefaultContrast_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> defaultContrastSKey;
    @XmlElementRef(name = "DefaultRFQ_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> defaultRFQSKey;
    @XmlElementRef(name = "DefaultRemit_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> defaultRemitSKey;
    @XmlElementRef(name = "DefaultShipTo_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> defaultShipToSKey;
    @XmlElement(name = "Department")
    protected Long department;
    @XmlElementRef(name = "Department_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> departmentSKey;
    @XmlElementRef(name = "Description", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> description;
    @XmlElement(name = "HoldReason")
    protected Long holdReason;
    @XmlElementRef(name = "HoldReason_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> holdReasonSKey;
    @XmlElement(name = "KeyFlexFieldStru")
    protected Long keyFlexFieldStru;
    @XmlElementRef(name = "KeyFlexFieldStru_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> keyFlexFieldStruSKey;
    @XmlElement(name = "Language")
    protected Long language;
    @XmlElementRef(name = "Language_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> languageSKey;
    @XmlElement(name = "MasterOrg")
    protected Long masterOrg;
    @XmlElementRef(name = "MasterOrg_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> masterOrgSKey;
    @XmlElementRef(name = "Multi_AliasName", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<MultiLangDataDict> multiAliasName;
    @XmlElementRef(name = "Multi_CombineName", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<MultiLangDataDict> multiCombineName;
    @XmlElementRef(name = "Multi_Description", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<MultiLangDataDict> multiDescription;
    @XmlElementRef(name = "Multi_Name", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<MultiLangDataDict> multiName;
    @XmlElementRef(name = "Name", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> name;
    @XmlElement(name = "OfficialLocation")
    protected Long officialLocation;
    @XmlElementRef(name = "OfficialLocation_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> officialLocationSKey;
    @XmlElement(name = "Org")
    protected Long org;
    @XmlElementRef(name = "Org_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> orgSKey;
    @XmlElement(name = "PaymentTerm")
    protected Long paymentTerm;
    @XmlElementRef(name = "PaymentTerm_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> paymentTermSKey;
    @XmlElement(name = "Purchaser")
    protected Long purchaser;
    @XmlElementRef(name = "Purchaser_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> purchaserSKey;
    @XmlElement(name = "ReceiptRule")
    protected Long receiptRule;
    @XmlElementRef(name = "ReceiptRule_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> receiptRuleSKey;
    @XmlElement(name = "RegisterCapitalCurrency")
    protected Long registerCapitalCurrency;
    @XmlElementRef(name = "RegisterCapitalCurrency_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> registerCapitalCurrencySKey;
    @XmlElement(name = "RegisterLocation")
    protected Long registerLocation;
    @XmlElementRef(name = "RegisterLocation_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> registerLocationSKey;
    @XmlElement(name = "ReleaseReason")
    protected Long releaseReason;
    @XmlElementRef(name = "ReleaseReason_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> releaseReasonSKey;
    @XmlElement(name = "StateUser")
    protected Long stateUser;
    @XmlElementRef(name = "StateUser_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> stateUserSKey;
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
    @XmlElement(name = "TurnoverCurrency")
    protected Long turnoverCurrency;
    @XmlElementRef(name = "TurnoverCurrency_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> turnoverCurrencySKey;
    @XmlElement(name = "m_bargain")
    protected Integer mBargain;
    @XmlElementRef(name = "m_carrier", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mCarrier;
    @XmlElementRef(name = "m_code", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mCode;
    @XmlElement(name = "m_commissionRate")
    protected BigDecimal mCommissionRate;
    @XmlElementRef(name = "m_contractTypeCode", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mContractTypeCode;
    @XmlElementRef(name = "m_contractTypeName", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mContractTypeName;
    @XmlElementRef(name = "m_corpUnifyCode", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mCorpUnifyCode;
    @XmlElementRef(name = "m_createdBy", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mCreatedBy;
    @XmlElement(name = "m_createdOn")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mCreatedOn;
    @XmlElementRef(name = "m_defaultBillTo", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9CBOSCMSupplierSupplierSiteData> mDefaultBillTo;
    @XmlElementRef(name = "m_defaultClaim", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9CBOSCMSupplierSupplierSiteData> mDefaultClaim;
    @XmlElement(name = "m_defaultContractType")
    protected Long mDefaultContractType;
    @XmlElementRef(name = "m_defaultContrast", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9CBOSCMSupplierSupplierSiteData> mDefaultContrast;
    @XmlElementRef(name = "m_defaultRFQ", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9CBOSCMSupplierSupplierSiteData> mDefaultRFQ;
    @XmlElementRef(name = "m_defaultRemit", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9CBOSCMSupplierSupplierSiteData> mDefaultRemit;
    @XmlElementRef(name = "m_defaultShipTo", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9CBOSCMSupplierSupplierSiteData> mDefaultShipTo;
    @XmlElementRef(name = "m_descFlexField", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9BaseFlexFieldDescFlexFieldDescFlexSegmentsData> mDescFlexField;
    @XmlElementRef(name = "m_districtTaxNo", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mDistrictTaxNo;
    @XmlElement(name = "m_docVerificationOrder")
    protected Integer mDocVerificationOrder;
    @XmlElementRef(name = "m_effective", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9BasePropertyTypesEffectiveData> mEffective;
    @XmlElement(name = "m_employeeCount")
    protected Integer mEmployeeCount;
    @XmlElement(name = "m_establishDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mEstablishDate;
    @XmlElement(name = "m_evaluateLevel")
    protected Integer mEvaluateLevel;
    @XmlElement(name = "m_holdDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mHoldDate;
    @XmlElementRef(name = "m_holdUser", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mHoldUser;
    @XmlElement(name = "m_iD")
    protected Long mid;
    @XmlElement(name = "m_insuranceRate")
    protected BigDecimal mInsuranceRate;
    @XmlElement(name = "m_invoiceVerificationDetai")
    protected Integer mInvoiceVerificationDetai;
    @XmlElement(name = "m_invoiceVerificationOrder")
    protected Integer mInvoiceVerificationOrder;
    @XmlElement(name = "m_isAPConfirmTermEditable")
    protected Boolean mIsAPConfirmTermEditable;
    @XmlElement(name = "m_isAssistance")
    protected Boolean mIsAssistance;
    @XmlElement(name = "m_isBGLineNO")
    protected Boolean mIsBGLineNO;
    @XmlElement(name = "m_isHaveContract")
    protected Boolean mIsHaveContract;
    @XmlElement(name = "m_isHoldRelease")
    protected Boolean mIsHoldRelease;
    @XmlElement(name = "m_isMISC")
    protected Boolean mIsMISC;
    @XmlElement(name = "m_isPaymentTermModify")
    protected Boolean mIsPaymentTermModify;
    @XmlElement(name = "m_isPrePay")
    protected Boolean mIsPrePay;
    @XmlElement(name = "m_isPrePayPolicyModify")
    protected Boolean mIsPrePayPolicyModify;
    @XmlElement(name = "m_isPriceListModify")
    protected Boolean mIsPriceListModify;
    @XmlElement(name = "m_isReceiptRuleEditable")
    protected Boolean mIsReceiptRuleEditable;
    @XmlElement(name = "m_isUseAppPortal")
    protected Boolean mIsUseAppPortal;
    @XmlElement(name = "m_lastEvaluateDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mLastEvaluateDate;
    @XmlElementRef(name = "m_modifiedBy", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mModifiedBy;
    @XmlElement(name = "m_modifiedOn")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mModifiedOn;
    @XmlElement(name = "m_ourSideSupplyRecRefStd")
    protected Integer mOurSideSupplyRecRefStd;
    @XmlElement(name = "m_pledgeCount")
    protected Integer mPledgeCount;
    @XmlElement(name = "m_pledgeMode")
    protected Integer mPledgeMode;
    @XmlElement(name = "m_prePayPolicy")
    protected Long mPrePayPolicy;
    @XmlElementRef(name = "m_prePayPolicyCode", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mPrePayPolicyCode;
    @XmlElementRef(name = "m_prePayPolicyName", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mPrePayPolicyName;
    @XmlElementRef(name = "m_priceListCode", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mPriceListCode;
    @XmlElement(name = "m_priceListID")
    protected Long mPriceListID;
    @XmlElementRef(name = "m_priceListName", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mPriceListName;
    @XmlElement(name = "m_qualityPledge")
    protected Integer mQualityPledge;
    @XmlElement(name = "m_registerCapital")
    protected BigDecimal mRegisterCapital;
    @XmlElement(name = "m_releaseDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mReleaseDate;
    @XmlElementRef(name = "m_releaseUser", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mReleaseUser;
    @XmlElementRef(name = "m_searchCode", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mSearchCode;
    @XmlElementRef(name = "m_segment1", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mSegment1;
    @XmlElementRef(name = "m_segment10", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mSegment10;
    @XmlElementRef(name = "m_segment11", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mSegment11;
    @XmlElementRef(name = "m_segment12", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mSegment12;
    @XmlElementRef(name = "m_segment13", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mSegment13;
    @XmlElementRef(name = "m_segment14", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mSegment14;
    @XmlElementRef(name = "m_segment15", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mSegment15;
    @XmlElementRef(name = "m_segment16", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mSegment16;
    @XmlElementRef(name = "m_segment17", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mSegment17;
    @XmlElementRef(name = "m_segment18", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mSegment18;
    @XmlElementRef(name = "m_segment19", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mSegment19;
    @XmlElementRef(name = "m_segment2", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mSegment2;
    @XmlElementRef(name = "m_segment20", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mSegment20;
    @XmlElementRef(name = "m_segment21", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mSegment21;
    @XmlElementRef(name = "m_segment22", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mSegment22;
    @XmlElementRef(name = "m_segment23", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mSegment23;
    @XmlElementRef(name = "m_segment24", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mSegment24;
    @XmlElementRef(name = "m_segment25", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mSegment25;
    @XmlElementRef(name = "m_segment26", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mSegment26;
    @XmlElementRef(name = "m_segment27", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mSegment27;
    @XmlElementRef(name = "m_segment28", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mSegment28;
    @XmlElementRef(name = "m_segment29", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mSegment29;
    @XmlElementRef(name = "m_segment3", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mSegment3;
    @XmlElementRef(name = "m_segment30", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mSegment30;
    @XmlElementRef(name = "m_segment4", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mSegment4;
    @XmlElementRef(name = "m_segment5", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mSegment5;
    @XmlElementRef(name = "m_segment6", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mSegment6;
    @XmlElementRef(name = "m_segment7", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mSegment7;
    @XmlElementRef(name = "m_segment8", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mSegment8;
    @XmlElementRef(name = "m_segment9", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mSegment9;
    @XmlElementRef(name = "m_shortName", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mShortName;
    @XmlElement(name = "m_state")
    protected Integer mState;
    @XmlElementRef(name = "m_stateTaxNo", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mStateTaxNo;
    @XmlElement(name = "m_stateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mStateTime;
    @XmlElementRef(name = "m_supplierBankAccount", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfUFIDAU9CBOSCMSupplierSupplierBankAccountData> mSupplierBankAccount;
    @XmlElementRef(name = "m_supplierContacts", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfUFIDAU9CBOSCMSupplierSupplierContactData> mSupplierContacts;
    @XmlElementRef(name = "m_supplierSites", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfUFIDAU9CBOSCMSupplierSupplierSiteData> mSupplierSites;
    @XmlElement(name = "m_sysVersion")
    protected Long mSysVersion;
    @XmlElement(name = "m_tradeCategory")
    protected Integer mTradeCategory;
    @XmlElement(name = "m_transitLeadTime")
    protected Integer mTransitLeadTime;
    @XmlElement(name = "m_turnover")
    protected BigDecimal mTurnover;
    @XmlElement(name = "m_vMIRule")
    protected Long mvmiRule;
    @XmlElementRef(name = "m_vMIRuleCode", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mvmiRuleCode;
    @XmlElementRef(name = "m_vMIRuleName", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mvmiRuleName;

    /**
     * 获取apConfirmTerm属性的值。
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
     * 设置apConfirmTerm属性的值。
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
     * 获取apConfirmTermSKey属性的值。
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
     * 设置apConfirmTermSKey属性的值。
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
     * 获取aliasName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAliasName() {
        return aliasName;
    }

    /**
     * 设置aliasName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAliasName(JAXBElement<String> value) {
        this.aliasName = value;
    }

    /**
     * 获取appPortal属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAppPortal() {
        return appPortal;
    }

    /**
     * 设置appPortal属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAppPortal(Long value) {
        this.appPortal = value;
    }

    /**
     * 获取appPortalSKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getAppPortalSKey() {
        return appPortalSKey;
    }

    /**
     * 设置appPortalSKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setAppPortalSKey(JAXBElement<EntityKey> value) {
        this.appPortalSKey = value;
    }

    /**
     * 获取category属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCategory() {
        return category;
    }

    /**
     * 设置category属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCategory(Long value) {
        this.category = value;
    }

    /**
     * 获取categorySKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getCategorySKey() {
        return categorySKey;
    }

    /**
     * 设置categorySKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setCategorySKey(JAXBElement<EntityKey> value) {
        this.categorySKey = value;
    }

    /**
     * 获取checkCurrency属性的值。
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
     * 设置checkCurrency属性的值。
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
     * 获取checkCurrencySKey属性的值。
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
     * 设置checkCurrencySKey属性的值。
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
     * 获取combineName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCombineName() {
        return combineName;
    }

    /**
     * 设置combineName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCombineName(JAXBElement<String> value) {
        this.combineName = value;
    }

    /**
     * 获取contactObject属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getContactObject() {
        return contactObject;
    }

    /**
     * 设置contactObject属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setContactObject(Long value) {
        this.contactObject = value;
    }

    /**
     * 获取contactObjectSKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getContactObjectSKey() {
        return contactObjectSKey;
    }

    /**
     * 设置contactObjectSKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setContactObjectSKey(JAXBElement<EntityKey> value) {
        this.contactObjectSKey = value;
    }

    /**
     * 获取country属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCountry() {
        return country;
    }

    /**
     * 设置country属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCountry(Long value) {
        this.country = value;
    }

    /**
     * 获取countrySKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getCountrySKey() {
        return countrySKey;
    }

    /**
     * 设置countrySKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setCountrySKey(JAXBElement<EntityKey> value) {
        this.countrySKey = value;
    }

    /**
     * 获取defaultBillToSKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getDefaultBillToSKey() {
        return defaultBillToSKey;
    }

    /**
     * 设置defaultBillToSKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setDefaultBillToSKey(JAXBElement<EntityKey> value) {
        this.defaultBillToSKey = value;
    }

    /**
     * 获取defaultClaimSKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getDefaultClaimSKey() {
        return defaultClaimSKey;
    }

    /**
     * 设置defaultClaimSKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setDefaultClaimSKey(JAXBElement<EntityKey> value) {
        this.defaultClaimSKey = value;
    }

    /**
     * 获取defaultContrastSKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getDefaultContrastSKey() {
        return defaultContrastSKey;
    }

    /**
     * 设置defaultContrastSKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setDefaultContrastSKey(JAXBElement<EntityKey> value) {
        this.defaultContrastSKey = value;
    }

    /**
     * 获取defaultRFQSKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getDefaultRFQSKey() {
        return defaultRFQSKey;
    }

    /**
     * 设置defaultRFQSKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setDefaultRFQSKey(JAXBElement<EntityKey> value) {
        this.defaultRFQSKey = value;
    }

    /**
     * 获取defaultRemitSKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getDefaultRemitSKey() {
        return defaultRemitSKey;
    }

    /**
     * 设置defaultRemitSKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setDefaultRemitSKey(JAXBElement<EntityKey> value) {
        this.defaultRemitSKey = value;
    }

    /**
     * 获取defaultShipToSKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getDefaultShipToSKey() {
        return defaultShipToSKey;
    }

    /**
     * 设置defaultShipToSKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setDefaultShipToSKey(JAXBElement<EntityKey> value) {
        this.defaultShipToSKey = value;
    }

    /**
     * 获取department属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDepartment() {
        return department;
    }

    /**
     * 设置department属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDepartment(Long value) {
        this.department = value;
    }

    /**
     * 获取departmentSKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getDepartmentSKey() {
        return departmentSKey;
    }

    /**
     * 设置departmentSKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setDepartmentSKey(JAXBElement<EntityKey> value) {
        this.departmentSKey = value;
    }

    /**
     * 获取description属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDescription() {
        return description;
    }

    /**
     * 设置description属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDescription(JAXBElement<String> value) {
        this.description = value;
    }

    /**
     * 获取holdReason属性的值。
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
     * 设置holdReason属性的值。
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
     * 获取holdReasonSKey属性的值。
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
     * 设置holdReasonSKey属性的值。
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
     * 获取keyFlexFieldStru属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getKeyFlexFieldStru() {
        return keyFlexFieldStru;
    }

    /**
     * 设置keyFlexFieldStru属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setKeyFlexFieldStru(Long value) {
        this.keyFlexFieldStru = value;
    }

    /**
     * 获取keyFlexFieldStruSKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getKeyFlexFieldStruSKey() {
        return keyFlexFieldStruSKey;
    }

    /**
     * 设置keyFlexFieldStruSKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setKeyFlexFieldStruSKey(JAXBElement<EntityKey> value) {
        this.keyFlexFieldStruSKey = value;
    }

    /**
     * 获取language属性的值。
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
     * 设置language属性的值。
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
     * 获取languageSKey属性的值。
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
     * 设置languageSKey属性的值。
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
     * 获取multiAliasName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MultiLangDataDict }{@code >}
     *     
     */
    public JAXBElement<MultiLangDataDict> getMultiAliasName() {
        return multiAliasName;
    }

    /**
     * 设置multiAliasName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MultiLangDataDict }{@code >}
     *     
     */
    public void setMultiAliasName(JAXBElement<MultiLangDataDict> value) {
        this.multiAliasName = value;
    }

    /**
     * 获取multiCombineName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MultiLangDataDict }{@code >}
     *     
     */
    public JAXBElement<MultiLangDataDict> getMultiCombineName() {
        return multiCombineName;
    }

    /**
     * 设置multiCombineName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MultiLangDataDict }{@code >}
     *     
     */
    public void setMultiCombineName(JAXBElement<MultiLangDataDict> value) {
        this.multiCombineName = value;
    }

    /**
     * 获取multiDescription属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MultiLangDataDict }{@code >}
     *     
     */
    public JAXBElement<MultiLangDataDict> getMultiDescription() {
        return multiDescription;
    }

    /**
     * 设置multiDescription属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MultiLangDataDict }{@code >}
     *     
     */
    public void setMultiDescription(JAXBElement<MultiLangDataDict> value) {
        this.multiDescription = value;
    }

    /**
     * 获取multiName属性的值。
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
     * 设置multiName属性的值。
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
     * 获取name属性的值。
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
     * 设置name属性的值。
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
     * 获取officialLocation属性的值。
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
     * 设置officialLocation属性的值。
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
     * 获取officialLocationSKey属性的值。
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
     * 设置officialLocationSKey属性的值。
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
     * 获取purchaser属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPurchaser() {
        return purchaser;
    }

    /**
     * 设置purchaser属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPurchaser(Long value) {
        this.purchaser = value;
    }

    /**
     * 获取purchaserSKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getPurchaserSKey() {
        return purchaserSKey;
    }

    /**
     * 设置purchaserSKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setPurchaserSKey(JAXBElement<EntityKey> value) {
        this.purchaserSKey = value;
    }

    /**
     * 获取receiptRule属性的值。
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
     * 设置receiptRule属性的值。
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
     * 获取receiptRuleSKey属性的值。
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
     * 设置receiptRuleSKey属性的值。
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
     * 获取registerCapitalCurrency属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRegisterCapitalCurrency() {
        return registerCapitalCurrency;
    }

    /**
     * 设置registerCapitalCurrency属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRegisterCapitalCurrency(Long value) {
        this.registerCapitalCurrency = value;
    }

    /**
     * 获取registerCapitalCurrencySKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getRegisterCapitalCurrencySKey() {
        return registerCapitalCurrencySKey;
    }

    /**
     * 设置registerCapitalCurrencySKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setRegisterCapitalCurrencySKey(JAXBElement<EntityKey> value) {
        this.registerCapitalCurrencySKey = value;
    }

    /**
     * 获取registerLocation属性的值。
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
     * 设置registerLocation属性的值。
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
     * 获取registerLocationSKey属性的值。
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
     * 设置registerLocationSKey属性的值。
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
     * 获取releaseReason属性的值。
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
     * 设置releaseReason属性的值。
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
     * 获取releaseReasonSKey属性的值。
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
     * 设置releaseReasonSKey属性的值。
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
     * 获取stateUser属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getStateUser() {
        return stateUser;
    }

    /**
     * 设置stateUser属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setStateUser(Long value) {
        this.stateUser = value;
    }

    /**
     * 获取stateUserSKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getStateUserSKey() {
        return stateUserSKey;
    }

    /**
     * 设置stateUserSKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setStateUserSKey(JAXBElement<EntityKey> value) {
        this.stateUserSKey = value;
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
     * 获取territory属性的值。
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
     * 设置territory属性的值。
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
     * 获取territorySKey属性的值。
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
     * 设置territorySKey属性的值。
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
     * 获取tradeCurrency属性的值。
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
     * 设置tradeCurrency属性的值。
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
     * 获取tradeCurrencySKey属性的值。
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
     * 设置tradeCurrencySKey属性的值。
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
     * 获取turnoverCurrency属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTurnoverCurrency() {
        return turnoverCurrency;
    }

    /**
     * 设置turnoverCurrency属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTurnoverCurrency(Long value) {
        this.turnoverCurrency = value;
    }

    /**
     * 获取turnoverCurrencySKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getTurnoverCurrencySKey() {
        return turnoverCurrencySKey;
    }

    /**
     * 设置turnoverCurrencySKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setTurnoverCurrencySKey(JAXBElement<EntityKey> value) {
        this.turnoverCurrencySKey = value;
    }

    /**
     * 获取mBargain属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMBargain() {
        return mBargain;
    }

    /**
     * 设置mBargain属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMBargain(Integer value) {
        this.mBargain = value;
    }

    /**
     * 获取mCarrier属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMCarrier() {
        return mCarrier;
    }

    /**
     * 设置mCarrier属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMCarrier(JAXBElement<String> value) {
        this.mCarrier = value;
    }

    /**
     * 获取mCode属性的值。
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
     * 设置mCode属性的值。
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
     * 获取mCommissionRate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMCommissionRate() {
        return mCommissionRate;
    }

    /**
     * 设置mCommissionRate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMCommissionRate(BigDecimal value) {
        this.mCommissionRate = value;
    }

    /**
     * 获取mContractTypeCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMContractTypeCode() {
        return mContractTypeCode;
    }

    /**
     * 设置mContractTypeCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMContractTypeCode(JAXBElement<String> value) {
        this.mContractTypeCode = value;
    }

    /**
     * 获取mContractTypeName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMContractTypeName() {
        return mContractTypeName;
    }

    /**
     * 设置mContractTypeName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMContractTypeName(JAXBElement<String> value) {
        this.mContractTypeName = value;
    }

    /**
     * 获取mCorpUnifyCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMCorpUnifyCode() {
        return mCorpUnifyCode;
    }

    /**
     * 设置mCorpUnifyCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMCorpUnifyCode(JAXBElement<String> value) {
        this.mCorpUnifyCode = value;
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
     * 获取mDefaultBillTo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOSCMSupplierSupplierSiteData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9CBOSCMSupplierSupplierSiteData> getMDefaultBillTo() {
        return mDefaultBillTo;
    }

    /**
     * 设置mDefaultBillTo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOSCMSupplierSupplierSiteData }{@code >}
     *     
     */
    public void setMDefaultBillTo(JAXBElement<UFIDAU9CBOSCMSupplierSupplierSiteData> value) {
        this.mDefaultBillTo = value;
    }

    /**
     * 获取mDefaultClaim属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOSCMSupplierSupplierSiteData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9CBOSCMSupplierSupplierSiteData> getMDefaultClaim() {
        return mDefaultClaim;
    }

    /**
     * 设置mDefaultClaim属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOSCMSupplierSupplierSiteData }{@code >}
     *     
     */
    public void setMDefaultClaim(JAXBElement<UFIDAU9CBOSCMSupplierSupplierSiteData> value) {
        this.mDefaultClaim = value;
    }

    /**
     * 获取mDefaultContractType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMDefaultContractType() {
        return mDefaultContractType;
    }

    /**
     * 设置mDefaultContractType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMDefaultContractType(Long value) {
        this.mDefaultContractType = value;
    }

    /**
     * 获取mDefaultContrast属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOSCMSupplierSupplierSiteData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9CBOSCMSupplierSupplierSiteData> getMDefaultContrast() {
        return mDefaultContrast;
    }

    /**
     * 设置mDefaultContrast属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOSCMSupplierSupplierSiteData }{@code >}
     *     
     */
    public void setMDefaultContrast(JAXBElement<UFIDAU9CBOSCMSupplierSupplierSiteData> value) {
        this.mDefaultContrast = value;
    }

    /**
     * 获取mDefaultRFQ属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOSCMSupplierSupplierSiteData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9CBOSCMSupplierSupplierSiteData> getMDefaultRFQ() {
        return mDefaultRFQ;
    }

    /**
     * 设置mDefaultRFQ属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOSCMSupplierSupplierSiteData }{@code >}
     *     
     */
    public void setMDefaultRFQ(JAXBElement<UFIDAU9CBOSCMSupplierSupplierSiteData> value) {
        this.mDefaultRFQ = value;
    }

    /**
     * 获取mDefaultRemit属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOSCMSupplierSupplierSiteData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9CBOSCMSupplierSupplierSiteData> getMDefaultRemit() {
        return mDefaultRemit;
    }

    /**
     * 设置mDefaultRemit属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOSCMSupplierSupplierSiteData }{@code >}
     *     
     */
    public void setMDefaultRemit(JAXBElement<UFIDAU9CBOSCMSupplierSupplierSiteData> value) {
        this.mDefaultRemit = value;
    }

    /**
     * 获取mDefaultShipTo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOSCMSupplierSupplierSiteData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9CBOSCMSupplierSupplierSiteData> getMDefaultShipTo() {
        return mDefaultShipTo;
    }

    /**
     * 设置mDefaultShipTo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOSCMSupplierSupplierSiteData }{@code >}
     *     
     */
    public void setMDefaultShipTo(JAXBElement<UFIDAU9CBOSCMSupplierSupplierSiteData> value) {
        this.mDefaultShipTo = value;
    }

    /**
     * 获取mDescFlexField属性的值。
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
     * 设置mDescFlexField属性的值。
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
     * 获取mDistrictTaxNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMDistrictTaxNo() {
        return mDistrictTaxNo;
    }

    /**
     * 设置mDistrictTaxNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMDistrictTaxNo(JAXBElement<String> value) {
        this.mDistrictTaxNo = value;
    }

    /**
     * 获取mDocVerificationOrder属性的值。
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
     * 设置mDocVerificationOrder属性的值。
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
     * 获取mEffective属性的值。
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
     * 设置mEffective属性的值。
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
     * 获取mEmployeeCount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMEmployeeCount() {
        return mEmployeeCount;
    }

    /**
     * 设置mEmployeeCount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMEmployeeCount(Integer value) {
        this.mEmployeeCount = value;
    }

    /**
     * 获取mEstablishDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMEstablishDate() {
        return mEstablishDate;
    }

    /**
     * 设置mEstablishDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMEstablishDate(XMLGregorianCalendar value) {
        this.mEstablishDate = value;
    }

    /**
     * 获取mEvaluateLevel属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMEvaluateLevel() {
        return mEvaluateLevel;
    }

    /**
     * 设置mEvaluateLevel属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMEvaluateLevel(Integer value) {
        this.mEvaluateLevel = value;
    }

    /**
     * 获取mHoldDate属性的值。
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
     * 设置mHoldDate属性的值。
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
     * 获取mHoldUser属性的值。
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
     * 设置mHoldUser属性的值。
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
     * 获取mInsuranceRate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMInsuranceRate() {
        return mInsuranceRate;
    }

    /**
     * 设置mInsuranceRate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMInsuranceRate(BigDecimal value) {
        this.mInsuranceRate = value;
    }

    /**
     * 获取mInvoiceVerificationDetai属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMInvoiceVerificationDetai() {
        return mInvoiceVerificationDetai;
    }

    /**
     * 设置mInvoiceVerificationDetai属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMInvoiceVerificationDetai(Integer value) {
        this.mInvoiceVerificationDetai = value;
    }

    /**
     * 获取mInvoiceVerificationOrder属性的值。
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
     * 设置mInvoiceVerificationOrder属性的值。
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
     * 获取mIsAPConfirmTermEditable属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsAPConfirmTermEditable() {
        return mIsAPConfirmTermEditable;
    }

    /**
     * 设置mIsAPConfirmTermEditable属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsAPConfirmTermEditable(Boolean value) {
        this.mIsAPConfirmTermEditable = value;
    }

    /**
     * 获取mIsAssistance属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsAssistance() {
        return mIsAssistance;
    }

    /**
     * 设置mIsAssistance属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsAssistance(Boolean value) {
        this.mIsAssistance = value;
    }

    /**
     * 获取mIsBGLineNO属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsBGLineNO() {
        return mIsBGLineNO;
    }

    /**
     * 设置mIsBGLineNO属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsBGLineNO(Boolean value) {
        this.mIsBGLineNO = value;
    }

    /**
     * 获取mIsHaveContract属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsHaveContract() {
        return mIsHaveContract;
    }

    /**
     * 设置mIsHaveContract属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsHaveContract(Boolean value) {
        this.mIsHaveContract = value;
    }

    /**
     * 获取mIsHoldRelease属性的值。
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
     * 设置mIsHoldRelease属性的值。
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
     * 获取mIsMISC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsMISC() {
        return mIsMISC;
    }

    /**
     * 设置mIsMISC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsMISC(Boolean value) {
        this.mIsMISC = value;
    }

    /**
     * 获取mIsPaymentTermModify属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsPaymentTermModify() {
        return mIsPaymentTermModify;
    }

    /**
     * 设置mIsPaymentTermModify属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsPaymentTermModify(Boolean value) {
        this.mIsPaymentTermModify = value;
    }

    /**
     * 获取mIsPrePay属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsPrePay() {
        return mIsPrePay;
    }

    /**
     * 设置mIsPrePay属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsPrePay(Boolean value) {
        this.mIsPrePay = value;
    }

    /**
     * 获取mIsPrePayPolicyModify属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsPrePayPolicyModify() {
        return mIsPrePayPolicyModify;
    }

    /**
     * 设置mIsPrePayPolicyModify属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsPrePayPolicyModify(Boolean value) {
        this.mIsPrePayPolicyModify = value;
    }

    /**
     * 获取mIsPriceListModify属性的值。
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
     * 设置mIsPriceListModify属性的值。
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
     * 获取mIsReceiptRuleEditable属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsReceiptRuleEditable() {
        return mIsReceiptRuleEditable;
    }

    /**
     * 设置mIsReceiptRuleEditable属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsReceiptRuleEditable(Boolean value) {
        this.mIsReceiptRuleEditable = value;
    }

    /**
     * 获取mIsUseAppPortal属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsUseAppPortal() {
        return mIsUseAppPortal;
    }

    /**
     * 设置mIsUseAppPortal属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsUseAppPortal(Boolean value) {
        this.mIsUseAppPortal = value;
    }

    /**
     * 获取mLastEvaluateDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMLastEvaluateDate() {
        return mLastEvaluateDate;
    }

    /**
     * 设置mLastEvaluateDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMLastEvaluateDate(XMLGregorianCalendar value) {
        this.mLastEvaluateDate = value;
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
     * 获取mOurSideSupplyRecRefStd属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMOurSideSupplyRecRefStd() {
        return mOurSideSupplyRecRefStd;
    }

    /**
     * 设置mOurSideSupplyRecRefStd属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMOurSideSupplyRecRefStd(Integer value) {
        this.mOurSideSupplyRecRefStd = value;
    }

    /**
     * 获取mPledgeCount属性的值。
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
     * 设置mPledgeCount属性的值。
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
     * 获取mPledgeMode属性的值。
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
     * 设置mPledgeMode属性的值。
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
     * 获取mPrePayPolicy属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMPrePayPolicy() {
        return mPrePayPolicy;
    }

    /**
     * 设置mPrePayPolicy属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMPrePayPolicy(Long value) {
        this.mPrePayPolicy = value;
    }

    /**
     * 获取mPrePayPolicyCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMPrePayPolicyCode() {
        return mPrePayPolicyCode;
    }

    /**
     * 设置mPrePayPolicyCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMPrePayPolicyCode(JAXBElement<String> value) {
        this.mPrePayPolicyCode = value;
    }

    /**
     * 获取mPrePayPolicyName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMPrePayPolicyName() {
        return mPrePayPolicyName;
    }

    /**
     * 设置mPrePayPolicyName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMPrePayPolicyName(JAXBElement<String> value) {
        this.mPrePayPolicyName = value;
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
     * 获取mPriceListID属性的值。
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
     * 设置mPriceListID属性的值。
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
     * 获取mQualityPledge属性的值。
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
     * 设置mQualityPledge属性的值。
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
     * 获取mRegisterCapital属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMRegisterCapital() {
        return mRegisterCapital;
    }

    /**
     * 设置mRegisterCapital属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMRegisterCapital(BigDecimal value) {
        this.mRegisterCapital = value;
    }

    /**
     * 获取mReleaseDate属性的值。
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
     * 设置mReleaseDate属性的值。
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
     * 获取mReleaseUser属性的值。
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
     * 设置mReleaseUser属性的值。
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
     * 获取mSearchCode属性的值。
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
     * 设置mSearchCode属性的值。
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
     * 获取mSegment1属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMSegment1() {
        return mSegment1;
    }

    /**
     * 设置mSegment1属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMSegment1(JAXBElement<String> value) {
        this.mSegment1 = value;
    }

    /**
     * 获取mSegment10属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMSegment10() {
        return mSegment10;
    }

    /**
     * 设置mSegment10属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMSegment10(JAXBElement<String> value) {
        this.mSegment10 = value;
    }

    /**
     * 获取mSegment11属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMSegment11() {
        return mSegment11;
    }

    /**
     * 设置mSegment11属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMSegment11(JAXBElement<String> value) {
        this.mSegment11 = value;
    }

    /**
     * 获取mSegment12属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMSegment12() {
        return mSegment12;
    }

    /**
     * 设置mSegment12属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMSegment12(JAXBElement<String> value) {
        this.mSegment12 = value;
    }

    /**
     * 获取mSegment13属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMSegment13() {
        return mSegment13;
    }

    /**
     * 设置mSegment13属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMSegment13(JAXBElement<String> value) {
        this.mSegment13 = value;
    }

    /**
     * 获取mSegment14属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMSegment14() {
        return mSegment14;
    }

    /**
     * 设置mSegment14属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMSegment14(JAXBElement<String> value) {
        this.mSegment14 = value;
    }

    /**
     * 获取mSegment15属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMSegment15() {
        return mSegment15;
    }

    /**
     * 设置mSegment15属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMSegment15(JAXBElement<String> value) {
        this.mSegment15 = value;
    }

    /**
     * 获取mSegment16属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMSegment16() {
        return mSegment16;
    }

    /**
     * 设置mSegment16属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMSegment16(JAXBElement<String> value) {
        this.mSegment16 = value;
    }

    /**
     * 获取mSegment17属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMSegment17() {
        return mSegment17;
    }

    /**
     * 设置mSegment17属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMSegment17(JAXBElement<String> value) {
        this.mSegment17 = value;
    }

    /**
     * 获取mSegment18属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMSegment18() {
        return mSegment18;
    }

    /**
     * 设置mSegment18属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMSegment18(JAXBElement<String> value) {
        this.mSegment18 = value;
    }

    /**
     * 获取mSegment19属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMSegment19() {
        return mSegment19;
    }

    /**
     * 设置mSegment19属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMSegment19(JAXBElement<String> value) {
        this.mSegment19 = value;
    }

    /**
     * 获取mSegment2属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMSegment2() {
        return mSegment2;
    }

    /**
     * 设置mSegment2属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMSegment2(JAXBElement<String> value) {
        this.mSegment2 = value;
    }

    /**
     * 获取mSegment20属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMSegment20() {
        return mSegment20;
    }

    /**
     * 设置mSegment20属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMSegment20(JAXBElement<String> value) {
        this.mSegment20 = value;
    }

    /**
     * 获取mSegment21属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMSegment21() {
        return mSegment21;
    }

    /**
     * 设置mSegment21属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMSegment21(JAXBElement<String> value) {
        this.mSegment21 = value;
    }

    /**
     * 获取mSegment22属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMSegment22() {
        return mSegment22;
    }

    /**
     * 设置mSegment22属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMSegment22(JAXBElement<String> value) {
        this.mSegment22 = value;
    }

    /**
     * 获取mSegment23属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMSegment23() {
        return mSegment23;
    }

    /**
     * 设置mSegment23属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMSegment23(JAXBElement<String> value) {
        this.mSegment23 = value;
    }

    /**
     * 获取mSegment24属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMSegment24() {
        return mSegment24;
    }

    /**
     * 设置mSegment24属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMSegment24(JAXBElement<String> value) {
        this.mSegment24 = value;
    }

    /**
     * 获取mSegment25属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMSegment25() {
        return mSegment25;
    }

    /**
     * 设置mSegment25属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMSegment25(JAXBElement<String> value) {
        this.mSegment25 = value;
    }

    /**
     * 获取mSegment26属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMSegment26() {
        return mSegment26;
    }

    /**
     * 设置mSegment26属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMSegment26(JAXBElement<String> value) {
        this.mSegment26 = value;
    }

    /**
     * 获取mSegment27属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMSegment27() {
        return mSegment27;
    }

    /**
     * 设置mSegment27属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMSegment27(JAXBElement<String> value) {
        this.mSegment27 = value;
    }

    /**
     * 获取mSegment28属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMSegment28() {
        return mSegment28;
    }

    /**
     * 设置mSegment28属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMSegment28(JAXBElement<String> value) {
        this.mSegment28 = value;
    }

    /**
     * 获取mSegment29属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMSegment29() {
        return mSegment29;
    }

    /**
     * 设置mSegment29属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMSegment29(JAXBElement<String> value) {
        this.mSegment29 = value;
    }

    /**
     * 获取mSegment3属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMSegment3() {
        return mSegment3;
    }

    /**
     * 设置mSegment3属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMSegment3(JAXBElement<String> value) {
        this.mSegment3 = value;
    }

    /**
     * 获取mSegment30属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMSegment30() {
        return mSegment30;
    }

    /**
     * 设置mSegment30属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMSegment30(JAXBElement<String> value) {
        this.mSegment30 = value;
    }

    /**
     * 获取mSegment4属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMSegment4() {
        return mSegment4;
    }

    /**
     * 设置mSegment4属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMSegment4(JAXBElement<String> value) {
        this.mSegment4 = value;
    }

    /**
     * 获取mSegment5属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMSegment5() {
        return mSegment5;
    }

    /**
     * 设置mSegment5属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMSegment5(JAXBElement<String> value) {
        this.mSegment5 = value;
    }

    /**
     * 获取mSegment6属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMSegment6() {
        return mSegment6;
    }

    /**
     * 设置mSegment6属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMSegment6(JAXBElement<String> value) {
        this.mSegment6 = value;
    }

    /**
     * 获取mSegment7属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMSegment7() {
        return mSegment7;
    }

    /**
     * 设置mSegment7属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMSegment7(JAXBElement<String> value) {
        this.mSegment7 = value;
    }

    /**
     * 获取mSegment8属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMSegment8() {
        return mSegment8;
    }

    /**
     * 设置mSegment8属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMSegment8(JAXBElement<String> value) {
        this.mSegment8 = value;
    }

    /**
     * 获取mSegment9属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMSegment9() {
        return mSegment9;
    }

    /**
     * 设置mSegment9属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMSegment9(JAXBElement<String> value) {
        this.mSegment9 = value;
    }

    /**
     * 获取mShortName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMShortName() {
        return mShortName;
    }

    /**
     * 设置mShortName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMShortName(JAXBElement<String> value) {
        this.mShortName = value;
    }

    /**
     * 获取mState属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMState() {
        return mState;
    }

    /**
     * 设置mState属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMState(Integer value) {
        this.mState = value;
    }

    /**
     * 获取mStateTaxNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMStateTaxNo() {
        return mStateTaxNo;
    }

    /**
     * 设置mStateTaxNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMStateTaxNo(JAXBElement<String> value) {
        this.mStateTaxNo = value;
    }

    /**
     * 获取mStateTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMStateTime() {
        return mStateTime;
    }

    /**
     * 设置mStateTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMStateTime(XMLGregorianCalendar value) {
        this.mStateTime = value;
    }

    /**
     * 获取mSupplierBankAccount属性的值。
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
     * 设置mSupplierBankAccount属性的值。
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
     * 获取mSupplierContacts属性的值。
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
     * 设置mSupplierContacts属性的值。
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
     * 获取mSupplierSites属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUFIDAU9CBOSCMSupplierSupplierSiteData }{@code >}
     *     
     */
    public JAXBElement<ArrayOfUFIDAU9CBOSCMSupplierSupplierSiteData> getMSupplierSites() {
        return mSupplierSites;
    }

    /**
     * 设置mSupplierSites属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUFIDAU9CBOSCMSupplierSupplierSiteData }{@code >}
     *     
     */
    public void setMSupplierSites(JAXBElement<ArrayOfUFIDAU9CBOSCMSupplierSupplierSiteData> value) {
        this.mSupplierSites = value;
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

    /**
     * 获取mTradeCategory属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMTradeCategory() {
        return mTradeCategory;
    }

    /**
     * 设置mTradeCategory属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMTradeCategory(Integer value) {
        this.mTradeCategory = value;
    }

    /**
     * 获取mTransitLeadTime属性的值。
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
     * 设置mTransitLeadTime属性的值。
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
     * 获取mTurnover属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMTurnover() {
        return mTurnover;
    }

    /**
     * 设置mTurnover属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMTurnover(BigDecimal value) {
        this.mTurnover = value;
    }

    /**
     * 获取mvmiRule属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMVMIRule() {
        return mvmiRule;
    }

    /**
     * 设置mvmiRule属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMVMIRule(Long value) {
        this.mvmiRule = value;
    }

    /**
     * 获取mvmiRuleCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMVMIRuleCode() {
        return mvmiRuleCode;
    }

    /**
     * 设置mvmiRuleCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMVMIRuleCode(JAXBElement<String> value) {
        this.mvmiRuleCode = value;
    }

    /**
     * 获取mvmiRuleName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMVMIRuleName() {
        return mvmiRuleName;
    }

    /**
     * 设置mvmiRuleName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMVMIRuleName(JAXBElement<String> value) {
        this.mvmiRuleName = value;
    }

}
