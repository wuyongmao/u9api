
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
 * &lt;p&gt;UFIDA.U9.PM.Rcv.RcvLineDispenseData complex type的 Java 类。
 * 
 * &lt;p&gt;以下模式片段指定包含在此类中的预期内容。
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="UFIDA.U9.PM.Rcv.RcvLineDispenseData"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://www.UFIDA.org/EntityData}UFSoft.UBF.Business.DataTransObjectBase"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="CurrentOrg" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="CurrentOrg_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="RcvLine_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="UseDept" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="UseDept_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="UseMan" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="UseMan_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="UseOrg" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="UseOrg_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_canProcessQtyTBU" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_canProcessQtyTU" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_createdBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_createdOn" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_descFlexSegments" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.Base.FlexField.DescFlexField.DescFlexSegmentsData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_dispenseLineNo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_dispenseQtySU" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_dispenseQtyTBU" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_dispenseQtyTU" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_executedIPVAC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_executedIPVFC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_executedIPVFeeAC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_executedIPVFeeTC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_executedIPVFeeTaxAC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_executedIPVFeeTaxTC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_executedIPVTC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_executedIPVTaxAC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_executedIPVTaxFC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_executedIPVTaxTC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_feeAC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_feeFC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_feeTC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_feeTaxAC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_feeTaxFC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_feeTaxTC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_grade" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_iD" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_iPVAC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_iPVFC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_iPVFeeAC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_iPVFeeTC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_iPVFeeTaxAC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_iPVFeeTaxTC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_iPVTC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_iPVTaxAC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_iPVTaxFC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_iPVTaxTC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isNotSetUpCard" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_modifiedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_modifiedOn" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_netFeeAC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_netFeeFC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_netFeeTC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_netUsedMnyAC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_netUsedMnyFC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_netUsedMnyTC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_potency" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_rcvIPVSubLine" type="{http://www.UFIDA.org/EntityData}ArrayOfUFIDA.U9.PM.Rcv.RcvIPVSubLineData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_rcvLine" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.PM.Rcv.RcvLineData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_setupCardQtyAU" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_setupCardQtyTBU" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_setupCardQtyTU" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_snCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_srcDispenseLineID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_sysVersion" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_usedMnyAC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_usedMnyFC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_usedMnyTC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_usedTaxAC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_usedTaxFC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_usedTaxTC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UFIDA.U9.PM.Rcv.RcvLineDispenseData", propOrder = {
    "currentOrg",
    "currentOrgSKey",
    "rcvLineSKey",
    "useDept",
    "useDeptSKey",
    "useMan",
    "useManSKey",
    "useOrg",
    "useOrgSKey",
    "mCanProcessQtyTBU",
    "mCanProcessQtyTU",
    "mCreatedBy",
    "mCreatedOn",
    "mDescFlexSegments",
    "mDispenseLineNo",
    "mDispenseQtySU",
    "mDispenseQtyTBU",
    "mDispenseQtyTU",
    "mExecutedIPVAC",
    "mExecutedIPVFC",
    "mExecutedIPVFeeAC",
    "mExecutedIPVFeeTC",
    "mExecutedIPVFeeTaxAC",
    "mExecutedIPVFeeTaxTC",
    "mExecutedIPVTC",
    "mExecutedIPVTaxAC",
    "mExecutedIPVTaxFC",
    "mExecutedIPVTaxTC",
    "mFeeAC",
    "mFeeFC",
    "mFeeTC",
    "mFeeTaxAC",
    "mFeeTaxFC",
    "mFeeTaxTC",
    "mGrade",
    "mid",
    "mipvac",
    "mipvfc",
    "mipvFeeAC",
    "mipvFeeTC",
    "mipvFeeTaxAC",
    "mipvFeeTaxTC",
    "mipvtc",
    "mipvTaxAC",
    "mipvTaxFC",
    "mipvTaxTC",
    "mIsNotSetUpCard",
    "mModifiedBy",
    "mModifiedOn",
    "mNetFeeAC",
    "mNetFeeFC",
    "mNetFeeTC",
    "mNetUsedMnyAC",
    "mNetUsedMnyFC",
    "mNetUsedMnyTC",
    "mPotency",
    "mRcvIPVSubLine",
    "mRcvLine",
    "mSetupCardQtyAU",
    "mSetupCardQtyTBU",
    "mSetupCardQtyTU",
    "mSnCode",
    "mSrcDispenseLineID",
    "mSysVersion",
    "mUsedMnyAC",
    "mUsedMnyFC",
    "mUsedMnyTC",
    "mUsedTaxAC",
    "mUsedTaxFC",
    "mUsedTaxTC"
})
public class UFIDAU9PMRcvRcvLineDispenseData
    extends UFSoftUBFBusinessDataTransObjectBase
{

    @XmlElement(name = "CurrentOrg")
    protected Long currentOrg;
    @XmlElementRef(name = "CurrentOrg_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> currentOrgSKey;
    @XmlElementRef(name = "RcvLine_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> rcvLineSKey;
    @XmlElement(name = "UseDept")
    protected Long useDept;
    @XmlElementRef(name = "UseDept_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> useDeptSKey;
    @XmlElement(name = "UseMan")
    protected Long useMan;
    @XmlElementRef(name = "UseMan_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> useManSKey;
    @XmlElement(name = "UseOrg")
    protected Long useOrg;
    @XmlElementRef(name = "UseOrg_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> useOrgSKey;
    @XmlElement(name = "m_canProcessQtyTBU")
    protected BigDecimal mCanProcessQtyTBU;
    @XmlElement(name = "m_canProcessQtyTU")
    protected BigDecimal mCanProcessQtyTU;
    @XmlElementRef(name = "m_createdBy", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mCreatedBy;
    @XmlElement(name = "m_createdOn")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mCreatedOn;
    @XmlElementRef(name = "m_descFlexSegments", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9BaseFlexFieldDescFlexFieldDescFlexSegmentsData> mDescFlexSegments;
    @XmlElement(name = "m_dispenseLineNo")
    protected Integer mDispenseLineNo;
    @XmlElement(name = "m_dispenseQtySU")
    protected BigDecimal mDispenseQtySU;
    @XmlElement(name = "m_dispenseQtyTBU")
    protected BigDecimal mDispenseQtyTBU;
    @XmlElement(name = "m_dispenseQtyTU")
    protected BigDecimal mDispenseQtyTU;
    @XmlElement(name = "m_executedIPVAC")
    protected BigDecimal mExecutedIPVAC;
    @XmlElement(name = "m_executedIPVFC")
    protected BigDecimal mExecutedIPVFC;
    @XmlElement(name = "m_executedIPVFeeAC")
    protected BigDecimal mExecutedIPVFeeAC;
    @XmlElement(name = "m_executedIPVFeeTC")
    protected BigDecimal mExecutedIPVFeeTC;
    @XmlElement(name = "m_executedIPVFeeTaxAC")
    protected BigDecimal mExecutedIPVFeeTaxAC;
    @XmlElement(name = "m_executedIPVFeeTaxTC")
    protected BigDecimal mExecutedIPVFeeTaxTC;
    @XmlElement(name = "m_executedIPVTC")
    protected BigDecimal mExecutedIPVTC;
    @XmlElement(name = "m_executedIPVTaxAC")
    protected BigDecimal mExecutedIPVTaxAC;
    @XmlElement(name = "m_executedIPVTaxFC")
    protected BigDecimal mExecutedIPVTaxFC;
    @XmlElement(name = "m_executedIPVTaxTC")
    protected BigDecimal mExecutedIPVTaxTC;
    @XmlElement(name = "m_feeAC")
    protected BigDecimal mFeeAC;
    @XmlElement(name = "m_feeFC")
    protected BigDecimal mFeeFC;
    @XmlElement(name = "m_feeTC")
    protected BigDecimal mFeeTC;
    @XmlElement(name = "m_feeTaxAC")
    protected BigDecimal mFeeTaxAC;
    @XmlElement(name = "m_feeTaxFC")
    protected BigDecimal mFeeTaxFC;
    @XmlElement(name = "m_feeTaxTC")
    protected BigDecimal mFeeTaxTC;
    @XmlElement(name = "m_grade")
    protected Integer mGrade;
    @XmlElement(name = "m_iD")
    protected Long mid;
    @XmlElement(name = "m_iPVAC")
    protected BigDecimal mipvac;
    @XmlElement(name = "m_iPVFC")
    protected BigDecimal mipvfc;
    @XmlElement(name = "m_iPVFeeAC")
    protected BigDecimal mipvFeeAC;
    @XmlElement(name = "m_iPVFeeTC")
    protected BigDecimal mipvFeeTC;
    @XmlElement(name = "m_iPVFeeTaxAC")
    protected BigDecimal mipvFeeTaxAC;
    @XmlElement(name = "m_iPVFeeTaxTC")
    protected BigDecimal mipvFeeTaxTC;
    @XmlElement(name = "m_iPVTC")
    protected BigDecimal mipvtc;
    @XmlElement(name = "m_iPVTaxAC")
    protected BigDecimal mipvTaxAC;
    @XmlElement(name = "m_iPVTaxFC")
    protected BigDecimal mipvTaxFC;
    @XmlElement(name = "m_iPVTaxTC")
    protected BigDecimal mipvTaxTC;
    @XmlElement(name = "m_isNotSetUpCard")
    protected Boolean mIsNotSetUpCard;
    @XmlElementRef(name = "m_modifiedBy", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mModifiedBy;
    @XmlElement(name = "m_modifiedOn")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mModifiedOn;
    @XmlElement(name = "m_netFeeAC")
    protected BigDecimal mNetFeeAC;
    @XmlElement(name = "m_netFeeFC")
    protected BigDecimal mNetFeeFC;
    @XmlElement(name = "m_netFeeTC")
    protected BigDecimal mNetFeeTC;
    @XmlElement(name = "m_netUsedMnyAC")
    protected BigDecimal mNetUsedMnyAC;
    @XmlElement(name = "m_netUsedMnyFC")
    protected BigDecimal mNetUsedMnyFC;
    @XmlElement(name = "m_netUsedMnyTC")
    protected BigDecimal mNetUsedMnyTC;
    @XmlElement(name = "m_potency")
    protected Integer mPotency;
    @XmlElementRef(name = "m_rcvIPVSubLine", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfUFIDAU9PMRcvRcvIPVSubLineData> mRcvIPVSubLine;
    @XmlElementRef(name = "m_rcvLine", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9PMRcvRcvLineData> mRcvLine;
    @XmlElement(name = "m_setupCardQtyAU")
    protected BigDecimal mSetupCardQtyAU;
    @XmlElement(name = "m_setupCardQtyTBU")
    protected BigDecimal mSetupCardQtyTBU;
    @XmlElement(name = "m_setupCardQtyTU")
    protected BigDecimal mSetupCardQtyTU;
    @XmlElementRef(name = "m_snCode", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mSnCode;
    @XmlElement(name = "m_srcDispenseLineID")
    protected Long mSrcDispenseLineID;
    @XmlElement(name = "m_sysVersion")
    protected Long mSysVersion;
    @XmlElement(name = "m_usedMnyAC")
    protected BigDecimal mUsedMnyAC;
    @XmlElement(name = "m_usedMnyFC")
    protected BigDecimal mUsedMnyFC;
    @XmlElement(name = "m_usedMnyTC")
    protected BigDecimal mUsedMnyTC;
    @XmlElement(name = "m_usedTaxAC")
    protected BigDecimal mUsedTaxAC;
    @XmlElement(name = "m_usedTaxFC")
    protected BigDecimal mUsedTaxFC;
    @XmlElement(name = "m_usedTaxTC")
    protected BigDecimal mUsedTaxTC;

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
     * 获取useDept属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getUseDept() {
        return useDept;
    }

    /**
     * 设置useDept属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setUseDept(Long value) {
        this.useDept = value;
    }

    /**
     * 获取useDeptSKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getUseDeptSKey() {
        return useDeptSKey;
    }

    /**
     * 设置useDeptSKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setUseDeptSKey(JAXBElement<EntityKey> value) {
        this.useDeptSKey = value;
    }

    /**
     * 获取useMan属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getUseMan() {
        return useMan;
    }

    /**
     * 设置useMan属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setUseMan(Long value) {
        this.useMan = value;
    }

    /**
     * 获取useManSKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getUseManSKey() {
        return useManSKey;
    }

    /**
     * 设置useManSKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setUseManSKey(JAXBElement<EntityKey> value) {
        this.useManSKey = value;
    }

    /**
     * 获取useOrg属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getUseOrg() {
        return useOrg;
    }

    /**
     * 设置useOrg属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setUseOrg(Long value) {
        this.useOrg = value;
    }

    /**
     * 获取useOrgSKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getUseOrgSKey() {
        return useOrgSKey;
    }

    /**
     * 设置useOrgSKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setUseOrgSKey(JAXBElement<EntityKey> value) {
        this.useOrgSKey = value;
    }

    /**
     * 获取mCanProcessQtyTBU属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMCanProcessQtyTBU() {
        return mCanProcessQtyTBU;
    }

    /**
     * 设置mCanProcessQtyTBU属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMCanProcessQtyTBU(BigDecimal value) {
        this.mCanProcessQtyTBU = value;
    }

    /**
     * 获取mCanProcessQtyTU属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMCanProcessQtyTU() {
        return mCanProcessQtyTU;
    }

    /**
     * 设置mCanProcessQtyTU属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMCanProcessQtyTU(BigDecimal value) {
        this.mCanProcessQtyTU = value;
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
     * 获取mDescFlexSegments属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9BaseFlexFieldDescFlexFieldDescFlexSegmentsData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9BaseFlexFieldDescFlexFieldDescFlexSegmentsData> getMDescFlexSegments() {
        return mDescFlexSegments;
    }

    /**
     * 设置mDescFlexSegments属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9BaseFlexFieldDescFlexFieldDescFlexSegmentsData }{@code >}
     *     
     */
    public void setMDescFlexSegments(JAXBElement<UFIDAU9BaseFlexFieldDescFlexFieldDescFlexSegmentsData> value) {
        this.mDescFlexSegments = value;
    }

    /**
     * 获取mDispenseLineNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMDispenseLineNo() {
        return mDispenseLineNo;
    }

    /**
     * 设置mDispenseLineNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMDispenseLineNo(Integer value) {
        this.mDispenseLineNo = value;
    }

    /**
     * 获取mDispenseQtySU属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMDispenseQtySU() {
        return mDispenseQtySU;
    }

    /**
     * 设置mDispenseQtySU属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMDispenseQtySU(BigDecimal value) {
        this.mDispenseQtySU = value;
    }

    /**
     * 获取mDispenseQtyTBU属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMDispenseQtyTBU() {
        return mDispenseQtyTBU;
    }

    /**
     * 设置mDispenseQtyTBU属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMDispenseQtyTBU(BigDecimal value) {
        this.mDispenseQtyTBU = value;
    }

    /**
     * 获取mDispenseQtyTU属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMDispenseQtyTU() {
        return mDispenseQtyTU;
    }

    /**
     * 设置mDispenseQtyTU属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMDispenseQtyTU(BigDecimal value) {
        this.mDispenseQtyTU = value;
    }

    /**
     * 获取mExecutedIPVAC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMExecutedIPVAC() {
        return mExecutedIPVAC;
    }

    /**
     * 设置mExecutedIPVAC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMExecutedIPVAC(BigDecimal value) {
        this.mExecutedIPVAC = value;
    }

    /**
     * 获取mExecutedIPVFC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMExecutedIPVFC() {
        return mExecutedIPVFC;
    }

    /**
     * 设置mExecutedIPVFC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMExecutedIPVFC(BigDecimal value) {
        this.mExecutedIPVFC = value;
    }

    /**
     * 获取mExecutedIPVFeeAC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMExecutedIPVFeeAC() {
        return mExecutedIPVFeeAC;
    }

    /**
     * 设置mExecutedIPVFeeAC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMExecutedIPVFeeAC(BigDecimal value) {
        this.mExecutedIPVFeeAC = value;
    }

    /**
     * 获取mExecutedIPVFeeTC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMExecutedIPVFeeTC() {
        return mExecutedIPVFeeTC;
    }

    /**
     * 设置mExecutedIPVFeeTC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMExecutedIPVFeeTC(BigDecimal value) {
        this.mExecutedIPVFeeTC = value;
    }

    /**
     * 获取mExecutedIPVFeeTaxAC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMExecutedIPVFeeTaxAC() {
        return mExecutedIPVFeeTaxAC;
    }

    /**
     * 设置mExecutedIPVFeeTaxAC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMExecutedIPVFeeTaxAC(BigDecimal value) {
        this.mExecutedIPVFeeTaxAC = value;
    }

    /**
     * 获取mExecutedIPVFeeTaxTC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMExecutedIPVFeeTaxTC() {
        return mExecutedIPVFeeTaxTC;
    }

    /**
     * 设置mExecutedIPVFeeTaxTC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMExecutedIPVFeeTaxTC(BigDecimal value) {
        this.mExecutedIPVFeeTaxTC = value;
    }

    /**
     * 获取mExecutedIPVTC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMExecutedIPVTC() {
        return mExecutedIPVTC;
    }

    /**
     * 设置mExecutedIPVTC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMExecutedIPVTC(BigDecimal value) {
        this.mExecutedIPVTC = value;
    }

    /**
     * 获取mExecutedIPVTaxAC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMExecutedIPVTaxAC() {
        return mExecutedIPVTaxAC;
    }

    /**
     * 设置mExecutedIPVTaxAC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMExecutedIPVTaxAC(BigDecimal value) {
        this.mExecutedIPVTaxAC = value;
    }

    /**
     * 获取mExecutedIPVTaxFC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMExecutedIPVTaxFC() {
        return mExecutedIPVTaxFC;
    }

    /**
     * 设置mExecutedIPVTaxFC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMExecutedIPVTaxFC(BigDecimal value) {
        this.mExecutedIPVTaxFC = value;
    }

    /**
     * 获取mExecutedIPVTaxTC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMExecutedIPVTaxTC() {
        return mExecutedIPVTaxTC;
    }

    /**
     * 设置mExecutedIPVTaxTC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMExecutedIPVTaxTC(BigDecimal value) {
        this.mExecutedIPVTaxTC = value;
    }

    /**
     * 获取mFeeAC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMFeeAC() {
        return mFeeAC;
    }

    /**
     * 设置mFeeAC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMFeeAC(BigDecimal value) {
        this.mFeeAC = value;
    }

    /**
     * 获取mFeeFC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMFeeFC() {
        return mFeeFC;
    }

    /**
     * 设置mFeeFC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMFeeFC(BigDecimal value) {
        this.mFeeFC = value;
    }

    /**
     * 获取mFeeTC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMFeeTC() {
        return mFeeTC;
    }

    /**
     * 设置mFeeTC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMFeeTC(BigDecimal value) {
        this.mFeeTC = value;
    }

    /**
     * 获取mFeeTaxAC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMFeeTaxAC() {
        return mFeeTaxAC;
    }

    /**
     * 设置mFeeTaxAC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMFeeTaxAC(BigDecimal value) {
        this.mFeeTaxAC = value;
    }

    /**
     * 获取mFeeTaxFC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMFeeTaxFC() {
        return mFeeTaxFC;
    }

    /**
     * 设置mFeeTaxFC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMFeeTaxFC(BigDecimal value) {
        this.mFeeTaxFC = value;
    }

    /**
     * 获取mFeeTaxTC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMFeeTaxTC() {
        return mFeeTaxTC;
    }

    /**
     * 设置mFeeTaxTC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMFeeTaxTC(BigDecimal value) {
        this.mFeeTaxTC = value;
    }

    /**
     * 获取mGrade属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMGrade() {
        return mGrade;
    }

    /**
     * 设置mGrade属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMGrade(Integer value) {
        this.mGrade = value;
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
     * 获取mipvac属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMIPVAC() {
        return mipvac;
    }

    /**
     * 设置mipvac属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMIPVAC(BigDecimal value) {
        this.mipvac = value;
    }

    /**
     * 获取mipvfc属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMIPVFC() {
        return mipvfc;
    }

    /**
     * 设置mipvfc属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMIPVFC(BigDecimal value) {
        this.mipvfc = value;
    }

    /**
     * 获取mipvFeeAC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMIPVFeeAC() {
        return mipvFeeAC;
    }

    /**
     * 设置mipvFeeAC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMIPVFeeAC(BigDecimal value) {
        this.mipvFeeAC = value;
    }

    /**
     * 获取mipvFeeTC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMIPVFeeTC() {
        return mipvFeeTC;
    }

    /**
     * 设置mipvFeeTC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMIPVFeeTC(BigDecimal value) {
        this.mipvFeeTC = value;
    }

    /**
     * 获取mipvFeeTaxAC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMIPVFeeTaxAC() {
        return mipvFeeTaxAC;
    }

    /**
     * 设置mipvFeeTaxAC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMIPVFeeTaxAC(BigDecimal value) {
        this.mipvFeeTaxAC = value;
    }

    /**
     * 获取mipvFeeTaxTC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMIPVFeeTaxTC() {
        return mipvFeeTaxTC;
    }

    /**
     * 设置mipvFeeTaxTC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMIPVFeeTaxTC(BigDecimal value) {
        this.mipvFeeTaxTC = value;
    }

    /**
     * 获取mipvtc属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMIPVTC() {
        return mipvtc;
    }

    /**
     * 设置mipvtc属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMIPVTC(BigDecimal value) {
        this.mipvtc = value;
    }

    /**
     * 获取mipvTaxAC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMIPVTaxAC() {
        return mipvTaxAC;
    }

    /**
     * 设置mipvTaxAC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMIPVTaxAC(BigDecimal value) {
        this.mipvTaxAC = value;
    }

    /**
     * 获取mipvTaxFC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMIPVTaxFC() {
        return mipvTaxFC;
    }

    /**
     * 设置mipvTaxFC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMIPVTaxFC(BigDecimal value) {
        this.mipvTaxFC = value;
    }

    /**
     * 获取mipvTaxTC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMIPVTaxTC() {
        return mipvTaxTC;
    }

    /**
     * 设置mipvTaxTC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMIPVTaxTC(BigDecimal value) {
        this.mipvTaxTC = value;
    }

    /**
     * 获取mIsNotSetUpCard属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsNotSetUpCard() {
        return mIsNotSetUpCard;
    }

    /**
     * 设置mIsNotSetUpCard属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsNotSetUpCard(Boolean value) {
        this.mIsNotSetUpCard = value;
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
     * 获取mNetFeeAC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMNetFeeAC() {
        return mNetFeeAC;
    }

    /**
     * 设置mNetFeeAC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMNetFeeAC(BigDecimal value) {
        this.mNetFeeAC = value;
    }

    /**
     * 获取mNetFeeFC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMNetFeeFC() {
        return mNetFeeFC;
    }

    /**
     * 设置mNetFeeFC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMNetFeeFC(BigDecimal value) {
        this.mNetFeeFC = value;
    }

    /**
     * 获取mNetFeeTC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMNetFeeTC() {
        return mNetFeeTC;
    }

    /**
     * 设置mNetFeeTC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMNetFeeTC(BigDecimal value) {
        this.mNetFeeTC = value;
    }

    /**
     * 获取mNetUsedMnyAC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMNetUsedMnyAC() {
        return mNetUsedMnyAC;
    }

    /**
     * 设置mNetUsedMnyAC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMNetUsedMnyAC(BigDecimal value) {
        this.mNetUsedMnyAC = value;
    }

    /**
     * 获取mNetUsedMnyFC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMNetUsedMnyFC() {
        return mNetUsedMnyFC;
    }

    /**
     * 设置mNetUsedMnyFC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMNetUsedMnyFC(BigDecimal value) {
        this.mNetUsedMnyFC = value;
    }

    /**
     * 获取mNetUsedMnyTC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMNetUsedMnyTC() {
        return mNetUsedMnyTC;
    }

    /**
     * 设置mNetUsedMnyTC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMNetUsedMnyTC(BigDecimal value) {
        this.mNetUsedMnyTC = value;
    }

    /**
     * 获取mPotency属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMPotency() {
        return mPotency;
    }

    /**
     * 设置mPotency属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMPotency(Integer value) {
        this.mPotency = value;
    }

    /**
     * 获取mRcvIPVSubLine属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUFIDAU9PMRcvRcvIPVSubLineData }{@code >}
     *     
     */
    public JAXBElement<ArrayOfUFIDAU9PMRcvRcvIPVSubLineData> getMRcvIPVSubLine() {
        return mRcvIPVSubLine;
    }

    /**
     * 设置mRcvIPVSubLine属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUFIDAU9PMRcvRcvIPVSubLineData }{@code >}
     *     
     */
    public void setMRcvIPVSubLine(JAXBElement<ArrayOfUFIDAU9PMRcvRcvIPVSubLineData> value) {
        this.mRcvIPVSubLine = value;
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
     * 获取mSetupCardQtyAU属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMSetupCardQtyAU() {
        return mSetupCardQtyAU;
    }

    /**
     * 设置mSetupCardQtyAU属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMSetupCardQtyAU(BigDecimal value) {
        this.mSetupCardQtyAU = value;
    }

    /**
     * 获取mSetupCardQtyTBU属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMSetupCardQtyTBU() {
        return mSetupCardQtyTBU;
    }

    /**
     * 设置mSetupCardQtyTBU属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMSetupCardQtyTBU(BigDecimal value) {
        this.mSetupCardQtyTBU = value;
    }

    /**
     * 获取mSetupCardQtyTU属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMSetupCardQtyTU() {
        return mSetupCardQtyTU;
    }

    /**
     * 设置mSetupCardQtyTU属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMSetupCardQtyTU(BigDecimal value) {
        this.mSetupCardQtyTU = value;
    }

    /**
     * 获取mSnCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMSnCode() {
        return mSnCode;
    }

    /**
     * 设置mSnCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMSnCode(JAXBElement<String> value) {
        this.mSnCode = value;
    }

    /**
     * 获取mSrcDispenseLineID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMSrcDispenseLineID() {
        return mSrcDispenseLineID;
    }

    /**
     * 设置mSrcDispenseLineID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMSrcDispenseLineID(Long value) {
        this.mSrcDispenseLineID = value;
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
     * 获取mUsedMnyAC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMUsedMnyAC() {
        return mUsedMnyAC;
    }

    /**
     * 设置mUsedMnyAC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMUsedMnyAC(BigDecimal value) {
        this.mUsedMnyAC = value;
    }

    /**
     * 获取mUsedMnyFC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMUsedMnyFC() {
        return mUsedMnyFC;
    }

    /**
     * 设置mUsedMnyFC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMUsedMnyFC(BigDecimal value) {
        this.mUsedMnyFC = value;
    }

    /**
     * 获取mUsedMnyTC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMUsedMnyTC() {
        return mUsedMnyTC;
    }

    /**
     * 设置mUsedMnyTC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMUsedMnyTC(BigDecimal value) {
        this.mUsedMnyTC = value;
    }

    /**
     * 获取mUsedTaxAC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMUsedTaxAC() {
        return mUsedTaxAC;
    }

    /**
     * 设置mUsedTaxAC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMUsedTaxAC(BigDecimal value) {
        this.mUsedTaxAC = value;
    }

    /**
     * 获取mUsedTaxFC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMUsedTaxFC() {
        return mUsedTaxFC;
    }

    /**
     * 设置mUsedTaxFC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMUsedTaxFC(BigDecimal value) {
        this.mUsedTaxFC = value;
    }

    /**
     * 获取mUsedTaxTC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMUsedTaxTC() {
        return mUsedTaxTC;
    }

    /**
     * 设置mUsedTaxTC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMUsedTaxTC(BigDecimal value) {
        this.mUsedTaxTC = value;
    }

}
