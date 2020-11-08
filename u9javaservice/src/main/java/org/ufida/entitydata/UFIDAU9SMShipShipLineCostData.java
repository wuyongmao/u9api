
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
 * &lt;p&gt;UFIDA.U9.SM.Ship.ShipLineCostData complex type�� Java �ࡣ
 * 
 * &lt;p&gt;����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="UFIDA.U9.SM.Ship.ShipLineCostData"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://www.UFIDA.org/EntityData}UFSoft.UBF.Business.DataTransObjectBase"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="CostField" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="CostField_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="CostType" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="CostType_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Currency" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Currency_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Org" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Org_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="SOB" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="SOB_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ShipLine_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_actualMoney" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_actualPrice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_commissionFee" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_createdBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_createdOn" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_iD" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isAccCostType" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isMainCostField" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_machineFee" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_manualFee" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_manufactureFee" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_materialFee" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_modifiedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_modifiedOn" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_normalNextCommissionFee" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_normalNextMachineFee" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_normalNextManualFee" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_normalNextManufactureFee" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_normalNextMaterialFee" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_normalNextPurchaseCost" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_normalThisCommissionFee" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_normalThisMachineFee" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_normalThisManualFee" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_normalThisManufactureFee" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_normalThisMaterialFee" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_normalThisPurchaseCost" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_planNormalMoney" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_planNormalPrice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_purchaseCost" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_shipLine" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.SM.Ship.ShipLineData" minOccurs="0"/&amp;gt;
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
@XmlType(name = "UFIDA.U9.SM.Ship.ShipLineCostData", propOrder = {
    "costField",
    "costFieldSKey",
    "costType",
    "costTypeSKey",
    "currency",
    "currencySKey",
    "org",
    "orgSKey",
    "sob",
    "sobsKey",
    "shipLineSKey",
    "mActualMoney",
    "mActualPrice",
    "mCommissionFee",
    "mCreatedBy",
    "mCreatedOn",
    "mid",
    "mIsAccCostType",
    "mIsMainCostField",
    "mMachineFee",
    "mManualFee",
    "mManufactureFee",
    "mMaterialFee",
    "mModifiedBy",
    "mModifiedOn",
    "mNormalNextCommissionFee",
    "mNormalNextMachineFee",
    "mNormalNextManualFee",
    "mNormalNextManufactureFee",
    "mNormalNextMaterialFee",
    "mNormalNextPurchaseCost",
    "mNormalThisCommissionFee",
    "mNormalThisMachineFee",
    "mNormalThisManualFee",
    "mNormalThisManufactureFee",
    "mNormalThisMaterialFee",
    "mNormalThisPurchaseCost",
    "mPlanNormalMoney",
    "mPlanNormalPrice",
    "mPurchaseCost",
    "mShipLine",
    "mSysVersion"
})
public class UFIDAU9SMShipShipLineCostData
    extends UFSoftUBFBusinessDataTransObjectBase
{

    @XmlElement(name = "CostField")
    protected Long costField;
    @XmlElementRef(name = "CostField_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> costFieldSKey;
    @XmlElement(name = "CostType")
    protected Long costType;
    @XmlElementRef(name = "CostType_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> costTypeSKey;
    @XmlElement(name = "Currency")
    protected Long currency;
    @XmlElementRef(name = "Currency_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> currencySKey;
    @XmlElement(name = "Org")
    protected Long org;
    @XmlElementRef(name = "Org_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> orgSKey;
    @XmlElement(name = "SOB")
    protected Long sob;
    @XmlElementRef(name = "SOB_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> sobsKey;
    @XmlElementRef(name = "ShipLine_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> shipLineSKey;
    @XmlElement(name = "m_actualMoney")
    protected BigDecimal mActualMoney;
    @XmlElement(name = "m_actualPrice")
    protected BigDecimal mActualPrice;
    @XmlElement(name = "m_commissionFee")
    protected BigDecimal mCommissionFee;
    @XmlElementRef(name = "m_createdBy", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mCreatedBy;
    @XmlElement(name = "m_createdOn")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mCreatedOn;
    @XmlElement(name = "m_iD")
    protected Long mid;
    @XmlElement(name = "m_isAccCostType")
    protected Boolean mIsAccCostType;
    @XmlElement(name = "m_isMainCostField")
    protected Boolean mIsMainCostField;
    @XmlElement(name = "m_machineFee")
    protected BigDecimal mMachineFee;
    @XmlElement(name = "m_manualFee")
    protected BigDecimal mManualFee;
    @XmlElement(name = "m_manufactureFee")
    protected BigDecimal mManufactureFee;
    @XmlElement(name = "m_materialFee")
    protected BigDecimal mMaterialFee;
    @XmlElementRef(name = "m_modifiedBy", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mModifiedBy;
    @XmlElement(name = "m_modifiedOn")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mModifiedOn;
    @XmlElement(name = "m_normalNextCommissionFee")
    protected BigDecimal mNormalNextCommissionFee;
    @XmlElement(name = "m_normalNextMachineFee")
    protected BigDecimal mNormalNextMachineFee;
    @XmlElement(name = "m_normalNextManualFee")
    protected BigDecimal mNormalNextManualFee;
    @XmlElement(name = "m_normalNextManufactureFee")
    protected BigDecimal mNormalNextManufactureFee;
    @XmlElement(name = "m_normalNextMaterialFee")
    protected BigDecimal mNormalNextMaterialFee;
    @XmlElement(name = "m_normalNextPurchaseCost")
    protected BigDecimal mNormalNextPurchaseCost;
    @XmlElement(name = "m_normalThisCommissionFee")
    protected BigDecimal mNormalThisCommissionFee;
    @XmlElement(name = "m_normalThisMachineFee")
    protected BigDecimal mNormalThisMachineFee;
    @XmlElement(name = "m_normalThisManualFee")
    protected BigDecimal mNormalThisManualFee;
    @XmlElement(name = "m_normalThisManufactureFee")
    protected BigDecimal mNormalThisManufactureFee;
    @XmlElement(name = "m_normalThisMaterialFee")
    protected BigDecimal mNormalThisMaterialFee;
    @XmlElement(name = "m_normalThisPurchaseCost")
    protected BigDecimal mNormalThisPurchaseCost;
    @XmlElement(name = "m_planNormalMoney")
    protected BigDecimal mPlanNormalMoney;
    @XmlElement(name = "m_planNormalPrice")
    protected BigDecimal mPlanNormalPrice;
    @XmlElement(name = "m_purchaseCost")
    protected BigDecimal mPurchaseCost;
    @XmlElementRef(name = "m_shipLine", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9SMShipShipLineData> mShipLine;
    @XmlElement(name = "m_sysVersion")
    protected Long mSysVersion;

    /**
     * ��ȡcostField���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCostField() {
        return costField;
    }

    /**
     * ����costField���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCostField(Long value) {
        this.costField = value;
    }

    /**
     * ��ȡcostFieldSKey���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getCostFieldSKey() {
        return costFieldSKey;
    }

    /**
     * ����costFieldSKey���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setCostFieldSKey(JAXBElement<EntityKey> value) {
        this.costFieldSKey = value;
    }

    /**
     * ��ȡcostType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCostType() {
        return costType;
    }

    /**
     * ����costType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCostType(Long value) {
        this.costType = value;
    }

    /**
     * ��ȡcostTypeSKey���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getCostTypeSKey() {
        return costTypeSKey;
    }

    /**
     * ����costTypeSKey���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setCostTypeSKey(JAXBElement<EntityKey> value) {
        this.costTypeSKey = value;
    }

    /**
     * ��ȡcurrency���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCurrency() {
        return currency;
    }

    /**
     * ����currency���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCurrency(Long value) {
        this.currency = value;
    }

    /**
     * ��ȡcurrencySKey���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getCurrencySKey() {
        return currencySKey;
    }

    /**
     * ����currencySKey���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setCurrencySKey(JAXBElement<EntityKey> value) {
        this.currencySKey = value;
    }

    /**
     * ��ȡorg���Ե�ֵ��
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
     * ����org���Ե�ֵ��
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
     * ��ȡorgSKey���Ե�ֵ��
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
     * ����orgSKey���Ե�ֵ��
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
     * ��ȡsob���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSOB() {
        return sob;
    }

    /**
     * ����sob���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSOB(Long value) {
        this.sob = value;
    }

    /**
     * ��ȡsobsKey���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getSOBSKey() {
        return sobsKey;
    }

    /**
     * ����sobsKey���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setSOBSKey(JAXBElement<EntityKey> value) {
        this.sobsKey = value;
    }

    /**
     * ��ȡshipLineSKey���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getShipLineSKey() {
        return shipLineSKey;
    }

    /**
     * ����shipLineSKey���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setShipLineSKey(JAXBElement<EntityKey> value) {
        this.shipLineSKey = value;
    }

    /**
     * ��ȡmActualMoney���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMActualMoney() {
        return mActualMoney;
    }

    /**
     * ����mActualMoney���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMActualMoney(BigDecimal value) {
        this.mActualMoney = value;
    }

    /**
     * ��ȡmActualPrice���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMActualPrice() {
        return mActualPrice;
    }

    /**
     * ����mActualPrice���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMActualPrice(BigDecimal value) {
        this.mActualPrice = value;
    }

    /**
     * ��ȡmCommissionFee���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMCommissionFee() {
        return mCommissionFee;
    }

    /**
     * ����mCommissionFee���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMCommissionFee(BigDecimal value) {
        this.mCommissionFee = value;
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
     * ��ȡmIsAccCostType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsAccCostType() {
        return mIsAccCostType;
    }

    /**
     * ����mIsAccCostType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsAccCostType(Boolean value) {
        this.mIsAccCostType = value;
    }

    /**
     * ��ȡmIsMainCostField���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsMainCostField() {
        return mIsMainCostField;
    }

    /**
     * ����mIsMainCostField���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsMainCostField(Boolean value) {
        this.mIsMainCostField = value;
    }

    /**
     * ��ȡmMachineFee���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMMachineFee() {
        return mMachineFee;
    }

    /**
     * ����mMachineFee���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMMachineFee(BigDecimal value) {
        this.mMachineFee = value;
    }

    /**
     * ��ȡmManualFee���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMManualFee() {
        return mManualFee;
    }

    /**
     * ����mManualFee���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMManualFee(BigDecimal value) {
        this.mManualFee = value;
    }

    /**
     * ��ȡmManufactureFee���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMManufactureFee() {
        return mManufactureFee;
    }

    /**
     * ����mManufactureFee���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMManufactureFee(BigDecimal value) {
        this.mManufactureFee = value;
    }

    /**
     * ��ȡmMaterialFee���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMMaterialFee() {
        return mMaterialFee;
    }

    /**
     * ����mMaterialFee���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMMaterialFee(BigDecimal value) {
        this.mMaterialFee = value;
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
     * ��ȡmNormalNextCommissionFee���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMNormalNextCommissionFee() {
        return mNormalNextCommissionFee;
    }

    /**
     * ����mNormalNextCommissionFee���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMNormalNextCommissionFee(BigDecimal value) {
        this.mNormalNextCommissionFee = value;
    }

    /**
     * ��ȡmNormalNextMachineFee���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMNormalNextMachineFee() {
        return mNormalNextMachineFee;
    }

    /**
     * ����mNormalNextMachineFee���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMNormalNextMachineFee(BigDecimal value) {
        this.mNormalNextMachineFee = value;
    }

    /**
     * ��ȡmNormalNextManualFee���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMNormalNextManualFee() {
        return mNormalNextManualFee;
    }

    /**
     * ����mNormalNextManualFee���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMNormalNextManualFee(BigDecimal value) {
        this.mNormalNextManualFee = value;
    }

    /**
     * ��ȡmNormalNextManufactureFee���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMNormalNextManufactureFee() {
        return mNormalNextManufactureFee;
    }

    /**
     * ����mNormalNextManufactureFee���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMNormalNextManufactureFee(BigDecimal value) {
        this.mNormalNextManufactureFee = value;
    }

    /**
     * ��ȡmNormalNextMaterialFee���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMNormalNextMaterialFee() {
        return mNormalNextMaterialFee;
    }

    /**
     * ����mNormalNextMaterialFee���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMNormalNextMaterialFee(BigDecimal value) {
        this.mNormalNextMaterialFee = value;
    }

    /**
     * ��ȡmNormalNextPurchaseCost���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMNormalNextPurchaseCost() {
        return mNormalNextPurchaseCost;
    }

    /**
     * ����mNormalNextPurchaseCost���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMNormalNextPurchaseCost(BigDecimal value) {
        this.mNormalNextPurchaseCost = value;
    }

    /**
     * ��ȡmNormalThisCommissionFee���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMNormalThisCommissionFee() {
        return mNormalThisCommissionFee;
    }

    /**
     * ����mNormalThisCommissionFee���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMNormalThisCommissionFee(BigDecimal value) {
        this.mNormalThisCommissionFee = value;
    }

    /**
     * ��ȡmNormalThisMachineFee���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMNormalThisMachineFee() {
        return mNormalThisMachineFee;
    }

    /**
     * ����mNormalThisMachineFee���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMNormalThisMachineFee(BigDecimal value) {
        this.mNormalThisMachineFee = value;
    }

    /**
     * ��ȡmNormalThisManualFee���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMNormalThisManualFee() {
        return mNormalThisManualFee;
    }

    /**
     * ����mNormalThisManualFee���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMNormalThisManualFee(BigDecimal value) {
        this.mNormalThisManualFee = value;
    }

    /**
     * ��ȡmNormalThisManufactureFee���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMNormalThisManufactureFee() {
        return mNormalThisManufactureFee;
    }

    /**
     * ����mNormalThisManufactureFee���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMNormalThisManufactureFee(BigDecimal value) {
        this.mNormalThisManufactureFee = value;
    }

    /**
     * ��ȡmNormalThisMaterialFee���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMNormalThisMaterialFee() {
        return mNormalThisMaterialFee;
    }

    /**
     * ����mNormalThisMaterialFee���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMNormalThisMaterialFee(BigDecimal value) {
        this.mNormalThisMaterialFee = value;
    }

    /**
     * ��ȡmNormalThisPurchaseCost���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMNormalThisPurchaseCost() {
        return mNormalThisPurchaseCost;
    }

    /**
     * ����mNormalThisPurchaseCost���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMNormalThisPurchaseCost(BigDecimal value) {
        this.mNormalThisPurchaseCost = value;
    }

    /**
     * ��ȡmPlanNormalMoney���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMPlanNormalMoney() {
        return mPlanNormalMoney;
    }

    /**
     * ����mPlanNormalMoney���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMPlanNormalMoney(BigDecimal value) {
        this.mPlanNormalMoney = value;
    }

    /**
     * ��ȡmPlanNormalPrice���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMPlanNormalPrice() {
        return mPlanNormalPrice;
    }

    /**
     * ����mPlanNormalPrice���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMPlanNormalPrice(BigDecimal value) {
        this.mPlanNormalPrice = value;
    }

    /**
     * ��ȡmPurchaseCost���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMPurchaseCost() {
        return mPurchaseCost;
    }

    /**
     * ����mPurchaseCost���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMPurchaseCost(BigDecimal value) {
        this.mPurchaseCost = value;
    }

    /**
     * ��ȡmShipLine���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9SMShipShipLineData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9SMShipShipLineData> getMShipLine() {
        return mShipLine;
    }

    /**
     * ����mShipLine���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9SMShipShipLineData }{@code >}
     *     
     */
    public void setMShipLine(JAXBElement<UFIDAU9SMShipShipLineData> value) {
        this.mShipLine = value;
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
