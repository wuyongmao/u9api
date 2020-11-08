
package org.ufida.entitydata;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import businessentity.business.ubf.ufsoft.EntityKey;


/**
 * &lt;p&gt;UFIDA.U9.PM.Pub.RcvDocTypeData complex type的 Java 类。
 * 
 * &lt;p&gt;以下模式片段指定包含在此类中的预期内容。
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="UFIDA.U9.PM.Pub.RcvDocTypeData"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://www.UFIDA.org/EntityData}UFIDA.U9.Base.Doc.DocTypeData"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="CostGetPriceSchema" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="CostGetPriceSchema_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="PresentPriceSource" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="PresentPriceSource_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="PriceSource" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="PriceSource_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_confirmDateDefaultValue" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_confirmMode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isAutoCreateLot" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isAutoCreateRMA" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isAutoCreateSN" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isAutoVerification" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isCanAPByPriceZero" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isFillRcv" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isHasContract" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isHasPrepay" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isHasRcvPlan" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isLineApprove" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isOriginalBillRtn" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isPP" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isProjectPur" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isRCVToMO" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isReferenced" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isRtnFillGenPO" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isSrcRcvDefaultMergerAP" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isVMI" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_memo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_receivementType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_reverseRtnDocTypeRed" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_rtnType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UFIDA.U9.PM.Pub.RcvDocTypeData", propOrder = {
    "costGetPriceSchema",
    "costGetPriceSchemaSKey",
    "presentPriceSource",
    "presentPriceSourceSKey",
    "priceSource",
    "priceSourceSKey",
    "mConfirmDateDefaultValue",
    "mConfirmMode",
    "mIsAutoCreateLot",
    "mIsAutoCreateRMA",
    "mIsAutoCreateSN",
    "mIsAutoVerification",
    "mIsCanAPByPriceZero",
    "mIsFillRcv",
    "mIsHasContract",
    "mIsHasPrepay",
    "mIsHasRcvPlan",
    "mIsLineApprove",
    "mIsOriginalBillRtn",
    "mIsPP",
    "mIsProjectPur",
    "mIsRCVToMO",
    "mIsReferenced",
    "mIsRtnFillGenPO",
    "mIsSrcRcvDefaultMergerAP",
    "mIsVMI",
    "mMemo",
    "mReceivementType",
    "mReverseRtnDocTypeRed",
    "mRtnType"
})
public class UFIDAU9PMPubRcvDocTypeData
    extends UFIDAU9BaseDocDocTypeData
{

    @XmlElement(name = "CostGetPriceSchema")
    protected Long costGetPriceSchema;
    @XmlElementRef(name = "CostGetPriceSchema_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> costGetPriceSchemaSKey;
    @XmlElement(name = "PresentPriceSource")
    protected Long presentPriceSource;
    @XmlElementRef(name = "PresentPriceSource_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> presentPriceSourceSKey;
    @XmlElement(name = "PriceSource")
    protected Long priceSource;
    @XmlElementRef(name = "PriceSource_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> priceSourceSKey;
    @XmlElement(name = "m_confirmDateDefaultValue")
    protected Integer mConfirmDateDefaultValue;
    @XmlElement(name = "m_confirmMode")
    protected Integer mConfirmMode;
    @XmlElement(name = "m_isAutoCreateLot")
    protected Boolean mIsAutoCreateLot;
    @XmlElement(name = "m_isAutoCreateRMA")
    protected Boolean mIsAutoCreateRMA;
    @XmlElement(name = "m_isAutoCreateSN")
    protected Boolean mIsAutoCreateSN;
    @XmlElement(name = "m_isAutoVerification")
    protected Boolean mIsAutoVerification;
    @XmlElement(name = "m_isCanAPByPriceZero")
    protected Boolean mIsCanAPByPriceZero;
    @XmlElement(name = "m_isFillRcv")
    protected Boolean mIsFillRcv;
    @XmlElement(name = "m_isHasContract")
    protected Boolean mIsHasContract;
    @XmlElement(name = "m_isHasPrepay")
    protected Boolean mIsHasPrepay;
    @XmlElement(name = "m_isHasRcvPlan")
    protected Boolean mIsHasRcvPlan;
    @XmlElement(name = "m_isLineApprove")
    protected Boolean mIsLineApprove;
    @XmlElement(name = "m_isOriginalBillRtn")
    protected Boolean mIsOriginalBillRtn;
    @XmlElement(name = "m_isPP")
    protected Boolean mIsPP;
    @XmlElement(name = "m_isProjectPur")
    protected Boolean mIsProjectPur;
    @XmlElement(name = "m_isRCVToMO")
    protected Boolean mIsRCVToMO;
    @XmlElement(name = "m_isReferenced")
    protected Boolean mIsReferenced;
    @XmlElement(name = "m_isRtnFillGenPO")
    protected Boolean mIsRtnFillGenPO;
    @XmlElement(name = "m_isSrcRcvDefaultMergerAP")
    protected Boolean mIsSrcRcvDefaultMergerAP;
    @XmlElement(name = "m_isVMI")
    protected Boolean mIsVMI;
    @XmlElementRef(name = "m_memo", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mMemo;
    @XmlElement(name = "m_receivementType")
    protected Integer mReceivementType;
    @XmlElement(name = "m_reverseRtnDocTypeRed")
    protected Integer mReverseRtnDocTypeRed;
    @XmlElement(name = "m_rtnType")
    protected Integer mRtnType;

    /**
     * 获取costGetPriceSchema属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCostGetPriceSchema() {
        return costGetPriceSchema;
    }

    /**
     * 设置costGetPriceSchema属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCostGetPriceSchema(Long value) {
        this.costGetPriceSchema = value;
    }

    /**
     * 获取costGetPriceSchemaSKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getCostGetPriceSchemaSKey() {
        return costGetPriceSchemaSKey;
    }

    /**
     * 设置costGetPriceSchemaSKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setCostGetPriceSchemaSKey(JAXBElement<EntityKey> value) {
        this.costGetPriceSchemaSKey = value;
    }

    /**
     * 获取presentPriceSource属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPresentPriceSource() {
        return presentPriceSource;
    }

    /**
     * 设置presentPriceSource属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPresentPriceSource(Long value) {
        this.presentPriceSource = value;
    }

    /**
     * 获取presentPriceSourceSKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getPresentPriceSourceSKey() {
        return presentPriceSourceSKey;
    }

    /**
     * 设置presentPriceSourceSKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setPresentPriceSourceSKey(JAXBElement<EntityKey> value) {
        this.presentPriceSourceSKey = value;
    }

    /**
     * 获取priceSource属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPriceSource() {
        return priceSource;
    }

    /**
     * 设置priceSource属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPriceSource(Long value) {
        this.priceSource = value;
    }

    /**
     * 获取priceSourceSKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getPriceSourceSKey() {
        return priceSourceSKey;
    }

    /**
     * 设置priceSourceSKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setPriceSourceSKey(JAXBElement<EntityKey> value) {
        this.priceSourceSKey = value;
    }

    /**
     * 获取mConfirmDateDefaultValue属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMConfirmDateDefaultValue() {
        return mConfirmDateDefaultValue;
    }

    /**
     * 设置mConfirmDateDefaultValue属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMConfirmDateDefaultValue(Integer value) {
        this.mConfirmDateDefaultValue = value;
    }

    /**
     * 获取mConfirmMode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMConfirmMode() {
        return mConfirmMode;
    }

    /**
     * 设置mConfirmMode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMConfirmMode(Integer value) {
        this.mConfirmMode = value;
    }

    /**
     * 获取mIsAutoCreateLot属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsAutoCreateLot() {
        return mIsAutoCreateLot;
    }

    /**
     * 设置mIsAutoCreateLot属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsAutoCreateLot(Boolean value) {
        this.mIsAutoCreateLot = value;
    }

    /**
     * 获取mIsAutoCreateRMA属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsAutoCreateRMA() {
        return mIsAutoCreateRMA;
    }

    /**
     * 设置mIsAutoCreateRMA属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsAutoCreateRMA(Boolean value) {
        this.mIsAutoCreateRMA = value;
    }

    /**
     * 获取mIsAutoCreateSN属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsAutoCreateSN() {
        return mIsAutoCreateSN;
    }

    /**
     * 设置mIsAutoCreateSN属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsAutoCreateSN(Boolean value) {
        this.mIsAutoCreateSN = value;
    }

    /**
     * 获取mIsAutoVerification属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsAutoVerification() {
        return mIsAutoVerification;
    }

    /**
     * 设置mIsAutoVerification属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsAutoVerification(Boolean value) {
        this.mIsAutoVerification = value;
    }

    /**
     * 获取mIsCanAPByPriceZero属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsCanAPByPriceZero() {
        return mIsCanAPByPriceZero;
    }

    /**
     * 设置mIsCanAPByPriceZero属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsCanAPByPriceZero(Boolean value) {
        this.mIsCanAPByPriceZero = value;
    }

    /**
     * 获取mIsFillRcv属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsFillRcv() {
        return mIsFillRcv;
    }

    /**
     * 设置mIsFillRcv属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsFillRcv(Boolean value) {
        this.mIsFillRcv = value;
    }

    /**
     * 获取mIsHasContract属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsHasContract() {
        return mIsHasContract;
    }

    /**
     * 设置mIsHasContract属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsHasContract(Boolean value) {
        this.mIsHasContract = value;
    }

    /**
     * 获取mIsHasPrepay属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsHasPrepay() {
        return mIsHasPrepay;
    }

    /**
     * 设置mIsHasPrepay属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsHasPrepay(Boolean value) {
        this.mIsHasPrepay = value;
    }

    /**
     * 获取mIsHasRcvPlan属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsHasRcvPlan() {
        return mIsHasRcvPlan;
    }

    /**
     * 设置mIsHasRcvPlan属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsHasRcvPlan(Boolean value) {
        this.mIsHasRcvPlan = value;
    }

    /**
     * 获取mIsLineApprove属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsLineApprove() {
        return mIsLineApprove;
    }

    /**
     * 设置mIsLineApprove属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsLineApprove(Boolean value) {
        this.mIsLineApprove = value;
    }

    /**
     * 获取mIsOriginalBillRtn属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsOriginalBillRtn() {
        return mIsOriginalBillRtn;
    }

    /**
     * 设置mIsOriginalBillRtn属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsOriginalBillRtn(Boolean value) {
        this.mIsOriginalBillRtn = value;
    }

    /**
     * 获取mIsPP属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsPP() {
        return mIsPP;
    }

    /**
     * 设置mIsPP属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsPP(Boolean value) {
        this.mIsPP = value;
    }

    /**
     * 获取mIsProjectPur属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsProjectPur() {
        return mIsProjectPur;
    }

    /**
     * 设置mIsProjectPur属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsProjectPur(Boolean value) {
        this.mIsProjectPur = value;
    }

    /**
     * 获取mIsRCVToMO属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsRCVToMO() {
        return mIsRCVToMO;
    }

    /**
     * 设置mIsRCVToMO属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsRCVToMO(Boolean value) {
        this.mIsRCVToMO = value;
    }

    /**
     * 获取mIsReferenced属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsReferenced() {
        return mIsReferenced;
    }

    /**
     * 设置mIsReferenced属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsReferenced(Boolean value) {
        this.mIsReferenced = value;
    }

    /**
     * 获取mIsRtnFillGenPO属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsRtnFillGenPO() {
        return mIsRtnFillGenPO;
    }

    /**
     * 设置mIsRtnFillGenPO属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsRtnFillGenPO(Boolean value) {
        this.mIsRtnFillGenPO = value;
    }

    /**
     * 获取mIsSrcRcvDefaultMergerAP属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsSrcRcvDefaultMergerAP() {
        return mIsSrcRcvDefaultMergerAP;
    }

    /**
     * 设置mIsSrcRcvDefaultMergerAP属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsSrcRcvDefaultMergerAP(Boolean value) {
        this.mIsSrcRcvDefaultMergerAP = value;
    }

    /**
     * 获取mIsVMI属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsVMI() {
        return mIsVMI;
    }

    /**
     * 设置mIsVMI属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsVMI(Boolean value) {
        this.mIsVMI = value;
    }

    /**
     * 获取mMemo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMMemo() {
        return mMemo;
    }

    /**
     * 设置mMemo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMMemo(JAXBElement<String> value) {
        this.mMemo = value;
    }

    /**
     * 获取mReceivementType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMReceivementType() {
        return mReceivementType;
    }

    /**
     * 设置mReceivementType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMReceivementType(Integer value) {
        this.mReceivementType = value;
    }

    /**
     * 获取mReverseRtnDocTypeRed属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMReverseRtnDocTypeRed() {
        return mReverseRtnDocTypeRed;
    }

    /**
     * 设置mReverseRtnDocTypeRed属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMReverseRtnDocTypeRed(Integer value) {
        this.mReverseRtnDocTypeRed = value;
    }

    /**
     * 获取mRtnType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMRtnType() {
        return mRtnType;
    }

    /**
     * 设置mRtnType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMRtnType(Integer value) {
        this.mRtnType = value;
    }

}
