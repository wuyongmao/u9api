
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
 * &lt;p&gt;UFIDA.U9.SM.Ship.ShipLineData complex type�� Java �ࡣ
 * 
 * &lt;p&gt;����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡassociatedParent���Ե�ֵ��
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
     * ����associatedParent���Ե�ֵ��
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
     * ��ȡassociatedParentSKey���Ե�ֵ��
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
     * ����associatedParentSKey���Ե�ֵ��
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
     * ��ȡbalanceRoute���Ե�ֵ��
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
     * ����balanceRoute���Ե�ֵ��
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
     * ��ȡbalanceRouteSKey���Ե�ֵ��
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
     * ����balanceRouteSKey���Ե�ֵ��
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
     * ��ȡbomOwner���Ե�ֵ��
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
     * ����bomOwner���Ե�ֵ��
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
     * ��ȡbomOwnerSKey���Ե�ֵ��
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
     * ����bomOwnerSKey���Ե�ֵ��
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
     * ��ȡcc���Ե�ֵ��
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
     * ����cc���Ե�ֵ��
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
     * ��ȡccsKey���Ե�ֵ��
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
     * ����ccsKey���Ե�ֵ��
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
     * ��ȡclosePeriod���Ե�ֵ��
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
     * ����closePeriod���Ե�ֵ��
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
     * ��ȡclosePeriodSKey���Ե�ֵ��
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
     * ����closePeriodSKey���Ե�ֵ��
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
     * ��ȡcompensationPBU���Ե�ֵ��
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
     * ����compensationPBU���Ե�ֵ��
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
     * ��ȡcompensationPBUSKey���Ե�ֵ��
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
     * ����compensationPBUSKey���Ե�ֵ��
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
     * ��ȡcompensationPU���Ե�ֵ��
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
     * ����compensationPU���Ե�ֵ��
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
     * ��ȡcompensationPUSKey���Ե�ֵ��
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
     * ����compensationPUSKey���Ե�ֵ��
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
     * ��ȡcontractOwnedOrg���Ե�ֵ��
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
     * ����contractOwnedOrg���Ե�ֵ��
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
     * ��ȡcontractOwnedOrgSKey���Ե�ֵ��
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
     * ����contractOwnedOrgSKey���Ե�ֵ��
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
     * ��ȡcostBaseUom���Ե�ֵ��
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
     * ����costBaseUom���Ե�ֵ��
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
     * ��ȡcostBaseUomSKey���Ե�ֵ��
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
     * ����costBaseUomSKey���Ե�ֵ��
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
     * ��ȡcostUom���Ե�ֵ��
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
     * ����costUom���Ե�ֵ��
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
     * ��ȡcostUomSKey���Ե�ֵ��
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
     * ����costUomSKey���Ե�ֵ��
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
     * ��ȡhandleDept���Ե�ֵ��
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
     * ����handleDept���Ե�ֵ��
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
     * ��ȡhandleDeptSKey���Ե�ֵ��
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
     * ����handleDeptSKey���Ե�ֵ��
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
     * ��ȡinvBaseUom���Ե�ֵ��
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
     * ����invBaseUom���Ե�ֵ��
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
     * ��ȡinvBaseUomSKey���Ե�ֵ��
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
     * ����invBaseUomSKey���Ե�ֵ��
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
     * ��ȡinvMainUOM���Ե�ֵ��
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
     * ����invMainUOM���Ե�ֵ��
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
     * ��ȡinvMainUOMSKey���Ե�ֵ��
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
     * ����invMainUOMSKey���Ե�ֵ��
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
     * ��ȡinvUom���Ե�ֵ��
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
     * ����invUom���Ե�ֵ��
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
     * ��ȡinvUomSKey���Ե�ֵ��
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
     * ����invUomSKey���Ե�ֵ��
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
     * ��ȡkitItemManufacturer���Ե�ֵ��
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
     * ����kitItemManufacturer���Ե�ֵ��
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
     * ��ȡkitItemManufacturerSKey���Ե�ֵ��
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
     * ����kitItemManufacturerSKey���Ե�ֵ��
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
     * ��ȡmanufacturer���Ե�ֵ��
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
     * ����manufacturer���Ե�ֵ��
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
     * ��ȡmanufacturerSKey���Ե�ֵ��
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
     * ����manufacturerSKey���Ե�ֵ��
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
     * ��ȡmaxARPeriod���Ե�ֵ��
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
     * ����maxARPeriod���Ե�ֵ��
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
     * ��ȡmaxARPeriodSKey���Ե�ֵ��
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
     * ����maxARPeriodSKey���Ե�ֵ��
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
     * ��ȡmultiShipLineMemo���Ե�ֵ��
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
     * ����multiShipLineMemo���Ե�ֵ��
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
     * ��ȡmultiSigner���Ե�ֵ��
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
     * ����multiSigner���Ե�ֵ��
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
     * ��ȡorg���Ե�ֵ��
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
     * ����org���Ե�ֵ��
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
     * ��ȡorgSKey���Ե�ֵ��
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
     * ����orgSKey���Ե�ֵ��
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
     * ��ȡoriginalItemBaseUom���Ե�ֵ��
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
     * ����originalItemBaseUom���Ե�ֵ��
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
     * ��ȡoriginalItemBaseUomSKey���Ե�ֵ��
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
     * ����originalItemBaseUomSKey���Ե�ֵ��
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
     * ��ȡoriginalItemUom���Ե�ֵ��
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
     * ����originalItemUom���Ե�ֵ��
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
     * ��ȡoriginalItemUomSKey���Ե�ֵ��
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
     * ����originalItemUomSKey���Ե�ֵ��
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
     * ��ȡoriginalManufacturer���Ե�ֵ��
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
     * ����originalManufacturer���Ե�ֵ��
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
     * ��ȡoriginalManufacturerSKey���Ե�ֵ��
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
     * ����originalManufacturerSKey���Ե�ֵ��
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
     * ��ȡpriceBaseUom���Ե�ֵ��
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
     * ����priceBaseUom���Ե�ֵ��
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
     * ��ȡpriceBaseUomSKey���Ե�ֵ��
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
     * ����priceBaseUomSKey���Ե�ֵ��
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
     * ��ȡpriceUom���Ե�ֵ��
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
     * ����priceUom���Ե�ֵ��
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
     * ��ȡpriceUomSKey���Ե�ֵ��
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
     * ����priceUomSKey���Ե�ֵ��
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
     * ��ȡprocessMFC���Ե�ֵ��
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
     * ����processMFC���Ե�ֵ��
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
     * ��ȡprocessMFCSKey���Ե�ֵ��
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
     * ����processMFCSKey���Ե�ֵ��
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
     * ��ȡprocessSubUOM���Ե�ֵ��
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
     * ����processSubUOM���Ե�ֵ��
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
     * ��ȡprocessSubUOMSKey���Ե�ֵ��
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
     * ����processSubUOMSKey���Ե�ֵ��
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
     * ��ȡprocessUOM���Ե�ֵ��
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
     * ����processUOM���Ե�ֵ��
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
     * ��ȡprocessUOMSKey���Ե�ֵ��
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
     * ����processUOMSKey���Ե�ֵ��
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
     * ��ȡproject���Ե�ֵ��
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
     * ����project���Ե�ֵ��
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
     * ��ȡprojectSKey���Ե�ֵ��
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
     * ����projectSKey���Ե�ֵ��
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
     * ��ȡsoOwnedOrg���Ե�ֵ��
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
     * ����soOwnedOrg���Ե�ֵ��
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
     * ��ȡsoOwnedOrgSKey���Ե�ֵ��
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
     * ����soOwnedOrgSKey���Ե�ֵ��
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
     * ��ȡseiban���Ե�ֵ��
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
     * ����seiban���Ե�ֵ��
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
     * ��ȡseibanSKey���Ե�ֵ��
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
     * ����seibanSKey���Ե�ֵ��
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
     * ��ȡshipLineMemo���Ե�ֵ��
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
     * ����shipLineMemo���Ե�ֵ��
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
     * ��ȡshipPlanOrg���Ե�ֵ��
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
     * ����shipPlanOrg���Ե�ֵ��
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
     * ��ȡshipPlanOrgSKey���Ե�ֵ��
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
     * ����shipPlanOrgSKey���Ե�ֵ��
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
     * ��ȡshipSKey���Ե�ֵ��
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
     * ����shipSKey���Ե�ֵ��
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
     * ��ȡshipperOrg���Ե�ֵ��
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
     * ����shipperOrg���Ե�ֵ��
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
     * ��ȡshipperOrgSKey���Ե�ֵ��
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
     * ����shipperOrgSKey���Ե�ֵ��
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
     * ��ȡsigner���Ե�ֵ��
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
     * ����signer���Ե�ֵ��
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
     * ��ȡsrcDocOwnedOrg���Ե�ֵ��
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
     * ����srcDocOwnedOrg���Ե�ֵ��
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
     * ��ȡsrcDocOwnedOrgSKey���Ե�ֵ��
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
     * ����srcDocOwnedOrgSKey���Ե�ֵ��
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
     * ��ȡstageWH���Ե�ֵ��
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
     * ����stageWH���Ե�ֵ��
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
     * ��ȡstageWHSKey���Ե�ֵ��
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
     * ����stageWHSKey���Ե�ֵ��
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
     * ��ȡtask���Ե�ֵ��
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
     * ����task���Ե�ֵ��
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
     * ��ȡtaskSKey���Ե�ֵ��
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
     * ����taskSKey���Ե�ֵ��
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
     * ��ȡtradPath���Ե�ֵ��
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
     * ����tradPath���Ե�ֵ��
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
     * ��ȡtradPathSKey���Ե�ֵ��
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
     * ����tradPathSKey���Ե�ֵ��
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
     * ��ȡtradeBaseUom���Ե�ֵ��
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
     * ����tradeBaseUom���Ե�ֵ��
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
     * ��ȡtradeBaseUomSKey���Ե�ֵ��
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
     * ����tradeBaseUomSKey���Ե�ֵ��
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
     * ��ȡtradeUom���Ե�ֵ��
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
     * ����tradeUom���Ե�ֵ��
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
     * ��ȡtradeUom2���Ե�ֵ��
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
     * ����tradeUom2���Ե�ֵ��
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
     * ��ȡtradeUom2Associate���Ե�ֵ��
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
     * ����tradeUom2Associate���Ե�ֵ��
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
     * ��ȡtradeUom2AssociateSKey���Ե�ֵ��
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
     * ����tradeUom2AssociateSKey���Ե�ֵ��
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
     * ��ȡtradeUom2SKey���Ե�ֵ��
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
     * ����tradeUom2SKey���Ե�ֵ��
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
     * ��ȡtradeUomSKey���Ե�ֵ��
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
     * ����tradeUomSKey���Ե�ֵ��
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
     * ��ȡvolumeUom���Ե�ֵ��
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
     * ����volumeUom���Ե�ֵ��
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
     * ��ȡvolumeUomSKey���Ե�ֵ��
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
     * ����volumeUomSKey���Ե�ֵ��
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
     * ��ȡweightUom���Ե�ֵ��
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
     * ����weightUom���Ե�ֵ��
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
     * ��ȡweightUomSKey���Ե�ֵ��
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
     * ����weightUomSKey���Ե�ֵ��
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
     * ��ȡwhMan���Ե�ֵ��
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
     * ����whMan���Ե�ֵ��
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
     * ��ȡwhManSKey���Ե�ֵ��
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
     * ����whManSKey���Ե�ֵ��
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
     * ��ȡmaaiStatus���Ե�ֵ��
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
     * ����maaiStatus���Ե�ֵ��
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
     * ��ȡmacToCCExchRate���Ե�ֵ��
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
     * ����macToCCExchRate���Ե�ֵ��
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
     * ��ȡmacToCCExchRateType���Ե�ֵ��
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
     * ����macToCCExchRateType���Ե�ֵ��
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
     * ��ȡmarMoney���Ե�ֵ��
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
     * ����marMoney���Ե�ֵ��
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
     * ��ȡmarQtyPriceAmount���Ե�ֵ��
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
     * ����marQtyPriceAmount���Ե�ֵ��
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
     * ��ȡmarQtyTBUAmount���Ե�ֵ��
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
     * ����marQtyTBUAmount���Ե�ֵ��
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
     * ��ȡmarQtyTUAmount���Ե�ֵ��
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
     * ����marQtyTUAmount���Ե�ֵ��
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
     * ��ȡmAdjustPriceDate���Ե�ֵ��
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
     * ����mAdjustPriceDate���Ե�ֵ��
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
     * ��ȡmAdjustPricePerson���Ե�ֵ��
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
     * ����mAdjustPricePerson���Ե�ֵ��
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
     * ��ȡmApportionMoney���Ե�ֵ��
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
     * ����mApportionMoney���Ե�ֵ��
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
     * ��ȡmApportionMoneyTC���Ե�ֵ��
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
     * ����mApportionMoneyTC���Ե�ֵ��
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
     * ��ȡmApportionPrice���Ե�ֵ��
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
     * ����mApportionPrice���Ե�ֵ��
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
     * ��ȡmApportionPriceTC���Ե�ֵ��
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
     * ����mApportionPriceTC���Ե�ֵ��
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
     * ��ȡmAssociatedParentID���Ե�ֵ��
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
     * ����mAssociatedParentID���Ե�ֵ��
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
     * ��ȡmAssociatedParentNO���Ե�ֵ��
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
     * ����mAssociatedParentNO���Ե�ֵ��
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
     * ��ȡmBalanceRouteDesc���Ե�ֵ��
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
     * ����mBalanceRouteDesc���Ե�ֵ��
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
     * ��ȡmBillSetCode���Ե�ֵ��
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
     * ����mBillSetCode���Ե�ֵ��
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
     * ��ȡmBomID���Ե�ֵ��
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
     * ����mBomID���Ե�ֵ��
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
     * ��ȡmcaAmountOfProItem���Ե�ֵ��
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
     * ����mcaAmountOfProItem���Ե�ֵ��
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
     * ��ȡmcaDate���Ե�ֵ��
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
     * ����mcaDate���Ե�ֵ��
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
     * ��ȡmcaPriceAC���Ե�ֵ��
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
     * ����mcaPriceAC���Ե�ֵ��
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
     * ��ȡmcaPriceAmount���Ե�ֵ��
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
     * ����mcaPriceAmount���Ե�ֵ��
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
     * ��ȡmcaPriceFC���Ե�ֵ��
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
     * ����mcaPriceFC���Ե�ֵ��
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
     * ��ȡmcaPriceTC���Ե�ֵ��
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
     * ����mcaPriceTC���Ե�ֵ��
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
     * ��ȡmcatbuAmount���Ե�ֵ��
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
     * ����mcatbuAmount���Ե�ֵ��
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
     * ��ȡmcatuAmount���Ե�ֵ��
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
     * ����mcatuAmount���Ե�ֵ��
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
     * ��ȡmcaTotalMoneyAC���Ե�ֵ��
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
     * ����mcaTotalMoneyAC���Ե�ֵ��
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
     * ��ȡmcaTotalMoneyFC���Ե�ֵ��
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
     * ����mcaTotalMoneyFC���Ե�ֵ��
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
     * ��ȡmcaTotalMoneyNoTaxAC���Ե�ֵ��
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
     * ����mcaTotalMoneyNoTaxAC���Ե�ֵ��
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
     * ��ȡmcaTotalMoneyNoTaxFC���Ե�ֵ��
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
     * ����mcaTotalMoneyNoTaxFC���Ե�ֵ��
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
     * ��ȡmcaTotalMoneyNoTaxTC���Ե�ֵ��
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
     * ����mcaTotalMoneyNoTaxTC���Ե�ֵ��
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
     * ��ȡmcaTotalMoneyTC���Ե�ֵ��
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
     * ����mcaTotalMoneyTC���Ե�ֵ��
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
     * ��ȡmccMoney���Ե�ֵ��
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
     * ����mccMoney���Ե�ֵ��
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
     * ��ȡmCanInvoiceMoneyAC���Ե�ֵ��
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
     * ����mCanInvoiceMoneyAC���Ե�ֵ��
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
     * ��ȡmCanInvoiceQtyPU���Ե�ֵ��
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
     * ����mCanInvoiceQtyPU���Ե�ֵ��
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
     * ��ȡmChannel���Ե�ֵ��
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
     * ����mChannel���Ե�ֵ��
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
     * ��ȡmChargeBasis���Ե�ֵ��
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
     * ����mChargeBasis���Ե�ֵ��
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
     * ��ȡmCheckAccountBillLineNo���Ե�ֵ��
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
     * ����mCheckAccountBillLineNo���Ե�ֵ��
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
     * ��ȡmCheckAccountBillNo���Ե�ֵ��
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
     * ����mCheckAccountBillNo���Ե�ֵ��
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
     * ��ȡmCheckAccountTotalTax���Ե�ֵ��
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
     * ����mCheckAccountTotalTax���Ե�ֵ��
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
     * ��ȡmCheckAccountTotalTaxFC���Ե�ֵ��
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
     * ����mCheckAccountTotalTaxFC���Ե�ֵ��
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
     * ��ȡmCheckAccountTotalTaxTC���Ե�ֵ��
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
     * ����mCheckAccountTotalTaxTC���Ե�ֵ��
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
     * ��ȡmCheckAccounter���Ե�ֵ��
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
     * ����mCheckAccounter���Ե�ֵ��
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
     * ��ȡmCompensationPUQty���Ե�ֵ��
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
     * ����mCompensationPUQty���Ե�ֵ��
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
     * ��ȡmCompensationPUToPBURate���Ե�ֵ��
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
     * ����mCompensationPUToPBURate���Ե�ֵ��
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
     * ��ȡmCompensationSUQty���Ե�ֵ��
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
     * ����mCompensationSUQty���Ե�ֵ��
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
     * ��ȡmConfigItem���Ե�ֵ��
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
     * ����mConfigItem���Ե�ֵ��
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
     * ��ȡmConfigResult���Ե�ֵ��
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
     * ����mConfigResult���Ե�ֵ��
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
     * ��ȡmConfirmDate���Ե�ֵ��
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
     * ����mConfirmDate���Ե�ֵ��
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
     * ��ȡmConsumeRtnMnyUnit���Ե�ֵ��
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
     * ����mConsumeRtnMnyUnit���Ե�ֵ��
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
     * ��ȡmContainer���Ե�ֵ��
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
     * ����mContainer���Ե�ֵ��
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
     * ��ȡmContractDate���Ե�ֵ��
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
     * ����mContractDate���Ե�ֵ��
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
     * ��ȡmContractKey���Ե�ֵ��
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
     * ����mContractKey���Ե�ֵ��
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
     * ��ȡmContractLineKey���Ե�ֵ��
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
     * ����mContractLineKey���Ե�ֵ��
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
     * ��ȡmContractLineNo���Ե�ֵ��
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
     * ����mContractLineNo���Ե�ֵ��
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
     * ��ȡmContractNo���Ե�ֵ��
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
     * ����mContractNo���Ե�ֵ��
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
     * ��ȡmContractVer���Ե�ֵ��
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
     * ����mContractVer���Ե�ֵ��
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
     * ��ȡmCostRatetoBase���Ե�ֵ��
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
     * ����mCostRatetoBase���Ե�ֵ��
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
     * ��ȡmCreditObj���Ե�ֵ��
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
     * ����mCreditObj���Ե�ֵ��
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
     * ��ȡmCusSignInQtyInvAmount���Ե�ֵ��
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
     * ����mCusSignInQtyInvAmount���Ե�ֵ��
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
     * ��ȡmCusSignInQtyPriceAmount���Ե�ֵ��
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
     * ����mCusSignInQtyPriceAmount���Ե�ֵ��
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
     * ��ȡmCusSignInQtyTBUAmount���Ե�ֵ��
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
     * ����mCusSignInQtyTBUAmount���Ե�ֵ��
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
     * ��ȡmCusSignInQtyTUAmount���Ե�ֵ��
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
     * ����mCusSignInQtyTUAmount���Ե�ֵ��
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
     * ��ȡmCustomerItemCode���Ե�ֵ��
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
     * ����mCustomerItemCode���Ե�ֵ��
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
     * ��ȡmCustomerItemName���Ե�ֵ��
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
     * ����mCustomerItemName���Ե�ֵ��
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
     * ��ȡmDamageQtyIUAmount���Ե�ֵ��
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
     * ����mDamageQtyIUAmount���Ե�ֵ��
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
     * ��ȡmDamageQtyOfProItem���Ե�ֵ��
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
     * ����mDamageQtyOfProItem���Ե�ֵ��
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
     * ��ȡmDamageQtyPriceAmount���Ե�ֵ��
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
     * ����mDamageQtyPriceAmount���Ե�ֵ��
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
     * ��ȡmDamageQtyTBUAmount���Ե�ֵ��
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
     * ����mDamageQtyTBUAmount���Ե�ֵ��
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
     * ��ȡmDamageQtyTUAmount���Ե�ֵ��
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
     * ����mDamageQtyTUAmount���Ե�ֵ��
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
     * ��ȡmDealMode���Ե�ֵ��
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
     * ����mDealMode���Ե�ֵ��
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
     * ��ȡmDiscountRate���Ե�ֵ��
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
     * ����mDiscountRate���Ե�ֵ��
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
     * ��ȡmDocLineNo���Ե�ֵ��
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
     * ����mDocLineNo���Ե�ֵ��
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
     * ��ȡmDonationReason���Ե�ֵ��
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
     * ����mDonationReason���Ե�ֵ��
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
     * ��ȡmDonationType���Ե�ֵ��
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
     * ����mDonationType���Ե�ֵ��
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
     * ��ȡmDrawbackBillKey���Ե�ֵ��
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
     * ����mDrawbackBillKey���Ե�ֵ��
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
     * ��ȡmDrawbackBillLineKey���Ե�ֵ��
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
     * ����mDrawbackBillLineKey���Ե�ֵ��
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
     * ��ȡmDrawbackBillLineNo���Ե�ֵ��
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
     * ����mDrawbackBillLineNo���Ե�ֵ��
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
     * ��ȡmDrawbackBillNo���Ե�ֵ��
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
     * ����mDrawbackBillNo���Ե�ֵ��
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
     * ��ȡmExecutedARMoney���Ե�ֵ��
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
     * ����mExecutedARMoney���Ե�ֵ��
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
     * ��ȡmExecutedARQtyPriceAmount���Ե�ֵ��
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
     * ����mExecutedARQtyPriceAmount���Ե�ֵ��
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
     * ��ȡmExecutedARQtyTBUAmount���Ե�ֵ��
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
     * ����mExecutedARQtyTBUAmount���Ե�ֵ��
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
     * ��ȡmExecutedARQtyTUAmount���Ե�ֵ��
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
     * ����mExecutedARQtyTUAmount���Ե�ֵ��
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
     * ��ȡmfas���Ե�ֵ��
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
     * ����mfas���Ե�ֵ��
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
     * ��ȡmFillQtyPriceAmount���Ե�ֵ��
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
     * ����mFillQtyPriceAmount���Ե�ֵ��
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
     * ��ȡmFillQtyTBUAmount���Ե�ֵ��
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
     * ����mFillQtyTBUAmount���Ե�ֵ��
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
     * ��ȡmFillQtyTUAmount���Ե�ֵ��
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
     * ����mFillQtyTUAmount���Ե�ֵ��
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
     * ��ȡmFinallyPrice���Ե�ֵ��
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
     * ����mFinallyPrice���Ե�ֵ��
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
     * ��ȡmFinallyPriceTC���Ե�ֵ��
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
     * ����mFinallyPriceTC���Ե�ֵ��
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
     * ��ȡmFutureCostAC���Ե�ֵ��
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
     * ����mFutureCostAC���Ե�ֵ��
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
     * ��ȡmFutureCostFC���Ե�ֵ��
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
     * ����mFutureCostFC���Ե�ֵ��
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
     * ��ȡmFutureCostTC���Ե�ֵ��
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
     * ����mFutureCostTC���Ե�ֵ��
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
     * ��ȡmGoodsManagementType���Ե�ֵ��
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
     * ����mGoodsManagementType���Ե�ֵ��
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
     * ��ȡmiuToIMU���Ե�ֵ��
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
     * ����miuToIMU���Ե�ֵ��
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
     * ��ȡmInvRatetoBase���Ե�ֵ��
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
     * ����mInvRatetoBase���Ե�ֵ��
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
     * ��ȡmIsARByPreShip���Ե�ֵ��
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
     * ����mIsARByPreShip���Ե�ֵ��
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
     * ��ȡmIsAllowReturn���Ե�ֵ��
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
     * ����mIsAllowReturn���Ե�ֵ��
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
     * ��ȡmIsAssociatedChild���Ե�ֵ��
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
     * ����mIsAssociatedChild���Ե�ֵ��
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
     * ��ȡmIsChangeProcessQty���Ե�ֵ��
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
     * ����mIsChangeProcessQty���Ե�ֵ��
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
     * ��ȡmIsCloseSO���Ե�ֵ��
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
     * ����mIsCloseSO���Ե�ֵ��
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
     * ��ȡmIsConfirmDateChangable���Ե�ֵ��
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
     * ����mIsConfirmDateChangable���Ե�ֵ��
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
     * ��ȡmIsCreatedInflow���Ե�ֵ��
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
     * ����mIsCreatedInflow���Ե�ֵ��
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
     * ��ȡmIsExistAssociatedChild���Ե�ֵ��
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
     * ����mIsExistAssociatedChild���Ե�ֵ��
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
     * ��ȡmIsFinishSignIn���Ե�ֵ��
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
     * ����mIsFinishSignIn���Ե�ֵ��
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
     * ��ȡmIsGernerTBD���Ե�ֵ��
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
     * ����mIsGernerTBD���Ե�ֵ��
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
     * ��ȡmIsInvoiceUpdate���Ե�ֵ��
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
     * ����mIsInvoiceUpdate���Ե�ֵ��
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
     * ��ȡmIsItemVersionChangable���Ե�ֵ��
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
     * ����mIsItemVersionChangable���Ե�ֵ��
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
     * ��ȡmIsKit���Ե�ֵ��
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
     * ����mIsKit���Ե�ֵ��
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
     * ��ȡmIsMakeOutInvoice���Ե�ֵ��
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
     * ����mIsMakeOutInvoice���Ե�ֵ��
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
     * ��ȡmIsManufacturerChangeable���Ե�ֵ��
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
     * ����mIsManufacturerChangeable���Ե�ֵ��
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
     * ��ȡmIsMaturityDateChangable���Ե�ֵ��
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
     * ����mIsMaturityDateChangable���Ե�ֵ��
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
     * ��ȡmIsModifyLot���Ե�ֵ��
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
     * ����mIsModifyLot���Ե�ֵ��
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
     * ��ȡmIsModifyOperateOrg���Ե�ֵ��
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
     * ����mIsModifyOperateOrg���Ե�ֵ��
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
     * ��ȡmIsModifyPU���Ե�ֵ��
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
     * ����mIsModifyPU���Ե�ֵ��
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
     * ��ȡmIsModifyShipperOrg���Ե�ֵ��
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
     * ����mIsModifyShipperOrg���Ե�ֵ��
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
     * ��ȡmIsModifyTBUToPBU���Ե�ֵ��
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
     * ����mIsModifyTBUToPBU���Ե�ֵ��
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
     * ��ȡmIsModifyTCToACExRate���Ե�ֵ��
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
     * ����mIsModifyTCToACExRate���Ե�ֵ��
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
     * ��ȡmIsModifyTU���Ե�ֵ��
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
     * ����mIsModifyTU���Ե�ֵ��
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
     * ��ȡmIsNeedGenAAI���Ե�ֵ��
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
     * ����mIsNeedGenAAI���Ե�ֵ��
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
     * ��ȡmIsPP���Ե�ֵ��
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
     * ����mIsPP���Ե�ֵ��
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
     * ��ȡmIsPossessCredit���Ե�ֵ��
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
     * ����mIsPossessCredit���Ե�ֵ��
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
     * ��ȡmIsPreShipBeginning���Ե�ֵ��
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
     * ����mIsPreShipBeginning���Ե�ֵ��
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
     * ��ȡmIsPrjUnChangeable���Ե�ֵ��
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
     * ����mIsPrjUnChangeable���Ե�ֵ��
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
     * ��ȡmIsRP���Ե�ֵ��
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
     * ����mIsRP���Ե�ֵ��
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
     * ��ȡmIsRefill���Ե�ֵ��
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
     * ����mIsRefill���Ե�ֵ��
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
     * ��ȡmIsSignedInByCP���Ե�ֵ��
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
     * ����mIsSignedInByCP���Ե�ֵ��
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
     * ��ȡmIsTIByPreShip���Ե�ֵ��
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
     * ����mIsTIByPreShip���Ե�ֵ��
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
     * ��ȡmIsTaskUnChangeable���Ե�ֵ��
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
     * ����mIsTaskUnChangeable���Ե�ֵ��
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
     * ��ȡmIsVMIAAI���Ե�ֵ��
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
     * ����mIsVMIAAI���Ե�ֵ��
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
     * ��ȡmIsZeroCost���Ե�ֵ��
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
     * ����mIsZeroCost���Ե�ֵ��
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
     * ��ȡmItemInfo���Ե�ֵ��
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
     * ����mItemInfo���Ե�ֵ��
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
     * ��ȡmKitItemInfo���Ե�ֵ��
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
     * ����mKitItemInfo���Ե�ֵ��
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
     * ��ȡmKitLineNo���Ե�ֵ��
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
     * ����mKitLineNo���Ե�ֵ��
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
     * ��ȡmlcMoney���Ե�ֵ��
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
     * ����mlcMoney���Ե�ֵ��
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
     * ��ȡmLotInfo���Ե�ֵ��
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
     * ����mLotInfo���Ե�ֵ��
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
     * ��ȡmLotInvalidationDate���Ե�ֵ��
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
     * ����mLotInvalidationDate���Ե�ֵ��
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
     * ��ȡmMaturityDate���Ե�ֵ��
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
     * ����mMaturityDate���Ե�ֵ��
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
     * ��ȡmMotherSoShipLine���Ե�ֵ��
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
     * ����mMotherSoShipLine���Ե�ֵ��
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
     * ��ȡmNetWeight���Ե�ֵ��
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
     * ����mNetWeight���Ե�ֵ��
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
     * ��ȡmNotLcMoney���Ե�ֵ��
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
     * ����mNotLcMoney���Ե�ֵ��
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
     * ��ȡmOrderPrice���Ե�ֵ��
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
     * ����mOrderPrice���Ե�ֵ��
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
     * ��ȡmOrderPriceTC���Ե�ֵ��
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
     * ����mOrderPriceTC���Ե�ֵ��
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
     * ��ȡmOriginalItem���Ե�ֵ��
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
     * ����mOriginalItem���Ե�ֵ��
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
     * ��ȡmOriginalItemAmount���Ե�ֵ��
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
     * ����mOriginalItemAmount���Ե�ֵ��
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
     * ��ȡmOriginalItemBaseAmount���Ե�ֵ��
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
     * ����mOriginalItemBaseAmount���Ե�ֵ��
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
     * ��ȡmOriginalItemRatetoBase���Ե�ֵ��
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
     * ����mOriginalItemRatetoBase���Ե�ֵ��
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
     * ��ȡmParentShipLineID���Ե�ֵ��
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
     * ����mParentShipLineID���Ե�ֵ��
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
     * ��ȡmParentShipLineNo���Ե�ֵ��
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
     * ����mParentShipLineNo���Ե�ֵ��
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
     * ��ȡmPerProcessQty���Ե�ֵ��
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
     * ����mPerProcessQty���Ե�ֵ��
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
     * ��ȡmPiece���Ե�ֵ��
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
     * ����mPiece���Ե�ֵ��
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
     * ��ȡmPlanQtyTBUAmount���Ե�ֵ��
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
     * ����mPlanQtyTBUAmount���Ե�ֵ��
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
     * ��ȡmPlanQtyTUAmount���Ե�ֵ��
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
     * ����mPlanQtyTUAmount���Ե�ֵ��
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
     * ��ȡmPreMaturityDate���Ե�ֵ��
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
     * ����mPreMaturityDate���Ե�ֵ��
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
     * ��ȡmPrecisionACCC���Ե�ֵ��
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
     * ����mPrecisionACCC���Ե�ֵ��
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
     * ��ȡmPrecisionTCAC���Ե�ֵ��
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
     * ����mPrecisionTCAC���Ե�ֵ��
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
     * ��ȡmPriceRatetoBase���Ե�ֵ��
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
     * ����mPriceRatetoBase���Ե�ֵ��
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
     * ��ȡmPriceSource���Ե�ֵ��
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
     * ����mPriceSource���Ե�ֵ��
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
     * ��ȡmProcedureNO���Ե�ֵ��
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
     * ����mProcedureNO���Ե�ֵ��
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
     * ��ȡmProcessItem���Ե�ֵ��
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
     * ����mProcessItem���Ե�ֵ��
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
     * ��ȡmProcessQty���Ե�ֵ��
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
     * ����mProcessQty���Ե�ֵ��
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
     * ��ȡmProcessRateToSub���Ե�ֵ��
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
     * ����mProcessRateToSub���Ե�ֵ��
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
     * ��ȡmQtyPriceAmount���Ե�ֵ��
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
     * ����mQtyPriceAmount���Ե�ֵ��
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
     * ��ȡmQuantityType���Ե�ֵ��
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
     * ����mQuantityType���Ե�ֵ��
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
     * ��ȡmrmrUseQtyTBUAmount���Ե�ֵ��
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
     * ����mrmrUseQtyTBUAmount���Ե�ֵ��
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
     * ��ȡmrmrUseQtyTUAmount���Ե�ֵ��
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
     * ����mrmrUseQtyTUAmount���Ե�ֵ��
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
     * ��ȡmRcvDocNo���Ե�ֵ��
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
     * ����mRcvDocNo���Ե�ֵ��
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
     * ��ȡmRcvID���Ե�ֵ��
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
     * ����mRcvID���Ե�ֵ��
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
     * ��ȡmRcvLineID���Ե�ֵ��
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
     * ����mRcvLineID���Ե�ֵ��
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
     * ��ȡmRcvLineNo���Ե�ֵ��
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
     * ����mRcvLineNo���Ե�ֵ��
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
     * ��ȡmRcvOrg���Ե�ֵ��
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
     * ����mRcvOrg���Ե�ֵ��
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
     * ��ȡmRcvQryTime���Ե�ֵ��
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
     * ����mRcvQryTime���Ե�ֵ��
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
     * ��ȡmRcvQty���Ե�ֵ��
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
     * ����mRcvQty���Ե�ֵ��
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
     * ��ȡmRefillUseQtyTBUAmount���Ե�ֵ��
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
     * ����mRefillUseQtyTBUAmount���Ե�ֵ��
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
     * ��ȡmRefillUseQtyTUAmount���Ե�ֵ��
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
     * ����mRefillUseQtyTUAmount���Ե�ֵ��
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
     * ��ȡmRejectQtyIUAmount���Ե�ֵ��
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
     * ����mRejectQtyIUAmount���Ե�ֵ��
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
     * ��ȡmRejectQtyOfProItem���Ե�ֵ��
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
     * ����mRejectQtyOfProItem���Ե�ֵ��
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
     * ��ȡmRejectQtyPriceAmount���Ե�ֵ��
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
     * ����mRejectQtyPriceAmount���Ե�ֵ��
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
     * ��ȡmRejectQtyTBUAmount���Ե�ֵ��
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
     * ����mRejectQtyTBUAmount���Ե�ֵ��
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
     * ��ȡmRejectQtyTUAmount���Ե�ֵ��
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
     * ����mRejectQtyTUAmount���Ե�ֵ��
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
     * ��ȡmRejectRcvUseQtyTBUAmount���Ե�ֵ��
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
     * ����mRejectRcvUseQtyTBUAmount���Ե�ֵ��
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
     * ��ȡmRejectRcvUseQtyTUAmount���Ե�ֵ��
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
     * ����mRejectRcvUseQtyTUAmount���Ե�ֵ��
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
     * ��ȡmRejectReason���Ե�ֵ��
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
     * ����mRejectReason���Ե�ֵ��
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
     * ��ȡmReserveQty���Ե�ֵ��
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
     * ����mReserveQty���Ե�ֵ��
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
     * ��ȡmsoDate���Ե�ֵ��
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
     * ����msoDate���Ե�ֵ��
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
     * ��ȡmsoKey���Ե�ֵ��
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
     * ����msoKey���Ե�ֵ��
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
     * ��ȡmsoKitLineNo���Ե�ֵ��
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
     * ����msoKitLineNo���Ե�ֵ��
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
     * ��ȡmsoLineKey���Ե�ֵ��
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
     * ����msoLineKey���Ե�ֵ��
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
     * ��ȡmsoLineNo���Ե�ֵ��
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
     * ����msoLineNo���Ե�ֵ��
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
     * ��ȡmsoNo���Ե�ֵ��
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
     * ����msoNo���Ե�ֵ��
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
     * ��ȡmsoSubLineKey���Ե�ֵ��
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
     * ����msoSubLineKey���Ե�ֵ��
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
     * ��ȡmsoSubLineNo���Ե�ֵ��
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
     * ����msoSubLineNo���Ե�ֵ��
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
     * ��ȡmsoSysVersion���Ե�ֵ��
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
     * ����msoSysVersion���Ե�ֵ��
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
     * ��ȡmsotDocType���Ե�ֵ��
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
     * ����msotDocType���Ե�ֵ��
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
     * ��ȡmsoVer���Ե�ֵ��
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
     * ����msoVer���Ե�ֵ��
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
     * ��ȡmSaleCostAC���Ե�ֵ��
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
     * ����mSaleCostAC���Ե�ֵ��
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
     * ��ȡmSaleCostAmount���Ե�ֵ��
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
     * ����mSaleCostAmount���Ե�ֵ��
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
     * ��ȡmSaleCostFC���Ե�ֵ��
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
     * ����mSaleCostFC���Ե�ֵ��
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
     * ��ȡmSaleCostTC���Ե�ֵ��
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
     * ����mSaleCostTC���Ե�ֵ��
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
     * ��ȡmSaleOrFYTask���Ե�ֵ��
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
     * ����mSaleOrFYTask���Ե�ֵ��
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
     * ��ȡmSaleRtnMoney���Ե�ֵ��
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
     * ����mSaleRtnMoney���Ե�ֵ��
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
     * ��ȡmSeibanAlterable���Ե�ֵ��
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
     * ����mSeibanAlterable���Ե�ֵ��
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
     * ��ȡmSeibanCode���Ե�ֵ��
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
     * ����mSeibanCode���Ե�ֵ��
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
     * ��ȡmSettlementFlag���Ե�ֵ��
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
     * ����mSettlementFlag���Ե�ֵ��
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
     * ��ȡmShip���Ե�ֵ��
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
     * ����mShip���Ե�ֵ��
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
     * ��ȡmShipAdjustPriceLogs���Ե�ֵ��
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
     * ����mShipAdjustPriceLogs���Ե�ֵ��
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
     * ��ȡmShipInstalmentTerms���Ե�ֵ��
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
     * ����mShipInstalmentTerms���Ե�ֵ��
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
     * ��ȡmShipLineBalanceRoutes���Ե�ֵ��
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
     * ����mShipLineBalanceRoutes���Ե�ֵ��
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
     * ��ȡmShipLineCosts���Ե�ֵ��
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
     * ����mShipLineCosts���Ե�ֵ��
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
     * ��ȡmShipLineDiscounts���Ե�ֵ��
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
     * ����mShipLineDiscounts���Ե�ֵ��
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
     * ��ȡmShipLineLocations���Ե�ֵ��
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
     * ����mShipLineLocations���Ե�ֵ��
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
     * ��ȡmShipLineSubItemExeInfo���Ե�ֵ��
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
     * ����mShipLineSubItemExeInfo���Ե�ֵ��
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
     * ��ȡmShipPlanDocNo���Ե�ֵ��
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
     * ����mShipPlanDocNo���Ե�ֵ��
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
     * ��ȡmShipPlanID���Ե�ֵ��
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
     * ����mShipPlanID���Ե�ֵ��
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
     * ��ȡmShipPlanLineDocLineNo���Ե�ֵ��
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
     * ����mShipPlanLineDocLineNo���Ե�ֵ��
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
     * ��ȡmShipPlanLineID���Ե�ֵ��
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
     * ����mShipPlanLineID���Ե�ֵ��
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
     * ��ȡmShipPriceLog���Ե�ֵ��
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
     * ����mShipPriceLog���Ե�ֵ��
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
     * ��ȡmShipQtyCostAmount���Ե�ֵ��
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
     * ����mShipQtyCostAmount���Ե�ֵ��
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
     * ��ȡmShipQtyInvAmount���Ե�ֵ��
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
     * ����mShipQtyInvAmount���Ե�ֵ��
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
     * ��ȡmShipQtyTBUAmount���Ե�ֵ��
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
     * ����mShipQtyTBUAmount���Ե�ֵ��
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
     * ��ȡmShipQtyTUAmount���Ե�ֵ��
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
     * ����mShipQtyTUAmount���Ե�ֵ��
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
     * ��ȡmShipToSite���Ե�ֵ��
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
     * ����mShipToSite���Ե�ֵ��
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
     * ��ȡmShipTogetherFlag���Ե�ֵ��
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
     * ����mShipTogetherFlag���Ե�ֵ��
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
     * ��ȡmShippingQtyIU���Ե�ֵ��
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
     * ����mShippingQtyIU���Ե�ֵ��
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
     * ��ȡmSignInDate���Ե�ֵ��
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
     * ����mSignInDate���Ե�ֵ��
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
     * ��ȡmSignInQtyOfProItem���Ե�ֵ��
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
     * ����mSignInQtyOfProItem���Ե�ֵ��
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
     * ��ȡmSignInTUPUConvRatio���Ե�ֵ��
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
     * ����mSignInTUPUConvRatio���Ե�ֵ��
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
     * ��ȡmSignInTotalMoneyAC���Ե�ֵ��
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
     * ����mSignInTotalMoneyAC���Ե�ֵ��
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
     * ��ȡmSignInTotalMoneyFC���Ե�ֵ��
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
     * ����mSignInTotalMoneyFC���Ե�ֵ��
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
     * ��ȡmSignInTotalMoneyNoTax���Ե�ֵ��
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
     * ����mSignInTotalMoneyNoTax���Ե�ֵ��
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
     * ��ȡmSignInTotalMoneyNoTaxFC���Ե�ֵ��
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
     * ����mSignInTotalMoneyNoTaxFC���Ե�ֵ��
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
     * ��ȡmSignInTotalMoneyNoTaxTC���Ե�ֵ��
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
     * ����mSignInTotalMoneyNoTaxTC���Ե�ֵ��
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
     * ��ȡmSignInTotalMoneyTC���Ե�ֵ��
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
     * ����mSignInTotalMoneyTC���Ե�ֵ��
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
     * ��ȡmSignInTotalTax���Ե�ֵ��
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
     * ����mSignInTotalTax���Ե�ֵ��
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
     * ��ȡmSnCode���Ե�ֵ��
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
     * ����mSnCode���Ե�ֵ��
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
     * ��ȡmSrcCooperateOrg���Ե�ֵ��
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
     * ����mSrcCooperateOrg���Ե�ֵ��
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
     * ��ȡmSrcCooperateShipLine���Ե�ֵ��
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
     * ����mSrcCooperateShipLine���Ե�ֵ��
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
     * ��ȡmSrcCooperateType���Ե�ֵ��
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
     * ����mSrcCooperateType���Ե�ֵ��
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
     * ��ȡmSrcDocDate���Ե�ֵ��
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
     * ����mSrcDocDate���Ե�ֵ��
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
     * ��ȡmSrcDocKey���Ե�ֵ��
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
     * ����mSrcDocKey���Ե�ֵ��
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
     * ��ȡmSrcDocLineKey���Ե�ֵ��
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
     * ����mSrcDocLineKey���Ե�ֵ��
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
     * ��ȡmSrcDocLineNo���Ե�ֵ��
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
     * ����mSrcDocLineNo���Ե�ֵ��
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
     * ��ȡmSrcDocNo���Ե�ֵ��
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
     * ����mSrcDocNo���Ե�ֵ��
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
     * ��ȡmSrcDocPriceTC���Ե�ֵ��
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
     * ����mSrcDocPriceTC���Ե�ֵ��
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
     * ��ȡmSrcDocSubLineKey���Ե�ֵ��
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
     * ����mSrcDocSubLineKey���Ե�ֵ��
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
     * ��ȡmSrcDocSubLineNo���Ե�ֵ��
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
     * ����mSrcDocSubLineNo���Ե�ֵ��
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
     * ��ȡmSrcDocTransType���Ե�ֵ��
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
     * ����mSrcDocTransType���Ե�ֵ��
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
     * ��ȡmSrcDocVer���Ե�ֵ��
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
     * ����mSrcDocVer���Ե�ֵ��
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
     * ��ȡmSrcKitLineNo���Ե�ֵ��
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
     * ����mSrcKitLineNo���Ե�ֵ��
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
     * ��ȡmSrcRcv���Ե�ֵ��
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
     * ����mSrcRcv���Ե�ֵ��
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
     * ��ȡmSrcRcvLine���Ե�ֵ��
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
     * ����mSrcRcvLine���Ե�ֵ��
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
     * ��ȡmSrcRcvOrg���Ե�ֵ��
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
     * ����mSrcRcvOrg���Ե�ֵ��
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
     * ��ȡmSrcSysVersion���Ե�ֵ��
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
     * ����mSrcSysVersion���Ե�ֵ��
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
     * ��ȡmStateMachineID���Ե�ֵ��
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
     * ����mStateMachineID���Ե�ֵ��
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
     * ��ȡmStickBrandCustomer���Ե�ֵ��
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
     * ����mStickBrandCustomer���Ե�ֵ��
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
     * ��ȡmStickBrandItemCode���Ե�ֵ��
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
     * ����mStickBrandItemCode���Ե�ֵ��
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
     * ��ȡmStickBrandItemName���Ե�ֵ��
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
     * ����mStickBrandItemName���Ե�ֵ��
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
     * ��ȡmStorageType���Ե�ֵ��
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
     * ����mStorageType���Ե�ֵ��
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
     * ��ȡmStoreArk���Ե�ֵ��
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
     * ����mStoreArk���Ե�ֵ��
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
     * ��ȡmSubItemCostRate���Ե�ֵ��
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
     * ����mSubItemCostRate���Ե�ֵ��
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
     * ��ȡmSystemPrice���Ե�ֵ��
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
     * ����mSystemPrice���Ե�ֵ��
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
     * ��ȡmSystemPriceTC���Ե�ֵ��
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
     * ����mSystemPriceTC���Ե�ֵ��
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
     * ��ȡmtucuConvRatio���Ե�ֵ��
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
     * ����mtucuConvRatio���Ե�ֵ��
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
     * ��ȡmtuInvConvRatio���Ե�ֵ��
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
     * ����mtuInvConvRatio���Ե�ֵ��
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
     * ��ȡmtupuConvRatio���Ե�ֵ��
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
     * ����mtupuConvRatio���Ե�ֵ��
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
     * ��ȡmTaskQtyIU���Ե�ֵ��
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
     * ����mTaskQtyIU���Ե�ֵ��
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
     * ��ȡmTaxRate���Ե�ֵ��
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
     * ����mTaxRate���Ե�ֵ��
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
     * ��ȡmTotalARMoney���Ե�ֵ��
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
     * ����mTotalARMoney���Ե�ֵ��
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
     * ��ȡmTotalARMoneyTC���Ե�ֵ��
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
     * ����mTotalARMoneyTC���Ե�ֵ��
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
     * ��ȡmTotalARQtyPriceAmount���Ե�ֵ��
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
     * ����mTotalARQtyPriceAmount���Ե�ֵ��
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
     * ��ȡmTotalARQtyTBUAmount���Ե�ֵ��
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
     * ����mTotalARQtyTBUAmount���Ե�ֵ��
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
     * ��ȡmTotalARQtyTUAmount���Ե�ֵ��
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
     * ����mTotalARQtyTUAmount���Ե�ֵ��
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
     * ��ȡmTotalAccountMoney���Ե�ֵ��
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
     * ����mTotalAccountMoney���Ե�ֵ��
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
     * ��ȡmTotalAccountMoneyTC���Ե�ֵ��
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
     * ����mTotalAccountMoneyTC���Ե�ֵ��
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
     * ��ȡmTotalAccountQtyPriceAmount���Ե�ֵ��
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
     * ����mTotalAccountQtyPriceAmount���Ե�ֵ��
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
     * ��ȡmTotalAccountQtyTBUAmount���Ե�ֵ��
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
     * ����mTotalAccountQtyTBUAmount���Ե�ֵ��
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
     * ��ȡmTotalAccountQtyTUAmount���Ե�ֵ��
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
     * ����mTotalAccountQtyTUAmount���Ե�ֵ��
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
     * ��ȡmTotalCAQtyPU���Ե�ֵ��
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
     * ����mTotalCAQtyPU���Ե�ֵ��
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
     * ��ȡmTotalInvoiceMoney���Ե�ֵ��
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
     * ����mTotalInvoiceMoney���Ե�ֵ��
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
     * ��ȡmTotalInvoiceMoneyTC���Ե�ֵ��
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
     * ����mTotalInvoiceMoneyTC���Ե�ֵ��
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
     * ��ȡmTotalInvoiceQtyPriceAmount���Ե�ֵ��
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
     * ����mTotalInvoiceQtyPriceAmount���Ե�ֵ��
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
     * ��ȡmTotalInvoiceQtyTBUAmount���Ե�ֵ��
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
     * ����mTotalInvoiceQtyTBUAmount���Ե�ֵ��
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
     * ��ȡmTotalInvoiceQtyTUAmount���Ե�ֵ��
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
     * ����mTotalInvoiceQtyTUAmount���Ե�ֵ��
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
     * ��ȡmTotalNetMoney���Ե�ֵ��
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
     * ����mTotalNetMoney���Ե�ֵ��
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
     * ��ȡmTotalPPMoney���Ե�ֵ��
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
     * ����mTotalPPMoney���Ե�ֵ��
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
     * ��ȡmTotalRPMoney���Ե�ֵ��
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
     * ����mTotalRPMoney���Ե�ֵ��
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
     * ��ȡmTotalRefillQtyIUAmount���Ե�ֵ��
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
     * ����mTotalRefillQtyIUAmount���Ե�ֵ��
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
     * ��ȡmTotalRefillQtyPriceAmount���Ե�ֵ��
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
     * ����mTotalRefillQtyPriceAmount���Ե�ֵ��
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
     * ��ȡmTotalRefillQtyTBUAmount���Ե�ֵ��
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
     * ����mTotalRefillQtyTBUAmount���Ե�ֵ��
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
     * ��ȡmTotalRefillQtyTUAmount���Ե�ֵ��
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
     * ����mTotalRefillQtyTUAmount���Ե�ֵ��
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
     * ��ȡmTotalRtnDeductMoney���Ե�ֵ��
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
     * ����mTotalRtnDeductMoney���Ե�ֵ��
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
     * ��ȡmTotalRtnDeductMoneyTC���Ե�ֵ��
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
     * ����mTotalRtnDeductMoneyTC���Ե�ֵ��
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
     * ��ȡmTotalRtnDeductQtyPriceAmount���Ե�ֵ��
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
     * ����mTotalRtnDeductQtyPriceAmount���Ե�ֵ��
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
     * ��ȡmTotalRtnDeductQtyTBUAmount���Ե�ֵ��
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
     * ����mTotalRtnDeductQtyTBUAmount���Ե�ֵ��
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
     * ��ȡmTotalRtnDeductQtyTUAmount���Ե�ֵ��
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
     * ����mTotalRtnDeductQtyTUAmount���Ե�ֵ��
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
     * ��ȡmTotalRtnFillMoney���Ե�ֵ��
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
     * ����mTotalRtnFillMoney���Ե�ֵ��
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
     * ��ȡmTotalRtnFillMoneyTC���Ե�ֵ��
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
     * ����mTotalRtnFillMoneyTC���Ե�ֵ��
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
     * ��ȡmTotalRtnFillQtyPriceAmount���Ե�ֵ��
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
     * ����mTotalRtnFillQtyPriceAmount���Ե�ֵ��
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
     * ��ȡmTotalRtnFillQtyTBUAmount���Ե�ֵ��
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
     * ����mTotalRtnFillQtyTBUAmount���Ե�ֵ��
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
     * ��ȡmTotalRtnFillQtyTUAmount���Ե�ֵ��
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
     * ����mTotalRtnFillQtyTUAmount���Ե�ֵ��
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
     * ��ȡmTotalSignInQtyPU���Ե�ֵ��
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
     * ����mTotalSignInQtyPU���Ե�ֵ��
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
     * ��ȡmTradeRatetoBase���Ե�ֵ��
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
     * ����mTradeRatetoBase���Ե�ֵ��
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
     * ��ȡmTradeUom2ToTRadeUom2Associate���Ե�ֵ��
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
     * ����mTradeUom2ToTRadeUom2Associate���Ե�ֵ��
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
     * ��ȡmvmi���Ե�ֵ��
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
     * ����mvmi���Ե�ֵ��
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
     * ��ȡmVolume���Ե�ֵ��
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
     * ����mVolume���Ե�ֵ��
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
     * ��ȡmVoucherID���Ե�ֵ��
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
     * ����mVoucherID���Ե�ֵ��
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
     * ��ȡmVoucherNO���Ե�ֵ��
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
     * ����mVoucherNO���Ե�ֵ��
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
     * ��ȡmVoucherTypeID���Ե�ֵ��
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
     * ����mVoucherTypeID���Ե�ֵ��
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
     * ��ȡmWeight���Ե�ֵ��
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
     * ����mWeight���Ե�ֵ��
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
