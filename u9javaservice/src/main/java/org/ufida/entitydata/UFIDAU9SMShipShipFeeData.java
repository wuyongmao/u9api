
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
 * &lt;p&gt;UFIDA.U9.SM.Ship.ShipFeeData complex type�� Java �ࡣ
 * 
 * &lt;p&gt;����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡfc���Ե�ֵ��
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
     * ����fc���Ե�ֵ��
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
     * ��ȡfcsKey���Ե�ֵ��
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
     * ����fcsKey���Ե�ֵ��
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
     * ��ȡfeeType���Ե�ֵ��
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
     * ����feeType���Ե�ֵ��
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
     * ��ȡfeeTypeSKey���Ե�ֵ��
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
     * ����feeTypeSKey���Ե�ֵ��
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
     * ��ȡparentFeeLineSKey���Ե�ֵ��
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
     * ����parentFeeLineSKey���Ե�ֵ��
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
     * ��ȡsmsKey���Ե�ֵ��
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
     * ����smsKey���Ե�ֵ��
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
     * ��ȡmapExpenseFC���Ե�ֵ��
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
     * ����mapExpenseFC���Ե�ֵ��
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
     * ��ȡmarExpenseFC���Ե�ֵ��
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
     * ����marExpenseFC���Ե�ֵ��
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
     * ��ȡmAllotQtyPU���Ե�ֵ��
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
     * ����mAllotQtyPU���Ե�ֵ��
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
     * ��ȡmCanMoreAR���Ե�ֵ��
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
     * ����mCanMoreAR���Ե�ֵ��
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
     * ��ȡmfcToACExchRate���Ե�ֵ��
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
     * ����mfcToACExchRate���Ե�ֵ��
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
     * ��ȡmfcToACExchRateType���Ե�ֵ��
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
     * ����mfcToACExchRateType���Ե�ֵ��
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
     * ��ȡmfcToCCExchRate���Ե�ֵ��
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
     * ����mfcToCCExchRate���Ե�ֵ��
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
     * ��ȡmfcToCCExchRateType���Ե�ֵ��
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
     * ����mfcToCCExchRateType���Ե�ֵ��
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
     * ��ȡmfcToTCExchRate���Ե�ֵ��
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
     * ����mfcToTCExchRate���Ե�ֵ��
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
     * ��ȡmfcToTCExchRateType���Ե�ֵ��
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
     * ����mfcToTCExchRateType���Ե�ֵ��
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
     * ��ȡmFeeAccruedCurrency���Ե�ֵ��
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
     * ����mFeeAccruedCurrency���Ե�ֵ��
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
     * ��ȡmFeeAllocateBase���Ե�ֵ��
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
     * ����mFeeAllocateBase���Ե�ֵ��
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
     * ��ȡmFeeDate���Ե�ֵ��
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
     * ����mFeeDate���Ե�ֵ��
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
     * ��ȡmFeeLineNO���Ե�ֵ��
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
     * ����mFeeLineNO���Ե�ֵ��
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
     * ��ȡmFeeNetMoneyAC���Ե�ֵ��
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
     * ����mFeeNetMoneyAC���Ե�ֵ��
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
     * ��ȡmFeeNetMoneyCC���Ե�ֵ��
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
     * ����mFeeNetMoneyCC���Ե�ֵ��
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
     * ��ȡmFeeNetMoneyFC���Ե�ֵ��
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
     * ����mFeeNetMoneyFC���Ե�ֵ��
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
     * ��ȡmFeeNetMoneyTC���Ե�ֵ��
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
     * ����mFeeNetMoneyTC���Ե�ֵ��
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
     * ��ȡmFeeTotalMoneyAC���Ե�ֵ��
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
     * ����mFeeTotalMoneyAC���Ե�ֵ��
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
     * ��ȡmFeeTotalMoneyCC���Ե�ֵ��
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
     * ����mFeeTotalMoneyCC���Ե�ֵ��
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
     * ��ȡmFeeTotalMoneyFC���Ե�ֵ��
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
     * ����mFeeTotalMoneyFC���Ե�ֵ��
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
     * ��ȡmFeeTotalMoneyTC���Ե�ֵ��
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
     * ����mFeeTotalMoneyTC���Ե�ֵ��
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
     * ��ȡmIsBenefitBillToAR���Ե�ֵ��
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
     * ����mIsBenefitBillToAR���Ե�ֵ��
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
     * ��ȡmIsDistribute���Ե�ֵ��
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
     * ����mIsDistribute���Ե�ֵ��
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
     * ��ȡmParentFeeLine���Ե�ֵ��
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
     * ����mParentFeeLine���Ե�ֵ��
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
     * ��ȡmPrecisionFCAC���Ե�ֵ��
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
     * ����mPrecisionFCAC���Ե�ֵ��
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
     * ��ȡmPrecisionFCCC���Ե�ֵ��
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
     * ����mPrecisionFCCC���Ե�ֵ��
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
     * ��ȡmPrecisionFCTC���Ե�ֵ��
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
     * ����mPrecisionFCTC���Ե�ֵ��
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
     * ��ȡmsm���Ե�ֵ��
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
     * ����msm���Ե�ֵ��
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
     * ��ȡmShipFeeDetailLines���Ե�ֵ��
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
     * ����mShipFeeDetailLines���Ե�ֵ��
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
     * ��ȡmSupplier���Ե�ֵ��
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
     * ����mSupplier���Ե�ֵ��
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
     * ��ȡmSupplierSite���Ե�ֵ��
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
     * ����mSupplierSite���Ե�ֵ��
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
     * ��ȡmTaxMoneyCC���Ե�ֵ��
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
     * ����mTaxMoneyCC���Ե�ֵ��
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
     * ��ȡmTaxMoneyFC���Ե�ֵ��
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
     * ����mTaxMoneyFC���Ե�ֵ��
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
     * ��ȡmTaxMoneyTC���Ե�ֵ��
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
     * ����mTaxMoneyTC���Ե�ֵ��
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
     * ��ȡmTaxRate���Ե�ֵ��
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
     * ����mTaxRate���Ե�ֵ��
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
