
package icreateshipsv.org.ufida.entitydata;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * &lt;p&gt;UFIDA.U9.CBO.SCM.PropertyTypes.LotInfoData complex type�� Java �ࡣ
 * 
 * &lt;p&gt;����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="UFIDA.U9.CBO.SCM.PropertyTypes.LotInfoData"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://www.UFIDA.org/EntityData}UFSoft.UBF.Business.DataTransObjectBase"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="m_disabledDatetime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_lotCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_lotMaster" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.Base.PropertyTypes.BizEntityKeyData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_lotValidDate" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UFIDA.U9.CBO.SCM.PropertyTypes.LotInfoData", propOrder = {
    "mDisabledDatetime",
    "mLotCode",
    "mLotMaster",
    "mLotValidDate"
})
public class UFIDAU9CBOSCMPropertyTypesLotInfoData
    extends UFSoftUBFBusinessDataTransObjectBase
{

    @XmlElement(name = "m_disabledDatetime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mDisabledDatetime;
    @XmlElementRef(name = "m_lotCode", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mLotCode;
    @XmlElementRef(name = "m_lotMaster", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9BasePropertyTypesBizEntityKeyData> mLotMaster;
    @XmlElement(name = "m_lotValidDate")
    protected Integer mLotValidDate;

    /**
     * ��ȡmDisabledDatetime���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMDisabledDatetime() {
        return mDisabledDatetime;
    }

    /**
     * ����mDisabledDatetime���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMDisabledDatetime(XMLGregorianCalendar value) {
        this.mDisabledDatetime = value;
    }

    /**
     * ��ȡmLotCode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMLotCode() {
        return mLotCode;
    }

    /**
     * ����mLotCode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMLotCode(JAXBElement<String> value) {
        this.mLotCode = value;
    }

    /**
     * ��ȡmLotMaster���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9BasePropertyTypesBizEntityKeyData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9BasePropertyTypesBizEntityKeyData> getMLotMaster() {
        return mLotMaster;
    }

    /**
     * ����mLotMaster���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9BasePropertyTypesBizEntityKeyData }{@code >}
     *     
     */
    public void setMLotMaster(JAXBElement<UFIDAU9BasePropertyTypesBizEntityKeyData> value) {
        this.mLotMaster = value;
    }

    /**
     * ��ȡmLotValidDate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMLotValidDate() {
        return mLotValidDate;
    }

    /**
     * ����mLotValidDate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMLotValidDate(Integer value) {
        this.mLotValidDate = value;
    }

}
