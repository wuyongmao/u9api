
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
 * &lt;p&gt;UFIDA.U9.CBO.SCM.Item.ItemInvInfoData complex type�� Java �ࡣ
 * 
 * &lt;p&gt;����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡatpRule���Ե�ֵ��
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
     * ����atpRule���Ե�ֵ��
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
     * ��ȡatpRuleSKey���Ե�ֵ��
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
     * ����atpRuleSKey���Ե�ֵ��
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
     * ��ȡbarCodeRule���Ե�ֵ��
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
     * ����barCodeRule���Ե�ֵ��
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
     * ��ȡbarCodeRuleSKey���Ե�ֵ��
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
     * ����barCodeRuleSKey���Ե�ֵ��
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
     * ��ȡbarcode���Ե�ֵ��
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
     * ����barcode���Ե�ֵ��
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
     * ��ȡbarcodeSKey���Ե�ֵ��
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
     * ����barcodeSKey���Ե�ֵ��
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
     * ��ȡbin���Ե�ֵ��
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
     * ����bin���Ե�ֵ��
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
     * ��ȡbinSKey���Ե�ֵ��
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
     * ����binSKey���Ե�ֵ��
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
     * ��ȡitemMasterSKey���Ե�ֵ��
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
     * ����itemMasterSKey���Ե�ֵ��
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
     * ��ȡlotParam���Ե�ֵ��
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
     * ����lotParam���Ե�ֵ��
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
     * ��ȡlotParamSKey���Ե�ֵ��
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
     * ����lotParamSKey���Ե�ֵ��
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
     * ��ȡreferrenceCostCurrency���Ե�ֵ��
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
     * ����referrenceCostCurrency���Ե�ֵ��
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
     * ��ȡreferrenceCostCurrencySKey���Ե�ֵ��
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
     * ����referrenceCostCurrencySKey���Ե�ֵ��
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
     * ��ȡsnParam���Ե�ֵ��
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
     * ����snParam���Ե�ֵ��
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
     * ��ȡsnParamSKey���Ե�ֵ��
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
     * ����snParamSKey���Ե�ֵ��
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
     * ��ȡtimeBucket���Ե�ֵ��
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
     * ����timeBucket���Ե�ֵ��
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
     * ��ȡtimeBucketSKey���Ե�ֵ��
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
     * ����timeBucketSKey���Ե�ֵ��
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
     * ��ȡwarehouse���Ե�ֵ��
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
     * ����warehouse���Ե�ֵ��
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
     * ��ȡwarehouseManager���Ե�ֵ��
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
     * ����warehouseManager���Ե�ֵ��
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
     * ��ȡwarehouseManagerSKey���Ե�ֵ��
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
     * ����warehouseManagerSKey���Ե�ֵ��
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
     * ��ȡwarehouseSKey���Ե�ֵ��
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
     * ����warehouseSKey���Ե�ֵ��
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
     * ��ȡmApprDiffAmt���Ե�ֵ��
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
     * ����mApprDiffAmt���Ե�ֵ��
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
     * ��ȡmApprDiffAmtRate���Ե�ֵ��
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
     * ����mApprDiffAmtRate���Ե�ֵ��
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
     * ��ȡmApprDiffQty���Ե�ֵ��
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
     * ����mApprDiffQty���Ե�ֵ��
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
     * ��ȡmApprDiffQtyRate���Ե�ֵ��
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
     * ����mApprDiffQtyRate���Ե�ֵ��
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
     * ��ȡmApprDiffRule���Ե�ֵ��
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
     * ����mApprDiffRule���Ե�ֵ��
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
     * ��ȡmAvgUsageQty���Ե�ֵ��
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
     * ����mAvgUsageQty���Ե�ֵ��
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
     * ��ȡmAvgUsageQtyCalDays���Ե�ֵ��
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
     * ����mAvgUsageQtyCalDays���Ե�ֵ��
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
     * ��ȡmBarcodeMakeMode���Ե�ֵ��
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
     * ����mBarcodeMakeMode���Ե�ֵ��
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
     * ��ȡmBarcodeTrackMode���Ե�ֵ��
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
     * ����mBarcodeTrackMode���Ե�ֵ��
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
     * ��ȡmConvertRatio���Ե�ֵ��
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
     * ����mConvertRatio���Ե�ֵ��
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
     * ��ȡmDeliveryPriceGroup���Ե�ֵ��
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
     * ����mDeliveryPriceGroup���Ե�ֵ��
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
     * ��ȡmEconomyOrderQty���Ե�ֵ��
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
     * ����mEconomyOrderQty���Ե�ֵ��
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
     * ��ȡmFixPeriod���Ե�ֵ��
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
     * ����mFixPeriod���Ե�ֵ��
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
     * ��ȡmInvToPurMode���Ե�ֵ��
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
     * ����mInvToPurMode���Ե�ֵ��
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
     * ��ȡmInventoryCostRate���Ե�ֵ��
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
     * ����mInventoryCostRate���Ե�ֵ��
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
     * ��ȡmInventoryMaxLimitQty���Ե�ֵ��
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
     * ����mInventoryMaxLimitQty���Ե�ֵ��
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
     * ��ȡmInventoryMinLimitQty���Ե�ֵ��
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
     * ����mInventoryMinLimitQty���Ե�ֵ��
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
     * ��ȡmInventoryPlanTime���Ե�ֵ��
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
     * ����mInventoryPlanTime���Ե�ֵ��
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
     * ��ȡmInventoryPlanningMethod���Ե�ֵ��
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
     * ����mInventoryPlanningMethod���Ե�ֵ��
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
     * ��ȡmIsBalanceByProject���Ե�ֵ��
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
     * ����mIsBalanceByProject���Ե�ֵ��
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
     * ��ȡmIsCanalBinUnMarkCheck���Ե�ֵ��
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
     * ����mIsCanalBinUnMarkCheck���Ե�ֵ��
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
     * ��ȡmIsCostCalByLot���Ե�ֵ��
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
     * ����mIsCostCalByLot���Ե�ֵ��
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
     * ��ȡmIsIncSerialNo���Ե�ֵ��
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
     * ����mIsIncSerialNo���Ե�ֵ��
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
     * ��ȡmIsIncZeroQty���Ե�ֵ��
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
     * ����mIsIncZeroQty���Ե�ֵ��
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
     * ��ȡmIsInvCalculateBySeiban���Ե�ֵ��
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
     * ����mIsInvCalculateBySeiban���Ե�ֵ��
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
     * ��ȡmIsInvCalculateByTradeMark���Ե�ֵ��
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
     * ����mIsInvCalculateByTradeMark���Ե�ֵ��
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
     * ��ȡmIsInvCalculateByVersion���Ե�ֵ��
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
     * ����mIsInvCalculateByVersion���Ե�ֵ��
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
     * ��ȡmIsKitMustWholeSet���Ե�ֵ��
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
     * ����mIsKitMustWholeSet���Ե�ֵ��
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
     * ��ȡmIsLimitBin���Ե�ֵ��
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
     * ����mIsLimitBin���Ե�ֵ��
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
     * ��ȡmIsLimitWarehouse���Ե�ֵ��
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
     * ����mIsLimitWarehouse���Ե�ֵ��
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
     * ��ȡmIsLotOverdueTransOut���Ե�ֵ��
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
     * ����mIsLotOverdueTransOut���Ե�ֵ��
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
     * ��ȡmIsNegativeInventory���Ե�ֵ��
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
     * ����mIsNegativeInventory���Ե�ֵ��
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
     * ��ȡmIsRequiredShipperSupply���Ե�ֵ��
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
     * ����mIsRequiredShipperSupply���Ե�ֵ��
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
     * ��ȡmIsReservable���Ե�ֵ��
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
     * ����mIsReservable���Ե�ֵ��
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
     * ��ȡmIsShipmentOverdueLot���Ե�ֵ��
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
     * ����mIsShipmentOverdueLot���Ե�ֵ��
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
     * ��ȡmIsStructBarcode���Ե�ֵ��
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
     * ����mIsStructBarcode���Ե�ֵ��
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
     * ��ȡmItemMaster���Ե�ֵ��
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
     * ����mItemMaster���Ե�ֵ��
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
     * ��ȡmLotControlMode���Ե�ֵ��
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
     * ����mLotControlMode���Ե�ֵ��
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
     * ��ȡmLotOverdueDays���Ե�ֵ��
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
     * ����mLotOverdueDays���Ե�ֵ��
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
     * ��ȡmLotValidDate���Ե�ֵ��
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
     * ����mLotValidDate���Ե�ֵ��
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
     * ��ȡmNextSupplyDate���Ե�ֵ��
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
     * ����mNextSupplyDate���Ե�ֵ��
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
     * ��ȡmOrderCost���Ե�ֵ��
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
     * ����mOrderCost���Ե�ֵ��
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
     * ��ȡmPickingRule���Ե�ֵ��
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
     * ����mPickingRule���Ե�ֵ��
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
     * ��ȡmPurchaseControlMode���Ե�ֵ��
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
     * ����mPurchaseControlMode���Ե�ֵ��
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
     * ��ȡmPutawayRule���Ե�ֵ��
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
     * ����mPutawayRule���Ե�ֵ��
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
     * ��ȡmReferrenceCost���Ե�ֵ��
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
     * ����mReferrenceCost���Ե�ֵ��
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
     * ��ȡmReorderQty���Ե�ֵ��
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
     * ����mReorderQty���Ե�ֵ��
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
     * ��ȡmReserveDays���Ե�ֵ��
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
     * ����mReserveDays���Ե�ֵ��
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
     * ��ȡmReserveMode���Ե�ֵ��
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
     * ����mReserveMode���Ե�ֵ��
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
     * ��ȡmSafetyStockPeriod���Ե�ֵ��
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
     * ����mSafetyStockPeriod���Ե�ֵ��
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
     * ��ȡmSafetyStockQty���Ե�ֵ��
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
     * ����mSafetyStockQty���Ե�ֵ��
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
     * ��ȡmSafetyStockRate���Ե�ֵ��
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
     * ����mSafetyStockRate���Ե�ֵ��
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
     * ��ȡmSafetyStockType���Ե�ֵ��
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
     * ����mSafetyStockType���Ե�ֵ��
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
     * ��ȡmStandardBox���Ե�ֵ��
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
     * ����mStandardBox���Ե�ֵ��
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
     * ��ȡmSupplyMethod���Ե�ֵ��
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
     * ����mSupplyMethod���Ե�ֵ��
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
     * ��ȡmTurnOverDays���Ե�ֵ��
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
     * ����mTurnOverDays���Ե�ֵ��
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
     * ��ȡmTurnOverRate���Ե�ֵ��
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
     * ����mTurnOverRate���Ե�ֵ��
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
     * ��ȡmWastageRate���Ե�ֵ��
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
     * ����mWastageRate���Ե�ֵ��
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
