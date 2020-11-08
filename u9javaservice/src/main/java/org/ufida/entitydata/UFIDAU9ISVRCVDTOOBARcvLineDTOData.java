
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
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring;
import data.util.ubf.ufsoft.MultiLangDataDict;


/**
 * &lt;p&gt;UFIDA.U9.ISV.RCV.DTO.OBARcvLineDTOData complex type的 Java 类。
 * 
 * &lt;p&gt;以下模式片段指定包含在此类中的预期内容。
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="UFIDA.U9.ISV.RCV.DTO.OBARcvLineDTOData"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://www.UFIDA.org/EntityData}UFSoft.UBF.Business.DataTransObjectBase"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="Multi_PrePayBillNo" type="{UFSoft.UBF.Util.Data}MultiLangDataDict" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Multi_PriceListName" type="{UFSoft.UBF.Util.Data}MultiLangDataDict" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Multi_SONo" type="{UFSoft.UBF.Util.Data}MultiLangDataDict" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="OriginalItem" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="OriginalItem_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="PrePayBillNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="PriceListName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="SONo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_aCToFCExchRate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_aCToFCExchRateRound" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_aPConfirmDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_aPMaturityDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_accountOrg" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.PM.DTOs.BESimp4UIDTOData" minOccurs="0"/&amp;gt;
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
 *         &amp;lt;element name="m_associatedParent" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.PM.DTOs.BESimp4UIDTOData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_associatedParentLine" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_associatedParentLineNo" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_bOMID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_bOMLineNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_bOMUOM" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.PM.DTOs.BESimp4UIDTOData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_balanceCurrency" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.PM.DTOs.BESimp4UIDTOData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_balanceRoute" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.PM.DTOs.BESimp4UIDTOData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_balanceRouteDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_billSetCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_billToSite" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CBO.SCM.Supplier.SupplierSiteMISCInfoData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_bizBudgetProject" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.PM.DTOs.BESimp4UIDTOData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_cUToCBURate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_chargeBase" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_chargeProcessMode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_chargeType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_checkedTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_configResult" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_configResultOrg" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.PM.DTOs.BESimp4UIDTOData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_confirmAccording" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.PM.DTOs.BESimp4UIDTOData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_confirmDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_confirmMode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_confirmSupplier" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CBO.SCM.Supplier.SupplierMISCInfoData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_confirmTerm" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.PM.DTOs.BESimp4UIDTOData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_container" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_costBaseUOM" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.PM.DTOs.BESimp4UIDTOData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_costPercent" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_costUOM" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.PM.DTOs.BESimp4UIDTOData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_craftRouteKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_craftRouteNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_createdBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_createdOn" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_cusBillToSite" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CBO.SCM.Customer.CustomerSiteMISCInfoData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_customAC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_customFC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_customTC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_customerShipToSite" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CBO.SCM.Customer.CustomerSiteMISCInfoData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_damageQtyCU" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_damageQtyPU" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_damageQtySU" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_damageQtyTBU" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_damageQtyTU" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_deliverCheckQtyCU" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_deliverCheckQtyPU" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_deliverCheckQtySU" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_deliverCheckQtyTBU" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_deliverCheckQtyTU" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_descFlexSegments" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.Base.FlexField.DescFlexField.DescFlexSegmentsData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_docLineNo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_dosagePerPiece" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_evaluationMnyAC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_evaluationMnyFC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_evaluationMnyTC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_evaluationPriceCU" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_evaluationPricePU" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_exciseAC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_exciseFC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_exciseTC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
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
 *         &amp;lt;element name="m_fAS" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.PM.DTOs.BESimp4UIDTOData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_finallyPriceAC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_finallyPriceTC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_freeReason" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_freeType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_haveCountCostMnyFC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_haveCountCostQtyCU" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_iD" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_innerBalancePrice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_invDisabledTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_invLot" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_invLotCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_invLotEnableDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_invLotValidDate" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isAllotTOMo" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isAssociatedChild" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isEditSeiBan" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isEvaluationChangeable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isInFlowFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isItemVerFromSrcDoc" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isKitWholeSet" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
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
 *         &amp;lt;element name="m_isUrgencyAccept" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isZeroCost" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_itemDealMode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_itemInfo" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CBO.SCM.Item.ItemInfoData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_kITRcvMode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_kitParentLine" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.PM.Rcv.RcvLineData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_lCMnyAC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_lCMnyFC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_lCMnyTC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_lCQtyCU" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_lCQtyPU" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_lCQtySU" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_lCQtyTBU" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_lCQtyTU" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
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
 *         &amp;lt;element name="m_materialCostAC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_materialCostFC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_materialCostTC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_memo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_mfc" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CBO.SCM.Supplier.SupplierMISCInfoData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_mfcCostAC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_mfcCostFC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_mfcCostTC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_mnyBudgetProject" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.PM.DTOs.BESimp4UIDTOData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_modifiedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_modifiedOn" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_netOrderPrice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_nextWPKey" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.Base.PropertyTypes.BizEntityKeyData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_nextWPNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_noLCMnyAC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_noLCMnyFC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_noLCMnyTC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_noLCQtyCU" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_noLCQtyPU" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_noLCQtySU" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_noLCQtyTBU" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_noLCQtyTU" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_nofityMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_oBAReceivementDTO" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.ISV.RCV.DTO.OBAReceivementDTOData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_oUToOBURate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_orderPriceAC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_orderPriceTC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_originalItemBaseUom" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.PM.DTOs.BESimp4UIDTOData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_originalItemCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_originalItemQty" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_originalItemQtyBaseUom" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_originalItemUom" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.PM.DTOs.BESimp4UIDTOData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_outStoreActualCost" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_ownMaterialMnyAC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_ownMaterialMnyFC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_ownMaterialMnyTC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_ownOrg" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.PM.DTOs.BESimp4UIDTOData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_pOLot" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_pOLotCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_pUToPBURate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_partnerMaterialMnyAC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_partnerMaterialMnyFC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_partnerMaterialMnyTC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_payer" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CBO.SCM.Supplier.SupplierMISCInfoData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_payerSite" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CBO.SCM.Supplier.SupplierSiteMISCInfoData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_paymentBill" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_paymentBillLine" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_paymentBillLineNo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_paymentBillNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_paymentTerm" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.PM.DTOs.BESimp4UIDTOData" minOccurs="0"/&amp;gt;
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
 *         &amp;lt;element name="m_prePayQtyPU" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_prePayQtyTBU" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_prePayQtyTU" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_preWPKey" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.Base.PropertyTypes.BizEntityKeyData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_preWPNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_prepayPolicy" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.PM.DTOs.BESimp4UIDTOData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_priceBaseUOM" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.PM.DTOs.BESimp4UIDTOData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_priceDifferenceAC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_priceDifferenceFC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_priceDifferenceTC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_priceList" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_priceListCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_priceSource" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_priceUOM" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.PM.DTOs.BESimp4UIDTOData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_processArriveQty" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
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
 *         &amp;lt;element name="m_processSubUOM" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.PM.DTOs.BESimp4UIDTOData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_processUOM" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.PM.DTOs.BESimp4UIDTOData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_processUToSURate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_processUnqualifiedQty" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_productLineDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_productLineKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_productLineNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_project" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.PM.DTOs.BESimp4UIDTOData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_purCostAC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_purCostFC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_purCostTC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_purDept" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.PM.DTOs.BESimp4UIDTOData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_purOper" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.PM.DTOs.BESimp4UIDTOData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_purOrg" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.PM.DTOs.BESimp4UIDTOData" minOccurs="0"/&amp;gt;
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
 *         &amp;lt;element name="m_rCVToRMAType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_rMATransType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_rMAType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_rcvAddress" type="{http://www.UFIDA.org/EntityData}ArrayOfUFIDA.U9.ISV.RCV.DTO.OBARcvAddressDTOData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_rcvBoxes" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_rcvBy" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.PM.DTOs.BESimp4UIDTOData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_rcvContacts" type="{http://www.UFIDA.org/EntityData}ArrayOfUFIDA.U9.ISV.RCV.DTO.OBARcvContactDTOData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_rcvDept" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.PM.DTOs.BESimp4UIDTOData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_rcvDiscount" type="{http://www.UFIDA.org/EntityData}ArrayOfUFIDA.U9.ISV.RCV.DTO.OBARcvDiscountDTOData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_rcvFees" type="{http://www.UFIDA.org/EntityData}ArrayOfUFIDA.U9.ISV.RCV.DTO.OBARcvFeeDTOData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_rcvLineAllotMOs" type="{http://www.UFIDA.org/EntityData}ArrayOfUFIDA.U9.ISV.RCV.DTO.OBARcvLineAllotMODTOData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_rcvLineBalanceRoutes" type="{http://www.UFIDA.org/EntityData}ArrayOfUFIDA.U9.ISV.RCV.DTO.OBARcvLineBalanceRouteDTOData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_rcvLineCosts" type="{http://www.UFIDA.org/EntityData}ArrayOfUFIDA.U9.ISV.RCV.DTO.OBARcvLineCostDTOData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_rcvLineDispenses" type="{http://www.UFIDA.org/EntityData}ArrayOfUFIDA.U9.ISV.RCV.DTO.OBARcvLineDispenseDTOData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_rcvLineLocations" type="{http://www.UFIDA.org/EntityData}ArrayOfUFIDA.U9.ISV.RCV.DTO.OBARcvLineLocationDTOData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_rcvLot" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_rcvLotCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_rcvProcedure" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_rcvQtyCU" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_rcvQtyPU" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_rcvQtySU" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_rcvQtyTBU" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_rcvQtyTU" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_rcvSubLines" type="{http://www.UFIDA.org/EntityData}ArrayOfUFIDA.U9.ISV.RCV.DTO.OBARcvSubLineDTOData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_rcvTaxs" type="{http://www.UFIDA.org/EntityData}ArrayOfUFIDA.U9.ISV.RCV.DTO.OBARcvTaxDTOData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_receivement" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.PM.Rcv.ReceivementData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_refillUseQtyTBU" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_refillUseQtyTU" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_rejectMnyAC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_rejectMnyFC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_rejectMnyTC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
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
 *         &amp;lt;element name="m_requireDept" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.PM.DTOs.BESimp4UIDTOData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_requireMan" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.PM.DTOs.BESimp4UIDTOData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_requireOrg" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.PM.DTOs.BESimp4UIDTOData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_returnSupplier" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CBO.SCM.Supplier.SupplierMISCInfoData" minOccurs="0"/&amp;gt;
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
 *         &amp;lt;element name="m_rtnFillQtyCU" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_rtnFillQtyPU" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_rtnFillQtySU" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_rtnFillQtyTBU" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_rtnFillQtyTU" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_rtnReason" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.PM.Rtn.RtnReasonData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_sNList" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_sO" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_sUToCURate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_sUToSBURate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_seiBan" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.PM.DTOs.BESimp4UIDTOData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_shipLineID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_shipToSite" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CBO.SCM.Supplier.SupplierSiteMISCInfoData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_snCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_splitFlag" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_splitRcvLine" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
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
 *         &amp;lt;element name="m_srcSubLine" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.PM.Rcv.RcvSubLineData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_srcSysVersion" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_standardPriceAC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_standardPriceFC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_standardPriceTC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_storageType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_storeBaseUOM" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.PM.DTOs.BESimp4UIDTOData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_storeUOM" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.PM.DTOs.BESimp4UIDTOData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_subContractCostAC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_subContractCostFC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_subContractCostTC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_submitChectTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_sumDispenseLineUsedMnyAC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_sumDispenseLineUsedNetMnyAC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_sumDispenseLineUsedTaxAC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_sumDispenseQtyAU" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_supplierDisabledTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_supplierItemCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_supplierItemName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_supplierLotCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_sysPriceAC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_sysPriceTC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_sysVersion" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_tBMainUOM" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.PM.DTOs.BESimp4UIDTOData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_tBMainUOMToSubUOM" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_tBSubUOM" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.PM.DTOs.BESimp4UIDTOData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_tBUToCBURate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_tBUToPBURate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_tBUToSBURate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_tCToACExchRate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_tCToACExchRateRound" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_tUToTBURate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_task" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.PM.DTOs.BESimp4UIDTOData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_taskOutput" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_taxRate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_taxSchedule" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.PM.DTOs.BESimp4UIDTOData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_taxType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_totalMnyAC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_totalMnyFC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_totalMnyTC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_totalNetMnyAC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_totalNetMnyFC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_totalNetMnyTC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_totalTaxAC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_totalTaxFC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_totalTaxTC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_tradeBaseUOM" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.PM.DTOs.BESimp4UIDTOData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_tradeUOM" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.PM.DTOs.BESimp4UIDTOData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_unqualifiedQtyCU" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_unqualifiedQtyPU" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_unqualifiedQtySU" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_unqualifiedQtyTBU" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_unqualifiedQtyTU" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_usageQty" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_vATAC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_vATFC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_vATTC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_volume" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_volumeUom" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.PM.DTOs.BESimp4UIDTOData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_wPKey" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.Base.PropertyTypes.BizEntityKeyData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_wPNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_weight" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_weightUom" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.PM.DTOs.BESimp4UIDTOData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_wh" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.PM.DTOs.BESimp4UIDTOData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_whMan" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.PM.DTOs.BESimp4UIDTOData" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UFIDA.U9.ISV.RCV.DTO.OBARcvLineDTOData", propOrder = {
    "multiPrePayBillNo",
    "multiPriceListName",
    "multiSONo",
    "originalItem",
    "originalItemSKey",
    "prePayBillNo",
    "priceListName",
    "soNo",
    "macToFCExchRate",
    "macToFCExchRateRound",
    "mapConfirmDate",
    "mapMaturityDate",
    "mAccountOrg",
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
    "mAssociatedParent",
    "mAssociatedParentLine",
    "mAssociatedParentLineNo",
    "mbomid",
    "mbomLineNo",
    "mbomuom",
    "mBalanceCurrency",
    "mBalanceRoute",
    "mBalanceRouteDesc",
    "mBillSetCode",
    "mBillToSite",
    "mBizBudgetProject",
    "mcuToCBURate",
    "mChargeBase",
    "mChargeProcessMode",
    "mChargeType",
    "mCheckedTime",
    "mConfigResult",
    "mConfigResultOrg",
    "mConfirmAccording",
    "mConfirmDate",
    "mConfirmMode",
    "mConfirmSupplier",
    "mConfirmTerm",
    "mContainer",
    "mCostBaseUOM",
    "mCostPercent",
    "mCostUOM",
    "mCraftRouteKey",
    "mCraftRouteNo",
    "mCreatedBy",
    "mCreatedOn",
    "mCusBillToSite",
    "mCustomAC",
    "mCustomFC",
    "mCustomTC",
    "mCustomerShipToSite",
    "mDamageQtyCU",
    "mDamageQtyPU",
    "mDamageQtySU",
    "mDamageQtyTBU",
    "mDamageQtyTU",
    "mDeliverCheckQtyCU",
    "mDeliverCheckQtyPU",
    "mDeliverCheckQtySU",
    "mDeliverCheckQtyTBU",
    "mDeliverCheckQtyTU",
    "mDescFlexSegments",
    "mDocLineNo",
    "mDosagePerPiece",
    "mEvaluationMnyAC",
    "mEvaluationMnyFC",
    "mEvaluationMnyTC",
    "mEvaluationPriceCU",
    "mEvaluationPricePU",
    "mExciseAC",
    "mExciseFC",
    "mExciseTC",
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
    "mfas",
    "mFinallyPriceAC",
    "mFinallyPriceTC",
    "mFreeReason",
    "mFreeType",
    "mHaveCountCostMnyFC",
    "mHaveCountCostQtyCU",
    "mid",
    "mInnerBalancePrice",
    "mInvDisabledTime",
    "mInvLot",
    "mInvLotCode",
    "mInvLotEnableDate",
    "mInvLotValidDate",
    "mIsAllotTOMo",
    "mIsAssociatedChild",
    "mIsEditSeiBan",
    "mIsEvaluationChangeable",
    "mIsInFlowFlag",
    "mIsItemVerFromSrcDoc",
    "mIsKitWholeSet",
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
    "mIsUrgencyAccept",
    "mIsZeroCost",
    "mItemDealMode",
    "mItemInfo",
    "mkitRcvMode",
    "mKitParentLine",
    "mlcMnyAC",
    "mlcMnyFC",
    "mlcMnyTC",
    "mlcQtyCU",
    "mlcQtyPU",
    "mlcQtySU",
    "mlcQtyTBU",
    "mlcQtyTU",
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
    "mMaterialCostAC",
    "mMaterialCostFC",
    "mMaterialCostTC",
    "mMemo",
    "mMfc",
    "mMfcCostAC",
    "mMfcCostFC",
    "mMfcCostTC",
    "mMnyBudgetProject",
    "mModifiedBy",
    "mModifiedOn",
    "mNetOrderPrice",
    "mNextWPKey",
    "mNextWPNo",
    "mNoLCMnyAC",
    "mNoLCMnyFC",
    "mNoLCMnyTC",
    "mNoLCQtyCU",
    "mNoLCQtyPU",
    "mNoLCQtySU",
    "mNoLCQtyTBU",
    "mNoLCQtyTU",
    "mNofityMessage",
    "mobaReceivementDTO",
    "mouToOBURate",
    "mOrderPriceAC",
    "mOrderPriceTC",
    "mOriginalItemBaseUom",
    "mOriginalItemCode",
    "mOriginalItemQty",
    "mOriginalItemQtyBaseUom",
    "mOriginalItemUom",
    "mOutStoreActualCost",
    "mOwnMaterialMnyAC",
    "mOwnMaterialMnyFC",
    "mOwnMaterialMnyTC",
    "mOwnOrg",
    "mpoLot",
    "mpoLotCode",
    "mpuToPBURate",
    "mPartnerMaterialMnyAC",
    "mPartnerMaterialMnyFC",
    "mPartnerMaterialMnyTC",
    "mPayer",
    "mPayerSite",
    "mPaymentBill",
    "mPaymentBillLine",
    "mPaymentBillLineNo",
    "mPaymentBillNo",
    "mPaymentTerm",
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
    "mPrePayQtyPU",
    "mPrePayQtyTBU",
    "mPrePayQtyTU",
    "mPreWPKey",
    "mPreWPNo",
    "mPrepayPolicy",
    "mPriceBaseUOM",
    "mPriceDifferenceAC",
    "mPriceDifferenceFC",
    "mPriceDifferenceTC",
    "mPriceList",
    "mPriceListCode",
    "mPriceSource",
    "mPriceUOM",
    "mProcessArriveQty",
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
    "mProcessSubUOM",
    "mProcessUOM",
    "mProcessUToSURate",
    "mProcessUnqualifiedQty",
    "mProductLineDate",
    "mProductLineKey",
    "mProductLineNo",
    "mProject",
    "mPurCostAC",
    "mPurCostFC",
    "mPurCostTC",
    "mPurDept",
    "mPurOper",
    "mPurOrg",
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
    "mrcvToRMAType",
    "mrmaTransType",
    "mrmaType",
    "mRcvAddress",
    "mRcvBoxes",
    "mRcvBy",
    "mRcvContacts",
    "mRcvDept",
    "mRcvDiscount",
    "mRcvFees",
    "mRcvLineAllotMOs",
    "mRcvLineBalanceRoutes",
    "mRcvLineCosts",
    "mRcvLineDispenses",
    "mRcvLineLocations",
    "mRcvLot",
    "mRcvLotCode",
    "mRcvProcedure",
    "mRcvQtyCU",
    "mRcvQtyPU",
    "mRcvQtySU",
    "mRcvQtyTBU",
    "mRcvQtyTU",
    "mRcvSubLines",
    "mRcvTaxs",
    "mReceivement",
    "mRefillUseQtyTBU",
    "mRefillUseQtyTU",
    "mRejectMnyAC",
    "mRejectMnyFC",
    "mRejectMnyTC",
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
    "mRequireDept",
    "mRequireMan",
    "mRequireOrg",
    "mReturnSupplier",
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
    "mRtnFillQtyCU",
    "mRtnFillQtyPU",
    "mRtnFillQtySU",
    "mRtnFillQtyTBU",
    "mRtnFillQtyTU",
    "mRtnReason",
    "msnList",
    "mso",
    "msuToCURate",
    "msuToSBURate",
    "mSeiBan",
    "mShipLineID",
    "mShipToSite",
    "mSnCode",
    "mSplitFlag",
    "mSplitRcvLine",
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
    "mSrcSubLine",
    "mSrcSysVersion",
    "mStandardPriceAC",
    "mStandardPriceFC",
    "mStandardPriceTC",
    "mStorageType",
    "mStoreBaseUOM",
    "mStoreUOM",
    "mSubContractCostAC",
    "mSubContractCostFC",
    "mSubContractCostTC",
    "mSubmitChectTime",
    "mSumDispenseLineUsedMnyAC",
    "mSumDispenseLineUsedNetMnyAC",
    "mSumDispenseLineUsedTaxAC",
    "mSumDispenseQtyAU",
    "mSupplierDisabledTime",
    "mSupplierItemCode",
    "mSupplierItemName",
    "mSupplierLotCode",
    "mSysPriceAC",
    "mSysPriceTC",
    "mSysVersion",
    "mtbMainUOM",
    "mtbMainUOMToSubUOM",
    "mtbSubUOM",
    "mtbuToCBURate",
    "mtbuToPBURate",
    "mtbuToSBURate",
    "mtcToACExchRate",
    "mtcToACExchRateRound",
    "mtuToTBURate",
    "mTask",
    "mTaskOutput",
    "mTaxRate",
    "mTaxSchedule",
    "mTaxType",
    "mTotalMnyAC",
    "mTotalMnyFC",
    "mTotalMnyTC",
    "mTotalNetMnyAC",
    "mTotalNetMnyFC",
    "mTotalNetMnyTC",
    "mTotalTaxAC",
    "mTotalTaxFC",
    "mTotalTaxTC",
    "mTradeBaseUOM",
    "mTradeUOM",
    "mUnqualifiedQtyCU",
    "mUnqualifiedQtyPU",
    "mUnqualifiedQtySU",
    "mUnqualifiedQtyTBU",
    "mUnqualifiedQtyTU",
    "mUsageQty",
    "mvatac",
    "mvatfc",
    "mvattc",
    "mVolume",
    "mVolumeUom",
    "mwpKey",
    "mwpNo",
    "mWeight",
    "mWeightUom",
    "mWh",
    "mWhMan"
})
public class UFIDAU9ISVRCVDTOOBARcvLineDTOData
    extends UFSoftUBFBusinessDataTransObjectBase
{

    @XmlElementRef(name = "Multi_PrePayBillNo", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<MultiLangDataDict> multiPrePayBillNo;
    @XmlElementRef(name = "Multi_PriceListName", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<MultiLangDataDict> multiPriceListName;
    @XmlElementRef(name = "Multi_SONo", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<MultiLangDataDict> multiSONo;
    @XmlElement(name = "OriginalItem")
    protected Long originalItem;
    @XmlElementRef(name = "OriginalItem_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> originalItemSKey;
    @XmlElementRef(name = "PrePayBillNo", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> prePayBillNo;
    @XmlElementRef(name = "PriceListName", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> priceListName;
    @XmlElementRef(name = "SONo", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> soNo;
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
    @XmlElementRef(name = "m_accountOrg", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9PMDTOsBESimp4UIDTOData> mAccountOrg;
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
    @XmlElementRef(name = "m_associatedParent", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9PMDTOsBESimp4UIDTOData> mAssociatedParent;
    @XmlElement(name = "m_associatedParentLine")
    protected Long mAssociatedParentLine;
    @XmlElement(name = "m_associatedParentLineNo")
    protected Long mAssociatedParentLineNo;
    @XmlElement(name = "m_bOMID")
    protected Long mbomid;
    @XmlElementRef(name = "m_bOMLineNo", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mbomLineNo;
    @XmlElementRef(name = "m_bOMUOM", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9PMDTOsBESimp4UIDTOData> mbomuom;
    @XmlElementRef(name = "m_balanceCurrency", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9PMDTOsBESimp4UIDTOData> mBalanceCurrency;
    @XmlElementRef(name = "m_balanceRoute", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9PMDTOsBESimp4UIDTOData> mBalanceRoute;
    @XmlElementRef(name = "m_balanceRouteDesc", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mBalanceRouteDesc;
    @XmlElementRef(name = "m_billSetCode", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mBillSetCode;
    @XmlElementRef(name = "m_billToSite", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9CBOSCMSupplierSupplierSiteMISCInfoData> mBillToSite;
    @XmlElementRef(name = "m_bizBudgetProject", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9PMDTOsBESimp4UIDTOData> mBizBudgetProject;
    @XmlElement(name = "m_cUToCBURate")
    protected BigDecimal mcuToCBURate;
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
    @XmlElementRef(name = "m_configResultOrg", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9PMDTOsBESimp4UIDTOData> mConfigResultOrg;
    @XmlElementRef(name = "m_confirmAccording", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9PMDTOsBESimp4UIDTOData> mConfirmAccording;
    @XmlElement(name = "m_confirmDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mConfirmDate;
    @XmlElement(name = "m_confirmMode")
    protected Integer mConfirmMode;
    @XmlElementRef(name = "m_confirmSupplier", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9CBOSCMSupplierSupplierMISCInfoData> mConfirmSupplier;
    @XmlElementRef(name = "m_confirmTerm", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9PMDTOsBESimp4UIDTOData> mConfirmTerm;
    @XmlElementRef(name = "m_container", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mContainer;
    @XmlElementRef(name = "m_costBaseUOM", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9PMDTOsBESimp4UIDTOData> mCostBaseUOM;
    @XmlElement(name = "m_costPercent")
    protected BigDecimal mCostPercent;
    @XmlElementRef(name = "m_costUOM", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9PMDTOsBESimp4UIDTOData> mCostUOM;
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
    @XmlElement(name = "m_customAC")
    protected BigDecimal mCustomAC;
    @XmlElement(name = "m_customFC")
    protected BigDecimal mCustomFC;
    @XmlElement(name = "m_customTC")
    protected BigDecimal mCustomTC;
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
    @XmlElement(name = "m_damageQtyTU")
    protected BigDecimal mDamageQtyTU;
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
    @XmlElement(name = "m_docLineNo")
    protected Integer mDocLineNo;
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
    @XmlElement(name = "m_exciseAC")
    protected BigDecimal mExciseAC;
    @XmlElement(name = "m_exciseFC")
    protected BigDecimal mExciseFC;
    @XmlElement(name = "m_exciseTC")
    protected BigDecimal mExciseTC;
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
    @XmlElementRef(name = "m_fAS", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9PMDTOsBESimp4UIDTOData> mfas;
    @XmlElement(name = "m_finallyPriceAC")
    protected BigDecimal mFinallyPriceAC;
    @XmlElement(name = "m_finallyPriceTC")
    protected BigDecimal mFinallyPriceTC;
    @XmlElement(name = "m_freeReason")
    protected Integer mFreeReason;
    @XmlElement(name = "m_freeType")
    protected Integer mFreeType;
    @XmlElement(name = "m_haveCountCostMnyFC")
    protected BigDecimal mHaveCountCostMnyFC;
    @XmlElement(name = "m_haveCountCostQtyCU")
    protected BigDecimal mHaveCountCostQtyCU;
    @XmlElement(name = "m_iD")
    protected Long mid;
    @XmlElement(name = "m_innerBalancePrice")
    protected BigDecimal mInnerBalancePrice;
    @XmlElement(name = "m_invDisabledTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mInvDisabledTime;
    @XmlElement(name = "m_invLot")
    protected Long mInvLot;
    @XmlElementRef(name = "m_invLotCode", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mInvLotCode;
    @XmlElement(name = "m_invLotEnableDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mInvLotEnableDate;
    @XmlElement(name = "m_invLotValidDate")
    protected Integer mInvLotValidDate;
    @XmlElement(name = "m_isAllotTOMo")
    protected Boolean mIsAllotTOMo;
    @XmlElement(name = "m_isAssociatedChild")
    protected Boolean mIsAssociatedChild;
    @XmlElement(name = "m_isEditSeiBan")
    protected Boolean mIsEditSeiBan;
    @XmlElement(name = "m_isEvaluationChangeable")
    protected Boolean mIsEvaluationChangeable;
    @XmlElement(name = "m_isInFlowFlag")
    protected Boolean mIsInFlowFlag;
    @XmlElement(name = "m_isItemVerFromSrcDoc")
    protected Boolean mIsItemVerFromSrcDoc;
    @XmlElement(name = "m_isKitWholeSet")
    protected Boolean mIsKitWholeSet;
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
    @XmlElement(name = "m_lCMnyAC")
    protected BigDecimal mlcMnyAC;
    @XmlElement(name = "m_lCMnyFC")
    protected BigDecimal mlcMnyFC;
    @XmlElement(name = "m_lCMnyTC")
    protected BigDecimal mlcMnyTC;
    @XmlElement(name = "m_lCQtyCU")
    protected BigDecimal mlcQtyCU;
    @XmlElement(name = "m_lCQtyPU")
    protected BigDecimal mlcQtyPU;
    @XmlElement(name = "m_lCQtySU")
    protected BigDecimal mlcQtySU;
    @XmlElement(name = "m_lCQtyTBU")
    protected BigDecimal mlcQtyTBU;
    @XmlElement(name = "m_lCQtyTU")
    protected BigDecimal mlcQtyTU;
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
    @XmlElement(name = "m_materialCostAC")
    protected BigDecimal mMaterialCostAC;
    @XmlElement(name = "m_materialCostFC")
    protected BigDecimal mMaterialCostFC;
    @XmlElement(name = "m_materialCostTC")
    protected BigDecimal mMaterialCostTC;
    @XmlElementRef(name = "m_memo", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mMemo;
    @XmlElementRef(name = "m_mfc", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9CBOSCMSupplierSupplierMISCInfoData> mMfc;
    @XmlElement(name = "m_mfcCostAC")
    protected BigDecimal mMfcCostAC;
    @XmlElement(name = "m_mfcCostFC")
    protected BigDecimal mMfcCostFC;
    @XmlElement(name = "m_mfcCostTC")
    protected BigDecimal mMfcCostTC;
    @XmlElementRef(name = "m_mnyBudgetProject", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9PMDTOsBESimp4UIDTOData> mMnyBudgetProject;
    @XmlElementRef(name = "m_modifiedBy", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mModifiedBy;
    @XmlElement(name = "m_modifiedOn")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mModifiedOn;
    @XmlElement(name = "m_netOrderPrice")
    protected BigDecimal mNetOrderPrice;
    @XmlElementRef(name = "m_nextWPKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9BasePropertyTypesBizEntityKeyData> mNextWPKey;
    @XmlElementRef(name = "m_nextWPNo", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mNextWPNo;
    @XmlElement(name = "m_noLCMnyAC")
    protected BigDecimal mNoLCMnyAC;
    @XmlElement(name = "m_noLCMnyFC")
    protected BigDecimal mNoLCMnyFC;
    @XmlElement(name = "m_noLCMnyTC")
    protected BigDecimal mNoLCMnyTC;
    @XmlElement(name = "m_noLCQtyCU")
    protected BigDecimal mNoLCQtyCU;
    @XmlElement(name = "m_noLCQtyPU")
    protected BigDecimal mNoLCQtyPU;
    @XmlElement(name = "m_noLCQtySU")
    protected BigDecimal mNoLCQtySU;
    @XmlElement(name = "m_noLCQtyTBU")
    protected BigDecimal mNoLCQtyTBU;
    @XmlElement(name = "m_noLCQtyTU")
    protected BigDecimal mNoLCQtyTU;
    @XmlElementRef(name = "m_nofityMessage", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mNofityMessage;
    @XmlElementRef(name = "m_oBAReceivementDTO", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9ISVRCVDTOOBAReceivementDTOData> mobaReceivementDTO;
    @XmlElement(name = "m_oUToOBURate")
    protected BigDecimal mouToOBURate;
    @XmlElement(name = "m_orderPriceAC")
    protected BigDecimal mOrderPriceAC;
    @XmlElement(name = "m_orderPriceTC")
    protected BigDecimal mOrderPriceTC;
    @XmlElementRef(name = "m_originalItemBaseUom", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9PMDTOsBESimp4UIDTOData> mOriginalItemBaseUom;
    @XmlElementRef(name = "m_originalItemCode", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mOriginalItemCode;
    @XmlElement(name = "m_originalItemQty")
    protected BigDecimal mOriginalItemQty;
    @XmlElement(name = "m_originalItemQtyBaseUom")
    protected BigDecimal mOriginalItemQtyBaseUom;
    @XmlElementRef(name = "m_originalItemUom", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9PMDTOsBESimp4UIDTOData> mOriginalItemUom;
    @XmlElement(name = "m_outStoreActualCost")
    protected Boolean mOutStoreActualCost;
    @XmlElement(name = "m_ownMaterialMnyAC")
    protected BigDecimal mOwnMaterialMnyAC;
    @XmlElement(name = "m_ownMaterialMnyFC")
    protected BigDecimal mOwnMaterialMnyFC;
    @XmlElement(name = "m_ownMaterialMnyTC")
    protected BigDecimal mOwnMaterialMnyTC;
    @XmlElementRef(name = "m_ownOrg", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9PMDTOsBESimp4UIDTOData> mOwnOrg;
    @XmlElement(name = "m_pOLot")
    protected Long mpoLot;
    @XmlElementRef(name = "m_pOLotCode", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mpoLotCode;
    @XmlElement(name = "m_pUToPBURate")
    protected BigDecimal mpuToPBURate;
    @XmlElement(name = "m_partnerMaterialMnyAC")
    protected BigDecimal mPartnerMaterialMnyAC;
    @XmlElement(name = "m_partnerMaterialMnyFC")
    protected BigDecimal mPartnerMaterialMnyFC;
    @XmlElement(name = "m_partnerMaterialMnyTC")
    protected BigDecimal mPartnerMaterialMnyTC;
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
    @XmlElementRef(name = "m_paymentTerm", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9PMDTOsBESimp4UIDTOData> mPaymentTerm;
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
    @XmlElementRef(name = "m_prepayPolicy", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9PMDTOsBESimp4UIDTOData> mPrepayPolicy;
    @XmlElementRef(name = "m_priceBaseUOM", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9PMDTOsBESimp4UIDTOData> mPriceBaseUOM;
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
    @XmlElementRef(name = "m_priceUOM", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9PMDTOsBESimp4UIDTOData> mPriceUOM;
    @XmlElement(name = "m_processArriveQty")
    protected BigDecimal mProcessArriveQty;
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
    @XmlElementRef(name = "m_processSubUOM", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9PMDTOsBESimp4UIDTOData> mProcessSubUOM;
    @XmlElementRef(name = "m_processUOM", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9PMDTOsBESimp4UIDTOData> mProcessUOM;
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
    @XmlElementRef(name = "m_project", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9PMDTOsBESimp4UIDTOData> mProject;
    @XmlElement(name = "m_purCostAC")
    protected BigDecimal mPurCostAC;
    @XmlElement(name = "m_purCostFC")
    protected BigDecimal mPurCostFC;
    @XmlElement(name = "m_purCostTC")
    protected BigDecimal mPurCostTC;
    @XmlElementRef(name = "m_purDept", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9PMDTOsBESimp4UIDTOData> mPurDept;
    @XmlElementRef(name = "m_purOper", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9PMDTOsBESimp4UIDTOData> mPurOper;
    @XmlElementRef(name = "m_purOrg", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9PMDTOsBESimp4UIDTOData> mPurOrg;
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
    @XmlElement(name = "m_rCVToRMAType")
    protected Integer mrcvToRMAType;
    @XmlElement(name = "m_rMATransType")
    protected Integer mrmaTransType;
    @XmlElement(name = "m_rMAType")
    protected Integer mrmaType;
    @XmlElementRef(name = "m_rcvAddress", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfUFIDAU9ISVRCVDTOOBARcvAddressDTOData> mRcvAddress;
    @XmlElement(name = "m_rcvBoxes")
    protected BigDecimal mRcvBoxes;
    @XmlElementRef(name = "m_rcvBy", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9PMDTOsBESimp4UIDTOData> mRcvBy;
    @XmlElementRef(name = "m_rcvContacts", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfUFIDAU9ISVRCVDTOOBARcvContactDTOData> mRcvContacts;
    @XmlElementRef(name = "m_rcvDept", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9PMDTOsBESimp4UIDTOData> mRcvDept;
    @XmlElementRef(name = "m_rcvDiscount", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfUFIDAU9ISVRCVDTOOBARcvDiscountDTOData> mRcvDiscount;
    @XmlElementRef(name = "m_rcvFees", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfUFIDAU9ISVRCVDTOOBARcvFeeDTOData> mRcvFees;
    @XmlElementRef(name = "m_rcvLineAllotMOs", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfUFIDAU9ISVRCVDTOOBARcvLineAllotMODTOData> mRcvLineAllotMOs;
    @XmlElementRef(name = "m_rcvLineBalanceRoutes", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfUFIDAU9ISVRCVDTOOBARcvLineBalanceRouteDTOData> mRcvLineBalanceRoutes;
    @XmlElementRef(name = "m_rcvLineCosts", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfUFIDAU9ISVRCVDTOOBARcvLineCostDTOData> mRcvLineCosts;
    @XmlElementRef(name = "m_rcvLineDispenses", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfUFIDAU9ISVRCVDTOOBARcvLineDispenseDTOData> mRcvLineDispenses;
    @XmlElementRef(name = "m_rcvLineLocations", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfUFIDAU9ISVRCVDTOOBARcvLineLocationDTOData> mRcvLineLocations;
    @XmlElement(name = "m_rcvLot")
    protected Long mRcvLot;
    @XmlElementRef(name = "m_rcvLotCode", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mRcvLotCode;
    @XmlElement(name = "m_rcvProcedure")
    protected Integer mRcvProcedure;
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
    @XmlElementRef(name = "m_rcvSubLines", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfUFIDAU9ISVRCVDTOOBARcvSubLineDTOData> mRcvSubLines;
    @XmlElementRef(name = "m_rcvTaxs", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfUFIDAU9ISVRCVDTOOBARcvTaxDTOData> mRcvTaxs;
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
    @XmlElementRef(name = "m_requireDept", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9PMDTOsBESimp4UIDTOData> mRequireDept;
    @XmlElementRef(name = "m_requireMan", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9PMDTOsBESimp4UIDTOData> mRequireMan;
    @XmlElementRef(name = "m_requireOrg", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9PMDTOsBESimp4UIDTOData> mRequireOrg;
    @XmlElementRef(name = "m_returnSupplier", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9CBOSCMSupplierSupplierMISCInfoData> mReturnSupplier;
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
    @XmlElementRef(name = "m_rtnReason", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9PMRtnRtnReasonData> mRtnReason;
    @XmlElementRef(name = "m_sNList", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfstring> msnList;
    @XmlElement(name = "m_sO")
    protected Long mso;
    @XmlElement(name = "m_sUToCURate")
    protected BigDecimal msuToCURate;
    @XmlElement(name = "m_sUToSBURate")
    protected BigDecimal msuToSBURate;
    @XmlElementRef(name = "m_seiBan", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9PMDTOsBESimp4UIDTOData> mSeiBan;
    @XmlElement(name = "m_shipLineID")
    protected Long mShipLineID;
    @XmlElementRef(name = "m_shipToSite", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9CBOSCMSupplierSupplierSiteMISCInfoData> mShipToSite;
    @XmlElementRef(name = "m_snCode", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mSnCode;
    @XmlElement(name = "m_splitFlag")
    protected Integer mSplitFlag;
    @XmlElement(name = "m_splitRcvLine")
    protected Long mSplitRcvLine;
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
    @XmlElement(name = "m_storageType")
    protected Integer mStorageType;
    @XmlElementRef(name = "m_storeBaseUOM", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9PMDTOsBESimp4UIDTOData> mStoreBaseUOM;
    @XmlElementRef(name = "m_storeUOM", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9PMDTOsBESimp4UIDTOData> mStoreUOM;
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
    @XmlElementRef(name = "m_tBMainUOM", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9PMDTOsBESimp4UIDTOData> mtbMainUOM;
    @XmlElement(name = "m_tBMainUOMToSubUOM")
    protected BigDecimal mtbMainUOMToSubUOM;
    @XmlElementRef(name = "m_tBSubUOM", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9PMDTOsBESimp4UIDTOData> mtbSubUOM;
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
    @XmlElementRef(name = "m_task", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9PMDTOsBESimp4UIDTOData> mTask;
    @XmlElement(name = "m_taskOutput")
    protected Long mTaskOutput;
    @XmlElement(name = "m_taxRate")
    protected BigDecimal mTaxRate;
    @XmlElementRef(name = "m_taxSchedule", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9PMDTOsBESimp4UIDTOData> mTaxSchedule;
    @XmlElement(name = "m_taxType")
    protected Integer mTaxType;
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
    @XmlElement(name = "m_totalTaxAC")
    protected BigDecimal mTotalTaxAC;
    @XmlElement(name = "m_totalTaxFC")
    protected BigDecimal mTotalTaxFC;
    @XmlElement(name = "m_totalTaxTC")
    protected BigDecimal mTotalTaxTC;
    @XmlElementRef(name = "m_tradeBaseUOM", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9PMDTOsBESimp4UIDTOData> mTradeBaseUOM;
    @XmlElementRef(name = "m_tradeUOM", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9PMDTOsBESimp4UIDTOData> mTradeUOM;
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
    @XmlElement(name = "m_vATAC")
    protected BigDecimal mvatac;
    @XmlElement(name = "m_vATFC")
    protected BigDecimal mvatfc;
    @XmlElement(name = "m_vATTC")
    protected BigDecimal mvattc;
    @XmlElement(name = "m_volume")
    protected BigDecimal mVolume;
    @XmlElementRef(name = "m_volumeUom", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9PMDTOsBESimp4UIDTOData> mVolumeUom;
    @XmlElementRef(name = "m_wPKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9BasePropertyTypesBizEntityKeyData> mwpKey;
    @XmlElementRef(name = "m_wPNo", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mwpNo;
    @XmlElement(name = "m_weight")
    protected BigDecimal mWeight;
    @XmlElementRef(name = "m_weightUom", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9PMDTOsBESimp4UIDTOData> mWeightUom;
    @XmlElementRef(name = "m_wh", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9PMDTOsBESimp4UIDTOData> mWh;
    @XmlElementRef(name = "m_whMan", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9PMDTOsBESimp4UIDTOData> mWhMan;

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
     * 获取mAccountOrg属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9PMDTOsBESimp4UIDTOData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9PMDTOsBESimp4UIDTOData> getMAccountOrg() {
        return mAccountOrg;
    }

    /**
     * 设置mAccountOrg属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9PMDTOsBESimp4UIDTOData }{@code >}
     *     
     */
    public void setMAccountOrg(JAXBElement<UFIDAU9PMDTOsBESimp4UIDTOData> value) {
        this.mAccountOrg = value;
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
     * 获取mAssociatedParent属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9PMDTOsBESimp4UIDTOData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9PMDTOsBESimp4UIDTOData> getMAssociatedParent() {
        return mAssociatedParent;
    }

    /**
     * 设置mAssociatedParent属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9PMDTOsBESimp4UIDTOData }{@code >}
     *     
     */
    public void setMAssociatedParent(JAXBElement<UFIDAU9PMDTOsBESimp4UIDTOData> value) {
        this.mAssociatedParent = value;
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
     * 获取mbomuom属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9PMDTOsBESimp4UIDTOData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9PMDTOsBESimp4UIDTOData> getMBOMUOM() {
        return mbomuom;
    }

    /**
     * 设置mbomuom属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9PMDTOsBESimp4UIDTOData }{@code >}
     *     
     */
    public void setMBOMUOM(JAXBElement<UFIDAU9PMDTOsBESimp4UIDTOData> value) {
        this.mbomuom = value;
    }

    /**
     * 获取mBalanceCurrency属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9PMDTOsBESimp4UIDTOData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9PMDTOsBESimp4UIDTOData> getMBalanceCurrency() {
        return mBalanceCurrency;
    }

    /**
     * 设置mBalanceCurrency属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9PMDTOsBESimp4UIDTOData }{@code >}
     *     
     */
    public void setMBalanceCurrency(JAXBElement<UFIDAU9PMDTOsBESimp4UIDTOData> value) {
        this.mBalanceCurrency = value;
    }

    /**
     * 获取mBalanceRoute属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9PMDTOsBESimp4UIDTOData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9PMDTOsBESimp4UIDTOData> getMBalanceRoute() {
        return mBalanceRoute;
    }

    /**
     * 设置mBalanceRoute属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9PMDTOsBESimp4UIDTOData }{@code >}
     *     
     */
    public void setMBalanceRoute(JAXBElement<UFIDAU9PMDTOsBESimp4UIDTOData> value) {
        this.mBalanceRoute = value;
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
     * 获取mBizBudgetProject属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9PMDTOsBESimp4UIDTOData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9PMDTOsBESimp4UIDTOData> getMBizBudgetProject() {
        return mBizBudgetProject;
    }

    /**
     * 设置mBizBudgetProject属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9PMDTOsBESimp4UIDTOData }{@code >}
     *     
     */
    public void setMBizBudgetProject(JAXBElement<UFIDAU9PMDTOsBESimp4UIDTOData> value) {
        this.mBizBudgetProject = value;
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
     * 获取mConfigResultOrg属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9PMDTOsBESimp4UIDTOData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9PMDTOsBESimp4UIDTOData> getMConfigResultOrg() {
        return mConfigResultOrg;
    }

    /**
     * 设置mConfigResultOrg属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9PMDTOsBESimp4UIDTOData }{@code >}
     *     
     */
    public void setMConfigResultOrg(JAXBElement<UFIDAU9PMDTOsBESimp4UIDTOData> value) {
        this.mConfigResultOrg = value;
    }

    /**
     * 获取mConfirmAccording属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9PMDTOsBESimp4UIDTOData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9PMDTOsBESimp4UIDTOData> getMConfirmAccording() {
        return mConfirmAccording;
    }

    /**
     * 设置mConfirmAccording属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9PMDTOsBESimp4UIDTOData }{@code >}
     *     
     */
    public void setMConfirmAccording(JAXBElement<UFIDAU9PMDTOsBESimp4UIDTOData> value) {
        this.mConfirmAccording = value;
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
     * 获取mConfirmTerm属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9PMDTOsBESimp4UIDTOData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9PMDTOsBESimp4UIDTOData> getMConfirmTerm() {
        return mConfirmTerm;
    }

    /**
     * 设置mConfirmTerm属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9PMDTOsBESimp4UIDTOData }{@code >}
     *     
     */
    public void setMConfirmTerm(JAXBElement<UFIDAU9PMDTOsBESimp4UIDTOData> value) {
        this.mConfirmTerm = value;
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
     * 获取mCostBaseUOM属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9PMDTOsBESimp4UIDTOData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9PMDTOsBESimp4UIDTOData> getMCostBaseUOM() {
        return mCostBaseUOM;
    }

    /**
     * 设置mCostBaseUOM属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9PMDTOsBESimp4UIDTOData }{@code >}
     *     
     */
    public void setMCostBaseUOM(JAXBElement<UFIDAU9PMDTOsBESimp4UIDTOData> value) {
        this.mCostBaseUOM = value;
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
     * 获取mCostUOM属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9PMDTOsBESimp4UIDTOData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9PMDTOsBESimp4UIDTOData> getMCostUOM() {
        return mCostUOM;
    }

    /**
     * 设置mCostUOM属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9PMDTOsBESimp4UIDTOData }{@code >}
     *     
     */
    public void setMCostUOM(JAXBElement<UFIDAU9PMDTOsBESimp4UIDTOData> value) {
        this.mCostUOM = value;
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
     * 获取mCustomAC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMCustomAC() {
        return mCustomAC;
    }

    /**
     * 设置mCustomAC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMCustomAC(BigDecimal value) {
        this.mCustomAC = value;
    }

    /**
     * 获取mCustomFC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMCustomFC() {
        return mCustomFC;
    }

    /**
     * 设置mCustomFC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMCustomFC(BigDecimal value) {
        this.mCustomFC = value;
    }

    /**
     * 获取mCustomTC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMCustomTC() {
        return mCustomTC;
    }

    /**
     * 设置mCustomTC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMCustomTC(BigDecimal value) {
        this.mCustomTC = value;
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
     * 获取mDamageQtyTU属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMDamageQtyTU() {
        return mDamageQtyTU;
    }

    /**
     * 设置mDamageQtyTU属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMDamageQtyTU(BigDecimal value) {
        this.mDamageQtyTU = value;
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
     * 获取mExciseAC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMExciseAC() {
        return mExciseAC;
    }

    /**
     * 设置mExciseAC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMExciseAC(BigDecimal value) {
        this.mExciseAC = value;
    }

    /**
     * 获取mExciseFC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMExciseFC() {
        return mExciseFC;
    }

    /**
     * 设置mExciseFC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMExciseFC(BigDecimal value) {
        this.mExciseFC = value;
    }

    /**
     * 获取mExciseTC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMExciseTC() {
        return mExciseTC;
    }

    /**
     * 设置mExciseTC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMExciseTC(BigDecimal value) {
        this.mExciseTC = value;
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
     * 获取mfas属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9PMDTOsBESimp4UIDTOData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9PMDTOsBESimp4UIDTOData> getMFAS() {
        return mfas;
    }

    /**
     * 设置mfas属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9PMDTOsBESimp4UIDTOData }{@code >}
     *     
     */
    public void setMFAS(JAXBElement<UFIDAU9PMDTOsBESimp4UIDTOData> value) {
        this.mfas = value;
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
     * 获取mInvLot属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMInvLot() {
        return mInvLot;
    }

    /**
     * 设置mInvLot属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMInvLot(Long value) {
        this.mInvLot = value;
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
     * 获取mlcMnyAC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMLCMnyAC() {
        return mlcMnyAC;
    }

    /**
     * 设置mlcMnyAC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMLCMnyAC(BigDecimal value) {
        this.mlcMnyAC = value;
    }

    /**
     * 获取mlcMnyFC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMLCMnyFC() {
        return mlcMnyFC;
    }

    /**
     * 设置mlcMnyFC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMLCMnyFC(BigDecimal value) {
        this.mlcMnyFC = value;
    }

    /**
     * 获取mlcMnyTC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMLCMnyTC() {
        return mlcMnyTC;
    }

    /**
     * 设置mlcMnyTC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMLCMnyTC(BigDecimal value) {
        this.mlcMnyTC = value;
    }

    /**
     * 获取mlcQtyCU属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMLCQtyCU() {
        return mlcQtyCU;
    }

    /**
     * 设置mlcQtyCU属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMLCQtyCU(BigDecimal value) {
        this.mlcQtyCU = value;
    }

    /**
     * 获取mlcQtyPU属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMLCQtyPU() {
        return mlcQtyPU;
    }

    /**
     * 设置mlcQtyPU属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMLCQtyPU(BigDecimal value) {
        this.mlcQtyPU = value;
    }

    /**
     * 获取mlcQtySU属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMLCQtySU() {
        return mlcQtySU;
    }

    /**
     * 设置mlcQtySU属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMLCQtySU(BigDecimal value) {
        this.mlcQtySU = value;
    }

    /**
     * 获取mlcQtyTBU属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMLCQtyTBU() {
        return mlcQtyTBU;
    }

    /**
     * 设置mlcQtyTBU属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMLCQtyTBU(BigDecimal value) {
        this.mlcQtyTBU = value;
    }

    /**
     * 获取mlcQtyTU属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMLCQtyTU() {
        return mlcQtyTU;
    }

    /**
     * 设置mlcQtyTU属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMLCQtyTU(BigDecimal value) {
        this.mlcQtyTU = value;
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
     * 获取mMemo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMMemo() {
        return mMemo;
    }

    /**
     * 设置mMemo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMMemo(JAXBElement<String> value) {
        this.mMemo = value;
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
     * 获取mMnyBudgetProject属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9PMDTOsBESimp4UIDTOData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9PMDTOsBESimp4UIDTOData> getMMnyBudgetProject() {
        return mMnyBudgetProject;
    }

    /**
     * 设置mMnyBudgetProject属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9PMDTOsBESimp4UIDTOData }{@code >}
     *     
     */
    public void setMMnyBudgetProject(JAXBElement<UFIDAU9PMDTOsBESimp4UIDTOData> value) {
        this.mMnyBudgetProject = value;
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
     * 获取mNoLCMnyAC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMNoLCMnyAC() {
        return mNoLCMnyAC;
    }

    /**
     * 设置mNoLCMnyAC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMNoLCMnyAC(BigDecimal value) {
        this.mNoLCMnyAC = value;
    }

    /**
     * 获取mNoLCMnyFC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMNoLCMnyFC() {
        return mNoLCMnyFC;
    }

    /**
     * 设置mNoLCMnyFC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMNoLCMnyFC(BigDecimal value) {
        this.mNoLCMnyFC = value;
    }

    /**
     * 获取mNoLCMnyTC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMNoLCMnyTC() {
        return mNoLCMnyTC;
    }

    /**
     * 设置mNoLCMnyTC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMNoLCMnyTC(BigDecimal value) {
        this.mNoLCMnyTC = value;
    }

    /**
     * 获取mNoLCQtyCU属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMNoLCQtyCU() {
        return mNoLCQtyCU;
    }

    /**
     * 设置mNoLCQtyCU属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMNoLCQtyCU(BigDecimal value) {
        this.mNoLCQtyCU = value;
    }

    /**
     * 获取mNoLCQtyPU属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMNoLCQtyPU() {
        return mNoLCQtyPU;
    }

    /**
     * 设置mNoLCQtyPU属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMNoLCQtyPU(BigDecimal value) {
        this.mNoLCQtyPU = value;
    }

    /**
     * 获取mNoLCQtySU属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMNoLCQtySU() {
        return mNoLCQtySU;
    }

    /**
     * 设置mNoLCQtySU属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMNoLCQtySU(BigDecimal value) {
        this.mNoLCQtySU = value;
    }

    /**
     * 获取mNoLCQtyTBU属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMNoLCQtyTBU() {
        return mNoLCQtyTBU;
    }

    /**
     * 设置mNoLCQtyTBU属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMNoLCQtyTBU(BigDecimal value) {
        this.mNoLCQtyTBU = value;
    }

    /**
     * 获取mNoLCQtyTU属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMNoLCQtyTU() {
        return mNoLCQtyTU;
    }

    /**
     * 设置mNoLCQtyTU属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMNoLCQtyTU(BigDecimal value) {
        this.mNoLCQtyTU = value;
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
     * 获取mobaReceivementDTO属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9ISVRCVDTOOBAReceivementDTOData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9ISVRCVDTOOBAReceivementDTOData> getMOBAReceivementDTO() {
        return mobaReceivementDTO;
    }

    /**
     * 设置mobaReceivementDTO属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9ISVRCVDTOOBAReceivementDTOData }{@code >}
     *     
     */
    public void setMOBAReceivementDTO(JAXBElement<UFIDAU9ISVRCVDTOOBAReceivementDTOData> value) {
        this.mobaReceivementDTO = value;
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
     * 获取mOriginalItemBaseUom属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9PMDTOsBESimp4UIDTOData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9PMDTOsBESimp4UIDTOData> getMOriginalItemBaseUom() {
        return mOriginalItemBaseUom;
    }

    /**
     * 设置mOriginalItemBaseUom属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9PMDTOsBESimp4UIDTOData }{@code >}
     *     
     */
    public void setMOriginalItemBaseUom(JAXBElement<UFIDAU9PMDTOsBESimp4UIDTOData> value) {
        this.mOriginalItemBaseUom = value;
    }

    /**
     * 获取mOriginalItemCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMOriginalItemCode() {
        return mOriginalItemCode;
    }

    /**
     * 设置mOriginalItemCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMOriginalItemCode(JAXBElement<String> value) {
        this.mOriginalItemCode = value;
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
     * 获取mOriginalItemUom属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9PMDTOsBESimp4UIDTOData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9PMDTOsBESimp4UIDTOData> getMOriginalItemUom() {
        return mOriginalItemUom;
    }

    /**
     * 设置mOriginalItemUom属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9PMDTOsBESimp4UIDTOData }{@code >}
     *     
     */
    public void setMOriginalItemUom(JAXBElement<UFIDAU9PMDTOsBESimp4UIDTOData> value) {
        this.mOriginalItemUom = value;
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
     * 获取mOwnOrg属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9PMDTOsBESimp4UIDTOData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9PMDTOsBESimp4UIDTOData> getMOwnOrg() {
        return mOwnOrg;
    }

    /**
     * 设置mOwnOrg属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9PMDTOsBESimp4UIDTOData }{@code >}
     *     
     */
    public void setMOwnOrg(JAXBElement<UFIDAU9PMDTOsBESimp4UIDTOData> value) {
        this.mOwnOrg = value;
    }

    /**
     * 获取mpoLot属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMPOLot() {
        return mpoLot;
    }

    /**
     * 设置mpoLot属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMPOLot(Long value) {
        this.mpoLot = value;
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
     * 获取mPaymentTerm属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9PMDTOsBESimp4UIDTOData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9PMDTOsBESimp4UIDTOData> getMPaymentTerm() {
        return mPaymentTerm;
    }

    /**
     * 设置mPaymentTerm属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9PMDTOsBESimp4UIDTOData }{@code >}
     *     
     */
    public void setMPaymentTerm(JAXBElement<UFIDAU9PMDTOsBESimp4UIDTOData> value) {
        this.mPaymentTerm = value;
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
     * 获取mPrepayPolicy属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9PMDTOsBESimp4UIDTOData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9PMDTOsBESimp4UIDTOData> getMPrepayPolicy() {
        return mPrepayPolicy;
    }

    /**
     * 设置mPrepayPolicy属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9PMDTOsBESimp4UIDTOData }{@code >}
     *     
     */
    public void setMPrepayPolicy(JAXBElement<UFIDAU9PMDTOsBESimp4UIDTOData> value) {
        this.mPrepayPolicy = value;
    }

    /**
     * 获取mPriceBaseUOM属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9PMDTOsBESimp4UIDTOData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9PMDTOsBESimp4UIDTOData> getMPriceBaseUOM() {
        return mPriceBaseUOM;
    }

    /**
     * 设置mPriceBaseUOM属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9PMDTOsBESimp4UIDTOData }{@code >}
     *     
     */
    public void setMPriceBaseUOM(JAXBElement<UFIDAU9PMDTOsBESimp4UIDTOData> value) {
        this.mPriceBaseUOM = value;
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
     * 获取mPriceUOM属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9PMDTOsBESimp4UIDTOData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9PMDTOsBESimp4UIDTOData> getMPriceUOM() {
        return mPriceUOM;
    }

    /**
     * 设置mPriceUOM属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9PMDTOsBESimp4UIDTOData }{@code >}
     *     
     */
    public void setMPriceUOM(JAXBElement<UFIDAU9PMDTOsBESimp4UIDTOData> value) {
        this.mPriceUOM = value;
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
     * 获取mProcessSubUOM属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9PMDTOsBESimp4UIDTOData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9PMDTOsBESimp4UIDTOData> getMProcessSubUOM() {
        return mProcessSubUOM;
    }

    /**
     * 设置mProcessSubUOM属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9PMDTOsBESimp4UIDTOData }{@code >}
     *     
     */
    public void setMProcessSubUOM(JAXBElement<UFIDAU9PMDTOsBESimp4UIDTOData> value) {
        this.mProcessSubUOM = value;
    }

    /**
     * 获取mProcessUOM属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9PMDTOsBESimp4UIDTOData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9PMDTOsBESimp4UIDTOData> getMProcessUOM() {
        return mProcessUOM;
    }

    /**
     * 设置mProcessUOM属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9PMDTOsBESimp4UIDTOData }{@code >}
     *     
     */
    public void setMProcessUOM(JAXBElement<UFIDAU9PMDTOsBESimp4UIDTOData> value) {
        this.mProcessUOM = value;
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
     * 获取mProject属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9PMDTOsBESimp4UIDTOData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9PMDTOsBESimp4UIDTOData> getMProject() {
        return mProject;
    }

    /**
     * 设置mProject属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9PMDTOsBESimp4UIDTOData }{@code >}
     *     
     */
    public void setMProject(JAXBElement<UFIDAU9PMDTOsBESimp4UIDTOData> value) {
        this.mProject = value;
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
     * 获取mPurDept属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9PMDTOsBESimp4UIDTOData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9PMDTOsBESimp4UIDTOData> getMPurDept() {
        return mPurDept;
    }

    /**
     * 设置mPurDept属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9PMDTOsBESimp4UIDTOData }{@code >}
     *     
     */
    public void setMPurDept(JAXBElement<UFIDAU9PMDTOsBESimp4UIDTOData> value) {
        this.mPurDept = value;
    }

    /**
     * 获取mPurOper属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9PMDTOsBESimp4UIDTOData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9PMDTOsBESimp4UIDTOData> getMPurOper() {
        return mPurOper;
    }

    /**
     * 设置mPurOper属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9PMDTOsBESimp4UIDTOData }{@code >}
     *     
     */
    public void setMPurOper(JAXBElement<UFIDAU9PMDTOsBESimp4UIDTOData> value) {
        this.mPurOper = value;
    }

    /**
     * 获取mPurOrg属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9PMDTOsBESimp4UIDTOData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9PMDTOsBESimp4UIDTOData> getMPurOrg() {
        return mPurOrg;
    }

    /**
     * 设置mPurOrg属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9PMDTOsBESimp4UIDTOData }{@code >}
     *     
     */
    public void setMPurOrg(JAXBElement<UFIDAU9PMDTOsBESimp4UIDTOData> value) {
        this.mPurOrg = value;
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
     * 获取mRcvAddress属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUFIDAU9ISVRCVDTOOBARcvAddressDTOData }{@code >}
     *     
     */
    public JAXBElement<ArrayOfUFIDAU9ISVRCVDTOOBARcvAddressDTOData> getMRcvAddress() {
        return mRcvAddress;
    }

    /**
     * 设置mRcvAddress属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUFIDAU9ISVRCVDTOOBARcvAddressDTOData }{@code >}
     *     
     */
    public void setMRcvAddress(JAXBElement<ArrayOfUFIDAU9ISVRCVDTOOBARcvAddressDTOData> value) {
        this.mRcvAddress = value;
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
     * 获取mRcvBy属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9PMDTOsBESimp4UIDTOData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9PMDTOsBESimp4UIDTOData> getMRcvBy() {
        return mRcvBy;
    }

    /**
     * 设置mRcvBy属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9PMDTOsBESimp4UIDTOData }{@code >}
     *     
     */
    public void setMRcvBy(JAXBElement<UFIDAU9PMDTOsBESimp4UIDTOData> value) {
        this.mRcvBy = value;
    }

    /**
     * 获取mRcvContacts属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUFIDAU9ISVRCVDTOOBARcvContactDTOData }{@code >}
     *     
     */
    public JAXBElement<ArrayOfUFIDAU9ISVRCVDTOOBARcvContactDTOData> getMRcvContacts() {
        return mRcvContacts;
    }

    /**
     * 设置mRcvContacts属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUFIDAU9ISVRCVDTOOBARcvContactDTOData }{@code >}
     *     
     */
    public void setMRcvContacts(JAXBElement<ArrayOfUFIDAU9ISVRCVDTOOBARcvContactDTOData> value) {
        this.mRcvContacts = value;
    }

    /**
     * 获取mRcvDept属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9PMDTOsBESimp4UIDTOData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9PMDTOsBESimp4UIDTOData> getMRcvDept() {
        return mRcvDept;
    }

    /**
     * 设置mRcvDept属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9PMDTOsBESimp4UIDTOData }{@code >}
     *     
     */
    public void setMRcvDept(JAXBElement<UFIDAU9PMDTOsBESimp4UIDTOData> value) {
        this.mRcvDept = value;
    }

    /**
     * 获取mRcvDiscount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUFIDAU9ISVRCVDTOOBARcvDiscountDTOData }{@code >}
     *     
     */
    public JAXBElement<ArrayOfUFIDAU9ISVRCVDTOOBARcvDiscountDTOData> getMRcvDiscount() {
        return mRcvDiscount;
    }

    /**
     * 设置mRcvDiscount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUFIDAU9ISVRCVDTOOBARcvDiscountDTOData }{@code >}
     *     
     */
    public void setMRcvDiscount(JAXBElement<ArrayOfUFIDAU9ISVRCVDTOOBARcvDiscountDTOData> value) {
        this.mRcvDiscount = value;
    }

    /**
     * 获取mRcvFees属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUFIDAU9ISVRCVDTOOBARcvFeeDTOData }{@code >}
     *     
     */
    public JAXBElement<ArrayOfUFIDAU9ISVRCVDTOOBARcvFeeDTOData> getMRcvFees() {
        return mRcvFees;
    }

    /**
     * 设置mRcvFees属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUFIDAU9ISVRCVDTOOBARcvFeeDTOData }{@code >}
     *     
     */
    public void setMRcvFees(JAXBElement<ArrayOfUFIDAU9ISVRCVDTOOBARcvFeeDTOData> value) {
        this.mRcvFees = value;
    }

    /**
     * 获取mRcvLineAllotMOs属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUFIDAU9ISVRCVDTOOBARcvLineAllotMODTOData }{@code >}
     *     
     */
    public JAXBElement<ArrayOfUFIDAU9ISVRCVDTOOBARcvLineAllotMODTOData> getMRcvLineAllotMOs() {
        return mRcvLineAllotMOs;
    }

    /**
     * 设置mRcvLineAllotMOs属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUFIDAU9ISVRCVDTOOBARcvLineAllotMODTOData }{@code >}
     *     
     */
    public void setMRcvLineAllotMOs(JAXBElement<ArrayOfUFIDAU9ISVRCVDTOOBARcvLineAllotMODTOData> value) {
        this.mRcvLineAllotMOs = value;
    }

    /**
     * 获取mRcvLineBalanceRoutes属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUFIDAU9ISVRCVDTOOBARcvLineBalanceRouteDTOData }{@code >}
     *     
     */
    public JAXBElement<ArrayOfUFIDAU9ISVRCVDTOOBARcvLineBalanceRouteDTOData> getMRcvLineBalanceRoutes() {
        return mRcvLineBalanceRoutes;
    }

    /**
     * 设置mRcvLineBalanceRoutes属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUFIDAU9ISVRCVDTOOBARcvLineBalanceRouteDTOData }{@code >}
     *     
     */
    public void setMRcvLineBalanceRoutes(JAXBElement<ArrayOfUFIDAU9ISVRCVDTOOBARcvLineBalanceRouteDTOData> value) {
        this.mRcvLineBalanceRoutes = value;
    }

    /**
     * 获取mRcvLineCosts属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUFIDAU9ISVRCVDTOOBARcvLineCostDTOData }{@code >}
     *     
     */
    public JAXBElement<ArrayOfUFIDAU9ISVRCVDTOOBARcvLineCostDTOData> getMRcvLineCosts() {
        return mRcvLineCosts;
    }

    /**
     * 设置mRcvLineCosts属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUFIDAU9ISVRCVDTOOBARcvLineCostDTOData }{@code >}
     *     
     */
    public void setMRcvLineCosts(JAXBElement<ArrayOfUFIDAU9ISVRCVDTOOBARcvLineCostDTOData> value) {
        this.mRcvLineCosts = value;
    }

    /**
     * 获取mRcvLineDispenses属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUFIDAU9ISVRCVDTOOBARcvLineDispenseDTOData }{@code >}
     *     
     */
    public JAXBElement<ArrayOfUFIDAU9ISVRCVDTOOBARcvLineDispenseDTOData> getMRcvLineDispenses() {
        return mRcvLineDispenses;
    }

    /**
     * 设置mRcvLineDispenses属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUFIDAU9ISVRCVDTOOBARcvLineDispenseDTOData }{@code >}
     *     
     */
    public void setMRcvLineDispenses(JAXBElement<ArrayOfUFIDAU9ISVRCVDTOOBARcvLineDispenseDTOData> value) {
        this.mRcvLineDispenses = value;
    }

    /**
     * 获取mRcvLineLocations属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUFIDAU9ISVRCVDTOOBARcvLineLocationDTOData }{@code >}
     *     
     */
    public JAXBElement<ArrayOfUFIDAU9ISVRCVDTOOBARcvLineLocationDTOData> getMRcvLineLocations() {
        return mRcvLineLocations;
    }

    /**
     * 设置mRcvLineLocations属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUFIDAU9ISVRCVDTOOBARcvLineLocationDTOData }{@code >}
     *     
     */
    public void setMRcvLineLocations(JAXBElement<ArrayOfUFIDAU9ISVRCVDTOOBARcvLineLocationDTOData> value) {
        this.mRcvLineLocations = value;
    }

    /**
     * 获取mRcvLot属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMRcvLot() {
        return mRcvLot;
    }

    /**
     * 设置mRcvLot属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMRcvLot(Long value) {
        this.mRcvLot = value;
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
     * 获取mRcvSubLines属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUFIDAU9ISVRCVDTOOBARcvSubLineDTOData }{@code >}
     *     
     */
    public JAXBElement<ArrayOfUFIDAU9ISVRCVDTOOBARcvSubLineDTOData> getMRcvSubLines() {
        return mRcvSubLines;
    }

    /**
     * 设置mRcvSubLines属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUFIDAU9ISVRCVDTOOBARcvSubLineDTOData }{@code >}
     *     
     */
    public void setMRcvSubLines(JAXBElement<ArrayOfUFIDAU9ISVRCVDTOOBARcvSubLineDTOData> value) {
        this.mRcvSubLines = value;
    }

    /**
     * 获取mRcvTaxs属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUFIDAU9ISVRCVDTOOBARcvTaxDTOData }{@code >}
     *     
     */
    public JAXBElement<ArrayOfUFIDAU9ISVRCVDTOOBARcvTaxDTOData> getMRcvTaxs() {
        return mRcvTaxs;
    }

    /**
     * 设置mRcvTaxs属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUFIDAU9ISVRCVDTOOBARcvTaxDTOData }{@code >}
     *     
     */
    public void setMRcvTaxs(JAXBElement<ArrayOfUFIDAU9ISVRCVDTOOBARcvTaxDTOData> value) {
        this.mRcvTaxs = value;
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
     * 获取mRequireDept属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9PMDTOsBESimp4UIDTOData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9PMDTOsBESimp4UIDTOData> getMRequireDept() {
        return mRequireDept;
    }

    /**
     * 设置mRequireDept属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9PMDTOsBESimp4UIDTOData }{@code >}
     *     
     */
    public void setMRequireDept(JAXBElement<UFIDAU9PMDTOsBESimp4UIDTOData> value) {
        this.mRequireDept = value;
    }

    /**
     * 获取mRequireMan属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9PMDTOsBESimp4UIDTOData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9PMDTOsBESimp4UIDTOData> getMRequireMan() {
        return mRequireMan;
    }

    /**
     * 设置mRequireMan属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9PMDTOsBESimp4UIDTOData }{@code >}
     *     
     */
    public void setMRequireMan(JAXBElement<UFIDAU9PMDTOsBESimp4UIDTOData> value) {
        this.mRequireMan = value;
    }

    /**
     * 获取mRequireOrg属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9PMDTOsBESimp4UIDTOData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9PMDTOsBESimp4UIDTOData> getMRequireOrg() {
        return mRequireOrg;
    }

    /**
     * 设置mRequireOrg属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9PMDTOsBESimp4UIDTOData }{@code >}
     *     
     */
    public void setMRequireOrg(JAXBElement<UFIDAU9PMDTOsBESimp4UIDTOData> value) {
        this.mRequireOrg = value;
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
     * 获取mRtnReason属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9PMRtnRtnReasonData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9PMRtnRtnReasonData> getMRtnReason() {
        return mRtnReason;
    }

    /**
     * 设置mRtnReason属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9PMRtnRtnReasonData }{@code >}
     *     
     */
    public void setMRtnReason(JAXBElement<UFIDAU9PMRtnRtnReasonData> value) {
        this.mRtnReason = value;
    }

    /**
     * 获取msnList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public JAXBElement<ArrayOfstring> getMSNList() {
        return msnList;
    }

    /**
     * 设置msnList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public void setMSNList(JAXBElement<ArrayOfstring> value) {
        this.msnList = value;
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
     * 获取msuToCURate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMSUToCURate() {
        return msuToCURate;
    }

    /**
     * 设置msuToCURate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMSUToCURate(BigDecimal value) {
        this.msuToCURate = value;
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
     * 获取mSeiBan属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9PMDTOsBESimp4UIDTOData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9PMDTOsBESimp4UIDTOData> getMSeiBan() {
        return mSeiBan;
    }

    /**
     * 设置mSeiBan属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9PMDTOsBESimp4UIDTOData }{@code >}
     *     
     */
    public void setMSeiBan(JAXBElement<UFIDAU9PMDTOsBESimp4UIDTOData> value) {
        this.mSeiBan = value;
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
     * 获取mStoreBaseUOM属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9PMDTOsBESimp4UIDTOData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9PMDTOsBESimp4UIDTOData> getMStoreBaseUOM() {
        return mStoreBaseUOM;
    }

    /**
     * 设置mStoreBaseUOM属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9PMDTOsBESimp4UIDTOData }{@code >}
     *     
     */
    public void setMStoreBaseUOM(JAXBElement<UFIDAU9PMDTOsBESimp4UIDTOData> value) {
        this.mStoreBaseUOM = value;
    }

    /**
     * 获取mStoreUOM属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9PMDTOsBESimp4UIDTOData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9PMDTOsBESimp4UIDTOData> getMStoreUOM() {
        return mStoreUOM;
    }

    /**
     * 设置mStoreUOM属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9PMDTOsBESimp4UIDTOData }{@code >}
     *     
     */
    public void setMStoreUOM(JAXBElement<UFIDAU9PMDTOsBESimp4UIDTOData> value) {
        this.mStoreUOM = value;
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
     * 获取mtbMainUOM属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9PMDTOsBESimp4UIDTOData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9PMDTOsBESimp4UIDTOData> getMTBMainUOM() {
        return mtbMainUOM;
    }

    /**
     * 设置mtbMainUOM属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9PMDTOsBESimp4UIDTOData }{@code >}
     *     
     */
    public void setMTBMainUOM(JAXBElement<UFIDAU9PMDTOsBESimp4UIDTOData> value) {
        this.mtbMainUOM = value;
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
     * 获取mtbSubUOM属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9PMDTOsBESimp4UIDTOData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9PMDTOsBESimp4UIDTOData> getMTBSubUOM() {
        return mtbSubUOM;
    }

    /**
     * 设置mtbSubUOM属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9PMDTOsBESimp4UIDTOData }{@code >}
     *     
     */
    public void setMTBSubUOM(JAXBElement<UFIDAU9PMDTOsBESimp4UIDTOData> value) {
        this.mtbSubUOM = value;
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
     * 获取mTask属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9PMDTOsBESimp4UIDTOData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9PMDTOsBESimp4UIDTOData> getMTask() {
        return mTask;
    }

    /**
     * 设置mTask属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9PMDTOsBESimp4UIDTOData }{@code >}
     *     
     */
    public void setMTask(JAXBElement<UFIDAU9PMDTOsBESimp4UIDTOData> value) {
        this.mTask = value;
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
     * 获取mTaxSchedule属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9PMDTOsBESimp4UIDTOData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9PMDTOsBESimp4UIDTOData> getMTaxSchedule() {
        return mTaxSchedule;
    }

    /**
     * 设置mTaxSchedule属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9PMDTOsBESimp4UIDTOData }{@code >}
     *     
     */
    public void setMTaxSchedule(JAXBElement<UFIDAU9PMDTOsBESimp4UIDTOData> value) {
        this.mTaxSchedule = value;
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
     * 获取mTradeBaseUOM属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9PMDTOsBESimp4UIDTOData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9PMDTOsBESimp4UIDTOData> getMTradeBaseUOM() {
        return mTradeBaseUOM;
    }

    /**
     * 设置mTradeBaseUOM属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9PMDTOsBESimp4UIDTOData }{@code >}
     *     
     */
    public void setMTradeBaseUOM(JAXBElement<UFIDAU9PMDTOsBESimp4UIDTOData> value) {
        this.mTradeBaseUOM = value;
    }

    /**
     * 获取mTradeUOM属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9PMDTOsBESimp4UIDTOData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9PMDTOsBESimp4UIDTOData> getMTradeUOM() {
        return mTradeUOM;
    }

    /**
     * 设置mTradeUOM属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9PMDTOsBESimp4UIDTOData }{@code >}
     *     
     */
    public void setMTradeUOM(JAXBElement<UFIDAU9PMDTOsBESimp4UIDTOData> value) {
        this.mTradeUOM = value;
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
     * 获取mvatac属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMVATAC() {
        return mvatac;
    }

    /**
     * 设置mvatac属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMVATAC(BigDecimal value) {
        this.mvatac = value;
    }

    /**
     * 获取mvatfc属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMVATFC() {
        return mvatfc;
    }

    /**
     * 设置mvatfc属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMVATFC(BigDecimal value) {
        this.mvatfc = value;
    }

    /**
     * 获取mvattc属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMVATTC() {
        return mvattc;
    }

    /**
     * 设置mvattc属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMVATTC(BigDecimal value) {
        this.mvattc = value;
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
     * 获取mVolumeUom属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9PMDTOsBESimp4UIDTOData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9PMDTOsBESimp4UIDTOData> getMVolumeUom() {
        return mVolumeUom;
    }

    /**
     * 设置mVolumeUom属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9PMDTOsBESimp4UIDTOData }{@code >}
     *     
     */
    public void setMVolumeUom(JAXBElement<UFIDAU9PMDTOsBESimp4UIDTOData> value) {
        this.mVolumeUom = value;
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

    /**
     * 获取mWeightUom属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9PMDTOsBESimp4UIDTOData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9PMDTOsBESimp4UIDTOData> getMWeightUom() {
        return mWeightUom;
    }

    /**
     * 设置mWeightUom属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9PMDTOsBESimp4UIDTOData }{@code >}
     *     
     */
    public void setMWeightUom(JAXBElement<UFIDAU9PMDTOsBESimp4UIDTOData> value) {
        this.mWeightUom = value;
    }

    /**
     * 获取mWh属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9PMDTOsBESimp4UIDTOData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9PMDTOsBESimp4UIDTOData> getMWh() {
        return mWh;
    }

    /**
     * 设置mWh属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9PMDTOsBESimp4UIDTOData }{@code >}
     *     
     */
    public void setMWh(JAXBElement<UFIDAU9PMDTOsBESimp4UIDTOData> value) {
        this.mWh = value;
    }

    /**
     * 获取mWhMan属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9PMDTOsBESimp4UIDTOData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9PMDTOsBESimp4UIDTOData> getMWhMan() {
        return mWhMan;
    }

    /**
     * 设置mWhMan属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9PMDTOsBESimp4UIDTOData }{@code >}
     *     
     */
    public void setMWhMan(JAXBElement<UFIDAU9PMDTOsBESimp4UIDTOData> value) {
        this.mWhMan = value;
    }

}
