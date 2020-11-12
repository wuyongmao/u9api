
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


/**
 * &lt;p&gt;UFIDA.U9.CBO.TradePath.TradePathLineData complex type的 Java 类。
 * 
 * &lt;p&gt;以下模式片段指定包含在此类中的预期内容。
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="UFIDA.U9.CBO.TradePath.TradePathLineData"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://www.UFIDA.org/EntityData}UFSoft.UBF.Business.DataTransObjectBase"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="Org" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Org_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="TradePath_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_createdBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_createdOn" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_iD" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isControlPrice" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isInnerThrewIntoPresent" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isPOStop" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isRcvStop" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isRurRtnStop" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isSOStop" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isSaleRtnStop" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isShipStop" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_lineNumber" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_modifiedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_modifiedOn" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_pOStopState" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_priceBy" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_priceLable" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_projectAssignRule" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_purRtnStopState" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_rcvStopState" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_sOStopState" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_saleRtnStopState" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_settlementCurrency" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_settlementMethod" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_shipStopState" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_sysVersion" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_tradePath" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CBO.TradePath.TradePathData" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UFIDA.U9.CBO.TradePath.TradePathLineData", propOrder = {
    "org",
    "orgSKey",
    "tradePathSKey",
    "mCreatedBy",
    "mCreatedOn",
    "mid",
    "mIsControlPrice",
    "mIsInnerThrewIntoPresent",
    "mIsPOStop",
    "mIsRcvStop",
    "mIsRurRtnStop",
    "mIsSOStop",
    "mIsSaleRtnStop",
    "mIsShipStop",
    "mLineNumber",
    "mModifiedBy",
    "mModifiedOn",
    "mpoStopState",
    "mPriceBy",
    "mPriceLable",
    "mProjectAssignRule",
    "mPurRtnStopState",
    "mRcvStopState",
    "msoStopState",
    "mSaleRtnStopState",
    "mSettlementCurrency",
    "mSettlementMethod",
    "mShipStopState",
    "mSysVersion",
    "mTradePath"
})
public class UFIDAU9CBOTradePathTradePathLineData
    extends UFSoftUBFBusinessDataTransObjectBase
{

    @XmlElement(name = "Org")
    protected Long org;
    @XmlElementRef(name = "Org_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> orgSKey;
    @XmlElementRef(name = "TradePath_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> tradePathSKey;
    @XmlElementRef(name = "m_createdBy", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mCreatedBy;
    @XmlElement(name = "m_createdOn")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mCreatedOn;
    @XmlElement(name = "m_iD")
    protected Long mid;
    @XmlElement(name = "m_isControlPrice")
    protected Integer mIsControlPrice;
    @XmlElement(name = "m_isInnerThrewIntoPresent")
    protected Boolean mIsInnerThrewIntoPresent;
    @XmlElement(name = "m_isPOStop")
    protected Boolean mIsPOStop;
    @XmlElement(name = "m_isRcvStop")
    protected Boolean mIsRcvStop;
    @XmlElement(name = "m_isRurRtnStop")
    protected Boolean mIsRurRtnStop;
    @XmlElement(name = "m_isSOStop")
    protected Boolean mIsSOStop;
    @XmlElement(name = "m_isSaleRtnStop")
    protected Boolean mIsSaleRtnStop;
    @XmlElement(name = "m_isShipStop")
    protected Boolean mIsShipStop;
    @XmlElement(name = "m_lineNumber")
    protected Short mLineNumber;
    @XmlElementRef(name = "m_modifiedBy", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mModifiedBy;
    @XmlElement(name = "m_modifiedOn")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mModifiedOn;
    @XmlElement(name = "m_pOStopState")
    protected Integer mpoStopState;
    @XmlElement(name = "m_priceBy")
    protected Integer mPriceBy;
    @XmlElement(name = "m_priceLable")
    protected Long mPriceLable;
    @XmlElement(name = "m_projectAssignRule")
    protected Integer mProjectAssignRule;
    @XmlElement(name = "m_purRtnStopState")
    protected Integer mPurRtnStopState;
    @XmlElement(name = "m_rcvStopState")
    protected Integer mRcvStopState;
    @XmlElement(name = "m_sOStopState")
    protected Integer msoStopState;
    @XmlElement(name = "m_saleRtnStopState")
    protected Integer mSaleRtnStopState;
    @XmlElement(name = "m_settlementCurrency")
    protected Integer mSettlementCurrency;
    @XmlElement(name = "m_settlementMethod")
    protected Integer mSettlementMethod;
    @XmlElement(name = "m_shipStopState")
    protected Integer mShipStopState;
    @XmlElement(name = "m_sysVersion")
    protected Long mSysVersion;
    @XmlElementRef(name = "m_tradePath", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9CBOTradePathTradePathData> mTradePath;

    /**
     * 获取org属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOrg() {
        return org;
    }

    /**
     * 设置org属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOrg(Long value) {
        this.org = value;
    }

    /**
     * 获取orgSKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getOrgSKey() {
        return orgSKey;
    }

    /**
     * 设置orgSKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setOrgSKey(JAXBElement<EntityKey> value) {
        this.orgSKey = value;
    }

    /**
     * 获取tradePathSKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getTradePathSKey() {
        return tradePathSKey;
    }

    /**
     * 设置tradePathSKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setTradePathSKey(JAXBElement<EntityKey> value) {
        this.tradePathSKey = value;
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
     * 获取mIsControlPrice属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMIsControlPrice() {
        return mIsControlPrice;
    }

    /**
     * 设置mIsControlPrice属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMIsControlPrice(Integer value) {
        this.mIsControlPrice = value;
    }

    /**
     * 获取mIsInnerThrewIntoPresent属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsInnerThrewIntoPresent() {
        return mIsInnerThrewIntoPresent;
    }

    /**
     * 设置mIsInnerThrewIntoPresent属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsInnerThrewIntoPresent(Boolean value) {
        this.mIsInnerThrewIntoPresent = value;
    }

    /**
     * 获取mIsPOStop属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsPOStop() {
        return mIsPOStop;
    }

    /**
     * 设置mIsPOStop属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsPOStop(Boolean value) {
        this.mIsPOStop = value;
    }

    /**
     * 获取mIsRcvStop属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsRcvStop() {
        return mIsRcvStop;
    }

    /**
     * 设置mIsRcvStop属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsRcvStop(Boolean value) {
        this.mIsRcvStop = value;
    }

    /**
     * 获取mIsRurRtnStop属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsRurRtnStop() {
        return mIsRurRtnStop;
    }

    /**
     * 设置mIsRurRtnStop属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsRurRtnStop(Boolean value) {
        this.mIsRurRtnStop = value;
    }

    /**
     * 获取mIsSOStop属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsSOStop() {
        return mIsSOStop;
    }

    /**
     * 设置mIsSOStop属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsSOStop(Boolean value) {
        this.mIsSOStop = value;
    }

    /**
     * 获取mIsSaleRtnStop属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsSaleRtnStop() {
        return mIsSaleRtnStop;
    }

    /**
     * 设置mIsSaleRtnStop属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsSaleRtnStop(Boolean value) {
        this.mIsSaleRtnStop = value;
    }

    /**
     * 获取mIsShipStop属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsShipStop() {
        return mIsShipStop;
    }

    /**
     * 设置mIsShipStop属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsShipStop(Boolean value) {
        this.mIsShipStop = value;
    }

    /**
     * 获取mLineNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getMLineNumber() {
        return mLineNumber;
    }

    /**
     * 设置mLineNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setMLineNumber(Short value) {
        this.mLineNumber = value;
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
     * 获取mpoStopState属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMPOStopState() {
        return mpoStopState;
    }

    /**
     * 设置mpoStopState属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMPOStopState(Integer value) {
        this.mpoStopState = value;
    }

    /**
     * 获取mPriceBy属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMPriceBy() {
        return mPriceBy;
    }

    /**
     * 设置mPriceBy属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMPriceBy(Integer value) {
        this.mPriceBy = value;
    }

    /**
     * 获取mPriceLable属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMPriceLable() {
        return mPriceLable;
    }

    /**
     * 设置mPriceLable属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMPriceLable(Long value) {
        this.mPriceLable = value;
    }

    /**
     * 获取mProjectAssignRule属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMProjectAssignRule() {
        return mProjectAssignRule;
    }

    /**
     * 设置mProjectAssignRule属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMProjectAssignRule(Integer value) {
        this.mProjectAssignRule = value;
    }

    /**
     * 获取mPurRtnStopState属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMPurRtnStopState() {
        return mPurRtnStopState;
    }

    /**
     * 设置mPurRtnStopState属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMPurRtnStopState(Integer value) {
        this.mPurRtnStopState = value;
    }

    /**
     * 获取mRcvStopState属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMRcvStopState() {
        return mRcvStopState;
    }

    /**
     * 设置mRcvStopState属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMRcvStopState(Integer value) {
        this.mRcvStopState = value;
    }

    /**
     * 获取msoStopState属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMSOStopState() {
        return msoStopState;
    }

    /**
     * 设置msoStopState属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMSOStopState(Integer value) {
        this.msoStopState = value;
    }

    /**
     * 获取mSaleRtnStopState属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMSaleRtnStopState() {
        return mSaleRtnStopState;
    }

    /**
     * 设置mSaleRtnStopState属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMSaleRtnStopState(Integer value) {
        this.mSaleRtnStopState = value;
    }

    /**
     * 获取mSettlementCurrency属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMSettlementCurrency() {
        return mSettlementCurrency;
    }

    /**
     * 设置mSettlementCurrency属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMSettlementCurrency(Integer value) {
        this.mSettlementCurrency = value;
    }

    /**
     * 获取mSettlementMethod属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMSettlementMethod() {
        return mSettlementMethod;
    }

    /**
     * 设置mSettlementMethod属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMSettlementMethod(Integer value) {
        this.mSettlementMethod = value;
    }

    /**
     * 获取mShipStopState属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMShipStopState() {
        return mShipStopState;
    }

    /**
     * 设置mShipStopState属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMShipStopState(Integer value) {
        this.mShipStopState = value;
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
     * 获取mTradePath属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOTradePathTradePathData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9CBOTradePathTradePathData> getMTradePath() {
        return mTradePath;
    }

    /**
     * 设置mTradePath属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CBOTradePathTradePathData }{@code >}
     *     
     */
    public void setMTradePath(JAXBElement<UFIDAU9CBOTradePathTradePathData> value) {
        this.mTradePath = value;
    }

}
