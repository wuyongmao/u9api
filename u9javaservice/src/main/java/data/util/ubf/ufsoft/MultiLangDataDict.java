
package data.util.ubf.ufsoft;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;MultiLangDataDict complex type�� Java �ࡣ
 * 
 * &lt;p&gt;����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="MultiLangDataDict"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="_langs" type="{UFSoft.UBF.Util.Data}ArrayOfMultiLangData" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MultiLangDataDict", propOrder = {
    "langs"
})
public class MultiLangDataDict {

    @XmlElementRef(name = "_langs", namespace = "UFSoft.UBF.Util.Data", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfMultiLangData> langs;

    /**
     * ��ȡlangs���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfMultiLangData }{@code >}
     *     
     */
    public JAXBElement<ArrayOfMultiLangData> getLangs() {
        return langs;
    }

    /**
     * ����langs���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfMultiLangData }{@code >}
     *     
     */
    public void setLangs(JAXBElement<ArrayOfMultiLangData> value) {
        this.langs = value;
    }

}
