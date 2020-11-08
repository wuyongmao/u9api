
package org.ufida.entitydata;

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
 * &lt;p&gt;UFIDA.U9.Lot.LotMasterInfoData complex type�� Java �ࡣ
 * 
 * &lt;p&gt;����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="UFIDA.U9.Lot.LotMasterInfoData"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://www.UFIDA.org/EntityData}UFSoft.UBF.Business.DataTransObjectBase"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="LotMaster" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="LotMaster_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_disabledDatetime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_lotCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
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
@XmlType(name = "UFIDA.U9.Lot.LotMasterInfoData", propOrder = {
    "lotMaster",
    "lotMasterSKey",
    "mDisabledDatetime",
    "mLotCode",
    "mLotValidDate"
})
public class UFIDAU9LotLotMasterInfoData
    extends UFSoftUBFBusinessDataTransObjectBase
{

    @XmlElement(name = "LotMaster")
    protected Long lotMaster;
    @XmlElementRef(name = "LotMaster_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> lotMasterSKey;
    @XmlElement(name = "m_disabledDatetime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mDisabledDatetime;
    @XmlElementRef(name = "m_lotCode", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mLotCode;
    @XmlElement(name = "m_lotValidDate")
    protected Integer mLotValidDate;

    /**
     * ��ȡlotMaster���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getLotMaster() {
        return lotMaster;
    }

    /**
     * ����lotMaster���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setLotMaster(Long value) {
        this.lotMaster = value;
    }

    /**
     * ��ȡlotMasterSKey���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getLotMasterSKey() {
        return lotMasterSKey;
    }

    /**
     * ����lotMasterSKey���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setLotMasterSKey(JAXBElement<EntityKey> value) {
        this.lotMasterSKey = value;
    }

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
