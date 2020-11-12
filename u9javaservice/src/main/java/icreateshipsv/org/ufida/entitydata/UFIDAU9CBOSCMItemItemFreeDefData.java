
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
 * &lt;p&gt;UFIDA.U9.CBO.SCM.Item.ItemFreeDefData complex type�� Java �ࡣ
 * 
 * &lt;p&gt;����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="UFIDA.U9.CBO.SCM.Item.ItemFreeDefData"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://www.UFIDA.org/EntityData}UFSoft.UBF.Business.DataTransObjectBase"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="FreeDef" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="FreeDef_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ItemMaster_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_createdBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_createdOn" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_iD" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isCalcCost" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isEffectAP" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isEffectAR" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isEffectCost" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isEffectPrice" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isEffectTicket" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_itemFreeValues" type="{http://www.UFIDA.org/EntityData}ArrayOfUFIDA.U9.CBO.SCM.Item.ItemFreeValueDefData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_itemMaster" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CBO.SCM.Item.ItemMasterData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_modifiedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_modifiedOn" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_seqNum" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_srcRowID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
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
@XmlType(name = "UFIDA.U9.CBO.SCM.Item.ItemFreeDefData", propOrder = {
    "freeDef",
    "freeDefSKey",
    "itemMasterSKey",
    "mCreatedBy",
    "mCreatedOn",
    "mid",
    "mIsCalcCost",
    "mIsEffectAP",
    "mIsEffectAR",
    "mIsEffectCost",
    "mIsEffectPrice",
    "mIsEffectTicket",
    "mItemFreeValues",
    "mItemMaster",
    "mModifiedBy",
    "mModifiedOn",
    "mSeqNum",
    "mSrcRowID",
    "mSysVersion"
})
public class UFIDAU9CBOSCMItemItemFreeDefData
    extends UFSoftUBFBusinessDataTransObjectBase
{

    @XmlElement(name = "FreeDef")
    protected Long freeDef;
    @XmlElementRef(name = "FreeDef_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> freeDefSKey;
    @XmlElementRef(name = "ItemMaster_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> itemMasterSKey;
    @XmlElementRef(name = "m_createdBy", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mCreatedBy;
    @XmlElement(name = "m_createdOn")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mCreatedOn;
    @XmlElement(name = "m_iD")
    protected Long mid;
    @XmlElement(name = "m_isCalcCost")
    protected Boolean mIsCalcCost;
    @XmlElement(name = "m_isEffectAP")
    protected Boolean mIsEffectAP;
    @XmlElement(name = "m_isEffectAR")
    protected Boolean mIsEffectAR;
    @XmlElement(name = "m_isEffectCost")
    protected Boolean mIsEffectCost;
    @XmlElement(name = "m_isEffectPrice")
    protected Boolean mIsEffectPrice;
    @XmlElement(name = "m_isEffectTicket")
    protected Boolean mIsEffectTicket;
    @XmlElementRef(name = "m_itemFreeValues", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfUFIDAU9CBOSCMItemItemFreeValueDefData> mItemFreeValues;
    @XmlElementRef(name = "m_itemMaster", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9CBOSCMItemItemMasterData> mItemMaster;
    @XmlElementRef(name = "m_modifiedBy", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mModifiedBy;
    @XmlElement(name = "m_modifiedOn")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mModifiedOn;
    @XmlElement(name = "m_seqNum")
    protected Integer mSeqNum;
    @XmlElement(name = "m_srcRowID")
    protected Long mSrcRowID;
    @XmlElement(name = "m_sysVersion")
    protected Long mSysVersion;

    /**
     * ��ȡfreeDef���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getFreeDef() {
        return freeDef;
    }

    /**
     * ����freeDef���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFreeDef(Long value) {
        this.freeDef = value;
    }

    /**
     * ��ȡfreeDefSKey���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getFreeDefSKey() {
        return freeDefSKey;
    }

    /**
     * ����freeDefSKey���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setFreeDefSKey(JAXBElement<EntityKey> value) {
        this.freeDefSKey = value;
    }

    /**
     * ��ȡitemMasterSKey���Ե�ֵ��
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
     * ����itemMasterSKey���Ե�ֵ��
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
     * ��ȡmIsCalcCost���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsCalcCost() {
        return mIsCalcCost;
    }

    /**
     * ����mIsCalcCost���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsCalcCost(Boolean value) {
        this.mIsCalcCost = value;
    }

    /**
     * ��ȡmIsEffectAP���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsEffectAP() {
        return mIsEffectAP;
    }

    /**
     * ����mIsEffectAP���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsEffectAP(Boolean value) {
        this.mIsEffectAP = value;
    }

    /**
     * ��ȡmIsEffectAR���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsEffectAR() {
        return mIsEffectAR;
    }

    /**
     * ����mIsEffectAR���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsEffectAR(Boolean value) {
        this.mIsEffectAR = value;
    }

    /**
     * ��ȡmIsEffectCost���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsEffectCost() {
        return mIsEffectCost;
    }

    /**
     * ����mIsEffectCost���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsEffectCost(Boolean value) {
        this.mIsEffectCost = value;
    }

    /**
     * ��ȡmIsEffectPrice���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsEffectPrice() {
        return mIsEffectPrice;
    }

    /**
     * ����mIsEffectPrice���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsEffectPrice(Boolean value) {
        this.mIsEffectPrice = value;
    }

    /**
     * ��ȡmIsEffectTicket���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsEffectTicket() {
        return mIsEffectTicket;
    }

    /**
     * ����mIsEffectTicket���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsEffectTicket(Boolean value) {
        this.mIsEffectTicket = value;
    }

    /**
     * ��ȡmItemFreeValues���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUFIDAU9CBOSCMItemItemFreeValueDefData }{@code >}
     *     
     */
    public JAXBElement<ArrayOfUFIDAU9CBOSCMItemItemFreeValueDefData> getMItemFreeValues() {
        return mItemFreeValues;
    }

    /**
     * ����mItemFreeValues���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUFIDAU9CBOSCMItemItemFreeValueDefData }{@code >}
     *     
     */
    public void setMItemFreeValues(JAXBElement<ArrayOfUFIDAU9CBOSCMItemItemFreeValueDefData> value) {
        this.mItemFreeValues = value;
    }

    /**
     * ��ȡmItemMaster���Ե�ֵ��
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
     * ����mItemMaster���Ե�ֵ��
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
     * ��ȡmSeqNum���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMSeqNum() {
        return mSeqNum;
    }

    /**
     * ����mSeqNum���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMSeqNum(Integer value) {
        this.mSeqNum = value;
    }

    /**
     * ��ȡmSrcRowID���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMSrcRowID() {
        return mSrcRowID;
    }

    /**
     * ����mSrcRowID���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMSrcRowID(Long value) {
        this.mSrcRowID = value;
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
