
package org.ufida.entitydata;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import data.util.ubf.ufsoft.MultiLangDataDict;


/**
 * &lt;p&gt;UFIDA.U9.Base.FlexField.DescFlexField.DescFlexSegmentsData complex type�� Java �ࡣ
 * 
 * &lt;p&gt;����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="UFIDA.U9.Base.FlexField.DescFlexField.DescFlexSegmentsData"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://www.UFIDA.org/EntityData}UFSoft.UBF.Business.DataTransObjectBase"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="CombineName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Multi_CombineName" type="{UFSoft.UBF.Util.Data}MultiLangDataDict" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_contextValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_privateDescSeg1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_privateDescSeg10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_privateDescSeg11" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_privateDescSeg12" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_privateDescSeg13" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_privateDescSeg14" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_privateDescSeg15" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_privateDescSeg16" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_privateDescSeg17" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_privateDescSeg18" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_privateDescSeg19" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_privateDescSeg2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_privateDescSeg20" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_privateDescSeg21" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_privateDescSeg22" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_privateDescSeg23" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_privateDescSeg24" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_privateDescSeg25" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_privateDescSeg26" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_privateDescSeg27" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_privateDescSeg28" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_privateDescSeg29" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_privateDescSeg3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_privateDescSeg30" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_privateDescSeg4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_privateDescSeg5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_privateDescSeg6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_privateDescSeg7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_privateDescSeg8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_privateDescSeg9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_pubDescSeg1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_pubDescSeg10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_pubDescSeg11" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_pubDescSeg12" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_pubDescSeg13" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_pubDescSeg14" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_pubDescSeg15" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_pubDescSeg16" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_pubDescSeg17" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_pubDescSeg18" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_pubDescSeg19" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_pubDescSeg2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_pubDescSeg20" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_pubDescSeg21" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_pubDescSeg22" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_pubDescSeg23" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_pubDescSeg24" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_pubDescSeg25" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_pubDescSeg26" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_pubDescSeg27" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_pubDescSeg28" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_pubDescSeg29" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_pubDescSeg3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_pubDescSeg30" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_pubDescSeg31" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_pubDescSeg32" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_pubDescSeg33" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_pubDescSeg34" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_pubDescSeg35" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_pubDescSeg36" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_pubDescSeg37" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_pubDescSeg38" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_pubDescSeg39" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_pubDescSeg4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_pubDescSeg40" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_pubDescSeg41" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_pubDescSeg42" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_pubDescSeg43" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_pubDescSeg44" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_pubDescSeg45" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_pubDescSeg46" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_pubDescSeg47" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_pubDescSeg48" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_pubDescSeg49" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_pubDescSeg5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_pubDescSeg50" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_pubDescSeg6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_pubDescSeg7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_pubDescSeg8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_pubDescSeg9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UFIDA.U9.Base.FlexField.DescFlexField.DescFlexSegmentsData", propOrder = {
    "combineName",
    "multiCombineName",
    "mContextValue",
    "mPrivateDescSeg1",
    "mPrivateDescSeg10",
    "mPrivateDescSeg11",
    "mPrivateDescSeg12",
    "mPrivateDescSeg13",
    "mPrivateDescSeg14",
    "mPrivateDescSeg15",
    "mPrivateDescSeg16",
    "mPrivateDescSeg17",
    "mPrivateDescSeg18",
    "mPrivateDescSeg19",
    "mPrivateDescSeg2",
    "mPrivateDescSeg20",
    "mPrivateDescSeg21",
    "mPrivateDescSeg22",
    "mPrivateDescSeg23",
    "mPrivateDescSeg24",
    "mPrivateDescSeg25",
    "mPrivateDescSeg26",
    "mPrivateDescSeg27",
    "mPrivateDescSeg28",
    "mPrivateDescSeg29",
    "mPrivateDescSeg3",
    "mPrivateDescSeg30",
    "mPrivateDescSeg4",
    "mPrivateDescSeg5",
    "mPrivateDescSeg6",
    "mPrivateDescSeg7",
    "mPrivateDescSeg8",
    "mPrivateDescSeg9",
    "mPubDescSeg1",
    "mPubDescSeg10",
    "mPubDescSeg11",
    "mPubDescSeg12",
    "mPubDescSeg13",
    "mPubDescSeg14",
    "mPubDescSeg15",
    "mPubDescSeg16",
    "mPubDescSeg17",
    "mPubDescSeg18",
    "mPubDescSeg19",
    "mPubDescSeg2",
    "mPubDescSeg20",
    "mPubDescSeg21",
    "mPubDescSeg22",
    "mPubDescSeg23",
    "mPubDescSeg24",
    "mPubDescSeg25",
    "mPubDescSeg26",
    "mPubDescSeg27",
    "mPubDescSeg28",
    "mPubDescSeg29",
    "mPubDescSeg3",
    "mPubDescSeg30",
    "mPubDescSeg31",
    "mPubDescSeg32",
    "mPubDescSeg33",
    "mPubDescSeg34",
    "mPubDescSeg35",
    "mPubDescSeg36",
    "mPubDescSeg37",
    "mPubDescSeg38",
    "mPubDescSeg39",
    "mPubDescSeg4",
    "mPubDescSeg40",
    "mPubDescSeg41",
    "mPubDescSeg42",
    "mPubDescSeg43",
    "mPubDescSeg44",
    "mPubDescSeg45",
    "mPubDescSeg46",
    "mPubDescSeg47",
    "mPubDescSeg48",
    "mPubDescSeg49",
    "mPubDescSeg5",
    "mPubDescSeg50",
    "mPubDescSeg6",
    "mPubDescSeg7",
    "mPubDescSeg8",
    "mPubDescSeg9"
})
public class UFIDAU9BaseFlexFieldDescFlexFieldDescFlexSegmentsData
    extends UFSoftUBFBusinessDataTransObjectBase
{

    @XmlElementRef(name = "CombineName", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> combineName;
    @XmlElementRef(name = "Multi_CombineName", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<MultiLangDataDict> multiCombineName;
    @XmlElementRef(name = "m_contextValue", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mContextValue;
    @XmlElementRef(name = "m_privateDescSeg1", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mPrivateDescSeg1;
    @XmlElementRef(name = "m_privateDescSeg10", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mPrivateDescSeg10;
    @XmlElementRef(name = "m_privateDescSeg11", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mPrivateDescSeg11;
    @XmlElementRef(name = "m_privateDescSeg12", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mPrivateDescSeg12;
    @XmlElementRef(name = "m_privateDescSeg13", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mPrivateDescSeg13;
    @XmlElementRef(name = "m_privateDescSeg14", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mPrivateDescSeg14;
    @XmlElementRef(name = "m_privateDescSeg15", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mPrivateDescSeg15;
    @XmlElementRef(name = "m_privateDescSeg16", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mPrivateDescSeg16;
    @XmlElementRef(name = "m_privateDescSeg17", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mPrivateDescSeg17;
    @XmlElementRef(name = "m_privateDescSeg18", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mPrivateDescSeg18;
    @XmlElementRef(name = "m_privateDescSeg19", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mPrivateDescSeg19;
    @XmlElementRef(name = "m_privateDescSeg2", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mPrivateDescSeg2;
    @XmlElementRef(name = "m_privateDescSeg20", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mPrivateDescSeg20;
    @XmlElementRef(name = "m_privateDescSeg21", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mPrivateDescSeg21;
    @XmlElementRef(name = "m_privateDescSeg22", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mPrivateDescSeg22;
    @XmlElementRef(name = "m_privateDescSeg23", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mPrivateDescSeg23;
    @XmlElementRef(name = "m_privateDescSeg24", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mPrivateDescSeg24;
    @XmlElementRef(name = "m_privateDescSeg25", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mPrivateDescSeg25;
    @XmlElementRef(name = "m_privateDescSeg26", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mPrivateDescSeg26;
    @XmlElementRef(name = "m_privateDescSeg27", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mPrivateDescSeg27;
    @XmlElementRef(name = "m_privateDescSeg28", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mPrivateDescSeg28;
    @XmlElementRef(name = "m_privateDescSeg29", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mPrivateDescSeg29;
    @XmlElementRef(name = "m_privateDescSeg3", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mPrivateDescSeg3;
    @XmlElementRef(name = "m_privateDescSeg30", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mPrivateDescSeg30;
    @XmlElementRef(name = "m_privateDescSeg4", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mPrivateDescSeg4;
    @XmlElementRef(name = "m_privateDescSeg5", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mPrivateDescSeg5;
    @XmlElementRef(name = "m_privateDescSeg6", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mPrivateDescSeg6;
    @XmlElementRef(name = "m_privateDescSeg7", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mPrivateDescSeg7;
    @XmlElementRef(name = "m_privateDescSeg8", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mPrivateDescSeg8;
    @XmlElementRef(name = "m_privateDescSeg9", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mPrivateDescSeg9;
    @XmlElementRef(name = "m_pubDescSeg1", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mPubDescSeg1;
    @XmlElementRef(name = "m_pubDescSeg10", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mPubDescSeg10;
    @XmlElementRef(name = "m_pubDescSeg11", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mPubDescSeg11;
    @XmlElementRef(name = "m_pubDescSeg12", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mPubDescSeg12;
    @XmlElementRef(name = "m_pubDescSeg13", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mPubDescSeg13;
    @XmlElementRef(name = "m_pubDescSeg14", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mPubDescSeg14;
    @XmlElementRef(name = "m_pubDescSeg15", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mPubDescSeg15;
    @XmlElementRef(name = "m_pubDescSeg16", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mPubDescSeg16;
    @XmlElementRef(name = "m_pubDescSeg17", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mPubDescSeg17;
    @XmlElementRef(name = "m_pubDescSeg18", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mPubDescSeg18;
    @XmlElementRef(name = "m_pubDescSeg19", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mPubDescSeg19;
    @XmlElementRef(name = "m_pubDescSeg2", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mPubDescSeg2;
    @XmlElementRef(name = "m_pubDescSeg20", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mPubDescSeg20;
    @XmlElementRef(name = "m_pubDescSeg21", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mPubDescSeg21;
    @XmlElementRef(name = "m_pubDescSeg22", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mPubDescSeg22;
    @XmlElementRef(name = "m_pubDescSeg23", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mPubDescSeg23;
    @XmlElementRef(name = "m_pubDescSeg24", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mPubDescSeg24;
    @XmlElementRef(name = "m_pubDescSeg25", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mPubDescSeg25;
    @XmlElementRef(name = "m_pubDescSeg26", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mPubDescSeg26;
    @XmlElementRef(name = "m_pubDescSeg27", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mPubDescSeg27;
    @XmlElementRef(name = "m_pubDescSeg28", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mPubDescSeg28;
    @XmlElementRef(name = "m_pubDescSeg29", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mPubDescSeg29;
    @XmlElementRef(name = "m_pubDescSeg3", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mPubDescSeg3;
    @XmlElementRef(name = "m_pubDescSeg30", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mPubDescSeg30;
    @XmlElementRef(name = "m_pubDescSeg31", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mPubDescSeg31;
    @XmlElementRef(name = "m_pubDescSeg32", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mPubDescSeg32;
    @XmlElementRef(name = "m_pubDescSeg33", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mPubDescSeg33;
    @XmlElementRef(name = "m_pubDescSeg34", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mPubDescSeg34;
    @XmlElementRef(name = "m_pubDescSeg35", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mPubDescSeg35;
    @XmlElementRef(name = "m_pubDescSeg36", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mPubDescSeg36;
    @XmlElementRef(name = "m_pubDescSeg37", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mPubDescSeg37;
    @XmlElementRef(name = "m_pubDescSeg38", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mPubDescSeg38;
    @XmlElementRef(name = "m_pubDescSeg39", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mPubDescSeg39;
    @XmlElementRef(name = "m_pubDescSeg4", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mPubDescSeg4;
    @XmlElementRef(name = "m_pubDescSeg40", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mPubDescSeg40;
    @XmlElementRef(name = "m_pubDescSeg41", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mPubDescSeg41;
    @XmlElementRef(name = "m_pubDescSeg42", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mPubDescSeg42;
    @XmlElementRef(name = "m_pubDescSeg43", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mPubDescSeg43;
    @XmlElementRef(name = "m_pubDescSeg44", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mPubDescSeg44;
    @XmlElementRef(name = "m_pubDescSeg45", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mPubDescSeg45;
    @XmlElementRef(name = "m_pubDescSeg46", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mPubDescSeg46;
    @XmlElementRef(name = "m_pubDescSeg47", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mPubDescSeg47;
    @XmlElementRef(name = "m_pubDescSeg48", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mPubDescSeg48;
    @XmlElementRef(name = "m_pubDescSeg49", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mPubDescSeg49;
    @XmlElementRef(name = "m_pubDescSeg5", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mPubDescSeg5;
    @XmlElementRef(name = "m_pubDescSeg50", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mPubDescSeg50;
    @XmlElementRef(name = "m_pubDescSeg6", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mPubDescSeg6;
    @XmlElementRef(name = "m_pubDescSeg7", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mPubDescSeg7;
    @XmlElementRef(name = "m_pubDescSeg8", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mPubDescSeg8;
    @XmlElementRef(name = "m_pubDescSeg9", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mPubDescSeg9;

    /**
     * ��ȡcombineName���Ե�ֵ��
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
     * ����combineName���Ե�ֵ��
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
     * ��ȡmultiCombineName���Ե�ֵ��
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
     * ����multiCombineName���Ե�ֵ��
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
     * ��ȡmContextValue���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMContextValue() {
        return mContextValue;
    }

    /**
     * ����mContextValue���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMContextValue(JAXBElement<String> value) {
        this.mContextValue = value;
    }

    /**
     * ��ȡmPrivateDescSeg1���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMPrivateDescSeg1() {
        return mPrivateDescSeg1;
    }

    /**
     * ����mPrivateDescSeg1���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMPrivateDescSeg1(JAXBElement<String> value) {
        this.mPrivateDescSeg1 = value;
    }

    /**
     * ��ȡmPrivateDescSeg10���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMPrivateDescSeg10() {
        return mPrivateDescSeg10;
    }

    /**
     * ����mPrivateDescSeg10���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMPrivateDescSeg10(JAXBElement<String> value) {
        this.mPrivateDescSeg10 = value;
    }

    /**
     * ��ȡmPrivateDescSeg11���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMPrivateDescSeg11() {
        return mPrivateDescSeg11;
    }

    /**
     * ����mPrivateDescSeg11���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMPrivateDescSeg11(JAXBElement<String> value) {
        this.mPrivateDescSeg11 = value;
    }

    /**
     * ��ȡmPrivateDescSeg12���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMPrivateDescSeg12() {
        return mPrivateDescSeg12;
    }

    /**
     * ����mPrivateDescSeg12���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMPrivateDescSeg12(JAXBElement<String> value) {
        this.mPrivateDescSeg12 = value;
    }

    /**
     * ��ȡmPrivateDescSeg13���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMPrivateDescSeg13() {
        return mPrivateDescSeg13;
    }

    /**
     * ����mPrivateDescSeg13���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMPrivateDescSeg13(JAXBElement<String> value) {
        this.mPrivateDescSeg13 = value;
    }

    /**
     * ��ȡmPrivateDescSeg14���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMPrivateDescSeg14() {
        return mPrivateDescSeg14;
    }

    /**
     * ����mPrivateDescSeg14���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMPrivateDescSeg14(JAXBElement<String> value) {
        this.mPrivateDescSeg14 = value;
    }

    /**
     * ��ȡmPrivateDescSeg15���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMPrivateDescSeg15() {
        return mPrivateDescSeg15;
    }

    /**
     * ����mPrivateDescSeg15���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMPrivateDescSeg15(JAXBElement<String> value) {
        this.mPrivateDescSeg15 = value;
    }

    /**
     * ��ȡmPrivateDescSeg16���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMPrivateDescSeg16() {
        return mPrivateDescSeg16;
    }

    /**
     * ����mPrivateDescSeg16���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMPrivateDescSeg16(JAXBElement<String> value) {
        this.mPrivateDescSeg16 = value;
    }

    /**
     * ��ȡmPrivateDescSeg17���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMPrivateDescSeg17() {
        return mPrivateDescSeg17;
    }

    /**
     * ����mPrivateDescSeg17���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMPrivateDescSeg17(JAXBElement<String> value) {
        this.mPrivateDescSeg17 = value;
    }

    /**
     * ��ȡmPrivateDescSeg18���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMPrivateDescSeg18() {
        return mPrivateDescSeg18;
    }

    /**
     * ����mPrivateDescSeg18���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMPrivateDescSeg18(JAXBElement<String> value) {
        this.mPrivateDescSeg18 = value;
    }

    /**
     * ��ȡmPrivateDescSeg19���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMPrivateDescSeg19() {
        return mPrivateDescSeg19;
    }

    /**
     * ����mPrivateDescSeg19���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMPrivateDescSeg19(JAXBElement<String> value) {
        this.mPrivateDescSeg19 = value;
    }

    /**
     * ��ȡmPrivateDescSeg2���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMPrivateDescSeg2() {
        return mPrivateDescSeg2;
    }

    /**
     * ����mPrivateDescSeg2���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMPrivateDescSeg2(JAXBElement<String> value) {
        this.mPrivateDescSeg2 = value;
    }

    /**
     * ��ȡmPrivateDescSeg20���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMPrivateDescSeg20() {
        return mPrivateDescSeg20;
    }

    /**
     * ����mPrivateDescSeg20���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMPrivateDescSeg20(JAXBElement<String> value) {
        this.mPrivateDescSeg20 = value;
    }

    /**
     * ��ȡmPrivateDescSeg21���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMPrivateDescSeg21() {
        return mPrivateDescSeg21;
    }

    /**
     * ����mPrivateDescSeg21���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMPrivateDescSeg21(JAXBElement<String> value) {
        this.mPrivateDescSeg21 = value;
    }

    /**
     * ��ȡmPrivateDescSeg22���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMPrivateDescSeg22() {
        return mPrivateDescSeg22;
    }

    /**
     * ����mPrivateDescSeg22���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMPrivateDescSeg22(JAXBElement<String> value) {
        this.mPrivateDescSeg22 = value;
    }

    /**
     * ��ȡmPrivateDescSeg23���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMPrivateDescSeg23() {
        return mPrivateDescSeg23;
    }

    /**
     * ����mPrivateDescSeg23���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMPrivateDescSeg23(JAXBElement<String> value) {
        this.mPrivateDescSeg23 = value;
    }

    /**
     * ��ȡmPrivateDescSeg24���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMPrivateDescSeg24() {
        return mPrivateDescSeg24;
    }

    /**
     * ����mPrivateDescSeg24���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMPrivateDescSeg24(JAXBElement<String> value) {
        this.mPrivateDescSeg24 = value;
    }

    /**
     * ��ȡmPrivateDescSeg25���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMPrivateDescSeg25() {
        return mPrivateDescSeg25;
    }

    /**
     * ����mPrivateDescSeg25���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMPrivateDescSeg25(JAXBElement<String> value) {
        this.mPrivateDescSeg25 = value;
    }

    /**
     * ��ȡmPrivateDescSeg26���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMPrivateDescSeg26() {
        return mPrivateDescSeg26;
    }

    /**
     * ����mPrivateDescSeg26���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMPrivateDescSeg26(JAXBElement<String> value) {
        this.mPrivateDescSeg26 = value;
    }

    /**
     * ��ȡmPrivateDescSeg27���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMPrivateDescSeg27() {
        return mPrivateDescSeg27;
    }

    /**
     * ����mPrivateDescSeg27���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMPrivateDescSeg27(JAXBElement<String> value) {
        this.mPrivateDescSeg27 = value;
    }

    /**
     * ��ȡmPrivateDescSeg28���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMPrivateDescSeg28() {
        return mPrivateDescSeg28;
    }

    /**
     * ����mPrivateDescSeg28���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMPrivateDescSeg28(JAXBElement<String> value) {
        this.mPrivateDescSeg28 = value;
    }

    /**
     * ��ȡmPrivateDescSeg29���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMPrivateDescSeg29() {
        return mPrivateDescSeg29;
    }

    /**
     * ����mPrivateDescSeg29���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMPrivateDescSeg29(JAXBElement<String> value) {
        this.mPrivateDescSeg29 = value;
    }

    /**
     * ��ȡmPrivateDescSeg3���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMPrivateDescSeg3() {
        return mPrivateDescSeg3;
    }

    /**
     * ����mPrivateDescSeg3���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMPrivateDescSeg3(JAXBElement<String> value) {
        this.mPrivateDescSeg3 = value;
    }

    /**
     * ��ȡmPrivateDescSeg30���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMPrivateDescSeg30() {
        return mPrivateDescSeg30;
    }

    /**
     * ����mPrivateDescSeg30���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMPrivateDescSeg30(JAXBElement<String> value) {
        this.mPrivateDescSeg30 = value;
    }

    /**
     * ��ȡmPrivateDescSeg4���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMPrivateDescSeg4() {
        return mPrivateDescSeg4;
    }

    /**
     * ����mPrivateDescSeg4���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMPrivateDescSeg4(JAXBElement<String> value) {
        this.mPrivateDescSeg4 = value;
    }

    /**
     * ��ȡmPrivateDescSeg5���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMPrivateDescSeg5() {
        return mPrivateDescSeg5;
    }

    /**
     * ����mPrivateDescSeg5���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMPrivateDescSeg5(JAXBElement<String> value) {
        this.mPrivateDescSeg5 = value;
    }

    /**
     * ��ȡmPrivateDescSeg6���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMPrivateDescSeg6() {
        return mPrivateDescSeg6;
    }

    /**
     * ����mPrivateDescSeg6���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMPrivateDescSeg6(JAXBElement<String> value) {
        this.mPrivateDescSeg6 = value;
    }

    /**
     * ��ȡmPrivateDescSeg7���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMPrivateDescSeg7() {
        return mPrivateDescSeg7;
    }

    /**
     * ����mPrivateDescSeg7���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMPrivateDescSeg7(JAXBElement<String> value) {
        this.mPrivateDescSeg7 = value;
    }

    /**
     * ��ȡmPrivateDescSeg8���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMPrivateDescSeg8() {
        return mPrivateDescSeg8;
    }

    /**
     * ����mPrivateDescSeg8���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMPrivateDescSeg8(JAXBElement<String> value) {
        this.mPrivateDescSeg8 = value;
    }

    /**
     * ��ȡmPrivateDescSeg9���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMPrivateDescSeg9() {
        return mPrivateDescSeg9;
    }

    /**
     * ����mPrivateDescSeg9���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMPrivateDescSeg9(JAXBElement<String> value) {
        this.mPrivateDescSeg9 = value;
    }

    /**
     * ��ȡmPubDescSeg1���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMPubDescSeg1() {
        return mPubDescSeg1;
    }

    /**
     * ����mPubDescSeg1���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMPubDescSeg1(JAXBElement<String> value) {
        this.mPubDescSeg1 = value;
    }

    /**
     * ��ȡmPubDescSeg10���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMPubDescSeg10() {
        return mPubDescSeg10;
    }

    /**
     * ����mPubDescSeg10���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMPubDescSeg10(JAXBElement<String> value) {
        this.mPubDescSeg10 = value;
    }

    /**
     * ��ȡmPubDescSeg11���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMPubDescSeg11() {
        return mPubDescSeg11;
    }

    /**
     * ����mPubDescSeg11���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMPubDescSeg11(JAXBElement<String> value) {
        this.mPubDescSeg11 = value;
    }

    /**
     * ��ȡmPubDescSeg12���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMPubDescSeg12() {
        return mPubDescSeg12;
    }

    /**
     * ����mPubDescSeg12���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMPubDescSeg12(JAXBElement<String> value) {
        this.mPubDescSeg12 = value;
    }

    /**
     * ��ȡmPubDescSeg13���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMPubDescSeg13() {
        return mPubDescSeg13;
    }

    /**
     * ����mPubDescSeg13���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMPubDescSeg13(JAXBElement<String> value) {
        this.mPubDescSeg13 = value;
    }

    /**
     * ��ȡmPubDescSeg14���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMPubDescSeg14() {
        return mPubDescSeg14;
    }

    /**
     * ����mPubDescSeg14���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMPubDescSeg14(JAXBElement<String> value) {
        this.mPubDescSeg14 = value;
    }

    /**
     * ��ȡmPubDescSeg15���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMPubDescSeg15() {
        return mPubDescSeg15;
    }

    /**
     * ����mPubDescSeg15���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMPubDescSeg15(JAXBElement<String> value) {
        this.mPubDescSeg15 = value;
    }

    /**
     * ��ȡmPubDescSeg16���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMPubDescSeg16() {
        return mPubDescSeg16;
    }

    /**
     * ����mPubDescSeg16���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMPubDescSeg16(JAXBElement<String> value) {
        this.mPubDescSeg16 = value;
    }

    /**
     * ��ȡmPubDescSeg17���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMPubDescSeg17() {
        return mPubDescSeg17;
    }

    /**
     * ����mPubDescSeg17���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMPubDescSeg17(JAXBElement<String> value) {
        this.mPubDescSeg17 = value;
    }

    /**
     * ��ȡmPubDescSeg18���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMPubDescSeg18() {
        return mPubDescSeg18;
    }

    /**
     * ����mPubDescSeg18���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMPubDescSeg18(JAXBElement<String> value) {
        this.mPubDescSeg18 = value;
    }

    /**
     * ��ȡmPubDescSeg19���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMPubDescSeg19() {
        return mPubDescSeg19;
    }

    /**
     * ����mPubDescSeg19���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMPubDescSeg19(JAXBElement<String> value) {
        this.mPubDescSeg19 = value;
    }

    /**
     * ��ȡmPubDescSeg2���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMPubDescSeg2() {
        return mPubDescSeg2;
    }

    /**
     * ����mPubDescSeg2���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMPubDescSeg2(JAXBElement<String> value) {
        this.mPubDescSeg2 = value;
    }

    /**
     * ��ȡmPubDescSeg20���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMPubDescSeg20() {
        return mPubDescSeg20;
    }

    /**
     * ����mPubDescSeg20���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMPubDescSeg20(JAXBElement<String> value) {
        this.mPubDescSeg20 = value;
    }

    /**
     * ��ȡmPubDescSeg21���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMPubDescSeg21() {
        return mPubDescSeg21;
    }

    /**
     * ����mPubDescSeg21���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMPubDescSeg21(JAXBElement<String> value) {
        this.mPubDescSeg21 = value;
    }

    /**
     * ��ȡmPubDescSeg22���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMPubDescSeg22() {
        return mPubDescSeg22;
    }

    /**
     * ����mPubDescSeg22���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMPubDescSeg22(JAXBElement<String> value) {
        this.mPubDescSeg22 = value;
    }

    /**
     * ��ȡmPubDescSeg23���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMPubDescSeg23() {
        return mPubDescSeg23;
    }

    /**
     * ����mPubDescSeg23���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMPubDescSeg23(JAXBElement<String> value) {
        this.mPubDescSeg23 = value;
    }

    /**
     * ��ȡmPubDescSeg24���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMPubDescSeg24() {
        return mPubDescSeg24;
    }

    /**
     * ����mPubDescSeg24���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMPubDescSeg24(JAXBElement<String> value) {
        this.mPubDescSeg24 = value;
    }

    /**
     * ��ȡmPubDescSeg25���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMPubDescSeg25() {
        return mPubDescSeg25;
    }

    /**
     * ����mPubDescSeg25���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMPubDescSeg25(JAXBElement<String> value) {
        this.mPubDescSeg25 = value;
    }

    /**
     * ��ȡmPubDescSeg26���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMPubDescSeg26() {
        return mPubDescSeg26;
    }

    /**
     * ����mPubDescSeg26���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMPubDescSeg26(JAXBElement<String> value) {
        this.mPubDescSeg26 = value;
    }

    /**
     * ��ȡmPubDescSeg27���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMPubDescSeg27() {
        return mPubDescSeg27;
    }

    /**
     * ����mPubDescSeg27���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMPubDescSeg27(JAXBElement<String> value) {
        this.mPubDescSeg27 = value;
    }

    /**
     * ��ȡmPubDescSeg28���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMPubDescSeg28() {
        return mPubDescSeg28;
    }

    /**
     * ����mPubDescSeg28���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMPubDescSeg28(JAXBElement<String> value) {
        this.mPubDescSeg28 = value;
    }

    /**
     * ��ȡmPubDescSeg29���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMPubDescSeg29() {
        return mPubDescSeg29;
    }

    /**
     * ����mPubDescSeg29���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMPubDescSeg29(JAXBElement<String> value) {
        this.mPubDescSeg29 = value;
    }

    /**
     * ��ȡmPubDescSeg3���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMPubDescSeg3() {
        return mPubDescSeg3;
    }

    /**
     * ����mPubDescSeg3���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMPubDescSeg3(JAXBElement<String> value) {
        this.mPubDescSeg3 = value;
    }

    /**
     * ��ȡmPubDescSeg30���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMPubDescSeg30() {
        return mPubDescSeg30;
    }

    /**
     * ����mPubDescSeg30���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMPubDescSeg30(JAXBElement<String> value) {
        this.mPubDescSeg30 = value;
    }

    /**
     * ��ȡmPubDescSeg31���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMPubDescSeg31() {
        return mPubDescSeg31;
    }

    /**
     * ����mPubDescSeg31���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMPubDescSeg31(JAXBElement<String> value) {
        this.mPubDescSeg31 = value;
    }

    /**
     * ��ȡmPubDescSeg32���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMPubDescSeg32() {
        return mPubDescSeg32;
    }

    /**
     * ����mPubDescSeg32���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMPubDescSeg32(JAXBElement<String> value) {
        this.mPubDescSeg32 = value;
    }

    /**
     * ��ȡmPubDescSeg33���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMPubDescSeg33() {
        return mPubDescSeg33;
    }

    /**
     * ����mPubDescSeg33���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMPubDescSeg33(JAXBElement<String> value) {
        this.mPubDescSeg33 = value;
    }

    /**
     * ��ȡmPubDescSeg34���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMPubDescSeg34() {
        return mPubDescSeg34;
    }

    /**
     * ����mPubDescSeg34���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMPubDescSeg34(JAXBElement<String> value) {
        this.mPubDescSeg34 = value;
    }

    /**
     * ��ȡmPubDescSeg35���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMPubDescSeg35() {
        return mPubDescSeg35;
    }

    /**
     * ����mPubDescSeg35���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMPubDescSeg35(JAXBElement<String> value) {
        this.mPubDescSeg35 = value;
    }

    /**
     * ��ȡmPubDescSeg36���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMPubDescSeg36() {
        return mPubDescSeg36;
    }

    /**
     * ����mPubDescSeg36���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMPubDescSeg36(JAXBElement<String> value) {
        this.mPubDescSeg36 = value;
    }

    /**
     * ��ȡmPubDescSeg37���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMPubDescSeg37() {
        return mPubDescSeg37;
    }

    /**
     * ����mPubDescSeg37���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMPubDescSeg37(JAXBElement<String> value) {
        this.mPubDescSeg37 = value;
    }

    /**
     * ��ȡmPubDescSeg38���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMPubDescSeg38() {
        return mPubDescSeg38;
    }

    /**
     * ����mPubDescSeg38���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMPubDescSeg38(JAXBElement<String> value) {
        this.mPubDescSeg38 = value;
    }

    /**
     * ��ȡmPubDescSeg39���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMPubDescSeg39() {
        return mPubDescSeg39;
    }

    /**
     * ����mPubDescSeg39���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMPubDescSeg39(JAXBElement<String> value) {
        this.mPubDescSeg39 = value;
    }

    /**
     * ��ȡmPubDescSeg4���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMPubDescSeg4() {
        return mPubDescSeg4;
    }

    /**
     * ����mPubDescSeg4���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMPubDescSeg4(JAXBElement<String> value) {
        this.mPubDescSeg4 = value;
    }

    /**
     * ��ȡmPubDescSeg40���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMPubDescSeg40() {
        return mPubDescSeg40;
    }

    /**
     * ����mPubDescSeg40���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMPubDescSeg40(JAXBElement<String> value) {
        this.mPubDescSeg40 = value;
    }

    /**
     * ��ȡmPubDescSeg41���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMPubDescSeg41() {
        return mPubDescSeg41;
    }

    /**
     * ����mPubDescSeg41���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMPubDescSeg41(JAXBElement<String> value) {
        this.mPubDescSeg41 = value;
    }

    /**
     * ��ȡmPubDescSeg42���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMPubDescSeg42() {
        return mPubDescSeg42;
    }

    /**
     * ����mPubDescSeg42���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMPubDescSeg42(JAXBElement<String> value) {
        this.mPubDescSeg42 = value;
    }

    /**
     * ��ȡmPubDescSeg43���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMPubDescSeg43() {
        return mPubDescSeg43;
    }

    /**
     * ����mPubDescSeg43���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMPubDescSeg43(JAXBElement<String> value) {
        this.mPubDescSeg43 = value;
    }

    /**
     * ��ȡmPubDescSeg44���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMPubDescSeg44() {
        return mPubDescSeg44;
    }

    /**
     * ����mPubDescSeg44���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMPubDescSeg44(JAXBElement<String> value) {
        this.mPubDescSeg44 = value;
    }

    /**
     * ��ȡmPubDescSeg45���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMPubDescSeg45() {
        return mPubDescSeg45;
    }

    /**
     * ����mPubDescSeg45���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMPubDescSeg45(JAXBElement<String> value) {
        this.mPubDescSeg45 = value;
    }

    /**
     * ��ȡmPubDescSeg46���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMPubDescSeg46() {
        return mPubDescSeg46;
    }

    /**
     * ����mPubDescSeg46���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMPubDescSeg46(JAXBElement<String> value) {
        this.mPubDescSeg46 = value;
    }

    /**
     * ��ȡmPubDescSeg47���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMPubDescSeg47() {
        return mPubDescSeg47;
    }

    /**
     * ����mPubDescSeg47���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMPubDescSeg47(JAXBElement<String> value) {
        this.mPubDescSeg47 = value;
    }

    /**
     * ��ȡmPubDescSeg48���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMPubDescSeg48() {
        return mPubDescSeg48;
    }

    /**
     * ����mPubDescSeg48���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMPubDescSeg48(JAXBElement<String> value) {
        this.mPubDescSeg48 = value;
    }

    /**
     * ��ȡmPubDescSeg49���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMPubDescSeg49() {
        return mPubDescSeg49;
    }

    /**
     * ����mPubDescSeg49���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMPubDescSeg49(JAXBElement<String> value) {
        this.mPubDescSeg49 = value;
    }

    /**
     * ��ȡmPubDescSeg5���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMPubDescSeg5() {
        return mPubDescSeg5;
    }

    /**
     * ����mPubDescSeg5���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMPubDescSeg5(JAXBElement<String> value) {
        this.mPubDescSeg5 = value;
    }

    /**
     * ��ȡmPubDescSeg50���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMPubDescSeg50() {
        return mPubDescSeg50;
    }

    /**
     * ����mPubDescSeg50���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMPubDescSeg50(JAXBElement<String> value) {
        this.mPubDescSeg50 = value;
    }

    /**
     * ��ȡmPubDescSeg6���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMPubDescSeg6() {
        return mPubDescSeg6;
    }

    /**
     * ����mPubDescSeg6���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMPubDescSeg6(JAXBElement<String> value) {
        this.mPubDescSeg6 = value;
    }

    /**
     * ��ȡmPubDescSeg7���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMPubDescSeg7() {
        return mPubDescSeg7;
    }

    /**
     * ����mPubDescSeg7���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMPubDescSeg7(JAXBElement<String> value) {
        this.mPubDescSeg7 = value;
    }

    /**
     * ��ȡmPubDescSeg8���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMPubDescSeg8() {
        return mPubDescSeg8;
    }

    /**
     * ����mPubDescSeg8���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMPubDescSeg8(JAXBElement<String> value) {
        this.mPubDescSeg8 = value;
    }

    /**
     * ��ȡmPubDescSeg9���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMPubDescSeg9() {
        return mPubDescSeg9;
    }

    /**
     * ����mPubDescSeg9���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMPubDescSeg9(JAXBElement<String> value) {
        this.mPubDescSeg9 = value;
    }

}
