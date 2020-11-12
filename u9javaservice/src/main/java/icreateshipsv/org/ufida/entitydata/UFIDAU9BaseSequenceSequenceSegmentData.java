
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
 * &lt;p&gt;UFIDA.U9.Base.Sequence.SequenceSegmentData complex type�� Java �ࡣ
 * 
 * &lt;p&gt;����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="UFIDA.U9.Base.Sequence.SequenceSegmentData"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://www.UFIDA.org/EntityData}UFSoft.UBF.Business.DataTransObjectBase"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="SequenceDef_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_createdBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_createdOn" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_dateFormat" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_iD" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_indexNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isSequenceBy" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isVisible" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_modifiedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_modifiedOn" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_padChar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_padMethod" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_segmentLength" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_segmentType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_segmentValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_separator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_sequenceDef" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.Base.Sequence.SequenceDefData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_sysVersion" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UFIDA.U9.Base.Sequence.SequenceSegmentData", propOrder = {
    "sequenceDefSKey",
    "mCreatedBy",
    "mCreatedOn",
    "mDateFormat",
    "mid",
    "mIndexNumber",
    "mIsSequenceBy",
    "mIsVisible",
    "mModifiedBy",
    "mModifiedOn",
    "mPadChar",
    "mPadMethod",
    "mSegmentLength",
    "mSegmentType",
    "mSegmentValue",
    "mSeparator",
    "mSequenceDef",
    "mSysVersion"
})
public class UFIDAU9BaseSequenceSequenceSegmentData
    extends UFSoftUBFBusinessDataTransObjectBase
{

    @XmlElementRef(name = "SequenceDef_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> sequenceDefSKey;
    @XmlElementRef(name = "m_createdBy", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mCreatedBy;
    @XmlElement(name = "m_createdOn")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mCreatedOn;
    @XmlElement(name = "m_dateFormat")
    protected Integer mDateFormat;
    @XmlElement(name = "m_iD")
    protected Long mid;
    @XmlElement(name = "m_indexNumber")
    protected Integer mIndexNumber;
    @XmlElement(name = "m_isSequenceBy")
    protected Boolean mIsSequenceBy;
    @XmlElement(name = "m_isVisible")
    protected Boolean mIsVisible;
    @XmlElementRef(name = "m_modifiedBy", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mModifiedBy;
    @XmlElement(name = "m_modifiedOn")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mModifiedOn;
    @XmlElementRef(name = "m_padChar", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mPadChar;
    @XmlElement(name = "m_padMethod")
    protected Integer mPadMethod;
    @XmlElement(name = "m_segmentLength")
    protected Integer mSegmentLength;
    @XmlElement(name = "m_segmentType")
    protected Integer mSegmentType;
    @XmlElementRef(name = "m_segmentValue", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mSegmentValue;
    @XmlElementRef(name = "m_separator", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mSeparator;
    @XmlElementRef(name = "m_sequenceDef", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9BaseSequenceSequenceDefData> mSequenceDef;
    @XmlElement(name = "m_sysVersion")
    protected Long mSysVersion;

    /**
     * ��ȡsequenceDefSKey���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getSequenceDefSKey() {
        return sequenceDefSKey;
    }

    /**
     * ����sequenceDefSKey���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setSequenceDefSKey(JAXBElement<EntityKey> value) {
        this.sequenceDefSKey = value;
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
     * ��ȡmDateFormat���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMDateFormat() {
        return mDateFormat;
    }

    /**
     * ����mDateFormat���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMDateFormat(Integer value) {
        this.mDateFormat = value;
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
     * ��ȡmIndexNumber���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMIndexNumber() {
        return mIndexNumber;
    }

    /**
     * ����mIndexNumber���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMIndexNumber(Integer value) {
        this.mIndexNumber = value;
    }

    /**
     * ��ȡmIsSequenceBy���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsSequenceBy() {
        return mIsSequenceBy;
    }

    /**
     * ����mIsSequenceBy���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsSequenceBy(Boolean value) {
        this.mIsSequenceBy = value;
    }

    /**
     * ��ȡmIsVisible���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsVisible() {
        return mIsVisible;
    }

    /**
     * ����mIsVisible���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsVisible(Boolean value) {
        this.mIsVisible = value;
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
     * ��ȡmPadChar���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMPadChar() {
        return mPadChar;
    }

    /**
     * ����mPadChar���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMPadChar(JAXBElement<String> value) {
        this.mPadChar = value;
    }

    /**
     * ��ȡmPadMethod���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMPadMethod() {
        return mPadMethod;
    }

    /**
     * ����mPadMethod���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMPadMethod(Integer value) {
        this.mPadMethod = value;
    }

    /**
     * ��ȡmSegmentLength���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMSegmentLength() {
        return mSegmentLength;
    }

    /**
     * ����mSegmentLength���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMSegmentLength(Integer value) {
        this.mSegmentLength = value;
    }

    /**
     * ��ȡmSegmentType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMSegmentType() {
        return mSegmentType;
    }

    /**
     * ����mSegmentType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMSegmentType(Integer value) {
        this.mSegmentType = value;
    }

    /**
     * ��ȡmSegmentValue���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMSegmentValue() {
        return mSegmentValue;
    }

    /**
     * ����mSegmentValue���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMSegmentValue(JAXBElement<String> value) {
        this.mSegmentValue = value;
    }

    /**
     * ��ȡmSeparator���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMSeparator() {
        return mSeparator;
    }

    /**
     * ����mSeparator���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMSeparator(JAXBElement<String> value) {
        this.mSeparator = value;
    }

    /**
     * ��ȡmSequenceDef���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9BaseSequenceSequenceDefData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9BaseSequenceSequenceDefData> getMSequenceDef() {
        return mSequenceDef;
    }

    /**
     * ����mSequenceDef���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9BaseSequenceSequenceDefData }{@code >}
     *     
     */
    public void setMSequenceDef(JAXBElement<UFIDAU9BaseSequenceSequenceDefData> value) {
        this.mSequenceDef = value;
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

}
