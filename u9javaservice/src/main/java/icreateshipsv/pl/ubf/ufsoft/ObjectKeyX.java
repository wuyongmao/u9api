
package icreateshipsv.pl.ubf.ufsoft;

import icreateshipsv.businessentity.business.ubf.ufsoft.EntityKey;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;


/**
 * &lt;p&gt;ObjectKeyX complex type�� Java �ࡣ
 * 
 * &lt;p&gt;����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="ObjectKeyX"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="EntityType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ObjectKeyX", propOrder = {
    "entityType",
    "id"
})
@XmlSeeAlso({
    EntityKey.class
})
public class ObjectKeyX {

    @XmlElementRef(name = "EntityType", namespace = "UFSoft.UBF.PL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> entityType;
    @XmlElement(name = "ID")
    protected Long id;

    /**
     * ��ȡentityType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEntityType() {
        return entityType;
    }

    /**
     * ����entityType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEntityType(JAXBElement<String> value) {
        this.entityType = value;
    }

    /**
     * ��ȡid���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getID() {
        return id;
    }

    /**
     * ����id���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setID(Long value) {
        this.id = value;
    }

}
