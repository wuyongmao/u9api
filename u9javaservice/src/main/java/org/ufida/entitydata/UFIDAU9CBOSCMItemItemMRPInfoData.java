
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
 * &lt;p&gt;UFIDA.U9.CBO.SCM.Item.ItemMRPInfoData complex type�� Java �ࡣ
 * 
 * &lt;p&gt;����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="UFIDA.U9.CBO.SCM.Item.ItemMRPInfoData"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://www.UFIDA.org/EntityData}UFSoft.UBF.Business.DataTransObjectBase"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="ItemMaster_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Planer" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Planer_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_createdBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_createdOn" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_demandTimeFence" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_demandTimeFenceDays" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_demandTimeFenceRuleType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_firmPlannedMOTimeFence" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_fixedLT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_forecastContorlType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_iD" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isControlByDC" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isReduceMPS" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isTraceRequirement" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_itemMaster" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CBO.SCM.Item.ItemMasterData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_lTBatch" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_mRPPlanningType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_modifiedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_modifiedOn" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_overRunRatio" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_planningTimeFence" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_planningTimeFenceDays" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_planningTimeFenceRuleType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_purBackwardProcessLT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_purForwardProcessLT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_purProcessLT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_rearrangeTimeFence" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_releaseTimeFence" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_releaseTimeFenceDays" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_saleBackwardProcessLT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_saleForwardProcessLT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_saleProcessLT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_sumLT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_sumManufactureLT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_sysVersion" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_varietyLT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UFIDA.U9.CBO.SCM.Item.ItemMRPInfoData", propOrder = {
    "itemMasterSKey",
    "planer",
    "planerSKey",
    "mCreatedBy",
    "mCreatedOn",
    "mDemandTimeFence",
    "mDemandTimeFenceDays",
    "mDemandTimeFenceRuleType",
    "mFirmPlannedMOTimeFence",
    "mFixedLT",
    "mForecastContorlType",
    "mid",
    "mIsControlByDC",
    "mIsReduceMPS",
    "mIsTraceRequirement",
    "mItemMaster",
    "mltBatch",
    "mmrpPlanningType",
    "mModifiedBy",
    "mModifiedOn",
    "mOverRunRatio",
    "mPlanningTimeFence",
    "mPlanningTimeFenceDays",
    "mPlanningTimeFenceRuleType",
    "mPurBackwardProcessLT",
    "mPurForwardProcessLT",
    "mPurProcessLT",
    "mRearrangeTimeFence",
    "mReleaseTimeFence",
    "mReleaseTimeFenceDays",
    "mSaleBackwardProcessLT",
    "mSaleForwardProcessLT",
    "mSaleProcessLT",
    "mSumLT",
    "mSumManufactureLT",
    "mSysVersion",
    "mVarietyLT"
})
public class UFIDAU9CBOSCMItemItemMRPInfoData
    extends UFSoftUBFBusinessDataTransObjectBase
{

    @XmlElementRef(name = "ItemMaster_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> itemMasterSKey;
    @XmlElement(name = "Planer")
    protected Long planer;
    @XmlElementRef(name = "Planer_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> planerSKey;
    @XmlElementRef(name = "m_createdBy", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mCreatedBy;
    @XmlElement(name = "m_createdOn")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mCreatedOn;
    @XmlElement(name = "m_demandTimeFence")
    protected Integer mDemandTimeFence;
    @XmlElement(name = "m_demandTimeFenceDays")
    protected BigDecimal mDemandTimeFenceDays;
    @XmlElement(name = "m_demandTimeFenceRuleType")
    protected Integer mDemandTimeFenceRuleType;
    @XmlElement(name = "m_firmPlannedMOTimeFence")
    protected Integer mFirmPlannedMOTimeFence;
    @XmlElement(name = "m_fixedLT")
    protected BigDecimal mFixedLT;
    @XmlElement(name = "m_forecastContorlType")
    protected Integer mForecastContorlType;
    @XmlElement(name = "m_iD")
    protected Long mid;
    @XmlElement(name = "m_isControlByDC")
    protected Boolean mIsControlByDC;
    @XmlElement(name = "m_isReduceMPS")
    protected Boolean mIsReduceMPS;
    @XmlElement(name = "m_isTraceRequirement")
    protected Boolean mIsTraceRequirement;
    @XmlElementRef(name = "m_itemMaster", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9CBOSCMItemItemMasterData> mItemMaster;
    @XmlElement(name = "m_lTBatch")
    protected BigDecimal mltBatch;
    @XmlElement(name = "m_mRPPlanningType")
    protected Integer mmrpPlanningType;
    @XmlElementRef(name = "m_modifiedBy", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mModifiedBy;
    @XmlElement(name = "m_modifiedOn")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mModifiedOn;
    @XmlElement(name = "m_overRunRatio")
    protected BigDecimal mOverRunRatio;
    @XmlElement(name = "m_planningTimeFence")
    protected Integer mPlanningTimeFence;
    @XmlElement(name = "m_planningTimeFenceDays")
    protected BigDecimal mPlanningTimeFenceDays;
    @XmlElement(name = "m_planningTimeFenceRuleType")
    protected Integer mPlanningTimeFenceRuleType;
    @XmlElement(name = "m_purBackwardProcessLT")
    protected BigDecimal mPurBackwardProcessLT;
    @XmlElement(name = "m_purForwardProcessLT")
    protected BigDecimal mPurForwardProcessLT;
    @XmlElement(name = "m_purProcessLT")
    protected BigDecimal mPurProcessLT;
    @XmlElement(name = "m_rearrangeTimeFence")
    protected Integer mRearrangeTimeFence;
    @XmlElement(name = "m_releaseTimeFence")
    protected Integer mReleaseTimeFence;
    @XmlElement(name = "m_releaseTimeFenceDays")
    protected Integer mReleaseTimeFenceDays;
    @XmlElement(name = "m_saleBackwardProcessLT")
    protected BigDecimal mSaleBackwardProcessLT;
    @XmlElement(name = "m_saleForwardProcessLT")
    protected BigDecimal mSaleForwardProcessLT;
    @XmlElement(name = "m_saleProcessLT")
    protected BigDecimal mSaleProcessLT;
    @XmlElement(name = "m_sumLT")
    protected BigDecimal mSumLT;
    @XmlElement(name = "m_sumManufactureLT")
    protected BigDecimal mSumManufactureLT;
    @XmlElement(name = "m_sysVersion")
    protected Long mSysVersion;
    @XmlElement(name = "m_varietyLT")
    protected BigDecimal mVarietyLT;

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
     * ��ȡplaner���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPlaner() {
        return planer;
    }

    /**
     * ����planer���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPlaner(Long value) {
        this.planer = value;
    }

    /**
     * ��ȡplanerSKey���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getPlanerSKey() {
        return planerSKey;
    }

    /**
     * ����planerSKey���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setPlanerSKey(JAXBElement<EntityKey> value) {
        this.planerSKey = value;
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
     * ��ȡmDemandTimeFence���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMDemandTimeFence() {
        return mDemandTimeFence;
    }

    /**
     * ����mDemandTimeFence���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMDemandTimeFence(Integer value) {
        this.mDemandTimeFence = value;
    }

    /**
     * ��ȡmDemandTimeFenceDays���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMDemandTimeFenceDays() {
        return mDemandTimeFenceDays;
    }

    /**
     * ����mDemandTimeFenceDays���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMDemandTimeFenceDays(BigDecimal value) {
        this.mDemandTimeFenceDays = value;
    }

    /**
     * ��ȡmDemandTimeFenceRuleType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMDemandTimeFenceRuleType() {
        return mDemandTimeFenceRuleType;
    }

    /**
     * ����mDemandTimeFenceRuleType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMDemandTimeFenceRuleType(Integer value) {
        this.mDemandTimeFenceRuleType = value;
    }

    /**
     * ��ȡmFirmPlannedMOTimeFence���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMFirmPlannedMOTimeFence() {
        return mFirmPlannedMOTimeFence;
    }

    /**
     * ����mFirmPlannedMOTimeFence���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMFirmPlannedMOTimeFence(Integer value) {
        this.mFirmPlannedMOTimeFence = value;
    }

    /**
     * ��ȡmFixedLT���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMFixedLT() {
        return mFixedLT;
    }

    /**
     * ����mFixedLT���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMFixedLT(BigDecimal value) {
        this.mFixedLT = value;
    }

    /**
     * ��ȡmForecastContorlType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMForecastContorlType() {
        return mForecastContorlType;
    }

    /**
     * ����mForecastContorlType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMForecastContorlType(Integer value) {
        this.mForecastContorlType = value;
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
     * ��ȡmIsControlByDC���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsControlByDC() {
        return mIsControlByDC;
    }

    /**
     * ����mIsControlByDC���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsControlByDC(Boolean value) {
        this.mIsControlByDC = value;
    }

    /**
     * ��ȡmIsReduceMPS���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsReduceMPS() {
        return mIsReduceMPS;
    }

    /**
     * ����mIsReduceMPS���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsReduceMPS(Boolean value) {
        this.mIsReduceMPS = value;
    }

    /**
     * ��ȡmIsTraceRequirement���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsTraceRequirement() {
        return mIsTraceRequirement;
    }

    /**
     * ����mIsTraceRequirement���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsTraceRequirement(Boolean value) {
        this.mIsTraceRequirement = value;
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
     * ��ȡmltBatch���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMLTBatch() {
        return mltBatch;
    }

    /**
     * ����mltBatch���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMLTBatch(BigDecimal value) {
        this.mltBatch = value;
    }

    /**
     * ��ȡmmrpPlanningType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMMRPPlanningType() {
        return mmrpPlanningType;
    }

    /**
     * ����mmrpPlanningType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMMRPPlanningType(Integer value) {
        this.mmrpPlanningType = value;
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
     * ��ȡmOverRunRatio���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMOverRunRatio() {
        return mOverRunRatio;
    }

    /**
     * ����mOverRunRatio���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMOverRunRatio(BigDecimal value) {
        this.mOverRunRatio = value;
    }

    /**
     * ��ȡmPlanningTimeFence���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMPlanningTimeFence() {
        return mPlanningTimeFence;
    }

    /**
     * ����mPlanningTimeFence���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMPlanningTimeFence(Integer value) {
        this.mPlanningTimeFence = value;
    }

    /**
     * ��ȡmPlanningTimeFenceDays���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMPlanningTimeFenceDays() {
        return mPlanningTimeFenceDays;
    }

    /**
     * ����mPlanningTimeFenceDays���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMPlanningTimeFenceDays(BigDecimal value) {
        this.mPlanningTimeFenceDays = value;
    }

    /**
     * ��ȡmPlanningTimeFenceRuleType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMPlanningTimeFenceRuleType() {
        return mPlanningTimeFenceRuleType;
    }

    /**
     * ����mPlanningTimeFenceRuleType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMPlanningTimeFenceRuleType(Integer value) {
        this.mPlanningTimeFenceRuleType = value;
    }

    /**
     * ��ȡmPurBackwardProcessLT���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMPurBackwardProcessLT() {
        return mPurBackwardProcessLT;
    }

    /**
     * ����mPurBackwardProcessLT���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMPurBackwardProcessLT(BigDecimal value) {
        this.mPurBackwardProcessLT = value;
    }

    /**
     * ��ȡmPurForwardProcessLT���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMPurForwardProcessLT() {
        return mPurForwardProcessLT;
    }

    /**
     * ����mPurForwardProcessLT���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMPurForwardProcessLT(BigDecimal value) {
        this.mPurForwardProcessLT = value;
    }

    /**
     * ��ȡmPurProcessLT���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMPurProcessLT() {
        return mPurProcessLT;
    }

    /**
     * ����mPurProcessLT���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMPurProcessLT(BigDecimal value) {
        this.mPurProcessLT = value;
    }

    /**
     * ��ȡmRearrangeTimeFence���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMRearrangeTimeFence() {
        return mRearrangeTimeFence;
    }

    /**
     * ����mRearrangeTimeFence���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMRearrangeTimeFence(Integer value) {
        this.mRearrangeTimeFence = value;
    }

    /**
     * ��ȡmReleaseTimeFence���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMReleaseTimeFence() {
        return mReleaseTimeFence;
    }

    /**
     * ����mReleaseTimeFence���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMReleaseTimeFence(Integer value) {
        this.mReleaseTimeFence = value;
    }

    /**
     * ��ȡmReleaseTimeFenceDays���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMReleaseTimeFenceDays() {
        return mReleaseTimeFenceDays;
    }

    /**
     * ����mReleaseTimeFenceDays���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMReleaseTimeFenceDays(Integer value) {
        this.mReleaseTimeFenceDays = value;
    }

    /**
     * ��ȡmSaleBackwardProcessLT���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMSaleBackwardProcessLT() {
        return mSaleBackwardProcessLT;
    }

    /**
     * ����mSaleBackwardProcessLT���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMSaleBackwardProcessLT(BigDecimal value) {
        this.mSaleBackwardProcessLT = value;
    }

    /**
     * ��ȡmSaleForwardProcessLT���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMSaleForwardProcessLT() {
        return mSaleForwardProcessLT;
    }

    /**
     * ����mSaleForwardProcessLT���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMSaleForwardProcessLT(BigDecimal value) {
        this.mSaleForwardProcessLT = value;
    }

    /**
     * ��ȡmSaleProcessLT���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMSaleProcessLT() {
        return mSaleProcessLT;
    }

    /**
     * ����mSaleProcessLT���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMSaleProcessLT(BigDecimal value) {
        this.mSaleProcessLT = value;
    }

    /**
     * ��ȡmSumLT���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMSumLT() {
        return mSumLT;
    }

    /**
     * ����mSumLT���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMSumLT(BigDecimal value) {
        this.mSumLT = value;
    }

    /**
     * ��ȡmSumManufactureLT���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMSumManufactureLT() {
        return mSumManufactureLT;
    }

    /**
     * ����mSumManufactureLT���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMSumManufactureLT(BigDecimal value) {
        this.mSumManufactureLT = value;
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
     * ��ȡmVarietyLT���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMVarietyLT() {
        return mVarietyLT;
    }

    /**
     * ����mVarietyLT���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMVarietyLT(BigDecimal value) {
        this.mVarietyLT = value;
    }

}
