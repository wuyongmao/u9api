
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
 * &lt;p&gt;UFIDA.U9.CBO.SCM.Item.ItemPurchaseInfoData complex type的 Java 类。
 * 
 * &lt;p&gt;以下模式片段指定包含在此类中的预期内容。
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="UFIDA.U9.CBO.SCM.Item.ItemPurchaseInfoData"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://www.UFIDA.org/EntityData}UFSoft.UBF.Business.DataTransObjectBase"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="Buyer" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Buyer_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ItemMaster_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="MaxlimitCurrency" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="MaxlimitCurrency_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="PURtnTradePath" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="PURtnTradePath_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="PUTradePath" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="PUTradePath_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="PurchaseDepartment" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="PurchaseDepartment_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ReceiptRule" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ReceiptRule_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="StatRule" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="StatRule_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Supplier" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Supplier_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_budgetControlType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_chargeAssignMode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_chargeProcessMode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_createdBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_createdOn" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_dangerType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_descFlexField" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.Base.FlexField.DescFlexField.DescFlexSegmentsData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_fixedAssetsCategory" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_iD" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_inquireCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_inquireFixedPeriod" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_inquireRule" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isConfirmOnFinished" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isControlPOItemFree" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isControlRCVItemFree" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isNeedInquire" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isNeedRequest" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isPURtnTradePathModify" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isPUTradePathModify" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isPriceByQuality" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isReceiptSourceControl" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isReturnSourceControl" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isSupplierConfirm" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isTotalAgreementPurchase" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isUseApproveSupplier" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_itemMaster" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CBO.SCM.Item.ItemMasterData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_maxLimitPrice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_maxLimitPriceSource" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_minRcvQty" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_modifiedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_modifiedOn" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_priceSource" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_purchaseBatchQty" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_purchaseQuotaMode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_quotaLimitValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_quotaSupplier" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_rFQType" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_receiptMode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_receiptModeAllowModify" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_receiptType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_returnPriceSource" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_statisticPeriod" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_sysVersion" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_uNNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UFIDA.U9.CBO.SCM.Item.ItemPurchaseInfoData", propOrder = {
    "buyer",
    "buyerSKey",
    "itemMasterSKey",
    "maxlimitCurrency",
    "maxlimitCurrencySKey",
    "puRtnTradePath",
    "puRtnTradePathSKey",
    "puTradePath",
    "puTradePathSKey",
    "purchaseDepartment",
    "purchaseDepartmentSKey",
    "receiptRule",
    "receiptRuleSKey",
    "statRule",
    "statRuleSKey",
    "supplier",
    "supplierSKey",
    "mBudgetControlType",
    "mChargeAssignMode",
    "mChargeProcessMode",
    "mCreatedBy",
    "mCreatedOn",
    "mDangerType",
    "mDescFlexField",
    "mFixedAssetsCategory",
    "mid",
    "mInquireCount",
    "mInquireFixedPeriod",
    "mInquireRule",
    "mIsConfirmOnFinished",
    "mIsControlPOItemFree",
    "mIsControlRCVItemFree",
    "mIsNeedInquire",
    "mIsNeedRequest",
    "mIsPURtnTradePathModify",
    "mIsPUTradePathModify",
    "mIsPriceByQuality",
    "mIsReceiptSourceControl",
    "mIsReturnSourceControl",
    "mIsSupplierConfirm",
    "mIsTotalAgreementPurchase",
    "mIsUseApproveSupplier",
    "mItemMaster",
    "mMaxLimitPrice",
    "mMaxLimitPriceSource",
    "mMinRcvQty",
    "mModifiedBy",
    "mModifiedOn",
    "mPriceSource",
    "mPurchaseBatchQty",
    "mPurchaseQuotaMode",
    "mQuotaLimitValue",
    "mQuotaSupplier",
    "mrfqType",
    "mReceiptMode",
    "mReceiptModeAllowModify",
    "mReceiptType",
    "mReturnPriceSource",
    "mStatisticPeriod",
    "mSysVersion",
    "munNumber"
})
public class UFIDAU9CBOSCMItemItemPurchaseInfoData
    extends UFSoftUBFBusinessDataTransObjectBase
{

    @XmlElement(name = "Buyer")
    protected Long buyer;
    @XmlElementRef(name = "Buyer_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> buyerSKey;
    @XmlElementRef(name = "ItemMaster_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> itemMasterSKey;
    @XmlElement(name = "MaxlimitCurrency")
    protected Long maxlimitCurrency;
    @XmlElementRef(name = "MaxlimitCurrency_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> maxlimitCurrencySKey;
    @XmlElement(name = "PURtnTradePath")
    protected Long puRtnTradePath;
    @XmlElementRef(name = "PURtnTradePath_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> puRtnTradePathSKey;
    @XmlElement(name = "PUTradePath")
    protected Long puTradePath;
    @XmlElementRef(name = "PUTradePath_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> puTradePathSKey;
    @XmlElement(name = "PurchaseDepartment")
    protected Long purchaseDepartment;
    @XmlElementRef(name = "PurchaseDepartment_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> purchaseDepartmentSKey;
    @XmlElement(name = "ReceiptRule")
    protected Long receiptRule;
    @XmlElementRef(name = "ReceiptRule_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> receiptRuleSKey;
    @XmlElement(name = "StatRule")
    protected Long statRule;
    @XmlElementRef(name = "StatRule_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> statRuleSKey;
    @XmlElement(name = "Supplier")
    protected Long supplier;
    @XmlElementRef(name = "Supplier_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> supplierSKey;
    @XmlElement(name = "m_budgetControlType")
    protected Integer mBudgetControlType;
    @XmlElement(name = "m_chargeAssignMode")
    protected Integer mChargeAssignMode;
    @XmlElement(name = "m_chargeProcessMode")
    protected Integer mChargeProcessMode;
    @XmlElementRef(name = "m_createdBy", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mCreatedBy;
    @XmlElement(name = "m_createdOn")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mCreatedOn;
    @XmlElement(name = "m_dangerType")
    protected Integer mDangerType;
    @XmlElementRef(name = "m_descFlexField", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9BaseFlexFieldDescFlexFieldDescFlexSegmentsData> mDescFlexField;
    @XmlElement(name = "m_fixedAssetsCategory")
    protected Long mFixedAssetsCategory;
    @XmlElement(name = "m_iD")
    protected Long mid;
    @XmlElement(name = "m_inquireCount")
    protected Integer mInquireCount;
    @XmlElement(name = "m_inquireFixedPeriod")
    protected Integer mInquireFixedPeriod;
    @XmlElement(name = "m_inquireRule")
    protected Integer mInquireRule;
    @XmlElement(name = "m_isConfirmOnFinished")
    protected Boolean mIsConfirmOnFinished;
    @XmlElement(name = "m_isControlPOItemFree")
    protected Boolean mIsControlPOItemFree;
    @XmlElement(name = "m_isControlRCVItemFree")
    protected Boolean mIsControlRCVItemFree;
    @XmlElement(name = "m_isNeedInquire")
    protected Boolean mIsNeedInquire;
    @XmlElement(name = "m_isNeedRequest")
    protected Boolean mIsNeedRequest;
    @XmlElement(name = "m_isPURtnTradePathModify")
    protected Boolean mIsPURtnTradePathModify;
    @XmlElement(name = "m_isPUTradePathModify")
    protected Boolean mIsPUTradePathModify;
    @XmlElement(name = "m_isPriceByQuality")
    protected Boolean mIsPriceByQuality;
    @XmlElement(name = "m_isReceiptSourceControl")
    protected Boolean mIsReceiptSourceControl;
    @XmlElement(name = "m_isReturnSourceControl")
    protected Boolean mIsReturnSourceControl;
    @XmlElement(name = "m_isSupplierConfirm")
    protected Boolean mIsSupplierConfirm;
    @XmlElement(name = "m_isTotalAgreementPurchase")
    protected Boolean mIsTotalAgreementPurchase;
    @XmlElement(name = "m_isUseApproveSupplier")
    protected Boolean mIsUseApproveSupplier;
    @XmlElementRef(name = "m_itemMaster", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9CBOSCMItemItemMasterData> mItemMaster;
    @XmlElement(name = "m_maxLimitPrice")
    protected BigDecimal mMaxLimitPrice;
    @XmlElement(name = "m_maxLimitPriceSource")
    protected Integer mMaxLimitPriceSource;
    @XmlElement(name = "m_minRcvQty")
    protected BigDecimal mMinRcvQty;
    @XmlElementRef(name = "m_modifiedBy", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mModifiedBy;
    @XmlElement(name = "m_modifiedOn")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mModifiedOn;
    @XmlElement(name = "m_priceSource")
    protected Integer mPriceSource;
    @XmlElement(name = "m_purchaseBatchQty")
    protected BigDecimal mPurchaseBatchQty;
    @XmlElement(name = "m_purchaseQuotaMode")
    protected Integer mPurchaseQuotaMode;
    @XmlElement(name = "m_quotaLimitValue")
    protected BigDecimal mQuotaLimitValue;
    @XmlElement(name = "m_quotaSupplier")
    protected Integer mQuotaSupplier;
    @XmlElement(name = "m_rFQType")
    protected Long mrfqType;
    @XmlElement(name = "m_receiptMode")
    protected Integer mReceiptMode;
    @XmlElement(name = "m_receiptModeAllowModify")
    protected Boolean mReceiptModeAllowModify;
    @XmlElement(name = "m_receiptType")
    protected Integer mReceiptType;
    @XmlElement(name = "m_returnPriceSource")
    protected Integer mReturnPriceSource;
    @XmlElement(name = "m_statisticPeriod")
    protected Integer mStatisticPeriod;
    @XmlElement(name = "m_sysVersion")
    protected Long mSysVersion;
    @XmlElementRef(name = "m_uNNumber", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> munNumber;

    /**
     * 获取buyer属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getBuyer() {
        return buyer;
    }

    /**
     * 设置buyer属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setBuyer(Long value) {
        this.buyer = value;
    }

    /**
     * 获取buyerSKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getBuyerSKey() {
        return buyerSKey;
    }

    /**
     * 设置buyerSKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setBuyerSKey(JAXBElement<EntityKey> value) {
        this.buyerSKey = value;
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
     * 获取maxlimitCurrency属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMaxlimitCurrency() {
        return maxlimitCurrency;
    }

    /**
     * 设置maxlimitCurrency属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMaxlimitCurrency(Long value) {
        this.maxlimitCurrency = value;
    }

    /**
     * 获取maxlimitCurrencySKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getMaxlimitCurrencySKey() {
        return maxlimitCurrencySKey;
    }

    /**
     * 设置maxlimitCurrencySKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setMaxlimitCurrencySKey(JAXBElement<EntityKey> value) {
        this.maxlimitCurrencySKey = value;
    }

    /**
     * 获取puRtnTradePath属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPURtnTradePath() {
        return puRtnTradePath;
    }

    /**
     * 设置puRtnTradePath属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPURtnTradePath(Long value) {
        this.puRtnTradePath = value;
    }

    /**
     * 获取puRtnTradePathSKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getPURtnTradePathSKey() {
        return puRtnTradePathSKey;
    }

    /**
     * 设置puRtnTradePathSKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setPURtnTradePathSKey(JAXBElement<EntityKey> value) {
        this.puRtnTradePathSKey = value;
    }

    /**
     * 获取puTradePath属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPUTradePath() {
        return puTradePath;
    }

    /**
     * 设置puTradePath属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPUTradePath(Long value) {
        this.puTradePath = value;
    }

    /**
     * 获取puTradePathSKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getPUTradePathSKey() {
        return puTradePathSKey;
    }

    /**
     * 设置puTradePathSKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setPUTradePathSKey(JAXBElement<EntityKey> value) {
        this.puTradePathSKey = value;
    }

    /**
     * 获取purchaseDepartment属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPurchaseDepartment() {
        return purchaseDepartment;
    }

    /**
     * 设置purchaseDepartment属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPurchaseDepartment(Long value) {
        this.purchaseDepartment = value;
    }

    /**
     * 获取purchaseDepartmentSKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getPurchaseDepartmentSKey() {
        return purchaseDepartmentSKey;
    }

    /**
     * 设置purchaseDepartmentSKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setPurchaseDepartmentSKey(JAXBElement<EntityKey> value) {
        this.purchaseDepartmentSKey = value;
    }

    /**
     * 获取receiptRule属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getReceiptRule() {
        return receiptRule;
    }

    /**
     * 设置receiptRule属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setReceiptRule(Long value) {
        this.receiptRule = value;
    }

    /**
     * 获取receiptRuleSKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getReceiptRuleSKey() {
        return receiptRuleSKey;
    }

    /**
     * 设置receiptRuleSKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setReceiptRuleSKey(JAXBElement<EntityKey> value) {
        this.receiptRuleSKey = value;
    }

    /**
     * 获取statRule属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getStatRule() {
        return statRule;
    }

    /**
     * 设置statRule属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setStatRule(Long value) {
        this.statRule = value;
    }

    /**
     * 获取statRuleSKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getStatRuleSKey() {
        return statRuleSKey;
    }

    /**
     * 设置statRuleSKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setStatRuleSKey(JAXBElement<EntityKey> value) {
        this.statRuleSKey = value;
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
     * 获取mBudgetControlType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMBudgetControlType() {
        return mBudgetControlType;
    }

    /**
     * 设置mBudgetControlType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMBudgetControlType(Integer value) {
        this.mBudgetControlType = value;
    }

    /**
     * 获取mChargeAssignMode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMChargeAssignMode() {
        return mChargeAssignMode;
    }

    /**
     * 设置mChargeAssignMode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMChargeAssignMode(Integer value) {
        this.mChargeAssignMode = value;
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
     * 获取mDangerType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMDangerType() {
        return mDangerType;
    }

    /**
     * 设置mDangerType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMDangerType(Integer value) {
        this.mDangerType = value;
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
     * 获取mFixedAssetsCategory属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMFixedAssetsCategory() {
        return mFixedAssetsCategory;
    }

    /**
     * 设置mFixedAssetsCategory属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMFixedAssetsCategory(Long value) {
        this.mFixedAssetsCategory = value;
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
     * 获取mInquireCount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMInquireCount() {
        return mInquireCount;
    }

    /**
     * 设置mInquireCount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMInquireCount(Integer value) {
        this.mInquireCount = value;
    }

    /**
     * 获取mInquireFixedPeriod属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMInquireFixedPeriod() {
        return mInquireFixedPeriod;
    }

    /**
     * 设置mInquireFixedPeriod属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMInquireFixedPeriod(Integer value) {
        this.mInquireFixedPeriod = value;
    }

    /**
     * 获取mInquireRule属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMInquireRule() {
        return mInquireRule;
    }

    /**
     * 设置mInquireRule属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMInquireRule(Integer value) {
        this.mInquireRule = value;
    }

    /**
     * 获取mIsConfirmOnFinished属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsConfirmOnFinished() {
        return mIsConfirmOnFinished;
    }

    /**
     * 设置mIsConfirmOnFinished属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsConfirmOnFinished(Boolean value) {
        this.mIsConfirmOnFinished = value;
    }

    /**
     * 获取mIsControlPOItemFree属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsControlPOItemFree() {
        return mIsControlPOItemFree;
    }

    /**
     * 设置mIsControlPOItemFree属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsControlPOItemFree(Boolean value) {
        this.mIsControlPOItemFree = value;
    }

    /**
     * 获取mIsControlRCVItemFree属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsControlRCVItemFree() {
        return mIsControlRCVItemFree;
    }

    /**
     * 设置mIsControlRCVItemFree属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsControlRCVItemFree(Boolean value) {
        this.mIsControlRCVItemFree = value;
    }

    /**
     * 获取mIsNeedInquire属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsNeedInquire() {
        return mIsNeedInquire;
    }

    /**
     * 设置mIsNeedInquire属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsNeedInquire(Boolean value) {
        this.mIsNeedInquire = value;
    }

    /**
     * 获取mIsNeedRequest属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsNeedRequest() {
        return mIsNeedRequest;
    }

    /**
     * 设置mIsNeedRequest属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsNeedRequest(Boolean value) {
        this.mIsNeedRequest = value;
    }

    /**
     * 获取mIsPURtnTradePathModify属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsPURtnTradePathModify() {
        return mIsPURtnTradePathModify;
    }

    /**
     * 设置mIsPURtnTradePathModify属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsPURtnTradePathModify(Boolean value) {
        this.mIsPURtnTradePathModify = value;
    }

    /**
     * 获取mIsPUTradePathModify属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsPUTradePathModify() {
        return mIsPUTradePathModify;
    }

    /**
     * 设置mIsPUTradePathModify属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsPUTradePathModify(Boolean value) {
        this.mIsPUTradePathModify = value;
    }

    /**
     * 获取mIsPriceByQuality属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsPriceByQuality() {
        return mIsPriceByQuality;
    }

    /**
     * 设置mIsPriceByQuality属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsPriceByQuality(Boolean value) {
        this.mIsPriceByQuality = value;
    }

    /**
     * 获取mIsReceiptSourceControl属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsReceiptSourceControl() {
        return mIsReceiptSourceControl;
    }

    /**
     * 设置mIsReceiptSourceControl属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsReceiptSourceControl(Boolean value) {
        this.mIsReceiptSourceControl = value;
    }

    /**
     * 获取mIsReturnSourceControl属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsReturnSourceControl() {
        return mIsReturnSourceControl;
    }

    /**
     * 设置mIsReturnSourceControl属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsReturnSourceControl(Boolean value) {
        this.mIsReturnSourceControl = value;
    }

    /**
     * 获取mIsSupplierConfirm属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsSupplierConfirm() {
        return mIsSupplierConfirm;
    }

    /**
     * 设置mIsSupplierConfirm属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsSupplierConfirm(Boolean value) {
        this.mIsSupplierConfirm = value;
    }

    /**
     * 获取mIsTotalAgreementPurchase属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsTotalAgreementPurchase() {
        return mIsTotalAgreementPurchase;
    }

    /**
     * 设置mIsTotalAgreementPurchase属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsTotalAgreementPurchase(Boolean value) {
        this.mIsTotalAgreementPurchase = value;
    }

    /**
     * 获取mIsUseApproveSupplier属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsUseApproveSupplier() {
        return mIsUseApproveSupplier;
    }

    /**
     * 设置mIsUseApproveSupplier属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsUseApproveSupplier(Boolean value) {
        this.mIsUseApproveSupplier = value;
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
     * 获取mMaxLimitPriceSource属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMMaxLimitPriceSource() {
        return mMaxLimitPriceSource;
    }

    /**
     * 设置mMaxLimitPriceSource属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMMaxLimitPriceSource(Integer value) {
        this.mMaxLimitPriceSource = value;
    }

    /**
     * 获取mMinRcvQty属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMMinRcvQty() {
        return mMinRcvQty;
    }

    /**
     * 设置mMinRcvQty属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMMinRcvQty(BigDecimal value) {
        this.mMinRcvQty = value;
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
     * 获取mPurchaseBatchQty属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMPurchaseBatchQty() {
        return mPurchaseBatchQty;
    }

    /**
     * 设置mPurchaseBatchQty属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMPurchaseBatchQty(BigDecimal value) {
        this.mPurchaseBatchQty = value;
    }

    /**
     * 获取mPurchaseQuotaMode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMPurchaseQuotaMode() {
        return mPurchaseQuotaMode;
    }

    /**
     * 设置mPurchaseQuotaMode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMPurchaseQuotaMode(Integer value) {
        this.mPurchaseQuotaMode = value;
    }

    /**
     * 获取mQuotaLimitValue属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMQuotaLimitValue() {
        return mQuotaLimitValue;
    }

    /**
     * 设置mQuotaLimitValue属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMQuotaLimitValue(BigDecimal value) {
        this.mQuotaLimitValue = value;
    }

    /**
     * 获取mQuotaSupplier属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMQuotaSupplier() {
        return mQuotaSupplier;
    }

    /**
     * 设置mQuotaSupplier属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMQuotaSupplier(Integer value) {
        this.mQuotaSupplier = value;
    }

    /**
     * 获取mrfqType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMRFQType() {
        return mrfqType;
    }

    /**
     * 设置mrfqType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMRFQType(Long value) {
        this.mrfqType = value;
    }

    /**
     * 获取mReceiptMode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMReceiptMode() {
        return mReceiptMode;
    }

    /**
     * 设置mReceiptMode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMReceiptMode(Integer value) {
        this.mReceiptMode = value;
    }

    /**
     * 获取mReceiptModeAllowModify属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMReceiptModeAllowModify() {
        return mReceiptModeAllowModify;
    }

    /**
     * 设置mReceiptModeAllowModify属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMReceiptModeAllowModify(Boolean value) {
        this.mReceiptModeAllowModify = value;
    }

    /**
     * 获取mReceiptType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMReceiptType() {
        return mReceiptType;
    }

    /**
     * 设置mReceiptType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMReceiptType(Integer value) {
        this.mReceiptType = value;
    }

    /**
     * 获取mReturnPriceSource属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMReturnPriceSource() {
        return mReturnPriceSource;
    }

    /**
     * 设置mReturnPriceSource属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMReturnPriceSource(Integer value) {
        this.mReturnPriceSource = value;
    }

    /**
     * 获取mStatisticPeriod属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMStatisticPeriod() {
        return mStatisticPeriod;
    }

    /**
     * 设置mStatisticPeriod属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMStatisticPeriod(Integer value) {
        this.mStatisticPeriod = value;
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
     * 获取munNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMUNNumber() {
        return munNumber;
    }

    /**
     * 设置munNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMUNNumber(JAXBElement<String> value) {
        this.munNumber = value;
    }

}
