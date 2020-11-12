
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
 * &lt;p&gt;UFIDA.U9.Base.Organization.OrganizationData complex type�� Java �ࡣ
 * 
 * &lt;p&gt;����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="UFIDA.U9.Base.Organization.OrganizationData"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://www.UFIDA.org/EntityData}UFSoft.UBF.Business.DataTransObjectBase"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="BOMRefOrg_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Contact" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Contact_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="CurrencyFormat" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="CurrencyFormat_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="DateFormat" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="DateFormat_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="DefaultLanguage" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="DefaultLanguage_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Location" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Location_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Multi_Description" type="{UFSoft.UBF.Util.Data}MultiLangDataDict" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Multi_Name" type="{UFSoft.UBF.Util.Data}MultiLangDataDict" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="NumberFormat" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="NumberFormat_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="RegisterAddress" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="RegisterAddress_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="TimeFormat" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="TimeFormat_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="TimeZoneInfo" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="TimeZoneInfo_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="WorkCalendar" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="WorkCalendar_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_bOMRefOrg" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.Base.Organization.OrganizationData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_companyType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_createdBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_createdOn" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_defaultTheme" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_descFlexField" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.Base.FlexField.DescFlexField.DescFlexSegmentsData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_effective" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.Base.PropertyTypes.EffectiveData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_iD" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isAssetOrg" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isAuditOrg" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isBudgetOrg" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isHrOrg" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isInventoryOrg" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isLegacyOrg" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isOperatingOrg" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isPlantOrg" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isPortalOrg" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isProfitCenter" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isServiceOrg" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isSettlementOrg" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_manageType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_masterSite" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_modifiedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_modifiedOn" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_orgClassify" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_orgContacts" type="{http://www.UFIDA.org/EntityData}ArrayOfUFIDA.U9.Base.Organization.OrgContactData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_shortName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
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
@XmlType(name = "UFIDA.U9.Base.Organization.OrganizationData", propOrder = {
    "bomRefOrgSKey",
    "contact",
    "contactSKey",
    "currencyFormat",
    "currencyFormatSKey",
    "dateFormat",
    "dateFormatSKey",
    "defaultLanguage",
    "defaultLanguageSKey",
    "description",
    "location",
    "locationSKey",
    "multiDescription",
    "multiName",
    "name",
    "numberFormat",
    "numberFormatSKey",
    "registerAddress",
    "registerAddressSKey",
    "timeFormat",
    "timeFormatSKey",
    "timeZoneInfo",
    "timeZoneInfoSKey",
    "workCalendar",
    "workCalendarSKey",
    "mbomRefOrg",
    "mCode",
    "mCompanyType",
    "mCreatedBy",
    "mCreatedOn",
    "mDefaultTheme",
    "mDescFlexField",
    "mEffective",
    "mid",
    "mIsAssetOrg",
    "mIsAuditOrg",
    "mIsBudgetOrg",
    "mIsHrOrg",
    "mIsInventoryOrg",
    "mIsLegacyOrg",
    "mIsOperatingOrg",
    "mIsPlantOrg",
    "mIsPortalOrg",
    "mIsProfitCenter",
    "mIsServiceOrg",
    "mIsSettlementOrg",
    "mManageType",
    "mMasterSite",
    "mModifiedBy",
    "mModifiedOn",
    "mOrgClassify",
    "mOrgContacts",
    "mShortName",
    "mSysVersion"
})
public class UFIDAU9BaseOrganizationOrganizationData
    extends UFSoftUBFBusinessDataTransObjectBase
{

    @XmlElementRef(name = "BOMRefOrg_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> bomRefOrgSKey;
    @XmlElement(name = "Contact")
    protected Long contact;
    @XmlElementRef(name = "Contact_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> contactSKey;
    @XmlElement(name = "CurrencyFormat")
    protected Long currencyFormat;
    @XmlElementRef(name = "CurrencyFormat_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> currencyFormatSKey;
    @XmlElement(name = "DateFormat")
    protected Long dateFormat;
    @XmlElementRef(name = "DateFormat_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> dateFormatSKey;
    @XmlElement(name = "DefaultLanguage")
    protected Long defaultLanguage;
    @XmlElementRef(name = "DefaultLanguage_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> defaultLanguageSKey;
    @XmlElementRef(name = "Description", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> description;
    @XmlElement(name = "Location")
    protected Long location;
    @XmlElementRef(name = "Location_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> locationSKey;
    @XmlElementRef(name = "Multi_Description", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<MultiLangDataDict> multiDescription;
    @XmlElementRef(name = "Multi_Name", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<MultiLangDataDict> multiName;
    @XmlElementRef(name = "Name", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> name;
    @XmlElement(name = "NumberFormat")
    protected Long numberFormat;
    @XmlElementRef(name = "NumberFormat_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> numberFormatSKey;
    @XmlElement(name = "RegisterAddress")
    protected Long registerAddress;
    @XmlElementRef(name = "RegisterAddress_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> registerAddressSKey;
    @XmlElement(name = "TimeFormat")
    protected Long timeFormat;
    @XmlElementRef(name = "TimeFormat_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> timeFormatSKey;
    @XmlElement(name = "TimeZoneInfo")
    protected Long timeZoneInfo;
    @XmlElementRef(name = "TimeZoneInfo_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> timeZoneInfoSKey;
    @XmlElement(name = "WorkCalendar")
    protected Long workCalendar;
    @XmlElementRef(name = "WorkCalendar_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> workCalendarSKey;
    @XmlElementRef(name = "m_bOMRefOrg", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9BaseOrganizationOrganizationData> mbomRefOrg;
    @XmlElementRef(name = "m_code", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mCode;
    @XmlElement(name = "m_companyType")
    protected Integer mCompanyType;
    @XmlElementRef(name = "m_createdBy", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mCreatedBy;
    @XmlElement(name = "m_createdOn")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mCreatedOn;
    @XmlElement(name = "m_defaultTheme")
    protected Integer mDefaultTheme;
    @XmlElementRef(name = "m_descFlexField", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9BaseFlexFieldDescFlexFieldDescFlexSegmentsData> mDescFlexField;
    @XmlElementRef(name = "m_effective", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9BasePropertyTypesEffectiveData> mEffective;
    @XmlElement(name = "m_iD")
    protected Long mid;
    @XmlElement(name = "m_isAssetOrg")
    protected Boolean mIsAssetOrg;
    @XmlElement(name = "m_isAuditOrg")
    protected Boolean mIsAuditOrg;
    @XmlElement(name = "m_isBudgetOrg")
    protected Boolean mIsBudgetOrg;
    @XmlElement(name = "m_isHrOrg")
    protected Boolean mIsHrOrg;
    @XmlElement(name = "m_isInventoryOrg")
    protected Boolean mIsInventoryOrg;
    @XmlElement(name = "m_isLegacyOrg")
    protected Boolean mIsLegacyOrg;
    @XmlElement(name = "m_isOperatingOrg")
    protected Boolean mIsOperatingOrg;
    @XmlElement(name = "m_isPlantOrg")
    protected Boolean mIsPlantOrg;
    @XmlElement(name = "m_isPortalOrg")
    protected Boolean mIsPortalOrg;
    @XmlElement(name = "m_isProfitCenter")
    protected Boolean mIsProfitCenter;
    @XmlElement(name = "m_isServiceOrg")
    protected Boolean mIsServiceOrg;
    @XmlElement(name = "m_isSettlementOrg")
    protected Boolean mIsSettlementOrg;
    @XmlElement(name = "m_manageType")
    protected Integer mManageType;
    @XmlElementRef(name = "m_masterSite", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mMasterSite;
    @XmlElementRef(name = "m_modifiedBy", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mModifiedBy;
    @XmlElement(name = "m_modifiedOn")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mModifiedOn;
    @XmlElement(name = "m_orgClassify")
    protected Integer mOrgClassify;
    @XmlElementRef(name = "m_orgContacts", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfUFIDAU9BaseOrganizationOrgContactData> mOrgContacts;
    @XmlElementRef(name = "m_shortName", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mShortName;
    @XmlElement(name = "m_sysVersion")
    protected Long mSysVersion;

    /**
     * ��ȡbomRefOrgSKey���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getBOMRefOrgSKey() {
        return bomRefOrgSKey;
    }

    /**
     * ����bomRefOrgSKey���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setBOMRefOrgSKey(JAXBElement<EntityKey> value) {
        this.bomRefOrgSKey = value;
    }

    /**
     * ��ȡcontact���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getContact() {
        return contact;
    }

    /**
     * ����contact���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setContact(Long value) {
        this.contact = value;
    }

    /**
     * ��ȡcontactSKey���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getContactSKey() {
        return contactSKey;
    }

    /**
     * ����contactSKey���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setContactSKey(JAXBElement<EntityKey> value) {
        this.contactSKey = value;
    }

    /**
     * ��ȡcurrencyFormat���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCurrencyFormat() {
        return currencyFormat;
    }

    /**
     * ����currencyFormat���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCurrencyFormat(Long value) {
        this.currencyFormat = value;
    }

    /**
     * ��ȡcurrencyFormatSKey���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getCurrencyFormatSKey() {
        return currencyFormatSKey;
    }

    /**
     * ����currencyFormatSKey���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setCurrencyFormatSKey(JAXBElement<EntityKey> value) {
        this.currencyFormatSKey = value;
    }

    /**
     * ��ȡdateFormat���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDateFormat() {
        return dateFormat;
    }

    /**
     * ����dateFormat���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDateFormat(Long value) {
        this.dateFormat = value;
    }

    /**
     * ��ȡdateFormatSKey���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getDateFormatSKey() {
        return dateFormatSKey;
    }

    /**
     * ����dateFormatSKey���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setDateFormatSKey(JAXBElement<EntityKey> value) {
        this.dateFormatSKey = value;
    }

    /**
     * ��ȡdefaultLanguage���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDefaultLanguage() {
        return defaultLanguage;
    }

    /**
     * ����defaultLanguage���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDefaultLanguage(Long value) {
        this.defaultLanguage = value;
    }

    /**
     * ��ȡdefaultLanguageSKey���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getDefaultLanguageSKey() {
        return defaultLanguageSKey;
    }

    /**
     * ����defaultLanguageSKey���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setDefaultLanguageSKey(JAXBElement<EntityKey> value) {
        this.defaultLanguageSKey = value;
    }

    /**
     * ��ȡdescription���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDescription() {
        return description;
    }

    /**
     * ����description���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDescription(JAXBElement<String> value) {
        this.description = value;
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
     * ��ȡmultiDescription���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MultiLangDataDict }{@code >}
     *     
     */
    public JAXBElement<MultiLangDataDict> getMultiDescription() {
        return multiDescription;
    }

    /**
     * ����multiDescription���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MultiLangDataDict }{@code >}
     *     
     */
    public void setMultiDescription(JAXBElement<MultiLangDataDict> value) {
        this.multiDescription = value;
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
     * ��ȡnumberFormat���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNumberFormat() {
        return numberFormat;
    }

    /**
     * ����numberFormat���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNumberFormat(Long value) {
        this.numberFormat = value;
    }

    /**
     * ��ȡnumberFormatSKey���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getNumberFormatSKey() {
        return numberFormatSKey;
    }

    /**
     * ����numberFormatSKey���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setNumberFormatSKey(JAXBElement<EntityKey> value) {
        this.numberFormatSKey = value;
    }

    /**
     * ��ȡregisterAddress���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRegisterAddress() {
        return registerAddress;
    }

    /**
     * ����registerAddress���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRegisterAddress(Long value) {
        this.registerAddress = value;
    }

    /**
     * ��ȡregisterAddressSKey���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getRegisterAddressSKey() {
        return registerAddressSKey;
    }

    /**
     * ����registerAddressSKey���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setRegisterAddressSKey(JAXBElement<EntityKey> value) {
        this.registerAddressSKey = value;
    }

    /**
     * ��ȡtimeFormat���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTimeFormat() {
        return timeFormat;
    }

    /**
     * ����timeFormat���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTimeFormat(Long value) {
        this.timeFormat = value;
    }

    /**
     * ��ȡtimeFormatSKey���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getTimeFormatSKey() {
        return timeFormatSKey;
    }

    /**
     * ����timeFormatSKey���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setTimeFormatSKey(JAXBElement<EntityKey> value) {
        this.timeFormatSKey = value;
    }

    /**
     * ��ȡtimeZoneInfo���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTimeZoneInfo() {
        return timeZoneInfo;
    }

    /**
     * ����timeZoneInfo���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTimeZoneInfo(Long value) {
        this.timeZoneInfo = value;
    }

    /**
     * ��ȡtimeZoneInfoSKey���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getTimeZoneInfoSKey() {
        return timeZoneInfoSKey;
    }

    /**
     * ����timeZoneInfoSKey���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setTimeZoneInfoSKey(JAXBElement<EntityKey> value) {
        this.timeZoneInfoSKey = value;
    }

    /**
     * ��ȡworkCalendar���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getWorkCalendar() {
        return workCalendar;
    }

    /**
     * ����workCalendar���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setWorkCalendar(Long value) {
        this.workCalendar = value;
    }

    /**
     * ��ȡworkCalendarSKey���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getWorkCalendarSKey() {
        return workCalendarSKey;
    }

    /**
     * ����workCalendarSKey���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setWorkCalendarSKey(JAXBElement<EntityKey> value) {
        this.workCalendarSKey = value;
    }

    /**
     * ��ȡmbomRefOrg���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9BaseOrganizationOrganizationData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9BaseOrganizationOrganizationData> getMBOMRefOrg() {
        return mbomRefOrg;
    }

    /**
     * ����mbomRefOrg���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9BaseOrganizationOrganizationData }{@code >}
     *     
     */
    public void setMBOMRefOrg(JAXBElement<UFIDAU9BaseOrganizationOrganizationData> value) {
        this.mbomRefOrg = value;
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
     * ��ȡmCompanyType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMCompanyType() {
        return mCompanyType;
    }

    /**
     * ����mCompanyType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMCompanyType(Integer value) {
        this.mCompanyType = value;
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
     * ��ȡmDefaultTheme���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMDefaultTheme() {
        return mDefaultTheme;
    }

    /**
     * ����mDefaultTheme���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMDefaultTheme(Integer value) {
        this.mDefaultTheme = value;
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
     * ��ȡmIsAssetOrg���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsAssetOrg() {
        return mIsAssetOrg;
    }

    /**
     * ����mIsAssetOrg���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsAssetOrg(Boolean value) {
        this.mIsAssetOrg = value;
    }

    /**
     * ��ȡmIsAuditOrg���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsAuditOrg() {
        return mIsAuditOrg;
    }

    /**
     * ����mIsAuditOrg���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsAuditOrg(Boolean value) {
        this.mIsAuditOrg = value;
    }

    /**
     * ��ȡmIsBudgetOrg���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsBudgetOrg() {
        return mIsBudgetOrg;
    }

    /**
     * ����mIsBudgetOrg���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsBudgetOrg(Boolean value) {
        this.mIsBudgetOrg = value;
    }

    /**
     * ��ȡmIsHrOrg���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsHrOrg() {
        return mIsHrOrg;
    }

    /**
     * ����mIsHrOrg���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsHrOrg(Boolean value) {
        this.mIsHrOrg = value;
    }

    /**
     * ��ȡmIsInventoryOrg���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsInventoryOrg() {
        return mIsInventoryOrg;
    }

    /**
     * ����mIsInventoryOrg���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsInventoryOrg(Boolean value) {
        this.mIsInventoryOrg = value;
    }

    /**
     * ��ȡmIsLegacyOrg���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsLegacyOrg() {
        return mIsLegacyOrg;
    }

    /**
     * ����mIsLegacyOrg���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsLegacyOrg(Boolean value) {
        this.mIsLegacyOrg = value;
    }

    /**
     * ��ȡmIsOperatingOrg���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsOperatingOrg() {
        return mIsOperatingOrg;
    }

    /**
     * ����mIsOperatingOrg���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsOperatingOrg(Boolean value) {
        this.mIsOperatingOrg = value;
    }

    /**
     * ��ȡmIsPlantOrg���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsPlantOrg() {
        return mIsPlantOrg;
    }

    /**
     * ����mIsPlantOrg���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsPlantOrg(Boolean value) {
        this.mIsPlantOrg = value;
    }

    /**
     * ��ȡmIsPortalOrg���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsPortalOrg() {
        return mIsPortalOrg;
    }

    /**
     * ����mIsPortalOrg���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsPortalOrg(Boolean value) {
        this.mIsPortalOrg = value;
    }

    /**
     * ��ȡmIsProfitCenter���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsProfitCenter() {
        return mIsProfitCenter;
    }

    /**
     * ����mIsProfitCenter���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsProfitCenter(Boolean value) {
        this.mIsProfitCenter = value;
    }

    /**
     * ��ȡmIsServiceOrg���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsServiceOrg() {
        return mIsServiceOrg;
    }

    /**
     * ����mIsServiceOrg���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsServiceOrg(Boolean value) {
        this.mIsServiceOrg = value;
    }

    /**
     * ��ȡmIsSettlementOrg���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsSettlementOrg() {
        return mIsSettlementOrg;
    }

    /**
     * ����mIsSettlementOrg���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsSettlementOrg(Boolean value) {
        this.mIsSettlementOrg = value;
    }

    /**
     * ��ȡmManageType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMManageType() {
        return mManageType;
    }

    /**
     * ����mManageType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMManageType(Integer value) {
        this.mManageType = value;
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
     * ��ȡmOrgClassify���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMOrgClassify() {
        return mOrgClassify;
    }

    /**
     * ����mOrgClassify���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMOrgClassify(Integer value) {
        this.mOrgClassify = value;
    }

    /**
     * ��ȡmOrgContacts���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUFIDAU9BaseOrganizationOrgContactData }{@code >}
     *     
     */
    public JAXBElement<ArrayOfUFIDAU9BaseOrganizationOrgContactData> getMOrgContacts() {
        return mOrgContacts;
    }

    /**
     * ����mOrgContacts���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUFIDAU9BaseOrganizationOrgContactData }{@code >}
     *     
     */
    public void setMOrgContacts(JAXBElement<ArrayOfUFIDAU9BaseOrganizationOrgContactData> value) {
        this.mOrgContacts = value;
    }

    /**
     * ��ȡmShortName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMShortName() {
        return mShortName;
    }

    /**
     * ����mShortName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMShortName(JAXBElement<String> value) {
        this.mShortName = value;
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
