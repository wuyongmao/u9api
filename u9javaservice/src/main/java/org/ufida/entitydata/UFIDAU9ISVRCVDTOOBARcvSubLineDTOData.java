
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
 * &lt;p&gt;UFIDA.U9.ISV.RCV.DTO.OBARcvSubLineDTOData complex type�� Java �ࡣ
 * 
 * &lt;p&gt;����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="UFIDA.U9.ISV.RCV.DTO.OBARcvSubLineDTOData"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://www.UFIDA.org/EntityData}UFSoft.UBF.Business.DataTransObjectBase"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="m_acceptQtyCU" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_acceptQtyPU" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_acceptQtySU" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_acceptQtyTBU" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_acceptQtyTU" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_createdBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_createdOn" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_currentOrg" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.Base.Organization.OrganizationData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_docSubLineNo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_iD" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isAssociatedChild" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_modifiedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_modifiedOn" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_processAcceptQty" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_processQty" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_processReDeductQty" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_processReFillQty" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_qCBill" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_qCBillNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_qCConclusion" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_qCElement" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_qCGrade" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_qCLot" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_qCLotCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_qCQCConclusion" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_qCQtyCU" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_qCQtyPU" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_qCQtySU" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_qCQtyTBU" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_qCQtyTU" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_rcvLine" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.PM.Rcv.RcvLineData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_rejectReason" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_rtnDeductQtyPU" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_rtnDeductQtyTBU" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_rtnDeductQtyTU" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_rtnFillQtyPU" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_rtnFillQtyTBU" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_rtnFillQtyTU" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
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
@XmlType(name = "UFIDA.U9.ISV.RCV.DTO.OBARcvSubLineDTOData", propOrder = {
    "mAcceptQtyCU",
    "mAcceptQtyPU",
    "mAcceptQtySU",
    "mAcceptQtyTBU",
    "mAcceptQtyTU",
    "mCreatedBy",
    "mCreatedOn",
    "mCurrentOrg",
    "mDocSubLineNo",
    "mid",
    "mIsAssociatedChild",
    "mModifiedBy",
    "mModifiedOn",
    "mProcessAcceptQty",
    "mProcessQty",
    "mProcessReDeductQty",
    "mProcessReFillQty",
    "mqcBill",
    "mqcBillNo",
    "mqcConclusion",
    "mqcElement",
    "mqcGrade",
    "mqcLot",
    "mqcLotCode",
    "mqcqcConclusion",
    "mqcQtyCU",
    "mqcQtyPU",
    "mqcQtySU",
    "mqcQtyTBU",
    "mqcQtyTU",
    "mRcvLine",
    "mRejectReason",
    "mRtnDeductQtyPU",
    "mRtnDeductQtyTBU",
    "mRtnDeductQtyTU",
    "mRtnFillQtyPU",
    "mRtnFillQtyTBU",
    "mRtnFillQtyTU",
    "mSysVersion"
})
public class UFIDAU9ISVRCVDTOOBARcvSubLineDTOData
    extends UFSoftUBFBusinessDataTransObjectBase
{

    @XmlElement(name = "m_acceptQtyCU")
    protected BigDecimal mAcceptQtyCU;
    @XmlElement(name = "m_acceptQtyPU")
    protected BigDecimal mAcceptQtyPU;
    @XmlElement(name = "m_acceptQtySU")
    protected BigDecimal mAcceptQtySU;
    @XmlElement(name = "m_acceptQtyTBU")
    protected BigDecimal mAcceptQtyTBU;
    @XmlElement(name = "m_acceptQtyTU")
    protected BigDecimal mAcceptQtyTU;
    @XmlElementRef(name = "m_createdBy", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mCreatedBy;
    @XmlElement(name = "m_createdOn")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mCreatedOn;
    @XmlElementRef(name = "m_currentOrg", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9BaseOrganizationOrganizationData> mCurrentOrg;
    @XmlElement(name = "m_docSubLineNo")
    protected Integer mDocSubLineNo;
    @XmlElement(name = "m_iD")
    protected Long mid;
    @XmlElement(name = "m_isAssociatedChild")
    protected Boolean mIsAssociatedChild;
    @XmlElementRef(name = "m_modifiedBy", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mModifiedBy;
    @XmlElement(name = "m_modifiedOn")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mModifiedOn;
    @XmlElement(name = "m_processAcceptQty")
    protected BigDecimal mProcessAcceptQty;
    @XmlElement(name = "m_processQty")
    protected BigDecimal mProcessQty;
    @XmlElement(name = "m_processReDeductQty")
    protected BigDecimal mProcessReDeductQty;
    @XmlElement(name = "m_processReFillQty")
    protected BigDecimal mProcessReFillQty;
    @XmlElement(name = "m_qCBill")
    protected Long mqcBill;
    @XmlElementRef(name = "m_qCBillNo", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mqcBillNo;
    @XmlElement(name = "m_qCConclusion")
    protected Integer mqcConclusion;
    @XmlElement(name = "m_qCElement")
    protected Integer mqcElement;
    @XmlElement(name = "m_qCGrade")
    protected Integer mqcGrade;
    @XmlElement(name = "m_qCLot")
    protected Long mqcLot;
    @XmlElementRef(name = "m_qCLotCode", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mqcLotCode;
    @XmlElement(name = "m_qCQCConclusion")
    protected Integer mqcqcConclusion;
    @XmlElement(name = "m_qCQtyCU")
    protected BigDecimal mqcQtyCU;
    @XmlElement(name = "m_qCQtyPU")
    protected BigDecimal mqcQtyPU;
    @XmlElement(name = "m_qCQtySU")
    protected BigDecimal mqcQtySU;
    @XmlElement(name = "m_qCQtyTBU")
    protected BigDecimal mqcQtyTBU;
    @XmlElement(name = "m_qCQtyTU")
    protected BigDecimal mqcQtyTU;
    @XmlElementRef(name = "m_rcvLine", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9PMRcvRcvLineData> mRcvLine;
    @XmlElement(name = "m_rejectReason")
    protected Integer mRejectReason;
    @XmlElement(name = "m_rtnDeductQtyPU")
    protected BigDecimal mRtnDeductQtyPU;
    @XmlElement(name = "m_rtnDeductQtyTBU")
    protected BigDecimal mRtnDeductQtyTBU;
    @XmlElement(name = "m_rtnDeductQtyTU")
    protected BigDecimal mRtnDeductQtyTU;
    @XmlElement(name = "m_rtnFillQtyPU")
    protected BigDecimal mRtnFillQtyPU;
    @XmlElement(name = "m_rtnFillQtyTBU")
    protected BigDecimal mRtnFillQtyTBU;
    @XmlElement(name = "m_rtnFillQtyTU")
    protected BigDecimal mRtnFillQtyTU;
    @XmlElement(name = "m_sysVersion")
    protected Long mSysVersion;

    /**
     * ��ȡmAcceptQtyCU���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMAcceptQtyCU() {
        return mAcceptQtyCU;
    }

    /**
     * ����mAcceptQtyCU���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMAcceptQtyCU(BigDecimal value) {
        this.mAcceptQtyCU = value;
    }

    /**
     * ��ȡmAcceptQtyPU���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMAcceptQtyPU() {
        return mAcceptQtyPU;
    }

    /**
     * ����mAcceptQtyPU���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMAcceptQtyPU(BigDecimal value) {
        this.mAcceptQtyPU = value;
    }

    /**
     * ��ȡmAcceptQtySU���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMAcceptQtySU() {
        return mAcceptQtySU;
    }

    /**
     * ����mAcceptQtySU���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMAcceptQtySU(BigDecimal value) {
        this.mAcceptQtySU = value;
    }

    /**
     * ��ȡmAcceptQtyTBU���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMAcceptQtyTBU() {
        return mAcceptQtyTBU;
    }

    /**
     * ����mAcceptQtyTBU���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMAcceptQtyTBU(BigDecimal value) {
        this.mAcceptQtyTBU = value;
    }

    /**
     * ��ȡmAcceptQtyTU���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMAcceptQtyTU() {
        return mAcceptQtyTU;
    }

    /**
     * ����mAcceptQtyTU���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMAcceptQtyTU(BigDecimal value) {
        this.mAcceptQtyTU = value;
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
     * ��ȡmDocSubLineNo���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMDocSubLineNo() {
        return mDocSubLineNo;
    }

    /**
     * ����mDocSubLineNo���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMDocSubLineNo(Integer value) {
        this.mDocSubLineNo = value;
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
     * ��ȡmIsAssociatedChild���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsAssociatedChild() {
        return mIsAssociatedChild;
    }

    /**
     * ����mIsAssociatedChild���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsAssociatedChild(Boolean value) {
        this.mIsAssociatedChild = value;
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
     * ��ȡmProcessAcceptQty���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMProcessAcceptQty() {
        return mProcessAcceptQty;
    }

    /**
     * ����mProcessAcceptQty���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMProcessAcceptQty(BigDecimal value) {
        this.mProcessAcceptQty = value;
    }

    /**
     * ��ȡmProcessQty���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMProcessQty() {
        return mProcessQty;
    }

    /**
     * ����mProcessQty���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMProcessQty(BigDecimal value) {
        this.mProcessQty = value;
    }

    /**
     * ��ȡmProcessReDeductQty���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMProcessReDeductQty() {
        return mProcessReDeductQty;
    }

    /**
     * ����mProcessReDeductQty���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMProcessReDeductQty(BigDecimal value) {
        this.mProcessReDeductQty = value;
    }

    /**
     * ��ȡmProcessReFillQty���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMProcessReFillQty() {
        return mProcessReFillQty;
    }

    /**
     * ����mProcessReFillQty���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMProcessReFillQty(BigDecimal value) {
        this.mProcessReFillQty = value;
    }

    /**
     * ��ȡmqcBill���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMQCBill() {
        return mqcBill;
    }

    /**
     * ����mqcBill���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMQCBill(Long value) {
        this.mqcBill = value;
    }

    /**
     * ��ȡmqcBillNo���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMQCBillNo() {
        return mqcBillNo;
    }

    /**
     * ����mqcBillNo���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMQCBillNo(JAXBElement<String> value) {
        this.mqcBillNo = value;
    }

    /**
     * ��ȡmqcConclusion���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMQCConclusion() {
        return mqcConclusion;
    }

    /**
     * ����mqcConclusion���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMQCConclusion(Integer value) {
        this.mqcConclusion = value;
    }

    /**
     * ��ȡmqcElement���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMQCElement() {
        return mqcElement;
    }

    /**
     * ����mqcElement���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMQCElement(Integer value) {
        this.mqcElement = value;
    }

    /**
     * ��ȡmqcGrade���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMQCGrade() {
        return mqcGrade;
    }

    /**
     * ����mqcGrade���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMQCGrade(Integer value) {
        this.mqcGrade = value;
    }

    /**
     * ��ȡmqcLot���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMQCLot() {
        return mqcLot;
    }

    /**
     * ����mqcLot���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMQCLot(Long value) {
        this.mqcLot = value;
    }

    /**
     * ��ȡmqcLotCode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMQCLotCode() {
        return mqcLotCode;
    }

    /**
     * ����mqcLotCode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMQCLotCode(JAXBElement<String> value) {
        this.mqcLotCode = value;
    }

    /**
     * ��ȡmqcqcConclusion���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMQCQCConclusion() {
        return mqcqcConclusion;
    }

    /**
     * ����mqcqcConclusion���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMQCQCConclusion(Integer value) {
        this.mqcqcConclusion = value;
    }

    /**
     * ��ȡmqcQtyCU���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMQCQtyCU() {
        return mqcQtyCU;
    }

    /**
     * ����mqcQtyCU���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMQCQtyCU(BigDecimal value) {
        this.mqcQtyCU = value;
    }

    /**
     * ��ȡmqcQtyPU���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMQCQtyPU() {
        return mqcQtyPU;
    }

    /**
     * ����mqcQtyPU���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMQCQtyPU(BigDecimal value) {
        this.mqcQtyPU = value;
    }

    /**
     * ��ȡmqcQtySU���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMQCQtySU() {
        return mqcQtySU;
    }

    /**
     * ����mqcQtySU���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMQCQtySU(BigDecimal value) {
        this.mqcQtySU = value;
    }

    /**
     * ��ȡmqcQtyTBU���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMQCQtyTBU() {
        return mqcQtyTBU;
    }

    /**
     * ����mqcQtyTBU���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMQCQtyTBU(BigDecimal value) {
        this.mqcQtyTBU = value;
    }

    /**
     * ��ȡmqcQtyTU���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMQCQtyTU() {
        return mqcQtyTU;
    }

    /**
     * ����mqcQtyTU���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMQCQtyTU(BigDecimal value) {
        this.mqcQtyTU = value;
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
     * ��ȡmRejectReason���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMRejectReason() {
        return mRejectReason;
    }

    /**
     * ����mRejectReason���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMRejectReason(Integer value) {
        this.mRejectReason = value;
    }

    /**
     * ��ȡmRtnDeductQtyPU���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMRtnDeductQtyPU() {
        return mRtnDeductQtyPU;
    }

    /**
     * ����mRtnDeductQtyPU���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMRtnDeductQtyPU(BigDecimal value) {
        this.mRtnDeductQtyPU = value;
    }

    /**
     * ��ȡmRtnDeductQtyTBU���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMRtnDeductQtyTBU() {
        return mRtnDeductQtyTBU;
    }

    /**
     * ����mRtnDeductQtyTBU���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMRtnDeductQtyTBU(BigDecimal value) {
        this.mRtnDeductQtyTBU = value;
    }

    /**
     * ��ȡmRtnDeductQtyTU���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMRtnDeductQtyTU() {
        return mRtnDeductQtyTU;
    }

    /**
     * ����mRtnDeductQtyTU���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMRtnDeductQtyTU(BigDecimal value) {
        this.mRtnDeductQtyTU = value;
    }

    /**
     * ��ȡmRtnFillQtyPU���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMRtnFillQtyPU() {
        return mRtnFillQtyPU;
    }

    /**
     * ����mRtnFillQtyPU���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMRtnFillQtyPU(BigDecimal value) {
        this.mRtnFillQtyPU = value;
    }

    /**
     * ��ȡmRtnFillQtyTBU���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMRtnFillQtyTBU() {
        return mRtnFillQtyTBU;
    }

    /**
     * ����mRtnFillQtyTBU���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMRtnFillQtyTBU(BigDecimal value) {
        this.mRtnFillQtyTBU = value;
    }

    /**
     * ��ȡmRtnFillQtyTU���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMRtnFillQtyTU() {
        return mRtnFillQtyTU;
    }

    /**
     * ����mRtnFillQtyTU���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMRtnFillQtyTU(BigDecimal value) {
        this.mRtnFillQtyTU = value;
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
