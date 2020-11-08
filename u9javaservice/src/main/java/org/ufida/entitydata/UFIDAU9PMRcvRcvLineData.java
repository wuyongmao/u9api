
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
 * &lt;p&gt;UFIDA.U9.PM.Rcv.RcvLineData complex type的 Java 类。
 * 
 * &lt;p&gt;以下模式片段指定包含在此类中的预期内容。
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="UFIDA.U9.PM.Rcv.RcvLineData"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://www.UFIDA.org/EntityData}UFSoft.UBF.Business.DataTransObjectBase"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="APLastConfrimPostPeriod" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="APLastConfrimPostPeriod_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="AccountOrg" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="AccountOrg_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="AssociatedParent" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="AssociatedParent_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="BOMUOM" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="BOMUOM_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="BalanceCurrency" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="BalanceCurrency_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="BalanceRoute" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="BalanceRoute_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="BizBudgetProject" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="BizBudgetProject_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ClosePeriod" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ClosePeriod_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ConfigResultOrg" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ConfigResultOrg_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ConfirmAccording" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ConfirmAccording_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ConfirmTerm" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ConfirmTerm_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="CooperateOrg" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="CooperateOrg_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="CostBaseUOM" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="CostBaseUOM_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="CostUOM" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="CostUOM_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="CurrentOrg" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="CurrentOrg_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="FAS" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="FAS_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="HoldReason" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="HoldReason_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="InvLot" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="InvLot_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="KitParentLine_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Memo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="MnyBudgetProject" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="MnyBudgetProject_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Multi_Memo" type="{UFSoft.UBF.Util.Data}MultiLangDataDict" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Multi_PrePayBillNo" type="{UFSoft.UBF.Util.Data}MultiLangDataDict" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Multi_PriceListName" type="{UFSoft.UBF.Util.Data}MultiLangDataDict" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Multi_SONo" type="{UFSoft.UBF.Util.Data}MultiLangDataDict" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="NextWPSupplier" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="NextWPSupplier_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="OriginalItem" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="OriginalItemBaseUom" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="OriginalItemBaseUom_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="OriginalItemUom" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="OriginalItemUom_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="OriginalItem_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="OwnOrg" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="OwnOrg_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="POLot" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="POLot_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="PaymentTerm" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="PaymentTerm_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="PostPeriod" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="PostPeriod_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="PrePayBillNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="PrePayPolicy" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="PrePayPolicy_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="PreWPSupplier" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="PreWPSupplier_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="PriceBaseUOM" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="PriceBaseUOM_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="PriceListName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="PriceUOM" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="PriceUOM_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ProcessSubUOM" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ProcessSubUOM_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ProcessUOM" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ProcessUOM_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Project" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Project_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="PurDept" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="PurDept_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="PurOper" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="PurOper_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="PurOrg" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="PurOrg_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="RcvBy" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="RcvBy_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="RcvDept" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="RcvDept_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="RcvLineExt_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="RcvLot" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="RcvLot_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Receivement_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ReleaseReason" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ReleaseReason_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="RequireDept" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="RequireDept_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="RequireMan" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="RequireMan_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="RequireOrg" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="RequireOrg_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="RtnReason" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="RtnReason_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="SONo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="SaleRtnOrg" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="SaleRtnOrg_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="SaleRtnWH" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="SaleRtnWH_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="SeiBan" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="SeiBan_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="SrcRcvLine_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="SrcSubLine_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="StoreBaseUOM" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="StoreBaseUOM_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="StoreUOM" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="StoreUOM_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="TBMainUOM" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="TBMainUOM_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="TBSubUOM" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="TBSubUOM_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Task" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Task_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="TaxSchedule" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="TaxSchedule_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="TradPath" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="TradPath_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="TradeBaseUOM" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="TradeBaseUOM_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="TradeUOM" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="TradeUOM_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="VolumeUom" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="VolumeUom_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="WeightUom" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="WeightUom_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Wh" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="WhMan" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="WhMan_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Wh_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_aAIStatus" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_aCToFCExchRate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_aCToFCExchRateRound" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_aPConfirmDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_aPMaturityDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_activateType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_adjustPriceDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_aprrovedPrice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_arriveBoxes" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_arriveQtyCU" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_arriveQtyPU" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_arriveQtySU" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_arriveQtyTBU" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_arriveQtyTU" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_arriveTotalMnyAC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_arriveTotalMnyFC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_arriveTotalMnyTC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_arriveTotalNetMnyAC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_arriveTotalNetMnyFC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_arriveTotalNetMnyTC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_arriveTotalTaxAC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_arriveTotalTaxFC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_arriveTotalTaxTC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_arrivedTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_associatedParentLine" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_associatedParentLineNo" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_auditMan" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_autoToRcv" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_autoToRcvRtn" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_bOMID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_bOMLineNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_balanceRouteDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_billSetCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_billToSite" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CBO.SCM.Supplier.SupplierSiteMISCInfoData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_bizCloseDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_cUToCBURate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_canAPConfirmQtyCU" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_canAPConfirmQtyPU" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_canAPConfirmQtySU" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_canAPConfirmQtyTBU" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_canAPConfirmQtyTU" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_cancel" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.Base.Doc.CancelData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_cancelAuditDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_cancelAuditMan" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_chargeBase" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_chargeProcessMode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_chargeType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_checkedTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_configResult" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_confirmDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_confirmMode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_confirmSupplier" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CBO.SCM.Supplier.SupplierMISCInfoData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_confirmedMnyAC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_confirmedMnyFC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_confirmedMnyTC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_confirmedNetMnyAC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_confirmedNetMnyFC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_confirmedNetMnyTC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_confirmedQtyCU" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_confirmedQtyPU" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_confirmedQtySU" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_confirmedQtyTBU" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_confirmedQtyTU" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_confirmedTaxAC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_confirmedTaxFC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_confirmedTaxTC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_container" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_cooperateRcv" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_costPercent" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_costPriceSource" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_costPriceSourceType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_craftRouteKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_craftRouteNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_createdBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_createdOn" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_cusBillToSite" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CBO.SCM.Customer.CustomerSiteMISCInfoData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_customerShipToSite" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CBO.SCM.Customer.CustomerSiteMISCInfoData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_damageQtyCU" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_damageQtyPU" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_damageQtySU" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_damageQtyTBU" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_deliverCheckQtyCU" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_deliverCheckQtyPU" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_deliverCheckQtySU" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_deliverCheckQtyTBU" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_deliverCheckQtyTU" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_descFlexSegments" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.Base.FlexField.DescFlexField.DescFlexSegmentsData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_destroyQtyCU" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_destroyQtyPU" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_destroyQtySU" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_destroyQtyTBU" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_destroyQtyTU" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_docLineNo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_doingReqFundAC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_dosagePerPiece" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_evaluationMnyAC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_evaluationMnyFC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_evaluationMnyTC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_evaluationPriceCU" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_evaluationPricePU" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_execPrePayMny" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_execPrePayQtyPU" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_execPrePayQtyTBU" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_execPrePayQtyTU" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_eyeballedTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_eyeballingQtyCU" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_eyeballingQtyPU" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_eyeballingQtySU" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_eyeballingQtyTBU" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_eyeballingQtyTU" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_fillQtyCU" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_fillQtyPU" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_fillQtySU" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_fillQtyTBU" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_fillQtyTU" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_finallyPriceAC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_finallyPriceTC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_freeReason" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_freeType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_hasCreateBudgetData" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_haveCountCostMnyFC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_haveCountCostQtyCU" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_haveCountCostTaxFC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_haveVerificationQtyTBU" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_haveVerificationQtyTU" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_holdDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_holdUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_iD" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_iNVLotInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_iPVAC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_iPVFC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_iPVFeeAC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_iPVFeeTC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_iPVFeeTaxAC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_iPVFeeTaxTC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_iPVTC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_iPVTaxAC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_iPVTaxFC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_iPVTaxTC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_innerBalancePrice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_inspectLotInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_invDisabledTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_invLotCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_invLotEnableDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_invLotValidDate" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isAdjustDosagePerPiece" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isAllotTOMo" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isAssociatedChild" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isEditMfc" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isEditSeiBan" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isEvaluationChangeable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isFIClose" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isGernerTBD" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isInFlowFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isItemVerFromSrcDoc" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isKitWholeSet" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isNeedGenAAI" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isNeedTransToGL" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isNeedWarning" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isPP" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isPresent" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isPriceIncludeTax" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isQCfree" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isRcvProcedureModify" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isRefill" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isRelationCompany" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isRtnSupplierFromSrcDoc" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isSubCostChangeable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isTCToACRateFromSrc" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isTransferedToGL" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isUpDateWMTrans" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isUrgencyAccept" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isZeroCost" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_itemDealMode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_itemInfo" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CBO.SCM.Item.ItemInfoData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_kITRcvMode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_kitParentLine" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.PM.Rcv.RcvLineData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_lineSrcKitNO" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_mO" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_mONo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_mRBID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_mRBNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_machineCostAC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_machineCostFC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_machineCostTC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_manualCostAC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_manualCostFC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_manualCostTC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_matchLayer" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_matchedMnyAC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_matchedMnyFC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_matchedMnyTC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_matchedNetMnyAC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_matchedNetMnyFC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_matchedNetMnyTC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_matchedQtyCU" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_matchedQtyPU" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_matchedQtyRelateMnyAC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_matchedQtyRelateMnyFC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_matchedQtyRelateMnyTC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_matchedQtySU" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_matchedQtyTBU" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_matchedQtyTU" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_matchedTaxAC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_matchedTaxFC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_matchedTaxTC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_materialCostAC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_materialCostFC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_materialCostTC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_maxPrePayMnyAC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_maxPrePayPercent" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_maxPrepayPercentEditable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_mfc" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CBO.SCM.Supplier.SupplierMISCInfoData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_mfcCostAC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_mfcCostFC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_mfcCostTC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_modifiedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_modifiedOn" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_netOrderPrice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_netWeight" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_nextWPKey" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.Base.PropertyTypes.BizEntityKeyData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_nextWPNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_nofityMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_notEditAttributes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_oUToOBURate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_orderPriceAC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_orderPriceBy" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_orderPriceTC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_originalItemQty" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_originalItemQtyBaseUom" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_outStoreActualCost" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_ownMaterialMnyAC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_ownMaterialMnyFC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_ownMaterialMnyTC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_pOLotCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_pUToPBURate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_partnerMaterialIPVAC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_partnerMaterialIPVFC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_partnerMaterialIPVTC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_partnerMaterialMnyAC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_partnerMaterialMnyFC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_partnerMaterialMnyTC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_payedMnyAC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_payedMnyFC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_payedMnyTC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_payedQtyCU" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_payedQtyPU" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_payedQtySU" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_payedQtyTBU" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_payedQtyTU" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_payer" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CBO.SCM.Supplier.SupplierMISCInfoData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_payerSite" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CBO.SCM.Supplier.SupplierSiteMISCInfoData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_paymentBill" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_paymentBillLine" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_paymentBillLineNo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_paymentBillNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_paymentCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_piece" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_planArrivedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_planQtyCU" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_planQtyPU" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_planQtySU" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_planQtyTBU" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_planQtyTU" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_preMaturityDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_prePayBill" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_prePayBillLine" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_prePayBillLineNo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_prePayMnyAC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_prePayPolicyEditable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_prePayQtyPU" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_prePayQtyTBU" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_prePayQtyTU" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_preWPKey" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.Base.PropertyTypes.BizEntityKeyData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_preWPNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_presentCostApportionLine" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_priceDifferenceAC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_priceDifferenceFC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_priceDifferenceTC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_priceList" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_priceListCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_priceSource" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_priceStatus" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_processArriveQty" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_processDestroyQty" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_processEyeballingQty" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_processItem" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CBO.SCM.Item.ItemInfoData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_processMFC" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CBO.SCM.Supplier.SupplierMISCInfoData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_processPlanQty" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_processQty" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_processQualifiedQty" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_processRcvQty" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_processReDeductQty" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_processReFillQty" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_processRejectQty" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_processUToSURate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_processUnqualifiedQty" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_productLineDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_productLineKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_productLineNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_purCostAC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_purCostFC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_purCostTC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_purT0SaleUOMRate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_qCBill" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_qCBillNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_qCConclusion" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_qCQCConclusion" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_qualifiedQtyCU" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_qualifiedQtyPU" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_qualifiedQtySU" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_qualifiedQtyTBU" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_qualifiedQtyTU" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_quantityType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_rCVLotInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_rCVToRMAType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_rMATransType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_rMAType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_rcvBoxes" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_rcvDiscount" type="{http://www.UFIDA.org/EntityData}ArrayOfUFIDA.U9.PM.Rcv.RcvDiscountData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_rcvLineExt" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.PM.Rcv.RcvLineExtData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_rcvLineHoldReleaseHis" type="{http://www.UFIDA.org/EntityData}ArrayOfUFIDA.U9.PM.Rcv.RcvLineHoldReleaseHisData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_rcvLotCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_rcvProcedure" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_rcvQryTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_rcvQty" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_rcvQtyCU" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_rcvQtyPU" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_rcvQtySU" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_rcvQtyTBU" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_rcvQtyTU" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_reasonableLossQtyCU" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_reasonableLossQtyPU" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_reasonableLossQtySU" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_reasonableLossQtyTBU" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_reasonableLossQtyTU" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_receivement" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.PM.Rcv.ReceivementData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_refillUseQtyTBU" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_refillUseQtyTU" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_rejectMnyAC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_rejectMnyFC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_rejectMnyTC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_rejectMode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_rejectNetMnyAC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_rejectNetMnyFC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_rejectNetMnyTC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_rejectQtyCU" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_rejectQtyPU" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_rejectQtySU" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_rejectQtyTBU" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_rejectQtyTU" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_rejectReason" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_rejectTaxMnyAC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_rejectTaxMnyFC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_rejectTaxMnyTC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_releaseDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_releaseUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_returnSupplier" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CBO.SCM.Supplier.SupplierMISCInfoData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_rtnConfirmedMnyAC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_rtnConfirmedMnyFC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_rtnConfirmedMnyTC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_rtnConfirmedNetMnyAC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_rtnConfirmedNetMnyFC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_rtnConfirmedNetMnyTC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_rtnConfirmedQtyCU" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_rtnConfirmedQtyPU" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_rtnConfirmedQtySU" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_rtnConfirmedQtyTBU" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_rtnConfirmedQtyTU" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_rtnConfirmedTaxAC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_rtnConfirmedTaxFC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_rtnConfirmedTaxTC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_rtnDeductEvaluationMnyAC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_rtnDeductEvaluationMnyFC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_rtnDeductEvaluationMnyTC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_rtnDeductMnyAC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_rtnDeductMnyFC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_rtnDeductMnyTC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_rtnDeductNetMnyAC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_rtnDeductNetMnyFC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_rtnDeductNetMnyTC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_rtnDeductQtyCU" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_rtnDeductQtyPU" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_rtnDeductQtySU" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_rtnDeductQtyTBU" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_rtnDeductQtyTU" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_rtnDeductTaxAC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_rtnDeductTaxFC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_rtnDeductTaxTC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_rtnFillNoUsedIPVAC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_rtnFillNoUsedIPVFC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_rtnFillNoUsedIPVTC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_rtnFillQtyCU" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_rtnFillQtyPU" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_rtnFillQtySU" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_rtnFillQtyTBU" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_rtnFillQtyTU" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_rtnMatchedMnyAC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_rtnMatchedMnyFC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_rtnMatchedMnyTC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_rtnMatchedNetMnyAC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_rtnMatchedNetMnyFC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_rtnMatchedNetMnyTC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_rtnMatchedQtyCU" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_rtnMatchedQtyPU" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_rtnMatchedQtySU" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_rtnMatchedQtyTBU" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_rtnMatchedQtyTU" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_rtnMatchedTaxAC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_rtnMatchedTaxFC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_rtnMatchedTaxTC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_rtnOutQtyCU" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_rtnOutQtyPU" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_rtnOutQtySU" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_rtnOutQtyTBU" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_rtnOutQtyTU" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_sO" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_sOBPostPeriod" type="{http://www.UFIDA.org/EntityData}ArrayOfUFIDA.U9.PM.Rcv.SOBPostPeriodData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_sUToSBURate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_seiBanCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_shipDocNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_shipLineID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_shipLineNo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_shipToSite" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CBO.SCM.Supplier.SupplierSiteMISCInfoData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_showUniqueID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_showWarningMessageFormID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_snCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_splitFlag" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_splitRcvLine" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_srcBudgetDocType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_srcBudgetLine" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_srcBudgetOrg" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_srcCooperateOrg" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_srcCooperateShipLine" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_srcCooperateType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_srcDoc" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CBO.SCM.PropertyTypes.SrcDocInfoData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_srcDocCollabQtyTU" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_srcDocCustomerSite" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CBO.SCM.Customer.CustomerSiteMISCInfoData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_srcDocExchRateType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_srcDocInfoInvRtn" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CBO.SCM.PropertyTypes.SrcDocInfoData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_srcDocProcessQty" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_srcDocType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_srcFinallyPriceAC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_srcFinallyPriceTC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_srcPO" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CBO.SCM.PropertyTypes.SrcDocInfoData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_srcPR" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CBO.SCM.PropertyTypes.SrcDocInfoData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_srcPurC" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CBO.SCM.PropertyTypes.SrcDocInfoData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_srcRcvLine" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.PM.Rcv.RcvLineData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_srcShip" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_srcShipLine" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_srcShipOrg" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_srcSubLine" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.PM.Rcv.RcvSubLineData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_srcSysVersion" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_standardPriceAC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_standardPriceFC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_standardPriceTC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_stateMachineID" type="{http://schemas.microsoft.com/2003/10/Serialization/}guid" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_status" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_storageType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_subContractCostAC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_subContractCostFC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_subContractCostTC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_submitChectTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_sumDispenseLineUsedMnyAC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_sumDispenseLineUsedNetMnyAC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_sumDispenseLineUsedTaxAC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_sumDispenseQtyAU" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_sumRMAQtyPU" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_sumRMAQtyTBU" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_sumRMAQtyTU" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_supplierDisabledTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_supplierItemCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_supplierItemName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_supplierLotCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_sysPriceAC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_sysPriceTC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_sysVersion" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_tBMainUOMToSubUOM" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_tBUToCBURate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_tBUToPBURate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_tBUToSBURate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_tCToACExchRate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_tCToACExchRateRound" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_tUToTBURate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_taskOutput" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_taxRate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_taxType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_tempID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_totalFeeAC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_totalFeeFC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_totalMnyAC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_totalMnyFC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_totalMnyTC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_totalNetFeeAC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_totalNetFeeFC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_totalNetFeeTC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_totalNetMnyAC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_totalNetMnyFC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_totalNetMnyTC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_totalTaxAC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_totalTaxFC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_totalTaxTC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_unqualifiedQtyCU" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_unqualifiedQtyPU" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_unqualifiedQtySU" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_unqualifiedQtyTBU" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_unqualifiedQtyTU" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_usageQty" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_volume" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_voucherDispCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_voucherID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_voucherTypeID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_wPKey" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.Base.PropertyTypes.BizEntityKeyData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_wPNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
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
@XmlType(name = "UFIDA.U9.PM.Rcv.RcvLineData", propOrder = {
    "apLastConfrimPostPeriod",
    "apLastConfrimPostPeriodSKey",
    "accountOrg",
    "accountOrgSKey",
    "associatedParent",
    "associatedParentSKey",
    "bomuom",
    "bomuomsKey",
    "balanceCurrency",
    "balanceCurrencySKey",
    "balanceRoute",
    "balanceRouteSKey",
    "bizBudgetProject",
    "bizBudgetProjectSKey",
    "closePeriod",
    "closePeriodSKey",
    "configResultOrg",
    "configResultOrgSKey",
    "confirmAccording",
    "confirmAccordingSKey",
    "confirmTerm",
    "confirmTermSKey",
    "cooperateOrg",
    "cooperateOrgSKey",
    "costBaseUOM",
    "costBaseUOMSKey",
    "costUOM",
    "costUOMSKey",
    "currentOrg",
    "currentOrgSKey",
    "fas",
    "fassKey",
    "holdReason",
    "holdReasonSKey",
    "invLot",
    "invLotSKey",
    "kitParentLineSKey",
    "memo",
    "mnyBudgetProject",
    "mnyBudgetProjectSKey",
    "multiMemo",
    "multiPrePayBillNo",
    "multiPriceListName",
    "multiSONo",
    "nextWPSupplier",
    "nextWPSupplierSKey",
    "originalItem",
    "originalItemBaseUom",
    "originalItemBaseUomSKey",
    "originalItemUom",
    "originalItemUomSKey",
    "originalItemSKey",
    "ownOrg",
    "ownOrgSKey",
    "poLot",
    "poLotSKey",
    "paymentTerm",
    "paymentTermSKey",
    "postPeriod",
    "postPeriodSKey",
    "prePayBillNo",
    "prePayPolicy",
    "prePayPolicySKey",
    "preWPSupplier",
    "preWPSupplierSKey",
    "priceBaseUOM",
    "priceBaseUOMSKey",
    "priceListName",
    "priceUOM",
    "priceUOMSKey",
    "processSubUOM",
    "processSubUOMSKey",
    "processUOM",
    "processUOMSKey",
    "project",
    "projectSKey",
    "purDept",
    "purDeptSKey",
    "purOper",
    "purOperSKey",
    "purOrg",
    "purOrgSKey",
    "rcvBy",
    "rcvBySKey",
    "rcvDept",
    "rcvDeptSKey",
    "rcvLineExtSKey",
    "rcvLot",
    "rcvLotSKey",
    "receivementSKey",
    "releaseReason",
    "releaseReasonSKey",
    "requireDept",
    "requireDeptSKey",
    "requireMan",
    "requireManSKey",
    "requireOrg",
    "requireOrgSKey",
    "rtnReason",
    "rtnReasonSKey",
    "soNo",
    "saleRtnOrg",
    "saleRtnOrgSKey",
    "saleRtnWH",
    "saleRtnWHSKey",
    "seiBan",
    "seiBanSKey",
    "srcRcvLineSKey",
    "srcSubLineSKey",
    "storeBaseUOM",
    "storeBaseUOMSKey",
    "storeUOM",
    "storeUOMSKey",
    "tbMainUOM",
    "tbMainUOMSKey",
    "tbSubUOM",
    "tbSubUOMSKey",
    "task",
    "taskSKey",
    "taxSchedule",
    "taxScheduleSKey",
    "tradPath",
    "tradPathSKey",
    "tradeBaseUOM",
    "tradeBaseUOMSKey",
    "tradeUOM",
    "tradeUOMSKey",
    "volumeUom",
    "volumeUomSKey",
    "weightUom",
    "weightUomSKey",
    "wh",
    "whMan",
    "whManSKey",
    "whSKey",
    "maaiStatus",
    "macToFCExchRate",
    "macToFCExchRateRound",
    "mapConfirmDate",
    "mapMaturityDate",
    "mActivateType",
    "mAdjustPriceDate",
    "mAprrovedPrice",
    "mArriveBoxes",
    "mArriveQtyCU",
    "mArriveQtyPU",
    "mArriveQtySU",
    "mArriveQtyTBU",
    "mArriveQtyTU",
    "mArriveTotalMnyAC",
    "mArriveTotalMnyFC",
    "mArriveTotalMnyTC",
    "mArriveTotalNetMnyAC",
    "mArriveTotalNetMnyFC",
    "mArriveTotalNetMnyTC",
    "mArriveTotalTaxAC",
    "mArriveTotalTaxFC",
    "mArriveTotalTaxTC",
    "mArrivedTime",
    "mAssociatedParentLine",
    "mAssociatedParentLineNo",
    "mAuditMan",
    "mAutoToRcv",
    "mAutoToRcvRtn",
    "mbomid",
    "mbomLineNo",
    "mBalanceRouteDesc",
    "mBillSetCode",
    "mBillToSite",
    "mBizCloseDate",
    "mcuToCBURate",
    "mCanAPConfirmQtyCU",
    "mCanAPConfirmQtyPU",
    "mCanAPConfirmQtySU",
    "mCanAPConfirmQtyTBU",
    "mCanAPConfirmQtyTU",
    "mCancel",
    "mCancelAuditDate",
    "mCancelAuditMan",
    "mChargeBase",
    "mChargeProcessMode",
    "mChargeType",
    "mCheckedTime",
    "mConfigResult",
    "mConfirmDate",
    "mConfirmMode",
    "mConfirmSupplier",
    "mConfirmedMnyAC",
    "mConfirmedMnyFC",
    "mConfirmedMnyTC",
    "mConfirmedNetMnyAC",
    "mConfirmedNetMnyFC",
    "mConfirmedNetMnyTC",
    "mConfirmedQtyCU",
    "mConfirmedQtyPU",
    "mConfirmedQtySU",
    "mConfirmedQtyTBU",
    "mConfirmedQtyTU",
    "mConfirmedTaxAC",
    "mConfirmedTaxFC",
    "mConfirmedTaxTC",
    "mContainer",
    "mCooperateRcv",
    "mCostPercent",
    "mCostPriceSource",
    "mCostPriceSourceType",
    "mCraftRouteKey",
    "mCraftRouteNo",
    "mCreatedBy",
    "mCreatedOn",
    "mCusBillToSite",
    "mCustomerShipToSite",
    "mDamageQtyCU",
    "mDamageQtyPU",
    "mDamageQtySU",
    "mDamageQtyTBU",
    "mDeliverCheckQtyCU",
    "mDeliverCheckQtyPU",
    "mDeliverCheckQtySU",
    "mDeliverCheckQtyTBU",
    "mDeliverCheckQtyTU",
    "mDescFlexSegments",
    "mDestroyQtyCU",
    "mDestroyQtyPU",
    "mDestroyQtySU",
    "mDestroyQtyTBU",
    "mDestroyQtyTU",
    "mDocLineNo",
    "mDoingReqFundAC",
    "mDosagePerPiece",
    "mEvaluationMnyAC",
    "mEvaluationMnyFC",
    "mEvaluationMnyTC",
    "mEvaluationPriceCU",
    "mEvaluationPricePU",
    "mExecPrePayMny",
    "mExecPrePayQtyPU",
    "mExecPrePayQtyTBU",
    "mExecPrePayQtyTU",
    "mEyeballedTime",
    "mEyeballingQtyCU",
    "mEyeballingQtyPU",
    "mEyeballingQtySU",
    "mEyeballingQtyTBU",
    "mEyeballingQtyTU",
    "mFillQtyCU",
    "mFillQtyPU",
    "mFillQtySU",
    "mFillQtyTBU",
    "mFillQtyTU",
    "mFinallyPriceAC",
    "mFinallyPriceTC",
    "mFreeReason",
    "mFreeType",
    "mHasCreateBudgetData",
    "mHaveCountCostMnyFC",
    "mHaveCountCostQtyCU",
    "mHaveCountCostTaxFC",
    "mHaveVerificationQtyTBU",
    "mHaveVerificationQtyTU",
    "mHoldDate",
    "mHoldUser",
    "mid",
    "minvLotInfo",
    "mipvac",
    "mipvfc",
    "mipvFeeAC",
    "mipvFeeTC",
    "mipvFeeTaxAC",
    "mipvFeeTaxTC",
    "mipvtc",
    "mipvTaxAC",
    "mipvTaxFC",
    "mipvTaxTC",
    "mInnerBalancePrice",
    "mInspectLotInfo",
    "mInvDisabledTime",
    "mInvLotCode",
    "mInvLotEnableDate",
    "mInvLotValidDate",
    "mIsAdjustDosagePerPiece",
    "mIsAllotTOMo",
    "mIsAssociatedChild",
    "mIsEditMfc",
    "mIsEditSeiBan",
    "mIsEvaluationChangeable",
    "mIsFIClose",
    "mIsGernerTBD",
    "mIsInFlowFlag",
    "mIsItemVerFromSrcDoc",
    "mIsKitWholeSet",
    "mIsNeedGenAAI",
    "mIsNeedTransToGL",
    "mIsNeedWarning",
    "mIsPP",
    "mIsPresent",
    "mIsPriceIncludeTax",
    "mIsQCfree",
    "mIsRcvProcedureModify",
    "mIsRefill",
    "mIsRelationCompany",
    "mIsRtnSupplierFromSrcDoc",
    "mIsSubCostChangeable",
    "mIsTCToACRateFromSrc",
    "mIsTransferedToGL",
    "mIsUpDateWMTrans",
    "mIsUrgencyAccept",
    "mIsZeroCost",
    "mItemDealMode",
    "mItemInfo",
    "mkitRcvMode",
    "mKitParentLine",
    "mLineSrcKitNO",
    "mmo",
    "mmoNo",
    "mmrbid",
    "mmrbNo",
    "mMachineCostAC",
    "mMachineCostFC",
    "mMachineCostTC",
    "mManualCostAC",
    "mManualCostFC",
    "mManualCostTC",
    "mMatchLayer",
    "mMatchedMnyAC",
    "mMatchedMnyFC",
    "mMatchedMnyTC",
    "mMatchedNetMnyAC",
    "mMatchedNetMnyFC",
    "mMatchedNetMnyTC",
    "mMatchedQtyCU",
    "mMatchedQtyPU",
    "mMatchedQtyRelateMnyAC",
    "mMatchedQtyRelateMnyFC",
    "mMatchedQtyRelateMnyTC",
    "mMatchedQtySU",
    "mMatchedQtyTBU",
    "mMatchedQtyTU",
    "mMatchedTaxAC",
    "mMatchedTaxFC",
    "mMatchedTaxTC",
    "mMaterialCostAC",
    "mMaterialCostFC",
    "mMaterialCostTC",
    "mMaxPrePayMnyAC",
    "mMaxPrePayPercent",
    "mMaxPrepayPercentEditable",
    "mMfc",
    "mMfcCostAC",
    "mMfcCostFC",
    "mMfcCostTC",
    "mModifiedBy",
    "mModifiedOn",
    "mNetOrderPrice",
    "mNetWeight",
    "mNextWPKey",
    "mNextWPNo",
    "mNofityMessage",
    "mNotEditAttributes",
    "mouToOBURate",
    "mOrderPriceAC",
    "mOrderPriceBy",
    "mOrderPriceTC",
    "mOriginalItemQty",
    "mOriginalItemQtyBaseUom",
    "mOutStoreActualCost",
    "mOwnMaterialMnyAC",
    "mOwnMaterialMnyFC",
    "mOwnMaterialMnyTC",
    "mpoLotCode",
    "mpuToPBURate",
    "mPartnerMaterialIPVAC",
    "mPartnerMaterialIPVFC",
    "mPartnerMaterialIPVTC",
    "mPartnerMaterialMnyAC",
    "mPartnerMaterialMnyFC",
    "mPartnerMaterialMnyTC",
    "mPayedMnyAC",
    "mPayedMnyFC",
    "mPayedMnyTC",
    "mPayedQtyCU",
    "mPayedQtyPU",
    "mPayedQtySU",
    "mPayedQtyTBU",
    "mPayedQtyTU",
    "mPayer",
    "mPayerSite",
    "mPaymentBill",
    "mPaymentBillLine",
    "mPaymentBillLineNo",
    "mPaymentBillNo",
    "mPaymentCode",
    "mPiece",
    "mPlanArrivedDate",
    "mPlanQtyCU",
    "mPlanQtyPU",
    "mPlanQtySU",
    "mPlanQtyTBU",
    "mPlanQtyTU",
    "mPreMaturityDate",
    "mPrePayBill",
    "mPrePayBillLine",
    "mPrePayBillLineNo",
    "mPrePayMnyAC",
    "mPrePayPolicyEditable",
    "mPrePayQtyPU",
    "mPrePayQtyTBU",
    "mPrePayQtyTU",
    "mPreWPKey",
    "mPreWPNo",
    "mPresentCostApportionLine",
    "mPriceDifferenceAC",
    "mPriceDifferenceFC",
    "mPriceDifferenceTC",
    "mPriceList",
    "mPriceListCode",
    "mPriceSource",
    "mPriceStatus",
    "mProcessArriveQty",
    "mProcessDestroyQty",
    "mProcessEyeballingQty",
    "mProcessItem",
    "mProcessMFC",
    "mProcessPlanQty",
    "mProcessQty",
    "mProcessQualifiedQty",
    "mProcessRcvQty",
    "mProcessReDeductQty",
    "mProcessReFillQty",
    "mProcessRejectQty",
    "mProcessUToSURate",
    "mProcessUnqualifiedQty",
    "mProductLineDate",
    "mProductLineKey",
    "mProductLineNo",
    "mPurCostAC",
    "mPurCostFC",
    "mPurCostTC",
    "mPurT0SaleUOMRate",
    "mqcBill",
    "mqcBillNo",
    "mqcConclusion",
    "mqcqcConclusion",
    "mQualifiedQtyCU",
    "mQualifiedQtyPU",
    "mQualifiedQtySU",
    "mQualifiedQtyTBU",
    "mQualifiedQtyTU",
    "mQuantityType",
    "mrcvLotInfo",
    "mrcvToRMAType",
    "mrmaTransType",
    "mrmaType",
    "mRcvBoxes",
    "mRcvDiscount",
    "mRcvLineExt",
    "mRcvLineHoldReleaseHis",
    "mRcvLotCode",
    "mRcvProcedure",
    "mRcvQryTime",
    "mRcvQty",
    "mRcvQtyCU",
    "mRcvQtyPU",
    "mRcvQtySU",
    "mRcvQtyTBU",
    "mRcvQtyTU",
    "mReasonableLossQtyCU",
    "mReasonableLossQtyPU",
    "mReasonableLossQtySU",
    "mReasonableLossQtyTBU",
    "mReasonableLossQtyTU",
    "mReceivement",
    "mRefillUseQtyTBU",
    "mRefillUseQtyTU",
    "mRejectMnyAC",
    "mRejectMnyFC",
    "mRejectMnyTC",
    "mRejectMode",
    "mRejectNetMnyAC",
    "mRejectNetMnyFC",
    "mRejectNetMnyTC",
    "mRejectQtyCU",
    "mRejectQtyPU",
    "mRejectQtySU",
    "mRejectQtyTBU",
    "mRejectQtyTU",
    "mRejectReason",
    "mRejectTaxMnyAC",
    "mRejectTaxMnyFC",
    "mRejectTaxMnyTC",
    "mReleaseDate",
    "mReleaseUser",
    "mReturnSupplier",
    "mRtnConfirmedMnyAC",
    "mRtnConfirmedMnyFC",
    "mRtnConfirmedMnyTC",
    "mRtnConfirmedNetMnyAC",
    "mRtnConfirmedNetMnyFC",
    "mRtnConfirmedNetMnyTC",
    "mRtnConfirmedQtyCU",
    "mRtnConfirmedQtyPU",
    "mRtnConfirmedQtySU",
    "mRtnConfirmedQtyTBU",
    "mRtnConfirmedQtyTU",
    "mRtnConfirmedTaxAC",
    "mRtnConfirmedTaxFC",
    "mRtnConfirmedTaxTC",
    "mRtnDeductEvaluationMnyAC",
    "mRtnDeductEvaluationMnyFC",
    "mRtnDeductEvaluationMnyTC",
    "mRtnDeductMnyAC",
    "mRtnDeductMnyFC",
    "mRtnDeductMnyTC",
    "mRtnDeductNetMnyAC",
    "mRtnDeductNetMnyFC",
    "mRtnDeductNetMnyTC",
    "mRtnDeductQtyCU",
    "mRtnDeductQtyPU",
    "mRtnDeductQtySU",
    "mRtnDeductQtyTBU",
    "mRtnDeductQtyTU",
    "mRtnDeductTaxAC",
    "mRtnDeductTaxFC",
    "mRtnDeductTaxTC",
    "mRtnFillNoUsedIPVAC",
    "mRtnFillNoUsedIPVFC",
    "mRtnFillNoUsedIPVTC",
    "mRtnFillQtyCU",
    "mRtnFillQtyPU",
    "mRtnFillQtySU",
    "mRtnFillQtyTBU",
    "mRtnFillQtyTU",
    "mRtnMatchedMnyAC",
    "mRtnMatchedMnyFC",
    "mRtnMatchedMnyTC",
    "mRtnMatchedNetMnyAC",
    "mRtnMatchedNetMnyFC",
    "mRtnMatchedNetMnyTC",
    "mRtnMatchedQtyCU",
    "mRtnMatchedQtyPU",
    "mRtnMatchedQtySU",
    "mRtnMatchedQtyTBU",
    "mRtnMatchedQtyTU",
    "mRtnMatchedTaxAC",
    "mRtnMatchedTaxFC",
    "mRtnMatchedTaxTC",
    "mRtnOutQtyCU",
    "mRtnOutQtyPU",
    "mRtnOutQtySU",
    "mRtnOutQtyTBU",
    "mRtnOutQtyTU",
    "mso",
    "msobPostPeriod",
    "msuToSBURate",
    "mSeiBanCode",
    "mShipDocNo",
    "mShipLineID",
    "mShipLineNo",
    "mShipToSite",
    "mShowUniqueID",
    "mShowWarningMessageFormID",
    "mSnCode",
    "mSplitFlag",
    "mSplitRcvLine",
    "mSrcBudgetDocType",
    "mSrcBudgetLine",
    "mSrcBudgetOrg",
    "mSrcCooperateOrg",
    "mSrcCooperateShipLine",
    "mSrcCooperateType",
    "mSrcDoc",
    "mSrcDocCollabQtyTU",
    "mSrcDocCustomerSite",
    "mSrcDocExchRateType",
    "mSrcDocInfoInvRtn",
    "mSrcDocProcessQty",
    "mSrcDocType",
    "mSrcFinallyPriceAC",
    "mSrcFinallyPriceTC",
    "mSrcPO",
    "mSrcPR",
    "mSrcPurC",
    "mSrcRcvLine",
    "mSrcShip",
    "mSrcShipLine",
    "mSrcShipOrg",
    "mSrcSubLine",
    "mSrcSysVersion",
    "mStandardPriceAC",
    "mStandardPriceFC",
    "mStandardPriceTC",
    "mStateMachineID",
    "mStatus",
    "mStorageType",
    "mSubContractCostAC",
    "mSubContractCostFC",
    "mSubContractCostTC",
    "mSubmitChectTime",
    "mSumDispenseLineUsedMnyAC",
    "mSumDispenseLineUsedNetMnyAC",
    "mSumDispenseLineUsedTaxAC",
    "mSumDispenseQtyAU",
    "mSumRMAQtyPU",
    "mSumRMAQtyTBU",
    "mSumRMAQtyTU",
    "mSupplierDisabledTime",
    "mSupplierItemCode",
    "mSupplierItemName",
    "mSupplierLotCode",
    "mSysPriceAC",
    "mSysPriceTC",
    "mSysVersion",
    "mtbMainUOMToSubUOM",
    "mtbuToCBURate",
    "mtbuToPBURate",
    "mtbuToSBURate",
    "mtcToACExchRate",
    "mtcToACExchRateRound",
    "mtuToTBURate",
    "mTaskOutput",
    "mTaxRate",
    "mTaxType",
    "mTempID",
    "mTotalFeeAC",
    "mTotalFeeFC",
    "mTotalMnyAC",
    "mTotalMnyFC",
    "mTotalMnyTC",
    "mTotalNetFeeAC",
    "mTotalNetFeeFC",
    "mTotalNetFeeTC",
    "mTotalNetMnyAC",
    "mTotalNetMnyFC",
    "mTotalNetMnyTC",
    "mTotalTaxAC",
    "mTotalTaxFC",
    "mTotalTaxTC",
    "mUnqualifiedQtyCU",
    "mUnqualifiedQtyPU",
    "mUnqualifiedQtySU",
    "mUnqualifiedQtyTBU",
    "mUnqualifiedQtyTU",
    "mUsageQty",
    "mVolume",
    "mVoucherDispCode",
    "mVoucherID",
    "mVoucherTypeID",
    "mwpKey",
    "mwpNo",
    "mWeight"
})
public class UFIDAU9PMRcvRcvLineData
    extends UFSoftUBFBusinessDataTransObjectBase
{

    @XmlElement(name = "APLastConfrimPostPeriod")
    protected Long apLastConfrimPostPeriod;
    @XmlElementRef(name = "APLastConfrimPostPeriod_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> apLastConfrimPostPeriodSKey;
    @XmlElement(name = "AccountOrg")
    protected Long accountOrg;
    @XmlElementRef(name = "AccountOrg_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> accountOrgSKey;
    @XmlElement(name = "AssociatedParent")
    protected Long associatedParent;
    @XmlElementRef(name = "AssociatedParent_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> associatedParentSKey;
    @XmlElement(name = "BOMUOM")
    protected Long bomuom;
    @XmlElementRef(name = "BOMUOM_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> bomuomsKey;
    @XmlElement(name = "BalanceCurrency")
    protected Long balanceCurrency;
    @XmlElementRef(name = "BalanceCurrency_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> balanceCurrencySKey;
    @XmlElement(name = "BalanceRoute")
    protected Long balanceRoute;
    @XmlElementRef(name = "BalanceRoute_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> balanceRouteSKey;
    @XmlElement(name = "BizBudgetProject")
    protected Long bizBudgetProject;
    @XmlElementRef(name = "BizBudgetProject_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> bizBudgetProjectSKey;
    @XmlElement(name = "ClosePeriod")
    protected Long closePeriod;
    @XmlElementRef(name = "ClosePeriod_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> closePeriodSKey;
    @XmlElement(name = "ConfigResultOrg")
    protected Long configResultOrg;
    @XmlElementRef(name = "ConfigResultOrg_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> configResultOrgSKey;
    @XmlElement(name = "ConfirmAccording")
    protected Long confirmAccording;
    @XmlElementRef(name = "ConfirmAccording_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> confirmAccordingSKey;
    @XmlElement(name = "ConfirmTerm")
    protected Long confirmTerm;
    @XmlElementRef(name = "ConfirmTerm_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> confirmTermSKey;
    @XmlElement(name = "CooperateOrg")
    protected Long cooperateOrg;
    @XmlElementRef(name = "CooperateOrg_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> cooperateOrgSKey;
    @XmlElement(name = "CostBaseUOM")
    protected Long costBaseUOM;
    @XmlElementRef(name = "CostBaseUOM_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> costBaseUOMSKey;
    @XmlElement(name = "CostUOM")
    protected Long costUOM;
    @XmlElementRef(name = "CostUOM_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> costUOMSKey;
    @XmlElement(name = "CurrentOrg")
    protected Long currentOrg;
    @XmlElementRef(name = "CurrentOrg_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> currentOrgSKey;
    @XmlElement(name = "FAS")
    protected Long fas;
    @XmlElementRef(name = "FAS_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> fassKey;
    @XmlElement(name = "HoldReason")
    protected Long holdReason;
    @XmlElementRef(name = "HoldReason_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> holdReasonSKey;
    @XmlElement(name = "InvLot")
    protected Long invLot;
    @XmlElementRef(name = "InvLot_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> invLotSKey;
    @XmlElementRef(name = "KitParentLine_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> kitParentLineSKey;
    @XmlElementRef(name = "Memo", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> memo;
    @XmlElement(name = "MnyBudgetProject")
    protected Long mnyBudgetProject;
    @XmlElementRef(name = "MnyBudgetProject_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> mnyBudgetProjectSKey;
    @XmlElementRef(name = "Multi_Memo", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<MultiLangDataDict> multiMemo;
    @XmlElementRef(name = "Multi_PrePayBillNo", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<MultiLangDataDict> multiPrePayBillNo;
    @XmlElementRef(name = "Multi_PriceListName", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<MultiLangDataDict> multiPriceListName;
    @XmlElementRef(name = "Multi_SONo", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<MultiLangDataDict> multiSONo;
    @XmlElement(name = "NextWPSupplier")
    protected Long nextWPSupplier;
    @XmlElementRef(name = "NextWPSupplier_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> nextWPSupplierSKey;
    @XmlElement(name = "OriginalItem")
    protected Long originalItem;
    @XmlElement(name = "OriginalItemBaseUom")
    protected Long originalItemBaseUom;
    @XmlElementRef(name = "OriginalItemBaseUom_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> originalItemBaseUomSKey;
    @XmlElement(name = "OriginalItemUom")
    protected Long originalItemUom;
    @XmlElementRef(name = "OriginalItemUom_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> originalItemUomSKey;
    @XmlElementRef(name = "OriginalItem_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> originalItemSKey;
    @XmlElement(name = "OwnOrg")
    protected Long ownOrg;
    @XmlElementRef(name = "OwnOrg_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> ownOrgSKey;
    @XmlElement(name = "POLot")
    protected Long poLot;
    @XmlElementRef(name = "POLot_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> poLotSKey;
    @XmlElement(name = "PaymentTerm")
    protected Long paymentTerm;
    @XmlElementRef(name = "PaymentTerm_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> paymentTermSKey;
    @XmlElement(name = "PostPeriod")
    protected Long postPeriod;
    @XmlElementRef(name = "PostPeriod_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> postPeriodSKey;
    @XmlElementRef(name = "PrePayBillNo", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> prePayBillNo;
    @XmlElement(name = "PrePayPolicy")
    protected Long prePayPolicy;
    @XmlElementRef(name = "PrePayPolicy_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> prePayPolicySKey;
    @XmlElement(name = "PreWPSupplier")
    protected Long preWPSupplier;
    @XmlElementRef(name = "PreWPSupplier_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> preWPSupplierSKey;
    @XmlElement(name = "PriceBaseUOM")
    protected Long priceBaseUOM;
    @XmlElementRef(name = "PriceBaseUOM_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> priceBaseUOMSKey;
    @XmlElementRef(name = "PriceListName", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> priceListName;
    @XmlElement(name = "PriceUOM")
    protected Long priceUOM;
    @XmlElementRef(name = "PriceUOM_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> priceUOMSKey;
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
    @XmlElement(name = "PurDept")
    protected Long purDept;
    @XmlElementRef(name = "PurDept_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> purDeptSKey;
    @XmlElement(name = "PurOper")
    protected Long purOper;
    @XmlElementRef(name = "PurOper_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> purOperSKey;
    @XmlElement(name = "PurOrg")
    protected Long purOrg;
    @XmlElementRef(name = "PurOrg_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> purOrgSKey;
    @XmlElement(name = "RcvBy")
    protected Long rcvBy;
    @XmlElementRef(name = "RcvBy_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> rcvBySKey;
    @XmlElement(name = "RcvDept")
    protected Long rcvDept;
    @XmlElementRef(name = "RcvDept_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> rcvDeptSKey;
    @XmlElementRef(name = "RcvLineExt_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> rcvLineExtSKey;
    @XmlElement(name = "RcvLot")
    protected Long rcvLot;
    @XmlElementRef(name = "RcvLot_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> rcvLotSKey;
    @XmlElementRef(name = "Receivement_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> receivementSKey;
    @XmlElement(name = "ReleaseReason")
    protected Long releaseReason;
    @XmlElementRef(name = "ReleaseReason_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> releaseReasonSKey;
    @XmlElement(name = "RequireDept")
    protected Long requireDept;
    @XmlElementRef(name = "RequireDept_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> requireDeptSKey;
    @XmlElement(name = "RequireMan")
    protected Long requireMan;
    @XmlElementRef(name = "RequireMan_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> requireManSKey;
    @XmlElement(name = "RequireOrg")
    protected Long requireOrg;
    @XmlElementRef(name = "RequireOrg_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> requireOrgSKey;
    @XmlElement(name = "RtnReason")
    protected Long rtnReason;
    @XmlElementRef(name = "RtnReason_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> rtnReasonSKey;
    @XmlElementRef(name = "SONo", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> soNo;
    @XmlElement(name = "SaleRtnOrg")
    protected Long saleRtnOrg;
    @XmlElementRef(name = "SaleRtnOrg_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> saleRtnOrgSKey;
    @XmlElement(name = "SaleRtnWH")
    protected Long saleRtnWH;
    @XmlElementRef(name = "SaleRtnWH_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> saleRtnWHSKey;
    @XmlElement(name = "SeiBan")
    protected Long seiBan;
    @XmlElementRef(name = "SeiBan_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> seiBanSKey;
    @XmlElementRef(name = "SrcRcvLine_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> srcRcvLineSKey;
    @XmlElementRef(name = "SrcSubLine_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> srcSubLineSKey;
    @XmlElement(name = "StoreBaseUOM")
    protected Long storeBaseUOM;
    @XmlElementRef(name = "StoreBaseUOM_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> storeBaseUOMSKey;
    @XmlElement(name = "StoreUOM")
    protected Long storeUOM;
    @XmlElementRef(name = "StoreUOM_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> storeUOMSKey;
    @XmlElement(name = "TBMainUOM")
    protected Long tbMainUOM;
    @XmlElementRef(name = "TBMainUOM_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> tbMainUOMSKey;
    @XmlElement(name = "TBSubUOM")
    protected Long tbSubUOM;
    @XmlElementRef(name = "TBSubUOM_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> tbSubUOMSKey;
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
    @XmlElement(name = "TradeBaseUOM")
    protected Long tradeBaseUOM;
    @XmlElementRef(name = "TradeBaseUOM_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> tradeBaseUOMSKey;
    @XmlElement(name = "TradeUOM")
    protected Long tradeUOM;
    @XmlElementRef(name = "TradeUOM_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> tradeUOMSKey;
    @XmlElement(name = "VolumeUom")
    protected Long volumeUom;
    @XmlElementRef(name = "VolumeUom_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> volumeUomSKey;
    @XmlElement(name = "WeightUom")
    protected Long weightUom;
    @XmlElementRef(name = "WeightUom_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> weightUomSKey;
    @XmlElement(name = "Wh")
    protected Long wh;
    @XmlElement(name = "WhMan")
    protected Long whMan;
    @XmlElementRef(name = "WhMan_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> whManSKey;
    @XmlElementRef(name = "Wh_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> whSKey;
    @XmlElement(name = "m_aAIStatus")
    protected Integer maaiStatus;
    @XmlElement(name = "m_aCToFCExchRate")
    protected BigDecimal macToFCExchRate;
    @XmlElement(name = "m_aCToFCExchRateRound")
    protected Integer macToFCExchRateRound;
    @XmlElement(name = "m_aPConfirmDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mapConfirmDate;
    @XmlElement(name = "m_aPMaturityDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mapMaturityDate;
    @XmlElement(name = "m_activateType")
    protected Integer mActivateType;
    @XmlElement(name = "m_adjustPriceDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mAdjustPriceDate;
    @XmlElement(name = "m_aprrovedPrice")
    protected BigDecimal mAprrovedPrice;
    @XmlElement(name = "m_arriveBoxes")
    protected BigDecimal mArriveBoxes;
    @XmlElement(name = "m_arriveQtyCU")
    protected BigDecimal mArriveQtyCU;
    @XmlElement(name = "m_arriveQtyPU")
    protected BigDecimal mArriveQtyPU;
    @XmlElement(name = "m_arriveQtySU")
    protected BigDecimal mArriveQtySU;
    @XmlElement(name = "m_arriveQtyTBU")
    protected BigDecimal mArriveQtyTBU;
    @XmlElement(name = "m_arriveQtyTU")
    protected BigDecimal mArriveQtyTU;
    @XmlElement(name = "m_arriveTotalMnyAC")
    protected BigDecimal mArriveTotalMnyAC;
    @XmlElement(name = "m_arriveTotalMnyFC")
    protected BigDecimal mArriveTotalMnyFC;
    @XmlElement(name = "m_arriveTotalMnyTC")
    protected BigDecimal mArriveTotalMnyTC;
    @XmlElement(name = "m_arriveTotalNetMnyAC")
    protected BigDecimal mArriveTotalNetMnyAC;
    @XmlElement(name = "m_arriveTotalNetMnyFC")
    protected BigDecimal mArriveTotalNetMnyFC;
    @XmlElement(name = "m_arriveTotalNetMnyTC")
    protected BigDecimal mArriveTotalNetMnyTC;
    @XmlElement(name = "m_arriveTotalTaxAC")
    protected BigDecimal mArriveTotalTaxAC;
    @XmlElement(name = "m_arriveTotalTaxFC")
    protected BigDecimal mArriveTotalTaxFC;
    @XmlElement(name = "m_arriveTotalTaxTC")
    protected BigDecimal mArriveTotalTaxTC;
    @XmlElement(name = "m_arrivedTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mArrivedTime;
    @XmlElement(name = "m_associatedParentLine")
    protected Long mAssociatedParentLine;
    @XmlElement(name = "m_associatedParentLineNo")
    protected Long mAssociatedParentLineNo;
    @XmlElementRef(name = "m_auditMan", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mAuditMan;
    @XmlElement(name = "m_autoToRcv")
    protected Boolean mAutoToRcv;
    @XmlElement(name = "m_autoToRcvRtn")
    protected Boolean mAutoToRcvRtn;
    @XmlElement(name = "m_bOMID")
    protected Long mbomid;
    @XmlElementRef(name = "m_bOMLineNo", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mbomLineNo;
    @XmlElementRef(name = "m_balanceRouteDesc", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mBalanceRouteDesc;
    @XmlElementRef(name = "m_billSetCode", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mBillSetCode;
    @XmlElementRef(name = "m_billToSite", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9CBOSCMSupplierSupplierSiteMISCInfoData> mBillToSite;
    @XmlElement(name = "m_bizCloseDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mBizCloseDate;
    @XmlElement(name = "m_cUToCBURate")
    protected BigDecimal mcuToCBURate;
    @XmlElement(name = "m_canAPConfirmQtyCU")
    protected BigDecimal mCanAPConfirmQtyCU;
    @XmlElement(name = "m_canAPConfirmQtyPU")
    protected BigDecimal mCanAPConfirmQtyPU;
    @XmlElement(name = "m_canAPConfirmQtySU")
    protected BigDecimal mCanAPConfirmQtySU;
    @XmlElement(name = "m_canAPConfirmQtyTBU")
    protected BigDecimal mCanAPConfirmQtyTBU;
    @XmlElement(name = "m_canAPConfirmQtyTU")
    protected BigDecimal mCanAPConfirmQtyTU;
    @XmlElementRef(name = "m_cancel", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9BaseDocCancelData> mCancel;
    @XmlElement(name = "m_cancelAuditDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mCancelAuditDate;
    @XmlElementRef(name = "m_cancelAuditMan", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mCancelAuditMan;
    @XmlElement(name = "m_chargeBase")
    protected Integer mChargeBase;
    @XmlElement(name = "m_chargeProcessMode")
    protected Integer mChargeProcessMode;
    @XmlElement(name = "m_chargeType")
    protected Integer mChargeType;
    @XmlElement(name = "m_checkedTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mCheckedTime;
    @XmlElement(name = "m_configResult")
    protected Long mConfigResult;
    @XmlElement(name = "m_confirmDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mConfirmDate;
    @XmlElement(name = "m_confirmMode")
    protected Integer mConfirmMode;
    @XmlElementRef(name = "m_confirmSupplier", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9CBOSCMSupplierSupplierMISCInfoData> mConfirmSupplier;
    @XmlElement(name = "m_confirmedMnyAC")
    protected BigDecimal mConfirmedMnyAC;
    @XmlElement(name = "m_confirmedMnyFC")
    protected BigDecimal mConfirmedMnyFC;
    @XmlElement(name = "m_confirmedMnyTC")
    protected BigDecimal mConfirmedMnyTC;
    @XmlElement(name = "m_confirmedNetMnyAC")
    protected BigDecimal mConfirmedNetMnyAC;
    @XmlElement(name = "m_confirmedNetMnyFC")
    protected BigDecimal mConfirmedNetMnyFC;
    @XmlElement(name = "m_confirmedNetMnyTC")
    protected BigDecimal mConfirmedNetMnyTC;
    @XmlElement(name = "m_confirmedQtyCU")
    protected BigDecimal mConfirmedQtyCU;
    @XmlElement(name = "m_confirmedQtyPU")
    protected BigDecimal mConfirmedQtyPU;
    @XmlElement(name = "m_confirmedQtySU")
    protected BigDecimal mConfirmedQtySU;
    @XmlElement(name = "m_confirmedQtyTBU")
    protected BigDecimal mConfirmedQtyTBU;
    @XmlElement(name = "m_confirmedQtyTU")
    protected BigDecimal mConfirmedQtyTU;
    @XmlElement(name = "m_confirmedTaxAC")
    protected BigDecimal mConfirmedTaxAC;
    @XmlElement(name = "m_confirmedTaxFC")
    protected BigDecimal mConfirmedTaxFC;
    @XmlElement(name = "m_confirmedTaxTC")
    protected BigDecimal mConfirmedTaxTC;
    @XmlElementRef(name = "m_container", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mContainer;
    @XmlElement(name = "m_cooperateRcv")
    protected Long mCooperateRcv;
    @XmlElement(name = "m_costPercent")
    protected BigDecimal mCostPercent;
    @XmlElementRef(name = "m_costPriceSource", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mCostPriceSource;
    @XmlElement(name = "m_costPriceSourceType")
    protected Integer mCostPriceSourceType;
    @XmlElement(name = "m_craftRouteKey")
    protected Long mCraftRouteKey;
    @XmlElementRef(name = "m_craftRouteNo", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mCraftRouteNo;
    @XmlElementRef(name = "m_createdBy", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mCreatedBy;
    @XmlElement(name = "m_createdOn")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mCreatedOn;
    @XmlElementRef(name = "m_cusBillToSite", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9CBOSCMCustomerCustomerSiteMISCInfoData> mCusBillToSite;
    @XmlElementRef(name = "m_customerShipToSite", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9CBOSCMCustomerCustomerSiteMISCInfoData> mCustomerShipToSite;
    @XmlElement(name = "m_damageQtyCU")
    protected BigDecimal mDamageQtyCU;
    @XmlElement(name = "m_damageQtyPU")
    protected BigDecimal mDamageQtyPU;
    @XmlElement(name = "m_damageQtySU")
    protected BigDecimal mDamageQtySU;
    @XmlElement(name = "m_damageQtyTBU")
    protected BigDecimal mDamageQtyTBU;
    @XmlElement(name = "m_deliverCheckQtyCU")
    protected BigDecimal mDeliverCheckQtyCU;
    @XmlElement(name = "m_deliverCheckQtyPU")
    protected BigDecimal mDeliverCheckQtyPU;
    @XmlElement(name = "m_deliverCheckQtySU")
    protected BigDecimal mDeliverCheckQtySU;
    @XmlElement(name = "m_deliverCheckQtyTBU")
    protected BigDecimal mDeliverCheckQtyTBU;
    @XmlElement(name = "m_deliverCheckQtyTU")
    protected BigDecimal mDeliverCheckQtyTU;
    @XmlElementRef(name = "m_descFlexSegments", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9BaseFlexFieldDescFlexFieldDescFlexSegmentsData> mDescFlexSegments;
    @XmlElement(name = "m_destroyQtyCU")
    protected BigDecimal mDestroyQtyCU;
    @XmlElement(name = "m_destroyQtyPU")
    protected BigDecimal mDestroyQtyPU;
    @XmlElement(name = "m_destroyQtySU")
    protected BigDecimal mDestroyQtySU;
    @XmlElement(name = "m_destroyQtyTBU")
    protected BigDecimal mDestroyQtyTBU;
    @XmlElement(name = "m_destroyQtyTU")
    protected BigDecimal mDestroyQtyTU;
    @XmlElement(name = "m_docLineNo")
    protected Integer mDocLineNo;
    @XmlElement(name = "m_doingReqFundAC")
    protected BigDecimal mDoingReqFundAC;
    @XmlElement(name = "m_dosagePerPiece")
    protected BigDecimal mDosagePerPiece;
    @XmlElement(name = "m_evaluationMnyAC")
    protected BigDecimal mEvaluationMnyAC;
    @XmlElement(name = "m_evaluationMnyFC")
    protected BigDecimal mEvaluationMnyFC;
    @XmlElement(name = "m_evaluationMnyTC")
    protected BigDecimal mEvaluationMnyTC;
    @XmlElement(name = "m_evaluationPriceCU")
    protected BigDecimal mEvaluationPriceCU;
    @XmlElement(name = "m_evaluationPricePU")
    protected BigDecimal mEvaluationPricePU;
    @XmlElement(name = "m_execPrePayMny")
    protected BigDecimal mExecPrePayMny;
    @XmlElement(name = "m_execPrePayQtyPU")
    protected BigDecimal mExecPrePayQtyPU;
    @XmlElement(name = "m_execPrePayQtyTBU")
    protected BigDecimal mExecPrePayQtyTBU;
    @XmlElement(name = "m_execPrePayQtyTU")
    protected BigDecimal mExecPrePayQtyTU;
    @XmlElement(name = "m_eyeballedTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mEyeballedTime;
    @XmlElement(name = "m_eyeballingQtyCU")
    protected BigDecimal mEyeballingQtyCU;
    @XmlElement(name = "m_eyeballingQtyPU")
    protected BigDecimal mEyeballingQtyPU;
    @XmlElement(name = "m_eyeballingQtySU")
    protected BigDecimal mEyeballingQtySU;
    @XmlElement(name = "m_eyeballingQtyTBU")
    protected BigDecimal mEyeballingQtyTBU;
    @XmlElement(name = "m_eyeballingQtyTU")
    protected BigDecimal mEyeballingQtyTU;
    @XmlElement(name = "m_fillQtyCU")
    protected BigDecimal mFillQtyCU;
    @XmlElement(name = "m_fillQtyPU")
    protected BigDecimal mFillQtyPU;
    @XmlElement(name = "m_fillQtySU")
    protected BigDecimal mFillQtySU;
    @XmlElement(name = "m_fillQtyTBU")
    protected BigDecimal mFillQtyTBU;
    @XmlElement(name = "m_fillQtyTU")
    protected BigDecimal mFillQtyTU;
    @XmlElement(name = "m_finallyPriceAC")
    protected BigDecimal mFinallyPriceAC;
    @XmlElement(name = "m_finallyPriceTC")
    protected BigDecimal mFinallyPriceTC;
    @XmlElement(name = "m_freeReason")
    protected Integer mFreeReason;
    @XmlElement(name = "m_freeType")
    protected Integer mFreeType;
    @XmlElement(name = "m_hasCreateBudgetData")
    protected Boolean mHasCreateBudgetData;
    @XmlElement(name = "m_haveCountCostMnyFC")
    protected BigDecimal mHaveCountCostMnyFC;
    @XmlElement(name = "m_haveCountCostQtyCU")
    protected BigDecimal mHaveCountCostQtyCU;
    @XmlElement(name = "m_haveCountCostTaxFC")
    protected BigDecimal mHaveCountCostTaxFC;
    @XmlElement(name = "m_haveVerificationQtyTBU")
    protected BigDecimal mHaveVerificationQtyTBU;
    @XmlElement(name = "m_haveVerificationQtyTU")
    protected BigDecimal mHaveVerificationQtyTU;
    @XmlElement(name = "m_holdDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mHoldDate;
    @XmlElementRef(name = "m_holdUser", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mHoldUser;
    @XmlElement(name = "m_iD")
    protected Long mid;
    @XmlElementRef(name = "m_iNVLotInfo", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> minvLotInfo;
    @XmlElement(name = "m_iPVAC")
    protected BigDecimal mipvac;
    @XmlElement(name = "m_iPVFC")
    protected BigDecimal mipvfc;
    @XmlElement(name = "m_iPVFeeAC")
    protected BigDecimal mipvFeeAC;
    @XmlElement(name = "m_iPVFeeTC")
    protected BigDecimal mipvFeeTC;
    @XmlElement(name = "m_iPVFeeTaxAC")
    protected BigDecimal mipvFeeTaxAC;
    @XmlElement(name = "m_iPVFeeTaxTC")
    protected BigDecimal mipvFeeTaxTC;
    @XmlElement(name = "m_iPVTC")
    protected BigDecimal mipvtc;
    @XmlElement(name = "m_iPVTaxAC")
    protected BigDecimal mipvTaxAC;
    @XmlElement(name = "m_iPVTaxFC")
    protected BigDecimal mipvTaxFC;
    @XmlElement(name = "m_iPVTaxTC")
    protected BigDecimal mipvTaxTC;
    @XmlElement(name = "m_innerBalancePrice")
    protected BigDecimal mInnerBalancePrice;
    @XmlElementRef(name = "m_inspectLotInfo", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mInspectLotInfo;
    @XmlElement(name = "m_invDisabledTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mInvDisabledTime;
    @XmlElementRef(name = "m_invLotCode", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mInvLotCode;
    @XmlElement(name = "m_invLotEnableDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mInvLotEnableDate;
    @XmlElement(name = "m_invLotValidDate")
    protected Integer mInvLotValidDate;
    @XmlElement(name = "m_isAdjustDosagePerPiece")
    protected Boolean mIsAdjustDosagePerPiece;
    @XmlElement(name = "m_isAllotTOMo")
    protected Boolean mIsAllotTOMo;
    @XmlElement(name = "m_isAssociatedChild")
    protected Boolean mIsAssociatedChild;
    @XmlElement(name = "m_isEditMfc")
    protected Boolean mIsEditMfc;
    @XmlElement(name = "m_isEditSeiBan")
    protected Boolean mIsEditSeiBan;
    @XmlElement(name = "m_isEvaluationChangeable")
    protected Boolean mIsEvaluationChangeable;
    @XmlElement(name = "m_isFIClose")
    protected Boolean mIsFIClose;
    @XmlElement(name = "m_isGernerTBD")
    protected Boolean mIsGernerTBD;
    @XmlElement(name = "m_isInFlowFlag")
    protected Boolean mIsInFlowFlag;
    @XmlElement(name = "m_isItemVerFromSrcDoc")
    protected Boolean mIsItemVerFromSrcDoc;
    @XmlElement(name = "m_isKitWholeSet")
    protected Boolean mIsKitWholeSet;
    @XmlElement(name = "m_isNeedGenAAI")
    protected Boolean mIsNeedGenAAI;
    @XmlElement(name = "m_isNeedTransToGL")
    protected Boolean mIsNeedTransToGL;
    @XmlElement(name = "m_isNeedWarning")
    protected Boolean mIsNeedWarning;
    @XmlElement(name = "m_isPP")
    protected Boolean mIsPP;
    @XmlElement(name = "m_isPresent")
    protected Boolean mIsPresent;
    @XmlElement(name = "m_isPriceIncludeTax")
    protected Boolean mIsPriceIncludeTax;
    @XmlElement(name = "m_isQCfree")
    protected Boolean mIsQCfree;
    @XmlElement(name = "m_isRcvProcedureModify")
    protected Boolean mIsRcvProcedureModify;
    @XmlElement(name = "m_isRefill")
    protected Boolean mIsRefill;
    @XmlElement(name = "m_isRelationCompany")
    protected Boolean mIsRelationCompany;
    @XmlElement(name = "m_isRtnSupplierFromSrcDoc")
    protected Boolean mIsRtnSupplierFromSrcDoc;
    @XmlElement(name = "m_isSubCostChangeable")
    protected Boolean mIsSubCostChangeable;
    @XmlElement(name = "m_isTCToACRateFromSrc")
    protected Boolean mIsTCToACRateFromSrc;
    @XmlElement(name = "m_isTransferedToGL")
    protected Boolean mIsTransferedToGL;
    @XmlElement(name = "m_isUpDateWMTrans")
    protected Boolean mIsUpDateWMTrans;
    @XmlElement(name = "m_isUrgencyAccept")
    protected Boolean mIsUrgencyAccept;
    @XmlElement(name = "m_isZeroCost")
    protected Boolean mIsZeroCost;
    @XmlElement(name = "m_itemDealMode")
    protected Integer mItemDealMode;
    @XmlElementRef(name = "m_itemInfo", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9CBOSCMItemItemInfoData> mItemInfo;
    @XmlElement(name = "m_kITRcvMode")
    protected Integer mkitRcvMode;
    @XmlElementRef(name = "m_kitParentLine", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9PMRcvRcvLineData> mKitParentLine;
    @XmlElement(name = "m_lineSrcKitNO")
    protected Short mLineSrcKitNO;
    @XmlElement(name = "m_mO")
    protected Long mmo;
    @XmlElementRef(name = "m_mONo", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mmoNo;
    @XmlElement(name = "m_mRBID")
    protected Long mmrbid;
    @XmlElementRef(name = "m_mRBNo", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mmrbNo;
    @XmlElement(name = "m_machineCostAC")
    protected BigDecimal mMachineCostAC;
    @XmlElement(name = "m_machineCostFC")
    protected BigDecimal mMachineCostFC;
    @XmlElement(name = "m_machineCostTC")
    protected BigDecimal mMachineCostTC;
    @XmlElement(name = "m_manualCostAC")
    protected BigDecimal mManualCostAC;
    @XmlElement(name = "m_manualCostFC")
    protected BigDecimal mManualCostFC;
    @XmlElement(name = "m_manualCostTC")
    protected BigDecimal mManualCostTC;
    @XmlElement(name = "m_matchLayer")
    protected Integer mMatchLayer;
    @XmlElement(name = "m_matchedMnyAC")
    protected BigDecimal mMatchedMnyAC;
    @XmlElement(name = "m_matchedMnyFC")
    protected BigDecimal mMatchedMnyFC;
    @XmlElement(name = "m_matchedMnyTC")
    protected BigDecimal mMatchedMnyTC;
    @XmlElement(name = "m_matchedNetMnyAC")
    protected BigDecimal mMatchedNetMnyAC;
    @XmlElement(name = "m_matchedNetMnyFC")
    protected BigDecimal mMatchedNetMnyFC;
    @XmlElement(name = "m_matchedNetMnyTC")
    protected BigDecimal mMatchedNetMnyTC;
    @XmlElement(name = "m_matchedQtyCU")
    protected BigDecimal mMatchedQtyCU;
    @XmlElement(name = "m_matchedQtyPU")
    protected BigDecimal mMatchedQtyPU;
    @XmlElement(name = "m_matchedQtyRelateMnyAC")
    protected BigDecimal mMatchedQtyRelateMnyAC;
    @XmlElement(name = "m_matchedQtyRelateMnyFC")
    protected BigDecimal mMatchedQtyRelateMnyFC;
    @XmlElement(name = "m_matchedQtyRelateMnyTC")
    protected BigDecimal mMatchedQtyRelateMnyTC;
    @XmlElement(name = "m_matchedQtySU")
    protected BigDecimal mMatchedQtySU;
    @XmlElement(name = "m_matchedQtyTBU")
    protected BigDecimal mMatchedQtyTBU;
    @XmlElement(name = "m_matchedQtyTU")
    protected BigDecimal mMatchedQtyTU;
    @XmlElement(name = "m_matchedTaxAC")
    protected BigDecimal mMatchedTaxAC;
    @XmlElement(name = "m_matchedTaxFC")
    protected BigDecimal mMatchedTaxFC;
    @XmlElement(name = "m_matchedTaxTC")
    protected BigDecimal mMatchedTaxTC;
    @XmlElement(name = "m_materialCostAC")
    protected BigDecimal mMaterialCostAC;
    @XmlElement(name = "m_materialCostFC")
    protected BigDecimal mMaterialCostFC;
    @XmlElement(name = "m_materialCostTC")
    protected BigDecimal mMaterialCostTC;
    @XmlElement(name = "m_maxPrePayMnyAC")
    protected BigDecimal mMaxPrePayMnyAC;
    @XmlElement(name = "m_maxPrePayPercent")
    protected BigDecimal mMaxPrePayPercent;
    @XmlElement(name = "m_maxPrepayPercentEditable")
    protected Boolean mMaxPrepayPercentEditable;
    @XmlElementRef(name = "m_mfc", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9CBOSCMSupplierSupplierMISCInfoData> mMfc;
    @XmlElement(name = "m_mfcCostAC")
    protected BigDecimal mMfcCostAC;
    @XmlElement(name = "m_mfcCostFC")
    protected BigDecimal mMfcCostFC;
    @XmlElement(name = "m_mfcCostTC")
    protected BigDecimal mMfcCostTC;
    @XmlElementRef(name = "m_modifiedBy", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mModifiedBy;
    @XmlElement(name = "m_modifiedOn")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mModifiedOn;
    @XmlElement(name = "m_netOrderPrice")
    protected BigDecimal mNetOrderPrice;
    @XmlElement(name = "m_netWeight")
    protected BigDecimal mNetWeight;
    @XmlElementRef(name = "m_nextWPKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9BasePropertyTypesBizEntityKeyData> mNextWPKey;
    @XmlElementRef(name = "m_nextWPNo", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mNextWPNo;
    @XmlElementRef(name = "m_nofityMessage", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mNofityMessage;
    @XmlElementRef(name = "m_notEditAttributes", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mNotEditAttributes;
    @XmlElement(name = "m_oUToOBURate")
    protected BigDecimal mouToOBURate;
    @XmlElement(name = "m_orderPriceAC")
    protected BigDecimal mOrderPriceAC;
    @XmlElement(name = "m_orderPriceBy")
    protected Integer mOrderPriceBy;
    @XmlElement(name = "m_orderPriceTC")
    protected BigDecimal mOrderPriceTC;
    @XmlElement(name = "m_originalItemQty")
    protected BigDecimal mOriginalItemQty;
    @XmlElement(name = "m_originalItemQtyBaseUom")
    protected BigDecimal mOriginalItemQtyBaseUom;
    @XmlElement(name = "m_outStoreActualCost")
    protected Boolean mOutStoreActualCost;
    @XmlElement(name = "m_ownMaterialMnyAC")
    protected BigDecimal mOwnMaterialMnyAC;
    @XmlElement(name = "m_ownMaterialMnyFC")
    protected BigDecimal mOwnMaterialMnyFC;
    @XmlElement(name = "m_ownMaterialMnyTC")
    protected BigDecimal mOwnMaterialMnyTC;
    @XmlElementRef(name = "m_pOLotCode", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mpoLotCode;
    @XmlElement(name = "m_pUToPBURate")
    protected BigDecimal mpuToPBURate;
    @XmlElement(name = "m_partnerMaterialIPVAC")
    protected BigDecimal mPartnerMaterialIPVAC;
    @XmlElement(name = "m_partnerMaterialIPVFC")
    protected BigDecimal mPartnerMaterialIPVFC;
    @XmlElement(name = "m_partnerMaterialIPVTC")
    protected BigDecimal mPartnerMaterialIPVTC;
    @XmlElement(name = "m_partnerMaterialMnyAC")
    protected BigDecimal mPartnerMaterialMnyAC;
    @XmlElement(name = "m_partnerMaterialMnyFC")
    protected BigDecimal mPartnerMaterialMnyFC;
    @XmlElement(name = "m_partnerMaterialMnyTC")
    protected BigDecimal mPartnerMaterialMnyTC;
    @XmlElement(name = "m_payedMnyAC")
    protected BigDecimal mPayedMnyAC;
    @XmlElement(name = "m_payedMnyFC")
    protected BigDecimal mPayedMnyFC;
    @XmlElement(name = "m_payedMnyTC")
    protected BigDecimal mPayedMnyTC;
    @XmlElement(name = "m_payedQtyCU")
    protected BigDecimal mPayedQtyCU;
    @XmlElement(name = "m_payedQtyPU")
    protected BigDecimal mPayedQtyPU;
    @XmlElement(name = "m_payedQtySU")
    protected BigDecimal mPayedQtySU;
    @XmlElement(name = "m_payedQtyTBU")
    protected BigDecimal mPayedQtyTBU;
    @XmlElement(name = "m_payedQtyTU")
    protected BigDecimal mPayedQtyTU;
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
    @XmlElement(name = "m_piece")
    protected BigDecimal mPiece;
    @XmlElement(name = "m_planArrivedDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mPlanArrivedDate;
    @XmlElement(name = "m_planQtyCU")
    protected BigDecimal mPlanQtyCU;
    @XmlElement(name = "m_planQtyPU")
    protected BigDecimal mPlanQtyPU;
    @XmlElement(name = "m_planQtySU")
    protected BigDecimal mPlanQtySU;
    @XmlElement(name = "m_planQtyTBU")
    protected BigDecimal mPlanQtyTBU;
    @XmlElement(name = "m_planQtyTU")
    protected BigDecimal mPlanQtyTU;
    @XmlElement(name = "m_preMaturityDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mPreMaturityDate;
    @XmlElement(name = "m_prePayBill")
    protected Long mPrePayBill;
    @XmlElement(name = "m_prePayBillLine")
    protected Long mPrePayBillLine;
    @XmlElement(name = "m_prePayBillLineNo")
    protected Integer mPrePayBillLineNo;
    @XmlElement(name = "m_prePayMnyAC")
    protected BigDecimal mPrePayMnyAC;
    @XmlElement(name = "m_prePayPolicyEditable")
    protected Boolean mPrePayPolicyEditable;
    @XmlElement(name = "m_prePayQtyPU")
    protected BigDecimal mPrePayQtyPU;
    @XmlElement(name = "m_prePayQtyTBU")
    protected BigDecimal mPrePayQtyTBU;
    @XmlElement(name = "m_prePayQtyTU")
    protected BigDecimal mPrePayQtyTU;
    @XmlElementRef(name = "m_preWPKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9BasePropertyTypesBizEntityKeyData> mPreWPKey;
    @XmlElementRef(name = "m_preWPNo", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mPreWPNo;
    @XmlElement(name = "m_presentCostApportionLine")
    protected Long mPresentCostApportionLine;
    @XmlElement(name = "m_priceDifferenceAC")
    protected BigDecimal mPriceDifferenceAC;
    @XmlElement(name = "m_priceDifferenceFC")
    protected BigDecimal mPriceDifferenceFC;
    @XmlElement(name = "m_priceDifferenceTC")
    protected BigDecimal mPriceDifferenceTC;
    @XmlElement(name = "m_priceList")
    protected Long mPriceList;
    @XmlElementRef(name = "m_priceListCode", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mPriceListCode;
    @XmlElement(name = "m_priceSource")
    protected Integer mPriceSource;
    @XmlElement(name = "m_priceStatus")
    protected Boolean mPriceStatus;
    @XmlElement(name = "m_processArriveQty")
    protected BigDecimal mProcessArriveQty;
    @XmlElement(name = "m_processDestroyQty")
    protected BigDecimal mProcessDestroyQty;
    @XmlElement(name = "m_processEyeballingQty")
    protected BigDecimal mProcessEyeballingQty;
    @XmlElementRef(name = "m_processItem", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9CBOSCMItemItemInfoData> mProcessItem;
    @XmlElementRef(name = "m_processMFC", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9CBOSCMSupplierSupplierMISCInfoData> mProcessMFC;
    @XmlElement(name = "m_processPlanQty")
    protected BigDecimal mProcessPlanQty;
    @XmlElement(name = "m_processQty")
    protected BigDecimal mProcessQty;
    @XmlElement(name = "m_processQualifiedQty")
    protected BigDecimal mProcessQualifiedQty;
    @XmlElement(name = "m_processRcvQty")
    protected BigDecimal mProcessRcvQty;
    @XmlElement(name = "m_processReDeductQty")
    protected BigDecimal mProcessReDeductQty;
    @XmlElement(name = "m_processReFillQty")
    protected BigDecimal mProcessReFillQty;
    @XmlElement(name = "m_processRejectQty")
    protected BigDecimal mProcessRejectQty;
    @XmlElement(name = "m_processUToSURate")
    protected BigDecimal mProcessUToSURate;
    @XmlElement(name = "m_processUnqualifiedQty")
    protected BigDecimal mProcessUnqualifiedQty;
    @XmlElement(name = "m_productLineDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mProductLineDate;
    @XmlElement(name = "m_productLineKey")
    protected Long mProductLineKey;
    @XmlElementRef(name = "m_productLineNo", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mProductLineNo;
    @XmlElement(name = "m_purCostAC")
    protected BigDecimal mPurCostAC;
    @XmlElement(name = "m_purCostFC")
    protected BigDecimal mPurCostFC;
    @XmlElement(name = "m_purCostTC")
    protected BigDecimal mPurCostTC;
    @XmlElement(name = "m_purT0SaleUOMRate")
    protected BigDecimal mPurT0SaleUOMRate;
    @XmlElement(name = "m_qCBill")
    protected Long mqcBill;
    @XmlElementRef(name = "m_qCBillNo", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mqcBillNo;
    @XmlElement(name = "m_qCConclusion")
    protected Integer mqcConclusion;
    @XmlElement(name = "m_qCQCConclusion")
    protected Integer mqcqcConclusion;
    @XmlElement(name = "m_qualifiedQtyCU")
    protected BigDecimal mQualifiedQtyCU;
    @XmlElement(name = "m_qualifiedQtyPU")
    protected BigDecimal mQualifiedQtyPU;
    @XmlElement(name = "m_qualifiedQtySU")
    protected BigDecimal mQualifiedQtySU;
    @XmlElement(name = "m_qualifiedQtyTBU")
    protected BigDecimal mQualifiedQtyTBU;
    @XmlElement(name = "m_qualifiedQtyTU")
    protected BigDecimal mQualifiedQtyTU;
    @XmlElement(name = "m_quantityType")
    protected Integer mQuantityType;
    @XmlElementRef(name = "m_rCVLotInfo", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mrcvLotInfo;
    @XmlElement(name = "m_rCVToRMAType")
    protected Integer mrcvToRMAType;
    @XmlElement(name = "m_rMATransType")
    protected Integer mrmaTransType;
    @XmlElement(name = "m_rMAType")
    protected Integer mrmaType;
    @XmlElement(name = "m_rcvBoxes")
    protected BigDecimal mRcvBoxes;
    @XmlElementRef(name = "m_rcvDiscount", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfUFIDAU9PMRcvRcvDiscountData> mRcvDiscount;
    @XmlElementRef(name = "m_rcvLineExt", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9PMRcvRcvLineExtData> mRcvLineExt;
    @XmlElementRef(name = "m_rcvLineHoldReleaseHis", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfUFIDAU9PMRcvRcvLineHoldReleaseHisData> mRcvLineHoldReleaseHis;
    @XmlElementRef(name = "m_rcvLotCode", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mRcvLotCode;
    @XmlElement(name = "m_rcvProcedure")
    protected Integer mRcvProcedure;
    @XmlElement(name = "m_rcvQryTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mRcvQryTime;
    @XmlElement(name = "m_rcvQty")
    protected BigDecimal mRcvQty;
    @XmlElement(name = "m_rcvQtyCU")
    protected BigDecimal mRcvQtyCU;
    @XmlElement(name = "m_rcvQtyPU")
    protected BigDecimal mRcvQtyPU;
    @XmlElement(name = "m_rcvQtySU")
    protected BigDecimal mRcvQtySU;
    @XmlElement(name = "m_rcvQtyTBU")
    protected BigDecimal mRcvQtyTBU;
    @XmlElement(name = "m_rcvQtyTU")
    protected BigDecimal mRcvQtyTU;
    @XmlElement(name = "m_reasonableLossQtyCU")
    protected BigDecimal mReasonableLossQtyCU;
    @XmlElement(name = "m_reasonableLossQtyPU")
    protected BigDecimal mReasonableLossQtyPU;
    @XmlElement(name = "m_reasonableLossQtySU")
    protected BigDecimal mReasonableLossQtySU;
    @XmlElement(name = "m_reasonableLossQtyTBU")
    protected BigDecimal mReasonableLossQtyTBU;
    @XmlElement(name = "m_reasonableLossQtyTU")
    protected BigDecimal mReasonableLossQtyTU;
    @XmlElementRef(name = "m_receivement", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9PMRcvReceivementData> mReceivement;
    @XmlElement(name = "m_refillUseQtyTBU")
    protected BigDecimal mRefillUseQtyTBU;
    @XmlElement(name = "m_refillUseQtyTU")
    protected BigDecimal mRefillUseQtyTU;
    @XmlElement(name = "m_rejectMnyAC")
    protected BigDecimal mRejectMnyAC;
    @XmlElement(name = "m_rejectMnyFC")
    protected BigDecimal mRejectMnyFC;
    @XmlElement(name = "m_rejectMnyTC")
    protected BigDecimal mRejectMnyTC;
    @XmlElement(name = "m_rejectMode")
    protected Integer mRejectMode;
    @XmlElement(name = "m_rejectNetMnyAC")
    protected BigDecimal mRejectNetMnyAC;
    @XmlElement(name = "m_rejectNetMnyFC")
    protected BigDecimal mRejectNetMnyFC;
    @XmlElement(name = "m_rejectNetMnyTC")
    protected BigDecimal mRejectNetMnyTC;
    @XmlElement(name = "m_rejectQtyCU")
    protected BigDecimal mRejectQtyCU;
    @XmlElement(name = "m_rejectQtyPU")
    protected BigDecimal mRejectQtyPU;
    @XmlElement(name = "m_rejectQtySU")
    protected BigDecimal mRejectQtySU;
    @XmlElement(name = "m_rejectQtyTBU")
    protected BigDecimal mRejectQtyTBU;
    @XmlElement(name = "m_rejectQtyTU")
    protected BigDecimal mRejectQtyTU;
    @XmlElement(name = "m_rejectReason")
    protected Integer mRejectReason;
    @XmlElement(name = "m_rejectTaxMnyAC")
    protected BigDecimal mRejectTaxMnyAC;
    @XmlElement(name = "m_rejectTaxMnyFC")
    protected BigDecimal mRejectTaxMnyFC;
    @XmlElement(name = "m_rejectTaxMnyTC")
    protected BigDecimal mRejectTaxMnyTC;
    @XmlElement(name = "m_releaseDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mReleaseDate;
    @XmlElementRef(name = "m_releaseUser", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mReleaseUser;
    @XmlElementRef(name = "m_returnSupplier", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9CBOSCMSupplierSupplierMISCInfoData> mReturnSupplier;
    @XmlElement(name = "m_rtnConfirmedMnyAC")
    protected BigDecimal mRtnConfirmedMnyAC;
    @XmlElement(name = "m_rtnConfirmedMnyFC")
    protected BigDecimal mRtnConfirmedMnyFC;
    @XmlElement(name = "m_rtnConfirmedMnyTC")
    protected BigDecimal mRtnConfirmedMnyTC;
    @XmlElement(name = "m_rtnConfirmedNetMnyAC")
    protected BigDecimal mRtnConfirmedNetMnyAC;
    @XmlElement(name = "m_rtnConfirmedNetMnyFC")
    protected BigDecimal mRtnConfirmedNetMnyFC;
    @XmlElement(name = "m_rtnConfirmedNetMnyTC")
    protected BigDecimal mRtnConfirmedNetMnyTC;
    @XmlElement(name = "m_rtnConfirmedQtyCU")
    protected BigDecimal mRtnConfirmedQtyCU;
    @XmlElement(name = "m_rtnConfirmedQtyPU")
    protected BigDecimal mRtnConfirmedQtyPU;
    @XmlElement(name = "m_rtnConfirmedQtySU")
    protected BigDecimal mRtnConfirmedQtySU;
    @XmlElement(name = "m_rtnConfirmedQtyTBU")
    protected BigDecimal mRtnConfirmedQtyTBU;
    @XmlElement(name = "m_rtnConfirmedQtyTU")
    protected BigDecimal mRtnConfirmedQtyTU;
    @XmlElement(name = "m_rtnConfirmedTaxAC")
    protected BigDecimal mRtnConfirmedTaxAC;
    @XmlElement(name = "m_rtnConfirmedTaxFC")
    protected BigDecimal mRtnConfirmedTaxFC;
    @XmlElement(name = "m_rtnConfirmedTaxTC")
    protected BigDecimal mRtnConfirmedTaxTC;
    @XmlElement(name = "m_rtnDeductEvaluationMnyAC")
    protected BigDecimal mRtnDeductEvaluationMnyAC;
    @XmlElement(name = "m_rtnDeductEvaluationMnyFC")
    protected BigDecimal mRtnDeductEvaluationMnyFC;
    @XmlElement(name = "m_rtnDeductEvaluationMnyTC")
    protected BigDecimal mRtnDeductEvaluationMnyTC;
    @XmlElement(name = "m_rtnDeductMnyAC")
    protected BigDecimal mRtnDeductMnyAC;
    @XmlElement(name = "m_rtnDeductMnyFC")
    protected BigDecimal mRtnDeductMnyFC;
    @XmlElement(name = "m_rtnDeductMnyTC")
    protected BigDecimal mRtnDeductMnyTC;
    @XmlElement(name = "m_rtnDeductNetMnyAC")
    protected BigDecimal mRtnDeductNetMnyAC;
    @XmlElement(name = "m_rtnDeductNetMnyFC")
    protected BigDecimal mRtnDeductNetMnyFC;
    @XmlElement(name = "m_rtnDeductNetMnyTC")
    protected BigDecimal mRtnDeductNetMnyTC;
    @XmlElement(name = "m_rtnDeductQtyCU")
    protected BigDecimal mRtnDeductQtyCU;
    @XmlElement(name = "m_rtnDeductQtyPU")
    protected BigDecimal mRtnDeductQtyPU;
    @XmlElement(name = "m_rtnDeductQtySU")
    protected BigDecimal mRtnDeductQtySU;
    @XmlElement(name = "m_rtnDeductQtyTBU")
    protected BigDecimal mRtnDeductQtyTBU;
    @XmlElement(name = "m_rtnDeductQtyTU")
    protected BigDecimal mRtnDeductQtyTU;
    @XmlElement(name = "m_rtnDeductTaxAC")
    protected BigDecimal mRtnDeductTaxAC;
    @XmlElement(name = "m_rtnDeductTaxFC")
    protected BigDecimal mRtnDeductTaxFC;
    @XmlElement(name = "m_rtnDeductTaxTC")
    protected BigDecimal mRtnDeductTaxTC;
    @XmlElement(name = "m_rtnFillNoUsedIPVAC")
    protected BigDecimal mRtnFillNoUsedIPVAC;
    @XmlElement(name = "m_rtnFillNoUsedIPVFC")
    protected BigDecimal mRtnFillNoUsedIPVFC;
    @XmlElement(name = "m_rtnFillNoUsedIPVTC")
    protected BigDecimal mRtnFillNoUsedIPVTC;
    @XmlElement(name = "m_rtnFillQtyCU")
    protected BigDecimal mRtnFillQtyCU;
    @XmlElement(name = "m_rtnFillQtyPU")
    protected BigDecimal mRtnFillQtyPU;
    @XmlElement(name = "m_rtnFillQtySU")
    protected BigDecimal mRtnFillQtySU;
    @XmlElement(name = "m_rtnFillQtyTBU")
    protected BigDecimal mRtnFillQtyTBU;
    @XmlElement(name = "m_rtnFillQtyTU")
    protected BigDecimal mRtnFillQtyTU;
    @XmlElement(name = "m_rtnMatchedMnyAC")
    protected BigDecimal mRtnMatchedMnyAC;
    @XmlElement(name = "m_rtnMatchedMnyFC")
    protected BigDecimal mRtnMatchedMnyFC;
    @XmlElement(name = "m_rtnMatchedMnyTC")
    protected BigDecimal mRtnMatchedMnyTC;
    @XmlElement(name = "m_rtnMatchedNetMnyAC")
    protected BigDecimal mRtnMatchedNetMnyAC;
    @XmlElement(name = "m_rtnMatchedNetMnyFC")
    protected BigDecimal mRtnMatchedNetMnyFC;
    @XmlElement(name = "m_rtnMatchedNetMnyTC")
    protected BigDecimal mRtnMatchedNetMnyTC;
    @XmlElement(name = "m_rtnMatchedQtyCU")
    protected BigDecimal mRtnMatchedQtyCU;
    @XmlElement(name = "m_rtnMatchedQtyPU")
    protected BigDecimal mRtnMatchedQtyPU;
    @XmlElement(name = "m_rtnMatchedQtySU")
    protected BigDecimal mRtnMatchedQtySU;
    @XmlElement(name = "m_rtnMatchedQtyTBU")
    protected BigDecimal mRtnMatchedQtyTBU;
    @XmlElement(name = "m_rtnMatchedQtyTU")
    protected BigDecimal mRtnMatchedQtyTU;
    @XmlElement(name = "m_rtnMatchedTaxAC")
    protected BigDecimal mRtnMatchedTaxAC;
    @XmlElement(name = "m_rtnMatchedTaxFC")
    protected BigDecimal mRtnMatchedTaxFC;
    @XmlElement(name = "m_rtnMatchedTaxTC")
    protected BigDecimal mRtnMatchedTaxTC;
    @XmlElement(name = "m_rtnOutQtyCU")
    protected BigDecimal mRtnOutQtyCU;
    @XmlElement(name = "m_rtnOutQtyPU")
    protected BigDecimal mRtnOutQtyPU;
    @XmlElement(name = "m_rtnOutQtySU")
    protected BigDecimal mRtnOutQtySU;
    @XmlElement(name = "m_rtnOutQtyTBU")
    protected BigDecimal mRtnOutQtyTBU;
    @XmlElement(name = "m_rtnOutQtyTU")
    protected BigDecimal mRtnOutQtyTU;
    @XmlElement(name = "m_sO")
    protected Long mso;
    @XmlElementRef(name = "m_sOBPostPeriod", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfUFIDAU9PMRcvSOBPostPeriodData> msobPostPeriod;
    @XmlElement(name = "m_sUToSBURate")
    protected BigDecimal msuToSBURate;
    @XmlElementRef(name = "m_seiBanCode", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mSeiBanCode;
    @XmlElementRef(name = "m_shipDocNo", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mShipDocNo;
    @XmlElement(name = "m_shipLineID")
    protected Long mShipLineID;
    @XmlElement(name = "m_shipLineNo")
    protected Integer mShipLineNo;
    @XmlElementRef(name = "m_shipToSite", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9CBOSCMSupplierSupplierSiteMISCInfoData> mShipToSite;
    @XmlElementRef(name = "m_showUniqueID", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mShowUniqueID;
    @XmlElementRef(name = "m_showWarningMessageFormID", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mShowWarningMessageFormID;
    @XmlElementRef(name = "m_snCode", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mSnCode;
    @XmlElement(name = "m_splitFlag")
    protected Integer mSplitFlag;
    @XmlElement(name = "m_splitRcvLine")
    protected Long mSplitRcvLine;
    @XmlElementRef(name = "m_srcBudgetDocType", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mSrcBudgetDocType;
    @XmlElement(name = "m_srcBudgetLine")
    protected Long mSrcBudgetLine;
    @XmlElement(name = "m_srcBudgetOrg")
    protected Long mSrcBudgetOrg;
    @XmlElement(name = "m_srcCooperateOrg")
    protected Long mSrcCooperateOrg;
    @XmlElement(name = "m_srcCooperateShipLine")
    protected Long mSrcCooperateShipLine;
    @XmlElement(name = "m_srcCooperateType")
    protected Integer mSrcCooperateType;
    @XmlElementRef(name = "m_srcDoc", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9CBOSCMPropertyTypesSrcDocInfoData> mSrcDoc;
    @XmlElement(name = "m_srcDocCollabQtyTU")
    protected BigDecimal mSrcDocCollabQtyTU;
    @XmlElementRef(name = "m_srcDocCustomerSite", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9CBOSCMCustomerCustomerSiteMISCInfoData> mSrcDocCustomerSite;
    @XmlElement(name = "m_srcDocExchRateType")
    protected Integer mSrcDocExchRateType;
    @XmlElementRef(name = "m_srcDocInfoInvRtn", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9CBOSCMPropertyTypesSrcDocInfoData> mSrcDocInfoInvRtn;
    @XmlElement(name = "m_srcDocProcessQty")
    protected BigDecimal mSrcDocProcessQty;
    @XmlElement(name = "m_srcDocType")
    protected Integer mSrcDocType;
    @XmlElement(name = "m_srcFinallyPriceAC")
    protected BigDecimal mSrcFinallyPriceAC;
    @XmlElement(name = "m_srcFinallyPriceTC")
    protected BigDecimal mSrcFinallyPriceTC;
    @XmlElementRef(name = "m_srcPO", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9CBOSCMPropertyTypesSrcDocInfoData> mSrcPO;
    @XmlElementRef(name = "m_srcPR", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9CBOSCMPropertyTypesSrcDocInfoData> mSrcPR;
    @XmlElementRef(name = "m_srcPurC", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9CBOSCMPropertyTypesSrcDocInfoData> mSrcPurC;
    @XmlElementRef(name = "m_srcRcvLine", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9PMRcvRcvLineData> mSrcRcvLine;
    @XmlElement(name = "m_srcShip")
    protected Long mSrcShip;
    @XmlElement(name = "m_srcShipLine")
    protected Long mSrcShipLine;
    @XmlElement(name = "m_srcShipOrg")
    protected Long mSrcShipOrg;
    @XmlElementRef(name = "m_srcSubLine", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9PMRcvRcvSubLineData> mSrcSubLine;
    @XmlElement(name = "m_srcSysVersion")
    protected Long mSrcSysVersion;
    @XmlElement(name = "m_standardPriceAC")
    protected BigDecimal mStandardPriceAC;
    @XmlElement(name = "m_standardPriceFC")
    protected BigDecimal mStandardPriceFC;
    @XmlElement(name = "m_standardPriceTC")
    protected BigDecimal mStandardPriceTC;
    @XmlElement(name = "m_stateMachineID")
    protected String mStateMachineID;
    @XmlElement(name = "m_status")
    protected Integer mStatus;
    @XmlElement(name = "m_storageType")
    protected Integer mStorageType;
    @XmlElement(name = "m_subContractCostAC")
    protected BigDecimal mSubContractCostAC;
    @XmlElement(name = "m_subContractCostFC")
    protected BigDecimal mSubContractCostFC;
    @XmlElement(name = "m_subContractCostTC")
    protected BigDecimal mSubContractCostTC;
    @XmlElement(name = "m_submitChectTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mSubmitChectTime;
    @XmlElement(name = "m_sumDispenseLineUsedMnyAC")
    protected BigDecimal mSumDispenseLineUsedMnyAC;
    @XmlElement(name = "m_sumDispenseLineUsedNetMnyAC")
    protected BigDecimal mSumDispenseLineUsedNetMnyAC;
    @XmlElement(name = "m_sumDispenseLineUsedTaxAC")
    protected BigDecimal mSumDispenseLineUsedTaxAC;
    @XmlElement(name = "m_sumDispenseQtyAU")
    protected BigDecimal mSumDispenseQtyAU;
    @XmlElement(name = "m_sumRMAQtyPU")
    protected BigDecimal mSumRMAQtyPU;
    @XmlElement(name = "m_sumRMAQtyTBU")
    protected BigDecimal mSumRMAQtyTBU;
    @XmlElement(name = "m_sumRMAQtyTU")
    protected BigDecimal mSumRMAQtyTU;
    @XmlElement(name = "m_supplierDisabledTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mSupplierDisabledTime;
    @XmlElementRef(name = "m_supplierItemCode", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mSupplierItemCode;
    @XmlElementRef(name = "m_supplierItemName", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mSupplierItemName;
    @XmlElementRef(name = "m_supplierLotCode", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mSupplierLotCode;
    @XmlElement(name = "m_sysPriceAC")
    protected BigDecimal mSysPriceAC;
    @XmlElement(name = "m_sysPriceTC")
    protected BigDecimal mSysPriceTC;
    @XmlElement(name = "m_sysVersion")
    protected Long mSysVersion;
    @XmlElement(name = "m_tBMainUOMToSubUOM")
    protected BigDecimal mtbMainUOMToSubUOM;
    @XmlElement(name = "m_tBUToCBURate")
    protected BigDecimal mtbuToCBURate;
    @XmlElement(name = "m_tBUToPBURate")
    protected BigDecimal mtbuToPBURate;
    @XmlElement(name = "m_tBUToSBURate")
    protected BigDecimal mtbuToSBURate;
    @XmlElement(name = "m_tCToACExchRate")
    protected BigDecimal mtcToACExchRate;
    @XmlElement(name = "m_tCToACExchRateRound")
    protected Integer mtcToACExchRateRound;
    @XmlElement(name = "m_tUToTBURate")
    protected BigDecimal mtuToTBURate;
    @XmlElement(name = "m_taskOutput")
    protected Long mTaskOutput;
    @XmlElement(name = "m_taxRate")
    protected BigDecimal mTaxRate;
    @XmlElement(name = "m_taxType")
    protected Integer mTaxType;
    @XmlElement(name = "m_tempID")
    protected Long mTempID;
    @XmlElement(name = "m_totalFeeAC")
    protected BigDecimal mTotalFeeAC;
    @XmlElement(name = "m_totalFeeFC")
    protected BigDecimal mTotalFeeFC;
    @XmlElement(name = "m_totalMnyAC")
    protected BigDecimal mTotalMnyAC;
    @XmlElement(name = "m_totalMnyFC")
    protected BigDecimal mTotalMnyFC;
    @XmlElement(name = "m_totalMnyTC")
    protected BigDecimal mTotalMnyTC;
    @XmlElement(name = "m_totalNetFeeAC")
    protected BigDecimal mTotalNetFeeAC;
    @XmlElement(name = "m_totalNetFeeFC")
    protected BigDecimal mTotalNetFeeFC;
    @XmlElement(name = "m_totalNetFeeTC")
    protected BigDecimal mTotalNetFeeTC;
    @XmlElement(name = "m_totalNetMnyAC")
    protected BigDecimal mTotalNetMnyAC;
    @XmlElement(name = "m_totalNetMnyFC")
    protected BigDecimal mTotalNetMnyFC;
    @XmlElement(name = "m_totalNetMnyTC")
    protected BigDecimal mTotalNetMnyTC;
    @XmlElement(name = "m_totalTaxAC")
    protected BigDecimal mTotalTaxAC;
    @XmlElement(name = "m_totalTaxFC")
    protected BigDecimal mTotalTaxFC;
    @XmlElement(name = "m_totalTaxTC")
    protected BigDecimal mTotalTaxTC;
    @XmlElement(name = "m_unqualifiedQtyCU")
    protected BigDecimal mUnqualifiedQtyCU;
    @XmlElement(name = "m_unqualifiedQtyPU")
    protected BigDecimal mUnqualifiedQtyPU;
    @XmlElement(name = "m_unqualifiedQtySU")
    protected BigDecimal mUnqualifiedQtySU;
    @XmlElement(name = "m_unqualifiedQtyTBU")
    protected BigDecimal mUnqualifiedQtyTBU;
    @XmlElement(name = "m_unqualifiedQtyTU")
    protected BigDecimal mUnqualifiedQtyTU;
    @XmlElement(name = "m_usageQty")
    protected BigDecimal mUsageQty;
    @XmlElement(name = "m_volume")
    protected BigDecimal mVolume;
    @XmlElementRef(name = "m_voucherDispCode", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mVoucherDispCode;
    @XmlElement(name = "m_voucherID")
    protected Long mVoucherID;
    @XmlElement(name = "m_voucherTypeID")
    protected Long mVoucherTypeID;
    @XmlElementRef(name = "m_wPKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9BasePropertyTypesBizEntityKeyData> mwpKey;
    @XmlElementRef(name = "m_wPNo", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mwpNo;
    @XmlElement(name = "m_weight")
    protected BigDecimal mWeight;

    /**
     * 获取apLastConfrimPostPeriod属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAPLastConfrimPostPeriod() {
        return apLastConfrimPostPeriod;
    }

    /**
     * 设置apLastConfrimPostPeriod属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAPLastConfrimPostPeriod(Long value) {
        this.apLastConfrimPostPeriod = value;
    }

    /**
     * 获取apLastConfrimPostPeriodSKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getAPLastConfrimPostPeriodSKey() {
        return apLastConfrimPostPeriodSKey;
    }

    /**
     * 设置apLastConfrimPostPeriodSKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setAPLastConfrimPostPeriodSKey(JAXBElement<EntityKey> value) {
        this.apLastConfrimPostPeriodSKey = value;
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
     * 获取bomuom属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getBOMUOM() {
        return bomuom;
    }

    /**
     * 设置bomuom属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setBOMUOM(Long value) {
        this.bomuom = value;
    }

    /**
     * 获取bomuomsKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getBOMUOMSKey() {
        return bomuomsKey;
    }

    /**
     * 设置bomuomsKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setBOMUOMSKey(JAXBElement<EntityKey> value) {
        this.bomuomsKey = value;
    }

    /**
     * 获取balanceCurrency属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getBalanceCurrency() {
        return balanceCurrency;
    }

    /**
     * 设置balanceCurrency属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setBalanceCurrency(Long value) {
        this.balanceCurrency = value;
    }

    /**
     * 获取balanceCurrencySKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getBalanceCurrencySKey() {
        return balanceCurrencySKey;
    }

    /**
     * 设置balanceCurrencySKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setBalanceCurrencySKey(JAXBElement<EntityKey> value) {
        this.balanceCurrencySKey = value;
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
     * 获取bizBudgetProject属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getBizBudgetProject() {
        return bizBudgetProject;
    }

    /**
     * 设置bizBudgetProject属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setBizBudgetProject(Long value) {
        this.bizBudgetProject = value;
    }

    /**
     * 获取bizBudgetProjectSKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getBizBudgetProjectSKey() {
        return bizBudgetProjectSKey;
    }

    /**
     * 设置bizBudgetProjectSKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setBizBudgetProjectSKey(JAXBElement<EntityKey> value) {
        this.bizBudgetProjectSKey = value;
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
     * 获取configResultOrg属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getConfigResultOrg() {
        return configResultOrg;
    }

    /**
     * 设置configResultOrg属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setConfigResultOrg(Long value) {
        this.configResultOrg = value;
    }

    /**
     * 获取configResultOrgSKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getConfigResultOrgSKey() {
        return configResultOrgSKey;
    }

    /**
     * 设置configResultOrgSKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setConfigResultOrgSKey(JAXBElement<EntityKey> value) {
        this.configResultOrgSKey = value;
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
     * 获取cooperateOrg属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCooperateOrg() {
        return cooperateOrg;
    }

    /**
     * 设置cooperateOrg属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCooperateOrg(Long value) {
        this.cooperateOrg = value;
    }

    /**
     * 获取cooperateOrgSKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getCooperateOrgSKey() {
        return cooperateOrgSKey;
    }

    /**
     * 设置cooperateOrgSKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setCooperateOrgSKey(JAXBElement<EntityKey> value) {
        this.cooperateOrgSKey = value;
    }

    /**
     * 获取costBaseUOM属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCostBaseUOM() {
        return costBaseUOM;
    }

    /**
     * 设置costBaseUOM属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCostBaseUOM(Long value) {
        this.costBaseUOM = value;
    }

    /**
     * 获取costBaseUOMSKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getCostBaseUOMSKey() {
        return costBaseUOMSKey;
    }

    /**
     * 设置costBaseUOMSKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setCostBaseUOMSKey(JAXBElement<EntityKey> value) {
        this.costBaseUOMSKey = value;
    }

    /**
     * 获取costUOM属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCostUOM() {
        return costUOM;
    }

    /**
     * 设置costUOM属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCostUOM(Long value) {
        this.costUOM = value;
    }

    /**
     * 获取costUOMSKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getCostUOMSKey() {
        return costUOMSKey;
    }

    /**
     * 设置costUOMSKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setCostUOMSKey(JAXBElement<EntityKey> value) {
        this.costUOMSKey = value;
    }

    /**
     * 获取currentOrg属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCurrentOrg() {
        return currentOrg;
    }

    /**
     * 设置currentOrg属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCurrentOrg(Long value) {
        this.currentOrg = value;
    }

    /**
     * 获取currentOrgSKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getCurrentOrgSKey() {
        return currentOrgSKey;
    }

    /**
     * 设置currentOrgSKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setCurrentOrgSKey(JAXBElement<EntityKey> value) {
        this.currentOrgSKey = value;
    }

    /**
     * 获取fas属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getFAS() {
        return fas;
    }

    /**
     * 设置fas属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFAS(Long value) {
        this.fas = value;
    }

    /**
     * 获取fassKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getFASSKey() {
        return fassKey;
    }

    /**
     * 设置fassKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setFASSKey(JAXBElement<EntityKey> value) {
        this.fassKey = value;
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
     * 获取invLot属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getInvLot() {
        return invLot;
    }

    /**
     * 设置invLot属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setInvLot(Long value) {
        this.invLot = value;
    }

    /**
     * 获取invLotSKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getInvLotSKey() {
        return invLotSKey;
    }

    /**
     * 设置invLotSKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setInvLotSKey(JAXBElement<EntityKey> value) {
        this.invLotSKey = value;
    }

    /**
     * 获取kitParentLineSKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getKitParentLineSKey() {
        return kitParentLineSKey;
    }

    /**
     * 设置kitParentLineSKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setKitParentLineSKey(JAXBElement<EntityKey> value) {
        this.kitParentLineSKey = value;
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
     * 获取mnyBudgetProject属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMnyBudgetProject() {
        return mnyBudgetProject;
    }

    /**
     * 设置mnyBudgetProject属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMnyBudgetProject(Long value) {
        this.mnyBudgetProject = value;
    }

    /**
     * 获取mnyBudgetProjectSKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getMnyBudgetProjectSKey() {
        return mnyBudgetProjectSKey;
    }

    /**
     * 设置mnyBudgetProjectSKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setMnyBudgetProjectSKey(JAXBElement<EntityKey> value) {
        this.mnyBudgetProjectSKey = value;
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
     * 获取multiPrePayBillNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MultiLangDataDict }{@code >}
     *     
     */
    public JAXBElement<MultiLangDataDict> getMultiPrePayBillNo() {
        return multiPrePayBillNo;
    }

    /**
     * 设置multiPrePayBillNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MultiLangDataDict }{@code >}
     *     
     */
    public void setMultiPrePayBillNo(JAXBElement<MultiLangDataDict> value) {
        this.multiPrePayBillNo = value;
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
     * 获取multiSONo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MultiLangDataDict }{@code >}
     *     
     */
    public JAXBElement<MultiLangDataDict> getMultiSONo() {
        return multiSONo;
    }

    /**
     * 设置multiSONo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MultiLangDataDict }{@code >}
     *     
     */
    public void setMultiSONo(JAXBElement<MultiLangDataDict> value) {
        this.multiSONo = value;
    }

    /**
     * 获取nextWPSupplier属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNextWPSupplier() {
        return nextWPSupplier;
    }

    /**
     * 设置nextWPSupplier属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNextWPSupplier(Long value) {
        this.nextWPSupplier = value;
    }

    /**
     * 获取nextWPSupplierSKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getNextWPSupplierSKey() {
        return nextWPSupplierSKey;
    }

    /**
     * 设置nextWPSupplierSKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setNextWPSupplierSKey(JAXBElement<EntityKey> value) {
        this.nextWPSupplierSKey = value;
    }

    /**
     * 获取originalItem属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOriginalItem() {
        return originalItem;
    }

    /**
     * 设置originalItem属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOriginalItem(Long value) {
        this.originalItem = value;
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
     * 获取originalItemSKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getOriginalItemSKey() {
        return originalItemSKey;
    }

    /**
     * 设置originalItemSKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setOriginalItemSKey(JAXBElement<EntityKey> value) {
        this.originalItemSKey = value;
    }

    /**
     * 获取ownOrg属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOwnOrg() {
        return ownOrg;
    }

    /**
     * 设置ownOrg属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOwnOrg(Long value) {
        this.ownOrg = value;
    }

    /**
     * 获取ownOrgSKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getOwnOrgSKey() {
        return ownOrgSKey;
    }

    /**
     * 设置ownOrgSKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setOwnOrgSKey(JAXBElement<EntityKey> value) {
        this.ownOrgSKey = value;
    }

    /**
     * 获取poLot属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPOLot() {
        return poLot;
    }

    /**
     * 设置poLot属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPOLot(Long value) {
        this.poLot = value;
    }

    /**
     * 获取poLotSKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getPOLotSKey() {
        return poLotSKey;
    }

    /**
     * 设置poLotSKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setPOLotSKey(JAXBElement<EntityKey> value) {
        this.poLotSKey = value;
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
     * 获取prePayBillNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrePayBillNo() {
        return prePayBillNo;
    }

    /**
     * 设置prePayBillNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrePayBillNo(JAXBElement<String> value) {
        this.prePayBillNo = value;
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
     * 获取preWPSupplier属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPreWPSupplier() {
        return preWPSupplier;
    }

    /**
     * 设置preWPSupplier属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPreWPSupplier(Long value) {
        this.preWPSupplier = value;
    }

    /**
     * 获取preWPSupplierSKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getPreWPSupplierSKey() {
        return preWPSupplierSKey;
    }

    /**
     * 设置preWPSupplierSKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setPreWPSupplierSKey(JAXBElement<EntityKey> value) {
        this.preWPSupplierSKey = value;
    }

    /**
     * 获取priceBaseUOM属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPriceBaseUOM() {
        return priceBaseUOM;
    }

    /**
     * 设置priceBaseUOM属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPriceBaseUOM(Long value) {
        this.priceBaseUOM = value;
    }

    /**
     * 获取priceBaseUOMSKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getPriceBaseUOMSKey() {
        return priceBaseUOMSKey;
    }

    /**
     * 设置priceBaseUOMSKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setPriceBaseUOMSKey(JAXBElement<EntityKey> value) {
        this.priceBaseUOMSKey = value;
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
     * 获取priceUOM属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPriceUOM() {
        return priceUOM;
    }

    /**
     * 设置priceUOM属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPriceUOM(Long value) {
        this.priceUOM = value;
    }

    /**
     * 获取priceUOMSKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getPriceUOMSKey() {
        return priceUOMSKey;
    }

    /**
     * 设置priceUOMSKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setPriceUOMSKey(JAXBElement<EntityKey> value) {
        this.priceUOMSKey = value;
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
     * 获取purDept属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPurDept() {
        return purDept;
    }

    /**
     * 设置purDept属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPurDept(Long value) {
        this.purDept = value;
    }

    /**
     * 获取purDeptSKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getPurDeptSKey() {
        return purDeptSKey;
    }

    /**
     * 设置purDeptSKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setPurDeptSKey(JAXBElement<EntityKey> value) {
        this.purDeptSKey = value;
    }

    /**
     * 获取purOper属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPurOper() {
        return purOper;
    }

    /**
     * 设置purOper属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPurOper(Long value) {
        this.purOper = value;
    }

    /**
     * 获取purOperSKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getPurOperSKey() {
        return purOperSKey;
    }

    /**
     * 设置purOperSKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setPurOperSKey(JAXBElement<EntityKey> value) {
        this.purOperSKey = value;
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
     * 获取rcvDept属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRcvDept() {
        return rcvDept;
    }

    /**
     * 设置rcvDept属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRcvDept(Long value) {
        this.rcvDept = value;
    }

    /**
     * 获取rcvDeptSKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getRcvDeptSKey() {
        return rcvDeptSKey;
    }

    /**
     * 设置rcvDeptSKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setRcvDeptSKey(JAXBElement<EntityKey> value) {
        this.rcvDeptSKey = value;
    }

    /**
     * 获取rcvLineExtSKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getRcvLineExtSKey() {
        return rcvLineExtSKey;
    }

    /**
     * 设置rcvLineExtSKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setRcvLineExtSKey(JAXBElement<EntityKey> value) {
        this.rcvLineExtSKey = value;
    }

    /**
     * 获取rcvLot属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRcvLot() {
        return rcvLot;
    }

    /**
     * 设置rcvLot属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRcvLot(Long value) {
        this.rcvLot = value;
    }

    /**
     * 获取rcvLotSKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getRcvLotSKey() {
        return rcvLotSKey;
    }

    /**
     * 设置rcvLotSKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setRcvLotSKey(JAXBElement<EntityKey> value) {
        this.rcvLotSKey = value;
    }

    /**
     * 获取receivementSKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getReceivementSKey() {
        return receivementSKey;
    }

    /**
     * 设置receivementSKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setReceivementSKey(JAXBElement<EntityKey> value) {
        this.receivementSKey = value;
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
     * 获取requireDept属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRequireDept() {
        return requireDept;
    }

    /**
     * 设置requireDept属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRequireDept(Long value) {
        this.requireDept = value;
    }

    /**
     * 获取requireDeptSKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getRequireDeptSKey() {
        return requireDeptSKey;
    }

    /**
     * 设置requireDeptSKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setRequireDeptSKey(JAXBElement<EntityKey> value) {
        this.requireDeptSKey = value;
    }

    /**
     * 获取requireMan属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRequireMan() {
        return requireMan;
    }

    /**
     * 设置requireMan属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRequireMan(Long value) {
        this.requireMan = value;
    }

    /**
     * 获取requireManSKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getRequireManSKey() {
        return requireManSKey;
    }

    /**
     * 设置requireManSKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setRequireManSKey(JAXBElement<EntityKey> value) {
        this.requireManSKey = value;
    }

    /**
     * 获取requireOrg属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRequireOrg() {
        return requireOrg;
    }

    /**
     * 设置requireOrg属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRequireOrg(Long value) {
        this.requireOrg = value;
    }

    /**
     * 获取requireOrgSKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getRequireOrgSKey() {
        return requireOrgSKey;
    }

    /**
     * 设置requireOrgSKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setRequireOrgSKey(JAXBElement<EntityKey> value) {
        this.requireOrgSKey = value;
    }

    /**
     * 获取rtnReason属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRtnReason() {
        return rtnReason;
    }

    /**
     * 设置rtnReason属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRtnReason(Long value) {
        this.rtnReason = value;
    }

    /**
     * 获取rtnReasonSKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getRtnReasonSKey() {
        return rtnReasonSKey;
    }

    /**
     * 设置rtnReasonSKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setRtnReasonSKey(JAXBElement<EntityKey> value) {
        this.rtnReasonSKey = value;
    }

    /**
     * 获取soNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSONo() {
        return soNo;
    }

    /**
     * 设置soNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSONo(JAXBElement<String> value) {
        this.soNo = value;
    }

    /**
     * 获取saleRtnOrg属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSaleRtnOrg() {
        return saleRtnOrg;
    }

    /**
     * 设置saleRtnOrg属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSaleRtnOrg(Long value) {
        this.saleRtnOrg = value;
    }

    /**
     * 获取saleRtnOrgSKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getSaleRtnOrgSKey() {
        return saleRtnOrgSKey;
    }

    /**
     * 设置saleRtnOrgSKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setSaleRtnOrgSKey(JAXBElement<EntityKey> value) {
        this.saleRtnOrgSKey = value;
    }

    /**
     * 获取saleRtnWH属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSaleRtnWH() {
        return saleRtnWH;
    }

    /**
     * 设置saleRtnWH属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSaleRtnWH(Long value) {
        this.saleRtnWH = value;
    }

    /**
     * 获取saleRtnWHSKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getSaleRtnWHSKey() {
        return saleRtnWHSKey;
    }

    /**
     * 设置saleRtnWHSKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setSaleRtnWHSKey(JAXBElement<EntityKey> value) {
        this.saleRtnWHSKey = value;
    }

    /**
     * 获取seiBan属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSeiBan() {
        return seiBan;
    }

    /**
     * 设置seiBan属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSeiBan(Long value) {
        this.seiBan = value;
    }

    /**
     * 获取seiBanSKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getSeiBanSKey() {
        return seiBanSKey;
    }

    /**
     * 设置seiBanSKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setSeiBanSKey(JAXBElement<EntityKey> value) {
        this.seiBanSKey = value;
    }

    /**
     * 获取srcRcvLineSKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getSrcRcvLineSKey() {
        return srcRcvLineSKey;
    }

    /**
     * 设置srcRcvLineSKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setSrcRcvLineSKey(JAXBElement<EntityKey> value) {
        this.srcRcvLineSKey = value;
    }

    /**
     * 获取srcSubLineSKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getSrcSubLineSKey() {
        return srcSubLineSKey;
    }

    /**
     * 设置srcSubLineSKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setSrcSubLineSKey(JAXBElement<EntityKey> value) {
        this.srcSubLineSKey = value;
    }

    /**
     * 获取storeBaseUOM属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getStoreBaseUOM() {
        return storeBaseUOM;
    }

    /**
     * 设置storeBaseUOM属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setStoreBaseUOM(Long value) {
        this.storeBaseUOM = value;
    }

    /**
     * 获取storeBaseUOMSKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getStoreBaseUOMSKey() {
        return storeBaseUOMSKey;
    }

    /**
     * 设置storeBaseUOMSKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setStoreBaseUOMSKey(JAXBElement<EntityKey> value) {
        this.storeBaseUOMSKey = value;
    }

    /**
     * 获取storeUOM属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getStoreUOM() {
        return storeUOM;
    }

    /**
     * 设置storeUOM属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setStoreUOM(Long value) {
        this.storeUOM = value;
    }

    /**
     * 获取storeUOMSKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getStoreUOMSKey() {
        return storeUOMSKey;
    }

    /**
     * 设置storeUOMSKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setStoreUOMSKey(JAXBElement<EntityKey> value) {
        this.storeUOMSKey = value;
    }

    /**
     * 获取tbMainUOM属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTBMainUOM() {
        return tbMainUOM;
    }

    /**
     * 设置tbMainUOM属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTBMainUOM(Long value) {
        this.tbMainUOM = value;
    }

    /**
     * 获取tbMainUOMSKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getTBMainUOMSKey() {
        return tbMainUOMSKey;
    }

    /**
     * 设置tbMainUOMSKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setTBMainUOMSKey(JAXBElement<EntityKey> value) {
        this.tbMainUOMSKey = value;
    }

    /**
     * 获取tbSubUOM属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTBSubUOM() {
        return tbSubUOM;
    }

    /**
     * 设置tbSubUOM属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTBSubUOM(Long value) {
        this.tbSubUOM = value;
    }

    /**
     * 获取tbSubUOMSKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getTBSubUOMSKey() {
        return tbSubUOMSKey;
    }

    /**
     * 设置tbSubUOMSKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setTBSubUOMSKey(JAXBElement<EntityKey> value) {
        this.tbSubUOMSKey = value;
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
     * 获取tradeBaseUOM属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTradeBaseUOM() {
        return tradeBaseUOM;
    }

    /**
     * 设置tradeBaseUOM属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTradeBaseUOM(Long value) {
        this.tradeBaseUOM = value;
    }

    /**
     * 获取tradeBaseUOMSKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getTradeBaseUOMSKey() {
        return tradeBaseUOMSKey;
    }

    /**
     * 设置tradeBaseUOMSKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setTradeBaseUOMSKey(JAXBElement<EntityKey> value) {
        this.tradeBaseUOMSKey = value;
    }

    /**
     * 获取tradeUOM属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTradeUOM() {
        return tradeUOM;
    }

    /**
     * 设置tradeUOM属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTradeUOM(Long value) {
        this.tradeUOM = value;
    }

    /**
     * 获取tradeUOMSKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getTradeUOMSKey() {
        return tradeUOMSKey;
    }

    /**
     * 设置tradeUOMSKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setTradeUOMSKey(JAXBElement<EntityKey> value) {
        this.tradeUOMSKey = value;
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
     * 获取wh属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getWh() {
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
    public void setWh(Long value) {
        this.wh = value;
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
     * 获取whSKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getWhSKey() {
        return whSKey;
    }

    /**
     * 设置whSKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setWhSKey(JAXBElement<EntityKey> value) {
        this.whSKey = value;
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
     * 获取macToFCExchRate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMACToFCExchRate() {
        return macToFCExchRate;
    }

    /**
     * 设置macToFCExchRate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMACToFCExchRate(BigDecimal value) {
        this.macToFCExchRate = value;
    }

    /**
     * 获取macToFCExchRateRound属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMACToFCExchRateRound() {
        return macToFCExchRateRound;
    }

    /**
     * 设置macToFCExchRateRound属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMACToFCExchRateRound(Integer value) {
        this.macToFCExchRateRound = value;
    }

    /**
     * 获取mapConfirmDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMAPConfirmDate() {
        return mapConfirmDate;
    }

    /**
     * 设置mapConfirmDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMAPConfirmDate(XMLGregorianCalendar value) {
        this.mapConfirmDate = value;
    }

    /**
     * 获取mapMaturityDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMAPMaturityDate() {
        return mapMaturityDate;
    }

    /**
     * 设置mapMaturityDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMAPMaturityDate(XMLGregorianCalendar value) {
        this.mapMaturityDate = value;
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
     * 获取mAprrovedPrice属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMAprrovedPrice() {
        return mAprrovedPrice;
    }

    /**
     * 设置mAprrovedPrice属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMAprrovedPrice(BigDecimal value) {
        this.mAprrovedPrice = value;
    }

    /**
     * 获取mArriveBoxes属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMArriveBoxes() {
        return mArriveBoxes;
    }

    /**
     * 设置mArriveBoxes属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMArriveBoxes(BigDecimal value) {
        this.mArriveBoxes = value;
    }

    /**
     * 获取mArriveQtyCU属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMArriveQtyCU() {
        return mArriveQtyCU;
    }

    /**
     * 设置mArriveQtyCU属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMArriveQtyCU(BigDecimal value) {
        this.mArriveQtyCU = value;
    }

    /**
     * 获取mArriveQtyPU属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMArriveQtyPU() {
        return mArriveQtyPU;
    }

    /**
     * 设置mArriveQtyPU属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMArriveQtyPU(BigDecimal value) {
        this.mArriveQtyPU = value;
    }

    /**
     * 获取mArriveQtySU属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMArriveQtySU() {
        return mArriveQtySU;
    }

    /**
     * 设置mArriveQtySU属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMArriveQtySU(BigDecimal value) {
        this.mArriveQtySU = value;
    }

    /**
     * 获取mArriveQtyTBU属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMArriveQtyTBU() {
        return mArriveQtyTBU;
    }

    /**
     * 设置mArriveQtyTBU属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMArriveQtyTBU(BigDecimal value) {
        this.mArriveQtyTBU = value;
    }

    /**
     * 获取mArriveQtyTU属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMArriveQtyTU() {
        return mArriveQtyTU;
    }

    /**
     * 设置mArriveQtyTU属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMArriveQtyTU(BigDecimal value) {
        this.mArriveQtyTU = value;
    }

    /**
     * 获取mArriveTotalMnyAC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMArriveTotalMnyAC() {
        return mArriveTotalMnyAC;
    }

    /**
     * 设置mArriveTotalMnyAC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMArriveTotalMnyAC(BigDecimal value) {
        this.mArriveTotalMnyAC = value;
    }

    /**
     * 获取mArriveTotalMnyFC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMArriveTotalMnyFC() {
        return mArriveTotalMnyFC;
    }

    /**
     * 设置mArriveTotalMnyFC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMArriveTotalMnyFC(BigDecimal value) {
        this.mArriveTotalMnyFC = value;
    }

    /**
     * 获取mArriveTotalMnyTC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMArriveTotalMnyTC() {
        return mArriveTotalMnyTC;
    }

    /**
     * 设置mArriveTotalMnyTC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMArriveTotalMnyTC(BigDecimal value) {
        this.mArriveTotalMnyTC = value;
    }

    /**
     * 获取mArriveTotalNetMnyAC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMArriveTotalNetMnyAC() {
        return mArriveTotalNetMnyAC;
    }

    /**
     * 设置mArriveTotalNetMnyAC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMArriveTotalNetMnyAC(BigDecimal value) {
        this.mArriveTotalNetMnyAC = value;
    }

    /**
     * 获取mArriveTotalNetMnyFC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMArriveTotalNetMnyFC() {
        return mArriveTotalNetMnyFC;
    }

    /**
     * 设置mArriveTotalNetMnyFC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMArriveTotalNetMnyFC(BigDecimal value) {
        this.mArriveTotalNetMnyFC = value;
    }

    /**
     * 获取mArriveTotalNetMnyTC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMArriveTotalNetMnyTC() {
        return mArriveTotalNetMnyTC;
    }

    /**
     * 设置mArriveTotalNetMnyTC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMArriveTotalNetMnyTC(BigDecimal value) {
        this.mArriveTotalNetMnyTC = value;
    }

    /**
     * 获取mArriveTotalTaxAC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMArriveTotalTaxAC() {
        return mArriveTotalTaxAC;
    }

    /**
     * 设置mArriveTotalTaxAC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMArriveTotalTaxAC(BigDecimal value) {
        this.mArriveTotalTaxAC = value;
    }

    /**
     * 获取mArriveTotalTaxFC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMArriveTotalTaxFC() {
        return mArriveTotalTaxFC;
    }

    /**
     * 设置mArriveTotalTaxFC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMArriveTotalTaxFC(BigDecimal value) {
        this.mArriveTotalTaxFC = value;
    }

    /**
     * 获取mArriveTotalTaxTC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMArriveTotalTaxTC() {
        return mArriveTotalTaxTC;
    }

    /**
     * 设置mArriveTotalTaxTC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMArriveTotalTaxTC(BigDecimal value) {
        this.mArriveTotalTaxTC = value;
    }

    /**
     * 获取mArrivedTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMArrivedTime() {
        return mArrivedTime;
    }

    /**
     * 设置mArrivedTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMArrivedTime(XMLGregorianCalendar value) {
        this.mArrivedTime = value;
    }

    /**
     * 获取mAssociatedParentLine属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMAssociatedParentLine() {
        return mAssociatedParentLine;
    }

    /**
     * 设置mAssociatedParentLine属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMAssociatedParentLine(Long value) {
        this.mAssociatedParentLine = value;
    }

    /**
     * 获取mAssociatedParentLineNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMAssociatedParentLineNo() {
        return mAssociatedParentLineNo;
    }

    /**
     * 设置mAssociatedParentLineNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMAssociatedParentLineNo(Long value) {
        this.mAssociatedParentLineNo = value;
    }

    /**
     * 获取mAuditMan属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMAuditMan() {
        return mAuditMan;
    }

    /**
     * 设置mAuditMan属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMAuditMan(JAXBElement<String> value) {
        this.mAuditMan = value;
    }

    /**
     * 获取mAutoToRcv属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMAutoToRcv() {
        return mAutoToRcv;
    }

    /**
     * 设置mAutoToRcv属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMAutoToRcv(Boolean value) {
        this.mAutoToRcv = value;
    }

    /**
     * 获取mAutoToRcvRtn属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMAutoToRcvRtn() {
        return mAutoToRcvRtn;
    }

    /**
     * 设置mAutoToRcvRtn属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMAutoToRcvRtn(Boolean value) {
        this.mAutoToRcvRtn = value;
    }

    /**
     * 获取mbomid属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMBOMID() {
        return mbomid;
    }

    /**
     * 设置mbomid属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMBOMID(Long value) {
        this.mbomid = value;
    }

    /**
     * 获取mbomLineNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMBOMLineNo() {
        return mbomLineNo;
    }

    /**
     * 设置mbomLineNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMBOMLineNo(JAXBElement<String> value) {
        this.mbomLineNo = value;
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
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOSCMSupplierSupplierSiteMISCInfoData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9CBOSCMSupplierSupplierSiteMISCInfoData> getMBillToSite() {
        return mBillToSite;
    }

    /**
     * 设置mBillToSite属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOSCMSupplierSupplierSiteMISCInfoData }{@code >}
     *     
     */
    public void setMBillToSite(JAXBElement<UFIDAU9CBOSCMSupplierSupplierSiteMISCInfoData> value) {
        this.mBillToSite = value;
    }

    /**
     * 获取mBizCloseDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMBizCloseDate() {
        return mBizCloseDate;
    }

    /**
     * 设置mBizCloseDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMBizCloseDate(XMLGregorianCalendar value) {
        this.mBizCloseDate = value;
    }

    /**
     * 获取mcuToCBURate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMCUToCBURate() {
        return mcuToCBURate;
    }

    /**
     * 设置mcuToCBURate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMCUToCBURate(BigDecimal value) {
        this.mcuToCBURate = value;
    }

    /**
     * 获取mCanAPConfirmQtyCU属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMCanAPConfirmQtyCU() {
        return mCanAPConfirmQtyCU;
    }

    /**
     * 设置mCanAPConfirmQtyCU属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMCanAPConfirmQtyCU(BigDecimal value) {
        this.mCanAPConfirmQtyCU = value;
    }

    /**
     * 获取mCanAPConfirmQtyPU属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMCanAPConfirmQtyPU() {
        return mCanAPConfirmQtyPU;
    }

    /**
     * 设置mCanAPConfirmQtyPU属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMCanAPConfirmQtyPU(BigDecimal value) {
        this.mCanAPConfirmQtyPU = value;
    }

    /**
     * 获取mCanAPConfirmQtySU属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMCanAPConfirmQtySU() {
        return mCanAPConfirmQtySU;
    }

    /**
     * 设置mCanAPConfirmQtySU属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMCanAPConfirmQtySU(BigDecimal value) {
        this.mCanAPConfirmQtySU = value;
    }

    /**
     * 获取mCanAPConfirmQtyTBU属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMCanAPConfirmQtyTBU() {
        return mCanAPConfirmQtyTBU;
    }

    /**
     * 设置mCanAPConfirmQtyTBU属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMCanAPConfirmQtyTBU(BigDecimal value) {
        this.mCanAPConfirmQtyTBU = value;
    }

    /**
     * 获取mCanAPConfirmQtyTU属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMCanAPConfirmQtyTU() {
        return mCanAPConfirmQtyTU;
    }

    /**
     * 设置mCanAPConfirmQtyTU属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMCanAPConfirmQtyTU(BigDecimal value) {
        this.mCanAPConfirmQtyTU = value;
    }

    /**
     * 获取mCancel属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9BaseDocCancelData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9BaseDocCancelData> getMCancel() {
        return mCancel;
    }

    /**
     * 设置mCancel属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9BaseDocCancelData }{@code >}
     *     
     */
    public void setMCancel(JAXBElement<UFIDAU9BaseDocCancelData> value) {
        this.mCancel = value;
    }

    /**
     * 获取mCancelAuditDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMCancelAuditDate() {
        return mCancelAuditDate;
    }

    /**
     * 设置mCancelAuditDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMCancelAuditDate(XMLGregorianCalendar value) {
        this.mCancelAuditDate = value;
    }

    /**
     * 获取mCancelAuditMan属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMCancelAuditMan() {
        return mCancelAuditMan;
    }

    /**
     * 设置mCancelAuditMan属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMCancelAuditMan(JAXBElement<String> value) {
        this.mCancelAuditMan = value;
    }

    /**
     * 获取mChargeBase属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMChargeBase() {
        return mChargeBase;
    }

    /**
     * 设置mChargeBase属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMChargeBase(Integer value) {
        this.mChargeBase = value;
    }

    /**
     * 获取mChargeProcessMode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMChargeProcessMode() {
        return mChargeProcessMode;
    }

    /**
     * 设置mChargeProcessMode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMChargeProcessMode(Integer value) {
        this.mChargeProcessMode = value;
    }

    /**
     * 获取mChargeType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMChargeType() {
        return mChargeType;
    }

    /**
     * 设置mChargeType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMChargeType(Integer value) {
        this.mChargeType = value;
    }

    /**
     * 获取mCheckedTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMCheckedTime() {
        return mCheckedTime;
    }

    /**
     * 设置mCheckedTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMCheckedTime(XMLGregorianCalendar value) {
        this.mCheckedTime = value;
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
     * 获取mConfirmSupplier属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOSCMSupplierSupplierMISCInfoData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9CBOSCMSupplierSupplierMISCInfoData> getMConfirmSupplier() {
        return mConfirmSupplier;
    }

    /**
     * 设置mConfirmSupplier属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOSCMSupplierSupplierMISCInfoData }{@code >}
     *     
     */
    public void setMConfirmSupplier(JAXBElement<UFIDAU9CBOSCMSupplierSupplierMISCInfoData> value) {
        this.mConfirmSupplier = value;
    }

    /**
     * 获取mConfirmedMnyAC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMConfirmedMnyAC() {
        return mConfirmedMnyAC;
    }

    /**
     * 设置mConfirmedMnyAC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMConfirmedMnyAC(BigDecimal value) {
        this.mConfirmedMnyAC = value;
    }

    /**
     * 获取mConfirmedMnyFC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMConfirmedMnyFC() {
        return mConfirmedMnyFC;
    }

    /**
     * 设置mConfirmedMnyFC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMConfirmedMnyFC(BigDecimal value) {
        this.mConfirmedMnyFC = value;
    }

    /**
     * 获取mConfirmedMnyTC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMConfirmedMnyTC() {
        return mConfirmedMnyTC;
    }

    /**
     * 设置mConfirmedMnyTC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMConfirmedMnyTC(BigDecimal value) {
        this.mConfirmedMnyTC = value;
    }

    /**
     * 获取mConfirmedNetMnyAC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMConfirmedNetMnyAC() {
        return mConfirmedNetMnyAC;
    }

    /**
     * 设置mConfirmedNetMnyAC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMConfirmedNetMnyAC(BigDecimal value) {
        this.mConfirmedNetMnyAC = value;
    }

    /**
     * 获取mConfirmedNetMnyFC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMConfirmedNetMnyFC() {
        return mConfirmedNetMnyFC;
    }

    /**
     * 设置mConfirmedNetMnyFC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMConfirmedNetMnyFC(BigDecimal value) {
        this.mConfirmedNetMnyFC = value;
    }

    /**
     * 获取mConfirmedNetMnyTC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMConfirmedNetMnyTC() {
        return mConfirmedNetMnyTC;
    }

    /**
     * 设置mConfirmedNetMnyTC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMConfirmedNetMnyTC(BigDecimal value) {
        this.mConfirmedNetMnyTC = value;
    }

    /**
     * 获取mConfirmedQtyCU属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMConfirmedQtyCU() {
        return mConfirmedQtyCU;
    }

    /**
     * 设置mConfirmedQtyCU属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMConfirmedQtyCU(BigDecimal value) {
        this.mConfirmedQtyCU = value;
    }

    /**
     * 获取mConfirmedQtyPU属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMConfirmedQtyPU() {
        return mConfirmedQtyPU;
    }

    /**
     * 设置mConfirmedQtyPU属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMConfirmedQtyPU(BigDecimal value) {
        this.mConfirmedQtyPU = value;
    }

    /**
     * 获取mConfirmedQtySU属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMConfirmedQtySU() {
        return mConfirmedQtySU;
    }

    /**
     * 设置mConfirmedQtySU属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMConfirmedQtySU(BigDecimal value) {
        this.mConfirmedQtySU = value;
    }

    /**
     * 获取mConfirmedQtyTBU属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMConfirmedQtyTBU() {
        return mConfirmedQtyTBU;
    }

    /**
     * 设置mConfirmedQtyTBU属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMConfirmedQtyTBU(BigDecimal value) {
        this.mConfirmedQtyTBU = value;
    }

    /**
     * 获取mConfirmedQtyTU属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMConfirmedQtyTU() {
        return mConfirmedQtyTU;
    }

    /**
     * 设置mConfirmedQtyTU属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMConfirmedQtyTU(BigDecimal value) {
        this.mConfirmedQtyTU = value;
    }

    /**
     * 获取mConfirmedTaxAC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMConfirmedTaxAC() {
        return mConfirmedTaxAC;
    }

    /**
     * 设置mConfirmedTaxAC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMConfirmedTaxAC(BigDecimal value) {
        this.mConfirmedTaxAC = value;
    }

    /**
     * 获取mConfirmedTaxFC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMConfirmedTaxFC() {
        return mConfirmedTaxFC;
    }

    /**
     * 设置mConfirmedTaxFC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMConfirmedTaxFC(BigDecimal value) {
        this.mConfirmedTaxFC = value;
    }

    /**
     * 获取mConfirmedTaxTC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMConfirmedTaxTC() {
        return mConfirmedTaxTC;
    }

    /**
     * 设置mConfirmedTaxTC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMConfirmedTaxTC(BigDecimal value) {
        this.mConfirmedTaxTC = value;
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
     * 获取mCooperateRcv属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMCooperateRcv() {
        return mCooperateRcv;
    }

    /**
     * 设置mCooperateRcv属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMCooperateRcv(Long value) {
        this.mCooperateRcv = value;
    }

    /**
     * 获取mCostPercent属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMCostPercent() {
        return mCostPercent;
    }

    /**
     * 设置mCostPercent属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMCostPercent(BigDecimal value) {
        this.mCostPercent = value;
    }

    /**
     * 获取mCostPriceSource属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMCostPriceSource() {
        return mCostPriceSource;
    }

    /**
     * 设置mCostPriceSource属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMCostPriceSource(JAXBElement<String> value) {
        this.mCostPriceSource = value;
    }

    /**
     * 获取mCostPriceSourceType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMCostPriceSourceType() {
        return mCostPriceSourceType;
    }

    /**
     * 设置mCostPriceSourceType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMCostPriceSourceType(Integer value) {
        this.mCostPriceSourceType = value;
    }

    /**
     * 获取mCraftRouteKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMCraftRouteKey() {
        return mCraftRouteKey;
    }

    /**
     * 设置mCraftRouteKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMCraftRouteKey(Long value) {
        this.mCraftRouteKey = value;
    }

    /**
     * 获取mCraftRouteNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMCraftRouteNo() {
        return mCraftRouteNo;
    }

    /**
     * 设置mCraftRouteNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMCraftRouteNo(JAXBElement<String> value) {
        this.mCraftRouteNo = value;
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
     * 获取mCusBillToSite属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOSCMCustomerCustomerSiteMISCInfoData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9CBOSCMCustomerCustomerSiteMISCInfoData> getMCusBillToSite() {
        return mCusBillToSite;
    }

    /**
     * 设置mCusBillToSite属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOSCMCustomerCustomerSiteMISCInfoData }{@code >}
     *     
     */
    public void setMCusBillToSite(JAXBElement<UFIDAU9CBOSCMCustomerCustomerSiteMISCInfoData> value) {
        this.mCusBillToSite = value;
    }

    /**
     * 获取mCustomerShipToSite属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOSCMCustomerCustomerSiteMISCInfoData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9CBOSCMCustomerCustomerSiteMISCInfoData> getMCustomerShipToSite() {
        return mCustomerShipToSite;
    }

    /**
     * 设置mCustomerShipToSite属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOSCMCustomerCustomerSiteMISCInfoData }{@code >}
     *     
     */
    public void setMCustomerShipToSite(JAXBElement<UFIDAU9CBOSCMCustomerCustomerSiteMISCInfoData> value) {
        this.mCustomerShipToSite = value;
    }

    /**
     * 获取mDamageQtyCU属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMDamageQtyCU() {
        return mDamageQtyCU;
    }

    /**
     * 设置mDamageQtyCU属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMDamageQtyCU(BigDecimal value) {
        this.mDamageQtyCU = value;
    }

    /**
     * 获取mDamageQtyPU属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMDamageQtyPU() {
        return mDamageQtyPU;
    }

    /**
     * 设置mDamageQtyPU属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMDamageQtyPU(BigDecimal value) {
        this.mDamageQtyPU = value;
    }

    /**
     * 获取mDamageQtySU属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMDamageQtySU() {
        return mDamageQtySU;
    }

    /**
     * 设置mDamageQtySU属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMDamageQtySU(BigDecimal value) {
        this.mDamageQtySU = value;
    }

    /**
     * 获取mDamageQtyTBU属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMDamageQtyTBU() {
        return mDamageQtyTBU;
    }

    /**
     * 设置mDamageQtyTBU属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMDamageQtyTBU(BigDecimal value) {
        this.mDamageQtyTBU = value;
    }

    /**
     * 获取mDeliverCheckQtyCU属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMDeliverCheckQtyCU() {
        return mDeliverCheckQtyCU;
    }

    /**
     * 设置mDeliverCheckQtyCU属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMDeliverCheckQtyCU(BigDecimal value) {
        this.mDeliverCheckQtyCU = value;
    }

    /**
     * 获取mDeliverCheckQtyPU属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMDeliverCheckQtyPU() {
        return mDeliverCheckQtyPU;
    }

    /**
     * 设置mDeliverCheckQtyPU属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMDeliverCheckQtyPU(BigDecimal value) {
        this.mDeliverCheckQtyPU = value;
    }

    /**
     * 获取mDeliverCheckQtySU属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMDeliverCheckQtySU() {
        return mDeliverCheckQtySU;
    }

    /**
     * 设置mDeliverCheckQtySU属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMDeliverCheckQtySU(BigDecimal value) {
        this.mDeliverCheckQtySU = value;
    }

    /**
     * 获取mDeliverCheckQtyTBU属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMDeliverCheckQtyTBU() {
        return mDeliverCheckQtyTBU;
    }

    /**
     * 设置mDeliverCheckQtyTBU属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMDeliverCheckQtyTBU(BigDecimal value) {
        this.mDeliverCheckQtyTBU = value;
    }

    /**
     * 获取mDeliverCheckQtyTU属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMDeliverCheckQtyTU() {
        return mDeliverCheckQtyTU;
    }

    /**
     * 设置mDeliverCheckQtyTU属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMDeliverCheckQtyTU(BigDecimal value) {
        this.mDeliverCheckQtyTU = value;
    }

    /**
     * 获取mDescFlexSegments属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9BaseFlexFieldDescFlexFieldDescFlexSegmentsData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9BaseFlexFieldDescFlexFieldDescFlexSegmentsData> getMDescFlexSegments() {
        return mDescFlexSegments;
    }

    /**
     * 设置mDescFlexSegments属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9BaseFlexFieldDescFlexFieldDescFlexSegmentsData }{@code >}
     *     
     */
    public void setMDescFlexSegments(JAXBElement<UFIDAU9BaseFlexFieldDescFlexFieldDescFlexSegmentsData> value) {
        this.mDescFlexSegments = value;
    }

    /**
     * 获取mDestroyQtyCU属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMDestroyQtyCU() {
        return mDestroyQtyCU;
    }

    /**
     * 设置mDestroyQtyCU属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMDestroyQtyCU(BigDecimal value) {
        this.mDestroyQtyCU = value;
    }

    /**
     * 获取mDestroyQtyPU属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMDestroyQtyPU() {
        return mDestroyQtyPU;
    }

    /**
     * 设置mDestroyQtyPU属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMDestroyQtyPU(BigDecimal value) {
        this.mDestroyQtyPU = value;
    }

    /**
     * 获取mDestroyQtySU属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMDestroyQtySU() {
        return mDestroyQtySU;
    }

    /**
     * 设置mDestroyQtySU属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMDestroyQtySU(BigDecimal value) {
        this.mDestroyQtySU = value;
    }

    /**
     * 获取mDestroyQtyTBU属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMDestroyQtyTBU() {
        return mDestroyQtyTBU;
    }

    /**
     * 设置mDestroyQtyTBU属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMDestroyQtyTBU(BigDecimal value) {
        this.mDestroyQtyTBU = value;
    }

    /**
     * 获取mDestroyQtyTU属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMDestroyQtyTU() {
        return mDestroyQtyTU;
    }

    /**
     * 设置mDestroyQtyTU属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMDestroyQtyTU(BigDecimal value) {
        this.mDestroyQtyTU = value;
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
     * 获取mDosagePerPiece属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMDosagePerPiece() {
        return mDosagePerPiece;
    }

    /**
     * 设置mDosagePerPiece属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMDosagePerPiece(BigDecimal value) {
        this.mDosagePerPiece = value;
    }

    /**
     * 获取mEvaluationMnyAC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMEvaluationMnyAC() {
        return mEvaluationMnyAC;
    }

    /**
     * 设置mEvaluationMnyAC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMEvaluationMnyAC(BigDecimal value) {
        this.mEvaluationMnyAC = value;
    }

    /**
     * 获取mEvaluationMnyFC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMEvaluationMnyFC() {
        return mEvaluationMnyFC;
    }

    /**
     * 设置mEvaluationMnyFC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMEvaluationMnyFC(BigDecimal value) {
        this.mEvaluationMnyFC = value;
    }

    /**
     * 获取mEvaluationMnyTC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMEvaluationMnyTC() {
        return mEvaluationMnyTC;
    }

    /**
     * 设置mEvaluationMnyTC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMEvaluationMnyTC(BigDecimal value) {
        this.mEvaluationMnyTC = value;
    }

    /**
     * 获取mEvaluationPriceCU属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMEvaluationPriceCU() {
        return mEvaluationPriceCU;
    }

    /**
     * 设置mEvaluationPriceCU属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMEvaluationPriceCU(BigDecimal value) {
        this.mEvaluationPriceCU = value;
    }

    /**
     * 获取mEvaluationPricePU属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMEvaluationPricePU() {
        return mEvaluationPricePU;
    }

    /**
     * 设置mEvaluationPricePU属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMEvaluationPricePU(BigDecimal value) {
        this.mEvaluationPricePU = value;
    }

    /**
     * 获取mExecPrePayMny属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMExecPrePayMny() {
        return mExecPrePayMny;
    }

    /**
     * 设置mExecPrePayMny属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMExecPrePayMny(BigDecimal value) {
        this.mExecPrePayMny = value;
    }

    /**
     * 获取mExecPrePayQtyPU属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMExecPrePayQtyPU() {
        return mExecPrePayQtyPU;
    }

    /**
     * 设置mExecPrePayQtyPU属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMExecPrePayQtyPU(BigDecimal value) {
        this.mExecPrePayQtyPU = value;
    }

    /**
     * 获取mExecPrePayQtyTBU属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMExecPrePayQtyTBU() {
        return mExecPrePayQtyTBU;
    }

    /**
     * 设置mExecPrePayQtyTBU属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMExecPrePayQtyTBU(BigDecimal value) {
        this.mExecPrePayQtyTBU = value;
    }

    /**
     * 获取mExecPrePayQtyTU属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMExecPrePayQtyTU() {
        return mExecPrePayQtyTU;
    }

    /**
     * 设置mExecPrePayQtyTU属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMExecPrePayQtyTU(BigDecimal value) {
        this.mExecPrePayQtyTU = value;
    }

    /**
     * 获取mEyeballedTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMEyeballedTime() {
        return mEyeballedTime;
    }

    /**
     * 设置mEyeballedTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMEyeballedTime(XMLGregorianCalendar value) {
        this.mEyeballedTime = value;
    }

    /**
     * 获取mEyeballingQtyCU属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMEyeballingQtyCU() {
        return mEyeballingQtyCU;
    }

    /**
     * 设置mEyeballingQtyCU属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMEyeballingQtyCU(BigDecimal value) {
        this.mEyeballingQtyCU = value;
    }

    /**
     * 获取mEyeballingQtyPU属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMEyeballingQtyPU() {
        return mEyeballingQtyPU;
    }

    /**
     * 设置mEyeballingQtyPU属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMEyeballingQtyPU(BigDecimal value) {
        this.mEyeballingQtyPU = value;
    }

    /**
     * 获取mEyeballingQtySU属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMEyeballingQtySU() {
        return mEyeballingQtySU;
    }

    /**
     * 设置mEyeballingQtySU属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMEyeballingQtySU(BigDecimal value) {
        this.mEyeballingQtySU = value;
    }

    /**
     * 获取mEyeballingQtyTBU属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMEyeballingQtyTBU() {
        return mEyeballingQtyTBU;
    }

    /**
     * 设置mEyeballingQtyTBU属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMEyeballingQtyTBU(BigDecimal value) {
        this.mEyeballingQtyTBU = value;
    }

    /**
     * 获取mEyeballingQtyTU属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMEyeballingQtyTU() {
        return mEyeballingQtyTU;
    }

    /**
     * 设置mEyeballingQtyTU属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMEyeballingQtyTU(BigDecimal value) {
        this.mEyeballingQtyTU = value;
    }

    /**
     * 获取mFillQtyCU属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMFillQtyCU() {
        return mFillQtyCU;
    }

    /**
     * 设置mFillQtyCU属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMFillQtyCU(BigDecimal value) {
        this.mFillQtyCU = value;
    }

    /**
     * 获取mFillQtyPU属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMFillQtyPU() {
        return mFillQtyPU;
    }

    /**
     * 设置mFillQtyPU属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMFillQtyPU(BigDecimal value) {
        this.mFillQtyPU = value;
    }

    /**
     * 获取mFillQtySU属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMFillQtySU() {
        return mFillQtySU;
    }

    /**
     * 设置mFillQtySU属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMFillQtySU(BigDecimal value) {
        this.mFillQtySU = value;
    }

    /**
     * 获取mFillQtyTBU属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMFillQtyTBU() {
        return mFillQtyTBU;
    }

    /**
     * 设置mFillQtyTBU属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMFillQtyTBU(BigDecimal value) {
        this.mFillQtyTBU = value;
    }

    /**
     * 获取mFillQtyTU属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMFillQtyTU() {
        return mFillQtyTU;
    }

    /**
     * 设置mFillQtyTU属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMFillQtyTU(BigDecimal value) {
        this.mFillQtyTU = value;
    }

    /**
     * 获取mFinallyPriceAC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMFinallyPriceAC() {
        return mFinallyPriceAC;
    }

    /**
     * 设置mFinallyPriceAC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMFinallyPriceAC(BigDecimal value) {
        this.mFinallyPriceAC = value;
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
     * 获取mFreeReason属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMFreeReason() {
        return mFreeReason;
    }

    /**
     * 设置mFreeReason属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMFreeReason(Integer value) {
        this.mFreeReason = value;
    }

    /**
     * 获取mFreeType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMFreeType() {
        return mFreeType;
    }

    /**
     * 设置mFreeType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMFreeType(Integer value) {
        this.mFreeType = value;
    }

    /**
     * 获取mHasCreateBudgetData属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMHasCreateBudgetData() {
        return mHasCreateBudgetData;
    }

    /**
     * 设置mHasCreateBudgetData属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMHasCreateBudgetData(Boolean value) {
        this.mHasCreateBudgetData = value;
    }

    /**
     * 获取mHaveCountCostMnyFC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMHaveCountCostMnyFC() {
        return mHaveCountCostMnyFC;
    }

    /**
     * 设置mHaveCountCostMnyFC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMHaveCountCostMnyFC(BigDecimal value) {
        this.mHaveCountCostMnyFC = value;
    }

    /**
     * 获取mHaveCountCostQtyCU属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMHaveCountCostQtyCU() {
        return mHaveCountCostQtyCU;
    }

    /**
     * 设置mHaveCountCostQtyCU属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMHaveCountCostQtyCU(BigDecimal value) {
        this.mHaveCountCostQtyCU = value;
    }

    /**
     * 获取mHaveCountCostTaxFC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMHaveCountCostTaxFC() {
        return mHaveCountCostTaxFC;
    }

    /**
     * 设置mHaveCountCostTaxFC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMHaveCountCostTaxFC(BigDecimal value) {
        this.mHaveCountCostTaxFC = value;
    }

    /**
     * 获取mHaveVerificationQtyTBU属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMHaveVerificationQtyTBU() {
        return mHaveVerificationQtyTBU;
    }

    /**
     * 设置mHaveVerificationQtyTBU属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMHaveVerificationQtyTBU(BigDecimal value) {
        this.mHaveVerificationQtyTBU = value;
    }

    /**
     * 获取mHaveVerificationQtyTU属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMHaveVerificationQtyTU() {
        return mHaveVerificationQtyTU;
    }

    /**
     * 设置mHaveVerificationQtyTU属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMHaveVerificationQtyTU(BigDecimal value) {
        this.mHaveVerificationQtyTU = value;
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
     * 获取minvLotInfo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMINVLotInfo() {
        return minvLotInfo;
    }

    /**
     * 设置minvLotInfo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMINVLotInfo(JAXBElement<String> value) {
        this.minvLotInfo = value;
    }

    /**
     * 获取mipvac属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMIPVAC() {
        return mipvac;
    }

    /**
     * 设置mipvac属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMIPVAC(BigDecimal value) {
        this.mipvac = value;
    }

    /**
     * 获取mipvfc属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMIPVFC() {
        return mipvfc;
    }

    /**
     * 设置mipvfc属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMIPVFC(BigDecimal value) {
        this.mipvfc = value;
    }

    /**
     * 获取mipvFeeAC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMIPVFeeAC() {
        return mipvFeeAC;
    }

    /**
     * 设置mipvFeeAC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMIPVFeeAC(BigDecimal value) {
        this.mipvFeeAC = value;
    }

    /**
     * 获取mipvFeeTC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMIPVFeeTC() {
        return mipvFeeTC;
    }

    /**
     * 设置mipvFeeTC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMIPVFeeTC(BigDecimal value) {
        this.mipvFeeTC = value;
    }

    /**
     * 获取mipvFeeTaxAC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMIPVFeeTaxAC() {
        return mipvFeeTaxAC;
    }

    /**
     * 设置mipvFeeTaxAC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMIPVFeeTaxAC(BigDecimal value) {
        this.mipvFeeTaxAC = value;
    }

    /**
     * 获取mipvFeeTaxTC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMIPVFeeTaxTC() {
        return mipvFeeTaxTC;
    }

    /**
     * 设置mipvFeeTaxTC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMIPVFeeTaxTC(BigDecimal value) {
        this.mipvFeeTaxTC = value;
    }

    /**
     * 获取mipvtc属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMIPVTC() {
        return mipvtc;
    }

    /**
     * 设置mipvtc属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMIPVTC(BigDecimal value) {
        this.mipvtc = value;
    }

    /**
     * 获取mipvTaxAC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMIPVTaxAC() {
        return mipvTaxAC;
    }

    /**
     * 设置mipvTaxAC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMIPVTaxAC(BigDecimal value) {
        this.mipvTaxAC = value;
    }

    /**
     * 获取mipvTaxFC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMIPVTaxFC() {
        return mipvTaxFC;
    }

    /**
     * 设置mipvTaxFC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMIPVTaxFC(BigDecimal value) {
        this.mipvTaxFC = value;
    }

    /**
     * 获取mipvTaxTC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMIPVTaxTC() {
        return mipvTaxTC;
    }

    /**
     * 设置mipvTaxTC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMIPVTaxTC(BigDecimal value) {
        this.mipvTaxTC = value;
    }

    /**
     * 获取mInnerBalancePrice属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMInnerBalancePrice() {
        return mInnerBalancePrice;
    }

    /**
     * 设置mInnerBalancePrice属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMInnerBalancePrice(BigDecimal value) {
        this.mInnerBalancePrice = value;
    }

    /**
     * 获取mInspectLotInfo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMInspectLotInfo() {
        return mInspectLotInfo;
    }

    /**
     * 设置mInspectLotInfo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMInspectLotInfo(JAXBElement<String> value) {
        this.mInspectLotInfo = value;
    }

    /**
     * 获取mInvDisabledTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMInvDisabledTime() {
        return mInvDisabledTime;
    }

    /**
     * 设置mInvDisabledTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMInvDisabledTime(XMLGregorianCalendar value) {
        this.mInvDisabledTime = value;
    }

    /**
     * 获取mInvLotCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMInvLotCode() {
        return mInvLotCode;
    }

    /**
     * 设置mInvLotCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMInvLotCode(JAXBElement<String> value) {
        this.mInvLotCode = value;
    }

    /**
     * 获取mInvLotEnableDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMInvLotEnableDate() {
        return mInvLotEnableDate;
    }

    /**
     * 设置mInvLotEnableDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMInvLotEnableDate(XMLGregorianCalendar value) {
        this.mInvLotEnableDate = value;
    }

    /**
     * 获取mInvLotValidDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMInvLotValidDate() {
        return mInvLotValidDate;
    }

    /**
     * 设置mInvLotValidDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMInvLotValidDate(Integer value) {
        this.mInvLotValidDate = value;
    }

    /**
     * 获取mIsAdjustDosagePerPiece属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsAdjustDosagePerPiece() {
        return mIsAdjustDosagePerPiece;
    }

    /**
     * 设置mIsAdjustDosagePerPiece属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsAdjustDosagePerPiece(Boolean value) {
        this.mIsAdjustDosagePerPiece = value;
    }

    /**
     * 获取mIsAllotTOMo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsAllotTOMo() {
        return mIsAllotTOMo;
    }

    /**
     * 设置mIsAllotTOMo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsAllotTOMo(Boolean value) {
        this.mIsAllotTOMo = value;
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
     * 获取mIsEditMfc属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsEditMfc() {
        return mIsEditMfc;
    }

    /**
     * 设置mIsEditMfc属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsEditMfc(Boolean value) {
        this.mIsEditMfc = value;
    }

    /**
     * 获取mIsEditSeiBan属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsEditSeiBan() {
        return mIsEditSeiBan;
    }

    /**
     * 设置mIsEditSeiBan属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsEditSeiBan(Boolean value) {
        this.mIsEditSeiBan = value;
    }

    /**
     * 获取mIsEvaluationChangeable属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsEvaluationChangeable() {
        return mIsEvaluationChangeable;
    }

    /**
     * 设置mIsEvaluationChangeable属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsEvaluationChangeable(Boolean value) {
        this.mIsEvaluationChangeable = value;
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
     * 获取mIsInFlowFlag属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsInFlowFlag() {
        return mIsInFlowFlag;
    }

    /**
     * 设置mIsInFlowFlag属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsInFlowFlag(Boolean value) {
        this.mIsInFlowFlag = value;
    }

    /**
     * 获取mIsItemVerFromSrcDoc属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsItemVerFromSrcDoc() {
        return mIsItemVerFromSrcDoc;
    }

    /**
     * 设置mIsItemVerFromSrcDoc属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsItemVerFromSrcDoc(Boolean value) {
        this.mIsItemVerFromSrcDoc = value;
    }

    /**
     * 获取mIsKitWholeSet属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsKitWholeSet() {
        return mIsKitWholeSet;
    }

    /**
     * 设置mIsKitWholeSet属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsKitWholeSet(Boolean value) {
        this.mIsKitWholeSet = value;
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
     * 获取mIsNeedTransToGL属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsNeedTransToGL() {
        return mIsNeedTransToGL;
    }

    /**
     * 设置mIsNeedTransToGL属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsNeedTransToGL(Boolean value) {
        this.mIsNeedTransToGL = value;
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
     * 获取mIsPresent属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsPresent() {
        return mIsPresent;
    }

    /**
     * 设置mIsPresent属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsPresent(Boolean value) {
        this.mIsPresent = value;
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
     * 获取mIsQCfree属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsQCfree() {
        return mIsQCfree;
    }

    /**
     * 设置mIsQCfree属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsQCfree(Boolean value) {
        this.mIsQCfree = value;
    }

    /**
     * 获取mIsRcvProcedureModify属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsRcvProcedureModify() {
        return mIsRcvProcedureModify;
    }

    /**
     * 设置mIsRcvProcedureModify属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsRcvProcedureModify(Boolean value) {
        this.mIsRcvProcedureModify = value;
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
     * 获取mIsRtnSupplierFromSrcDoc属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsRtnSupplierFromSrcDoc() {
        return mIsRtnSupplierFromSrcDoc;
    }

    /**
     * 设置mIsRtnSupplierFromSrcDoc属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsRtnSupplierFromSrcDoc(Boolean value) {
        this.mIsRtnSupplierFromSrcDoc = value;
    }

    /**
     * 获取mIsSubCostChangeable属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsSubCostChangeable() {
        return mIsSubCostChangeable;
    }

    /**
     * 设置mIsSubCostChangeable属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsSubCostChangeable(Boolean value) {
        this.mIsSubCostChangeable = value;
    }

    /**
     * 获取mIsTCToACRateFromSrc属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsTCToACRateFromSrc() {
        return mIsTCToACRateFromSrc;
    }

    /**
     * 设置mIsTCToACRateFromSrc属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsTCToACRateFromSrc(Boolean value) {
        this.mIsTCToACRateFromSrc = value;
    }

    /**
     * 获取mIsTransferedToGL属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsTransferedToGL() {
        return mIsTransferedToGL;
    }

    /**
     * 设置mIsTransferedToGL属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsTransferedToGL(Boolean value) {
        this.mIsTransferedToGL = value;
    }

    /**
     * 获取mIsUpDateWMTrans属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsUpDateWMTrans() {
        return mIsUpDateWMTrans;
    }

    /**
     * 设置mIsUpDateWMTrans属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsUpDateWMTrans(Boolean value) {
        this.mIsUpDateWMTrans = value;
    }

    /**
     * 获取mIsUrgencyAccept属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsUrgencyAccept() {
        return mIsUrgencyAccept;
    }

    /**
     * 设置mIsUrgencyAccept属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsUrgencyAccept(Boolean value) {
        this.mIsUrgencyAccept = value;
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
     * 获取mItemDealMode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMItemDealMode() {
        return mItemDealMode;
    }

    /**
     * 设置mItemDealMode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMItemDealMode(Integer value) {
        this.mItemDealMode = value;
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
     * 获取mkitRcvMode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMKITRcvMode() {
        return mkitRcvMode;
    }

    /**
     * 设置mkitRcvMode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMKITRcvMode(Integer value) {
        this.mkitRcvMode = value;
    }

    /**
     * 获取mKitParentLine属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9PMRcvRcvLineData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9PMRcvRcvLineData> getMKitParentLine() {
        return mKitParentLine;
    }

    /**
     * 设置mKitParentLine属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9PMRcvRcvLineData }{@code >}
     *     
     */
    public void setMKitParentLine(JAXBElement<UFIDAU9PMRcvRcvLineData> value) {
        this.mKitParentLine = value;
    }

    /**
     * 获取mLineSrcKitNO属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getMLineSrcKitNO() {
        return mLineSrcKitNO;
    }

    /**
     * 设置mLineSrcKitNO属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setMLineSrcKitNO(Short value) {
        this.mLineSrcKitNO = value;
    }

    /**
     * 获取mmo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMMO() {
        return mmo;
    }

    /**
     * 设置mmo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMMO(Long value) {
        this.mmo = value;
    }

    /**
     * 获取mmoNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMMONo() {
        return mmoNo;
    }

    /**
     * 设置mmoNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMMONo(JAXBElement<String> value) {
        this.mmoNo = value;
    }

    /**
     * 获取mmrbid属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMMRBID() {
        return mmrbid;
    }

    /**
     * 设置mmrbid属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMMRBID(Long value) {
        this.mmrbid = value;
    }

    /**
     * 获取mmrbNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMMRBNo() {
        return mmrbNo;
    }

    /**
     * 设置mmrbNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMMRBNo(JAXBElement<String> value) {
        this.mmrbNo = value;
    }

    /**
     * 获取mMachineCostAC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMMachineCostAC() {
        return mMachineCostAC;
    }

    /**
     * 设置mMachineCostAC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMMachineCostAC(BigDecimal value) {
        this.mMachineCostAC = value;
    }

    /**
     * 获取mMachineCostFC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMMachineCostFC() {
        return mMachineCostFC;
    }

    /**
     * 设置mMachineCostFC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMMachineCostFC(BigDecimal value) {
        this.mMachineCostFC = value;
    }

    /**
     * 获取mMachineCostTC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMMachineCostTC() {
        return mMachineCostTC;
    }

    /**
     * 设置mMachineCostTC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMMachineCostTC(BigDecimal value) {
        this.mMachineCostTC = value;
    }

    /**
     * 获取mManualCostAC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMManualCostAC() {
        return mManualCostAC;
    }

    /**
     * 设置mManualCostAC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMManualCostAC(BigDecimal value) {
        this.mManualCostAC = value;
    }

    /**
     * 获取mManualCostFC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMManualCostFC() {
        return mManualCostFC;
    }

    /**
     * 设置mManualCostFC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMManualCostFC(BigDecimal value) {
        this.mManualCostFC = value;
    }

    /**
     * 获取mManualCostTC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMManualCostTC() {
        return mManualCostTC;
    }

    /**
     * 设置mManualCostTC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMManualCostTC(BigDecimal value) {
        this.mManualCostTC = value;
    }

    /**
     * 获取mMatchLayer属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMMatchLayer() {
        return mMatchLayer;
    }

    /**
     * 设置mMatchLayer属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMMatchLayer(Integer value) {
        this.mMatchLayer = value;
    }

    /**
     * 获取mMatchedMnyAC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMMatchedMnyAC() {
        return mMatchedMnyAC;
    }

    /**
     * 设置mMatchedMnyAC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMMatchedMnyAC(BigDecimal value) {
        this.mMatchedMnyAC = value;
    }

    /**
     * 获取mMatchedMnyFC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMMatchedMnyFC() {
        return mMatchedMnyFC;
    }

    /**
     * 设置mMatchedMnyFC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMMatchedMnyFC(BigDecimal value) {
        this.mMatchedMnyFC = value;
    }

    /**
     * 获取mMatchedMnyTC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMMatchedMnyTC() {
        return mMatchedMnyTC;
    }

    /**
     * 设置mMatchedMnyTC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMMatchedMnyTC(BigDecimal value) {
        this.mMatchedMnyTC = value;
    }

    /**
     * 获取mMatchedNetMnyAC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMMatchedNetMnyAC() {
        return mMatchedNetMnyAC;
    }

    /**
     * 设置mMatchedNetMnyAC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMMatchedNetMnyAC(BigDecimal value) {
        this.mMatchedNetMnyAC = value;
    }

    /**
     * 获取mMatchedNetMnyFC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMMatchedNetMnyFC() {
        return mMatchedNetMnyFC;
    }

    /**
     * 设置mMatchedNetMnyFC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMMatchedNetMnyFC(BigDecimal value) {
        this.mMatchedNetMnyFC = value;
    }

    /**
     * 获取mMatchedNetMnyTC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMMatchedNetMnyTC() {
        return mMatchedNetMnyTC;
    }

    /**
     * 设置mMatchedNetMnyTC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMMatchedNetMnyTC(BigDecimal value) {
        this.mMatchedNetMnyTC = value;
    }

    /**
     * 获取mMatchedQtyCU属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMMatchedQtyCU() {
        return mMatchedQtyCU;
    }

    /**
     * 设置mMatchedQtyCU属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMMatchedQtyCU(BigDecimal value) {
        this.mMatchedQtyCU = value;
    }

    /**
     * 获取mMatchedQtyPU属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMMatchedQtyPU() {
        return mMatchedQtyPU;
    }

    /**
     * 设置mMatchedQtyPU属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMMatchedQtyPU(BigDecimal value) {
        this.mMatchedQtyPU = value;
    }

    /**
     * 获取mMatchedQtyRelateMnyAC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMMatchedQtyRelateMnyAC() {
        return mMatchedQtyRelateMnyAC;
    }

    /**
     * 设置mMatchedQtyRelateMnyAC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMMatchedQtyRelateMnyAC(BigDecimal value) {
        this.mMatchedQtyRelateMnyAC = value;
    }

    /**
     * 获取mMatchedQtyRelateMnyFC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMMatchedQtyRelateMnyFC() {
        return mMatchedQtyRelateMnyFC;
    }

    /**
     * 设置mMatchedQtyRelateMnyFC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMMatchedQtyRelateMnyFC(BigDecimal value) {
        this.mMatchedQtyRelateMnyFC = value;
    }

    /**
     * 获取mMatchedQtyRelateMnyTC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMMatchedQtyRelateMnyTC() {
        return mMatchedQtyRelateMnyTC;
    }

    /**
     * 设置mMatchedQtyRelateMnyTC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMMatchedQtyRelateMnyTC(BigDecimal value) {
        this.mMatchedQtyRelateMnyTC = value;
    }

    /**
     * 获取mMatchedQtySU属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMMatchedQtySU() {
        return mMatchedQtySU;
    }

    /**
     * 设置mMatchedQtySU属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMMatchedQtySU(BigDecimal value) {
        this.mMatchedQtySU = value;
    }

    /**
     * 获取mMatchedQtyTBU属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMMatchedQtyTBU() {
        return mMatchedQtyTBU;
    }

    /**
     * 设置mMatchedQtyTBU属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMMatchedQtyTBU(BigDecimal value) {
        this.mMatchedQtyTBU = value;
    }

    /**
     * 获取mMatchedQtyTU属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMMatchedQtyTU() {
        return mMatchedQtyTU;
    }

    /**
     * 设置mMatchedQtyTU属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMMatchedQtyTU(BigDecimal value) {
        this.mMatchedQtyTU = value;
    }

    /**
     * 获取mMatchedTaxAC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMMatchedTaxAC() {
        return mMatchedTaxAC;
    }

    /**
     * 设置mMatchedTaxAC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMMatchedTaxAC(BigDecimal value) {
        this.mMatchedTaxAC = value;
    }

    /**
     * 获取mMatchedTaxFC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMMatchedTaxFC() {
        return mMatchedTaxFC;
    }

    /**
     * 设置mMatchedTaxFC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMMatchedTaxFC(BigDecimal value) {
        this.mMatchedTaxFC = value;
    }

    /**
     * 获取mMatchedTaxTC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMMatchedTaxTC() {
        return mMatchedTaxTC;
    }

    /**
     * 设置mMatchedTaxTC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMMatchedTaxTC(BigDecimal value) {
        this.mMatchedTaxTC = value;
    }

    /**
     * 获取mMaterialCostAC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMMaterialCostAC() {
        return mMaterialCostAC;
    }

    /**
     * 设置mMaterialCostAC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMMaterialCostAC(BigDecimal value) {
        this.mMaterialCostAC = value;
    }

    /**
     * 获取mMaterialCostFC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMMaterialCostFC() {
        return mMaterialCostFC;
    }

    /**
     * 设置mMaterialCostFC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMMaterialCostFC(BigDecimal value) {
        this.mMaterialCostFC = value;
    }

    /**
     * 获取mMaterialCostTC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMMaterialCostTC() {
        return mMaterialCostTC;
    }

    /**
     * 设置mMaterialCostTC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMMaterialCostTC(BigDecimal value) {
        this.mMaterialCostTC = value;
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
     * 获取mMfc属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOSCMSupplierSupplierMISCInfoData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9CBOSCMSupplierSupplierMISCInfoData> getMMfc() {
        return mMfc;
    }

    /**
     * 设置mMfc属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOSCMSupplierSupplierMISCInfoData }{@code >}
     *     
     */
    public void setMMfc(JAXBElement<UFIDAU9CBOSCMSupplierSupplierMISCInfoData> value) {
        this.mMfc = value;
    }

    /**
     * 获取mMfcCostAC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMMfcCostAC() {
        return mMfcCostAC;
    }

    /**
     * 设置mMfcCostAC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMMfcCostAC(BigDecimal value) {
        this.mMfcCostAC = value;
    }

    /**
     * 获取mMfcCostFC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMMfcCostFC() {
        return mMfcCostFC;
    }

    /**
     * 设置mMfcCostFC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMMfcCostFC(BigDecimal value) {
        this.mMfcCostFC = value;
    }

    /**
     * 获取mMfcCostTC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMMfcCostTC() {
        return mMfcCostTC;
    }

    /**
     * 设置mMfcCostTC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMMfcCostTC(BigDecimal value) {
        this.mMfcCostTC = value;
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
     * 获取mNetOrderPrice属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMNetOrderPrice() {
        return mNetOrderPrice;
    }

    /**
     * 设置mNetOrderPrice属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMNetOrderPrice(BigDecimal value) {
        this.mNetOrderPrice = value;
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
     * 获取mNextWPKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9BasePropertyTypesBizEntityKeyData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9BasePropertyTypesBizEntityKeyData> getMNextWPKey() {
        return mNextWPKey;
    }

    /**
     * 设置mNextWPKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9BasePropertyTypesBizEntityKeyData }{@code >}
     *     
     */
    public void setMNextWPKey(JAXBElement<UFIDAU9BasePropertyTypesBizEntityKeyData> value) {
        this.mNextWPKey = value;
    }

    /**
     * 获取mNextWPNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMNextWPNo() {
        return mNextWPNo;
    }

    /**
     * 设置mNextWPNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMNextWPNo(JAXBElement<String> value) {
        this.mNextWPNo = value;
    }

    /**
     * 获取mNofityMessage属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMNofityMessage() {
        return mNofityMessage;
    }

    /**
     * 设置mNofityMessage属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMNofityMessage(JAXBElement<String> value) {
        this.mNofityMessage = value;
    }

    /**
     * 获取mNotEditAttributes属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMNotEditAttributes() {
        return mNotEditAttributes;
    }

    /**
     * 设置mNotEditAttributes属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMNotEditAttributes(JAXBElement<String> value) {
        this.mNotEditAttributes = value;
    }

    /**
     * 获取mouToOBURate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMOUToOBURate() {
        return mouToOBURate;
    }

    /**
     * 设置mouToOBURate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMOUToOBURate(BigDecimal value) {
        this.mouToOBURate = value;
    }

    /**
     * 获取mOrderPriceAC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMOrderPriceAC() {
        return mOrderPriceAC;
    }

    /**
     * 设置mOrderPriceAC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMOrderPriceAC(BigDecimal value) {
        this.mOrderPriceAC = value;
    }

    /**
     * 获取mOrderPriceBy属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMOrderPriceBy() {
        return mOrderPriceBy;
    }

    /**
     * 设置mOrderPriceBy属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMOrderPriceBy(Integer value) {
        this.mOrderPriceBy = value;
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
     * 获取mOriginalItemQty属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMOriginalItemQty() {
        return mOriginalItemQty;
    }

    /**
     * 设置mOriginalItemQty属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMOriginalItemQty(BigDecimal value) {
        this.mOriginalItemQty = value;
    }

    /**
     * 获取mOriginalItemQtyBaseUom属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMOriginalItemQtyBaseUom() {
        return mOriginalItemQtyBaseUom;
    }

    /**
     * 设置mOriginalItemQtyBaseUom属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMOriginalItemQtyBaseUom(BigDecimal value) {
        this.mOriginalItemQtyBaseUom = value;
    }

    /**
     * 获取mOutStoreActualCost属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMOutStoreActualCost() {
        return mOutStoreActualCost;
    }

    /**
     * 设置mOutStoreActualCost属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMOutStoreActualCost(Boolean value) {
        this.mOutStoreActualCost = value;
    }

    /**
     * 获取mOwnMaterialMnyAC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMOwnMaterialMnyAC() {
        return mOwnMaterialMnyAC;
    }

    /**
     * 设置mOwnMaterialMnyAC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMOwnMaterialMnyAC(BigDecimal value) {
        this.mOwnMaterialMnyAC = value;
    }

    /**
     * 获取mOwnMaterialMnyFC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMOwnMaterialMnyFC() {
        return mOwnMaterialMnyFC;
    }

    /**
     * 设置mOwnMaterialMnyFC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMOwnMaterialMnyFC(BigDecimal value) {
        this.mOwnMaterialMnyFC = value;
    }

    /**
     * 获取mOwnMaterialMnyTC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMOwnMaterialMnyTC() {
        return mOwnMaterialMnyTC;
    }

    /**
     * 设置mOwnMaterialMnyTC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMOwnMaterialMnyTC(BigDecimal value) {
        this.mOwnMaterialMnyTC = value;
    }

    /**
     * 获取mpoLotCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMPOLotCode() {
        return mpoLotCode;
    }

    /**
     * 设置mpoLotCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMPOLotCode(JAXBElement<String> value) {
        this.mpoLotCode = value;
    }

    /**
     * 获取mpuToPBURate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMPUToPBURate() {
        return mpuToPBURate;
    }

    /**
     * 设置mpuToPBURate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMPUToPBURate(BigDecimal value) {
        this.mpuToPBURate = value;
    }

    /**
     * 获取mPartnerMaterialIPVAC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMPartnerMaterialIPVAC() {
        return mPartnerMaterialIPVAC;
    }

    /**
     * 设置mPartnerMaterialIPVAC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMPartnerMaterialIPVAC(BigDecimal value) {
        this.mPartnerMaterialIPVAC = value;
    }

    /**
     * 获取mPartnerMaterialIPVFC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMPartnerMaterialIPVFC() {
        return mPartnerMaterialIPVFC;
    }

    /**
     * 设置mPartnerMaterialIPVFC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMPartnerMaterialIPVFC(BigDecimal value) {
        this.mPartnerMaterialIPVFC = value;
    }

    /**
     * 获取mPartnerMaterialIPVTC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMPartnerMaterialIPVTC() {
        return mPartnerMaterialIPVTC;
    }

    /**
     * 设置mPartnerMaterialIPVTC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMPartnerMaterialIPVTC(BigDecimal value) {
        this.mPartnerMaterialIPVTC = value;
    }

    /**
     * 获取mPartnerMaterialMnyAC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMPartnerMaterialMnyAC() {
        return mPartnerMaterialMnyAC;
    }

    /**
     * 设置mPartnerMaterialMnyAC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMPartnerMaterialMnyAC(BigDecimal value) {
        this.mPartnerMaterialMnyAC = value;
    }

    /**
     * 获取mPartnerMaterialMnyFC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMPartnerMaterialMnyFC() {
        return mPartnerMaterialMnyFC;
    }

    /**
     * 设置mPartnerMaterialMnyFC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMPartnerMaterialMnyFC(BigDecimal value) {
        this.mPartnerMaterialMnyFC = value;
    }

    /**
     * 获取mPartnerMaterialMnyTC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMPartnerMaterialMnyTC() {
        return mPartnerMaterialMnyTC;
    }

    /**
     * 设置mPartnerMaterialMnyTC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMPartnerMaterialMnyTC(BigDecimal value) {
        this.mPartnerMaterialMnyTC = value;
    }

    /**
     * 获取mPayedMnyAC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMPayedMnyAC() {
        return mPayedMnyAC;
    }

    /**
     * 设置mPayedMnyAC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMPayedMnyAC(BigDecimal value) {
        this.mPayedMnyAC = value;
    }

    /**
     * 获取mPayedMnyFC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMPayedMnyFC() {
        return mPayedMnyFC;
    }

    /**
     * 设置mPayedMnyFC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMPayedMnyFC(BigDecimal value) {
        this.mPayedMnyFC = value;
    }

    /**
     * 获取mPayedMnyTC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMPayedMnyTC() {
        return mPayedMnyTC;
    }

    /**
     * 设置mPayedMnyTC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMPayedMnyTC(BigDecimal value) {
        this.mPayedMnyTC = value;
    }

    /**
     * 获取mPayedQtyCU属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMPayedQtyCU() {
        return mPayedQtyCU;
    }

    /**
     * 设置mPayedQtyCU属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMPayedQtyCU(BigDecimal value) {
        this.mPayedQtyCU = value;
    }

    /**
     * 获取mPayedQtyPU属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMPayedQtyPU() {
        return mPayedQtyPU;
    }

    /**
     * 设置mPayedQtyPU属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMPayedQtyPU(BigDecimal value) {
        this.mPayedQtyPU = value;
    }

    /**
     * 获取mPayedQtySU属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMPayedQtySU() {
        return mPayedQtySU;
    }

    /**
     * 设置mPayedQtySU属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMPayedQtySU(BigDecimal value) {
        this.mPayedQtySU = value;
    }

    /**
     * 获取mPayedQtyTBU属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMPayedQtyTBU() {
        return mPayedQtyTBU;
    }

    /**
     * 设置mPayedQtyTBU属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMPayedQtyTBU(BigDecimal value) {
        this.mPayedQtyTBU = value;
    }

    /**
     * 获取mPayedQtyTU属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMPayedQtyTU() {
        return mPayedQtyTU;
    }

    /**
     * 设置mPayedQtyTU属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMPayedQtyTU(BigDecimal value) {
        this.mPayedQtyTU = value;
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
     * 获取mPlanArrivedDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMPlanArrivedDate() {
        return mPlanArrivedDate;
    }

    /**
     * 设置mPlanArrivedDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMPlanArrivedDate(XMLGregorianCalendar value) {
        this.mPlanArrivedDate = value;
    }

    /**
     * 获取mPlanQtyCU属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMPlanQtyCU() {
        return mPlanQtyCU;
    }

    /**
     * 设置mPlanQtyCU属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMPlanQtyCU(BigDecimal value) {
        this.mPlanQtyCU = value;
    }

    /**
     * 获取mPlanQtyPU属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMPlanQtyPU() {
        return mPlanQtyPU;
    }

    /**
     * 设置mPlanQtyPU属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMPlanQtyPU(BigDecimal value) {
        this.mPlanQtyPU = value;
    }

    /**
     * 获取mPlanQtySU属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMPlanQtySU() {
        return mPlanQtySU;
    }

    /**
     * 设置mPlanQtySU属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMPlanQtySU(BigDecimal value) {
        this.mPlanQtySU = value;
    }

    /**
     * 获取mPlanQtyTBU属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMPlanQtyTBU() {
        return mPlanQtyTBU;
    }

    /**
     * 设置mPlanQtyTBU属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMPlanQtyTBU(BigDecimal value) {
        this.mPlanQtyTBU = value;
    }

    /**
     * 获取mPlanQtyTU属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMPlanQtyTU() {
        return mPlanQtyTU;
    }

    /**
     * 设置mPlanQtyTU属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMPlanQtyTU(BigDecimal value) {
        this.mPlanQtyTU = value;
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
     * 获取mPrePayBill属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMPrePayBill() {
        return mPrePayBill;
    }

    /**
     * 设置mPrePayBill属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMPrePayBill(Long value) {
        this.mPrePayBill = value;
    }

    /**
     * 获取mPrePayBillLine属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMPrePayBillLine() {
        return mPrePayBillLine;
    }

    /**
     * 设置mPrePayBillLine属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMPrePayBillLine(Long value) {
        this.mPrePayBillLine = value;
    }

    /**
     * 获取mPrePayBillLineNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMPrePayBillLineNo() {
        return mPrePayBillLineNo;
    }

    /**
     * 设置mPrePayBillLineNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMPrePayBillLineNo(Integer value) {
        this.mPrePayBillLineNo = value;
    }

    /**
     * 获取mPrePayMnyAC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMPrePayMnyAC() {
        return mPrePayMnyAC;
    }

    /**
     * 设置mPrePayMnyAC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMPrePayMnyAC(BigDecimal value) {
        this.mPrePayMnyAC = value;
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
     * 获取mPrePayQtyPU属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMPrePayQtyPU() {
        return mPrePayQtyPU;
    }

    /**
     * 设置mPrePayQtyPU属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMPrePayQtyPU(BigDecimal value) {
        this.mPrePayQtyPU = value;
    }

    /**
     * 获取mPrePayQtyTBU属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMPrePayQtyTBU() {
        return mPrePayQtyTBU;
    }

    /**
     * 设置mPrePayQtyTBU属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMPrePayQtyTBU(BigDecimal value) {
        this.mPrePayQtyTBU = value;
    }

    /**
     * 获取mPrePayQtyTU属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMPrePayQtyTU() {
        return mPrePayQtyTU;
    }

    /**
     * 设置mPrePayQtyTU属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMPrePayQtyTU(BigDecimal value) {
        this.mPrePayQtyTU = value;
    }

    /**
     * 获取mPreWPKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9BasePropertyTypesBizEntityKeyData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9BasePropertyTypesBizEntityKeyData> getMPreWPKey() {
        return mPreWPKey;
    }

    /**
     * 设置mPreWPKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9BasePropertyTypesBizEntityKeyData }{@code >}
     *     
     */
    public void setMPreWPKey(JAXBElement<UFIDAU9BasePropertyTypesBizEntityKeyData> value) {
        this.mPreWPKey = value;
    }

    /**
     * 获取mPreWPNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMPreWPNo() {
        return mPreWPNo;
    }

    /**
     * 设置mPreWPNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMPreWPNo(JAXBElement<String> value) {
        this.mPreWPNo = value;
    }

    /**
     * 获取mPresentCostApportionLine属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMPresentCostApportionLine() {
        return mPresentCostApportionLine;
    }

    /**
     * 设置mPresentCostApportionLine属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMPresentCostApportionLine(Long value) {
        this.mPresentCostApportionLine = value;
    }

    /**
     * 获取mPriceDifferenceAC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMPriceDifferenceAC() {
        return mPriceDifferenceAC;
    }

    /**
     * 设置mPriceDifferenceAC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMPriceDifferenceAC(BigDecimal value) {
        this.mPriceDifferenceAC = value;
    }

    /**
     * 获取mPriceDifferenceFC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMPriceDifferenceFC() {
        return mPriceDifferenceFC;
    }

    /**
     * 设置mPriceDifferenceFC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMPriceDifferenceFC(BigDecimal value) {
        this.mPriceDifferenceFC = value;
    }

    /**
     * 获取mPriceDifferenceTC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMPriceDifferenceTC() {
        return mPriceDifferenceTC;
    }

    /**
     * 设置mPriceDifferenceTC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMPriceDifferenceTC(BigDecimal value) {
        this.mPriceDifferenceTC = value;
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
     * 获取mProcessArriveQty属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMProcessArriveQty() {
        return mProcessArriveQty;
    }

    /**
     * 设置mProcessArriveQty属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMProcessArriveQty(BigDecimal value) {
        this.mProcessArriveQty = value;
    }

    /**
     * 获取mProcessDestroyQty属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMProcessDestroyQty() {
        return mProcessDestroyQty;
    }

    /**
     * 设置mProcessDestroyQty属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMProcessDestroyQty(BigDecimal value) {
        this.mProcessDestroyQty = value;
    }

    /**
     * 获取mProcessEyeballingQty属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMProcessEyeballingQty() {
        return mProcessEyeballingQty;
    }

    /**
     * 设置mProcessEyeballingQty属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMProcessEyeballingQty(BigDecimal value) {
        this.mProcessEyeballingQty = value;
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
     * 获取mProcessMFC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOSCMSupplierSupplierMISCInfoData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9CBOSCMSupplierSupplierMISCInfoData> getMProcessMFC() {
        return mProcessMFC;
    }

    /**
     * 设置mProcessMFC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOSCMSupplierSupplierMISCInfoData }{@code >}
     *     
     */
    public void setMProcessMFC(JAXBElement<UFIDAU9CBOSCMSupplierSupplierMISCInfoData> value) {
        this.mProcessMFC = value;
    }

    /**
     * 获取mProcessPlanQty属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMProcessPlanQty() {
        return mProcessPlanQty;
    }

    /**
     * 设置mProcessPlanQty属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMProcessPlanQty(BigDecimal value) {
        this.mProcessPlanQty = value;
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
     * 获取mProcessQualifiedQty属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMProcessQualifiedQty() {
        return mProcessQualifiedQty;
    }

    /**
     * 设置mProcessQualifiedQty属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMProcessQualifiedQty(BigDecimal value) {
        this.mProcessQualifiedQty = value;
    }

    /**
     * 获取mProcessRcvQty属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMProcessRcvQty() {
        return mProcessRcvQty;
    }

    /**
     * 设置mProcessRcvQty属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMProcessRcvQty(BigDecimal value) {
        this.mProcessRcvQty = value;
    }

    /**
     * 获取mProcessReDeductQty属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMProcessReDeductQty() {
        return mProcessReDeductQty;
    }

    /**
     * 设置mProcessReDeductQty属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMProcessReDeductQty(BigDecimal value) {
        this.mProcessReDeductQty = value;
    }

    /**
     * 获取mProcessReFillQty属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMProcessReFillQty() {
        return mProcessReFillQty;
    }

    /**
     * 设置mProcessReFillQty属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMProcessReFillQty(BigDecimal value) {
        this.mProcessReFillQty = value;
    }

    /**
     * 获取mProcessRejectQty属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMProcessRejectQty() {
        return mProcessRejectQty;
    }

    /**
     * 设置mProcessRejectQty属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMProcessRejectQty(BigDecimal value) {
        this.mProcessRejectQty = value;
    }

    /**
     * 获取mProcessUToSURate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMProcessUToSURate() {
        return mProcessUToSURate;
    }

    /**
     * 设置mProcessUToSURate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMProcessUToSURate(BigDecimal value) {
        this.mProcessUToSURate = value;
    }

    /**
     * 获取mProcessUnqualifiedQty属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMProcessUnqualifiedQty() {
        return mProcessUnqualifiedQty;
    }

    /**
     * 设置mProcessUnqualifiedQty属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMProcessUnqualifiedQty(BigDecimal value) {
        this.mProcessUnqualifiedQty = value;
    }

    /**
     * 获取mProductLineDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMProductLineDate() {
        return mProductLineDate;
    }

    /**
     * 设置mProductLineDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMProductLineDate(XMLGregorianCalendar value) {
        this.mProductLineDate = value;
    }

    /**
     * 获取mProductLineKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMProductLineKey() {
        return mProductLineKey;
    }

    /**
     * 设置mProductLineKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMProductLineKey(Long value) {
        this.mProductLineKey = value;
    }

    /**
     * 获取mProductLineNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMProductLineNo() {
        return mProductLineNo;
    }

    /**
     * 设置mProductLineNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMProductLineNo(JAXBElement<String> value) {
        this.mProductLineNo = value;
    }

    /**
     * 获取mPurCostAC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMPurCostAC() {
        return mPurCostAC;
    }

    /**
     * 设置mPurCostAC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMPurCostAC(BigDecimal value) {
        this.mPurCostAC = value;
    }

    /**
     * 获取mPurCostFC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMPurCostFC() {
        return mPurCostFC;
    }

    /**
     * 设置mPurCostFC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMPurCostFC(BigDecimal value) {
        this.mPurCostFC = value;
    }

    /**
     * 获取mPurCostTC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMPurCostTC() {
        return mPurCostTC;
    }

    /**
     * 设置mPurCostTC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMPurCostTC(BigDecimal value) {
        this.mPurCostTC = value;
    }

    /**
     * 获取mPurT0SaleUOMRate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMPurT0SaleUOMRate() {
        return mPurT0SaleUOMRate;
    }

    /**
     * 设置mPurT0SaleUOMRate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMPurT0SaleUOMRate(BigDecimal value) {
        this.mPurT0SaleUOMRate = value;
    }

    /**
     * 获取mqcBill属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMQCBill() {
        return mqcBill;
    }

    /**
     * 设置mqcBill属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMQCBill(Long value) {
        this.mqcBill = value;
    }

    /**
     * 获取mqcBillNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMQCBillNo() {
        return mqcBillNo;
    }

    /**
     * 设置mqcBillNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMQCBillNo(JAXBElement<String> value) {
        this.mqcBillNo = value;
    }

    /**
     * 获取mqcConclusion属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMQCConclusion() {
        return mqcConclusion;
    }

    /**
     * 设置mqcConclusion属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMQCConclusion(Integer value) {
        this.mqcConclusion = value;
    }

    /**
     * 获取mqcqcConclusion属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMQCQCConclusion() {
        return mqcqcConclusion;
    }

    /**
     * 设置mqcqcConclusion属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMQCQCConclusion(Integer value) {
        this.mqcqcConclusion = value;
    }

    /**
     * 获取mQualifiedQtyCU属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMQualifiedQtyCU() {
        return mQualifiedQtyCU;
    }

    /**
     * 设置mQualifiedQtyCU属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMQualifiedQtyCU(BigDecimal value) {
        this.mQualifiedQtyCU = value;
    }

    /**
     * 获取mQualifiedQtyPU属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMQualifiedQtyPU() {
        return mQualifiedQtyPU;
    }

    /**
     * 设置mQualifiedQtyPU属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMQualifiedQtyPU(BigDecimal value) {
        this.mQualifiedQtyPU = value;
    }

    /**
     * 获取mQualifiedQtySU属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMQualifiedQtySU() {
        return mQualifiedQtySU;
    }

    /**
     * 设置mQualifiedQtySU属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMQualifiedQtySU(BigDecimal value) {
        this.mQualifiedQtySU = value;
    }

    /**
     * 获取mQualifiedQtyTBU属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMQualifiedQtyTBU() {
        return mQualifiedQtyTBU;
    }

    /**
     * 设置mQualifiedQtyTBU属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMQualifiedQtyTBU(BigDecimal value) {
        this.mQualifiedQtyTBU = value;
    }

    /**
     * 获取mQualifiedQtyTU属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMQualifiedQtyTU() {
        return mQualifiedQtyTU;
    }

    /**
     * 设置mQualifiedQtyTU属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMQualifiedQtyTU(BigDecimal value) {
        this.mQualifiedQtyTU = value;
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
     * 获取mrcvLotInfo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMRCVLotInfo() {
        return mrcvLotInfo;
    }

    /**
     * 设置mrcvLotInfo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMRCVLotInfo(JAXBElement<String> value) {
        this.mrcvLotInfo = value;
    }

    /**
     * 获取mrcvToRMAType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMRCVToRMAType() {
        return mrcvToRMAType;
    }

    /**
     * 设置mrcvToRMAType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMRCVToRMAType(Integer value) {
        this.mrcvToRMAType = value;
    }

    /**
     * 获取mrmaTransType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMRMATransType() {
        return mrmaTransType;
    }

    /**
     * 设置mrmaTransType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMRMATransType(Integer value) {
        this.mrmaTransType = value;
    }

    /**
     * 获取mrmaType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMRMAType() {
        return mrmaType;
    }

    /**
     * 设置mrmaType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMRMAType(Integer value) {
        this.mrmaType = value;
    }

    /**
     * 获取mRcvBoxes属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMRcvBoxes() {
        return mRcvBoxes;
    }

    /**
     * 设置mRcvBoxes属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMRcvBoxes(BigDecimal value) {
        this.mRcvBoxes = value;
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
     * 获取mRcvLineExt属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9PMRcvRcvLineExtData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9PMRcvRcvLineExtData> getMRcvLineExt() {
        return mRcvLineExt;
    }

    /**
     * 设置mRcvLineExt属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9PMRcvRcvLineExtData }{@code >}
     *     
     */
    public void setMRcvLineExt(JAXBElement<UFIDAU9PMRcvRcvLineExtData> value) {
        this.mRcvLineExt = value;
    }

    /**
     * 获取mRcvLineHoldReleaseHis属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUFIDAU9PMRcvRcvLineHoldReleaseHisData }{@code >}
     *     
     */
    public JAXBElement<ArrayOfUFIDAU9PMRcvRcvLineHoldReleaseHisData> getMRcvLineHoldReleaseHis() {
        return mRcvLineHoldReleaseHis;
    }

    /**
     * 设置mRcvLineHoldReleaseHis属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUFIDAU9PMRcvRcvLineHoldReleaseHisData }{@code >}
     *     
     */
    public void setMRcvLineHoldReleaseHis(JAXBElement<ArrayOfUFIDAU9PMRcvRcvLineHoldReleaseHisData> value) {
        this.mRcvLineHoldReleaseHis = value;
    }

    /**
     * 获取mRcvLotCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMRcvLotCode() {
        return mRcvLotCode;
    }

    /**
     * 设置mRcvLotCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMRcvLotCode(JAXBElement<String> value) {
        this.mRcvLotCode = value;
    }

    /**
     * 获取mRcvProcedure属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMRcvProcedure() {
        return mRcvProcedure;
    }

    /**
     * 设置mRcvProcedure属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMRcvProcedure(Integer value) {
        this.mRcvProcedure = value;
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
     * 获取mRcvQtyCU属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMRcvQtyCU() {
        return mRcvQtyCU;
    }

    /**
     * 设置mRcvQtyCU属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMRcvQtyCU(BigDecimal value) {
        this.mRcvQtyCU = value;
    }

    /**
     * 获取mRcvQtyPU属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMRcvQtyPU() {
        return mRcvQtyPU;
    }

    /**
     * 设置mRcvQtyPU属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMRcvQtyPU(BigDecimal value) {
        this.mRcvQtyPU = value;
    }

    /**
     * 获取mRcvQtySU属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMRcvQtySU() {
        return mRcvQtySU;
    }

    /**
     * 设置mRcvQtySU属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMRcvQtySU(BigDecimal value) {
        this.mRcvQtySU = value;
    }

    /**
     * 获取mRcvQtyTBU属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMRcvQtyTBU() {
        return mRcvQtyTBU;
    }

    /**
     * 设置mRcvQtyTBU属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMRcvQtyTBU(BigDecimal value) {
        this.mRcvQtyTBU = value;
    }

    /**
     * 获取mRcvQtyTU属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMRcvQtyTU() {
        return mRcvQtyTU;
    }

    /**
     * 设置mRcvQtyTU属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMRcvQtyTU(BigDecimal value) {
        this.mRcvQtyTU = value;
    }

    /**
     * 获取mReasonableLossQtyCU属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMReasonableLossQtyCU() {
        return mReasonableLossQtyCU;
    }

    /**
     * 设置mReasonableLossQtyCU属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMReasonableLossQtyCU(BigDecimal value) {
        this.mReasonableLossQtyCU = value;
    }

    /**
     * 获取mReasonableLossQtyPU属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMReasonableLossQtyPU() {
        return mReasonableLossQtyPU;
    }

    /**
     * 设置mReasonableLossQtyPU属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMReasonableLossQtyPU(BigDecimal value) {
        this.mReasonableLossQtyPU = value;
    }

    /**
     * 获取mReasonableLossQtySU属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMReasonableLossQtySU() {
        return mReasonableLossQtySU;
    }

    /**
     * 设置mReasonableLossQtySU属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMReasonableLossQtySU(BigDecimal value) {
        this.mReasonableLossQtySU = value;
    }

    /**
     * 获取mReasonableLossQtyTBU属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMReasonableLossQtyTBU() {
        return mReasonableLossQtyTBU;
    }

    /**
     * 设置mReasonableLossQtyTBU属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMReasonableLossQtyTBU(BigDecimal value) {
        this.mReasonableLossQtyTBU = value;
    }

    /**
     * 获取mReasonableLossQtyTU属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMReasonableLossQtyTU() {
        return mReasonableLossQtyTU;
    }

    /**
     * 设置mReasonableLossQtyTU属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMReasonableLossQtyTU(BigDecimal value) {
        this.mReasonableLossQtyTU = value;
    }

    /**
     * 获取mReceivement属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9PMRcvReceivementData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9PMRcvReceivementData> getMReceivement() {
        return mReceivement;
    }

    /**
     * 设置mReceivement属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9PMRcvReceivementData }{@code >}
     *     
     */
    public void setMReceivement(JAXBElement<UFIDAU9PMRcvReceivementData> value) {
        this.mReceivement = value;
    }

    /**
     * 获取mRefillUseQtyTBU属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMRefillUseQtyTBU() {
        return mRefillUseQtyTBU;
    }

    /**
     * 设置mRefillUseQtyTBU属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMRefillUseQtyTBU(BigDecimal value) {
        this.mRefillUseQtyTBU = value;
    }

    /**
     * 获取mRefillUseQtyTU属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMRefillUseQtyTU() {
        return mRefillUseQtyTU;
    }

    /**
     * 设置mRefillUseQtyTU属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMRefillUseQtyTU(BigDecimal value) {
        this.mRefillUseQtyTU = value;
    }

    /**
     * 获取mRejectMnyAC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMRejectMnyAC() {
        return mRejectMnyAC;
    }

    /**
     * 设置mRejectMnyAC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMRejectMnyAC(BigDecimal value) {
        this.mRejectMnyAC = value;
    }

    /**
     * 获取mRejectMnyFC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMRejectMnyFC() {
        return mRejectMnyFC;
    }

    /**
     * 设置mRejectMnyFC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMRejectMnyFC(BigDecimal value) {
        this.mRejectMnyFC = value;
    }

    /**
     * 获取mRejectMnyTC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMRejectMnyTC() {
        return mRejectMnyTC;
    }

    /**
     * 设置mRejectMnyTC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMRejectMnyTC(BigDecimal value) {
        this.mRejectMnyTC = value;
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
     * 获取mRejectNetMnyAC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMRejectNetMnyAC() {
        return mRejectNetMnyAC;
    }

    /**
     * 设置mRejectNetMnyAC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMRejectNetMnyAC(BigDecimal value) {
        this.mRejectNetMnyAC = value;
    }

    /**
     * 获取mRejectNetMnyFC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMRejectNetMnyFC() {
        return mRejectNetMnyFC;
    }

    /**
     * 设置mRejectNetMnyFC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMRejectNetMnyFC(BigDecimal value) {
        this.mRejectNetMnyFC = value;
    }

    /**
     * 获取mRejectNetMnyTC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMRejectNetMnyTC() {
        return mRejectNetMnyTC;
    }

    /**
     * 设置mRejectNetMnyTC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMRejectNetMnyTC(BigDecimal value) {
        this.mRejectNetMnyTC = value;
    }

    /**
     * 获取mRejectQtyCU属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMRejectQtyCU() {
        return mRejectQtyCU;
    }

    /**
     * 设置mRejectQtyCU属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMRejectQtyCU(BigDecimal value) {
        this.mRejectQtyCU = value;
    }

    /**
     * 获取mRejectQtyPU属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMRejectQtyPU() {
        return mRejectQtyPU;
    }

    /**
     * 设置mRejectQtyPU属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMRejectQtyPU(BigDecimal value) {
        this.mRejectQtyPU = value;
    }

    /**
     * 获取mRejectQtySU属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMRejectQtySU() {
        return mRejectQtySU;
    }

    /**
     * 设置mRejectQtySU属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMRejectQtySU(BigDecimal value) {
        this.mRejectQtySU = value;
    }

    /**
     * 获取mRejectQtyTBU属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMRejectQtyTBU() {
        return mRejectQtyTBU;
    }

    /**
     * 设置mRejectQtyTBU属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMRejectQtyTBU(BigDecimal value) {
        this.mRejectQtyTBU = value;
    }

    /**
     * 获取mRejectQtyTU属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMRejectQtyTU() {
        return mRejectQtyTU;
    }

    /**
     * 设置mRejectQtyTU属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMRejectQtyTU(BigDecimal value) {
        this.mRejectQtyTU = value;
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
     * 获取mRejectTaxMnyAC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMRejectTaxMnyAC() {
        return mRejectTaxMnyAC;
    }

    /**
     * 设置mRejectTaxMnyAC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMRejectTaxMnyAC(BigDecimal value) {
        this.mRejectTaxMnyAC = value;
    }

    /**
     * 获取mRejectTaxMnyFC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMRejectTaxMnyFC() {
        return mRejectTaxMnyFC;
    }

    /**
     * 设置mRejectTaxMnyFC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMRejectTaxMnyFC(BigDecimal value) {
        this.mRejectTaxMnyFC = value;
    }

    /**
     * 获取mRejectTaxMnyTC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMRejectTaxMnyTC() {
        return mRejectTaxMnyTC;
    }

    /**
     * 设置mRejectTaxMnyTC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMRejectTaxMnyTC(BigDecimal value) {
        this.mRejectTaxMnyTC = value;
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
     * 获取mReturnSupplier属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOSCMSupplierSupplierMISCInfoData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9CBOSCMSupplierSupplierMISCInfoData> getMReturnSupplier() {
        return mReturnSupplier;
    }

    /**
     * 设置mReturnSupplier属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOSCMSupplierSupplierMISCInfoData }{@code >}
     *     
     */
    public void setMReturnSupplier(JAXBElement<UFIDAU9CBOSCMSupplierSupplierMISCInfoData> value) {
        this.mReturnSupplier = value;
    }

    /**
     * 获取mRtnConfirmedMnyAC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMRtnConfirmedMnyAC() {
        return mRtnConfirmedMnyAC;
    }

    /**
     * 设置mRtnConfirmedMnyAC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMRtnConfirmedMnyAC(BigDecimal value) {
        this.mRtnConfirmedMnyAC = value;
    }

    /**
     * 获取mRtnConfirmedMnyFC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMRtnConfirmedMnyFC() {
        return mRtnConfirmedMnyFC;
    }

    /**
     * 设置mRtnConfirmedMnyFC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMRtnConfirmedMnyFC(BigDecimal value) {
        this.mRtnConfirmedMnyFC = value;
    }

    /**
     * 获取mRtnConfirmedMnyTC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMRtnConfirmedMnyTC() {
        return mRtnConfirmedMnyTC;
    }

    /**
     * 设置mRtnConfirmedMnyTC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMRtnConfirmedMnyTC(BigDecimal value) {
        this.mRtnConfirmedMnyTC = value;
    }

    /**
     * 获取mRtnConfirmedNetMnyAC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMRtnConfirmedNetMnyAC() {
        return mRtnConfirmedNetMnyAC;
    }

    /**
     * 设置mRtnConfirmedNetMnyAC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMRtnConfirmedNetMnyAC(BigDecimal value) {
        this.mRtnConfirmedNetMnyAC = value;
    }

    /**
     * 获取mRtnConfirmedNetMnyFC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMRtnConfirmedNetMnyFC() {
        return mRtnConfirmedNetMnyFC;
    }

    /**
     * 设置mRtnConfirmedNetMnyFC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMRtnConfirmedNetMnyFC(BigDecimal value) {
        this.mRtnConfirmedNetMnyFC = value;
    }

    /**
     * 获取mRtnConfirmedNetMnyTC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMRtnConfirmedNetMnyTC() {
        return mRtnConfirmedNetMnyTC;
    }

    /**
     * 设置mRtnConfirmedNetMnyTC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMRtnConfirmedNetMnyTC(BigDecimal value) {
        this.mRtnConfirmedNetMnyTC = value;
    }

    /**
     * 获取mRtnConfirmedQtyCU属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMRtnConfirmedQtyCU() {
        return mRtnConfirmedQtyCU;
    }

    /**
     * 设置mRtnConfirmedQtyCU属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMRtnConfirmedQtyCU(BigDecimal value) {
        this.mRtnConfirmedQtyCU = value;
    }

    /**
     * 获取mRtnConfirmedQtyPU属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMRtnConfirmedQtyPU() {
        return mRtnConfirmedQtyPU;
    }

    /**
     * 设置mRtnConfirmedQtyPU属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMRtnConfirmedQtyPU(BigDecimal value) {
        this.mRtnConfirmedQtyPU = value;
    }

    /**
     * 获取mRtnConfirmedQtySU属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMRtnConfirmedQtySU() {
        return mRtnConfirmedQtySU;
    }

    /**
     * 设置mRtnConfirmedQtySU属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMRtnConfirmedQtySU(BigDecimal value) {
        this.mRtnConfirmedQtySU = value;
    }

    /**
     * 获取mRtnConfirmedQtyTBU属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMRtnConfirmedQtyTBU() {
        return mRtnConfirmedQtyTBU;
    }

    /**
     * 设置mRtnConfirmedQtyTBU属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMRtnConfirmedQtyTBU(BigDecimal value) {
        this.mRtnConfirmedQtyTBU = value;
    }

    /**
     * 获取mRtnConfirmedQtyTU属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMRtnConfirmedQtyTU() {
        return mRtnConfirmedQtyTU;
    }

    /**
     * 设置mRtnConfirmedQtyTU属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMRtnConfirmedQtyTU(BigDecimal value) {
        this.mRtnConfirmedQtyTU = value;
    }

    /**
     * 获取mRtnConfirmedTaxAC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMRtnConfirmedTaxAC() {
        return mRtnConfirmedTaxAC;
    }

    /**
     * 设置mRtnConfirmedTaxAC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMRtnConfirmedTaxAC(BigDecimal value) {
        this.mRtnConfirmedTaxAC = value;
    }

    /**
     * 获取mRtnConfirmedTaxFC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMRtnConfirmedTaxFC() {
        return mRtnConfirmedTaxFC;
    }

    /**
     * 设置mRtnConfirmedTaxFC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMRtnConfirmedTaxFC(BigDecimal value) {
        this.mRtnConfirmedTaxFC = value;
    }

    /**
     * 获取mRtnConfirmedTaxTC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMRtnConfirmedTaxTC() {
        return mRtnConfirmedTaxTC;
    }

    /**
     * 设置mRtnConfirmedTaxTC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMRtnConfirmedTaxTC(BigDecimal value) {
        this.mRtnConfirmedTaxTC = value;
    }

    /**
     * 获取mRtnDeductEvaluationMnyAC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMRtnDeductEvaluationMnyAC() {
        return mRtnDeductEvaluationMnyAC;
    }

    /**
     * 设置mRtnDeductEvaluationMnyAC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMRtnDeductEvaluationMnyAC(BigDecimal value) {
        this.mRtnDeductEvaluationMnyAC = value;
    }

    /**
     * 获取mRtnDeductEvaluationMnyFC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMRtnDeductEvaluationMnyFC() {
        return mRtnDeductEvaluationMnyFC;
    }

    /**
     * 设置mRtnDeductEvaluationMnyFC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMRtnDeductEvaluationMnyFC(BigDecimal value) {
        this.mRtnDeductEvaluationMnyFC = value;
    }

    /**
     * 获取mRtnDeductEvaluationMnyTC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMRtnDeductEvaluationMnyTC() {
        return mRtnDeductEvaluationMnyTC;
    }

    /**
     * 设置mRtnDeductEvaluationMnyTC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMRtnDeductEvaluationMnyTC(BigDecimal value) {
        this.mRtnDeductEvaluationMnyTC = value;
    }

    /**
     * 获取mRtnDeductMnyAC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMRtnDeductMnyAC() {
        return mRtnDeductMnyAC;
    }

    /**
     * 设置mRtnDeductMnyAC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMRtnDeductMnyAC(BigDecimal value) {
        this.mRtnDeductMnyAC = value;
    }

    /**
     * 获取mRtnDeductMnyFC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMRtnDeductMnyFC() {
        return mRtnDeductMnyFC;
    }

    /**
     * 设置mRtnDeductMnyFC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMRtnDeductMnyFC(BigDecimal value) {
        this.mRtnDeductMnyFC = value;
    }

    /**
     * 获取mRtnDeductMnyTC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMRtnDeductMnyTC() {
        return mRtnDeductMnyTC;
    }

    /**
     * 设置mRtnDeductMnyTC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMRtnDeductMnyTC(BigDecimal value) {
        this.mRtnDeductMnyTC = value;
    }

    /**
     * 获取mRtnDeductNetMnyAC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMRtnDeductNetMnyAC() {
        return mRtnDeductNetMnyAC;
    }

    /**
     * 设置mRtnDeductNetMnyAC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMRtnDeductNetMnyAC(BigDecimal value) {
        this.mRtnDeductNetMnyAC = value;
    }

    /**
     * 获取mRtnDeductNetMnyFC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMRtnDeductNetMnyFC() {
        return mRtnDeductNetMnyFC;
    }

    /**
     * 设置mRtnDeductNetMnyFC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMRtnDeductNetMnyFC(BigDecimal value) {
        this.mRtnDeductNetMnyFC = value;
    }

    /**
     * 获取mRtnDeductNetMnyTC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMRtnDeductNetMnyTC() {
        return mRtnDeductNetMnyTC;
    }

    /**
     * 设置mRtnDeductNetMnyTC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMRtnDeductNetMnyTC(BigDecimal value) {
        this.mRtnDeductNetMnyTC = value;
    }

    /**
     * 获取mRtnDeductQtyCU属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMRtnDeductQtyCU() {
        return mRtnDeductQtyCU;
    }

    /**
     * 设置mRtnDeductQtyCU属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMRtnDeductQtyCU(BigDecimal value) {
        this.mRtnDeductQtyCU = value;
    }

    /**
     * 获取mRtnDeductQtyPU属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMRtnDeductQtyPU() {
        return mRtnDeductQtyPU;
    }

    /**
     * 设置mRtnDeductQtyPU属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMRtnDeductQtyPU(BigDecimal value) {
        this.mRtnDeductQtyPU = value;
    }

    /**
     * 获取mRtnDeductQtySU属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMRtnDeductQtySU() {
        return mRtnDeductQtySU;
    }

    /**
     * 设置mRtnDeductQtySU属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMRtnDeductQtySU(BigDecimal value) {
        this.mRtnDeductQtySU = value;
    }

    /**
     * 获取mRtnDeductQtyTBU属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMRtnDeductQtyTBU() {
        return mRtnDeductQtyTBU;
    }

    /**
     * 设置mRtnDeductQtyTBU属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMRtnDeductQtyTBU(BigDecimal value) {
        this.mRtnDeductQtyTBU = value;
    }

    /**
     * 获取mRtnDeductQtyTU属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMRtnDeductQtyTU() {
        return mRtnDeductQtyTU;
    }

    /**
     * 设置mRtnDeductQtyTU属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMRtnDeductQtyTU(BigDecimal value) {
        this.mRtnDeductQtyTU = value;
    }

    /**
     * 获取mRtnDeductTaxAC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMRtnDeductTaxAC() {
        return mRtnDeductTaxAC;
    }

    /**
     * 设置mRtnDeductTaxAC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMRtnDeductTaxAC(BigDecimal value) {
        this.mRtnDeductTaxAC = value;
    }

    /**
     * 获取mRtnDeductTaxFC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMRtnDeductTaxFC() {
        return mRtnDeductTaxFC;
    }

    /**
     * 设置mRtnDeductTaxFC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMRtnDeductTaxFC(BigDecimal value) {
        this.mRtnDeductTaxFC = value;
    }

    /**
     * 获取mRtnDeductTaxTC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMRtnDeductTaxTC() {
        return mRtnDeductTaxTC;
    }

    /**
     * 设置mRtnDeductTaxTC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMRtnDeductTaxTC(BigDecimal value) {
        this.mRtnDeductTaxTC = value;
    }

    /**
     * 获取mRtnFillNoUsedIPVAC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMRtnFillNoUsedIPVAC() {
        return mRtnFillNoUsedIPVAC;
    }

    /**
     * 设置mRtnFillNoUsedIPVAC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMRtnFillNoUsedIPVAC(BigDecimal value) {
        this.mRtnFillNoUsedIPVAC = value;
    }

    /**
     * 获取mRtnFillNoUsedIPVFC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMRtnFillNoUsedIPVFC() {
        return mRtnFillNoUsedIPVFC;
    }

    /**
     * 设置mRtnFillNoUsedIPVFC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMRtnFillNoUsedIPVFC(BigDecimal value) {
        this.mRtnFillNoUsedIPVFC = value;
    }

    /**
     * 获取mRtnFillNoUsedIPVTC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMRtnFillNoUsedIPVTC() {
        return mRtnFillNoUsedIPVTC;
    }

    /**
     * 设置mRtnFillNoUsedIPVTC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMRtnFillNoUsedIPVTC(BigDecimal value) {
        this.mRtnFillNoUsedIPVTC = value;
    }

    /**
     * 获取mRtnFillQtyCU属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMRtnFillQtyCU() {
        return mRtnFillQtyCU;
    }

    /**
     * 设置mRtnFillQtyCU属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMRtnFillQtyCU(BigDecimal value) {
        this.mRtnFillQtyCU = value;
    }

    /**
     * 获取mRtnFillQtyPU属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMRtnFillQtyPU() {
        return mRtnFillQtyPU;
    }

    /**
     * 设置mRtnFillQtyPU属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMRtnFillQtyPU(BigDecimal value) {
        this.mRtnFillQtyPU = value;
    }

    /**
     * 获取mRtnFillQtySU属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMRtnFillQtySU() {
        return mRtnFillQtySU;
    }

    /**
     * 设置mRtnFillQtySU属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMRtnFillQtySU(BigDecimal value) {
        this.mRtnFillQtySU = value;
    }

    /**
     * 获取mRtnFillQtyTBU属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMRtnFillQtyTBU() {
        return mRtnFillQtyTBU;
    }

    /**
     * 设置mRtnFillQtyTBU属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMRtnFillQtyTBU(BigDecimal value) {
        this.mRtnFillQtyTBU = value;
    }

    /**
     * 获取mRtnFillQtyTU属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMRtnFillQtyTU() {
        return mRtnFillQtyTU;
    }

    /**
     * 设置mRtnFillQtyTU属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMRtnFillQtyTU(BigDecimal value) {
        this.mRtnFillQtyTU = value;
    }

    /**
     * 获取mRtnMatchedMnyAC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMRtnMatchedMnyAC() {
        return mRtnMatchedMnyAC;
    }

    /**
     * 设置mRtnMatchedMnyAC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMRtnMatchedMnyAC(BigDecimal value) {
        this.mRtnMatchedMnyAC = value;
    }

    /**
     * 获取mRtnMatchedMnyFC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMRtnMatchedMnyFC() {
        return mRtnMatchedMnyFC;
    }

    /**
     * 设置mRtnMatchedMnyFC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMRtnMatchedMnyFC(BigDecimal value) {
        this.mRtnMatchedMnyFC = value;
    }

    /**
     * 获取mRtnMatchedMnyTC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMRtnMatchedMnyTC() {
        return mRtnMatchedMnyTC;
    }

    /**
     * 设置mRtnMatchedMnyTC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMRtnMatchedMnyTC(BigDecimal value) {
        this.mRtnMatchedMnyTC = value;
    }

    /**
     * 获取mRtnMatchedNetMnyAC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMRtnMatchedNetMnyAC() {
        return mRtnMatchedNetMnyAC;
    }

    /**
     * 设置mRtnMatchedNetMnyAC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMRtnMatchedNetMnyAC(BigDecimal value) {
        this.mRtnMatchedNetMnyAC = value;
    }

    /**
     * 获取mRtnMatchedNetMnyFC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMRtnMatchedNetMnyFC() {
        return mRtnMatchedNetMnyFC;
    }

    /**
     * 设置mRtnMatchedNetMnyFC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMRtnMatchedNetMnyFC(BigDecimal value) {
        this.mRtnMatchedNetMnyFC = value;
    }

    /**
     * 获取mRtnMatchedNetMnyTC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMRtnMatchedNetMnyTC() {
        return mRtnMatchedNetMnyTC;
    }

    /**
     * 设置mRtnMatchedNetMnyTC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMRtnMatchedNetMnyTC(BigDecimal value) {
        this.mRtnMatchedNetMnyTC = value;
    }

    /**
     * 获取mRtnMatchedQtyCU属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMRtnMatchedQtyCU() {
        return mRtnMatchedQtyCU;
    }

    /**
     * 设置mRtnMatchedQtyCU属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMRtnMatchedQtyCU(BigDecimal value) {
        this.mRtnMatchedQtyCU = value;
    }

    /**
     * 获取mRtnMatchedQtyPU属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMRtnMatchedQtyPU() {
        return mRtnMatchedQtyPU;
    }

    /**
     * 设置mRtnMatchedQtyPU属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMRtnMatchedQtyPU(BigDecimal value) {
        this.mRtnMatchedQtyPU = value;
    }

    /**
     * 获取mRtnMatchedQtySU属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMRtnMatchedQtySU() {
        return mRtnMatchedQtySU;
    }

    /**
     * 设置mRtnMatchedQtySU属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMRtnMatchedQtySU(BigDecimal value) {
        this.mRtnMatchedQtySU = value;
    }

    /**
     * 获取mRtnMatchedQtyTBU属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMRtnMatchedQtyTBU() {
        return mRtnMatchedQtyTBU;
    }

    /**
     * 设置mRtnMatchedQtyTBU属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMRtnMatchedQtyTBU(BigDecimal value) {
        this.mRtnMatchedQtyTBU = value;
    }

    /**
     * 获取mRtnMatchedQtyTU属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMRtnMatchedQtyTU() {
        return mRtnMatchedQtyTU;
    }

    /**
     * 设置mRtnMatchedQtyTU属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMRtnMatchedQtyTU(BigDecimal value) {
        this.mRtnMatchedQtyTU = value;
    }

    /**
     * 获取mRtnMatchedTaxAC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMRtnMatchedTaxAC() {
        return mRtnMatchedTaxAC;
    }

    /**
     * 设置mRtnMatchedTaxAC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMRtnMatchedTaxAC(BigDecimal value) {
        this.mRtnMatchedTaxAC = value;
    }

    /**
     * 获取mRtnMatchedTaxFC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMRtnMatchedTaxFC() {
        return mRtnMatchedTaxFC;
    }

    /**
     * 设置mRtnMatchedTaxFC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMRtnMatchedTaxFC(BigDecimal value) {
        this.mRtnMatchedTaxFC = value;
    }

    /**
     * 获取mRtnMatchedTaxTC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMRtnMatchedTaxTC() {
        return mRtnMatchedTaxTC;
    }

    /**
     * 设置mRtnMatchedTaxTC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMRtnMatchedTaxTC(BigDecimal value) {
        this.mRtnMatchedTaxTC = value;
    }

    /**
     * 获取mRtnOutQtyCU属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMRtnOutQtyCU() {
        return mRtnOutQtyCU;
    }

    /**
     * 设置mRtnOutQtyCU属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMRtnOutQtyCU(BigDecimal value) {
        this.mRtnOutQtyCU = value;
    }

    /**
     * 获取mRtnOutQtyPU属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMRtnOutQtyPU() {
        return mRtnOutQtyPU;
    }

    /**
     * 设置mRtnOutQtyPU属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMRtnOutQtyPU(BigDecimal value) {
        this.mRtnOutQtyPU = value;
    }

    /**
     * 获取mRtnOutQtySU属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMRtnOutQtySU() {
        return mRtnOutQtySU;
    }

    /**
     * 设置mRtnOutQtySU属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMRtnOutQtySU(BigDecimal value) {
        this.mRtnOutQtySU = value;
    }

    /**
     * 获取mRtnOutQtyTBU属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMRtnOutQtyTBU() {
        return mRtnOutQtyTBU;
    }

    /**
     * 设置mRtnOutQtyTBU属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMRtnOutQtyTBU(BigDecimal value) {
        this.mRtnOutQtyTBU = value;
    }

    /**
     * 获取mRtnOutQtyTU属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMRtnOutQtyTU() {
        return mRtnOutQtyTU;
    }

    /**
     * 设置mRtnOutQtyTU属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMRtnOutQtyTU(BigDecimal value) {
        this.mRtnOutQtyTU = value;
    }

    /**
     * 获取mso属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMSO() {
        return mso;
    }

    /**
     * 设置mso属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMSO(Long value) {
        this.mso = value;
    }

    /**
     * 获取msobPostPeriod属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUFIDAU9PMRcvSOBPostPeriodData }{@code >}
     *     
     */
    public JAXBElement<ArrayOfUFIDAU9PMRcvSOBPostPeriodData> getMSOBPostPeriod() {
        return msobPostPeriod;
    }

    /**
     * 设置msobPostPeriod属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUFIDAU9PMRcvSOBPostPeriodData }{@code >}
     *     
     */
    public void setMSOBPostPeriod(JAXBElement<ArrayOfUFIDAU9PMRcvSOBPostPeriodData> value) {
        this.msobPostPeriod = value;
    }

    /**
     * 获取msuToSBURate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMSUToSBURate() {
        return msuToSBURate;
    }

    /**
     * 设置msuToSBURate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMSUToSBURate(BigDecimal value) {
        this.msuToSBURate = value;
    }

    /**
     * 获取mSeiBanCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMSeiBanCode() {
        return mSeiBanCode;
    }

    /**
     * 设置mSeiBanCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMSeiBanCode(JAXBElement<String> value) {
        this.mSeiBanCode = value;
    }

    /**
     * 获取mShipDocNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMShipDocNo() {
        return mShipDocNo;
    }

    /**
     * 设置mShipDocNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMShipDocNo(JAXBElement<String> value) {
        this.mShipDocNo = value;
    }

    /**
     * 获取mShipLineID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMShipLineID() {
        return mShipLineID;
    }

    /**
     * 设置mShipLineID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMShipLineID(Long value) {
        this.mShipLineID = value;
    }

    /**
     * 获取mShipLineNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMShipLineNo() {
        return mShipLineNo;
    }

    /**
     * 设置mShipLineNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMShipLineNo(Integer value) {
        this.mShipLineNo = value;
    }

    /**
     * 获取mShipToSite属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOSCMSupplierSupplierSiteMISCInfoData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9CBOSCMSupplierSupplierSiteMISCInfoData> getMShipToSite() {
        return mShipToSite;
    }

    /**
     * 设置mShipToSite属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOSCMSupplierSupplierSiteMISCInfoData }{@code >}
     *     
     */
    public void setMShipToSite(JAXBElement<UFIDAU9CBOSCMSupplierSupplierSiteMISCInfoData> value) {
        this.mShipToSite = value;
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
     * 获取mSplitFlag属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMSplitFlag() {
        return mSplitFlag;
    }

    /**
     * 设置mSplitFlag属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMSplitFlag(Integer value) {
        this.mSplitFlag = value;
    }

    /**
     * 获取mSplitRcvLine属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMSplitRcvLine() {
        return mSplitRcvLine;
    }

    /**
     * 设置mSplitRcvLine属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMSplitRcvLine(Long value) {
        this.mSplitRcvLine = value;
    }

    /**
     * 获取mSrcBudgetDocType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMSrcBudgetDocType() {
        return mSrcBudgetDocType;
    }

    /**
     * 设置mSrcBudgetDocType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMSrcBudgetDocType(JAXBElement<String> value) {
        this.mSrcBudgetDocType = value;
    }

    /**
     * 获取mSrcBudgetLine属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMSrcBudgetLine() {
        return mSrcBudgetLine;
    }

    /**
     * 设置mSrcBudgetLine属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMSrcBudgetLine(Long value) {
        this.mSrcBudgetLine = value;
    }

    /**
     * 获取mSrcBudgetOrg属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMSrcBudgetOrg() {
        return mSrcBudgetOrg;
    }

    /**
     * 设置mSrcBudgetOrg属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMSrcBudgetOrg(Long value) {
        this.mSrcBudgetOrg = value;
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
     * 获取mSrcDoc属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOSCMPropertyTypesSrcDocInfoData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9CBOSCMPropertyTypesSrcDocInfoData> getMSrcDoc() {
        return mSrcDoc;
    }

    /**
     * 设置mSrcDoc属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOSCMPropertyTypesSrcDocInfoData }{@code >}
     *     
     */
    public void setMSrcDoc(JAXBElement<UFIDAU9CBOSCMPropertyTypesSrcDocInfoData> value) {
        this.mSrcDoc = value;
    }

    /**
     * 获取mSrcDocCollabQtyTU属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMSrcDocCollabQtyTU() {
        return mSrcDocCollabQtyTU;
    }

    /**
     * 设置mSrcDocCollabQtyTU属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMSrcDocCollabQtyTU(BigDecimal value) {
        this.mSrcDocCollabQtyTU = value;
    }

    /**
     * 获取mSrcDocCustomerSite属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOSCMCustomerCustomerSiteMISCInfoData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9CBOSCMCustomerCustomerSiteMISCInfoData> getMSrcDocCustomerSite() {
        return mSrcDocCustomerSite;
    }

    /**
     * 设置mSrcDocCustomerSite属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOSCMCustomerCustomerSiteMISCInfoData }{@code >}
     *     
     */
    public void setMSrcDocCustomerSite(JAXBElement<UFIDAU9CBOSCMCustomerCustomerSiteMISCInfoData> value) {
        this.mSrcDocCustomerSite = value;
    }

    /**
     * 获取mSrcDocExchRateType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMSrcDocExchRateType() {
        return mSrcDocExchRateType;
    }

    /**
     * 设置mSrcDocExchRateType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMSrcDocExchRateType(Integer value) {
        this.mSrcDocExchRateType = value;
    }

    /**
     * 获取mSrcDocInfoInvRtn属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOSCMPropertyTypesSrcDocInfoData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9CBOSCMPropertyTypesSrcDocInfoData> getMSrcDocInfoInvRtn() {
        return mSrcDocInfoInvRtn;
    }

    /**
     * 设置mSrcDocInfoInvRtn属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOSCMPropertyTypesSrcDocInfoData }{@code >}
     *     
     */
    public void setMSrcDocInfoInvRtn(JAXBElement<UFIDAU9CBOSCMPropertyTypesSrcDocInfoData> value) {
        this.mSrcDocInfoInvRtn = value;
    }

    /**
     * 获取mSrcDocProcessQty属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMSrcDocProcessQty() {
        return mSrcDocProcessQty;
    }

    /**
     * 设置mSrcDocProcessQty属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMSrcDocProcessQty(BigDecimal value) {
        this.mSrcDocProcessQty = value;
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
     * 获取mSrcFinallyPriceAC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMSrcFinallyPriceAC() {
        return mSrcFinallyPriceAC;
    }

    /**
     * 设置mSrcFinallyPriceAC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMSrcFinallyPriceAC(BigDecimal value) {
        this.mSrcFinallyPriceAC = value;
    }

    /**
     * 获取mSrcFinallyPriceTC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMSrcFinallyPriceTC() {
        return mSrcFinallyPriceTC;
    }

    /**
     * 设置mSrcFinallyPriceTC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMSrcFinallyPriceTC(BigDecimal value) {
        this.mSrcFinallyPriceTC = value;
    }

    /**
     * 获取mSrcPO属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOSCMPropertyTypesSrcDocInfoData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9CBOSCMPropertyTypesSrcDocInfoData> getMSrcPO() {
        return mSrcPO;
    }

    /**
     * 设置mSrcPO属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOSCMPropertyTypesSrcDocInfoData }{@code >}
     *     
     */
    public void setMSrcPO(JAXBElement<UFIDAU9CBOSCMPropertyTypesSrcDocInfoData> value) {
        this.mSrcPO = value;
    }

    /**
     * 获取mSrcPR属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOSCMPropertyTypesSrcDocInfoData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9CBOSCMPropertyTypesSrcDocInfoData> getMSrcPR() {
        return mSrcPR;
    }

    /**
     * 设置mSrcPR属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOSCMPropertyTypesSrcDocInfoData }{@code >}
     *     
     */
    public void setMSrcPR(JAXBElement<UFIDAU9CBOSCMPropertyTypesSrcDocInfoData> value) {
        this.mSrcPR = value;
    }

    /**
     * 获取mSrcPurC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOSCMPropertyTypesSrcDocInfoData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9CBOSCMPropertyTypesSrcDocInfoData> getMSrcPurC() {
        return mSrcPurC;
    }

    /**
     * 设置mSrcPurC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOSCMPropertyTypesSrcDocInfoData }{@code >}
     *     
     */
    public void setMSrcPurC(JAXBElement<UFIDAU9CBOSCMPropertyTypesSrcDocInfoData> value) {
        this.mSrcPurC = value;
    }

    /**
     * 获取mSrcRcvLine属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9PMRcvRcvLineData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9PMRcvRcvLineData> getMSrcRcvLine() {
        return mSrcRcvLine;
    }

    /**
     * 设置mSrcRcvLine属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9PMRcvRcvLineData }{@code >}
     *     
     */
    public void setMSrcRcvLine(JAXBElement<UFIDAU9PMRcvRcvLineData> value) {
        this.mSrcRcvLine = value;
    }

    /**
     * 获取mSrcShip属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMSrcShip() {
        return mSrcShip;
    }

    /**
     * 设置mSrcShip属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMSrcShip(Long value) {
        this.mSrcShip = value;
    }

    /**
     * 获取mSrcShipLine属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMSrcShipLine() {
        return mSrcShipLine;
    }

    /**
     * 设置mSrcShipLine属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMSrcShipLine(Long value) {
        this.mSrcShipLine = value;
    }

    /**
     * 获取mSrcShipOrg属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMSrcShipOrg() {
        return mSrcShipOrg;
    }

    /**
     * 设置mSrcShipOrg属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMSrcShipOrg(Long value) {
        this.mSrcShipOrg = value;
    }

    /**
     * 获取mSrcSubLine属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9PMRcvRcvSubLineData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9PMRcvRcvSubLineData> getMSrcSubLine() {
        return mSrcSubLine;
    }

    /**
     * 设置mSrcSubLine属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9PMRcvRcvSubLineData }{@code >}
     *     
     */
    public void setMSrcSubLine(JAXBElement<UFIDAU9PMRcvRcvSubLineData> value) {
        this.mSrcSubLine = value;
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
     * 获取mStandardPriceAC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMStandardPriceAC() {
        return mStandardPriceAC;
    }

    /**
     * 设置mStandardPriceAC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMStandardPriceAC(BigDecimal value) {
        this.mStandardPriceAC = value;
    }

    /**
     * 获取mStandardPriceFC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMStandardPriceFC() {
        return mStandardPriceFC;
    }

    /**
     * 设置mStandardPriceFC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMStandardPriceFC(BigDecimal value) {
        this.mStandardPriceFC = value;
    }

    /**
     * 获取mStandardPriceTC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMStandardPriceTC() {
        return mStandardPriceTC;
    }

    /**
     * 设置mStandardPriceTC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMStandardPriceTC(BigDecimal value) {
        this.mStandardPriceTC = value;
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
     * 获取mSubContractCostAC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMSubContractCostAC() {
        return mSubContractCostAC;
    }

    /**
     * 设置mSubContractCostAC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMSubContractCostAC(BigDecimal value) {
        this.mSubContractCostAC = value;
    }

    /**
     * 获取mSubContractCostFC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMSubContractCostFC() {
        return mSubContractCostFC;
    }

    /**
     * 设置mSubContractCostFC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMSubContractCostFC(BigDecimal value) {
        this.mSubContractCostFC = value;
    }

    /**
     * 获取mSubContractCostTC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMSubContractCostTC() {
        return mSubContractCostTC;
    }

    /**
     * 设置mSubContractCostTC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMSubContractCostTC(BigDecimal value) {
        this.mSubContractCostTC = value;
    }

    /**
     * 获取mSubmitChectTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMSubmitChectTime() {
        return mSubmitChectTime;
    }

    /**
     * 设置mSubmitChectTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMSubmitChectTime(XMLGregorianCalendar value) {
        this.mSubmitChectTime = value;
    }

    /**
     * 获取mSumDispenseLineUsedMnyAC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMSumDispenseLineUsedMnyAC() {
        return mSumDispenseLineUsedMnyAC;
    }

    /**
     * 设置mSumDispenseLineUsedMnyAC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMSumDispenseLineUsedMnyAC(BigDecimal value) {
        this.mSumDispenseLineUsedMnyAC = value;
    }

    /**
     * 获取mSumDispenseLineUsedNetMnyAC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMSumDispenseLineUsedNetMnyAC() {
        return mSumDispenseLineUsedNetMnyAC;
    }

    /**
     * 设置mSumDispenseLineUsedNetMnyAC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMSumDispenseLineUsedNetMnyAC(BigDecimal value) {
        this.mSumDispenseLineUsedNetMnyAC = value;
    }

    /**
     * 获取mSumDispenseLineUsedTaxAC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMSumDispenseLineUsedTaxAC() {
        return mSumDispenseLineUsedTaxAC;
    }

    /**
     * 设置mSumDispenseLineUsedTaxAC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMSumDispenseLineUsedTaxAC(BigDecimal value) {
        this.mSumDispenseLineUsedTaxAC = value;
    }

    /**
     * 获取mSumDispenseQtyAU属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMSumDispenseQtyAU() {
        return mSumDispenseQtyAU;
    }

    /**
     * 设置mSumDispenseQtyAU属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMSumDispenseQtyAU(BigDecimal value) {
        this.mSumDispenseQtyAU = value;
    }

    /**
     * 获取mSumRMAQtyPU属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMSumRMAQtyPU() {
        return mSumRMAQtyPU;
    }

    /**
     * 设置mSumRMAQtyPU属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMSumRMAQtyPU(BigDecimal value) {
        this.mSumRMAQtyPU = value;
    }

    /**
     * 获取mSumRMAQtyTBU属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMSumRMAQtyTBU() {
        return mSumRMAQtyTBU;
    }

    /**
     * 设置mSumRMAQtyTBU属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMSumRMAQtyTBU(BigDecimal value) {
        this.mSumRMAQtyTBU = value;
    }

    /**
     * 获取mSumRMAQtyTU属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMSumRMAQtyTU() {
        return mSumRMAQtyTU;
    }

    /**
     * 设置mSumRMAQtyTU属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMSumRMAQtyTU(BigDecimal value) {
        this.mSumRMAQtyTU = value;
    }

    /**
     * 获取mSupplierDisabledTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMSupplierDisabledTime() {
        return mSupplierDisabledTime;
    }

    /**
     * 设置mSupplierDisabledTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMSupplierDisabledTime(XMLGregorianCalendar value) {
        this.mSupplierDisabledTime = value;
    }

    /**
     * 获取mSupplierItemCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMSupplierItemCode() {
        return mSupplierItemCode;
    }

    /**
     * 设置mSupplierItemCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMSupplierItemCode(JAXBElement<String> value) {
        this.mSupplierItemCode = value;
    }

    /**
     * 获取mSupplierItemName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMSupplierItemName() {
        return mSupplierItemName;
    }

    /**
     * 设置mSupplierItemName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMSupplierItemName(JAXBElement<String> value) {
        this.mSupplierItemName = value;
    }

    /**
     * 获取mSupplierLotCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMSupplierLotCode() {
        return mSupplierLotCode;
    }

    /**
     * 设置mSupplierLotCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMSupplierLotCode(JAXBElement<String> value) {
        this.mSupplierLotCode = value;
    }

    /**
     * 获取mSysPriceAC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMSysPriceAC() {
        return mSysPriceAC;
    }

    /**
     * 设置mSysPriceAC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMSysPriceAC(BigDecimal value) {
        this.mSysPriceAC = value;
    }

    /**
     * 获取mSysPriceTC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMSysPriceTC() {
        return mSysPriceTC;
    }

    /**
     * 设置mSysPriceTC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMSysPriceTC(BigDecimal value) {
        this.mSysPriceTC = value;
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
     * 获取mtbMainUOMToSubUOM属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMTBMainUOMToSubUOM() {
        return mtbMainUOMToSubUOM;
    }

    /**
     * 设置mtbMainUOMToSubUOM属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMTBMainUOMToSubUOM(BigDecimal value) {
        this.mtbMainUOMToSubUOM = value;
    }

    /**
     * 获取mtbuToCBURate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMTBUToCBURate() {
        return mtbuToCBURate;
    }

    /**
     * 设置mtbuToCBURate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMTBUToCBURate(BigDecimal value) {
        this.mtbuToCBURate = value;
    }

    /**
     * 获取mtbuToPBURate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMTBUToPBURate() {
        return mtbuToPBURate;
    }

    /**
     * 设置mtbuToPBURate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMTBUToPBURate(BigDecimal value) {
        this.mtbuToPBURate = value;
    }

    /**
     * 获取mtbuToSBURate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMTBUToSBURate() {
        return mtbuToSBURate;
    }

    /**
     * 设置mtbuToSBURate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMTBUToSBURate(BigDecimal value) {
        this.mtbuToSBURate = value;
    }

    /**
     * 获取mtcToACExchRate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMTCToACExchRate() {
        return mtcToACExchRate;
    }

    /**
     * 设置mtcToACExchRate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMTCToACExchRate(BigDecimal value) {
        this.mtcToACExchRate = value;
    }

    /**
     * 获取mtcToACExchRateRound属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMTCToACExchRateRound() {
        return mtcToACExchRateRound;
    }

    /**
     * 设置mtcToACExchRateRound属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMTCToACExchRateRound(Integer value) {
        this.mtcToACExchRateRound = value;
    }

    /**
     * 获取mtuToTBURate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMTUToTBURate() {
        return mtuToTBURate;
    }

    /**
     * 设置mtuToTBURate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMTUToTBURate(BigDecimal value) {
        this.mtuToTBURate = value;
    }

    /**
     * 获取mTaskOutput属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMTaskOutput() {
        return mTaskOutput;
    }

    /**
     * 设置mTaskOutput属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMTaskOutput(Long value) {
        this.mTaskOutput = value;
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
     * 获取mTaxType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMTaxType() {
        return mTaxType;
    }

    /**
     * 设置mTaxType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMTaxType(Integer value) {
        this.mTaxType = value;
    }

    /**
     * 获取mTempID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMTempID() {
        return mTempID;
    }

    /**
     * 设置mTempID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMTempID(Long value) {
        this.mTempID = value;
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
     * 获取mTotalNetFeeAC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMTotalNetFeeAC() {
        return mTotalNetFeeAC;
    }

    /**
     * 设置mTotalNetFeeAC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMTotalNetFeeAC(BigDecimal value) {
        this.mTotalNetFeeAC = value;
    }

    /**
     * 获取mTotalNetFeeFC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMTotalNetFeeFC() {
        return mTotalNetFeeFC;
    }

    /**
     * 设置mTotalNetFeeFC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMTotalNetFeeFC(BigDecimal value) {
        this.mTotalNetFeeFC = value;
    }

    /**
     * 获取mTotalNetFeeTC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMTotalNetFeeTC() {
        return mTotalNetFeeTC;
    }

    /**
     * 设置mTotalNetFeeTC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMTotalNetFeeTC(BigDecimal value) {
        this.mTotalNetFeeTC = value;
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
     * 获取mUnqualifiedQtyCU属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMUnqualifiedQtyCU() {
        return mUnqualifiedQtyCU;
    }

    /**
     * 设置mUnqualifiedQtyCU属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMUnqualifiedQtyCU(BigDecimal value) {
        this.mUnqualifiedQtyCU = value;
    }

    /**
     * 获取mUnqualifiedQtyPU属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMUnqualifiedQtyPU() {
        return mUnqualifiedQtyPU;
    }

    /**
     * 设置mUnqualifiedQtyPU属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMUnqualifiedQtyPU(BigDecimal value) {
        this.mUnqualifiedQtyPU = value;
    }

    /**
     * 获取mUnqualifiedQtySU属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMUnqualifiedQtySU() {
        return mUnqualifiedQtySU;
    }

    /**
     * 设置mUnqualifiedQtySU属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMUnqualifiedQtySU(BigDecimal value) {
        this.mUnqualifiedQtySU = value;
    }

    /**
     * 获取mUnqualifiedQtyTBU属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMUnqualifiedQtyTBU() {
        return mUnqualifiedQtyTBU;
    }

    /**
     * 设置mUnqualifiedQtyTBU属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMUnqualifiedQtyTBU(BigDecimal value) {
        this.mUnqualifiedQtyTBU = value;
    }

    /**
     * 获取mUnqualifiedQtyTU属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMUnqualifiedQtyTU() {
        return mUnqualifiedQtyTU;
    }

    /**
     * 设置mUnqualifiedQtyTU属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMUnqualifiedQtyTU(BigDecimal value) {
        this.mUnqualifiedQtyTU = value;
    }

    /**
     * 获取mUsageQty属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMUsageQty() {
        return mUsageQty;
    }

    /**
     * 设置mUsageQty属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMUsageQty(BigDecimal value) {
        this.mUsageQty = value;
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
     * 获取mVoucherDispCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMVoucherDispCode() {
        return mVoucherDispCode;
    }

    /**
     * 设置mVoucherDispCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMVoucherDispCode(JAXBElement<String> value) {
        this.mVoucherDispCode = value;
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
     * 获取mwpKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9BasePropertyTypesBizEntityKeyData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9BasePropertyTypesBizEntityKeyData> getMWPKey() {
        return mwpKey;
    }

    /**
     * 设置mwpKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9BasePropertyTypesBizEntityKeyData }{@code >}
     *     
     */
    public void setMWPKey(JAXBElement<UFIDAU9BasePropertyTypesBizEntityKeyData> value) {
        this.mwpKey = value;
    }

    /**
     * 获取mwpNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMWPNo() {
        return mwpNo;
    }

    /**
     * 设置mwpNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMWPNo(JAXBElement<String> value) {
        this.mwpNo = value;
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
