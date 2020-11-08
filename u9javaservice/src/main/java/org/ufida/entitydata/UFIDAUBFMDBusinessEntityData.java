
package org.ufida.entitydata;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;UFIDA.UBF.MD.Business.EntityData complex type�� Java �ࡣ
 * 
 * &lt;p&gt;����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡmDefaultTableName���Ե�ֵ��
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
     * ����mDefaultTableName���Ե�ֵ��
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
     * ��ȡmForOBAImport���Ե�ֵ��
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
     * ����mForOBAImport���Ե�ֵ��
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
     * ��ȡmHasImpressibleAttribute���Ե�ֵ��
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
     * ����mHasImpressibleAttribute���Ե�ֵ��
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
     * ��ȡmInheritanceMapKind���Ե�ֵ��
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
     * ����mInheritanceMapKind���Ե�ֵ��
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
     * ��ȡmIsAbstract���Ե�ֵ��
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
     * ����mIsAbstract���Ե�ֵ��
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
     * ��ȡmIsInCache���Ե�ֵ��
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
     * ����mIsInCache���Ե�ֵ��
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
     * ��ȡmIsMain���Ե�ֵ��
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
     * ����mIsMain���Ե�ֵ��
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
     * ��ȡmIsModifyControl���Ե�ֵ��
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
     * ����mIsModifyControl���Ե�ֵ��
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
     * ��ȡmIsPkClustered���Ե�ֵ��
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
     * ����mIsPkClustered���Ե�ֵ��
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
