
package icreateshipsv.org.ufida.entitydata;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;UFIDA.U9.ISV.SM.DocKeyDTOData complex type的 Java 类。
 * 
 * &lt;p&gt;以下模式片段指定包含在此类中的预期内容。
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="UFIDA.U9.ISV.SM.DocKeyDTOData"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://www.UFIDA.org/EntityData}UFSoft.UBF.Business.DataTransObjectBase"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="m_docID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_docNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_itemBarCodeUseDTOs" type="{http://www.UFIDA.org/EntityData}ArrayOfUFIDA.U9.BC.CalcData.CreateBarCodeUsedInDTOData" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UFIDA.U9.ISV.SM.DocKeyDTOData", propOrder = {
    "mDocID",
    "mDocNO",
    "mItemBarCodeUseDTOs"
})
public class UFIDAU9ISVSMDocKeyDTOData
    extends UFSoftUBFBusinessDataTransObjectBase
{

    @XmlElement(name = "m_docID")
    protected Long mDocID;
    @XmlElementRef(name = "m_docNO", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mDocNO;
    @XmlElementRef(name = "m_itemBarCodeUseDTOs", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfUFIDAU9BCCalcDataCreateBarCodeUsedInDTOData> mItemBarCodeUseDTOs;

    /**
     * 获取mDocID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMDocID() {
        return mDocID;
    }

    /**
     * 设置mDocID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMDocID(Long value) {
        this.mDocID = value;
    }

    /**
     * 获取mDocNO属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMDocNO() {
        return mDocNO;
    }

    /**
     * 设置mDocNO属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMDocNO(JAXBElement<String> value) {
        this.mDocNO = value;
    }

    /**
     * 获取mItemBarCodeUseDTOs属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUFIDAU9BCCalcDataCreateBarCodeUsedInDTOData }{@code >}
     *     
     */
    public JAXBElement<ArrayOfUFIDAU9BCCalcDataCreateBarCodeUsedInDTOData> getMItemBarCodeUseDTOs() {
        return mItemBarCodeUseDTOs;
    }

    /**
     * 设置mItemBarCodeUseDTOs属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUFIDAU9BCCalcDataCreateBarCodeUsedInDTOData }{@code >}
     *     
     */
    public void setMItemBarCodeUseDTOs(JAXBElement<ArrayOfUFIDAU9BCCalcDataCreateBarCodeUsedInDTOData> value) {
        this.mItemBarCodeUseDTOs = value;
    }

}
