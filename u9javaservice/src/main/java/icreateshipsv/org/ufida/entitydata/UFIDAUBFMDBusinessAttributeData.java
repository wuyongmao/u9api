
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
 * &lt;p&gt;UFIDA.UBF.MD.Business.AttributeData complex type的 Java 类。
 * 
 * &lt;p&gt;以下模式片段指定包含在此类中的预期内容。
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="UFIDA.UBF.MD.Business.AttributeData"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://www.UFIDA.org/EntityData}UFSoft.UBF.Business.DataTransObjectBase"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="Container_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="DisplayName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Multi_Description" type="{UFSoft.UBF.Util.Data}MultiLangDataDict" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Multi_DisplayName" type="{UFSoft.UBF.Util.Data}MultiLangDataDict" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_container" type="{http://www.UFIDA.org/EntityData}UFIDA.UBF.MD.Business.TypeData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_createdBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_createdOn" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_dataTypeFlag" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_dataTypeUID" type="{http://schemas.microsoft.com/2003/10/Serialization/}guid" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_defaultColumnName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_defaultValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_forOBAImport" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_groupID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_groupName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_iD" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isBusinessKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isCalculation" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isCollection" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isColumnDefine" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isDefaultColumn" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isDynamic" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isEntityData" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isFilterDefine" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isForAsso" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isGlobalization" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isImpressible" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isInCache" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isKeySerializable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isModifyControl" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isNullable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isQueryAttribute" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isReadOnly" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isSortDefine" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isSuspended" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isSystem" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_length" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_mD_Class_ID" type="{http://schemas.microsoft.com/2003/10/Serialization/}guid" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_maxValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_minValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_modifiedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_modifiedOn" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_precision" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_scale" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_sequence" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_sysVersion" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_uID" type="{http://schemas.microsoft.com/2003/10/Serialization/}guid" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_visibility" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UFIDA.UBF.MD.Business.AttributeData", propOrder = {
    "containerSKey",
    "description",
    "displayName",
    "multiDescription",
    "multiDisplayName",
    "mContainer",
    "mCreatedBy",
    "mCreatedOn",
    "mDataTypeFlag",
    "mDataTypeUID",
    "mDefaultColumnName",
    "mDefaultValue",
    "mForOBAImport",
    "mGroupID",
    "mGroupName",
    "mid",
    "mIsBusinessKey",
    "mIsCalculation",
    "mIsCollection",
    "mIsColumnDefine",
    "mIsDefaultColumn",
    "mIsDynamic",
    "mIsEntityData",
    "mIsFilterDefine",
    "mIsForAsso",
    "mIsGlobalization",
    "mIsImpressible",
    "mIsInCache",
    "mIsKey",
    "mIsKeySerializable",
    "mIsModifyControl",
    "mIsNullable",
    "mIsQueryAttribute",
    "mIsReadOnly",
    "mIsSortDefine",
    "mIsSuspended",
    "mIsSystem",
    "mLength",
    "mmdClassID",
    "mMaxValue",
    "mMinValue",
    "mModifiedBy",
    "mModifiedOn",
    "mName",
    "mPrecision",
    "mScale",
    "mSequence",
    "mSysVersion",
    "muid",
    "mVisibility"
})
public class UFIDAUBFMDBusinessAttributeData
    extends UFSoftUBFBusinessDataTransObjectBase
{

    @XmlElementRef(name = "Container_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> containerSKey;
    @XmlElementRef(name = "Description", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> description;
    @XmlElementRef(name = "DisplayName", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> displayName;
    @XmlElementRef(name = "Multi_Description", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<MultiLangDataDict> multiDescription;
    @XmlElementRef(name = "Multi_DisplayName", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<MultiLangDataDict> multiDisplayName;
    @XmlElementRef(name = "m_container", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAUBFMDBusinessTypeData> mContainer;
    @XmlElementRef(name = "m_createdBy", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mCreatedBy;
    @XmlElement(name = "m_createdOn")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mCreatedOn;
    @XmlElement(name = "m_dataTypeFlag")
    protected Integer mDataTypeFlag;
    @XmlElement(name = "m_dataTypeUID")
    protected String mDataTypeUID;
    @XmlElementRef(name = "m_defaultColumnName", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mDefaultColumnName;
    @XmlElementRef(name = "m_defaultValue", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mDefaultValue;
    @XmlElement(name = "m_forOBAImport")
    protected Boolean mForOBAImport;
    @XmlElementRef(name = "m_groupID", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mGroupID;
    @XmlElementRef(name = "m_groupName", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mGroupName;
    @XmlElement(name = "m_iD")
    protected Long mid;
    @XmlElement(name = "m_isBusinessKey")
    protected Boolean mIsBusinessKey;
    @XmlElement(name = "m_isCalculation")
    protected Boolean mIsCalculation;
    @XmlElement(name = "m_isCollection")
    protected Boolean mIsCollection;
    @XmlElement(name = "m_isColumnDefine")
    protected Boolean mIsColumnDefine;
    @XmlElement(name = "m_isDefaultColumn")
    protected Boolean mIsDefaultColumn;
    @XmlElement(name = "m_isDynamic")
    protected Boolean mIsDynamic;
    @XmlElement(name = "m_isEntityData")
    protected Boolean mIsEntityData;
    @XmlElement(name = "m_isFilterDefine")
    protected Boolean mIsFilterDefine;
    @XmlElement(name = "m_isForAsso")
    protected Boolean mIsForAsso;
    @XmlElement(name = "m_isGlobalization")
    protected Boolean mIsGlobalization;
    @XmlElement(name = "m_isImpressible")
    protected Boolean mIsImpressible;
    @XmlElement(name = "m_isInCache")
    protected Boolean mIsInCache;
    @XmlElement(name = "m_isKey")
    protected Boolean mIsKey;
    @XmlElement(name = "m_isKeySerializable")
    protected Boolean mIsKeySerializable;
    @XmlElement(name = "m_isModifyControl")
    protected Boolean mIsModifyControl;
    @XmlElement(name = "m_isNullable")
    protected Boolean mIsNullable;
    @XmlElement(name = "m_isQueryAttribute")
    protected Boolean mIsQueryAttribute;
    @XmlElement(name = "m_isReadOnly")
    protected Boolean mIsReadOnly;
    @XmlElement(name = "m_isSortDefine")
    protected Boolean mIsSortDefine;
    @XmlElement(name = "m_isSuspended")
    protected Boolean mIsSuspended;
    @XmlElement(name = "m_isSystem")
    protected Boolean mIsSystem;
    @XmlElement(name = "m_length")
    protected Integer mLength;
    @XmlElement(name = "m_mD_Class_ID")
    protected String mmdClassID;
    @XmlElementRef(name = "m_maxValue", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mMaxValue;
    @XmlElementRef(name = "m_minValue", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mMinValue;
    @XmlElementRef(name = "m_modifiedBy", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mModifiedBy;
    @XmlElement(name = "m_modifiedOn")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mModifiedOn;
    @XmlElementRef(name = "m_name", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mName;
    @XmlElement(name = "m_precision")
    protected Integer mPrecision;
    @XmlElement(name = "m_scale")
    protected Integer mScale;
    @XmlElement(name = "m_sequence")
    protected Integer mSequence;
    @XmlElement(name = "m_sysVersion")
    protected Long mSysVersion;
    @XmlElement(name = "m_uID")
    protected String muid;
    @XmlElement(name = "m_visibility")
    protected Integer mVisibility;

    /**
     * 获取containerSKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getContainerSKey() {
        return containerSKey;
    }

    /**
     * 设置containerSKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setContainerSKey(JAXBElement<EntityKey> value) {
        this.containerSKey = value;
    }

    /**
     * 获取description属性的值。
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
     * 设置description属性的值。
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
     * 获取displayName属性的值。
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
     * 设置displayName属性的值。
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
     * 获取multiDescription属性的值。
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
     * 设置multiDescription属性的值。
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
     * 获取multiDisplayName属性的值。
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
     * 设置multiDisplayName属性的值。
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
     * 获取mContainer属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAUBFMDBusinessTypeData }{@code >}
     *     
     */
    public JAXBElement<UFIDAUBFMDBusinessTypeData> getMContainer() {
        return mContainer;
    }

    /**
     * 设置mContainer属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAUBFMDBusinessTypeData }{@code >}
     *     
     */
    public void setMContainer(JAXBElement<UFIDAUBFMDBusinessTypeData> value) {
        this.mContainer = value;
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
     * 获取mDataTypeFlag属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMDataTypeFlag() {
        return mDataTypeFlag;
    }

    /**
     * 设置mDataTypeFlag属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMDataTypeFlag(Integer value) {
        this.mDataTypeFlag = value;
    }

    /**
     * 获取mDataTypeUID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMDataTypeUID() {
        return mDataTypeUID;
    }

    /**
     * 设置mDataTypeUID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMDataTypeUID(String value) {
        this.mDataTypeUID = value;
    }

    /**
     * 获取mDefaultColumnName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMDefaultColumnName() {
        return mDefaultColumnName;
    }

    /**
     * 设置mDefaultColumnName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMDefaultColumnName(JAXBElement<String> value) {
        this.mDefaultColumnName = value;
    }

    /**
     * 获取mDefaultValue属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMDefaultValue() {
        return mDefaultValue;
    }

    /**
     * 设置mDefaultValue属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMDefaultValue(JAXBElement<String> value) {
        this.mDefaultValue = value;
    }

    /**
     * 获取mForOBAImport属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMForOBAImport() {
        return mForOBAImport;
    }

    /**
     * 设置mForOBAImport属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMForOBAImport(Boolean value) {
        this.mForOBAImport = value;
    }

    /**
     * 获取mGroupID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMGroupID() {
        return mGroupID;
    }

    /**
     * 设置mGroupID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMGroupID(JAXBElement<String> value) {
        this.mGroupID = value;
    }

    /**
     * 获取mGroupName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMGroupName() {
        return mGroupName;
    }

    /**
     * 设置mGroupName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMGroupName(JAXBElement<String> value) {
        this.mGroupName = value;
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
     * 获取mIsBusinessKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsBusinessKey() {
        return mIsBusinessKey;
    }

    /**
     * 设置mIsBusinessKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsBusinessKey(Boolean value) {
        this.mIsBusinessKey = value;
    }

    /**
     * 获取mIsCalculation属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsCalculation() {
        return mIsCalculation;
    }

    /**
     * 设置mIsCalculation属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsCalculation(Boolean value) {
        this.mIsCalculation = value;
    }

    /**
     * 获取mIsCollection属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsCollection() {
        return mIsCollection;
    }

    /**
     * 设置mIsCollection属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsCollection(Boolean value) {
        this.mIsCollection = value;
    }

    /**
     * 获取mIsColumnDefine属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsColumnDefine() {
        return mIsColumnDefine;
    }

    /**
     * 设置mIsColumnDefine属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsColumnDefine(Boolean value) {
        this.mIsColumnDefine = value;
    }

    /**
     * 获取mIsDefaultColumn属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsDefaultColumn() {
        return mIsDefaultColumn;
    }

    /**
     * 设置mIsDefaultColumn属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsDefaultColumn(Boolean value) {
        this.mIsDefaultColumn = value;
    }

    /**
     * 获取mIsDynamic属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsDynamic() {
        return mIsDynamic;
    }

    /**
     * 设置mIsDynamic属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsDynamic(Boolean value) {
        this.mIsDynamic = value;
    }

    /**
     * 获取mIsEntityData属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsEntityData() {
        return mIsEntityData;
    }

    /**
     * 设置mIsEntityData属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsEntityData(Boolean value) {
        this.mIsEntityData = value;
    }

    /**
     * 获取mIsFilterDefine属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsFilterDefine() {
        return mIsFilterDefine;
    }

    /**
     * 设置mIsFilterDefine属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsFilterDefine(Boolean value) {
        this.mIsFilterDefine = value;
    }

    /**
     * 获取mIsForAsso属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsForAsso() {
        return mIsForAsso;
    }

    /**
     * 设置mIsForAsso属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsForAsso(Boolean value) {
        this.mIsForAsso = value;
    }

    /**
     * 获取mIsGlobalization属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsGlobalization() {
        return mIsGlobalization;
    }

    /**
     * 设置mIsGlobalization属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsGlobalization(Boolean value) {
        this.mIsGlobalization = value;
    }

    /**
     * 获取mIsImpressible属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsImpressible() {
        return mIsImpressible;
    }

    /**
     * 设置mIsImpressible属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsImpressible(Boolean value) {
        this.mIsImpressible = value;
    }

    /**
     * 获取mIsInCache属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsInCache() {
        return mIsInCache;
    }

    /**
     * 设置mIsInCache属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsInCache(Boolean value) {
        this.mIsInCache = value;
    }

    /**
     * 获取mIsKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsKey() {
        return mIsKey;
    }

    /**
     * 设置mIsKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsKey(Boolean value) {
        this.mIsKey = value;
    }

    /**
     * 获取mIsKeySerializable属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsKeySerializable() {
        return mIsKeySerializable;
    }

    /**
     * 设置mIsKeySerializable属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsKeySerializable(Boolean value) {
        this.mIsKeySerializable = value;
    }

    /**
     * 获取mIsModifyControl属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsModifyControl() {
        return mIsModifyControl;
    }

    /**
     * 设置mIsModifyControl属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsModifyControl(Boolean value) {
        this.mIsModifyControl = value;
    }

    /**
     * 获取mIsNullable属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsNullable() {
        return mIsNullable;
    }

    /**
     * 设置mIsNullable属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsNullable(Boolean value) {
        this.mIsNullable = value;
    }

    /**
     * 获取mIsQueryAttribute属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsQueryAttribute() {
        return mIsQueryAttribute;
    }

    /**
     * 设置mIsQueryAttribute属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsQueryAttribute(Boolean value) {
        this.mIsQueryAttribute = value;
    }

    /**
     * 获取mIsReadOnly属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsReadOnly() {
        return mIsReadOnly;
    }

    /**
     * 设置mIsReadOnly属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsReadOnly(Boolean value) {
        this.mIsReadOnly = value;
    }

    /**
     * 获取mIsSortDefine属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsSortDefine() {
        return mIsSortDefine;
    }

    /**
     * 设置mIsSortDefine属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsSortDefine(Boolean value) {
        this.mIsSortDefine = value;
    }

    /**
     * 获取mIsSuspended属性的值。
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
     * 设置mIsSuspended属性的值。
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
     * 获取mIsSystem属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsSystem() {
        return mIsSystem;
    }

    /**
     * 设置mIsSystem属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsSystem(Boolean value) {
        this.mIsSystem = value;
    }

    /**
     * 获取mLength属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMLength() {
        return mLength;
    }

    /**
     * 设置mLength属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMLength(Integer value) {
        this.mLength = value;
    }

    /**
     * 获取mmdClassID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMMDClassID() {
        return mmdClassID;
    }

    /**
     * 设置mmdClassID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMMDClassID(String value) {
        this.mmdClassID = value;
    }

    /**
     * 获取mMaxValue属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMMaxValue() {
        return mMaxValue;
    }

    /**
     * 设置mMaxValue属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMMaxValue(JAXBElement<String> value) {
        this.mMaxValue = value;
    }

    /**
     * 获取mMinValue属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMMinValue() {
        return mMinValue;
    }

    /**
     * 设置mMinValue属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMMinValue(JAXBElement<String> value) {
        this.mMinValue = value;
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
     * 获取mName属性的值。
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
     * 设置mName属性的值。
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
     * 获取mPrecision属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMPrecision() {
        return mPrecision;
    }

    /**
     * 设置mPrecision属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMPrecision(Integer value) {
        this.mPrecision = value;
    }

    /**
     * 获取mScale属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMScale() {
        return mScale;
    }

    /**
     * 设置mScale属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMScale(Integer value) {
        this.mScale = value;
    }

    /**
     * 获取mSequence属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMSequence() {
        return mSequence;
    }

    /**
     * 设置mSequence属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMSequence(Integer value) {
        this.mSequence = value;
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
     * 获取muid属性的值。
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
     * 设置muid属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMUID(String value) {
        this.muid = value;
    }

    /**
     * 获取mVisibility属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMVisibility() {
        return mVisibility;
    }

    /**
     * 设置mVisibility属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMVisibility(Integer value) {
        this.mVisibility = value;
    }

}
