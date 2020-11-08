
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
 * &lt;p&gt;UFIDA.U9.SM.Ship.ShipInstalmentTermData complex type的 Java 类。
 * 
 * &lt;p&gt;以下模式片段指定包含在此类中的预期内容。
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="UFIDA.U9.SM.Ship.ShipInstalmentTermData"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://www.UFIDA.org/EntityData}UFSoft.UBF.Business.DataTransObjectBase"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="MaxARPeriod" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="MaxARPeriod_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="SOBAccountPeriod" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="SOBAccountPeriod_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ShipLine_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_accureMoney" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_accurePercent" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_arStatus" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_arTermLineNO" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_confirmDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_confirmDateType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_createdBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_createdOn" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_descFlexField" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.Base.FlexField.DescFlexField.DescFlexSegmentsData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_iD" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_installmentRecMode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isAbsoluteMoney" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isFIClose" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isQA" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_maturityDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_memo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_modifiedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_modifiedOn" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_netMoneyAC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_netPriceAC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_sOBAccountDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_shipInstalmentRecTerms" type="{http://www.UFIDA.org/EntityData}ArrayOfUFIDA.U9.SM.Ship.ShipInstalmentRecTermData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_shipLine" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.SM.Ship.ShipLineData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_shipPlanQtyPU" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_shipPlanQtyTBU" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_shipPlanQtyTU" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_srcLineID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_sumConfirmQtyPU" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_sumConfirmQtyTBU" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_sumConfirmQtyTU" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_sumConfirmTotalMoneyAC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_sumReceiveQtyPU" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_sumReceiveQtyTBU" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_sumReceiveQtyTU" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_sumReceiveTotalMoneyAC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_sysVersion" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_taxDetails" type="{http://www.UFIDA.org/EntityData}ArrayOfUFIDA.U9.SM.Ship.ShipTaxData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_taxMoneyAC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_taxPriceAC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_termLineNO" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_totalMoneyAC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UFIDA.U9.SM.Ship.ShipInstalmentTermData", propOrder = {
    "maxARPeriod",
    "maxARPeriodSKey",
    "sobAccountPeriod",
    "sobAccountPeriodSKey",
    "shipLineSKey",
    "mAccureMoney",
    "mAccurePercent",
    "mArStatus",
    "mArTermLineNO",
    "mConfirmDate",
    "mConfirmDateType",
    "mCreatedBy",
    "mCreatedOn",
    "mDescFlexField",
    "mid",
    "mInstallmentRecMode",
    "mIsAbsoluteMoney",
    "mIsFIClose",
    "mIsQA",
    "mMaturityDate",
    "mMemo",
    "mModifiedBy",
    "mModifiedOn",
    "mNetMoneyAC",
    "mNetPriceAC",
    "msobAccountDate",
    "mShipInstalmentRecTerms",
    "mShipLine",
    "mShipPlanQtyPU",
    "mShipPlanQtyTBU",
    "mShipPlanQtyTU",
    "mSrcLineID",
    "mSumConfirmQtyPU",
    "mSumConfirmQtyTBU",
    "mSumConfirmQtyTU",
    "mSumConfirmTotalMoneyAC",
    "mSumReceiveQtyPU",
    "mSumReceiveQtyTBU",
    "mSumReceiveQtyTU",
    "mSumReceiveTotalMoneyAC",
    "mSysVersion",
    "mTaxDetails",
    "mTaxMoneyAC",
    "mTaxPriceAC",
    "mTermLineNO",
    "mTotalMoneyAC"
})
public class UFIDAU9SMShipShipInstalmentTermData
    extends UFSoftUBFBusinessDataTransObjectBase
{

    @XmlElement(name = "MaxARPeriod")
    protected Long maxARPeriod;
    @XmlElementRef(name = "MaxARPeriod_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> maxARPeriodSKey;
    @XmlElement(name = "SOBAccountPeriod")
    protected Long sobAccountPeriod;
    @XmlElementRef(name = "SOBAccountPeriod_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> sobAccountPeriodSKey;
    @XmlElementRef(name = "ShipLine_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> shipLineSKey;
    @XmlElement(name = "m_accureMoney")
    protected BigDecimal mAccureMoney;
    @XmlElement(name = "m_accurePercent")
    protected BigDecimal mAccurePercent;
    @XmlElement(name = "m_arStatus")
    protected Integer mArStatus;
    @XmlElement(name = "m_arTermLineNO")
    protected Integer mArTermLineNO;
    @XmlElement(name = "m_confirmDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mConfirmDate;
    @XmlElement(name = "m_confirmDateType")
    protected Integer mConfirmDateType;
    @XmlElementRef(name = "m_createdBy", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mCreatedBy;
    @XmlElement(name = "m_createdOn")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mCreatedOn;
    @XmlElementRef(name = "m_descFlexField", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9BaseFlexFieldDescFlexFieldDescFlexSegmentsData> mDescFlexField;
    @XmlElement(name = "m_iD")
    protected Long mid;
    @XmlElement(name = "m_installmentRecMode")
    protected Integer mInstallmentRecMode;
    @XmlElement(name = "m_isAbsoluteMoney")
    protected Boolean mIsAbsoluteMoney;
    @XmlElement(name = "m_isFIClose")
    protected Boolean mIsFIClose;
    @XmlElement(name = "m_isQA")
    protected Boolean mIsQA;
    @XmlElement(name = "m_maturityDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mMaturityDate;
    @XmlElementRef(name = "m_memo", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mMemo;
    @XmlElementRef(name = "m_modifiedBy", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mModifiedBy;
    @XmlElement(name = "m_modifiedOn")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mModifiedOn;
    @XmlElement(name = "m_netMoneyAC")
    protected BigDecimal mNetMoneyAC;
    @XmlElement(name = "m_netPriceAC")
    protected BigDecimal mNetPriceAC;
    @XmlElement(name = "m_sOBAccountDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar msobAccountDate;
    @XmlElementRef(name = "m_shipInstalmentRecTerms", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfUFIDAU9SMShipShipInstalmentRecTermData> mShipInstalmentRecTerms;
    @XmlElementRef(name = "m_shipLine", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9SMShipShipLineData> mShipLine;
    @XmlElement(name = "m_shipPlanQtyPU")
    protected BigDecimal mShipPlanQtyPU;
    @XmlElement(name = "m_shipPlanQtyTBU")
    protected BigDecimal mShipPlanQtyTBU;
    @XmlElement(name = "m_shipPlanQtyTU")
    protected BigDecimal mShipPlanQtyTU;
    @XmlElement(name = "m_srcLineID")
    protected Long mSrcLineID;
    @XmlElement(name = "m_sumConfirmQtyPU")
    protected BigDecimal mSumConfirmQtyPU;
    @XmlElement(name = "m_sumConfirmQtyTBU")
    protected BigDecimal mSumConfirmQtyTBU;
    @XmlElement(name = "m_sumConfirmQtyTU")
    protected BigDecimal mSumConfirmQtyTU;
    @XmlElement(name = "m_sumConfirmTotalMoneyAC")
    protected BigDecimal mSumConfirmTotalMoneyAC;
    @XmlElement(name = "m_sumReceiveQtyPU")
    protected BigDecimal mSumReceiveQtyPU;
    @XmlElement(name = "m_sumReceiveQtyTBU")
    protected BigDecimal mSumReceiveQtyTBU;
    @XmlElement(name = "m_sumReceiveQtyTU")
    protected BigDecimal mSumReceiveQtyTU;
    @XmlElement(name = "m_sumReceiveTotalMoneyAC")
    protected BigDecimal mSumReceiveTotalMoneyAC;
    @XmlElement(name = "m_sysVersion")
    protected Long mSysVersion;
    @XmlElementRef(name = "m_taxDetails", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfUFIDAU9SMShipShipTaxData> mTaxDetails;
    @XmlElement(name = "m_taxMoneyAC")
    protected BigDecimal mTaxMoneyAC;
    @XmlElement(name = "m_taxPriceAC")
    protected BigDecimal mTaxPriceAC;
    @XmlElement(name = "m_termLineNO")
    protected Integer mTermLineNO;
    @XmlElement(name = "m_totalMoneyAC")
    protected BigDecimal mTotalMoneyAC;

    /**
     * 获取maxARPeriod属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMaxARPeriod() {
        return maxARPeriod;
    }

    /**
     * 设置maxARPeriod属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMaxARPeriod(Long value) {
        this.maxARPeriod = value;
    }

    /**
     * 获取maxARPeriodSKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getMaxARPeriodSKey() {
        return maxARPeriodSKey;
    }

    /**
     * 设置maxARPeriodSKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setMaxARPeriodSKey(JAXBElement<EntityKey> value) {
        this.maxARPeriodSKey = value;
    }

    /**
     * 获取sobAccountPeriod属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSOBAccountPeriod() {
        return sobAccountPeriod;
    }

    /**
     * 设置sobAccountPeriod属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSOBAccountPeriod(Long value) {
        this.sobAccountPeriod = value;
    }

    /**
     * 获取sobAccountPeriodSKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getSOBAccountPeriodSKey() {
        return sobAccountPeriodSKey;
    }

    /**
     * 设置sobAccountPeriodSKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setSOBAccountPeriodSKey(JAXBElement<EntityKey> value) {
        this.sobAccountPeriodSKey = value;
    }

    /**
     * 获取shipLineSKey属性的值。
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
     * 设置shipLineSKey属性的值。
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
     * 获取mAccureMoney属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMAccureMoney() {
        return mAccureMoney;
    }

    /**
     * 设置mAccureMoney属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMAccureMoney(BigDecimal value) {
        this.mAccureMoney = value;
    }

    /**
     * 获取mAccurePercent属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMAccurePercent() {
        return mAccurePercent;
    }

    /**
     * 设置mAccurePercent属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMAccurePercent(BigDecimal value) {
        this.mAccurePercent = value;
    }

    /**
     * 获取mArStatus属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMArStatus() {
        return mArStatus;
    }

    /**
     * 设置mArStatus属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMArStatus(Integer value) {
        this.mArStatus = value;
    }

    /**
     * 获取mArTermLineNO属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMArTermLineNO() {
        return mArTermLineNO;
    }

    /**
     * 设置mArTermLineNO属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMArTermLineNO(Integer value) {
        this.mArTermLineNO = value;
    }

    /**
     * 获取mConfirmDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMConfirmDate() {
        return mConfirmDate;
    }

    /**
     * 设置mConfirmDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMConfirmDate(XMLGregorianCalendar value) {
        this.mConfirmDate = value;
    }

    /**
     * 获取mConfirmDateType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMConfirmDateType() {
        return mConfirmDateType;
    }

    /**
     * 设置mConfirmDateType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMConfirmDateType(Integer value) {
        this.mConfirmDateType = value;
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
     * 获取mInstallmentRecMode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMInstallmentRecMode() {
        return mInstallmentRecMode;
    }

    /**
     * 设置mInstallmentRecMode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMInstallmentRecMode(Integer value) {
        this.mInstallmentRecMode = value;
    }

    /**
     * 获取mIsAbsoluteMoney属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsAbsoluteMoney() {
        return mIsAbsoluteMoney;
    }

    /**
     * 设置mIsAbsoluteMoney属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsAbsoluteMoney(Boolean value) {
        this.mIsAbsoluteMoney = value;
    }

    /**
     * 获取mIsFIClose属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsFIClose() {
        return mIsFIClose;
    }

    /**
     * 设置mIsFIClose属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsFIClose(Boolean value) {
        this.mIsFIClose = value;
    }

    /**
     * 获取mIsQA属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsQA() {
        return mIsQA;
    }

    /**
     * 设置mIsQA属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsQA(Boolean value) {
        this.mIsQA = value;
    }

    /**
     * 获取mMaturityDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMMaturityDate() {
        return mMaturityDate;
    }

    /**
     * 设置mMaturityDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMMaturityDate(XMLGregorianCalendar value) {
        this.mMaturityDate = value;
    }

    /**
     * 获取mMemo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMMemo() {
        return mMemo;
    }

    /**
     * 设置mMemo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMMemo(JAXBElement<String> value) {
        this.mMemo = value;
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
     * 获取mNetMoneyAC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMNetMoneyAC() {
        return mNetMoneyAC;
    }

    /**
     * 设置mNetMoneyAC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMNetMoneyAC(BigDecimal value) {
        this.mNetMoneyAC = value;
    }

    /**
     * 获取mNetPriceAC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMNetPriceAC() {
        return mNetPriceAC;
    }

    /**
     * 设置mNetPriceAC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMNetPriceAC(BigDecimal value) {
        this.mNetPriceAC = value;
    }

    /**
     * 获取msobAccountDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMSOBAccountDate() {
        return msobAccountDate;
    }

    /**
     * 设置msobAccountDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMSOBAccountDate(XMLGregorianCalendar value) {
        this.msobAccountDate = value;
    }

    /**
     * 获取mShipInstalmentRecTerms属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUFIDAU9SMShipShipInstalmentRecTermData }{@code >}
     *     
     */
    public JAXBElement<ArrayOfUFIDAU9SMShipShipInstalmentRecTermData> getMShipInstalmentRecTerms() {
        return mShipInstalmentRecTerms;
    }

    /**
     * 设置mShipInstalmentRecTerms属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUFIDAU9SMShipShipInstalmentRecTermData }{@code >}
     *     
     */
    public void setMShipInstalmentRecTerms(JAXBElement<ArrayOfUFIDAU9SMShipShipInstalmentRecTermData> value) {
        this.mShipInstalmentRecTerms = value;
    }

    /**
     * 获取mShipLine属性的值。
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
     * 设置mShipLine属性的值。
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
     * 获取mShipPlanQtyPU属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMShipPlanQtyPU() {
        return mShipPlanQtyPU;
    }

    /**
     * 设置mShipPlanQtyPU属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMShipPlanQtyPU(BigDecimal value) {
        this.mShipPlanQtyPU = value;
    }

    /**
     * 获取mShipPlanQtyTBU属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMShipPlanQtyTBU() {
        return mShipPlanQtyTBU;
    }

    /**
     * 设置mShipPlanQtyTBU属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMShipPlanQtyTBU(BigDecimal value) {
        this.mShipPlanQtyTBU = value;
    }

    /**
     * 获取mShipPlanQtyTU属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMShipPlanQtyTU() {
        return mShipPlanQtyTU;
    }

    /**
     * 设置mShipPlanQtyTU属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMShipPlanQtyTU(BigDecimal value) {
        this.mShipPlanQtyTU = value;
    }

    /**
     * 获取mSrcLineID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMSrcLineID() {
        return mSrcLineID;
    }

    /**
     * 设置mSrcLineID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMSrcLineID(Long value) {
        this.mSrcLineID = value;
    }

    /**
     * 获取mSumConfirmQtyPU属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMSumConfirmQtyPU() {
        return mSumConfirmQtyPU;
    }

    /**
     * 设置mSumConfirmQtyPU属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMSumConfirmQtyPU(BigDecimal value) {
        this.mSumConfirmQtyPU = value;
    }

    /**
     * 获取mSumConfirmQtyTBU属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMSumConfirmQtyTBU() {
        return mSumConfirmQtyTBU;
    }

    /**
     * 设置mSumConfirmQtyTBU属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMSumConfirmQtyTBU(BigDecimal value) {
        this.mSumConfirmQtyTBU = value;
    }

    /**
     * 获取mSumConfirmQtyTU属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMSumConfirmQtyTU() {
        return mSumConfirmQtyTU;
    }

    /**
     * 设置mSumConfirmQtyTU属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMSumConfirmQtyTU(BigDecimal value) {
        this.mSumConfirmQtyTU = value;
    }

    /**
     * 获取mSumConfirmTotalMoneyAC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMSumConfirmTotalMoneyAC() {
        return mSumConfirmTotalMoneyAC;
    }

    /**
     * 设置mSumConfirmTotalMoneyAC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMSumConfirmTotalMoneyAC(BigDecimal value) {
        this.mSumConfirmTotalMoneyAC = value;
    }

    /**
     * 获取mSumReceiveQtyPU属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMSumReceiveQtyPU() {
        return mSumReceiveQtyPU;
    }

    /**
     * 设置mSumReceiveQtyPU属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMSumReceiveQtyPU(BigDecimal value) {
        this.mSumReceiveQtyPU = value;
    }

    /**
     * 获取mSumReceiveQtyTBU属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMSumReceiveQtyTBU() {
        return mSumReceiveQtyTBU;
    }

    /**
     * 设置mSumReceiveQtyTBU属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMSumReceiveQtyTBU(BigDecimal value) {
        this.mSumReceiveQtyTBU = value;
    }

    /**
     * 获取mSumReceiveQtyTU属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMSumReceiveQtyTU() {
        return mSumReceiveQtyTU;
    }

    /**
     * 设置mSumReceiveQtyTU属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMSumReceiveQtyTU(BigDecimal value) {
        this.mSumReceiveQtyTU = value;
    }

    /**
     * 获取mSumReceiveTotalMoneyAC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMSumReceiveTotalMoneyAC() {
        return mSumReceiveTotalMoneyAC;
    }

    /**
     * 设置mSumReceiveTotalMoneyAC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMSumReceiveTotalMoneyAC(BigDecimal value) {
        this.mSumReceiveTotalMoneyAC = value;
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
     * 获取mTaxDetails属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUFIDAU9SMShipShipTaxData }{@code >}
     *     
     */
    public JAXBElement<ArrayOfUFIDAU9SMShipShipTaxData> getMTaxDetails() {
        return mTaxDetails;
    }

    /**
     * 设置mTaxDetails属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUFIDAU9SMShipShipTaxData }{@code >}
     *     
     */
    public void setMTaxDetails(JAXBElement<ArrayOfUFIDAU9SMShipShipTaxData> value) {
        this.mTaxDetails = value;
    }

    /**
     * 获取mTaxMoneyAC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMTaxMoneyAC() {
        return mTaxMoneyAC;
    }

    /**
     * 设置mTaxMoneyAC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMTaxMoneyAC(BigDecimal value) {
        this.mTaxMoneyAC = value;
    }

    /**
     * 获取mTaxPriceAC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMTaxPriceAC() {
        return mTaxPriceAC;
    }

    /**
     * 设置mTaxPriceAC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMTaxPriceAC(BigDecimal value) {
        this.mTaxPriceAC = value;
    }

    /**
     * 获取mTermLineNO属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMTermLineNO() {
        return mTermLineNO;
    }

    /**
     * 设置mTermLineNO属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMTermLineNO(Integer value) {
        this.mTermLineNO = value;
    }

    /**
     * 获取mTotalMoneyAC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMTotalMoneyAC() {
        return mTotalMoneyAC;
    }

    /**
     * 设置mTotalMoneyAC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMTotalMoneyAC(BigDecimal value) {
        this.mTotalMoneyAC = value;
    }

}
