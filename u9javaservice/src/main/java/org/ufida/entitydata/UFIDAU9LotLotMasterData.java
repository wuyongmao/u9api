
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
import data.util.ubf.ufsoft.MultiLangDataDict;


/**
 * &lt;p&gt;UFIDA.U9.Lot.LotMasterData complex type的 Java 类。
 * 
 * &lt;p&gt;以下模式片段指定包含在此类中的预期内容。
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="UFIDA.U9.Lot.LotMasterData"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://www.UFIDA.org/EntityData}UFSoft.UBF.Business.DataTransObjectBase"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="AliasName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="CombineName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Customer" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Customer_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="DataOwnerOrg" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="DataOwnerOrg_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="DocOwnerOrg" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="DocOwnerOrg_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Item" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ItemOwnerOrg" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ItemOwnerOrg_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Item_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="KeyFlexFieldStru" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="KeyFlexFieldStru_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="LotCodingRule" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="LotCodingRule_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Multi_AliasName" type="{UFSoft.UBF.Util.Data}MultiLangDataDict" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Multi_CombineName" type="{UFSoft.UBF.Util.Data}MultiLangDataDict" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Multi_Description" type="{UFSoft.UBF.Util.Data}MultiLangDataDict" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Multi_Name" type="{UFSoft.UBF.Util.Data}MultiLangDataDict" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Supplier" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Supplier_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="UsingOrg" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="UsingOrg_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Warehouse" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Warehouse_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_createdBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_createdOn" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_currAction" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_descFlexSegments" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.Base.FlexField.DescFlexField.DescFlexSegmentsData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_docLine" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.Base.PropertyTypes.BizEntityKeyData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_docLineNo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_docNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_docSubLine" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.Base.PropertyTypes.BizEntityKeyData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_docSubLineNo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_docType" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.Base.PropertyTypes.BizEntityKeyData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_docVersion" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_document" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.Base.PropertyTypes.BizEntityKeyData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_effectiveDatetime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_firstInStock" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_firstUseTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_iD" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_invalidTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isUsed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_itemCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_itemName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_itemVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_lotCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_mOOperation" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.Base.PropertyTypes.BizEntityKeyData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_mOOperationNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_modifiedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_modifiedOn" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_oriLotCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_segment1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_segment10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_segment11" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_segment12" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_segment13" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_segment14" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_segment15" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_segment16" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_segment17" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_segment18" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_segment19" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_segment2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_segment20" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_segment21" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_segment22" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_segment23" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_segment24" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_segment25" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_segment26" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_segment27" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_segment28" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_segment29" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_segment3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_segment30" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_segment4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_segment5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_segment6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_segment7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_segment8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_segment9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_sysVersion" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_validDate" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UFIDA.U9.Lot.LotMasterData", propOrder = {
    "aliasName",
    "combineName",
    "customer",
    "customerSKey",
    "dataOwnerOrg",
    "dataOwnerOrgSKey",
    "description",
    "docOwnerOrg",
    "docOwnerOrgSKey",
    "item",
    "itemOwnerOrg",
    "itemOwnerOrgSKey",
    "itemSKey",
    "keyFlexFieldStru",
    "keyFlexFieldStruSKey",
    "lotCodingRule",
    "lotCodingRuleSKey",
    "multiAliasName",
    "multiCombineName",
    "multiDescription",
    "multiName",
    "name",
    "supplier",
    "supplierSKey",
    "usingOrg",
    "usingOrgSKey",
    "warehouse",
    "warehouseSKey",
    "mCode",
    "mCreatedBy",
    "mCreatedOn",
    "mCurrAction",
    "mDescFlexSegments",
    "mDocLine",
    "mDocLineNo",
    "mDocNo",
    "mDocSubLine",
    "mDocSubLineNo",
    "mDocType",
    "mDocVersion",
    "mDocument",
    "mEffectiveDatetime",
    "mFirstInStock",
    "mFirstUseTime",
    "mid",
    "mInvalidTime",
    "mIsUsed",
    "mItemCode",
    "mItemName",
    "mItemVersion",
    "mLotCode",
    "mmoOperation",
    "mmoOperationNum",
    "mModifiedBy",
    "mModifiedOn",
    "mOriLotCode",
    "mSegment1",
    "mSegment10",
    "mSegment11",
    "mSegment12",
    "mSegment13",
    "mSegment14",
    "mSegment15",
    "mSegment16",
    "mSegment17",
    "mSegment18",
    "mSegment19",
    "mSegment2",
    "mSegment20",
    "mSegment21",
    "mSegment22",
    "mSegment23",
    "mSegment24",
    "mSegment25",
    "mSegment26",
    "mSegment27",
    "mSegment28",
    "mSegment29",
    "mSegment3",
    "mSegment30",
    "mSegment4",
    "mSegment5",
    "mSegment6",
    "mSegment7",
    "mSegment8",
    "mSegment9",
    "mSysVersion",
    "mValidDate"
})
public class UFIDAU9LotLotMasterData
    extends UFSoftUBFBusinessDataTransObjectBase
{

    @XmlElementRef(name = "AliasName", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> aliasName;
    @XmlElementRef(name = "CombineName", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> combineName;
    @XmlElement(name = "Customer")
    protected Long customer;
    @XmlElementRef(name = "Customer_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> customerSKey;
    @XmlElement(name = "DataOwnerOrg")
    protected Long dataOwnerOrg;
    @XmlElementRef(name = "DataOwnerOrg_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> dataOwnerOrgSKey;
    @XmlElementRef(name = "Description", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> description;
    @XmlElement(name = "DocOwnerOrg")
    protected Long docOwnerOrg;
    @XmlElementRef(name = "DocOwnerOrg_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> docOwnerOrgSKey;
    @XmlElement(name = "Item")
    protected Long item;
    @XmlElement(name = "ItemOwnerOrg")
    protected Long itemOwnerOrg;
    @XmlElementRef(name = "ItemOwnerOrg_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> itemOwnerOrgSKey;
    @XmlElementRef(name = "Item_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> itemSKey;
    @XmlElement(name = "KeyFlexFieldStru")
    protected Long keyFlexFieldStru;
    @XmlElementRef(name = "KeyFlexFieldStru_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> keyFlexFieldStruSKey;
    @XmlElement(name = "LotCodingRule")
    protected Long lotCodingRule;
    @XmlElementRef(name = "LotCodingRule_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> lotCodingRuleSKey;
    @XmlElementRef(name = "Multi_AliasName", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<MultiLangDataDict> multiAliasName;
    @XmlElementRef(name = "Multi_CombineName", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<MultiLangDataDict> multiCombineName;
    @XmlElementRef(name = "Multi_Description", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<MultiLangDataDict> multiDescription;
    @XmlElementRef(name = "Multi_Name", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<MultiLangDataDict> multiName;
    @XmlElementRef(name = "Name", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> name;
    @XmlElement(name = "Supplier")
    protected Long supplier;
    @XmlElementRef(name = "Supplier_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> supplierSKey;
    @XmlElement(name = "UsingOrg")
    protected Long usingOrg;
    @XmlElementRef(name = "UsingOrg_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> usingOrgSKey;
    @XmlElement(name = "Warehouse")
    protected Long warehouse;
    @XmlElementRef(name = "Warehouse_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> warehouseSKey;
    @XmlElementRef(name = "m_code", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mCode;
    @XmlElementRef(name = "m_createdBy", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mCreatedBy;
    @XmlElement(name = "m_createdOn")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mCreatedOn;
    @XmlElement(name = "m_currAction")
    protected Integer mCurrAction;
    @XmlElementRef(name = "m_descFlexSegments", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9BaseFlexFieldDescFlexFieldDescFlexSegmentsData> mDescFlexSegments;
    @XmlElementRef(name = "m_docLine", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9BasePropertyTypesBizEntityKeyData> mDocLine;
    @XmlElement(name = "m_docLineNo")
    protected Integer mDocLineNo;
    @XmlElementRef(name = "m_docNo", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mDocNo;
    @XmlElementRef(name = "m_docSubLine", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9BasePropertyTypesBizEntityKeyData> mDocSubLine;
    @XmlElement(name = "m_docSubLineNo")
    protected Integer mDocSubLineNo;
    @XmlElementRef(name = "m_docType", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9BasePropertyTypesBizEntityKeyData> mDocType;
    @XmlElement(name = "m_docVersion")
    protected Integer mDocVersion;
    @XmlElementRef(name = "m_document", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9BasePropertyTypesBizEntityKeyData> mDocument;
    @XmlElement(name = "m_effectiveDatetime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mEffectiveDatetime;
    @XmlElement(name = "m_firstInStock")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mFirstInStock;
    @XmlElement(name = "m_firstUseTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mFirstUseTime;
    @XmlElement(name = "m_iD")
    protected Long mid;
    @XmlElement(name = "m_invalidTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mInvalidTime;
    @XmlElement(name = "m_isUsed")
    protected Boolean mIsUsed;
    @XmlElementRef(name = "m_itemCode", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mItemCode;
    @XmlElementRef(name = "m_itemName", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mItemName;
    @XmlElementRef(name = "m_itemVersion", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mItemVersion;
    @XmlElementRef(name = "m_lotCode", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mLotCode;
    @XmlElementRef(name = "m_mOOperation", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9BasePropertyTypesBizEntityKeyData> mmoOperation;
    @XmlElementRef(name = "m_mOOperationNum", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mmoOperationNum;
    @XmlElementRef(name = "m_modifiedBy", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mModifiedBy;
    @XmlElement(name = "m_modifiedOn")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mModifiedOn;
    @XmlElementRef(name = "m_oriLotCode", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mOriLotCode;
    @XmlElementRef(name = "m_segment1", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mSegment1;
    @XmlElementRef(name = "m_segment10", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mSegment10;
    @XmlElementRef(name = "m_segment11", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mSegment11;
    @XmlElementRef(name = "m_segment12", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mSegment12;
    @XmlElementRef(name = "m_segment13", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mSegment13;
    @XmlElementRef(name = "m_segment14", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mSegment14;
    @XmlElementRef(name = "m_segment15", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mSegment15;
    @XmlElementRef(name = "m_segment16", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mSegment16;
    @XmlElementRef(name = "m_segment17", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mSegment17;
    @XmlElementRef(name = "m_segment18", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mSegment18;
    @XmlElementRef(name = "m_segment19", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mSegment19;
    @XmlElementRef(name = "m_segment2", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mSegment2;
    @XmlElementRef(name = "m_segment20", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mSegment20;
    @XmlElementRef(name = "m_segment21", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mSegment21;
    @XmlElementRef(name = "m_segment22", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mSegment22;
    @XmlElementRef(name = "m_segment23", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mSegment23;
    @XmlElementRef(name = "m_segment24", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mSegment24;
    @XmlElementRef(name = "m_segment25", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mSegment25;
    @XmlElementRef(name = "m_segment26", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mSegment26;
    @XmlElementRef(name = "m_segment27", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mSegment27;
    @XmlElementRef(name = "m_segment28", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mSegment28;
    @XmlElementRef(name = "m_segment29", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mSegment29;
    @XmlElementRef(name = "m_segment3", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mSegment3;
    @XmlElementRef(name = "m_segment30", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mSegment30;
    @XmlElementRef(name = "m_segment4", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mSegment4;
    @XmlElementRef(name = "m_segment5", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mSegment5;
    @XmlElementRef(name = "m_segment6", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mSegment6;
    @XmlElementRef(name = "m_segment7", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mSegment7;
    @XmlElementRef(name = "m_segment8", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mSegment8;
    @XmlElementRef(name = "m_segment9", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mSegment9;
    @XmlElement(name = "m_sysVersion")
    protected Long mSysVersion;
    @XmlElement(name = "m_validDate")
    protected Integer mValidDate;

    /**
     * 获取aliasName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAliasName() {
        return aliasName;
    }

    /**
     * 设置aliasName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAliasName(JAXBElement<String> value) {
        this.aliasName = value;
    }

    /**
     * 获取combineName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCombineName() {
        return combineName;
    }

    /**
     * 设置combineName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCombineName(JAXBElement<String> value) {
        this.combineName = value;
    }

    /**
     * 获取customer属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCustomer() {
        return customer;
    }

    /**
     * 设置customer属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCustomer(Long value) {
        this.customer = value;
    }

    /**
     * 获取customerSKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getCustomerSKey() {
        return customerSKey;
    }

    /**
     * 设置customerSKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setCustomerSKey(JAXBElement<EntityKey> value) {
        this.customerSKey = value;
    }

    /**
     * 获取dataOwnerOrg属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDataOwnerOrg() {
        return dataOwnerOrg;
    }

    /**
     * 设置dataOwnerOrg属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDataOwnerOrg(Long value) {
        this.dataOwnerOrg = value;
    }

    /**
     * 获取dataOwnerOrgSKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getDataOwnerOrgSKey() {
        return dataOwnerOrgSKey;
    }

    /**
     * 设置dataOwnerOrgSKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setDataOwnerOrgSKey(JAXBElement<EntityKey> value) {
        this.dataOwnerOrgSKey = value;
    }

    /**
     * 获取description属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDescription() {
        return description;
    }

    /**
     * 设置description属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDescription(JAXBElement<String> value) {
        this.description = value;
    }

    /**
     * 获取docOwnerOrg属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDocOwnerOrg() {
        return docOwnerOrg;
    }

    /**
     * 设置docOwnerOrg属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDocOwnerOrg(Long value) {
        this.docOwnerOrg = value;
    }

    /**
     * 获取docOwnerOrgSKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getDocOwnerOrgSKey() {
        return docOwnerOrgSKey;
    }

    /**
     * 设置docOwnerOrgSKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setDocOwnerOrgSKey(JAXBElement<EntityKey> value) {
        this.docOwnerOrgSKey = value;
    }

    /**
     * 获取item属性的值。
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
     * 设置item属性的值。
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
     * 获取itemOwnerOrg属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getItemOwnerOrg() {
        return itemOwnerOrg;
    }

    /**
     * 设置itemOwnerOrg属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setItemOwnerOrg(Long value) {
        this.itemOwnerOrg = value;
    }

    /**
     * 获取itemOwnerOrgSKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getItemOwnerOrgSKey() {
        return itemOwnerOrgSKey;
    }

    /**
     * 设置itemOwnerOrgSKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setItemOwnerOrgSKey(JAXBElement<EntityKey> value) {
        this.itemOwnerOrgSKey = value;
    }

    /**
     * 获取itemSKey属性的值。
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
     * 设置itemSKey属性的值。
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
     * 获取keyFlexFieldStru属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getKeyFlexFieldStru() {
        return keyFlexFieldStru;
    }

    /**
     * 设置keyFlexFieldStru属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setKeyFlexFieldStru(Long value) {
        this.keyFlexFieldStru = value;
    }

    /**
     * 获取keyFlexFieldStruSKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getKeyFlexFieldStruSKey() {
        return keyFlexFieldStruSKey;
    }

    /**
     * 设置keyFlexFieldStruSKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setKeyFlexFieldStruSKey(JAXBElement<EntityKey> value) {
        this.keyFlexFieldStruSKey = value;
    }

    /**
     * 获取lotCodingRule属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getLotCodingRule() {
        return lotCodingRule;
    }

    /**
     * 设置lotCodingRule属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setLotCodingRule(Long value) {
        this.lotCodingRule = value;
    }

    /**
     * 获取lotCodingRuleSKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getLotCodingRuleSKey() {
        return lotCodingRuleSKey;
    }

    /**
     * 设置lotCodingRuleSKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setLotCodingRuleSKey(JAXBElement<EntityKey> value) {
        this.lotCodingRuleSKey = value;
    }

    /**
     * 获取multiAliasName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MultiLangDataDict }{@code >}
     *     
     */
    public JAXBElement<MultiLangDataDict> getMultiAliasName() {
        return multiAliasName;
    }

    /**
     * 设置multiAliasName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MultiLangDataDict }{@code >}
     *     
     */
    public void setMultiAliasName(JAXBElement<MultiLangDataDict> value) {
        this.multiAliasName = value;
    }

    /**
     * 获取multiCombineName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MultiLangDataDict }{@code >}
     *     
     */
    public JAXBElement<MultiLangDataDict> getMultiCombineName() {
        return multiCombineName;
    }

    /**
     * 设置multiCombineName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MultiLangDataDict }{@code >}
     *     
     */
    public void setMultiCombineName(JAXBElement<MultiLangDataDict> value) {
        this.multiCombineName = value;
    }

    /**
     * 获取multiDescription属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MultiLangDataDict }{@code >}
     *     
     */
    public JAXBElement<MultiLangDataDict> getMultiDescription() {
        return multiDescription;
    }

    /**
     * 设置multiDescription属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MultiLangDataDict }{@code >}
     *     
     */
    public void setMultiDescription(JAXBElement<MultiLangDataDict> value) {
        this.multiDescription = value;
    }

    /**
     * 获取multiName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MultiLangDataDict }{@code >}
     *     
     */
    public JAXBElement<MultiLangDataDict> getMultiName() {
        return multiName;
    }

    /**
     * 设置multiName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MultiLangDataDict }{@code >}
     *     
     */
    public void setMultiName(JAXBElement<MultiLangDataDict> value) {
        this.multiName = value;
    }

    /**
     * 获取name属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getName() {
        return name;
    }

    /**
     * 设置name属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setName(JAXBElement<String> value) {
        this.name = value;
    }

    /**
     * 获取supplier属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSupplier() {
        return supplier;
    }

    /**
     * 设置supplier属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSupplier(Long value) {
        this.supplier = value;
    }

    /**
     * 获取supplierSKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getSupplierSKey() {
        return supplierSKey;
    }

    /**
     * 设置supplierSKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setSupplierSKey(JAXBElement<EntityKey> value) {
        this.supplierSKey = value;
    }

    /**
     * 获取usingOrg属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getUsingOrg() {
        return usingOrg;
    }

    /**
     * 设置usingOrg属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setUsingOrg(Long value) {
        this.usingOrg = value;
    }

    /**
     * 获取usingOrgSKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getUsingOrgSKey() {
        return usingOrgSKey;
    }

    /**
     * 设置usingOrgSKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setUsingOrgSKey(JAXBElement<EntityKey> value) {
        this.usingOrgSKey = value;
    }

    /**
     * 获取warehouse属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getWarehouse() {
        return warehouse;
    }

    /**
     * 设置warehouse属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setWarehouse(Long value) {
        this.warehouse = value;
    }

    /**
     * 获取warehouseSKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getWarehouseSKey() {
        return warehouseSKey;
    }

    /**
     * 设置warehouseSKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setWarehouseSKey(JAXBElement<EntityKey> value) {
        this.warehouseSKey = value;
    }

    /**
     * 获取mCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMCode() {
        return mCode;
    }

    /**
     * 设置mCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMCode(JAXBElement<String> value) {
        this.mCode = value;
    }

    /**
     * 获取mCreatedBy属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMCreatedBy() {
        return mCreatedBy;
    }

    /**
     * 设置mCreatedBy属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMCreatedBy(JAXBElement<String> value) {
        this.mCreatedBy = value;
    }

    /**
     * 获取mCreatedOn属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMCreatedOn() {
        return mCreatedOn;
    }

    /**
     * 设置mCreatedOn属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMCreatedOn(XMLGregorianCalendar value) {
        this.mCreatedOn = value;
    }

    /**
     * 获取mCurrAction属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMCurrAction() {
        return mCurrAction;
    }

    /**
     * 设置mCurrAction属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMCurrAction(Integer value) {
        this.mCurrAction = value;
    }

    /**
     * 获取mDescFlexSegments属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9BaseFlexFieldDescFlexFieldDescFlexSegmentsData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9BaseFlexFieldDescFlexFieldDescFlexSegmentsData> getMDescFlexSegments() {
        return mDescFlexSegments;
    }

    /**
     * 设置mDescFlexSegments属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9BaseFlexFieldDescFlexFieldDescFlexSegmentsData }{@code >}
     *     
     */
    public void setMDescFlexSegments(JAXBElement<UFIDAU9BaseFlexFieldDescFlexFieldDescFlexSegmentsData> value) {
        this.mDescFlexSegments = value;
    }

    /**
     * 获取mDocLine属性的值。
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
     * 设置mDocLine属性的值。
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
     * 获取mDocLineNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMDocLineNo() {
        return mDocLineNo;
    }

    /**
     * 设置mDocLineNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMDocLineNo(Integer value) {
        this.mDocLineNo = value;
    }

    /**
     * 获取mDocNo属性的值。
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
     * 设置mDocNo属性的值。
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
     * 获取mDocSubLine属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9BasePropertyTypesBizEntityKeyData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9BasePropertyTypesBizEntityKeyData> getMDocSubLine() {
        return mDocSubLine;
    }

    /**
     * 设置mDocSubLine属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9BasePropertyTypesBizEntityKeyData }{@code >}
     *     
     */
    public void setMDocSubLine(JAXBElement<UFIDAU9BasePropertyTypesBizEntityKeyData> value) {
        this.mDocSubLine = value;
    }

    /**
     * 获取mDocSubLineNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMDocSubLineNo() {
        return mDocSubLineNo;
    }

    /**
     * 设置mDocSubLineNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMDocSubLineNo(Integer value) {
        this.mDocSubLineNo = value;
    }

    /**
     * 获取mDocType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9BasePropertyTypesBizEntityKeyData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9BasePropertyTypesBizEntityKeyData> getMDocType() {
        return mDocType;
    }

    /**
     * 设置mDocType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9BasePropertyTypesBizEntityKeyData }{@code >}
     *     
     */
    public void setMDocType(JAXBElement<UFIDAU9BasePropertyTypesBizEntityKeyData> value) {
        this.mDocType = value;
    }

    /**
     * 获取mDocVersion属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMDocVersion() {
        return mDocVersion;
    }

    /**
     * 设置mDocVersion属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMDocVersion(Integer value) {
        this.mDocVersion = value;
    }

    /**
     * 获取mDocument属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9BasePropertyTypesBizEntityKeyData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9BasePropertyTypesBizEntityKeyData> getMDocument() {
        return mDocument;
    }

    /**
     * 设置mDocument属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9BasePropertyTypesBizEntityKeyData }{@code >}
     *     
     */
    public void setMDocument(JAXBElement<UFIDAU9BasePropertyTypesBizEntityKeyData> value) {
        this.mDocument = value;
    }

    /**
     * 获取mEffectiveDatetime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMEffectiveDatetime() {
        return mEffectiveDatetime;
    }

    /**
     * 设置mEffectiveDatetime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMEffectiveDatetime(XMLGregorianCalendar value) {
        this.mEffectiveDatetime = value;
    }

    /**
     * 获取mFirstInStock属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMFirstInStock() {
        return mFirstInStock;
    }

    /**
     * 设置mFirstInStock属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMFirstInStock(XMLGregorianCalendar value) {
        this.mFirstInStock = value;
    }

    /**
     * 获取mFirstUseTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMFirstUseTime() {
        return mFirstUseTime;
    }

    /**
     * 设置mFirstUseTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMFirstUseTime(XMLGregorianCalendar value) {
        this.mFirstUseTime = value;
    }

    /**
     * 获取mid属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMID() {
        return mid;
    }

    /**
     * 设置mid属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMID(Long value) {
        this.mid = value;
    }

    /**
     * 获取mInvalidTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMInvalidTime() {
        return mInvalidTime;
    }

    /**
     * 设置mInvalidTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMInvalidTime(XMLGregorianCalendar value) {
        this.mInvalidTime = value;
    }

    /**
     * 获取mIsUsed属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsUsed() {
        return mIsUsed;
    }

    /**
     * 设置mIsUsed属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsUsed(Boolean value) {
        this.mIsUsed = value;
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

    /**
     * 获取mLotCode属性的值。
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
     * 设置mLotCode属性的值。
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
     * 获取mmoOperation属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9BasePropertyTypesBizEntityKeyData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9BasePropertyTypesBizEntityKeyData> getMMOOperation() {
        return mmoOperation;
    }

    /**
     * 设置mmoOperation属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9BasePropertyTypesBizEntityKeyData }{@code >}
     *     
     */
    public void setMMOOperation(JAXBElement<UFIDAU9BasePropertyTypesBizEntityKeyData> value) {
        this.mmoOperation = value;
    }

    /**
     * 获取mmoOperationNum属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMMOOperationNum() {
        return mmoOperationNum;
    }

    /**
     * 设置mmoOperationNum属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMMOOperationNum(JAXBElement<String> value) {
        this.mmoOperationNum = value;
    }

    /**
     * 获取mModifiedBy属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMModifiedBy() {
        return mModifiedBy;
    }

    /**
     * 设置mModifiedBy属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMModifiedBy(JAXBElement<String> value) {
        this.mModifiedBy = value;
    }

    /**
     * 获取mModifiedOn属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMModifiedOn() {
        return mModifiedOn;
    }

    /**
     * 设置mModifiedOn属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMModifiedOn(XMLGregorianCalendar value) {
        this.mModifiedOn = value;
    }

    /**
     * 获取mOriLotCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMOriLotCode() {
        return mOriLotCode;
    }

    /**
     * 设置mOriLotCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMOriLotCode(JAXBElement<String> value) {
        this.mOriLotCode = value;
    }

    /**
     * 获取mSegment1属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMSegment1() {
        return mSegment1;
    }

    /**
     * 设置mSegment1属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMSegment1(JAXBElement<String> value) {
        this.mSegment1 = value;
    }

    /**
     * 获取mSegment10属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMSegment10() {
        return mSegment10;
    }

    /**
     * 设置mSegment10属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMSegment10(JAXBElement<String> value) {
        this.mSegment10 = value;
    }

    /**
     * 获取mSegment11属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMSegment11() {
        return mSegment11;
    }

    /**
     * 设置mSegment11属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMSegment11(JAXBElement<String> value) {
        this.mSegment11 = value;
    }

    /**
     * 获取mSegment12属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMSegment12() {
        return mSegment12;
    }

    /**
     * 设置mSegment12属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMSegment12(JAXBElement<String> value) {
        this.mSegment12 = value;
    }

    /**
     * 获取mSegment13属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMSegment13() {
        return mSegment13;
    }

    /**
     * 设置mSegment13属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMSegment13(JAXBElement<String> value) {
        this.mSegment13 = value;
    }

    /**
     * 获取mSegment14属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMSegment14() {
        return mSegment14;
    }

    /**
     * 设置mSegment14属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMSegment14(JAXBElement<String> value) {
        this.mSegment14 = value;
    }

    /**
     * 获取mSegment15属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMSegment15() {
        return mSegment15;
    }

    /**
     * 设置mSegment15属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMSegment15(JAXBElement<String> value) {
        this.mSegment15 = value;
    }

    /**
     * 获取mSegment16属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMSegment16() {
        return mSegment16;
    }

    /**
     * 设置mSegment16属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMSegment16(JAXBElement<String> value) {
        this.mSegment16 = value;
    }

    /**
     * 获取mSegment17属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMSegment17() {
        return mSegment17;
    }

    /**
     * 设置mSegment17属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMSegment17(JAXBElement<String> value) {
        this.mSegment17 = value;
    }

    /**
     * 获取mSegment18属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMSegment18() {
        return mSegment18;
    }

    /**
     * 设置mSegment18属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMSegment18(JAXBElement<String> value) {
        this.mSegment18 = value;
    }

    /**
     * 获取mSegment19属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMSegment19() {
        return mSegment19;
    }

    /**
     * 设置mSegment19属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMSegment19(JAXBElement<String> value) {
        this.mSegment19 = value;
    }

    /**
     * 获取mSegment2属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMSegment2() {
        return mSegment2;
    }

    /**
     * 设置mSegment2属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMSegment2(JAXBElement<String> value) {
        this.mSegment2 = value;
    }

    /**
     * 获取mSegment20属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMSegment20() {
        return mSegment20;
    }

    /**
     * 设置mSegment20属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMSegment20(JAXBElement<String> value) {
        this.mSegment20 = value;
    }

    /**
     * 获取mSegment21属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMSegment21() {
        return mSegment21;
    }

    /**
     * 设置mSegment21属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMSegment21(JAXBElement<String> value) {
        this.mSegment21 = value;
    }

    /**
     * 获取mSegment22属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMSegment22() {
        return mSegment22;
    }

    /**
     * 设置mSegment22属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMSegment22(JAXBElement<String> value) {
        this.mSegment22 = value;
    }

    /**
     * 获取mSegment23属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMSegment23() {
        return mSegment23;
    }

    /**
     * 设置mSegment23属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMSegment23(JAXBElement<String> value) {
        this.mSegment23 = value;
    }

    /**
     * 获取mSegment24属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMSegment24() {
        return mSegment24;
    }

    /**
     * 设置mSegment24属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMSegment24(JAXBElement<String> value) {
        this.mSegment24 = value;
    }

    /**
     * 获取mSegment25属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMSegment25() {
        return mSegment25;
    }

    /**
     * 设置mSegment25属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMSegment25(JAXBElement<String> value) {
        this.mSegment25 = value;
    }

    /**
     * 获取mSegment26属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMSegment26() {
        return mSegment26;
    }

    /**
     * 设置mSegment26属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMSegment26(JAXBElement<String> value) {
        this.mSegment26 = value;
    }

    /**
     * 获取mSegment27属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMSegment27() {
        return mSegment27;
    }

    /**
     * 设置mSegment27属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMSegment27(JAXBElement<String> value) {
        this.mSegment27 = value;
    }

    /**
     * 获取mSegment28属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMSegment28() {
        return mSegment28;
    }

    /**
     * 设置mSegment28属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMSegment28(JAXBElement<String> value) {
        this.mSegment28 = value;
    }

    /**
     * 获取mSegment29属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMSegment29() {
        return mSegment29;
    }

    /**
     * 设置mSegment29属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMSegment29(JAXBElement<String> value) {
        this.mSegment29 = value;
    }

    /**
     * 获取mSegment3属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMSegment3() {
        return mSegment3;
    }

    /**
     * 设置mSegment3属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMSegment3(JAXBElement<String> value) {
        this.mSegment3 = value;
    }

    /**
     * 获取mSegment30属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMSegment30() {
        return mSegment30;
    }

    /**
     * 设置mSegment30属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMSegment30(JAXBElement<String> value) {
        this.mSegment30 = value;
    }

    /**
     * 获取mSegment4属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMSegment4() {
        return mSegment4;
    }

    /**
     * 设置mSegment4属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMSegment4(JAXBElement<String> value) {
        this.mSegment4 = value;
    }

    /**
     * 获取mSegment5属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMSegment5() {
        return mSegment5;
    }

    /**
     * 设置mSegment5属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMSegment5(JAXBElement<String> value) {
        this.mSegment5 = value;
    }

    /**
     * 获取mSegment6属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMSegment6() {
        return mSegment6;
    }

    /**
     * 设置mSegment6属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMSegment6(JAXBElement<String> value) {
        this.mSegment6 = value;
    }

    /**
     * 获取mSegment7属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMSegment7() {
        return mSegment7;
    }

    /**
     * 设置mSegment7属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMSegment7(JAXBElement<String> value) {
        this.mSegment7 = value;
    }

    /**
     * 获取mSegment8属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMSegment8() {
        return mSegment8;
    }

    /**
     * 设置mSegment8属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMSegment8(JAXBElement<String> value) {
        this.mSegment8 = value;
    }

    /**
     * 获取mSegment9属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMSegment9() {
        return mSegment9;
    }

    /**
     * 设置mSegment9属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMSegment9(JAXBElement<String> value) {
        this.mSegment9 = value;
    }

    /**
     * 获取mSysVersion属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMSysVersion() {
        return mSysVersion;
    }

    /**
     * 设置mSysVersion属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMSysVersion(Long value) {
        this.mSysVersion = value;
    }

    /**
     * 获取mValidDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMValidDate() {
        return mValidDate;
    }

    /**
     * 设置mValidDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMValidDate(Integer value) {
        this.mValidDate = value;
    }

}
