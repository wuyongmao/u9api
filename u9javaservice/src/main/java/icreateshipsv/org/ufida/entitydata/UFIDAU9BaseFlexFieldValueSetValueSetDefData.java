
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
 * &lt;p&gt;UFIDA.U9.Base.FlexField.ValueSet.ValueSetDefData complex type的 Java 类。
 * 
 * &lt;p&gt;以下模式片段指定包含在此类中的预期内容。
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="UFIDA.U9.Base.FlexField.ValueSet.ValueSetDefData"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://www.UFIDA.org/EntityData}UFSoft.UBF.Business.DataTransObjectBase"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="CodeAttribute" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="CodeAttribute_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ConstraintValueSet1_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ConstraintValueSet2_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ConstraintValueSet3_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="DependantValueSet_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="EntityType" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="EntityType_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="EnumType" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="EnumType_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="IDAttribute" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="IDAttribute_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Multi_Description" type="{UFSoft.UBF.Util.Data}MultiLangDataDict" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Multi_Name" type="{UFSoft.UBF.Util.Data}MultiLangDataDict" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="NameAttribute" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="NameAttribute_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="TreeLeafAttribute" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="TreeLeafAttribute_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="TreeParentAttribute" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="TreeParentAttribute_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_condition" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_conditionDisplayName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_constraintValueSet1" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.Base.FlexField.ValueSet.ValueSetDefData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_constraintValueSet2" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.Base.FlexField.ValueSet.ValueSetDefData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_constraintValueSet3" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.Base.FlexField.ValueSet.ValueSetDefData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_createdBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_createdOn" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_dependantAttribute" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_dependantDefaultValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_dependantValueSet" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.Base.FlexField.ValueSet.ValueSetDefData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_effective" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.Base.PropertyTypes.EffectiveData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_iD" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isAlpha" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isConstrained" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isDependant" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isLeftFillZero" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isMultiShow" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isNumber" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isProtected" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isSelectTreeLeaf" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isTree" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_length" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_masterSite" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_maxValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_minValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_modifiedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_modifiedOn" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_multiShowlineNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_oQL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_pricision" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_sQL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_shortName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_sysVersion" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_treeRule" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_validateType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_valueType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UFIDA.U9.Base.FlexField.ValueSet.ValueSetDefData", propOrder = {
    "codeAttribute",
    "codeAttributeSKey",
    "constraintValueSet1SKey",
    "constraintValueSet2SKey",
    "constraintValueSet3SKey",
    "dependantValueSetSKey",
    "description",
    "entityType",
    "entityTypeSKey",
    "enumType",
    "enumTypeSKey",
    "idAttribute",
    "idAttributeSKey",
    "multiDescription",
    "multiName",
    "name",
    "nameAttribute",
    "nameAttributeSKey",
    "treeLeafAttribute",
    "treeLeafAttributeSKey",
    "treeParentAttribute",
    "treeParentAttributeSKey",
    "mCode",
    "mCondition",
    "mConditionDisplayName",
    "mConstraintValueSet1",
    "mConstraintValueSet2",
    "mConstraintValueSet3",
    "mCreatedBy",
    "mCreatedOn",
    "mDependantAttribute",
    "mDependantDefaultValue",
    "mDependantValueSet",
    "mEffective",
    "mid",
    "mIsAlpha",
    "mIsConstrained",
    "mIsDependant",
    "mIsLeftFillZero",
    "mIsMultiShow",
    "mIsNumber",
    "mIsProtected",
    "mIsSelectTreeLeaf",
    "mIsTree",
    "mLength",
    "mMasterSite",
    "mMaxValue",
    "mMinValue",
    "mModifiedBy",
    "mModifiedOn",
    "mMultiShowlineNumber",
    "moql",
    "mPricision",
    "msql",
    "mShortName",
    "mSysVersion",
    "mTreeRule",
    "mValidateType",
    "mValueType"
})
public class UFIDAU9BaseFlexFieldValueSetValueSetDefData
    extends UFSoftUBFBusinessDataTransObjectBase
{

    @XmlElement(name = "CodeAttribute")
    protected Long codeAttribute;
    @XmlElementRef(name = "CodeAttribute_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> codeAttributeSKey;
    @XmlElementRef(name = "ConstraintValueSet1_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> constraintValueSet1SKey;
    @XmlElementRef(name = "ConstraintValueSet2_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> constraintValueSet2SKey;
    @XmlElementRef(name = "ConstraintValueSet3_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> constraintValueSet3SKey;
    @XmlElementRef(name = "DependantValueSet_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> dependantValueSetSKey;
    @XmlElementRef(name = "Description", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> description;
    @XmlElement(name = "EntityType")
    protected Long entityType;
    @XmlElementRef(name = "EntityType_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> entityTypeSKey;
    @XmlElement(name = "EnumType")
    protected Long enumType;
    @XmlElementRef(name = "EnumType_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> enumTypeSKey;
    @XmlElement(name = "IDAttribute")
    protected Long idAttribute;
    @XmlElementRef(name = "IDAttribute_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> idAttributeSKey;
    @XmlElementRef(name = "Multi_Description", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<MultiLangDataDict> multiDescription;
    @XmlElementRef(name = "Multi_Name", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<MultiLangDataDict> multiName;
    @XmlElementRef(name = "Name", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> name;
    @XmlElement(name = "NameAttribute")
    protected Long nameAttribute;
    @XmlElementRef(name = "NameAttribute_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> nameAttributeSKey;
    @XmlElement(name = "TreeLeafAttribute")
    protected Long treeLeafAttribute;
    @XmlElementRef(name = "TreeLeafAttribute_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> treeLeafAttributeSKey;
    @XmlElement(name = "TreeParentAttribute")
    protected Long treeParentAttribute;
    @XmlElementRef(name = "TreeParentAttribute_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> treeParentAttributeSKey;
    @XmlElementRef(name = "m_code", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mCode;
    @XmlElementRef(name = "m_condition", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mCondition;
    @XmlElementRef(name = "m_conditionDisplayName", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mConditionDisplayName;
    @XmlElementRef(name = "m_constraintValueSet1", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9BaseFlexFieldValueSetValueSetDefData> mConstraintValueSet1;
    @XmlElementRef(name = "m_constraintValueSet2", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9BaseFlexFieldValueSetValueSetDefData> mConstraintValueSet2;
    @XmlElementRef(name = "m_constraintValueSet3", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9BaseFlexFieldValueSetValueSetDefData> mConstraintValueSet3;
    @XmlElementRef(name = "m_createdBy", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mCreatedBy;
    @XmlElement(name = "m_createdOn")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mCreatedOn;
    @XmlElementRef(name = "m_dependantAttribute", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mDependantAttribute;
    @XmlElementRef(name = "m_dependantDefaultValue", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mDependantDefaultValue;
    @XmlElementRef(name = "m_dependantValueSet", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9BaseFlexFieldValueSetValueSetDefData> mDependantValueSet;
    @XmlElementRef(name = "m_effective", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9BasePropertyTypesEffectiveData> mEffective;
    @XmlElement(name = "m_iD")
    protected Long mid;
    @XmlElement(name = "m_isAlpha")
    protected Boolean mIsAlpha;
    @XmlElement(name = "m_isConstrained")
    protected Boolean mIsConstrained;
    @XmlElement(name = "m_isDependant")
    protected Boolean mIsDependant;
    @XmlElement(name = "m_isLeftFillZero")
    protected Boolean mIsLeftFillZero;
    @XmlElement(name = "m_isMultiShow")
    protected Boolean mIsMultiShow;
    @XmlElement(name = "m_isNumber")
    protected Boolean mIsNumber;
    @XmlElement(name = "m_isProtected")
    protected Boolean mIsProtected;
    @XmlElement(name = "m_isSelectTreeLeaf")
    protected Boolean mIsSelectTreeLeaf;
    @XmlElement(name = "m_isTree")
    protected Boolean mIsTree;
    @XmlElement(name = "m_length")
    protected Integer mLength;
    @XmlElementRef(name = "m_masterSite", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mMasterSite;
    @XmlElementRef(name = "m_maxValue", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mMaxValue;
    @XmlElementRef(name = "m_minValue", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mMinValue;
    @XmlElementRef(name = "m_modifiedBy", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mModifiedBy;
    @XmlElement(name = "m_modifiedOn")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mModifiedOn;
    @XmlElement(name = "m_multiShowlineNumber")
    protected Integer mMultiShowlineNumber;
    @XmlElementRef(name = "m_oQL", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> moql;
    @XmlElement(name = "m_pricision")
    protected Integer mPricision;
    @XmlElementRef(name = "m_sQL", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> msql;
    @XmlElementRef(name = "m_shortName", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mShortName;
    @XmlElement(name = "m_sysVersion")
    protected Long mSysVersion;
    @XmlElementRef(name = "m_treeRule", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mTreeRule;
    @XmlElement(name = "m_validateType")
    protected Integer mValidateType;
    @XmlElement(name = "m_valueType")
    protected Integer mValueType;

    /**
     * 获取codeAttribute属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCodeAttribute() {
        return codeAttribute;
    }

    /**
     * 设置codeAttribute属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCodeAttribute(Long value) {
        this.codeAttribute = value;
    }

    /**
     * 获取codeAttributeSKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getCodeAttributeSKey() {
        return codeAttributeSKey;
    }

    /**
     * 设置codeAttributeSKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setCodeAttributeSKey(JAXBElement<EntityKey> value) {
        this.codeAttributeSKey = value;
    }

    /**
     * 获取constraintValueSet1SKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getConstraintValueSet1SKey() {
        return constraintValueSet1SKey;
    }

    /**
     * 设置constraintValueSet1SKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setConstraintValueSet1SKey(JAXBElement<EntityKey> value) {
        this.constraintValueSet1SKey = value;
    }

    /**
     * 获取constraintValueSet2SKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getConstraintValueSet2SKey() {
        return constraintValueSet2SKey;
    }

    /**
     * 设置constraintValueSet2SKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setConstraintValueSet2SKey(JAXBElement<EntityKey> value) {
        this.constraintValueSet2SKey = value;
    }

    /**
     * 获取constraintValueSet3SKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getConstraintValueSet3SKey() {
        return constraintValueSet3SKey;
    }

    /**
     * 设置constraintValueSet3SKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setConstraintValueSet3SKey(JAXBElement<EntityKey> value) {
        this.constraintValueSet3SKey = value;
    }

    /**
     * 获取dependantValueSetSKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getDependantValueSetSKey() {
        return dependantValueSetSKey;
    }

    /**
     * 设置dependantValueSetSKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setDependantValueSetSKey(JAXBElement<EntityKey> value) {
        this.dependantValueSetSKey = value;
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
     * 获取entityType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getEntityType() {
        return entityType;
    }

    /**
     * 设置entityType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setEntityType(Long value) {
        this.entityType = value;
    }

    /**
     * 获取entityTypeSKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getEntityTypeSKey() {
        return entityTypeSKey;
    }

    /**
     * 设置entityTypeSKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setEntityTypeSKey(JAXBElement<EntityKey> value) {
        this.entityTypeSKey = value;
    }

    /**
     * 获取enumType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getEnumType() {
        return enumType;
    }

    /**
     * 设置enumType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setEnumType(Long value) {
        this.enumType = value;
    }

    /**
     * 获取enumTypeSKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getEnumTypeSKey() {
        return enumTypeSKey;
    }

    /**
     * 设置enumTypeSKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setEnumTypeSKey(JAXBElement<EntityKey> value) {
        this.enumTypeSKey = value;
    }

    /**
     * 获取idAttribute属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIDAttribute() {
        return idAttribute;
    }

    /**
     * 设置idAttribute属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIDAttribute(Long value) {
        this.idAttribute = value;
    }

    /**
     * 获取idAttributeSKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getIDAttributeSKey() {
        return idAttributeSKey;
    }

    /**
     * 设置idAttributeSKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setIDAttributeSKey(JAXBElement<EntityKey> value) {
        this.idAttributeSKey = value;
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
     * 获取nameAttribute属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNameAttribute() {
        return nameAttribute;
    }

    /**
     * 设置nameAttribute属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNameAttribute(Long value) {
        this.nameAttribute = value;
    }

    /**
     * 获取nameAttributeSKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getNameAttributeSKey() {
        return nameAttributeSKey;
    }

    /**
     * 设置nameAttributeSKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setNameAttributeSKey(JAXBElement<EntityKey> value) {
        this.nameAttributeSKey = value;
    }

    /**
     * 获取treeLeafAttribute属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTreeLeafAttribute() {
        return treeLeafAttribute;
    }

    /**
     * 设置treeLeafAttribute属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTreeLeafAttribute(Long value) {
        this.treeLeafAttribute = value;
    }

    /**
     * 获取treeLeafAttributeSKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getTreeLeafAttributeSKey() {
        return treeLeafAttributeSKey;
    }

    /**
     * 设置treeLeafAttributeSKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setTreeLeafAttributeSKey(JAXBElement<EntityKey> value) {
        this.treeLeafAttributeSKey = value;
    }

    /**
     * 获取treeParentAttribute属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTreeParentAttribute() {
        return treeParentAttribute;
    }

    /**
     * 设置treeParentAttribute属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTreeParentAttribute(Long value) {
        this.treeParentAttribute = value;
    }

    /**
     * 获取treeParentAttributeSKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getTreeParentAttributeSKey() {
        return treeParentAttributeSKey;
    }

    /**
     * 设置treeParentAttributeSKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setTreeParentAttributeSKey(JAXBElement<EntityKey> value) {
        this.treeParentAttributeSKey = value;
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
     * 获取mCondition属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMCondition() {
        return mCondition;
    }

    /**
     * 设置mCondition属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMCondition(JAXBElement<String> value) {
        this.mCondition = value;
    }

    /**
     * 获取mConditionDisplayName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMConditionDisplayName() {
        return mConditionDisplayName;
    }

    /**
     * 设置mConditionDisplayName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMConditionDisplayName(JAXBElement<String> value) {
        this.mConditionDisplayName = value;
    }

    /**
     * 获取mConstraintValueSet1属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9BaseFlexFieldValueSetValueSetDefData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9BaseFlexFieldValueSetValueSetDefData> getMConstraintValueSet1() {
        return mConstraintValueSet1;
    }

    /**
     * 设置mConstraintValueSet1属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9BaseFlexFieldValueSetValueSetDefData }{@code >}
     *     
     */
    public void setMConstraintValueSet1(JAXBElement<UFIDAU9BaseFlexFieldValueSetValueSetDefData> value) {
        this.mConstraintValueSet1 = value;
    }

    /**
     * 获取mConstraintValueSet2属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9BaseFlexFieldValueSetValueSetDefData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9BaseFlexFieldValueSetValueSetDefData> getMConstraintValueSet2() {
        return mConstraintValueSet2;
    }

    /**
     * 设置mConstraintValueSet2属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9BaseFlexFieldValueSetValueSetDefData }{@code >}
     *     
     */
    public void setMConstraintValueSet2(JAXBElement<UFIDAU9BaseFlexFieldValueSetValueSetDefData> value) {
        this.mConstraintValueSet2 = value;
    }

    /**
     * 获取mConstraintValueSet3属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9BaseFlexFieldValueSetValueSetDefData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9BaseFlexFieldValueSetValueSetDefData> getMConstraintValueSet3() {
        return mConstraintValueSet3;
    }

    /**
     * 设置mConstraintValueSet3属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9BaseFlexFieldValueSetValueSetDefData }{@code >}
     *     
     */
    public void setMConstraintValueSet3(JAXBElement<UFIDAU9BaseFlexFieldValueSetValueSetDefData> value) {
        this.mConstraintValueSet3 = value;
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
     * 获取mDependantAttribute属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMDependantAttribute() {
        return mDependantAttribute;
    }

    /**
     * 设置mDependantAttribute属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMDependantAttribute(JAXBElement<String> value) {
        this.mDependantAttribute = value;
    }

    /**
     * 获取mDependantDefaultValue属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMDependantDefaultValue() {
        return mDependantDefaultValue;
    }

    /**
     * 设置mDependantDefaultValue属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMDependantDefaultValue(JAXBElement<String> value) {
        this.mDependantDefaultValue = value;
    }

    /**
     * 获取mDependantValueSet属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9BaseFlexFieldValueSetValueSetDefData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9BaseFlexFieldValueSetValueSetDefData> getMDependantValueSet() {
        return mDependantValueSet;
    }

    /**
     * 设置mDependantValueSet属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9BaseFlexFieldValueSetValueSetDefData }{@code >}
     *     
     */
    public void setMDependantValueSet(JAXBElement<UFIDAU9BaseFlexFieldValueSetValueSetDefData> value) {
        this.mDependantValueSet = value;
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
     * 获取mIsAlpha属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsAlpha() {
        return mIsAlpha;
    }

    /**
     * 设置mIsAlpha属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsAlpha(Boolean value) {
        this.mIsAlpha = value;
    }

    /**
     * 获取mIsConstrained属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsConstrained() {
        return mIsConstrained;
    }

    /**
     * 设置mIsConstrained属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsConstrained(Boolean value) {
        this.mIsConstrained = value;
    }

    /**
     * 获取mIsDependant属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsDependant() {
        return mIsDependant;
    }

    /**
     * 设置mIsDependant属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsDependant(Boolean value) {
        this.mIsDependant = value;
    }

    /**
     * 获取mIsLeftFillZero属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsLeftFillZero() {
        return mIsLeftFillZero;
    }

    /**
     * 设置mIsLeftFillZero属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsLeftFillZero(Boolean value) {
        this.mIsLeftFillZero = value;
    }

    /**
     * 获取mIsMultiShow属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsMultiShow() {
        return mIsMultiShow;
    }

    /**
     * 设置mIsMultiShow属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsMultiShow(Boolean value) {
        this.mIsMultiShow = value;
    }

    /**
     * 获取mIsNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsNumber() {
        return mIsNumber;
    }

    /**
     * 设置mIsNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsNumber(Boolean value) {
        this.mIsNumber = value;
    }

    /**
     * 获取mIsProtected属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsProtected() {
        return mIsProtected;
    }

    /**
     * 设置mIsProtected属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsProtected(Boolean value) {
        this.mIsProtected = value;
    }

    /**
     * 获取mIsSelectTreeLeaf属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsSelectTreeLeaf() {
        return mIsSelectTreeLeaf;
    }

    /**
     * 设置mIsSelectTreeLeaf属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsSelectTreeLeaf(Boolean value) {
        this.mIsSelectTreeLeaf = value;
    }

    /**
     * 获取mIsTree属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsTree() {
        return mIsTree;
    }

    /**
     * 设置mIsTree属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsTree(Boolean value) {
        this.mIsTree = value;
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
     * 获取mMultiShowlineNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMMultiShowlineNumber() {
        return mMultiShowlineNumber;
    }

    /**
     * 设置mMultiShowlineNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMMultiShowlineNumber(Integer value) {
        this.mMultiShowlineNumber = value;
    }

    /**
     * 获取moql属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMOQL() {
        return moql;
    }

    /**
     * 设置moql属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMOQL(JAXBElement<String> value) {
        this.moql = value;
    }

    /**
     * 获取mPricision属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMPricision() {
        return mPricision;
    }

    /**
     * 设置mPricision属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMPricision(Integer value) {
        this.mPricision = value;
    }

    /**
     * 获取msql属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMSQL() {
        return msql;
    }

    /**
     * 设置msql属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMSQL(JAXBElement<String> value) {
        this.msql = value;
    }

    /**
     * 获取mShortName属性的值。
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
     * 设置mShortName属性的值。
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
     * 获取mTreeRule属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMTreeRule() {
        return mTreeRule;
    }

    /**
     * 设置mTreeRule属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMTreeRule(JAXBElement<String> value) {
        this.mTreeRule = value;
    }

    /**
     * 获取mValidateType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMValidateType() {
        return mValidateType;
    }

    /**
     * 设置mValidateType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMValidateType(Integer value) {
        this.mValidateType = value;
    }

    /**
     * 获取mValueType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMValueType() {
        return mValueType;
    }

    /**
     * 设置mValueType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMValueType(Integer value) {
        this.mValueType = value;
    }

}
