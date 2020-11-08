
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


/**
 * &lt;p&gt;UFIDA.U9.ISV.RCV.DTO.OBARcvLineCostDTOData complex type�� Java �ࡣ
 * 
 * &lt;p&gt;����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="UFIDA.U9.ISV.RCV.DTO.OBARcvLineCostDTOData"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://www.UFIDA.org/EntityData}UFSoft.UBF.Business.DataTransObjectBase"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="m_aCToFCRate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_costField" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CBO.MFG.CO.CostFieldData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_costType" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CBO.MFG.CO.CostTypeData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_createdBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_createdOn" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_currency" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.Base.Currency.CurrencyData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_currentOrg" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.Base.Organization.OrganizationData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_feeTaxMny" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_iD" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isAccCostType" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isMainCostField" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_machineCost" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_manualCost" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_materialCost" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_mfcCost" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_modifiedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_modifiedOn" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_money" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_pirce" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_purCost" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_rcvCostFeeLine" type="{http://www.UFIDA.org/EntityData}ArrayOfUFIDA.U9.ISV.RCV.DTO.OBARcvCostFeeLineDTOData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_rcvCostTaxLine" type="{http://www.UFIDA.org/EntityData}ArrayOfUFIDA.U9.ISV.RCV.DTO.OBARcvCostTaxLineDTOData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_rcvLine" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.PM.Rcv.RcvLineData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_sOB" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.Base.SOB.SetofBooksData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_stdMachineCost" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_stdManualCost" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_stdMaterialCost" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_stdMfcCost" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_stdMoney" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_stdNxtMachineCost" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_stdNxtManual" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_stdNxtMaterialCost" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_stdNxtMfcCost" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_stdNxtPurCost" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_stdNxtSubContractCost" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_stdPrice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_stdPurCost" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_stdSubContractCost" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_subContractCost" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_sysVersion" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_taxMny" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_totalMatchedFeeTax" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_totalMatchedNetFee" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_totalMatchedNetMny" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_totalMatchedTaxMny" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_totalNetFee" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_totalNetMny" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UFIDA.U9.ISV.RCV.DTO.OBARcvLineCostDTOData", propOrder = {
    "macToFCRate",
    "mCostField",
    "mCostType",
    "mCreatedBy",
    "mCreatedOn",
    "mCurrency",
    "mCurrentOrg",
    "mFeeTaxMny",
    "mid",
    "mIsAccCostType",
    "mIsMainCostField",
    "mMachineCost",
    "mManualCost",
    "mMaterialCost",
    "mMfcCost",
    "mModifiedBy",
    "mModifiedOn",
    "mMoney",
    "mPirce",
    "mPurCost",
    "mRcvCostFeeLine",
    "mRcvCostTaxLine",
    "mRcvLine",
    "msob",
    "mStdMachineCost",
    "mStdManualCost",
    "mStdMaterialCost",
    "mStdMfcCost",
    "mStdMoney",
    "mStdNxtMachineCost",
    "mStdNxtManual",
    "mStdNxtMaterialCost",
    "mStdNxtMfcCost",
    "mStdNxtPurCost",
    "mStdNxtSubContractCost",
    "mStdPrice",
    "mStdPurCost",
    "mStdSubContractCost",
    "mSubContractCost",
    "mSysVersion",
    "mTaxMny",
    "mTotalMatchedFeeTax",
    "mTotalMatchedNetFee",
    "mTotalMatchedNetMny",
    "mTotalMatchedTaxMny",
    "mTotalNetFee",
    "mTotalNetMny"
})
public class UFIDAU9ISVRCVDTOOBARcvLineCostDTOData
    extends UFSoftUBFBusinessDataTransObjectBase
{

    @XmlElement(name = "m_aCToFCRate")
    protected BigDecimal macToFCRate;
    @XmlElementRef(name = "m_costField", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9CBOMFGCOCostFieldData> mCostField;
    @XmlElementRef(name = "m_costType", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9CBOMFGCOCostTypeData> mCostType;
    @XmlElementRef(name = "m_createdBy", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mCreatedBy;
    @XmlElement(name = "m_createdOn")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mCreatedOn;
    @XmlElementRef(name = "m_currency", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9BaseCurrencyCurrencyData> mCurrency;
    @XmlElementRef(name = "m_currentOrg", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9BaseOrganizationOrganizationData> mCurrentOrg;
    @XmlElement(name = "m_feeTaxMny")
    protected BigDecimal mFeeTaxMny;
    @XmlElement(name = "m_iD")
    protected Long mid;
    @XmlElement(name = "m_isAccCostType")
    protected Boolean mIsAccCostType;
    @XmlElement(name = "m_isMainCostField")
    protected Boolean mIsMainCostField;
    @XmlElement(name = "m_machineCost")
    protected BigDecimal mMachineCost;
    @XmlElement(name = "m_manualCost")
    protected BigDecimal mManualCost;
    @XmlElement(name = "m_materialCost")
    protected BigDecimal mMaterialCost;
    @XmlElement(name = "m_mfcCost")
    protected BigDecimal mMfcCost;
    @XmlElementRef(name = "m_modifiedBy", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mModifiedBy;
    @XmlElement(name = "m_modifiedOn")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mModifiedOn;
    @XmlElement(name = "m_money")
    protected BigDecimal mMoney;
    @XmlElement(name = "m_pirce")
    protected BigDecimal mPirce;
    @XmlElement(name = "m_purCost")
    protected BigDecimal mPurCost;
    @XmlElementRef(name = "m_rcvCostFeeLine", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfUFIDAU9ISVRCVDTOOBARcvCostFeeLineDTOData> mRcvCostFeeLine;
    @XmlElementRef(name = "m_rcvCostTaxLine", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfUFIDAU9ISVRCVDTOOBARcvCostTaxLineDTOData> mRcvCostTaxLine;
    @XmlElementRef(name = "m_rcvLine", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9PMRcvRcvLineData> mRcvLine;
    @XmlElementRef(name = "m_sOB", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9BaseSOBSetofBooksData> msob;
    @XmlElement(name = "m_stdMachineCost")
    protected BigDecimal mStdMachineCost;
    @XmlElement(name = "m_stdManualCost")
    protected BigDecimal mStdManualCost;
    @XmlElement(name = "m_stdMaterialCost")
    protected BigDecimal mStdMaterialCost;
    @XmlElement(name = "m_stdMfcCost")
    protected BigDecimal mStdMfcCost;
    @XmlElement(name = "m_stdMoney")
    protected BigDecimal mStdMoney;
    @XmlElement(name = "m_stdNxtMachineCost")
    protected BigDecimal mStdNxtMachineCost;
    @XmlElement(name = "m_stdNxtManual")
    protected BigDecimal mStdNxtManual;
    @XmlElement(name = "m_stdNxtMaterialCost")
    protected BigDecimal mStdNxtMaterialCost;
    @XmlElement(name = "m_stdNxtMfcCost")
    protected BigDecimal mStdNxtMfcCost;
    @XmlElement(name = "m_stdNxtPurCost")
    protected BigDecimal mStdNxtPurCost;
    @XmlElement(name = "m_stdNxtSubContractCost")
    protected BigDecimal mStdNxtSubContractCost;
    @XmlElement(name = "m_stdPrice")
    protected BigDecimal mStdPrice;
    @XmlElement(name = "m_stdPurCost")
    protected BigDecimal mStdPurCost;
    @XmlElement(name = "m_stdSubContractCost")
    protected BigDecimal mStdSubContractCost;
    @XmlElement(name = "m_subContractCost")
    protected BigDecimal mSubContractCost;
    @XmlElement(name = "m_sysVersion")
    protected Long mSysVersion;
    @XmlElement(name = "m_taxMny")
    protected BigDecimal mTaxMny;
    @XmlElement(name = "m_totalMatchedFeeTax")
    protected BigDecimal mTotalMatchedFeeTax;
    @XmlElement(name = "m_totalMatchedNetFee")
    protected BigDecimal mTotalMatchedNetFee;
    @XmlElement(name = "m_totalMatchedNetMny")
    protected BigDecimal mTotalMatchedNetMny;
    @XmlElement(name = "m_totalMatchedTaxMny")
    protected BigDecimal mTotalMatchedTaxMny;
    @XmlElement(name = "m_totalNetFee")
    protected BigDecimal mTotalNetFee;
    @XmlElement(name = "m_totalNetMny")
    protected BigDecimal mTotalNetMny;

    /**
     * ��ȡmacToFCRate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMACToFCRate() {
        return macToFCRate;
    }

    /**
     * ����macToFCRate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMACToFCRate(BigDecimal value) {
        this.macToFCRate = value;
    }

    /**
     * ��ȡmCostField���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOMFGCOCostFieldData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9CBOMFGCOCostFieldData> getMCostField() {
        return mCostField;
    }

    /**
     * ����mCostField���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOMFGCOCostFieldData }{@code >}
     *     
     */
    public void setMCostField(JAXBElement<UFIDAU9CBOMFGCOCostFieldData> value) {
        this.mCostField = value;
    }

    /**
     * ��ȡmCostType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOMFGCOCostTypeData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9CBOMFGCOCostTypeData> getMCostType() {
        return mCostType;
    }

    /**
     * ����mCostType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOMFGCOCostTypeData }{@code >}
     *     
     */
    public void setMCostType(JAXBElement<UFIDAU9CBOMFGCOCostTypeData> value) {
        this.mCostType = value;
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
     * ��ȡmCurrency���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9BaseCurrencyCurrencyData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9BaseCurrencyCurrencyData> getMCurrency() {
        return mCurrency;
    }

    /**
     * ����mCurrency���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9BaseCurrencyCurrencyData }{@code >}
     *     
     */
    public void setMCurrency(JAXBElement<UFIDAU9BaseCurrencyCurrencyData> value) {
        this.mCurrency = value;
    }

    /**
     * ��ȡmCurrentOrg���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9BaseOrganizationOrganizationData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9BaseOrganizationOrganizationData> getMCurrentOrg() {
        return mCurrentOrg;
    }

    /**
     * ����mCurrentOrg���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9BaseOrganizationOrganizationData }{@code >}
     *     
     */
    public void setMCurrentOrg(JAXBElement<UFIDAU9BaseOrganizationOrganizationData> value) {
        this.mCurrentOrg = value;
    }

    /**
     * ��ȡmFeeTaxMny���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMFeeTaxMny() {
        return mFeeTaxMny;
    }

    /**
     * ����mFeeTaxMny���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMFeeTaxMny(BigDecimal value) {
        this.mFeeTaxMny = value;
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
     * ��ȡmMachineCost���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMMachineCost() {
        return mMachineCost;
    }

    /**
     * ����mMachineCost���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMMachineCost(BigDecimal value) {
        this.mMachineCost = value;
    }

    /**
     * ��ȡmManualCost���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMManualCost() {
        return mManualCost;
    }

    /**
     * ����mManualCost���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMManualCost(BigDecimal value) {
        this.mManualCost = value;
    }

    /**
     * ��ȡmMaterialCost���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMMaterialCost() {
        return mMaterialCost;
    }

    /**
     * ����mMaterialCost���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMMaterialCost(BigDecimal value) {
        this.mMaterialCost = value;
    }

    /**
     * ��ȡmMfcCost���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMMfcCost() {
        return mMfcCost;
    }

    /**
     * ����mMfcCost���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMMfcCost(BigDecimal value) {
        this.mMfcCost = value;
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
     * ��ȡmMoney���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMMoney() {
        return mMoney;
    }

    /**
     * ����mMoney���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMMoney(BigDecimal value) {
        this.mMoney = value;
    }

    /**
     * ��ȡmPirce���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMPirce() {
        return mPirce;
    }

    /**
     * ����mPirce���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMPirce(BigDecimal value) {
        this.mPirce = value;
    }

    /**
     * ��ȡmPurCost���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMPurCost() {
        return mPurCost;
    }

    /**
     * ����mPurCost���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMPurCost(BigDecimal value) {
        this.mPurCost = value;
    }

    /**
     * ��ȡmRcvCostFeeLine���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUFIDAU9ISVRCVDTOOBARcvCostFeeLineDTOData }{@code >}
     *     
     */
    public JAXBElement<ArrayOfUFIDAU9ISVRCVDTOOBARcvCostFeeLineDTOData> getMRcvCostFeeLine() {
        return mRcvCostFeeLine;
    }

    /**
     * ����mRcvCostFeeLine���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUFIDAU9ISVRCVDTOOBARcvCostFeeLineDTOData }{@code >}
     *     
     */
    public void setMRcvCostFeeLine(JAXBElement<ArrayOfUFIDAU9ISVRCVDTOOBARcvCostFeeLineDTOData> value) {
        this.mRcvCostFeeLine = value;
    }

    /**
     * ��ȡmRcvCostTaxLine���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUFIDAU9ISVRCVDTOOBARcvCostTaxLineDTOData }{@code >}
     *     
     */
    public JAXBElement<ArrayOfUFIDAU9ISVRCVDTOOBARcvCostTaxLineDTOData> getMRcvCostTaxLine() {
        return mRcvCostTaxLine;
    }

    /**
     * ����mRcvCostTaxLine���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUFIDAU9ISVRCVDTOOBARcvCostTaxLineDTOData }{@code >}
     *     
     */
    public void setMRcvCostTaxLine(JAXBElement<ArrayOfUFIDAU9ISVRCVDTOOBARcvCostTaxLineDTOData> value) {
        this.mRcvCostTaxLine = value;
    }

    /**
     * ��ȡmRcvLine���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9PMRcvRcvLineData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9PMRcvRcvLineData> getMRcvLine() {
        return mRcvLine;
    }

    /**
     * ����mRcvLine���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9PMRcvRcvLineData }{@code >}
     *     
     */
    public void setMRcvLine(JAXBElement<UFIDAU9PMRcvRcvLineData> value) {
        this.mRcvLine = value;
    }

    /**
     * ��ȡmsob���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9BaseSOBSetofBooksData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9BaseSOBSetofBooksData> getMSOB() {
        return msob;
    }

    /**
     * ����msob���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9BaseSOBSetofBooksData }{@code >}
     *     
     */
    public void setMSOB(JAXBElement<UFIDAU9BaseSOBSetofBooksData> value) {
        this.msob = value;
    }

    /**
     * ��ȡmStdMachineCost���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMStdMachineCost() {
        return mStdMachineCost;
    }

    /**
     * ����mStdMachineCost���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMStdMachineCost(BigDecimal value) {
        this.mStdMachineCost = value;
    }

    /**
     * ��ȡmStdManualCost���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMStdManualCost() {
        return mStdManualCost;
    }

    /**
     * ����mStdManualCost���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMStdManualCost(BigDecimal value) {
        this.mStdManualCost = value;
    }

    /**
     * ��ȡmStdMaterialCost���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMStdMaterialCost() {
        return mStdMaterialCost;
    }

    /**
     * ����mStdMaterialCost���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMStdMaterialCost(BigDecimal value) {
        this.mStdMaterialCost = value;
    }

    /**
     * ��ȡmStdMfcCost���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMStdMfcCost() {
        return mStdMfcCost;
    }

    /**
     * ����mStdMfcCost���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMStdMfcCost(BigDecimal value) {
        this.mStdMfcCost = value;
    }

    /**
     * ��ȡmStdMoney���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMStdMoney() {
        return mStdMoney;
    }

    /**
     * ����mStdMoney���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMStdMoney(BigDecimal value) {
        this.mStdMoney = value;
    }

    /**
     * ��ȡmStdNxtMachineCost���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMStdNxtMachineCost() {
        return mStdNxtMachineCost;
    }

    /**
     * ����mStdNxtMachineCost���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMStdNxtMachineCost(BigDecimal value) {
        this.mStdNxtMachineCost = value;
    }

    /**
     * ��ȡmStdNxtManual���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMStdNxtManual() {
        return mStdNxtManual;
    }

    /**
     * ����mStdNxtManual���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMStdNxtManual(BigDecimal value) {
        this.mStdNxtManual = value;
    }

    /**
     * ��ȡmStdNxtMaterialCost���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMStdNxtMaterialCost() {
        return mStdNxtMaterialCost;
    }

    /**
     * ����mStdNxtMaterialCost���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMStdNxtMaterialCost(BigDecimal value) {
        this.mStdNxtMaterialCost = value;
    }

    /**
     * ��ȡmStdNxtMfcCost���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMStdNxtMfcCost() {
        return mStdNxtMfcCost;
    }

    /**
     * ����mStdNxtMfcCost���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMStdNxtMfcCost(BigDecimal value) {
        this.mStdNxtMfcCost = value;
    }

    /**
     * ��ȡmStdNxtPurCost���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMStdNxtPurCost() {
        return mStdNxtPurCost;
    }

    /**
     * ����mStdNxtPurCost���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMStdNxtPurCost(BigDecimal value) {
        this.mStdNxtPurCost = value;
    }

    /**
     * ��ȡmStdNxtSubContractCost���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMStdNxtSubContractCost() {
        return mStdNxtSubContractCost;
    }

    /**
     * ����mStdNxtSubContractCost���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMStdNxtSubContractCost(BigDecimal value) {
        this.mStdNxtSubContractCost = value;
    }

    /**
     * ��ȡmStdPrice���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMStdPrice() {
        return mStdPrice;
    }

    /**
     * ����mStdPrice���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMStdPrice(BigDecimal value) {
        this.mStdPrice = value;
    }

    /**
     * ��ȡmStdPurCost���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMStdPurCost() {
        return mStdPurCost;
    }

    /**
     * ����mStdPurCost���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMStdPurCost(BigDecimal value) {
        this.mStdPurCost = value;
    }

    /**
     * ��ȡmStdSubContractCost���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMStdSubContractCost() {
        return mStdSubContractCost;
    }

    /**
     * ����mStdSubContractCost���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMStdSubContractCost(BigDecimal value) {
        this.mStdSubContractCost = value;
    }

    /**
     * ��ȡmSubContractCost���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMSubContractCost() {
        return mSubContractCost;
    }

    /**
     * ����mSubContractCost���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMSubContractCost(BigDecimal value) {
        this.mSubContractCost = value;
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
     * ��ȡmTaxMny���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMTaxMny() {
        return mTaxMny;
    }

    /**
     * ����mTaxMny���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMTaxMny(BigDecimal value) {
        this.mTaxMny = value;
    }

    /**
     * ��ȡmTotalMatchedFeeTax���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMTotalMatchedFeeTax() {
        return mTotalMatchedFeeTax;
    }

    /**
     * ����mTotalMatchedFeeTax���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMTotalMatchedFeeTax(BigDecimal value) {
        this.mTotalMatchedFeeTax = value;
    }

    /**
     * ��ȡmTotalMatchedNetFee���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMTotalMatchedNetFee() {
        return mTotalMatchedNetFee;
    }

    /**
     * ����mTotalMatchedNetFee���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMTotalMatchedNetFee(BigDecimal value) {
        this.mTotalMatchedNetFee = value;
    }

    /**
     * ��ȡmTotalMatchedNetMny���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMTotalMatchedNetMny() {
        return mTotalMatchedNetMny;
    }

    /**
     * ����mTotalMatchedNetMny���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMTotalMatchedNetMny(BigDecimal value) {
        this.mTotalMatchedNetMny = value;
    }

    /**
     * ��ȡmTotalMatchedTaxMny���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMTotalMatchedTaxMny() {
        return mTotalMatchedTaxMny;
    }

    /**
     * ����mTotalMatchedTaxMny���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMTotalMatchedTaxMny(BigDecimal value) {
        this.mTotalMatchedTaxMny = value;
    }

    /**
     * ��ȡmTotalNetFee���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMTotalNetFee() {
        return mTotalNetFee;
    }

    /**
     * ����mTotalNetFee���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMTotalNetFee(BigDecimal value) {
        this.mTotalNetFee = value;
    }

    /**
     * ��ȡmTotalNetMny���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMTotalNetMny() {
        return mTotalNetMny;
    }

    /**
     * ����mTotalNetMny���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMTotalNetMny(BigDecimal value) {
        this.mTotalNetMny = value;
    }

}
