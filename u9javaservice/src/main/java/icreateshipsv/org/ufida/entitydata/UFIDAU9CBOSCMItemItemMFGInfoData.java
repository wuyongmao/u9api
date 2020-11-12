
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
 * &lt;p&gt;UFIDA.U9.CBO.SCM.Item.ItemMFGInfoData complex type�� Java �ࡣ
 * 
 * &lt;p&gt;����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡcommonBOMMaterialSKey���Ե�ֵ��
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
     * ����commonBOMMaterialSKey���Ե�ֵ��
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
     * ��ȡcommonRoutingMaterialSKey���Ե�ֵ��
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
     * ����commonRoutingMaterialSKey���Ե�ֵ��
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
     * ��ȡproductDepartment���Ե�ֵ��
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
     * ����productDepartment���Ե�ֵ��
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
     * ��ȡproductDepartmentSKey���Ե�ֵ��
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
     * ����productDepartmentSKey���Ե�ֵ��
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
     * ��ȡtimeUom���Ե�ֵ��
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
     * ����timeUom���Ե�ֵ��
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
     * ��ȡtimeUomSKey���Ե�ֵ��
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
     * ����timeUomSKey���Ե�ֵ��
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
     * ��ȡmBomControlMode���Ե�ֵ��
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
     * ����mBomControlMode���Ե�ֵ��
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
     * ��ȡmBuildBatch���Ե�ֵ��
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
     * ����mBuildBatch���Ե�ֵ��
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
     * ��ȡmBuildMultiplier���Ե�ֵ��
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
     * ����mBuildMultiplier���Ե�ֵ��
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
     * ��ȡmBuildQuanSelectType���Ե�ֵ��
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
     * ����mBuildQuanSelectType���Ե�ֵ��
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
     * ��ȡmBuildShrinkageRate���Ե�ֵ��
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
     * ����mBuildShrinkageRate���Ե�ֵ��
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
     * ��ȡmCommonBOMMaterial���Ե�ֵ��
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
     * ����mCommonBOMMaterial���Ե�ֵ��
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
     * ��ȡmCommonRoutingMaterial���Ե�ֵ��
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
     * ����mCommonRoutingMaterial���Ե�ֵ��
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
     * ��ȡmCostElement���Ե�ֵ��
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
     * ����mCostElement���Ե�ֵ��
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
     * ��ȡmDefaultExpandLevel���Ե�ֵ��
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
     * ����mDefaultExpandLevel���Ե�ֵ��
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
     * ��ȡmFluctuantWaste���Ե�ֵ��
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
     * ����mFluctuantWaste���Ե�ֵ��
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
     * ��ȡmImmovableWaste���Ե�ֵ��
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
     * ����mImmovableWaste���Ե�ֵ��
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
     * ��ȡmIsAllowExcessMaterial���Ե�ֵ��
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
     * ����mIsAllowExcessMaterial���Ե�ֵ��
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
     * ��ȡmIsByproduct���Ե�ֵ��
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
     * ����mIsByproduct���Ե�ֵ��
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
     * ��ȡmIsECNControl���Ե�ֵ��
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
     * ����mIsECNControl���Ե�ֵ��
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
     * ��ȡmIsInheritBomMasterNo���Ե�ֵ��
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
     * ����mIsInheritBomMasterNo���Ե�ֵ��
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
     * ��ȡmIsMixLotControl���Ե�ֵ��
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
     * ����mIsMixLotControl���Ե�ֵ��
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
     * ��ȡmIsOutputControlFlag���Ե�ֵ��
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
     * ����mIsOutputControlFlag���Ե�ֵ��
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
     * ��ȡmIsSueOverType���Ե�ֵ��
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
     * ����mIsSueOverType���Ե�ֵ��
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
     * ��ȡmIssueMaterialBatchQty���Ե�ֵ��
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
     * ����mIssueMaterialBatchQty���Ե�ֵ��
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
     * ��ȡmIssueMaterialSafeStockPeriod���Ե�ֵ��
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
     * ����mIssueMaterialSafeStockPeriod���Ե�ֵ��
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
     * ��ȡmIssueMaterialSafeStockQty���Ե�ֵ��
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
     * ����mIssueMaterialSafeStockQty���Ե�ֵ��
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
     * ��ȡmKanbanDrive���Ե�ֵ��
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
     * ����mKanbanDrive���Ե�ֵ��
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
     * ��ȡmLowLevelCode���Ե�ֵ��
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
     * ����mLowLevelCode���Ե�ֵ��
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
     * ��ȡmMinSupplyMaterialQty���Ե�ֵ��
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
     * ����mMinSupplyMaterialQty���Ե�ֵ��
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
     * ��ȡmMultiHierarchyExpandFlag���Ե�ֵ��
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
     * ����mMultiHierarchyExpandFlag���Ե�ֵ��
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
     * ��ȡmOperateType���Ե�ֵ��
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
     * ����mOperateType���Ե�ֵ��
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
     * ��ȡmOverFinishType���Ե�ֵ��
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
     * ����mOverFinishType���Ե�ֵ��
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
     * ��ȡmOverQty���Ե�ֵ��
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
     * ����mOverQty���Ե�ֵ��
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
     * ��ȡmOverRate���Ե�ֵ��
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
     * ����mOverRate���Ե�ֵ��
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
     * ��ȡmPictureCode���Ե�ֵ��
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
     * ����mPictureCode���Ե�ֵ��
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
     * ��ȡmPreOffsetTime���Ե�ֵ��
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
     * ����mPreOffsetTime���Ե�ֵ��
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
     * ��ȡmProduceWasteRateType���Ե�ֵ��
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
     * ����mProduceWasteRateType���Ե�ֵ��
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
     * ��ȡmPurchasePartMakeMode���Ե�ֵ��
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
     * ����mPurchasePartMakeMode���Ե�ֵ��
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
     * ��ȡmStandardMaterialQty���Ե�ֵ��
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
     * ����mStandardMaterialQty���Ե�ֵ��
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
     * ��ȡmStandardMaterialScale���Ե�ֵ��
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
     * ����mStandardMaterialScale���Ե�ֵ��
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
     * ��ȡmSupplementMaterialBatchQty���Ե�ֵ��
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
     * ����mSupplementMaterialBatchQty���Ե�ֵ��
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
