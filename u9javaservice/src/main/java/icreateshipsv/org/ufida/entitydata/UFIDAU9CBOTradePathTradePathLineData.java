
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
 * &lt;p&gt;UFIDA.U9.CBO.TradePath.TradePathLineData complex type�� Java �ࡣ
 * 
 * &lt;p&gt;����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡorg���Ե�ֵ��
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
     * ����org���Ե�ֵ��
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
     * ��ȡorgSKey���Ե�ֵ��
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
     * ����orgSKey���Ե�ֵ��
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
     * ��ȡtradePathSKey���Ե�ֵ��
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
     * ����tradePathSKey���Ե�ֵ��
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
     * ��ȡmIsControlPrice���Ե�ֵ��
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
     * ����mIsControlPrice���Ե�ֵ��
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
     * ��ȡmIsInnerThrewIntoPresent���Ե�ֵ��
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
     * ����mIsInnerThrewIntoPresent���Ե�ֵ��
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
     * ��ȡmIsPOStop���Ե�ֵ��
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
     * ����mIsPOStop���Ե�ֵ��
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
     * ��ȡmIsRcvStop���Ե�ֵ��
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
     * ����mIsRcvStop���Ե�ֵ��
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
     * ��ȡmIsRurRtnStop���Ե�ֵ��
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
     * ����mIsRurRtnStop���Ե�ֵ��
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
     * ��ȡmIsSOStop���Ե�ֵ��
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
     * ����mIsSOStop���Ե�ֵ��
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
     * ��ȡmIsSaleRtnStop���Ե�ֵ��
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
     * ����mIsSaleRtnStop���Ե�ֵ��
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
     * ��ȡmIsShipStop���Ե�ֵ��
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
     * ����mIsShipStop���Ե�ֵ��
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
     * ��ȡmLineNumber���Ե�ֵ��
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
     * ����mLineNumber���Ե�ֵ��
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
     * ��ȡmpoStopState���Ե�ֵ��
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
     * ����mpoStopState���Ե�ֵ��
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
     * ��ȡmPriceBy���Ե�ֵ��
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
     * ����mPriceBy���Ե�ֵ��
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
     * ��ȡmPriceLable���Ե�ֵ��
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
     * ����mPriceLable���Ե�ֵ��
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
     * ��ȡmProjectAssignRule���Ե�ֵ��
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
     * ����mProjectAssignRule���Ե�ֵ��
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
     * ��ȡmPurRtnStopState���Ե�ֵ��
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
     * ����mPurRtnStopState���Ե�ֵ��
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
     * ��ȡmRcvStopState���Ե�ֵ��
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
     * ����mRcvStopState���Ե�ֵ��
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
     * ��ȡmsoStopState���Ե�ֵ��
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
     * ����msoStopState���Ե�ֵ��
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
     * ��ȡmSaleRtnStopState���Ե�ֵ��
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
     * ����mSaleRtnStopState���Ե�ֵ��
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
     * ��ȡmSettlementCurrency���Ե�ֵ��
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
     * ����mSettlementCurrency���Ե�ֵ��
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
     * ��ȡmSettlementMethod���Ե�ֵ��
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
     * ����mSettlementMethod���Ե�ֵ��
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
     * ��ȡmShipStopState���Ե�ֵ��
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
     * ����mShipStopState���Ե�ֵ��
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
     * ��ȡmTradePath���Ե�ֵ��
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
     * ����mTradePath���Ե�ֵ��
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
