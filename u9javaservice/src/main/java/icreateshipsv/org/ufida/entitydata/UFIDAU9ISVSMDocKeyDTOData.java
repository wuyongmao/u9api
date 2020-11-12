
package icreateshipsv.org.ufida.entitydata;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;UFIDA.U9.ISV.SM.DocKeyDTOData complex type�� Java �ࡣ
 * 
 * &lt;p&gt;����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡmDocID���Ե�ֵ��
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
     * ����mDocID���Ե�ֵ��
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
     * ��ȡmDocNO���Ե�ֵ��
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
     * ����mDocNO���Ե�ֵ��
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
     * ��ȡmItemBarCodeUseDTOs���Ե�ֵ��
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
     * ����mItemBarCodeUseDTOs���Ե�ֵ��
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
