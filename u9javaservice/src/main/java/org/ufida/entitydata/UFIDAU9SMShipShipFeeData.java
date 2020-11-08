
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
 * &lt;p&gt;UFIDA.U9.SM.Ship.ShipFeeData complex type的 Java 类。
 * 
 * &lt;p&gt;以下模式片段指定包含在此类中的预期内容。
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="UFIDA.U9.SM.Ship.ShipFeeData"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://www.UFIDA.org/EntityData}UFSoft.UBF.Business.DataTransObjectBase"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="FC" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="FC_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="FeeType" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="FeeType_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ParentFeeLine_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="SM_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ShipLine_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_aPExpenseAC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_aPExpenseFC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_aPExpenseIncTaxAC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_aPExpenseIncTaxFC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_aPExpenseIncTaxTC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_aPExpenseTC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_aPTaxAC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_aPTaxFC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_aPTaxTC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_aRExpenseAC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_aRExpenseFC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_aRExpenseIncTaxAC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_aRExpenseIncTaxFC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_aRExpenseIncTaxTC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_aRExpenseTC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_aRTaxAC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_aRTaxFC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_aRTaxTC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_allotQtyPU" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_canMoreAR" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_createdBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_createdOn" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_descFlexField" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.Base.FlexField.DescFlexField.DescFlexSegmentsData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_fCToACExchRate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_fCToACExchRateType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_fCToCCExchRate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_fCToCCExchRateType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_fCToTCExchRate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_fCToTCExchRateType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_feeAccruedCurrency" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_feeAllocateBase" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_feeAllotAC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_feeAllotFC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_feeAllotIncTaxAC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_feeAllotIncTaxFC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_feeAllotIncTaxTC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_feeAllotTC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_feeAllotTaxAC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_feeAllotTaxFC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_feeAllotTaxTC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_feeDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_feeLineNO" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_feeNetMoneyAC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_feeNetMoneyCC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_feeNetMoneyFC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_feeNetMoneyTC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_feeTotalMoneyAC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_feeTotalMoneyCC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_feeTotalMoneyFC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_feeTotalMoneyTC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_iD" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isBenefitBillToAR" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isDistribute" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
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
 *         &amp;lt;element name="m_parentFeeLine" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.SM.Ship.ShipFeeData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_precisionFCAC" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_precisionFCCC" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_precisionFCTC" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_sM" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.SM.Ship.ShipData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_shipFeeDetailLines" type="{http://www.UFIDA.org/EntityData}ArrayOfUFIDA.U9.SM.Ship.ShipFeeDetailLineData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_shipLine" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.SM.Ship.ShipLineData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_sourceFeeType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_supplier" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CBO.SCM.Supplier.SupplierMISCInfoData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_supplierSite" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CBO.SCM.Supplier.SupplierSiteMISCInfoData" minOccurs="0"/&amp;gt;
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
@XmlType(name = "UFIDA.U9.SM.Ship.ShipFeeData", propOrder = {
    "fc",
    "fcsKey",
    "feeType",
    "feeTypeSKey",
    "parentFeeLineSKey",
    "smsKey",
    "shipLineSKey",
    "mapExpenseAC",
    "mapExpenseFC",
    "mapExpenseIncTaxAC",
    "mapExpenseIncTaxFC",
    "mapExpenseIncTaxTC",
    "mapExpenseTC",
    "mapTaxAC",
    "mapTaxFC",
    "mapTaxTC",
    "marExpenseAC",
    "marExpenseFC",
    "marExpenseIncTaxAC",
    "marExpenseIncTaxFC",
    "marExpenseIncTaxTC",
    "marExpenseTC",
    "marTaxAC",
    "marTaxFC",
    "marTaxTC",
    "mAllotQtyPU",
    "mCanMoreAR",
    "mCreatedBy",
    "mCreatedOn",
    "mDescFlexField",
    "mfcToACExchRate",
    "mfcToACExchRateType",
    "mfcToCCExchRate",
    "mfcToCCExchRateType",
    "mfcToTCExchRate",
    "mfcToTCExchRateType",
    "mFeeAccruedCurrency",
    "mFeeAllocateBase",
    "mFeeAllotAC",
    "mFeeAllotFC",
    "mFeeAllotIncTaxAC",
    "mFeeAllotIncTaxFC",
    "mFeeAllotIncTaxTC",
    "mFeeAllotTC",
    "mFeeAllotTaxAC",
    "mFeeAllotTaxFC",
    "mFeeAllotTaxTC",
    "mFeeDate",
    "mFeeLineNO",
    "mFeeNetMoneyAC",
    "mFeeNetMoneyCC",
    "mFeeNetMoneyFC",
    "mFeeNetMoneyTC",
    "mFeeTotalMoneyAC",
    "mFeeTotalMoneyCC",
    "mFeeTotalMoneyFC",
    "mFeeTotalMoneyTC",
    "mid",
    "mIsBenefitBillToAR",
    "mIsDistribute",
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
    "mParentFeeLine",
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
public class UFIDAU9SMShipShipFeeData
    extends UFSoftUBFBusinessDataTransObjectBase
{

    @XmlElement(name = "FC")
    protected Long fc;
    @XmlElementRef(name = "FC_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> fcsKey;
    @XmlElement(name = "FeeType")
    protected Long feeType;
    @XmlElementRef(name = "FeeType_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> feeTypeSKey;
    @XmlElementRef(name = "ParentFeeLine_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> parentFeeLineSKey;
    @XmlElementRef(name = "SM_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> smsKey;
    @XmlElementRef(name = "ShipLine_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> shipLineSKey;
    @XmlElement(name = "m_aPExpenseAC")
    protected BigDecimal mapExpenseAC;
    @XmlElement(name = "m_aPExpenseFC")
    protected BigDecimal mapExpenseFC;
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
    @XmlElement(name = "m_aRExpenseFC")
    protected BigDecimal marExpenseFC;
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
    @XmlElement(name = "m_allotQtyPU")
    protected BigDecimal mAllotQtyPU;
    @XmlElement(name = "m_canMoreAR")
    protected Boolean mCanMoreAR;
    @XmlElementRef(name = "m_createdBy", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mCreatedBy;
    @XmlElement(name = "m_createdOn")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mCreatedOn;
    @XmlElementRef(name = "m_descFlexField", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9BaseFlexFieldDescFlexFieldDescFlexSegmentsData> mDescFlexField;
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
    @XmlElement(name = "m_feeAccruedCurrency")
    protected Integer mFeeAccruedCurrency;
    @XmlElement(name = "m_feeAllocateBase")
    protected Integer mFeeAllocateBase;
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
    @XmlElement(name = "m_feeDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mFeeDate;
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
    @XmlElement(name = "m_iD")
    protected Long mid;
    @XmlElement(name = "m_isBenefitBillToAR")
    protected Boolean mIsBenefitBillToAR;
    @XmlElement(name = "m_isDistribute")
    protected Boolean mIsDistribute;
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
    @XmlElementRef(name = "m_parentFeeLine", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9SMShipShipFeeData> mParentFeeLine;
    @XmlElement(name = "m_precisionFCAC")
    protected Integer mPrecisionFCAC;
    @XmlElement(name = "m_precisionFCCC")
    protected Integer mPrecisionFCCC;
    @XmlElement(name = "m_precisionFCTC")
    protected Integer mPrecisionFCTC;
    @XmlElementRef(name = "m_sM", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9SMShipShipData> msm;
    @XmlElementRef(name = "m_shipFeeDetailLines", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfUFIDAU9SMShipShipFeeDetailLineData> mShipFeeDetailLines;
    @XmlElementRef(name = "m_shipLine", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9SMShipShipLineData> mShipLine;
    @XmlElement(name = "m_sourceFeeType")
    protected Integer mSourceFeeType;
    @XmlElementRef(name = "m_supplier", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9CBOSCMSupplierSupplierMISCInfoData> mSupplier;
    @XmlElementRef(name = "m_supplierSite", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9CBOSCMSupplierSupplierSiteMISCInfoData> mSupplierSite;
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
     * 获取fc属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getFC() {
        return fc;
    }

    /**
     * 设置fc属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFC(Long value) {
        this.fc = value;
    }

    /**
     * 获取fcsKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getFCSKey() {
        return fcsKey;
    }

    /**
     * 设置fcsKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setFCSKey(JAXBElement<EntityKey> value) {
        this.fcsKey = value;
    }

    /**
     * 获取feeType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getFeeType() {
        return feeType;
    }

    /**
     * 设置feeType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFeeType(Long value) {
        this.feeType = value;
    }

    /**
     * 获取feeTypeSKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getFeeTypeSKey() {
        return feeTypeSKey;
    }

    /**
     * 设置feeTypeSKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setFeeTypeSKey(JAXBElement<EntityKey> value) {
        this.feeTypeSKey = value;
    }

    /**
     * 获取parentFeeLineSKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getParentFeeLineSKey() {
        return parentFeeLineSKey;
    }

    /**
     * 设置parentFeeLineSKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setParentFeeLineSKey(JAXBElement<EntityKey> value) {
        this.parentFeeLineSKey = value;
    }

    /**
     * 获取smsKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getSMSKey() {
        return smsKey;
    }

    /**
     * 设置smsKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setSMSKey(JAXBElement<EntityKey> value) {
        this.smsKey = value;
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
     * 获取mapExpenseFC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMAPExpenseFC() {
        return mapExpenseFC;
    }

    /**
     * 设置mapExpenseFC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMAPExpenseFC(BigDecimal value) {
        this.mapExpenseFC = value;
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
     * 获取marExpenseFC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMARExpenseFC() {
        return marExpenseFC;
    }

    /**
     * 设置marExpenseFC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMARExpenseFC(BigDecimal value) {
        this.marExpenseFC = value;
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
     * 获取mAllotQtyPU属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMAllotQtyPU() {
        return mAllotQtyPU;
    }

    /**
     * 设置mAllotQtyPU属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMAllotQtyPU(BigDecimal value) {
        this.mAllotQtyPU = value;
    }

    /**
     * 获取mCanMoreAR属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMCanMoreAR() {
        return mCanMoreAR;
    }

    /**
     * 设置mCanMoreAR属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMCanMoreAR(Boolean value) {
        this.mCanMoreAR = value;
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
     * 获取mFeeAccruedCurrency属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMFeeAccruedCurrency() {
        return mFeeAccruedCurrency;
    }

    /**
     * 设置mFeeAccruedCurrency属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMFeeAccruedCurrency(Integer value) {
        this.mFeeAccruedCurrency = value;
    }

    /**
     * 获取mFeeAllocateBase属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMFeeAllocateBase() {
        return mFeeAllocateBase;
    }

    /**
     * 设置mFeeAllocateBase属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMFeeAllocateBase(Integer value) {
        this.mFeeAllocateBase = value;
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
     * 获取mFeeDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMFeeDate() {
        return mFeeDate;
    }

    /**
     * 设置mFeeDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMFeeDate(XMLGregorianCalendar value) {
        this.mFeeDate = value;
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
     * 获取mIsBenefitBillToAR属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsBenefitBillToAR() {
        return mIsBenefitBillToAR;
    }

    /**
     * 设置mIsBenefitBillToAR属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsBenefitBillToAR(Boolean value) {
        this.mIsBenefitBillToAR = value;
    }

    /**
     * 获取mIsDistribute属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsDistribute() {
        return mIsDistribute;
    }

    /**
     * 设置mIsDistribute属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsDistribute(Boolean value) {
        this.mIsDistribute = value;
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
     * 获取mParentFeeLine属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9SMShipShipFeeData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9SMShipShipFeeData> getMParentFeeLine() {
        return mParentFeeLine;
    }

    /**
     * 设置mParentFeeLine属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9SMShipShipFeeData }{@code >}
     *     
     */
    public void setMParentFeeLine(JAXBElement<UFIDAU9SMShipShipFeeData> value) {
        this.mParentFeeLine = value;
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
     *     {@link JAXBElement }{@code <}{@link UFIDAU9SMShipShipData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9SMShipShipData> getMSM() {
        return msm;
    }

    /**
     * 设置msm属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9SMShipShipData }{@code >}
     *     
     */
    public void setMSM(JAXBElement<UFIDAU9SMShipShipData> value) {
        this.msm = value;
    }

    /**
     * 获取mShipFeeDetailLines属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUFIDAU9SMShipShipFeeDetailLineData }{@code >}
     *     
     */
    public JAXBElement<ArrayOfUFIDAU9SMShipShipFeeDetailLineData> getMShipFeeDetailLines() {
        return mShipFeeDetailLines;
    }

    /**
     * 设置mShipFeeDetailLines属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUFIDAU9SMShipShipFeeDetailLineData }{@code >}
     *     
     */
    public void setMShipFeeDetailLines(JAXBElement<ArrayOfUFIDAU9SMShipShipFeeDetailLineData> value) {
        this.mShipFeeDetailLines = value;
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
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOSCMSupplierSupplierMISCInfoData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9CBOSCMSupplierSupplierMISCInfoData> getMSupplier() {
        return mSupplier;
    }

    /**
     * 设置mSupplier属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOSCMSupplierSupplierMISCInfoData }{@code >}
     *     
     */
    public void setMSupplier(JAXBElement<UFIDAU9CBOSCMSupplierSupplierMISCInfoData> value) {
        this.mSupplier = value;
    }

    /**
     * 获取mSupplierSite属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOSCMSupplierSupplierSiteMISCInfoData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9CBOSCMSupplierSupplierSiteMISCInfoData> getMSupplierSite() {
        return mSupplierSite;
    }

    /**
     * 设置mSupplierSite属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOSCMSupplierSupplierSiteMISCInfoData }{@code >}
     *     
     */
    public void setMSupplierSite(JAXBElement<UFIDAU9CBOSCMSupplierSupplierSiteMISCInfoData> value) {
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
