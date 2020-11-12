
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
 * &lt;p&gt;UFIDA.U9.CBO.SCM.Item.ItemMFGInfoData complex type的 Java 类。
 * 
 * &lt;p&gt;以下模式片段指定包含在此类中的预期内容。
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="UFIDA.U9.CBO.SCM.Item.ItemMFGInfoData"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://www.UFIDA.org/EntityData}UFSoft.UBF.Business.DataTransObjectBase"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="CommonBOMMaterial_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="CommonRoutingMaterial_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ItemMaster_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ProductDepartment" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ProductDepartment_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="TimeUom" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="TimeUom_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_bomControlMode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_buildBatch" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_buildMultiplier" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_buildQuanSelectType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_buildShrinkageRate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_commonBOMMaterial" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CBO.SCM.Item.ItemMasterData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_commonRoutingMaterial" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CBO.SCM.Item.ItemMasterData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_costElement" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_createdBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_createdOn" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_defaultExpandLevel" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_fluctuantWaste" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_iD" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_immovableWaste" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isAllowExcessMaterial" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isByproduct" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isECNControl" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isInheritBomMasterNo" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isMixLotControl" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isOutputControlFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isSueOverType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_issueMaterialBatchQty" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_issueMaterialSafeStockPeriod" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_issueMaterialSafeStockQty" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_itemMaster" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CBO.SCM.Item.ItemMasterData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_kanbanDrive" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_lowLevelCode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_minSupplyMaterialQty" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_modifiedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_modifiedOn" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_multiHierarchyExpandFlag" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_operateType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_overFinishType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_overQty" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_overRate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_pictureCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_preOffsetTime" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_produceWasteRateType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_purchasePartMakeMode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_standardMaterialQty" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_standardMaterialScale" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_supplementMaterialBatchQty" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
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
@XmlType(name = "UFIDA.U9.CBO.SCM.Item.ItemMFGInfoData", propOrder = {
    "commonBOMMaterialSKey",
    "commonRoutingMaterialSKey",
    "itemMasterSKey",
    "productDepartment",
    "productDepartmentSKey",
    "timeUom",
    "timeUomSKey",
    "mBomControlMode",
    "mBuildBatch",
    "mBuildMultiplier",
    "mBuildQuanSelectType",
    "mBuildShrinkageRate",
    "mCommonBOMMaterial",
    "mCommonRoutingMaterial",
    "mCostElement",
    "mCreatedBy",
    "mCreatedOn",
    "mDefaultExpandLevel",
    "mFluctuantWaste",
    "mid",
    "mImmovableWaste",
    "mIsAllowExcessMaterial",
    "mIsByproduct",
    "mIsECNControl",
    "mIsInheritBomMasterNo",
    "mIsMixLotControl",
    "mIsOutputControlFlag",
    "mIsSueOverType",
    "mIssueMaterialBatchQty",
    "mIssueMaterialSafeStockPeriod",
    "mIssueMaterialSafeStockQty",
    "mItemMaster",
    "mKanbanDrive",
    "mLowLevelCode",
    "mMinSupplyMaterialQty",
    "mModifiedBy",
    "mModifiedOn",
    "mMultiHierarchyExpandFlag",
    "mOperateType",
    "mOverFinishType",
    "mOverQty",
    "mOverRate",
    "mPictureCode",
    "mPreOffsetTime",
    "mProduceWasteRateType",
    "mPurchasePartMakeMode",
    "mStandardMaterialQty",
    "mStandardMaterialScale",
    "mSupplementMaterialBatchQty",
    "mSysVersion"
})
public class UFIDAU9CBOSCMItemItemMFGInfoData
    extends UFSoftUBFBusinessDataTransObjectBase
{

    @XmlElementRef(name = "CommonBOMMaterial_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> commonBOMMaterialSKey;
    @XmlElementRef(name = "CommonRoutingMaterial_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> commonRoutingMaterialSKey;
    @XmlElementRef(name = "ItemMaster_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> itemMasterSKey;
    @XmlElement(name = "ProductDepartment")
    protected Long productDepartment;
    @XmlElementRef(name = "ProductDepartment_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> productDepartmentSKey;
    @XmlElement(name = "TimeUom")
    protected Long timeUom;
    @XmlElementRef(name = "TimeUom_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> timeUomSKey;
    @XmlElement(name = "m_bomControlMode")
    protected Integer mBomControlMode;
    @XmlElement(name = "m_buildBatch")
    protected Long mBuildBatch;
    @XmlElement(name = "m_buildMultiplier")
    protected Long mBuildMultiplier;
    @XmlElement(name = "m_buildQuanSelectType")
    protected Integer mBuildQuanSelectType;
    @XmlElement(name = "m_buildShrinkageRate")
    protected BigDecimal mBuildShrinkageRate;
    @XmlElementRef(name = "m_commonBOMMaterial", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9CBOSCMItemItemMasterData> mCommonBOMMaterial;
    @XmlElementRef(name = "m_commonRoutingMaterial", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9CBOSCMItemItemMasterData> mCommonRoutingMaterial;
    @XmlElement(name = "m_costElement")
    protected Long mCostElement;
    @XmlElementRef(name = "m_createdBy", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mCreatedBy;
    @XmlElement(name = "m_createdOn")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mCreatedOn;
    @XmlElement(name = "m_defaultExpandLevel")
    protected Integer mDefaultExpandLevel;
    @XmlElement(name = "m_fluctuantWaste")
    protected BigDecimal mFluctuantWaste;
    @XmlElement(name = "m_iD")
    protected Long mid;
    @XmlElement(name = "m_immovableWaste")
    protected BigDecimal mImmovableWaste;
    @XmlElement(name = "m_isAllowExcessMaterial")
    protected Boolean mIsAllowExcessMaterial;
    @XmlElement(name = "m_isByproduct")
    protected Boolean mIsByproduct;
    @XmlElement(name = "m_isECNControl")
    protected Boolean mIsECNControl;
    @XmlElement(name = "m_isInheritBomMasterNo")
    protected Boolean mIsInheritBomMasterNo;
    @XmlElement(name = "m_isMixLotControl")
    protected Boolean mIsMixLotControl;
    @XmlElement(name = "m_isOutputControlFlag")
    protected Boolean mIsOutputControlFlag;
    @XmlElement(name = "m_isSueOverType")
    protected Integer mIsSueOverType;
    @XmlElement(name = "m_issueMaterialBatchQty")
    protected BigDecimal mIssueMaterialBatchQty;
    @XmlElement(name = "m_issueMaterialSafeStockPeriod")
    protected Integer mIssueMaterialSafeStockPeriod;
    @XmlElement(name = "m_issueMaterialSafeStockQty")
    protected BigDecimal mIssueMaterialSafeStockQty;
    @XmlElementRef(name = "m_itemMaster", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9CBOSCMItemItemMasterData> mItemMaster;
    @XmlElement(name = "m_kanbanDrive")
    protected Boolean mKanbanDrive;
    @XmlElement(name = "m_lowLevelCode")
    protected Integer mLowLevelCode;
    @XmlElement(name = "m_minSupplyMaterialQty")
    protected BigDecimal mMinSupplyMaterialQty;
    @XmlElementRef(name = "m_modifiedBy", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mModifiedBy;
    @XmlElement(name = "m_modifiedOn")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mModifiedOn;
    @XmlElement(name = "m_multiHierarchyExpandFlag")
    protected Integer mMultiHierarchyExpandFlag;
    @XmlElement(name = "m_operateType")
    protected Integer mOperateType;
    @XmlElement(name = "m_overFinishType")
    protected Integer mOverFinishType;
    @XmlElement(name = "m_overQty")
    protected BigDecimal mOverQty;
    @XmlElement(name = "m_overRate")
    protected BigDecimal mOverRate;
    @XmlElementRef(name = "m_pictureCode", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mPictureCode;
    @XmlElement(name = "m_preOffsetTime")
    protected BigDecimal mPreOffsetTime;
    @XmlElement(name = "m_produceWasteRateType")
    protected Integer mProduceWasteRateType;
    @XmlElement(name = "m_purchasePartMakeMode")
    protected Integer mPurchasePartMakeMode;
    @XmlElement(name = "m_standardMaterialQty")
    protected BigDecimal mStandardMaterialQty;
    @XmlElement(name = "m_standardMaterialScale")
    protected BigDecimal mStandardMaterialScale;
    @XmlElement(name = "m_supplementMaterialBatchQty")
    protected BigDecimal mSupplementMaterialBatchQty;
    @XmlElement(name = "m_sysVersion")
    protected Long mSysVersion;

    /**
     * 获取commonBOMMaterialSKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getCommonBOMMaterialSKey() {
        return commonBOMMaterialSKey;
    }

    /**
     * 设置commonBOMMaterialSKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setCommonBOMMaterialSKey(JAXBElement<EntityKey> value) {
        this.commonBOMMaterialSKey = value;
    }

    /**
     * 获取commonRoutingMaterialSKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getCommonRoutingMaterialSKey() {
        return commonRoutingMaterialSKey;
    }

    /**
     * 设置commonRoutingMaterialSKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setCommonRoutingMaterialSKey(JAXBElement<EntityKey> value) {
        this.commonRoutingMaterialSKey = value;
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
     * 获取productDepartment属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getProductDepartment() {
        return productDepartment;
    }

    /**
     * 设置productDepartment属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setProductDepartment(Long value) {
        this.productDepartment = value;
    }

    /**
     * 获取productDepartmentSKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getProductDepartmentSKey() {
        return productDepartmentSKey;
    }

    /**
     * 设置productDepartmentSKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setProductDepartmentSKey(JAXBElement<EntityKey> value) {
        this.productDepartmentSKey = value;
    }

    /**
     * 获取timeUom属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTimeUom() {
        return timeUom;
    }

    /**
     * 设置timeUom属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTimeUom(Long value) {
        this.timeUom = value;
    }

    /**
     * 获取timeUomSKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getTimeUomSKey() {
        return timeUomSKey;
    }

    /**
     * 设置timeUomSKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setTimeUomSKey(JAXBElement<EntityKey> value) {
        this.timeUomSKey = value;
    }

    /**
     * 获取mBomControlMode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMBomControlMode() {
        return mBomControlMode;
    }

    /**
     * 设置mBomControlMode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMBomControlMode(Integer value) {
        this.mBomControlMode = value;
    }

    /**
     * 获取mBuildBatch属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMBuildBatch() {
        return mBuildBatch;
    }

    /**
     * 设置mBuildBatch属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMBuildBatch(Long value) {
        this.mBuildBatch = value;
    }

    /**
     * 获取mBuildMultiplier属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMBuildMultiplier() {
        return mBuildMultiplier;
    }

    /**
     * 设置mBuildMultiplier属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMBuildMultiplier(Long value) {
        this.mBuildMultiplier = value;
    }

    /**
     * 获取mBuildQuanSelectType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMBuildQuanSelectType() {
        return mBuildQuanSelectType;
    }

    /**
     * 设置mBuildQuanSelectType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMBuildQuanSelectType(Integer value) {
        this.mBuildQuanSelectType = value;
    }

    /**
     * 获取mBuildShrinkageRate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMBuildShrinkageRate() {
        return mBuildShrinkageRate;
    }

    /**
     * 设置mBuildShrinkageRate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMBuildShrinkageRate(BigDecimal value) {
        this.mBuildShrinkageRate = value;
    }

    /**
     * 获取mCommonBOMMaterial属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOSCMItemItemMasterData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9CBOSCMItemItemMasterData> getMCommonBOMMaterial() {
        return mCommonBOMMaterial;
    }

    /**
     * 设置mCommonBOMMaterial属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOSCMItemItemMasterData }{@code >}
     *     
     */
    public void setMCommonBOMMaterial(JAXBElement<UFIDAU9CBOSCMItemItemMasterData> value) {
        this.mCommonBOMMaterial = value;
    }

    /**
     * 获取mCommonRoutingMaterial属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOSCMItemItemMasterData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9CBOSCMItemItemMasterData> getMCommonRoutingMaterial() {
        return mCommonRoutingMaterial;
    }

    /**
     * 设置mCommonRoutingMaterial属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOSCMItemItemMasterData }{@code >}
     *     
     */
    public void setMCommonRoutingMaterial(JAXBElement<UFIDAU9CBOSCMItemItemMasterData> value) {
        this.mCommonRoutingMaterial = value;
    }

    /**
     * 获取mCostElement属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMCostElement() {
        return mCostElement;
    }

    /**
     * 设置mCostElement属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMCostElement(Long value) {
        this.mCostElement = value;
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
     * 获取mDefaultExpandLevel属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMDefaultExpandLevel() {
        return mDefaultExpandLevel;
    }

    /**
     * 设置mDefaultExpandLevel属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMDefaultExpandLevel(Integer value) {
        this.mDefaultExpandLevel = value;
    }

    /**
     * 获取mFluctuantWaste属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMFluctuantWaste() {
        return mFluctuantWaste;
    }

    /**
     * 设置mFluctuantWaste属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMFluctuantWaste(BigDecimal value) {
        this.mFluctuantWaste = value;
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
     * 获取mImmovableWaste属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMImmovableWaste() {
        return mImmovableWaste;
    }

    /**
     * 设置mImmovableWaste属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMImmovableWaste(BigDecimal value) {
        this.mImmovableWaste = value;
    }

    /**
     * 获取mIsAllowExcessMaterial属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsAllowExcessMaterial() {
        return mIsAllowExcessMaterial;
    }

    /**
     * 设置mIsAllowExcessMaterial属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsAllowExcessMaterial(Boolean value) {
        this.mIsAllowExcessMaterial = value;
    }

    /**
     * 获取mIsByproduct属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsByproduct() {
        return mIsByproduct;
    }

    /**
     * 设置mIsByproduct属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsByproduct(Boolean value) {
        this.mIsByproduct = value;
    }

    /**
     * 获取mIsECNControl属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsECNControl() {
        return mIsECNControl;
    }

    /**
     * 设置mIsECNControl属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsECNControl(Boolean value) {
        this.mIsECNControl = value;
    }

    /**
     * 获取mIsInheritBomMasterNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsInheritBomMasterNo() {
        return mIsInheritBomMasterNo;
    }

    /**
     * 设置mIsInheritBomMasterNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsInheritBomMasterNo(Boolean value) {
        this.mIsInheritBomMasterNo = value;
    }

    /**
     * 获取mIsMixLotControl属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsMixLotControl() {
        return mIsMixLotControl;
    }

    /**
     * 设置mIsMixLotControl属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsMixLotControl(Boolean value) {
        this.mIsMixLotControl = value;
    }

    /**
     * 获取mIsOutputControlFlag属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsOutputControlFlag() {
        return mIsOutputControlFlag;
    }

    /**
     * 设置mIsOutputControlFlag属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsOutputControlFlag(Boolean value) {
        this.mIsOutputControlFlag = value;
    }

    /**
     * 获取mIsSueOverType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMIsSueOverType() {
        return mIsSueOverType;
    }

    /**
     * 设置mIsSueOverType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMIsSueOverType(Integer value) {
        this.mIsSueOverType = value;
    }

    /**
     * 获取mIssueMaterialBatchQty属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMIssueMaterialBatchQty() {
        return mIssueMaterialBatchQty;
    }

    /**
     * 设置mIssueMaterialBatchQty属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMIssueMaterialBatchQty(BigDecimal value) {
        this.mIssueMaterialBatchQty = value;
    }

    /**
     * 获取mIssueMaterialSafeStockPeriod属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMIssueMaterialSafeStockPeriod() {
        return mIssueMaterialSafeStockPeriod;
    }

    /**
     * 设置mIssueMaterialSafeStockPeriod属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMIssueMaterialSafeStockPeriod(Integer value) {
        this.mIssueMaterialSafeStockPeriod = value;
    }

    /**
     * 获取mIssueMaterialSafeStockQty属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMIssueMaterialSafeStockQty() {
        return mIssueMaterialSafeStockQty;
    }

    /**
     * 设置mIssueMaterialSafeStockQty属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMIssueMaterialSafeStockQty(BigDecimal value) {
        this.mIssueMaterialSafeStockQty = value;
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
     * 获取mKanbanDrive属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMKanbanDrive() {
        return mKanbanDrive;
    }

    /**
     * 设置mKanbanDrive属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMKanbanDrive(Boolean value) {
        this.mKanbanDrive = value;
    }

    /**
     * 获取mLowLevelCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMLowLevelCode() {
        return mLowLevelCode;
    }

    /**
     * 设置mLowLevelCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMLowLevelCode(Integer value) {
        this.mLowLevelCode = value;
    }

    /**
     * 获取mMinSupplyMaterialQty属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMMinSupplyMaterialQty() {
        return mMinSupplyMaterialQty;
    }

    /**
     * 设置mMinSupplyMaterialQty属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMMinSupplyMaterialQty(BigDecimal value) {
        this.mMinSupplyMaterialQty = value;
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
     * 获取mMultiHierarchyExpandFlag属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMMultiHierarchyExpandFlag() {
        return mMultiHierarchyExpandFlag;
    }

    /**
     * 设置mMultiHierarchyExpandFlag属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMMultiHierarchyExpandFlag(Integer value) {
        this.mMultiHierarchyExpandFlag = value;
    }

    /**
     * 获取mOperateType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMOperateType() {
        return mOperateType;
    }

    /**
     * 设置mOperateType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMOperateType(Integer value) {
        this.mOperateType = value;
    }

    /**
     * 获取mOverFinishType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMOverFinishType() {
        return mOverFinishType;
    }

    /**
     * 设置mOverFinishType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMOverFinishType(Integer value) {
        this.mOverFinishType = value;
    }

    /**
     * 获取mOverQty属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMOverQty() {
        return mOverQty;
    }

    /**
     * 设置mOverQty属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMOverQty(BigDecimal value) {
        this.mOverQty = value;
    }

    /**
     * 获取mOverRate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMOverRate() {
        return mOverRate;
    }

    /**
     * 设置mOverRate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMOverRate(BigDecimal value) {
        this.mOverRate = value;
    }

    /**
     * 获取mPictureCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMPictureCode() {
        return mPictureCode;
    }

    /**
     * 设置mPictureCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMPictureCode(JAXBElement<String> value) {
        this.mPictureCode = value;
    }

    /**
     * 获取mPreOffsetTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMPreOffsetTime() {
        return mPreOffsetTime;
    }

    /**
     * 设置mPreOffsetTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMPreOffsetTime(BigDecimal value) {
        this.mPreOffsetTime = value;
    }

    /**
     * 获取mProduceWasteRateType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMProduceWasteRateType() {
        return mProduceWasteRateType;
    }

    /**
     * 设置mProduceWasteRateType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMProduceWasteRateType(Integer value) {
        this.mProduceWasteRateType = value;
    }

    /**
     * 获取mPurchasePartMakeMode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMPurchasePartMakeMode() {
        return mPurchasePartMakeMode;
    }

    /**
     * 设置mPurchasePartMakeMode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMPurchasePartMakeMode(Integer value) {
        this.mPurchasePartMakeMode = value;
    }

    /**
     * 获取mStandardMaterialQty属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMStandardMaterialQty() {
        return mStandardMaterialQty;
    }

    /**
     * 设置mStandardMaterialQty属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMStandardMaterialQty(BigDecimal value) {
        this.mStandardMaterialQty = value;
    }

    /**
     * 获取mStandardMaterialScale属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMStandardMaterialScale() {
        return mStandardMaterialScale;
    }

    /**
     * 设置mStandardMaterialScale属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMStandardMaterialScale(BigDecimal value) {
        this.mStandardMaterialScale = value;
    }

    /**
     * 获取mSupplementMaterialBatchQty属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMSupplementMaterialBatchQty() {
        return mSupplementMaterialBatchQty;
    }

    /**
     * 设置mSupplementMaterialBatchQty属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMSupplementMaterialBatchQty(BigDecimal value) {
        this.mSupplementMaterialBatchQty = value;
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
