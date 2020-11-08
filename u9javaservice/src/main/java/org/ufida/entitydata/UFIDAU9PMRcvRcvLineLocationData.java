
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
 * &lt;p&gt;UFIDA.U9.PM.Rcv.RcvLineLocationData complex type�� Java �ࡣ
 * 
 * &lt;p&gt;����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="UFIDA.U9.PM.Rcv.RcvLineLocationData"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://www.UFIDA.org/EntityData}UFSoft.UBF.Business.DataTransObjectBase"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="CurrentOrg" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="CurrentOrg_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="InvLot" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="InvLot_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Location" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Location_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="PartInvLot" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="PartInvLot_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="RcvLine_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_createdBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_createdOn" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_iD" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_invDisabledTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_invLotCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_itemInfo" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CBO.SCM.Item.ItemInfoData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_itemPartInfo" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CBO.SCM.Item.ItemInfoData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_locationNo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_locationQtyCU" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_locationQtyPU" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_locationQtySU" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_locationQtyTBU" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_locationQtyTU" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_modifiedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_modifiedOn" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_partInvDisabledTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_partInvLotCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_partSupplierDisabledTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_partSupplierLot" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_processQtySU" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_rcvLine" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.PM.Rcv.RcvLineData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_snCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
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
@XmlType(name = "UFIDA.U9.PM.Rcv.RcvLineLocationData", propOrder = {
    "currentOrg",
    "currentOrgSKey",
    "invLot",
    "invLotSKey",
    "location",
    "locationSKey",
    "partInvLot",
    "partInvLotSKey",
    "rcvLineSKey",
    "mCreatedBy",
    "mCreatedOn",
    "mid",
    "mInvDisabledTime",
    "mInvLotCode",
    "mItemInfo",
    "mItemPartInfo",
    "mLocationNo",
    "mLocationQtyCU",
    "mLocationQtyPU",
    "mLocationQtySU",
    "mLocationQtyTBU",
    "mLocationQtyTU",
    "mModifiedBy",
    "mModifiedOn",
    "mPartInvDisabledTime",
    "mPartInvLotCode",
    "mPartSupplierDisabledTime",
    "mPartSupplierLot",
    "mProcessQtySU",
    "mRcvLine",
    "mSnCode",
    "mStorageType",
    "mSysVersion",
    "mTallyTime"
})
public class UFIDAU9PMRcvRcvLineLocationData
    extends UFSoftUBFBusinessDataTransObjectBase
{

    @XmlElement(name = "CurrentOrg")
    protected Long currentOrg;
    @XmlElementRef(name = "CurrentOrg_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> currentOrgSKey;
    @XmlElement(name = "InvLot")
    protected Long invLot;
    @XmlElementRef(name = "InvLot_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> invLotSKey;
    @XmlElement(name = "Location")
    protected Long location;
    @XmlElementRef(name = "Location_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> locationSKey;
    @XmlElement(name = "PartInvLot")
    protected Long partInvLot;
    @XmlElementRef(name = "PartInvLot_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> partInvLotSKey;
    @XmlElementRef(name = "RcvLine_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> rcvLineSKey;
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
    @XmlElementRef(name = "m_invLotCode", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mInvLotCode;
    @XmlElementRef(name = "m_itemInfo", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9CBOSCMItemItemInfoData> mItemInfo;
    @XmlElementRef(name = "m_itemPartInfo", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9CBOSCMItemItemInfoData> mItemPartInfo;
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
    @XmlElement(name = "m_partInvDisabledTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mPartInvDisabledTime;
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
    @XmlElementRef(name = "m_snCode", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mSnCode;
    @XmlElement(name = "m_storageType")
    protected Integer mStorageType;
    @XmlElement(name = "m_sysVersion")
    protected Long mSysVersion;
    @XmlElement(name = "m_tallyTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mTallyTime;

    /**
     * ��ȡcurrentOrg���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCurrentOrg() {
        return currentOrg;
    }

    /**
     * ����currentOrg���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCurrentOrg(Long value) {
        this.currentOrg = value;
    }

    /**
     * ��ȡcurrentOrgSKey���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getCurrentOrgSKey() {
        return currentOrgSKey;
    }

    /**
     * ����currentOrgSKey���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setCurrentOrgSKey(JAXBElement<EntityKey> value) {
        this.currentOrgSKey = value;
    }

    /**
     * ��ȡinvLot���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getInvLot() {
        return invLot;
    }

    /**
     * ����invLot���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setInvLot(Long value) {
        this.invLot = value;
    }

    /**
     * ��ȡinvLotSKey���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getInvLotSKey() {
        return invLotSKey;
    }

    /**
     * ����invLotSKey���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setInvLotSKey(JAXBElement<EntityKey> value) {
        this.invLotSKey = value;
    }

    /**
     * ��ȡlocation���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getLocation() {
        return location;
    }

    /**
     * ����location���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setLocation(Long value) {
        this.location = value;
    }

    /**
     * ��ȡlocationSKey���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getLocationSKey() {
        return locationSKey;
    }

    /**
     * ����locationSKey���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setLocationSKey(JAXBElement<EntityKey> value) {
        this.locationSKey = value;
    }

    /**
     * ��ȡpartInvLot���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPartInvLot() {
        return partInvLot;
    }

    /**
     * ����partInvLot���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPartInvLot(Long value) {
        this.partInvLot = value;
    }

    /**
     * ��ȡpartInvLotSKey���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getPartInvLotSKey() {
        return partInvLotSKey;
    }

    /**
     * ����partInvLotSKey���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setPartInvLotSKey(JAXBElement<EntityKey> value) {
        this.partInvLotSKey = value;
    }

    /**
     * ��ȡrcvLineSKey���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getRcvLineSKey() {
        return rcvLineSKey;
    }

    /**
     * ����rcvLineSKey���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setRcvLineSKey(JAXBElement<EntityKey> value) {
        this.rcvLineSKey = value;
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
     * ��ȡmInvDisabledTime���Ե�ֵ��
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
     * ����mInvDisabledTime���Ե�ֵ��
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
     * ��ȡmInvLotCode���Ե�ֵ��
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
     * ����mInvLotCode���Ե�ֵ��
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
     * ��ȡmItemInfo���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOSCMItemItemInfoData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9CBOSCMItemItemInfoData> getMItemInfo() {
        return mItemInfo;
    }

    /**
     * ����mItemInfo���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOSCMItemItemInfoData }{@code >}
     *     
     */
    public void setMItemInfo(JAXBElement<UFIDAU9CBOSCMItemItemInfoData> value) {
        this.mItemInfo = value;
    }

    /**
     * ��ȡmItemPartInfo���Ե�ֵ��
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
     * ����mItemPartInfo���Ե�ֵ��
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
     * ��ȡmLocationNo���Ե�ֵ��
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
     * ����mLocationNo���Ե�ֵ��
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
     * ��ȡmLocationQtyCU���Ե�ֵ��
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
     * ����mLocationQtyCU���Ե�ֵ��
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
     * ��ȡmLocationQtyPU���Ե�ֵ��
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
     * ����mLocationQtyPU���Ե�ֵ��
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
     * ��ȡmLocationQtySU���Ե�ֵ��
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
     * ����mLocationQtySU���Ե�ֵ��
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
     * ��ȡmLocationQtyTBU���Ե�ֵ��
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
     * ����mLocationQtyTBU���Ե�ֵ��
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
     * ��ȡmLocationQtyTU���Ե�ֵ��
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
     * ����mLocationQtyTU���Ե�ֵ��
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
     * ��ȡmPartInvDisabledTime���Ե�ֵ��
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
     * ����mPartInvDisabledTime���Ե�ֵ��
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
     * ��ȡmPartInvLotCode���Ե�ֵ��
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
     * ����mPartInvLotCode���Ե�ֵ��
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
     * ��ȡmPartSupplierDisabledTime���Ե�ֵ��
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
     * ����mPartSupplierDisabledTime���Ե�ֵ��
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
     * ��ȡmPartSupplierLot���Ե�ֵ��
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
     * ����mPartSupplierLot���Ե�ֵ��
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
     * ��ȡmProcessQtySU���Ե�ֵ��
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
     * ����mProcessQtySU���Ե�ֵ��
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
     * ��ȡmSnCode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMSnCode() {
        return mSnCode;
    }

    /**
     * ����mSnCode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMSnCode(JAXBElement<String> value) {
        this.mSnCode = value;
    }

    /**
     * ��ȡmStorageType���Ե�ֵ��
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
     * ����mStorageType���Ե�ֵ��
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
     * ��ȡmTallyTime���Ե�ֵ��
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
     * ����mTallyTime���Ե�ֵ��
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
