
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
 * &lt;p&gt;UFIDA.U9.CBO.SCM.Item.ItemSaleInfoData complex type�� Java �ࡣ
 * 
 * &lt;p&gt;����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡbomOrg���Ե�ֵ��
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
     * ����bomOrg���Ե�ֵ��
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
     * ��ȡbomOrgSKey���Ե�ֵ��
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
     * ����bomOrgSKey���Ե�ֵ��
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
     * ��ȡfamilyAdscriptionSKey���Ե�ֵ��
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
     * ����familyAdscriptionSKey���Ե�ֵ��
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
     * ��ȡitemForInvoiceSKey���Ե�ֵ��
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
     * ����itemForInvoiceSKey���Ե�ֵ��
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
     * ��ȡsdRtnTradePath���Ե�ֵ��
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
     * ����sdRtnTradePath���Ե�ֵ��
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
     * ��ȡsdRtnTradePathSKey���Ե�ֵ��
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
     * ����sdRtnTradePathSKey���Ե�ֵ��
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
     * ��ȡsdTradePath���Ե�ֵ��
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
     * ����sdTradePath���Ե�ֵ��
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
     * ��ȡsdTradePathSKey���Ե�ֵ��
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
     * ����sdTradePathSKey���Ե�ֵ��
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
     * ��ȡsaleCurrency���Ե�ֵ��
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
     * ����saleCurrency���Ե�ֵ��
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
     * ��ȡsaleCurrencySKey���Ե�ֵ��
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
     * ����saleCurrencySKey���Ե�ֵ��
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
     * ��ȡsaleLimitCurrency���Ե�ֵ��
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
     * ����saleLimitCurrency���Ե�ֵ��
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
     * ��ȡsaleLimitCurrencySKey���Ե�ֵ��
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
     * ����saleLimitCurrencySKey���Ե�ֵ��
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
     * ��ȡsaleTaxSchedule���Ե�ֵ��
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
     * ����saleTaxSchedule���Ե�ֵ��
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
     * ��ȡsaleTaxScheduleSKey���Ե�ֵ��
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
     * ����saleTaxScheduleSKey���Ե�ֵ��
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
     * ��ȡsalesDepartment���Ե�ֵ��
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
     * ����salesDepartment���Ե�ֵ��
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
     * ��ȡsalesDepartmentSKey���Ե�ֵ��
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
     * ����salesDepartmentSKey���Ե�ֵ��
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
     * ��ȡsalesPerson���Ե�ֵ��
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
     * ����salesPerson���Ե�ֵ��
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
     * ��ȡsalesPersonSKey���Ե�ֵ��
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
     * ����salesPersonSKey���Ե�ֵ��
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
     * ��ȡshipmentWarehouse���Ե�ֵ��
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
     * ����shipmentWarehouse���Ե�ֵ��
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
     * ��ȡshipmentWarehouseSKey���Ե�ֵ��
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
     * ����shipmentWarehouseSKey���Ե�ֵ��
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
     * ��ȡsupplier���Ե�ֵ��
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
     * ����supplier���Ե�ֵ��
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
     * ��ȡsupplierSKey���Ե�ֵ��
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
     * ����supplierSKey���Ե�ֵ��
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
     * ��ȡsupplyOrg���Ե�ֵ��
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
     * ����supplyOrg���Ե�ֵ��
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
     * ��ȡsupplyOrgSKey���Ե�ֵ��
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
     * ����supplyOrgSKey���Ե�ֵ��
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
     * ��ȡmAllowAutoGetNum���Ե�ֵ��
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
     * ����mAllowAutoGetNum���Ե�ֵ��
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
     * ��ȡmAvailableQtyRule���Ե�ֵ��
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
     * ����mAvailableQtyRule���Ե�ֵ��
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
     * ��ȡmCommodityTaxCode���Ե�ֵ��
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
     * ����mCommodityTaxCode���Ե�ֵ��
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
     * ��ȡmDemandTransType���Ե�ֵ��
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
     * ����mDemandTransType���Ե�ֵ��
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
     * ��ȡmFamilyAdscription���Ե�ֵ��
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
     * ����mFamilyAdscription���Ե�ֵ��
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
     * ��ȡmFamilyLayer���Ե�ֵ��
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
     * ����mFamilyLayer���Ե�ֵ��
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
     * ��ȡmGrossRate���Ե�ֵ��
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
     * ����mGrossRate���Ե�ֵ��
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
     * ��ȡmIsATPCheck���Ե�ֵ��
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
     * ����mIsATPCheck���Ե�ֵ��
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
     * ��ȡmIsAvailableQtyCheck���Ե�ֵ��
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
     * ����mIsAvailableQtyCheck���Ե�ֵ��
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
     * ��ȡmIsCTP���Ե�ֵ��
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
     * ����mIsCTP���Ե�ֵ��
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
     * ��ȡmIsCalLandCarriageFee���Ե�ֵ��
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
     * ����mIsCalLandCarriageFee���Ե�ֵ��
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
     * ��ȡmIsPriceProtectSN���Ե�ֵ��
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
     * ����mIsPriceProtectSN���Ե�ֵ��
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
     * ��ȡmIsRMAAllowModify���Ե�ֵ��
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
     * ����mIsRMAAllowModify���Ե�ֵ��
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
     * ��ȡmIsReturnCheckLot���Ե�ֵ��
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
     * ����mIsReturnCheckLot���Ե�ֵ��
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
     * ��ȡmIsReturnCheckSN���Ե�ֵ��
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
     * ����mIsReturnCheckSN���Ե�ֵ��
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
     * ��ȡmIsReturnable���Ե�ֵ��
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
     * ����mIsReturnable���Ե�ֵ��
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
     * ��ȡmIsSDRtnTradePathModify���Ե�ֵ��
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
     * ����mIsSDRtnTradePathModify���Ե�ֵ��
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
     * ��ȡmIsSDTradePathModify���Ե�ֵ��
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
     * ����mIsSDTradePathModify���Ե�ֵ��
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
     * ��ȡmItemForInvoice���Ե�ֵ��
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
     * ����mItemForInvoice���Ե�ֵ��
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
     * ��ȡmKitItemPriceStyle���Ե�ֵ��
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
     * ����mKitItemPriceStyle���Ե�ֵ��
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
     * ��ȡmLimitPriceBy���Ե�ֵ��
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
     * ����mLimitPriceBy���Ե�ֵ��
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
     * ��ȡmLimitPriceMode���Ե�ֵ��
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
     * ����mLimitPriceMode���Ե�ֵ��
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
     * ��ȡmMaxLimitPrice���Ե�ֵ��
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
     * ����mMaxLimitPrice���Ե�ֵ��
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
     * ��ȡmMaxLimitPriceRate���Ե�ֵ��
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
     * ����mMaxLimitPriceRate���Ե�ֵ��
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
     * ��ȡmMaxSaleQty���Ե�ֵ��
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
     * ����mMaxSaleQty���Ե�ֵ��
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
     * ��ȡmMinLimitPrice���Ե�ֵ��
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
     * ����mMinLimitPrice���Ե�ֵ��
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
     * ��ȡmMinLimitPriceRate���Ե�ֵ��
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
     * ����mMinLimitPriceRate���Ե�ֵ��
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
     * ��ȡmMinOrderQtyCheckType���Ե�ֵ��
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
     * ����mMinOrderQtyCheckType���Ե�ֵ��
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
     * ��ȡmMinSaleQty���Ե�ֵ��
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
     * ����mMinSaleQty���Ե�ֵ��
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
     * ��ȡmNameForInvoice���Ե�ֵ��
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
     * ����mNameForInvoice���Ե�ֵ��
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
     * ��ȡmSaleBatchQty���Ե�ֵ��
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
     * ����mSaleBatchQty���Ե�ֵ��
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
     * ��ȡmSaleMinDiscount���Ե�ֵ��
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
     * ����mSaleMinDiscount���Ե�ֵ��
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
     * ��ȡmSalePriceList���Ե�ֵ��
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
     * ����mSalePriceList���Ե�ֵ��
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
     * ��ȡmSupplySource���Ե�ֵ��
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
     * ����mSupplySource���Ե�ֵ��
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

}
