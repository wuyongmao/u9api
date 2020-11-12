
package icreateshipsv.org.ufida.entitydata;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;UFIDA.U9.ISV.SM.ItemBarCodeDTOData complex type的 Java 类。
 * 
 * &lt;p&gt;以下模式片段指定包含在此类中的预期内容。
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="UFIDA.U9.ISV.SM.ItemBarCodeDTOData"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://www.UFIDA.org/EntityData}UFSoft.UBF.Business.DataTransObjectBase"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="m_barCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_qty" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_shipLineDTOForIndustryChain" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.ISV.SM.ShipLineDTOForIndustryChainData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_shipLineLocationDTOForIndustryChain" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.ISV.SM.ShipLineLocationDTOForIndustryChainData" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UFIDA.U9.ISV.SM.ItemBarCodeDTOData", propOrder = {
    "mBarCode",
    "mQty",
    "mShipLineDTOForIndustryChain",
    "mShipLineLocationDTOForIndustryChain"
})
public class UFIDAU9ISVSMItemBarCodeDTOData
    extends UFSoftUBFBusinessDataTransObjectBase
{

    @XmlElementRef(name = "m_barCode", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mBarCode;
    @XmlElement(name = "m_qty")
    protected BigDecimal mQty;
    @XmlElementRef(name = "m_shipLineDTOForIndustryChain", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9ISVSMShipLineDTOForIndustryChainData> mShipLineDTOForIndustryChain;
    @XmlElementRef(name = "m_shipLineLocationDTOForIndustryChain", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9ISVSMShipLineLocationDTOForIndustryChainData> mShipLineLocationDTOForIndustryChain;

    /**
     * 获取mBarCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMBarCode() {
        return mBarCode;
    }

    /**
     * 设置mBarCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMBarCode(JAXBElement<String> value) {
        this.mBarCode = value;
    }

    /**
     * 获取mQty属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMQty() {
        return mQty;
    }

    /**
     * 设置mQty属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMQty(BigDecimal value) {
        this.mQty = value;
    }

    /**
     * 获取mShipLineDTOForIndustryChain属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9ISVSMShipLineDTOForIndustryChainData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9ISVSMShipLineDTOForIndustryChainData> getMShipLineDTOForIndustryChain() {
        return mShipLineDTOForIndustryChain;
    }

    /**
     * 设置mShipLineDTOForIndustryChain属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9ISVSMShipLineDTOForIndustryChainData }{@code >}
     *     
     */
    public void setMShipLineDTOForIndustryChain(JAXBElement<UFIDAU9ISVSMShipLineDTOForIndustryChainData> value) {
        this.mShipLineDTOForIndustryChain = value;
    }

    /**
     * 获取mShipLineLocationDTOForIndustryChain属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9ISVSMShipLineLocationDTOForIndustryChainData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9ISVSMShipLineLocationDTOForIndustryChainData> getMShipLineLocationDTOForIndustryChain() {
        return mShipLineLocationDTOForIndustryChain;
    }

    /**
     * 设置mShipLineLocationDTOForIndustryChain属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9ISVSMShipLineLocationDTOForIndustryChainData }{@code >}
     *     
     */
    public void setMShipLineLocationDTOForIndustryChain(JAXBElement<UFIDAU9ISVSMShipLineLocationDTOForIndustryChainData> value) {
        this.mShipLineLocationDTOForIndustryChain = value;
    }

}
