
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
 * &lt;p&gt;UFIDA.U9.CBO.SCM.PropertyTypes.SrcDocInfoData complex type�� Java �ࡣ
 * 
 * &lt;p&gt;����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡmultiSrcDocTransTypeName���Ե�ֵ��
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
     * ����multiSrcDocTransTypeName���Ե�ֵ��
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
     * ��ȡsrcDocOrg���Ե�ֵ��
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
     * ����srcDocOrg���Ե�ֵ��
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
     * ��ȡsrcDocOrgSKey���Ե�ֵ��
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
     * ����srcDocOrgSKey���Ե�ֵ��
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
     * ��ȡsrcDocTransTypeName���Ե�ֵ��
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
     * ����srcDocTransTypeName���Ե�ֵ��
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
     * ��ȡmSrcDoc���Ե�ֵ��
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
     * ����mSrcDoc���Ե�ֵ��
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
     * ��ȡmSrcDocBusiType���Ե�ֵ��
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
     * ����mSrcDocBusiType���Ե�ֵ��
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
     * ��ȡmSrcDocDate���Ե�ֵ��
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
     * ����mSrcDocDate���Ե�ֵ��
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
     * ��ȡmSrcDocLine���Ե�ֵ��
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
     * ����mSrcDocLine���Ե�ֵ��
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
     * ��ȡmSrcDocLineNo���Ե�ֵ��
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
     * ����mSrcDocLineNo���Ե�ֵ��
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
     * ��ȡmSrcDocNo���Ե�ֵ��
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
     * ����mSrcDocNo���Ե�ֵ��
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
     * ��ȡmSrcDocSubLine���Ե�ֵ��
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
     * ����mSrcDocSubLine���Ե�ֵ��
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
     * ��ȡmSrcDocSubLineNo���Ե�ֵ��
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
     * ����mSrcDocSubLineNo���Ե�ֵ��
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
     * ��ȡmSrcDocSubLineNoStr���Ե�ֵ��
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
     * ����mSrcDocSubLineNoStr���Ե�ֵ��
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
     * ��ȡmSrcDocTransType���Ե�ֵ��
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
     * ����mSrcDocTransType���Ե�ֵ��
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
     * ��ȡmSrcDocVer���Ե�ֵ��
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
     * ����mSrcDocVer���Ե�ֵ��
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
