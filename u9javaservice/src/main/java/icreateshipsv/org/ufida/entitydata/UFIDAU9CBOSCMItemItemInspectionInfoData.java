
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
import icreateshipsv.data.util.ubf.ufsoft.MultiLangDataDict;


/**
 * &lt;p&gt;UFIDA.U9.CBO.SCM.Item.ItemInspectionInfoData complex type的 Java 类。
 * 
 * &lt;p&gt;以下模式片段指定包含在此类中的预期内容。
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="UFIDA.U9.CBO.SCM.Item.ItemInspectionInfoData"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://www.UFIDA.org/EntityData}UFSoft.UBF.Business.DataTransObjectBase"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="ItemMaster_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Multi_QualityDescription" type="{UFSoft.UBF.Util.Data}MultiLangDataDict" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="QualityDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_buildCompleteCheckUpRule" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_buildCompleteCheckUpRuleVer" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_createdBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_createdOn" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_destroyInspectQty" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_iD" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_inStockInspectRule" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_inStockInspectRuleVer" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_inspectPeriod" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_itemMaster" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CBO.SCM.Item.ItemMasterData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_modifiedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_modifiedOn" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_receiptInspectRule" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_receiptInspectRuleVer" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_saleReturnCheckupRule" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_saleReturnCheckupRuleVer" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_shipInspectRule" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_shipInspectRuleVer" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_shipmentInspectRule" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_shipmentInspectRuleVer" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
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
@XmlType(name = "UFIDA.U9.CBO.SCM.Item.ItemInspectionInfoData", propOrder = {
    "itemMasterSKey",
    "multiQualityDescription",
    "qualityDescription",
    "mBuildCompleteCheckUpRule",
    "mBuildCompleteCheckUpRuleVer",
    "mCreatedBy",
    "mCreatedOn",
    "mDestroyInspectQty",
    "mid",
    "mInStockInspectRule",
    "mInStockInspectRuleVer",
    "mInspectPeriod",
    "mItemMaster",
    "mModifiedBy",
    "mModifiedOn",
    "mReceiptInspectRule",
    "mReceiptInspectRuleVer",
    "mSaleReturnCheckupRule",
    "mSaleReturnCheckupRuleVer",
    "mShipInspectRule",
    "mShipInspectRuleVer",
    "mShipmentInspectRule",
    "mShipmentInspectRuleVer",
    "mSysVersion"
})
public class UFIDAU9CBOSCMItemItemInspectionInfoData
    extends UFSoftUBFBusinessDataTransObjectBase
{

    @XmlElementRef(name = "ItemMaster_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> itemMasterSKey;
    @XmlElementRef(name = "Multi_QualityDescription", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<MultiLangDataDict> multiQualityDescription;
    @XmlElementRef(name = "QualityDescription", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> qualityDescription;
    @XmlElement(name = "m_buildCompleteCheckUpRule")
    protected Long mBuildCompleteCheckUpRule;
    @XmlElement(name = "m_buildCompleteCheckUpRuleVer")
    protected Long mBuildCompleteCheckUpRuleVer;
    @XmlElementRef(name = "m_createdBy", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mCreatedBy;
    @XmlElement(name = "m_createdOn")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mCreatedOn;
    @XmlElement(name = "m_destroyInspectQty")
    protected Integer mDestroyInspectQty;
    @XmlElement(name = "m_iD")
    protected Long mid;
    @XmlElement(name = "m_inStockInspectRule")
    protected Long mInStockInspectRule;
    @XmlElement(name = "m_inStockInspectRuleVer")
    protected Long mInStockInspectRuleVer;
    @XmlElement(name = "m_inspectPeriod")
    protected Integer mInspectPeriod;
    @XmlElementRef(name = "m_itemMaster", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9CBOSCMItemItemMasterData> mItemMaster;
    @XmlElementRef(name = "m_modifiedBy", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mModifiedBy;
    @XmlElement(name = "m_modifiedOn")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mModifiedOn;
    @XmlElement(name = "m_receiptInspectRule")
    protected Long mReceiptInspectRule;
    @XmlElement(name = "m_receiptInspectRuleVer")
    protected Long mReceiptInspectRuleVer;
    @XmlElement(name = "m_saleReturnCheckupRule")
    protected Long mSaleReturnCheckupRule;
    @XmlElement(name = "m_saleReturnCheckupRuleVer")
    protected Long mSaleReturnCheckupRuleVer;
    @XmlElement(name = "m_shipInspectRule")
    protected Long mShipInspectRule;
    @XmlElement(name = "m_shipInspectRuleVer")
    protected Long mShipInspectRuleVer;
    @XmlElement(name = "m_shipmentInspectRule")
    protected Long mShipmentInspectRule;
    @XmlElement(name = "m_shipmentInspectRuleVer")
    protected Long mShipmentInspectRuleVer;
    @XmlElement(name = "m_sysVersion")
    protected Long mSysVersion;

    /**
     * 获取itemMasterSKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getItemMasterSKey() {
        return itemMasterSKey;
    }

    /**
     * 设置itemMasterSKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setItemMasterSKey(JAXBElement<EntityKey> value) {
        this.itemMasterSKey = value;
    }

    /**
     * 获取multiQualityDescription属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MultiLangDataDict }{@code >}
     *     
     */
    public JAXBElement<MultiLangDataDict> getMultiQualityDescription() {
        return multiQualityDescription;
    }

    /**
     * 设置multiQualityDescription属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MultiLangDataDict }{@code >}
     *     
     */
    public void setMultiQualityDescription(JAXBElement<MultiLangDataDict> value) {
        this.multiQualityDescription = value;
    }

    /**
     * 获取qualityDescription属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getQualityDescription() {
        return qualityDescription;
    }

    /**
     * 设置qualityDescription属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setQualityDescription(JAXBElement<String> value) {
        this.qualityDescription = value;
    }

    /**
     * 获取mBuildCompleteCheckUpRule属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMBuildCompleteCheckUpRule() {
        return mBuildCompleteCheckUpRule;
    }

    /**
     * 设置mBuildCompleteCheckUpRule属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMBuildCompleteCheckUpRule(Long value) {
        this.mBuildCompleteCheckUpRule = value;
    }

    /**
     * 获取mBuildCompleteCheckUpRuleVer属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMBuildCompleteCheckUpRuleVer() {
        return mBuildCompleteCheckUpRuleVer;
    }

    /**
     * 设置mBuildCompleteCheckUpRuleVer属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMBuildCompleteCheckUpRuleVer(Long value) {
        this.mBuildCompleteCheckUpRuleVer = value;
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
     * 获取mDestroyInspectQty属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMDestroyInspectQty() {
        return mDestroyInspectQty;
    }

    /**
     * 设置mDestroyInspectQty属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMDestroyInspectQty(Integer value) {
        this.mDestroyInspectQty = value;
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
     * 获取mInStockInspectRule属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMInStockInspectRule() {
        return mInStockInspectRule;
    }

    /**
     * 设置mInStockInspectRule属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMInStockInspectRule(Long value) {
        this.mInStockInspectRule = value;
    }

    /**
     * 获取mInStockInspectRuleVer属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMInStockInspectRuleVer() {
        return mInStockInspectRuleVer;
    }

    /**
     * 设置mInStockInspectRuleVer属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMInStockInspectRuleVer(Long value) {
        this.mInStockInspectRuleVer = value;
    }

    /**
     * 获取mInspectPeriod属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMInspectPeriod() {
        return mInspectPeriod;
    }

    /**
     * 设置mInspectPeriod属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMInspectPeriod(Integer value) {
        this.mInspectPeriod = value;
    }

    /**
     * 获取mItemMaster属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOSCMItemItemMasterData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9CBOSCMItemItemMasterData> getMItemMaster() {
        return mItemMaster;
    }

    /**
     * 设置mItemMaster属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOSCMItemItemMasterData }{@code >}
     *     
     */
    public void setMItemMaster(JAXBElement<UFIDAU9CBOSCMItemItemMasterData> value) {
        this.mItemMaster = value;
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
     * 获取mReceiptInspectRule属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMReceiptInspectRule() {
        return mReceiptInspectRule;
    }

    /**
     * 设置mReceiptInspectRule属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMReceiptInspectRule(Long value) {
        this.mReceiptInspectRule = value;
    }

    /**
     * 获取mReceiptInspectRuleVer属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMReceiptInspectRuleVer() {
        return mReceiptInspectRuleVer;
    }

    /**
     * 设置mReceiptInspectRuleVer属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMReceiptInspectRuleVer(Long value) {
        this.mReceiptInspectRuleVer = value;
    }

    /**
     * 获取mSaleReturnCheckupRule属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMSaleReturnCheckupRule() {
        return mSaleReturnCheckupRule;
    }

    /**
     * 设置mSaleReturnCheckupRule属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMSaleReturnCheckupRule(Long value) {
        this.mSaleReturnCheckupRule = value;
    }

    /**
     * 获取mSaleReturnCheckupRuleVer属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMSaleReturnCheckupRuleVer() {
        return mSaleReturnCheckupRuleVer;
    }

    /**
     * 设置mSaleReturnCheckupRuleVer属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMSaleReturnCheckupRuleVer(Long value) {
        this.mSaleReturnCheckupRuleVer = value;
    }

    /**
     * 获取mShipInspectRule属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMShipInspectRule() {
        return mShipInspectRule;
    }

    /**
     * 设置mShipInspectRule属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMShipInspectRule(Long value) {
        this.mShipInspectRule = value;
    }

    /**
     * 获取mShipInspectRuleVer属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMShipInspectRuleVer() {
        return mShipInspectRuleVer;
    }

    /**
     * 设置mShipInspectRuleVer属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMShipInspectRuleVer(Long value) {
        this.mShipInspectRuleVer = value;
    }

    /**
     * 获取mShipmentInspectRule属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMShipmentInspectRule() {
        return mShipmentInspectRule;
    }

    /**
     * 设置mShipmentInspectRule属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMShipmentInspectRule(Long value) {
        this.mShipmentInspectRule = value;
    }

    /**
     * 获取mShipmentInspectRuleVer属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMShipmentInspectRuleVer() {
        return mShipmentInspectRuleVer;
    }

    /**
     * 设置mShipmentInspectRuleVer属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMShipmentInspectRuleVer(Long value) {
        this.mShipmentInspectRuleVer = value;
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

}
