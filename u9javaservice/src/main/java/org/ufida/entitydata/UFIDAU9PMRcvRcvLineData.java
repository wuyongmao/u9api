
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
 * &lt;p&gt;UFIDA.U9.PM.Rcv.RcvLineData complex type�� Java �ࡣ
 * 
 * &lt;p&gt;����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡapLastConfrimPostPeriod���Ե�ֵ��
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
     * ����apLastConfrimPostPeriod���Ե�ֵ��
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
     * ��ȡapLastConfrimPostPeriodSKey���Ե�ֵ��
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
     * ����apLastConfrimPostPeriodSKey���Ե�ֵ��
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
     * ��ȡbomuom���Ե�ֵ��
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
     * ����bomuom���Ե�ֵ��
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
     * ��ȡbomuomsKey���Ե�ֵ��
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
     * ����bomuomsKey���Ե�ֵ��
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
     * ��ȡbalanceCurrency���Ե�ֵ��
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
     * ����balanceCurrency���Ե�ֵ��
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
     * ��ȡbalanceCurrencySKey���Ե�ֵ��
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
     * ����balanceCurrencySKey���Ե�ֵ��
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
     * ��ȡbizBudgetProject���Ե�ֵ��
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
     * ����bizBudgetProject���Ե�ֵ��
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
     * ��ȡbizBudgetProjectSKey���Ե�ֵ��
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
     * ����bizBudgetProjectSKey���Ե�ֵ��
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
     * ��ȡconfigResultOrg���Ե�ֵ��
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
     * ����configResultOrg���Ե�ֵ��
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
     * ��ȡconfigResultOrgSKey���Ե�ֵ��
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
     * ����configResultOrgSKey���Ե�ֵ��
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
     * ��ȡcooperateOrg���Ե�ֵ��
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
     * ����cooperateOrg���Ե�ֵ��
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
     * ��ȡcooperateOrgSKey���Ե�ֵ��
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
     * ����cooperateOrgSKey���Ե�ֵ��
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
     * ��ȡcostBaseUOM���Ե�ֵ��
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
     * ����costBaseUOM���Ե�ֵ��
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
     * ��ȡcostBaseUOMSKey���Ե�ֵ��
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
     * ����costBaseUOMSKey���Ե�ֵ��
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
     * ��ȡcostUOM���Ե�ֵ��
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
     * ����costUOM���Ե�ֵ��
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
     * ��ȡcostUOMSKey���Ե�ֵ��
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
     * ����costUOMSKey���Ե�ֵ��
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
     * ��ȡcurrentOrg���Ե�ֵ��
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
     * ����currentOrg���Ե�ֵ��
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
     * ��ȡcurrentOrgSKey���Ե�ֵ��
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
     * ����currentOrgSKey���Ե�ֵ��
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
     * ��ȡfas���Ե�ֵ��
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
     * ����fas���Ե�ֵ��
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
     * ��ȡfassKey���Ե�ֵ��
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
     * ����fassKey���Ե�ֵ��
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
     * ��ȡholdReason���Ե�ֵ��
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
     * ����holdReason���Ե�ֵ��
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
     * ��ȡholdReasonSKey���Ե�ֵ��
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
     * ����holdReasonSKey���Ե�ֵ��
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
     * ��ȡinvLot���Ե�ֵ��
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
     * ����invLot���Ե�ֵ��
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
     * ��ȡinvLotSKey���Ե�ֵ��
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
     * ����invLotSKey���Ե�ֵ��
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
     * ��ȡkitParentLineSKey���Ե�ֵ��
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
     * ����kitParentLineSKey���Ե�ֵ��
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
     * ��ȡmnyBudgetProject���Ե�ֵ��
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
     * ����mnyBudgetProject���Ե�ֵ��
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
     * ��ȡmnyBudgetProjectSKey���Ե�ֵ��
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
     * ����mnyBudgetProjectSKey���Ե�ֵ��
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
     * ��ȡmultiPrePayBillNo���Ե�ֵ��
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
     * ����multiPrePayBillNo���Ե�ֵ��
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
     * ��ȡmultiSONo���Ե�ֵ��
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
     * ����multiSONo���Ե�ֵ��
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
     * ��ȡnextWPSupplier���Ե�ֵ��
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
     * ����nextWPSupplier���Ե�ֵ��
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
     * ��ȡnextWPSupplierSKey���Ե�ֵ��
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
     * ����nextWPSupplierSKey���Ե�ֵ��
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
     * ��ȡoriginalItem���Ե�ֵ��
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
     * ����originalItem���Ե�ֵ��
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
     * ��ȡoriginalItemSKey���Ե�ֵ��
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
     * ����originalItemSKey���Ե�ֵ��
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
     * ��ȡownOrg���Ե�ֵ��
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
     * ����ownOrg���Ե�ֵ��
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
     * ��ȡownOrgSKey���Ե�ֵ��
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
     * ����ownOrgSKey���Ե�ֵ��
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
     * ��ȡpoLot���Ե�ֵ��
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
     * ����poLot���Ե�ֵ��
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
     * ��ȡpoLotSKey���Ե�ֵ��
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
     * ����poLotSKey���Ե�ֵ��
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
     * ��ȡprePayBillNo���Ե�ֵ��
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
     * ����prePayBillNo���Ե�ֵ��
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
     * ��ȡpreWPSupplier���Ե�ֵ��
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
     * ����preWPSupplier���Ե�ֵ��
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
     * ��ȡpreWPSupplierSKey���Ե�ֵ��
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
     * ����preWPSupplierSKey���Ե�ֵ��
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
     * ��ȡpriceBaseUOM���Ե�ֵ��
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
     * ����priceBaseUOM���Ե�ֵ��
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
     * ��ȡpriceBaseUOMSKey���Ե�ֵ��
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
     * ����priceBaseUOMSKey���Ե�ֵ��
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
     * ��ȡpriceUOM���Ե�ֵ��
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
     * ����priceUOM���Ե�ֵ��
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
     * ��ȡpriceUOMSKey���Ե�ֵ��
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
     * ����priceUOMSKey���Ե�ֵ��
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
     * ��ȡpurDept���Ե�ֵ��
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
     * ����purDept���Ե�ֵ��
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
     * ��ȡpurDeptSKey���Ե�ֵ��
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
     * ����purDeptSKey���Ե�ֵ��
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
     * ��ȡpurOper���Ե�ֵ��
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
     * ����purOper���Ե�ֵ��
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
     * ��ȡpurOperSKey���Ե�ֵ��
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
     * ����purOperSKey���Ե�ֵ��
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
     * ��ȡrcvDept���Ե�ֵ��
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
     * ����rcvDept���Ե�ֵ��
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
     * ��ȡrcvDeptSKey���Ե�ֵ��
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
     * ����rcvDeptSKey���Ե�ֵ��
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
     * ��ȡrcvLineExtSKey���Ե�ֵ��
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
     * ����rcvLineExtSKey���Ե�ֵ��
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
     * ��ȡrcvLot���Ե�ֵ��
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
     * ����rcvLot���Ե�ֵ��
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
     * ��ȡrcvLotSKey���Ե�ֵ��
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
     * ����rcvLotSKey���Ե�ֵ��
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
     * ��ȡreceivementSKey���Ե�ֵ��
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
     * ����receivementSKey���Ե�ֵ��
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
     * ��ȡreleaseReason���Ե�ֵ��
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
     * ����releaseReason���Ե�ֵ��
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
     * ��ȡreleaseReasonSKey���Ե�ֵ��
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
     * ����releaseReasonSKey���Ե�ֵ��
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
     * ��ȡrequireDept���Ե�ֵ��
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
     * ����requireDept���Ե�ֵ��
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
     * ��ȡrequireDeptSKey���Ե�ֵ��
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
     * ����requireDeptSKey���Ե�ֵ��
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
     * ��ȡrequireMan���Ե�ֵ��
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
     * ����requireMan���Ե�ֵ��
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
     * ��ȡrequireManSKey���Ե�ֵ��
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
     * ����requireManSKey���Ե�ֵ��
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
     * ��ȡrequireOrg���Ե�ֵ��
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
     * ����requireOrg���Ե�ֵ��
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
     * ��ȡrequireOrgSKey���Ե�ֵ��
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
     * ����requireOrgSKey���Ե�ֵ��
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
     * ��ȡrtnReason���Ե�ֵ��
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
     * ����rtnReason���Ե�ֵ��
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
     * ��ȡrtnReasonSKey���Ե�ֵ��
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
     * ����rtnReasonSKey���Ե�ֵ��
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
     * ��ȡsoNo���Ե�ֵ��
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
     * ����soNo���Ե�ֵ��
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
     * ��ȡsaleRtnOrg���Ե�ֵ��
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
     * ����saleRtnOrg���Ե�ֵ��
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
     * ��ȡsaleRtnOrgSKey���Ե�ֵ��
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
     * ����saleRtnOrgSKey���Ե�ֵ��
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
     * ��ȡsaleRtnWH���Ե�ֵ��
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
     * ����saleRtnWH���Ե�ֵ��
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
     * ��ȡsaleRtnWHSKey���Ե�ֵ��
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
     * ����saleRtnWHSKey���Ե�ֵ��
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
     * ��ȡseiBan���Ե�ֵ��
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
     * ����seiBan���Ե�ֵ��
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
     * ��ȡseiBanSKey���Ե�ֵ��
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
     * ����seiBanSKey���Ե�ֵ��
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
     * ��ȡsrcRcvLineSKey���Ե�ֵ��
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
     * ����srcRcvLineSKey���Ե�ֵ��
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
     * ��ȡsrcSubLineSKey���Ե�ֵ��
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
     * ����srcSubLineSKey���Ե�ֵ��
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
     * ��ȡstoreBaseUOM���Ե�ֵ��
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
     * ����storeBaseUOM���Ե�ֵ��
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
     * ��ȡstoreBaseUOMSKey���Ե�ֵ��
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
     * ����storeBaseUOMSKey���Ե�ֵ��
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
     * ��ȡstoreUOM���Ե�ֵ��
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
     * ����storeUOM���Ե�ֵ��
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
     * ��ȡstoreUOMSKey���Ե�ֵ��
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
     * ����storeUOMSKey���Ե�ֵ��
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
     * ��ȡtbMainUOM���Ե�ֵ��
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
     * ����tbMainUOM���Ե�ֵ��
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
     * ��ȡtbMainUOMSKey���Ե�ֵ��
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
     * ����tbMainUOMSKey���Ե�ֵ��
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
     * ��ȡtbSubUOM���Ե�ֵ��
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
     * ����tbSubUOM���Ե�ֵ��
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
     * ��ȡtbSubUOMSKey���Ե�ֵ��
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
     * ����tbSubUOMSKey���Ե�ֵ��
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
     * ��ȡtradeBaseUOM���Ե�ֵ��
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
     * ����tradeBaseUOM���Ե�ֵ��
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
     * ��ȡtradeBaseUOMSKey���Ե�ֵ��
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
     * ����tradeBaseUOMSKey���Ե�ֵ��
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
     * ��ȡtradeUOM���Ե�ֵ��
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
     * ����tradeUOM���Ե�ֵ��
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
     * ��ȡtradeUOMSKey���Ե�ֵ��
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
     * ����tradeUOMSKey���Ե�ֵ��
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
     * ��ȡwh���Ե�ֵ��
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
     * ����wh���Ե�ֵ��
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
     * ��ȡwhSKey���Ե�ֵ��
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
     * ����whSKey���Ե�ֵ��
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
     * ��ȡmacToFCExchRate���Ե�ֵ��
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
     * ����macToFCExchRate���Ե�ֵ��
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
     * ��ȡmacToFCExchRateRound���Ե�ֵ��
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
     * ����macToFCExchRateRound���Ե�ֵ��
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
     * ��ȡmapConfirmDate���Ե�ֵ��
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
     * ����mapConfirmDate���Ե�ֵ��
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
     * ��ȡmapMaturityDate���Ե�ֵ��
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
     * ����mapMaturityDate���Ե�ֵ��
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
     * ��ȡmAprrovedPrice���Ե�ֵ��
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
     * ����mAprrovedPrice���Ե�ֵ��
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
     * ��ȡmArriveBoxes���Ե�ֵ��
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
     * ����mArriveBoxes���Ե�ֵ��
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
     * ��ȡmArriveQtyCU���Ե�ֵ��
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
     * ����mArriveQtyCU���Ե�ֵ��
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
     * ��ȡmArriveQtyPU���Ե�ֵ��
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
     * ����mArriveQtyPU���Ե�ֵ��
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
     * ��ȡmArriveQtySU���Ե�ֵ��
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
     * ����mArriveQtySU���Ե�ֵ��
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
     * ��ȡmArriveQtyTBU���Ե�ֵ��
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
     * ����mArriveQtyTBU���Ե�ֵ��
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
     * ��ȡmArriveQtyTU���Ե�ֵ��
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
     * ����mArriveQtyTU���Ե�ֵ��
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
     * ��ȡmArriveTotalMnyAC���Ե�ֵ��
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
     * ����mArriveTotalMnyAC���Ե�ֵ��
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
     * ��ȡmArriveTotalMnyFC���Ե�ֵ��
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
     * ����mArriveTotalMnyFC���Ե�ֵ��
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
     * ��ȡmArriveTotalMnyTC���Ե�ֵ��
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
     * ����mArriveTotalMnyTC���Ե�ֵ��
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
     * ��ȡmArriveTotalNetMnyAC���Ե�ֵ��
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
     * ����mArriveTotalNetMnyAC���Ե�ֵ��
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
     * ��ȡmArriveTotalNetMnyFC���Ե�ֵ��
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
     * ����mArriveTotalNetMnyFC���Ե�ֵ��
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
     * ��ȡmArriveTotalNetMnyTC���Ե�ֵ��
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
     * ����mArriveTotalNetMnyTC���Ե�ֵ��
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
     * ��ȡmArriveTotalTaxAC���Ե�ֵ��
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
     * ����mArriveTotalTaxAC���Ե�ֵ��
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
     * ��ȡmArriveTotalTaxFC���Ե�ֵ��
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
     * ����mArriveTotalTaxFC���Ե�ֵ��
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
     * ��ȡmArriveTotalTaxTC���Ե�ֵ��
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
     * ����mArriveTotalTaxTC���Ե�ֵ��
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
     * ��ȡmArrivedTime���Ե�ֵ��
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
     * ����mArrivedTime���Ե�ֵ��
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
     * ��ȡmAssociatedParentLine���Ե�ֵ��
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
     * ����mAssociatedParentLine���Ե�ֵ��
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
     * ��ȡmAssociatedParentLineNo���Ե�ֵ��
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
     * ����mAssociatedParentLineNo���Ե�ֵ��
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
     * ��ȡmAuditMan���Ե�ֵ��
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
     * ����mAuditMan���Ե�ֵ��
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
     * ��ȡmAutoToRcv���Ե�ֵ��
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
     * ����mAutoToRcv���Ե�ֵ��
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
     * ��ȡmAutoToRcvRtn���Ե�ֵ��
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
     * ����mAutoToRcvRtn���Ե�ֵ��
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
     * ��ȡmbomid���Ե�ֵ��
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
     * ����mbomid���Ե�ֵ��
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
     * ��ȡmbomLineNo���Ե�ֵ��
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
     * ����mbomLineNo���Ե�ֵ��
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
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOSCMSupplierSupplierSiteMISCInfoData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9CBOSCMSupplierSupplierSiteMISCInfoData> getMBillToSite() {
        return mBillToSite;
    }

    /**
     * ����mBillToSite���Ե�ֵ��
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
     * ��ȡmBizCloseDate���Ե�ֵ��
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
     * ����mBizCloseDate���Ե�ֵ��
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
     * ��ȡmcuToCBURate���Ե�ֵ��
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
     * ����mcuToCBURate���Ե�ֵ��
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
     * ��ȡmCanAPConfirmQtyCU���Ե�ֵ��
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
     * ����mCanAPConfirmQtyCU���Ե�ֵ��
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
     * ��ȡmCanAPConfirmQtyPU���Ե�ֵ��
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
     * ����mCanAPConfirmQtyPU���Ե�ֵ��
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
     * ��ȡmCanAPConfirmQtySU���Ե�ֵ��
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
     * ����mCanAPConfirmQtySU���Ե�ֵ��
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
     * ��ȡmCanAPConfirmQtyTBU���Ե�ֵ��
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
     * ����mCanAPConfirmQtyTBU���Ե�ֵ��
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
     * ��ȡmCanAPConfirmQtyTU���Ե�ֵ��
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
     * ����mCanAPConfirmQtyTU���Ե�ֵ��
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
     * ��ȡmCancel���Ե�ֵ��
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
     * ����mCancel���Ե�ֵ��
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
     * ��ȡmCancelAuditDate���Ե�ֵ��
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
     * ����mCancelAuditDate���Ե�ֵ��
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
     * ��ȡmCancelAuditMan���Ե�ֵ��
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
     * ����mCancelAuditMan���Ե�ֵ��
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
     * ��ȡmChargeBase���Ե�ֵ��
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
     * ����mChargeBase���Ե�ֵ��
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
     * ��ȡmChargeProcessMode���Ե�ֵ��
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
     * ����mChargeProcessMode���Ե�ֵ��
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
     * ��ȡmChargeType���Ե�ֵ��
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
     * ����mChargeType���Ե�ֵ��
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
     * ��ȡmCheckedTime���Ե�ֵ��
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
     * ����mCheckedTime���Ե�ֵ��
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
     * ��ȡmConfirmSupplier���Ե�ֵ��
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
     * ����mConfirmSupplier���Ե�ֵ��
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
     * ��ȡmConfirmedMnyAC���Ե�ֵ��
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
     * ����mConfirmedMnyAC���Ե�ֵ��
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
     * ��ȡmConfirmedMnyFC���Ե�ֵ��
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
     * ����mConfirmedMnyFC���Ե�ֵ��
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
     * ��ȡmConfirmedMnyTC���Ե�ֵ��
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
     * ����mConfirmedMnyTC���Ե�ֵ��
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
     * ��ȡmConfirmedNetMnyAC���Ե�ֵ��
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
     * ����mConfirmedNetMnyAC���Ե�ֵ��
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
     * ��ȡmConfirmedNetMnyFC���Ե�ֵ��
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
     * ����mConfirmedNetMnyFC���Ե�ֵ��
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
     * ��ȡmConfirmedNetMnyTC���Ե�ֵ��
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
     * ����mConfirmedNetMnyTC���Ե�ֵ��
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
     * ��ȡmConfirmedQtyCU���Ե�ֵ��
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
     * ����mConfirmedQtyCU���Ե�ֵ��
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
     * ��ȡmConfirmedQtyPU���Ե�ֵ��
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
     * ����mConfirmedQtyPU���Ե�ֵ��
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
     * ��ȡmConfirmedQtySU���Ե�ֵ��
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
     * ����mConfirmedQtySU���Ե�ֵ��
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
     * ��ȡmConfirmedQtyTBU���Ե�ֵ��
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
     * ����mConfirmedQtyTBU���Ե�ֵ��
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
     * ��ȡmConfirmedQtyTU���Ե�ֵ��
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
     * ����mConfirmedQtyTU���Ե�ֵ��
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
     * ��ȡmConfirmedTaxAC���Ե�ֵ��
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
     * ����mConfirmedTaxAC���Ե�ֵ��
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
     * ��ȡmConfirmedTaxFC���Ե�ֵ��
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
     * ����mConfirmedTaxFC���Ե�ֵ��
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
     * ��ȡmConfirmedTaxTC���Ե�ֵ��
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
     * ����mConfirmedTaxTC���Ե�ֵ��
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
     * ��ȡmCooperateRcv���Ե�ֵ��
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
     * ����mCooperateRcv���Ե�ֵ��
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
     * ��ȡmCostPercent���Ե�ֵ��
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
     * ����mCostPercent���Ե�ֵ��
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
     * ��ȡmCostPriceSource���Ե�ֵ��
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
     * ����mCostPriceSource���Ե�ֵ��
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
     * ��ȡmCostPriceSourceType���Ե�ֵ��
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
     * ����mCostPriceSourceType���Ե�ֵ��
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
     * ��ȡmCraftRouteKey���Ե�ֵ��
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
     * ����mCraftRouteKey���Ե�ֵ��
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
     * ��ȡmCraftRouteNo���Ե�ֵ��
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
     * ����mCraftRouteNo���Ե�ֵ��
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
     * ��ȡmCusBillToSite���Ե�ֵ��
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
     * ����mCusBillToSite���Ե�ֵ��
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
     * ��ȡmCustomerShipToSite���Ե�ֵ��
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
     * ����mCustomerShipToSite���Ե�ֵ��
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
     * ��ȡmDamageQtyCU���Ե�ֵ��
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
     * ����mDamageQtyCU���Ե�ֵ��
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
     * ��ȡmDamageQtyPU���Ե�ֵ��
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
     * ����mDamageQtyPU���Ե�ֵ��
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
     * ��ȡmDamageQtySU���Ե�ֵ��
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
     * ����mDamageQtySU���Ե�ֵ��
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
     * ��ȡmDamageQtyTBU���Ե�ֵ��
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
     * ����mDamageQtyTBU���Ե�ֵ��
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
     * ��ȡmDeliverCheckQtyCU���Ե�ֵ��
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
     * ����mDeliverCheckQtyCU���Ե�ֵ��
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
     * ��ȡmDeliverCheckQtyPU���Ե�ֵ��
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
     * ����mDeliverCheckQtyPU���Ե�ֵ��
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
     * ��ȡmDeliverCheckQtySU���Ե�ֵ��
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
     * ����mDeliverCheckQtySU���Ե�ֵ��
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
     * ��ȡmDeliverCheckQtyTBU���Ե�ֵ��
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
     * ����mDeliverCheckQtyTBU���Ե�ֵ��
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
     * ��ȡmDeliverCheckQtyTU���Ե�ֵ��
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
     * ����mDeliverCheckQtyTU���Ե�ֵ��
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
     * ��ȡmDescFlexSegments���Ե�ֵ��
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
     * ����mDescFlexSegments���Ե�ֵ��
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
     * ��ȡmDestroyQtyCU���Ե�ֵ��
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
     * ����mDestroyQtyCU���Ե�ֵ��
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
     * ��ȡmDestroyQtyPU���Ե�ֵ��
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
     * ����mDestroyQtyPU���Ե�ֵ��
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
     * ��ȡmDestroyQtySU���Ե�ֵ��
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
     * ����mDestroyQtySU���Ե�ֵ��
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
     * ��ȡmDestroyQtyTBU���Ե�ֵ��
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
     * ����mDestroyQtyTBU���Ե�ֵ��
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
     * ��ȡmDestroyQtyTU���Ե�ֵ��
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
     * ����mDestroyQtyTU���Ե�ֵ��
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
     * ��ȡmDosagePerPiece���Ե�ֵ��
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
     * ����mDosagePerPiece���Ե�ֵ��
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
     * ��ȡmEvaluationMnyAC���Ե�ֵ��
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
     * ����mEvaluationMnyAC���Ե�ֵ��
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
     * ��ȡmEvaluationMnyFC���Ե�ֵ��
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
     * ����mEvaluationMnyFC���Ե�ֵ��
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
     * ��ȡmEvaluationMnyTC���Ե�ֵ��
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
     * ����mEvaluationMnyTC���Ե�ֵ��
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
     * ��ȡmEvaluationPriceCU���Ե�ֵ��
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
     * ����mEvaluationPriceCU���Ե�ֵ��
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
     * ��ȡmEvaluationPricePU���Ե�ֵ��
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
     * ����mEvaluationPricePU���Ե�ֵ��
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
     * ��ȡmExecPrePayMny���Ե�ֵ��
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
     * ����mExecPrePayMny���Ե�ֵ��
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
     * ��ȡmExecPrePayQtyPU���Ե�ֵ��
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
     * ����mExecPrePayQtyPU���Ե�ֵ��
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
     * ��ȡmExecPrePayQtyTBU���Ե�ֵ��
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
     * ����mExecPrePayQtyTBU���Ե�ֵ��
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
     * ��ȡmExecPrePayQtyTU���Ե�ֵ��
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
     * ����mExecPrePayQtyTU���Ե�ֵ��
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
     * ��ȡmEyeballedTime���Ե�ֵ��
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
     * ����mEyeballedTime���Ե�ֵ��
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
     * ��ȡmEyeballingQtyCU���Ե�ֵ��
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
     * ����mEyeballingQtyCU���Ե�ֵ��
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
     * ��ȡmEyeballingQtyPU���Ե�ֵ��
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
     * ����mEyeballingQtyPU���Ե�ֵ��
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
     * ��ȡmEyeballingQtySU���Ե�ֵ��
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
     * ����mEyeballingQtySU���Ե�ֵ��
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
     * ��ȡmEyeballingQtyTBU���Ե�ֵ��
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
     * ����mEyeballingQtyTBU���Ե�ֵ��
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
     * ��ȡmEyeballingQtyTU���Ե�ֵ��
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
     * ����mEyeballingQtyTU���Ե�ֵ��
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
     * ��ȡmFillQtyCU���Ե�ֵ��
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
     * ����mFillQtyCU���Ե�ֵ��
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
     * ��ȡmFillQtyPU���Ե�ֵ��
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
     * ����mFillQtyPU���Ե�ֵ��
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
     * ��ȡmFillQtySU���Ե�ֵ��
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
     * ����mFillQtySU���Ե�ֵ��
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
     * ��ȡmFillQtyTBU���Ե�ֵ��
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
     * ����mFillQtyTBU���Ե�ֵ��
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
     * ��ȡmFillQtyTU���Ե�ֵ��
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
     * ����mFillQtyTU���Ե�ֵ��
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
     * ��ȡmFinallyPriceAC���Ե�ֵ��
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
     * ����mFinallyPriceAC���Ե�ֵ��
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
     * ��ȡmFreeReason���Ե�ֵ��
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
     * ����mFreeReason���Ե�ֵ��
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
     * ��ȡmFreeType���Ե�ֵ��
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
     * ����mFreeType���Ե�ֵ��
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
     * ��ȡmHasCreateBudgetData���Ե�ֵ��
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
     * ����mHasCreateBudgetData���Ե�ֵ��
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
     * ��ȡmHaveCountCostMnyFC���Ե�ֵ��
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
     * ����mHaveCountCostMnyFC���Ե�ֵ��
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
     * ��ȡmHaveCountCostQtyCU���Ե�ֵ��
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
     * ����mHaveCountCostQtyCU���Ե�ֵ��
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
     * ��ȡmHaveCountCostTaxFC���Ե�ֵ��
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
     * ����mHaveCountCostTaxFC���Ե�ֵ��
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
     * ��ȡmHaveVerificationQtyTBU���Ե�ֵ��
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
     * ����mHaveVerificationQtyTBU���Ե�ֵ��
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
     * ��ȡmHaveVerificationQtyTU���Ե�ֵ��
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
     * ����mHaveVerificationQtyTU���Ե�ֵ��
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
     * ��ȡmHoldDate���Ե�ֵ��
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
     * ����mHoldDate���Ե�ֵ��
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
     * ��ȡmHoldUser���Ե�ֵ��
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
     * ����mHoldUser���Ե�ֵ��
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
     * ��ȡminvLotInfo���Ե�ֵ��
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
     * ����minvLotInfo���Ե�ֵ��
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
     * ��ȡmipvac���Ե�ֵ��
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
     * ����mipvac���Ե�ֵ��
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
     * ��ȡmipvfc���Ե�ֵ��
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
     * ����mipvfc���Ե�ֵ��
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
     * ��ȡmipvFeeAC���Ե�ֵ��
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
     * ����mipvFeeAC���Ե�ֵ��
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
     * ��ȡmipvFeeTC���Ե�ֵ��
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
     * ����mipvFeeTC���Ե�ֵ��
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
     * ��ȡmipvFeeTaxAC���Ե�ֵ��
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
     * ����mipvFeeTaxAC���Ե�ֵ��
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
     * ��ȡmipvFeeTaxTC���Ե�ֵ��
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
     * ����mipvFeeTaxTC���Ե�ֵ��
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
     * ��ȡmipvtc���Ե�ֵ��
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
     * ����mipvtc���Ե�ֵ��
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
     * ��ȡmipvTaxAC���Ե�ֵ��
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
     * ����mipvTaxAC���Ե�ֵ��
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
     * ��ȡmipvTaxFC���Ե�ֵ��
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
     * ����mipvTaxFC���Ե�ֵ��
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
     * ��ȡmipvTaxTC���Ե�ֵ��
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
     * ����mipvTaxTC���Ե�ֵ��
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
     * ��ȡmInnerBalancePrice���Ե�ֵ��
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
     * ����mInnerBalancePrice���Ե�ֵ��
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
     * ��ȡmInspectLotInfo���Ե�ֵ��
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
     * ����mInspectLotInfo���Ե�ֵ��
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
     * ��ȡmInvDisabledTime���Ե�ֵ��
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
     * ����mInvDisabledTime���Ե�ֵ��
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
     * ��ȡmInvLotCode���Ե�ֵ��
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
     * ����mInvLotCode���Ե�ֵ��
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
     * ��ȡmInvLotEnableDate���Ե�ֵ��
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
     * ����mInvLotEnableDate���Ե�ֵ��
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
     * ��ȡmInvLotValidDate���Ե�ֵ��
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
     * ����mInvLotValidDate���Ե�ֵ��
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
     * ��ȡmIsAdjustDosagePerPiece���Ե�ֵ��
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
     * ����mIsAdjustDosagePerPiece���Ե�ֵ��
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
     * ��ȡmIsAllotTOMo���Ե�ֵ��
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
     * ����mIsAllotTOMo���Ե�ֵ��
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
     * ��ȡmIsEditMfc���Ե�ֵ��
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
     * ����mIsEditMfc���Ե�ֵ��
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
     * ��ȡmIsEditSeiBan���Ե�ֵ��
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
     * ����mIsEditSeiBan���Ե�ֵ��
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
     * ��ȡmIsEvaluationChangeable���Ե�ֵ��
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
     * ����mIsEvaluationChangeable���Ե�ֵ��
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
     * ��ȡmIsInFlowFlag���Ե�ֵ��
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
     * ����mIsInFlowFlag���Ե�ֵ��
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
     * ��ȡmIsItemVerFromSrcDoc���Ե�ֵ��
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
     * ����mIsItemVerFromSrcDoc���Ե�ֵ��
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
     * ��ȡmIsKitWholeSet���Ե�ֵ��
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
     * ����mIsKitWholeSet���Ե�ֵ��
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
     * ��ȡmIsNeedTransToGL���Ե�ֵ��
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
     * ����mIsNeedTransToGL���Ե�ֵ��
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
     * ��ȡmIsPresent���Ե�ֵ��
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
     * ����mIsPresent���Ե�ֵ��
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
     * ��ȡmIsQCfree���Ե�ֵ��
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
     * ����mIsQCfree���Ե�ֵ��
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
     * ��ȡmIsRcvProcedureModify���Ե�ֵ��
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
     * ����mIsRcvProcedureModify���Ե�ֵ��
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
     * ��ȡmIsRtnSupplierFromSrcDoc���Ե�ֵ��
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
     * ����mIsRtnSupplierFromSrcDoc���Ե�ֵ��
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
     * ��ȡmIsSubCostChangeable���Ե�ֵ��
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
     * ����mIsSubCostChangeable���Ե�ֵ��
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
     * ��ȡmIsTCToACRateFromSrc���Ե�ֵ��
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
     * ����mIsTCToACRateFromSrc���Ե�ֵ��
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
     * ��ȡmIsTransferedToGL���Ե�ֵ��
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
     * ����mIsTransferedToGL���Ե�ֵ��
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
     * ��ȡmIsUpDateWMTrans���Ե�ֵ��
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
     * ����mIsUpDateWMTrans���Ե�ֵ��
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
     * ��ȡmIsUrgencyAccept���Ե�ֵ��
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
     * ����mIsUrgencyAccept���Ե�ֵ��
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
     * ��ȡmItemDealMode���Ե�ֵ��
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
     * ����mItemDealMode���Ե�ֵ��
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
     * ��ȡmkitRcvMode���Ե�ֵ��
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
     * ����mkitRcvMode���Ե�ֵ��
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
     * ��ȡmKitParentLine���Ե�ֵ��
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
     * ����mKitParentLine���Ե�ֵ��
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
     * ��ȡmLineSrcKitNO���Ե�ֵ��
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
     * ����mLineSrcKitNO���Ե�ֵ��
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
     * ��ȡmmo���Ե�ֵ��
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
     * ����mmo���Ե�ֵ��
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
     * ��ȡmmoNo���Ե�ֵ��
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
     * ����mmoNo���Ե�ֵ��
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
     * ��ȡmmrbid���Ե�ֵ��
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
     * ����mmrbid���Ե�ֵ��
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
     * ��ȡmmrbNo���Ե�ֵ��
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
     * ����mmrbNo���Ե�ֵ��
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
     * ��ȡmMachineCostAC���Ե�ֵ��
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
     * ����mMachineCostAC���Ե�ֵ��
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
     * ��ȡmMachineCostFC���Ե�ֵ��
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
     * ����mMachineCostFC���Ե�ֵ��
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
     * ��ȡmMachineCostTC���Ե�ֵ��
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
     * ����mMachineCostTC���Ե�ֵ��
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
     * ��ȡmManualCostAC���Ե�ֵ��
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
     * ����mManualCostAC���Ե�ֵ��
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
     * ��ȡmManualCostFC���Ե�ֵ��
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
     * ����mManualCostFC���Ե�ֵ��
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
     * ��ȡmManualCostTC���Ե�ֵ��
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
     * ����mManualCostTC���Ե�ֵ��
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
     * ��ȡmMatchLayer���Ե�ֵ��
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
     * ����mMatchLayer���Ե�ֵ��
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
     * ��ȡmMatchedMnyAC���Ե�ֵ��
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
     * ����mMatchedMnyAC���Ե�ֵ��
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
     * ��ȡmMatchedMnyFC���Ե�ֵ��
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
     * ����mMatchedMnyFC���Ե�ֵ��
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
     * ��ȡmMatchedMnyTC���Ե�ֵ��
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
     * ����mMatchedMnyTC���Ե�ֵ��
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
     * ��ȡmMatchedNetMnyAC���Ե�ֵ��
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
     * ����mMatchedNetMnyAC���Ե�ֵ��
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
     * ��ȡmMatchedNetMnyFC���Ե�ֵ��
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
     * ����mMatchedNetMnyFC���Ե�ֵ��
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
     * ��ȡmMatchedNetMnyTC���Ե�ֵ��
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
     * ����mMatchedNetMnyTC���Ե�ֵ��
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
     * ��ȡmMatchedQtyCU���Ե�ֵ��
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
     * ����mMatchedQtyCU���Ե�ֵ��
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
     * ��ȡmMatchedQtyPU���Ե�ֵ��
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
     * ����mMatchedQtyPU���Ե�ֵ��
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
     * ��ȡmMatchedQtyRelateMnyAC���Ե�ֵ��
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
     * ����mMatchedQtyRelateMnyAC���Ե�ֵ��
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
     * ��ȡmMatchedQtyRelateMnyFC���Ե�ֵ��
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
     * ����mMatchedQtyRelateMnyFC���Ե�ֵ��
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
     * ��ȡmMatchedQtyRelateMnyTC���Ե�ֵ��
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
     * ����mMatchedQtyRelateMnyTC���Ե�ֵ��
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
     * ��ȡmMatchedQtySU���Ե�ֵ��
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
     * ����mMatchedQtySU���Ե�ֵ��
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
     * ��ȡmMatchedQtyTBU���Ե�ֵ��
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
     * ����mMatchedQtyTBU���Ե�ֵ��
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
     * ��ȡmMatchedQtyTU���Ե�ֵ��
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
     * ����mMatchedQtyTU���Ե�ֵ��
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
     * ��ȡmMatchedTaxAC���Ե�ֵ��
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
     * ����mMatchedTaxAC���Ե�ֵ��
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
     * ��ȡmMatchedTaxFC���Ե�ֵ��
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
     * ����mMatchedTaxFC���Ե�ֵ��
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
     * ��ȡmMatchedTaxTC���Ե�ֵ��
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
     * ����mMatchedTaxTC���Ե�ֵ��
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
     * ��ȡmMaterialCostAC���Ե�ֵ��
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
     * ����mMaterialCostAC���Ե�ֵ��
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
     * ��ȡmMaterialCostFC���Ե�ֵ��
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
     * ����mMaterialCostFC���Ե�ֵ��
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
     * ��ȡmMaterialCostTC���Ե�ֵ��
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
     * ����mMaterialCostTC���Ե�ֵ��
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
     * ��ȡmMfc���Ե�ֵ��
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
     * ����mMfc���Ե�ֵ��
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
     * ��ȡmMfcCostAC���Ե�ֵ��
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
     * ����mMfcCostAC���Ե�ֵ��
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
     * ��ȡmMfcCostFC���Ե�ֵ��
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
     * ����mMfcCostFC���Ե�ֵ��
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
     * ��ȡmMfcCostTC���Ե�ֵ��
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
     * ����mMfcCostTC���Ե�ֵ��
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
     * ��ȡmNetOrderPrice���Ե�ֵ��
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
     * ����mNetOrderPrice���Ե�ֵ��
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
     * ��ȡmNextWPKey���Ե�ֵ��
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
     * ����mNextWPKey���Ե�ֵ��
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
     * ��ȡmNextWPNo���Ե�ֵ��
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
     * ����mNextWPNo���Ե�ֵ��
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
     * ��ȡmNofityMessage���Ե�ֵ��
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
     * ����mNofityMessage���Ե�ֵ��
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
     * ��ȡmNotEditAttributes���Ե�ֵ��
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
     * ����mNotEditAttributes���Ե�ֵ��
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
     * ��ȡmouToOBURate���Ե�ֵ��
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
     * ����mouToOBURate���Ե�ֵ��
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
     * ��ȡmOrderPriceAC���Ե�ֵ��
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
     * ����mOrderPriceAC���Ե�ֵ��
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
     * ��ȡmOrderPriceBy���Ե�ֵ��
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
     * ����mOrderPriceBy���Ե�ֵ��
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
     * ��ȡmOriginalItemQty���Ե�ֵ��
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
     * ����mOriginalItemQty���Ե�ֵ��
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
     * ��ȡmOriginalItemQtyBaseUom���Ե�ֵ��
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
     * ����mOriginalItemQtyBaseUom���Ե�ֵ��
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
     * ��ȡmOutStoreActualCost���Ե�ֵ��
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
     * ����mOutStoreActualCost���Ե�ֵ��
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
     * ��ȡmOwnMaterialMnyAC���Ե�ֵ��
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
     * ����mOwnMaterialMnyAC���Ե�ֵ��
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
     * ��ȡmOwnMaterialMnyFC���Ե�ֵ��
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
     * ����mOwnMaterialMnyFC���Ե�ֵ��
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
     * ��ȡmOwnMaterialMnyTC���Ե�ֵ��
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
     * ����mOwnMaterialMnyTC���Ե�ֵ��
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
     * ��ȡmpoLotCode���Ե�ֵ��
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
     * ����mpoLotCode���Ե�ֵ��
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
     * ��ȡmpuToPBURate���Ե�ֵ��
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
     * ����mpuToPBURate���Ե�ֵ��
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
     * ��ȡmPartnerMaterialIPVAC���Ե�ֵ��
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
     * ����mPartnerMaterialIPVAC���Ե�ֵ��
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
     * ��ȡmPartnerMaterialIPVFC���Ե�ֵ��
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
     * ����mPartnerMaterialIPVFC���Ե�ֵ��
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
     * ��ȡmPartnerMaterialIPVTC���Ե�ֵ��
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
     * ����mPartnerMaterialIPVTC���Ե�ֵ��
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
     * ��ȡmPartnerMaterialMnyAC���Ե�ֵ��
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
     * ����mPartnerMaterialMnyAC���Ե�ֵ��
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
     * ��ȡmPartnerMaterialMnyFC���Ե�ֵ��
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
     * ����mPartnerMaterialMnyFC���Ե�ֵ��
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
     * ��ȡmPartnerMaterialMnyTC���Ե�ֵ��
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
     * ����mPartnerMaterialMnyTC���Ե�ֵ��
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
     * ��ȡmPayedMnyAC���Ե�ֵ��
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
     * ����mPayedMnyAC���Ե�ֵ��
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
     * ��ȡmPayedMnyFC���Ե�ֵ��
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
     * ����mPayedMnyFC���Ե�ֵ��
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
     * ��ȡmPayedMnyTC���Ե�ֵ��
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
     * ����mPayedMnyTC���Ե�ֵ��
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
     * ��ȡmPayedQtyCU���Ե�ֵ��
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
     * ����mPayedQtyCU���Ե�ֵ��
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
     * ��ȡmPayedQtyPU���Ե�ֵ��
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
     * ����mPayedQtyPU���Ե�ֵ��
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
     * ��ȡmPayedQtySU���Ե�ֵ��
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
     * ����mPayedQtySU���Ե�ֵ��
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
     * ��ȡmPayedQtyTBU���Ե�ֵ��
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
     * ����mPayedQtyTBU���Ե�ֵ��
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
     * ��ȡmPayedQtyTU���Ե�ֵ��
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
     * ����mPayedQtyTU���Ե�ֵ��
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
     * ��ȡmPlanArrivedDate���Ե�ֵ��
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
     * ����mPlanArrivedDate���Ե�ֵ��
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
     * ��ȡmPlanQtyCU���Ե�ֵ��
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
     * ����mPlanQtyCU���Ե�ֵ��
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
     * ��ȡmPlanQtyPU���Ե�ֵ��
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
     * ����mPlanQtyPU���Ե�ֵ��
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
     * ��ȡmPlanQtySU���Ե�ֵ��
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
     * ����mPlanQtySU���Ե�ֵ��
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
     * ��ȡmPlanQtyTBU���Ե�ֵ��
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
     * ����mPlanQtyTBU���Ե�ֵ��
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
     * ��ȡmPlanQtyTU���Ե�ֵ��
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
     * ����mPlanQtyTU���Ե�ֵ��
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
     * ��ȡmPrePayBill���Ե�ֵ��
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
     * ����mPrePayBill���Ե�ֵ��
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
     * ��ȡmPrePayBillLine���Ե�ֵ��
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
     * ����mPrePayBillLine���Ե�ֵ��
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
     * ��ȡmPrePayBillLineNo���Ե�ֵ��
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
     * ����mPrePayBillLineNo���Ե�ֵ��
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
     * ��ȡmPrePayMnyAC���Ե�ֵ��
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
     * ����mPrePayMnyAC���Ե�ֵ��
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
     * ��ȡmPrePayQtyPU���Ե�ֵ��
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
     * ����mPrePayQtyPU���Ե�ֵ��
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
     * ��ȡmPrePayQtyTBU���Ե�ֵ��
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
     * ����mPrePayQtyTBU���Ե�ֵ��
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
     * ��ȡmPrePayQtyTU���Ե�ֵ��
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
     * ����mPrePayQtyTU���Ե�ֵ��
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
     * ��ȡmPreWPKey���Ե�ֵ��
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
     * ����mPreWPKey���Ե�ֵ��
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
     * ��ȡmPreWPNo���Ե�ֵ��
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
     * ����mPreWPNo���Ե�ֵ��
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
     * ��ȡmPresentCostApportionLine���Ե�ֵ��
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
     * ����mPresentCostApportionLine���Ե�ֵ��
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
     * ��ȡmPriceDifferenceAC���Ե�ֵ��
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
     * ����mPriceDifferenceAC���Ե�ֵ��
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
     * ��ȡmPriceDifferenceFC���Ե�ֵ��
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
     * ����mPriceDifferenceFC���Ե�ֵ��
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
     * ��ȡmPriceDifferenceTC���Ե�ֵ��
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
     * ����mPriceDifferenceTC���Ե�ֵ��
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
     * ��ȡmProcessArriveQty���Ե�ֵ��
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
     * ����mProcessArriveQty���Ե�ֵ��
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
     * ��ȡmProcessDestroyQty���Ե�ֵ��
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
     * ����mProcessDestroyQty���Ե�ֵ��
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
     * ��ȡmProcessEyeballingQty���Ե�ֵ��
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
     * ����mProcessEyeballingQty���Ե�ֵ��
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
     * ��ȡmProcessMFC���Ե�ֵ��
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
     * ����mProcessMFC���Ե�ֵ��
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
     * ��ȡmProcessPlanQty���Ե�ֵ��
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
     * ����mProcessPlanQty���Ե�ֵ��
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
     * ��ȡmProcessQualifiedQty���Ե�ֵ��
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
     * ����mProcessQualifiedQty���Ե�ֵ��
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
     * ��ȡmProcessRcvQty���Ե�ֵ��
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
     * ����mProcessRcvQty���Ե�ֵ��
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
     * ��ȡmProcessReDeductQty���Ե�ֵ��
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
     * ����mProcessReDeductQty���Ե�ֵ��
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
     * ��ȡmProcessReFillQty���Ե�ֵ��
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
     * ����mProcessReFillQty���Ե�ֵ��
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
     * ��ȡmProcessRejectQty���Ե�ֵ��
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
     * ����mProcessRejectQty���Ե�ֵ��
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
     * ��ȡmProcessUToSURate���Ե�ֵ��
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
     * ����mProcessUToSURate���Ե�ֵ��
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
     * ��ȡmProcessUnqualifiedQty���Ե�ֵ��
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
     * ����mProcessUnqualifiedQty���Ե�ֵ��
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
     * ��ȡmProductLineDate���Ե�ֵ��
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
     * ����mProductLineDate���Ե�ֵ��
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
     * ��ȡmProductLineKey���Ե�ֵ��
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
     * ����mProductLineKey���Ե�ֵ��
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
     * ��ȡmProductLineNo���Ե�ֵ��
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
     * ����mProductLineNo���Ե�ֵ��
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
     * ��ȡmPurCostAC���Ե�ֵ��
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
     * ����mPurCostAC���Ե�ֵ��
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
     * ��ȡmPurCostFC���Ե�ֵ��
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
     * ����mPurCostFC���Ե�ֵ��
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
     * ��ȡmPurCostTC���Ե�ֵ��
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
     * ����mPurCostTC���Ե�ֵ��
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
     * ��ȡmPurT0SaleUOMRate���Ե�ֵ��
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
     * ����mPurT0SaleUOMRate���Ե�ֵ��
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
     * ��ȡmqcBill���Ե�ֵ��
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
     * ����mqcBill���Ե�ֵ��
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
     * ��ȡmqcBillNo���Ե�ֵ��
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
     * ����mqcBillNo���Ե�ֵ��
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
     * ��ȡmqcConclusion���Ե�ֵ��
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
     * ����mqcConclusion���Ե�ֵ��
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
     * ��ȡmqcqcConclusion���Ե�ֵ��
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
     * ����mqcqcConclusion���Ե�ֵ��
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
     * ��ȡmQualifiedQtyCU���Ե�ֵ��
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
     * ����mQualifiedQtyCU���Ե�ֵ��
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
     * ��ȡmQualifiedQtyPU���Ե�ֵ��
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
     * ����mQualifiedQtyPU���Ե�ֵ��
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
     * ��ȡmQualifiedQtySU���Ե�ֵ��
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
     * ����mQualifiedQtySU���Ե�ֵ��
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
     * ��ȡmQualifiedQtyTBU���Ե�ֵ��
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
     * ����mQualifiedQtyTBU���Ե�ֵ��
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
     * ��ȡmQualifiedQtyTU���Ե�ֵ��
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
     * ����mQualifiedQtyTU���Ե�ֵ��
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
     * ��ȡmrcvLotInfo���Ե�ֵ��
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
     * ����mrcvLotInfo���Ե�ֵ��
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
     * ��ȡmrcvToRMAType���Ե�ֵ��
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
     * ����mrcvToRMAType���Ե�ֵ��
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
     * ��ȡmrmaTransType���Ե�ֵ��
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
     * ����mrmaTransType���Ե�ֵ��
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
     * ��ȡmrmaType���Ե�ֵ��
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
     * ����mrmaType���Ե�ֵ��
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
     * ��ȡmRcvBoxes���Ե�ֵ��
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
     * ����mRcvBoxes���Ե�ֵ��
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
     * ��ȡmRcvLineExt���Ե�ֵ��
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
     * ����mRcvLineExt���Ե�ֵ��
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
     * ��ȡmRcvLineHoldReleaseHis���Ե�ֵ��
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
     * ����mRcvLineHoldReleaseHis���Ե�ֵ��
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
     * ��ȡmRcvLotCode���Ե�ֵ��
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
     * ����mRcvLotCode���Ե�ֵ��
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
     * ��ȡmRcvProcedure���Ե�ֵ��
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
     * ����mRcvProcedure���Ե�ֵ��
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
     * ��ȡmRcvQtyCU���Ե�ֵ��
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
     * ����mRcvQtyCU���Ե�ֵ��
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
     * ��ȡmRcvQtyPU���Ե�ֵ��
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
     * ����mRcvQtyPU���Ե�ֵ��
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
     * ��ȡmRcvQtySU���Ե�ֵ��
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
     * ����mRcvQtySU���Ե�ֵ��
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
     * ��ȡmRcvQtyTBU���Ե�ֵ��
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
     * ����mRcvQtyTBU���Ե�ֵ��
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
     * ��ȡmRcvQtyTU���Ե�ֵ��
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
     * ����mRcvQtyTU���Ե�ֵ��
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
     * ��ȡmReasonableLossQtyCU���Ե�ֵ��
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
     * ����mReasonableLossQtyCU���Ե�ֵ��
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
     * ��ȡmReasonableLossQtyPU���Ե�ֵ��
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
     * ����mReasonableLossQtyPU���Ե�ֵ��
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
     * ��ȡmReasonableLossQtySU���Ե�ֵ��
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
     * ����mReasonableLossQtySU���Ե�ֵ��
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
     * ��ȡmReasonableLossQtyTBU���Ե�ֵ��
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
     * ����mReasonableLossQtyTBU���Ե�ֵ��
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
     * ��ȡmReasonableLossQtyTU���Ե�ֵ��
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
     * ����mReasonableLossQtyTU���Ե�ֵ��
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
     * ��ȡmReceivement���Ե�ֵ��
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
     * ����mReceivement���Ե�ֵ��
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
     * ��ȡmRefillUseQtyTBU���Ե�ֵ��
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
     * ����mRefillUseQtyTBU���Ե�ֵ��
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
     * ��ȡmRefillUseQtyTU���Ե�ֵ��
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
     * ����mRefillUseQtyTU���Ե�ֵ��
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
     * ��ȡmRejectMnyAC���Ե�ֵ��
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
     * ����mRejectMnyAC���Ե�ֵ��
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
     * ��ȡmRejectMnyFC���Ե�ֵ��
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
     * ����mRejectMnyFC���Ե�ֵ��
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
     * ��ȡmRejectMnyTC���Ե�ֵ��
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
     * ����mRejectMnyTC���Ե�ֵ��
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
     * ��ȡmRejectNetMnyAC���Ե�ֵ��
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
     * ����mRejectNetMnyAC���Ե�ֵ��
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
     * ��ȡmRejectNetMnyFC���Ե�ֵ��
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
     * ����mRejectNetMnyFC���Ե�ֵ��
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
     * ��ȡmRejectNetMnyTC���Ե�ֵ��
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
     * ����mRejectNetMnyTC���Ե�ֵ��
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
     * ��ȡmRejectQtyCU���Ե�ֵ��
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
     * ����mRejectQtyCU���Ե�ֵ��
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
     * ��ȡmRejectQtyPU���Ե�ֵ��
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
     * ����mRejectQtyPU���Ե�ֵ��
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
     * ��ȡmRejectQtySU���Ե�ֵ��
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
     * ����mRejectQtySU���Ե�ֵ��
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
     * ��ȡmRejectQtyTBU���Ե�ֵ��
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
     * ����mRejectQtyTBU���Ե�ֵ��
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
     * ��ȡmRejectQtyTU���Ե�ֵ��
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
     * ����mRejectQtyTU���Ե�ֵ��
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
     * ��ȡmRejectTaxMnyAC���Ե�ֵ��
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
     * ����mRejectTaxMnyAC���Ե�ֵ��
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
     * ��ȡmRejectTaxMnyFC���Ե�ֵ��
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
     * ����mRejectTaxMnyFC���Ե�ֵ��
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
     * ��ȡmRejectTaxMnyTC���Ե�ֵ��
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
     * ����mRejectTaxMnyTC���Ե�ֵ��
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
     * ��ȡmReleaseDate���Ե�ֵ��
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
     * ����mReleaseDate���Ե�ֵ��
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
     * ��ȡmReleaseUser���Ե�ֵ��
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
     * ����mReleaseUser���Ե�ֵ��
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
     * ��ȡmReturnSupplier���Ե�ֵ��
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
     * ����mReturnSupplier���Ե�ֵ��
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
     * ��ȡmRtnConfirmedMnyAC���Ե�ֵ��
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
     * ����mRtnConfirmedMnyAC���Ե�ֵ��
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
     * ��ȡmRtnConfirmedMnyFC���Ե�ֵ��
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
     * ����mRtnConfirmedMnyFC���Ե�ֵ��
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
     * ��ȡmRtnConfirmedMnyTC���Ե�ֵ��
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
     * ����mRtnConfirmedMnyTC���Ե�ֵ��
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
     * ��ȡmRtnConfirmedNetMnyAC���Ե�ֵ��
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
     * ����mRtnConfirmedNetMnyAC���Ե�ֵ��
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
     * ��ȡmRtnConfirmedNetMnyFC���Ե�ֵ��
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
     * ����mRtnConfirmedNetMnyFC���Ե�ֵ��
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
     * ��ȡmRtnConfirmedNetMnyTC���Ե�ֵ��
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
     * ����mRtnConfirmedNetMnyTC���Ե�ֵ��
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
     * ��ȡmRtnConfirmedQtyCU���Ե�ֵ��
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
     * ����mRtnConfirmedQtyCU���Ե�ֵ��
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
     * ��ȡmRtnConfirmedQtyPU���Ե�ֵ��
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
     * ����mRtnConfirmedQtyPU���Ե�ֵ��
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
     * ��ȡmRtnConfirmedQtySU���Ե�ֵ��
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
     * ����mRtnConfirmedQtySU���Ե�ֵ��
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
     * ��ȡmRtnConfirmedQtyTBU���Ե�ֵ��
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
     * ����mRtnConfirmedQtyTBU���Ե�ֵ��
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
     * ��ȡmRtnConfirmedQtyTU���Ե�ֵ��
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
     * ����mRtnConfirmedQtyTU���Ե�ֵ��
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
     * ��ȡmRtnConfirmedTaxAC���Ե�ֵ��
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
     * ����mRtnConfirmedTaxAC���Ե�ֵ��
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
     * ��ȡmRtnConfirmedTaxFC���Ե�ֵ��
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
     * ����mRtnConfirmedTaxFC���Ե�ֵ��
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
     * ��ȡmRtnConfirmedTaxTC���Ե�ֵ��
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
     * ����mRtnConfirmedTaxTC���Ե�ֵ��
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
     * ��ȡmRtnDeductEvaluationMnyAC���Ե�ֵ��
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
     * ����mRtnDeductEvaluationMnyAC���Ե�ֵ��
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
     * ��ȡmRtnDeductEvaluationMnyFC���Ե�ֵ��
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
     * ����mRtnDeductEvaluationMnyFC���Ե�ֵ��
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
     * ��ȡmRtnDeductEvaluationMnyTC���Ե�ֵ��
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
     * ����mRtnDeductEvaluationMnyTC���Ե�ֵ��
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
     * ��ȡmRtnDeductMnyAC���Ե�ֵ��
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
     * ����mRtnDeductMnyAC���Ե�ֵ��
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
     * ��ȡmRtnDeductMnyFC���Ե�ֵ��
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
     * ����mRtnDeductMnyFC���Ե�ֵ��
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
     * ��ȡmRtnDeductMnyTC���Ե�ֵ��
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
     * ����mRtnDeductMnyTC���Ե�ֵ��
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
     * ��ȡmRtnDeductNetMnyAC���Ե�ֵ��
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
     * ����mRtnDeductNetMnyAC���Ե�ֵ��
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
     * ��ȡmRtnDeductNetMnyFC���Ե�ֵ��
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
     * ����mRtnDeductNetMnyFC���Ե�ֵ��
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
     * ��ȡmRtnDeductNetMnyTC���Ե�ֵ��
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
     * ����mRtnDeductNetMnyTC���Ե�ֵ��
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
     * ��ȡmRtnDeductQtyCU���Ե�ֵ��
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
     * ����mRtnDeductQtyCU���Ե�ֵ��
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
     * ��ȡmRtnDeductQtyPU���Ե�ֵ��
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
     * ����mRtnDeductQtyPU���Ե�ֵ��
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
     * ��ȡmRtnDeductQtySU���Ե�ֵ��
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
     * ����mRtnDeductQtySU���Ե�ֵ��
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
     * ��ȡmRtnDeductQtyTBU���Ե�ֵ��
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
     * ����mRtnDeductQtyTBU���Ե�ֵ��
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
     * ��ȡmRtnDeductQtyTU���Ե�ֵ��
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
     * ����mRtnDeductQtyTU���Ե�ֵ��
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
     * ��ȡmRtnDeductTaxAC���Ե�ֵ��
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
     * ����mRtnDeductTaxAC���Ե�ֵ��
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
     * ��ȡmRtnDeductTaxFC���Ե�ֵ��
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
     * ����mRtnDeductTaxFC���Ե�ֵ��
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
     * ��ȡmRtnDeductTaxTC���Ե�ֵ��
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
     * ����mRtnDeductTaxTC���Ե�ֵ��
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
     * ��ȡmRtnFillNoUsedIPVAC���Ե�ֵ��
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
     * ����mRtnFillNoUsedIPVAC���Ե�ֵ��
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
     * ��ȡmRtnFillNoUsedIPVFC���Ե�ֵ��
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
     * ����mRtnFillNoUsedIPVFC���Ե�ֵ��
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
     * ��ȡmRtnFillNoUsedIPVTC���Ե�ֵ��
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
     * ����mRtnFillNoUsedIPVTC���Ե�ֵ��
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
     * ��ȡmRtnFillQtyCU���Ե�ֵ��
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
     * ����mRtnFillQtyCU���Ե�ֵ��
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
     * ��ȡmRtnFillQtyPU���Ե�ֵ��
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
     * ����mRtnFillQtyPU���Ե�ֵ��
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
     * ��ȡmRtnFillQtySU���Ե�ֵ��
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
     * ����mRtnFillQtySU���Ե�ֵ��
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
     * ��ȡmRtnFillQtyTBU���Ե�ֵ��
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
     * ����mRtnFillQtyTBU���Ե�ֵ��
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
     * ��ȡmRtnFillQtyTU���Ե�ֵ��
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
     * ����mRtnFillQtyTU���Ե�ֵ��
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
     * ��ȡmRtnMatchedMnyAC���Ե�ֵ��
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
     * ����mRtnMatchedMnyAC���Ե�ֵ��
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
     * ��ȡmRtnMatchedMnyFC���Ե�ֵ��
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
     * ����mRtnMatchedMnyFC���Ե�ֵ��
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
     * ��ȡmRtnMatchedMnyTC���Ե�ֵ��
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
     * ����mRtnMatchedMnyTC���Ե�ֵ��
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
     * ��ȡmRtnMatchedNetMnyAC���Ե�ֵ��
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
     * ����mRtnMatchedNetMnyAC���Ե�ֵ��
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
     * ��ȡmRtnMatchedNetMnyFC���Ե�ֵ��
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
     * ����mRtnMatchedNetMnyFC���Ե�ֵ��
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
     * ��ȡmRtnMatchedNetMnyTC���Ե�ֵ��
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
     * ����mRtnMatchedNetMnyTC���Ե�ֵ��
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
     * ��ȡmRtnMatchedQtyCU���Ե�ֵ��
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
     * ����mRtnMatchedQtyCU���Ե�ֵ��
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
     * ��ȡmRtnMatchedQtyPU���Ե�ֵ��
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
     * ����mRtnMatchedQtyPU���Ե�ֵ��
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
     * ��ȡmRtnMatchedQtySU���Ե�ֵ��
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
     * ����mRtnMatchedQtySU���Ե�ֵ��
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
     * ��ȡmRtnMatchedQtyTBU���Ե�ֵ��
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
     * ����mRtnMatchedQtyTBU���Ե�ֵ��
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
     * ��ȡmRtnMatchedQtyTU���Ե�ֵ��
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
     * ����mRtnMatchedQtyTU���Ե�ֵ��
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
     * ��ȡmRtnMatchedTaxAC���Ե�ֵ��
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
     * ����mRtnMatchedTaxAC���Ե�ֵ��
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
     * ��ȡmRtnMatchedTaxFC���Ե�ֵ��
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
     * ����mRtnMatchedTaxFC���Ե�ֵ��
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
     * ��ȡmRtnMatchedTaxTC���Ե�ֵ��
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
     * ����mRtnMatchedTaxTC���Ե�ֵ��
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
     * ��ȡmRtnOutQtyCU���Ե�ֵ��
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
     * ����mRtnOutQtyCU���Ե�ֵ��
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
     * ��ȡmRtnOutQtyPU���Ե�ֵ��
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
     * ����mRtnOutQtyPU���Ե�ֵ��
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
     * ��ȡmRtnOutQtySU���Ե�ֵ��
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
     * ����mRtnOutQtySU���Ե�ֵ��
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
     * ��ȡmRtnOutQtyTBU���Ե�ֵ��
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
     * ����mRtnOutQtyTBU���Ե�ֵ��
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
     * ��ȡmRtnOutQtyTU���Ե�ֵ��
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
     * ����mRtnOutQtyTU���Ե�ֵ��
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
     * ��ȡmso���Ե�ֵ��
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
     * ����mso���Ե�ֵ��
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
     * ��ȡmsobPostPeriod���Ե�ֵ��
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
     * ����msobPostPeriod���Ե�ֵ��
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
     * ��ȡmsuToSBURate���Ե�ֵ��
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
     * ����msuToSBURate���Ե�ֵ��
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
     * ��ȡmSeiBanCode���Ե�ֵ��
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
     * ����mSeiBanCode���Ե�ֵ��
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
     * ��ȡmShipDocNo���Ե�ֵ��
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
     * ����mShipDocNo���Ե�ֵ��
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
     * ��ȡmShipLineID���Ե�ֵ��
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
     * ����mShipLineID���Ե�ֵ��
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
     * ��ȡmShipLineNo���Ե�ֵ��
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
     * ����mShipLineNo���Ե�ֵ��
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
     * ��ȡmShipToSite���Ե�ֵ��
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
     * ����mShipToSite���Ե�ֵ��
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
     * ��ȡmSplitFlag���Ե�ֵ��
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
     * ����mSplitFlag���Ե�ֵ��
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
     * ��ȡmSplitRcvLine���Ե�ֵ��
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
     * ����mSplitRcvLine���Ե�ֵ��
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
     * ��ȡmSrcBudgetDocType���Ե�ֵ��
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
     * ����mSrcBudgetDocType���Ե�ֵ��
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
     * ��ȡmSrcBudgetLine���Ե�ֵ��
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
     * ����mSrcBudgetLine���Ե�ֵ��
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
     * ��ȡmSrcBudgetOrg���Ե�ֵ��
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
     * ����mSrcBudgetOrg���Ե�ֵ��
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
     * ��ȡmSrcDoc���Ե�ֵ��
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
     * ����mSrcDoc���Ե�ֵ��
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
     * ��ȡmSrcDocCollabQtyTU���Ե�ֵ��
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
     * ����mSrcDocCollabQtyTU���Ե�ֵ��
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
     * ��ȡmSrcDocCustomerSite���Ե�ֵ��
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
     * ����mSrcDocCustomerSite���Ե�ֵ��
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
     * ��ȡmSrcDocExchRateType���Ե�ֵ��
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
     * ����mSrcDocExchRateType���Ե�ֵ��
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
     * ��ȡmSrcDocInfoInvRtn���Ե�ֵ��
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
     * ����mSrcDocInfoInvRtn���Ե�ֵ��
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
     * ��ȡmSrcDocProcessQty���Ե�ֵ��
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
     * ����mSrcDocProcessQty���Ե�ֵ��
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
     * ��ȡmSrcFinallyPriceAC���Ե�ֵ��
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
     * ����mSrcFinallyPriceAC���Ե�ֵ��
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
     * ��ȡmSrcFinallyPriceTC���Ե�ֵ��
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
     * ����mSrcFinallyPriceTC���Ե�ֵ��
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
     * ��ȡmSrcPO���Ե�ֵ��
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
     * ����mSrcPO���Ե�ֵ��
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
     * ��ȡmSrcPR���Ե�ֵ��
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
     * ����mSrcPR���Ե�ֵ��
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
     * ��ȡmSrcPurC���Ե�ֵ��
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
     * ����mSrcPurC���Ե�ֵ��
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
     * ��ȡmSrcRcvLine���Ե�ֵ��
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
     * ����mSrcRcvLine���Ե�ֵ��
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
     * ��ȡmSrcShip���Ե�ֵ��
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
     * ����mSrcShip���Ե�ֵ��
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
     * ��ȡmSrcShipLine���Ե�ֵ��
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
     * ����mSrcShipLine���Ե�ֵ��
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
     * ��ȡmSrcShipOrg���Ե�ֵ��
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
     * ����mSrcShipOrg���Ե�ֵ��
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
     * ��ȡmSrcSubLine���Ե�ֵ��
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
     * ����mSrcSubLine���Ե�ֵ��
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
     * ��ȡmStandardPriceAC���Ե�ֵ��
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
     * ����mStandardPriceAC���Ե�ֵ��
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
     * ��ȡmStandardPriceFC���Ե�ֵ��
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
     * ����mStandardPriceFC���Ե�ֵ��
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
     * ��ȡmStandardPriceTC���Ե�ֵ��
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
     * ����mStandardPriceTC���Ե�ֵ��
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
     * ��ȡmSubContractCostAC���Ե�ֵ��
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
     * ����mSubContractCostAC���Ե�ֵ��
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
     * ��ȡmSubContractCostFC���Ե�ֵ��
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
     * ����mSubContractCostFC���Ե�ֵ��
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
     * ��ȡmSubContractCostTC���Ե�ֵ��
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
     * ����mSubContractCostTC���Ե�ֵ��
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
     * ��ȡmSubmitChectTime���Ե�ֵ��
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
     * ����mSubmitChectTime���Ե�ֵ��
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
     * ��ȡmSumDispenseLineUsedMnyAC���Ե�ֵ��
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
     * ����mSumDispenseLineUsedMnyAC���Ե�ֵ��
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
     * ��ȡmSumDispenseLineUsedNetMnyAC���Ե�ֵ��
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
     * ����mSumDispenseLineUsedNetMnyAC���Ե�ֵ��
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
     * ��ȡmSumDispenseLineUsedTaxAC���Ե�ֵ��
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
     * ����mSumDispenseLineUsedTaxAC���Ե�ֵ��
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
     * ��ȡmSumDispenseQtyAU���Ե�ֵ��
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
     * ����mSumDispenseQtyAU���Ե�ֵ��
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
     * ��ȡmSumRMAQtyPU���Ե�ֵ��
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
     * ����mSumRMAQtyPU���Ե�ֵ��
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
     * ��ȡmSumRMAQtyTBU���Ե�ֵ��
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
     * ����mSumRMAQtyTBU���Ե�ֵ��
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
     * ��ȡmSumRMAQtyTU���Ե�ֵ��
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
     * ����mSumRMAQtyTU���Ե�ֵ��
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
     * ��ȡmSupplierDisabledTime���Ե�ֵ��
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
     * ����mSupplierDisabledTime���Ե�ֵ��
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
     * ��ȡmSupplierItemCode���Ե�ֵ��
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
     * ����mSupplierItemCode���Ե�ֵ��
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
     * ��ȡmSupplierItemName���Ե�ֵ��
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
     * ����mSupplierItemName���Ե�ֵ��
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
     * ��ȡmSupplierLotCode���Ե�ֵ��
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
     * ����mSupplierLotCode���Ե�ֵ��
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
     * ��ȡmSysPriceAC���Ե�ֵ��
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
     * ����mSysPriceAC���Ե�ֵ��
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
     * ��ȡmSysPriceTC���Ե�ֵ��
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
     * ����mSysPriceTC���Ե�ֵ��
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
     * ��ȡmtbMainUOMToSubUOM���Ե�ֵ��
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
     * ����mtbMainUOMToSubUOM���Ե�ֵ��
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
     * ��ȡmtbuToCBURate���Ե�ֵ��
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
     * ����mtbuToCBURate���Ե�ֵ��
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
     * ��ȡmtbuToPBURate���Ե�ֵ��
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
     * ����mtbuToPBURate���Ե�ֵ��
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
     * ��ȡmtbuToSBURate���Ե�ֵ��
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
     * ����mtbuToSBURate���Ե�ֵ��
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
     * ��ȡmtcToACExchRate���Ե�ֵ��
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
     * ����mtcToACExchRate���Ե�ֵ��
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
     * ��ȡmtcToACExchRateRound���Ե�ֵ��
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
     * ����mtcToACExchRateRound���Ե�ֵ��
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
     * ��ȡmtuToTBURate���Ե�ֵ��
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
     * ����mtuToTBURate���Ե�ֵ��
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
     * ��ȡmTaskOutput���Ե�ֵ��
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
     * ����mTaskOutput���Ե�ֵ��
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
     * ��ȡmTaxType���Ե�ֵ��
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
     * ����mTaxType���Ե�ֵ��
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
     * ��ȡmTempID���Ե�ֵ��
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
     * ����mTempID���Ե�ֵ��
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
     * ��ȡmTotalNetFeeAC���Ե�ֵ��
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
     * ����mTotalNetFeeAC���Ե�ֵ��
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
     * ��ȡmTotalNetFeeFC���Ե�ֵ��
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
     * ����mTotalNetFeeFC���Ե�ֵ��
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
     * ��ȡmTotalNetFeeTC���Ե�ֵ��
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
     * ����mTotalNetFeeTC���Ե�ֵ��
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
     * ��ȡmUnqualifiedQtyCU���Ե�ֵ��
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
     * ����mUnqualifiedQtyCU���Ե�ֵ��
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
     * ��ȡmUnqualifiedQtyPU���Ե�ֵ��
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
     * ����mUnqualifiedQtyPU���Ե�ֵ��
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
     * ��ȡmUnqualifiedQtySU���Ե�ֵ��
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
     * ����mUnqualifiedQtySU���Ե�ֵ��
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
     * ��ȡmUnqualifiedQtyTBU���Ե�ֵ��
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
     * ����mUnqualifiedQtyTBU���Ե�ֵ��
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
     * ��ȡmUnqualifiedQtyTU���Ե�ֵ��
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
     * ����mUnqualifiedQtyTU���Ե�ֵ��
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
     * ��ȡmUsageQty���Ե�ֵ��
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
     * ����mUsageQty���Ե�ֵ��
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
     * ��ȡmVoucherDispCode���Ե�ֵ��
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
     * ����mVoucherDispCode���Ե�ֵ��
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
     * ��ȡmwpKey���Ե�ֵ��
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
     * ����mwpKey���Ե�ֵ��
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
     * ��ȡmwpNo���Ե�ֵ��
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
     * ����mwpNo���Ե�ֵ��
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
