
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
 * &lt;p&gt;UFIDA.U9.ISV.RCV.DTO.OBARcvLineDTOData complex type�� Java �ࡣ
 * 
 * &lt;p&gt;����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡmAccountOrg���Ե�ֵ��
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
     * ����mAccountOrg���Ե�ֵ��
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
     * ��ȡmAssociatedParent���Ե�ֵ��
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
     * ����mAssociatedParent���Ե�ֵ��
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
     * ��ȡmbomuom���Ե�ֵ��
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
     * ����mbomuom���Ե�ֵ��
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
     * ��ȡmBalanceCurrency���Ե�ֵ��
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
     * ����mBalanceCurrency���Ե�ֵ��
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
     * ��ȡmBalanceRoute���Ե�ֵ��
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
     * ����mBalanceRoute���Ե�ֵ��
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
     * ��ȡmBizBudgetProject���Ե�ֵ��
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
     * ����mBizBudgetProject���Ե�ֵ��
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
     * ��ȡmConfigResultOrg���Ե�ֵ��
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
     * ����mConfigResultOrg���Ե�ֵ��
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
     * ��ȡmConfirmAccording���Ե�ֵ��
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
     * ����mConfirmAccording���Ե�ֵ��
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
     * ��ȡmConfirmTerm���Ե�ֵ��
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
     * ����mConfirmTerm���Ե�ֵ��
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
     * ��ȡmCostBaseUOM���Ե�ֵ��
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
     * ����mCostBaseUOM���Ե�ֵ��
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
     * ��ȡmCostUOM���Ե�ֵ��
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
     * ����mCostUOM���Ե�ֵ��
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
     * ��ȡmCustomAC���Ե�ֵ��
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
     * ����mCustomAC���Ե�ֵ��
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
     * ��ȡmCustomFC���Ե�ֵ��
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
     * ����mCustomFC���Ե�ֵ��
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
     * ��ȡmCustomTC���Ե�ֵ��
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
     * ����mCustomTC���Ե�ֵ��
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
     * ��ȡmDamageQtyTU���Ե�ֵ��
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
     * ����mDamageQtyTU���Ե�ֵ��
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
     * ��ȡmExciseAC���Ե�ֵ��
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
     * ����mExciseAC���Ե�ֵ��
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
     * ��ȡmExciseFC���Ե�ֵ��
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
     * ����mExciseFC���Ե�ֵ��
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
     * ��ȡmExciseTC���Ե�ֵ��
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
     * ����mExciseTC���Ե�ֵ��
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
     * ��ȡmfas���Ե�ֵ��
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
     * ����mfas���Ե�ֵ��
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
     * ��ȡmInvLot���Ե�ֵ��
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
     * ����mInvLot���Ե�ֵ��
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
     * ��ȡmlcMnyAC���Ե�ֵ��
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
     * ����mlcMnyAC���Ե�ֵ��
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
     * ��ȡmlcMnyFC���Ե�ֵ��
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
     * ����mlcMnyFC���Ե�ֵ��
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
     * ��ȡmlcMnyTC���Ե�ֵ��
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
     * ����mlcMnyTC���Ե�ֵ��
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
     * ��ȡmlcQtyCU���Ե�ֵ��
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
     * ����mlcQtyCU���Ե�ֵ��
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
     * ��ȡmlcQtyPU���Ե�ֵ��
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
     * ����mlcQtyPU���Ե�ֵ��
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
     * ��ȡmlcQtySU���Ե�ֵ��
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
     * ����mlcQtySU���Ե�ֵ��
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
     * ��ȡmlcQtyTBU���Ե�ֵ��
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
     * ����mlcQtyTBU���Ե�ֵ��
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
     * ��ȡmlcQtyTU���Ե�ֵ��
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
     * ����mlcQtyTU���Ե�ֵ��
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
     * ��ȡmMemo���Ե�ֵ��
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
     * ����mMemo���Ե�ֵ��
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
     * ��ȡmMnyBudgetProject���Ե�ֵ��
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
     * ����mMnyBudgetProject���Ե�ֵ��
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
     * ��ȡmNoLCMnyAC���Ե�ֵ��
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
     * ����mNoLCMnyAC���Ե�ֵ��
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
     * ��ȡmNoLCMnyFC���Ե�ֵ��
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
     * ����mNoLCMnyFC���Ե�ֵ��
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
     * ��ȡmNoLCMnyTC���Ե�ֵ��
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
     * ����mNoLCMnyTC���Ե�ֵ��
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
     * ��ȡmNoLCQtyCU���Ե�ֵ��
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
     * ����mNoLCQtyCU���Ե�ֵ��
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
     * ��ȡmNoLCQtyPU���Ե�ֵ��
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
     * ����mNoLCQtyPU���Ե�ֵ��
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
     * ��ȡmNoLCQtySU���Ե�ֵ��
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
     * ����mNoLCQtySU���Ե�ֵ��
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
     * ��ȡmNoLCQtyTBU���Ե�ֵ��
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
     * ����mNoLCQtyTBU���Ե�ֵ��
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
     * ��ȡmNoLCQtyTU���Ե�ֵ��
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
     * ����mNoLCQtyTU���Ե�ֵ��
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
     * ��ȡmobaReceivementDTO���Ե�ֵ��
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
     * ����mobaReceivementDTO���Ե�ֵ��
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
     * ��ȡmOriginalItemBaseUom���Ե�ֵ��
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
     * ����mOriginalItemBaseUom���Ե�ֵ��
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
     * ��ȡmOriginalItemCode���Ե�ֵ��
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
     * ����mOriginalItemCode���Ե�ֵ��
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
     * ��ȡmOriginalItemUom���Ե�ֵ��
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
     * ����mOriginalItemUom���Ե�ֵ��
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
     * ��ȡmOwnOrg���Ե�ֵ��
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
     * ����mOwnOrg���Ե�ֵ��
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
     * ��ȡmpoLot���Ե�ֵ��
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
     * ����mpoLot���Ե�ֵ��
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
     * ��ȡmPaymentTerm���Ե�ֵ��
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
     * ����mPaymentTerm���Ե�ֵ��
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
     * ��ȡmPrepayPolicy���Ե�ֵ��
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
     * ����mPrepayPolicy���Ե�ֵ��
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
     * ��ȡmPriceBaseUOM���Ե�ֵ��
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
     * ����mPriceBaseUOM���Ե�ֵ��
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
     * ��ȡmPriceUOM���Ե�ֵ��
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
     * ����mPriceUOM���Ե�ֵ��
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
     * ��ȡmProcessSubUOM���Ե�ֵ��
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
     * ����mProcessSubUOM���Ե�ֵ��
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
     * ��ȡmProcessUOM���Ե�ֵ��
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
     * ����mProcessUOM���Ե�ֵ��
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
     * ��ȡmProject���Ե�ֵ��
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
     * ����mProject���Ե�ֵ��
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
     * ��ȡmPurDept���Ե�ֵ��
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
     * ����mPurDept���Ե�ֵ��
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
     * ��ȡmPurOper���Ե�ֵ��
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
     * ����mPurOper���Ե�ֵ��
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
     * ��ȡmPurOrg���Ե�ֵ��
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
     * ����mPurOrg���Ե�ֵ��
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
     * ��ȡmRcvAddress���Ե�ֵ��
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
     * ����mRcvAddress���Ե�ֵ��
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
     * ��ȡmRcvBy���Ե�ֵ��
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
     * ����mRcvBy���Ե�ֵ��
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
     * ��ȡmRcvContacts���Ե�ֵ��
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
     * ����mRcvContacts���Ե�ֵ��
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
     * ��ȡmRcvDept���Ե�ֵ��
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
     * ����mRcvDept���Ե�ֵ��
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
     * ��ȡmRcvDiscount���Ե�ֵ��
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
     * ����mRcvDiscount���Ե�ֵ��
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
     * ��ȡmRcvFees���Ե�ֵ��
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
     * ����mRcvFees���Ե�ֵ��
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
     * ��ȡmRcvLineAllotMOs���Ե�ֵ��
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
     * ����mRcvLineAllotMOs���Ե�ֵ��
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
     * ��ȡmRcvLineBalanceRoutes���Ե�ֵ��
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
     * ����mRcvLineBalanceRoutes���Ե�ֵ��
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
     * ��ȡmRcvLineCosts���Ե�ֵ��
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
     * ����mRcvLineCosts���Ե�ֵ��
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
     * ��ȡmRcvLineDispenses���Ե�ֵ��
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
     * ����mRcvLineDispenses���Ե�ֵ��
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
     * ��ȡmRcvLineLocations���Ե�ֵ��
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
     * ����mRcvLineLocations���Ե�ֵ��
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
     * ��ȡmRcvLot���Ե�ֵ��
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
     * ����mRcvLot���Ե�ֵ��
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
     * ��ȡmRcvSubLines���Ե�ֵ��
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
     * ����mRcvSubLines���Ե�ֵ��
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
     * ��ȡmRcvTaxs���Ե�ֵ��
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
     * ����mRcvTaxs���Ե�ֵ��
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
     * ��ȡmRequireDept���Ե�ֵ��
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
     * ����mRequireDept���Ե�ֵ��
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
     * ��ȡmRequireMan���Ե�ֵ��
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
     * ����mRequireMan���Ե�ֵ��
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
     * ��ȡmRequireOrg���Ե�ֵ��
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
     * ����mRequireOrg���Ե�ֵ��
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
     * ��ȡmRtnReason���Ե�ֵ��
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
     * ����mRtnReason���Ե�ֵ��
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
     * ��ȡmsnList���Ե�ֵ��
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
     * ����msnList���Ե�ֵ��
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
     * ��ȡmsuToCURate���Ե�ֵ��
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
     * ����msuToCURate���Ե�ֵ��
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
     * ��ȡmSeiBan���Ե�ֵ��
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
     * ����mSeiBan���Ե�ֵ��
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
     * ��ȡmStoreBaseUOM���Ե�ֵ��
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
     * ����mStoreBaseUOM���Ե�ֵ��
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
     * ��ȡmStoreUOM���Ե�ֵ��
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
     * ����mStoreUOM���Ե�ֵ��
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
     * ��ȡmtbMainUOM���Ե�ֵ��
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
     * ����mtbMainUOM���Ե�ֵ��
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
     * ��ȡmtbSubUOM���Ե�ֵ��
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
     * ����mtbSubUOM���Ե�ֵ��
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
     * ��ȡmTask���Ե�ֵ��
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
     * ����mTask���Ե�ֵ��
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
     * ��ȡmTaxSchedule���Ե�ֵ��
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
     * ����mTaxSchedule���Ե�ֵ��
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
     * ��ȡmTradeBaseUOM���Ե�ֵ��
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
     * ����mTradeBaseUOM���Ե�ֵ��
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
     * ��ȡmTradeUOM���Ե�ֵ��
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
     * ����mTradeUOM���Ե�ֵ��
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
     * ��ȡmvatac���Ե�ֵ��
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
     * ����mvatac���Ե�ֵ��
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
     * ��ȡmvatfc���Ե�ֵ��
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
     * ����mvatfc���Ե�ֵ��
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
     * ��ȡmvattc���Ե�ֵ��
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
     * ����mvattc���Ե�ֵ��
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
     * ��ȡmVolumeUom���Ե�ֵ��
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
     * ����mVolumeUom���Ե�ֵ��
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

    /**
     * ��ȡmWeightUom���Ե�ֵ��
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
     * ����mWeightUom���Ե�ֵ��
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
     * ��ȡmWh���Ե�ֵ��
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
     * ����mWh���Ե�ֵ��
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
     * ��ȡmWhMan���Ե�ֵ��
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
     * ����mWhMan���Ե�ֵ��
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
