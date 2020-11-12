
package icreateshipsv.org.ufida.entitydata;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

import icreateshipsv.businessentity.business.ubf.ufsoft.EntityKey;


/**
 * &lt;p&gt;UFIDA.U9.CBO.SCM.RMA.ReturnTermDetailData complex type�� Java �ࡣ
 * 
 * &lt;p&gt;����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="UFIDA.U9.CBO.SCM.RMA.ReturnTermDetailData"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://www.UFIDA.org/EntityData}UFSoft.UBF.Business.DataTransObjectBase"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="Item" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ItemCategory" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ItemCategory_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Item_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Supplier" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Supplier_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_createdBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_createdOn" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_ctrlServPeriod" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_descFlexField" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.Base.FlexField.DescFlexField.DescFlexSegmentsData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_exchangeControl" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_exchangeTimeLimit" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_iD" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_itemInfo" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CBO.SCM.Item.ItemInfoData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_itemVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_lineNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_modifiedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_modifiedOn" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_returnControl" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_returnTimeLimit" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_servicePeriod" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_startingTime" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_sysVersion" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_timeUom" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UFIDA.U9.CBO.SCM.RMA.ReturnTermDetailData", propOrder = {
    "item",
    "itemCategory",
    "itemCategorySKey",
    "itemSKey",
    "supplier",
    "supplierSKey",
    "mCreatedBy",
    "mCreatedOn",
    "mCtrlServPeriod",
    "mDescFlexField",
    "mExchangeControl",
    "mExchangeTimeLimit",
    "mid",
    "mItemInfo",
    "mItemVersion",
    "mLineNO",
    "mModifiedBy",
    "mModifiedOn",
    "mReturnControl",
    "mReturnTimeLimit",
    "mServicePeriod",
    "mStartingTime",
    "mSysVersion",
    "mTimeUom"
})
public class UFIDAU9CBOSCMRMAReturnTermDetailData
    extends UFSoftUBFBusinessDataTransObjectBase
{

    @XmlElement(name = "Item")
    protected Long item;
    @XmlElement(name = "ItemCategory")
    protected Long itemCategory;
    @XmlElementRef(name = "ItemCategory_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> itemCategorySKey;
    @XmlElementRef(name = "Item_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> itemSKey;
    @XmlElement(name = "Supplier")
    protected Long supplier;
    @XmlElementRef(name = "Supplier_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> supplierSKey;
    @XmlElementRef(name = "m_createdBy", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mCreatedBy;
    @XmlElement(name = "m_createdOn")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mCreatedOn;
    @XmlElement(name = "m_ctrlServPeriod")
    protected Boolean mCtrlServPeriod;
    @XmlElementRef(name = "m_descFlexField", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9BaseFlexFieldDescFlexFieldDescFlexSegmentsData> mDescFlexField;
    @XmlElement(name = "m_exchangeControl")
    protected Boolean mExchangeControl;
    @XmlElement(name = "m_exchangeTimeLimit")
    protected Integer mExchangeTimeLimit;
    @XmlElement(name = "m_iD")
    protected Long mid;
    @XmlElementRef(name = "m_itemInfo", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9CBOSCMItemItemInfoData> mItemInfo;
    @XmlElementRef(name = "m_itemVersion", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mItemVersion;
    @XmlElementRef(name = "m_lineNO", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mLineNO;
    @XmlElementRef(name = "m_modifiedBy", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mModifiedBy;
    @XmlElement(name = "m_modifiedOn")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mModifiedOn;
    @XmlElement(name = "m_returnControl")
    protected Boolean mReturnControl;
    @XmlElement(name = "m_returnTimeLimit")
    protected Integer mReturnTimeLimit;
    @XmlElement(name = "m_servicePeriod")
    protected Integer mServicePeriod;
    @XmlElement(name = "m_startingTime")
    protected Integer mStartingTime;
    @XmlElement(name = "m_sysVersion")
    protected Long mSysVersion;
    @XmlElement(name = "m_timeUom")
    protected Integer mTimeUom;

    /**
     * ��ȡitem���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getItem() {
        return item;
    }

    /**
     * ����item���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setItem(Long value) {
        this.item = value;
    }

    /**
     * ��ȡitemCategory���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getItemCategory() {
        return itemCategory;
    }

    /**
     * ����itemCategory���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setItemCategory(Long value) {
        this.itemCategory = value;
    }

    /**
     * ��ȡitemCategorySKey���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getItemCategorySKey() {
        return itemCategorySKey;
    }

    /**
     * ����itemCategorySKey���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setItemCategorySKey(JAXBElement<EntityKey> value) {
        this.itemCategorySKey = value;
    }

    /**
     * ��ȡitemSKey���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getItemSKey() {
        return itemSKey;
    }

    /**
     * ����itemSKey���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setItemSKey(JAXBElement<EntityKey> value) {
        this.itemSKey = value;
    }

    /**
     * ��ȡsupplier���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSupplier() {
        return supplier;
    }

    /**
     * ����supplier���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSupplier(Long value) {
        this.supplier = value;
    }

    /**
     * ��ȡsupplierSKey���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getSupplierSKey() {
        return supplierSKey;
    }

    /**
     * ����supplierSKey���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setSupplierSKey(JAXBElement<EntityKey> value) {
        this.supplierSKey = value;
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
     * ��ȡmCtrlServPeriod���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMCtrlServPeriod() {
        return mCtrlServPeriod;
    }

    /**
     * ����mCtrlServPeriod���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMCtrlServPeriod(Boolean value) {
        this.mCtrlServPeriod = value;
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
     * ��ȡmExchangeControl���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMExchangeControl() {
        return mExchangeControl;
    }

    /**
     * ����mExchangeControl���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMExchangeControl(Boolean value) {
        this.mExchangeControl = value;
    }

    /**
     * ��ȡmExchangeTimeLimit���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMExchangeTimeLimit() {
        return mExchangeTimeLimit;
    }

    /**
     * ����mExchangeTimeLimit���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMExchangeTimeLimit(Integer value) {
        this.mExchangeTimeLimit = value;
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
     * ��ȡmItemVersion���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMItemVersion() {
        return mItemVersion;
    }

    /**
     * ����mItemVersion���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMItemVersion(JAXBElement<String> value) {
        this.mItemVersion = value;
    }

    /**
     * ��ȡmLineNO���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMLineNO() {
        return mLineNO;
    }

    /**
     * ����mLineNO���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMLineNO(JAXBElement<String> value) {
        this.mLineNO = value;
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
     * ��ȡmReturnControl���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMReturnControl() {
        return mReturnControl;
    }

    /**
     * ����mReturnControl���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMReturnControl(Boolean value) {
        this.mReturnControl = value;
    }

    /**
     * ��ȡmReturnTimeLimit���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMReturnTimeLimit() {
        return mReturnTimeLimit;
    }

    /**
     * ����mReturnTimeLimit���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMReturnTimeLimit(Integer value) {
        this.mReturnTimeLimit = value;
    }

    /**
     * ��ȡmServicePeriod���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMServicePeriod() {
        return mServicePeriod;
    }

    /**
     * ����mServicePeriod���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMServicePeriod(Integer value) {
        this.mServicePeriod = value;
    }

    /**
     * ��ȡmStartingTime���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMStartingTime() {
        return mStartingTime;
    }

    /**
     * ����mStartingTime���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMStartingTime(Integer value) {
        this.mStartingTime = value;
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
     * ��ȡmTimeUom���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMTimeUom() {
        return mTimeUom;
    }

    /**
     * ����mTimeUom���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMTimeUom(Integer value) {
        this.mTimeUom = value;
    }

}
