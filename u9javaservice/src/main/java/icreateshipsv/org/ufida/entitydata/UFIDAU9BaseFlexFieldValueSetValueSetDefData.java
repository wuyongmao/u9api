
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
 * &lt;p&gt;UFIDA.U9.Base.FlexField.ValueSet.ValueSetDefData complex type�� Java �ࡣ
 * 
 * &lt;p&gt;����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡcodeAttribute���Ե�ֵ��
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
     * ����codeAttribute���Ե�ֵ��
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
     * ��ȡcodeAttributeSKey���Ե�ֵ��
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
     * ����codeAttributeSKey���Ե�ֵ��
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
     * ��ȡconstraintValueSet1SKey���Ե�ֵ��
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
     * ����constraintValueSet1SKey���Ե�ֵ��
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
     * ��ȡconstraintValueSet2SKey���Ե�ֵ��
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
     * ����constraintValueSet2SKey���Ե�ֵ��
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
     * ��ȡconstraintValueSet3SKey���Ե�ֵ��
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
     * ����constraintValueSet3SKey���Ե�ֵ��
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
     * ��ȡdependantValueSetSKey���Ե�ֵ��
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
     * ����dependantValueSetSKey���Ե�ֵ��
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
     * ��ȡentityType���Ե�ֵ��
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
     * ����entityType���Ե�ֵ��
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
     * ��ȡentityTypeSKey���Ե�ֵ��
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
     * ����entityTypeSKey���Ե�ֵ��
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
     * ��ȡenumType���Ե�ֵ��
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
     * ����enumType���Ե�ֵ��
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
     * ��ȡenumTypeSKey���Ե�ֵ��
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
     * ����enumTypeSKey���Ե�ֵ��
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
     * ��ȡidAttribute���Ե�ֵ��
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
     * ����idAttribute���Ե�ֵ��
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
     * ��ȡidAttributeSKey���Ե�ֵ��
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
     * ����idAttributeSKey���Ե�ֵ��
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
     * ��ȡnameAttribute���Ե�ֵ��
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
     * ����nameAttribute���Ե�ֵ��
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
     * ��ȡnameAttributeSKey���Ե�ֵ��
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
     * ����nameAttributeSKey���Ե�ֵ��
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
     * ��ȡtreeLeafAttribute���Ե�ֵ��
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
     * ����treeLeafAttribute���Ե�ֵ��
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
     * ��ȡtreeLeafAttributeSKey���Ե�ֵ��
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
     * ����treeLeafAttributeSKey���Ե�ֵ��
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
     * ��ȡtreeParentAttribute���Ե�ֵ��
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
     * ����treeParentAttribute���Ե�ֵ��
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
     * ��ȡtreeParentAttributeSKey���Ե�ֵ��
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
     * ����treeParentAttributeSKey���Ե�ֵ��
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
     * ��ȡmCondition���Ե�ֵ��
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
     * ����mCondition���Ե�ֵ��
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
     * ��ȡmConditionDisplayName���Ե�ֵ��
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
     * ����mConditionDisplayName���Ե�ֵ��
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
     * ��ȡmConstraintValueSet1���Ե�ֵ��
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
     * ����mConstraintValueSet1���Ե�ֵ��
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
     * ��ȡmConstraintValueSet2���Ե�ֵ��
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
     * ����mConstraintValueSet2���Ե�ֵ��
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
     * ��ȡmConstraintValueSet3���Ե�ֵ��
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
     * ����mConstraintValueSet3���Ե�ֵ��
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
     * ��ȡmDependantAttribute���Ե�ֵ��
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
     * ����mDependantAttribute���Ե�ֵ��
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
     * ��ȡmDependantDefaultValue���Ե�ֵ��
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
     * ����mDependantDefaultValue���Ե�ֵ��
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
     * ��ȡmDependantValueSet���Ե�ֵ��
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
     * ����mDependantValueSet���Ե�ֵ��
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
     * ��ȡmIsAlpha���Ե�ֵ��
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
     * ����mIsAlpha���Ե�ֵ��
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
     * ��ȡmIsConstrained���Ե�ֵ��
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
     * ����mIsConstrained���Ե�ֵ��
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
     * ��ȡmIsDependant���Ե�ֵ��
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
     * ����mIsDependant���Ե�ֵ��
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
     * ��ȡmIsLeftFillZero���Ե�ֵ��
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
     * ����mIsLeftFillZero���Ե�ֵ��
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
     * ��ȡmIsMultiShow���Ե�ֵ��
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
     * ����mIsMultiShow���Ե�ֵ��
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
     * ��ȡmIsNumber���Ե�ֵ��
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
     * ����mIsNumber���Ե�ֵ��
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
     * ��ȡmIsProtected���Ե�ֵ��
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
     * ����mIsProtected���Ե�ֵ��
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
     * ��ȡmIsSelectTreeLeaf���Ե�ֵ��
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
     * ����mIsSelectTreeLeaf���Ե�ֵ��
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
     * ��ȡmIsTree���Ե�ֵ��
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
     * ����mIsTree���Ե�ֵ��
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
     * ��ȡmLength���Ե�ֵ��
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
     * ����mLength���Ե�ֵ��
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
     * ��ȡmMaxValue���Ե�ֵ��
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
     * ����mMaxValue���Ե�ֵ��
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
     * ��ȡmMinValue���Ե�ֵ��
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
     * ����mMinValue���Ե�ֵ��
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
     * ��ȡmMultiShowlineNumber���Ե�ֵ��
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
     * ����mMultiShowlineNumber���Ե�ֵ��
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
     * ��ȡmoql���Ե�ֵ��
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
     * ����moql���Ե�ֵ��
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
     * ��ȡmPricision���Ե�ֵ��
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
     * ����mPricision���Ե�ֵ��
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
     * ��ȡmsql���Ե�ֵ��
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
     * ����msql���Ե�ֵ��
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

    /**
     * ��ȡmTreeRule���Ե�ֵ��
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
     * ����mTreeRule���Ե�ֵ��
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
     * ��ȡmValidateType���Ե�ֵ��
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
     * ����mValidateType���Ե�ֵ��
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
     * ��ȡmValueType���Ե�ֵ��
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
     * ����mValueType���Ե�ֵ��
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
