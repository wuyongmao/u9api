
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
 * &lt;p&gt;UFIDA.U9.CBO.SCM.Customer.CustomerData complex type的 Java 类。
 * 
 * &lt;p&gt;以下模式片段指定包含在此类中的预期内容。
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="UFIDA.U9.CBO.SCM.Customer.CustomerData"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://www.UFIDA.org/EntityData}UFSoft.UBF.Business.DataTransObjectBase"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="ARConfirmTerm" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ARConfirmTerm_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="AccountListFormat" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="AccountListFormat_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="AppPortal" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="AppPortal_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="BillFromat" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="BillFromat_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="CombineName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="CommissionCurrency" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="CommissionCurrency_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="CorpUnifyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="CustomerCategory" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="CustomerCategory_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="DefaultBillTo_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="DefaultClaim_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="DefaultContact" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="DefaultContact_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="DefaultContrast_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="DefaultGathering_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="DefaultShipTo_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="DelayGatheringPolicy" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="DelayGatheringPolicy_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Department" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Department_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="DundocFormat" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="DundocFormat_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="GatheringPolicy" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="GatheringPolicy_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="HoldReason" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="HoldReason_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="KeyFlexFieldStru" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="KeyFlexFieldStru_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Language" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Language_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Multi_CombineName" type="{UFSoft.UBF.Util.Data}MultiLangDataDict" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Multi_CorpUnifyCode" type="{UFSoft.UBF.Util.Data}MultiLangDataDict" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Multi_Description" type="{UFSoft.UBF.Util.Data}MultiLangDataDict" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Multi_Name" type="{UFSoft.UBF.Util.Data}MultiLangDataDict" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Multi_PortalDefaultPlanTempletName" type="{UFSoft.UBF.Util.Data}MultiLangDataDict" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Multi_SaleChannel" type="{UFSoft.UBF.Util.Data}MultiLangDataDict" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="OfficialLocation" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="OfficialLocation_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="OrderFormat" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="OrderFormat_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Org" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Org_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="PayCurrency" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="PayCurrency_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Payee" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Payee_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="PortalDefaultPlanTempletName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="RecervalTerm" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="RecervalTerm_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="RegisterCapitalCurrency" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="RegisterCapitalCurrency_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="RegisterLocation" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="RegisterLocation_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ReleaseReason" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ReleaseReason_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ReturnTerm" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ReturnTerm_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="SaleChannel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Saleser" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Saleser_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ShippmentRule" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ShippmentRule_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="StateUser" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="StateUser_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
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
 *         &amp;lt;element name="TurnoverCurrency" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="TurnoverCurrency_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="WH" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="WH_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_bargain" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_checkAccountPeriod" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_commission" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_commissionRate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_commissionType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_controlPDiff" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_controlPoint" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_createdBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_createdOn" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_creditCtrlScope" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_creditLevel1" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_creditLevel1Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_creditLevel1Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_creditLevel2" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_creditLevel2Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_creditLevel2Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_creditPolicy" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_creditPolicyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_creditPolicyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_currentPercent" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_customerBankAccount" type="{http://www.UFIDA.org/EntityData}ArrayOfUFIDA.U9.CBO.SCM.Customer.CustomerBankAccountData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_customerContacts" type="{http://www.UFIDA.org/EntityData}ArrayOfUFIDA.U9.CBO.SCM.Customer.CustomerContactData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_customerSites" type="{http://www.UFIDA.org/EntityData}ArrayOfUFIDA.U9.CBO.SCM.Customer.CustomerSiteData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_defaultBillTo" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CBO.SCM.Customer.CustomerSiteData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_defaultClaim" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CBO.SCM.Customer.CustomerSiteData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_defaultContrast" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CBO.SCM.Customer.CustomerSiteData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_defaultGathering" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CBO.SCM.Customer.CustomerSiteData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_defaultShipTo" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CBO.SCM.Customer.CustomerSiteData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_demandTransType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_descFlexField" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.Base.FlexField.DescFlexField.DescFlexSegmentsData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_districtTaxNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_effective" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.Base.PropertyTypes.EffectiveData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_employeeCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_establishDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_extendLimitDays" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_holdDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_holdUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_iD" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_interestPeriod" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_invoiceVerificationOrder" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isARCfmModify" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isAccrualToAR" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isBillByBalance" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isByAccountAge" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isCharge" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isCompound" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isCreditCheck" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isDelay" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isDeposit" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isFromCRM" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isHaveContract" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isHoldRelease" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isMISC" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isPost" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isPreRcvRateModify" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isPreReceival" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isPriceListModify" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isRecTermModify" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isSalesDiscount" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isShipmentModify" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isSuspendAccrual" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isUseAppPotal" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_lastPrintDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_modifiedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_modifiedOn" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_nextPrintDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_portalDefaultPlanTemplet" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_portalDefaultPlanTempletCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_preRcvRate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_priceListCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_priceListID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_priceListName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_qualityPledge" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_registerCapital" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_releaseDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_releaseUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_returnBenefitRule" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_saleType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
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
 *         &amp;lt;element name="m_shareGroup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_shipmentTerms" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_shipmentTermsCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_shipmentTermsName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_shortName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_state" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_stateTaxNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_stateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_supplySource" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_suspendOnePercent" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_suspendOneperiod" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_suspendThreePercent" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_suspendThreeperiod" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_suspendTwoPercent" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_suspendTwoperiod" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_sysVersion" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_tradeCategory" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_transitLeadTime" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_turnover" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_useGatheringPolicy" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
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
@XmlType(name = "UFIDA.U9.CBO.SCM.Customer.CustomerData", propOrder = {
    "arConfirmTerm",
    "arConfirmTermSKey",
    "accountListFormat",
    "accountListFormatSKey",
    "appPortal",
    "appPortalSKey",
    "billFromat",
    "billFromatSKey",
    "combineName",
    "commissionCurrency",
    "commissionCurrencySKey",
    "corpUnifyCode",
    "customerCategory",
    "customerCategorySKey",
    "defaultBillToSKey",
    "defaultClaimSKey",
    "defaultContact",
    "defaultContactSKey",
    "defaultContrastSKey",
    "defaultGatheringSKey",
    "defaultShipToSKey",
    "delayGatheringPolicy",
    "delayGatheringPolicySKey",
    "department",
    "departmentSKey",
    "description",
    "dundocFormat",
    "dundocFormatSKey",
    "gatheringPolicy",
    "gatheringPolicySKey",
    "holdReason",
    "holdReasonSKey",
    "keyFlexFieldStru",
    "keyFlexFieldStruSKey",
    "language",
    "languageSKey",
    "multiCombineName",
    "multiCorpUnifyCode",
    "multiDescription",
    "multiName",
    "multiPortalDefaultPlanTempletName",
    "multiSaleChannel",
    "name",
    "officialLocation",
    "officialLocationSKey",
    "orderFormat",
    "orderFormatSKey",
    "org",
    "orgSKey",
    "payCurrency",
    "payCurrencySKey",
    "payee",
    "payeeSKey",
    "portalDefaultPlanTempletName",
    "recervalTerm",
    "recervalTermSKey",
    "registerCapitalCurrency",
    "registerCapitalCurrencySKey",
    "registerLocation",
    "registerLocationSKey",
    "releaseReason",
    "releaseReasonSKey",
    "returnTerm",
    "returnTermSKey",
    "saleChannel",
    "saleser",
    "saleserSKey",
    "shippmentRule",
    "shippmentRuleSKey",
    "stateUser",
    "stateUserSKey",
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
    "turnoverCurrency",
    "turnoverCurrencySKey",
    "wh",
    "whsKey",
    "mBargain",
    "mCheckAccountPeriod",
    "mCode",
    "mCommission",
    "mCommissionRate",
    "mCommissionType",
    "mControlPDiff",
    "mControlPoint",
    "mCreatedBy",
    "mCreatedOn",
    "mCreditCtrlScope",
    "mCreditLevel1",
    "mCreditLevel1Code",
    "mCreditLevel1Name",
    "mCreditLevel2",
    "mCreditLevel2Code",
    "mCreditLevel2Name",
    "mCreditPolicy",
    "mCreditPolicyCode",
    "mCreditPolicyName",
    "mCurrentPercent",
    "mCustomerBankAccount",
    "mCustomerContacts",
    "mCustomerSites",
    "mDefaultBillTo",
    "mDefaultClaim",
    "mDefaultContrast",
    "mDefaultGathering",
    "mDefaultShipTo",
    "mDemandTransType",
    "mDescFlexField",
    "mDistrictTaxNo",
    "mEffective",
    "mEmployeeCount",
    "mEstablishDate",
    "mExtendLimitDays",
    "mHoldDate",
    "mHoldUser",
    "mid",
    "mInterestPeriod",
    "mInvoiceVerificationOrder",
    "mIsARCfmModify",
    "mIsAccrualToAR",
    "mIsBillByBalance",
    "mIsByAccountAge",
    "mIsCharge",
    "mIsCompound",
    "mIsCreditCheck",
    "mIsDelay",
    "mIsDeposit",
    "mIsFromCRM",
    "mIsHaveContract",
    "mIsHoldRelease",
    "mIsMISC",
    "mIsPost",
    "mIsPreRcvRateModify",
    "mIsPreReceival",
    "mIsPriceListModify",
    "mIsRecTermModify",
    "mIsSalesDiscount",
    "mIsShipmentModify",
    "mIsSuspendAccrual",
    "mIsUseAppPotal",
    "mLastPrintDate",
    "mModifiedBy",
    "mModifiedOn",
    "mNextPrintDate",
    "mPortalDefaultPlanTemplet",
    "mPortalDefaultPlanTempletCode",
    "mPreRcvRate",
    "mPriceListCode",
    "mPriceListID",
    "mPriceListName",
    "mQualityPledge",
    "mRegisterCapital",
    "mReleaseDate",
    "mReleaseUser",
    "mReturnBenefitRule",
    "mSaleType",
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
    "mShareGroup",
    "mShipmentTerms",
    "mShipmentTermsCode",
    "mShipmentTermsName",
    "mShortName",
    "mState",
    "mStateTaxNo",
    "mStateTime",
    "mSupplySource",
    "mSuspendOnePercent",
    "mSuspendOneperiod",
    "mSuspendThreePercent",
    "mSuspendThreeperiod",
    "mSuspendTwoPercent",
    "mSuspendTwoperiod",
    "mSysVersion",
    "mTradeCategory",
    "mTransitLeadTime",
    "mTurnover",
    "mUseGatheringPolicy",
    "mVerificationMode"
})
public class UFIDAU9CBOSCMCustomerCustomerData
    extends UFSoftUBFBusinessDataTransObjectBase
{

    @XmlElement(name = "ARConfirmTerm")
    protected Long arConfirmTerm;
    @XmlElementRef(name = "ARConfirmTerm_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> arConfirmTermSKey;
    @XmlElement(name = "AccountListFormat")
    protected Long accountListFormat;
    @XmlElementRef(name = "AccountListFormat_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> accountListFormatSKey;
    @XmlElement(name = "AppPortal")
    protected Long appPortal;
    @XmlElementRef(name = "AppPortal_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> appPortalSKey;
    @XmlElement(name = "BillFromat")
    protected Long billFromat;
    @XmlElementRef(name = "BillFromat_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> billFromatSKey;
    @XmlElementRef(name = "CombineName", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> combineName;
    @XmlElement(name = "CommissionCurrency")
    protected Long commissionCurrency;
    @XmlElementRef(name = "CommissionCurrency_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> commissionCurrencySKey;
    @XmlElementRef(name = "CorpUnifyCode", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> corpUnifyCode;
    @XmlElement(name = "CustomerCategory")
    protected Long customerCategory;
    @XmlElementRef(name = "CustomerCategory_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> customerCategorySKey;
    @XmlElementRef(name = "DefaultBillTo_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> defaultBillToSKey;
    @XmlElementRef(name = "DefaultClaim_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> defaultClaimSKey;
    @XmlElement(name = "DefaultContact")
    protected Long defaultContact;
    @XmlElementRef(name = "DefaultContact_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> defaultContactSKey;
    @XmlElementRef(name = "DefaultContrast_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> defaultContrastSKey;
    @XmlElementRef(name = "DefaultGathering_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> defaultGatheringSKey;
    @XmlElementRef(name = "DefaultShipTo_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> defaultShipToSKey;
    @XmlElement(name = "DelayGatheringPolicy")
    protected Long delayGatheringPolicy;
    @XmlElementRef(name = "DelayGatheringPolicy_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> delayGatheringPolicySKey;
    @XmlElement(name = "Department")
    protected Long department;
    @XmlElementRef(name = "Department_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> departmentSKey;
    @XmlElementRef(name = "Description", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> description;
    @XmlElement(name = "DundocFormat")
    protected Long dundocFormat;
    @XmlElementRef(name = "DundocFormat_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> dundocFormatSKey;
    @XmlElement(name = "GatheringPolicy")
    protected Long gatheringPolicy;
    @XmlElementRef(name = "GatheringPolicy_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> gatheringPolicySKey;
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
    @XmlElementRef(name = "Multi_CombineName", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<MultiLangDataDict> multiCombineName;
    @XmlElementRef(name = "Multi_CorpUnifyCode", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<MultiLangDataDict> multiCorpUnifyCode;
    @XmlElementRef(name = "Multi_Description", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<MultiLangDataDict> multiDescription;
    @XmlElementRef(name = "Multi_Name", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<MultiLangDataDict> multiName;
    @XmlElementRef(name = "Multi_PortalDefaultPlanTempletName", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<MultiLangDataDict> multiPortalDefaultPlanTempletName;
    @XmlElementRef(name = "Multi_SaleChannel", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<MultiLangDataDict> multiSaleChannel;
    @XmlElementRef(name = "Name", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> name;
    @XmlElement(name = "OfficialLocation")
    protected Long officialLocation;
    @XmlElementRef(name = "OfficialLocation_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> officialLocationSKey;
    @XmlElement(name = "OrderFormat")
    protected Long orderFormat;
    @XmlElementRef(name = "OrderFormat_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> orderFormatSKey;
    @XmlElement(name = "Org")
    protected Long org;
    @XmlElementRef(name = "Org_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> orgSKey;
    @XmlElement(name = "PayCurrency")
    protected Long payCurrency;
    @XmlElementRef(name = "PayCurrency_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> payCurrencySKey;
    @XmlElement(name = "Payee")
    protected Long payee;
    @XmlElementRef(name = "Payee_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> payeeSKey;
    @XmlElementRef(name = "PortalDefaultPlanTempletName", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> portalDefaultPlanTempletName;
    @XmlElement(name = "RecervalTerm")
    protected Long recervalTerm;
    @XmlElementRef(name = "RecervalTerm_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> recervalTermSKey;
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
    @XmlElement(name = "ReturnTerm")
    protected Long returnTerm;
    @XmlElementRef(name = "ReturnTerm_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> returnTermSKey;
    @XmlElementRef(name = "SaleChannel", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> saleChannel;
    @XmlElement(name = "Saleser")
    protected Long saleser;
    @XmlElementRef(name = "Saleser_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> saleserSKey;
    @XmlElement(name = "ShippmentRule")
    protected Long shippmentRule;
    @XmlElementRef(name = "ShippmentRule_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> shippmentRuleSKey;
    @XmlElement(name = "StateUser")
    protected Long stateUser;
    @XmlElementRef(name = "StateUser_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> stateUserSKey;
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
    @XmlElement(name = "TurnoverCurrency")
    protected Long turnoverCurrency;
    @XmlElementRef(name = "TurnoverCurrency_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> turnoverCurrencySKey;
    @XmlElement(name = "WH")
    protected Long wh;
    @XmlElementRef(name = "WH_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> whsKey;
    @XmlElement(name = "m_bargain")
    protected Integer mBargain;
    @XmlElement(name = "m_checkAccountPeriod")
    protected Integer mCheckAccountPeriod;
    @XmlElementRef(name = "m_code", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mCode;
    @XmlElement(name = "m_commission")
    protected BigDecimal mCommission;
    @XmlElement(name = "m_commissionRate")
    protected BigDecimal mCommissionRate;
    @XmlElement(name = "m_commissionType")
    protected Integer mCommissionType;
    @XmlElement(name = "m_controlPDiff")
    protected Boolean mControlPDiff;
    @XmlElement(name = "m_controlPoint")
    protected Short mControlPoint;
    @XmlElementRef(name = "m_createdBy", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mCreatedBy;
    @XmlElement(name = "m_createdOn")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mCreatedOn;
    @XmlElement(name = "m_creditCtrlScope")
    protected Integer mCreditCtrlScope;
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
    @XmlElement(name = "m_currentPercent")
    protected BigDecimal mCurrentPercent;
    @XmlElementRef(name = "m_customerBankAccount", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfUFIDAU9CBOSCMCustomerCustomerBankAccountData> mCustomerBankAccount;
    @XmlElementRef(name = "m_customerContacts", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfUFIDAU9CBOSCMCustomerCustomerContactData> mCustomerContacts;
    @XmlElementRef(name = "m_customerSites", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfUFIDAU9CBOSCMCustomerCustomerSiteData> mCustomerSites;
    @XmlElementRef(name = "m_defaultBillTo", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9CBOSCMCustomerCustomerSiteData> mDefaultBillTo;
    @XmlElementRef(name = "m_defaultClaim", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9CBOSCMCustomerCustomerSiteData> mDefaultClaim;
    @XmlElementRef(name = "m_defaultContrast", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9CBOSCMCustomerCustomerSiteData> mDefaultContrast;
    @XmlElementRef(name = "m_defaultGathering", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9CBOSCMCustomerCustomerSiteData> mDefaultGathering;
    @XmlElementRef(name = "m_defaultShipTo", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9CBOSCMCustomerCustomerSiteData> mDefaultShipTo;
    @XmlElement(name = "m_demandTransType")
    protected Integer mDemandTransType;
    @XmlElementRef(name = "m_descFlexField", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9BaseFlexFieldDescFlexFieldDescFlexSegmentsData> mDescFlexField;
    @XmlElementRef(name = "m_districtTaxNo", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mDistrictTaxNo;
    @XmlElementRef(name = "m_effective", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9BasePropertyTypesEffectiveData> mEffective;
    @XmlElement(name = "m_employeeCount")
    protected Integer mEmployeeCount;
    @XmlElement(name = "m_establishDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mEstablishDate;
    @XmlElement(name = "m_extendLimitDays")
    protected Integer mExtendLimitDays;
    @XmlElement(name = "m_holdDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mHoldDate;
    @XmlElementRef(name = "m_holdUser", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mHoldUser;
    @XmlElement(name = "m_iD")
    protected Long mid;
    @XmlElement(name = "m_interestPeriod")
    protected Integer mInterestPeriod;
    @XmlElement(name = "m_invoiceVerificationOrder")
    protected Integer mInvoiceVerificationOrder;
    @XmlElement(name = "m_isARCfmModify")
    protected Boolean mIsARCfmModify;
    @XmlElement(name = "m_isAccrualToAR")
    protected Boolean mIsAccrualToAR;
    @XmlElement(name = "m_isBillByBalance")
    protected Boolean mIsBillByBalance;
    @XmlElement(name = "m_isByAccountAge")
    protected Boolean mIsByAccountAge;
    @XmlElement(name = "m_isCharge")
    protected Boolean mIsCharge;
    @XmlElement(name = "m_isCompound")
    protected Boolean mIsCompound;
    @XmlElement(name = "m_isCreditCheck")
    protected Boolean mIsCreditCheck;
    @XmlElement(name = "m_isDelay")
    protected Boolean mIsDelay;
    @XmlElement(name = "m_isDeposit")
    protected Boolean mIsDeposit;
    @XmlElement(name = "m_isFromCRM")
    protected Boolean mIsFromCRM;
    @XmlElement(name = "m_isHaveContract")
    protected Boolean mIsHaveContract;
    @XmlElement(name = "m_isHoldRelease")
    protected Boolean mIsHoldRelease;
    @XmlElement(name = "m_isMISC")
    protected Boolean mIsMISC;
    @XmlElement(name = "m_isPost")
    protected Boolean mIsPost;
    @XmlElement(name = "m_isPreRcvRateModify")
    protected Boolean mIsPreRcvRateModify;
    @XmlElement(name = "m_isPreReceival")
    protected Boolean mIsPreReceival;
    @XmlElement(name = "m_isPriceListModify")
    protected Boolean mIsPriceListModify;
    @XmlElement(name = "m_isRecTermModify")
    protected Boolean mIsRecTermModify;
    @XmlElement(name = "m_isSalesDiscount")
    protected Boolean mIsSalesDiscount;
    @XmlElement(name = "m_isShipmentModify")
    protected Boolean mIsShipmentModify;
    @XmlElement(name = "m_isSuspendAccrual")
    protected Boolean mIsSuspendAccrual;
    @XmlElement(name = "m_isUseAppPotal")
    protected Boolean mIsUseAppPotal;
    @XmlElement(name = "m_lastPrintDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mLastPrintDate;
    @XmlElementRef(name = "m_modifiedBy", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mModifiedBy;
    @XmlElement(name = "m_modifiedOn")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mModifiedOn;
    @XmlElement(name = "m_nextPrintDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mNextPrintDate;
    @XmlElement(name = "m_portalDefaultPlanTemplet")
    protected Long mPortalDefaultPlanTemplet;
    @XmlElementRef(name = "m_portalDefaultPlanTempletCode", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mPortalDefaultPlanTempletCode;
    @XmlElement(name = "m_preRcvRate")
    protected BigDecimal mPreRcvRate;
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
    @XmlElementRef(name = "m_returnBenefitRule", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mReturnBenefitRule;
    @XmlElement(name = "m_saleType")
    protected Integer mSaleType;
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
    @XmlElementRef(name = "m_shareGroup", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mShareGroup;
    @XmlElement(name = "m_shipmentTerms")
    protected Long mShipmentTerms;
    @XmlElementRef(name = "m_shipmentTermsCode", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mShipmentTermsCode;
    @XmlElementRef(name = "m_shipmentTermsName", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mShipmentTermsName;
    @XmlElementRef(name = "m_shortName", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mShortName;
    @XmlElement(name = "m_state")
    protected Integer mState;
    @XmlElementRef(name = "m_stateTaxNo", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mStateTaxNo;
    @XmlElement(name = "m_stateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mStateTime;
    @XmlElement(name = "m_supplySource")
    protected Integer mSupplySource;
    @XmlElement(name = "m_suspendOnePercent")
    protected BigDecimal mSuspendOnePercent;
    @XmlElement(name = "m_suspendOneperiod")
    protected Integer mSuspendOneperiod;
    @XmlElement(name = "m_suspendThreePercent")
    protected BigDecimal mSuspendThreePercent;
    @XmlElement(name = "m_suspendThreeperiod")
    protected Integer mSuspendThreeperiod;
    @XmlElement(name = "m_suspendTwoPercent")
    protected BigDecimal mSuspendTwoPercent;
    @XmlElement(name = "m_suspendTwoperiod")
    protected Integer mSuspendTwoperiod;
    @XmlElement(name = "m_sysVersion")
    protected Long mSysVersion;
    @XmlElement(name = "m_tradeCategory")
    protected Integer mTradeCategory;
    @XmlElement(name = "m_transitLeadTime")
    protected Integer mTransitLeadTime;
    @XmlElement(name = "m_turnover")
    protected BigDecimal mTurnover;
    @XmlElement(name = "m_useGatheringPolicy")
    protected Boolean mUseGatheringPolicy;
    @XmlElement(name = "m_verificationMode")
    protected Integer mVerificationMode;

    /**
     * 获取arConfirmTerm属性的值。
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
     * 设置arConfirmTerm属性的值。
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
     * 获取arConfirmTermSKey属性的值。
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
     * 设置arConfirmTermSKey属性的值。
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
     * 获取accountListFormat属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAccountListFormat() {
        return accountListFormat;
    }

    /**
     * 设置accountListFormat属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAccountListFormat(Long value) {
        this.accountListFormat = value;
    }

    /**
     * 获取accountListFormatSKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getAccountListFormatSKey() {
        return accountListFormatSKey;
    }

    /**
     * 设置accountListFormatSKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setAccountListFormatSKey(JAXBElement<EntityKey> value) {
        this.accountListFormatSKey = value;
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
     * 获取billFromat属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getBillFromat() {
        return billFromat;
    }

    /**
     * 设置billFromat属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setBillFromat(Long value) {
        this.billFromat = value;
    }

    /**
     * 获取billFromatSKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getBillFromatSKey() {
        return billFromatSKey;
    }

    /**
     * 设置billFromatSKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setBillFromatSKey(JAXBElement<EntityKey> value) {
        this.billFromatSKey = value;
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
     * 获取commissionCurrency属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCommissionCurrency() {
        return commissionCurrency;
    }

    /**
     * 设置commissionCurrency属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCommissionCurrency(Long value) {
        this.commissionCurrency = value;
    }

    /**
     * 获取commissionCurrencySKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getCommissionCurrencySKey() {
        return commissionCurrencySKey;
    }

    /**
     * 设置commissionCurrencySKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setCommissionCurrencySKey(JAXBElement<EntityKey> value) {
        this.commissionCurrencySKey = value;
    }

    /**
     * 获取corpUnifyCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCorpUnifyCode() {
        return corpUnifyCode;
    }

    /**
     * 设置corpUnifyCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCorpUnifyCode(JAXBElement<String> value) {
        this.corpUnifyCode = value;
    }

    /**
     * 获取customerCategory属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCustomerCategory() {
        return customerCategory;
    }

    /**
     * 设置customerCategory属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCustomerCategory(Long value) {
        this.customerCategory = value;
    }

    /**
     * 获取customerCategorySKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getCustomerCategorySKey() {
        return customerCategorySKey;
    }

    /**
     * 设置customerCategorySKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setCustomerCategorySKey(JAXBElement<EntityKey> value) {
        this.customerCategorySKey = value;
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
     * 获取defaultContact属性的值。
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
     * 设置defaultContact属性的值。
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
     * 获取defaultContactSKey属性的值。
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
     * 设置defaultContactSKey属性的值。
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
     * 获取defaultGatheringSKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getDefaultGatheringSKey() {
        return defaultGatheringSKey;
    }

    /**
     * 设置defaultGatheringSKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setDefaultGatheringSKey(JAXBElement<EntityKey> value) {
        this.defaultGatheringSKey = value;
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
     * 获取delayGatheringPolicy属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDelayGatheringPolicy() {
        return delayGatheringPolicy;
    }

    /**
     * 设置delayGatheringPolicy属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDelayGatheringPolicy(Long value) {
        this.delayGatheringPolicy = value;
    }

    /**
     * 获取delayGatheringPolicySKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getDelayGatheringPolicySKey() {
        return delayGatheringPolicySKey;
    }

    /**
     * 设置delayGatheringPolicySKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setDelayGatheringPolicySKey(JAXBElement<EntityKey> value) {
        this.delayGatheringPolicySKey = value;
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
     * 获取dundocFormat属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDundocFormat() {
        return dundocFormat;
    }

    /**
     * 设置dundocFormat属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDundocFormat(Long value) {
        this.dundocFormat = value;
    }

    /**
     * 获取dundocFormatSKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getDundocFormatSKey() {
        return dundocFormatSKey;
    }

    /**
     * 设置dundocFormatSKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setDundocFormatSKey(JAXBElement<EntityKey> value) {
        this.dundocFormatSKey = value;
    }

    /**
     * 获取gatheringPolicy属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getGatheringPolicy() {
        return gatheringPolicy;
    }

    /**
     * 设置gatheringPolicy属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setGatheringPolicy(Long value) {
        this.gatheringPolicy = value;
    }

    /**
     * 获取gatheringPolicySKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getGatheringPolicySKey() {
        return gatheringPolicySKey;
    }

    /**
     * 设置gatheringPolicySKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setGatheringPolicySKey(JAXBElement<EntityKey> value) {
        this.gatheringPolicySKey = value;
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
     * 获取multiCorpUnifyCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MultiLangDataDict }{@code >}
     *     
     */
    public JAXBElement<MultiLangDataDict> getMultiCorpUnifyCode() {
        return multiCorpUnifyCode;
    }

    /**
     * 设置multiCorpUnifyCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MultiLangDataDict }{@code >}
     *     
     */
    public void setMultiCorpUnifyCode(JAXBElement<MultiLangDataDict> value) {
        this.multiCorpUnifyCode = value;
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
     * 获取multiPortalDefaultPlanTempletName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MultiLangDataDict }{@code >}
     *     
     */
    public JAXBElement<MultiLangDataDict> getMultiPortalDefaultPlanTempletName() {
        return multiPortalDefaultPlanTempletName;
    }

    /**
     * 设置multiPortalDefaultPlanTempletName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MultiLangDataDict }{@code >}
     *     
     */
    public void setMultiPortalDefaultPlanTempletName(JAXBElement<MultiLangDataDict> value) {
        this.multiPortalDefaultPlanTempletName = value;
    }

    /**
     * 获取multiSaleChannel属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MultiLangDataDict }{@code >}
     *     
     */
    public JAXBElement<MultiLangDataDict> getMultiSaleChannel() {
        return multiSaleChannel;
    }

    /**
     * 设置multiSaleChannel属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MultiLangDataDict }{@code >}
     *     
     */
    public void setMultiSaleChannel(JAXBElement<MultiLangDataDict> value) {
        this.multiSaleChannel = value;
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
     * 获取orderFormat属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOrderFormat() {
        return orderFormat;
    }

    /**
     * 设置orderFormat属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOrderFormat(Long value) {
        this.orderFormat = value;
    }

    /**
     * 获取orderFormatSKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getOrderFormatSKey() {
        return orderFormatSKey;
    }

    /**
     * 设置orderFormatSKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setOrderFormatSKey(JAXBElement<EntityKey> value) {
        this.orderFormatSKey = value;
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
     * 获取payCurrency属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPayCurrency() {
        return payCurrency;
    }

    /**
     * 设置payCurrency属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPayCurrency(Long value) {
        this.payCurrency = value;
    }

    /**
     * 获取payCurrencySKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getPayCurrencySKey() {
        return payCurrencySKey;
    }

    /**
     * 设置payCurrencySKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setPayCurrencySKey(JAXBElement<EntityKey> value) {
        this.payCurrencySKey = value;
    }

    /**
     * 获取payee属性的值。
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
     * 设置payee属性的值。
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
     * 获取payeeSKey属性的值。
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
     * 设置payeeSKey属性的值。
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
     * 获取portalDefaultPlanTempletName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPortalDefaultPlanTempletName() {
        return portalDefaultPlanTempletName;
    }

    /**
     * 设置portalDefaultPlanTempletName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPortalDefaultPlanTempletName(JAXBElement<String> value) {
        this.portalDefaultPlanTempletName = value;
    }

    /**
     * 获取recervalTerm属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRecervalTerm() {
        return recervalTerm;
    }

    /**
     * 设置recervalTerm属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRecervalTerm(Long value) {
        this.recervalTerm = value;
    }

    /**
     * 获取recervalTermSKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getRecervalTermSKey() {
        return recervalTermSKey;
    }

    /**
     * 设置recervalTermSKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setRecervalTermSKey(JAXBElement<EntityKey> value) {
        this.recervalTermSKey = value;
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
     * 获取returnTerm属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getReturnTerm() {
        return returnTerm;
    }

    /**
     * 设置returnTerm属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setReturnTerm(Long value) {
        this.returnTerm = value;
    }

    /**
     * 获取returnTermSKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getReturnTermSKey() {
        return returnTermSKey;
    }

    /**
     * 设置returnTermSKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setReturnTermSKey(JAXBElement<EntityKey> value) {
        this.returnTermSKey = value;
    }

    /**
     * 获取saleChannel属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSaleChannel() {
        return saleChannel;
    }

    /**
     * 设置saleChannel属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSaleChannel(JAXBElement<String> value) {
        this.saleChannel = value;
    }

    /**
     * 获取saleser属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSaleser() {
        return saleser;
    }

    /**
     * 设置saleser属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSaleser(Long value) {
        this.saleser = value;
    }

    /**
     * 获取saleserSKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getSaleserSKey() {
        return saleserSKey;
    }

    /**
     * 设置saleserSKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setSaleserSKey(JAXBElement<EntityKey> value) {
        this.saleserSKey = value;
    }

    /**
     * 获取shippmentRule属性的值。
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
     * 设置shippmentRule属性的值。
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
     * 获取shippmentRuleSKey属性的值。
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
     * 设置shippmentRuleSKey属性的值。
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
     * 获取supplyOrg属性的值。
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
     * 设置supplyOrg属性的值。
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
     * 获取supplyOrgSKey属性的值。
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
     * 设置supplyOrgSKey属性的值。
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
     * 获取wh属性的值。
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
     * 设置wh属性的值。
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
     * 获取whsKey属性的值。
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
     * 设置whsKey属性的值。
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
     * 获取mCheckAccountPeriod属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMCheckAccountPeriod() {
        return mCheckAccountPeriod;
    }

    /**
     * 设置mCheckAccountPeriod属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMCheckAccountPeriod(Integer value) {
        this.mCheckAccountPeriod = value;
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
     * 获取mCommission属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMCommission() {
        return mCommission;
    }

    /**
     * 设置mCommission属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMCommission(BigDecimal value) {
        this.mCommission = value;
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
     * 获取mCommissionType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMCommissionType() {
        return mCommissionType;
    }

    /**
     * 设置mCommissionType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMCommissionType(Integer value) {
        this.mCommissionType = value;
    }

    /**
     * 获取mControlPDiff属性的值。
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
     * 设置mControlPDiff属性的值。
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
     * 获取mControlPoint属性的值。
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
     * 设置mControlPoint属性的值。
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
     * 获取mCreditCtrlScope属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMCreditCtrlScope() {
        return mCreditCtrlScope;
    }

    /**
     * 设置mCreditCtrlScope属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMCreditCtrlScope(Integer value) {
        this.mCreditCtrlScope = value;
    }

    /**
     * 获取mCreditLevel1属性的值。
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
     * 设置mCreditLevel1属性的值。
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
     * 获取mCreditLevel1Code属性的值。
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
     * 设置mCreditLevel1Code属性的值。
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
     * 获取mCreditLevel1Name属性的值。
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
     * 设置mCreditLevel1Name属性的值。
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
     * 获取mCreditLevel2属性的值。
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
     * 设置mCreditLevel2属性的值。
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
     * 获取mCreditLevel2Code属性的值。
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
     * 设置mCreditLevel2Code属性的值。
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
     * 获取mCreditLevel2Name属性的值。
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
     * 设置mCreditLevel2Name属性的值。
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
     * 获取mCreditPolicy属性的值。
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
     * 设置mCreditPolicy属性的值。
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
     * 获取mCreditPolicyCode属性的值。
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
     * 设置mCreditPolicyCode属性的值。
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
     * 获取mCreditPolicyName属性的值。
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
     * 设置mCreditPolicyName属性的值。
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
     * 获取mCurrentPercent属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMCurrentPercent() {
        return mCurrentPercent;
    }

    /**
     * 设置mCurrentPercent属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMCurrentPercent(BigDecimal value) {
        this.mCurrentPercent = value;
    }

    /**
     * 获取mCustomerBankAccount属性的值。
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
     * 设置mCustomerBankAccount属性的值。
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
     * 获取mCustomerContacts属性的值。
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
     * 设置mCustomerContacts属性的值。
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
     * 获取mCustomerSites属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUFIDAU9CBOSCMCustomerCustomerSiteData }{@code >}
     *     
     */
    public JAXBElement<ArrayOfUFIDAU9CBOSCMCustomerCustomerSiteData> getMCustomerSites() {
        return mCustomerSites;
    }

    /**
     * 设置mCustomerSites属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUFIDAU9CBOSCMCustomerCustomerSiteData }{@code >}
     *     
     */
    public void setMCustomerSites(JAXBElement<ArrayOfUFIDAU9CBOSCMCustomerCustomerSiteData> value) {
        this.mCustomerSites = value;
    }

    /**
     * 获取mDefaultBillTo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOSCMCustomerCustomerSiteData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9CBOSCMCustomerCustomerSiteData> getMDefaultBillTo() {
        return mDefaultBillTo;
    }

    /**
     * 设置mDefaultBillTo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOSCMCustomerCustomerSiteData }{@code >}
     *     
     */
    public void setMDefaultBillTo(JAXBElement<UFIDAU9CBOSCMCustomerCustomerSiteData> value) {
        this.mDefaultBillTo = value;
    }

    /**
     * 获取mDefaultClaim属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOSCMCustomerCustomerSiteData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9CBOSCMCustomerCustomerSiteData> getMDefaultClaim() {
        return mDefaultClaim;
    }

    /**
     * 设置mDefaultClaim属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOSCMCustomerCustomerSiteData }{@code >}
     *     
     */
    public void setMDefaultClaim(JAXBElement<UFIDAU9CBOSCMCustomerCustomerSiteData> value) {
        this.mDefaultClaim = value;
    }

    /**
     * 获取mDefaultContrast属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOSCMCustomerCustomerSiteData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9CBOSCMCustomerCustomerSiteData> getMDefaultContrast() {
        return mDefaultContrast;
    }

    /**
     * 设置mDefaultContrast属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOSCMCustomerCustomerSiteData }{@code >}
     *     
     */
    public void setMDefaultContrast(JAXBElement<UFIDAU9CBOSCMCustomerCustomerSiteData> value) {
        this.mDefaultContrast = value;
    }

    /**
     * 获取mDefaultGathering属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOSCMCustomerCustomerSiteData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9CBOSCMCustomerCustomerSiteData> getMDefaultGathering() {
        return mDefaultGathering;
    }

    /**
     * 设置mDefaultGathering属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOSCMCustomerCustomerSiteData }{@code >}
     *     
     */
    public void setMDefaultGathering(JAXBElement<UFIDAU9CBOSCMCustomerCustomerSiteData> value) {
        this.mDefaultGathering = value;
    }

    /**
     * 获取mDefaultShipTo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOSCMCustomerCustomerSiteData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9CBOSCMCustomerCustomerSiteData> getMDefaultShipTo() {
        return mDefaultShipTo;
    }

    /**
     * 设置mDefaultShipTo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOSCMCustomerCustomerSiteData }{@code >}
     *     
     */
    public void setMDefaultShipTo(JAXBElement<UFIDAU9CBOSCMCustomerCustomerSiteData> value) {
        this.mDefaultShipTo = value;
    }

    /**
     * 获取mDemandTransType属性的值。
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
     * 设置mDemandTransType属性的值。
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
     * 获取mExtendLimitDays属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMExtendLimitDays() {
        return mExtendLimitDays;
    }

    /**
     * 设置mExtendLimitDays属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMExtendLimitDays(Integer value) {
        this.mExtendLimitDays = value;
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
     * 获取mInterestPeriod属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMInterestPeriod() {
        return mInterestPeriod;
    }

    /**
     * 设置mInterestPeriod属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMInterestPeriod(Integer value) {
        this.mInterestPeriod = value;
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
     * 获取mIsARCfmModify属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsARCfmModify() {
        return mIsARCfmModify;
    }

    /**
     * 设置mIsARCfmModify属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsARCfmModify(Boolean value) {
        this.mIsARCfmModify = value;
    }

    /**
     * 获取mIsAccrualToAR属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsAccrualToAR() {
        return mIsAccrualToAR;
    }

    /**
     * 设置mIsAccrualToAR属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsAccrualToAR(Boolean value) {
        this.mIsAccrualToAR = value;
    }

    /**
     * 获取mIsBillByBalance属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsBillByBalance() {
        return mIsBillByBalance;
    }

    /**
     * 设置mIsBillByBalance属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsBillByBalance(Boolean value) {
        this.mIsBillByBalance = value;
    }

    /**
     * 获取mIsByAccountAge属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsByAccountAge() {
        return mIsByAccountAge;
    }

    /**
     * 设置mIsByAccountAge属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsByAccountAge(Boolean value) {
        this.mIsByAccountAge = value;
    }

    /**
     * 获取mIsCharge属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsCharge() {
        return mIsCharge;
    }

    /**
     * 设置mIsCharge属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsCharge(Boolean value) {
        this.mIsCharge = value;
    }

    /**
     * 获取mIsCompound属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsCompound() {
        return mIsCompound;
    }

    /**
     * 设置mIsCompound属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsCompound(Boolean value) {
        this.mIsCompound = value;
    }

    /**
     * 获取mIsCreditCheck属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsCreditCheck() {
        return mIsCreditCheck;
    }

    /**
     * 设置mIsCreditCheck属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsCreditCheck(Boolean value) {
        this.mIsCreditCheck = value;
    }

    /**
     * 获取mIsDelay属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsDelay() {
        return mIsDelay;
    }

    /**
     * 设置mIsDelay属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsDelay(Boolean value) {
        this.mIsDelay = value;
    }

    /**
     * 获取mIsDeposit属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsDeposit() {
        return mIsDeposit;
    }

    /**
     * 设置mIsDeposit属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsDeposit(Boolean value) {
        this.mIsDeposit = value;
    }

    /**
     * 获取mIsFromCRM属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsFromCRM() {
        return mIsFromCRM;
    }

    /**
     * 设置mIsFromCRM属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsFromCRM(Boolean value) {
        this.mIsFromCRM = value;
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
     * 获取mIsPost属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsPost() {
        return mIsPost;
    }

    /**
     * 设置mIsPost属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsPost(Boolean value) {
        this.mIsPost = value;
    }

    /**
     * 获取mIsPreRcvRateModify属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsPreRcvRateModify() {
        return mIsPreRcvRateModify;
    }

    /**
     * 设置mIsPreRcvRateModify属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsPreRcvRateModify(Boolean value) {
        this.mIsPreRcvRateModify = value;
    }

    /**
     * 获取mIsPreReceival属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsPreReceival() {
        return mIsPreReceival;
    }

    /**
     * 设置mIsPreReceival属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsPreReceival(Boolean value) {
        this.mIsPreReceival = value;
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
     * 获取mIsRecTermModify属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsRecTermModify() {
        return mIsRecTermModify;
    }

    /**
     * 设置mIsRecTermModify属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsRecTermModify(Boolean value) {
        this.mIsRecTermModify = value;
    }

    /**
     * 获取mIsSalesDiscount属性的值。
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
     * 设置mIsSalesDiscount属性的值。
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
     * 获取mIsShipmentModify属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsShipmentModify() {
        return mIsShipmentModify;
    }

    /**
     * 设置mIsShipmentModify属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsShipmentModify(Boolean value) {
        this.mIsShipmentModify = value;
    }

    /**
     * 获取mIsSuspendAccrual属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsSuspendAccrual() {
        return mIsSuspendAccrual;
    }

    /**
     * 设置mIsSuspendAccrual属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsSuspendAccrual(Boolean value) {
        this.mIsSuspendAccrual = value;
    }

    /**
     * 获取mIsUseAppPotal属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsUseAppPotal() {
        return mIsUseAppPotal;
    }

    /**
     * 设置mIsUseAppPotal属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsUseAppPotal(Boolean value) {
        this.mIsUseAppPotal = value;
    }

    /**
     * 获取mLastPrintDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMLastPrintDate() {
        return mLastPrintDate;
    }

    /**
     * 设置mLastPrintDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMLastPrintDate(XMLGregorianCalendar value) {
        this.mLastPrintDate = value;
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
     * 获取mNextPrintDate属性的值。
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
     * 设置mNextPrintDate属性的值。
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
     * 获取mPortalDefaultPlanTemplet属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMPortalDefaultPlanTemplet() {
        return mPortalDefaultPlanTemplet;
    }

    /**
     * 设置mPortalDefaultPlanTemplet属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMPortalDefaultPlanTemplet(Long value) {
        this.mPortalDefaultPlanTemplet = value;
    }

    /**
     * 获取mPortalDefaultPlanTempletCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMPortalDefaultPlanTempletCode() {
        return mPortalDefaultPlanTempletCode;
    }

    /**
     * 设置mPortalDefaultPlanTempletCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMPortalDefaultPlanTempletCode(JAXBElement<String> value) {
        this.mPortalDefaultPlanTempletCode = value;
    }

    /**
     * 获取mPreRcvRate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMPreRcvRate() {
        return mPreRcvRate;
    }

    /**
     * 设置mPreRcvRate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMPreRcvRate(BigDecimal value) {
        this.mPreRcvRate = value;
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
     * 获取mReturnBenefitRule属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMReturnBenefitRule() {
        return mReturnBenefitRule;
    }

    /**
     * 设置mReturnBenefitRule属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMReturnBenefitRule(JAXBElement<String> value) {
        this.mReturnBenefitRule = value;
    }

    /**
     * 获取mSaleType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMSaleType() {
        return mSaleType;
    }

    /**
     * 设置mSaleType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMSaleType(Integer value) {
        this.mSaleType = value;
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
     * 获取mShareGroup属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMShareGroup() {
        return mShareGroup;
    }

    /**
     * 设置mShareGroup属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMShareGroup(JAXBElement<String> value) {
        this.mShareGroup = value;
    }

    /**
     * 获取mShipmentTerms属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMShipmentTerms() {
        return mShipmentTerms;
    }

    /**
     * 设置mShipmentTerms属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMShipmentTerms(Long value) {
        this.mShipmentTerms = value;
    }

    /**
     * 获取mShipmentTermsCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMShipmentTermsCode() {
        return mShipmentTermsCode;
    }

    /**
     * 设置mShipmentTermsCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMShipmentTermsCode(JAXBElement<String> value) {
        this.mShipmentTermsCode = value;
    }

    /**
     * 获取mShipmentTermsName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMShipmentTermsName() {
        return mShipmentTermsName;
    }

    /**
     * 设置mShipmentTermsName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMShipmentTermsName(JAXBElement<String> value) {
        this.mShipmentTermsName = value;
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
     * 获取mSupplySource属性的值。
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
     * 设置mSupplySource属性的值。
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
     * 获取mSuspendOnePercent属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMSuspendOnePercent() {
        return mSuspendOnePercent;
    }

    /**
     * 设置mSuspendOnePercent属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMSuspendOnePercent(BigDecimal value) {
        this.mSuspendOnePercent = value;
    }

    /**
     * 获取mSuspendOneperiod属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMSuspendOneperiod() {
        return mSuspendOneperiod;
    }

    /**
     * 设置mSuspendOneperiod属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMSuspendOneperiod(Integer value) {
        this.mSuspendOneperiod = value;
    }

    /**
     * 获取mSuspendThreePercent属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMSuspendThreePercent() {
        return mSuspendThreePercent;
    }

    /**
     * 设置mSuspendThreePercent属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMSuspendThreePercent(BigDecimal value) {
        this.mSuspendThreePercent = value;
    }

    /**
     * 获取mSuspendThreeperiod属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMSuspendThreeperiod() {
        return mSuspendThreeperiod;
    }

    /**
     * 设置mSuspendThreeperiod属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMSuspendThreeperiod(Integer value) {
        this.mSuspendThreeperiod = value;
    }

    /**
     * 获取mSuspendTwoPercent属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMSuspendTwoPercent() {
        return mSuspendTwoPercent;
    }

    /**
     * 设置mSuspendTwoPercent属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMSuspendTwoPercent(BigDecimal value) {
        this.mSuspendTwoPercent = value;
    }

    /**
     * 获取mSuspendTwoperiod属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMSuspendTwoperiod() {
        return mSuspendTwoperiod;
    }

    /**
     * 设置mSuspendTwoperiod属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMSuspendTwoperiod(Integer value) {
        this.mSuspendTwoperiod = value;
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
     * 获取mUseGatheringPolicy属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMUseGatheringPolicy() {
        return mUseGatheringPolicy;
    }

    /**
     * 设置mUseGatheringPolicy属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMUseGatheringPolicy(Boolean value) {
        this.mUseGatheringPolicy = value;
    }

    /**
     * 获取mVerificationMode属性的值。
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
     * 设置mVerificationMode属性的值。
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
