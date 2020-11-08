
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
 * &lt;p&gt;UFIDA.U9.SM.Ship.ShipInstalmentRecTermData complex type�� Java �ࡣ
 * 
 * &lt;p&gt;����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡmaxARPeriod���Ե�ֵ��
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
     * ����maxARPeriod���Ե�ֵ��
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
     * ��ȡmaxARPeriodSKey���Ե�ֵ��
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
     * ����maxARPeriodSKey���Ե�ֵ��
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
     * ��ȡshipInstalmentTermSKey���Ե�ֵ��
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
     * ����shipInstalmentTermSKey���Ե�ֵ��
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
     * ��ȡmArTermLineNO���Ե�ֵ��
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
     * ����mArTermLineNO���Ե�ֵ��
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
     * ��ȡmConfirmBase���Ե�ֵ��
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
     * ����mConfirmBase���Ե�ֵ��
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
     * ��ȡmIsAbsoluteMoney���Ե�ֵ��
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
     * ����mIsAbsoluteMoney���Ե�ֵ��
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
     * ��ȡmMaturityDate���Ե�ֵ��
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
     * ����mMaturityDate���Ե�ֵ��
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
     * ��ȡmMaturityType���Ե�ֵ��
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
     * ����mMaturityType���Ե�ֵ��
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
     * ��ȡmMemo���Ե�ֵ��
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
     * ����mMemo���Ե�ֵ��
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
     * ��ȡmNetMoneyAC���Ե�ֵ��
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
     * ����mNetMoneyAC���Ե�ֵ��
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
     * ��ȡmRecMoney���Ե�ֵ��
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
     * ����mRecMoney���Ե�ֵ��
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
     * ��ȡmRecPercent���Ե�ֵ��
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
     * ����mRecPercent���Ե�ֵ��
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
     * ��ȡmReceiveQtyPU���Ե�ֵ��
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
     * ����mReceiveQtyPU���Ե�ֵ��
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
     * ��ȡmReceiveQtyTBU���Ե�ֵ��
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
     * ����mReceiveQtyTBU���Ե�ֵ��
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
     * ��ȡmReceiveQtyTU���Ե�ֵ��
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
     * ����mReceiveQtyTU���Ե�ֵ��
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
     * ��ȡmShipInstalmentTerm���Ե�ֵ��
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
     * ����mShipInstalmentTerm���Ե�ֵ��
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
     * ��ȡmSrcLineID���Ե�ֵ��
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
     * ����mSrcLineID���Ե�ֵ��
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
     * ��ȡmSrcSORecTermID���Ե�ֵ��
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
     * ����mSrcSORecTermID���Ե�ֵ��
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
     * ��ȡmSumConfirmQtyPU���Ե�ֵ��
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
     * ����mSumConfirmQtyPU���Ե�ֵ��
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
     * ��ȡmSumConfirmQtyTBU���Ե�ֵ��
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
     * ����mSumConfirmQtyTBU���Ե�ֵ��
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
     * ��ȡmSumConfirmQtyTU���Ե�ֵ��
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
     * ����mSumConfirmQtyTU���Ե�ֵ��
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
     * ��ȡmSumConfirmTotalMoneyAC���Ե�ֵ��
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
     * ����mSumConfirmTotalMoneyAC���Ե�ֵ��
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
     * ��ȡmSumReceiveQtyPU���Ե�ֵ��
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
     * ����mSumReceiveQtyPU���Ե�ֵ��
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
     * ��ȡmSumReceiveQtyTBU���Ե�ֵ��
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
     * ����mSumReceiveQtyTBU���Ե�ֵ��
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
     * ��ȡmSumReceiveQtyTU���Ե�ֵ��
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
     * ����mSumReceiveQtyTU���Ե�ֵ��
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
     * ��ȡmSumReceiveTotalMoneyAC���Ե�ֵ��
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
     * ����mSumReceiveTotalMoneyAC���Ե�ֵ��
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
     * ��ȡmTaxMoneyAC���Ե�ֵ��
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
     * ����mTaxMoneyAC���Ե�ֵ��
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
     * ��ȡmTermLineNO���Ե�ֵ��
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
     * ����mTermLineNO���Ե�ֵ��
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
     * ��ȡmTotalMoneyAC���Ե�ֵ��
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
     * ����mTotalMoneyAC���Ե�ֵ��
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
