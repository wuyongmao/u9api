
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
 * &lt;p&gt;UFIDA.U9.SM.Ship.ShipInstalmentRecTermData complex type的 Java 类。
 * 
 * &lt;p&gt;以下模式片段指定包含在此类中的预期内容。
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="UFIDA.U9.SM.Ship.ShipInstalmentRecTermData"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://www.UFIDA.org/EntityData}UFSoft.UBF.Business.DataTransObjectBase"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="MaxARPeriod" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="MaxARPeriod_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ShipInstalmentTerm_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_arTermLineNO" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_confirmBase" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_createdBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_createdOn" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_descFlexField" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.Base.FlexField.DescFlexField.DescFlexSegmentsData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_iD" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isAbsoluteMoney" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_maturityDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_maturityType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_memo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_modifiedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_modifiedOn" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_netMoneyAC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_recMoney" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_recPercent" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_receiveQtyPU" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_receiveQtyTBU" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_receiveQtyTU" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_shipInstalmentTerm" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.SM.Ship.ShipInstalmentTermData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_srcLineID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_srcSORecTermID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_sumConfirmQtyPU" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_sumConfirmQtyTBU" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_sumConfirmQtyTU" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_sumConfirmTotalMoneyAC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_sumReceiveQtyPU" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_sumReceiveQtyTBU" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_sumReceiveQtyTU" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_sumReceiveTotalMoneyAC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_sysVersion" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_taxMoneyAC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
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
@XmlType(name = "UFIDA.U9.SM.Ship.ShipInstalmentRecTermData", propOrder = {
    "maxARPeriod",
    "maxARPeriodSKey",
    "shipInstalmentTermSKey",
    "mArTermLineNO",
    "mConfirmBase",
    "mCreatedBy",
    "mCreatedOn",
    "mDescFlexField",
    "mid",
    "mIsAbsoluteMoney",
    "mMaturityDate",
    "mMaturityType",
    "mMemo",
    "mModifiedBy",
    "mModifiedOn",
    "mNetMoneyAC",
    "mRecMoney",
    "mRecPercent",
    "mReceiveQtyPU",
    "mReceiveQtyTBU",
    "mReceiveQtyTU",
    "mShipInstalmentTerm",
    "mSrcLineID",
    "mSrcSORecTermID",
    "mSumConfirmQtyPU",
    "mSumConfirmQtyTBU",
    "mSumConfirmQtyTU",
    "mSumConfirmTotalMoneyAC",
    "mSumReceiveQtyPU",
    "mSumReceiveQtyTBU",
    "mSumReceiveQtyTU",
    "mSumReceiveTotalMoneyAC",
    "mSysVersion",
    "mTaxMoneyAC",
    "mTermLineNO",
    "mTotalMoneyAC"
})
public class UFIDAU9SMShipShipInstalmentRecTermData
    extends UFSoftUBFBusinessDataTransObjectBase
{

    @XmlElement(name = "MaxARPeriod")
    protected Long maxARPeriod;
    @XmlElementRef(name = "MaxARPeriod_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> maxARPeriodSKey;
    @XmlElementRef(name = "ShipInstalmentTerm_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> shipInstalmentTermSKey;
    @XmlElement(name = "m_arTermLineNO")
    protected Integer mArTermLineNO;
    @XmlElement(name = "m_confirmBase")
    protected Integer mConfirmBase;
    @XmlElementRef(name = "m_createdBy", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mCreatedBy;
    @XmlElement(name = "m_createdOn")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mCreatedOn;
    @XmlElementRef(name = "m_descFlexField", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9BaseFlexFieldDescFlexFieldDescFlexSegmentsData> mDescFlexField;
    @XmlElement(name = "m_iD")
    protected Long mid;
    @XmlElement(name = "m_isAbsoluteMoney")
    protected Boolean mIsAbsoluteMoney;
    @XmlElement(name = "m_maturityDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mMaturityDate;
    @XmlElement(name = "m_maturityType")
    protected Integer mMaturityType;
    @XmlElementRef(name = "m_memo", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mMemo;
    @XmlElementRef(name = "m_modifiedBy", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mModifiedBy;
    @XmlElement(name = "m_modifiedOn")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mModifiedOn;
    @XmlElement(name = "m_netMoneyAC")
    protected BigDecimal mNetMoneyAC;
    @XmlElement(name = "m_recMoney")
    protected BigDecimal mRecMoney;
    @XmlElement(name = "m_recPercent")
    protected BigDecimal mRecPercent;
    @XmlElement(name = "m_receiveQtyPU")
    protected BigDecimal mReceiveQtyPU;
    @XmlElement(name = "m_receiveQtyTBU")
    protected BigDecimal mReceiveQtyTBU;
    @XmlElement(name = "m_receiveQtyTU")
    protected BigDecimal mReceiveQtyTU;
    @XmlElementRef(name = "m_shipInstalmentTerm", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9SMShipShipInstalmentTermData> mShipInstalmentTerm;
    @XmlElement(name = "m_srcLineID")
    protected Long mSrcLineID;
    @XmlElement(name = "m_srcSORecTermID")
    protected Long mSrcSORecTermID;
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
    @XmlElement(name = "m_taxMoneyAC")
    protected BigDecimal mTaxMoneyAC;
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
     * 获取shipInstalmentTermSKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getShipInstalmentTermSKey() {
        return shipInstalmentTermSKey;
    }

    /**
     * 设置shipInstalmentTermSKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setShipInstalmentTermSKey(JAXBElement<EntityKey> value) {
        this.shipInstalmentTermSKey = value;
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
     * 获取mConfirmBase属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMConfirmBase() {
        return mConfirmBase;
    }

    /**
     * 设置mConfirmBase属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMConfirmBase(Integer value) {
        this.mConfirmBase = value;
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
     * 获取mMaturityType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMMaturityType() {
        return mMaturityType;
    }

    /**
     * 设置mMaturityType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMMaturityType(Integer value) {
        this.mMaturityType = value;
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
     * 获取mRecMoney属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMRecMoney() {
        return mRecMoney;
    }

    /**
     * 设置mRecMoney属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMRecMoney(BigDecimal value) {
        this.mRecMoney = value;
    }

    /**
     * 获取mRecPercent属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMRecPercent() {
        return mRecPercent;
    }

    /**
     * 设置mRecPercent属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMRecPercent(BigDecimal value) {
        this.mRecPercent = value;
    }

    /**
     * 获取mReceiveQtyPU属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMReceiveQtyPU() {
        return mReceiveQtyPU;
    }

    /**
     * 设置mReceiveQtyPU属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMReceiveQtyPU(BigDecimal value) {
        this.mReceiveQtyPU = value;
    }

    /**
     * 获取mReceiveQtyTBU属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMReceiveQtyTBU() {
        return mReceiveQtyTBU;
    }

    /**
     * 设置mReceiveQtyTBU属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMReceiveQtyTBU(BigDecimal value) {
        this.mReceiveQtyTBU = value;
    }

    /**
     * 获取mReceiveQtyTU属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMReceiveQtyTU() {
        return mReceiveQtyTU;
    }

    /**
     * 设置mReceiveQtyTU属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMReceiveQtyTU(BigDecimal value) {
        this.mReceiveQtyTU = value;
    }

    /**
     * 获取mShipInstalmentTerm属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9SMShipShipInstalmentTermData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9SMShipShipInstalmentTermData> getMShipInstalmentTerm() {
        return mShipInstalmentTerm;
    }

    /**
     * 设置mShipInstalmentTerm属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9SMShipShipInstalmentTermData }{@code >}
     *     
     */
    public void setMShipInstalmentTerm(JAXBElement<UFIDAU9SMShipShipInstalmentTermData> value) {
        this.mShipInstalmentTerm = value;
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
     * 获取mSrcSORecTermID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMSrcSORecTermID() {
        return mSrcSORecTermID;
    }

    /**
     * 设置mSrcSORecTermID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMSrcSORecTermID(Long value) {
        this.mSrcSORecTermID = value;
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
