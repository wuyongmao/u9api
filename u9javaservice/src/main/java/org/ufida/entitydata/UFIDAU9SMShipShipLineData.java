
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
 * &lt;p&gt;UFIDA.U9.SM.Ship.ShipLineData complex type的 Java 类。
 * 
 * &lt;p&gt;以下模式片段指定包含在此类中的预期内容。
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="UFIDA.U9.SM.Ship.ShipLineData"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://www.UFIDA.org/EntityData}UFSoft.UBF.Business.DataTransObjectBase"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="AC" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="AC_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="AccountOrg" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="AccountOrg_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="AssociatedParent" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="AssociatedParent_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="BalanceRoute" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="BalanceRoute_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="BomOwner" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="BomOwner_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="CC" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="CC_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Carrier" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Carrier_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ClosePeriod" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ClosePeriod_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="CompensationPBU" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="CompensationPBU_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="CompensationPU" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="CompensationPU_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ConfirmAccording" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ConfirmAccording_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ConfirmTerm" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ConfirmTerm_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ContractOwnedOrg" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ContractOwnedOrg_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="CostBaseUom" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="CostBaseUom_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="CostUom" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="CostUom_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="HandleDept" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="HandleDept_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="IncomeConfirmTerm" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="IncomeConfirmTerm_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="InvBaseUom" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="InvBaseUom_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="InvMainUOM" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="InvMainUOM_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="InvUom" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="InvUom_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="InvoiceAccording" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="InvoiceAccording_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="KitItemManufacturer" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="KitItemManufacturer_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Manufacturer" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Manufacturer_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="MaxARPeriod" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="MaxARPeriod_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Multi_ShipLineMemo" type="{UFSoft.UBF.Util.Data}MultiLangDataDict" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Multi_Signer" type="{UFSoft.UBF.Util.Data}MultiLangDataDict" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Org" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Org_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="OriginalItemBaseUom" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="OriginalItemBaseUom_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="OriginalItemUom" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="OriginalItemUom_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="OriginalManufacturer" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="OriginalManufacturer_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="PreRecPolicy" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="PreRecPolicyLine" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="PreRecPolicyLine_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="PreRecPolicy_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="PriceBaseUom" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="PriceBaseUom_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="PriceUom" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="PriceUom_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ProcessMFC" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ProcessMFC_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ProcessSubUOM" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ProcessSubUOM_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ProcessUOM" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ProcessUOM_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Project" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Project_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ReceivableTerm" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ReceivableTerm_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="SOOwnedOrg" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="SOOwnedOrg_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="SaleDept" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="SaleDept_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Seiban" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Seiban_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Seller" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Seller_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ShipLineMemo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ShipPlanOrg" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ShipPlanOrg_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Ship_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ShipmentRule" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ShipmentRule_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ShipperOrg" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ShipperOrg_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Signer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="SrcDocOwnedOrg" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="SrcDocOwnedOrg_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="StageWH" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="StageWH_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Task" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Task_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="TaxSchedule" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="TaxSchedule_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="TradPath" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="TradPath_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="TradeBaseUom" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="TradeBaseUom_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="TradeUom" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="TradeUom2" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="TradeUom2Associate" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="TradeUom2Associate_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="TradeUom2_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="TradeUom_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="TransMode" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="TransMode_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="VolumeUom" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="VolumeUom_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="WH" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="WH_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="WeightUom" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="WeightUom_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="WhMan" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="WhMan_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_aAIStatus" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_aCToCCExchRate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_aCToCCExchRateType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_aRBillKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_aRBillLineKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_aRBillLineNo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_aRBillNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_aRMoney" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_aRMoneyFC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_aRMoneyTC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_aRQtyPriceAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_aRQtyTBUAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_aRQtyTUAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_activityType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_adjustPriceDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_adjustPricePerson" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_apportionMoney" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_apportionMoneyTC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_apportionPrice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_apportionPriceTC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_approveDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_approveMan" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_associatedParentID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_associatedParentNO" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_balanceRouteDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_billSetCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_billToSite" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CBO.SCM.Customer.CustomerSiteMISCInfoData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_bomID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_cAAmountOfProItem" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_cADate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_cAPriceAC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_cAPriceAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_cAPriceFC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_cAPriceTC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_cATBUAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_cATUAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_cATotalMoneyAC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_cATotalMoneyFC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_cATotalMoneyNoTaxAC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_cATotalMoneyNoTaxFC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_cATotalMoneyNoTaxTC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_cATotalMoneyTC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_cCMoney" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_canInvoiceMoneyAC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_canInvoiceQtyPU" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_channel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_chargeBasis" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_checkAccountBillLineNo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_checkAccountBillNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_checkAccountTotalTax" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_checkAccountTotalTaxFC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_checkAccountTotalTaxTC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_checkAccounter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_compensationPUQty" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_compensationPUToPBURate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_compensationSUQty" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_configItem" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CBO.SCM.Item.ItemInfoData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_configResult" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_confirmDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_confirmMode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_consumeRtnMnyUnit" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_container" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_contractDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_contractKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_contractLineKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_contractLineNo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_contractNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_contractVer" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_costRatetoBase" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_createdBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_createdOn" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_creditObj" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CBO.SCM.Customer.CustomerSiteMISCInfoData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_cusSignInQtyInvAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_cusSignInQtyPriceAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_cusSignInQtyTBUAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_cusSignInQtyTUAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_customerItemCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_customerItemName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_damageQtyIUAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_damageQtyOfProItem" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_damageQtyPriceAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_damageQtyTBUAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_damageQtyTUAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_dealMode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_demandCode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_descFlexField" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.Base.FlexField.DescFlexField.DescFlexSegmentsData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_discountRate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_docLineNo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_donationReason" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_donationType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_drawbackBillKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_drawbackBillLineKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_drawbackBillLineNo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_drawbackBillNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_executedARMoney" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_executedARMoneyTC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_executedARQtyPriceAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_executedARQtyTBUAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_executedARQtyTUAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_fAS" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CBO.SCM.Item.ItemInfoData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_fillQtyPriceAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_fillQtyTBUAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_fillQtyTUAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_finallyPrice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_finallyPriceTC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_financeCloseFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_futureCostAC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_futureCostFC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_futureCostTC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_goodsManagementType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_iD" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_iUToIMU" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_incomeConfirmRule" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_innerSupersedeEnum" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_invRatetoBase" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isARByPreShip" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isAllowReturn" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isAssociatedChild" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isChangeProcessQty" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isCloseSO" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isConfirmDateChangable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isCreatedInflow" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isDemandCodeUnChangeable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isExistAssociatedChild" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isFinishSignIn" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isGernerTBD" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isInnerShipment" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isInvoiceUpdate" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isItemVersionChangable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isKit" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isMakeOutInvoice" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isManufacturerChangeable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isMaturityDateChangable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isModifyLot" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isModifyOperateOrg" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isModifyPU" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isModifyShipperOrg" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isModifyTBUToPBU" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isModifyTCToACExRate" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isModifyTU" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isNeedGenAAI" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isNoSOShipment" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isPP" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isPossessCredit" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isPreRecChangeable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isPreRecPolicyChangeable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isPreShipBeginning" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isPriceIncludeTax" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isPriceListModify" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isPrjUnChangeable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isRP" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isRefill" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isSignedInByCP" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isTIByPreShip" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isTaskUnChangeable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isVMIAAI" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isZeroCost" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_itemInfo" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CBO.SCM.Item.ItemInfoData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_kitItemInfo" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CBO.SCM.Item.ItemInfoData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_kitLineNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_lCMoney" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_lotInfo" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.Lot.LotMasterInfoData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_lotInvalidationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_maturityDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_modifiedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_modifiedOn" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_motherSoShipLine" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_netAccount" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_netWeight" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_notLcMoney" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_objectNeedPreRecUse" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_objectUsablePreRecUse" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_orderPrice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_orderPriceTC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_originalItem" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CBO.SCM.Item.ItemInfoData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_originalItemAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_originalItemBaseAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_originalItemRatetoBase" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_parentShipLineID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_parentShipLineNo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_payer" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CBO.SCM.Customer.CustomerMISCInfoData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_payerSite" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CBO.SCM.Customer.CustomerSiteMISCInfoData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_perProcessQty" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_piece" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_planQtyTBUAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_planQtyTUAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_preMaturityDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_preRecLackMoney" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_preRecLackRate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_preRecListStr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_preRecMoney" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_preRecObject" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_preRecObjectUse" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_preRecRate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_preRecUse" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_precisionACCC" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_precisionTCAC" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_priceList" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_priceListCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_priceListName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_priceRatetoBase" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_priceSource" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_procedureNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_processItem" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CBO.SCM.Item.ItemInfoData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_processQty" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_processRateToSub" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_qtyPriceAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_quantityType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_rMRUseQtyTBUAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_rMRUseQtyTUAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_rcvDocNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_rcvID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_rcvLineID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_rcvLineNo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_rcvOrg" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_rcvQryTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_rcvQty" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_recBillLineKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_recBillLineNO" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_receivalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_receiveBillKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_receiveBillNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_refillUseQtyTBUAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_refillUseQtyTUAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_rejectQtyIUAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_rejectQtyOfProItem" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_rejectQtyPriceAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_rejectQtyTBUAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_rejectQtyTUAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_rejectRcvUseQtyTBUAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_rejectRcvUseQtyTUAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_rejectReason" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_reserveQty" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_sODate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_sOKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_sOKitLineNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_sOLineKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_sOLineNo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_sONo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_sOSubLineKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_sOSubLineNo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_sOSysVersion" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_sOTDocType" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_sOVer" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_saleCostAC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_saleCostAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_saleCostFC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_saleCostTC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_saleOrFYTask" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_saleRtnMoney" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_seibanAlterable" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_seibanCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_settlementFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_ship" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.SM.Ship.ShipData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_shipAddresss" type="{http://www.UFIDA.org/EntityData}ArrayOfUFIDA.U9.SM.Ship.ShipAddressData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_shipAdjustPriceLogs" type="{http://www.UFIDA.org/EntityData}ArrayOfUFIDA.U9.SM.Ship.ShipAdjustPriceLogData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_shipConfirmDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_shipContacts" type="{http://www.UFIDA.org/EntityData}ArrayOfUFIDA.U9.SM.Ship.ShipContactData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_shipFees" type="{http://www.UFIDA.org/EntityData}ArrayOfUFIDA.U9.SM.Ship.ShipFeeData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_shipInstalmentTerms" type="{http://www.UFIDA.org/EntityData}ArrayOfUFIDA.U9.SM.Ship.ShipInstalmentTermData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_shipLineBalanceRoutes" type="{http://www.UFIDA.org/EntityData}ArrayOfUFIDA.U9.SM.Ship.ShipLineBalanceRouteData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_shipLineCosts" type="{http://www.UFIDA.org/EntityData}ArrayOfUFIDA.U9.SM.Ship.ShipLineCostData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_shipLineDiscounts" type="{http://www.UFIDA.org/EntityData}ArrayOfUFIDA.U9.SM.Ship.ShipLineDiscountData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_shipLineLocations" type="{http://www.UFIDA.org/EntityData}ArrayOfUFIDA.U9.SM.Ship.ShipLineLocationData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_shipLineSubItemExeInfo" type="{http://www.UFIDA.org/EntityData}ArrayOfUFIDA.U9.SM.Ship.ShipLineSubItemExeInfoData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_shipPlanDocNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_shipPlanID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_shipPlanLineDocLineNo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_shipPlanLineID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_shipPriceLog" type="{http://www.UFIDA.org/EntityData}ArrayOfUFIDA.U9.SM.Ship.ShipPriceLogData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_shipQtyCostAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_shipQtyInvAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_shipQtyTBUAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_shipQtyTUAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_shipTaxs" type="{http://www.UFIDA.org/EntityData}ArrayOfUFIDA.U9.SM.Ship.ShipTaxData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_shipToSite" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CBO.SCM.Customer.CustomerSiteMISCInfoData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_shipTogetherFlag" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_shippingQtyIU" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_signInDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_signInQtyOfProItem" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_signInTUPUConvRatio" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_signInTotalMoneyAC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_signInTotalMoneyFC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_signInTotalMoneyNoTax" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_signInTotalMoneyNoTaxFC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_signInTotalMoneyNoTaxTC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_signInTotalMoneyTC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_signInTotalTax" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_signInTotalTaxFC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_signInTotalTaxTC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_snCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_srcCooperateOrg" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_srcCooperateShipLine" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_srcCooperateType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_srcDocDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_srcDocKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_srcDocLineKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_srcDocLineNo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_srcDocNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_srcDocPriceTC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_srcDocSubLineKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_srcDocSubLineNo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_srcDocTransType" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_srcDocType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_srcDocVer" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_srcKitLineNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_srcRcv" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_srcRcvLine" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_srcRcvOrg" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_srcSysVersion" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_stateMachineID" type="{http://schemas.microsoft.com/2003/10/Serialization/}guid" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_status" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_stepBy" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_stickBrandCustomer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_stickBrandItemCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_stickBrandItemName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_storageType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_storeArk" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_subItemCostRate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_supplier" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CBO.SCM.Supplier.SupplierMISCInfoData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_sysVersion" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_systemPrice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_systemPriceTC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_tCToACExRate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_tUCUConvRatio" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_tUInvConvRatio" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_tUPUConvRatio" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_taskQtyIU" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_taxFreeNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_taxRate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_totalARMoney" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_totalARMoneyTC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_totalARQtyPriceAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_totalARQtyTBUAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_totalARQtyTUAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_totalAccountMoney" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_totalAccountMoneyTC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_totalAccountQtyPriceAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_totalAccountQtyTBUAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_totalAccountQtyTUAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_totalCAQtyPU" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_totalDiscount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_totalDiscountTC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_totalFee" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_totalFeeTC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_totalInvoiceMoney" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_totalInvoiceMoneyTC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_totalInvoiceQtyPriceAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_totalInvoiceQtyTBUAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_totalInvoiceQtyTUAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_totalMoney" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_totalMoneyFC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_totalMoneyTC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_totalNetMoney" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_totalNetMoneyFC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_totalNetMoneyTC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_totalPPMoney" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_totalRPMoney" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_totalRefillQtyIUAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_totalRefillQtyPriceAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_totalRefillQtyTBUAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_totalRefillQtyTUAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_totalRtnDeductMoney" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_totalRtnDeductMoneyTC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_totalRtnDeductQtyPriceAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_totalRtnDeductQtyTBUAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_totalRtnDeductQtyTUAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_totalRtnFillMoney" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_totalRtnFillMoneyTC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_totalRtnFillQtyPriceAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_totalRtnFillQtyTBUAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_totalRtnFillQtyTUAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_totalSignInQtyPU" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_totalTax" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_totalTaxFC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_totalTaxTC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_tradeMode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_tradeRatetoBase" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_tradeUom2ToTRadeUom2Associate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_unApproveDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_unApproveMan" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_vMI" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_volume" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_voucherID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_voucherNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_voucherTypeID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_weight" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UFIDA.U9.SM.Ship.ShipLineData", propOrder = {
    "ac",
    "acsKey",
    "accountOrg",
    "accountOrgSKey",
    "associatedParent",
    "associatedParentSKey",
    "balanceRoute",
    "balanceRouteSKey",
    "bomOwner",
    "bomOwnerSKey",
    "cc",
    "ccsKey",
    "carrier",
    "carrierSKey",
    "closePeriod",
    "closePeriodSKey",
    "compensationPBU",
    "compensationPBUSKey",
    "compensationPU",
    "compensationPUSKey",
    "confirmAccording",
    "confirmAccordingSKey",
    "confirmTerm",
    "confirmTermSKey",
    "contractOwnedOrg",
    "contractOwnedOrgSKey",
    "costBaseUom",
    "costBaseUomSKey",
    "costUom",
    "costUomSKey",
    "handleDept",
    "handleDeptSKey",
    "incomeConfirmTerm",
    "incomeConfirmTermSKey",
    "invBaseUom",
    "invBaseUomSKey",
    "invMainUOM",
    "invMainUOMSKey",
    "invUom",
    "invUomSKey",
    "invoiceAccording",
    "invoiceAccordingSKey",
    "kitItemManufacturer",
    "kitItemManufacturerSKey",
    "manufacturer",
    "manufacturerSKey",
    "maxARPeriod",
    "maxARPeriodSKey",
    "multiShipLineMemo",
    "multiSigner",
    "org",
    "orgSKey",
    "originalItemBaseUom",
    "originalItemBaseUomSKey",
    "originalItemUom",
    "originalItemUomSKey",
    "originalManufacturer",
    "originalManufacturerSKey",
    "preRecPolicy",
    "preRecPolicyLine",
    "preRecPolicyLineSKey",
    "preRecPolicySKey",
    "priceBaseUom",
    "priceBaseUomSKey",
    "priceUom",
    "priceUomSKey",
    "processMFC",
    "processMFCSKey",
    "processSubUOM",
    "processSubUOMSKey",
    "processUOM",
    "processUOMSKey",
    "project",
    "projectSKey",
    "receivableTerm",
    "receivableTermSKey",
    "soOwnedOrg",
    "soOwnedOrgSKey",
    "saleDept",
    "saleDeptSKey",
    "seiban",
    "seibanSKey",
    "seller",
    "sellerSKey",
    "shipLineMemo",
    "shipPlanOrg",
    "shipPlanOrgSKey",
    "shipSKey",
    "shipmentRule",
    "shipmentRuleSKey",
    "shipperOrg",
    "shipperOrgSKey",
    "signer",
    "srcDocOwnedOrg",
    "srcDocOwnedOrgSKey",
    "stageWH",
    "stageWHSKey",
    "task",
    "taskSKey",
    "taxSchedule",
    "taxScheduleSKey",
    "tradPath",
    "tradPathSKey",
    "tradeBaseUom",
    "tradeBaseUomSKey",
    "tradeUom",
    "tradeUom2",
    "tradeUom2Associate",
    "tradeUom2AssociateSKey",
    "tradeUom2SKey",
    "tradeUomSKey",
    "transMode",
    "transModeSKey",
    "volumeUom",
    "volumeUomSKey",
    "wh",
    "whsKey",
    "weightUom",
    "weightUomSKey",
    "whMan",
    "whManSKey",
    "maaiStatus",
    "macToCCExchRate",
    "macToCCExchRateType",
    "marBillKey",
    "marBillLineKey",
    "marBillLineNo",
    "marBillNo",
    "marMoney",
    "marMoneyFC",
    "marMoneyTC",
    "marQtyPriceAmount",
    "marQtyTBUAmount",
    "marQtyTUAmount",
    "mActivityType",
    "mAdjustPriceDate",
    "mAdjustPricePerson",
    "mApportionMoney",
    "mApportionMoneyTC",
    "mApportionPrice",
    "mApportionPriceTC",
    "mApproveDate",
    "mApproveMan",
    "mAssociatedParentID",
    "mAssociatedParentNO",
    "mBalanceRouteDesc",
    "mBillSetCode",
    "mBillToSite",
    "mBomID",
    "mcaAmountOfProItem",
    "mcaDate",
    "mcaPriceAC",
    "mcaPriceAmount",
    "mcaPriceFC",
    "mcaPriceTC",
    "mcatbuAmount",
    "mcatuAmount",
    "mcaTotalMoneyAC",
    "mcaTotalMoneyFC",
    "mcaTotalMoneyNoTaxAC",
    "mcaTotalMoneyNoTaxFC",
    "mcaTotalMoneyNoTaxTC",
    "mcaTotalMoneyTC",
    "mccMoney",
    "mCanInvoiceMoneyAC",
    "mCanInvoiceQtyPU",
    "mChannel",
    "mChargeBasis",
    "mCheckAccountBillLineNo",
    "mCheckAccountBillNo",
    "mCheckAccountTotalTax",
    "mCheckAccountTotalTaxFC",
    "mCheckAccountTotalTaxTC",
    "mCheckAccounter",
    "mCompensationPUQty",
    "mCompensationPUToPBURate",
    "mCompensationSUQty",
    "mConfigItem",
    "mConfigResult",
    "mConfirmDate",
    "mConfirmMode",
    "mConsumeRtnMnyUnit",
    "mContainer",
    "mContractDate",
    "mContractKey",
    "mContractLineKey",
    "mContractLineNo",
    "mContractNo",
    "mContractVer",
    "mCostRatetoBase",
    "mCreatedBy",
    "mCreatedOn",
    "mCreditObj",
    "mCusSignInQtyInvAmount",
    "mCusSignInQtyPriceAmount",
    "mCusSignInQtyTBUAmount",
    "mCusSignInQtyTUAmount",
    "mCustomerItemCode",
    "mCustomerItemName",
    "mDamageQtyIUAmount",
    "mDamageQtyOfProItem",
    "mDamageQtyPriceAmount",
    "mDamageQtyTBUAmount",
    "mDamageQtyTUAmount",
    "mDealMode",
    "mDemandCode",
    "mDescFlexField",
    "mDiscountRate",
    "mDocLineNo",
    "mDonationReason",
    "mDonationType",
    "mDrawbackBillKey",
    "mDrawbackBillLineKey",
    "mDrawbackBillLineNo",
    "mDrawbackBillNo",
    "mExecutedARMoney",
    "mExecutedARMoneyTC",
    "mExecutedARQtyPriceAmount",
    "mExecutedARQtyTBUAmount",
    "mExecutedARQtyTUAmount",
    "mfas",
    "mFillQtyPriceAmount",
    "mFillQtyTBUAmount",
    "mFillQtyTUAmount",
    "mFinallyPrice",
    "mFinallyPriceTC",
    "mFinanceCloseFlag",
    "mFutureCostAC",
    "mFutureCostFC",
    "mFutureCostTC",
    "mGoodsManagementType",
    "mid",
    "miuToIMU",
    "mIncomeConfirmRule",
    "mInnerSupersedeEnum",
    "mInvRatetoBase",
    "mIsARByPreShip",
    "mIsAllowReturn",
    "mIsAssociatedChild",
    "mIsChangeProcessQty",
    "mIsCloseSO",
    "mIsConfirmDateChangable",
    "mIsCreatedInflow",
    "mIsDemandCodeUnChangeable",
    "mIsExistAssociatedChild",
    "mIsFinishSignIn",
    "mIsGernerTBD",
    "mIsInnerShipment",
    "mIsInvoiceUpdate",
    "mIsItemVersionChangable",
    "mIsKit",
    "mIsMakeOutInvoice",
    "mIsManufacturerChangeable",
    "mIsMaturityDateChangable",
    "mIsModifyLot",
    "mIsModifyOperateOrg",
    "mIsModifyPU",
    "mIsModifyShipperOrg",
    "mIsModifyTBUToPBU",
    "mIsModifyTCToACExRate",
    "mIsModifyTU",
    "mIsNeedGenAAI",
    "mIsNoSOShipment",
    "mIsPP",
    "mIsPossessCredit",
    "mIsPreRecChangeable",
    "mIsPreRecPolicyChangeable",
    "mIsPreShipBeginning",
    "mIsPriceIncludeTax",
    "mIsPriceListModify",
    "mIsPrjUnChangeable",
    "mIsRP",
    "mIsRefill",
    "mIsSignedInByCP",
    "mIsTIByPreShip",
    "mIsTaskUnChangeable",
    "mIsVMIAAI",
    "mIsZeroCost",
    "mItemInfo",
    "mKitItemInfo",
    "mKitLineNo",
    "mlcMoney",
    "mLotInfo",
    "mLotInvalidationDate",
    "mMaturityDate",
    "mModifiedBy",
    "mModifiedOn",
    "mMotherSoShipLine",
    "mNetAccount",
    "mNetWeight",
    "mNotLcMoney",
    "mObjectNeedPreRecUse",
    "mObjectUsablePreRecUse",
    "mOrderPrice",
    "mOrderPriceTC",
    "mOriginalItem",
    "mOriginalItemAmount",
    "mOriginalItemBaseAmount",
    "mOriginalItemRatetoBase",
    "mParentShipLineID",
    "mParentShipLineNo",
    "mPayer",
    "mPayerSite",
    "mPerProcessQty",
    "mPiece",
    "mPlanQtyTBUAmount",
    "mPlanQtyTUAmount",
    "mPreMaturityDate",
    "mPreRecLackMoney",
    "mPreRecLackRate",
    "mPreRecListStr",
    "mPreRecMoney",
    "mPreRecObject",
    "mPreRecObjectUse",
    "mPreRecRate",
    "mPreRecUse",
    "mPrecisionACCC",
    "mPrecisionTCAC",
    "mPriceList",
    "mPriceListCode",
    "mPriceListName",
    "mPriceRatetoBase",
    "mPriceSource",
    "mProcedureNO",
    "mProcessItem",
    "mProcessQty",
    "mProcessRateToSub",
    "mQtyPriceAmount",
    "mQuantityType",
    "mrmrUseQtyTBUAmount",
    "mrmrUseQtyTUAmount",
    "mRcvDocNo",
    "mRcvID",
    "mRcvLineID",
    "mRcvLineNo",
    "mRcvOrg",
    "mRcvQryTime",
    "mRcvQty",
    "mRecBillLineKey",
    "mRecBillLineNO",
    "mReceivalCode",
    "mReceiveBillKey",
    "mReceiveBillNo",
    "mRefillUseQtyTBUAmount",
    "mRefillUseQtyTUAmount",
    "mRejectQtyIUAmount",
    "mRejectQtyOfProItem",
    "mRejectQtyPriceAmount",
    "mRejectQtyTBUAmount",
    "mRejectQtyTUAmount",
    "mRejectRcvUseQtyTBUAmount",
    "mRejectRcvUseQtyTUAmount",
    "mRejectReason",
    "mReserveQty",
    "msoDate",
    "msoKey",
    "msoKitLineNo",
    "msoLineKey",
    "msoLineNo",
    "msoNo",
    "msoSubLineKey",
    "msoSubLineNo",
    "msoSysVersion",
    "msotDocType",
    "msoVer",
    "mSaleCostAC",
    "mSaleCostAmount",
    "mSaleCostFC",
    "mSaleCostTC",
    "mSaleOrFYTask",
    "mSaleRtnMoney",
    "mSeibanAlterable",
    "mSeibanCode",
    "mSettlementFlag",
    "mShip",
    "mShipAddresss",
    "mShipAdjustPriceLogs",
    "mShipConfirmDate",
    "mShipContacts",
    "mShipFees",
    "mShipInstalmentTerms",
    "mShipLineBalanceRoutes",
    "mShipLineCosts",
    "mShipLineDiscounts",
    "mShipLineLocations",
    "mShipLineSubItemExeInfo",
    "mShipPlanDocNo",
    "mShipPlanID",
    "mShipPlanLineDocLineNo",
    "mShipPlanLineID",
    "mShipPriceLog",
    "mShipQtyCostAmount",
    "mShipQtyInvAmount",
    "mShipQtyTBUAmount",
    "mShipQtyTUAmount",
    "mShipTaxs",
    "mShipToSite",
    "mShipTogetherFlag",
    "mShippingQtyIU",
    "mSignInDate",
    "mSignInQtyOfProItem",
    "mSignInTUPUConvRatio",
    "mSignInTotalMoneyAC",
    "mSignInTotalMoneyFC",
    "mSignInTotalMoneyNoTax",
    "mSignInTotalMoneyNoTaxFC",
    "mSignInTotalMoneyNoTaxTC",
    "mSignInTotalMoneyTC",
    "mSignInTotalTax",
    "mSignInTotalTaxFC",
    "mSignInTotalTaxTC",
    "mSnCode",
    "mSrcCooperateOrg",
    "mSrcCooperateShipLine",
    "mSrcCooperateType",
    "mSrcDocDate",
    "mSrcDocKey",
    "mSrcDocLineKey",
    "mSrcDocLineNo",
    "mSrcDocNo",
    "mSrcDocPriceTC",
    "mSrcDocSubLineKey",
    "mSrcDocSubLineNo",
    "mSrcDocTransType",
    "mSrcDocType",
    "mSrcDocVer",
    "mSrcKitLineNo",
    "mSrcRcv",
    "mSrcRcvLine",
    "mSrcRcvOrg",
    "mSrcSysVersion",
    "mStateMachineID",
    "mStatus",
    "mStepBy",
    "mStickBrandCustomer",
    "mStickBrandItemCode",
    "mStickBrandItemName",
    "mStorageType",
    "mStoreArk",
    "mSubItemCostRate",
    "mSupplier",
    "mSysVersion",
    "mSystemPrice",
    "mSystemPriceTC",
    "mtcToACExRate",
    "mtucuConvRatio",
    "mtuInvConvRatio",
    "mtupuConvRatio",
    "mTaskQtyIU",
    "mTaxFreeNo",
    "mTaxRate",
    "mTotalARMoney",
    "mTotalARMoneyTC",
    "mTotalARQtyPriceAmount",
    "mTotalARQtyTBUAmount",
    "mTotalARQtyTUAmount",
    "mTotalAccountMoney",
    "mTotalAccountMoneyTC",
    "mTotalAccountQtyPriceAmount",
    "mTotalAccountQtyTBUAmount",
    "mTotalAccountQtyTUAmount",
    "mTotalCAQtyPU",
    "mTotalDiscount",
    "mTotalDiscountTC",
    "mTotalFee",
    "mTotalFeeTC",
    "mTotalInvoiceMoney",
    "mTotalInvoiceMoneyTC",
    "mTotalInvoiceQtyPriceAmount",
    "mTotalInvoiceQtyTBUAmount",
    "mTotalInvoiceQtyTUAmount",
    "mTotalMoney",
    "mTotalMoneyFC",
    "mTotalMoneyTC",
    "mTotalNetMoney",
    "mTotalNetMoneyFC",
    "mTotalNetMoneyTC",
    "mTotalPPMoney",
    "mTotalRPMoney",
    "mTotalRefillQtyIUAmount",
    "mTotalRefillQtyPriceAmount",
    "mTotalRefillQtyTBUAmount",
    "mTotalRefillQtyTUAmount",
    "mTotalRtnDeductMoney",
    "mTotalRtnDeductMoneyTC",
    "mTotalRtnDeductQtyPriceAmount",
    "mTotalRtnDeductQtyTBUAmount",
    "mTotalRtnDeductQtyTUAmount",
    "mTotalRtnFillMoney",
    "mTotalRtnFillMoneyTC",
    "mTotalRtnFillQtyPriceAmount",
    "mTotalRtnFillQtyTBUAmount",
    "mTotalRtnFillQtyTUAmount",
    "mTotalSignInQtyPU",
    "mTotalTax",
    "mTotalTaxFC",
    "mTotalTaxTC",
    "mTradeMode",
    "mTradeRatetoBase",
    "mTradeUom2ToTRadeUom2Associate",
    "mUnApproveDate",
    "mUnApproveMan",
    "mvmi",
    "mVolume",
    "mVoucherID",
    "mVoucherNO",
    "mVoucherTypeID",
    "mWeight"
})
public class UFIDAU9SMShipShipLineData
    extends UFSoftUBFBusinessDataTransObjectBase
{

    @XmlElement(name = "AC")
    protected Long ac;
    @XmlElementRef(name = "AC_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> acsKey;
    @XmlElement(name = "AccountOrg")
    protected Long accountOrg;
    @XmlElementRef(name = "AccountOrg_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> accountOrgSKey;
    @XmlElement(name = "AssociatedParent")
    protected Long associatedParent;
    @XmlElementRef(name = "AssociatedParent_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> associatedParentSKey;
    @XmlElement(name = "BalanceRoute")
    protected Long balanceRoute;
    @XmlElementRef(name = "BalanceRoute_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> balanceRouteSKey;
    @XmlElement(name = "BomOwner")
    protected Long bomOwner;
    @XmlElementRef(name = "BomOwner_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> bomOwnerSKey;
    @XmlElement(name = "CC")
    protected Long cc;
    @XmlElementRef(name = "CC_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> ccsKey;
    @XmlElement(name = "Carrier")
    protected Long carrier;
    @XmlElementRef(name = "Carrier_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> carrierSKey;
    @XmlElement(name = "ClosePeriod")
    protected Long closePeriod;
    @XmlElementRef(name = "ClosePeriod_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> closePeriodSKey;
    @XmlElement(name = "CompensationPBU")
    protected Long compensationPBU;
    @XmlElementRef(name = "CompensationPBU_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> compensationPBUSKey;
    @XmlElement(name = "CompensationPU")
    protected Long compensationPU;
    @XmlElementRef(name = "CompensationPU_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> compensationPUSKey;
    @XmlElement(name = "ConfirmAccording")
    protected Long confirmAccording;
    @XmlElementRef(name = "ConfirmAccording_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> confirmAccordingSKey;
    @XmlElement(name = "ConfirmTerm")
    protected Long confirmTerm;
    @XmlElementRef(name = "ConfirmTerm_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> confirmTermSKey;
    @XmlElement(name = "ContractOwnedOrg")
    protected Long contractOwnedOrg;
    @XmlElementRef(name = "ContractOwnedOrg_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> contractOwnedOrgSKey;
    @XmlElement(name = "CostBaseUom")
    protected Long costBaseUom;
    @XmlElementRef(name = "CostBaseUom_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> costBaseUomSKey;
    @XmlElement(name = "CostUom")
    protected Long costUom;
    @XmlElementRef(name = "CostUom_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> costUomSKey;
    @XmlElement(name = "HandleDept")
    protected Long handleDept;
    @XmlElementRef(name = "HandleDept_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> handleDeptSKey;
    @XmlElement(name = "IncomeConfirmTerm")
    protected Long incomeConfirmTerm;
    @XmlElementRef(name = "IncomeConfirmTerm_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> incomeConfirmTermSKey;
    @XmlElement(name = "InvBaseUom")
    protected Long invBaseUom;
    @XmlElementRef(name = "InvBaseUom_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> invBaseUomSKey;
    @XmlElement(name = "InvMainUOM")
    protected Long invMainUOM;
    @XmlElementRef(name = "InvMainUOM_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> invMainUOMSKey;
    @XmlElement(name = "InvUom")
    protected Long invUom;
    @XmlElementRef(name = "InvUom_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> invUomSKey;
    @XmlElement(name = "InvoiceAccording")
    protected Long invoiceAccording;
    @XmlElementRef(name = "InvoiceAccording_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> invoiceAccordingSKey;
    @XmlElement(name = "KitItemManufacturer")
    protected Long kitItemManufacturer;
    @XmlElementRef(name = "KitItemManufacturer_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> kitItemManufacturerSKey;
    @XmlElement(name = "Manufacturer")
    protected Long manufacturer;
    @XmlElementRef(name = "Manufacturer_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> manufacturerSKey;
    @XmlElement(name = "MaxARPeriod")
    protected Long maxARPeriod;
    @XmlElementRef(name = "MaxARPeriod_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> maxARPeriodSKey;
    @XmlElementRef(name = "Multi_ShipLineMemo", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<MultiLangDataDict> multiShipLineMemo;
    @XmlElementRef(name = "Multi_Signer", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<MultiLangDataDict> multiSigner;
    @XmlElement(name = "Org")
    protected Long org;
    @XmlElementRef(name = "Org_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> orgSKey;
    @XmlElement(name = "OriginalItemBaseUom")
    protected Long originalItemBaseUom;
    @XmlElementRef(name = "OriginalItemBaseUom_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> originalItemBaseUomSKey;
    @XmlElement(name = "OriginalItemUom")
    protected Long originalItemUom;
    @XmlElementRef(name = "OriginalItemUom_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> originalItemUomSKey;
    @XmlElement(name = "OriginalManufacturer")
    protected Long originalManufacturer;
    @XmlElementRef(name = "OriginalManufacturer_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> originalManufacturerSKey;
    @XmlElement(name = "PreRecPolicy")
    protected Long preRecPolicy;
    @XmlElement(name = "PreRecPolicyLine")
    protected Long preRecPolicyLine;
    @XmlElementRef(name = "PreRecPolicyLine_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> preRecPolicyLineSKey;
    @XmlElementRef(name = "PreRecPolicy_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> preRecPolicySKey;
    @XmlElement(name = "PriceBaseUom")
    protected Long priceBaseUom;
    @XmlElementRef(name = "PriceBaseUom_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> priceBaseUomSKey;
    @XmlElement(name = "PriceUom")
    protected Long priceUom;
    @XmlElementRef(name = "PriceUom_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> priceUomSKey;
    @XmlElement(name = "ProcessMFC")
    protected Long processMFC;
    @XmlElementRef(name = "ProcessMFC_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> processMFCSKey;
    @XmlElement(name = "ProcessSubUOM")
    protected Long processSubUOM;
    @XmlElementRef(name = "ProcessSubUOM_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> processSubUOMSKey;
    @XmlElement(name = "ProcessUOM")
    protected Long processUOM;
    @XmlElementRef(name = "ProcessUOM_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> processUOMSKey;
    @XmlElement(name = "Project")
    protected Long project;
    @XmlElementRef(name = "Project_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> projectSKey;
    @XmlElement(name = "ReceivableTerm")
    protected Long receivableTerm;
    @XmlElementRef(name = "ReceivableTerm_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> receivableTermSKey;
    @XmlElement(name = "SOOwnedOrg")
    protected Long soOwnedOrg;
    @XmlElementRef(name = "SOOwnedOrg_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> soOwnedOrgSKey;
    @XmlElement(name = "SaleDept")
    protected Long saleDept;
    @XmlElementRef(name = "SaleDept_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> saleDeptSKey;
    @XmlElement(name = "Seiban")
    protected Long seiban;
    @XmlElementRef(name = "Seiban_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> seibanSKey;
    @XmlElement(name = "Seller")
    protected Long seller;
    @XmlElementRef(name = "Seller_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> sellerSKey;
    @XmlElementRef(name = "ShipLineMemo", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> shipLineMemo;
    @XmlElement(name = "ShipPlanOrg")
    protected Long shipPlanOrg;
    @XmlElementRef(name = "ShipPlanOrg_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> shipPlanOrgSKey;
    @XmlElementRef(name = "Ship_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> shipSKey;
    @XmlElement(name = "ShipmentRule")
    protected Long shipmentRule;
    @XmlElementRef(name = "ShipmentRule_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> shipmentRuleSKey;
    @XmlElement(name = "ShipperOrg")
    protected Long shipperOrg;
    @XmlElementRef(name = "ShipperOrg_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> shipperOrgSKey;
    @XmlElementRef(name = "Signer", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> signer;
    @XmlElement(name = "SrcDocOwnedOrg")
    protected Long srcDocOwnedOrg;
    @XmlElementRef(name = "SrcDocOwnedOrg_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> srcDocOwnedOrgSKey;
    @XmlElement(name = "StageWH")
    protected Long stageWH;
    @XmlElementRef(name = "StageWH_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> stageWHSKey;
    @XmlElement(name = "Task")
    protected Long task;
    @XmlElementRef(name = "Task_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> taskSKey;
    @XmlElement(name = "TaxSchedule")
    protected Long taxSchedule;
    @XmlElementRef(name = "TaxSchedule_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> taxScheduleSKey;
    @XmlElement(name = "TradPath")
    protected Long tradPath;
    @XmlElementRef(name = "TradPath_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> tradPathSKey;
    @XmlElement(name = "TradeBaseUom")
    protected Long tradeBaseUom;
    @XmlElementRef(name = "TradeBaseUom_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> tradeBaseUomSKey;
    @XmlElement(name = "TradeUom")
    protected Long tradeUom;
    @XmlElement(name = "TradeUom2")
    protected Long tradeUom2;
    @XmlElement(name = "TradeUom2Associate")
    protected Long tradeUom2Associate;
    @XmlElementRef(name = "TradeUom2Associate_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> tradeUom2AssociateSKey;
    @XmlElementRef(name = "TradeUom2_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> tradeUom2SKey;
    @XmlElementRef(name = "TradeUom_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> tradeUomSKey;
    @XmlElement(name = "TransMode")
    protected Long transMode;
    @XmlElementRef(name = "TransMode_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> transModeSKey;
    @XmlElement(name = "VolumeUom")
    protected Long volumeUom;
    @XmlElementRef(name = "VolumeUom_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> volumeUomSKey;
    @XmlElement(name = "WH")
    protected Long wh;
    @XmlElementRef(name = "WH_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> whsKey;
    @XmlElement(name = "WeightUom")
    protected Long weightUom;
    @XmlElementRef(name = "WeightUom_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> weightUomSKey;
    @XmlElement(name = "WhMan")
    protected Long whMan;
    @XmlElementRef(name = "WhMan_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> whManSKey;
    @XmlElement(name = "m_aAIStatus")
    protected Integer maaiStatus;
    @XmlElement(name = "m_aCToCCExchRate")
    protected BigDecimal macToCCExchRate;
    @XmlElement(name = "m_aCToCCExchRateType")
    protected Integer macToCCExchRateType;
    @XmlElement(name = "m_aRBillKey")
    protected Long marBillKey;
    @XmlElement(name = "m_aRBillLineKey")
    protected Long marBillLineKey;
    @XmlElement(name = "m_aRBillLineNo")
    protected Integer marBillLineNo;
    @XmlElementRef(name = "m_aRBillNo", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> marBillNo;
    @XmlElement(name = "m_aRMoney")
    protected BigDecimal marMoney;
    @XmlElement(name = "m_aRMoneyFC")
    protected BigDecimal marMoneyFC;
    @XmlElement(name = "m_aRMoneyTC")
    protected BigDecimal marMoneyTC;
    @XmlElement(name = "m_aRQtyPriceAmount")
    protected BigDecimal marQtyPriceAmount;
    @XmlElement(name = "m_aRQtyTBUAmount")
    protected BigDecimal marQtyTBUAmount;
    @XmlElement(name = "m_aRQtyTUAmount")
    protected BigDecimal marQtyTUAmount;
    @XmlElement(name = "m_activityType")
    protected Integer mActivityType;
    @XmlElement(name = "m_adjustPriceDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mAdjustPriceDate;
    @XmlElementRef(name = "m_adjustPricePerson", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mAdjustPricePerson;
    @XmlElement(name = "m_apportionMoney")
    protected BigDecimal mApportionMoney;
    @XmlElement(name = "m_apportionMoneyTC")
    protected BigDecimal mApportionMoneyTC;
    @XmlElement(name = "m_apportionPrice")
    protected BigDecimal mApportionPrice;
    @XmlElement(name = "m_apportionPriceTC")
    protected BigDecimal mApportionPriceTC;
    @XmlElement(name = "m_approveDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mApproveDate;
    @XmlElementRef(name = "m_approveMan", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mApproveMan;
    @XmlElement(name = "m_associatedParentID")
    protected Long mAssociatedParentID;
    @XmlElement(name = "m_associatedParentNO")
    protected Integer mAssociatedParentNO;
    @XmlElementRef(name = "m_balanceRouteDesc", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mBalanceRouteDesc;
    @XmlElementRef(name = "m_billSetCode", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mBillSetCode;
    @XmlElementRef(name = "m_billToSite", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9CBOSCMCustomerCustomerSiteMISCInfoData> mBillToSite;
    @XmlElement(name = "m_bomID")
    protected Long mBomID;
    @XmlElement(name = "m_cAAmountOfProItem")
    protected BigDecimal mcaAmountOfProItem;
    @XmlElement(name = "m_cADate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mcaDate;
    @XmlElement(name = "m_cAPriceAC")
    protected BigDecimal mcaPriceAC;
    @XmlElement(name = "m_cAPriceAmount")
    protected BigDecimal mcaPriceAmount;
    @XmlElement(name = "m_cAPriceFC")
    protected BigDecimal mcaPriceFC;
    @XmlElement(name = "m_cAPriceTC")
    protected BigDecimal mcaPriceTC;
    @XmlElement(name = "m_cATBUAmount")
    protected BigDecimal mcatbuAmount;
    @XmlElement(name = "m_cATUAmount")
    protected BigDecimal mcatuAmount;
    @XmlElement(name = "m_cATotalMoneyAC")
    protected BigDecimal mcaTotalMoneyAC;
    @XmlElement(name = "m_cATotalMoneyFC")
    protected BigDecimal mcaTotalMoneyFC;
    @XmlElement(name = "m_cATotalMoneyNoTaxAC")
    protected BigDecimal mcaTotalMoneyNoTaxAC;
    @XmlElement(name = "m_cATotalMoneyNoTaxFC")
    protected BigDecimal mcaTotalMoneyNoTaxFC;
    @XmlElement(name = "m_cATotalMoneyNoTaxTC")
    protected BigDecimal mcaTotalMoneyNoTaxTC;
    @XmlElement(name = "m_cATotalMoneyTC")
    protected BigDecimal mcaTotalMoneyTC;
    @XmlElement(name = "m_cCMoney")
    protected BigDecimal mccMoney;
    @XmlElement(name = "m_canInvoiceMoneyAC")
    protected BigDecimal mCanInvoiceMoneyAC;
    @XmlElement(name = "m_canInvoiceQtyPU")
    protected BigDecimal mCanInvoiceQtyPU;
    @XmlElementRef(name = "m_channel", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mChannel;
    @XmlElement(name = "m_chargeBasis")
    protected Integer mChargeBasis;
    @XmlElement(name = "m_checkAccountBillLineNo")
    protected Integer mCheckAccountBillLineNo;
    @XmlElementRef(name = "m_checkAccountBillNo", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mCheckAccountBillNo;
    @XmlElement(name = "m_checkAccountTotalTax")
    protected BigDecimal mCheckAccountTotalTax;
    @XmlElement(name = "m_checkAccountTotalTaxFC")
    protected BigDecimal mCheckAccountTotalTaxFC;
    @XmlElement(name = "m_checkAccountTotalTaxTC")
    protected BigDecimal mCheckAccountTotalTaxTC;
    @XmlElementRef(name = "m_checkAccounter", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mCheckAccounter;
    @XmlElement(name = "m_compensationPUQty")
    protected BigDecimal mCompensationPUQty;
    @XmlElement(name = "m_compensationPUToPBURate")
    protected BigDecimal mCompensationPUToPBURate;
    @XmlElement(name = "m_compensationSUQty")
    protected BigDecimal mCompensationSUQty;
    @XmlElementRef(name = "m_configItem", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9CBOSCMItemItemInfoData> mConfigItem;
    @XmlElement(name = "m_configResult")
    protected Long mConfigResult;
    @XmlElement(name = "m_confirmDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mConfirmDate;
    @XmlElement(name = "m_confirmMode")
    protected Integer mConfirmMode;
    @XmlElement(name = "m_consumeRtnMnyUnit")
    protected BigDecimal mConsumeRtnMnyUnit;
    @XmlElementRef(name = "m_container", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mContainer;
    @XmlElement(name = "m_contractDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mContractDate;
    @XmlElement(name = "m_contractKey")
    protected Long mContractKey;
    @XmlElement(name = "m_contractLineKey")
    protected Long mContractLineKey;
    @XmlElement(name = "m_contractLineNo")
    protected Integer mContractLineNo;
    @XmlElementRef(name = "m_contractNo", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mContractNo;
    @XmlElement(name = "m_contractVer")
    protected Integer mContractVer;
    @XmlElement(name = "m_costRatetoBase")
    protected BigDecimal mCostRatetoBase;
    @XmlElementRef(name = "m_createdBy", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mCreatedBy;
    @XmlElement(name = "m_createdOn")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mCreatedOn;
    @XmlElementRef(name = "m_creditObj", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9CBOSCMCustomerCustomerSiteMISCInfoData> mCreditObj;
    @XmlElement(name = "m_cusSignInQtyInvAmount")
    protected BigDecimal mCusSignInQtyInvAmount;
    @XmlElement(name = "m_cusSignInQtyPriceAmount")
    protected BigDecimal mCusSignInQtyPriceAmount;
    @XmlElement(name = "m_cusSignInQtyTBUAmount")
    protected BigDecimal mCusSignInQtyTBUAmount;
    @XmlElement(name = "m_cusSignInQtyTUAmount")
    protected BigDecimal mCusSignInQtyTUAmount;
    @XmlElementRef(name = "m_customerItemCode", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mCustomerItemCode;
    @XmlElementRef(name = "m_customerItemName", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mCustomerItemName;
    @XmlElement(name = "m_damageQtyIUAmount")
    protected BigDecimal mDamageQtyIUAmount;
    @XmlElement(name = "m_damageQtyOfProItem")
    protected BigDecimal mDamageQtyOfProItem;
    @XmlElement(name = "m_damageQtyPriceAmount")
    protected BigDecimal mDamageQtyPriceAmount;
    @XmlElement(name = "m_damageQtyTBUAmount")
    protected BigDecimal mDamageQtyTBUAmount;
    @XmlElement(name = "m_damageQtyTUAmount")
    protected BigDecimal mDamageQtyTUAmount;
    @XmlElement(name = "m_dealMode")
    protected Integer mDealMode;
    @XmlElement(name = "m_demandCode")
    protected Integer mDemandCode;
    @XmlElementRef(name = "m_descFlexField", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9BaseFlexFieldDescFlexFieldDescFlexSegmentsData> mDescFlexField;
    @XmlElement(name = "m_discountRate")
    protected BigDecimal mDiscountRate;
    @XmlElement(name = "m_docLineNo")
    protected Integer mDocLineNo;
    @XmlElement(name = "m_donationReason")
    protected Integer mDonationReason;
    @XmlElement(name = "m_donationType")
    protected Integer mDonationType;
    @XmlElement(name = "m_drawbackBillKey")
    protected Long mDrawbackBillKey;
    @XmlElement(name = "m_drawbackBillLineKey")
    protected Long mDrawbackBillLineKey;
    @XmlElement(name = "m_drawbackBillLineNo")
    protected Integer mDrawbackBillLineNo;
    @XmlElementRef(name = "m_drawbackBillNo", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mDrawbackBillNo;
    @XmlElement(name = "m_executedARMoney")
    protected BigDecimal mExecutedARMoney;
    @XmlElement(name = "m_executedARMoneyTC")
    protected BigDecimal mExecutedARMoneyTC;
    @XmlElement(name = "m_executedARQtyPriceAmount")
    protected BigDecimal mExecutedARQtyPriceAmount;
    @XmlElement(name = "m_executedARQtyTBUAmount")
    protected BigDecimal mExecutedARQtyTBUAmount;
    @XmlElement(name = "m_executedARQtyTUAmount")
    protected BigDecimal mExecutedARQtyTUAmount;
    @XmlElementRef(name = "m_fAS", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9CBOSCMItemItemInfoData> mfas;
    @XmlElement(name = "m_fillQtyPriceAmount")
    protected BigDecimal mFillQtyPriceAmount;
    @XmlElement(name = "m_fillQtyTBUAmount")
    protected BigDecimal mFillQtyTBUAmount;
    @XmlElement(name = "m_fillQtyTUAmount")
    protected BigDecimal mFillQtyTUAmount;
    @XmlElement(name = "m_finallyPrice")
    protected BigDecimal mFinallyPrice;
    @XmlElement(name = "m_finallyPriceTC")
    protected BigDecimal mFinallyPriceTC;
    @XmlElement(name = "m_financeCloseFlag")
    protected Boolean mFinanceCloseFlag;
    @XmlElement(name = "m_futureCostAC")
    protected BigDecimal mFutureCostAC;
    @XmlElement(name = "m_futureCostFC")
    protected BigDecimal mFutureCostFC;
    @XmlElement(name = "m_futureCostTC")
    protected BigDecimal mFutureCostTC;
    @XmlElement(name = "m_goodsManagementType")
    protected Integer mGoodsManagementType;
    @XmlElement(name = "m_iD")
    protected Long mid;
    @XmlElement(name = "m_iUToIMU")
    protected BigDecimal miuToIMU;
    @XmlElement(name = "m_incomeConfirmRule")
    protected Integer mIncomeConfirmRule;
    @XmlElement(name = "m_innerSupersedeEnum")
    protected Integer mInnerSupersedeEnum;
    @XmlElement(name = "m_invRatetoBase")
    protected BigDecimal mInvRatetoBase;
    @XmlElement(name = "m_isARByPreShip")
    protected Boolean mIsARByPreShip;
    @XmlElement(name = "m_isAllowReturn")
    protected Boolean mIsAllowReturn;
    @XmlElement(name = "m_isAssociatedChild")
    protected Boolean mIsAssociatedChild;
    @XmlElement(name = "m_isChangeProcessQty")
    protected Boolean mIsChangeProcessQty;
    @XmlElement(name = "m_isCloseSO")
    protected Boolean mIsCloseSO;
    @XmlElement(name = "m_isConfirmDateChangable")
    protected Boolean mIsConfirmDateChangable;
    @XmlElement(name = "m_isCreatedInflow")
    protected Boolean mIsCreatedInflow;
    @XmlElement(name = "m_isDemandCodeUnChangeable")
    protected Boolean mIsDemandCodeUnChangeable;
    @XmlElement(name = "m_isExistAssociatedChild")
    protected Boolean mIsExistAssociatedChild;
    @XmlElement(name = "m_isFinishSignIn")
    protected Boolean mIsFinishSignIn;
    @XmlElement(name = "m_isGernerTBD")
    protected Boolean mIsGernerTBD;
    @XmlElement(name = "m_isInnerShipment")
    protected Boolean mIsInnerShipment;
    @XmlElement(name = "m_isInvoiceUpdate")
    protected Boolean mIsInvoiceUpdate;
    @XmlElement(name = "m_isItemVersionChangable")
    protected Boolean mIsItemVersionChangable;
    @XmlElement(name = "m_isKit")
    protected Boolean mIsKit;
    @XmlElement(name = "m_isMakeOutInvoice")
    protected Boolean mIsMakeOutInvoice;
    @XmlElement(name = "m_isManufacturerChangeable")
    protected Boolean mIsManufacturerChangeable;
    @XmlElement(name = "m_isMaturityDateChangable")
    protected Boolean mIsMaturityDateChangable;
    @XmlElement(name = "m_isModifyLot")
    protected Boolean mIsModifyLot;
    @XmlElement(name = "m_isModifyOperateOrg")
    protected Boolean mIsModifyOperateOrg;
    @XmlElement(name = "m_isModifyPU")
    protected Boolean mIsModifyPU;
    @XmlElement(name = "m_isModifyShipperOrg")
    protected Boolean mIsModifyShipperOrg;
    @XmlElement(name = "m_isModifyTBUToPBU")
    protected Boolean mIsModifyTBUToPBU;
    @XmlElement(name = "m_isModifyTCToACExRate")
    protected Boolean mIsModifyTCToACExRate;
    @XmlElement(name = "m_isModifyTU")
    protected Boolean mIsModifyTU;
    @XmlElement(name = "m_isNeedGenAAI")
    protected Boolean mIsNeedGenAAI;
    @XmlElement(name = "m_isNoSOShipment")
    protected Boolean mIsNoSOShipment;
    @XmlElement(name = "m_isPP")
    protected Boolean mIsPP;
    @XmlElement(name = "m_isPossessCredit")
    protected Boolean mIsPossessCredit;
    @XmlElement(name = "m_isPreRecChangeable")
    protected Boolean mIsPreRecChangeable;
    @XmlElement(name = "m_isPreRecPolicyChangeable")
    protected Boolean mIsPreRecPolicyChangeable;
    @XmlElement(name = "m_isPreShipBeginning")
    protected Boolean mIsPreShipBeginning;
    @XmlElement(name = "m_isPriceIncludeTax")
    protected Boolean mIsPriceIncludeTax;
    @XmlElement(name = "m_isPriceListModify")
    protected Boolean mIsPriceListModify;
    @XmlElement(name = "m_isPrjUnChangeable")
    protected Boolean mIsPrjUnChangeable;
    @XmlElement(name = "m_isRP")
    protected Boolean mIsRP;
    @XmlElement(name = "m_isRefill")
    protected Boolean mIsRefill;
    @XmlElement(name = "m_isSignedInByCP")
    protected Boolean mIsSignedInByCP;
    @XmlElement(name = "m_isTIByPreShip")
    protected Boolean mIsTIByPreShip;
    @XmlElement(name = "m_isTaskUnChangeable")
    protected Boolean mIsTaskUnChangeable;
    @XmlElement(name = "m_isVMIAAI")
    protected Boolean mIsVMIAAI;
    @XmlElement(name = "m_isZeroCost")
    protected Boolean mIsZeroCost;
    @XmlElementRef(name = "m_itemInfo", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9CBOSCMItemItemInfoData> mItemInfo;
    @XmlElementRef(name = "m_kitItemInfo", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9CBOSCMItemItemInfoData> mKitItemInfo;
    @XmlElementRef(name = "m_kitLineNo", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mKitLineNo;
    @XmlElement(name = "m_lCMoney")
    protected BigDecimal mlcMoney;
    @XmlElementRef(name = "m_lotInfo", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9LotLotMasterInfoData> mLotInfo;
    @XmlElement(name = "m_lotInvalidationDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mLotInvalidationDate;
    @XmlElement(name = "m_maturityDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mMaturityDate;
    @XmlElementRef(name = "m_modifiedBy", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mModifiedBy;
    @XmlElement(name = "m_modifiedOn")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mModifiedOn;
    @XmlElement(name = "m_motherSoShipLine")
    protected Long mMotherSoShipLine;
    @XmlElement(name = "m_netAccount")
    protected Boolean mNetAccount;
    @XmlElement(name = "m_netWeight")
    protected BigDecimal mNetWeight;
    @XmlElement(name = "m_notLcMoney")
    protected BigDecimal mNotLcMoney;
    @XmlElement(name = "m_objectNeedPreRecUse")
    protected BigDecimal mObjectNeedPreRecUse;
    @XmlElement(name = "m_objectUsablePreRecUse")
    protected BigDecimal mObjectUsablePreRecUse;
    @XmlElement(name = "m_orderPrice")
    protected BigDecimal mOrderPrice;
    @XmlElement(name = "m_orderPriceTC")
    protected BigDecimal mOrderPriceTC;
    @XmlElementRef(name = "m_originalItem", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9CBOSCMItemItemInfoData> mOriginalItem;
    @XmlElement(name = "m_originalItemAmount")
    protected BigDecimal mOriginalItemAmount;
    @XmlElement(name = "m_originalItemBaseAmount")
    protected BigDecimal mOriginalItemBaseAmount;
    @XmlElement(name = "m_originalItemRatetoBase")
    protected BigDecimal mOriginalItemRatetoBase;
    @XmlElement(name = "m_parentShipLineID")
    protected Long mParentShipLineID;
    @XmlElement(name = "m_parentShipLineNo")
    protected Integer mParentShipLineNo;
    @XmlElementRef(name = "m_payer", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9CBOSCMCustomerCustomerMISCInfoData> mPayer;
    @XmlElementRef(name = "m_payerSite", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9CBOSCMCustomerCustomerSiteMISCInfoData> mPayerSite;
    @XmlElement(name = "m_perProcessQty")
    protected BigDecimal mPerProcessQty;
    @XmlElement(name = "m_piece")
    protected BigDecimal mPiece;
    @XmlElement(name = "m_planQtyTBUAmount")
    protected BigDecimal mPlanQtyTBUAmount;
    @XmlElement(name = "m_planQtyTUAmount")
    protected BigDecimal mPlanQtyTUAmount;
    @XmlElement(name = "m_preMaturityDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mPreMaturityDate;
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
    @XmlElement(name = "m_precisionACCC")
    protected Integer mPrecisionACCC;
    @XmlElement(name = "m_precisionTCAC")
    protected Integer mPrecisionTCAC;
    @XmlElement(name = "m_priceList")
    protected Long mPriceList;
    @XmlElementRef(name = "m_priceListCode", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mPriceListCode;
    @XmlElementRef(name = "m_priceListName", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mPriceListName;
    @XmlElement(name = "m_priceRatetoBase")
    protected BigDecimal mPriceRatetoBase;
    @XmlElement(name = "m_priceSource")
    protected Integer mPriceSource;
    @XmlElementRef(name = "m_procedureNO", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mProcedureNO;
    @XmlElementRef(name = "m_processItem", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9CBOSCMItemItemInfoData> mProcessItem;
    @XmlElement(name = "m_processQty")
    protected BigDecimal mProcessQty;
    @XmlElement(name = "m_processRateToSub")
    protected BigDecimal mProcessRateToSub;
    @XmlElement(name = "m_qtyPriceAmount")
    protected BigDecimal mQtyPriceAmount;
    @XmlElement(name = "m_quantityType")
    protected Integer mQuantityType;
    @XmlElement(name = "m_rMRUseQtyTBUAmount")
    protected BigDecimal mrmrUseQtyTBUAmount;
    @XmlElement(name = "m_rMRUseQtyTUAmount")
    protected BigDecimal mrmrUseQtyTUAmount;
    @XmlElementRef(name = "m_rcvDocNo", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mRcvDocNo;
    @XmlElement(name = "m_rcvID")
    protected Long mRcvID;
    @XmlElement(name = "m_rcvLineID")
    protected Long mRcvLineID;
    @XmlElement(name = "m_rcvLineNo")
    protected Integer mRcvLineNo;
    @XmlElement(name = "m_rcvOrg")
    protected Long mRcvOrg;
    @XmlElement(name = "m_rcvQryTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mRcvQryTime;
    @XmlElement(name = "m_rcvQty")
    protected BigDecimal mRcvQty;
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
    @XmlElement(name = "m_refillUseQtyTBUAmount")
    protected BigDecimal mRefillUseQtyTBUAmount;
    @XmlElement(name = "m_refillUseQtyTUAmount")
    protected BigDecimal mRefillUseQtyTUAmount;
    @XmlElement(name = "m_rejectQtyIUAmount")
    protected BigDecimal mRejectQtyIUAmount;
    @XmlElement(name = "m_rejectQtyOfProItem")
    protected BigDecimal mRejectQtyOfProItem;
    @XmlElement(name = "m_rejectQtyPriceAmount")
    protected BigDecimal mRejectQtyPriceAmount;
    @XmlElement(name = "m_rejectQtyTBUAmount")
    protected BigDecimal mRejectQtyTBUAmount;
    @XmlElement(name = "m_rejectQtyTUAmount")
    protected BigDecimal mRejectQtyTUAmount;
    @XmlElement(name = "m_rejectRcvUseQtyTBUAmount")
    protected BigDecimal mRejectRcvUseQtyTBUAmount;
    @XmlElement(name = "m_rejectRcvUseQtyTUAmount")
    protected BigDecimal mRejectRcvUseQtyTUAmount;
    @XmlElement(name = "m_rejectReason")
    protected Integer mRejectReason;
    @XmlElement(name = "m_reserveQty")
    protected BigDecimal mReserveQty;
    @XmlElement(name = "m_sODate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar msoDate;
    @XmlElement(name = "m_sOKey")
    protected Long msoKey;
    @XmlElementRef(name = "m_sOKitLineNo", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> msoKitLineNo;
    @XmlElement(name = "m_sOLineKey")
    protected Long msoLineKey;
    @XmlElement(name = "m_sOLineNo")
    protected Integer msoLineNo;
    @XmlElementRef(name = "m_sONo", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> msoNo;
    @XmlElement(name = "m_sOSubLineKey")
    protected Long msoSubLineKey;
    @XmlElement(name = "m_sOSubLineNo")
    protected Integer msoSubLineNo;
    @XmlElement(name = "m_sOSysVersion")
    protected Long msoSysVersion;
    @XmlElement(name = "m_sOTDocType")
    protected Long msotDocType;
    @XmlElement(name = "m_sOVer")
    protected Integer msoVer;
    @XmlElement(name = "m_saleCostAC")
    protected BigDecimal mSaleCostAC;
    @XmlElement(name = "m_saleCostAmount")
    protected BigDecimal mSaleCostAmount;
    @XmlElement(name = "m_saleCostFC")
    protected BigDecimal mSaleCostFC;
    @XmlElement(name = "m_saleCostTC")
    protected BigDecimal mSaleCostTC;
    @XmlElement(name = "m_saleOrFYTask")
    protected Long mSaleOrFYTask;
    @XmlElement(name = "m_saleRtnMoney")
    protected BigDecimal mSaleRtnMoney;
    @XmlElement(name = "m_seibanAlterable")
    protected Integer mSeibanAlterable;
    @XmlElementRef(name = "m_seibanCode", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mSeibanCode;
    @XmlElement(name = "m_settlementFlag")
    protected Boolean mSettlementFlag;
    @XmlElementRef(name = "m_ship", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9SMShipShipData> mShip;
    @XmlElementRef(name = "m_shipAddresss", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfUFIDAU9SMShipShipAddressData> mShipAddresss;
    @XmlElementRef(name = "m_shipAdjustPriceLogs", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfUFIDAU9SMShipShipAdjustPriceLogData> mShipAdjustPriceLogs;
    @XmlElement(name = "m_shipConfirmDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mShipConfirmDate;
    @XmlElementRef(name = "m_shipContacts", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfUFIDAU9SMShipShipContactData> mShipContacts;
    @XmlElementRef(name = "m_shipFees", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfUFIDAU9SMShipShipFeeData> mShipFees;
    @XmlElementRef(name = "m_shipInstalmentTerms", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfUFIDAU9SMShipShipInstalmentTermData> mShipInstalmentTerms;
    @XmlElementRef(name = "m_shipLineBalanceRoutes", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfUFIDAU9SMShipShipLineBalanceRouteData> mShipLineBalanceRoutes;
    @XmlElementRef(name = "m_shipLineCosts", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfUFIDAU9SMShipShipLineCostData> mShipLineCosts;
    @XmlElementRef(name = "m_shipLineDiscounts", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfUFIDAU9SMShipShipLineDiscountData> mShipLineDiscounts;
    @XmlElementRef(name = "m_shipLineLocations", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfUFIDAU9SMShipShipLineLocationData> mShipLineLocations;
    @XmlElementRef(name = "m_shipLineSubItemExeInfo", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfUFIDAU9SMShipShipLineSubItemExeInfoData> mShipLineSubItemExeInfo;
    @XmlElementRef(name = "m_shipPlanDocNo", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mShipPlanDocNo;
    @XmlElement(name = "m_shipPlanID")
    protected Long mShipPlanID;
    @XmlElement(name = "m_shipPlanLineDocLineNo")
    protected Integer mShipPlanLineDocLineNo;
    @XmlElement(name = "m_shipPlanLineID")
    protected Long mShipPlanLineID;
    @XmlElementRef(name = "m_shipPriceLog", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfUFIDAU9SMShipShipPriceLogData> mShipPriceLog;
    @XmlElement(name = "m_shipQtyCostAmount")
    protected BigDecimal mShipQtyCostAmount;
    @XmlElement(name = "m_shipQtyInvAmount")
    protected BigDecimal mShipQtyInvAmount;
    @XmlElement(name = "m_shipQtyTBUAmount")
    protected BigDecimal mShipQtyTBUAmount;
    @XmlElement(name = "m_shipQtyTUAmount")
    protected BigDecimal mShipQtyTUAmount;
    @XmlElementRef(name = "m_shipTaxs", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfUFIDAU9SMShipShipTaxData> mShipTaxs;
    @XmlElementRef(name = "m_shipToSite", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9CBOSCMCustomerCustomerSiteMISCInfoData> mShipToSite;
    @XmlElement(name = "m_shipTogetherFlag")
    protected Integer mShipTogetherFlag;
    @XmlElement(name = "m_shippingQtyIU")
    protected BigDecimal mShippingQtyIU;
    @XmlElement(name = "m_signInDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mSignInDate;
    @XmlElement(name = "m_signInQtyOfProItem")
    protected BigDecimal mSignInQtyOfProItem;
    @XmlElement(name = "m_signInTUPUConvRatio")
    protected BigDecimal mSignInTUPUConvRatio;
    @XmlElement(name = "m_signInTotalMoneyAC")
    protected BigDecimal mSignInTotalMoneyAC;
    @XmlElement(name = "m_signInTotalMoneyFC")
    protected BigDecimal mSignInTotalMoneyFC;
    @XmlElement(name = "m_signInTotalMoneyNoTax")
    protected BigDecimal mSignInTotalMoneyNoTax;
    @XmlElement(name = "m_signInTotalMoneyNoTaxFC")
    protected BigDecimal mSignInTotalMoneyNoTaxFC;
    @XmlElement(name = "m_signInTotalMoneyNoTaxTC")
    protected BigDecimal mSignInTotalMoneyNoTaxTC;
    @XmlElement(name = "m_signInTotalMoneyTC")
    protected BigDecimal mSignInTotalMoneyTC;
    @XmlElement(name = "m_signInTotalTax")
    protected BigDecimal mSignInTotalTax;
    @XmlElement(name = "m_signInTotalTaxFC")
    protected BigDecimal mSignInTotalTaxFC;
    @XmlElement(name = "m_signInTotalTaxTC")
    protected BigDecimal mSignInTotalTaxTC;
    @XmlElementRef(name = "m_snCode", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mSnCode;
    @XmlElement(name = "m_srcCooperateOrg")
    protected Long mSrcCooperateOrg;
    @XmlElement(name = "m_srcCooperateShipLine")
    protected Long mSrcCooperateShipLine;
    @XmlElement(name = "m_srcCooperateType")
    protected Integer mSrcCooperateType;
    @XmlElement(name = "m_srcDocDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mSrcDocDate;
    @XmlElement(name = "m_srcDocKey")
    protected Long mSrcDocKey;
    @XmlElement(name = "m_srcDocLineKey")
    protected Long mSrcDocLineKey;
    @XmlElement(name = "m_srcDocLineNo")
    protected Integer mSrcDocLineNo;
    @XmlElementRef(name = "m_srcDocNo", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mSrcDocNo;
    @XmlElement(name = "m_srcDocPriceTC")
    protected BigDecimal mSrcDocPriceTC;
    @XmlElement(name = "m_srcDocSubLineKey")
    protected Long mSrcDocSubLineKey;
    @XmlElement(name = "m_srcDocSubLineNo")
    protected Integer mSrcDocSubLineNo;
    @XmlElement(name = "m_srcDocTransType")
    protected Long mSrcDocTransType;
    @XmlElement(name = "m_srcDocType")
    protected Integer mSrcDocType;
    @XmlElement(name = "m_srcDocVer")
    protected Integer mSrcDocVer;
    @XmlElementRef(name = "m_srcKitLineNo", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mSrcKitLineNo;
    @XmlElement(name = "m_srcRcv")
    protected Long mSrcRcv;
    @XmlElement(name = "m_srcRcvLine")
    protected Long mSrcRcvLine;
    @XmlElement(name = "m_srcRcvOrg")
    protected Long mSrcRcvOrg;
    @XmlElement(name = "m_srcSysVersion")
    protected Long mSrcSysVersion;
    @XmlElement(name = "m_stateMachineID")
    protected String mStateMachineID;
    @XmlElement(name = "m_status")
    protected Integer mStatus;
    @XmlElement(name = "m_stepBy")
    protected Integer mStepBy;
    @XmlElementRef(name = "m_stickBrandCustomer", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mStickBrandCustomer;
    @XmlElementRef(name = "m_stickBrandItemCode", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mStickBrandItemCode;
    @XmlElementRef(name = "m_stickBrandItemName", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mStickBrandItemName;
    @XmlElement(name = "m_storageType")
    protected Integer mStorageType;
    @XmlElement(name = "m_storeArk")
    protected BigDecimal mStoreArk;
    @XmlElement(name = "m_subItemCostRate")
    protected BigDecimal mSubItemCostRate;
    @XmlElementRef(name = "m_supplier", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9CBOSCMSupplierSupplierMISCInfoData> mSupplier;
    @XmlElement(name = "m_sysVersion")
    protected Long mSysVersion;
    @XmlElement(name = "m_systemPrice")
    protected BigDecimal mSystemPrice;
    @XmlElement(name = "m_systemPriceTC")
    protected BigDecimal mSystemPriceTC;
    @XmlElement(name = "m_tCToACExRate")
    protected BigDecimal mtcToACExRate;
    @XmlElement(name = "m_tUCUConvRatio")
    protected BigDecimal mtucuConvRatio;
    @XmlElement(name = "m_tUInvConvRatio")
    protected BigDecimal mtuInvConvRatio;
    @XmlElement(name = "m_tUPUConvRatio")
    protected BigDecimal mtupuConvRatio;
    @XmlElement(name = "m_taskQtyIU")
    protected BigDecimal mTaskQtyIU;
    @XmlElementRef(name = "m_taxFreeNo", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mTaxFreeNo;
    @XmlElement(name = "m_taxRate")
    protected BigDecimal mTaxRate;
    @XmlElement(name = "m_totalARMoney")
    protected BigDecimal mTotalARMoney;
    @XmlElement(name = "m_totalARMoneyTC")
    protected BigDecimal mTotalARMoneyTC;
    @XmlElement(name = "m_totalARQtyPriceAmount")
    protected BigDecimal mTotalARQtyPriceAmount;
    @XmlElement(name = "m_totalARQtyTBUAmount")
    protected BigDecimal mTotalARQtyTBUAmount;
    @XmlElement(name = "m_totalARQtyTUAmount")
    protected BigDecimal mTotalARQtyTUAmount;
    @XmlElement(name = "m_totalAccountMoney")
    protected BigDecimal mTotalAccountMoney;
    @XmlElement(name = "m_totalAccountMoneyTC")
    protected BigDecimal mTotalAccountMoneyTC;
    @XmlElement(name = "m_totalAccountQtyPriceAmount")
    protected BigDecimal mTotalAccountQtyPriceAmount;
    @XmlElement(name = "m_totalAccountQtyTBUAmount")
    protected BigDecimal mTotalAccountQtyTBUAmount;
    @XmlElement(name = "m_totalAccountQtyTUAmount")
    protected BigDecimal mTotalAccountQtyTUAmount;
    @XmlElement(name = "m_totalCAQtyPU")
    protected BigDecimal mTotalCAQtyPU;
    @XmlElement(name = "m_totalDiscount")
    protected BigDecimal mTotalDiscount;
    @XmlElement(name = "m_totalDiscountTC")
    protected BigDecimal mTotalDiscountTC;
    @XmlElement(name = "m_totalFee")
    protected BigDecimal mTotalFee;
    @XmlElement(name = "m_totalFeeTC")
    protected BigDecimal mTotalFeeTC;
    @XmlElement(name = "m_totalInvoiceMoney")
    protected BigDecimal mTotalInvoiceMoney;
    @XmlElement(name = "m_totalInvoiceMoneyTC")
    protected BigDecimal mTotalInvoiceMoneyTC;
    @XmlElement(name = "m_totalInvoiceQtyPriceAmount")
    protected BigDecimal mTotalInvoiceQtyPriceAmount;
    @XmlElement(name = "m_totalInvoiceQtyTBUAmount")
    protected BigDecimal mTotalInvoiceQtyTBUAmount;
    @XmlElement(name = "m_totalInvoiceQtyTUAmount")
    protected BigDecimal mTotalInvoiceQtyTUAmount;
    @XmlElement(name = "m_totalMoney")
    protected BigDecimal mTotalMoney;
    @XmlElement(name = "m_totalMoneyFC")
    protected BigDecimal mTotalMoneyFC;
    @XmlElement(name = "m_totalMoneyTC")
    protected BigDecimal mTotalMoneyTC;
    @XmlElement(name = "m_totalNetMoney")
    protected BigDecimal mTotalNetMoney;
    @XmlElement(name = "m_totalNetMoneyFC")
    protected BigDecimal mTotalNetMoneyFC;
    @XmlElement(name = "m_totalNetMoneyTC")
    protected BigDecimal mTotalNetMoneyTC;
    @XmlElement(name = "m_totalPPMoney")
    protected BigDecimal mTotalPPMoney;
    @XmlElement(name = "m_totalRPMoney")
    protected BigDecimal mTotalRPMoney;
    @XmlElement(name = "m_totalRefillQtyIUAmount")
    protected BigDecimal mTotalRefillQtyIUAmount;
    @XmlElement(name = "m_totalRefillQtyPriceAmount")
    protected BigDecimal mTotalRefillQtyPriceAmount;
    @XmlElement(name = "m_totalRefillQtyTBUAmount")
    protected BigDecimal mTotalRefillQtyTBUAmount;
    @XmlElement(name = "m_totalRefillQtyTUAmount")
    protected BigDecimal mTotalRefillQtyTUAmount;
    @XmlElement(name = "m_totalRtnDeductMoney")
    protected BigDecimal mTotalRtnDeductMoney;
    @XmlElement(name = "m_totalRtnDeductMoneyTC")
    protected BigDecimal mTotalRtnDeductMoneyTC;
    @XmlElement(name = "m_totalRtnDeductQtyPriceAmount")
    protected BigDecimal mTotalRtnDeductQtyPriceAmount;
    @XmlElement(name = "m_totalRtnDeductQtyTBUAmount")
    protected BigDecimal mTotalRtnDeductQtyTBUAmount;
    @XmlElement(name = "m_totalRtnDeductQtyTUAmount")
    protected BigDecimal mTotalRtnDeductQtyTUAmount;
    @XmlElement(name = "m_totalRtnFillMoney")
    protected BigDecimal mTotalRtnFillMoney;
    @XmlElement(name = "m_totalRtnFillMoneyTC")
    protected BigDecimal mTotalRtnFillMoneyTC;
    @XmlElement(name = "m_totalRtnFillQtyPriceAmount")
    protected BigDecimal mTotalRtnFillQtyPriceAmount;
    @XmlElement(name = "m_totalRtnFillQtyTBUAmount")
    protected BigDecimal mTotalRtnFillQtyTBUAmount;
    @XmlElement(name = "m_totalRtnFillQtyTUAmount")
    protected BigDecimal mTotalRtnFillQtyTUAmount;
    @XmlElement(name = "m_totalSignInQtyPU")
    protected BigDecimal mTotalSignInQtyPU;
    @XmlElement(name = "m_totalTax")
    protected BigDecimal mTotalTax;
    @XmlElement(name = "m_totalTaxFC")
    protected BigDecimal mTotalTaxFC;
    @XmlElement(name = "m_totalTaxTC")
    protected BigDecimal mTotalTaxTC;
    @XmlElement(name = "m_tradeMode")
    protected Integer mTradeMode;
    @XmlElement(name = "m_tradeRatetoBase")
    protected BigDecimal mTradeRatetoBase;
    @XmlElement(name = "m_tradeUom2ToTRadeUom2Associate")
    protected BigDecimal mTradeUom2ToTRadeUom2Associate;
    @XmlElement(name = "m_unApproveDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mUnApproveDate;
    @XmlElementRef(name = "m_unApproveMan", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mUnApproveMan;
    @XmlElement(name = "m_vMI")
    protected Boolean mvmi;
    @XmlElement(name = "m_volume")
    protected BigDecimal mVolume;
    @XmlElement(name = "m_voucherID")
    protected Long mVoucherID;
    @XmlElementRef(name = "m_voucherNO", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mVoucherNO;
    @XmlElement(name = "m_voucherTypeID")
    protected Long mVoucherTypeID;
    @XmlElement(name = "m_weight")
    protected BigDecimal mWeight;

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
     * 获取associatedParent属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAssociatedParent() {
        return associatedParent;
    }

    /**
     * 设置associatedParent属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAssociatedParent(Long value) {
        this.associatedParent = value;
    }

    /**
     * 获取associatedParentSKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getAssociatedParentSKey() {
        return associatedParentSKey;
    }

    /**
     * 设置associatedParentSKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setAssociatedParentSKey(JAXBElement<EntityKey> value) {
        this.associatedParentSKey = value;
    }

    /**
     * 获取balanceRoute属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getBalanceRoute() {
        return balanceRoute;
    }

    /**
     * 设置balanceRoute属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setBalanceRoute(Long value) {
        this.balanceRoute = value;
    }

    /**
     * 获取balanceRouteSKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getBalanceRouteSKey() {
        return balanceRouteSKey;
    }

    /**
     * 设置balanceRouteSKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setBalanceRouteSKey(JAXBElement<EntityKey> value) {
        this.balanceRouteSKey = value;
    }

    /**
     * 获取bomOwner属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getBomOwner() {
        return bomOwner;
    }

    /**
     * 设置bomOwner属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setBomOwner(Long value) {
        this.bomOwner = value;
    }

    /**
     * 获取bomOwnerSKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getBomOwnerSKey() {
        return bomOwnerSKey;
    }

    /**
     * 设置bomOwnerSKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setBomOwnerSKey(JAXBElement<EntityKey> value) {
        this.bomOwnerSKey = value;
    }

    /**
     * 获取cc属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCC() {
        return cc;
    }

    /**
     * 设置cc属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCC(Long value) {
        this.cc = value;
    }

    /**
     * 获取ccsKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getCCSKey() {
        return ccsKey;
    }

    /**
     * 设置ccsKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setCCSKey(JAXBElement<EntityKey> value) {
        this.ccsKey = value;
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
     * 获取closePeriod属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getClosePeriod() {
        return closePeriod;
    }

    /**
     * 设置closePeriod属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setClosePeriod(Long value) {
        this.closePeriod = value;
    }

    /**
     * 获取closePeriodSKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getClosePeriodSKey() {
        return closePeriodSKey;
    }

    /**
     * 设置closePeriodSKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setClosePeriodSKey(JAXBElement<EntityKey> value) {
        this.closePeriodSKey = value;
    }

    /**
     * 获取compensationPBU属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCompensationPBU() {
        return compensationPBU;
    }

    /**
     * 设置compensationPBU属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCompensationPBU(Long value) {
        this.compensationPBU = value;
    }

    /**
     * 获取compensationPBUSKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getCompensationPBUSKey() {
        return compensationPBUSKey;
    }

    /**
     * 设置compensationPBUSKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setCompensationPBUSKey(JAXBElement<EntityKey> value) {
        this.compensationPBUSKey = value;
    }

    /**
     * 获取compensationPU属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCompensationPU() {
        return compensationPU;
    }

    /**
     * 设置compensationPU属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCompensationPU(Long value) {
        this.compensationPU = value;
    }

    /**
     * 获取compensationPUSKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getCompensationPUSKey() {
        return compensationPUSKey;
    }

    /**
     * 设置compensationPUSKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setCompensationPUSKey(JAXBElement<EntityKey> value) {
        this.compensationPUSKey = value;
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
     * 获取contractOwnedOrg属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getContractOwnedOrg() {
        return contractOwnedOrg;
    }

    /**
     * 设置contractOwnedOrg属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setContractOwnedOrg(Long value) {
        this.contractOwnedOrg = value;
    }

    /**
     * 获取contractOwnedOrgSKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getContractOwnedOrgSKey() {
        return contractOwnedOrgSKey;
    }

    /**
     * 设置contractOwnedOrgSKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setContractOwnedOrgSKey(JAXBElement<EntityKey> value) {
        this.contractOwnedOrgSKey = value;
    }

    /**
     * 获取costBaseUom属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCostBaseUom() {
        return costBaseUom;
    }

    /**
     * 设置costBaseUom属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCostBaseUom(Long value) {
        this.costBaseUom = value;
    }

    /**
     * 获取costBaseUomSKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getCostBaseUomSKey() {
        return costBaseUomSKey;
    }

    /**
     * 设置costBaseUomSKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setCostBaseUomSKey(JAXBElement<EntityKey> value) {
        this.costBaseUomSKey = value;
    }

    /**
     * 获取costUom属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCostUom() {
        return costUom;
    }

    /**
     * 设置costUom属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCostUom(Long value) {
        this.costUom = value;
    }

    /**
     * 获取costUomSKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getCostUomSKey() {
        return costUomSKey;
    }

    /**
     * 设置costUomSKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setCostUomSKey(JAXBElement<EntityKey> value) {
        this.costUomSKey = value;
    }

    /**
     * 获取handleDept属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getHandleDept() {
        return handleDept;
    }

    /**
     * 设置handleDept属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setHandleDept(Long value) {
        this.handleDept = value;
    }

    /**
     * 获取handleDeptSKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getHandleDeptSKey() {
        return handleDeptSKey;
    }

    /**
     * 设置handleDeptSKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setHandleDeptSKey(JAXBElement<EntityKey> value) {
        this.handleDeptSKey = value;
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
     * 获取invBaseUom属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getInvBaseUom() {
        return invBaseUom;
    }

    /**
     * 设置invBaseUom属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setInvBaseUom(Long value) {
        this.invBaseUom = value;
    }

    /**
     * 获取invBaseUomSKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getInvBaseUomSKey() {
        return invBaseUomSKey;
    }

    /**
     * 设置invBaseUomSKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setInvBaseUomSKey(JAXBElement<EntityKey> value) {
        this.invBaseUomSKey = value;
    }

    /**
     * 获取invMainUOM属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getInvMainUOM() {
        return invMainUOM;
    }

    /**
     * 设置invMainUOM属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setInvMainUOM(Long value) {
        this.invMainUOM = value;
    }

    /**
     * 获取invMainUOMSKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getInvMainUOMSKey() {
        return invMainUOMSKey;
    }

    /**
     * 设置invMainUOMSKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setInvMainUOMSKey(JAXBElement<EntityKey> value) {
        this.invMainUOMSKey = value;
    }

    /**
     * 获取invUom属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getInvUom() {
        return invUom;
    }

    /**
     * 设置invUom属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setInvUom(Long value) {
        this.invUom = value;
    }

    /**
     * 获取invUomSKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getInvUomSKey() {
        return invUomSKey;
    }

    /**
     * 设置invUomSKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setInvUomSKey(JAXBElement<EntityKey> value) {
        this.invUomSKey = value;
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
     * 获取kitItemManufacturer属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getKitItemManufacturer() {
        return kitItemManufacturer;
    }

    /**
     * 设置kitItemManufacturer属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setKitItemManufacturer(Long value) {
        this.kitItemManufacturer = value;
    }

    /**
     * 获取kitItemManufacturerSKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getKitItemManufacturerSKey() {
        return kitItemManufacturerSKey;
    }

    /**
     * 设置kitItemManufacturerSKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setKitItemManufacturerSKey(JAXBElement<EntityKey> value) {
        this.kitItemManufacturerSKey = value;
    }

    /**
     * 获取manufacturer属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getManufacturer() {
        return manufacturer;
    }

    /**
     * 设置manufacturer属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setManufacturer(Long value) {
        this.manufacturer = value;
    }

    /**
     * 获取manufacturerSKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getManufacturerSKey() {
        return manufacturerSKey;
    }

    /**
     * 设置manufacturerSKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setManufacturerSKey(JAXBElement<EntityKey> value) {
        this.manufacturerSKey = value;
    }

    /**
     * 获取maxARPeriod属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMaxARPeriod() {
        return maxARPeriod;
    }

    /**
     * 设置maxARPeriod属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMaxARPeriod(Long value) {
        this.maxARPeriod = value;
    }

    /**
     * 获取maxARPeriodSKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getMaxARPeriodSKey() {
        return maxARPeriodSKey;
    }

    /**
     * 设置maxARPeriodSKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setMaxARPeriodSKey(JAXBElement<EntityKey> value) {
        this.maxARPeriodSKey = value;
    }

    /**
     * 获取multiShipLineMemo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MultiLangDataDict }{@code >}
     *     
     */
    public JAXBElement<MultiLangDataDict> getMultiShipLineMemo() {
        return multiShipLineMemo;
    }

    /**
     * 设置multiShipLineMemo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MultiLangDataDict }{@code >}
     *     
     */
    public void setMultiShipLineMemo(JAXBElement<MultiLangDataDict> value) {
        this.multiShipLineMemo = value;
    }

    /**
     * 获取multiSigner属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MultiLangDataDict }{@code >}
     *     
     */
    public JAXBElement<MultiLangDataDict> getMultiSigner() {
        return multiSigner;
    }

    /**
     * 设置multiSigner属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MultiLangDataDict }{@code >}
     *     
     */
    public void setMultiSigner(JAXBElement<MultiLangDataDict> value) {
        this.multiSigner = value;
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
     * 获取originalItemBaseUom属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOriginalItemBaseUom() {
        return originalItemBaseUom;
    }

    /**
     * 设置originalItemBaseUom属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOriginalItemBaseUom(Long value) {
        this.originalItemBaseUom = value;
    }

    /**
     * 获取originalItemBaseUomSKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getOriginalItemBaseUomSKey() {
        return originalItemBaseUomSKey;
    }

    /**
     * 设置originalItemBaseUomSKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setOriginalItemBaseUomSKey(JAXBElement<EntityKey> value) {
        this.originalItemBaseUomSKey = value;
    }

    /**
     * 获取originalItemUom属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOriginalItemUom() {
        return originalItemUom;
    }

    /**
     * 设置originalItemUom属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOriginalItemUom(Long value) {
        this.originalItemUom = value;
    }

    /**
     * 获取originalItemUomSKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getOriginalItemUomSKey() {
        return originalItemUomSKey;
    }

    /**
     * 设置originalItemUomSKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setOriginalItemUomSKey(JAXBElement<EntityKey> value) {
        this.originalItemUomSKey = value;
    }

    /**
     * 获取originalManufacturer属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOriginalManufacturer() {
        return originalManufacturer;
    }

    /**
     * 设置originalManufacturer属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOriginalManufacturer(Long value) {
        this.originalManufacturer = value;
    }

    /**
     * 获取originalManufacturerSKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getOriginalManufacturerSKey() {
        return originalManufacturerSKey;
    }

    /**
     * 设置originalManufacturerSKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setOriginalManufacturerSKey(JAXBElement<EntityKey> value) {
        this.originalManufacturerSKey = value;
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
     * 获取priceBaseUom属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPriceBaseUom() {
        return priceBaseUom;
    }

    /**
     * 设置priceBaseUom属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPriceBaseUom(Long value) {
        this.priceBaseUom = value;
    }

    /**
     * 获取priceBaseUomSKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getPriceBaseUomSKey() {
        return priceBaseUomSKey;
    }

    /**
     * 设置priceBaseUomSKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setPriceBaseUomSKey(JAXBElement<EntityKey> value) {
        this.priceBaseUomSKey = value;
    }

    /**
     * 获取priceUom属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPriceUom() {
        return priceUom;
    }

    /**
     * 设置priceUom属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPriceUom(Long value) {
        this.priceUom = value;
    }

    /**
     * 获取priceUomSKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getPriceUomSKey() {
        return priceUomSKey;
    }

    /**
     * 设置priceUomSKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setPriceUomSKey(JAXBElement<EntityKey> value) {
        this.priceUomSKey = value;
    }

    /**
     * 获取processMFC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getProcessMFC() {
        return processMFC;
    }

    /**
     * 设置processMFC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setProcessMFC(Long value) {
        this.processMFC = value;
    }

    /**
     * 获取processMFCSKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getProcessMFCSKey() {
        return processMFCSKey;
    }

    /**
     * 设置processMFCSKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setProcessMFCSKey(JAXBElement<EntityKey> value) {
        this.processMFCSKey = value;
    }

    /**
     * 获取processSubUOM属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getProcessSubUOM() {
        return processSubUOM;
    }

    /**
     * 设置processSubUOM属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setProcessSubUOM(Long value) {
        this.processSubUOM = value;
    }

    /**
     * 获取processSubUOMSKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getProcessSubUOMSKey() {
        return processSubUOMSKey;
    }

    /**
     * 设置processSubUOMSKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setProcessSubUOMSKey(JAXBElement<EntityKey> value) {
        this.processSubUOMSKey = value;
    }

    /**
     * 获取processUOM属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getProcessUOM() {
        return processUOM;
    }

    /**
     * 设置processUOM属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setProcessUOM(Long value) {
        this.processUOM = value;
    }

    /**
     * 获取processUOMSKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getProcessUOMSKey() {
        return processUOMSKey;
    }

    /**
     * 设置processUOMSKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setProcessUOMSKey(JAXBElement<EntityKey> value) {
        this.processUOMSKey = value;
    }

    /**
     * 获取project属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getProject() {
        return project;
    }

    /**
     * 设置project属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setProject(Long value) {
        this.project = value;
    }

    /**
     * 获取projectSKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getProjectSKey() {
        return projectSKey;
    }

    /**
     * 设置projectSKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setProjectSKey(JAXBElement<EntityKey> value) {
        this.projectSKey = value;
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
     * 获取soOwnedOrg属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSOOwnedOrg() {
        return soOwnedOrg;
    }

    /**
     * 设置soOwnedOrg属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSOOwnedOrg(Long value) {
        this.soOwnedOrg = value;
    }

    /**
     * 获取soOwnedOrgSKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getSOOwnedOrgSKey() {
        return soOwnedOrgSKey;
    }

    /**
     * 设置soOwnedOrgSKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setSOOwnedOrgSKey(JAXBElement<EntityKey> value) {
        this.soOwnedOrgSKey = value;
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
     * 获取seiban属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSeiban() {
        return seiban;
    }

    /**
     * 设置seiban属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSeiban(Long value) {
        this.seiban = value;
    }

    /**
     * 获取seibanSKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getSeibanSKey() {
        return seibanSKey;
    }

    /**
     * 设置seibanSKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setSeibanSKey(JAXBElement<EntityKey> value) {
        this.seibanSKey = value;
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
     * 获取shipLineMemo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getShipLineMemo() {
        return shipLineMemo;
    }

    /**
     * 设置shipLineMemo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setShipLineMemo(JAXBElement<String> value) {
        this.shipLineMemo = value;
    }

    /**
     * 获取shipPlanOrg属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getShipPlanOrg() {
        return shipPlanOrg;
    }

    /**
     * 设置shipPlanOrg属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setShipPlanOrg(Long value) {
        this.shipPlanOrg = value;
    }

    /**
     * 获取shipPlanOrgSKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getShipPlanOrgSKey() {
        return shipPlanOrgSKey;
    }

    /**
     * 设置shipPlanOrgSKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setShipPlanOrgSKey(JAXBElement<EntityKey> value) {
        this.shipPlanOrgSKey = value;
    }

    /**
     * 获取shipSKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getShipSKey() {
        return shipSKey;
    }

    /**
     * 设置shipSKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setShipSKey(JAXBElement<EntityKey> value) {
        this.shipSKey = value;
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
     * 获取shipperOrg属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getShipperOrg() {
        return shipperOrg;
    }

    /**
     * 设置shipperOrg属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setShipperOrg(Long value) {
        this.shipperOrg = value;
    }

    /**
     * 获取shipperOrgSKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getShipperOrgSKey() {
        return shipperOrgSKey;
    }

    /**
     * 设置shipperOrgSKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setShipperOrgSKey(JAXBElement<EntityKey> value) {
        this.shipperOrgSKey = value;
    }

    /**
     * 获取signer属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSigner() {
        return signer;
    }

    /**
     * 设置signer属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSigner(JAXBElement<String> value) {
        this.signer = value;
    }

    /**
     * 获取srcDocOwnedOrg属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSrcDocOwnedOrg() {
        return srcDocOwnedOrg;
    }

    /**
     * 设置srcDocOwnedOrg属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSrcDocOwnedOrg(Long value) {
        this.srcDocOwnedOrg = value;
    }

    /**
     * 获取srcDocOwnedOrgSKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getSrcDocOwnedOrgSKey() {
        return srcDocOwnedOrgSKey;
    }

    /**
     * 设置srcDocOwnedOrgSKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setSrcDocOwnedOrgSKey(JAXBElement<EntityKey> value) {
        this.srcDocOwnedOrgSKey = value;
    }

    /**
     * 获取stageWH属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getStageWH() {
        return stageWH;
    }

    /**
     * 设置stageWH属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setStageWH(Long value) {
        this.stageWH = value;
    }

    /**
     * 获取stageWHSKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getStageWHSKey() {
        return stageWHSKey;
    }

    /**
     * 设置stageWHSKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setStageWHSKey(JAXBElement<EntityKey> value) {
        this.stageWHSKey = value;
    }

    /**
     * 获取task属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTask() {
        return task;
    }

    /**
     * 设置task属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTask(Long value) {
        this.task = value;
    }

    /**
     * 获取taskSKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getTaskSKey() {
        return taskSKey;
    }

    /**
     * 设置taskSKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setTaskSKey(JAXBElement<EntityKey> value) {
        this.taskSKey = value;
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
     * 获取tradPath属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTradPath() {
        return tradPath;
    }

    /**
     * 设置tradPath属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTradPath(Long value) {
        this.tradPath = value;
    }

    /**
     * 获取tradPathSKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getTradPathSKey() {
        return tradPathSKey;
    }

    /**
     * 设置tradPathSKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setTradPathSKey(JAXBElement<EntityKey> value) {
        this.tradPathSKey = value;
    }

    /**
     * 获取tradeBaseUom属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTradeBaseUom() {
        return tradeBaseUom;
    }

    /**
     * 设置tradeBaseUom属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTradeBaseUom(Long value) {
        this.tradeBaseUom = value;
    }

    /**
     * 获取tradeBaseUomSKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getTradeBaseUomSKey() {
        return tradeBaseUomSKey;
    }

    /**
     * 设置tradeBaseUomSKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setTradeBaseUomSKey(JAXBElement<EntityKey> value) {
        this.tradeBaseUomSKey = value;
    }

    /**
     * 获取tradeUom属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTradeUom() {
        return tradeUom;
    }

    /**
     * 设置tradeUom属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTradeUom(Long value) {
        this.tradeUom = value;
    }

    /**
     * 获取tradeUom2属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTradeUom2() {
        return tradeUom2;
    }

    /**
     * 设置tradeUom2属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTradeUom2(Long value) {
        this.tradeUom2 = value;
    }

    /**
     * 获取tradeUom2Associate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTradeUom2Associate() {
        return tradeUom2Associate;
    }

    /**
     * 设置tradeUom2Associate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTradeUom2Associate(Long value) {
        this.tradeUom2Associate = value;
    }

    /**
     * 获取tradeUom2AssociateSKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getTradeUom2AssociateSKey() {
        return tradeUom2AssociateSKey;
    }

    /**
     * 设置tradeUom2AssociateSKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setTradeUom2AssociateSKey(JAXBElement<EntityKey> value) {
        this.tradeUom2AssociateSKey = value;
    }

    /**
     * 获取tradeUom2SKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getTradeUom2SKey() {
        return tradeUom2SKey;
    }

    /**
     * 设置tradeUom2SKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setTradeUom2SKey(JAXBElement<EntityKey> value) {
        this.tradeUom2SKey = value;
    }

    /**
     * 获取tradeUomSKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getTradeUomSKey() {
        return tradeUomSKey;
    }

    /**
     * 设置tradeUomSKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setTradeUomSKey(JAXBElement<EntityKey> value) {
        this.tradeUomSKey = value;
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
     * 获取volumeUom属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getVolumeUom() {
        return volumeUom;
    }

    /**
     * 设置volumeUom属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setVolumeUom(Long value) {
        this.volumeUom = value;
    }

    /**
     * 获取volumeUomSKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getVolumeUomSKey() {
        return volumeUomSKey;
    }

    /**
     * 设置volumeUomSKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setVolumeUomSKey(JAXBElement<EntityKey> value) {
        this.volumeUomSKey = value;
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
     * 获取weightUom属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getWeightUom() {
        return weightUom;
    }

    /**
     * 设置weightUom属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setWeightUom(Long value) {
        this.weightUom = value;
    }

    /**
     * 获取weightUomSKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getWeightUomSKey() {
        return weightUomSKey;
    }

    /**
     * 设置weightUomSKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setWeightUomSKey(JAXBElement<EntityKey> value) {
        this.weightUomSKey = value;
    }

    /**
     * 获取whMan属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getWhMan() {
        return whMan;
    }

    /**
     * 设置whMan属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setWhMan(Long value) {
        this.whMan = value;
    }

    /**
     * 获取whManSKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getWhManSKey() {
        return whManSKey;
    }

    /**
     * 设置whManSKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setWhManSKey(JAXBElement<EntityKey> value) {
        this.whManSKey = value;
    }

    /**
     * 获取maaiStatus属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMAAIStatus() {
        return maaiStatus;
    }

    /**
     * 设置maaiStatus属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMAAIStatus(Integer value) {
        this.maaiStatus = value;
    }

    /**
     * 获取macToCCExchRate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMACToCCExchRate() {
        return macToCCExchRate;
    }

    /**
     * 设置macToCCExchRate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMACToCCExchRate(BigDecimal value) {
        this.macToCCExchRate = value;
    }

    /**
     * 获取macToCCExchRateType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMACToCCExchRateType() {
        return macToCCExchRateType;
    }

    /**
     * 设置macToCCExchRateType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMACToCCExchRateType(Integer value) {
        this.macToCCExchRateType = value;
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
     * 获取marMoney属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMARMoney() {
        return marMoney;
    }

    /**
     * 设置marMoney属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMARMoney(BigDecimal value) {
        this.marMoney = value;
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
     * 获取marQtyPriceAmount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMARQtyPriceAmount() {
        return marQtyPriceAmount;
    }

    /**
     * 设置marQtyPriceAmount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMARQtyPriceAmount(BigDecimal value) {
        this.marQtyPriceAmount = value;
    }

    /**
     * 获取marQtyTBUAmount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMARQtyTBUAmount() {
        return marQtyTBUAmount;
    }

    /**
     * 设置marQtyTBUAmount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMARQtyTBUAmount(BigDecimal value) {
        this.marQtyTBUAmount = value;
    }

    /**
     * 获取marQtyTUAmount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMARQtyTUAmount() {
        return marQtyTUAmount;
    }

    /**
     * 设置marQtyTUAmount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMARQtyTUAmount(BigDecimal value) {
        this.marQtyTUAmount = value;
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
     * 获取mAdjustPriceDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMAdjustPriceDate() {
        return mAdjustPriceDate;
    }

    /**
     * 设置mAdjustPriceDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMAdjustPriceDate(XMLGregorianCalendar value) {
        this.mAdjustPriceDate = value;
    }

    /**
     * 获取mAdjustPricePerson属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMAdjustPricePerson() {
        return mAdjustPricePerson;
    }

    /**
     * 设置mAdjustPricePerson属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMAdjustPricePerson(JAXBElement<String> value) {
        this.mAdjustPricePerson = value;
    }

    /**
     * 获取mApportionMoney属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMApportionMoney() {
        return mApportionMoney;
    }

    /**
     * 设置mApportionMoney属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMApportionMoney(BigDecimal value) {
        this.mApportionMoney = value;
    }

    /**
     * 获取mApportionMoneyTC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMApportionMoneyTC() {
        return mApportionMoneyTC;
    }

    /**
     * 设置mApportionMoneyTC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMApportionMoneyTC(BigDecimal value) {
        this.mApportionMoneyTC = value;
    }

    /**
     * 获取mApportionPrice属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMApportionPrice() {
        return mApportionPrice;
    }

    /**
     * 设置mApportionPrice属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMApportionPrice(BigDecimal value) {
        this.mApportionPrice = value;
    }

    /**
     * 获取mApportionPriceTC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMApportionPriceTC() {
        return mApportionPriceTC;
    }

    /**
     * 设置mApportionPriceTC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMApportionPriceTC(BigDecimal value) {
        this.mApportionPriceTC = value;
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
     * 获取mAssociatedParentID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMAssociatedParentID() {
        return mAssociatedParentID;
    }

    /**
     * 设置mAssociatedParentID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMAssociatedParentID(Long value) {
        this.mAssociatedParentID = value;
    }

    /**
     * 获取mAssociatedParentNO属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMAssociatedParentNO() {
        return mAssociatedParentNO;
    }

    /**
     * 设置mAssociatedParentNO属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMAssociatedParentNO(Integer value) {
        this.mAssociatedParentNO = value;
    }

    /**
     * 获取mBalanceRouteDesc属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMBalanceRouteDesc() {
        return mBalanceRouteDesc;
    }

    /**
     * 设置mBalanceRouteDesc属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMBalanceRouteDesc(JAXBElement<String> value) {
        this.mBalanceRouteDesc = value;
    }

    /**
     * 获取mBillSetCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMBillSetCode() {
        return mBillSetCode;
    }

    /**
     * 设置mBillSetCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMBillSetCode(JAXBElement<String> value) {
        this.mBillSetCode = value;
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
     * 获取mBomID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMBomID() {
        return mBomID;
    }

    /**
     * 设置mBomID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMBomID(Long value) {
        this.mBomID = value;
    }

    /**
     * 获取mcaAmountOfProItem属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMCAAmountOfProItem() {
        return mcaAmountOfProItem;
    }

    /**
     * 设置mcaAmountOfProItem属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMCAAmountOfProItem(BigDecimal value) {
        this.mcaAmountOfProItem = value;
    }

    /**
     * 获取mcaDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMCADate() {
        return mcaDate;
    }

    /**
     * 设置mcaDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMCADate(XMLGregorianCalendar value) {
        this.mcaDate = value;
    }

    /**
     * 获取mcaPriceAC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMCAPriceAC() {
        return mcaPriceAC;
    }

    /**
     * 设置mcaPriceAC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMCAPriceAC(BigDecimal value) {
        this.mcaPriceAC = value;
    }

    /**
     * 获取mcaPriceAmount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMCAPriceAmount() {
        return mcaPriceAmount;
    }

    /**
     * 设置mcaPriceAmount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMCAPriceAmount(BigDecimal value) {
        this.mcaPriceAmount = value;
    }

    /**
     * 获取mcaPriceFC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMCAPriceFC() {
        return mcaPriceFC;
    }

    /**
     * 设置mcaPriceFC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMCAPriceFC(BigDecimal value) {
        this.mcaPriceFC = value;
    }

    /**
     * 获取mcaPriceTC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMCAPriceTC() {
        return mcaPriceTC;
    }

    /**
     * 设置mcaPriceTC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMCAPriceTC(BigDecimal value) {
        this.mcaPriceTC = value;
    }

    /**
     * 获取mcatbuAmount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMCATBUAmount() {
        return mcatbuAmount;
    }

    /**
     * 设置mcatbuAmount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMCATBUAmount(BigDecimal value) {
        this.mcatbuAmount = value;
    }

    /**
     * 获取mcatuAmount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMCATUAmount() {
        return mcatuAmount;
    }

    /**
     * 设置mcatuAmount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMCATUAmount(BigDecimal value) {
        this.mcatuAmount = value;
    }

    /**
     * 获取mcaTotalMoneyAC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMCATotalMoneyAC() {
        return mcaTotalMoneyAC;
    }

    /**
     * 设置mcaTotalMoneyAC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMCATotalMoneyAC(BigDecimal value) {
        this.mcaTotalMoneyAC = value;
    }

    /**
     * 获取mcaTotalMoneyFC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMCATotalMoneyFC() {
        return mcaTotalMoneyFC;
    }

    /**
     * 设置mcaTotalMoneyFC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMCATotalMoneyFC(BigDecimal value) {
        this.mcaTotalMoneyFC = value;
    }

    /**
     * 获取mcaTotalMoneyNoTaxAC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMCATotalMoneyNoTaxAC() {
        return mcaTotalMoneyNoTaxAC;
    }

    /**
     * 设置mcaTotalMoneyNoTaxAC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMCATotalMoneyNoTaxAC(BigDecimal value) {
        this.mcaTotalMoneyNoTaxAC = value;
    }

    /**
     * 获取mcaTotalMoneyNoTaxFC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMCATotalMoneyNoTaxFC() {
        return mcaTotalMoneyNoTaxFC;
    }

    /**
     * 设置mcaTotalMoneyNoTaxFC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMCATotalMoneyNoTaxFC(BigDecimal value) {
        this.mcaTotalMoneyNoTaxFC = value;
    }

    /**
     * 获取mcaTotalMoneyNoTaxTC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMCATotalMoneyNoTaxTC() {
        return mcaTotalMoneyNoTaxTC;
    }

    /**
     * 设置mcaTotalMoneyNoTaxTC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMCATotalMoneyNoTaxTC(BigDecimal value) {
        this.mcaTotalMoneyNoTaxTC = value;
    }

    /**
     * 获取mcaTotalMoneyTC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMCATotalMoneyTC() {
        return mcaTotalMoneyTC;
    }

    /**
     * 设置mcaTotalMoneyTC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMCATotalMoneyTC(BigDecimal value) {
        this.mcaTotalMoneyTC = value;
    }

    /**
     * 获取mccMoney属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMCCMoney() {
        return mccMoney;
    }

    /**
     * 设置mccMoney属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMCCMoney(BigDecimal value) {
        this.mccMoney = value;
    }

    /**
     * 获取mCanInvoiceMoneyAC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMCanInvoiceMoneyAC() {
        return mCanInvoiceMoneyAC;
    }

    /**
     * 设置mCanInvoiceMoneyAC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMCanInvoiceMoneyAC(BigDecimal value) {
        this.mCanInvoiceMoneyAC = value;
    }

    /**
     * 获取mCanInvoiceQtyPU属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMCanInvoiceQtyPU() {
        return mCanInvoiceQtyPU;
    }

    /**
     * 设置mCanInvoiceQtyPU属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMCanInvoiceQtyPU(BigDecimal value) {
        this.mCanInvoiceQtyPU = value;
    }

    /**
     * 获取mChannel属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMChannel() {
        return mChannel;
    }

    /**
     * 设置mChannel属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMChannel(JAXBElement<String> value) {
        this.mChannel = value;
    }

    /**
     * 获取mChargeBasis属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMChargeBasis() {
        return mChargeBasis;
    }

    /**
     * 设置mChargeBasis属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMChargeBasis(Integer value) {
        this.mChargeBasis = value;
    }

    /**
     * 获取mCheckAccountBillLineNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMCheckAccountBillLineNo() {
        return mCheckAccountBillLineNo;
    }

    /**
     * 设置mCheckAccountBillLineNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMCheckAccountBillLineNo(Integer value) {
        this.mCheckAccountBillLineNo = value;
    }

    /**
     * 获取mCheckAccountBillNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMCheckAccountBillNo() {
        return mCheckAccountBillNo;
    }

    /**
     * 设置mCheckAccountBillNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMCheckAccountBillNo(JAXBElement<String> value) {
        this.mCheckAccountBillNo = value;
    }

    /**
     * 获取mCheckAccountTotalTax属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMCheckAccountTotalTax() {
        return mCheckAccountTotalTax;
    }

    /**
     * 设置mCheckAccountTotalTax属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMCheckAccountTotalTax(BigDecimal value) {
        this.mCheckAccountTotalTax = value;
    }

    /**
     * 获取mCheckAccountTotalTaxFC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMCheckAccountTotalTaxFC() {
        return mCheckAccountTotalTaxFC;
    }

    /**
     * 设置mCheckAccountTotalTaxFC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMCheckAccountTotalTaxFC(BigDecimal value) {
        this.mCheckAccountTotalTaxFC = value;
    }

    /**
     * 获取mCheckAccountTotalTaxTC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMCheckAccountTotalTaxTC() {
        return mCheckAccountTotalTaxTC;
    }

    /**
     * 设置mCheckAccountTotalTaxTC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMCheckAccountTotalTaxTC(BigDecimal value) {
        this.mCheckAccountTotalTaxTC = value;
    }

    /**
     * 获取mCheckAccounter属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMCheckAccounter() {
        return mCheckAccounter;
    }

    /**
     * 设置mCheckAccounter属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMCheckAccounter(JAXBElement<String> value) {
        this.mCheckAccounter = value;
    }

    /**
     * 获取mCompensationPUQty属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMCompensationPUQty() {
        return mCompensationPUQty;
    }

    /**
     * 设置mCompensationPUQty属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMCompensationPUQty(BigDecimal value) {
        this.mCompensationPUQty = value;
    }

    /**
     * 获取mCompensationPUToPBURate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMCompensationPUToPBURate() {
        return mCompensationPUToPBURate;
    }

    /**
     * 设置mCompensationPUToPBURate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMCompensationPUToPBURate(BigDecimal value) {
        this.mCompensationPUToPBURate = value;
    }

    /**
     * 获取mCompensationSUQty属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMCompensationSUQty() {
        return mCompensationSUQty;
    }

    /**
     * 设置mCompensationSUQty属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMCompensationSUQty(BigDecimal value) {
        this.mCompensationSUQty = value;
    }

    /**
     * 获取mConfigItem属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOSCMItemItemInfoData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9CBOSCMItemItemInfoData> getMConfigItem() {
        return mConfigItem;
    }

    /**
     * 设置mConfigItem属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOSCMItemItemInfoData }{@code >}
     *     
     */
    public void setMConfigItem(JAXBElement<UFIDAU9CBOSCMItemItemInfoData> value) {
        this.mConfigItem = value;
    }

    /**
     * 获取mConfigResult属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMConfigResult() {
        return mConfigResult;
    }

    /**
     * 设置mConfigResult属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMConfigResult(Long value) {
        this.mConfigResult = value;
    }

    /**
     * 获取mConfirmDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMConfirmDate() {
        return mConfirmDate;
    }

    /**
     * 设置mConfirmDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMConfirmDate(XMLGregorianCalendar value) {
        this.mConfirmDate = value;
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
     * 获取mConsumeRtnMnyUnit属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMConsumeRtnMnyUnit() {
        return mConsumeRtnMnyUnit;
    }

    /**
     * 设置mConsumeRtnMnyUnit属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMConsumeRtnMnyUnit(BigDecimal value) {
        this.mConsumeRtnMnyUnit = value;
    }

    /**
     * 获取mContainer属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMContainer() {
        return mContainer;
    }

    /**
     * 设置mContainer属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMContainer(JAXBElement<String> value) {
        this.mContainer = value;
    }

    /**
     * 获取mContractDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMContractDate() {
        return mContractDate;
    }

    /**
     * 设置mContractDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMContractDate(XMLGregorianCalendar value) {
        this.mContractDate = value;
    }

    /**
     * 获取mContractKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMContractKey() {
        return mContractKey;
    }

    /**
     * 设置mContractKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMContractKey(Long value) {
        this.mContractKey = value;
    }

    /**
     * 获取mContractLineKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMContractLineKey() {
        return mContractLineKey;
    }

    /**
     * 设置mContractLineKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMContractLineKey(Long value) {
        this.mContractLineKey = value;
    }

    /**
     * 获取mContractLineNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMContractLineNo() {
        return mContractLineNo;
    }

    /**
     * 设置mContractLineNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMContractLineNo(Integer value) {
        this.mContractLineNo = value;
    }

    /**
     * 获取mContractNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMContractNo() {
        return mContractNo;
    }

    /**
     * 设置mContractNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMContractNo(JAXBElement<String> value) {
        this.mContractNo = value;
    }

    /**
     * 获取mContractVer属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMContractVer() {
        return mContractVer;
    }

    /**
     * 设置mContractVer属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMContractVer(Integer value) {
        this.mContractVer = value;
    }

    /**
     * 获取mCostRatetoBase属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMCostRatetoBase() {
        return mCostRatetoBase;
    }

    /**
     * 设置mCostRatetoBase属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMCostRatetoBase(BigDecimal value) {
        this.mCostRatetoBase = value;
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
     * 获取mCreditObj属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOSCMCustomerCustomerSiteMISCInfoData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9CBOSCMCustomerCustomerSiteMISCInfoData> getMCreditObj() {
        return mCreditObj;
    }

    /**
     * 设置mCreditObj属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOSCMCustomerCustomerSiteMISCInfoData }{@code >}
     *     
     */
    public void setMCreditObj(JAXBElement<UFIDAU9CBOSCMCustomerCustomerSiteMISCInfoData> value) {
        this.mCreditObj = value;
    }

    /**
     * 获取mCusSignInQtyInvAmount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMCusSignInQtyInvAmount() {
        return mCusSignInQtyInvAmount;
    }

    /**
     * 设置mCusSignInQtyInvAmount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMCusSignInQtyInvAmount(BigDecimal value) {
        this.mCusSignInQtyInvAmount = value;
    }

    /**
     * 获取mCusSignInQtyPriceAmount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMCusSignInQtyPriceAmount() {
        return mCusSignInQtyPriceAmount;
    }

    /**
     * 设置mCusSignInQtyPriceAmount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMCusSignInQtyPriceAmount(BigDecimal value) {
        this.mCusSignInQtyPriceAmount = value;
    }

    /**
     * 获取mCusSignInQtyTBUAmount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMCusSignInQtyTBUAmount() {
        return mCusSignInQtyTBUAmount;
    }

    /**
     * 设置mCusSignInQtyTBUAmount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMCusSignInQtyTBUAmount(BigDecimal value) {
        this.mCusSignInQtyTBUAmount = value;
    }

    /**
     * 获取mCusSignInQtyTUAmount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMCusSignInQtyTUAmount() {
        return mCusSignInQtyTUAmount;
    }

    /**
     * 设置mCusSignInQtyTUAmount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMCusSignInQtyTUAmount(BigDecimal value) {
        this.mCusSignInQtyTUAmount = value;
    }

    /**
     * 获取mCustomerItemCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMCustomerItemCode() {
        return mCustomerItemCode;
    }

    /**
     * 设置mCustomerItemCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMCustomerItemCode(JAXBElement<String> value) {
        this.mCustomerItemCode = value;
    }

    /**
     * 获取mCustomerItemName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMCustomerItemName() {
        return mCustomerItemName;
    }

    /**
     * 设置mCustomerItemName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMCustomerItemName(JAXBElement<String> value) {
        this.mCustomerItemName = value;
    }

    /**
     * 获取mDamageQtyIUAmount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMDamageQtyIUAmount() {
        return mDamageQtyIUAmount;
    }

    /**
     * 设置mDamageQtyIUAmount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMDamageQtyIUAmount(BigDecimal value) {
        this.mDamageQtyIUAmount = value;
    }

    /**
     * 获取mDamageQtyOfProItem属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMDamageQtyOfProItem() {
        return mDamageQtyOfProItem;
    }

    /**
     * 设置mDamageQtyOfProItem属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMDamageQtyOfProItem(BigDecimal value) {
        this.mDamageQtyOfProItem = value;
    }

    /**
     * 获取mDamageQtyPriceAmount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMDamageQtyPriceAmount() {
        return mDamageQtyPriceAmount;
    }

    /**
     * 设置mDamageQtyPriceAmount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMDamageQtyPriceAmount(BigDecimal value) {
        this.mDamageQtyPriceAmount = value;
    }

    /**
     * 获取mDamageQtyTBUAmount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMDamageQtyTBUAmount() {
        return mDamageQtyTBUAmount;
    }

    /**
     * 设置mDamageQtyTBUAmount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMDamageQtyTBUAmount(BigDecimal value) {
        this.mDamageQtyTBUAmount = value;
    }

    /**
     * 获取mDamageQtyTUAmount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMDamageQtyTUAmount() {
        return mDamageQtyTUAmount;
    }

    /**
     * 设置mDamageQtyTUAmount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMDamageQtyTUAmount(BigDecimal value) {
        this.mDamageQtyTUAmount = value;
    }

    /**
     * 获取mDealMode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMDealMode() {
        return mDealMode;
    }

    /**
     * 设置mDealMode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMDealMode(Integer value) {
        this.mDealMode = value;
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
     * 获取mDiscountRate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMDiscountRate() {
        return mDiscountRate;
    }

    /**
     * 设置mDiscountRate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMDiscountRate(BigDecimal value) {
        this.mDiscountRate = value;
    }

    /**
     * 获取mDocLineNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMDocLineNo() {
        return mDocLineNo;
    }

    /**
     * 设置mDocLineNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMDocLineNo(Integer value) {
        this.mDocLineNo = value;
    }

    /**
     * 获取mDonationReason属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMDonationReason() {
        return mDonationReason;
    }

    /**
     * 设置mDonationReason属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMDonationReason(Integer value) {
        this.mDonationReason = value;
    }

    /**
     * 获取mDonationType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMDonationType() {
        return mDonationType;
    }

    /**
     * 设置mDonationType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMDonationType(Integer value) {
        this.mDonationType = value;
    }

    /**
     * 获取mDrawbackBillKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMDrawbackBillKey() {
        return mDrawbackBillKey;
    }

    /**
     * 设置mDrawbackBillKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMDrawbackBillKey(Long value) {
        this.mDrawbackBillKey = value;
    }

    /**
     * 获取mDrawbackBillLineKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMDrawbackBillLineKey() {
        return mDrawbackBillLineKey;
    }

    /**
     * 设置mDrawbackBillLineKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMDrawbackBillLineKey(Long value) {
        this.mDrawbackBillLineKey = value;
    }

    /**
     * 获取mDrawbackBillLineNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMDrawbackBillLineNo() {
        return mDrawbackBillLineNo;
    }

    /**
     * 设置mDrawbackBillLineNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMDrawbackBillLineNo(Integer value) {
        this.mDrawbackBillLineNo = value;
    }

    /**
     * 获取mDrawbackBillNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMDrawbackBillNo() {
        return mDrawbackBillNo;
    }

    /**
     * 设置mDrawbackBillNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMDrawbackBillNo(JAXBElement<String> value) {
        this.mDrawbackBillNo = value;
    }

    /**
     * 获取mExecutedARMoney属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMExecutedARMoney() {
        return mExecutedARMoney;
    }

    /**
     * 设置mExecutedARMoney属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMExecutedARMoney(BigDecimal value) {
        this.mExecutedARMoney = value;
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
     * 获取mExecutedARQtyPriceAmount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMExecutedARQtyPriceAmount() {
        return mExecutedARQtyPriceAmount;
    }

    /**
     * 设置mExecutedARQtyPriceAmount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMExecutedARQtyPriceAmount(BigDecimal value) {
        this.mExecutedARQtyPriceAmount = value;
    }

    /**
     * 获取mExecutedARQtyTBUAmount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMExecutedARQtyTBUAmount() {
        return mExecutedARQtyTBUAmount;
    }

    /**
     * 设置mExecutedARQtyTBUAmount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMExecutedARQtyTBUAmount(BigDecimal value) {
        this.mExecutedARQtyTBUAmount = value;
    }

    /**
     * 获取mExecutedARQtyTUAmount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMExecutedARQtyTUAmount() {
        return mExecutedARQtyTUAmount;
    }

    /**
     * 设置mExecutedARQtyTUAmount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMExecutedARQtyTUAmount(BigDecimal value) {
        this.mExecutedARQtyTUAmount = value;
    }

    /**
     * 获取mfas属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOSCMItemItemInfoData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9CBOSCMItemItemInfoData> getMFAS() {
        return mfas;
    }

    /**
     * 设置mfas属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOSCMItemItemInfoData }{@code >}
     *     
     */
    public void setMFAS(JAXBElement<UFIDAU9CBOSCMItemItemInfoData> value) {
        this.mfas = value;
    }

    /**
     * 获取mFillQtyPriceAmount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMFillQtyPriceAmount() {
        return mFillQtyPriceAmount;
    }

    /**
     * 设置mFillQtyPriceAmount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMFillQtyPriceAmount(BigDecimal value) {
        this.mFillQtyPriceAmount = value;
    }

    /**
     * 获取mFillQtyTBUAmount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMFillQtyTBUAmount() {
        return mFillQtyTBUAmount;
    }

    /**
     * 设置mFillQtyTBUAmount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMFillQtyTBUAmount(BigDecimal value) {
        this.mFillQtyTBUAmount = value;
    }

    /**
     * 获取mFillQtyTUAmount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMFillQtyTUAmount() {
        return mFillQtyTUAmount;
    }

    /**
     * 设置mFillQtyTUAmount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMFillQtyTUAmount(BigDecimal value) {
        this.mFillQtyTUAmount = value;
    }

    /**
     * 获取mFinallyPrice属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMFinallyPrice() {
        return mFinallyPrice;
    }

    /**
     * 设置mFinallyPrice属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMFinallyPrice(BigDecimal value) {
        this.mFinallyPrice = value;
    }

    /**
     * 获取mFinallyPriceTC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMFinallyPriceTC() {
        return mFinallyPriceTC;
    }

    /**
     * 设置mFinallyPriceTC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMFinallyPriceTC(BigDecimal value) {
        this.mFinallyPriceTC = value;
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
     * 获取mFutureCostAC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMFutureCostAC() {
        return mFutureCostAC;
    }

    /**
     * 设置mFutureCostAC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMFutureCostAC(BigDecimal value) {
        this.mFutureCostAC = value;
    }

    /**
     * 获取mFutureCostFC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMFutureCostFC() {
        return mFutureCostFC;
    }

    /**
     * 设置mFutureCostFC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMFutureCostFC(BigDecimal value) {
        this.mFutureCostFC = value;
    }

    /**
     * 获取mFutureCostTC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMFutureCostTC() {
        return mFutureCostTC;
    }

    /**
     * 设置mFutureCostTC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMFutureCostTC(BigDecimal value) {
        this.mFutureCostTC = value;
    }

    /**
     * 获取mGoodsManagementType属性的值。
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
     * 设置mGoodsManagementType属性的值。
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
     * 获取miuToIMU属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMIUToIMU() {
        return miuToIMU;
    }

    /**
     * 设置miuToIMU属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMIUToIMU(BigDecimal value) {
        this.miuToIMU = value;
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
     * 获取mInvRatetoBase属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMInvRatetoBase() {
        return mInvRatetoBase;
    }

    /**
     * 设置mInvRatetoBase属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMInvRatetoBase(BigDecimal value) {
        this.mInvRatetoBase = value;
    }

    /**
     * 获取mIsARByPreShip属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsARByPreShip() {
        return mIsARByPreShip;
    }

    /**
     * 设置mIsARByPreShip属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsARByPreShip(Boolean value) {
        this.mIsARByPreShip = value;
    }

    /**
     * 获取mIsAllowReturn属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsAllowReturn() {
        return mIsAllowReturn;
    }

    /**
     * 设置mIsAllowReturn属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsAllowReturn(Boolean value) {
        this.mIsAllowReturn = value;
    }

    /**
     * 获取mIsAssociatedChild属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsAssociatedChild() {
        return mIsAssociatedChild;
    }

    /**
     * 设置mIsAssociatedChild属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsAssociatedChild(Boolean value) {
        this.mIsAssociatedChild = value;
    }

    /**
     * 获取mIsChangeProcessQty属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsChangeProcessQty() {
        return mIsChangeProcessQty;
    }

    /**
     * 设置mIsChangeProcessQty属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsChangeProcessQty(Boolean value) {
        this.mIsChangeProcessQty = value;
    }

    /**
     * 获取mIsCloseSO属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsCloseSO() {
        return mIsCloseSO;
    }

    /**
     * 设置mIsCloseSO属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsCloseSO(Boolean value) {
        this.mIsCloseSO = value;
    }

    /**
     * 获取mIsConfirmDateChangable属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsConfirmDateChangable() {
        return mIsConfirmDateChangable;
    }

    /**
     * 设置mIsConfirmDateChangable属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsConfirmDateChangable(Boolean value) {
        this.mIsConfirmDateChangable = value;
    }

    /**
     * 获取mIsCreatedInflow属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsCreatedInflow() {
        return mIsCreatedInflow;
    }

    /**
     * 设置mIsCreatedInflow属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsCreatedInflow(Boolean value) {
        this.mIsCreatedInflow = value;
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
     * 获取mIsExistAssociatedChild属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsExistAssociatedChild() {
        return mIsExistAssociatedChild;
    }

    /**
     * 设置mIsExistAssociatedChild属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsExistAssociatedChild(Boolean value) {
        this.mIsExistAssociatedChild = value;
    }

    /**
     * 获取mIsFinishSignIn属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsFinishSignIn() {
        return mIsFinishSignIn;
    }

    /**
     * 设置mIsFinishSignIn属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsFinishSignIn(Boolean value) {
        this.mIsFinishSignIn = value;
    }

    /**
     * 获取mIsGernerTBD属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsGernerTBD() {
        return mIsGernerTBD;
    }

    /**
     * 设置mIsGernerTBD属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsGernerTBD(Boolean value) {
        this.mIsGernerTBD = value;
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
     * 获取mIsInvoiceUpdate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsInvoiceUpdate() {
        return mIsInvoiceUpdate;
    }

    /**
     * 设置mIsInvoiceUpdate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsInvoiceUpdate(Boolean value) {
        this.mIsInvoiceUpdate = value;
    }

    /**
     * 获取mIsItemVersionChangable属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsItemVersionChangable() {
        return mIsItemVersionChangable;
    }

    /**
     * 设置mIsItemVersionChangable属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsItemVersionChangable(Boolean value) {
        this.mIsItemVersionChangable = value;
    }

    /**
     * 获取mIsKit属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsKit() {
        return mIsKit;
    }

    /**
     * 设置mIsKit属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsKit(Boolean value) {
        this.mIsKit = value;
    }

    /**
     * 获取mIsMakeOutInvoice属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsMakeOutInvoice() {
        return mIsMakeOutInvoice;
    }

    /**
     * 设置mIsMakeOutInvoice属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsMakeOutInvoice(Boolean value) {
        this.mIsMakeOutInvoice = value;
    }

    /**
     * 获取mIsManufacturerChangeable属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsManufacturerChangeable() {
        return mIsManufacturerChangeable;
    }

    /**
     * 设置mIsManufacturerChangeable属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsManufacturerChangeable(Boolean value) {
        this.mIsManufacturerChangeable = value;
    }

    /**
     * 获取mIsMaturityDateChangable属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsMaturityDateChangable() {
        return mIsMaturityDateChangable;
    }

    /**
     * 设置mIsMaturityDateChangable属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsMaturityDateChangable(Boolean value) {
        this.mIsMaturityDateChangable = value;
    }

    /**
     * 获取mIsModifyLot属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsModifyLot() {
        return mIsModifyLot;
    }

    /**
     * 设置mIsModifyLot属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsModifyLot(Boolean value) {
        this.mIsModifyLot = value;
    }

    /**
     * 获取mIsModifyOperateOrg属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsModifyOperateOrg() {
        return mIsModifyOperateOrg;
    }

    /**
     * 设置mIsModifyOperateOrg属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsModifyOperateOrg(Boolean value) {
        this.mIsModifyOperateOrg = value;
    }

    /**
     * 获取mIsModifyPU属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsModifyPU() {
        return mIsModifyPU;
    }

    /**
     * 设置mIsModifyPU属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsModifyPU(Boolean value) {
        this.mIsModifyPU = value;
    }

    /**
     * 获取mIsModifyShipperOrg属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsModifyShipperOrg() {
        return mIsModifyShipperOrg;
    }

    /**
     * 设置mIsModifyShipperOrg属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsModifyShipperOrg(Boolean value) {
        this.mIsModifyShipperOrg = value;
    }

    /**
     * 获取mIsModifyTBUToPBU属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsModifyTBUToPBU() {
        return mIsModifyTBUToPBU;
    }

    /**
     * 设置mIsModifyTBUToPBU属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsModifyTBUToPBU(Boolean value) {
        this.mIsModifyTBUToPBU = value;
    }

    /**
     * 获取mIsModifyTCToACExRate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsModifyTCToACExRate() {
        return mIsModifyTCToACExRate;
    }

    /**
     * 设置mIsModifyTCToACExRate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsModifyTCToACExRate(Boolean value) {
        this.mIsModifyTCToACExRate = value;
    }

    /**
     * 获取mIsModifyTU属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsModifyTU() {
        return mIsModifyTU;
    }

    /**
     * 设置mIsModifyTU属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsModifyTU(Boolean value) {
        this.mIsModifyTU = value;
    }

    /**
     * 获取mIsNeedGenAAI属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsNeedGenAAI() {
        return mIsNeedGenAAI;
    }

    /**
     * 设置mIsNeedGenAAI属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsNeedGenAAI(Boolean value) {
        this.mIsNeedGenAAI = value;
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
     * 获取mIsPP属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsPP() {
        return mIsPP;
    }

    /**
     * 设置mIsPP属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsPP(Boolean value) {
        this.mIsPP = value;
    }

    /**
     * 获取mIsPossessCredit属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsPossessCredit() {
        return mIsPossessCredit;
    }

    /**
     * 设置mIsPossessCredit属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsPossessCredit(Boolean value) {
        this.mIsPossessCredit = value;
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
     * 获取mIsPreShipBeginning属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsPreShipBeginning() {
        return mIsPreShipBeginning;
    }

    /**
     * 设置mIsPreShipBeginning属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsPreShipBeginning(Boolean value) {
        this.mIsPreShipBeginning = value;
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
     * 获取mIsPrjUnChangeable属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsPrjUnChangeable() {
        return mIsPrjUnChangeable;
    }

    /**
     * 设置mIsPrjUnChangeable属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsPrjUnChangeable(Boolean value) {
        this.mIsPrjUnChangeable = value;
    }

    /**
     * 获取mIsRP属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsRP() {
        return mIsRP;
    }

    /**
     * 设置mIsRP属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsRP(Boolean value) {
        this.mIsRP = value;
    }

    /**
     * 获取mIsRefill属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsRefill() {
        return mIsRefill;
    }

    /**
     * 设置mIsRefill属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsRefill(Boolean value) {
        this.mIsRefill = value;
    }

    /**
     * 获取mIsSignedInByCP属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsSignedInByCP() {
        return mIsSignedInByCP;
    }

    /**
     * 设置mIsSignedInByCP属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsSignedInByCP(Boolean value) {
        this.mIsSignedInByCP = value;
    }

    /**
     * 获取mIsTIByPreShip属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsTIByPreShip() {
        return mIsTIByPreShip;
    }

    /**
     * 设置mIsTIByPreShip属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsTIByPreShip(Boolean value) {
        this.mIsTIByPreShip = value;
    }

    /**
     * 获取mIsTaskUnChangeable属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsTaskUnChangeable() {
        return mIsTaskUnChangeable;
    }

    /**
     * 设置mIsTaskUnChangeable属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsTaskUnChangeable(Boolean value) {
        this.mIsTaskUnChangeable = value;
    }

    /**
     * 获取mIsVMIAAI属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsVMIAAI() {
        return mIsVMIAAI;
    }

    /**
     * 设置mIsVMIAAI属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsVMIAAI(Boolean value) {
        this.mIsVMIAAI = value;
    }

    /**
     * 获取mIsZeroCost属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsZeroCost() {
        return mIsZeroCost;
    }

    /**
     * 设置mIsZeroCost属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsZeroCost(Boolean value) {
        this.mIsZeroCost = value;
    }

    /**
     * 获取mItemInfo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOSCMItemItemInfoData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9CBOSCMItemItemInfoData> getMItemInfo() {
        return mItemInfo;
    }

    /**
     * 设置mItemInfo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOSCMItemItemInfoData }{@code >}
     *     
     */
    public void setMItemInfo(JAXBElement<UFIDAU9CBOSCMItemItemInfoData> value) {
        this.mItemInfo = value;
    }

    /**
     * 获取mKitItemInfo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOSCMItemItemInfoData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9CBOSCMItemItemInfoData> getMKitItemInfo() {
        return mKitItemInfo;
    }

    /**
     * 设置mKitItemInfo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOSCMItemItemInfoData }{@code >}
     *     
     */
    public void setMKitItemInfo(JAXBElement<UFIDAU9CBOSCMItemItemInfoData> value) {
        this.mKitItemInfo = value;
    }

    /**
     * 获取mKitLineNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMKitLineNo() {
        return mKitLineNo;
    }

    /**
     * 设置mKitLineNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMKitLineNo(JAXBElement<String> value) {
        this.mKitLineNo = value;
    }

    /**
     * 获取mlcMoney属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMLCMoney() {
        return mlcMoney;
    }

    /**
     * 设置mlcMoney属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMLCMoney(BigDecimal value) {
        this.mlcMoney = value;
    }

    /**
     * 获取mLotInfo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9LotLotMasterInfoData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9LotLotMasterInfoData> getMLotInfo() {
        return mLotInfo;
    }

    /**
     * 设置mLotInfo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9LotLotMasterInfoData }{@code >}
     *     
     */
    public void setMLotInfo(JAXBElement<UFIDAU9LotLotMasterInfoData> value) {
        this.mLotInfo = value;
    }

    /**
     * 获取mLotInvalidationDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMLotInvalidationDate() {
        return mLotInvalidationDate;
    }

    /**
     * 设置mLotInvalidationDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMLotInvalidationDate(XMLGregorianCalendar value) {
        this.mLotInvalidationDate = value;
    }

    /**
     * 获取mMaturityDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMMaturityDate() {
        return mMaturityDate;
    }

    /**
     * 设置mMaturityDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMMaturityDate(XMLGregorianCalendar value) {
        this.mMaturityDate = value;
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
     * 获取mMotherSoShipLine属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMMotherSoShipLine() {
        return mMotherSoShipLine;
    }

    /**
     * 设置mMotherSoShipLine属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMMotherSoShipLine(Long value) {
        this.mMotherSoShipLine = value;
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
     * 获取mNetWeight属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMNetWeight() {
        return mNetWeight;
    }

    /**
     * 设置mNetWeight属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMNetWeight(BigDecimal value) {
        this.mNetWeight = value;
    }

    /**
     * 获取mNotLcMoney属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMNotLcMoney() {
        return mNotLcMoney;
    }

    /**
     * 设置mNotLcMoney属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMNotLcMoney(BigDecimal value) {
        this.mNotLcMoney = value;
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
     * 获取mOrderPrice属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMOrderPrice() {
        return mOrderPrice;
    }

    /**
     * 设置mOrderPrice属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMOrderPrice(BigDecimal value) {
        this.mOrderPrice = value;
    }

    /**
     * 获取mOrderPriceTC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMOrderPriceTC() {
        return mOrderPriceTC;
    }

    /**
     * 设置mOrderPriceTC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMOrderPriceTC(BigDecimal value) {
        this.mOrderPriceTC = value;
    }

    /**
     * 获取mOriginalItem属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOSCMItemItemInfoData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9CBOSCMItemItemInfoData> getMOriginalItem() {
        return mOriginalItem;
    }

    /**
     * 设置mOriginalItem属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOSCMItemItemInfoData }{@code >}
     *     
     */
    public void setMOriginalItem(JAXBElement<UFIDAU9CBOSCMItemItemInfoData> value) {
        this.mOriginalItem = value;
    }

    /**
     * 获取mOriginalItemAmount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMOriginalItemAmount() {
        return mOriginalItemAmount;
    }

    /**
     * 设置mOriginalItemAmount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMOriginalItemAmount(BigDecimal value) {
        this.mOriginalItemAmount = value;
    }

    /**
     * 获取mOriginalItemBaseAmount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMOriginalItemBaseAmount() {
        return mOriginalItemBaseAmount;
    }

    /**
     * 设置mOriginalItemBaseAmount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMOriginalItemBaseAmount(BigDecimal value) {
        this.mOriginalItemBaseAmount = value;
    }

    /**
     * 获取mOriginalItemRatetoBase属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMOriginalItemRatetoBase() {
        return mOriginalItemRatetoBase;
    }

    /**
     * 设置mOriginalItemRatetoBase属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMOriginalItemRatetoBase(BigDecimal value) {
        this.mOriginalItemRatetoBase = value;
    }

    /**
     * 获取mParentShipLineID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMParentShipLineID() {
        return mParentShipLineID;
    }

    /**
     * 设置mParentShipLineID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMParentShipLineID(Long value) {
        this.mParentShipLineID = value;
    }

    /**
     * 获取mParentShipLineNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMParentShipLineNo() {
        return mParentShipLineNo;
    }

    /**
     * 设置mParentShipLineNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMParentShipLineNo(Integer value) {
        this.mParentShipLineNo = value;
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
     * 获取mPerProcessQty属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMPerProcessQty() {
        return mPerProcessQty;
    }

    /**
     * 设置mPerProcessQty属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMPerProcessQty(BigDecimal value) {
        this.mPerProcessQty = value;
    }

    /**
     * 获取mPiece属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMPiece() {
        return mPiece;
    }

    /**
     * 设置mPiece属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMPiece(BigDecimal value) {
        this.mPiece = value;
    }

    /**
     * 获取mPlanQtyTBUAmount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMPlanQtyTBUAmount() {
        return mPlanQtyTBUAmount;
    }

    /**
     * 设置mPlanQtyTBUAmount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMPlanQtyTBUAmount(BigDecimal value) {
        this.mPlanQtyTBUAmount = value;
    }

    /**
     * 获取mPlanQtyTUAmount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMPlanQtyTUAmount() {
        return mPlanQtyTUAmount;
    }

    /**
     * 设置mPlanQtyTUAmount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMPlanQtyTUAmount(BigDecimal value) {
        this.mPlanQtyTUAmount = value;
    }

    /**
     * 获取mPreMaturityDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMPreMaturityDate() {
        return mPreMaturityDate;
    }

    /**
     * 设置mPreMaturityDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMPreMaturityDate(XMLGregorianCalendar value) {
        this.mPreMaturityDate = value;
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
     * 获取mPrecisionACCC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMPrecisionACCC() {
        return mPrecisionACCC;
    }

    /**
     * 设置mPrecisionACCC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMPrecisionACCC(Integer value) {
        this.mPrecisionACCC = value;
    }

    /**
     * 获取mPrecisionTCAC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMPrecisionTCAC() {
        return mPrecisionTCAC;
    }

    /**
     * 设置mPrecisionTCAC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMPrecisionTCAC(Integer value) {
        this.mPrecisionTCAC = value;
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
     * 获取mPriceRatetoBase属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMPriceRatetoBase() {
        return mPriceRatetoBase;
    }

    /**
     * 设置mPriceRatetoBase属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMPriceRatetoBase(BigDecimal value) {
        this.mPriceRatetoBase = value;
    }

    /**
     * 获取mPriceSource属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMPriceSource() {
        return mPriceSource;
    }

    /**
     * 设置mPriceSource属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMPriceSource(Integer value) {
        this.mPriceSource = value;
    }

    /**
     * 获取mProcedureNO属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMProcedureNO() {
        return mProcedureNO;
    }

    /**
     * 设置mProcedureNO属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMProcedureNO(JAXBElement<String> value) {
        this.mProcedureNO = value;
    }

    /**
     * 获取mProcessItem属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOSCMItemItemInfoData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9CBOSCMItemItemInfoData> getMProcessItem() {
        return mProcessItem;
    }

    /**
     * 设置mProcessItem属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOSCMItemItemInfoData }{@code >}
     *     
     */
    public void setMProcessItem(JAXBElement<UFIDAU9CBOSCMItemItemInfoData> value) {
        this.mProcessItem = value;
    }

    /**
     * 获取mProcessQty属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMProcessQty() {
        return mProcessQty;
    }

    /**
     * 设置mProcessQty属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMProcessQty(BigDecimal value) {
        this.mProcessQty = value;
    }

    /**
     * 获取mProcessRateToSub属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMProcessRateToSub() {
        return mProcessRateToSub;
    }

    /**
     * 设置mProcessRateToSub属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMProcessRateToSub(BigDecimal value) {
        this.mProcessRateToSub = value;
    }

    /**
     * 获取mQtyPriceAmount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMQtyPriceAmount() {
        return mQtyPriceAmount;
    }

    /**
     * 设置mQtyPriceAmount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMQtyPriceAmount(BigDecimal value) {
        this.mQtyPriceAmount = value;
    }

    /**
     * 获取mQuantityType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMQuantityType() {
        return mQuantityType;
    }

    /**
     * 设置mQuantityType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMQuantityType(Integer value) {
        this.mQuantityType = value;
    }

    /**
     * 获取mrmrUseQtyTBUAmount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMRMRUseQtyTBUAmount() {
        return mrmrUseQtyTBUAmount;
    }

    /**
     * 设置mrmrUseQtyTBUAmount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMRMRUseQtyTBUAmount(BigDecimal value) {
        this.mrmrUseQtyTBUAmount = value;
    }

    /**
     * 获取mrmrUseQtyTUAmount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMRMRUseQtyTUAmount() {
        return mrmrUseQtyTUAmount;
    }

    /**
     * 设置mrmrUseQtyTUAmount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMRMRUseQtyTUAmount(BigDecimal value) {
        this.mrmrUseQtyTUAmount = value;
    }

    /**
     * 获取mRcvDocNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMRcvDocNo() {
        return mRcvDocNo;
    }

    /**
     * 设置mRcvDocNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMRcvDocNo(JAXBElement<String> value) {
        this.mRcvDocNo = value;
    }

    /**
     * 获取mRcvID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMRcvID() {
        return mRcvID;
    }

    /**
     * 设置mRcvID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMRcvID(Long value) {
        this.mRcvID = value;
    }

    /**
     * 获取mRcvLineID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMRcvLineID() {
        return mRcvLineID;
    }

    /**
     * 设置mRcvLineID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMRcvLineID(Long value) {
        this.mRcvLineID = value;
    }

    /**
     * 获取mRcvLineNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMRcvLineNo() {
        return mRcvLineNo;
    }

    /**
     * 设置mRcvLineNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMRcvLineNo(Integer value) {
        this.mRcvLineNo = value;
    }

    /**
     * 获取mRcvOrg属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMRcvOrg() {
        return mRcvOrg;
    }

    /**
     * 设置mRcvOrg属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMRcvOrg(Long value) {
        this.mRcvOrg = value;
    }

    /**
     * 获取mRcvQryTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMRcvQryTime() {
        return mRcvQryTime;
    }

    /**
     * 设置mRcvQryTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMRcvQryTime(XMLGregorianCalendar value) {
        this.mRcvQryTime = value;
    }

    /**
     * 获取mRcvQty属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMRcvQty() {
        return mRcvQty;
    }

    /**
     * 设置mRcvQty属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMRcvQty(BigDecimal value) {
        this.mRcvQty = value;
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
     * 获取mRefillUseQtyTBUAmount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMRefillUseQtyTBUAmount() {
        return mRefillUseQtyTBUAmount;
    }

    /**
     * 设置mRefillUseQtyTBUAmount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMRefillUseQtyTBUAmount(BigDecimal value) {
        this.mRefillUseQtyTBUAmount = value;
    }

    /**
     * 获取mRefillUseQtyTUAmount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMRefillUseQtyTUAmount() {
        return mRefillUseQtyTUAmount;
    }

    /**
     * 设置mRefillUseQtyTUAmount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMRefillUseQtyTUAmount(BigDecimal value) {
        this.mRefillUseQtyTUAmount = value;
    }

    /**
     * 获取mRejectQtyIUAmount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMRejectQtyIUAmount() {
        return mRejectQtyIUAmount;
    }

    /**
     * 设置mRejectQtyIUAmount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMRejectQtyIUAmount(BigDecimal value) {
        this.mRejectQtyIUAmount = value;
    }

    /**
     * 获取mRejectQtyOfProItem属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMRejectQtyOfProItem() {
        return mRejectQtyOfProItem;
    }

    /**
     * 设置mRejectQtyOfProItem属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMRejectQtyOfProItem(BigDecimal value) {
        this.mRejectQtyOfProItem = value;
    }

    /**
     * 获取mRejectQtyPriceAmount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMRejectQtyPriceAmount() {
        return mRejectQtyPriceAmount;
    }

    /**
     * 设置mRejectQtyPriceAmount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMRejectQtyPriceAmount(BigDecimal value) {
        this.mRejectQtyPriceAmount = value;
    }

    /**
     * 获取mRejectQtyTBUAmount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMRejectQtyTBUAmount() {
        return mRejectQtyTBUAmount;
    }

    /**
     * 设置mRejectQtyTBUAmount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMRejectQtyTBUAmount(BigDecimal value) {
        this.mRejectQtyTBUAmount = value;
    }

    /**
     * 获取mRejectQtyTUAmount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMRejectQtyTUAmount() {
        return mRejectQtyTUAmount;
    }

    /**
     * 设置mRejectQtyTUAmount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMRejectQtyTUAmount(BigDecimal value) {
        this.mRejectQtyTUAmount = value;
    }

    /**
     * 获取mRejectRcvUseQtyTBUAmount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMRejectRcvUseQtyTBUAmount() {
        return mRejectRcvUseQtyTBUAmount;
    }

    /**
     * 设置mRejectRcvUseQtyTBUAmount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMRejectRcvUseQtyTBUAmount(BigDecimal value) {
        this.mRejectRcvUseQtyTBUAmount = value;
    }

    /**
     * 获取mRejectRcvUseQtyTUAmount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMRejectRcvUseQtyTUAmount() {
        return mRejectRcvUseQtyTUAmount;
    }

    /**
     * 设置mRejectRcvUseQtyTUAmount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMRejectRcvUseQtyTUAmount(BigDecimal value) {
        this.mRejectRcvUseQtyTUAmount = value;
    }

    /**
     * 获取mRejectReason属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMRejectReason() {
        return mRejectReason;
    }

    /**
     * 设置mRejectReason属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMRejectReason(Integer value) {
        this.mRejectReason = value;
    }

    /**
     * 获取mReserveQty属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMReserveQty() {
        return mReserveQty;
    }

    /**
     * 设置mReserveQty属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMReserveQty(BigDecimal value) {
        this.mReserveQty = value;
    }

    /**
     * 获取msoDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMSODate() {
        return msoDate;
    }

    /**
     * 设置msoDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMSODate(XMLGregorianCalendar value) {
        this.msoDate = value;
    }

    /**
     * 获取msoKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMSOKey() {
        return msoKey;
    }

    /**
     * 设置msoKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMSOKey(Long value) {
        this.msoKey = value;
    }

    /**
     * 获取msoKitLineNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMSOKitLineNo() {
        return msoKitLineNo;
    }

    /**
     * 设置msoKitLineNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMSOKitLineNo(JAXBElement<String> value) {
        this.msoKitLineNo = value;
    }

    /**
     * 获取msoLineKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMSOLineKey() {
        return msoLineKey;
    }

    /**
     * 设置msoLineKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMSOLineKey(Long value) {
        this.msoLineKey = value;
    }

    /**
     * 获取msoLineNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMSOLineNo() {
        return msoLineNo;
    }

    /**
     * 设置msoLineNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMSOLineNo(Integer value) {
        this.msoLineNo = value;
    }

    /**
     * 获取msoNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMSONo() {
        return msoNo;
    }

    /**
     * 设置msoNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMSONo(JAXBElement<String> value) {
        this.msoNo = value;
    }

    /**
     * 获取msoSubLineKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMSOSubLineKey() {
        return msoSubLineKey;
    }

    /**
     * 设置msoSubLineKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMSOSubLineKey(Long value) {
        this.msoSubLineKey = value;
    }

    /**
     * 获取msoSubLineNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMSOSubLineNo() {
        return msoSubLineNo;
    }

    /**
     * 设置msoSubLineNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMSOSubLineNo(Integer value) {
        this.msoSubLineNo = value;
    }

    /**
     * 获取msoSysVersion属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMSOSysVersion() {
        return msoSysVersion;
    }

    /**
     * 设置msoSysVersion属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMSOSysVersion(Long value) {
        this.msoSysVersion = value;
    }

    /**
     * 获取msotDocType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMSOTDocType() {
        return msotDocType;
    }

    /**
     * 设置msotDocType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMSOTDocType(Long value) {
        this.msotDocType = value;
    }

    /**
     * 获取msoVer属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMSOVer() {
        return msoVer;
    }

    /**
     * 设置msoVer属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMSOVer(Integer value) {
        this.msoVer = value;
    }

    /**
     * 获取mSaleCostAC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMSaleCostAC() {
        return mSaleCostAC;
    }

    /**
     * 设置mSaleCostAC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMSaleCostAC(BigDecimal value) {
        this.mSaleCostAC = value;
    }

    /**
     * 获取mSaleCostAmount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMSaleCostAmount() {
        return mSaleCostAmount;
    }

    /**
     * 设置mSaleCostAmount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMSaleCostAmount(BigDecimal value) {
        this.mSaleCostAmount = value;
    }

    /**
     * 获取mSaleCostFC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMSaleCostFC() {
        return mSaleCostFC;
    }

    /**
     * 设置mSaleCostFC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMSaleCostFC(BigDecimal value) {
        this.mSaleCostFC = value;
    }

    /**
     * 获取mSaleCostTC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMSaleCostTC() {
        return mSaleCostTC;
    }

    /**
     * 设置mSaleCostTC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMSaleCostTC(BigDecimal value) {
        this.mSaleCostTC = value;
    }

    /**
     * 获取mSaleOrFYTask属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMSaleOrFYTask() {
        return mSaleOrFYTask;
    }

    /**
     * 设置mSaleOrFYTask属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMSaleOrFYTask(Long value) {
        this.mSaleOrFYTask = value;
    }

    /**
     * 获取mSaleRtnMoney属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMSaleRtnMoney() {
        return mSaleRtnMoney;
    }

    /**
     * 设置mSaleRtnMoney属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMSaleRtnMoney(BigDecimal value) {
        this.mSaleRtnMoney = value;
    }

    /**
     * 获取mSeibanAlterable属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMSeibanAlterable() {
        return mSeibanAlterable;
    }

    /**
     * 设置mSeibanAlterable属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMSeibanAlterable(Integer value) {
        this.mSeibanAlterable = value;
    }

    /**
     * 获取mSeibanCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMSeibanCode() {
        return mSeibanCode;
    }

    /**
     * 设置mSeibanCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMSeibanCode(JAXBElement<String> value) {
        this.mSeibanCode = value;
    }

    /**
     * 获取mSettlementFlag属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMSettlementFlag() {
        return mSettlementFlag;
    }

    /**
     * 设置mSettlementFlag属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMSettlementFlag(Boolean value) {
        this.mSettlementFlag = value;
    }

    /**
     * 获取mShip属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9SMShipShipData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9SMShipShipData> getMShip() {
        return mShip;
    }

    /**
     * 设置mShip属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9SMShipShipData }{@code >}
     *     
     */
    public void setMShip(JAXBElement<UFIDAU9SMShipShipData> value) {
        this.mShip = value;
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
     * 获取mShipAdjustPriceLogs属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUFIDAU9SMShipShipAdjustPriceLogData }{@code >}
     *     
     */
    public JAXBElement<ArrayOfUFIDAU9SMShipShipAdjustPriceLogData> getMShipAdjustPriceLogs() {
        return mShipAdjustPriceLogs;
    }

    /**
     * 设置mShipAdjustPriceLogs属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUFIDAU9SMShipShipAdjustPriceLogData }{@code >}
     *     
     */
    public void setMShipAdjustPriceLogs(JAXBElement<ArrayOfUFIDAU9SMShipShipAdjustPriceLogData> value) {
        this.mShipAdjustPriceLogs = value;
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
     * 获取mShipInstalmentTerms属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUFIDAU9SMShipShipInstalmentTermData }{@code >}
     *     
     */
    public JAXBElement<ArrayOfUFIDAU9SMShipShipInstalmentTermData> getMShipInstalmentTerms() {
        return mShipInstalmentTerms;
    }

    /**
     * 设置mShipInstalmentTerms属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUFIDAU9SMShipShipInstalmentTermData }{@code >}
     *     
     */
    public void setMShipInstalmentTerms(JAXBElement<ArrayOfUFIDAU9SMShipShipInstalmentTermData> value) {
        this.mShipInstalmentTerms = value;
    }

    /**
     * 获取mShipLineBalanceRoutes属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUFIDAU9SMShipShipLineBalanceRouteData }{@code >}
     *     
     */
    public JAXBElement<ArrayOfUFIDAU9SMShipShipLineBalanceRouteData> getMShipLineBalanceRoutes() {
        return mShipLineBalanceRoutes;
    }

    /**
     * 设置mShipLineBalanceRoutes属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUFIDAU9SMShipShipLineBalanceRouteData }{@code >}
     *     
     */
    public void setMShipLineBalanceRoutes(JAXBElement<ArrayOfUFIDAU9SMShipShipLineBalanceRouteData> value) {
        this.mShipLineBalanceRoutes = value;
    }

    /**
     * 获取mShipLineCosts属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUFIDAU9SMShipShipLineCostData }{@code >}
     *     
     */
    public JAXBElement<ArrayOfUFIDAU9SMShipShipLineCostData> getMShipLineCosts() {
        return mShipLineCosts;
    }

    /**
     * 设置mShipLineCosts属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUFIDAU9SMShipShipLineCostData }{@code >}
     *     
     */
    public void setMShipLineCosts(JAXBElement<ArrayOfUFIDAU9SMShipShipLineCostData> value) {
        this.mShipLineCosts = value;
    }

    /**
     * 获取mShipLineDiscounts属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUFIDAU9SMShipShipLineDiscountData }{@code >}
     *     
     */
    public JAXBElement<ArrayOfUFIDAU9SMShipShipLineDiscountData> getMShipLineDiscounts() {
        return mShipLineDiscounts;
    }

    /**
     * 设置mShipLineDiscounts属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUFIDAU9SMShipShipLineDiscountData }{@code >}
     *     
     */
    public void setMShipLineDiscounts(JAXBElement<ArrayOfUFIDAU9SMShipShipLineDiscountData> value) {
        this.mShipLineDiscounts = value;
    }

    /**
     * 获取mShipLineLocations属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUFIDAU9SMShipShipLineLocationData }{@code >}
     *     
     */
    public JAXBElement<ArrayOfUFIDAU9SMShipShipLineLocationData> getMShipLineLocations() {
        return mShipLineLocations;
    }

    /**
     * 设置mShipLineLocations属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUFIDAU9SMShipShipLineLocationData }{@code >}
     *     
     */
    public void setMShipLineLocations(JAXBElement<ArrayOfUFIDAU9SMShipShipLineLocationData> value) {
        this.mShipLineLocations = value;
    }

    /**
     * 获取mShipLineSubItemExeInfo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUFIDAU9SMShipShipLineSubItemExeInfoData }{@code >}
     *     
     */
    public JAXBElement<ArrayOfUFIDAU9SMShipShipLineSubItemExeInfoData> getMShipLineSubItemExeInfo() {
        return mShipLineSubItemExeInfo;
    }

    /**
     * 设置mShipLineSubItemExeInfo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUFIDAU9SMShipShipLineSubItemExeInfoData }{@code >}
     *     
     */
    public void setMShipLineSubItemExeInfo(JAXBElement<ArrayOfUFIDAU9SMShipShipLineSubItemExeInfoData> value) {
        this.mShipLineSubItemExeInfo = value;
    }

    /**
     * 获取mShipPlanDocNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMShipPlanDocNo() {
        return mShipPlanDocNo;
    }

    /**
     * 设置mShipPlanDocNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMShipPlanDocNo(JAXBElement<String> value) {
        this.mShipPlanDocNo = value;
    }

    /**
     * 获取mShipPlanID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMShipPlanID() {
        return mShipPlanID;
    }

    /**
     * 设置mShipPlanID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMShipPlanID(Long value) {
        this.mShipPlanID = value;
    }

    /**
     * 获取mShipPlanLineDocLineNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMShipPlanLineDocLineNo() {
        return mShipPlanLineDocLineNo;
    }

    /**
     * 设置mShipPlanLineDocLineNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMShipPlanLineDocLineNo(Integer value) {
        this.mShipPlanLineDocLineNo = value;
    }

    /**
     * 获取mShipPlanLineID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMShipPlanLineID() {
        return mShipPlanLineID;
    }

    /**
     * 设置mShipPlanLineID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMShipPlanLineID(Long value) {
        this.mShipPlanLineID = value;
    }

    /**
     * 获取mShipPriceLog属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUFIDAU9SMShipShipPriceLogData }{@code >}
     *     
     */
    public JAXBElement<ArrayOfUFIDAU9SMShipShipPriceLogData> getMShipPriceLog() {
        return mShipPriceLog;
    }

    /**
     * 设置mShipPriceLog属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUFIDAU9SMShipShipPriceLogData }{@code >}
     *     
     */
    public void setMShipPriceLog(JAXBElement<ArrayOfUFIDAU9SMShipShipPriceLogData> value) {
        this.mShipPriceLog = value;
    }

    /**
     * 获取mShipQtyCostAmount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMShipQtyCostAmount() {
        return mShipQtyCostAmount;
    }

    /**
     * 设置mShipQtyCostAmount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMShipQtyCostAmount(BigDecimal value) {
        this.mShipQtyCostAmount = value;
    }

    /**
     * 获取mShipQtyInvAmount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMShipQtyInvAmount() {
        return mShipQtyInvAmount;
    }

    /**
     * 设置mShipQtyInvAmount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMShipQtyInvAmount(BigDecimal value) {
        this.mShipQtyInvAmount = value;
    }

    /**
     * 获取mShipQtyTBUAmount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMShipQtyTBUAmount() {
        return mShipQtyTBUAmount;
    }

    /**
     * 设置mShipQtyTBUAmount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMShipQtyTBUAmount(BigDecimal value) {
        this.mShipQtyTBUAmount = value;
    }

    /**
     * 获取mShipQtyTUAmount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMShipQtyTUAmount() {
        return mShipQtyTUAmount;
    }

    /**
     * 设置mShipQtyTUAmount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMShipQtyTUAmount(BigDecimal value) {
        this.mShipQtyTUAmount = value;
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
     * 获取mShipToSite属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOSCMCustomerCustomerSiteMISCInfoData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9CBOSCMCustomerCustomerSiteMISCInfoData> getMShipToSite() {
        return mShipToSite;
    }

    /**
     * 设置mShipToSite属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOSCMCustomerCustomerSiteMISCInfoData }{@code >}
     *     
     */
    public void setMShipToSite(JAXBElement<UFIDAU9CBOSCMCustomerCustomerSiteMISCInfoData> value) {
        this.mShipToSite = value;
    }

    /**
     * 获取mShipTogetherFlag属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMShipTogetherFlag() {
        return mShipTogetherFlag;
    }

    /**
     * 设置mShipTogetherFlag属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMShipTogetherFlag(Integer value) {
        this.mShipTogetherFlag = value;
    }

    /**
     * 获取mShippingQtyIU属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMShippingQtyIU() {
        return mShippingQtyIU;
    }

    /**
     * 设置mShippingQtyIU属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMShippingQtyIU(BigDecimal value) {
        this.mShippingQtyIU = value;
    }

    /**
     * 获取mSignInDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMSignInDate() {
        return mSignInDate;
    }

    /**
     * 设置mSignInDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMSignInDate(XMLGregorianCalendar value) {
        this.mSignInDate = value;
    }

    /**
     * 获取mSignInQtyOfProItem属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMSignInQtyOfProItem() {
        return mSignInQtyOfProItem;
    }

    /**
     * 设置mSignInQtyOfProItem属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMSignInQtyOfProItem(BigDecimal value) {
        this.mSignInQtyOfProItem = value;
    }

    /**
     * 获取mSignInTUPUConvRatio属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMSignInTUPUConvRatio() {
        return mSignInTUPUConvRatio;
    }

    /**
     * 设置mSignInTUPUConvRatio属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMSignInTUPUConvRatio(BigDecimal value) {
        this.mSignInTUPUConvRatio = value;
    }

    /**
     * 获取mSignInTotalMoneyAC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMSignInTotalMoneyAC() {
        return mSignInTotalMoneyAC;
    }

    /**
     * 设置mSignInTotalMoneyAC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMSignInTotalMoneyAC(BigDecimal value) {
        this.mSignInTotalMoneyAC = value;
    }

    /**
     * 获取mSignInTotalMoneyFC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMSignInTotalMoneyFC() {
        return mSignInTotalMoneyFC;
    }

    /**
     * 设置mSignInTotalMoneyFC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMSignInTotalMoneyFC(BigDecimal value) {
        this.mSignInTotalMoneyFC = value;
    }

    /**
     * 获取mSignInTotalMoneyNoTax属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMSignInTotalMoneyNoTax() {
        return mSignInTotalMoneyNoTax;
    }

    /**
     * 设置mSignInTotalMoneyNoTax属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMSignInTotalMoneyNoTax(BigDecimal value) {
        this.mSignInTotalMoneyNoTax = value;
    }

    /**
     * 获取mSignInTotalMoneyNoTaxFC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMSignInTotalMoneyNoTaxFC() {
        return mSignInTotalMoneyNoTaxFC;
    }

    /**
     * 设置mSignInTotalMoneyNoTaxFC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMSignInTotalMoneyNoTaxFC(BigDecimal value) {
        this.mSignInTotalMoneyNoTaxFC = value;
    }

    /**
     * 获取mSignInTotalMoneyNoTaxTC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMSignInTotalMoneyNoTaxTC() {
        return mSignInTotalMoneyNoTaxTC;
    }

    /**
     * 设置mSignInTotalMoneyNoTaxTC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMSignInTotalMoneyNoTaxTC(BigDecimal value) {
        this.mSignInTotalMoneyNoTaxTC = value;
    }

    /**
     * 获取mSignInTotalMoneyTC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMSignInTotalMoneyTC() {
        return mSignInTotalMoneyTC;
    }

    /**
     * 设置mSignInTotalMoneyTC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMSignInTotalMoneyTC(BigDecimal value) {
        this.mSignInTotalMoneyTC = value;
    }

    /**
     * 获取mSignInTotalTax属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMSignInTotalTax() {
        return mSignInTotalTax;
    }

    /**
     * 设置mSignInTotalTax属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMSignInTotalTax(BigDecimal value) {
        this.mSignInTotalTax = value;
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
     * 获取mSnCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMSnCode() {
        return mSnCode;
    }

    /**
     * 设置mSnCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMSnCode(JAXBElement<String> value) {
        this.mSnCode = value;
    }

    /**
     * 获取mSrcCooperateOrg属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMSrcCooperateOrg() {
        return mSrcCooperateOrg;
    }

    /**
     * 设置mSrcCooperateOrg属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMSrcCooperateOrg(Long value) {
        this.mSrcCooperateOrg = value;
    }

    /**
     * 获取mSrcCooperateShipLine属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMSrcCooperateShipLine() {
        return mSrcCooperateShipLine;
    }

    /**
     * 设置mSrcCooperateShipLine属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMSrcCooperateShipLine(Long value) {
        this.mSrcCooperateShipLine = value;
    }

    /**
     * 获取mSrcCooperateType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMSrcCooperateType() {
        return mSrcCooperateType;
    }

    /**
     * 设置mSrcCooperateType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMSrcCooperateType(Integer value) {
        this.mSrcCooperateType = value;
    }

    /**
     * 获取mSrcDocDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMSrcDocDate() {
        return mSrcDocDate;
    }

    /**
     * 设置mSrcDocDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMSrcDocDate(XMLGregorianCalendar value) {
        this.mSrcDocDate = value;
    }

    /**
     * 获取mSrcDocKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMSrcDocKey() {
        return mSrcDocKey;
    }

    /**
     * 设置mSrcDocKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMSrcDocKey(Long value) {
        this.mSrcDocKey = value;
    }

    /**
     * 获取mSrcDocLineKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMSrcDocLineKey() {
        return mSrcDocLineKey;
    }

    /**
     * 设置mSrcDocLineKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMSrcDocLineKey(Long value) {
        this.mSrcDocLineKey = value;
    }

    /**
     * 获取mSrcDocLineNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMSrcDocLineNo() {
        return mSrcDocLineNo;
    }

    /**
     * 设置mSrcDocLineNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMSrcDocLineNo(Integer value) {
        this.mSrcDocLineNo = value;
    }

    /**
     * 获取mSrcDocNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMSrcDocNo() {
        return mSrcDocNo;
    }

    /**
     * 设置mSrcDocNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMSrcDocNo(JAXBElement<String> value) {
        this.mSrcDocNo = value;
    }

    /**
     * 获取mSrcDocPriceTC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMSrcDocPriceTC() {
        return mSrcDocPriceTC;
    }

    /**
     * 设置mSrcDocPriceTC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMSrcDocPriceTC(BigDecimal value) {
        this.mSrcDocPriceTC = value;
    }

    /**
     * 获取mSrcDocSubLineKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMSrcDocSubLineKey() {
        return mSrcDocSubLineKey;
    }

    /**
     * 设置mSrcDocSubLineKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMSrcDocSubLineKey(Long value) {
        this.mSrcDocSubLineKey = value;
    }

    /**
     * 获取mSrcDocSubLineNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMSrcDocSubLineNo() {
        return mSrcDocSubLineNo;
    }

    /**
     * 设置mSrcDocSubLineNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMSrcDocSubLineNo(Integer value) {
        this.mSrcDocSubLineNo = value;
    }

    /**
     * 获取mSrcDocTransType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMSrcDocTransType() {
        return mSrcDocTransType;
    }

    /**
     * 设置mSrcDocTransType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMSrcDocTransType(Long value) {
        this.mSrcDocTransType = value;
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
     * 获取mSrcDocVer属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMSrcDocVer() {
        return mSrcDocVer;
    }

    /**
     * 设置mSrcDocVer属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMSrcDocVer(Integer value) {
        this.mSrcDocVer = value;
    }

    /**
     * 获取mSrcKitLineNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMSrcKitLineNo() {
        return mSrcKitLineNo;
    }

    /**
     * 设置mSrcKitLineNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMSrcKitLineNo(JAXBElement<String> value) {
        this.mSrcKitLineNo = value;
    }

    /**
     * 获取mSrcRcv属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMSrcRcv() {
        return mSrcRcv;
    }

    /**
     * 设置mSrcRcv属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMSrcRcv(Long value) {
        this.mSrcRcv = value;
    }

    /**
     * 获取mSrcRcvLine属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMSrcRcvLine() {
        return mSrcRcvLine;
    }

    /**
     * 设置mSrcRcvLine属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMSrcRcvLine(Long value) {
        this.mSrcRcvLine = value;
    }

    /**
     * 获取mSrcRcvOrg属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMSrcRcvOrg() {
        return mSrcRcvOrg;
    }

    /**
     * 设置mSrcRcvOrg属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMSrcRcvOrg(Long value) {
        this.mSrcRcvOrg = value;
    }

    /**
     * 获取mSrcSysVersion属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMSrcSysVersion() {
        return mSrcSysVersion;
    }

    /**
     * 设置mSrcSysVersion属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMSrcSysVersion(Long value) {
        this.mSrcSysVersion = value;
    }

    /**
     * 获取mStateMachineID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMStateMachineID() {
        return mStateMachineID;
    }

    /**
     * 设置mStateMachineID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMStateMachineID(String value) {
        this.mStateMachineID = value;
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
     * 获取mStickBrandCustomer属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMStickBrandCustomer() {
        return mStickBrandCustomer;
    }

    /**
     * 设置mStickBrandCustomer属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMStickBrandCustomer(JAXBElement<String> value) {
        this.mStickBrandCustomer = value;
    }

    /**
     * 获取mStickBrandItemCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMStickBrandItemCode() {
        return mStickBrandItemCode;
    }

    /**
     * 设置mStickBrandItemCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMStickBrandItemCode(JAXBElement<String> value) {
        this.mStickBrandItemCode = value;
    }

    /**
     * 获取mStickBrandItemName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMStickBrandItemName() {
        return mStickBrandItemName;
    }

    /**
     * 设置mStickBrandItemName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMStickBrandItemName(JAXBElement<String> value) {
        this.mStickBrandItemName = value;
    }

    /**
     * 获取mStorageType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMStorageType() {
        return mStorageType;
    }

    /**
     * 设置mStorageType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMStorageType(Integer value) {
        this.mStorageType = value;
    }

    /**
     * 获取mStoreArk属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMStoreArk() {
        return mStoreArk;
    }

    /**
     * 设置mStoreArk属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMStoreArk(BigDecimal value) {
        this.mStoreArk = value;
    }

    /**
     * 获取mSubItemCostRate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMSubItemCostRate() {
        return mSubItemCostRate;
    }

    /**
     * 设置mSubItemCostRate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMSubItemCostRate(BigDecimal value) {
        this.mSubItemCostRate = value;
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
     * 获取mSystemPrice属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMSystemPrice() {
        return mSystemPrice;
    }

    /**
     * 设置mSystemPrice属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMSystemPrice(BigDecimal value) {
        this.mSystemPrice = value;
    }

    /**
     * 获取mSystemPriceTC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMSystemPriceTC() {
        return mSystemPriceTC;
    }

    /**
     * 设置mSystemPriceTC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMSystemPriceTC(BigDecimal value) {
        this.mSystemPriceTC = value;
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
     * 获取mtucuConvRatio属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMTUCUConvRatio() {
        return mtucuConvRatio;
    }

    /**
     * 设置mtucuConvRatio属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMTUCUConvRatio(BigDecimal value) {
        this.mtucuConvRatio = value;
    }

    /**
     * 获取mtuInvConvRatio属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMTUInvConvRatio() {
        return mtuInvConvRatio;
    }

    /**
     * 设置mtuInvConvRatio属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMTUInvConvRatio(BigDecimal value) {
        this.mtuInvConvRatio = value;
    }

    /**
     * 获取mtupuConvRatio属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMTUPUConvRatio() {
        return mtupuConvRatio;
    }

    /**
     * 设置mtupuConvRatio属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMTUPUConvRatio(BigDecimal value) {
        this.mtupuConvRatio = value;
    }

    /**
     * 获取mTaskQtyIU属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMTaskQtyIU() {
        return mTaskQtyIU;
    }

    /**
     * 设置mTaskQtyIU属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMTaskQtyIU(BigDecimal value) {
        this.mTaskQtyIU = value;
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
     * 获取mTaxRate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMTaxRate() {
        return mTaxRate;
    }

    /**
     * 设置mTaxRate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMTaxRate(BigDecimal value) {
        this.mTaxRate = value;
    }

    /**
     * 获取mTotalARMoney属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMTotalARMoney() {
        return mTotalARMoney;
    }

    /**
     * 设置mTotalARMoney属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMTotalARMoney(BigDecimal value) {
        this.mTotalARMoney = value;
    }

    /**
     * 获取mTotalARMoneyTC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMTotalARMoneyTC() {
        return mTotalARMoneyTC;
    }

    /**
     * 设置mTotalARMoneyTC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMTotalARMoneyTC(BigDecimal value) {
        this.mTotalARMoneyTC = value;
    }

    /**
     * 获取mTotalARQtyPriceAmount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMTotalARQtyPriceAmount() {
        return mTotalARQtyPriceAmount;
    }

    /**
     * 设置mTotalARQtyPriceAmount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMTotalARQtyPriceAmount(BigDecimal value) {
        this.mTotalARQtyPriceAmount = value;
    }

    /**
     * 获取mTotalARQtyTBUAmount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMTotalARQtyTBUAmount() {
        return mTotalARQtyTBUAmount;
    }

    /**
     * 设置mTotalARQtyTBUAmount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMTotalARQtyTBUAmount(BigDecimal value) {
        this.mTotalARQtyTBUAmount = value;
    }

    /**
     * 获取mTotalARQtyTUAmount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMTotalARQtyTUAmount() {
        return mTotalARQtyTUAmount;
    }

    /**
     * 设置mTotalARQtyTUAmount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMTotalARQtyTUAmount(BigDecimal value) {
        this.mTotalARQtyTUAmount = value;
    }

    /**
     * 获取mTotalAccountMoney属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMTotalAccountMoney() {
        return mTotalAccountMoney;
    }

    /**
     * 设置mTotalAccountMoney属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMTotalAccountMoney(BigDecimal value) {
        this.mTotalAccountMoney = value;
    }

    /**
     * 获取mTotalAccountMoneyTC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMTotalAccountMoneyTC() {
        return mTotalAccountMoneyTC;
    }

    /**
     * 设置mTotalAccountMoneyTC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMTotalAccountMoneyTC(BigDecimal value) {
        this.mTotalAccountMoneyTC = value;
    }

    /**
     * 获取mTotalAccountQtyPriceAmount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMTotalAccountQtyPriceAmount() {
        return mTotalAccountQtyPriceAmount;
    }

    /**
     * 设置mTotalAccountQtyPriceAmount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMTotalAccountQtyPriceAmount(BigDecimal value) {
        this.mTotalAccountQtyPriceAmount = value;
    }

    /**
     * 获取mTotalAccountQtyTBUAmount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMTotalAccountQtyTBUAmount() {
        return mTotalAccountQtyTBUAmount;
    }

    /**
     * 设置mTotalAccountQtyTBUAmount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMTotalAccountQtyTBUAmount(BigDecimal value) {
        this.mTotalAccountQtyTBUAmount = value;
    }

    /**
     * 获取mTotalAccountQtyTUAmount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMTotalAccountQtyTUAmount() {
        return mTotalAccountQtyTUAmount;
    }

    /**
     * 设置mTotalAccountQtyTUAmount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMTotalAccountQtyTUAmount(BigDecimal value) {
        this.mTotalAccountQtyTUAmount = value;
    }

    /**
     * 获取mTotalCAQtyPU属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMTotalCAQtyPU() {
        return mTotalCAQtyPU;
    }

    /**
     * 设置mTotalCAQtyPU属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMTotalCAQtyPU(BigDecimal value) {
        this.mTotalCAQtyPU = value;
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
     * 获取mTotalInvoiceMoney属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMTotalInvoiceMoney() {
        return mTotalInvoiceMoney;
    }

    /**
     * 设置mTotalInvoiceMoney属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMTotalInvoiceMoney(BigDecimal value) {
        this.mTotalInvoiceMoney = value;
    }

    /**
     * 获取mTotalInvoiceMoneyTC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMTotalInvoiceMoneyTC() {
        return mTotalInvoiceMoneyTC;
    }

    /**
     * 设置mTotalInvoiceMoneyTC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMTotalInvoiceMoneyTC(BigDecimal value) {
        this.mTotalInvoiceMoneyTC = value;
    }

    /**
     * 获取mTotalInvoiceQtyPriceAmount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMTotalInvoiceQtyPriceAmount() {
        return mTotalInvoiceQtyPriceAmount;
    }

    /**
     * 设置mTotalInvoiceQtyPriceAmount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMTotalInvoiceQtyPriceAmount(BigDecimal value) {
        this.mTotalInvoiceQtyPriceAmount = value;
    }

    /**
     * 获取mTotalInvoiceQtyTBUAmount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMTotalInvoiceQtyTBUAmount() {
        return mTotalInvoiceQtyTBUAmount;
    }

    /**
     * 设置mTotalInvoiceQtyTBUAmount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMTotalInvoiceQtyTBUAmount(BigDecimal value) {
        this.mTotalInvoiceQtyTBUAmount = value;
    }

    /**
     * 获取mTotalInvoiceQtyTUAmount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMTotalInvoiceQtyTUAmount() {
        return mTotalInvoiceQtyTUAmount;
    }

    /**
     * 设置mTotalInvoiceQtyTUAmount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMTotalInvoiceQtyTUAmount(BigDecimal value) {
        this.mTotalInvoiceQtyTUAmount = value;
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
     * 获取mTotalNetMoney属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMTotalNetMoney() {
        return mTotalNetMoney;
    }

    /**
     * 设置mTotalNetMoney属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMTotalNetMoney(BigDecimal value) {
        this.mTotalNetMoney = value;
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
     * 获取mTotalPPMoney属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMTotalPPMoney() {
        return mTotalPPMoney;
    }

    /**
     * 设置mTotalPPMoney属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMTotalPPMoney(BigDecimal value) {
        this.mTotalPPMoney = value;
    }

    /**
     * 获取mTotalRPMoney属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMTotalRPMoney() {
        return mTotalRPMoney;
    }

    /**
     * 设置mTotalRPMoney属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMTotalRPMoney(BigDecimal value) {
        this.mTotalRPMoney = value;
    }

    /**
     * 获取mTotalRefillQtyIUAmount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMTotalRefillQtyIUAmount() {
        return mTotalRefillQtyIUAmount;
    }

    /**
     * 设置mTotalRefillQtyIUAmount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMTotalRefillQtyIUAmount(BigDecimal value) {
        this.mTotalRefillQtyIUAmount = value;
    }

    /**
     * 获取mTotalRefillQtyPriceAmount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMTotalRefillQtyPriceAmount() {
        return mTotalRefillQtyPriceAmount;
    }

    /**
     * 设置mTotalRefillQtyPriceAmount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMTotalRefillQtyPriceAmount(BigDecimal value) {
        this.mTotalRefillQtyPriceAmount = value;
    }

    /**
     * 获取mTotalRefillQtyTBUAmount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMTotalRefillQtyTBUAmount() {
        return mTotalRefillQtyTBUAmount;
    }

    /**
     * 设置mTotalRefillQtyTBUAmount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMTotalRefillQtyTBUAmount(BigDecimal value) {
        this.mTotalRefillQtyTBUAmount = value;
    }

    /**
     * 获取mTotalRefillQtyTUAmount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMTotalRefillQtyTUAmount() {
        return mTotalRefillQtyTUAmount;
    }

    /**
     * 设置mTotalRefillQtyTUAmount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMTotalRefillQtyTUAmount(BigDecimal value) {
        this.mTotalRefillQtyTUAmount = value;
    }

    /**
     * 获取mTotalRtnDeductMoney属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMTotalRtnDeductMoney() {
        return mTotalRtnDeductMoney;
    }

    /**
     * 设置mTotalRtnDeductMoney属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMTotalRtnDeductMoney(BigDecimal value) {
        this.mTotalRtnDeductMoney = value;
    }

    /**
     * 获取mTotalRtnDeductMoneyTC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMTotalRtnDeductMoneyTC() {
        return mTotalRtnDeductMoneyTC;
    }

    /**
     * 设置mTotalRtnDeductMoneyTC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMTotalRtnDeductMoneyTC(BigDecimal value) {
        this.mTotalRtnDeductMoneyTC = value;
    }

    /**
     * 获取mTotalRtnDeductQtyPriceAmount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMTotalRtnDeductQtyPriceAmount() {
        return mTotalRtnDeductQtyPriceAmount;
    }

    /**
     * 设置mTotalRtnDeductQtyPriceAmount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMTotalRtnDeductQtyPriceAmount(BigDecimal value) {
        this.mTotalRtnDeductQtyPriceAmount = value;
    }

    /**
     * 获取mTotalRtnDeductQtyTBUAmount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMTotalRtnDeductQtyTBUAmount() {
        return mTotalRtnDeductQtyTBUAmount;
    }

    /**
     * 设置mTotalRtnDeductQtyTBUAmount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMTotalRtnDeductQtyTBUAmount(BigDecimal value) {
        this.mTotalRtnDeductQtyTBUAmount = value;
    }

    /**
     * 获取mTotalRtnDeductQtyTUAmount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMTotalRtnDeductQtyTUAmount() {
        return mTotalRtnDeductQtyTUAmount;
    }

    /**
     * 设置mTotalRtnDeductQtyTUAmount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMTotalRtnDeductQtyTUAmount(BigDecimal value) {
        this.mTotalRtnDeductQtyTUAmount = value;
    }

    /**
     * 获取mTotalRtnFillMoney属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMTotalRtnFillMoney() {
        return mTotalRtnFillMoney;
    }

    /**
     * 设置mTotalRtnFillMoney属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMTotalRtnFillMoney(BigDecimal value) {
        this.mTotalRtnFillMoney = value;
    }

    /**
     * 获取mTotalRtnFillMoneyTC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMTotalRtnFillMoneyTC() {
        return mTotalRtnFillMoneyTC;
    }

    /**
     * 设置mTotalRtnFillMoneyTC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMTotalRtnFillMoneyTC(BigDecimal value) {
        this.mTotalRtnFillMoneyTC = value;
    }

    /**
     * 获取mTotalRtnFillQtyPriceAmount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMTotalRtnFillQtyPriceAmount() {
        return mTotalRtnFillQtyPriceAmount;
    }

    /**
     * 设置mTotalRtnFillQtyPriceAmount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMTotalRtnFillQtyPriceAmount(BigDecimal value) {
        this.mTotalRtnFillQtyPriceAmount = value;
    }

    /**
     * 获取mTotalRtnFillQtyTBUAmount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMTotalRtnFillQtyTBUAmount() {
        return mTotalRtnFillQtyTBUAmount;
    }

    /**
     * 设置mTotalRtnFillQtyTBUAmount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMTotalRtnFillQtyTBUAmount(BigDecimal value) {
        this.mTotalRtnFillQtyTBUAmount = value;
    }

    /**
     * 获取mTotalRtnFillQtyTUAmount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMTotalRtnFillQtyTUAmount() {
        return mTotalRtnFillQtyTUAmount;
    }

    /**
     * 设置mTotalRtnFillQtyTUAmount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMTotalRtnFillQtyTUAmount(BigDecimal value) {
        this.mTotalRtnFillQtyTUAmount = value;
    }

    /**
     * 获取mTotalSignInQtyPU属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMTotalSignInQtyPU() {
        return mTotalSignInQtyPU;
    }

    /**
     * 设置mTotalSignInQtyPU属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMTotalSignInQtyPU(BigDecimal value) {
        this.mTotalSignInQtyPU = value;
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
     * 获取mTradeRatetoBase属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMTradeRatetoBase() {
        return mTradeRatetoBase;
    }

    /**
     * 设置mTradeRatetoBase属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMTradeRatetoBase(BigDecimal value) {
        this.mTradeRatetoBase = value;
    }

    /**
     * 获取mTradeUom2ToTRadeUom2Associate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMTradeUom2ToTRadeUom2Associate() {
        return mTradeUom2ToTRadeUom2Associate;
    }

    /**
     * 设置mTradeUom2ToTRadeUom2Associate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMTradeUom2ToTRadeUom2Associate(BigDecimal value) {
        this.mTradeUom2ToTRadeUom2Associate = value;
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
     * 获取mvmi属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMVMI() {
        return mvmi;
    }

    /**
     * 设置mvmi属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMVMI(Boolean value) {
        this.mvmi = value;
    }

    /**
     * 获取mVolume属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMVolume() {
        return mVolume;
    }

    /**
     * 设置mVolume属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMVolume(BigDecimal value) {
        this.mVolume = value;
    }

    /**
     * 获取mVoucherID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMVoucherID() {
        return mVoucherID;
    }

    /**
     * 设置mVoucherID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMVoucherID(Long value) {
        this.mVoucherID = value;
    }

    /**
     * 获取mVoucherNO属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMVoucherNO() {
        return mVoucherNO;
    }

    /**
     * 设置mVoucherNO属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMVoucherNO(JAXBElement<String> value) {
        this.mVoucherNO = value;
    }

    /**
     * 获取mVoucherTypeID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMVoucherTypeID() {
        return mVoucherTypeID;
    }

    /**
     * 设置mVoucherTypeID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMVoucherTypeID(Long value) {
        this.mVoucherTypeID = value;
    }

    /**
     * 获取mWeight属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMWeight() {
        return mWeight;
    }

    /**
     * 设置mWeight属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMWeight(BigDecimal value) {
        this.mWeight = value;
    }

}
