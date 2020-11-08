
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
 * &lt;p&gt;UFIDA.U9.SM.Ship.ShipLineLocationData complex type�� Java �ࡣ
 * 
 * &lt;p&gt;����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="UFIDA.U9.SM.Ship.ShipLineLocationData"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://www.UFIDA.org/EntityData}UFSoft.UBF.Business.DataTransObjectBase"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="InvUOM" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="InvUOM_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Location" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Location_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Org" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Org_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ShipLine_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="TradeBaseUOM" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="TradeBaseUOM_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="TradeUOM" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="TradeUOM_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_childItemInfo" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CBO.SCM.Item.ItemInfoData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_childLot" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.Lot.LotMasterInfoData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_childLotInvalidationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_createdBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_createdOn" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_dealItemTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_descFlexField" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.Base.FlexField.DescFlexField.DescFlexSegmentsData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_iD" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_itemInfo" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CBO.SCM.Item.ItemInfoData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_locationNo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_locationQtyInvAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_locationQtyTBUAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_locationQtyTUAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_lot" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.Lot.LotMasterInfoData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_lotInvalidationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_modifiedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_modifiedOn" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_processQty" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_shipLine" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.SM.Ship.ShipLineData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_snCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_srcLocationID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
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
@XmlType(name = "UFIDA.U9.SM.Ship.ShipLineLocationData", propOrder = {
    "invUOM",
    "invUOMSKey",
    "location",
    "locationSKey",
    "org",
    "orgSKey",
    "shipLineSKey",
    "tradeBaseUOM",
    "tradeBaseUOMSKey",
    "tradeUOM",
    "tradeUOMSKey",
    "mChildItemInfo",
    "mChildLot",
    "mChildLotInvalidationDate",
    "mCreatedBy",
    "mCreatedOn",
    "mDealItemTime",
    "mDescFlexField",
    "mid",
    "mItemInfo",
    "mLocationNo",
    "mLocationQtyInvAmount",
    "mLocationQtyTBUAmount",
    "mLocationQtyTUAmount",
    "mLot",
    "mLotInvalidationDate",
    "mModifiedBy",
    "mModifiedOn",
    "mProcessQty",
    "mShipLine",
    "mSnCode",
    "mSrcLocationID",
    "mSysVersion"
})
public class UFIDAU9SMShipShipLineLocationData
    extends UFSoftUBFBusinessDataTransObjectBase
{

    @XmlElement(name = "InvUOM")
    protected Long invUOM;
    @XmlElementRef(name = "InvUOM_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> invUOMSKey;
    @XmlElement(name = "Location")
    protected Long location;
    @XmlElementRef(name = "Location_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> locationSKey;
    @XmlElement(name = "Org")
    protected Long org;
    @XmlElementRef(name = "Org_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> orgSKey;
    @XmlElementRef(name = "ShipLine_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> shipLineSKey;
    @XmlElement(name = "TradeBaseUOM")
    protected Long tradeBaseUOM;
    @XmlElementRef(name = "TradeBaseUOM_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> tradeBaseUOMSKey;
    @XmlElement(name = "TradeUOM")
    protected Long tradeUOM;
    @XmlElementRef(name = "TradeUOM_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> tradeUOMSKey;
    @XmlElementRef(name = "m_childItemInfo", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9CBOSCMItemItemInfoData> mChildItemInfo;
    @XmlElementRef(name = "m_childLot", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9LotLotMasterInfoData> mChildLot;
    @XmlElement(name = "m_childLotInvalidationDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mChildLotInvalidationDate;
    @XmlElementRef(name = "m_createdBy", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mCreatedBy;
    @XmlElement(name = "m_createdOn")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mCreatedOn;
    @XmlElement(name = "m_dealItemTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mDealItemTime;
    @XmlElementRef(name = "m_descFlexField", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9BaseFlexFieldDescFlexFieldDescFlexSegmentsData> mDescFlexField;
    @XmlElement(name = "m_iD")
    protected Long mid;
    @XmlElementRef(name = "m_itemInfo", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9CBOSCMItemItemInfoData> mItemInfo;
    @XmlElement(name = "m_locationNo")
    protected Integer mLocationNo;
    @XmlElement(name = "m_locationQtyInvAmount")
    protected BigDecimal mLocationQtyInvAmount;
    @XmlElement(name = "m_locationQtyTBUAmount")
    protected BigDecimal mLocationQtyTBUAmount;
    @XmlElement(name = "m_locationQtyTUAmount")
    protected BigDecimal mLocationQtyTUAmount;
    @XmlElementRef(name = "m_lot", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9LotLotMasterInfoData> mLot;
    @XmlElement(name = "m_lotInvalidationDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mLotInvalidationDate;
    @XmlElementRef(name = "m_modifiedBy", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mModifiedBy;
    @XmlElement(name = "m_modifiedOn")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mModifiedOn;
    @XmlElement(name = "m_processQty")
    protected BigDecimal mProcessQty;
    @XmlElementRef(name = "m_shipLine", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9SMShipShipLineData> mShipLine;
    @XmlElementRef(name = "m_snCode", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mSnCode;
    @XmlElement(name = "m_srcLocationID")
    protected Long mSrcLocationID;
    @XmlElement(name = "m_sysVersion")
    protected Long mSysVersion;

    /**
     * ��ȡinvUOM���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getInvUOM() {
        return invUOM;
    }

    /**
     * ����invUOM���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setInvUOM(Long value) {
        this.invUOM = value;
    }

    /**
     * ��ȡinvUOMSKey���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getInvUOMSKey() {
        return invUOMSKey;
    }

    /**
     * ����invUOMSKey���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setInvUOMSKey(JAXBElement<EntityKey> value) {
        this.invUOMSKey = value;
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
     * ��ȡorg���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOrg() {
        return org;
    }

    /**
     * ����org���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOrg(Long value) {
        this.org = value;
    }

    /**
     * ��ȡorgSKey���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getOrgSKey() {
        return orgSKey;
    }

    /**
     * ����orgSKey���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setOrgSKey(JAXBElement<EntityKey> value) {
        this.orgSKey = value;
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
     * ��ȡtradeBaseUOM���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTradeBaseUOM() {
        return tradeBaseUOM;
    }

    /**
     * ����tradeBaseUOM���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTradeBaseUOM(Long value) {
        this.tradeBaseUOM = value;
    }

    /**
     * ��ȡtradeBaseUOMSKey���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getTradeBaseUOMSKey() {
        return tradeBaseUOMSKey;
    }

    /**
     * ����tradeBaseUOMSKey���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setTradeBaseUOMSKey(JAXBElement<EntityKey> value) {
        this.tradeBaseUOMSKey = value;
    }

    /**
     * ��ȡtradeUOM���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTradeUOM() {
        return tradeUOM;
    }

    /**
     * ����tradeUOM���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTradeUOM(Long value) {
        this.tradeUOM = value;
    }

    /**
     * ��ȡtradeUOMSKey���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getTradeUOMSKey() {
        return tradeUOMSKey;
    }

    /**
     * ����tradeUOMSKey���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setTradeUOMSKey(JAXBElement<EntityKey> value) {
        this.tradeUOMSKey = value;
    }

    /**
     * ��ȡmChildItemInfo���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOSCMItemItemInfoData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9CBOSCMItemItemInfoData> getMChildItemInfo() {
        return mChildItemInfo;
    }

    /**
     * ����mChildItemInfo���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOSCMItemItemInfoData }{@code >}
     *     
     */
    public void setMChildItemInfo(JAXBElement<UFIDAU9CBOSCMItemItemInfoData> value) {
        this.mChildItemInfo = value;
    }

    /**
     * ��ȡmChildLot���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9LotLotMasterInfoData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9LotLotMasterInfoData> getMChildLot() {
        return mChildLot;
    }

    /**
     * ����mChildLot���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9LotLotMasterInfoData }{@code >}
     *     
     */
    public void setMChildLot(JAXBElement<UFIDAU9LotLotMasterInfoData> value) {
        this.mChildLot = value;
    }

    /**
     * ��ȡmChildLotInvalidationDate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMChildLotInvalidationDate() {
        return mChildLotInvalidationDate;
    }

    /**
     * ����mChildLotInvalidationDate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMChildLotInvalidationDate(XMLGregorianCalendar value) {
        this.mChildLotInvalidationDate = value;
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
     * ��ȡmDealItemTime���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMDealItemTime() {
        return mDealItemTime;
    }

    /**
     * ����mDealItemTime���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMDealItemTime(XMLGregorianCalendar value) {
        this.mDealItemTime = value;
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
     * ��ȡmLocationQtyInvAmount���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMLocationQtyInvAmount() {
        return mLocationQtyInvAmount;
    }

    /**
     * ����mLocationQtyInvAmount���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMLocationQtyInvAmount(BigDecimal value) {
        this.mLocationQtyInvAmount = value;
    }

    /**
     * ��ȡmLocationQtyTBUAmount���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMLocationQtyTBUAmount() {
        return mLocationQtyTBUAmount;
    }

    /**
     * ����mLocationQtyTBUAmount���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMLocationQtyTBUAmount(BigDecimal value) {
        this.mLocationQtyTBUAmount = value;
    }

    /**
     * ��ȡmLocationQtyTUAmount���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMLocationQtyTUAmount() {
        return mLocationQtyTUAmount;
    }

    /**
     * ����mLocationQtyTUAmount���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMLocationQtyTUAmount(BigDecimal value) {
        this.mLocationQtyTUAmount = value;
    }

    /**
     * ��ȡmLot���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9LotLotMasterInfoData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9LotLotMasterInfoData> getMLot() {
        return mLot;
    }

    /**
     * ����mLot���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9LotLotMasterInfoData }{@code >}
     *     
     */
    public void setMLot(JAXBElement<UFIDAU9LotLotMasterInfoData> value) {
        this.mLot = value;
    }

    /**
     * ��ȡmLotInvalidationDate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMLotInvalidationDate() {
        return mLotInvalidationDate;
    }

    /**
     * ����mLotInvalidationDate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMLotInvalidationDate(XMLGregorianCalendar value) {
        this.mLotInvalidationDate = value;
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
     * ��ȡmSrcLocationID���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMSrcLocationID() {
        return mSrcLocationID;
    }

    /**
     * ����mSrcLocationID���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMSrcLocationID(Long value) {
        this.mSrcLocationID = value;
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
