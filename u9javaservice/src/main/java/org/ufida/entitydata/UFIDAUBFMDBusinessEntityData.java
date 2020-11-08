
package org.ufida.entitydata;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;UFIDA.UBF.MD.Business.EntityData complex type的 Java 类。
 * 
 * &lt;p&gt;以下模式片段指定包含在此类中的预期内容。
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="UFIDA.UBF.MD.Business.EntityData"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://www.UFIDA.org/EntityData}UFIDA.UBF.MD.Business.TypeData"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="m_defaultTableName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_forOBAImport" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_hasImpressibleAttribute" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_inheritanceMapKind" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isAbstract" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isInCache" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isMain" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isModifyControl" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isPkClustered" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UFIDA.UBF.MD.Business.EntityData", propOrder = {
    "mDefaultTableName",
    "mForOBAImport",
    "mHasImpressibleAttribute",
    "mInheritanceMapKind",
    "mIsAbstract",
    "mIsInCache",
    "mIsMain",
    "mIsModifyControl",
    "mIsPkClustered"
})
public class UFIDAUBFMDBusinessEntityData
    extends UFIDAUBFMDBusinessTypeData
{

    @XmlElementRef(name = "m_defaultTableName", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mDefaultTableName;
    @XmlElement(name = "m_forOBAImport")
    protected Boolean mForOBAImport;
    @XmlElement(name = "m_hasImpressibleAttribute")
    protected Boolean mHasImpressibleAttribute;
    @XmlElement(name = "m_inheritanceMapKind")
    protected Short mInheritanceMapKind;
    @XmlElement(name = "m_isAbstract")
    protected Boolean mIsAbstract;
    @XmlElement(name = "m_isInCache")
    protected Boolean mIsInCache;
    @XmlElement(name = "m_isMain")
    protected Boolean mIsMain;
    @XmlElement(name = "m_isModifyControl")
    protected Boolean mIsModifyControl;
    @XmlElement(name = "m_isPkClustered")
    protected Boolean mIsPkClustered;

    /**
     * 获取mDefaultTableName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMDefaultTableName() {
        return mDefaultTableName;
    }

    /**
     * 设置mDefaultTableName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMDefaultTableName(JAXBElement<String> value) {
        this.mDefaultTableName = value;
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
     * 获取mHasImpressibleAttribute属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMHasImpressibleAttribute() {
        return mHasImpressibleAttribute;
    }

    /**
     * 设置mHasImpressibleAttribute属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMHasImpressibleAttribute(Boolean value) {
        this.mHasImpressibleAttribute = value;
    }

    /**
     * 获取mInheritanceMapKind属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getMInheritanceMapKind() {
        return mInheritanceMapKind;
    }

    /**
     * 设置mInheritanceMapKind属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setMInheritanceMapKind(Short value) {
        this.mInheritanceMapKind = value;
    }

    /**
     * 获取mIsAbstract属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsAbstract() {
        return mIsAbstract;
    }

    /**
     * 设置mIsAbstract属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsAbstract(Boolean value) {
        this.mIsAbstract = value;
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
     * 获取mIsMain属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsMain() {
        return mIsMain;
    }

    /**
     * 设置mIsMain属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsMain(Boolean value) {
        this.mIsMain = value;
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
     * 获取mIsPkClustered属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsPkClustered() {
        return mIsPkClustered;
    }

    /**
     * 设置mIsPkClustered属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsPkClustered(Boolean value) {
        this.mIsPkClustered = value;
    }

}
