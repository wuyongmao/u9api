
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
import data.util.ubf.ufsoft.MultiLangDataDict;


/**
 * &lt;p&gt;UFIDA.U9.ISV.RCV.DTO.OBAReceivementDTOData complex type的 Java 类。
 * 
 * &lt;p&gt;以下模式片段指定包含在此类中的预期内容。
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="UFIDA.U9.ISV.RCV.DTO.OBAReceivementDTOData"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://www.UFIDA.org/EntityData}UFSoft.UBF.Business.DataTransObjectBase"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="APBillNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Carrier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ContainerNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="DeliverBillNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Multi_APBillNo" type="{UFSoft.UBF.Util.Data}MultiLangDataDict" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Multi_Carrier" type="{UFSoft.UBF.Util.Data}MultiLangDataDict" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Multi_ContainerNO" type="{UFSoft.UBF.Util.Data}MultiLangDataDict" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Multi_DeliverBillNo" type="{UFSoft.UBF.Util.Data}MultiLangDataDict" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Multi_VehicleNo" type="{UFSoft.UBF.Util.Data}MultiLangDataDict" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="PostPeriod" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="PostPeriod_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="VehicleNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_aC" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.PM.DTOs.BESimp4UIDTOData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_aCToFCExRate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_aPBill" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_aPBillLine" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_aPBillLineNo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_aPMny" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_accountOrg" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.PM.DTOs.BESimp4UIDTOData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_balanceOrg" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.PM.DTOs.BESimp4UIDTOData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_bizType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_businessDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_confirmMode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_confirmTerm" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.PM.DTOs.BESimp4UIDTOData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_createdBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_createdOn" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_curOperationNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_descFlexField" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.Base.FlexField.DescFlexField.DescFlexSegmentsData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_disusedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_disusedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_disusedReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_docNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_executedAPMny" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_fC" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.PM.DTOs.BESimp4UIDTOData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_findPriceDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_headFeeAC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_headFeeFC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_headFeeTC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_iD" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isACFromSrc" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isBizClose" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isConfirmTermChangeable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isDisused" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isExchRateType" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isInitEvaluation" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isLineApprove" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isMatchPO" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isPaymentTermChangeable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isPriceIncludeTax" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isPriceListChangeable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isProcessAssChild" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isProcessTrade" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isRcvByChangeable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isRelationCompany" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isTCFromSrc" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_latestPrintedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_memo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_modifiedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_modifiedOn" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_orgCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_payer" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CBO.SCM.Supplier.SupplierMISCInfoData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_payerSite" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CBO.SCM.Supplier.SupplierSiteMISCInfoData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_paymentBill" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_paymentBillLine" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_paymentBillLineNo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_paymentBillNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_paymentCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_paymentTerm" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.PM.DTOs.BESimp4UIDTOData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_prepayPolicy" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.PM.DTOs.BESimp4UIDTOData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_priceList" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.PM.DTOs.BESimp4UIDTOData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_printAmount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_purOrg" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.PM.DTOs.BESimp4UIDTOData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_rcvAddress" type="{http://www.UFIDA.org/EntityData}ArrayOfUFIDA.U9.ISV.RCV.DTO.OBARcvAddressDTOData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_rcvBy" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.PM.DTOs.BESimp4UIDTOData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_rcvContacts" type="{http://www.UFIDA.org/EntityData}ArrayOfUFIDA.U9.ISV.RCV.DTO.OBARcvContactDTOData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_rcvDiscount" type="{http://www.UFIDA.org/EntityData}ArrayOfUFIDA.U9.ISV.RCV.DTO.OBARcvDiscountDTOData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_rcvDocType" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.PM.DTOs.BESimp4UIDTOData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_rcvFees" type="{http://www.UFIDA.org/EntityData}ArrayOfUFIDA.U9.ISV.RCV.DTO.OBARcvFeeDTOData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_rcvLines" type="{http://www.UFIDA.org/EntityData}ArrayOfUFIDA.U9.ISV.RCV.DTO.OBARcvLineDTOData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_rcvTax" type="{http://www.UFIDA.org/EntityData}ArrayOfUFIDA.U9.ISV.RCV.DTO.OBARcvTaxDTOData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_receivementType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_rejectMode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_rtnCustomer" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CBO.SCM.Customer.CustomerMISCInfoData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_rtnType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_sOBPostPeriod" type="{http://www.UFIDA.org/EntityData}ArrayOfUFIDA.U9.ISV.RCV.DTO.OBASOBPostPeriodDTOData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_shipID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_shipOrg" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.PM.DTOs.BESimp4UIDTOData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_srcDocType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_supplier" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CBO.SCM.Supplier.SupplierMISCInfoData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_sysVersion" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_tC" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.PM.DTOs.BESimp4UIDTOData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_tCToACExRate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_tCToACExRateType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_taxRate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_taxSchedule" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.PM.DTOs.BESimp4UIDTOData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_version" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UFIDA.U9.ISV.RCV.DTO.OBAReceivementDTOData", propOrder = {
    "apBillNo",
    "carrier",
    "containerNO",
    "deliverBillNo",
    "multiAPBillNo",
    "multiCarrier",
    "multiContainerNO",
    "multiDeliverBillNo",
    "multiVehicleNo",
    "postPeriod",
    "postPeriodSKey",
    "vehicleNo",
    "mac",
    "macToFCExRate",
    "mapBill",
    "mapBillLine",
    "mapBillLineNo",
    "mapMny",
    "mAccountOrg",
    "mBalanceOrg",
    "mBizType",
    "mBusinessDate",
    "mConfirmMode",
    "mConfirmTerm",
    "mCreatedBy",
    "mCreatedOn",
    "mCurOperationNO",
    "mDescFlexField",
    "mDisusedBy",
    "mDisusedDate",
    "mDisusedReason",
    "mDocNo",
    "mExecutedAPMny",
    "mfc",
    "mFindPriceDate",
    "mHeadFeeAC",
    "mHeadFeeFC",
    "mHeadFeeTC",
    "mid",
    "mIsACFromSrc",
    "mIsBizClose",
    "mIsConfirmTermChangeable",
    "mIsDisused",
    "mIsExchRateType",
    "mIsInitEvaluation",
    "mIsLineApprove",
    "mIsMatchPO",
    "mIsPaymentTermChangeable",
    "mIsPriceIncludeTax",
    "mIsPriceListChangeable",
    "mIsProcessAssChild",
    "mIsProcessTrade",
    "mIsRcvByChangeable",
    "mIsRelationCompany",
    "mIsTCFromSrc",
    "mLatestPrintedDate",
    "mMemo",
    "mModifiedBy",
    "mModifiedOn",
    "mOrgCode",
    "mPayer",
    "mPayerSite",
    "mPaymentBill",
    "mPaymentBillLine",
    "mPaymentBillLineNo",
    "mPaymentBillNo",
    "mPaymentCode",
    "mPaymentTerm",
    "mPrepayPolicy",
    "mPriceList",
    "mPrintAmount",
    "mPurOrg",
    "mRcvAddress",
    "mRcvBy",
    "mRcvContacts",
    "mRcvDiscount",
    "mRcvDocType",
    "mRcvFees",
    "mRcvLines",
    "mRcvTax",
    "mReceivementType",
    "mRejectMode",
    "mRtnCustomer",
    "mRtnType",
    "msobPostPeriod",
    "mShipID",
    "mShipOrg",
    "mSrcDocType",
    "mSupplier",
    "mSysVersion",
    "mtc",
    "mtcToACExRate",
    "mtcToACExRateType",
    "mTaxRate",
    "mTaxSchedule",
    "mVersion"
})
public class UFIDAU9ISVRCVDTOOBAReceivementDTOData
    extends UFSoftUBFBusinessDataTransObjectBase
{

    @XmlElementRef(name = "APBillNo", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> apBillNo;
    @XmlElementRef(name = "Carrier", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> carrier;
    @XmlElementRef(name = "ContainerNO", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> containerNO;
    @XmlElementRef(name = "DeliverBillNo", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> deliverBillNo;
    @XmlElementRef(name = "Multi_APBillNo", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<MultiLangDataDict> multiAPBillNo;
    @XmlElementRef(name = "Multi_Carrier", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<MultiLangDataDict> multiCarrier;
    @XmlElementRef(name = "Multi_ContainerNO", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<MultiLangDataDict> multiContainerNO;
    @XmlElementRef(name = "Multi_DeliverBillNo", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<MultiLangDataDict> multiDeliverBillNo;
    @XmlElementRef(name = "Multi_VehicleNo", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<MultiLangDataDict> multiVehicleNo;
    @XmlElement(name = "PostPeriod")
    protected Long postPeriod;
    @XmlElementRef(name = "PostPeriod_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> postPeriodSKey;
    @XmlElementRef(name = "VehicleNo", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> vehicleNo;
    @XmlElementRef(name = "m_aC", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9PMDTOsBESimp4UIDTOData> mac;
    @XmlElement(name = "m_aCToFCExRate")
    protected BigDecimal macToFCExRate;
    @XmlElement(name = "m_aPBill")
    protected Long mapBill;
    @XmlElement(name = "m_aPBillLine")
    protected Long mapBillLine;
    @XmlElement(name = "m_aPBillLineNo")
    protected Integer mapBillLineNo;
    @XmlElement(name = "m_aPMny")
    protected BigDecimal mapMny;
    @XmlElementRef(name = "m_accountOrg", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9PMDTOsBESimp4UIDTOData> mAccountOrg;
    @XmlElementRef(name = "m_balanceOrg", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9PMDTOsBESimp4UIDTOData> mBalanceOrg;
    @XmlElement(name = "m_bizType")
    protected Integer mBizType;
    @XmlElement(name = "m_businessDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mBusinessDate;
    @XmlElement(name = "m_confirmMode")
    protected Integer mConfirmMode;
    @XmlElementRef(name = "m_confirmTerm", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9PMDTOsBESimp4UIDTOData> mConfirmTerm;
    @XmlElementRef(name = "m_createdBy", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mCreatedBy;
    @XmlElement(name = "m_createdOn")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mCreatedOn;
    @XmlElementRef(name = "m_curOperationNO", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mCurOperationNO;
    @XmlElementRef(name = "m_descFlexField", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9BaseFlexFieldDescFlexFieldDescFlexSegmentsData> mDescFlexField;
    @XmlElementRef(name = "m_disusedBy", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mDisusedBy;
    @XmlElement(name = "m_disusedDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mDisusedDate;
    @XmlElementRef(name = "m_disusedReason", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mDisusedReason;
    @XmlElementRef(name = "m_docNo", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mDocNo;
    @XmlElement(name = "m_executedAPMny")
    protected BigDecimal mExecutedAPMny;
    @XmlElementRef(name = "m_fC", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9PMDTOsBESimp4UIDTOData> mfc;
    @XmlElement(name = "m_findPriceDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mFindPriceDate;
    @XmlElement(name = "m_headFeeAC")
    protected BigDecimal mHeadFeeAC;
    @XmlElement(name = "m_headFeeFC")
    protected BigDecimal mHeadFeeFC;
    @XmlElement(name = "m_headFeeTC")
    protected BigDecimal mHeadFeeTC;
    @XmlElement(name = "m_iD")
    protected Long mid;
    @XmlElement(name = "m_isACFromSrc")
    protected Boolean mIsACFromSrc;
    @XmlElement(name = "m_isBizClose")
    protected Boolean mIsBizClose;
    @XmlElement(name = "m_isConfirmTermChangeable")
    protected Boolean mIsConfirmTermChangeable;
    @XmlElement(name = "m_isDisused")
    protected Boolean mIsDisused;
    @XmlElement(name = "m_isExchRateType")
    protected Boolean mIsExchRateType;
    @XmlElement(name = "m_isInitEvaluation")
    protected Boolean mIsInitEvaluation;
    @XmlElement(name = "m_isLineApprove")
    protected Boolean mIsLineApprove;
    @XmlElement(name = "m_isMatchPO")
    protected Boolean mIsMatchPO;
    @XmlElement(name = "m_isPaymentTermChangeable")
    protected Boolean mIsPaymentTermChangeable;
    @XmlElement(name = "m_isPriceIncludeTax")
    protected Boolean mIsPriceIncludeTax;
    @XmlElement(name = "m_isPriceListChangeable")
    protected Boolean mIsPriceListChangeable;
    @XmlElement(name = "m_isProcessAssChild")
    protected Boolean mIsProcessAssChild;
    @XmlElement(name = "m_isProcessTrade")
    protected Boolean mIsProcessTrade;
    @XmlElement(name = "m_isRcvByChangeable")
    protected Boolean mIsRcvByChangeable;
    @XmlElement(name = "m_isRelationCompany")
    protected Boolean mIsRelationCompany;
    @XmlElement(name = "m_isTCFromSrc")
    protected Boolean mIsTCFromSrc;
    @XmlElement(name = "m_latestPrintedDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mLatestPrintedDate;
    @XmlElementRef(name = "m_memo", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mMemo;
    @XmlElementRef(name = "m_modifiedBy", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mModifiedBy;
    @XmlElement(name = "m_modifiedOn")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mModifiedOn;
    @XmlElementRef(name = "m_orgCode", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mOrgCode;
    @XmlElementRef(name = "m_payer", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9CBOSCMSupplierSupplierMISCInfoData> mPayer;
    @XmlElementRef(name = "m_payerSite", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9CBOSCMSupplierSupplierSiteMISCInfoData> mPayerSite;
    @XmlElement(name = "m_paymentBill")
    protected Long mPaymentBill;
    @XmlElement(name = "m_paymentBillLine")
    protected Long mPaymentBillLine;
    @XmlElement(name = "m_paymentBillLineNo")
    protected Integer mPaymentBillLineNo;
    @XmlElementRef(name = "m_paymentBillNo", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mPaymentBillNo;
    @XmlElementRef(name = "m_paymentCode", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mPaymentCode;
    @XmlElementRef(name = "m_paymentTerm", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9PMDTOsBESimp4UIDTOData> mPaymentTerm;
    @XmlElementRef(name = "m_prepayPolicy", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9PMDTOsBESimp4UIDTOData> mPrepayPolicy;
    @XmlElementRef(name = "m_priceList", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9PMDTOsBESimp4UIDTOData> mPriceList;
    @XmlElement(name = "m_printAmount")
    protected Integer mPrintAmount;
    @XmlElementRef(name = "m_purOrg", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9PMDTOsBESimp4UIDTOData> mPurOrg;
    @XmlElementRef(name = "m_rcvAddress", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfUFIDAU9ISVRCVDTOOBARcvAddressDTOData> mRcvAddress;
    @XmlElementRef(name = "m_rcvBy", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9PMDTOsBESimp4UIDTOData> mRcvBy;
    @XmlElementRef(name = "m_rcvContacts", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfUFIDAU9ISVRCVDTOOBARcvContactDTOData> mRcvContacts;
    @XmlElementRef(name = "m_rcvDiscount", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfUFIDAU9ISVRCVDTOOBARcvDiscountDTOData> mRcvDiscount;
    @XmlElementRef(name = "m_rcvDocType", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9PMDTOsBESimp4UIDTOData> mRcvDocType;
    @XmlElementRef(name = "m_rcvFees", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfUFIDAU9ISVRCVDTOOBARcvFeeDTOData> mRcvFees;
    @XmlElementRef(name = "m_rcvLines", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfUFIDAU9ISVRCVDTOOBARcvLineDTOData> mRcvLines;
    @XmlElementRef(name = "m_rcvTax", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfUFIDAU9ISVRCVDTOOBARcvTaxDTOData> mRcvTax;
    @XmlElement(name = "m_receivementType")
    protected Integer mReceivementType;
    @XmlElement(name = "m_rejectMode")
    protected Integer mRejectMode;
    @XmlElementRef(name = "m_rtnCustomer", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9CBOSCMCustomerCustomerMISCInfoData> mRtnCustomer;
    @XmlElement(name = "m_rtnType")
    protected Integer mRtnType;
    @XmlElementRef(name = "m_sOBPostPeriod", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfUFIDAU9ISVRCVDTOOBASOBPostPeriodDTOData> msobPostPeriod;
    @XmlElement(name = "m_shipID")
    protected Long mShipID;
    @XmlElementRef(name = "m_shipOrg", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9PMDTOsBESimp4UIDTOData> mShipOrg;
    @XmlElement(name = "m_srcDocType")
    protected Integer mSrcDocType;
    @XmlElementRef(name = "m_supplier", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9CBOSCMSupplierSupplierMISCInfoData> mSupplier;
    @XmlElement(name = "m_sysVersion")
    protected Long mSysVersion;
    @XmlElementRef(name = "m_tC", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9PMDTOsBESimp4UIDTOData> mtc;
    @XmlElement(name = "m_tCToACExRate")
    protected BigDecimal mtcToACExRate;
    @XmlElement(name = "m_tCToACExRateType")
    protected Integer mtcToACExRateType;
    @XmlElement(name = "m_taxRate")
    protected BigDecimal mTaxRate;
    @XmlElementRef(name = "m_taxSchedule", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9PMDTOsBESimp4UIDTOData> mTaxSchedule;
    @XmlElement(name = "m_version")
    protected Integer mVersion;

    /**
     * 获取apBillNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAPBillNo() {
        return apBillNo;
    }

    /**
     * 设置apBillNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAPBillNo(JAXBElement<String> value) {
        this.apBillNo = value;
    }

    /**
     * 获取carrier属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCarrier() {
        return carrier;
    }

    /**
     * 设置carrier属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCarrier(JAXBElement<String> value) {
        this.carrier = value;
    }

    /**
     * 获取containerNO属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getContainerNO() {
        return containerNO;
    }

    /**
     * 设置containerNO属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setContainerNO(JAXBElement<String> value) {
        this.containerNO = value;
    }

    /**
     * 获取deliverBillNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDeliverBillNo() {
        return deliverBillNo;
    }

    /**
     * 设置deliverBillNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDeliverBillNo(JAXBElement<String> value) {
        this.deliverBillNo = value;
    }

    /**
     * 获取multiAPBillNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MultiLangDataDict }{@code >}
     *     
     */
    public JAXBElement<MultiLangDataDict> getMultiAPBillNo() {
        return multiAPBillNo;
    }

    /**
     * 设置multiAPBillNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MultiLangDataDict }{@code >}
     *     
     */
    public void setMultiAPBillNo(JAXBElement<MultiLangDataDict> value) {
        this.multiAPBillNo = value;
    }

    /**
     * 获取multiCarrier属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MultiLangDataDict }{@code >}
     *     
     */
    public JAXBElement<MultiLangDataDict> getMultiCarrier() {
        return multiCarrier;
    }

    /**
     * 设置multiCarrier属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MultiLangDataDict }{@code >}
     *     
     */
    public void setMultiCarrier(JAXBElement<MultiLangDataDict> value) {
        this.multiCarrier = value;
    }

    /**
     * 获取multiContainerNO属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MultiLangDataDict }{@code >}
     *     
     */
    public JAXBElement<MultiLangDataDict> getMultiContainerNO() {
        return multiContainerNO;
    }

    /**
     * 设置multiContainerNO属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MultiLangDataDict }{@code >}
     *     
     */
    public void setMultiContainerNO(JAXBElement<MultiLangDataDict> value) {
        this.multiContainerNO = value;
    }

    /**
     * 获取multiDeliverBillNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MultiLangDataDict }{@code >}
     *     
     */
    public JAXBElement<MultiLangDataDict> getMultiDeliverBillNo() {
        return multiDeliverBillNo;
    }

    /**
     * 设置multiDeliverBillNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MultiLangDataDict }{@code >}
     *     
     */
    public void setMultiDeliverBillNo(JAXBElement<MultiLangDataDict> value) {
        this.multiDeliverBillNo = value;
    }

    /**
     * 获取multiVehicleNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MultiLangDataDict }{@code >}
     *     
     */
    public JAXBElement<MultiLangDataDict> getMultiVehicleNo() {
        return multiVehicleNo;
    }

    /**
     * 设置multiVehicleNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MultiLangDataDict }{@code >}
     *     
     */
    public void setMultiVehicleNo(JAXBElement<MultiLangDataDict> value) {
        this.multiVehicleNo = value;
    }

    /**
     * 获取postPeriod属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPostPeriod() {
        return postPeriod;
    }

    /**
     * 设置postPeriod属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPostPeriod(Long value) {
        this.postPeriod = value;
    }

    /**
     * 获取postPeriodSKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getPostPeriodSKey() {
        return postPeriodSKey;
    }

    /**
     * 设置postPeriodSKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setPostPeriodSKey(JAXBElement<EntityKey> value) {
        this.postPeriodSKey = value;
    }

    /**
     * 获取vehicleNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getVehicleNo() {
        return vehicleNo;
    }

    /**
     * 设置vehicleNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setVehicleNo(JAXBElement<String> value) {
        this.vehicleNo = value;
    }

    /**
     * 获取mac属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9PMDTOsBESimp4UIDTOData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9PMDTOsBESimp4UIDTOData> getMAC() {
        return mac;
    }

    /**
     * 设置mac属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9PMDTOsBESimp4UIDTOData }{@code >}
     *     
     */
    public void setMAC(JAXBElement<UFIDAU9PMDTOsBESimp4UIDTOData> value) {
        this.mac = value;
    }

    /**
     * 获取macToFCExRate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMACToFCExRate() {
        return macToFCExRate;
    }

    /**
     * 设置macToFCExRate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMACToFCExRate(BigDecimal value) {
        this.macToFCExRate = value;
    }

    /**
     * 获取mapBill属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMAPBill() {
        return mapBill;
    }

    /**
     * 设置mapBill属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMAPBill(Long value) {
        this.mapBill = value;
    }

    /**
     * 获取mapBillLine属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMAPBillLine() {
        return mapBillLine;
    }

    /**
     * 设置mapBillLine属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMAPBillLine(Long value) {
        this.mapBillLine = value;
    }

    /**
     * 获取mapBillLineNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMAPBillLineNo() {
        return mapBillLineNo;
    }

    /**
     * 设置mapBillLineNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMAPBillLineNo(Integer value) {
        this.mapBillLineNo = value;
    }

    /**
     * 获取mapMny属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMAPMny() {
        return mapMny;
    }

    /**
     * 设置mapMny属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMAPMny(BigDecimal value) {
        this.mapMny = value;
    }

    /**
     * 获取mAccountOrg属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9PMDTOsBESimp4UIDTOData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9PMDTOsBESimp4UIDTOData> getMAccountOrg() {
        return mAccountOrg;
    }

    /**
     * 设置mAccountOrg属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9PMDTOsBESimp4UIDTOData }{@code >}
     *     
     */
    public void setMAccountOrg(JAXBElement<UFIDAU9PMDTOsBESimp4UIDTOData> value) {
        this.mAccountOrg = value;
    }

    /**
     * 获取mBalanceOrg属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9PMDTOsBESimp4UIDTOData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9PMDTOsBESimp4UIDTOData> getMBalanceOrg() {
        return mBalanceOrg;
    }

    /**
     * 设置mBalanceOrg属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9PMDTOsBESimp4UIDTOData }{@code >}
     *     
     */
    public void setMBalanceOrg(JAXBElement<UFIDAU9PMDTOsBESimp4UIDTOData> value) {
        this.mBalanceOrg = value;
    }

    /**
     * 获取mBizType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMBizType() {
        return mBizType;
    }

    /**
     * 设置mBizType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMBizType(Integer value) {
        this.mBizType = value;
    }

    /**
     * 获取mBusinessDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMBusinessDate() {
        return mBusinessDate;
    }

    /**
     * 设置mBusinessDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMBusinessDate(XMLGregorianCalendar value) {
        this.mBusinessDate = value;
    }

    /**
     * 获取mConfirmMode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMConfirmMode() {
        return mConfirmMode;
    }

    /**
     * 设置mConfirmMode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMConfirmMode(Integer value) {
        this.mConfirmMode = value;
    }

    /**
     * 获取mConfirmTerm属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9PMDTOsBESimp4UIDTOData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9PMDTOsBESimp4UIDTOData> getMConfirmTerm() {
        return mConfirmTerm;
    }

    /**
     * 设置mConfirmTerm属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9PMDTOsBESimp4UIDTOData }{@code >}
     *     
     */
    public void setMConfirmTerm(JAXBElement<UFIDAU9PMDTOsBESimp4UIDTOData> value) {
        this.mConfirmTerm = value;
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
     * 获取mCurOperationNO属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMCurOperationNO() {
        return mCurOperationNO;
    }

    /**
     * 设置mCurOperationNO属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMCurOperationNO(JAXBElement<String> value) {
        this.mCurOperationNO = value;
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
     * 获取mDisusedBy属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMDisusedBy() {
        return mDisusedBy;
    }

    /**
     * 设置mDisusedBy属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMDisusedBy(JAXBElement<String> value) {
        this.mDisusedBy = value;
    }

    /**
     * 获取mDisusedDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMDisusedDate() {
        return mDisusedDate;
    }

    /**
     * 设置mDisusedDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMDisusedDate(XMLGregorianCalendar value) {
        this.mDisusedDate = value;
    }

    /**
     * 获取mDisusedReason属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMDisusedReason() {
        return mDisusedReason;
    }

    /**
     * 设置mDisusedReason属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMDisusedReason(JAXBElement<String> value) {
        this.mDisusedReason = value;
    }

    /**
     * 获取mDocNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMDocNo() {
        return mDocNo;
    }

    /**
     * 设置mDocNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMDocNo(JAXBElement<String> value) {
        this.mDocNo = value;
    }

    /**
     * 获取mExecutedAPMny属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMExecutedAPMny() {
        return mExecutedAPMny;
    }

    /**
     * 设置mExecutedAPMny属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMExecutedAPMny(BigDecimal value) {
        this.mExecutedAPMny = value;
    }

    /**
     * 获取mfc属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9PMDTOsBESimp4UIDTOData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9PMDTOsBESimp4UIDTOData> getMFC() {
        return mfc;
    }

    /**
     * 设置mfc属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9PMDTOsBESimp4UIDTOData }{@code >}
     *     
     */
    public void setMFC(JAXBElement<UFIDAU9PMDTOsBESimp4UIDTOData> value) {
        this.mfc = value;
    }

    /**
     * 获取mFindPriceDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMFindPriceDate() {
        return mFindPriceDate;
    }

    /**
     * 设置mFindPriceDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMFindPriceDate(XMLGregorianCalendar value) {
        this.mFindPriceDate = value;
    }

    /**
     * 获取mHeadFeeAC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMHeadFeeAC() {
        return mHeadFeeAC;
    }

    /**
     * 设置mHeadFeeAC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMHeadFeeAC(BigDecimal value) {
        this.mHeadFeeAC = value;
    }

    /**
     * 获取mHeadFeeFC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMHeadFeeFC() {
        return mHeadFeeFC;
    }

    /**
     * 设置mHeadFeeFC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMHeadFeeFC(BigDecimal value) {
        this.mHeadFeeFC = value;
    }

    /**
     * 获取mHeadFeeTC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMHeadFeeTC() {
        return mHeadFeeTC;
    }

    /**
     * 设置mHeadFeeTC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMHeadFeeTC(BigDecimal value) {
        this.mHeadFeeTC = value;
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
     * 获取mIsACFromSrc属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsACFromSrc() {
        return mIsACFromSrc;
    }

    /**
     * 设置mIsACFromSrc属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsACFromSrc(Boolean value) {
        this.mIsACFromSrc = value;
    }

    /**
     * 获取mIsBizClose属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsBizClose() {
        return mIsBizClose;
    }

    /**
     * 设置mIsBizClose属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsBizClose(Boolean value) {
        this.mIsBizClose = value;
    }

    /**
     * 获取mIsConfirmTermChangeable属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsConfirmTermChangeable() {
        return mIsConfirmTermChangeable;
    }

    /**
     * 设置mIsConfirmTermChangeable属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsConfirmTermChangeable(Boolean value) {
        this.mIsConfirmTermChangeable = value;
    }

    /**
     * 获取mIsDisused属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsDisused() {
        return mIsDisused;
    }

    /**
     * 设置mIsDisused属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsDisused(Boolean value) {
        this.mIsDisused = value;
    }

    /**
     * 获取mIsExchRateType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsExchRateType() {
        return mIsExchRateType;
    }

    /**
     * 设置mIsExchRateType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsExchRateType(Boolean value) {
        this.mIsExchRateType = value;
    }

    /**
     * 获取mIsInitEvaluation属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsInitEvaluation() {
        return mIsInitEvaluation;
    }

    /**
     * 设置mIsInitEvaluation属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsInitEvaluation(Boolean value) {
        this.mIsInitEvaluation = value;
    }

    /**
     * 获取mIsLineApprove属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsLineApprove() {
        return mIsLineApprove;
    }

    /**
     * 设置mIsLineApprove属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsLineApprove(Boolean value) {
        this.mIsLineApprove = value;
    }

    /**
     * 获取mIsMatchPO属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsMatchPO() {
        return mIsMatchPO;
    }

    /**
     * 设置mIsMatchPO属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsMatchPO(Boolean value) {
        this.mIsMatchPO = value;
    }

    /**
     * 获取mIsPaymentTermChangeable属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsPaymentTermChangeable() {
        return mIsPaymentTermChangeable;
    }

    /**
     * 设置mIsPaymentTermChangeable属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsPaymentTermChangeable(Boolean value) {
        this.mIsPaymentTermChangeable = value;
    }

    /**
     * 获取mIsPriceIncludeTax属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsPriceIncludeTax() {
        return mIsPriceIncludeTax;
    }

    /**
     * 设置mIsPriceIncludeTax属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsPriceIncludeTax(Boolean value) {
        this.mIsPriceIncludeTax = value;
    }

    /**
     * 获取mIsPriceListChangeable属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsPriceListChangeable() {
        return mIsPriceListChangeable;
    }

    /**
     * 设置mIsPriceListChangeable属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsPriceListChangeable(Boolean value) {
        this.mIsPriceListChangeable = value;
    }

    /**
     * 获取mIsProcessAssChild属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsProcessAssChild() {
        return mIsProcessAssChild;
    }

    /**
     * 设置mIsProcessAssChild属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsProcessAssChild(Boolean value) {
        this.mIsProcessAssChild = value;
    }

    /**
     * 获取mIsProcessTrade属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsProcessTrade() {
        return mIsProcessTrade;
    }

    /**
     * 设置mIsProcessTrade属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsProcessTrade(Boolean value) {
        this.mIsProcessTrade = value;
    }

    /**
     * 获取mIsRcvByChangeable属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsRcvByChangeable() {
        return mIsRcvByChangeable;
    }

    /**
     * 设置mIsRcvByChangeable属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsRcvByChangeable(Boolean value) {
        this.mIsRcvByChangeable = value;
    }

    /**
     * 获取mIsRelationCompany属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsRelationCompany() {
        return mIsRelationCompany;
    }

    /**
     * 设置mIsRelationCompany属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsRelationCompany(Boolean value) {
        this.mIsRelationCompany = value;
    }

    /**
     * 获取mIsTCFromSrc属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsTCFromSrc() {
        return mIsTCFromSrc;
    }

    /**
     * 设置mIsTCFromSrc属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsTCFromSrc(Boolean value) {
        this.mIsTCFromSrc = value;
    }

    /**
     * 获取mLatestPrintedDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMLatestPrintedDate() {
        return mLatestPrintedDate;
    }

    /**
     * 设置mLatestPrintedDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMLatestPrintedDate(XMLGregorianCalendar value) {
        this.mLatestPrintedDate = value;
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
     * 获取mOrgCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMOrgCode() {
        return mOrgCode;
    }

    /**
     * 设置mOrgCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMOrgCode(JAXBElement<String> value) {
        this.mOrgCode = value;
    }

    /**
     * 获取mPayer属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOSCMSupplierSupplierMISCInfoData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9CBOSCMSupplierSupplierMISCInfoData> getMPayer() {
        return mPayer;
    }

    /**
     * 设置mPayer属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOSCMSupplierSupplierMISCInfoData }{@code >}
     *     
     */
    public void setMPayer(JAXBElement<UFIDAU9CBOSCMSupplierSupplierMISCInfoData> value) {
        this.mPayer = value;
    }

    /**
     * 获取mPayerSite属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOSCMSupplierSupplierSiteMISCInfoData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9CBOSCMSupplierSupplierSiteMISCInfoData> getMPayerSite() {
        return mPayerSite;
    }

    /**
     * 设置mPayerSite属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOSCMSupplierSupplierSiteMISCInfoData }{@code >}
     *     
     */
    public void setMPayerSite(JAXBElement<UFIDAU9CBOSCMSupplierSupplierSiteMISCInfoData> value) {
        this.mPayerSite = value;
    }

    /**
     * 获取mPaymentBill属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMPaymentBill() {
        return mPaymentBill;
    }

    /**
     * 设置mPaymentBill属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMPaymentBill(Long value) {
        this.mPaymentBill = value;
    }

    /**
     * 获取mPaymentBillLine属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMPaymentBillLine() {
        return mPaymentBillLine;
    }

    /**
     * 设置mPaymentBillLine属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMPaymentBillLine(Long value) {
        this.mPaymentBillLine = value;
    }

    /**
     * 获取mPaymentBillLineNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMPaymentBillLineNo() {
        return mPaymentBillLineNo;
    }

    /**
     * 设置mPaymentBillLineNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMPaymentBillLineNo(Integer value) {
        this.mPaymentBillLineNo = value;
    }

    /**
     * 获取mPaymentBillNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMPaymentBillNo() {
        return mPaymentBillNo;
    }

    /**
     * 设置mPaymentBillNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMPaymentBillNo(JAXBElement<String> value) {
        this.mPaymentBillNo = value;
    }

    /**
     * 获取mPaymentCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMPaymentCode() {
        return mPaymentCode;
    }

    /**
     * 设置mPaymentCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMPaymentCode(JAXBElement<String> value) {
        this.mPaymentCode = value;
    }

    /**
     * 获取mPaymentTerm属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9PMDTOsBESimp4UIDTOData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9PMDTOsBESimp4UIDTOData> getMPaymentTerm() {
        return mPaymentTerm;
    }

    /**
     * 设置mPaymentTerm属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9PMDTOsBESimp4UIDTOData }{@code >}
     *     
     */
    public void setMPaymentTerm(JAXBElement<UFIDAU9PMDTOsBESimp4UIDTOData> value) {
        this.mPaymentTerm = value;
    }

    /**
     * 获取mPrepayPolicy属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9PMDTOsBESimp4UIDTOData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9PMDTOsBESimp4UIDTOData> getMPrepayPolicy() {
        return mPrepayPolicy;
    }

    /**
     * 设置mPrepayPolicy属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9PMDTOsBESimp4UIDTOData }{@code >}
     *     
     */
    public void setMPrepayPolicy(JAXBElement<UFIDAU9PMDTOsBESimp4UIDTOData> value) {
        this.mPrepayPolicy = value;
    }

    /**
     * 获取mPriceList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9PMDTOsBESimp4UIDTOData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9PMDTOsBESimp4UIDTOData> getMPriceList() {
        return mPriceList;
    }

    /**
     * 设置mPriceList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9PMDTOsBESimp4UIDTOData }{@code >}
     *     
     */
    public void setMPriceList(JAXBElement<UFIDAU9PMDTOsBESimp4UIDTOData> value) {
        this.mPriceList = value;
    }

    /**
     * 获取mPrintAmount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMPrintAmount() {
        return mPrintAmount;
    }

    /**
     * 设置mPrintAmount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMPrintAmount(Integer value) {
        this.mPrintAmount = value;
    }

    /**
     * 获取mPurOrg属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9PMDTOsBESimp4UIDTOData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9PMDTOsBESimp4UIDTOData> getMPurOrg() {
        return mPurOrg;
    }

    /**
     * 设置mPurOrg属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9PMDTOsBESimp4UIDTOData }{@code >}
     *     
     */
    public void setMPurOrg(JAXBElement<UFIDAU9PMDTOsBESimp4UIDTOData> value) {
        this.mPurOrg = value;
    }

    /**
     * 获取mRcvAddress属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUFIDAU9ISVRCVDTOOBARcvAddressDTOData }{@code >}
     *     
     */
    public JAXBElement<ArrayOfUFIDAU9ISVRCVDTOOBARcvAddressDTOData> getMRcvAddress() {
        return mRcvAddress;
    }

    /**
     * 设置mRcvAddress属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUFIDAU9ISVRCVDTOOBARcvAddressDTOData }{@code >}
     *     
     */
    public void setMRcvAddress(JAXBElement<ArrayOfUFIDAU9ISVRCVDTOOBARcvAddressDTOData> value) {
        this.mRcvAddress = value;
    }

    /**
     * 获取mRcvBy属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9PMDTOsBESimp4UIDTOData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9PMDTOsBESimp4UIDTOData> getMRcvBy() {
        return mRcvBy;
    }

    /**
     * 设置mRcvBy属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9PMDTOsBESimp4UIDTOData }{@code >}
     *     
     */
    public void setMRcvBy(JAXBElement<UFIDAU9PMDTOsBESimp4UIDTOData> value) {
        this.mRcvBy = value;
    }

    /**
     * 获取mRcvContacts属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUFIDAU9ISVRCVDTOOBARcvContactDTOData }{@code >}
     *     
     */
    public JAXBElement<ArrayOfUFIDAU9ISVRCVDTOOBARcvContactDTOData> getMRcvContacts() {
        return mRcvContacts;
    }

    /**
     * 设置mRcvContacts属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUFIDAU9ISVRCVDTOOBARcvContactDTOData }{@code >}
     *     
     */
    public void setMRcvContacts(JAXBElement<ArrayOfUFIDAU9ISVRCVDTOOBARcvContactDTOData> value) {
        this.mRcvContacts = value;
    }

    /**
     * 获取mRcvDiscount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUFIDAU9ISVRCVDTOOBARcvDiscountDTOData }{@code >}
     *     
     */
    public JAXBElement<ArrayOfUFIDAU9ISVRCVDTOOBARcvDiscountDTOData> getMRcvDiscount() {
        return mRcvDiscount;
    }

    /**
     * 设置mRcvDiscount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUFIDAU9ISVRCVDTOOBARcvDiscountDTOData }{@code >}
     *     
     */
    public void setMRcvDiscount(JAXBElement<ArrayOfUFIDAU9ISVRCVDTOOBARcvDiscountDTOData> value) {
        this.mRcvDiscount = value;
    }

    /**
     * 获取mRcvDocType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9PMDTOsBESimp4UIDTOData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9PMDTOsBESimp4UIDTOData> getMRcvDocType() {
        return mRcvDocType;
    }

    /**
     * 设置mRcvDocType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9PMDTOsBESimp4UIDTOData }{@code >}
     *     
     */
    public void setMRcvDocType(JAXBElement<UFIDAU9PMDTOsBESimp4UIDTOData> value) {
        this.mRcvDocType = value;
    }

    /**
     * 获取mRcvFees属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUFIDAU9ISVRCVDTOOBARcvFeeDTOData }{@code >}
     *     
     */
    public JAXBElement<ArrayOfUFIDAU9ISVRCVDTOOBARcvFeeDTOData> getMRcvFees() {
        return mRcvFees;
    }

    /**
     * 设置mRcvFees属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUFIDAU9ISVRCVDTOOBARcvFeeDTOData }{@code >}
     *     
     */
    public void setMRcvFees(JAXBElement<ArrayOfUFIDAU9ISVRCVDTOOBARcvFeeDTOData> value) {
        this.mRcvFees = value;
    }

    /**
     * 获取mRcvLines属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUFIDAU9ISVRCVDTOOBARcvLineDTOData }{@code >}
     *     
     */
    public JAXBElement<ArrayOfUFIDAU9ISVRCVDTOOBARcvLineDTOData> getMRcvLines() {
        return mRcvLines;
    }

    /**
     * 设置mRcvLines属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUFIDAU9ISVRCVDTOOBARcvLineDTOData }{@code >}
     *     
     */
    public void setMRcvLines(JAXBElement<ArrayOfUFIDAU9ISVRCVDTOOBARcvLineDTOData> value) {
        this.mRcvLines = value;
    }

    /**
     * 获取mRcvTax属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUFIDAU9ISVRCVDTOOBARcvTaxDTOData }{@code >}
     *     
     */
    public JAXBElement<ArrayOfUFIDAU9ISVRCVDTOOBARcvTaxDTOData> getMRcvTax() {
        return mRcvTax;
    }

    /**
     * 设置mRcvTax属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUFIDAU9ISVRCVDTOOBARcvTaxDTOData }{@code >}
     *     
     */
    public void setMRcvTax(JAXBElement<ArrayOfUFIDAU9ISVRCVDTOOBARcvTaxDTOData> value) {
        this.mRcvTax = value;
    }

    /**
     * 获取mReceivementType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMReceivementType() {
        return mReceivementType;
    }

    /**
     * 设置mReceivementType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMReceivementType(Integer value) {
        this.mReceivementType = value;
    }

    /**
     * 获取mRejectMode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMRejectMode() {
        return mRejectMode;
    }

    /**
     * 设置mRejectMode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMRejectMode(Integer value) {
        this.mRejectMode = value;
    }

    /**
     * 获取mRtnCustomer属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOSCMCustomerCustomerMISCInfoData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9CBOSCMCustomerCustomerMISCInfoData> getMRtnCustomer() {
        return mRtnCustomer;
    }

    /**
     * 设置mRtnCustomer属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOSCMCustomerCustomerMISCInfoData }{@code >}
     *     
     */
    public void setMRtnCustomer(JAXBElement<UFIDAU9CBOSCMCustomerCustomerMISCInfoData> value) {
        this.mRtnCustomer = value;
    }

    /**
     * 获取mRtnType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMRtnType() {
        return mRtnType;
    }

    /**
     * 设置mRtnType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMRtnType(Integer value) {
        this.mRtnType = value;
    }

    /**
     * 获取msobPostPeriod属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUFIDAU9ISVRCVDTOOBASOBPostPeriodDTOData }{@code >}
     *     
     */
    public JAXBElement<ArrayOfUFIDAU9ISVRCVDTOOBASOBPostPeriodDTOData> getMSOBPostPeriod() {
        return msobPostPeriod;
    }

    /**
     * 设置msobPostPeriod属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUFIDAU9ISVRCVDTOOBASOBPostPeriodDTOData }{@code >}
     *     
     */
    public void setMSOBPostPeriod(JAXBElement<ArrayOfUFIDAU9ISVRCVDTOOBASOBPostPeriodDTOData> value) {
        this.msobPostPeriod = value;
    }

    /**
     * 获取mShipID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMShipID() {
        return mShipID;
    }

    /**
     * 设置mShipID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMShipID(Long value) {
        this.mShipID = value;
    }

    /**
     * 获取mShipOrg属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9PMDTOsBESimp4UIDTOData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9PMDTOsBESimp4UIDTOData> getMShipOrg() {
        return mShipOrg;
    }

    /**
     * 设置mShipOrg属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9PMDTOsBESimp4UIDTOData }{@code >}
     *     
     */
    public void setMShipOrg(JAXBElement<UFIDAU9PMDTOsBESimp4UIDTOData> value) {
        this.mShipOrg = value;
    }

    /**
     * 获取mSrcDocType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMSrcDocType() {
        return mSrcDocType;
    }

    /**
     * 设置mSrcDocType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMSrcDocType(Integer value) {
        this.mSrcDocType = value;
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
     * 获取mtc属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9PMDTOsBESimp4UIDTOData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9PMDTOsBESimp4UIDTOData> getMTC() {
        return mtc;
    }

    /**
     * 设置mtc属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9PMDTOsBESimp4UIDTOData }{@code >}
     *     
     */
    public void setMTC(JAXBElement<UFIDAU9PMDTOsBESimp4UIDTOData> value) {
        this.mtc = value;
    }

    /**
     * 获取mtcToACExRate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMTCToACExRate() {
        return mtcToACExRate;
    }

    /**
     * 设置mtcToACExRate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMTCToACExRate(BigDecimal value) {
        this.mtcToACExRate = value;
    }

    /**
     * 获取mtcToACExRateType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMTCToACExRateType() {
        return mtcToACExRateType;
    }

    /**
     * 设置mtcToACExRateType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMTCToACExRateType(Integer value) {
        this.mtcToACExRateType = value;
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

    /**
     * 获取mTaxSchedule属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9PMDTOsBESimp4UIDTOData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9PMDTOsBESimp4UIDTOData> getMTaxSchedule() {
        return mTaxSchedule;
    }

    /**
     * 设置mTaxSchedule属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9PMDTOsBESimp4UIDTOData }{@code >}
     *     
     */
    public void setMTaxSchedule(JAXBElement<UFIDAU9PMDTOsBESimp4UIDTOData> value) {
        this.mTaxSchedule = value;
    }

    /**
     * 获取mVersion属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMVersion() {
        return mVersion;
    }

    /**
     * 设置mVersion属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMVersion(Integer value) {
        this.mVersion = value;
    }

}
