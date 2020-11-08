
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
 * &lt;p&gt;UFIDA.U9.ISV.RCV.DTO.OBARcvLineLocationDTOData complex type的 Java 类。
 * 
 * &lt;p&gt;以下模式片段指定包含在此类中的预期内容。
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="UFIDA.U9.ISV.RCV.DTO.OBARcvLineLocationDTOData"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://www.UFIDA.org/EntityData}UFSoft.UBF.Business.DataTransObjectBase"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="m_createdBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_createdOn" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_iD" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_invDisabledTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_invLot" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_invLotCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_itemPartInfo" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CBO.SCM.Item.ItemInfoData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_location" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.PM.DTOs.BESimp4UIDTOData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_locationNo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_locationQtyCU" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_locationQtyPU" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_locationQtySU" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_locationQtyTBU" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_locationQtyTU" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_modifiedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_modifiedOn" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_oBARcvLineDTO" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.ISV.RCV.DTO.OBARcvLineDTOData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_partInvDisabledTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_partInvLot" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_partInvLotCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_partSupplierDisabledTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_partSupplierLot" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_processQtySU" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_rcvLine" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.PM.Rcv.RcvLineData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_storageType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_sysVersion" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_tallyTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UFIDA.U9.ISV.RCV.DTO.OBARcvLineLocationDTOData", propOrder = {
    "mCreatedBy",
    "mCreatedOn",
    "mid",
    "mInvDisabledTime",
    "mInvLot",
    "mInvLotCode",
    "mItemPartInfo",
    "mLocation",
    "mLocationNo",
    "mLocationQtyCU",
    "mLocationQtyPU",
    "mLocationQtySU",
    "mLocationQtyTBU",
    "mLocationQtyTU",
    "mModifiedBy",
    "mModifiedOn",
    "mobaRcvLineDTO",
    "mPartInvDisabledTime",
    "mPartInvLot",
    "mPartInvLotCode",
    "mPartSupplierDisabledTime",
    "mPartSupplierLot",
    "mProcessQtySU",
    "mRcvLine",
    "mStorageType",
    "mSysVersion",
    "mTallyTime"
})
public class UFIDAU9ISVRCVDTOOBARcvLineLocationDTOData
    extends UFSoftUBFBusinessDataTransObjectBase
{

    @XmlElementRef(name = "m_createdBy", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mCreatedBy;
    @XmlElement(name = "m_createdOn")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mCreatedOn;
    @XmlElement(name = "m_iD")
    protected Long mid;
    @XmlElement(name = "m_invDisabledTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mInvDisabledTime;
    @XmlElement(name = "m_invLot")
    protected Long mInvLot;
    @XmlElementRef(name = "m_invLotCode", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mInvLotCode;
    @XmlElementRef(name = "m_itemPartInfo", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9CBOSCMItemItemInfoData> mItemPartInfo;
    @XmlElementRef(name = "m_location", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9PMDTOsBESimp4UIDTOData> mLocation;
    @XmlElement(name = "m_locationNo")
    protected Integer mLocationNo;
    @XmlElement(name = "m_locationQtyCU")
    protected BigDecimal mLocationQtyCU;
    @XmlElement(name = "m_locationQtyPU")
    protected BigDecimal mLocationQtyPU;
    @XmlElement(name = "m_locationQtySU")
    protected BigDecimal mLocationQtySU;
    @XmlElement(name = "m_locationQtyTBU")
    protected BigDecimal mLocationQtyTBU;
    @XmlElement(name = "m_locationQtyTU")
    protected BigDecimal mLocationQtyTU;
    @XmlElementRef(name = "m_modifiedBy", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mModifiedBy;
    @XmlElement(name = "m_modifiedOn")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mModifiedOn;
    @XmlElementRef(name = "m_oBARcvLineDTO", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9ISVRCVDTOOBARcvLineDTOData> mobaRcvLineDTO;
    @XmlElement(name = "m_partInvDisabledTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mPartInvDisabledTime;
    @XmlElement(name = "m_partInvLot")
    protected Long mPartInvLot;
    @XmlElementRef(name = "m_partInvLotCode", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mPartInvLotCode;
    @XmlElement(name = "m_partSupplierDisabledTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mPartSupplierDisabledTime;
    @XmlElementRef(name = "m_partSupplierLot", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mPartSupplierLot;
    @XmlElement(name = "m_processQtySU")
    protected BigDecimal mProcessQtySU;
    @XmlElementRef(name = "m_rcvLine", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9PMRcvRcvLineData> mRcvLine;
    @XmlElement(name = "m_storageType")
    protected Integer mStorageType;
    @XmlElement(name = "m_sysVersion")
    protected Long mSysVersion;
    @XmlElement(name = "m_tallyTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mTallyTime;

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
     * 获取mInvDisabledTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMInvDisabledTime() {
        return mInvDisabledTime;
    }

    /**
     * 设置mInvDisabledTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMInvDisabledTime(XMLGregorianCalendar value) {
        this.mInvDisabledTime = value;
    }

    /**
     * 获取mInvLot属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMInvLot() {
        return mInvLot;
    }

    /**
     * 设置mInvLot属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMInvLot(Long value) {
        this.mInvLot = value;
    }

    /**
     * 获取mInvLotCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMInvLotCode() {
        return mInvLotCode;
    }

    /**
     * 设置mInvLotCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMInvLotCode(JAXBElement<String> value) {
        this.mInvLotCode = value;
    }

    /**
     * 获取mItemPartInfo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOSCMItemItemInfoData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9CBOSCMItemItemInfoData> getMItemPartInfo() {
        return mItemPartInfo;
    }

    /**
     * 设置mItemPartInfo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOSCMItemItemInfoData }{@code >}
     *     
     */
    public void setMItemPartInfo(JAXBElement<UFIDAU9CBOSCMItemItemInfoData> value) {
        this.mItemPartInfo = value;
    }

    /**
     * 获取mLocation属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9PMDTOsBESimp4UIDTOData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9PMDTOsBESimp4UIDTOData> getMLocation() {
        return mLocation;
    }

    /**
     * 设置mLocation属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9PMDTOsBESimp4UIDTOData }{@code >}
     *     
     */
    public void setMLocation(JAXBElement<UFIDAU9PMDTOsBESimp4UIDTOData> value) {
        this.mLocation = value;
    }

    /**
     * 获取mLocationNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMLocationNo() {
        return mLocationNo;
    }

    /**
     * 设置mLocationNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMLocationNo(Integer value) {
        this.mLocationNo = value;
    }

    /**
     * 获取mLocationQtyCU属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMLocationQtyCU() {
        return mLocationQtyCU;
    }

    /**
     * 设置mLocationQtyCU属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMLocationQtyCU(BigDecimal value) {
        this.mLocationQtyCU = value;
    }

    /**
     * 获取mLocationQtyPU属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMLocationQtyPU() {
        return mLocationQtyPU;
    }

    /**
     * 设置mLocationQtyPU属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMLocationQtyPU(BigDecimal value) {
        this.mLocationQtyPU = value;
    }

    /**
     * 获取mLocationQtySU属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMLocationQtySU() {
        return mLocationQtySU;
    }

    /**
     * 设置mLocationQtySU属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMLocationQtySU(BigDecimal value) {
        this.mLocationQtySU = value;
    }

    /**
     * 获取mLocationQtyTBU属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMLocationQtyTBU() {
        return mLocationQtyTBU;
    }

    /**
     * 设置mLocationQtyTBU属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMLocationQtyTBU(BigDecimal value) {
        this.mLocationQtyTBU = value;
    }

    /**
     * 获取mLocationQtyTU属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMLocationQtyTU() {
        return mLocationQtyTU;
    }

    /**
     * 设置mLocationQtyTU属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMLocationQtyTU(BigDecimal value) {
        this.mLocationQtyTU = value;
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
     * 获取mobaRcvLineDTO属性的值。
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
     * 设置mobaRcvLineDTO属性的值。
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
     * 获取mPartInvDisabledTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMPartInvDisabledTime() {
        return mPartInvDisabledTime;
    }

    /**
     * 设置mPartInvDisabledTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMPartInvDisabledTime(XMLGregorianCalendar value) {
        this.mPartInvDisabledTime = value;
    }

    /**
     * 获取mPartInvLot属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMPartInvLot() {
        return mPartInvLot;
    }

    /**
     * 设置mPartInvLot属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMPartInvLot(Long value) {
        this.mPartInvLot = value;
    }

    /**
     * 获取mPartInvLotCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMPartInvLotCode() {
        return mPartInvLotCode;
    }

    /**
     * 设置mPartInvLotCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMPartInvLotCode(JAXBElement<String> value) {
        this.mPartInvLotCode = value;
    }

    /**
     * 获取mPartSupplierDisabledTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMPartSupplierDisabledTime() {
        return mPartSupplierDisabledTime;
    }

    /**
     * 设置mPartSupplierDisabledTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMPartSupplierDisabledTime(XMLGregorianCalendar value) {
        this.mPartSupplierDisabledTime = value;
    }

    /**
     * 获取mPartSupplierLot属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMPartSupplierLot() {
        return mPartSupplierLot;
    }

    /**
     * 设置mPartSupplierLot属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMPartSupplierLot(JAXBElement<String> value) {
        this.mPartSupplierLot = value;
    }

    /**
     * 获取mProcessQtySU属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMProcessQtySU() {
        return mProcessQtySU;
    }

    /**
     * 设置mProcessQtySU属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMProcessQtySU(BigDecimal value) {
        this.mProcessQtySU = value;
    }

    /**
     * 获取mRcvLine属性的值。
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
     * 设置mRcvLine属性的值。
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
     * 获取mStorageType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMStorageType() {
        return mStorageType;
    }

    /**
     * 设置mStorageType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMStorageType(Integer value) {
        this.mStorageType = value;
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
     * 获取mTallyTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMTallyTime() {
        return mTallyTime;
    }

    /**
     * 设置mTallyTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMTallyTime(XMLGregorianCalendar value) {
        this.mTallyTime = value;
    }

}
