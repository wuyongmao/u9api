
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


/**
 * &lt;p&gt;UFIDA.U9.CBO.SCM.Item.ItemSaleInfoData complex type的 Java 类。
 * 
 * &lt;p&gt;以下模式片段指定包含在此类中的预期内容。
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="UFIDA.U9.CBO.SCM.Item.ItemSaleInfoData"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://www.UFIDA.org/EntityData}UFSoft.UBF.Business.DataTransObjectBase"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="ATPRule" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ATPRule_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="BOMOrg" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="BOMOrg_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="FamilyAdscription_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ItemForInvoice_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ItemMaster_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="SDRtnTradePath" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="SDRtnTradePath_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="SDTradePath" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="SDTradePath_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="SaleCurrency" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="SaleCurrency_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="SaleLimitCurrency" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="SaleLimitCurrency_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="SaleTaxSchedule" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="SaleTaxSchedule_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="SalesDepartment" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="SalesDepartment_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="SalesPerson" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="SalesPerson_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ShipmentWarehouse" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ShipmentWarehouse_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Supplier" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Supplier_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="SupplyOrg" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="SupplyOrg_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_allowAutoGetNum" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_availableQtyRule" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_commodityTaxCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_createdBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_createdOn" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_demandTransType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_familyAdscription" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CBO.SCM.Item.ItemMasterData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_familyLayer" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_grossRate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_iD" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isATPCheck" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isAvailableQtyCheck" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isCTP" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isCalLandCarriageFee" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isPriceProtectSN" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isRMAAllowModify" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isReturnCheckLot" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isReturnCheckSN" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isReturnable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isSDRtnTradePathModify" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isSDTradePathModify" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_itemForInvoice" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CBO.SCM.Item.ItemMasterData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_itemMaster" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CBO.SCM.Item.ItemMasterData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_kitItemPriceStyle" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_limitPriceBy" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_limitPriceMode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_maxLimitPrice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_maxLimitPriceRate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_maxSaleQty" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_minLimitPrice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_minLimitPriceRate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_minOrderQtyCheckType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_minSaleQty" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_modifiedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_modifiedOn" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_nameForInvoice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_saleBatchQty" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_saleMinDiscount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_salePriceList" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_supplySource" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_sysVersion" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UFIDA.U9.CBO.SCM.Item.ItemSaleInfoData", propOrder = {
    "atpRule",
    "atpRuleSKey",
    "bomOrg",
    "bomOrgSKey",
    "familyAdscriptionSKey",
    "itemForInvoiceSKey",
    "itemMasterSKey",
    "sdRtnTradePath",
    "sdRtnTradePathSKey",
    "sdTradePath",
    "sdTradePathSKey",
    "saleCurrency",
    "saleCurrencySKey",
    "saleLimitCurrency",
    "saleLimitCurrencySKey",
    "saleTaxSchedule",
    "saleTaxScheduleSKey",
    "salesDepartment",
    "salesDepartmentSKey",
    "salesPerson",
    "salesPersonSKey",
    "shipmentWarehouse",
    "shipmentWarehouseSKey",
    "supplier",
    "supplierSKey",
    "supplyOrg",
    "supplyOrgSKey",
    "mAllowAutoGetNum",
    "mAvailableQtyRule",
    "mCommodityTaxCode",
    "mCreatedBy",
    "mCreatedOn",
    "mDemandTransType",
    "mFamilyAdscription",
    "mFamilyLayer",
    "mGrossRate",
    "mid",
    "mIsATPCheck",
    "mIsAvailableQtyCheck",
    "mIsCTP",
    "mIsCalLandCarriageFee",
    "mIsPriceProtectSN",
    "mIsRMAAllowModify",
    "mIsReturnCheckLot",
    "mIsReturnCheckSN",
    "mIsReturnable",
    "mIsSDRtnTradePathModify",
    "mIsSDTradePathModify",
    "mItemForInvoice",
    "mItemMaster",
    "mKitItemPriceStyle",
    "mLimitPriceBy",
    "mLimitPriceMode",
    "mMaxLimitPrice",
    "mMaxLimitPriceRate",
    "mMaxSaleQty",
    "mMinLimitPrice",
    "mMinLimitPriceRate",
    "mMinOrderQtyCheckType",
    "mMinSaleQty",
    "mModifiedBy",
    "mModifiedOn",
    "mNameForInvoice",
    "mSaleBatchQty",
    "mSaleMinDiscount",
    "mSalePriceList",
    "mSupplySource",
    "mSysVersion"
})
public class UFIDAU9CBOSCMItemItemSaleInfoData
    extends UFSoftUBFBusinessDataTransObjectBase
{

    @XmlElement(name = "ATPRule")
    protected Long atpRule;
    @XmlElementRef(name = "ATPRule_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> atpRuleSKey;
    @XmlElement(name = "BOMOrg")
    protected Long bomOrg;
    @XmlElementRef(name = "BOMOrg_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> bomOrgSKey;
    @XmlElementRef(name = "FamilyAdscription_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> familyAdscriptionSKey;
    @XmlElementRef(name = "ItemForInvoice_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> itemForInvoiceSKey;
    @XmlElementRef(name = "ItemMaster_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> itemMasterSKey;
    @XmlElement(name = "SDRtnTradePath")
    protected Long sdRtnTradePath;
    @XmlElementRef(name = "SDRtnTradePath_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> sdRtnTradePathSKey;
    @XmlElement(name = "SDTradePath")
    protected Long sdTradePath;
    @XmlElementRef(name = "SDTradePath_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> sdTradePathSKey;
    @XmlElement(name = "SaleCurrency")
    protected Long saleCurrency;
    @XmlElementRef(name = "SaleCurrency_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> saleCurrencySKey;
    @XmlElement(name = "SaleLimitCurrency")
    protected Long saleLimitCurrency;
    @XmlElementRef(name = "SaleLimitCurrency_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> saleLimitCurrencySKey;
    @XmlElement(name = "SaleTaxSchedule")
    protected Long saleTaxSchedule;
    @XmlElementRef(name = "SaleTaxSchedule_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> saleTaxScheduleSKey;
    @XmlElement(name = "SalesDepartment")
    protected Long salesDepartment;
    @XmlElementRef(name = "SalesDepartment_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> salesDepartmentSKey;
    @XmlElement(name = "SalesPerson")
    protected Long salesPerson;
    @XmlElementRef(name = "SalesPerson_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> salesPersonSKey;
    @XmlElement(name = "ShipmentWarehouse")
    protected Long shipmentWarehouse;
    @XmlElementRef(name = "ShipmentWarehouse_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> shipmentWarehouseSKey;
    @XmlElement(name = "Supplier")
    protected Long supplier;
    @XmlElementRef(name = "Supplier_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> supplierSKey;
    @XmlElement(name = "SupplyOrg")
    protected Long supplyOrg;
    @XmlElementRef(name = "SupplyOrg_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> supplyOrgSKey;
    @XmlElement(name = "m_allowAutoGetNum")
    protected Boolean mAllowAutoGetNum;
    @XmlElement(name = "m_availableQtyRule")
    protected Long mAvailableQtyRule;
    @XmlElementRef(name = "m_commodityTaxCode", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mCommodityTaxCode;
    @XmlElementRef(name = "m_createdBy", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mCreatedBy;
    @XmlElement(name = "m_createdOn")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mCreatedOn;
    @XmlElement(name = "m_demandTransType")
    protected Integer mDemandTransType;
    @XmlElementRef(name = "m_familyAdscription", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9CBOSCMItemItemMasterData> mFamilyAdscription;
    @XmlElement(name = "m_familyLayer")
    protected Integer mFamilyLayer;
    @XmlElement(name = "m_grossRate")
    protected BigDecimal mGrossRate;
    @XmlElement(name = "m_iD")
    protected Long mid;
    @XmlElement(name = "m_isATPCheck")
    protected Boolean mIsATPCheck;
    @XmlElement(name = "m_isAvailableQtyCheck")
    protected Boolean mIsAvailableQtyCheck;
    @XmlElement(name = "m_isCTP")
    protected Boolean mIsCTP;
    @XmlElement(name = "m_isCalLandCarriageFee")
    protected Boolean mIsCalLandCarriageFee;
    @XmlElement(name = "m_isPriceProtectSN")
    protected Boolean mIsPriceProtectSN;
    @XmlElement(name = "m_isRMAAllowModify")
    protected Boolean mIsRMAAllowModify;
    @XmlElement(name = "m_isReturnCheckLot")
    protected Boolean mIsReturnCheckLot;
    @XmlElement(name = "m_isReturnCheckSN")
    protected Boolean mIsReturnCheckSN;
    @XmlElement(name = "m_isReturnable")
    protected Boolean mIsReturnable;
    @XmlElement(name = "m_isSDRtnTradePathModify")
    protected Boolean mIsSDRtnTradePathModify;
    @XmlElement(name = "m_isSDTradePathModify")
    protected Boolean mIsSDTradePathModify;
    @XmlElementRef(name = "m_itemForInvoice", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9CBOSCMItemItemMasterData> mItemForInvoice;
    @XmlElementRef(name = "m_itemMaster", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9CBOSCMItemItemMasterData> mItemMaster;
    @XmlElement(name = "m_kitItemPriceStyle")
    protected Integer mKitItemPriceStyle;
    @XmlElement(name = "m_limitPriceBy")
    protected Integer mLimitPriceBy;
    @XmlElement(name = "m_limitPriceMode")
    protected Integer mLimitPriceMode;
    @XmlElement(name = "m_maxLimitPrice")
    protected BigDecimal mMaxLimitPrice;
    @XmlElement(name = "m_maxLimitPriceRate")
    protected BigDecimal mMaxLimitPriceRate;
    @XmlElement(name = "m_maxSaleQty")
    protected BigDecimal mMaxSaleQty;
    @XmlElement(name = "m_minLimitPrice")
    protected BigDecimal mMinLimitPrice;
    @XmlElement(name = "m_minLimitPriceRate")
    protected BigDecimal mMinLimitPriceRate;
    @XmlElement(name = "m_minOrderQtyCheckType")
    protected Integer mMinOrderQtyCheckType;
    @XmlElement(name = "m_minSaleQty")
    protected BigDecimal mMinSaleQty;
    @XmlElementRef(name = "m_modifiedBy", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mModifiedBy;
    @XmlElement(name = "m_modifiedOn")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mModifiedOn;
    @XmlElementRef(name = "m_nameForInvoice", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mNameForInvoice;
    @XmlElement(name = "m_saleBatchQty")
    protected BigDecimal mSaleBatchQty;
    @XmlElement(name = "m_saleMinDiscount")
    protected BigDecimal mSaleMinDiscount;
    @XmlElement(name = "m_salePriceList")
    protected Long mSalePriceList;
    @XmlElement(name = "m_supplySource")
    protected Integer mSupplySource;
    @XmlElement(name = "m_sysVersion")
    protected Long mSysVersion;

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
     * 获取bomOrg属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getBOMOrg() {
        return bomOrg;
    }

    /**
     * 设置bomOrg属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setBOMOrg(Long value) {
        this.bomOrg = value;
    }

    /**
     * 获取bomOrgSKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getBOMOrgSKey() {
        return bomOrgSKey;
    }

    /**
     * 设置bomOrgSKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setBOMOrgSKey(JAXBElement<EntityKey> value) {
        this.bomOrgSKey = value;
    }

    /**
     * 获取familyAdscriptionSKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getFamilyAdscriptionSKey() {
        return familyAdscriptionSKey;
    }

    /**
     * 设置familyAdscriptionSKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setFamilyAdscriptionSKey(JAXBElement<EntityKey> value) {
        this.familyAdscriptionSKey = value;
    }

    /**
     * 获取itemForInvoiceSKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getItemForInvoiceSKey() {
        return itemForInvoiceSKey;
    }

    /**
     * 设置itemForInvoiceSKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setItemForInvoiceSKey(JAXBElement<EntityKey> value) {
        this.itemForInvoiceSKey = value;
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
     * 获取sdRtnTradePath属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSDRtnTradePath() {
        return sdRtnTradePath;
    }

    /**
     * 设置sdRtnTradePath属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSDRtnTradePath(Long value) {
        this.sdRtnTradePath = value;
    }

    /**
     * 获取sdRtnTradePathSKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getSDRtnTradePathSKey() {
        return sdRtnTradePathSKey;
    }

    /**
     * 设置sdRtnTradePathSKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setSDRtnTradePathSKey(JAXBElement<EntityKey> value) {
        this.sdRtnTradePathSKey = value;
    }

    /**
     * 获取sdTradePath属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSDTradePath() {
        return sdTradePath;
    }

    /**
     * 设置sdTradePath属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSDTradePath(Long value) {
        this.sdTradePath = value;
    }

    /**
     * 获取sdTradePathSKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getSDTradePathSKey() {
        return sdTradePathSKey;
    }

    /**
     * 设置sdTradePathSKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setSDTradePathSKey(JAXBElement<EntityKey> value) {
        this.sdTradePathSKey = value;
    }

    /**
     * 获取saleCurrency属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSaleCurrency() {
        return saleCurrency;
    }

    /**
     * 设置saleCurrency属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSaleCurrency(Long value) {
        this.saleCurrency = value;
    }

    /**
     * 获取saleCurrencySKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getSaleCurrencySKey() {
        return saleCurrencySKey;
    }

    /**
     * 设置saleCurrencySKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setSaleCurrencySKey(JAXBElement<EntityKey> value) {
        this.saleCurrencySKey = value;
    }

    /**
     * 获取saleLimitCurrency属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSaleLimitCurrency() {
        return saleLimitCurrency;
    }

    /**
     * 设置saleLimitCurrency属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSaleLimitCurrency(Long value) {
        this.saleLimitCurrency = value;
    }

    /**
     * 获取saleLimitCurrencySKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getSaleLimitCurrencySKey() {
        return saleLimitCurrencySKey;
    }

    /**
     * 设置saleLimitCurrencySKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setSaleLimitCurrencySKey(JAXBElement<EntityKey> value) {
        this.saleLimitCurrencySKey = value;
    }

    /**
     * 获取saleTaxSchedule属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSaleTaxSchedule() {
        return saleTaxSchedule;
    }

    /**
     * 设置saleTaxSchedule属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSaleTaxSchedule(Long value) {
        this.saleTaxSchedule = value;
    }

    /**
     * 获取saleTaxScheduleSKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getSaleTaxScheduleSKey() {
        return saleTaxScheduleSKey;
    }

    /**
     * 设置saleTaxScheduleSKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setSaleTaxScheduleSKey(JAXBElement<EntityKey> value) {
        this.saleTaxScheduleSKey = value;
    }

    /**
     * 获取salesDepartment属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSalesDepartment() {
        return salesDepartment;
    }

    /**
     * 设置salesDepartment属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSalesDepartment(Long value) {
        this.salesDepartment = value;
    }

    /**
     * 获取salesDepartmentSKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getSalesDepartmentSKey() {
        return salesDepartmentSKey;
    }

    /**
     * 设置salesDepartmentSKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setSalesDepartmentSKey(JAXBElement<EntityKey> value) {
        this.salesDepartmentSKey = value;
    }

    /**
     * 获取salesPerson属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSalesPerson() {
        return salesPerson;
    }

    /**
     * 设置salesPerson属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSalesPerson(Long value) {
        this.salesPerson = value;
    }

    /**
     * 获取salesPersonSKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getSalesPersonSKey() {
        return salesPersonSKey;
    }

    /**
     * 设置salesPersonSKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setSalesPersonSKey(JAXBElement<EntityKey> value) {
        this.salesPersonSKey = value;
    }

    /**
     * 获取shipmentWarehouse属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getShipmentWarehouse() {
        return shipmentWarehouse;
    }

    /**
     * 设置shipmentWarehouse属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setShipmentWarehouse(Long value) {
        this.shipmentWarehouse = value;
    }

    /**
     * 获取shipmentWarehouseSKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getShipmentWarehouseSKey() {
        return shipmentWarehouseSKey;
    }

    /**
     * 设置shipmentWarehouseSKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setShipmentWarehouseSKey(JAXBElement<EntityKey> value) {
        this.shipmentWarehouseSKey = value;
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
     * 获取mAllowAutoGetNum属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMAllowAutoGetNum() {
        return mAllowAutoGetNum;
    }

    /**
     * 设置mAllowAutoGetNum属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMAllowAutoGetNum(Boolean value) {
        this.mAllowAutoGetNum = value;
    }

    /**
     * 获取mAvailableQtyRule属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMAvailableQtyRule() {
        return mAvailableQtyRule;
    }

    /**
     * 设置mAvailableQtyRule属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMAvailableQtyRule(Long value) {
        this.mAvailableQtyRule = value;
    }

    /**
     * 获取mCommodityTaxCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMCommodityTaxCode() {
        return mCommodityTaxCode;
    }

    /**
     * 设置mCommodityTaxCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMCommodityTaxCode(JAXBElement<String> value) {
        this.mCommodityTaxCode = value;
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
     * 获取mFamilyAdscription属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOSCMItemItemMasterData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9CBOSCMItemItemMasterData> getMFamilyAdscription() {
        return mFamilyAdscription;
    }

    /**
     * 设置mFamilyAdscription属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOSCMItemItemMasterData }{@code >}
     *     
     */
    public void setMFamilyAdscription(JAXBElement<UFIDAU9CBOSCMItemItemMasterData> value) {
        this.mFamilyAdscription = value;
    }

    /**
     * 获取mFamilyLayer属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMFamilyLayer() {
        return mFamilyLayer;
    }

    /**
     * 设置mFamilyLayer属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMFamilyLayer(Integer value) {
        this.mFamilyLayer = value;
    }

    /**
     * 获取mGrossRate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMGrossRate() {
        return mGrossRate;
    }

    /**
     * 设置mGrossRate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMGrossRate(BigDecimal value) {
        this.mGrossRate = value;
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
     * 获取mIsATPCheck属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsATPCheck() {
        return mIsATPCheck;
    }

    /**
     * 设置mIsATPCheck属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsATPCheck(Boolean value) {
        this.mIsATPCheck = value;
    }

    /**
     * 获取mIsAvailableQtyCheck属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsAvailableQtyCheck() {
        return mIsAvailableQtyCheck;
    }

    /**
     * 设置mIsAvailableQtyCheck属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsAvailableQtyCheck(Boolean value) {
        this.mIsAvailableQtyCheck = value;
    }

    /**
     * 获取mIsCTP属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsCTP() {
        return mIsCTP;
    }

    /**
     * 设置mIsCTP属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsCTP(Boolean value) {
        this.mIsCTP = value;
    }

    /**
     * 获取mIsCalLandCarriageFee属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsCalLandCarriageFee() {
        return mIsCalLandCarriageFee;
    }

    /**
     * 设置mIsCalLandCarriageFee属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsCalLandCarriageFee(Boolean value) {
        this.mIsCalLandCarriageFee = value;
    }

    /**
     * 获取mIsPriceProtectSN属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsPriceProtectSN() {
        return mIsPriceProtectSN;
    }

    /**
     * 设置mIsPriceProtectSN属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsPriceProtectSN(Boolean value) {
        this.mIsPriceProtectSN = value;
    }

    /**
     * 获取mIsRMAAllowModify属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsRMAAllowModify() {
        return mIsRMAAllowModify;
    }

    /**
     * 设置mIsRMAAllowModify属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsRMAAllowModify(Boolean value) {
        this.mIsRMAAllowModify = value;
    }

    /**
     * 获取mIsReturnCheckLot属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsReturnCheckLot() {
        return mIsReturnCheckLot;
    }

    /**
     * 设置mIsReturnCheckLot属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsReturnCheckLot(Boolean value) {
        this.mIsReturnCheckLot = value;
    }

    /**
     * 获取mIsReturnCheckSN属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsReturnCheckSN() {
        return mIsReturnCheckSN;
    }

    /**
     * 设置mIsReturnCheckSN属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsReturnCheckSN(Boolean value) {
        this.mIsReturnCheckSN = value;
    }

    /**
     * 获取mIsReturnable属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsReturnable() {
        return mIsReturnable;
    }

    /**
     * 设置mIsReturnable属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsReturnable(Boolean value) {
        this.mIsReturnable = value;
    }

    /**
     * 获取mIsSDRtnTradePathModify属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsSDRtnTradePathModify() {
        return mIsSDRtnTradePathModify;
    }

    /**
     * 设置mIsSDRtnTradePathModify属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsSDRtnTradePathModify(Boolean value) {
        this.mIsSDRtnTradePathModify = value;
    }

    /**
     * 获取mIsSDTradePathModify属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsSDTradePathModify() {
        return mIsSDTradePathModify;
    }

    /**
     * 设置mIsSDTradePathModify属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsSDTradePathModify(Boolean value) {
        this.mIsSDTradePathModify = value;
    }

    /**
     * 获取mItemForInvoice属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOSCMItemItemMasterData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9CBOSCMItemItemMasterData> getMItemForInvoice() {
        return mItemForInvoice;
    }

    /**
     * 设置mItemForInvoice属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOSCMItemItemMasterData }{@code >}
     *     
     */
    public void setMItemForInvoice(JAXBElement<UFIDAU9CBOSCMItemItemMasterData> value) {
        this.mItemForInvoice = value;
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
     * 获取mKitItemPriceStyle属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMKitItemPriceStyle() {
        return mKitItemPriceStyle;
    }

    /**
     * 设置mKitItemPriceStyle属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMKitItemPriceStyle(Integer value) {
        this.mKitItemPriceStyle = value;
    }

    /**
     * 获取mLimitPriceBy属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMLimitPriceBy() {
        return mLimitPriceBy;
    }

    /**
     * 设置mLimitPriceBy属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMLimitPriceBy(Integer value) {
        this.mLimitPriceBy = value;
    }

    /**
     * 获取mLimitPriceMode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMLimitPriceMode() {
        return mLimitPriceMode;
    }

    /**
     * 设置mLimitPriceMode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMLimitPriceMode(Integer value) {
        this.mLimitPriceMode = value;
    }

    /**
     * 获取mMaxLimitPrice属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMMaxLimitPrice() {
        return mMaxLimitPrice;
    }

    /**
     * 设置mMaxLimitPrice属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMMaxLimitPrice(BigDecimal value) {
        this.mMaxLimitPrice = value;
    }

    /**
     * 获取mMaxLimitPriceRate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMMaxLimitPriceRate() {
        return mMaxLimitPriceRate;
    }

    /**
     * 设置mMaxLimitPriceRate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMMaxLimitPriceRate(BigDecimal value) {
        this.mMaxLimitPriceRate = value;
    }

    /**
     * 获取mMaxSaleQty属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMMaxSaleQty() {
        return mMaxSaleQty;
    }

    /**
     * 设置mMaxSaleQty属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMMaxSaleQty(BigDecimal value) {
        this.mMaxSaleQty = value;
    }

    /**
     * 获取mMinLimitPrice属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMMinLimitPrice() {
        return mMinLimitPrice;
    }

    /**
     * 设置mMinLimitPrice属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMMinLimitPrice(BigDecimal value) {
        this.mMinLimitPrice = value;
    }

    /**
     * 获取mMinLimitPriceRate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMMinLimitPriceRate() {
        return mMinLimitPriceRate;
    }

    /**
     * 设置mMinLimitPriceRate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMMinLimitPriceRate(BigDecimal value) {
        this.mMinLimitPriceRate = value;
    }

    /**
     * 获取mMinOrderQtyCheckType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMMinOrderQtyCheckType() {
        return mMinOrderQtyCheckType;
    }

    /**
     * 设置mMinOrderQtyCheckType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMMinOrderQtyCheckType(Integer value) {
        this.mMinOrderQtyCheckType = value;
    }

    /**
     * 获取mMinSaleQty属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMMinSaleQty() {
        return mMinSaleQty;
    }

    /**
     * 设置mMinSaleQty属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMMinSaleQty(BigDecimal value) {
        this.mMinSaleQty = value;
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
     * 获取mNameForInvoice属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMNameForInvoice() {
        return mNameForInvoice;
    }

    /**
     * 设置mNameForInvoice属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMNameForInvoice(JAXBElement<String> value) {
        this.mNameForInvoice = value;
    }

    /**
     * 获取mSaleBatchQty属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMSaleBatchQty() {
        return mSaleBatchQty;
    }

    /**
     * 设置mSaleBatchQty属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMSaleBatchQty(BigDecimal value) {
        this.mSaleBatchQty = value;
    }

    /**
     * 获取mSaleMinDiscount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMSaleMinDiscount() {
        return mSaleMinDiscount;
    }

    /**
     * 设置mSaleMinDiscount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMSaleMinDiscount(BigDecimal value) {
        this.mSaleMinDiscount = value;
    }

    /**
     * 获取mSalePriceList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMSalePriceList() {
        return mSalePriceList;
    }

    /**
     * 设置mSalePriceList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMSalePriceList(Long value) {
        this.mSalePriceList = value;
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

}
