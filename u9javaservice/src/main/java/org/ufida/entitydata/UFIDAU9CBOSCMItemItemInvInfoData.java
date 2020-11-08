
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


/**
 * &lt;p&gt;UFIDA.U9.CBO.SCM.Item.ItemInvInfoData complex type的 Java 类。
 * 
 * &lt;p&gt;以下模式片段指定包含在此类中的预期内容。
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="UFIDA.U9.CBO.SCM.Item.ItemInvInfoData"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://www.UFIDA.org/EntityData}UFSoft.UBF.Business.DataTransObjectBase"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="ATPRule" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ATPRule_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="BarCodeRule" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="BarCodeRule_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Barcode" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Barcode_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Bin" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Bin_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ItemMaster_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="LotParam" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="LotParam_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ReferrenceCostCurrency" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ReferrenceCostCurrency_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="SnParam" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="SnParam_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="TimeBucket" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="TimeBucket_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Warehouse" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="WarehouseManager" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="WarehouseManager_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Warehouse_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_apprDiffAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_apprDiffAmtRate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_apprDiffQty" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_apprDiffQtyRate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_apprDiffRule" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_avgUsageQty" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_avgUsageQtyCalDays" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_barcodeMakeMode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_barcodeTrackMode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_convertRatio" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_createdBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_createdOn" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_deliveryPriceGroup" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_economyOrderQty" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_fixPeriod" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_iD" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_invToPurMode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_inventoryCostRate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_inventoryMaxLimitQty" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_inventoryMinLimitQty" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_inventoryPlanTime" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_inventoryPlanningMethod" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isBalanceByProject" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isCanalBinUnMarkCheck" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isCostCalByLot" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isIncSerialNo" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isIncZeroQty" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isInvCalculateBySeiban" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isInvCalculateByTradeMark" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isInvCalculateByVersion" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isKitMustWholeSet" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isLimitBin" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isLimitWarehouse" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isLotOverdueTransOut" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isNegativeInventory" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isRequiredShipperSupply" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isReservable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isShipmentOverdueLot" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isStructBarcode" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_itemMaster" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CBO.SCM.Item.ItemMasterData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_lotControlMode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_lotOverdueDays" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_lotValidDate" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_modifiedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_modifiedOn" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_nextSupplyDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_orderCost" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_pickingRule" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_purchaseControlMode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_putawayRule" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_referrenceCost" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_reorderQty" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_reserveDays" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_reserveMode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_safetyStockPeriod" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_safetyStockQty" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_safetyStockRate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_safetyStockType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_standardBox" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_supplyMethod" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_sysVersion" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_turnOverDays" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_turnOverRate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_wastageRate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UFIDA.U9.CBO.SCM.Item.ItemInvInfoData", propOrder = {
    "atpRule",
    "atpRuleSKey",
    "barCodeRule",
    "barCodeRuleSKey",
    "barcode",
    "barcodeSKey",
    "bin",
    "binSKey",
    "itemMasterSKey",
    "lotParam",
    "lotParamSKey",
    "referrenceCostCurrency",
    "referrenceCostCurrencySKey",
    "snParam",
    "snParamSKey",
    "timeBucket",
    "timeBucketSKey",
    "warehouse",
    "warehouseManager",
    "warehouseManagerSKey",
    "warehouseSKey",
    "mApprDiffAmt",
    "mApprDiffAmtRate",
    "mApprDiffQty",
    "mApprDiffQtyRate",
    "mApprDiffRule",
    "mAvgUsageQty",
    "mAvgUsageQtyCalDays",
    "mBarcodeMakeMode",
    "mBarcodeTrackMode",
    "mConvertRatio",
    "mCreatedBy",
    "mCreatedOn",
    "mDeliveryPriceGroup",
    "mEconomyOrderQty",
    "mFixPeriod",
    "mid",
    "mInvToPurMode",
    "mInventoryCostRate",
    "mInventoryMaxLimitQty",
    "mInventoryMinLimitQty",
    "mInventoryPlanTime",
    "mInventoryPlanningMethod",
    "mIsBalanceByProject",
    "mIsCanalBinUnMarkCheck",
    "mIsCostCalByLot",
    "mIsIncSerialNo",
    "mIsIncZeroQty",
    "mIsInvCalculateBySeiban",
    "mIsInvCalculateByTradeMark",
    "mIsInvCalculateByVersion",
    "mIsKitMustWholeSet",
    "mIsLimitBin",
    "mIsLimitWarehouse",
    "mIsLotOverdueTransOut",
    "mIsNegativeInventory",
    "mIsRequiredShipperSupply",
    "mIsReservable",
    "mIsShipmentOverdueLot",
    "mIsStructBarcode",
    "mItemMaster",
    "mLotControlMode",
    "mLotOverdueDays",
    "mLotValidDate",
    "mModifiedBy",
    "mModifiedOn",
    "mNextSupplyDate",
    "mOrderCost",
    "mPickingRule",
    "mPurchaseControlMode",
    "mPutawayRule",
    "mReferrenceCost",
    "mReorderQty",
    "mReserveDays",
    "mReserveMode",
    "mSafetyStockPeriod",
    "mSafetyStockQty",
    "mSafetyStockRate",
    "mSafetyStockType",
    "mStandardBox",
    "mSupplyMethod",
    "mSysVersion",
    "mTurnOverDays",
    "mTurnOverRate",
    "mWastageRate"
})
public class UFIDAU9CBOSCMItemItemInvInfoData
    extends UFSoftUBFBusinessDataTransObjectBase
{

    @XmlElement(name = "ATPRule")
    protected Long atpRule;
    @XmlElementRef(name = "ATPRule_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> atpRuleSKey;
    @XmlElement(name = "BarCodeRule")
    protected Long barCodeRule;
    @XmlElementRef(name = "BarCodeRule_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> barCodeRuleSKey;
    @XmlElement(name = "Barcode")
    protected Long barcode;
    @XmlElementRef(name = "Barcode_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> barcodeSKey;
    @XmlElement(name = "Bin")
    protected Long bin;
    @XmlElementRef(name = "Bin_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> binSKey;
    @XmlElementRef(name = "ItemMaster_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> itemMasterSKey;
    @XmlElement(name = "LotParam")
    protected Long lotParam;
    @XmlElementRef(name = "LotParam_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> lotParamSKey;
    @XmlElement(name = "ReferrenceCostCurrency")
    protected Long referrenceCostCurrency;
    @XmlElementRef(name = "ReferrenceCostCurrency_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> referrenceCostCurrencySKey;
    @XmlElement(name = "SnParam")
    protected Long snParam;
    @XmlElementRef(name = "SnParam_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> snParamSKey;
    @XmlElement(name = "TimeBucket")
    protected Long timeBucket;
    @XmlElementRef(name = "TimeBucket_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> timeBucketSKey;
    @XmlElement(name = "Warehouse")
    protected Long warehouse;
    @XmlElement(name = "WarehouseManager")
    protected Long warehouseManager;
    @XmlElementRef(name = "WarehouseManager_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> warehouseManagerSKey;
    @XmlElementRef(name = "Warehouse_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> warehouseSKey;
    @XmlElement(name = "m_apprDiffAmt")
    protected BigDecimal mApprDiffAmt;
    @XmlElement(name = "m_apprDiffAmtRate")
    protected BigDecimal mApprDiffAmtRate;
    @XmlElement(name = "m_apprDiffQty")
    protected BigDecimal mApprDiffQty;
    @XmlElement(name = "m_apprDiffQtyRate")
    protected BigDecimal mApprDiffQtyRate;
    @XmlElement(name = "m_apprDiffRule")
    protected Integer mApprDiffRule;
    @XmlElement(name = "m_avgUsageQty")
    protected BigDecimal mAvgUsageQty;
    @XmlElement(name = "m_avgUsageQtyCalDays")
    protected BigDecimal mAvgUsageQtyCalDays;
    @XmlElement(name = "m_barcodeMakeMode")
    protected Integer mBarcodeMakeMode;
    @XmlElement(name = "m_barcodeTrackMode")
    protected Integer mBarcodeTrackMode;
    @XmlElement(name = "m_convertRatio")
    protected Boolean mConvertRatio;
    @XmlElementRef(name = "m_createdBy", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mCreatedBy;
    @XmlElement(name = "m_createdOn")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mCreatedOn;
    @XmlElement(name = "m_deliveryPriceGroup")
    protected Long mDeliveryPriceGroup;
    @XmlElement(name = "m_economyOrderQty")
    protected BigDecimal mEconomyOrderQty;
    @XmlElement(name = "m_fixPeriod")
    protected BigDecimal mFixPeriod;
    @XmlElement(name = "m_iD")
    protected Long mid;
    @XmlElement(name = "m_invToPurMode")
    protected Integer mInvToPurMode;
    @XmlElement(name = "m_inventoryCostRate")
    protected BigDecimal mInventoryCostRate;
    @XmlElement(name = "m_inventoryMaxLimitQty")
    protected BigDecimal mInventoryMaxLimitQty;
    @XmlElement(name = "m_inventoryMinLimitQty")
    protected BigDecimal mInventoryMinLimitQty;
    @XmlElement(name = "m_inventoryPlanTime")
    protected Integer mInventoryPlanTime;
    @XmlElement(name = "m_inventoryPlanningMethod")
    protected Integer mInventoryPlanningMethod;
    @XmlElement(name = "m_isBalanceByProject")
    protected Boolean mIsBalanceByProject;
    @XmlElement(name = "m_isCanalBinUnMarkCheck")
    protected Boolean mIsCanalBinUnMarkCheck;
    @XmlElement(name = "m_isCostCalByLot")
    protected Boolean mIsCostCalByLot;
    @XmlElement(name = "m_isIncSerialNo")
    protected Boolean mIsIncSerialNo;
    @XmlElement(name = "m_isIncZeroQty")
    protected Boolean mIsIncZeroQty;
    @XmlElement(name = "m_isInvCalculateBySeiban")
    protected Boolean mIsInvCalculateBySeiban;
    @XmlElement(name = "m_isInvCalculateByTradeMark")
    protected Boolean mIsInvCalculateByTradeMark;
    @XmlElement(name = "m_isInvCalculateByVersion")
    protected Boolean mIsInvCalculateByVersion;
    @XmlElement(name = "m_isKitMustWholeSet")
    protected Boolean mIsKitMustWholeSet;
    @XmlElement(name = "m_isLimitBin")
    protected Boolean mIsLimitBin;
    @XmlElement(name = "m_isLimitWarehouse")
    protected Boolean mIsLimitWarehouse;
    @XmlElement(name = "m_isLotOverdueTransOut")
    protected Boolean mIsLotOverdueTransOut;
    @XmlElement(name = "m_isNegativeInventory")
    protected Boolean mIsNegativeInventory;
    @XmlElement(name = "m_isRequiredShipperSupply")
    protected Boolean mIsRequiredShipperSupply;
    @XmlElement(name = "m_isReservable")
    protected Boolean mIsReservable;
    @XmlElement(name = "m_isShipmentOverdueLot")
    protected Boolean mIsShipmentOverdueLot;
    @XmlElement(name = "m_isStructBarcode")
    protected Boolean mIsStructBarcode;
    @XmlElementRef(name = "m_itemMaster", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9CBOSCMItemItemMasterData> mItemMaster;
    @XmlElement(name = "m_lotControlMode")
    protected Integer mLotControlMode;
    @XmlElement(name = "m_lotOverdueDays")
    protected Integer mLotOverdueDays;
    @XmlElement(name = "m_lotValidDate")
    protected Integer mLotValidDate;
    @XmlElementRef(name = "m_modifiedBy", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mModifiedBy;
    @XmlElement(name = "m_modifiedOn")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mModifiedOn;
    @XmlElement(name = "m_nextSupplyDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mNextSupplyDate;
    @XmlElement(name = "m_orderCost")
    protected BigDecimal mOrderCost;
    @XmlElement(name = "m_pickingRule")
    protected Long mPickingRule;
    @XmlElement(name = "m_purchaseControlMode")
    protected Integer mPurchaseControlMode;
    @XmlElement(name = "m_putawayRule")
    protected Long mPutawayRule;
    @XmlElement(name = "m_referrenceCost")
    protected BigDecimal mReferrenceCost;
    @XmlElement(name = "m_reorderQty")
    protected BigDecimal mReorderQty;
    @XmlElement(name = "m_reserveDays")
    protected Integer mReserveDays;
    @XmlElement(name = "m_reserveMode")
    protected Integer mReserveMode;
    @XmlElement(name = "m_safetyStockPeriod")
    protected Integer mSafetyStockPeriod;
    @XmlElement(name = "m_safetyStockQty")
    protected BigDecimal mSafetyStockQty;
    @XmlElement(name = "m_safetyStockRate")
    protected BigDecimal mSafetyStockRate;
    @XmlElement(name = "m_safetyStockType")
    protected Integer mSafetyStockType;
    @XmlElement(name = "m_standardBox")
    protected BigDecimal mStandardBox;
    @XmlElement(name = "m_supplyMethod")
    protected Integer mSupplyMethod;
    @XmlElement(name = "m_sysVersion")
    protected Long mSysVersion;
    @XmlElement(name = "m_turnOverDays")
    protected BigDecimal mTurnOverDays;
    @XmlElement(name = "m_turnOverRate")
    protected BigDecimal mTurnOverRate;
    @XmlElement(name = "m_wastageRate")
    protected BigDecimal mWastageRate;

    /**
     * 获取atpRule属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getATPRule() {
        return atpRule;
    }

    /**
     * 设置atpRule属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setATPRule(Long value) {
        this.atpRule = value;
    }

    /**
     * 获取atpRuleSKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getATPRuleSKey() {
        return atpRuleSKey;
    }

    /**
     * 设置atpRuleSKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setATPRuleSKey(JAXBElement<EntityKey> value) {
        this.atpRuleSKey = value;
    }

    /**
     * 获取barCodeRule属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getBarCodeRule() {
        return barCodeRule;
    }

    /**
     * 设置barCodeRule属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setBarCodeRule(Long value) {
        this.barCodeRule = value;
    }

    /**
     * 获取barCodeRuleSKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getBarCodeRuleSKey() {
        return barCodeRuleSKey;
    }

    /**
     * 设置barCodeRuleSKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setBarCodeRuleSKey(JAXBElement<EntityKey> value) {
        this.barCodeRuleSKey = value;
    }

    /**
     * 获取barcode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getBarcode() {
        return barcode;
    }

    /**
     * 设置barcode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setBarcode(Long value) {
        this.barcode = value;
    }

    /**
     * 获取barcodeSKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getBarcodeSKey() {
        return barcodeSKey;
    }

    /**
     * 设置barcodeSKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setBarcodeSKey(JAXBElement<EntityKey> value) {
        this.barcodeSKey = value;
    }

    /**
     * 获取bin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getBin() {
        return bin;
    }

    /**
     * 设置bin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setBin(Long value) {
        this.bin = value;
    }

    /**
     * 获取binSKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getBinSKey() {
        return binSKey;
    }

    /**
     * 设置binSKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setBinSKey(JAXBElement<EntityKey> value) {
        this.binSKey = value;
    }

    /**
     * 获取itemMasterSKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getItemMasterSKey() {
        return itemMasterSKey;
    }

    /**
     * 设置itemMasterSKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setItemMasterSKey(JAXBElement<EntityKey> value) {
        this.itemMasterSKey = value;
    }

    /**
     * 获取lotParam属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getLotParam() {
        return lotParam;
    }

    /**
     * 设置lotParam属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setLotParam(Long value) {
        this.lotParam = value;
    }

    /**
     * 获取lotParamSKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getLotParamSKey() {
        return lotParamSKey;
    }

    /**
     * 设置lotParamSKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setLotParamSKey(JAXBElement<EntityKey> value) {
        this.lotParamSKey = value;
    }

    /**
     * 获取referrenceCostCurrency属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getReferrenceCostCurrency() {
        return referrenceCostCurrency;
    }

    /**
     * 设置referrenceCostCurrency属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setReferrenceCostCurrency(Long value) {
        this.referrenceCostCurrency = value;
    }

    /**
     * 获取referrenceCostCurrencySKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getReferrenceCostCurrencySKey() {
        return referrenceCostCurrencySKey;
    }

    /**
     * 设置referrenceCostCurrencySKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setReferrenceCostCurrencySKey(JAXBElement<EntityKey> value) {
        this.referrenceCostCurrencySKey = value;
    }

    /**
     * 获取snParam属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSnParam() {
        return snParam;
    }

    /**
     * 设置snParam属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSnParam(Long value) {
        this.snParam = value;
    }

    /**
     * 获取snParamSKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getSnParamSKey() {
        return snParamSKey;
    }

    /**
     * 设置snParamSKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setSnParamSKey(JAXBElement<EntityKey> value) {
        this.snParamSKey = value;
    }

    /**
     * 获取timeBucket属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTimeBucket() {
        return timeBucket;
    }

    /**
     * 设置timeBucket属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTimeBucket(Long value) {
        this.timeBucket = value;
    }

    /**
     * 获取timeBucketSKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getTimeBucketSKey() {
        return timeBucketSKey;
    }

    /**
     * 设置timeBucketSKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setTimeBucketSKey(JAXBElement<EntityKey> value) {
        this.timeBucketSKey = value;
    }

    /**
     * 获取warehouse属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getWarehouse() {
        return warehouse;
    }

    /**
     * 设置warehouse属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setWarehouse(Long value) {
        this.warehouse = value;
    }

    /**
     * 获取warehouseManager属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getWarehouseManager() {
        return warehouseManager;
    }

    /**
     * 设置warehouseManager属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setWarehouseManager(Long value) {
        this.warehouseManager = value;
    }

    /**
     * 获取warehouseManagerSKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getWarehouseManagerSKey() {
        return warehouseManagerSKey;
    }

    /**
     * 设置warehouseManagerSKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setWarehouseManagerSKey(JAXBElement<EntityKey> value) {
        this.warehouseManagerSKey = value;
    }

    /**
     * 获取warehouseSKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getWarehouseSKey() {
        return warehouseSKey;
    }

    /**
     * 设置warehouseSKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setWarehouseSKey(JAXBElement<EntityKey> value) {
        this.warehouseSKey = value;
    }

    /**
     * 获取mApprDiffAmt属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMApprDiffAmt() {
        return mApprDiffAmt;
    }

    /**
     * 设置mApprDiffAmt属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMApprDiffAmt(BigDecimal value) {
        this.mApprDiffAmt = value;
    }

    /**
     * 获取mApprDiffAmtRate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMApprDiffAmtRate() {
        return mApprDiffAmtRate;
    }

    /**
     * 设置mApprDiffAmtRate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMApprDiffAmtRate(BigDecimal value) {
        this.mApprDiffAmtRate = value;
    }

    /**
     * 获取mApprDiffQty属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMApprDiffQty() {
        return mApprDiffQty;
    }

    /**
     * 设置mApprDiffQty属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMApprDiffQty(BigDecimal value) {
        this.mApprDiffQty = value;
    }

    /**
     * 获取mApprDiffQtyRate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMApprDiffQtyRate() {
        return mApprDiffQtyRate;
    }

    /**
     * 设置mApprDiffQtyRate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMApprDiffQtyRate(BigDecimal value) {
        this.mApprDiffQtyRate = value;
    }

    /**
     * 获取mApprDiffRule属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMApprDiffRule() {
        return mApprDiffRule;
    }

    /**
     * 设置mApprDiffRule属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMApprDiffRule(Integer value) {
        this.mApprDiffRule = value;
    }

    /**
     * 获取mAvgUsageQty属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMAvgUsageQty() {
        return mAvgUsageQty;
    }

    /**
     * 设置mAvgUsageQty属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMAvgUsageQty(BigDecimal value) {
        this.mAvgUsageQty = value;
    }

    /**
     * 获取mAvgUsageQtyCalDays属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMAvgUsageQtyCalDays() {
        return mAvgUsageQtyCalDays;
    }

    /**
     * 设置mAvgUsageQtyCalDays属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMAvgUsageQtyCalDays(BigDecimal value) {
        this.mAvgUsageQtyCalDays = value;
    }

    /**
     * 获取mBarcodeMakeMode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMBarcodeMakeMode() {
        return mBarcodeMakeMode;
    }

    /**
     * 设置mBarcodeMakeMode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMBarcodeMakeMode(Integer value) {
        this.mBarcodeMakeMode = value;
    }

    /**
     * 获取mBarcodeTrackMode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMBarcodeTrackMode() {
        return mBarcodeTrackMode;
    }

    /**
     * 设置mBarcodeTrackMode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMBarcodeTrackMode(Integer value) {
        this.mBarcodeTrackMode = value;
    }

    /**
     * 获取mConvertRatio属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMConvertRatio() {
        return mConvertRatio;
    }

    /**
     * 设置mConvertRatio属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMConvertRatio(Boolean value) {
        this.mConvertRatio = value;
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
     * 获取mDeliveryPriceGroup属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMDeliveryPriceGroup() {
        return mDeliveryPriceGroup;
    }

    /**
     * 设置mDeliveryPriceGroup属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMDeliveryPriceGroup(Long value) {
        this.mDeliveryPriceGroup = value;
    }

    /**
     * 获取mEconomyOrderQty属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMEconomyOrderQty() {
        return mEconomyOrderQty;
    }

    /**
     * 设置mEconomyOrderQty属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMEconomyOrderQty(BigDecimal value) {
        this.mEconomyOrderQty = value;
    }

    /**
     * 获取mFixPeriod属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMFixPeriod() {
        return mFixPeriod;
    }

    /**
     * 设置mFixPeriod属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMFixPeriod(BigDecimal value) {
        this.mFixPeriod = value;
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
     * 获取mInvToPurMode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMInvToPurMode() {
        return mInvToPurMode;
    }

    /**
     * 设置mInvToPurMode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMInvToPurMode(Integer value) {
        this.mInvToPurMode = value;
    }

    /**
     * 获取mInventoryCostRate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMInventoryCostRate() {
        return mInventoryCostRate;
    }

    /**
     * 设置mInventoryCostRate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMInventoryCostRate(BigDecimal value) {
        this.mInventoryCostRate = value;
    }

    /**
     * 获取mInventoryMaxLimitQty属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMInventoryMaxLimitQty() {
        return mInventoryMaxLimitQty;
    }

    /**
     * 设置mInventoryMaxLimitQty属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMInventoryMaxLimitQty(BigDecimal value) {
        this.mInventoryMaxLimitQty = value;
    }

    /**
     * 获取mInventoryMinLimitQty属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMInventoryMinLimitQty() {
        return mInventoryMinLimitQty;
    }

    /**
     * 设置mInventoryMinLimitQty属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMInventoryMinLimitQty(BigDecimal value) {
        this.mInventoryMinLimitQty = value;
    }

    /**
     * 获取mInventoryPlanTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMInventoryPlanTime() {
        return mInventoryPlanTime;
    }

    /**
     * 设置mInventoryPlanTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMInventoryPlanTime(Integer value) {
        this.mInventoryPlanTime = value;
    }

    /**
     * 获取mInventoryPlanningMethod属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMInventoryPlanningMethod() {
        return mInventoryPlanningMethod;
    }

    /**
     * 设置mInventoryPlanningMethod属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMInventoryPlanningMethod(Integer value) {
        this.mInventoryPlanningMethod = value;
    }

    /**
     * 获取mIsBalanceByProject属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsBalanceByProject() {
        return mIsBalanceByProject;
    }

    /**
     * 设置mIsBalanceByProject属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsBalanceByProject(Boolean value) {
        this.mIsBalanceByProject = value;
    }

    /**
     * 获取mIsCanalBinUnMarkCheck属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsCanalBinUnMarkCheck() {
        return mIsCanalBinUnMarkCheck;
    }

    /**
     * 设置mIsCanalBinUnMarkCheck属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsCanalBinUnMarkCheck(Boolean value) {
        this.mIsCanalBinUnMarkCheck = value;
    }

    /**
     * 获取mIsCostCalByLot属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsCostCalByLot() {
        return mIsCostCalByLot;
    }

    /**
     * 设置mIsCostCalByLot属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsCostCalByLot(Boolean value) {
        this.mIsCostCalByLot = value;
    }

    /**
     * 获取mIsIncSerialNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsIncSerialNo() {
        return mIsIncSerialNo;
    }

    /**
     * 设置mIsIncSerialNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsIncSerialNo(Boolean value) {
        this.mIsIncSerialNo = value;
    }

    /**
     * 获取mIsIncZeroQty属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsIncZeroQty() {
        return mIsIncZeroQty;
    }

    /**
     * 设置mIsIncZeroQty属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsIncZeroQty(Boolean value) {
        this.mIsIncZeroQty = value;
    }

    /**
     * 获取mIsInvCalculateBySeiban属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsInvCalculateBySeiban() {
        return mIsInvCalculateBySeiban;
    }

    /**
     * 设置mIsInvCalculateBySeiban属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsInvCalculateBySeiban(Boolean value) {
        this.mIsInvCalculateBySeiban = value;
    }

    /**
     * 获取mIsInvCalculateByTradeMark属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsInvCalculateByTradeMark() {
        return mIsInvCalculateByTradeMark;
    }

    /**
     * 设置mIsInvCalculateByTradeMark属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsInvCalculateByTradeMark(Boolean value) {
        this.mIsInvCalculateByTradeMark = value;
    }

    /**
     * 获取mIsInvCalculateByVersion属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsInvCalculateByVersion() {
        return mIsInvCalculateByVersion;
    }

    /**
     * 设置mIsInvCalculateByVersion属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsInvCalculateByVersion(Boolean value) {
        this.mIsInvCalculateByVersion = value;
    }

    /**
     * 获取mIsKitMustWholeSet属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsKitMustWholeSet() {
        return mIsKitMustWholeSet;
    }

    /**
     * 设置mIsKitMustWholeSet属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsKitMustWholeSet(Boolean value) {
        this.mIsKitMustWholeSet = value;
    }

    /**
     * 获取mIsLimitBin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsLimitBin() {
        return mIsLimitBin;
    }

    /**
     * 设置mIsLimitBin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsLimitBin(Boolean value) {
        this.mIsLimitBin = value;
    }

    /**
     * 获取mIsLimitWarehouse属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsLimitWarehouse() {
        return mIsLimitWarehouse;
    }

    /**
     * 设置mIsLimitWarehouse属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsLimitWarehouse(Boolean value) {
        this.mIsLimitWarehouse = value;
    }

    /**
     * 获取mIsLotOverdueTransOut属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsLotOverdueTransOut() {
        return mIsLotOverdueTransOut;
    }

    /**
     * 设置mIsLotOverdueTransOut属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsLotOverdueTransOut(Boolean value) {
        this.mIsLotOverdueTransOut = value;
    }

    /**
     * 获取mIsNegativeInventory属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsNegativeInventory() {
        return mIsNegativeInventory;
    }

    /**
     * 设置mIsNegativeInventory属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsNegativeInventory(Boolean value) {
        this.mIsNegativeInventory = value;
    }

    /**
     * 获取mIsRequiredShipperSupply属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsRequiredShipperSupply() {
        return mIsRequiredShipperSupply;
    }

    /**
     * 设置mIsRequiredShipperSupply属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsRequiredShipperSupply(Boolean value) {
        this.mIsRequiredShipperSupply = value;
    }

    /**
     * 获取mIsReservable属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsReservable() {
        return mIsReservable;
    }

    /**
     * 设置mIsReservable属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsReservable(Boolean value) {
        this.mIsReservable = value;
    }

    /**
     * 获取mIsShipmentOverdueLot属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsShipmentOverdueLot() {
        return mIsShipmentOverdueLot;
    }

    /**
     * 设置mIsShipmentOverdueLot属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsShipmentOverdueLot(Boolean value) {
        this.mIsShipmentOverdueLot = value;
    }

    /**
     * 获取mIsStructBarcode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsStructBarcode() {
        return mIsStructBarcode;
    }

    /**
     * 设置mIsStructBarcode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsStructBarcode(Boolean value) {
        this.mIsStructBarcode = value;
    }

    /**
     * 获取mItemMaster属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOSCMItemItemMasterData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9CBOSCMItemItemMasterData> getMItemMaster() {
        return mItemMaster;
    }

    /**
     * 设置mItemMaster属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOSCMItemItemMasterData }{@code >}
     *     
     */
    public void setMItemMaster(JAXBElement<UFIDAU9CBOSCMItemItemMasterData> value) {
        this.mItemMaster = value;
    }

    /**
     * 获取mLotControlMode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMLotControlMode() {
        return mLotControlMode;
    }

    /**
     * 设置mLotControlMode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMLotControlMode(Integer value) {
        this.mLotControlMode = value;
    }

    /**
     * 获取mLotOverdueDays属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMLotOverdueDays() {
        return mLotOverdueDays;
    }

    /**
     * 设置mLotOverdueDays属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMLotOverdueDays(Integer value) {
        this.mLotOverdueDays = value;
    }

    /**
     * 获取mLotValidDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMLotValidDate() {
        return mLotValidDate;
    }

    /**
     * 设置mLotValidDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMLotValidDate(Integer value) {
        this.mLotValidDate = value;
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
     * 获取mNextSupplyDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMNextSupplyDate() {
        return mNextSupplyDate;
    }

    /**
     * 设置mNextSupplyDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMNextSupplyDate(XMLGregorianCalendar value) {
        this.mNextSupplyDate = value;
    }

    /**
     * 获取mOrderCost属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMOrderCost() {
        return mOrderCost;
    }

    /**
     * 设置mOrderCost属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMOrderCost(BigDecimal value) {
        this.mOrderCost = value;
    }

    /**
     * 获取mPickingRule属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMPickingRule() {
        return mPickingRule;
    }

    /**
     * 设置mPickingRule属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMPickingRule(Long value) {
        this.mPickingRule = value;
    }

    /**
     * 获取mPurchaseControlMode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMPurchaseControlMode() {
        return mPurchaseControlMode;
    }

    /**
     * 设置mPurchaseControlMode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMPurchaseControlMode(Integer value) {
        this.mPurchaseControlMode = value;
    }

    /**
     * 获取mPutawayRule属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMPutawayRule() {
        return mPutawayRule;
    }

    /**
     * 设置mPutawayRule属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMPutawayRule(Long value) {
        this.mPutawayRule = value;
    }

    /**
     * 获取mReferrenceCost属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMReferrenceCost() {
        return mReferrenceCost;
    }

    /**
     * 设置mReferrenceCost属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMReferrenceCost(BigDecimal value) {
        this.mReferrenceCost = value;
    }

    /**
     * 获取mReorderQty属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMReorderQty() {
        return mReorderQty;
    }

    /**
     * 设置mReorderQty属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMReorderQty(BigDecimal value) {
        this.mReorderQty = value;
    }

    /**
     * 获取mReserveDays属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMReserveDays() {
        return mReserveDays;
    }

    /**
     * 设置mReserveDays属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMReserveDays(Integer value) {
        this.mReserveDays = value;
    }

    /**
     * 获取mReserveMode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMReserveMode() {
        return mReserveMode;
    }

    /**
     * 设置mReserveMode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMReserveMode(Integer value) {
        this.mReserveMode = value;
    }

    /**
     * 获取mSafetyStockPeriod属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMSafetyStockPeriod() {
        return mSafetyStockPeriod;
    }

    /**
     * 设置mSafetyStockPeriod属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMSafetyStockPeriod(Integer value) {
        this.mSafetyStockPeriod = value;
    }

    /**
     * 获取mSafetyStockQty属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMSafetyStockQty() {
        return mSafetyStockQty;
    }

    /**
     * 设置mSafetyStockQty属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMSafetyStockQty(BigDecimal value) {
        this.mSafetyStockQty = value;
    }

    /**
     * 获取mSafetyStockRate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMSafetyStockRate() {
        return mSafetyStockRate;
    }

    /**
     * 设置mSafetyStockRate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMSafetyStockRate(BigDecimal value) {
        this.mSafetyStockRate = value;
    }

    /**
     * 获取mSafetyStockType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMSafetyStockType() {
        return mSafetyStockType;
    }

    /**
     * 设置mSafetyStockType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMSafetyStockType(Integer value) {
        this.mSafetyStockType = value;
    }

    /**
     * 获取mStandardBox属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMStandardBox() {
        return mStandardBox;
    }

    /**
     * 设置mStandardBox属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMStandardBox(BigDecimal value) {
        this.mStandardBox = value;
    }

    /**
     * 获取mSupplyMethod属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMSupplyMethod() {
        return mSupplyMethod;
    }

    /**
     * 设置mSupplyMethod属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMSupplyMethod(Integer value) {
        this.mSupplyMethod = value;
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
     * 获取mTurnOverDays属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMTurnOverDays() {
        return mTurnOverDays;
    }

    /**
     * 设置mTurnOverDays属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMTurnOverDays(BigDecimal value) {
        this.mTurnOverDays = value;
    }

    /**
     * 获取mTurnOverRate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMTurnOverRate() {
        return mTurnOverRate;
    }

    /**
     * 设置mTurnOverRate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMTurnOverRate(BigDecimal value) {
        this.mTurnOverRate = value;
    }

    /**
     * 获取mWastageRate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMWastageRate() {
        return mWastageRate;
    }

    /**
     * 设置mWastageRate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMWastageRate(BigDecimal value) {
        this.mWastageRate = value;
    }

}
