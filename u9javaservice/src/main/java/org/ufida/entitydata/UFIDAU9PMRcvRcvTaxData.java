
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
import businessentity.business.ubf.ufsoft.EntityKey;


/**
 * &lt;p&gt;UFIDA.U9.PM.Rcv.RcvTaxData complex type的 Java 类。
 * 
 * &lt;p&gt;以下模式片段指定包含在此类中的预期内容。
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="UFIDA.U9.PM.Rcv.RcvTaxData"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://www.UFIDA.org/EntityData}UFSoft.UBF.Business.DataTransObjectBase"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="CurrentOrg" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="CurrentOrg_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="RcvLineDispense_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="RcvLine_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Receivement_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="TaxType" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="TaxType_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_createdBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_createdOn" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_iD" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_matchedQtyRelateTaxMnyAC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_modifiedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_modifiedOn" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_rcvLine" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.PM.Rcv.RcvLineData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_rcvLineDispense" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.PM.Rcv.RcvLineDispenseData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_receivement" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.PM.Rcv.ReceivementData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_sysVersion" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_taxLineNo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_taxMnyAC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_taxMnyFC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_taxMnyTC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_taxMnyType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_taxRate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_totalConfirmTaxMnyAC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_totalConfirmTaxMnyFC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_totalConfirmTaxMnyTC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_totalMatchTaxMnyAC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_totalMatchTaxMnyFC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_totalMatchTaxMnyTC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UFIDA.U9.PM.Rcv.RcvTaxData", propOrder = {
    "currentOrg",
    "currentOrgSKey",
    "rcvLineDispenseSKey",
    "rcvLineSKey",
    "receivementSKey",
    "taxType",
    "taxTypeSKey",
    "mCreatedBy",
    "mCreatedOn",
    "mid",
    "mMatchedQtyRelateTaxMnyAC",
    "mModifiedBy",
    "mModifiedOn",
    "mRcvLine",
    "mRcvLineDispense",
    "mReceivement",
    "mSysVersion",
    "mTaxLineNo",
    "mTaxMnyAC",
    "mTaxMnyFC",
    "mTaxMnyTC",
    "mTaxMnyType",
    "mTaxRate",
    "mTotalConfirmTaxMnyAC",
    "mTotalConfirmTaxMnyFC",
    "mTotalConfirmTaxMnyTC",
    "mTotalMatchTaxMnyAC",
    "mTotalMatchTaxMnyFC",
    "mTotalMatchTaxMnyTC"
})
public class UFIDAU9PMRcvRcvTaxData
    extends UFSoftUBFBusinessDataTransObjectBase
{

    @XmlElement(name = "CurrentOrg")
    protected Long currentOrg;
    @XmlElementRef(name = "CurrentOrg_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> currentOrgSKey;
    @XmlElementRef(name = "RcvLineDispense_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> rcvLineDispenseSKey;
    @XmlElementRef(name = "RcvLine_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> rcvLineSKey;
    @XmlElementRef(name = "Receivement_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> receivementSKey;
    @XmlElement(name = "TaxType")
    protected Long taxType;
    @XmlElementRef(name = "TaxType_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> taxTypeSKey;
    @XmlElementRef(name = "m_createdBy", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mCreatedBy;
    @XmlElement(name = "m_createdOn")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mCreatedOn;
    @XmlElement(name = "m_iD")
    protected Long mid;
    @XmlElement(name = "m_matchedQtyRelateTaxMnyAC")
    protected BigDecimal mMatchedQtyRelateTaxMnyAC;
    @XmlElementRef(name = "m_modifiedBy", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mModifiedBy;
    @XmlElement(name = "m_modifiedOn")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mModifiedOn;
    @XmlElementRef(name = "m_rcvLine", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9PMRcvRcvLineData> mRcvLine;
    @XmlElementRef(name = "m_rcvLineDispense", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9PMRcvRcvLineDispenseData> mRcvLineDispense;
    @XmlElementRef(name = "m_receivement", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9PMRcvReceivementData> mReceivement;
    @XmlElement(name = "m_sysVersion")
    protected Long mSysVersion;
    @XmlElement(name = "m_taxLineNo")
    protected Integer mTaxLineNo;
    @XmlElement(name = "m_taxMnyAC")
    protected BigDecimal mTaxMnyAC;
    @XmlElement(name = "m_taxMnyFC")
    protected BigDecimal mTaxMnyFC;
    @XmlElement(name = "m_taxMnyTC")
    protected BigDecimal mTaxMnyTC;
    @XmlElement(name = "m_taxMnyType")
    protected Integer mTaxMnyType;
    @XmlElement(name = "m_taxRate")
    protected BigDecimal mTaxRate;
    @XmlElement(name = "m_totalConfirmTaxMnyAC")
    protected BigDecimal mTotalConfirmTaxMnyAC;
    @XmlElement(name = "m_totalConfirmTaxMnyFC")
    protected BigDecimal mTotalConfirmTaxMnyFC;
    @XmlElement(name = "m_totalConfirmTaxMnyTC")
    protected BigDecimal mTotalConfirmTaxMnyTC;
    @XmlElement(name = "m_totalMatchTaxMnyAC")
    protected BigDecimal mTotalMatchTaxMnyAC;
    @XmlElement(name = "m_totalMatchTaxMnyFC")
    protected BigDecimal mTotalMatchTaxMnyFC;
    @XmlElement(name = "m_totalMatchTaxMnyTC")
    protected BigDecimal mTotalMatchTaxMnyTC;

    /**
     * 获取currentOrg属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCurrentOrg() {
        return currentOrg;
    }

    /**
     * 设置currentOrg属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCurrentOrg(Long value) {
        this.currentOrg = value;
    }

    /**
     * 获取currentOrgSKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getCurrentOrgSKey() {
        return currentOrgSKey;
    }

    /**
     * 设置currentOrgSKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setCurrentOrgSKey(JAXBElement<EntityKey> value) {
        this.currentOrgSKey = value;
    }

    /**
     * 获取rcvLineDispenseSKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getRcvLineDispenseSKey() {
        return rcvLineDispenseSKey;
    }

    /**
     * 设置rcvLineDispenseSKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setRcvLineDispenseSKey(JAXBElement<EntityKey> value) {
        this.rcvLineDispenseSKey = value;
    }

    /**
     * 获取rcvLineSKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getRcvLineSKey() {
        return rcvLineSKey;
    }

    /**
     * 设置rcvLineSKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setRcvLineSKey(JAXBElement<EntityKey> value) {
        this.rcvLineSKey = value;
    }

    /**
     * 获取receivementSKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getReceivementSKey() {
        return receivementSKey;
    }

    /**
     * 设置receivementSKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setReceivementSKey(JAXBElement<EntityKey> value) {
        this.receivementSKey = value;
    }

    /**
     * 获取taxType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTaxType() {
        return taxType;
    }

    /**
     * 设置taxType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTaxType(Long value) {
        this.taxType = value;
    }

    /**
     * 获取taxTypeSKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getTaxTypeSKey() {
        return taxTypeSKey;
    }

    /**
     * 设置taxTypeSKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setTaxTypeSKey(JAXBElement<EntityKey> value) {
        this.taxTypeSKey = value;
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
     * 获取mMatchedQtyRelateTaxMnyAC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMMatchedQtyRelateTaxMnyAC() {
        return mMatchedQtyRelateTaxMnyAC;
    }

    /**
     * 设置mMatchedQtyRelateTaxMnyAC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMMatchedQtyRelateTaxMnyAC(BigDecimal value) {
        this.mMatchedQtyRelateTaxMnyAC = value;
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
     * 获取mRcvLine属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9PMRcvRcvLineData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9PMRcvRcvLineData> getMRcvLine() {
        return mRcvLine;
    }

    /**
     * 设置mRcvLine属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9PMRcvRcvLineData }{@code >}
     *     
     */
    public void setMRcvLine(JAXBElement<UFIDAU9PMRcvRcvLineData> value) {
        this.mRcvLine = value;
    }

    /**
     * 获取mRcvLineDispense属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9PMRcvRcvLineDispenseData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9PMRcvRcvLineDispenseData> getMRcvLineDispense() {
        return mRcvLineDispense;
    }

    /**
     * 设置mRcvLineDispense属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9PMRcvRcvLineDispenseData }{@code >}
     *     
     */
    public void setMRcvLineDispense(JAXBElement<UFIDAU9PMRcvRcvLineDispenseData> value) {
        this.mRcvLineDispense = value;
    }

    /**
     * 获取mReceivement属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9PMRcvReceivementData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9PMRcvReceivementData> getMReceivement() {
        return mReceivement;
    }

    /**
     * 设置mReceivement属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9PMRcvReceivementData }{@code >}
     *     
     */
    public void setMReceivement(JAXBElement<UFIDAU9PMRcvReceivementData> value) {
        this.mReceivement = value;
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
     * 获取mTaxLineNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMTaxLineNo() {
        return mTaxLineNo;
    }

    /**
     * 设置mTaxLineNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMTaxLineNo(Integer value) {
        this.mTaxLineNo = value;
    }

    /**
     * 获取mTaxMnyAC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMTaxMnyAC() {
        return mTaxMnyAC;
    }

    /**
     * 设置mTaxMnyAC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMTaxMnyAC(BigDecimal value) {
        this.mTaxMnyAC = value;
    }

    /**
     * 获取mTaxMnyFC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMTaxMnyFC() {
        return mTaxMnyFC;
    }

    /**
     * 设置mTaxMnyFC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMTaxMnyFC(BigDecimal value) {
        this.mTaxMnyFC = value;
    }

    /**
     * 获取mTaxMnyTC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMTaxMnyTC() {
        return mTaxMnyTC;
    }

    /**
     * 设置mTaxMnyTC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMTaxMnyTC(BigDecimal value) {
        this.mTaxMnyTC = value;
    }

    /**
     * 获取mTaxMnyType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMTaxMnyType() {
        return mTaxMnyType;
    }

    /**
     * 设置mTaxMnyType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMTaxMnyType(Integer value) {
        this.mTaxMnyType = value;
    }

    /**
     * 获取mTaxRate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMTaxRate() {
        return mTaxRate;
    }

    /**
     * 设置mTaxRate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMTaxRate(BigDecimal value) {
        this.mTaxRate = value;
    }

    /**
     * 获取mTotalConfirmTaxMnyAC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMTotalConfirmTaxMnyAC() {
        return mTotalConfirmTaxMnyAC;
    }

    /**
     * 设置mTotalConfirmTaxMnyAC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMTotalConfirmTaxMnyAC(BigDecimal value) {
        this.mTotalConfirmTaxMnyAC = value;
    }

    /**
     * 获取mTotalConfirmTaxMnyFC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMTotalConfirmTaxMnyFC() {
        return mTotalConfirmTaxMnyFC;
    }

    /**
     * 设置mTotalConfirmTaxMnyFC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMTotalConfirmTaxMnyFC(BigDecimal value) {
        this.mTotalConfirmTaxMnyFC = value;
    }

    /**
     * 获取mTotalConfirmTaxMnyTC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMTotalConfirmTaxMnyTC() {
        return mTotalConfirmTaxMnyTC;
    }

    /**
     * 设置mTotalConfirmTaxMnyTC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMTotalConfirmTaxMnyTC(BigDecimal value) {
        this.mTotalConfirmTaxMnyTC = value;
    }

    /**
     * 获取mTotalMatchTaxMnyAC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMTotalMatchTaxMnyAC() {
        return mTotalMatchTaxMnyAC;
    }

    /**
     * 设置mTotalMatchTaxMnyAC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMTotalMatchTaxMnyAC(BigDecimal value) {
        this.mTotalMatchTaxMnyAC = value;
    }

    /**
     * 获取mTotalMatchTaxMnyFC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMTotalMatchTaxMnyFC() {
        return mTotalMatchTaxMnyFC;
    }

    /**
     * 设置mTotalMatchTaxMnyFC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMTotalMatchTaxMnyFC(BigDecimal value) {
        this.mTotalMatchTaxMnyFC = value;
    }

    /**
     * 获取mTotalMatchTaxMnyTC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMTotalMatchTaxMnyTC() {
        return mTotalMatchTaxMnyTC;
    }

    /**
     * 设置mTotalMatchTaxMnyTC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMTotalMatchTaxMnyTC(BigDecimal value) {
        this.mTotalMatchTaxMnyTC = value;
    }

}
