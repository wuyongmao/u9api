
package icreateshipsv.org.ufida.entitydata;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

import icreateshipsv.businessentity.business.ubf.ufsoft.EntityKey;
import icreateshipsv.data.util.ubf.ufsoft.MultiLangDataDict;


/**
 * &lt;p&gt;UFIDA.UBF.MD.Business.TypeData complex type�� Java �ࡣ
 * 
 * &lt;p&gt;����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="UFIDA.UBF.MD.Business.TypeData"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://www.UFIDA.org/EntityData}UFSoft.UBF.Business.DataTransObjectBase"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="Component_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="DisplayName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Multi_Description" type="{UFSoft.UBF.Util.Data}MultiLangDataDict" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Multi_DisplayName" type="{UFSoft.UBF.Util.Data}MultiLangDataDict" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_attributes" type="{http://www.UFIDA.org/EntityData}ArrayOfUFIDA.UBF.MD.Business.AttributeData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_classType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_component" type="{http://www.UFIDA.org/EntityData}UFIDA.UBF.MD.Business.ComponentData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_componentUID" type="{http://schemas.microsoft.com/2003/10/Serialization/}guid" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_createdBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_createdOn" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_discriminator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_fullName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_iD" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isAuthority" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isConcrete" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isExtend" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isPersistence" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isQueryDTO" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isSuspended" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_modifiedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_modifiedOn" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_parentUID" type="{http://schemas.microsoft.com/2003/10/Serialization/}guid" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_stereotypes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_sysVersion" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_uID" type="{http://schemas.microsoft.com/2003/10/Serialization/}guid" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UFIDA.UBF.MD.Business.TypeData", propOrder = {
    "componentSKey",
    "description",
    "displayName",
    "multiDescription",
    "multiDisplayName",
    "mAttributes",
    "mClassType",
    "mComponent",
    "mComponentUID",
    "mCreatedBy",
    "mCreatedOn",
    "mDiscriminator",
    "mFullName",
    "mid",
    "mIsAuthority",
    "mIsConcrete",
    "mIsExtend",
    "mIsPersistence",
    "mIsQueryDTO",
    "mIsSuspended",
    "mModifiedBy",
    "mModifiedOn",
    "mName",
    "mParentUID",
    "mStereotypes",
    "mSysVersion",
    "muid"
})
@XmlSeeAlso({
    UFIDAUBFMDBusinessEntityData.class
})
public class UFIDAUBFMDBusinessTypeData
    extends UFSoftUBFBusinessDataTransObjectBase
{

    @XmlElementRef(name = "Component_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> componentSKey;
    @XmlElementRef(name = "Description", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> description;
    @XmlElementRef(name = "DisplayName", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> displayName;
    @XmlElementRef(name = "Multi_Description", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<MultiLangDataDict> multiDescription;
    @XmlElementRef(name = "Multi_DisplayName", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<MultiLangDataDict> multiDisplayName;
    @XmlElementRef(name = "m_attributes", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfUFIDAUBFMDBusinessAttributeData> mAttributes;
    @XmlElement(name = "m_classType")
    protected Integer mClassType;
    @XmlElementRef(name = "m_component", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAUBFMDBusinessComponentData> mComponent;
    @XmlElement(name = "m_componentUID")
    protected String mComponentUID;
    @XmlElementRef(name = "m_createdBy", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mCreatedBy;
    @XmlElement(name = "m_createdOn")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mCreatedOn;
    @XmlElementRef(name = "m_discriminator", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mDiscriminator;
    @XmlElementRef(name = "m_fullName", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mFullName;
    @XmlElement(name = "m_iD")
    protected Long mid;
    @XmlElement(name = "m_isAuthority")
    protected Boolean mIsAuthority;
    @XmlElement(name = "m_isConcrete")
    protected Boolean mIsConcrete;
    @XmlElement(name = "m_isExtend")
    protected Boolean mIsExtend;
    @XmlElement(name = "m_isPersistence")
    protected Boolean mIsPersistence;
    @XmlElement(name = "m_isQueryDTO")
    protected Boolean mIsQueryDTO;
    @XmlElement(name = "m_isSuspended")
    protected Boolean mIsSuspended;
    @XmlElementRef(name = "m_modifiedBy", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mModifiedBy;
    @XmlElement(name = "m_modifiedOn")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mModifiedOn;
    @XmlElementRef(name = "m_name", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mName;
    @XmlElement(name = "m_parentUID")
    protected String mParentUID;
    @XmlElementRef(name = "m_stereotypes", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mStereotypes;
    @XmlElement(name = "m_sysVersion")
    protected Long mSysVersion;
    @XmlElement(name = "m_uID")
    protected String muid;

    /**
     * ��ȡcomponentSKey���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getComponentSKey() {
        return componentSKey;
    }

    /**
     * ����componentSKey���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setComponentSKey(JAXBElement<EntityKey> value) {
        this.componentSKey = value;
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
     * ��ȡdisplayName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDisplayName() {
        return displayName;
    }

    /**
     * ����displayName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDisplayName(JAXBElement<String> value) {
        this.displayName = value;
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
     * ��ȡmultiDisplayName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MultiLangDataDict }{@code >}
     *     
     */
    public JAXBElement<MultiLangDataDict> getMultiDisplayName() {
        return multiDisplayName;
    }

    /**
     * ����multiDisplayName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MultiLangDataDict }{@code >}
     *     
     */
    public void setMultiDisplayName(JAXBElement<MultiLangDataDict> value) {
        this.multiDisplayName = value;
    }

    /**
     * ��ȡmAttributes���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUFIDAUBFMDBusinessAttributeData }{@code >}
     *     
     */
    public JAXBElement<ArrayOfUFIDAUBFMDBusinessAttributeData> getMAttributes() {
        return mAttributes;
    }

    /**
     * ����mAttributes���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUFIDAUBFMDBusinessAttributeData }{@code >}
     *     
     */
    public void setMAttributes(JAXBElement<ArrayOfUFIDAUBFMDBusinessAttributeData> value) {
        this.mAttributes = value;
    }

    /**
     * ��ȡmClassType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMClassType() {
        return mClassType;
    }

    /**
     * ����mClassType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMClassType(Integer value) {
        this.mClassType = value;
    }

    /**
     * ��ȡmComponent���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAUBFMDBusinessComponentData }{@code >}
     *     
     */
    public JAXBElement<UFIDAUBFMDBusinessComponentData> getMComponent() {
        return mComponent;
    }

    /**
     * ����mComponent���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAUBFMDBusinessComponentData }{@code >}
     *     
     */
    public void setMComponent(JAXBElement<UFIDAUBFMDBusinessComponentData> value) {
        this.mComponent = value;
    }

    /**
     * ��ȡmComponentUID���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMComponentUID() {
        return mComponentUID;
    }

    /**
     * ����mComponentUID���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMComponentUID(String value) {
        this.mComponentUID = value;
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
     * ��ȡmDiscriminator���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMDiscriminator() {
        return mDiscriminator;
    }

    /**
     * ����mDiscriminator���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMDiscriminator(JAXBElement<String> value) {
        this.mDiscriminator = value;
    }

    /**
     * ��ȡmFullName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMFullName() {
        return mFullName;
    }

    /**
     * ����mFullName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMFullName(JAXBElement<String> value) {
        this.mFullName = value;
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
     * ��ȡmIsAuthority���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsAuthority() {
        return mIsAuthority;
    }

    /**
     * ����mIsAuthority���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsAuthority(Boolean value) {
        this.mIsAuthority = value;
    }

    /**
     * ��ȡmIsConcrete���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsConcrete() {
        return mIsConcrete;
    }

    /**
     * ����mIsConcrete���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsConcrete(Boolean value) {
        this.mIsConcrete = value;
    }

    /**
     * ��ȡmIsExtend���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsExtend() {
        return mIsExtend;
    }

    /**
     * ����mIsExtend���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsExtend(Boolean value) {
        this.mIsExtend = value;
    }

    /**
     * ��ȡmIsPersistence���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsPersistence() {
        return mIsPersistence;
    }

    /**
     * ����mIsPersistence���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsPersistence(Boolean value) {
        this.mIsPersistence = value;
    }

    /**
     * ��ȡmIsQueryDTO���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsQueryDTO() {
        return mIsQueryDTO;
    }

    /**
     * ����mIsQueryDTO���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsQueryDTO(Boolean value) {
        this.mIsQueryDTO = value;
    }

    /**
     * ��ȡmIsSuspended���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsSuspended() {
        return mIsSuspended;
    }

    /**
     * ����mIsSuspended���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsSuspended(Boolean value) {
        this.mIsSuspended = value;
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
     * ��ȡmName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMName() {
        return mName;
    }

    /**
     * ����mName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMName(JAXBElement<String> value) {
        this.mName = value;
    }

    /**
     * ��ȡmParentUID���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMParentUID() {
        return mParentUID;
    }

    /**
     * ����mParentUID���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMParentUID(String value) {
        this.mParentUID = value;
    }

    /**
     * ��ȡmStereotypes���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMStereotypes() {
        return mStereotypes;
    }

    /**
     * ����mStereotypes���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMStereotypes(JAXBElement<String> value) {
        this.mStereotypes = value;
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
     * ��ȡmuid���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMUID() {
        return muid;
    }

    /**
     * ����muid���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMUID(String value) {
        this.muid = value;
    }

}
