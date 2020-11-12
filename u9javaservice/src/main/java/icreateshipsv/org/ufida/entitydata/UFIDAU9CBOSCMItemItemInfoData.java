
package icreateshipsv.org.ufida.entitydata;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;

import icreateshipsv.businessentity.business.ubf.ufsoft.EntityKey;


/**
 * &lt;p&gt;UFIDA.U9.CBO.SCM.Item.ItemInfoData complex type的 Java 类。
 * 
 * &lt;p&gt;以下模式片段指定包含在此类中的预期内容。
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="UFIDA.U9.CBO.SCM.Item.ItemInfoData"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://www.UFIDA.org/EntityData}UFSoft.UBF.Business.DataTransObjectBase"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="ItemID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ItemID_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ItemOpt1" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ItemOpt10" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ItemOpt10_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ItemOpt1_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ItemOpt2" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ItemOpt2_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ItemOpt3" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ItemOpt3_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ItemOpt4" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ItemOpt4_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ItemOpt5" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ItemOpt5_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ItemOpt6" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ItemOpt6_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ItemOpt7" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ItemOpt7_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ItemOpt8" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ItemOpt8_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ItemOpt9" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ItemOpt9_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_itemCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_itemGrade" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_itemName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_itemPotency" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_itemVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UFIDA.U9.CBO.SCM.Item.ItemInfoData", propOrder = {
    "itemID",
    "itemIDSKey",
    "itemOpt1",
    "itemOpt10",
    "itemOpt10SKey",
    "itemOpt1SKey",
    "itemOpt2",
    "itemOpt2SKey",
    "itemOpt3",
    "itemOpt3SKey",
    "itemOpt4",
    "itemOpt4SKey",
    "itemOpt5",
    "itemOpt5SKey",
    "itemOpt6",
    "itemOpt6SKey",
    "itemOpt7",
    "itemOpt7SKey",
    "itemOpt8",
    "itemOpt8SKey",
    "itemOpt9",
    "itemOpt9SKey",
    "mItemCode",
    "mItemGrade",
    "mItemName",
    "mItemPotency",
    "mItemVersion"
})
public class UFIDAU9CBOSCMItemItemInfoData
    extends UFSoftUBFBusinessDataTransObjectBase
{

    @XmlElement(name = "ItemID")
    protected Long itemID;
    @XmlElementRef(name = "ItemID_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> itemIDSKey;
    @XmlElement(name = "ItemOpt1")
    protected Long itemOpt1;
    @XmlElement(name = "ItemOpt10")
    protected Long itemOpt10;
    @XmlElementRef(name = "ItemOpt10_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> itemOpt10SKey;
    @XmlElementRef(name = "ItemOpt1_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> itemOpt1SKey;
    @XmlElement(name = "ItemOpt2")
    protected Long itemOpt2;
    @XmlElementRef(name = "ItemOpt2_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> itemOpt2SKey;
    @XmlElement(name = "ItemOpt3")
    protected Long itemOpt3;
    @XmlElementRef(name = "ItemOpt3_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> itemOpt3SKey;
    @XmlElement(name = "ItemOpt4")
    protected Long itemOpt4;
    @XmlElementRef(name = "ItemOpt4_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> itemOpt4SKey;
    @XmlElement(name = "ItemOpt5")
    protected Long itemOpt5;
    @XmlElementRef(name = "ItemOpt5_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> itemOpt5SKey;
    @XmlElement(name = "ItemOpt6")
    protected Long itemOpt6;
    @XmlElementRef(name = "ItemOpt6_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> itemOpt6SKey;
    @XmlElement(name = "ItemOpt7")
    protected Long itemOpt7;
    @XmlElementRef(name = "ItemOpt7_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> itemOpt7SKey;
    @XmlElement(name = "ItemOpt8")
    protected Long itemOpt8;
    @XmlElementRef(name = "ItemOpt8_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> itemOpt8SKey;
    @XmlElement(name = "ItemOpt9")
    protected Long itemOpt9;
    @XmlElementRef(name = "ItemOpt9_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> itemOpt9SKey;
    @XmlElementRef(name = "m_itemCode", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mItemCode;
    @XmlElement(name = "m_itemGrade")
    protected Integer mItemGrade;
    @XmlElementRef(name = "m_itemName", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mItemName;
    @XmlElement(name = "m_itemPotency")
    protected Integer mItemPotency;
    @XmlElementRef(name = "m_itemVersion", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mItemVersion;

    /**
     * 获取itemID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getItemID() {
        return itemID;
    }

    /**
     * 设置itemID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setItemID(Long value) {
        this.itemID = value;
    }

    /**
     * 获取itemIDSKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getItemIDSKey() {
        return itemIDSKey;
    }

    /**
     * 设置itemIDSKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setItemIDSKey(JAXBElement<EntityKey> value) {
        this.itemIDSKey = value;
    }

    /**
     * 获取itemOpt1属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getItemOpt1() {
        return itemOpt1;
    }

    /**
     * 设置itemOpt1属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setItemOpt1(Long value) {
        this.itemOpt1 = value;
    }

    /**
     * 获取itemOpt10属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getItemOpt10() {
        return itemOpt10;
    }

    /**
     * 设置itemOpt10属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setItemOpt10(Long value) {
        this.itemOpt10 = value;
    }

    /**
     * 获取itemOpt10SKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getItemOpt10SKey() {
        return itemOpt10SKey;
    }

    /**
     * 设置itemOpt10SKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setItemOpt10SKey(JAXBElement<EntityKey> value) {
        this.itemOpt10SKey = value;
    }

    /**
     * 获取itemOpt1SKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getItemOpt1SKey() {
        return itemOpt1SKey;
    }

    /**
     * 设置itemOpt1SKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setItemOpt1SKey(JAXBElement<EntityKey> value) {
        this.itemOpt1SKey = value;
    }

    /**
     * 获取itemOpt2属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getItemOpt2() {
        return itemOpt2;
    }

    /**
     * 设置itemOpt2属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setItemOpt2(Long value) {
        this.itemOpt2 = value;
    }

    /**
     * 获取itemOpt2SKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getItemOpt2SKey() {
        return itemOpt2SKey;
    }

    /**
     * 设置itemOpt2SKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setItemOpt2SKey(JAXBElement<EntityKey> value) {
        this.itemOpt2SKey = value;
    }

    /**
     * 获取itemOpt3属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getItemOpt3() {
        return itemOpt3;
    }

    /**
     * 设置itemOpt3属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setItemOpt3(Long value) {
        this.itemOpt3 = value;
    }

    /**
     * 获取itemOpt3SKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getItemOpt3SKey() {
        return itemOpt3SKey;
    }

    /**
     * 设置itemOpt3SKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setItemOpt3SKey(JAXBElement<EntityKey> value) {
        this.itemOpt3SKey = value;
    }

    /**
     * 获取itemOpt4属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getItemOpt4() {
        return itemOpt4;
    }

    /**
     * 设置itemOpt4属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setItemOpt4(Long value) {
        this.itemOpt4 = value;
    }

    /**
     * 获取itemOpt4SKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getItemOpt4SKey() {
        return itemOpt4SKey;
    }

    /**
     * 设置itemOpt4SKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setItemOpt4SKey(JAXBElement<EntityKey> value) {
        this.itemOpt4SKey = value;
    }

    /**
     * 获取itemOpt5属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getItemOpt5() {
        return itemOpt5;
    }

    /**
     * 设置itemOpt5属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setItemOpt5(Long value) {
        this.itemOpt5 = value;
    }

    /**
     * 获取itemOpt5SKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getItemOpt5SKey() {
        return itemOpt5SKey;
    }

    /**
     * 设置itemOpt5SKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setItemOpt5SKey(JAXBElement<EntityKey> value) {
        this.itemOpt5SKey = value;
    }

    /**
     * 获取itemOpt6属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getItemOpt6() {
        return itemOpt6;
    }

    /**
     * 设置itemOpt6属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setItemOpt6(Long value) {
        this.itemOpt6 = value;
    }

    /**
     * 获取itemOpt6SKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getItemOpt6SKey() {
        return itemOpt6SKey;
    }

    /**
     * 设置itemOpt6SKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setItemOpt6SKey(JAXBElement<EntityKey> value) {
        this.itemOpt6SKey = value;
    }

    /**
     * 获取itemOpt7属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getItemOpt7() {
        return itemOpt7;
    }

    /**
     * 设置itemOpt7属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setItemOpt7(Long value) {
        this.itemOpt7 = value;
    }

    /**
     * 获取itemOpt7SKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getItemOpt7SKey() {
        return itemOpt7SKey;
    }

    /**
     * 设置itemOpt7SKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setItemOpt7SKey(JAXBElement<EntityKey> value) {
        this.itemOpt7SKey = value;
    }

    /**
     * 获取itemOpt8属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getItemOpt8() {
        return itemOpt8;
    }

    /**
     * 设置itemOpt8属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setItemOpt8(Long value) {
        this.itemOpt8 = value;
    }

    /**
     * 获取itemOpt8SKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getItemOpt8SKey() {
        return itemOpt8SKey;
    }

    /**
     * 设置itemOpt8SKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setItemOpt8SKey(JAXBElement<EntityKey> value) {
        this.itemOpt8SKey = value;
    }

    /**
     * 获取itemOpt9属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getItemOpt9() {
        return itemOpt9;
    }

    /**
     * 设置itemOpt9属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setItemOpt9(Long value) {
        this.itemOpt9 = value;
    }

    /**
     * 获取itemOpt9SKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getItemOpt9SKey() {
        return itemOpt9SKey;
    }

    /**
     * 设置itemOpt9SKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setItemOpt9SKey(JAXBElement<EntityKey> value) {
        this.itemOpt9SKey = value;
    }

    /**
     * 获取mItemCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMItemCode() {
        return mItemCode;
    }

    /**
     * 设置mItemCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMItemCode(JAXBElement<String> value) {
        this.mItemCode = value;
    }

    /**
     * 获取mItemGrade属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMItemGrade() {
        return mItemGrade;
    }

    /**
     * 设置mItemGrade属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMItemGrade(Integer value) {
        this.mItemGrade = value;
    }

    /**
     * 获取mItemName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMItemName() {
        return mItemName;
    }

    /**
     * 设置mItemName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMItemName(JAXBElement<String> value) {
        this.mItemName = value;
    }

    /**
     * 获取mItemPotency属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMItemPotency() {
        return mItemPotency;
    }

    /**
     * 设置mItemPotency属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMItemPotency(Integer value) {
        this.mItemPotency = value;
    }

    /**
     * 获取mItemVersion属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMItemVersion() {
        return mItemVersion;
    }

    /**
     * 设置mItemVersion属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMItemVersion(JAXBElement<String> value) {
        this.mItemVersion = value;
    }

}
