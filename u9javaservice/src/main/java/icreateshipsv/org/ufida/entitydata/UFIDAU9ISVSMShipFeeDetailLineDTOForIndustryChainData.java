
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


/**
 * &lt;p&gt;UFIDA.U9.ISV.SM.ShipFeeDetailLineDTOForIndustryChainData complex type的 Java 类。
 * 
 * &lt;p&gt;以下模式片段指定包含在此类中的预期内容。
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="UFIDA.U9.ISV.SM.ShipFeeDetailLineDTOForIndustryChainData"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://www.UFIDA.org/EntityData}UFSoft.UBF.Business.DataTransObjectBase"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="m_aPExpenseAC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_aPExpenseExTaxFC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_aPExpenseIncTaxAC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_aPExpenseIncTaxFC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_aPExpenseIncTaxTC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_aPExpenseTC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_aPTaxAC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_aPTaxFC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_aPTaxTC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_aRExpenseAC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_aRExpenseExTaxFC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_aRExpenseIncTaxAC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_aRExpenseIncTaxFC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_aRExpenseIncTaxTC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_aRExpenseTC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_aRTaxAC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_aRTaxFC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_aRTaxTC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_createdBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_createdOn" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_expectedExpenseExTaxAC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_expectedExpenseExTaxFC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_expectedExpenseExTaxTC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_expectedExpenseIncTaxAC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_expectedExpenseIncTaxFC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_expectedExpenseIncTaxTC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_expectedTaxAC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_expectedTaxFC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_expectedTaxTC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_feeAllotAC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_feeAllotFC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_feeAllotIncTaxAC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_feeAllotIncTaxFC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_feeAllotIncTaxTC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_feeAllotTC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_feeAllotTaxAC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_feeAllotTaxFC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_feeAllotTaxTC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_iD" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_modifiedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_modifiedOn" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_paidExpenseExTaxAC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_paidExpenseExTaxFC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_paidExpenseExTaxTC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_paidExpenseIncTaxAC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_paidExpenseIncTaxFC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_paidExpenseIncTaxTC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_paidTaxAC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_paidTaxFC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_paidTaxTC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_shipFeeDTO" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.ISV.SM.ShipFeeDTOForIndustryChainData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_shipFeeDTOForIndustryChain" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.ISV.SM.ShipFeeDTOForIndustryChainData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_sourceAllotQtyPU" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_sourceBillType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_sourceDocNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_sourceEntityID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_sourceFeeType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_subLineNO" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
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
@XmlType(name = "UFIDA.U9.ISV.SM.ShipFeeDetailLineDTOForIndustryChainData", propOrder = {
    "mapExpenseAC",
    "mapExpenseExTaxFC",
    "mapExpenseIncTaxAC",
    "mapExpenseIncTaxFC",
    "mapExpenseIncTaxTC",
    "mapExpenseTC",
    "mapTaxAC",
    "mapTaxFC",
    "mapTaxTC",
    "marExpenseAC",
    "marExpenseExTaxFC",
    "marExpenseIncTaxAC",
    "marExpenseIncTaxFC",
    "marExpenseIncTaxTC",
    "marExpenseTC",
    "marTaxAC",
    "marTaxFC",
    "marTaxTC",
    "mCreatedBy",
    "mCreatedOn",
    "mExpectedExpenseExTaxAC",
    "mExpectedExpenseExTaxFC",
    "mExpectedExpenseExTaxTC",
    "mExpectedExpenseIncTaxAC",
    "mExpectedExpenseIncTaxFC",
    "mExpectedExpenseIncTaxTC",
    "mExpectedTaxAC",
    "mExpectedTaxFC",
    "mExpectedTaxTC",
    "mFeeAllotAC",
    "mFeeAllotFC",
    "mFeeAllotIncTaxAC",
    "mFeeAllotIncTaxFC",
    "mFeeAllotIncTaxTC",
    "mFeeAllotTC",
    "mFeeAllotTaxAC",
    "mFeeAllotTaxFC",
    "mFeeAllotTaxTC",
    "mid",
    "mModifiedBy",
    "mModifiedOn",
    "mPaidExpenseExTaxAC",
    "mPaidExpenseExTaxFC",
    "mPaidExpenseExTaxTC",
    "mPaidExpenseIncTaxAC",
    "mPaidExpenseIncTaxFC",
    "mPaidExpenseIncTaxTC",
    "mPaidTaxAC",
    "mPaidTaxFC",
    "mPaidTaxTC",
    "mShipFeeDTO",
    "mShipFeeDTOForIndustryChain",
    "mSourceAllotQtyPU",
    "mSourceBillType",
    "mSourceDocNO",
    "mSourceEntityID",
    "mSourceFeeType",
    "mSubLineNO",
    "mSysVersion"
})
public class UFIDAU9ISVSMShipFeeDetailLineDTOForIndustryChainData
    extends UFSoftUBFBusinessDataTransObjectBase
{

    @XmlElement(name = "m_aPExpenseAC")
    protected BigDecimal mapExpenseAC;
    @XmlElement(name = "m_aPExpenseExTaxFC")
    protected BigDecimal mapExpenseExTaxFC;
    @XmlElement(name = "m_aPExpenseIncTaxAC")
    protected BigDecimal mapExpenseIncTaxAC;
    @XmlElement(name = "m_aPExpenseIncTaxFC")
    protected BigDecimal mapExpenseIncTaxFC;
    @XmlElement(name = "m_aPExpenseIncTaxTC")
    protected BigDecimal mapExpenseIncTaxTC;
    @XmlElement(name = "m_aPExpenseTC")
    protected BigDecimal mapExpenseTC;
    @XmlElement(name = "m_aPTaxAC")
    protected BigDecimal mapTaxAC;
    @XmlElement(name = "m_aPTaxFC")
    protected BigDecimal mapTaxFC;
    @XmlElement(name = "m_aPTaxTC")
    protected BigDecimal mapTaxTC;
    @XmlElement(name = "m_aRExpenseAC")
    protected BigDecimal marExpenseAC;
    @XmlElement(name = "m_aRExpenseExTaxFC")
    protected BigDecimal marExpenseExTaxFC;
    @XmlElement(name = "m_aRExpenseIncTaxAC")
    protected BigDecimal marExpenseIncTaxAC;
    @XmlElement(name = "m_aRExpenseIncTaxFC")
    protected BigDecimal marExpenseIncTaxFC;
    @XmlElement(name = "m_aRExpenseIncTaxTC")
    protected BigDecimal marExpenseIncTaxTC;
    @XmlElement(name = "m_aRExpenseTC")
    protected BigDecimal marExpenseTC;
    @XmlElement(name = "m_aRTaxAC")
    protected BigDecimal marTaxAC;
    @XmlElement(name = "m_aRTaxFC")
    protected BigDecimal marTaxFC;
    @XmlElement(name = "m_aRTaxTC")
    protected BigDecimal marTaxTC;
    @XmlElementRef(name = "m_createdBy", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mCreatedBy;
    @XmlElement(name = "m_createdOn")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mCreatedOn;
    @XmlElement(name = "m_expectedExpenseExTaxAC")
    protected BigDecimal mExpectedExpenseExTaxAC;
    @XmlElement(name = "m_expectedExpenseExTaxFC")
    protected BigDecimal mExpectedExpenseExTaxFC;
    @XmlElement(name = "m_expectedExpenseExTaxTC")
    protected BigDecimal mExpectedExpenseExTaxTC;
    @XmlElement(name = "m_expectedExpenseIncTaxAC")
    protected BigDecimal mExpectedExpenseIncTaxAC;
    @XmlElement(name = "m_expectedExpenseIncTaxFC")
    protected BigDecimal mExpectedExpenseIncTaxFC;
    @XmlElement(name = "m_expectedExpenseIncTaxTC")
    protected BigDecimal mExpectedExpenseIncTaxTC;
    @XmlElement(name = "m_expectedTaxAC")
    protected BigDecimal mExpectedTaxAC;
    @XmlElement(name = "m_expectedTaxFC")
    protected BigDecimal mExpectedTaxFC;
    @XmlElement(name = "m_expectedTaxTC")
    protected BigDecimal mExpectedTaxTC;
    @XmlElement(name = "m_feeAllotAC")
    protected BigDecimal mFeeAllotAC;
    @XmlElement(name = "m_feeAllotFC")
    protected BigDecimal mFeeAllotFC;
    @XmlElement(name = "m_feeAllotIncTaxAC")
    protected BigDecimal mFeeAllotIncTaxAC;
    @XmlElement(name = "m_feeAllotIncTaxFC")
    protected BigDecimal mFeeAllotIncTaxFC;
    @XmlElement(name = "m_feeAllotIncTaxTC")
    protected BigDecimal mFeeAllotIncTaxTC;
    @XmlElement(name = "m_feeAllotTC")
    protected BigDecimal mFeeAllotTC;
    @XmlElement(name = "m_feeAllotTaxAC")
    protected BigDecimal mFeeAllotTaxAC;
    @XmlElement(name = "m_feeAllotTaxFC")
    protected BigDecimal mFeeAllotTaxFC;
    @XmlElement(name = "m_feeAllotTaxTC")
    protected BigDecimal mFeeAllotTaxTC;
    @XmlElement(name = "m_iD")
    protected Long mid;
    @XmlElementRef(name = "m_modifiedBy", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mModifiedBy;
    @XmlElement(name = "m_modifiedOn")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mModifiedOn;
    @XmlElement(name = "m_paidExpenseExTaxAC")
    protected BigDecimal mPaidExpenseExTaxAC;
    @XmlElement(name = "m_paidExpenseExTaxFC")
    protected BigDecimal mPaidExpenseExTaxFC;
    @XmlElement(name = "m_paidExpenseExTaxTC")
    protected BigDecimal mPaidExpenseExTaxTC;
    @XmlElement(name = "m_paidExpenseIncTaxAC")
    protected BigDecimal mPaidExpenseIncTaxAC;
    @XmlElement(name = "m_paidExpenseIncTaxFC")
    protected BigDecimal mPaidExpenseIncTaxFC;
    @XmlElement(name = "m_paidExpenseIncTaxTC")
    protected BigDecimal mPaidExpenseIncTaxTC;
    @XmlElement(name = "m_paidTaxAC")
    protected BigDecimal mPaidTaxAC;
    @XmlElement(name = "m_paidTaxFC")
    protected BigDecimal mPaidTaxFC;
    @XmlElement(name = "m_paidTaxTC")
    protected BigDecimal mPaidTaxTC;
    @XmlElementRef(name = "m_shipFeeDTO", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9ISVSMShipFeeDTOForIndustryChainData> mShipFeeDTO;
    @XmlElementRef(name = "m_shipFeeDTOForIndustryChain", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9ISVSMShipFeeDTOForIndustryChainData> mShipFeeDTOForIndustryChain;
    @XmlElement(name = "m_sourceAllotQtyPU")
    protected BigDecimal mSourceAllotQtyPU;
    @XmlElement(name = "m_sourceBillType")
    protected Integer mSourceBillType;
    @XmlElementRef(name = "m_sourceDocNO", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mSourceDocNO;
    @XmlElement(name = "m_sourceEntityID")
    protected Long mSourceEntityID;
    @XmlElement(name = "m_sourceFeeType")
    protected Integer mSourceFeeType;
    @XmlElement(name = "m_subLineNO")
    protected Integer mSubLineNO;
    @XmlElement(name = "m_sysVersion")
    protected Long mSysVersion;

    /**
     * 获取mapExpenseAC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMAPExpenseAC() {
        return mapExpenseAC;
    }

    /**
     * 设置mapExpenseAC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMAPExpenseAC(BigDecimal value) {
        this.mapExpenseAC = value;
    }

    /**
     * 获取mapExpenseExTaxFC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMAPExpenseExTaxFC() {
        return mapExpenseExTaxFC;
    }

    /**
     * 设置mapExpenseExTaxFC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMAPExpenseExTaxFC(BigDecimal value) {
        this.mapExpenseExTaxFC = value;
    }

    /**
     * 获取mapExpenseIncTaxAC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMAPExpenseIncTaxAC() {
        return mapExpenseIncTaxAC;
    }

    /**
     * 设置mapExpenseIncTaxAC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMAPExpenseIncTaxAC(BigDecimal value) {
        this.mapExpenseIncTaxAC = value;
    }

    /**
     * 获取mapExpenseIncTaxFC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMAPExpenseIncTaxFC() {
        return mapExpenseIncTaxFC;
    }

    /**
     * 设置mapExpenseIncTaxFC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMAPExpenseIncTaxFC(BigDecimal value) {
        this.mapExpenseIncTaxFC = value;
    }

    /**
     * 获取mapExpenseIncTaxTC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMAPExpenseIncTaxTC() {
        return mapExpenseIncTaxTC;
    }

    /**
     * 设置mapExpenseIncTaxTC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMAPExpenseIncTaxTC(BigDecimal value) {
        this.mapExpenseIncTaxTC = value;
    }

    /**
     * 获取mapExpenseTC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMAPExpenseTC() {
        return mapExpenseTC;
    }

    /**
     * 设置mapExpenseTC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMAPExpenseTC(BigDecimal value) {
        this.mapExpenseTC = value;
    }

    /**
     * 获取mapTaxAC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMAPTaxAC() {
        return mapTaxAC;
    }

    /**
     * 设置mapTaxAC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMAPTaxAC(BigDecimal value) {
        this.mapTaxAC = value;
    }

    /**
     * 获取mapTaxFC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMAPTaxFC() {
        return mapTaxFC;
    }

    /**
     * 设置mapTaxFC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMAPTaxFC(BigDecimal value) {
        this.mapTaxFC = value;
    }

    /**
     * 获取mapTaxTC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMAPTaxTC() {
        return mapTaxTC;
    }

    /**
     * 设置mapTaxTC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMAPTaxTC(BigDecimal value) {
        this.mapTaxTC = value;
    }

    /**
     * 获取marExpenseAC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMARExpenseAC() {
        return marExpenseAC;
    }

    /**
     * 设置marExpenseAC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMARExpenseAC(BigDecimal value) {
        this.marExpenseAC = value;
    }

    /**
     * 获取marExpenseExTaxFC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMARExpenseExTaxFC() {
        return marExpenseExTaxFC;
    }

    /**
     * 设置marExpenseExTaxFC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMARExpenseExTaxFC(BigDecimal value) {
        this.marExpenseExTaxFC = value;
    }

    /**
     * 获取marExpenseIncTaxAC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMARExpenseIncTaxAC() {
        return marExpenseIncTaxAC;
    }

    /**
     * 设置marExpenseIncTaxAC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMARExpenseIncTaxAC(BigDecimal value) {
        this.marExpenseIncTaxAC = value;
    }

    /**
     * 获取marExpenseIncTaxFC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMARExpenseIncTaxFC() {
        return marExpenseIncTaxFC;
    }

    /**
     * 设置marExpenseIncTaxFC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMARExpenseIncTaxFC(BigDecimal value) {
        this.marExpenseIncTaxFC = value;
    }

    /**
     * 获取marExpenseIncTaxTC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMARExpenseIncTaxTC() {
        return marExpenseIncTaxTC;
    }

    /**
     * 设置marExpenseIncTaxTC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMARExpenseIncTaxTC(BigDecimal value) {
        this.marExpenseIncTaxTC = value;
    }

    /**
     * 获取marExpenseTC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMARExpenseTC() {
        return marExpenseTC;
    }

    /**
     * 设置marExpenseTC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMARExpenseTC(BigDecimal value) {
        this.marExpenseTC = value;
    }

    /**
     * 获取marTaxAC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMARTaxAC() {
        return marTaxAC;
    }

    /**
     * 设置marTaxAC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMARTaxAC(BigDecimal value) {
        this.marTaxAC = value;
    }

    /**
     * 获取marTaxFC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMARTaxFC() {
        return marTaxFC;
    }

    /**
     * 设置marTaxFC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMARTaxFC(BigDecimal value) {
        this.marTaxFC = value;
    }

    /**
     * 获取marTaxTC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMARTaxTC() {
        return marTaxTC;
    }

    /**
     * 设置marTaxTC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMARTaxTC(BigDecimal value) {
        this.marTaxTC = value;
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
     * 获取mExpectedExpenseExTaxAC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMExpectedExpenseExTaxAC() {
        return mExpectedExpenseExTaxAC;
    }

    /**
     * 设置mExpectedExpenseExTaxAC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMExpectedExpenseExTaxAC(BigDecimal value) {
        this.mExpectedExpenseExTaxAC = value;
    }

    /**
     * 获取mExpectedExpenseExTaxFC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMExpectedExpenseExTaxFC() {
        return mExpectedExpenseExTaxFC;
    }

    /**
     * 设置mExpectedExpenseExTaxFC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMExpectedExpenseExTaxFC(BigDecimal value) {
        this.mExpectedExpenseExTaxFC = value;
    }

    /**
     * 获取mExpectedExpenseExTaxTC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMExpectedExpenseExTaxTC() {
        return mExpectedExpenseExTaxTC;
    }

    /**
     * 设置mExpectedExpenseExTaxTC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMExpectedExpenseExTaxTC(BigDecimal value) {
        this.mExpectedExpenseExTaxTC = value;
    }

    /**
     * 获取mExpectedExpenseIncTaxAC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMExpectedExpenseIncTaxAC() {
        return mExpectedExpenseIncTaxAC;
    }

    /**
     * 设置mExpectedExpenseIncTaxAC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMExpectedExpenseIncTaxAC(BigDecimal value) {
        this.mExpectedExpenseIncTaxAC = value;
    }

    /**
     * 获取mExpectedExpenseIncTaxFC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMExpectedExpenseIncTaxFC() {
        return mExpectedExpenseIncTaxFC;
    }

    /**
     * 设置mExpectedExpenseIncTaxFC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMExpectedExpenseIncTaxFC(BigDecimal value) {
        this.mExpectedExpenseIncTaxFC = value;
    }

    /**
     * 获取mExpectedExpenseIncTaxTC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMExpectedExpenseIncTaxTC() {
        return mExpectedExpenseIncTaxTC;
    }

    /**
     * 设置mExpectedExpenseIncTaxTC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMExpectedExpenseIncTaxTC(BigDecimal value) {
        this.mExpectedExpenseIncTaxTC = value;
    }

    /**
     * 获取mExpectedTaxAC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMExpectedTaxAC() {
        return mExpectedTaxAC;
    }

    /**
     * 设置mExpectedTaxAC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMExpectedTaxAC(BigDecimal value) {
        this.mExpectedTaxAC = value;
    }

    /**
     * 获取mExpectedTaxFC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMExpectedTaxFC() {
        return mExpectedTaxFC;
    }

    /**
     * 设置mExpectedTaxFC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMExpectedTaxFC(BigDecimal value) {
        this.mExpectedTaxFC = value;
    }

    /**
     * 获取mExpectedTaxTC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMExpectedTaxTC() {
        return mExpectedTaxTC;
    }

    /**
     * 设置mExpectedTaxTC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMExpectedTaxTC(BigDecimal value) {
        this.mExpectedTaxTC = value;
    }

    /**
     * 获取mFeeAllotAC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMFeeAllotAC() {
        return mFeeAllotAC;
    }

    /**
     * 设置mFeeAllotAC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMFeeAllotAC(BigDecimal value) {
        this.mFeeAllotAC = value;
    }

    /**
     * 获取mFeeAllotFC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMFeeAllotFC() {
        return mFeeAllotFC;
    }

    /**
     * 设置mFeeAllotFC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMFeeAllotFC(BigDecimal value) {
        this.mFeeAllotFC = value;
    }

    /**
     * 获取mFeeAllotIncTaxAC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMFeeAllotIncTaxAC() {
        return mFeeAllotIncTaxAC;
    }

    /**
     * 设置mFeeAllotIncTaxAC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMFeeAllotIncTaxAC(BigDecimal value) {
        this.mFeeAllotIncTaxAC = value;
    }

    /**
     * 获取mFeeAllotIncTaxFC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMFeeAllotIncTaxFC() {
        return mFeeAllotIncTaxFC;
    }

    /**
     * 设置mFeeAllotIncTaxFC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMFeeAllotIncTaxFC(BigDecimal value) {
        this.mFeeAllotIncTaxFC = value;
    }

    /**
     * 获取mFeeAllotIncTaxTC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMFeeAllotIncTaxTC() {
        return mFeeAllotIncTaxTC;
    }

    /**
     * 设置mFeeAllotIncTaxTC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMFeeAllotIncTaxTC(BigDecimal value) {
        this.mFeeAllotIncTaxTC = value;
    }

    /**
     * 获取mFeeAllotTC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMFeeAllotTC() {
        return mFeeAllotTC;
    }

    /**
     * 设置mFeeAllotTC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMFeeAllotTC(BigDecimal value) {
        this.mFeeAllotTC = value;
    }

    /**
     * 获取mFeeAllotTaxAC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMFeeAllotTaxAC() {
        return mFeeAllotTaxAC;
    }

    /**
     * 设置mFeeAllotTaxAC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMFeeAllotTaxAC(BigDecimal value) {
        this.mFeeAllotTaxAC = value;
    }

    /**
     * 获取mFeeAllotTaxFC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMFeeAllotTaxFC() {
        return mFeeAllotTaxFC;
    }

    /**
     * 设置mFeeAllotTaxFC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMFeeAllotTaxFC(BigDecimal value) {
        this.mFeeAllotTaxFC = value;
    }

    /**
     * 获取mFeeAllotTaxTC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMFeeAllotTaxTC() {
        return mFeeAllotTaxTC;
    }

    /**
     * 设置mFeeAllotTaxTC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMFeeAllotTaxTC(BigDecimal value) {
        this.mFeeAllotTaxTC = value;
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
     * 获取mPaidExpenseExTaxAC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMPaidExpenseExTaxAC() {
        return mPaidExpenseExTaxAC;
    }

    /**
     * 设置mPaidExpenseExTaxAC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMPaidExpenseExTaxAC(BigDecimal value) {
        this.mPaidExpenseExTaxAC = value;
    }

    /**
     * 获取mPaidExpenseExTaxFC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMPaidExpenseExTaxFC() {
        return mPaidExpenseExTaxFC;
    }

    /**
     * 设置mPaidExpenseExTaxFC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMPaidExpenseExTaxFC(BigDecimal value) {
        this.mPaidExpenseExTaxFC = value;
    }

    /**
     * 获取mPaidExpenseExTaxTC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMPaidExpenseExTaxTC() {
        return mPaidExpenseExTaxTC;
    }

    /**
     * 设置mPaidExpenseExTaxTC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMPaidExpenseExTaxTC(BigDecimal value) {
        this.mPaidExpenseExTaxTC = value;
    }

    /**
     * 获取mPaidExpenseIncTaxAC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMPaidExpenseIncTaxAC() {
        return mPaidExpenseIncTaxAC;
    }

    /**
     * 设置mPaidExpenseIncTaxAC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMPaidExpenseIncTaxAC(BigDecimal value) {
        this.mPaidExpenseIncTaxAC = value;
    }

    /**
     * 获取mPaidExpenseIncTaxFC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMPaidExpenseIncTaxFC() {
        return mPaidExpenseIncTaxFC;
    }

    /**
     * 设置mPaidExpenseIncTaxFC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMPaidExpenseIncTaxFC(BigDecimal value) {
        this.mPaidExpenseIncTaxFC = value;
    }

    /**
     * 获取mPaidExpenseIncTaxTC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMPaidExpenseIncTaxTC() {
        return mPaidExpenseIncTaxTC;
    }

    /**
     * 设置mPaidExpenseIncTaxTC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMPaidExpenseIncTaxTC(BigDecimal value) {
        this.mPaidExpenseIncTaxTC = value;
    }

    /**
     * 获取mPaidTaxAC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMPaidTaxAC() {
        return mPaidTaxAC;
    }

    /**
     * 设置mPaidTaxAC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMPaidTaxAC(BigDecimal value) {
        this.mPaidTaxAC = value;
    }

    /**
     * 获取mPaidTaxFC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMPaidTaxFC() {
        return mPaidTaxFC;
    }

    /**
     * 设置mPaidTaxFC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMPaidTaxFC(BigDecimal value) {
        this.mPaidTaxFC = value;
    }

    /**
     * 获取mPaidTaxTC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMPaidTaxTC() {
        return mPaidTaxTC;
    }

    /**
     * 设置mPaidTaxTC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMPaidTaxTC(BigDecimal value) {
        this.mPaidTaxTC = value;
    }

    /**
     * 获取mShipFeeDTO属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9ISVSMShipFeeDTOForIndustryChainData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9ISVSMShipFeeDTOForIndustryChainData> getMShipFeeDTO() {
        return mShipFeeDTO;
    }

    /**
     * 设置mShipFeeDTO属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9ISVSMShipFeeDTOForIndustryChainData }{@code >}
     *     
     */
    public void setMShipFeeDTO(JAXBElement<UFIDAU9ISVSMShipFeeDTOForIndustryChainData> value) {
        this.mShipFeeDTO = value;
    }

    /**
     * 获取mShipFeeDTOForIndustryChain属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9ISVSMShipFeeDTOForIndustryChainData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9ISVSMShipFeeDTOForIndustryChainData> getMShipFeeDTOForIndustryChain() {
        return mShipFeeDTOForIndustryChain;
    }

    /**
     * 设置mShipFeeDTOForIndustryChain属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9ISVSMShipFeeDTOForIndustryChainData }{@code >}
     *     
     */
    public void setMShipFeeDTOForIndustryChain(JAXBElement<UFIDAU9ISVSMShipFeeDTOForIndustryChainData> value) {
        this.mShipFeeDTOForIndustryChain = value;
    }

    /**
     * 获取mSourceAllotQtyPU属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMSourceAllotQtyPU() {
        return mSourceAllotQtyPU;
    }

    /**
     * 设置mSourceAllotQtyPU属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMSourceAllotQtyPU(BigDecimal value) {
        this.mSourceAllotQtyPU = value;
    }

    /**
     * 获取mSourceBillType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMSourceBillType() {
        return mSourceBillType;
    }

    /**
     * 设置mSourceBillType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMSourceBillType(Integer value) {
        this.mSourceBillType = value;
    }

    /**
     * 获取mSourceDocNO属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMSourceDocNO() {
        return mSourceDocNO;
    }

    /**
     * 设置mSourceDocNO属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMSourceDocNO(JAXBElement<String> value) {
        this.mSourceDocNO = value;
    }

    /**
     * 获取mSourceEntityID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMSourceEntityID() {
        return mSourceEntityID;
    }

    /**
     * 设置mSourceEntityID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMSourceEntityID(Long value) {
        this.mSourceEntityID = value;
    }

    /**
     * 获取mSourceFeeType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMSourceFeeType() {
        return mSourceFeeType;
    }

    /**
     * 设置mSourceFeeType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMSourceFeeType(Integer value) {
        this.mSourceFeeType = value;
    }

    /**
     * 获取mSubLineNO属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMSubLineNO() {
        return mSubLineNO;
    }

    /**
     * 设置mSubLineNO属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMSubLineNO(Integer value) {
        this.mSubLineNO = value;
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
