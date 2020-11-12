
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
import icreateshipsv.data.util.ubf.ufsoft.MultiLangDataDict;


/**
 * &lt;p&gt;UFIDA.U9.CBO.SCM.Item.ItemMasterData complex type的 Java 类。
 * 
 * &lt;p&gt;以下模式片段指定包含在此类中的预期内容。
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="UFIDA.U9.CBO.SCM.Item.ItemMasterData"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://www.UFIDA.org/EntityData}UFSoft.UBF.Business.DataTransObjectBase"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="AliasName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="AssetCategory" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="AssetCategory_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="BulkUom" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="BulkUom_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="CombineName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="CostCategory" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="CostCategory_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="CostCurrency" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="CostCurrency_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="CostUOM" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="CostUOM_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="CreditCategory" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="CreditCategory_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="EntranceInfo_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="FreeItem1" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="FreeItem1_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="FreeItem2" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="FreeItem2_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="FreeItem3" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="FreeItem3_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="InspectionInfo_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="InventoryInfo_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="InventorySecondUOM" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="InventorySecondUOM_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="InventoryUOM" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="InventoryUOM_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="KeyFlexFieldStru" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="KeyFlexFieldStru_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="MRPCategory" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="MRPCategory_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="MainItemCategory" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="MainItemCategory_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ManufactureUOM" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ManufactureUOM_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="MasterOrg" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="MasterOrg_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="MaterialOutUOM" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="MaterialOutUOM_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="MfgInfo_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="MrpInfo_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Multi_AliasName" type="{UFSoft.UBF.Util.Data}MultiLangDataDict" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Multi_CombineName" type="{UFSoft.UBF.Util.Data}MultiLangDataDict" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Multi_Description" type="{UFSoft.UBF.Util.Data}MultiLangDataDict" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Multi_NameCombineName" type="{UFSoft.UBF.Util.Data}MultiLangDataDict" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="NameCombineName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="NameKeyFlexFieldStru" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="NameKeyFlexFieldStru_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Org" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Org_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="PriceCategory" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="PriceCategory_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="PriceUOM" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="PriceUOM_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ProductionCategory" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ProductionCategory_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="PurchaseCategory" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="PurchaseCategory_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="PurchaseInfo_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="PurchaseUOM" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="PurchaseUOM_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="SaleCategory" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="SaleCategory_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="SaleInfo_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="SalesUOM" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="SalesUOM_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="StateUser" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="StateUser_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Status_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="StockCategory" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="StockCategory_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="TradeMark" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="TradeMark_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="WeightUom" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="WeightUom_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_boundedCategory" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_boundedCountTaxRate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_boundedCountToLerance" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_boundedTaxNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_catalogNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_code1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_code2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_converRatioRule" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_createdBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_createdOn" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_customNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_customTaxRate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_descFlexField" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.Base.FlexField.DescFlexField.DescFlexSegmentsData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_drawbackRate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_effective" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.Base.PropertyTypes.EffectiveData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_endGrade" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_endPotency" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_entranceInfo" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CBO.SCM.Item.EntranceInfoData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_iD" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_inspectionInfo" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CBO.SCM.Item.ItemInspectionInfoData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_internalTransCost" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_inventoryInfo" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CBO.SCM.Item.ItemInvInfoData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_inventoryUOMGroup" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isBOMEnable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isBounded" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isBuildEnable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isCanFlowStat" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isCostCalByGrade" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isCostCalByPotency" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isDualQuantity" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isDualUOM" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isGradeControl" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isIncludedCostCa" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isIncludedStockAsset" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isInventoryEnable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isMISC" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isMRPEnable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isMultyUOM" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isNeedLicence" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isOutsideOperationEnable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isPotencyControl" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isPurchaseEnable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isSalesEnable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isSpecialItem" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isSyncQuantity" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isTrademark" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isVMIEnable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isVarRatio" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isVersionQtyControl" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_itemBulk" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_itemConvertRatioInClasses" type="{http://www.UFIDA.org/EntityData}ArrayOfUFIDA.U9.CBO.SCM.Item.ItemConvertRatioInClassData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_itemConvertRatioOverClasses" type="{http://www.UFIDA.org/EntityData}ArrayOfUFIDA.U9.CBO.SCM.Item.ItemConvertRatioOverClassData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_itemForm" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_itemFormAttribute" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_itemFreeDefs" type="{http://www.UFIDA.org/EntityData}ArrayOfUFIDA.U9.CBO.SCM.Item.ItemFreeDefData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_itemMasterVersions" type="{http://www.UFIDA.org/EntityData}ArrayOfUFIDA.U9.CBO.SCM.Item.ItemMasterVersionData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_itemTradeMarks" type="{http://www.UFIDA.org/EntityData}ArrayOfUFIDA.U9.CBO.SCM.Item.ItemTradeMarkData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_mFGWasteInfos" type="{http://www.UFIDA.org/EntityData}ArrayOfUFIDA.U9.CBO.SCM.Item.MFGWasteInfoData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_mfgInfo" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CBO.SCM.Item.ItemMFGInfoData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_modifiedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_modifiedOn" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_mrpInfo" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CBO.SCM.Item.ItemMRPInfoData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_nameSegment1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_nameSegment10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_nameSegment11" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_nameSegment12" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_nameSegment13" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_nameSegment14" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_nameSegment15" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_nameSegment16" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_nameSegment17" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_nameSegment18" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_nameSegment19" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_nameSegment2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_nameSegment20" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_nameSegment21" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_nameSegment22" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_nameSegment23" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_nameSegment24" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_nameSegment25" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_nameSegment26" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_nameSegment27" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_nameSegment28" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_nameSegment29" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_nameSegment3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_nameSegment30" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_nameSegment4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_nameSegment5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_nameSegment6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_nameSegment7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_nameSegment8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_nameSegment9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_needInspect" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_pLMID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_picture" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_planCost" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_purchaseInfo" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CBO.SCM.Item.ItemPurchaseInfoData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_recentlyCost" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_refrenceCost" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_sPECS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_saleInfo" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CBO.SCM.Item.ItemSaleInfoData" minOccurs="0"/&amp;gt;
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
 *         &amp;lt;element name="m_standardBatchQty" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_standardCost" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_standardGrade" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_standardPotency" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_startGrade" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_startPotency" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_state" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_stateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_statusLastModify" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_sysVersion" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_version" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_versionID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
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
@XmlType(name = "UFIDA.U9.CBO.SCM.Item.ItemMasterData", propOrder = {
    "aliasName",
    "assetCategory",
    "assetCategorySKey",
    "bulkUom",
    "bulkUomSKey",
    "combineName",
    "costCategory",
    "costCategorySKey",
    "costCurrency",
    "costCurrencySKey",
    "costUOM",
    "costUOMSKey",
    "creditCategory",
    "creditCategorySKey",
    "description",
    "entranceInfoSKey",
    "freeItem1",
    "freeItem1SKey",
    "freeItem2",
    "freeItem2SKey",
    "freeItem3",
    "freeItem3SKey",
    "inspectionInfoSKey",
    "inventoryInfoSKey",
    "inventorySecondUOM",
    "inventorySecondUOMSKey",
    "inventoryUOM",
    "inventoryUOMSKey",
    "keyFlexFieldStru",
    "keyFlexFieldStruSKey",
    "mrpCategory",
    "mrpCategorySKey",
    "mainItemCategory",
    "mainItemCategorySKey",
    "manufactureUOM",
    "manufactureUOMSKey",
    "masterOrg",
    "masterOrgSKey",
    "materialOutUOM",
    "materialOutUOMSKey",
    "mfgInfoSKey",
    "mrpInfoSKey",
    "multiAliasName",
    "multiCombineName",
    "multiDescription",
    "multiNameCombineName",
    "nameCombineName",
    "nameKeyFlexFieldStru",
    "nameKeyFlexFieldStruSKey",
    "org",
    "orgSKey",
    "priceCategory",
    "priceCategorySKey",
    "priceUOM",
    "priceUOMSKey",
    "productionCategory",
    "productionCategorySKey",
    "purchaseCategory",
    "purchaseCategorySKey",
    "purchaseInfoSKey",
    "purchaseUOM",
    "purchaseUOMSKey",
    "saleCategory",
    "saleCategorySKey",
    "saleInfoSKey",
    "salesUOM",
    "salesUOMSKey",
    "stateUser",
    "stateUserSKey",
    "status",
    "statusSKey",
    "stockCategory",
    "stockCategorySKey",
    "tradeMark",
    "tradeMarkSKey",
    "weightUom",
    "weightUomSKey",
    "mBoundedCategory",
    "mBoundedCountTaxRate",
    "mBoundedCountToLerance",
    "mBoundedTaxNO",
    "mCatalogNO",
    "mCode",
    "mCode1",
    "mCode2",
    "mConverRatioRule",
    "mCreatedBy",
    "mCreatedOn",
    "mCustomNumber",
    "mCustomTaxRate",
    "mDescFlexField",
    "mDrawbackRate",
    "mEffective",
    "mEndGrade",
    "mEndPotency",
    "mEntranceInfo",
    "mid",
    "mInspectionInfo",
    "mInternalTransCost",
    "mInventoryInfo",
    "mInventoryUOMGroup",
    "mIsBOMEnable",
    "mIsBounded",
    "mIsBuildEnable",
    "mIsCanFlowStat",
    "mIsCostCalByGrade",
    "mIsCostCalByPotency",
    "mIsDualQuantity",
    "mIsDualUOM",
    "mIsGradeControl",
    "mIsIncludedCostCa",
    "mIsIncludedStockAsset",
    "mIsInventoryEnable",
    "mIsMISC",
    "mIsMRPEnable",
    "mIsMultyUOM",
    "mIsNeedLicence",
    "mIsOutsideOperationEnable",
    "mIsPotencyControl",
    "mIsPurchaseEnable",
    "mIsSalesEnable",
    "mIsSpecialItem",
    "mIsSyncQuantity",
    "mIsTrademark",
    "mIsVMIEnable",
    "mIsVarRatio",
    "mIsVersionQtyControl",
    "mItemBulk",
    "mItemConvertRatioInClasses",
    "mItemConvertRatioOverClasses",
    "mItemForm",
    "mItemFormAttribute",
    "mItemFreeDefs",
    "mItemMasterVersions",
    "mItemTradeMarks",
    "mmfgWasteInfos",
    "mMfgInfo",
    "mModifiedBy",
    "mModifiedOn",
    "mMrpInfo",
    "mName",
    "mNameSegment1",
    "mNameSegment10",
    "mNameSegment11",
    "mNameSegment12",
    "mNameSegment13",
    "mNameSegment14",
    "mNameSegment15",
    "mNameSegment16",
    "mNameSegment17",
    "mNameSegment18",
    "mNameSegment19",
    "mNameSegment2",
    "mNameSegment20",
    "mNameSegment21",
    "mNameSegment22",
    "mNameSegment23",
    "mNameSegment24",
    "mNameSegment25",
    "mNameSegment26",
    "mNameSegment27",
    "mNameSegment28",
    "mNameSegment29",
    "mNameSegment3",
    "mNameSegment30",
    "mNameSegment4",
    "mNameSegment5",
    "mNameSegment6",
    "mNameSegment7",
    "mNameSegment8",
    "mNameSegment9",
    "mNeedInspect",
    "mplmid",
    "mPicture",
    "mPlanCost",
    "mPurchaseInfo",
    "mRecentlyCost",
    "mRefrenceCost",
    "mspecs",
    "mSaleInfo",
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
    "mStandardBatchQty",
    "mStandardCost",
    "mStandardGrade",
    "mStandardPotency",
    "mStartGrade",
    "mStartPotency",
    "mState",
    "mStateTime",
    "mStatusLastModify",
    "mSysVersion",
    "mVersion",
    "mVersionID",
    "mWeight"
})
public class UFIDAU9CBOSCMItemItemMasterData
    extends UFSoftUBFBusinessDataTransObjectBase
{

    @XmlElementRef(name = "AliasName", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> aliasName;
    @XmlElement(name = "AssetCategory")
    protected Long assetCategory;
    @XmlElementRef(name = "AssetCategory_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> assetCategorySKey;
    @XmlElement(name = "BulkUom")
    protected Long bulkUom;
    @XmlElementRef(name = "BulkUom_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> bulkUomSKey;
    @XmlElementRef(name = "CombineName", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> combineName;
    @XmlElement(name = "CostCategory")
    protected Long costCategory;
    @XmlElementRef(name = "CostCategory_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> costCategorySKey;
    @XmlElement(name = "CostCurrency")
    protected Long costCurrency;
    @XmlElementRef(name = "CostCurrency_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> costCurrencySKey;
    @XmlElement(name = "CostUOM")
    protected Long costUOM;
    @XmlElementRef(name = "CostUOM_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> costUOMSKey;
    @XmlElement(name = "CreditCategory")
    protected Long creditCategory;
    @XmlElementRef(name = "CreditCategory_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> creditCategorySKey;
    @XmlElementRef(name = "Description", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> description;
    @XmlElementRef(name = "EntranceInfo_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> entranceInfoSKey;
    @XmlElement(name = "FreeItem1")
    protected Long freeItem1;
    @XmlElementRef(name = "FreeItem1_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> freeItem1SKey;
    @XmlElement(name = "FreeItem2")
    protected Long freeItem2;
    @XmlElementRef(name = "FreeItem2_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> freeItem2SKey;
    @XmlElement(name = "FreeItem3")
    protected Long freeItem3;
    @XmlElementRef(name = "FreeItem3_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> freeItem3SKey;
    @XmlElementRef(name = "InspectionInfo_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> inspectionInfoSKey;
    @XmlElementRef(name = "InventoryInfo_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> inventoryInfoSKey;
    @XmlElement(name = "InventorySecondUOM")
    protected Long inventorySecondUOM;
    @XmlElementRef(name = "InventorySecondUOM_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> inventorySecondUOMSKey;
    @XmlElement(name = "InventoryUOM")
    protected Long inventoryUOM;
    @XmlElementRef(name = "InventoryUOM_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> inventoryUOMSKey;
    @XmlElement(name = "KeyFlexFieldStru")
    protected Long keyFlexFieldStru;
    @XmlElementRef(name = "KeyFlexFieldStru_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> keyFlexFieldStruSKey;
    @XmlElement(name = "MRPCategory")
    protected Long mrpCategory;
    @XmlElementRef(name = "MRPCategory_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> mrpCategorySKey;
    @XmlElement(name = "MainItemCategory")
    protected Long mainItemCategory;
    @XmlElementRef(name = "MainItemCategory_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> mainItemCategorySKey;
    @XmlElement(name = "ManufactureUOM")
    protected Long manufactureUOM;
    @XmlElementRef(name = "ManufactureUOM_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> manufactureUOMSKey;
    @XmlElement(name = "MasterOrg")
    protected Long masterOrg;
    @XmlElementRef(name = "MasterOrg_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> masterOrgSKey;
    @XmlElement(name = "MaterialOutUOM")
    protected Long materialOutUOM;
    @XmlElementRef(name = "MaterialOutUOM_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> materialOutUOMSKey;
    @XmlElementRef(name = "MfgInfo_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> mfgInfoSKey;
    @XmlElementRef(name = "MrpInfo_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> mrpInfoSKey;
    @XmlElementRef(name = "Multi_AliasName", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<MultiLangDataDict> multiAliasName;
    @XmlElementRef(name = "Multi_CombineName", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<MultiLangDataDict> multiCombineName;
    @XmlElementRef(name = "Multi_Description", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<MultiLangDataDict> multiDescription;
    @XmlElementRef(name = "Multi_NameCombineName", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<MultiLangDataDict> multiNameCombineName;
    @XmlElementRef(name = "NameCombineName", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nameCombineName;
    @XmlElement(name = "NameKeyFlexFieldStru")
    protected Long nameKeyFlexFieldStru;
    @XmlElementRef(name = "NameKeyFlexFieldStru_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> nameKeyFlexFieldStruSKey;
    @XmlElement(name = "Org")
    protected Long org;
    @XmlElementRef(name = "Org_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> orgSKey;
    @XmlElement(name = "PriceCategory")
    protected Long priceCategory;
    @XmlElementRef(name = "PriceCategory_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> priceCategorySKey;
    @XmlElement(name = "PriceUOM")
    protected Long priceUOM;
    @XmlElementRef(name = "PriceUOM_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> priceUOMSKey;
    @XmlElement(name = "ProductionCategory")
    protected Long productionCategory;
    @XmlElementRef(name = "ProductionCategory_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> productionCategorySKey;
    @XmlElement(name = "PurchaseCategory")
    protected Long purchaseCategory;
    @XmlElementRef(name = "PurchaseCategory_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> purchaseCategorySKey;
    @XmlElementRef(name = "PurchaseInfo_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> purchaseInfoSKey;
    @XmlElement(name = "PurchaseUOM")
    protected Long purchaseUOM;
    @XmlElementRef(name = "PurchaseUOM_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> purchaseUOMSKey;
    @XmlElement(name = "SaleCategory")
    protected Long saleCategory;
    @XmlElementRef(name = "SaleCategory_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> saleCategorySKey;
    @XmlElementRef(name = "SaleInfo_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> saleInfoSKey;
    @XmlElement(name = "SalesUOM")
    protected Long salesUOM;
    @XmlElementRef(name = "SalesUOM_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> salesUOMSKey;
    @XmlElement(name = "StateUser")
    protected Long stateUser;
    @XmlElementRef(name = "StateUser_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> stateUserSKey;
    @XmlElement(name = "Status")
    protected Long status;
    @XmlElementRef(name = "Status_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> statusSKey;
    @XmlElement(name = "StockCategory")
    protected Long stockCategory;
    @XmlElementRef(name = "StockCategory_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> stockCategorySKey;
    @XmlElement(name = "TradeMark")
    protected Long tradeMark;
    @XmlElementRef(name = "TradeMark_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> tradeMarkSKey;
    @XmlElement(name = "WeightUom")
    protected Long weightUom;
    @XmlElementRef(name = "WeightUom_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> weightUomSKey;
    @XmlElement(name = "m_boundedCategory")
    protected Integer mBoundedCategory;
    @XmlElement(name = "m_boundedCountTaxRate")
    protected BigDecimal mBoundedCountTaxRate;
    @XmlElement(name = "m_boundedCountToLerance")
    protected BigDecimal mBoundedCountToLerance;
    @XmlElementRef(name = "m_boundedTaxNO", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mBoundedTaxNO;
    @XmlElementRef(name = "m_catalogNO", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mCatalogNO;
    @XmlElementRef(name = "m_code", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mCode;
    @XmlElementRef(name = "m_code1", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mCode1;
    @XmlElementRef(name = "m_code2", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mCode2;
    @XmlElement(name = "m_converRatioRule")
    protected Integer mConverRatioRule;
    @XmlElementRef(name = "m_createdBy", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mCreatedBy;
    @XmlElement(name = "m_createdOn")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mCreatedOn;
    @XmlElementRef(name = "m_customNumber", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mCustomNumber;
    @XmlElement(name = "m_customTaxRate")
    protected BigDecimal mCustomTaxRate;
    @XmlElementRef(name = "m_descFlexField", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9BaseFlexFieldDescFlexFieldDescFlexSegmentsData> mDescFlexField;
    @XmlElement(name = "m_drawbackRate")
    protected BigDecimal mDrawbackRate;
    @XmlElementRef(name = "m_effective", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9BasePropertyTypesEffectiveData> mEffective;
    @XmlElement(name = "m_endGrade")
    protected Integer mEndGrade;
    @XmlElement(name = "m_endPotency")
    protected Integer mEndPotency;
    @XmlElementRef(name = "m_entranceInfo", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9CBOSCMItemEntranceInfoData> mEntranceInfo;
    @XmlElement(name = "m_iD")
    protected Long mid;
    @XmlElementRef(name = "m_inspectionInfo", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9CBOSCMItemItemInspectionInfoData> mInspectionInfo;
    @XmlElement(name = "m_internalTransCost")
    protected BigDecimal mInternalTransCost;
    @XmlElementRef(name = "m_inventoryInfo", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9CBOSCMItemItemInvInfoData> mInventoryInfo;
    @XmlElement(name = "m_inventoryUOMGroup")
    protected Integer mInventoryUOMGroup;
    @XmlElement(name = "m_isBOMEnable")
    protected Boolean mIsBOMEnable;
    @XmlElement(name = "m_isBounded")
    protected Boolean mIsBounded;
    @XmlElement(name = "m_isBuildEnable")
    protected Boolean mIsBuildEnable;
    @XmlElement(name = "m_isCanFlowStat")
    protected Boolean mIsCanFlowStat;
    @XmlElement(name = "m_isCostCalByGrade")
    protected Boolean mIsCostCalByGrade;
    @XmlElement(name = "m_isCostCalByPotency")
    protected Boolean mIsCostCalByPotency;
    @XmlElement(name = "m_isDualQuantity")
    protected Boolean mIsDualQuantity;
    @XmlElement(name = "m_isDualUOM")
    protected Boolean mIsDualUOM;
    @XmlElement(name = "m_isGradeControl")
    protected Boolean mIsGradeControl;
    @XmlElement(name = "m_isIncludedCostCa")
    protected Boolean mIsIncludedCostCa;
    @XmlElement(name = "m_isIncludedStockAsset")
    protected Boolean mIsIncludedStockAsset;
    @XmlElement(name = "m_isInventoryEnable")
    protected Boolean mIsInventoryEnable;
    @XmlElement(name = "m_isMISC")
    protected Boolean mIsMISC;
    @XmlElement(name = "m_isMRPEnable")
    protected Boolean mIsMRPEnable;
    @XmlElement(name = "m_isMultyUOM")
    protected Boolean mIsMultyUOM;
    @XmlElement(name = "m_isNeedLicence")
    protected Boolean mIsNeedLicence;
    @XmlElement(name = "m_isOutsideOperationEnable")
    protected Boolean mIsOutsideOperationEnable;
    @XmlElement(name = "m_isPotencyControl")
    protected Boolean mIsPotencyControl;
    @XmlElement(name = "m_isPurchaseEnable")
    protected Boolean mIsPurchaseEnable;
    @XmlElement(name = "m_isSalesEnable")
    protected Boolean mIsSalesEnable;
    @XmlElement(name = "m_isSpecialItem")
    protected Boolean mIsSpecialItem;
    @XmlElement(name = "m_isSyncQuantity")
    protected Boolean mIsSyncQuantity;
    @XmlElement(name = "m_isTrademark")
    protected Boolean mIsTrademark;
    @XmlElement(name = "m_isVMIEnable")
    protected Boolean mIsVMIEnable;
    @XmlElement(name = "m_isVarRatio")
    protected Boolean mIsVarRatio;
    @XmlElement(name = "m_isVersionQtyControl")
    protected Boolean mIsVersionQtyControl;
    @XmlElement(name = "m_itemBulk")
    protected BigDecimal mItemBulk;
    @XmlElementRef(name = "m_itemConvertRatioInClasses", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfUFIDAU9CBOSCMItemItemConvertRatioInClassData> mItemConvertRatioInClasses;
    @XmlElementRef(name = "m_itemConvertRatioOverClasses", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfUFIDAU9CBOSCMItemItemConvertRatioOverClassData> mItemConvertRatioOverClasses;
    @XmlElement(name = "m_itemForm")
    protected Integer mItemForm;
    @XmlElement(name = "m_itemFormAttribute")
    protected Integer mItemFormAttribute;
    @XmlElementRef(name = "m_itemFreeDefs", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfUFIDAU9CBOSCMItemItemFreeDefData> mItemFreeDefs;
    @XmlElementRef(name = "m_itemMasterVersions", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfUFIDAU9CBOSCMItemItemMasterVersionData> mItemMasterVersions;
    @XmlElementRef(name = "m_itemTradeMarks", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfUFIDAU9CBOSCMItemItemTradeMarkData> mItemTradeMarks;
    @XmlElementRef(name = "m_mFGWasteInfos", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfUFIDAU9CBOSCMItemMFGWasteInfoData> mmfgWasteInfos;
    @XmlElementRef(name = "m_mfgInfo", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9CBOSCMItemItemMFGInfoData> mMfgInfo;
    @XmlElementRef(name = "m_modifiedBy", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mModifiedBy;
    @XmlElement(name = "m_modifiedOn")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mModifiedOn;
    @XmlElementRef(name = "m_mrpInfo", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9CBOSCMItemItemMRPInfoData> mMrpInfo;
    @XmlElementRef(name = "m_name", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mName;
    @XmlElementRef(name = "m_nameSegment1", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mNameSegment1;
    @XmlElementRef(name = "m_nameSegment10", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mNameSegment10;
    @XmlElementRef(name = "m_nameSegment11", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mNameSegment11;
    @XmlElementRef(name = "m_nameSegment12", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mNameSegment12;
    @XmlElementRef(name = "m_nameSegment13", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mNameSegment13;
    @XmlElementRef(name = "m_nameSegment14", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mNameSegment14;
    @XmlElementRef(name = "m_nameSegment15", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mNameSegment15;
    @XmlElementRef(name = "m_nameSegment16", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mNameSegment16;
    @XmlElementRef(name = "m_nameSegment17", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mNameSegment17;
    @XmlElementRef(name = "m_nameSegment18", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mNameSegment18;
    @XmlElementRef(name = "m_nameSegment19", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mNameSegment19;
    @XmlElementRef(name = "m_nameSegment2", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mNameSegment2;
    @XmlElementRef(name = "m_nameSegment20", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mNameSegment20;
    @XmlElementRef(name = "m_nameSegment21", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mNameSegment21;
    @XmlElementRef(name = "m_nameSegment22", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mNameSegment22;
    @XmlElementRef(name = "m_nameSegment23", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mNameSegment23;
    @XmlElementRef(name = "m_nameSegment24", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mNameSegment24;
    @XmlElementRef(name = "m_nameSegment25", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mNameSegment25;
    @XmlElementRef(name = "m_nameSegment26", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mNameSegment26;
    @XmlElementRef(name = "m_nameSegment27", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mNameSegment27;
    @XmlElementRef(name = "m_nameSegment28", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mNameSegment28;
    @XmlElementRef(name = "m_nameSegment29", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mNameSegment29;
    @XmlElementRef(name = "m_nameSegment3", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mNameSegment3;
    @XmlElementRef(name = "m_nameSegment30", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mNameSegment30;
    @XmlElementRef(name = "m_nameSegment4", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mNameSegment4;
    @XmlElementRef(name = "m_nameSegment5", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mNameSegment5;
    @XmlElementRef(name = "m_nameSegment6", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mNameSegment6;
    @XmlElementRef(name = "m_nameSegment7", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mNameSegment7;
    @XmlElementRef(name = "m_nameSegment8", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mNameSegment8;
    @XmlElementRef(name = "m_nameSegment9", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mNameSegment9;
    @XmlElement(name = "m_needInspect")
    protected Boolean mNeedInspect;
    @XmlElementRef(name = "m_pLMID", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mplmid;
    @XmlElementRef(name = "m_picture", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<byte[]> mPicture;
    @XmlElement(name = "m_planCost")
    protected BigDecimal mPlanCost;
    @XmlElementRef(name = "m_purchaseInfo", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9CBOSCMItemItemPurchaseInfoData> mPurchaseInfo;
    @XmlElement(name = "m_recentlyCost")
    protected BigDecimal mRecentlyCost;
    @XmlElement(name = "m_refrenceCost")
    protected BigDecimal mRefrenceCost;
    @XmlElementRef(name = "m_sPECS", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mspecs;
    @XmlElementRef(name = "m_saleInfo", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9CBOSCMItemItemSaleInfoData> mSaleInfo;
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
    @XmlElement(name = "m_standardBatchQty")
    protected BigDecimal mStandardBatchQty;
    @XmlElement(name = "m_standardCost")
    protected BigDecimal mStandardCost;
    @XmlElement(name = "m_standardGrade")
    protected Integer mStandardGrade;
    @XmlElement(name = "m_standardPotency")
    protected Integer mStandardPotency;
    @XmlElement(name = "m_startGrade")
    protected Integer mStartGrade;
    @XmlElement(name = "m_startPotency")
    protected Integer mStartPotency;
    @XmlElement(name = "m_state")
    protected Integer mState;
    @XmlElement(name = "m_stateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mStateTime;
    @XmlElement(name = "m_statusLastModify")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mStatusLastModify;
    @XmlElement(name = "m_sysVersion")
    protected Long mSysVersion;
    @XmlElementRef(name = "m_version", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mVersion;
    @XmlElement(name = "m_versionID")
    protected Long mVersionID;
    @XmlElement(name = "m_weight")
    protected BigDecimal mWeight;

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
     * 获取assetCategory属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAssetCategory() {
        return assetCategory;
    }

    /**
     * 设置assetCategory属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAssetCategory(Long value) {
        this.assetCategory = value;
    }

    /**
     * 获取assetCategorySKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getAssetCategorySKey() {
        return assetCategorySKey;
    }

    /**
     * 设置assetCategorySKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setAssetCategorySKey(JAXBElement<EntityKey> value) {
        this.assetCategorySKey = value;
    }

    /**
     * 获取bulkUom属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getBulkUom() {
        return bulkUom;
    }

    /**
     * 设置bulkUom属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setBulkUom(Long value) {
        this.bulkUom = value;
    }

    /**
     * 获取bulkUomSKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getBulkUomSKey() {
        return bulkUomSKey;
    }

    /**
     * 设置bulkUomSKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setBulkUomSKey(JAXBElement<EntityKey> value) {
        this.bulkUomSKey = value;
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
     * 获取costCategory属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCostCategory() {
        return costCategory;
    }

    /**
     * 设置costCategory属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCostCategory(Long value) {
        this.costCategory = value;
    }

    /**
     * 获取costCategorySKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getCostCategorySKey() {
        return costCategorySKey;
    }

    /**
     * 设置costCategorySKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setCostCategorySKey(JAXBElement<EntityKey> value) {
        this.costCategorySKey = value;
    }

    /**
     * 获取costCurrency属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCostCurrency() {
        return costCurrency;
    }

    /**
     * 设置costCurrency属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCostCurrency(Long value) {
        this.costCurrency = value;
    }

    /**
     * 获取costCurrencySKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getCostCurrencySKey() {
        return costCurrencySKey;
    }

    /**
     * 设置costCurrencySKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setCostCurrencySKey(JAXBElement<EntityKey> value) {
        this.costCurrencySKey = value;
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
     * 获取creditCategory属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCreditCategory() {
        return creditCategory;
    }

    /**
     * 设置creditCategory属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCreditCategory(Long value) {
        this.creditCategory = value;
    }

    /**
     * 获取creditCategorySKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getCreditCategorySKey() {
        return creditCategorySKey;
    }

    /**
     * 设置creditCategorySKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setCreditCategorySKey(JAXBElement<EntityKey> value) {
        this.creditCategorySKey = value;
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
     * 获取entranceInfoSKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getEntranceInfoSKey() {
        return entranceInfoSKey;
    }

    /**
     * 设置entranceInfoSKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setEntranceInfoSKey(JAXBElement<EntityKey> value) {
        this.entranceInfoSKey = value;
    }

    /**
     * 获取freeItem1属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getFreeItem1() {
        return freeItem1;
    }

    /**
     * 设置freeItem1属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFreeItem1(Long value) {
        this.freeItem1 = value;
    }

    /**
     * 获取freeItem1SKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getFreeItem1SKey() {
        return freeItem1SKey;
    }

    /**
     * 设置freeItem1SKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setFreeItem1SKey(JAXBElement<EntityKey> value) {
        this.freeItem1SKey = value;
    }

    /**
     * 获取freeItem2属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getFreeItem2() {
        return freeItem2;
    }

    /**
     * 设置freeItem2属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFreeItem2(Long value) {
        this.freeItem2 = value;
    }

    /**
     * 获取freeItem2SKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getFreeItem2SKey() {
        return freeItem2SKey;
    }

    /**
     * 设置freeItem2SKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setFreeItem2SKey(JAXBElement<EntityKey> value) {
        this.freeItem2SKey = value;
    }

    /**
     * 获取freeItem3属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getFreeItem3() {
        return freeItem3;
    }

    /**
     * 设置freeItem3属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFreeItem3(Long value) {
        this.freeItem3 = value;
    }

    /**
     * 获取freeItem3SKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getFreeItem3SKey() {
        return freeItem3SKey;
    }

    /**
     * 设置freeItem3SKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setFreeItem3SKey(JAXBElement<EntityKey> value) {
        this.freeItem3SKey = value;
    }

    /**
     * 获取inspectionInfoSKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getInspectionInfoSKey() {
        return inspectionInfoSKey;
    }

    /**
     * 设置inspectionInfoSKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setInspectionInfoSKey(JAXBElement<EntityKey> value) {
        this.inspectionInfoSKey = value;
    }

    /**
     * 获取inventoryInfoSKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getInventoryInfoSKey() {
        return inventoryInfoSKey;
    }

    /**
     * 设置inventoryInfoSKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setInventoryInfoSKey(JAXBElement<EntityKey> value) {
        this.inventoryInfoSKey = value;
    }

    /**
     * 获取inventorySecondUOM属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getInventorySecondUOM() {
        return inventorySecondUOM;
    }

    /**
     * 设置inventorySecondUOM属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setInventorySecondUOM(Long value) {
        this.inventorySecondUOM = value;
    }

    /**
     * 获取inventorySecondUOMSKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getInventorySecondUOMSKey() {
        return inventorySecondUOMSKey;
    }

    /**
     * 设置inventorySecondUOMSKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setInventorySecondUOMSKey(JAXBElement<EntityKey> value) {
        this.inventorySecondUOMSKey = value;
    }

    /**
     * 获取inventoryUOM属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getInventoryUOM() {
        return inventoryUOM;
    }

    /**
     * 设置inventoryUOM属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setInventoryUOM(Long value) {
        this.inventoryUOM = value;
    }

    /**
     * 获取inventoryUOMSKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getInventoryUOMSKey() {
        return inventoryUOMSKey;
    }

    /**
     * 设置inventoryUOMSKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setInventoryUOMSKey(JAXBElement<EntityKey> value) {
        this.inventoryUOMSKey = value;
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
     * 获取mrpCategory属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMRPCategory() {
        return mrpCategory;
    }

    /**
     * 设置mrpCategory属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMRPCategory(Long value) {
        this.mrpCategory = value;
    }

    /**
     * 获取mrpCategorySKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getMRPCategorySKey() {
        return mrpCategorySKey;
    }

    /**
     * 设置mrpCategorySKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setMRPCategorySKey(JAXBElement<EntityKey> value) {
        this.mrpCategorySKey = value;
    }

    /**
     * 获取mainItemCategory属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMainItemCategory() {
        return mainItemCategory;
    }

    /**
     * 设置mainItemCategory属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMainItemCategory(Long value) {
        this.mainItemCategory = value;
    }

    /**
     * 获取mainItemCategorySKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getMainItemCategorySKey() {
        return mainItemCategorySKey;
    }

    /**
     * 设置mainItemCategorySKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setMainItemCategorySKey(JAXBElement<EntityKey> value) {
        this.mainItemCategorySKey = value;
    }

    /**
     * 获取manufactureUOM属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getManufactureUOM() {
        return manufactureUOM;
    }

    /**
     * 设置manufactureUOM属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setManufactureUOM(Long value) {
        this.manufactureUOM = value;
    }

    /**
     * 获取manufactureUOMSKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getManufactureUOMSKey() {
        return manufactureUOMSKey;
    }

    /**
     * 设置manufactureUOMSKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setManufactureUOMSKey(JAXBElement<EntityKey> value) {
        this.manufactureUOMSKey = value;
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
     * 获取materialOutUOM属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMaterialOutUOM() {
        return materialOutUOM;
    }

    /**
     * 设置materialOutUOM属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMaterialOutUOM(Long value) {
        this.materialOutUOM = value;
    }

    /**
     * 获取materialOutUOMSKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getMaterialOutUOMSKey() {
        return materialOutUOMSKey;
    }

    /**
     * 设置materialOutUOMSKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setMaterialOutUOMSKey(JAXBElement<EntityKey> value) {
        this.materialOutUOMSKey = value;
    }

    /**
     * 获取mfgInfoSKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getMfgInfoSKey() {
        return mfgInfoSKey;
    }

    /**
     * 设置mfgInfoSKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setMfgInfoSKey(JAXBElement<EntityKey> value) {
        this.mfgInfoSKey = value;
    }

    /**
     * 获取mrpInfoSKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getMrpInfoSKey() {
        return mrpInfoSKey;
    }

    /**
     * 设置mrpInfoSKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setMrpInfoSKey(JAXBElement<EntityKey> value) {
        this.mrpInfoSKey = value;
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
     * 获取multiNameCombineName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MultiLangDataDict }{@code >}
     *     
     */
    public JAXBElement<MultiLangDataDict> getMultiNameCombineName() {
        return multiNameCombineName;
    }

    /**
     * 设置multiNameCombineName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MultiLangDataDict }{@code >}
     *     
     */
    public void setMultiNameCombineName(JAXBElement<MultiLangDataDict> value) {
        this.multiNameCombineName = value;
    }

    /**
     * 获取nameCombineName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNameCombineName() {
        return nameCombineName;
    }

    /**
     * 设置nameCombineName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNameCombineName(JAXBElement<String> value) {
        this.nameCombineName = value;
    }

    /**
     * 获取nameKeyFlexFieldStru属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNameKeyFlexFieldStru() {
        return nameKeyFlexFieldStru;
    }

    /**
     * 设置nameKeyFlexFieldStru属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNameKeyFlexFieldStru(Long value) {
        this.nameKeyFlexFieldStru = value;
    }

    /**
     * 获取nameKeyFlexFieldStruSKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getNameKeyFlexFieldStruSKey() {
        return nameKeyFlexFieldStruSKey;
    }

    /**
     * 设置nameKeyFlexFieldStruSKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setNameKeyFlexFieldStruSKey(JAXBElement<EntityKey> value) {
        this.nameKeyFlexFieldStruSKey = value;
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
     * 获取priceCategory属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPriceCategory() {
        return priceCategory;
    }

    /**
     * 设置priceCategory属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPriceCategory(Long value) {
        this.priceCategory = value;
    }

    /**
     * 获取priceCategorySKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getPriceCategorySKey() {
        return priceCategorySKey;
    }

    /**
     * 设置priceCategorySKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setPriceCategorySKey(JAXBElement<EntityKey> value) {
        this.priceCategorySKey = value;
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
     * 获取productionCategory属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getProductionCategory() {
        return productionCategory;
    }

    /**
     * 设置productionCategory属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setProductionCategory(Long value) {
        this.productionCategory = value;
    }

    /**
     * 获取productionCategorySKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getProductionCategorySKey() {
        return productionCategorySKey;
    }

    /**
     * 设置productionCategorySKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setProductionCategorySKey(JAXBElement<EntityKey> value) {
        this.productionCategorySKey = value;
    }

    /**
     * 获取purchaseCategory属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPurchaseCategory() {
        return purchaseCategory;
    }

    /**
     * 设置purchaseCategory属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPurchaseCategory(Long value) {
        this.purchaseCategory = value;
    }

    /**
     * 获取purchaseCategorySKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getPurchaseCategorySKey() {
        return purchaseCategorySKey;
    }

    /**
     * 设置purchaseCategorySKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setPurchaseCategorySKey(JAXBElement<EntityKey> value) {
        this.purchaseCategorySKey = value;
    }

    /**
     * 获取purchaseInfoSKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getPurchaseInfoSKey() {
        return purchaseInfoSKey;
    }

    /**
     * 设置purchaseInfoSKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setPurchaseInfoSKey(JAXBElement<EntityKey> value) {
        this.purchaseInfoSKey = value;
    }

    /**
     * 获取purchaseUOM属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPurchaseUOM() {
        return purchaseUOM;
    }

    /**
     * 设置purchaseUOM属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPurchaseUOM(Long value) {
        this.purchaseUOM = value;
    }

    /**
     * 获取purchaseUOMSKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getPurchaseUOMSKey() {
        return purchaseUOMSKey;
    }

    /**
     * 设置purchaseUOMSKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setPurchaseUOMSKey(JAXBElement<EntityKey> value) {
        this.purchaseUOMSKey = value;
    }

    /**
     * 获取saleCategory属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSaleCategory() {
        return saleCategory;
    }

    /**
     * 设置saleCategory属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSaleCategory(Long value) {
        this.saleCategory = value;
    }

    /**
     * 获取saleCategorySKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getSaleCategorySKey() {
        return saleCategorySKey;
    }

    /**
     * 设置saleCategorySKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setSaleCategorySKey(JAXBElement<EntityKey> value) {
        this.saleCategorySKey = value;
    }

    /**
     * 获取saleInfoSKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getSaleInfoSKey() {
        return saleInfoSKey;
    }

    /**
     * 设置saleInfoSKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setSaleInfoSKey(JAXBElement<EntityKey> value) {
        this.saleInfoSKey = value;
    }

    /**
     * 获取salesUOM属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSalesUOM() {
        return salesUOM;
    }

    /**
     * 设置salesUOM属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSalesUOM(Long value) {
        this.salesUOM = value;
    }

    /**
     * 获取salesUOMSKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getSalesUOMSKey() {
        return salesUOMSKey;
    }

    /**
     * 设置salesUOMSKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setSalesUOMSKey(JAXBElement<EntityKey> value) {
        this.salesUOMSKey = value;
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
     * 获取status属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getStatus() {
        return status;
    }

    /**
     * 设置status属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setStatus(Long value) {
        this.status = value;
    }

    /**
     * 获取statusSKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getStatusSKey() {
        return statusSKey;
    }

    /**
     * 设置statusSKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setStatusSKey(JAXBElement<EntityKey> value) {
        this.statusSKey = value;
    }

    /**
     * 获取stockCategory属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getStockCategory() {
        return stockCategory;
    }

    /**
     * 设置stockCategory属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setStockCategory(Long value) {
        this.stockCategory = value;
    }

    /**
     * 获取stockCategorySKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getStockCategorySKey() {
        return stockCategorySKey;
    }

    /**
     * 设置stockCategorySKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setStockCategorySKey(JAXBElement<EntityKey> value) {
        this.stockCategorySKey = value;
    }

    /**
     * 获取tradeMark属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTradeMark() {
        return tradeMark;
    }

    /**
     * 设置tradeMark属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTradeMark(Long value) {
        this.tradeMark = value;
    }

    /**
     * 获取tradeMarkSKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getTradeMarkSKey() {
        return tradeMarkSKey;
    }

    /**
     * 设置tradeMarkSKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setTradeMarkSKey(JAXBElement<EntityKey> value) {
        this.tradeMarkSKey = value;
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
     * 获取mBoundedCategory属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMBoundedCategory() {
        return mBoundedCategory;
    }

    /**
     * 设置mBoundedCategory属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMBoundedCategory(Integer value) {
        this.mBoundedCategory = value;
    }

    /**
     * 获取mBoundedCountTaxRate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMBoundedCountTaxRate() {
        return mBoundedCountTaxRate;
    }

    /**
     * 设置mBoundedCountTaxRate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMBoundedCountTaxRate(BigDecimal value) {
        this.mBoundedCountTaxRate = value;
    }

    /**
     * 获取mBoundedCountToLerance属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMBoundedCountToLerance() {
        return mBoundedCountToLerance;
    }

    /**
     * 设置mBoundedCountToLerance属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMBoundedCountToLerance(BigDecimal value) {
        this.mBoundedCountToLerance = value;
    }

    /**
     * 获取mBoundedTaxNO属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMBoundedTaxNO() {
        return mBoundedTaxNO;
    }

    /**
     * 设置mBoundedTaxNO属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMBoundedTaxNO(JAXBElement<String> value) {
        this.mBoundedTaxNO = value;
    }

    /**
     * 获取mCatalogNO属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMCatalogNO() {
        return mCatalogNO;
    }

    /**
     * 设置mCatalogNO属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMCatalogNO(JAXBElement<String> value) {
        this.mCatalogNO = value;
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
     * 获取mCode1属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMCode1() {
        return mCode1;
    }

    /**
     * 设置mCode1属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMCode1(JAXBElement<String> value) {
        this.mCode1 = value;
    }

    /**
     * 获取mCode2属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMCode2() {
        return mCode2;
    }

    /**
     * 设置mCode2属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMCode2(JAXBElement<String> value) {
        this.mCode2 = value;
    }

    /**
     * 获取mConverRatioRule属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMConverRatioRule() {
        return mConverRatioRule;
    }

    /**
     * 设置mConverRatioRule属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMConverRatioRule(Integer value) {
        this.mConverRatioRule = value;
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
     * 获取mCustomNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMCustomNumber() {
        return mCustomNumber;
    }

    /**
     * 设置mCustomNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMCustomNumber(JAXBElement<String> value) {
        this.mCustomNumber = value;
    }

    /**
     * 获取mCustomTaxRate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMCustomTaxRate() {
        return mCustomTaxRate;
    }

    /**
     * 设置mCustomTaxRate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMCustomTaxRate(BigDecimal value) {
        this.mCustomTaxRate = value;
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
     * 获取mDrawbackRate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMDrawbackRate() {
        return mDrawbackRate;
    }

    /**
     * 设置mDrawbackRate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMDrawbackRate(BigDecimal value) {
        this.mDrawbackRate = value;
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
     * 获取mEndGrade属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMEndGrade() {
        return mEndGrade;
    }

    /**
     * 设置mEndGrade属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMEndGrade(Integer value) {
        this.mEndGrade = value;
    }

    /**
     * 获取mEndPotency属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMEndPotency() {
        return mEndPotency;
    }

    /**
     * 设置mEndPotency属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMEndPotency(Integer value) {
        this.mEndPotency = value;
    }

    /**
     * 获取mEntranceInfo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOSCMItemEntranceInfoData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9CBOSCMItemEntranceInfoData> getMEntranceInfo() {
        return mEntranceInfo;
    }

    /**
     * 设置mEntranceInfo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOSCMItemEntranceInfoData }{@code >}
     *     
     */
    public void setMEntranceInfo(JAXBElement<UFIDAU9CBOSCMItemEntranceInfoData> value) {
        this.mEntranceInfo = value;
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
     * 获取mInspectionInfo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOSCMItemItemInspectionInfoData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9CBOSCMItemItemInspectionInfoData> getMInspectionInfo() {
        return mInspectionInfo;
    }

    /**
     * 设置mInspectionInfo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOSCMItemItemInspectionInfoData }{@code >}
     *     
     */
    public void setMInspectionInfo(JAXBElement<UFIDAU9CBOSCMItemItemInspectionInfoData> value) {
        this.mInspectionInfo = value;
    }

    /**
     * 获取mInternalTransCost属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMInternalTransCost() {
        return mInternalTransCost;
    }

    /**
     * 设置mInternalTransCost属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMInternalTransCost(BigDecimal value) {
        this.mInternalTransCost = value;
    }

    /**
     * 获取mInventoryInfo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOSCMItemItemInvInfoData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9CBOSCMItemItemInvInfoData> getMInventoryInfo() {
        return mInventoryInfo;
    }

    /**
     * 设置mInventoryInfo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOSCMItemItemInvInfoData }{@code >}
     *     
     */
    public void setMInventoryInfo(JAXBElement<UFIDAU9CBOSCMItemItemInvInfoData> value) {
        this.mInventoryInfo = value;
    }

    /**
     * 获取mInventoryUOMGroup属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMInventoryUOMGroup() {
        return mInventoryUOMGroup;
    }

    /**
     * 设置mInventoryUOMGroup属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMInventoryUOMGroup(Integer value) {
        this.mInventoryUOMGroup = value;
    }

    /**
     * 获取mIsBOMEnable属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsBOMEnable() {
        return mIsBOMEnable;
    }

    /**
     * 设置mIsBOMEnable属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsBOMEnable(Boolean value) {
        this.mIsBOMEnable = value;
    }

    /**
     * 获取mIsBounded属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsBounded() {
        return mIsBounded;
    }

    /**
     * 设置mIsBounded属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsBounded(Boolean value) {
        this.mIsBounded = value;
    }

    /**
     * 获取mIsBuildEnable属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsBuildEnable() {
        return mIsBuildEnable;
    }

    /**
     * 设置mIsBuildEnable属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsBuildEnable(Boolean value) {
        this.mIsBuildEnable = value;
    }

    /**
     * 获取mIsCanFlowStat属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsCanFlowStat() {
        return mIsCanFlowStat;
    }

    /**
     * 设置mIsCanFlowStat属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsCanFlowStat(Boolean value) {
        this.mIsCanFlowStat = value;
    }

    /**
     * 获取mIsCostCalByGrade属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsCostCalByGrade() {
        return mIsCostCalByGrade;
    }

    /**
     * 设置mIsCostCalByGrade属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsCostCalByGrade(Boolean value) {
        this.mIsCostCalByGrade = value;
    }

    /**
     * 获取mIsCostCalByPotency属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsCostCalByPotency() {
        return mIsCostCalByPotency;
    }

    /**
     * 设置mIsCostCalByPotency属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsCostCalByPotency(Boolean value) {
        this.mIsCostCalByPotency = value;
    }

    /**
     * 获取mIsDualQuantity属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsDualQuantity() {
        return mIsDualQuantity;
    }

    /**
     * 设置mIsDualQuantity属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsDualQuantity(Boolean value) {
        this.mIsDualQuantity = value;
    }

    /**
     * 获取mIsDualUOM属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsDualUOM() {
        return mIsDualUOM;
    }

    /**
     * 设置mIsDualUOM属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsDualUOM(Boolean value) {
        this.mIsDualUOM = value;
    }

    /**
     * 获取mIsGradeControl属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsGradeControl() {
        return mIsGradeControl;
    }

    /**
     * 设置mIsGradeControl属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsGradeControl(Boolean value) {
        this.mIsGradeControl = value;
    }

    /**
     * 获取mIsIncludedCostCa属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsIncludedCostCa() {
        return mIsIncludedCostCa;
    }

    /**
     * 设置mIsIncludedCostCa属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsIncludedCostCa(Boolean value) {
        this.mIsIncludedCostCa = value;
    }

    /**
     * 获取mIsIncludedStockAsset属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsIncludedStockAsset() {
        return mIsIncludedStockAsset;
    }

    /**
     * 设置mIsIncludedStockAsset属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsIncludedStockAsset(Boolean value) {
        this.mIsIncludedStockAsset = value;
    }

    /**
     * 获取mIsInventoryEnable属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsInventoryEnable() {
        return mIsInventoryEnable;
    }

    /**
     * 设置mIsInventoryEnable属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsInventoryEnable(Boolean value) {
        this.mIsInventoryEnable = value;
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
     * 获取mIsMRPEnable属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsMRPEnable() {
        return mIsMRPEnable;
    }

    /**
     * 设置mIsMRPEnable属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsMRPEnable(Boolean value) {
        this.mIsMRPEnable = value;
    }

    /**
     * 获取mIsMultyUOM属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsMultyUOM() {
        return mIsMultyUOM;
    }

    /**
     * 设置mIsMultyUOM属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsMultyUOM(Boolean value) {
        this.mIsMultyUOM = value;
    }

    /**
     * 获取mIsNeedLicence属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsNeedLicence() {
        return mIsNeedLicence;
    }

    /**
     * 设置mIsNeedLicence属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsNeedLicence(Boolean value) {
        this.mIsNeedLicence = value;
    }

    /**
     * 获取mIsOutsideOperationEnable属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsOutsideOperationEnable() {
        return mIsOutsideOperationEnable;
    }

    /**
     * 设置mIsOutsideOperationEnable属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsOutsideOperationEnable(Boolean value) {
        this.mIsOutsideOperationEnable = value;
    }

    /**
     * 获取mIsPotencyControl属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsPotencyControl() {
        return mIsPotencyControl;
    }

    /**
     * 设置mIsPotencyControl属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsPotencyControl(Boolean value) {
        this.mIsPotencyControl = value;
    }

    /**
     * 获取mIsPurchaseEnable属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsPurchaseEnable() {
        return mIsPurchaseEnable;
    }

    /**
     * 设置mIsPurchaseEnable属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsPurchaseEnable(Boolean value) {
        this.mIsPurchaseEnable = value;
    }

    /**
     * 获取mIsSalesEnable属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsSalesEnable() {
        return mIsSalesEnable;
    }

    /**
     * 设置mIsSalesEnable属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsSalesEnable(Boolean value) {
        this.mIsSalesEnable = value;
    }

    /**
     * 获取mIsSpecialItem属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsSpecialItem() {
        return mIsSpecialItem;
    }

    /**
     * 设置mIsSpecialItem属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsSpecialItem(Boolean value) {
        this.mIsSpecialItem = value;
    }

    /**
     * 获取mIsSyncQuantity属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsSyncQuantity() {
        return mIsSyncQuantity;
    }

    /**
     * 设置mIsSyncQuantity属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsSyncQuantity(Boolean value) {
        this.mIsSyncQuantity = value;
    }

    /**
     * 获取mIsTrademark属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsTrademark() {
        return mIsTrademark;
    }

    /**
     * 设置mIsTrademark属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsTrademark(Boolean value) {
        this.mIsTrademark = value;
    }

    /**
     * 获取mIsVMIEnable属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsVMIEnable() {
        return mIsVMIEnable;
    }

    /**
     * 设置mIsVMIEnable属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsVMIEnable(Boolean value) {
        this.mIsVMIEnable = value;
    }

    /**
     * 获取mIsVarRatio属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsVarRatio() {
        return mIsVarRatio;
    }

    /**
     * 设置mIsVarRatio属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsVarRatio(Boolean value) {
        this.mIsVarRatio = value;
    }

    /**
     * 获取mIsVersionQtyControl属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsVersionQtyControl() {
        return mIsVersionQtyControl;
    }

    /**
     * 设置mIsVersionQtyControl属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsVersionQtyControl(Boolean value) {
        this.mIsVersionQtyControl = value;
    }

    /**
     * 获取mItemBulk属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMItemBulk() {
        return mItemBulk;
    }

    /**
     * 设置mItemBulk属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMItemBulk(BigDecimal value) {
        this.mItemBulk = value;
    }

    /**
     * 获取mItemConvertRatioInClasses属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUFIDAU9CBOSCMItemItemConvertRatioInClassData }{@code >}
     *     
     */
    public JAXBElement<ArrayOfUFIDAU9CBOSCMItemItemConvertRatioInClassData> getMItemConvertRatioInClasses() {
        return mItemConvertRatioInClasses;
    }

    /**
     * 设置mItemConvertRatioInClasses属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUFIDAU9CBOSCMItemItemConvertRatioInClassData }{@code >}
     *     
     */
    public void setMItemConvertRatioInClasses(JAXBElement<ArrayOfUFIDAU9CBOSCMItemItemConvertRatioInClassData> value) {
        this.mItemConvertRatioInClasses = value;
    }

    /**
     * 获取mItemConvertRatioOverClasses属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUFIDAU9CBOSCMItemItemConvertRatioOverClassData }{@code >}
     *     
     */
    public JAXBElement<ArrayOfUFIDAU9CBOSCMItemItemConvertRatioOverClassData> getMItemConvertRatioOverClasses() {
        return mItemConvertRatioOverClasses;
    }

    /**
     * 设置mItemConvertRatioOverClasses属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUFIDAU9CBOSCMItemItemConvertRatioOverClassData }{@code >}
     *     
     */
    public void setMItemConvertRatioOverClasses(JAXBElement<ArrayOfUFIDAU9CBOSCMItemItemConvertRatioOverClassData> value) {
        this.mItemConvertRatioOverClasses = value;
    }

    /**
     * 获取mItemForm属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMItemForm() {
        return mItemForm;
    }

    /**
     * 设置mItemForm属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMItemForm(Integer value) {
        this.mItemForm = value;
    }

    /**
     * 获取mItemFormAttribute属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMItemFormAttribute() {
        return mItemFormAttribute;
    }

    /**
     * 设置mItemFormAttribute属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMItemFormAttribute(Integer value) {
        this.mItemFormAttribute = value;
    }

    /**
     * 获取mItemFreeDefs属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUFIDAU9CBOSCMItemItemFreeDefData }{@code >}
     *     
     */
    public JAXBElement<ArrayOfUFIDAU9CBOSCMItemItemFreeDefData> getMItemFreeDefs() {
        return mItemFreeDefs;
    }

    /**
     * 设置mItemFreeDefs属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUFIDAU9CBOSCMItemItemFreeDefData }{@code >}
     *     
     */
    public void setMItemFreeDefs(JAXBElement<ArrayOfUFIDAU9CBOSCMItemItemFreeDefData> value) {
        this.mItemFreeDefs = value;
    }

    /**
     * 获取mItemMasterVersions属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUFIDAU9CBOSCMItemItemMasterVersionData }{@code >}
     *     
     */
    public JAXBElement<ArrayOfUFIDAU9CBOSCMItemItemMasterVersionData> getMItemMasterVersions() {
        return mItemMasterVersions;
    }

    /**
     * 设置mItemMasterVersions属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUFIDAU9CBOSCMItemItemMasterVersionData }{@code >}
     *     
     */
    public void setMItemMasterVersions(JAXBElement<ArrayOfUFIDAU9CBOSCMItemItemMasterVersionData> value) {
        this.mItemMasterVersions = value;
    }

    /**
     * 获取mItemTradeMarks属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUFIDAU9CBOSCMItemItemTradeMarkData }{@code >}
     *     
     */
    public JAXBElement<ArrayOfUFIDAU9CBOSCMItemItemTradeMarkData> getMItemTradeMarks() {
        return mItemTradeMarks;
    }

    /**
     * 设置mItemTradeMarks属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUFIDAU9CBOSCMItemItemTradeMarkData }{@code >}
     *     
     */
    public void setMItemTradeMarks(JAXBElement<ArrayOfUFIDAU9CBOSCMItemItemTradeMarkData> value) {
        this.mItemTradeMarks = value;
    }

    /**
     * 获取mmfgWasteInfos属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUFIDAU9CBOSCMItemMFGWasteInfoData }{@code >}
     *     
     */
    public JAXBElement<ArrayOfUFIDAU9CBOSCMItemMFGWasteInfoData> getMMFGWasteInfos() {
        return mmfgWasteInfos;
    }

    /**
     * 设置mmfgWasteInfos属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUFIDAU9CBOSCMItemMFGWasteInfoData }{@code >}
     *     
     */
    public void setMMFGWasteInfos(JAXBElement<ArrayOfUFIDAU9CBOSCMItemMFGWasteInfoData> value) {
        this.mmfgWasteInfos = value;
    }

    /**
     * 获取mMfgInfo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOSCMItemItemMFGInfoData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9CBOSCMItemItemMFGInfoData> getMMfgInfo() {
        return mMfgInfo;
    }

    /**
     * 设置mMfgInfo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOSCMItemItemMFGInfoData }{@code >}
     *     
     */
    public void setMMfgInfo(JAXBElement<UFIDAU9CBOSCMItemItemMFGInfoData> value) {
        this.mMfgInfo = value;
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
     * 获取mMrpInfo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOSCMItemItemMRPInfoData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9CBOSCMItemItemMRPInfoData> getMMrpInfo() {
        return mMrpInfo;
    }

    /**
     * 设置mMrpInfo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOSCMItemItemMRPInfoData }{@code >}
     *     
     */
    public void setMMrpInfo(JAXBElement<UFIDAU9CBOSCMItemItemMRPInfoData> value) {
        this.mMrpInfo = value;
    }

    /**
     * 获取mName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMName() {
        return mName;
    }

    /**
     * 设置mName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMName(JAXBElement<String> value) {
        this.mName = value;
    }

    /**
     * 获取mNameSegment1属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMNameSegment1() {
        return mNameSegment1;
    }

    /**
     * 设置mNameSegment1属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMNameSegment1(JAXBElement<String> value) {
        this.mNameSegment1 = value;
    }

    /**
     * 获取mNameSegment10属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMNameSegment10() {
        return mNameSegment10;
    }

    /**
     * 设置mNameSegment10属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMNameSegment10(JAXBElement<String> value) {
        this.mNameSegment10 = value;
    }

    /**
     * 获取mNameSegment11属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMNameSegment11() {
        return mNameSegment11;
    }

    /**
     * 设置mNameSegment11属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMNameSegment11(JAXBElement<String> value) {
        this.mNameSegment11 = value;
    }

    /**
     * 获取mNameSegment12属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMNameSegment12() {
        return mNameSegment12;
    }

    /**
     * 设置mNameSegment12属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMNameSegment12(JAXBElement<String> value) {
        this.mNameSegment12 = value;
    }

    /**
     * 获取mNameSegment13属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMNameSegment13() {
        return mNameSegment13;
    }

    /**
     * 设置mNameSegment13属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMNameSegment13(JAXBElement<String> value) {
        this.mNameSegment13 = value;
    }

    /**
     * 获取mNameSegment14属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMNameSegment14() {
        return mNameSegment14;
    }

    /**
     * 设置mNameSegment14属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMNameSegment14(JAXBElement<String> value) {
        this.mNameSegment14 = value;
    }

    /**
     * 获取mNameSegment15属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMNameSegment15() {
        return mNameSegment15;
    }

    /**
     * 设置mNameSegment15属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMNameSegment15(JAXBElement<String> value) {
        this.mNameSegment15 = value;
    }

    /**
     * 获取mNameSegment16属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMNameSegment16() {
        return mNameSegment16;
    }

    /**
     * 设置mNameSegment16属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMNameSegment16(JAXBElement<String> value) {
        this.mNameSegment16 = value;
    }

    /**
     * 获取mNameSegment17属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMNameSegment17() {
        return mNameSegment17;
    }

    /**
     * 设置mNameSegment17属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMNameSegment17(JAXBElement<String> value) {
        this.mNameSegment17 = value;
    }

    /**
     * 获取mNameSegment18属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMNameSegment18() {
        return mNameSegment18;
    }

    /**
     * 设置mNameSegment18属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMNameSegment18(JAXBElement<String> value) {
        this.mNameSegment18 = value;
    }

    /**
     * 获取mNameSegment19属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMNameSegment19() {
        return mNameSegment19;
    }

    /**
     * 设置mNameSegment19属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMNameSegment19(JAXBElement<String> value) {
        this.mNameSegment19 = value;
    }

    /**
     * 获取mNameSegment2属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMNameSegment2() {
        return mNameSegment2;
    }

    /**
     * 设置mNameSegment2属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMNameSegment2(JAXBElement<String> value) {
        this.mNameSegment2 = value;
    }

    /**
     * 获取mNameSegment20属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMNameSegment20() {
        return mNameSegment20;
    }

    /**
     * 设置mNameSegment20属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMNameSegment20(JAXBElement<String> value) {
        this.mNameSegment20 = value;
    }

    /**
     * 获取mNameSegment21属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMNameSegment21() {
        return mNameSegment21;
    }

    /**
     * 设置mNameSegment21属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMNameSegment21(JAXBElement<String> value) {
        this.mNameSegment21 = value;
    }

    /**
     * 获取mNameSegment22属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMNameSegment22() {
        return mNameSegment22;
    }

    /**
     * 设置mNameSegment22属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMNameSegment22(JAXBElement<String> value) {
        this.mNameSegment22 = value;
    }

    /**
     * 获取mNameSegment23属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMNameSegment23() {
        return mNameSegment23;
    }

    /**
     * 设置mNameSegment23属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMNameSegment23(JAXBElement<String> value) {
        this.mNameSegment23 = value;
    }

    /**
     * 获取mNameSegment24属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMNameSegment24() {
        return mNameSegment24;
    }

    /**
     * 设置mNameSegment24属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMNameSegment24(JAXBElement<String> value) {
        this.mNameSegment24 = value;
    }

    /**
     * 获取mNameSegment25属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMNameSegment25() {
        return mNameSegment25;
    }

    /**
     * 设置mNameSegment25属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMNameSegment25(JAXBElement<String> value) {
        this.mNameSegment25 = value;
    }

    /**
     * 获取mNameSegment26属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMNameSegment26() {
        return mNameSegment26;
    }

    /**
     * 设置mNameSegment26属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMNameSegment26(JAXBElement<String> value) {
        this.mNameSegment26 = value;
    }

    /**
     * 获取mNameSegment27属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMNameSegment27() {
        return mNameSegment27;
    }

    /**
     * 设置mNameSegment27属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMNameSegment27(JAXBElement<String> value) {
        this.mNameSegment27 = value;
    }

    /**
     * 获取mNameSegment28属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMNameSegment28() {
        return mNameSegment28;
    }

    /**
     * 设置mNameSegment28属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMNameSegment28(JAXBElement<String> value) {
        this.mNameSegment28 = value;
    }

    /**
     * 获取mNameSegment29属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMNameSegment29() {
        return mNameSegment29;
    }

    /**
     * 设置mNameSegment29属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMNameSegment29(JAXBElement<String> value) {
        this.mNameSegment29 = value;
    }

    /**
     * 获取mNameSegment3属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMNameSegment3() {
        return mNameSegment3;
    }

    /**
     * 设置mNameSegment3属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMNameSegment3(JAXBElement<String> value) {
        this.mNameSegment3 = value;
    }

    /**
     * 获取mNameSegment30属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMNameSegment30() {
        return mNameSegment30;
    }

    /**
     * 设置mNameSegment30属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMNameSegment30(JAXBElement<String> value) {
        this.mNameSegment30 = value;
    }

    /**
     * 获取mNameSegment4属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMNameSegment4() {
        return mNameSegment4;
    }

    /**
     * 设置mNameSegment4属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMNameSegment4(JAXBElement<String> value) {
        this.mNameSegment4 = value;
    }

    /**
     * 获取mNameSegment5属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMNameSegment5() {
        return mNameSegment5;
    }

    /**
     * 设置mNameSegment5属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMNameSegment5(JAXBElement<String> value) {
        this.mNameSegment5 = value;
    }

    /**
     * 获取mNameSegment6属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMNameSegment6() {
        return mNameSegment6;
    }

    /**
     * 设置mNameSegment6属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMNameSegment6(JAXBElement<String> value) {
        this.mNameSegment6 = value;
    }

    /**
     * 获取mNameSegment7属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMNameSegment7() {
        return mNameSegment7;
    }

    /**
     * 设置mNameSegment7属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMNameSegment7(JAXBElement<String> value) {
        this.mNameSegment7 = value;
    }

    /**
     * 获取mNameSegment8属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMNameSegment8() {
        return mNameSegment8;
    }

    /**
     * 设置mNameSegment8属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMNameSegment8(JAXBElement<String> value) {
        this.mNameSegment8 = value;
    }

    /**
     * 获取mNameSegment9属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMNameSegment9() {
        return mNameSegment9;
    }

    /**
     * 设置mNameSegment9属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMNameSegment9(JAXBElement<String> value) {
        this.mNameSegment9 = value;
    }

    /**
     * 获取mNeedInspect属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMNeedInspect() {
        return mNeedInspect;
    }

    /**
     * 设置mNeedInspect属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMNeedInspect(Boolean value) {
        this.mNeedInspect = value;
    }

    /**
     * 获取mplmid属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMPLMID() {
        return mplmid;
    }

    /**
     * 设置mplmid属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMPLMID(JAXBElement<String> value) {
        this.mplmid = value;
    }

    /**
     * 获取mPicture属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public JAXBElement<byte[]> getMPicture() {
        return mPicture;
    }

    /**
     * 设置mPicture属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public void setMPicture(JAXBElement<byte[]> value) {
        this.mPicture = value;
    }

    /**
     * 获取mPlanCost属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMPlanCost() {
        return mPlanCost;
    }

    /**
     * 设置mPlanCost属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMPlanCost(BigDecimal value) {
        this.mPlanCost = value;
    }

    /**
     * 获取mPurchaseInfo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOSCMItemItemPurchaseInfoData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9CBOSCMItemItemPurchaseInfoData> getMPurchaseInfo() {
        return mPurchaseInfo;
    }

    /**
     * 设置mPurchaseInfo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOSCMItemItemPurchaseInfoData }{@code >}
     *     
     */
    public void setMPurchaseInfo(JAXBElement<UFIDAU9CBOSCMItemItemPurchaseInfoData> value) {
        this.mPurchaseInfo = value;
    }

    /**
     * 获取mRecentlyCost属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMRecentlyCost() {
        return mRecentlyCost;
    }

    /**
     * 设置mRecentlyCost属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMRecentlyCost(BigDecimal value) {
        this.mRecentlyCost = value;
    }

    /**
     * 获取mRefrenceCost属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMRefrenceCost() {
        return mRefrenceCost;
    }

    /**
     * 设置mRefrenceCost属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMRefrenceCost(BigDecimal value) {
        this.mRefrenceCost = value;
    }

    /**
     * 获取mspecs属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMSPECS() {
        return mspecs;
    }

    /**
     * 设置mspecs属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMSPECS(JAXBElement<String> value) {
        this.mspecs = value;
    }

    /**
     * 获取mSaleInfo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOSCMItemItemSaleInfoData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9CBOSCMItemItemSaleInfoData> getMSaleInfo() {
        return mSaleInfo;
    }

    /**
     * 设置mSaleInfo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOSCMItemItemSaleInfoData }{@code >}
     *     
     */
    public void setMSaleInfo(JAXBElement<UFIDAU9CBOSCMItemItemSaleInfoData> value) {
        this.mSaleInfo = value;
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
     * 获取mStandardBatchQty属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMStandardBatchQty() {
        return mStandardBatchQty;
    }

    /**
     * 设置mStandardBatchQty属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMStandardBatchQty(BigDecimal value) {
        this.mStandardBatchQty = value;
    }

    /**
     * 获取mStandardCost属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMStandardCost() {
        return mStandardCost;
    }

    /**
     * 设置mStandardCost属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMStandardCost(BigDecimal value) {
        this.mStandardCost = value;
    }

    /**
     * 获取mStandardGrade属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMStandardGrade() {
        return mStandardGrade;
    }

    /**
     * 设置mStandardGrade属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMStandardGrade(Integer value) {
        this.mStandardGrade = value;
    }

    /**
     * 获取mStandardPotency属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMStandardPotency() {
        return mStandardPotency;
    }

    /**
     * 设置mStandardPotency属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMStandardPotency(Integer value) {
        this.mStandardPotency = value;
    }

    /**
     * 获取mStartGrade属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMStartGrade() {
        return mStartGrade;
    }

    /**
     * 设置mStartGrade属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMStartGrade(Integer value) {
        this.mStartGrade = value;
    }

    /**
     * 获取mStartPotency属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMStartPotency() {
        return mStartPotency;
    }

    /**
     * 设置mStartPotency属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMStartPotency(Integer value) {
        this.mStartPotency = value;
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
     * 获取mStatusLastModify属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMStatusLastModify() {
        return mStatusLastModify;
    }

    /**
     * 设置mStatusLastModify属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMStatusLastModify(XMLGregorianCalendar value) {
        this.mStatusLastModify = value;
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
     * 获取mVersion属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMVersion() {
        return mVersion;
    }

    /**
     * 设置mVersion属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMVersion(JAXBElement<String> value) {
        this.mVersion = value;
    }

    /**
     * 获取mVersionID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMVersionID() {
        return mVersionID;
    }

    /**
     * 设置mVersionID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMVersionID(Long value) {
        this.mVersionID = value;
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
