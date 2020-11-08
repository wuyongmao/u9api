
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
 * &lt;p&gt;UFIDA.U9.ISV.RCV.DTO.OBARcvFeeDTOData complex type�� Java �ࡣ
 * 
 * &lt;p&gt;����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="UFIDA.U9.ISV.RCV.DTO.OBARcvFeeDTOData"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://www.UFIDA.org/EntityData}UFSoft.UBF.Business.DataTransObjectBase"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="m_createdBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_createdOn" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_feeAmountAC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_feeAmountFC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_feeAmountFeeC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_feeAmountTC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_feeC" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.PM.DTOs.BESimp4UIDTOData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_feeCToACRate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_feeCToACRateRound" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_feeCToFCRate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_feeCToFCRateRound" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_feeCToTCRate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_feeCToTCRateRound" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_feeLineNo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_feeTaxAC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_feeTaxFC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_feeTaxFeeC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_feeTaxTC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_feeType" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.PM.DTOs.BESimp4UIDTOData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_iD" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isAllocated" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_modifiedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_modifiedOn" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_netFeeAC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_netFeeFC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_netFeeFeeC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_netFeeTC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_oBARcvLineDTO" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.ISV.RCV.DTO.OBARcvLineDTOData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_oBAReceivementDTO" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.ISV.RCV.DTO.OBAReceivementDTOData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_parent" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.PM.Rcv.RcvFeeData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_rcvLine" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.PM.Rcv.RcvLineData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_rcvLineDispense" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.PM.Rcv.RcvLineDispenseData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_receivement" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.PM.Rcv.ReceivementData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_sysVersion" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
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
@XmlType(name = "UFIDA.U9.ISV.RCV.DTO.OBARcvFeeDTOData", propOrder = {
    "mCreatedBy",
    "mCreatedOn",
    "mFeeAmountAC",
    "mFeeAmountFC",
    "mFeeAmountFeeC",
    "mFeeAmountTC",
    "mFeeC",
    "mFeeCToACRate",
    "mFeeCToACRateRound",
    "mFeeCToFCRate",
    "mFeeCToFCRateRound",
    "mFeeCToTCRate",
    "mFeeCToTCRateRound",
    "mFeeLineNo",
    "mFeeTaxAC",
    "mFeeTaxFC",
    "mFeeTaxFeeC",
    "mFeeTaxTC",
    "mFeeType",
    "mid",
    "mIsAllocated",
    "mModifiedBy",
    "mModifiedOn",
    "mNetFeeAC",
    "mNetFeeFC",
    "mNetFeeFeeC",
    "mNetFeeTC",
    "mobaRcvLineDTO",
    "mobaReceivementDTO",
    "mParent",
    "mRcvLine",
    "mRcvLineDispense",
    "mReceivement",
    "mSysVersion",
    "mTaxRate"
})
public class UFIDAU9ISVRCVDTOOBARcvFeeDTOData
    extends UFSoftUBFBusinessDataTransObjectBase
{

    @XmlElementRef(name = "m_createdBy", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mCreatedBy;
    @XmlElement(name = "m_createdOn")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mCreatedOn;
    @XmlElement(name = "m_feeAmountAC")
    protected BigDecimal mFeeAmountAC;
    @XmlElement(name = "m_feeAmountFC")
    protected BigDecimal mFeeAmountFC;
    @XmlElement(name = "m_feeAmountFeeC")
    protected BigDecimal mFeeAmountFeeC;
    @XmlElement(name = "m_feeAmountTC")
    protected BigDecimal mFeeAmountTC;
    @XmlElementRef(name = "m_feeC", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9PMDTOsBESimp4UIDTOData> mFeeC;
    @XmlElement(name = "m_feeCToACRate")
    protected BigDecimal mFeeCToACRate;
    @XmlElement(name = "m_feeCToACRateRound")
    protected Integer mFeeCToACRateRound;
    @XmlElement(name = "m_feeCToFCRate")
    protected BigDecimal mFeeCToFCRate;
    @XmlElement(name = "m_feeCToFCRateRound")
    protected Integer mFeeCToFCRateRound;
    @XmlElement(name = "m_feeCToTCRate")
    protected BigDecimal mFeeCToTCRate;
    @XmlElement(name = "m_feeCToTCRateRound")
    protected Integer mFeeCToTCRateRound;
    @XmlElement(name = "m_feeLineNo")
    protected Integer mFeeLineNo;
    @XmlElement(name = "m_feeTaxAC")
    protected BigDecimal mFeeTaxAC;
    @XmlElement(name = "m_feeTaxFC")
    protected BigDecimal mFeeTaxFC;
    @XmlElement(name = "m_feeTaxFeeC")
    protected BigDecimal mFeeTaxFeeC;
    @XmlElement(name = "m_feeTaxTC")
    protected BigDecimal mFeeTaxTC;
    @XmlElementRef(name = "m_feeType", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9PMDTOsBESimp4UIDTOData> mFeeType;
    @XmlElement(name = "m_iD")
    protected Long mid;
    @XmlElement(name = "m_isAllocated")
    protected Boolean mIsAllocated;
    @XmlElementRef(name = "m_modifiedBy", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mModifiedBy;
    @XmlElement(name = "m_modifiedOn")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mModifiedOn;
    @XmlElement(name = "m_netFeeAC")
    protected BigDecimal mNetFeeAC;
    @XmlElement(name = "m_netFeeFC")
    protected BigDecimal mNetFeeFC;
    @XmlElement(name = "m_netFeeFeeC")
    protected BigDecimal mNetFeeFeeC;
    @XmlElement(name = "m_netFeeTC")
    protected BigDecimal mNetFeeTC;
    @XmlElementRef(name = "m_oBARcvLineDTO", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9ISVRCVDTOOBARcvLineDTOData> mobaRcvLineDTO;
    @XmlElementRef(name = "m_oBAReceivementDTO", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9ISVRCVDTOOBAReceivementDTOData> mobaReceivementDTO;
    @XmlElementRef(name = "m_parent", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9PMRcvRcvFeeData> mParent;
    @XmlElementRef(name = "m_rcvLine", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9PMRcvRcvLineData> mRcvLine;
    @XmlElementRef(name = "m_rcvLineDispense", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9PMRcvRcvLineDispenseData> mRcvLineDispense;
    @XmlElementRef(name = "m_receivement", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9PMRcvReceivementData> mReceivement;
    @XmlElement(name = "m_sysVersion")
    protected Long mSysVersion;
    @XmlElement(name = "m_taxRate")
    protected BigDecimal mTaxRate;

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
     * ��ȡmFeeAmountAC���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMFeeAmountAC() {
        return mFeeAmountAC;
    }

    /**
     * ����mFeeAmountAC���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMFeeAmountAC(BigDecimal value) {
        this.mFeeAmountAC = value;
    }

    /**
     * ��ȡmFeeAmountFC���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMFeeAmountFC() {
        return mFeeAmountFC;
    }

    /**
     * ����mFeeAmountFC���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMFeeAmountFC(BigDecimal value) {
        this.mFeeAmountFC = value;
    }

    /**
     * ��ȡmFeeAmountFeeC���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMFeeAmountFeeC() {
        return mFeeAmountFeeC;
    }

    /**
     * ����mFeeAmountFeeC���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMFeeAmountFeeC(BigDecimal value) {
        this.mFeeAmountFeeC = value;
    }

    /**
     * ��ȡmFeeAmountTC���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMFeeAmountTC() {
        return mFeeAmountTC;
    }

    /**
     * ����mFeeAmountTC���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMFeeAmountTC(BigDecimal value) {
        this.mFeeAmountTC = value;
    }

    /**
     * ��ȡmFeeC���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9PMDTOsBESimp4UIDTOData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9PMDTOsBESimp4UIDTOData> getMFeeC() {
        return mFeeC;
    }

    /**
     * ����mFeeC���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9PMDTOsBESimp4UIDTOData }{@code >}
     *     
     */
    public void setMFeeC(JAXBElement<UFIDAU9PMDTOsBESimp4UIDTOData> value) {
        this.mFeeC = value;
    }

    /**
     * ��ȡmFeeCToACRate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMFeeCToACRate() {
        return mFeeCToACRate;
    }

    /**
     * ����mFeeCToACRate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMFeeCToACRate(BigDecimal value) {
        this.mFeeCToACRate = value;
    }

    /**
     * ��ȡmFeeCToACRateRound���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMFeeCToACRateRound() {
        return mFeeCToACRateRound;
    }

    /**
     * ����mFeeCToACRateRound���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMFeeCToACRateRound(Integer value) {
        this.mFeeCToACRateRound = value;
    }

    /**
     * ��ȡmFeeCToFCRate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMFeeCToFCRate() {
        return mFeeCToFCRate;
    }

    /**
     * ����mFeeCToFCRate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMFeeCToFCRate(BigDecimal value) {
        this.mFeeCToFCRate = value;
    }

    /**
     * ��ȡmFeeCToFCRateRound���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMFeeCToFCRateRound() {
        return mFeeCToFCRateRound;
    }

    /**
     * ����mFeeCToFCRateRound���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMFeeCToFCRateRound(Integer value) {
        this.mFeeCToFCRateRound = value;
    }

    /**
     * ��ȡmFeeCToTCRate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMFeeCToTCRate() {
        return mFeeCToTCRate;
    }

    /**
     * ����mFeeCToTCRate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMFeeCToTCRate(BigDecimal value) {
        this.mFeeCToTCRate = value;
    }

    /**
     * ��ȡmFeeCToTCRateRound���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMFeeCToTCRateRound() {
        return mFeeCToTCRateRound;
    }

    /**
     * ����mFeeCToTCRateRound���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMFeeCToTCRateRound(Integer value) {
        this.mFeeCToTCRateRound = value;
    }

    /**
     * ��ȡmFeeLineNo���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMFeeLineNo() {
        return mFeeLineNo;
    }

    /**
     * ����mFeeLineNo���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMFeeLineNo(Integer value) {
        this.mFeeLineNo = value;
    }

    /**
     * ��ȡmFeeTaxAC���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMFeeTaxAC() {
        return mFeeTaxAC;
    }

    /**
     * ����mFeeTaxAC���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMFeeTaxAC(BigDecimal value) {
        this.mFeeTaxAC = value;
    }

    /**
     * ��ȡmFeeTaxFC���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMFeeTaxFC() {
        return mFeeTaxFC;
    }

    /**
     * ����mFeeTaxFC���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMFeeTaxFC(BigDecimal value) {
        this.mFeeTaxFC = value;
    }

    /**
     * ��ȡmFeeTaxFeeC���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMFeeTaxFeeC() {
        return mFeeTaxFeeC;
    }

    /**
     * ����mFeeTaxFeeC���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMFeeTaxFeeC(BigDecimal value) {
        this.mFeeTaxFeeC = value;
    }

    /**
     * ��ȡmFeeTaxTC���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMFeeTaxTC() {
        return mFeeTaxTC;
    }

    /**
     * ����mFeeTaxTC���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMFeeTaxTC(BigDecimal value) {
        this.mFeeTaxTC = value;
    }

    /**
     * ��ȡmFeeType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9PMDTOsBESimp4UIDTOData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9PMDTOsBESimp4UIDTOData> getMFeeType() {
        return mFeeType;
    }

    /**
     * ����mFeeType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9PMDTOsBESimp4UIDTOData }{@code >}
     *     
     */
    public void setMFeeType(JAXBElement<UFIDAU9PMDTOsBESimp4UIDTOData> value) {
        this.mFeeType = value;
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
     * ��ȡmIsAllocated���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsAllocated() {
        return mIsAllocated;
    }

    /**
     * ����mIsAllocated���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsAllocated(Boolean value) {
        this.mIsAllocated = value;
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
     * ��ȡmNetFeeAC���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMNetFeeAC() {
        return mNetFeeAC;
    }

    /**
     * ����mNetFeeAC���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMNetFeeAC(BigDecimal value) {
        this.mNetFeeAC = value;
    }

    /**
     * ��ȡmNetFeeFC���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMNetFeeFC() {
        return mNetFeeFC;
    }

    /**
     * ����mNetFeeFC���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMNetFeeFC(BigDecimal value) {
        this.mNetFeeFC = value;
    }

    /**
     * ��ȡmNetFeeFeeC���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMNetFeeFeeC() {
        return mNetFeeFeeC;
    }

    /**
     * ����mNetFeeFeeC���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMNetFeeFeeC(BigDecimal value) {
        this.mNetFeeFeeC = value;
    }

    /**
     * ��ȡmNetFeeTC���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMNetFeeTC() {
        return mNetFeeTC;
    }

    /**
     * ����mNetFeeTC���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMNetFeeTC(BigDecimal value) {
        this.mNetFeeTC = value;
    }

    /**
     * ��ȡmobaRcvLineDTO���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9ISVRCVDTOOBARcvLineDTOData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9ISVRCVDTOOBARcvLineDTOData> getMOBARcvLineDTO() {
        return mobaRcvLineDTO;
    }

    /**
     * ����mobaRcvLineDTO���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9ISVRCVDTOOBARcvLineDTOData }{@code >}
     *     
     */
    public void setMOBARcvLineDTO(JAXBElement<UFIDAU9ISVRCVDTOOBARcvLineDTOData> value) {
        this.mobaRcvLineDTO = value;
    }

    /**
     * ��ȡmobaReceivementDTO���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9ISVRCVDTOOBAReceivementDTOData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9ISVRCVDTOOBAReceivementDTOData> getMOBAReceivementDTO() {
        return mobaReceivementDTO;
    }

    /**
     * ����mobaReceivementDTO���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9ISVRCVDTOOBAReceivementDTOData }{@code >}
     *     
     */
    public void setMOBAReceivementDTO(JAXBElement<UFIDAU9ISVRCVDTOOBAReceivementDTOData> value) {
        this.mobaReceivementDTO = value;
    }

    /**
     * ��ȡmParent���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9PMRcvRcvFeeData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9PMRcvRcvFeeData> getMParent() {
        return mParent;
    }

    /**
     * ����mParent���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9PMRcvRcvFeeData }{@code >}
     *     
     */
    public void setMParent(JAXBElement<UFIDAU9PMRcvRcvFeeData> value) {
        this.mParent = value;
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
     * ��ȡmRcvLineDispense���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9PMRcvRcvLineDispenseData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9PMRcvRcvLineDispenseData> getMRcvLineDispense() {
        return mRcvLineDispense;
    }

    /**
     * ����mRcvLineDispense���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9PMRcvRcvLineDispenseData }{@code >}
     *     
     */
    public void setMRcvLineDispense(JAXBElement<UFIDAU9PMRcvRcvLineDispenseData> value) {
        this.mRcvLineDispense = value;
    }

    /**
     * ��ȡmReceivement���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9PMRcvReceivementData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9PMRcvReceivementData> getMReceivement() {
        return mReceivement;
    }

    /**
     * ����mReceivement���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9PMRcvReceivementData }{@code >}
     *     
     */
    public void setMReceivement(JAXBElement<UFIDAU9PMRcvReceivementData> value) {
        this.mReceivement = value;
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
