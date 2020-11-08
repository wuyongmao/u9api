
package exceptions.ubf.ufsoft;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.ufsoft_ubf.MessageBaseFormatState;


/**
 * &lt;p&gt;MessageBase complex type�� Java �ࡣ
 * 
 * &lt;p&gt;����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="MessageBase"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="attributeMetadataID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="attributeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="entityFullName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="entityID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="entityMetadataID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="errorLevel" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="formated" type="{http://schemas.datacontract.org/2004/07/UFSoft.UBF.Exceptions}MessageBase.FormatState" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="innerMessages" type="{UFSoft.UBF.Exceptions}ArrayOfMessageBase" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="isValidEntityID" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="localMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="orginalEntityFullName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MessageBase", propOrder = {
    "attributeMetadataID",
    "attributeName",
    "entityFullName",
    "entityID",
    "entityMetadataID",
    "errorLevel",
    "formated",
    "innerMessages",
    "isValidEntityID",
    "localMessage",
    "orginalEntityFullName"
})
public class MessageBase {

    @XmlElementRef(name = "attributeMetadataID", namespace = "UFSoft.UBF.Exceptions", type = JAXBElement.class, required = false)
    protected JAXBElement<String> attributeMetadataID;
    @XmlElementRef(name = "attributeName", namespace = "UFSoft.UBF.Exceptions", type = JAXBElement.class, required = false)
    protected JAXBElement<String> attributeName;
    @XmlElementRef(name = "entityFullName", namespace = "UFSoft.UBF.Exceptions", type = JAXBElement.class, required = false)
    protected JAXBElement<String> entityFullName;
    protected Long entityID;
    @XmlElementRef(name = "entityMetadataID", namespace = "UFSoft.UBF.Exceptions", type = JAXBElement.class, required = false)
    protected JAXBElement<String> entityMetadataID;
    protected Short errorLevel;
    @XmlSchemaType(name = "string")
    protected MessageBaseFormatState formated;
    @XmlElementRef(name = "innerMessages", namespace = "UFSoft.UBF.Exceptions", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfMessageBase> innerMessages;
    protected Boolean isValidEntityID;
    @XmlElementRef(name = "localMessage", namespace = "UFSoft.UBF.Exceptions", type = JAXBElement.class, required = false)
    protected JAXBElement<String> localMessage;
    @XmlElementRef(name = "orginalEntityFullName", namespace = "UFSoft.UBF.Exceptions", type = JAXBElement.class, required = false)
    protected JAXBElement<String> orginalEntityFullName;

    /**
     * ��ȡattributeMetadataID���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAttributeMetadataID() {
        return attributeMetadataID;
    }

    /**
     * ����attributeMetadataID���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAttributeMetadataID(JAXBElement<String> value) {
        this.attributeMetadataID = value;
    }

    /**
     * ��ȡattributeName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAttributeName() {
        return attributeName;
    }

    /**
     * ����attributeName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAttributeName(JAXBElement<String> value) {
        this.attributeName = value;
    }

    /**
     * ��ȡentityFullName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEntityFullName() {
        return entityFullName;
    }

    /**
     * ����entityFullName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEntityFullName(JAXBElement<String> value) {
        this.entityFullName = value;
    }

    /**
     * ��ȡentityID���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getEntityID() {
        return entityID;
    }

    /**
     * ����entityID���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setEntityID(Long value) {
        this.entityID = value;
    }

    /**
     * ��ȡentityMetadataID���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEntityMetadataID() {
        return entityMetadataID;
    }

    /**
     * ����entityMetadataID���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEntityMetadataID(JAXBElement<String> value) {
        this.entityMetadataID = value;
    }

    /**
     * ��ȡerrorLevel���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getErrorLevel() {
        return errorLevel;
    }

    /**
     * ����errorLevel���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setErrorLevel(Short value) {
        this.errorLevel = value;
    }

    /**
     * ��ȡformated���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link MessageBaseFormatState }
     *     
     */
    public MessageBaseFormatState getFormated() {
        return formated;
    }

    /**
     * ����formated���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link MessageBaseFormatState }
     *     
     */
    public void setFormated(MessageBaseFormatState value) {
        this.formated = value;
    }

    /**
     * ��ȡinnerMessages���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfMessageBase }{@code >}
     *     
     */
    public JAXBElement<ArrayOfMessageBase> getInnerMessages() {
        return innerMessages;
    }

    /**
     * ����innerMessages���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfMessageBase }{@code >}
     *     
     */
    public void setInnerMessages(JAXBElement<ArrayOfMessageBase> value) {
        this.innerMessages = value;
    }

    /**
     * ��ȡisValidEntityID���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsValidEntityID() {
        return isValidEntityID;
    }

    /**
     * ����isValidEntityID���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsValidEntityID(Boolean value) {
        this.isValidEntityID = value;
    }

    /**
     * ��ȡlocalMessage���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLocalMessage() {
        return localMessage;
    }

    /**
     * ����localMessage���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLocalMessage(JAXBElement<String> value) {
        this.localMessage = value;
    }

    /**
     * ��ȡorginalEntityFullName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrginalEntityFullName() {
        return orginalEntityFullName;
    }

    /**
     * ����orginalEntityFullName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrginalEntityFullName(JAXBElement<String> value) {
        this.orginalEntityFullName = value;
    }

}
