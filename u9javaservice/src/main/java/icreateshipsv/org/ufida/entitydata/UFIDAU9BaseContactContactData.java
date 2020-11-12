
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
 * &lt;p&gt;UFIDA.U9.Base.Contact.ContactData complex type�� Java �ࡣ
 * 
 * &lt;p&gt;����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡdefaultLocation���Ե�ֵ��
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
     * ����defaultLocation���Ե�ֵ��
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
     * ��ȡdefaultLocationSKey���Ե�ֵ��
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
     * ����defaultLocationSKey���Ե�ֵ��
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
     * ��ȡenterpriseSKey���Ե�ֵ��
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
     * ����enterpriseSKey���Ե�ֵ��
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
     * ��ȡmultiName���Ե�ֵ��
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
     * ����multiName���Ե�ֵ��
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
     * ��ȡmultiTitle���Ե�ֵ��
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
     * ����multiTitle���Ե�ֵ��
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
     * ��ȡname���Ե�ֵ��
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
     * ����name���Ե�ֵ��
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
     * ��ȡtitle���Ե�ֵ��
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
     * ����title���Ե�ֵ��
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
     * ��ȡmAddresses���Ե�ֵ��
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
     * ����mAddresses���Ե�ֵ��
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
     * ��ȡmBeepPagers���Ե�ֵ��
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
     * ����mBeepPagers���Ե�ֵ��
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
     * ��ȡmCode���Ե�ֵ��
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
     * ����mCode���Ե�ֵ��
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
     * ��ȡmContactType���Ե�ֵ��
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
     * ����mContactType���Ե�ֵ��
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
     * ��ȡmDefaultEmail���Ե�ֵ��
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
     * ����mDefaultEmail���Ե�ֵ��
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
     * ��ȡmDefaultFaxNum���Ե�ֵ��
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
     * ����mDefaultFaxNum���Ե�ֵ��
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
     * ��ȡmDefaultIMs���Ե�ֵ��
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
     * ����mDefaultIMs���Ե�ֵ��
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
     * ��ȡmDefaultMobilNum���Ե�ֵ��
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
     * ����mDefaultMobilNum���Ե�ֵ��
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
     * ��ȡmDefaultPhoneNum���Ե�ֵ��
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
     * ����mDefaultPhoneNum���Ե�ֵ��
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
     * ��ȡmDefaultURLAddr���Ե�ֵ��
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
     * ����mDefaultURLAddr���Ե�ֵ��
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
     * ��ȡmDepartment���Ե�ֵ��
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
     * ����mDepartment���Ե�ֵ��
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
     * ��ȡmEffective���Ե�ֵ��
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
     * ����mEffective���Ե�ֵ��
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
     * ��ȡmEmails���Ե�ֵ��
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
     * ����mEmails���Ե�ֵ��
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
     * ��ȡmEnterprise���Ե�ֵ��
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
     * ����mEnterprise���Ե�ֵ��
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
     * ��ȡmFaxs���Ե�ֵ��
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
     * ����mFaxs���Ե�ֵ��
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
     * ��ȡmGender���Ե�ֵ��
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
     * ����mGender���Ե�ֵ��
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
     * ��ȡmiMs���Ե�ֵ��
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
     * ����miMs���Ե�ֵ��
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
     * ��ȡmIsCustomerContact���Ե�ֵ��
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
     * ����mIsCustomerContact���Ե�ֵ��
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
     * ��ȡmIsEmailNotify���Ե�ֵ��
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
     * ����mIsEmailNotify���Ե�ֵ��
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
     * ��ȡmIsEmployeeContact���Ե�ֵ��
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
     * ����mIsEmployeeContact���Ե�ֵ��
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
     * ��ȡmIsMessageNotify���Ե�ֵ��
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
     * ����mIsMessageNotify���Ե�ֵ��
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
     * ��ȡmIsOrgContact���Ե�ֵ��
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
     * ����mIsOrgContact���Ե�ֵ��
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
     * ��ȡmIsSupplierContact���Ե�ֵ��
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
     * ����mIsSupplierContact���Ե�ֵ��
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
     * ��ȡmJob���Ե�ֵ��
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
     * ����mJob���Ե�ֵ��
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
     * ��ȡmMasterSite���Ե�ֵ��
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
     * ����mMasterSite���Ե�ֵ��
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
     * ��ȡmMobils���Ե�ֵ��
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
     * ����mMobils���Ե�ֵ��
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
     * ��ȡmPersonName���Ե�ֵ��
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
     * ����mPersonName���Ե�ֵ��
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
     * ��ȡmPhones���Ե�ֵ��
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
     * ����mPhones���Ե�ֵ��
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
     * ��ȡmurLs���Ե�ֵ��
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
     * ����murLs���Ե�ֵ��
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
