
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
 * &lt;p&gt;UFIDA.U9.ISV.SM.ShipFeeDTOForIndustryChainData complex type的 Java 类。
 * 
 * &lt;p&gt;以下模式片段指定包含在此类中的预期内容。
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="UFIDA.U9.ISV.SM.ShipFeeDTOForIndustryChainData"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://www.UFIDA.org/EntityData}UFSoft.UBF.Business.DataTransObjectBase"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="m_createdBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_createdOn" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_descFlexField" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.Base.FlexField.DescFlexField.DescFlexSegmentsData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_fC" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CBO.Pub.Controller.CommonArchiveDataDTOData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_fCToACExchRate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_fCToACExchRateType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_fCToCCExchRate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_fCToCCExchRateType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_fCToTCExchRate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_fCToTCExchRateType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_feeLineNO" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_feeNetMoneyAC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_feeNetMoneyCC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_feeNetMoneyFC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_feeNetMoneyTC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_feeTotalMoneyAC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_feeTotalMoneyCC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_feeTotalMoneyFC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_feeTotalMoneyTC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_feeType" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CBO.Pub.Controller.CommonArchiveDataDTOData" minOccurs="0"/&amp;gt;
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
 *         &amp;lt;element name="m_precisionFCAC" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_precisionFCCC" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_precisionFCTC" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_sM" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.ISV.SM.ShipDTOForIndustryChainData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_shipFeeDetailLines" type="{http://www.UFIDA.org/EntityData}ArrayOfUFIDA.U9.ISV.SM.ShipFeeDetailLineDTOForIndustryChainData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_shipLine" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.ISV.SM.ShipLineDTOForIndustryChainData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_sourceFeeType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_supplier" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CBO.Pub.Controller.CommonArchiveDataDTOData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_supplierSite" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CBO.Pub.Controller.CommonArchiveDataDTOData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_sysVersion" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_taxMoneyAC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_taxMoneyCC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_taxMoneyFC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_taxMoneyTC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_taxRate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UFIDA.U9.ISV.SM.ShipFeeDTOForIndustryChainData", propOrder = {
    "mCreatedBy",
    "mCreatedOn",
    "mDescFlexField",
    "mfc",
    "mfcToACExchRate",
    "mfcToACExchRateType",
    "mfcToCCExchRate",
    "mfcToCCExchRateType",
    "mfcToTCExchRate",
    "mfcToTCExchRateType",
    "mFeeLineNO",
    "mFeeNetMoneyAC",
    "mFeeNetMoneyCC",
    "mFeeNetMoneyFC",
    "mFeeNetMoneyTC",
    "mFeeTotalMoneyAC",
    "mFeeTotalMoneyCC",
    "mFeeTotalMoneyFC",
    "mFeeTotalMoneyTC",
    "mFeeType",
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
    "mPrecisionFCAC",
    "mPrecisionFCCC",
    "mPrecisionFCTC",
    "msm",
    "mShipFeeDetailLines",
    "mShipLine",
    "mSourceFeeType",
    "mSupplier",
    "mSupplierSite",
    "mSysVersion",
    "mTaxMoneyAC",
    "mTaxMoneyCC",
    "mTaxMoneyFC",
    "mTaxMoneyTC",
    "mTaxRate"
})
public class UFIDAU9ISVSMShipFeeDTOForIndustryChainData
    extends UFSoftUBFBusinessDataTransObjectBase
{

    @XmlElementRef(name = "m_createdBy", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mCreatedBy;
    @XmlElement(name = "m_createdOn")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mCreatedOn;
    @XmlElementRef(name = "m_descFlexField", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9BaseFlexFieldDescFlexFieldDescFlexSegmentsData> mDescFlexField;
    @XmlElementRef(name = "m_fC", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> mfc;
    @XmlElement(name = "m_fCToACExchRate")
    protected BigDecimal mfcToACExchRate;
    @XmlElement(name = "m_fCToACExchRateType")
    protected Integer mfcToACExchRateType;
    @XmlElement(name = "m_fCToCCExchRate")
    protected BigDecimal mfcToCCExchRate;
    @XmlElement(name = "m_fCToCCExchRateType")
    protected Integer mfcToCCExchRateType;
    @XmlElement(name = "m_fCToTCExchRate")
    protected BigDecimal mfcToTCExchRate;
    @XmlElement(name = "m_fCToTCExchRateType")
    protected Integer mfcToTCExchRateType;
    @XmlElement(name = "m_feeLineNO")
    protected Integer mFeeLineNO;
    @XmlElement(name = "m_feeNetMoneyAC")
    protected BigDecimal mFeeNetMoneyAC;
    @XmlElement(name = "m_feeNetMoneyCC")
    protected BigDecimal mFeeNetMoneyCC;
    @XmlElement(name = "m_feeNetMoneyFC")
    protected BigDecimal mFeeNetMoneyFC;
    @XmlElement(name = "m_feeNetMoneyTC")
    protected BigDecimal mFeeNetMoneyTC;
    @XmlElement(name = "m_feeTotalMoneyAC")
    protected BigDecimal mFeeTotalMoneyAC;
    @XmlElement(name = "m_feeTotalMoneyCC")
    protected BigDecimal mFeeTotalMoneyCC;
    @XmlElement(name = "m_feeTotalMoneyFC")
    protected BigDecimal mFeeTotalMoneyFC;
    @XmlElement(name = "m_feeTotalMoneyTC")
    protected BigDecimal mFeeTotalMoneyTC;
    @XmlElementRef(name = "m_feeType", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> mFeeType;
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
    @XmlElement(name = "m_precisionFCAC")
    protected Integer mPrecisionFCAC;
    @XmlElement(name = "m_precisionFCCC")
    protected Integer mPrecisionFCCC;
    @XmlElement(name = "m_precisionFCTC")
    protected Integer mPrecisionFCTC;
    @XmlElementRef(name = "m_sM", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9ISVSMShipDTOForIndustryChainData> msm;
    @XmlElementRef(name = "m_shipFeeDetailLines", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfUFIDAU9ISVSMShipFeeDetailLineDTOForIndustryChainData> mShipFeeDetailLines;
    @XmlElementRef(name = "m_shipLine", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9ISVSMShipLineDTOForIndustryChainData> mShipLine;
    @XmlElement(name = "m_sourceFeeType")
    protected Integer mSourceFeeType;
    @XmlElementRef(name = "m_supplier", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> mSupplier;
    @XmlElementRef(name = "m_supplierSite", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> mSupplierSite;
    @XmlElement(name = "m_sysVersion")
    protected Long mSysVersion;
    @XmlElement(name = "m_taxMoneyAC")
    protected BigDecimal mTaxMoneyAC;
    @XmlElement(name = "m_taxMoneyCC")
    protected BigDecimal mTaxMoneyCC;
    @XmlElement(name = "m_taxMoneyFC")
    protected BigDecimal mTaxMoneyFC;
    @XmlElement(name = "m_taxMoneyTC")
    protected BigDecimal mTaxMoneyTC;
    @XmlElement(name = "m_taxRate")
    protected BigDecimal mTaxRate;

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
     * 获取mfc属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> getMFC() {
        return mfc;
    }

    /**
     * 设置mfc属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public void setMFC(JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> value) {
        this.mfc = value;
    }

    /**
     * 获取mfcToACExchRate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMFCToACExchRate() {
        return mfcToACExchRate;
    }

    /**
     * 设置mfcToACExchRate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMFCToACExchRate(BigDecimal value) {
        this.mfcToACExchRate = value;
    }

    /**
     * 获取mfcToACExchRateType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMFCToACExchRateType() {
        return mfcToACExchRateType;
    }

    /**
     * 设置mfcToACExchRateType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMFCToACExchRateType(Integer value) {
        this.mfcToACExchRateType = value;
    }

    /**
     * 获取mfcToCCExchRate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMFCToCCExchRate() {
        return mfcToCCExchRate;
    }

    /**
     * 设置mfcToCCExchRate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMFCToCCExchRate(BigDecimal value) {
        this.mfcToCCExchRate = value;
    }

    /**
     * 获取mfcToCCExchRateType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMFCToCCExchRateType() {
        return mfcToCCExchRateType;
    }

    /**
     * 设置mfcToCCExchRateType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMFCToCCExchRateType(Integer value) {
        this.mfcToCCExchRateType = value;
    }

    /**
     * 获取mfcToTCExchRate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMFCToTCExchRate() {
        return mfcToTCExchRate;
    }

    /**
     * 设置mfcToTCExchRate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMFCToTCExchRate(BigDecimal value) {
        this.mfcToTCExchRate = value;
    }

    /**
     * 获取mfcToTCExchRateType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMFCToTCExchRateType() {
        return mfcToTCExchRateType;
    }

    /**
     * 设置mfcToTCExchRateType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMFCToTCExchRateType(Integer value) {
        this.mfcToTCExchRateType = value;
    }

    /**
     * 获取mFeeLineNO属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMFeeLineNO() {
        return mFeeLineNO;
    }

    /**
     * 设置mFeeLineNO属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMFeeLineNO(Integer value) {
        this.mFeeLineNO = value;
    }

    /**
     * 获取mFeeNetMoneyAC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMFeeNetMoneyAC() {
        return mFeeNetMoneyAC;
    }

    /**
     * 设置mFeeNetMoneyAC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMFeeNetMoneyAC(BigDecimal value) {
        this.mFeeNetMoneyAC = value;
    }

    /**
     * 获取mFeeNetMoneyCC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMFeeNetMoneyCC() {
        return mFeeNetMoneyCC;
    }

    /**
     * 设置mFeeNetMoneyCC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMFeeNetMoneyCC(BigDecimal value) {
        this.mFeeNetMoneyCC = value;
    }

    /**
     * 获取mFeeNetMoneyFC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMFeeNetMoneyFC() {
        return mFeeNetMoneyFC;
    }

    /**
     * 设置mFeeNetMoneyFC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMFeeNetMoneyFC(BigDecimal value) {
        this.mFeeNetMoneyFC = value;
    }

    /**
     * 获取mFeeNetMoneyTC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMFeeNetMoneyTC() {
        return mFeeNetMoneyTC;
    }

    /**
     * 设置mFeeNetMoneyTC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMFeeNetMoneyTC(BigDecimal value) {
        this.mFeeNetMoneyTC = value;
    }

    /**
     * 获取mFeeTotalMoneyAC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMFeeTotalMoneyAC() {
        return mFeeTotalMoneyAC;
    }

    /**
     * 设置mFeeTotalMoneyAC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMFeeTotalMoneyAC(BigDecimal value) {
        this.mFeeTotalMoneyAC = value;
    }

    /**
     * 获取mFeeTotalMoneyCC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMFeeTotalMoneyCC() {
        return mFeeTotalMoneyCC;
    }

    /**
     * 设置mFeeTotalMoneyCC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMFeeTotalMoneyCC(BigDecimal value) {
        this.mFeeTotalMoneyCC = value;
    }

    /**
     * 获取mFeeTotalMoneyFC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMFeeTotalMoneyFC() {
        return mFeeTotalMoneyFC;
    }

    /**
     * 设置mFeeTotalMoneyFC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMFeeTotalMoneyFC(BigDecimal value) {
        this.mFeeTotalMoneyFC = value;
    }

    /**
     * 获取mFeeTotalMoneyTC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMFeeTotalMoneyTC() {
        return mFeeTotalMoneyTC;
    }

    /**
     * 设置mFeeTotalMoneyTC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMFeeTotalMoneyTC(BigDecimal value) {
        this.mFeeTotalMoneyTC = value;
    }

    /**
     * 获取mFeeType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> getMFeeType() {
        return mFeeType;
    }

    /**
     * 设置mFeeType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public void setMFeeType(JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> value) {
        this.mFeeType = value;
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
     * 获取mPrecisionFCAC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMPrecisionFCAC() {
        return mPrecisionFCAC;
    }

    /**
     * 设置mPrecisionFCAC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMPrecisionFCAC(Integer value) {
        this.mPrecisionFCAC = value;
    }

    /**
     * 获取mPrecisionFCCC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMPrecisionFCCC() {
        return mPrecisionFCCC;
    }

    /**
     * 设置mPrecisionFCCC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMPrecisionFCCC(Integer value) {
        this.mPrecisionFCCC = value;
    }

    /**
     * 获取mPrecisionFCTC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMPrecisionFCTC() {
        return mPrecisionFCTC;
    }

    /**
     * 设置mPrecisionFCTC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMPrecisionFCTC(Integer value) {
        this.mPrecisionFCTC = value;
    }

    /**
     * 获取msm属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9ISVSMShipDTOForIndustryChainData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9ISVSMShipDTOForIndustryChainData> getMSM() {
        return msm;
    }

    /**
     * 设置msm属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9ISVSMShipDTOForIndustryChainData }{@code >}
     *     
     */
    public void setMSM(JAXBElement<UFIDAU9ISVSMShipDTOForIndustryChainData> value) {
        this.msm = value;
    }

    /**
     * 获取mShipFeeDetailLines属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUFIDAU9ISVSMShipFeeDetailLineDTOForIndustryChainData }{@code >}
     *     
     */
    public JAXBElement<ArrayOfUFIDAU9ISVSMShipFeeDetailLineDTOForIndustryChainData> getMShipFeeDetailLines() {
        return mShipFeeDetailLines;
    }

    /**
     * 设置mShipFeeDetailLines属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUFIDAU9ISVSMShipFeeDetailLineDTOForIndustryChainData }{@code >}
     *     
     */
    public void setMShipFeeDetailLines(JAXBElement<ArrayOfUFIDAU9ISVSMShipFeeDetailLineDTOForIndustryChainData> value) {
        this.mShipFeeDetailLines = value;
    }

    /**
     * 获取mShipLine属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9ISVSMShipLineDTOForIndustryChainData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9ISVSMShipLineDTOForIndustryChainData> getMShipLine() {
        return mShipLine;
    }

    /**
     * 设置mShipLine属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9ISVSMShipLineDTOForIndustryChainData }{@code >}
     *     
     */
    public void setMShipLine(JAXBElement<UFIDAU9ISVSMShipLineDTOForIndustryChainData> value) {
        this.mShipLine = value;
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
     * 获取mSupplier属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> getMSupplier() {
        return mSupplier;
    }

    /**
     * 设置mSupplier属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public void setMSupplier(JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> value) {
        this.mSupplier = value;
    }

    /**
     * 获取mSupplierSite属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> getMSupplierSite() {
        return mSupplierSite;
    }

    /**
     * 设置mSupplierSite属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOPubControllerCommonArchiveDataDTOData }{@code >}
     *     
     */
    public void setMSupplierSite(JAXBElement<UFIDAU9CBOPubControllerCommonArchiveDataDTOData> value) {
        this.mSupplierSite = value;
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
     * 获取mTaxMoneyCC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMTaxMoneyCC() {
        return mTaxMoneyCC;
    }

    /**
     * 设置mTaxMoneyCC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMTaxMoneyCC(BigDecimal value) {
        this.mTaxMoneyCC = value;
    }

    /**
     * 获取mTaxMoneyFC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMTaxMoneyFC() {
        return mTaxMoneyFC;
    }

    /**
     * 设置mTaxMoneyFC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMTaxMoneyFC(BigDecimal value) {
        this.mTaxMoneyFC = value;
    }

    /**
     * 获取mTaxMoneyTC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMTaxMoneyTC() {
        return mTaxMoneyTC;
    }

    /**
     * 设置mTaxMoneyTC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMTaxMoneyTC(BigDecimal value) {
        this.mTaxMoneyTC = value;
    }

    /**
     * 获取mTaxRate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMTaxRate() {
        return mTaxRate;
    }

    /**
     * 设置mTaxRate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMTaxRate(BigDecimal value) {
        this.mTaxRate = value;
    }

}
