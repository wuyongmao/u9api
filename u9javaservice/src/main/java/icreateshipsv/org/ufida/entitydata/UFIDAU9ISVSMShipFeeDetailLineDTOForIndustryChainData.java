
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
 * &lt;p&gt;UFIDA.U9.ISV.SM.ShipFeeDetailLineDTOForIndustryChainData complex type�� Java �ࡣ
 * 
 * &lt;p&gt;����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡmapExpenseAC���Ե�ֵ��
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
     * ����mapExpenseAC���Ե�ֵ��
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
     * ��ȡmapExpenseExTaxFC���Ե�ֵ��
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
     * ����mapExpenseExTaxFC���Ե�ֵ��
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
     * ��ȡmapExpenseIncTaxAC���Ե�ֵ��
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
     * ����mapExpenseIncTaxAC���Ե�ֵ��
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
     * ��ȡmapExpenseIncTaxFC���Ե�ֵ��
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
     * ����mapExpenseIncTaxFC���Ե�ֵ��
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
     * ��ȡmapExpenseIncTaxTC���Ե�ֵ��
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
     * ����mapExpenseIncTaxTC���Ե�ֵ��
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
     * ��ȡmapExpenseTC���Ե�ֵ��
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
     * ����mapExpenseTC���Ե�ֵ��
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
     * ��ȡmapTaxAC���Ե�ֵ��
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
     * ����mapTaxAC���Ե�ֵ��
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
     * ��ȡmapTaxFC���Ե�ֵ��
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
     * ����mapTaxFC���Ե�ֵ��
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
     * ��ȡmapTaxTC���Ե�ֵ��
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
     * ����mapTaxTC���Ե�ֵ��
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
     * ��ȡmarExpenseAC���Ե�ֵ��
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
     * ����marExpenseAC���Ե�ֵ��
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
     * ��ȡmarExpenseExTaxFC���Ե�ֵ��
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
     * ����marExpenseExTaxFC���Ե�ֵ��
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
     * ��ȡmarExpenseIncTaxAC���Ե�ֵ��
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
     * ����marExpenseIncTaxAC���Ե�ֵ��
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
     * ��ȡmarExpenseIncTaxFC���Ե�ֵ��
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
     * ����marExpenseIncTaxFC���Ե�ֵ��
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
     * ��ȡmarExpenseIncTaxTC���Ե�ֵ��
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
     * ����marExpenseIncTaxTC���Ե�ֵ��
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
     * ��ȡmarExpenseTC���Ե�ֵ��
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
     * ����marExpenseTC���Ե�ֵ��
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
     * ��ȡmarTaxAC���Ե�ֵ��
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
     * ����marTaxAC���Ե�ֵ��
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
     * ��ȡmarTaxFC���Ե�ֵ��
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
     * ����marTaxFC���Ե�ֵ��
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
     * ��ȡmarTaxTC���Ե�ֵ��
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
     * ����marTaxTC���Ե�ֵ��
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
     * ��ȡmExpectedExpenseExTaxAC���Ե�ֵ��
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
     * ����mExpectedExpenseExTaxAC���Ե�ֵ��
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
     * ��ȡmExpectedExpenseExTaxFC���Ե�ֵ��
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
     * ����mExpectedExpenseExTaxFC���Ե�ֵ��
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
     * ��ȡmExpectedExpenseExTaxTC���Ե�ֵ��
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
     * ����mExpectedExpenseExTaxTC���Ե�ֵ��
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
     * ��ȡmExpectedExpenseIncTaxAC���Ե�ֵ��
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
     * ����mExpectedExpenseIncTaxAC���Ե�ֵ��
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
     * ��ȡmExpectedExpenseIncTaxFC���Ե�ֵ��
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
     * ����mExpectedExpenseIncTaxFC���Ե�ֵ��
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
     * ��ȡmExpectedExpenseIncTaxTC���Ե�ֵ��
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
     * ����mExpectedExpenseIncTaxTC���Ե�ֵ��
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
     * ��ȡmExpectedTaxAC���Ե�ֵ��
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
     * ����mExpectedTaxAC���Ե�ֵ��
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
     * ��ȡmExpectedTaxFC���Ե�ֵ��
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
     * ����mExpectedTaxFC���Ե�ֵ��
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
     * ��ȡmExpectedTaxTC���Ե�ֵ��
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
     * ����mExpectedTaxTC���Ե�ֵ��
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
     * ��ȡmFeeAllotAC���Ե�ֵ��
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
     * ����mFeeAllotAC���Ե�ֵ��
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
     * ��ȡmFeeAllotFC���Ե�ֵ��
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
     * ����mFeeAllotFC���Ե�ֵ��
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
     * ��ȡmFeeAllotIncTaxAC���Ե�ֵ��
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
     * ����mFeeAllotIncTaxAC���Ե�ֵ��
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
     * ��ȡmFeeAllotIncTaxFC���Ե�ֵ��
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
     * ����mFeeAllotIncTaxFC���Ե�ֵ��
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
     * ��ȡmFeeAllotIncTaxTC���Ե�ֵ��
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
     * ����mFeeAllotIncTaxTC���Ե�ֵ��
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
     * ��ȡmFeeAllotTC���Ե�ֵ��
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
     * ����mFeeAllotTC���Ե�ֵ��
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
     * ��ȡmFeeAllotTaxAC���Ե�ֵ��
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
     * ����mFeeAllotTaxAC���Ե�ֵ��
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
     * ��ȡmFeeAllotTaxFC���Ե�ֵ��
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
     * ����mFeeAllotTaxFC���Ե�ֵ��
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
     * ��ȡmFeeAllotTaxTC���Ե�ֵ��
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
     * ����mFeeAllotTaxTC���Ե�ֵ��
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
     * ��ȡmPaidExpenseExTaxAC���Ե�ֵ��
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
     * ����mPaidExpenseExTaxAC���Ե�ֵ��
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
     * ��ȡmPaidExpenseExTaxFC���Ե�ֵ��
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
     * ����mPaidExpenseExTaxFC���Ե�ֵ��
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
     * ��ȡmPaidExpenseExTaxTC���Ե�ֵ��
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
     * ����mPaidExpenseExTaxTC���Ե�ֵ��
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
     * ��ȡmPaidExpenseIncTaxAC���Ե�ֵ��
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
     * ����mPaidExpenseIncTaxAC���Ե�ֵ��
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
     * ��ȡmPaidExpenseIncTaxFC���Ե�ֵ��
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
     * ����mPaidExpenseIncTaxFC���Ե�ֵ��
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
     * ��ȡmPaidExpenseIncTaxTC���Ե�ֵ��
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
     * ����mPaidExpenseIncTaxTC���Ե�ֵ��
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
     * ��ȡmPaidTaxAC���Ե�ֵ��
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
     * ����mPaidTaxAC���Ե�ֵ��
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
     * ��ȡmPaidTaxFC���Ե�ֵ��
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
     * ����mPaidTaxFC���Ե�ֵ��
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
     * ��ȡmPaidTaxTC���Ե�ֵ��
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
     * ����mPaidTaxTC���Ե�ֵ��
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
     * ��ȡmShipFeeDTO���Ե�ֵ��
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
     * ����mShipFeeDTO���Ե�ֵ��
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
     * ��ȡmShipFeeDTOForIndustryChain���Ե�ֵ��
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
     * ����mShipFeeDTOForIndustryChain���Ե�ֵ��
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
     * ��ȡmSourceAllotQtyPU���Ե�ֵ��
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
     * ����mSourceAllotQtyPU���Ե�ֵ��
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
     * ��ȡmSourceBillType���Ե�ֵ��
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
     * ����mSourceBillType���Ե�ֵ��
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
     * ��ȡmSourceDocNO���Ե�ֵ��
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
     * ����mSourceDocNO���Ե�ֵ��
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
     * ��ȡmSourceEntityID���Ե�ֵ��
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
     * ����mSourceEntityID���Ե�ֵ��
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
     * ��ȡmSourceFeeType���Ե�ֵ��
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
     * ����mSourceFeeType���Ե�ֵ��
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
     * ��ȡmSubLineNO���Ե�ֵ��
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
     * ����mSubLineNO���Ե�ֵ��
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
