
package org.ufida.entitydata;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import businessentity.business.ubf.ufsoft.EntityKey;
import data.util.ubf.ufsoft.MultiLangDataDict;


/**
 * &lt;p&gt;UFIDA.U9.CBO.SCM.PropertyTypes.SrcDocInfoData complex type的 Java 类。
 * 
 * &lt;p&gt;以下模式片段指定包含在此类中的预期内容。
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="UFIDA.U9.CBO.SCM.PropertyTypes.SrcDocInfoData"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://www.UFIDA.org/EntityData}UFSoft.UBF.Business.DataTransObjectBase"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="Multi_SrcDocTransTypeName" type="{UFSoft.UBF.Util.Data}MultiLangDataDict" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="SrcDocOrg" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="SrcDocOrg_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="SrcDocTransTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_srcDoc" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.Base.PropertyTypes.BizEntityKeyData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_srcDocBusiType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_srcDocDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_srcDocLine" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.Base.PropertyTypes.BizEntityKeyData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_srcDocLineNo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_srcDocNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_srcDocSubLine" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.Base.PropertyTypes.BizEntityKeyData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_srcDocSubLineNo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_srcDocSubLineNoStr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_srcDocTransType" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.Base.PropertyTypes.BizEntityKeyData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_srcDocVer" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UFIDA.U9.CBO.SCM.PropertyTypes.SrcDocInfoData", propOrder = {
    "multiSrcDocTransTypeName",
    "srcDocOrg",
    "srcDocOrgSKey",
    "srcDocTransTypeName",
    "mSrcDoc",
    "mSrcDocBusiType",
    "mSrcDocDate",
    "mSrcDocLine",
    "mSrcDocLineNo",
    "mSrcDocNo",
    "mSrcDocSubLine",
    "mSrcDocSubLineNo",
    "mSrcDocSubLineNoStr",
    "mSrcDocTransType",
    "mSrcDocVer"
})
public class UFIDAU9CBOSCMPropertyTypesSrcDocInfoData
    extends UFSoftUBFBusinessDataTransObjectBase
{

    @XmlElementRef(name = "Multi_SrcDocTransTypeName", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<MultiLangDataDict> multiSrcDocTransTypeName;
    @XmlElement(name = "SrcDocOrg")
    protected Long srcDocOrg;
    @XmlElementRef(name = "SrcDocOrg_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> srcDocOrgSKey;
    @XmlElementRef(name = "SrcDocTransTypeName", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> srcDocTransTypeName;
    @XmlElementRef(name = "m_srcDoc", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9BasePropertyTypesBizEntityKeyData> mSrcDoc;
    @XmlElement(name = "m_srcDocBusiType")
    protected Integer mSrcDocBusiType;
    @XmlElement(name = "m_srcDocDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mSrcDocDate;
    @XmlElementRef(name = "m_srcDocLine", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9BasePropertyTypesBizEntityKeyData> mSrcDocLine;
    @XmlElement(name = "m_srcDocLineNo")
    protected Integer mSrcDocLineNo;
    @XmlElementRef(name = "m_srcDocNo", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mSrcDocNo;
    @XmlElementRef(name = "m_srcDocSubLine", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9BasePropertyTypesBizEntityKeyData> mSrcDocSubLine;
    @XmlElement(name = "m_srcDocSubLineNo")
    protected Integer mSrcDocSubLineNo;
    @XmlElementRef(name = "m_srcDocSubLineNoStr", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mSrcDocSubLineNoStr;
    @XmlElementRef(name = "m_srcDocTransType", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9BasePropertyTypesBizEntityKeyData> mSrcDocTransType;
    @XmlElement(name = "m_srcDocVer")
    protected Integer mSrcDocVer;

    /**
     * 获取multiSrcDocTransTypeName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MultiLangDataDict }{@code >}
     *     
     */
    public JAXBElement<MultiLangDataDict> getMultiSrcDocTransTypeName() {
        return multiSrcDocTransTypeName;
    }

    /**
     * 设置multiSrcDocTransTypeName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MultiLangDataDict }{@code >}
     *     
     */
    public void setMultiSrcDocTransTypeName(JAXBElement<MultiLangDataDict> value) {
        this.multiSrcDocTransTypeName = value;
    }

    /**
     * 获取srcDocOrg属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSrcDocOrg() {
        return srcDocOrg;
    }

    /**
     * 设置srcDocOrg属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSrcDocOrg(Long value) {
        this.srcDocOrg = value;
    }

    /**
     * 获取srcDocOrgSKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getSrcDocOrgSKey() {
        return srcDocOrgSKey;
    }

    /**
     * 设置srcDocOrgSKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setSrcDocOrgSKey(JAXBElement<EntityKey> value) {
        this.srcDocOrgSKey = value;
    }

    /**
     * 获取srcDocTransTypeName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSrcDocTransTypeName() {
        return srcDocTransTypeName;
    }

    /**
     * 设置srcDocTransTypeName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSrcDocTransTypeName(JAXBElement<String> value) {
        this.srcDocTransTypeName = value;
    }

    /**
     * 获取mSrcDoc属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9BasePropertyTypesBizEntityKeyData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9BasePropertyTypesBizEntityKeyData> getMSrcDoc() {
        return mSrcDoc;
    }

    /**
     * 设置mSrcDoc属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9BasePropertyTypesBizEntityKeyData }{@code >}
     *     
     */
    public void setMSrcDoc(JAXBElement<UFIDAU9BasePropertyTypesBizEntityKeyData> value) {
        this.mSrcDoc = value;
    }

    /**
     * 获取mSrcDocBusiType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMSrcDocBusiType() {
        return mSrcDocBusiType;
    }

    /**
     * 设置mSrcDocBusiType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMSrcDocBusiType(Integer value) {
        this.mSrcDocBusiType = value;
    }

    /**
     * 获取mSrcDocDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMSrcDocDate() {
        return mSrcDocDate;
    }

    /**
     * 设置mSrcDocDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMSrcDocDate(XMLGregorianCalendar value) {
        this.mSrcDocDate = value;
    }

    /**
     * 获取mSrcDocLine属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9BasePropertyTypesBizEntityKeyData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9BasePropertyTypesBizEntityKeyData> getMSrcDocLine() {
        return mSrcDocLine;
    }

    /**
     * 设置mSrcDocLine属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9BasePropertyTypesBizEntityKeyData }{@code >}
     *     
     */
    public void setMSrcDocLine(JAXBElement<UFIDAU9BasePropertyTypesBizEntityKeyData> value) {
        this.mSrcDocLine = value;
    }

    /**
     * 获取mSrcDocLineNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMSrcDocLineNo() {
        return mSrcDocLineNo;
    }

    /**
     * 设置mSrcDocLineNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMSrcDocLineNo(Integer value) {
        this.mSrcDocLineNo = value;
    }

    /**
     * 获取mSrcDocNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMSrcDocNo() {
        return mSrcDocNo;
    }

    /**
     * 设置mSrcDocNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMSrcDocNo(JAXBElement<String> value) {
        this.mSrcDocNo = value;
    }

    /**
     * 获取mSrcDocSubLine属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9BasePropertyTypesBizEntityKeyData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9BasePropertyTypesBizEntityKeyData> getMSrcDocSubLine() {
        return mSrcDocSubLine;
    }

    /**
     * 设置mSrcDocSubLine属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9BasePropertyTypesBizEntityKeyData }{@code >}
     *     
     */
    public void setMSrcDocSubLine(JAXBElement<UFIDAU9BasePropertyTypesBizEntityKeyData> value) {
        this.mSrcDocSubLine = value;
    }

    /**
     * 获取mSrcDocSubLineNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMSrcDocSubLineNo() {
        return mSrcDocSubLineNo;
    }

    /**
     * 设置mSrcDocSubLineNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMSrcDocSubLineNo(Integer value) {
        this.mSrcDocSubLineNo = value;
    }

    /**
     * 获取mSrcDocSubLineNoStr属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMSrcDocSubLineNoStr() {
        return mSrcDocSubLineNoStr;
    }

    /**
     * 设置mSrcDocSubLineNoStr属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMSrcDocSubLineNoStr(JAXBElement<String> value) {
        this.mSrcDocSubLineNoStr = value;
    }

    /**
     * 获取mSrcDocTransType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9BasePropertyTypesBizEntityKeyData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9BasePropertyTypesBizEntityKeyData> getMSrcDocTransType() {
        return mSrcDocTransType;
    }

    /**
     * 设置mSrcDocTransType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9BasePropertyTypesBizEntityKeyData }{@code >}
     *     
     */
    public void setMSrcDocTransType(JAXBElement<UFIDAU9BasePropertyTypesBizEntityKeyData> value) {
        this.mSrcDocTransType = value;
    }

    /**
     * 获取mSrcDocVer属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMSrcDocVer() {
        return mSrcDocVer;
    }

    /**
     * 设置mSrcDocVer属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMSrcDocVer(Integer value) {
        this.mSrcDocVer = value;
    }

}
