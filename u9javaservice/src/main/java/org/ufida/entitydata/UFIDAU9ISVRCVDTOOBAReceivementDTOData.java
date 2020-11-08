
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
 * &lt;p&gt;UFIDA.U9.ISV.RCV.DTO.OBAReceivementDTOData complex type�� Java �ࡣ
 * 
 * &lt;p&gt;����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡapBillNo���Ե�ֵ��
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
     * ����apBillNo���Ե�ֵ��
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
     * ��ȡcarrier���Ե�ֵ��
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
     * ����carrier���Ե�ֵ��
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
     * ��ȡcontainerNO���Ե�ֵ��
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
     * ����containerNO���Ե�ֵ��
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
     * ��ȡdeliverBillNo���Ե�ֵ��
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
     * ����deliverBillNo���Ե�ֵ��
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
     * ��ȡmultiAPBillNo���Ե�ֵ��
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
     * ����multiAPBillNo���Ե�ֵ��
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
     * ��ȡmultiCarrier���Ե�ֵ��
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
     * ����multiCarrier���Ե�ֵ��
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
     * ��ȡmultiContainerNO���Ե�ֵ��
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
     * ����multiContainerNO���Ե�ֵ��
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
     * ��ȡmultiDeliverBillNo���Ե�ֵ��
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
     * ����multiDeliverBillNo���Ե�ֵ��
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
     * ��ȡmultiVehicleNo���Ե�ֵ��
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
     * ����multiVehicleNo���Ե�ֵ��
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
     * ��ȡpostPeriod���Ե�ֵ��
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
     * ����postPeriod���Ե�ֵ��
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
     * ��ȡpostPeriodSKey���Ե�ֵ��
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
     * ����postPeriodSKey���Ե�ֵ��
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
     * ��ȡvehicleNo���Ե�ֵ��
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
     * ����vehicleNo���Ե�ֵ��
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
     * ��ȡmac���Ե�ֵ��
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
     * ����mac���Ե�ֵ��
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
     * ��ȡmacToFCExRate���Ե�ֵ��
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
     * ����macToFCExRate���Ե�ֵ��
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
     * ��ȡmapBill���Ե�ֵ��
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
     * ����mapBill���Ե�ֵ��
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
     * ��ȡmapBillLine���Ե�ֵ��
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
     * ����mapBillLine���Ե�ֵ��
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
     * ��ȡmapBillLineNo���Ե�ֵ��
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
     * ����mapBillLineNo���Ե�ֵ��
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
     * ��ȡmapMny���Ե�ֵ��
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
     * ����mapMny���Ե�ֵ��
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
     * ��ȡmAccountOrg���Ե�ֵ��
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
     * ����mAccountOrg���Ե�ֵ��
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
     * ��ȡmBalanceOrg���Ե�ֵ��
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
     * ����mBalanceOrg���Ե�ֵ��
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
     * ��ȡmBizType���Ե�ֵ��
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
     * ����mBizType���Ե�ֵ��
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
     * ��ȡmBusinessDate���Ե�ֵ��
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
     * ����mBusinessDate���Ե�ֵ��
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
     * ��ȡmConfirmMode���Ե�ֵ��
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
     * ����mConfirmMode���Ե�ֵ��
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
     * ��ȡmConfirmTerm���Ե�ֵ��
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
     * ����mConfirmTerm���Ե�ֵ��
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
     * ��ȡmCurOperationNO���Ե�ֵ��
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
     * ����mCurOperationNO���Ե�ֵ��
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
     * ��ȡmDisusedBy���Ե�ֵ��
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
     * ����mDisusedBy���Ե�ֵ��
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
     * ��ȡmDisusedDate���Ե�ֵ��
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
     * ����mDisusedDate���Ե�ֵ��
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
     * ��ȡmDisusedReason���Ե�ֵ��
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
     * ����mDisusedReason���Ե�ֵ��
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
     * ��ȡmDocNo���Ե�ֵ��
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
     * ����mDocNo���Ե�ֵ��
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
     * ��ȡmExecutedAPMny���Ե�ֵ��
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
     * ����mExecutedAPMny���Ե�ֵ��
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
     * ��ȡmfc���Ե�ֵ��
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
     * ����mfc���Ե�ֵ��
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
     * ��ȡmFindPriceDate���Ե�ֵ��
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
     * ����mFindPriceDate���Ե�ֵ��
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
     * ��ȡmHeadFeeAC���Ե�ֵ��
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
     * ����mHeadFeeAC���Ե�ֵ��
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
     * ��ȡmHeadFeeFC���Ե�ֵ��
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
     * ����mHeadFeeFC���Ե�ֵ��
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
     * ��ȡmHeadFeeTC���Ե�ֵ��
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
     * ����mHeadFeeTC���Ե�ֵ��
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
     * ��ȡmIsACFromSrc���Ե�ֵ��
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
     * ����mIsACFromSrc���Ե�ֵ��
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
     * ��ȡmIsBizClose���Ե�ֵ��
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
     * ����mIsBizClose���Ե�ֵ��
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
     * ��ȡmIsConfirmTermChangeable���Ե�ֵ��
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
     * ����mIsConfirmTermChangeable���Ե�ֵ��
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
     * ��ȡmIsDisused���Ե�ֵ��
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
     * ����mIsDisused���Ե�ֵ��
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
     * ��ȡmIsExchRateType���Ե�ֵ��
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
     * ����mIsExchRateType���Ե�ֵ��
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
     * ��ȡmIsInitEvaluation���Ե�ֵ��
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
     * ����mIsInitEvaluation���Ե�ֵ��
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
     * ��ȡmIsLineApprove���Ե�ֵ��
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
     * ����mIsLineApprove���Ե�ֵ��
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
     * ��ȡmIsMatchPO���Ե�ֵ��
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
     * ����mIsMatchPO���Ե�ֵ��
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
     * ��ȡmIsPaymentTermChangeable���Ե�ֵ��
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
     * ����mIsPaymentTermChangeable���Ե�ֵ��
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
     * ��ȡmIsPriceIncludeTax���Ե�ֵ��
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
     * ����mIsPriceIncludeTax���Ե�ֵ��
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
     * ��ȡmIsPriceListChangeable���Ե�ֵ��
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
     * ����mIsPriceListChangeable���Ե�ֵ��
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
     * ��ȡmIsProcessAssChild���Ե�ֵ��
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
     * ����mIsProcessAssChild���Ե�ֵ��
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
     * ��ȡmIsProcessTrade���Ե�ֵ��
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
     * ����mIsProcessTrade���Ե�ֵ��
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
     * ��ȡmIsRcvByChangeable���Ե�ֵ��
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
     * ����mIsRcvByChangeable���Ե�ֵ��
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
     * ��ȡmIsRelationCompany���Ե�ֵ��
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
     * ����mIsRelationCompany���Ե�ֵ��
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
     * ��ȡmIsTCFromSrc���Ե�ֵ��
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
     * ����mIsTCFromSrc���Ե�ֵ��
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
     * ��ȡmLatestPrintedDate���Ե�ֵ��
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
     * ����mLatestPrintedDate���Ե�ֵ��
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
     * ��ȡmOrgCode���Ե�ֵ��
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
     * ����mOrgCode���Ե�ֵ��
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
     * ��ȡmPayer���Ե�ֵ��
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
     * ����mPayer���Ե�ֵ��
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
     * ��ȡmPayerSite���Ե�ֵ��
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
     * ����mPayerSite���Ե�ֵ��
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
     * ��ȡmPaymentBill���Ե�ֵ��
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
     * ����mPaymentBill���Ե�ֵ��
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
     * ��ȡmPaymentBillLine���Ե�ֵ��
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
     * ����mPaymentBillLine���Ե�ֵ��
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
     * ��ȡmPaymentBillLineNo���Ե�ֵ��
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
     * ����mPaymentBillLineNo���Ե�ֵ��
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
     * ��ȡmPaymentBillNo���Ե�ֵ��
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
     * ����mPaymentBillNo���Ե�ֵ��
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
     * ��ȡmPaymentCode���Ե�ֵ��
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
     * ����mPaymentCode���Ե�ֵ��
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
     * ��ȡmPaymentTerm���Ե�ֵ��
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
     * ����mPaymentTerm���Ե�ֵ��
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
     * ��ȡmPrepayPolicy���Ե�ֵ��
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
     * ����mPrepayPolicy���Ե�ֵ��
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
     * ��ȡmPriceList���Ե�ֵ��
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
     * ����mPriceList���Ե�ֵ��
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
     * ��ȡmPrintAmount���Ե�ֵ��
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
     * ����mPrintAmount���Ե�ֵ��
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
     * ��ȡmPurOrg���Ե�ֵ��
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
     * ����mPurOrg���Ե�ֵ��
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
     * ��ȡmRcvAddress���Ե�ֵ��
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
     * ����mRcvAddress���Ե�ֵ��
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
     * ��ȡmRcvBy���Ե�ֵ��
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
     * ����mRcvBy���Ե�ֵ��
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
     * ��ȡmRcvContacts���Ե�ֵ��
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
     * ����mRcvContacts���Ե�ֵ��
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
     * ��ȡmRcvDiscount���Ե�ֵ��
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
     * ����mRcvDiscount���Ե�ֵ��
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
     * ��ȡmRcvDocType���Ե�ֵ��
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
     * ����mRcvDocType���Ե�ֵ��
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
     * ��ȡmRcvFees���Ե�ֵ��
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
     * ����mRcvFees���Ե�ֵ��
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
     * ��ȡmRcvLines���Ե�ֵ��
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
     * ����mRcvLines���Ե�ֵ��
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
     * ��ȡmRcvTax���Ե�ֵ��
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
     * ����mRcvTax���Ե�ֵ��
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
     * ��ȡmReceivementType���Ե�ֵ��
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
     * ����mReceivementType���Ե�ֵ��
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
     * ��ȡmRejectMode���Ե�ֵ��
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
     * ����mRejectMode���Ե�ֵ��
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
     * ��ȡmRtnCustomer���Ե�ֵ��
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
     * ����mRtnCustomer���Ե�ֵ��
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
     * ��ȡmRtnType���Ե�ֵ��
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
     * ����mRtnType���Ե�ֵ��
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
     * ��ȡmsobPostPeriod���Ե�ֵ��
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
     * ����msobPostPeriod���Ե�ֵ��
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
     * ��ȡmShipID���Ե�ֵ��
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
     * ����mShipID���Ե�ֵ��
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
     * ��ȡmShipOrg���Ե�ֵ��
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
     * ����mShipOrg���Ե�ֵ��
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
     * ��ȡmSrcDocType���Ե�ֵ��
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
     * ����mSrcDocType���Ե�ֵ��
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
     * ��ȡmtc���Ե�ֵ��
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
     * ����mtc���Ե�ֵ��
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
     * ��ȡmtcToACExRate���Ե�ֵ��
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
     * ����mtcToACExRate���Ե�ֵ��
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
     * ��ȡmtcToACExRateType���Ե�ֵ��
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
     * ����mtcToACExRateType���Ե�ֵ��
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

    /**
     * ��ȡmTaxSchedule���Ե�ֵ��
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
     * ����mTaxSchedule���Ե�ֵ��
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
     * ��ȡmVersion���Ե�ֵ��
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
     * ����mVersion���Ե�ֵ��
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
