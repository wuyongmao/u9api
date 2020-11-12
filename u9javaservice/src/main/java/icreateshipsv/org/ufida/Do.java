
package icreateshipsv.org.ufida;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import icreateshipsv.org.ufida.entitydata.ArrayOfUFIDAU9ISVSMShipDTOForIndustryChainData;


/**
 * &lt;p&gt;anonymous complex type�� Java �ࡣ
 * 
 * &lt;p&gt;����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="context" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="shipDTOs" type="{http://www.UFIDA.org/EntityData}ArrayOfUFIDA.U9.ISV.SM.ShipDTOForIndustryChainData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="isUpdateBarCode" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "context",
    "shipDTOs",
    "isUpdateBarCode"
})
@XmlRootElement(name = "Do")
public class Do {

    @XmlElementRef(name = "context", namespace = "http://www.UFIDA.org", type = JAXBElement.class, required = false)
    protected JAXBElement<Object> context;
    @XmlElementRef(name = "shipDTOs", namespace = "http://www.UFIDA.org", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfUFIDAU9ISVSMShipDTOForIndustryChainData> shipDTOs;
    protected Boolean isUpdateBarCode;

    /**
     * ��ȡcontext���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Object }{@code >}
     *     
     */
    public JAXBElement<Object> getContext() {
        return context;
    }

    /**
     * ����context���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Object }{@code >}
     *     
     */
    public void setContext(JAXBElement<Object> value) {
        this.context = value;
    }

    /**
     * ��ȡshipDTOs���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUFIDAU9ISVSMShipDTOForIndustryChainData }{@code >}
     *     
     */
    public JAXBElement<ArrayOfUFIDAU9ISVSMShipDTOForIndustryChainData> getShipDTOs() {
        return shipDTOs;
    }

    /**
     * ����shipDTOs���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUFIDAU9ISVSMShipDTOForIndustryChainData }{@code >}
     *     
     */
    public void setShipDTOs(JAXBElement<ArrayOfUFIDAU9ISVSMShipDTOForIndustryChainData> value) {
        this.shipDTOs = value;
    }

    /**
     * ��ȡisUpdateBarCode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsUpdateBarCode() {
        return isUpdateBarCode;
    }

    /**
     * ����isUpdateBarCode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsUpdateBarCode(Boolean value) {
        this.isUpdateBarCode = value;
    }

}
