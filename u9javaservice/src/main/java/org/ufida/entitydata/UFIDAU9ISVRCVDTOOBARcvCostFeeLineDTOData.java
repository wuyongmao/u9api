
package org.ufida.entitydata;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * &lt;p&gt;UFIDA.U9.ISV.RCV.DTO.OBARcvCostFeeLineDTOData complex type的 Java 类。
 * 
 * &lt;p&gt;以下模式片段指定包含在此类中的预期内容。
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="UFIDA.U9.ISV.RCV.DTO.OBARcvCostFeeLineDTOData"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://www.UFIDA.org/EntityData}UFSoft.UBF.Business.DataTransObjectBase"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="m_createdBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_createdOn" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_feeTax" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_iD" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_modifiedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_modifiedOn" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_oBARcvLineCostDTO" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.ISV.RCV.DTO.OBARcvLineCostDTOData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_org" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.Base.Organization.OrganizationData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_rcvFee" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.PM.Rcv.RcvFeeData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_rcvLineCost" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.PM.Rcv.RcvLineCostData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_sysVersion" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_totalMatchedFeeTax" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_totalMatchedNetFee" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_totalNetFee" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UFIDA.U9.ISV.RCV.DTO.OBARcvCostFeeLineDTOData", propOrder = {
    "mCreatedBy",
    "mCreatedOn",
    "mFeeTax",
    "mid",
    "mModifiedBy",
    "mModifiedOn",
    "mobaRcvLineCostDTO",
    "mOrg",
    "mRcvFee",
    "mRcvLineCost",
    "mSysVersion",
    "mTotalMatchedFeeTax",
    "mTotalMatchedNetFee",
    "mTotalNetFee"
})
public class UFIDAU9ISVRCVDTOOBARcvCostFeeLineDTOData
    extends UFSoftUBFBusinessDataTransObjectBase
{

    @XmlElementRef(name = "m_createdBy", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mCreatedBy;
    @XmlElement(name = "m_createdOn")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mCreatedOn;
    @XmlElement(name = "m_feeTax")
    protected BigDecimal mFeeTax;
    @XmlElement(name = "m_iD")
    protected Long mid;
    @XmlElementRef(name = "m_modifiedBy", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mModifiedBy;
    @XmlElement(name = "m_modifiedOn")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mModifiedOn;
    @XmlElementRef(name = "m_oBARcvLineCostDTO", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9ISVRCVDTOOBARcvLineCostDTOData> mobaRcvLineCostDTO;
    @XmlElementRef(name = "m_org", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9BaseOrganizationOrganizationData> mOrg;
    @XmlElementRef(name = "m_rcvFee", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9PMRcvRcvFeeData> mRcvFee;
    @XmlElementRef(name = "m_rcvLineCost", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9PMRcvRcvLineCostData> mRcvLineCost;
    @XmlElement(name = "m_sysVersion")
    protected Long mSysVersion;
    @XmlElement(name = "m_totalMatchedFeeTax")
    protected BigDecimal mTotalMatchedFeeTax;
    @XmlElement(name = "m_totalMatchedNetFee")
    protected BigDecimal mTotalMatchedNetFee;
    @XmlElement(name = "m_totalNetFee")
    protected BigDecimal mTotalNetFee;

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
     * 获取mFeeTax属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMFeeTax() {
        return mFeeTax;
    }

    /**
     * 设置mFeeTax属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMFeeTax(BigDecimal value) {
        this.mFeeTax = value;
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
     * 获取mobaRcvLineCostDTO属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9ISVRCVDTOOBARcvLineCostDTOData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9ISVRCVDTOOBARcvLineCostDTOData> getMOBARcvLineCostDTO() {
        return mobaRcvLineCostDTO;
    }

    /**
     * 设置mobaRcvLineCostDTO属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9ISVRCVDTOOBARcvLineCostDTOData }{@code >}
     *     
     */
    public void setMOBARcvLineCostDTO(JAXBElement<UFIDAU9ISVRCVDTOOBARcvLineCostDTOData> value) {
        this.mobaRcvLineCostDTO = value;
    }

    /**
     * 获取mOrg属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9BaseOrganizationOrganizationData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9BaseOrganizationOrganizationData> getMOrg() {
        return mOrg;
    }

    /**
     * 设置mOrg属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9BaseOrganizationOrganizationData }{@code >}
     *     
     */
    public void setMOrg(JAXBElement<UFIDAU9BaseOrganizationOrganizationData> value) {
        this.mOrg = value;
    }

    /**
     * 获取mRcvFee属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9PMRcvRcvFeeData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9PMRcvRcvFeeData> getMRcvFee() {
        return mRcvFee;
    }

    /**
     * 设置mRcvFee属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9PMRcvRcvFeeData }{@code >}
     *     
     */
    public void setMRcvFee(JAXBElement<UFIDAU9PMRcvRcvFeeData> value) {
        this.mRcvFee = value;
    }

    /**
     * 获取mRcvLineCost属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9PMRcvRcvLineCostData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9PMRcvRcvLineCostData> getMRcvLineCost() {
        return mRcvLineCost;
    }

    /**
     * 设置mRcvLineCost属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9PMRcvRcvLineCostData }{@code >}
     *     
     */
    public void setMRcvLineCost(JAXBElement<UFIDAU9PMRcvRcvLineCostData> value) {
        this.mRcvLineCost = value;
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
     * 获取mTotalMatchedFeeTax属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMTotalMatchedFeeTax() {
        return mTotalMatchedFeeTax;
    }

    /**
     * 设置mTotalMatchedFeeTax属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMTotalMatchedFeeTax(BigDecimal value) {
        this.mTotalMatchedFeeTax = value;
    }

    /**
     * 获取mTotalMatchedNetFee属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMTotalMatchedNetFee() {
        return mTotalMatchedNetFee;
    }

    /**
     * 设置mTotalMatchedNetFee属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMTotalMatchedNetFee(BigDecimal value) {
        this.mTotalMatchedNetFee = value;
    }

    /**
     * 获取mTotalNetFee属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMTotalNetFee() {
        return mTotalNetFee;
    }

    /**
     * 设置mTotalNetFee属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMTotalNetFee(BigDecimal value) {
        this.mTotalNetFee = value;
    }

}
