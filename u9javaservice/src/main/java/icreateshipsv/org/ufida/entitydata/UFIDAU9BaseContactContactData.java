
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
 * &lt;p&gt;UFIDA.U9.Base.Contact.ContactData complex type的 Java 类。
 * 
 * &lt;p&gt;以下模式片段指定包含在此类中的预期内容。
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="UFIDA.U9.Base.Contact.ContactData"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://www.UFIDA.org/EntityData}UFSoft.UBF.Business.DataTransObjectBase"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="DefaultLocation" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="DefaultLocation_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Enterprise_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Multi_Name" type="{UFSoft.UBF.Util.Data}MultiLangDataDict" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Multi_Title" type="{UFSoft.UBF.Util.Data}MultiLangDataDict" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_addresses" type="{http://www.UFIDA.org/EntityData}ArrayOfUFIDA.U9.Base.Contact.AddressData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_beepPagers" type="{http://www.UFIDA.org/EntityData}ArrayOfUFIDA.U9.Base.Contact.BeepPagerData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_contactType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_createdBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_createdOn" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_defaultEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_defaultFaxNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_defaultIMs" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_defaultMobilNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_defaultPhoneNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_defaultURLAddr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_department" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_effective" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.Base.PropertyTypes.EffectiveData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_emails" type="{http://www.UFIDA.org/EntityData}ArrayOfUFIDA.U9.Base.Contact.EmailData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_enterprise" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.Base.Contact.ContactData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_faxs" type="{http://www.UFIDA.org/EntityData}ArrayOfUFIDA.U9.Base.Contact.FaxData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_gender" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_iD" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_iMs" type="{http://www.UFIDA.org/EntityData}ArrayOfUFIDA.U9.Base.Contact.IMData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isCustomerContact" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isEmailNotify" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isEmployeeContact" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isMessageNotify" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isOrgContact" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isSupplierContact" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_job" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_masterSite" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_mobils" type="{http://www.UFIDA.org/EntityData}ArrayOfUFIDA.U9.Base.Contact.MobilData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_modifiedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_modifiedOn" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_personName" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.Base.Contact.NameData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_phones" type="{http://www.UFIDA.org/EntityData}ArrayOfUFIDA.U9.Base.Contact.PhoneData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_sysVersion" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_uRLs" type="{http://www.UFIDA.org/EntityData}ArrayOfUFIDA.U9.Base.Contact.URLData" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UFIDA.U9.Base.Contact.ContactData", propOrder = {
    "defaultLocation",
    "defaultLocationSKey",
    "enterpriseSKey",
    "multiName",
    "multiTitle",
    "name",
    "title",
    "mAddresses",
    "mBeepPagers",
    "mCode",
    "mContactType",
    "mCreatedBy",
    "mCreatedOn",
    "mDefaultEmail",
    "mDefaultFaxNum",
    "mDefaultIMs",
    "mDefaultMobilNum",
    "mDefaultPhoneNum",
    "mDefaultURLAddr",
    "mDepartment",
    "mEffective",
    "mEmails",
    "mEnterprise",
    "mFaxs",
    "mGender",
    "mid",
    "miMs",
    "mIsCustomerContact",
    "mIsEmailNotify",
    "mIsEmployeeContact",
    "mIsMessageNotify",
    "mIsOrgContact",
    "mIsSupplierContact",
    "mJob",
    "mMasterSite",
    "mMobils",
    "mModifiedBy",
    "mModifiedOn",
    "mPersonName",
    "mPhones",
    "mSysVersion",
    "murLs"
})
public class UFIDAU9BaseContactContactData
    extends UFSoftUBFBusinessDataTransObjectBase
{

    @XmlElement(name = "DefaultLocation")
    protected Long defaultLocation;
    @XmlElementRef(name = "DefaultLocation_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> defaultLocationSKey;
    @XmlElementRef(name = "Enterprise_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> enterpriseSKey;
    @XmlElementRef(name = "Multi_Name", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<MultiLangDataDict> multiName;
    @XmlElementRef(name = "Multi_Title", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<MultiLangDataDict> multiTitle;
    @XmlElementRef(name = "Name", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> name;
    @XmlElementRef(name = "Title", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> title;
    @XmlElementRef(name = "m_addresses", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfUFIDAU9BaseContactAddressData> mAddresses;
    @XmlElementRef(name = "m_beepPagers", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfUFIDAU9BaseContactBeepPagerData> mBeepPagers;
    @XmlElementRef(name = "m_code", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mCode;
    @XmlElement(name = "m_contactType")
    protected Integer mContactType;
    @XmlElementRef(name = "m_createdBy", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mCreatedBy;
    @XmlElement(name = "m_createdOn")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mCreatedOn;
    @XmlElementRef(name = "m_defaultEmail", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mDefaultEmail;
    @XmlElementRef(name = "m_defaultFaxNum", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mDefaultFaxNum;
    @XmlElementRef(name = "m_defaultIMs", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mDefaultIMs;
    @XmlElementRef(name = "m_defaultMobilNum", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mDefaultMobilNum;
    @XmlElementRef(name = "m_defaultPhoneNum", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mDefaultPhoneNum;
    @XmlElementRef(name = "m_defaultURLAddr", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mDefaultURLAddr;
    @XmlElementRef(name = "m_department", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mDepartment;
    @XmlElementRef(name = "m_effective", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9BasePropertyTypesEffectiveData> mEffective;
    @XmlElementRef(name = "m_emails", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfUFIDAU9BaseContactEmailData> mEmails;
    @XmlElementRef(name = "m_enterprise", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9BaseContactContactData> mEnterprise;
    @XmlElementRef(name = "m_faxs", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfUFIDAU9BaseContactFaxData> mFaxs;
    @XmlElement(name = "m_gender")
    protected Integer mGender;
    @XmlElement(name = "m_iD")
    protected Long mid;
    @XmlElementRef(name = "m_iMs", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfUFIDAU9BaseContactIMData> miMs;
    @XmlElement(name = "m_isCustomerContact")
    protected Boolean mIsCustomerContact;
    @XmlElement(name = "m_isEmailNotify")
    protected Boolean mIsEmailNotify;
    @XmlElement(name = "m_isEmployeeContact")
    protected Boolean mIsEmployeeContact;
    @XmlElement(name = "m_isMessageNotify")
    protected Boolean mIsMessageNotify;
    @XmlElement(name = "m_isOrgContact")
    protected Boolean mIsOrgContact;
    @XmlElement(name = "m_isSupplierContact")
    protected Boolean mIsSupplierContact;
    @XmlElementRef(name = "m_job", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mJob;
    @XmlElementRef(name = "m_masterSite", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mMasterSite;
    @XmlElementRef(name = "m_mobils", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfUFIDAU9BaseContactMobilData> mMobils;
    @XmlElementRef(name = "m_modifiedBy", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mModifiedBy;
    @XmlElement(name = "m_modifiedOn")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mModifiedOn;
    @XmlElementRef(name = "m_personName", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9BaseContactNameData> mPersonName;
    @XmlElementRef(name = "m_phones", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfUFIDAU9BaseContactPhoneData> mPhones;
    @XmlElement(name = "m_sysVersion")
    protected Long mSysVersion;
    @XmlElementRef(name = "m_uRLs", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfUFIDAU9BaseContactURLData> murLs;

    /**
     * 获取defaultLocation属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDefaultLocation() {
        return defaultLocation;
    }

    /**
     * 设置defaultLocation属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDefaultLocation(Long value) {
        this.defaultLocation = value;
    }

    /**
     * 获取defaultLocationSKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getDefaultLocationSKey() {
        return defaultLocationSKey;
    }

    /**
     * 设置defaultLocationSKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setDefaultLocationSKey(JAXBElement<EntityKey> value) {
        this.defaultLocationSKey = value;
    }

    /**
     * 获取enterpriseSKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getEnterpriseSKey() {
        return enterpriseSKey;
    }

    /**
     * 设置enterpriseSKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setEnterpriseSKey(JAXBElement<EntityKey> value) {
        this.enterpriseSKey = value;
    }

    /**
     * 获取multiName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MultiLangDataDict }{@code >}
     *     
     */
    public JAXBElement<MultiLangDataDict> getMultiName() {
        return multiName;
    }

    /**
     * 设置multiName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MultiLangDataDict }{@code >}
     *     
     */
    public void setMultiName(JAXBElement<MultiLangDataDict> value) {
        this.multiName = value;
    }

    /**
     * 获取multiTitle属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MultiLangDataDict }{@code >}
     *     
     */
    public JAXBElement<MultiLangDataDict> getMultiTitle() {
        return multiTitle;
    }

    /**
     * 设置multiTitle属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MultiLangDataDict }{@code >}
     *     
     */
    public void setMultiTitle(JAXBElement<MultiLangDataDict> value) {
        this.multiTitle = value;
    }

    /**
     * 获取name属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getName() {
        return name;
    }

    /**
     * 设置name属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setName(JAXBElement<String> value) {
        this.name = value;
    }

    /**
     * 获取title属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTitle() {
        return title;
    }

    /**
     * 设置title属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTitle(JAXBElement<String> value) {
        this.title = value;
    }

    /**
     * 获取mAddresses属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUFIDAU9BaseContactAddressData }{@code >}
     *     
     */
    public JAXBElement<ArrayOfUFIDAU9BaseContactAddressData> getMAddresses() {
        return mAddresses;
    }

    /**
     * 设置mAddresses属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUFIDAU9BaseContactAddressData }{@code >}
     *     
     */
    public void setMAddresses(JAXBElement<ArrayOfUFIDAU9BaseContactAddressData> value) {
        this.mAddresses = value;
    }

    /**
     * 获取mBeepPagers属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUFIDAU9BaseContactBeepPagerData }{@code >}
     *     
     */
    public JAXBElement<ArrayOfUFIDAU9BaseContactBeepPagerData> getMBeepPagers() {
        return mBeepPagers;
    }

    /**
     * 设置mBeepPagers属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUFIDAU9BaseContactBeepPagerData }{@code >}
     *     
     */
    public void setMBeepPagers(JAXBElement<ArrayOfUFIDAU9BaseContactBeepPagerData> value) {
        this.mBeepPagers = value;
    }

    /**
     * 获取mCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMCode() {
        return mCode;
    }

    /**
     * 设置mCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMCode(JAXBElement<String> value) {
        this.mCode = value;
    }

    /**
     * 获取mContactType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMContactType() {
        return mContactType;
    }

    /**
     * 设置mContactType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMContactType(Integer value) {
        this.mContactType = value;
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
     * 获取mDefaultEmail属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMDefaultEmail() {
        return mDefaultEmail;
    }

    /**
     * 设置mDefaultEmail属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMDefaultEmail(JAXBElement<String> value) {
        this.mDefaultEmail = value;
    }

    /**
     * 获取mDefaultFaxNum属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMDefaultFaxNum() {
        return mDefaultFaxNum;
    }

    /**
     * 设置mDefaultFaxNum属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMDefaultFaxNum(JAXBElement<String> value) {
        this.mDefaultFaxNum = value;
    }

    /**
     * 获取mDefaultIMs属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMDefaultIMs() {
        return mDefaultIMs;
    }

    /**
     * 设置mDefaultIMs属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMDefaultIMs(JAXBElement<String> value) {
        this.mDefaultIMs = value;
    }

    /**
     * 获取mDefaultMobilNum属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMDefaultMobilNum() {
        return mDefaultMobilNum;
    }

    /**
     * 设置mDefaultMobilNum属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMDefaultMobilNum(JAXBElement<String> value) {
        this.mDefaultMobilNum = value;
    }

    /**
     * 获取mDefaultPhoneNum属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMDefaultPhoneNum() {
        return mDefaultPhoneNum;
    }

    /**
     * 设置mDefaultPhoneNum属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMDefaultPhoneNum(JAXBElement<String> value) {
        this.mDefaultPhoneNum = value;
    }

    /**
     * 获取mDefaultURLAddr属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMDefaultURLAddr() {
        return mDefaultURLAddr;
    }

    /**
     * 设置mDefaultURLAddr属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMDefaultURLAddr(JAXBElement<String> value) {
        this.mDefaultURLAddr = value;
    }

    /**
     * 获取mDepartment属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMDepartment() {
        return mDepartment;
    }

    /**
     * 设置mDepartment属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMDepartment(JAXBElement<String> value) {
        this.mDepartment = value;
    }

    /**
     * 获取mEffective属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9BasePropertyTypesEffectiveData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9BasePropertyTypesEffectiveData> getMEffective() {
        return mEffective;
    }

    /**
     * 设置mEffective属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9BasePropertyTypesEffectiveData }{@code >}
     *     
     */
    public void setMEffective(JAXBElement<UFIDAU9BasePropertyTypesEffectiveData> value) {
        this.mEffective = value;
    }

    /**
     * 获取mEmails属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUFIDAU9BaseContactEmailData }{@code >}
     *     
     */
    public JAXBElement<ArrayOfUFIDAU9BaseContactEmailData> getMEmails() {
        return mEmails;
    }

    /**
     * 设置mEmails属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUFIDAU9BaseContactEmailData }{@code >}
     *     
     */
    public void setMEmails(JAXBElement<ArrayOfUFIDAU9BaseContactEmailData> value) {
        this.mEmails = value;
    }

    /**
     * 获取mEnterprise属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9BaseContactContactData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9BaseContactContactData> getMEnterprise() {
        return mEnterprise;
    }

    /**
     * 设置mEnterprise属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9BaseContactContactData }{@code >}
     *     
     */
    public void setMEnterprise(JAXBElement<UFIDAU9BaseContactContactData> value) {
        this.mEnterprise = value;
    }

    /**
     * 获取mFaxs属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUFIDAU9BaseContactFaxData }{@code >}
     *     
     */
    public JAXBElement<ArrayOfUFIDAU9BaseContactFaxData> getMFaxs() {
        return mFaxs;
    }

    /**
     * 设置mFaxs属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUFIDAU9BaseContactFaxData }{@code >}
     *     
     */
    public void setMFaxs(JAXBElement<ArrayOfUFIDAU9BaseContactFaxData> value) {
        this.mFaxs = value;
    }

    /**
     * 获取mGender属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMGender() {
        return mGender;
    }

    /**
     * 设置mGender属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMGender(Integer value) {
        this.mGender = value;
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
     * 获取miMs属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUFIDAU9BaseContactIMData }{@code >}
     *     
     */
    public JAXBElement<ArrayOfUFIDAU9BaseContactIMData> getMIMs() {
        return miMs;
    }

    /**
     * 设置miMs属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUFIDAU9BaseContactIMData }{@code >}
     *     
     */
    public void setMIMs(JAXBElement<ArrayOfUFIDAU9BaseContactIMData> value) {
        this.miMs = value;
    }

    /**
     * 获取mIsCustomerContact属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsCustomerContact() {
        return mIsCustomerContact;
    }

    /**
     * 设置mIsCustomerContact属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsCustomerContact(Boolean value) {
        this.mIsCustomerContact = value;
    }

    /**
     * 获取mIsEmailNotify属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsEmailNotify() {
        return mIsEmailNotify;
    }

    /**
     * 设置mIsEmailNotify属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsEmailNotify(Boolean value) {
        this.mIsEmailNotify = value;
    }

    /**
     * 获取mIsEmployeeContact属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsEmployeeContact() {
        return mIsEmployeeContact;
    }

    /**
     * 设置mIsEmployeeContact属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsEmployeeContact(Boolean value) {
        this.mIsEmployeeContact = value;
    }

    /**
     * 获取mIsMessageNotify属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsMessageNotify() {
        return mIsMessageNotify;
    }

    /**
     * 设置mIsMessageNotify属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsMessageNotify(Boolean value) {
        this.mIsMessageNotify = value;
    }

    /**
     * 获取mIsOrgContact属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsOrgContact() {
        return mIsOrgContact;
    }

    /**
     * 设置mIsOrgContact属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsOrgContact(Boolean value) {
        this.mIsOrgContact = value;
    }

    /**
     * 获取mIsSupplierContact属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsSupplierContact() {
        return mIsSupplierContact;
    }

    /**
     * 设置mIsSupplierContact属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsSupplierContact(Boolean value) {
        this.mIsSupplierContact = value;
    }

    /**
     * 获取mJob属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMJob() {
        return mJob;
    }

    /**
     * 设置mJob属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMJob(JAXBElement<String> value) {
        this.mJob = value;
    }

    /**
     * 获取mMasterSite属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMMasterSite() {
        return mMasterSite;
    }

    /**
     * 设置mMasterSite属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMMasterSite(JAXBElement<String> value) {
        this.mMasterSite = value;
    }

    /**
     * 获取mMobils属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUFIDAU9BaseContactMobilData }{@code >}
     *     
     */
    public JAXBElement<ArrayOfUFIDAU9BaseContactMobilData> getMMobils() {
        return mMobils;
    }

    /**
     * 设置mMobils属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUFIDAU9BaseContactMobilData }{@code >}
     *     
     */
    public void setMMobils(JAXBElement<ArrayOfUFIDAU9BaseContactMobilData> value) {
        this.mMobils = value;
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
     * 获取mPersonName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9BaseContactNameData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9BaseContactNameData> getMPersonName() {
        return mPersonName;
    }

    /**
     * 设置mPersonName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9BaseContactNameData }{@code >}
     *     
     */
    public void setMPersonName(JAXBElement<UFIDAU9BaseContactNameData> value) {
        this.mPersonName = value;
    }

    /**
     * 获取mPhones属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUFIDAU9BaseContactPhoneData }{@code >}
     *     
     */
    public JAXBElement<ArrayOfUFIDAU9BaseContactPhoneData> getMPhones() {
        return mPhones;
    }

    /**
     * 设置mPhones属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUFIDAU9BaseContactPhoneData }{@code >}
     *     
     */
    public void setMPhones(JAXBElement<ArrayOfUFIDAU9BaseContactPhoneData> value) {
        this.mPhones = value;
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
     * 获取murLs属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUFIDAU9BaseContactURLData }{@code >}
     *     
     */
    public JAXBElement<ArrayOfUFIDAU9BaseContactURLData> getMURLs() {
        return murLs;
    }

    /**
     * 设置murLs属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUFIDAU9BaseContactURLData }{@code >}
     *     
     */
    public void setMURLs(JAXBElement<ArrayOfUFIDAU9BaseContactURLData> value) {
        this.murLs = value;
    }

}
