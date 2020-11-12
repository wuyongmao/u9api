
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
 * &lt;p&gt;UFIDA.U9.CBO.SCM.Item.ItemPurchaseInfoData complex type�� Java �ࡣ
 * 
 * &lt;p&gt;����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡbuyer���Ե�ֵ��
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
     * ����buyer���Ե�ֵ��
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
     * ��ȡbuyerSKey���Ե�ֵ��
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
     * ����buyerSKey���Ե�ֵ��
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
     * ��ȡmaxlimitCurrency���Ե�ֵ��
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
     * ����maxlimitCurrency���Ե�ֵ��
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
     * ��ȡmaxlimitCurrencySKey���Ե�ֵ��
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
     * ����maxlimitCurrencySKey���Ե�ֵ��
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
     * ��ȡpuRtnTradePath���Ե�ֵ��
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
     * ����puRtnTradePath���Ե�ֵ��
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
     * ��ȡpuRtnTradePathSKey���Ե�ֵ��
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
     * ����puRtnTradePathSKey���Ե�ֵ��
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
     * ��ȡpuTradePath���Ե�ֵ��
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
     * ����puTradePath���Ե�ֵ��
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
     * ��ȡpuTradePathSKey���Ե�ֵ��
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
     * ����puTradePathSKey���Ե�ֵ��
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
     * ��ȡpurchaseDepartment���Ե�ֵ��
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
     * ����purchaseDepartment���Ե�ֵ��
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
     * ��ȡpurchaseDepartmentSKey���Ե�ֵ��
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
     * ����purchaseDepartmentSKey���Ե�ֵ��
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
     * ��ȡreceiptRule���Ե�ֵ��
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
     * ����receiptRule���Ե�ֵ��
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
     * ��ȡreceiptRuleSKey���Ե�ֵ��
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
     * ����receiptRuleSKey���Ե�ֵ��
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
     * ��ȡstatRule���Ե�ֵ��
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
     * ����statRule���Ե�ֵ��
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
     * ��ȡstatRuleSKey���Ե�ֵ��
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
     * ����statRuleSKey���Ե�ֵ��
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
     * ��ȡmBudgetControlType���Ե�ֵ��
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
     * ����mBudgetControlType���Ե�ֵ��
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
     * ��ȡmChargeAssignMode���Ե�ֵ��
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
     * ����mChargeAssignMode���Ե�ֵ��
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
     * ��ȡmDangerType���Ե�ֵ��
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
     * ����mDangerType���Ե�ֵ��
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
     * ��ȡmDescFlexField���Ե�ֵ��
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
     * ����mDescFlexField���Ե�ֵ��
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
     * ��ȡmFixedAssetsCategory���Ե�ֵ��
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
     * ����mFixedAssetsCategory���Ե�ֵ��
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
     * ��ȡmInquireCount���Ե�ֵ��
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
     * ����mInquireCount���Ե�ֵ��
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
     * ��ȡmInquireFixedPeriod���Ե�ֵ��
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
     * ����mInquireFixedPeriod���Ե�ֵ��
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
     * ��ȡmInquireRule���Ե�ֵ��
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
     * ����mInquireRule���Ե�ֵ��
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
     * ��ȡmIsConfirmOnFinished���Ե�ֵ��
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
     * ����mIsConfirmOnFinished���Ե�ֵ��
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
     * ��ȡmIsControlPOItemFree���Ե�ֵ��
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
     * ����mIsControlPOItemFree���Ե�ֵ��
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
     * ��ȡmIsControlRCVItemFree���Ե�ֵ��
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
     * ����mIsControlRCVItemFree���Ե�ֵ��
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
     * ��ȡmIsNeedInquire���Ե�ֵ��
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
     * ����mIsNeedInquire���Ե�ֵ��
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
     * ��ȡmIsNeedRequest���Ե�ֵ��
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
     * ����mIsNeedRequest���Ե�ֵ��
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
     * ��ȡmIsPURtnTradePathModify���Ե�ֵ��
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
     * ����mIsPURtnTradePathModify���Ե�ֵ��
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
     * ��ȡmIsPUTradePathModify���Ե�ֵ��
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
     * ����mIsPUTradePathModify���Ե�ֵ��
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
     * ��ȡmIsPriceByQuality���Ե�ֵ��
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
     * ����mIsPriceByQuality���Ե�ֵ��
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
     * ��ȡmIsReceiptSourceControl���Ե�ֵ��
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
     * ����mIsReceiptSourceControl���Ե�ֵ��
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
     * ��ȡmIsReturnSourceControl���Ե�ֵ��
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
     * ����mIsReturnSourceControl���Ե�ֵ��
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
     * ��ȡmIsSupplierConfirm���Ե�ֵ��
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
     * ����mIsSupplierConfirm���Ե�ֵ��
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
     * ��ȡmIsTotalAgreementPurchase���Ե�ֵ��
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
     * ����mIsTotalAgreementPurchase���Ե�ֵ��
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
     * ��ȡmIsUseApproveSupplier���Ե�ֵ��
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
     * ����mIsUseApproveSupplier���Ե�ֵ��
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
     * ��ȡmMaxLimitPriceSource���Ե�ֵ��
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
     * ����mMaxLimitPriceSource���Ե�ֵ��
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
     * ��ȡmMinRcvQty���Ե�ֵ��
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
     * ����mMinRcvQty���Ե�ֵ��
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
     * ��ȡmPurchaseBatchQty���Ե�ֵ��
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
     * ����mPurchaseBatchQty���Ե�ֵ��
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
     * ��ȡmPurchaseQuotaMode���Ե�ֵ��
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
     * ����mPurchaseQuotaMode���Ե�ֵ��
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
     * ��ȡmQuotaLimitValue���Ե�ֵ��
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
     * ����mQuotaLimitValue���Ե�ֵ��
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
     * ��ȡmQuotaSupplier���Ե�ֵ��
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
     * ����mQuotaSupplier���Ե�ֵ��
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
     * ��ȡmrfqType���Ե�ֵ��
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
     * ����mrfqType���Ե�ֵ��
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
     * ��ȡmReceiptMode���Ե�ֵ��
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
     * ����mReceiptMode���Ե�ֵ��
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
     * ��ȡmReceiptModeAllowModify���Ե�ֵ��
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
     * ����mReceiptModeAllowModify���Ե�ֵ��
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
     * ��ȡmReceiptType���Ե�ֵ��
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
     * ����mReceiptType���Ե�ֵ��
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
     * ��ȡmReturnPriceSource���Ե�ֵ��
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
     * ����mReturnPriceSource���Ե�ֵ��
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
     * ��ȡmStatisticPeriod���Ե�ֵ��
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
     * ����mStatisticPeriod���Ե�ֵ��
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
     * ��ȡmunNumber���Ե�ֵ��
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
     * ����munNumber���Ե�ֵ��
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
