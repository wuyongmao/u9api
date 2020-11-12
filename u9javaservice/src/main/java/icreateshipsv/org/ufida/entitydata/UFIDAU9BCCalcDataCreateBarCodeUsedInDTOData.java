
package icreateshipsv.org.ufida.entitydata;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;

import icreateshipsv.businessentity.business.ubf.ufsoft.EntityKey;


/**
 * &lt;p&gt;UFIDA.U9.BC.CalcData.CreateBarCodeUsedInDTOData complex type�� Java �ࡣ
 * 
 * &lt;p&gt;����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="UFIDA.U9.BC.CalcData.CreateBarCodeUsedInDTOData"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://www.UFIDA.org/EntityData}UFSoft.UBF.Business.DataTransObjectBase"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="DocOrg" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="DocOrg_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Item" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Item_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="MO" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="MO_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Operation" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Operation_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Org" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Org_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="WareHouse" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="WareHouse_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_barCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_curQty" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_direct" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_doc" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.Base.PropertyTypes.BizEntityKeyData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_docLine" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.Base.PropertyTypes.BizEntityKeyData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_docLineNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_docNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_docSubLineNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isUpdateWh" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_itemCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_itemName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_qCConclusion" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_subLine" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.Base.PropertyTypes.BizEntityKeyData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_usedLineDescFlex" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.Base.FlexField.DescFlexField.DescFlexSegmentsData" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UFIDA.U9.BC.CalcData.CreateBarCodeUsedInDTOData", propOrder = {
    "docOrg",
    "docOrgSKey",
    "item",
    "itemSKey",
    "mo",
    "mosKey",
    "operation",
    "operationSKey",
    "org",
    "orgSKey",
    "wareHouse",
    "wareHouseSKey",
    "mBarCode",
    "mCurQty",
    "mDirect",
    "mDoc",
    "mDocLine",
    "mDocLineNo",
    "mDocNo",
    "mDocSubLineNo",
    "mIsUpdateWh",
    "mItemCode",
    "mItemName",
    "mqcConclusion",
    "mSubLine",
    "mUsedLineDescFlex"
})
public class UFIDAU9BCCalcDataCreateBarCodeUsedInDTOData
    extends UFSoftUBFBusinessDataTransObjectBase
{

    @XmlElement(name = "DocOrg")
    protected Long docOrg;
    @XmlElementRef(name = "DocOrg_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> docOrgSKey;
    @XmlElement(name = "Item")
    protected Long item;
    @XmlElementRef(name = "Item_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> itemSKey;
    @XmlElement(name = "MO")
    protected Long mo;
    @XmlElementRef(name = "MO_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> mosKey;
    @XmlElement(name = "Operation")
    protected Long operation;
    @XmlElementRef(name = "Operation_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> operationSKey;
    @XmlElement(name = "Org")
    protected Long org;
    @XmlElementRef(name = "Org_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> orgSKey;
    @XmlElement(name = "WareHouse")
    protected Long wareHouse;
    @XmlElementRef(name = "WareHouse_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> wareHouseSKey;
    @XmlElementRef(name = "m_barCode", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mBarCode;
    @XmlElement(name = "m_curQty")
    protected BigDecimal mCurQty;
    @XmlElement(name = "m_direct")
    protected Integer mDirect;
    @XmlElementRef(name = "m_doc", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9BasePropertyTypesBizEntityKeyData> mDoc;
    @XmlElementRef(name = "m_docLine", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9BasePropertyTypesBizEntityKeyData> mDocLine;
    @XmlElementRef(name = "m_docLineNo", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mDocLineNo;
    @XmlElementRef(name = "m_docNo", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mDocNo;
    @XmlElementRef(name = "m_docSubLineNo", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mDocSubLineNo;
    @XmlElement(name = "m_isUpdateWh")
    protected Boolean mIsUpdateWh;
    @XmlElementRef(name = "m_itemCode", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mItemCode;
    @XmlElementRef(name = "m_itemName", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mItemName;
    @XmlElement(name = "m_qCConclusion")
    protected Integer mqcConclusion;
    @XmlElementRef(name = "m_subLine", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9BasePropertyTypesBizEntityKeyData> mSubLine;
    @XmlElementRef(name = "m_usedLineDescFlex", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9BaseFlexFieldDescFlexFieldDescFlexSegmentsData> mUsedLineDescFlex;

    /**
     * ��ȡdocOrg���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDocOrg() {
        return docOrg;
    }

    /**
     * ����docOrg���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDocOrg(Long value) {
        this.docOrg = value;
    }

    /**
     * ��ȡdocOrgSKey���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getDocOrgSKey() {
        return docOrgSKey;
    }

    /**
     * ����docOrgSKey���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setDocOrgSKey(JAXBElement<EntityKey> value) {
        this.docOrgSKey = value;
    }

    /**
     * ��ȡitem���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getItem() {
        return item;
    }

    /**
     * ����item���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setItem(Long value) {
        this.item = value;
    }

    /**
     * ��ȡitemSKey���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getItemSKey() {
        return itemSKey;
    }

    /**
     * ����itemSKey���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setItemSKey(JAXBElement<EntityKey> value) {
        this.itemSKey = value;
    }

    /**
     * ��ȡmo���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMO() {
        return mo;
    }

    /**
     * ����mo���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMO(Long value) {
        this.mo = value;
    }

    /**
     * ��ȡmosKey���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getMOSKey() {
        return mosKey;
    }

    /**
     * ����mosKey���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setMOSKey(JAXBElement<EntityKey> value) {
        this.mosKey = value;
    }

    /**
     * ��ȡoperation���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOperation() {
        return operation;
    }

    /**
     * ����operation���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOperation(Long value) {
        this.operation = value;
    }

    /**
     * ��ȡoperationSKey���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getOperationSKey() {
        return operationSKey;
    }

    /**
     * ����operationSKey���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setOperationSKey(JAXBElement<EntityKey> value) {
        this.operationSKey = value;
    }

    /**
     * ��ȡorg���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOrg() {
        return org;
    }

    /**
     * ����org���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOrg(Long value) {
        this.org = value;
    }

    /**
     * ��ȡorgSKey���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getOrgSKey() {
        return orgSKey;
    }

    /**
     * ����orgSKey���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setOrgSKey(JAXBElement<EntityKey> value) {
        this.orgSKey = value;
    }

    /**
     * ��ȡwareHouse���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getWareHouse() {
        return wareHouse;
    }

    /**
     * ����wareHouse���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setWareHouse(Long value) {
        this.wareHouse = value;
    }

    /**
     * ��ȡwareHouseSKey���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getWareHouseSKey() {
        return wareHouseSKey;
    }

    /**
     * ����wareHouseSKey���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setWareHouseSKey(JAXBElement<EntityKey> value) {
        this.wareHouseSKey = value;
    }

    /**
     * ��ȡmBarCode���Ե�ֵ��
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
     * ����mBarCode���Ե�ֵ��
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
     * ��ȡmCurQty���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMCurQty() {
        return mCurQty;
    }

    /**
     * ����mCurQty���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMCurQty(BigDecimal value) {
        this.mCurQty = value;
    }

    /**
     * ��ȡmDirect���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMDirect() {
        return mDirect;
    }

    /**
     * ����mDirect���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMDirect(Integer value) {
        this.mDirect = value;
    }

    /**
     * ��ȡmDoc���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9BasePropertyTypesBizEntityKeyData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9BasePropertyTypesBizEntityKeyData> getMDoc() {
        return mDoc;
    }

    /**
     * ����mDoc���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9BasePropertyTypesBizEntityKeyData }{@code >}
     *     
     */
    public void setMDoc(JAXBElement<UFIDAU9BasePropertyTypesBizEntityKeyData> value) {
        this.mDoc = value;
    }

    /**
     * ��ȡmDocLine���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9BasePropertyTypesBizEntityKeyData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9BasePropertyTypesBizEntityKeyData> getMDocLine() {
        return mDocLine;
    }

    /**
     * ����mDocLine���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9BasePropertyTypesBizEntityKeyData }{@code >}
     *     
     */
    public void setMDocLine(JAXBElement<UFIDAU9BasePropertyTypesBizEntityKeyData> value) {
        this.mDocLine = value;
    }

    /**
     * ��ȡmDocLineNo���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMDocLineNo() {
        return mDocLineNo;
    }

    /**
     * ����mDocLineNo���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMDocLineNo(JAXBElement<String> value) {
        this.mDocLineNo = value;
    }

    /**
     * ��ȡmDocNo���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMDocNo() {
        return mDocNo;
    }

    /**
     * ����mDocNo���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMDocNo(JAXBElement<String> value) {
        this.mDocNo = value;
    }

    /**
     * ��ȡmDocSubLineNo���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMDocSubLineNo() {
        return mDocSubLineNo;
    }

    /**
     * ����mDocSubLineNo���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMDocSubLineNo(JAXBElement<String> value) {
        this.mDocSubLineNo = value;
    }

    /**
     * ��ȡmIsUpdateWh���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsUpdateWh() {
        return mIsUpdateWh;
    }

    /**
     * ����mIsUpdateWh���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsUpdateWh(Boolean value) {
        this.mIsUpdateWh = value;
    }

    /**
     * ��ȡmItemCode���Ե�ֵ��
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
     * ����mItemCode���Ե�ֵ��
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
     * ��ȡmItemName���Ե�ֵ��
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
     * ����mItemName���Ե�ֵ��
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
     * ��ȡmqcConclusion���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMQCConclusion() {
        return mqcConclusion;
    }

    /**
     * ����mqcConclusion���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMQCConclusion(Integer value) {
        this.mqcConclusion = value;
    }

    /**
     * ��ȡmSubLine���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9BasePropertyTypesBizEntityKeyData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9BasePropertyTypesBizEntityKeyData> getMSubLine() {
        return mSubLine;
    }

    /**
     * ����mSubLine���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9BasePropertyTypesBizEntityKeyData }{@code >}
     *     
     */
    public void setMSubLine(JAXBElement<UFIDAU9BasePropertyTypesBizEntityKeyData> value) {
        this.mSubLine = value;
    }

    /**
     * ��ȡmUsedLineDescFlex���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9BaseFlexFieldDescFlexFieldDescFlexSegmentsData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9BaseFlexFieldDescFlexFieldDescFlexSegmentsData> getMUsedLineDescFlex() {
        return mUsedLineDescFlex;
    }

    /**
     * ����mUsedLineDescFlex���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9BaseFlexFieldDescFlexFieldDescFlexSegmentsData }{@code >}
     *     
     */
    public void setMUsedLineDescFlex(JAXBElement<UFIDAU9BaseFlexFieldDescFlexFieldDescFlexSegmentsData> value) {
        this.mUsedLineDescFlex = value;
    }

}
