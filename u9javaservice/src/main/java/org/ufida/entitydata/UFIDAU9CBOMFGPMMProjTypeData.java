
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
 * &lt;p&gt;UFIDA.U9.CBO.MFG.PMM.ProjTypeData complex type的 Java 类。
 * 
 * &lt;p&gt;以下模式片段指定包含在此类中的预期内容。
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="UFIDA.U9.CBO.MFG.PMM.ProjTypeData"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://www.UFIDA.org/EntityData}UFSoft.UBF.Business.DataTransObjectBase"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="CBS" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="CBS_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="KeyPathUOM" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="KeyPathUOM_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="MasterOrg" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="MasterOrg_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Multi_Name" type="{UFSoft.UBF.Util.Data}MultiLangDataDict" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Org" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Org_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ProjStage" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ProjStage_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="SequenceDef" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="SequenceDef_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="TaskControlType" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="TaskControlType_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="TaskSequenceDef" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="TaskSequenceDef_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_baseLineType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_confirmType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_createdBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_createdOn" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_defaultDepth" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_defaultPlanner" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_descFlexField" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.Base.FlexField.DescFlexField.DescFlexSegmentsData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_estimatePeriodType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_exceptionHandle" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_finalExceptionMode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_iD" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isAccrueable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isAppNeedAgree" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isApprovable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isApprovedModify" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isAutoSchedule" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isDocNoEditable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isEditableByTask" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isInvoiceable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isQuanxian" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isSendMsg" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isTaskDocNoEditable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isTaskManagerRefControl" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isVersionControl" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isWPlan" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_keyPathDelayTime" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_modifiedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_modifiedOn" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_planDimensions" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_progressRptType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_projCategory" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_projDimensionEnum" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_projSrc" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_respondDays" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_scheduleType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_sequenceType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_shortName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_sysVersion" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_taskLevel" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_taskSequenceType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_taskStartSequence" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_taskStepLength" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_wScheduleExceptionMode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UFIDA.U9.CBO.MFG.PMM.ProjTypeData", propOrder = {
    "cbs",
    "cbssKey",
    "keyPathUOM",
    "keyPathUOMSKey",
    "masterOrg",
    "masterOrgSKey",
    "multiName",
    "name",
    "org",
    "orgSKey",
    "projStage",
    "projStageSKey",
    "sequenceDef",
    "sequenceDefSKey",
    "taskControlType",
    "taskControlTypeSKey",
    "taskSequenceDef",
    "taskSequenceDefSKey",
    "mBaseLineType",
    "mCode",
    "mConfirmType",
    "mCreatedBy",
    "mCreatedOn",
    "mDefaultDepth",
    "mDefaultPlanner",
    "mDescFlexField",
    "mDescription",
    "mEstimatePeriodType",
    "mExceptionHandle",
    "mFinalExceptionMode",
    "mid",
    "mIsAccrueable",
    "mIsAppNeedAgree",
    "mIsApprovable",
    "mIsApprovedModify",
    "mIsAutoSchedule",
    "mIsDocNoEditable",
    "mIsEditableByTask",
    "mIsInvoiceable",
    "mIsQuanxian",
    "mIsSendMsg",
    "mIsTaskDocNoEditable",
    "mIsTaskManagerRefControl",
    "mIsVersionControl",
    "mIsWPlan",
    "mKeyPathDelayTime",
    "mModifiedBy",
    "mModifiedOn",
    "mPlanDimensions",
    "mProgressRptType",
    "mProjCategory",
    "mProjDimensionEnum",
    "mProjSrc",
    "mRespondDays",
    "mScheduleType",
    "mSequenceType",
    "mShortName",
    "mSysVersion",
    "mTaskLevel",
    "mTaskSequenceType",
    "mTaskStartSequence",
    "mTaskStepLength",
    "mwScheduleExceptionMode"
})
public class UFIDAU9CBOMFGPMMProjTypeData
    extends UFSoftUBFBusinessDataTransObjectBase
{

    @XmlElement(name = "CBS")
    protected Long cbs;
    @XmlElementRef(name = "CBS_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> cbssKey;
    @XmlElement(name = "KeyPathUOM")
    protected Long keyPathUOM;
    @XmlElementRef(name = "KeyPathUOM_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> keyPathUOMSKey;
    @XmlElement(name = "MasterOrg")
    protected Long masterOrg;
    @XmlElementRef(name = "MasterOrg_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> masterOrgSKey;
    @XmlElementRef(name = "Multi_Name", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<MultiLangDataDict> multiName;
    @XmlElementRef(name = "Name", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> name;
    @XmlElement(name = "Org")
    protected Long org;
    @XmlElementRef(name = "Org_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> orgSKey;
    @XmlElement(name = "ProjStage")
    protected Long projStage;
    @XmlElementRef(name = "ProjStage_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> projStageSKey;
    @XmlElement(name = "SequenceDef")
    protected Long sequenceDef;
    @XmlElementRef(name = "SequenceDef_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> sequenceDefSKey;
    @XmlElement(name = "TaskControlType")
    protected Long taskControlType;
    @XmlElementRef(name = "TaskControlType_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> taskControlTypeSKey;
    @XmlElement(name = "TaskSequenceDef")
    protected Long taskSequenceDef;
    @XmlElementRef(name = "TaskSequenceDef_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> taskSequenceDefSKey;
    @XmlElement(name = "m_baseLineType")
    protected Integer mBaseLineType;
    @XmlElementRef(name = "m_code", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mCode;
    @XmlElement(name = "m_confirmType")
    protected Integer mConfirmType;
    @XmlElementRef(name = "m_createdBy", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mCreatedBy;
    @XmlElement(name = "m_createdOn")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mCreatedOn;
    @XmlElement(name = "m_defaultDepth")
    protected Integer mDefaultDepth;
    @XmlElement(name = "m_defaultPlanner")
    protected Integer mDefaultPlanner;
    @XmlElementRef(name = "m_descFlexField", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9BaseFlexFieldDescFlexFieldDescFlexSegmentsData> mDescFlexField;
    @XmlElementRef(name = "m_description", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mDescription;
    @XmlElement(name = "m_estimatePeriodType")
    protected Integer mEstimatePeriodType;
    @XmlElement(name = "m_exceptionHandle")
    protected Integer mExceptionHandle;
    @XmlElement(name = "m_finalExceptionMode")
    protected Integer mFinalExceptionMode;
    @XmlElement(name = "m_iD")
    protected Long mid;
    @XmlElement(name = "m_isAccrueable")
    protected Boolean mIsAccrueable;
    @XmlElement(name = "m_isAppNeedAgree")
    protected Boolean mIsAppNeedAgree;
    @XmlElement(name = "m_isApprovable")
    protected Boolean mIsApprovable;
    @XmlElement(name = "m_isApprovedModify")
    protected Boolean mIsApprovedModify;
    @XmlElement(name = "m_isAutoSchedule")
    protected Boolean mIsAutoSchedule;
    @XmlElement(name = "m_isDocNoEditable")
    protected Boolean mIsDocNoEditable;
    @XmlElement(name = "m_isEditableByTask")
    protected Boolean mIsEditableByTask;
    @XmlElement(name = "m_isInvoiceable")
    protected Boolean mIsInvoiceable;
    @XmlElement(name = "m_isQuanxian")
    protected Boolean mIsQuanxian;
    @XmlElement(name = "m_isSendMsg")
    protected Boolean mIsSendMsg;
    @XmlElement(name = "m_isTaskDocNoEditable")
    protected Boolean mIsTaskDocNoEditable;
    @XmlElement(name = "m_isTaskManagerRefControl")
    protected Boolean mIsTaskManagerRefControl;
    @XmlElement(name = "m_isVersionControl")
    protected Boolean mIsVersionControl;
    @XmlElement(name = "m_isWPlan")
    protected Boolean mIsWPlan;
    @XmlElement(name = "m_keyPathDelayTime")
    protected Integer mKeyPathDelayTime;
    @XmlElementRef(name = "m_modifiedBy", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mModifiedBy;
    @XmlElement(name = "m_modifiedOn")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mModifiedOn;
    @XmlElement(name = "m_planDimensions")
    protected Integer mPlanDimensions;
    @XmlElement(name = "m_progressRptType")
    protected Integer mProgressRptType;
    @XmlElement(name = "m_projCategory")
    protected Integer mProjCategory;
    @XmlElement(name = "m_projDimensionEnum")
    protected Integer mProjDimensionEnum;
    @XmlElement(name = "m_projSrc")
    protected Integer mProjSrc;
    @XmlElement(name = "m_respondDays")
    protected Integer mRespondDays;
    @XmlElement(name = "m_scheduleType")
    protected Integer mScheduleType;
    @XmlElement(name = "m_sequenceType")
    protected Integer mSequenceType;
    @XmlElementRef(name = "m_shortName", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mShortName;
    @XmlElement(name = "m_sysVersion")
    protected Long mSysVersion;
    @XmlElement(name = "m_taskLevel")
    protected Integer mTaskLevel;
    @XmlElement(name = "m_taskSequenceType")
    protected Integer mTaskSequenceType;
    @XmlElement(name = "m_taskStartSequence")
    protected Integer mTaskStartSequence;
    @XmlElement(name = "m_taskStepLength")
    protected Integer mTaskStepLength;
    @XmlElement(name = "m_wScheduleExceptionMode")
    protected Integer mwScheduleExceptionMode;

    /**
     * 获取cbs属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCBS() {
        return cbs;
    }

    /**
     * 设置cbs属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCBS(Long value) {
        this.cbs = value;
    }

    /**
     * 获取cbssKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getCBSSKey() {
        return cbssKey;
    }

    /**
     * 设置cbssKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setCBSSKey(JAXBElement<EntityKey> value) {
        this.cbssKey = value;
    }

    /**
     * 获取keyPathUOM属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getKeyPathUOM() {
        return keyPathUOM;
    }

    /**
     * 设置keyPathUOM属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setKeyPathUOM(Long value) {
        this.keyPathUOM = value;
    }

    /**
     * 获取keyPathUOMSKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getKeyPathUOMSKey() {
        return keyPathUOMSKey;
    }

    /**
     * 设置keyPathUOMSKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setKeyPathUOMSKey(JAXBElement<EntityKey> value) {
        this.keyPathUOMSKey = value;
    }

    /**
     * 获取masterOrg属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMasterOrg() {
        return masterOrg;
    }

    /**
     * 设置masterOrg属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMasterOrg(Long value) {
        this.masterOrg = value;
    }

    /**
     * 获取masterOrgSKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getMasterOrgSKey() {
        return masterOrgSKey;
    }

    /**
     * 设置masterOrgSKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setMasterOrgSKey(JAXBElement<EntityKey> value) {
        this.masterOrgSKey = value;
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
     * 获取org属性的值。
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
     * 设置org属性的值。
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
     * 获取orgSKey属性的值。
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
     * 设置orgSKey属性的值。
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
     * 获取projStage属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getProjStage() {
        return projStage;
    }

    /**
     * 设置projStage属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setProjStage(Long value) {
        this.projStage = value;
    }

    /**
     * 获取projStageSKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getProjStageSKey() {
        return projStageSKey;
    }

    /**
     * 设置projStageSKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setProjStageSKey(JAXBElement<EntityKey> value) {
        this.projStageSKey = value;
    }

    /**
     * 获取sequenceDef属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSequenceDef() {
        return sequenceDef;
    }

    /**
     * 设置sequenceDef属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSequenceDef(Long value) {
        this.sequenceDef = value;
    }

    /**
     * 获取sequenceDefSKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getSequenceDefSKey() {
        return sequenceDefSKey;
    }

    /**
     * 设置sequenceDefSKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setSequenceDefSKey(JAXBElement<EntityKey> value) {
        this.sequenceDefSKey = value;
    }

    /**
     * 获取taskControlType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTaskControlType() {
        return taskControlType;
    }

    /**
     * 设置taskControlType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTaskControlType(Long value) {
        this.taskControlType = value;
    }

    /**
     * 获取taskControlTypeSKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getTaskControlTypeSKey() {
        return taskControlTypeSKey;
    }

    /**
     * 设置taskControlTypeSKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setTaskControlTypeSKey(JAXBElement<EntityKey> value) {
        this.taskControlTypeSKey = value;
    }

    /**
     * 获取taskSequenceDef属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTaskSequenceDef() {
        return taskSequenceDef;
    }

    /**
     * 设置taskSequenceDef属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTaskSequenceDef(Long value) {
        this.taskSequenceDef = value;
    }

    /**
     * 获取taskSequenceDefSKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getTaskSequenceDefSKey() {
        return taskSequenceDefSKey;
    }

    /**
     * 设置taskSequenceDefSKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setTaskSequenceDefSKey(JAXBElement<EntityKey> value) {
        this.taskSequenceDefSKey = value;
    }

    /**
     * 获取mBaseLineType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMBaseLineType() {
        return mBaseLineType;
    }

    /**
     * 设置mBaseLineType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMBaseLineType(Integer value) {
        this.mBaseLineType = value;
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
     * 获取mConfirmType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMConfirmType() {
        return mConfirmType;
    }

    /**
     * 设置mConfirmType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMConfirmType(Integer value) {
        this.mConfirmType = value;
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
     * 获取mDefaultDepth属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMDefaultDepth() {
        return mDefaultDepth;
    }

    /**
     * 设置mDefaultDepth属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMDefaultDepth(Integer value) {
        this.mDefaultDepth = value;
    }

    /**
     * 获取mDefaultPlanner属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMDefaultPlanner() {
        return mDefaultPlanner;
    }

    /**
     * 设置mDefaultPlanner属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMDefaultPlanner(Integer value) {
        this.mDefaultPlanner = value;
    }

    /**
     * 获取mDescFlexField属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9BaseFlexFieldDescFlexFieldDescFlexSegmentsData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9BaseFlexFieldDescFlexFieldDescFlexSegmentsData> getMDescFlexField() {
        return mDescFlexField;
    }

    /**
     * 设置mDescFlexField属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9BaseFlexFieldDescFlexFieldDescFlexSegmentsData }{@code >}
     *     
     */
    public void setMDescFlexField(JAXBElement<UFIDAU9BaseFlexFieldDescFlexFieldDescFlexSegmentsData> value) {
        this.mDescFlexField = value;
    }

    /**
     * 获取mDescription属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMDescription() {
        return mDescription;
    }

    /**
     * 设置mDescription属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMDescription(JAXBElement<String> value) {
        this.mDescription = value;
    }

    /**
     * 获取mEstimatePeriodType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMEstimatePeriodType() {
        return mEstimatePeriodType;
    }

    /**
     * 设置mEstimatePeriodType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMEstimatePeriodType(Integer value) {
        this.mEstimatePeriodType = value;
    }

    /**
     * 获取mExceptionHandle属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMExceptionHandle() {
        return mExceptionHandle;
    }

    /**
     * 设置mExceptionHandle属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMExceptionHandle(Integer value) {
        this.mExceptionHandle = value;
    }

    /**
     * 获取mFinalExceptionMode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMFinalExceptionMode() {
        return mFinalExceptionMode;
    }

    /**
     * 设置mFinalExceptionMode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMFinalExceptionMode(Integer value) {
        this.mFinalExceptionMode = value;
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
     * 获取mIsAccrueable属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsAccrueable() {
        return mIsAccrueable;
    }

    /**
     * 设置mIsAccrueable属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsAccrueable(Boolean value) {
        this.mIsAccrueable = value;
    }

    /**
     * 获取mIsAppNeedAgree属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsAppNeedAgree() {
        return mIsAppNeedAgree;
    }

    /**
     * 设置mIsAppNeedAgree属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsAppNeedAgree(Boolean value) {
        this.mIsAppNeedAgree = value;
    }

    /**
     * 获取mIsApprovable属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsApprovable() {
        return mIsApprovable;
    }

    /**
     * 设置mIsApprovable属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsApprovable(Boolean value) {
        this.mIsApprovable = value;
    }

    /**
     * 获取mIsApprovedModify属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsApprovedModify() {
        return mIsApprovedModify;
    }

    /**
     * 设置mIsApprovedModify属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsApprovedModify(Boolean value) {
        this.mIsApprovedModify = value;
    }

    /**
     * 获取mIsAutoSchedule属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsAutoSchedule() {
        return mIsAutoSchedule;
    }

    /**
     * 设置mIsAutoSchedule属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsAutoSchedule(Boolean value) {
        this.mIsAutoSchedule = value;
    }

    /**
     * 获取mIsDocNoEditable属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsDocNoEditable() {
        return mIsDocNoEditable;
    }

    /**
     * 设置mIsDocNoEditable属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsDocNoEditable(Boolean value) {
        this.mIsDocNoEditable = value;
    }

    /**
     * 获取mIsEditableByTask属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsEditableByTask() {
        return mIsEditableByTask;
    }

    /**
     * 设置mIsEditableByTask属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsEditableByTask(Boolean value) {
        this.mIsEditableByTask = value;
    }

    /**
     * 获取mIsInvoiceable属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsInvoiceable() {
        return mIsInvoiceable;
    }

    /**
     * 设置mIsInvoiceable属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsInvoiceable(Boolean value) {
        this.mIsInvoiceable = value;
    }

    /**
     * 获取mIsQuanxian属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsQuanxian() {
        return mIsQuanxian;
    }

    /**
     * 设置mIsQuanxian属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsQuanxian(Boolean value) {
        this.mIsQuanxian = value;
    }

    /**
     * 获取mIsSendMsg属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsSendMsg() {
        return mIsSendMsg;
    }

    /**
     * 设置mIsSendMsg属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsSendMsg(Boolean value) {
        this.mIsSendMsg = value;
    }

    /**
     * 获取mIsTaskDocNoEditable属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsTaskDocNoEditable() {
        return mIsTaskDocNoEditable;
    }

    /**
     * 设置mIsTaskDocNoEditable属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsTaskDocNoEditable(Boolean value) {
        this.mIsTaskDocNoEditable = value;
    }

    /**
     * 获取mIsTaskManagerRefControl属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsTaskManagerRefControl() {
        return mIsTaskManagerRefControl;
    }

    /**
     * 设置mIsTaskManagerRefControl属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsTaskManagerRefControl(Boolean value) {
        this.mIsTaskManagerRefControl = value;
    }

    /**
     * 获取mIsVersionControl属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsVersionControl() {
        return mIsVersionControl;
    }

    /**
     * 设置mIsVersionControl属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsVersionControl(Boolean value) {
        this.mIsVersionControl = value;
    }

    /**
     * 获取mIsWPlan属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsWPlan() {
        return mIsWPlan;
    }

    /**
     * 设置mIsWPlan属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsWPlan(Boolean value) {
        this.mIsWPlan = value;
    }

    /**
     * 获取mKeyPathDelayTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMKeyPathDelayTime() {
        return mKeyPathDelayTime;
    }

    /**
     * 设置mKeyPathDelayTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMKeyPathDelayTime(Integer value) {
        this.mKeyPathDelayTime = value;
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
     * 获取mPlanDimensions属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMPlanDimensions() {
        return mPlanDimensions;
    }

    /**
     * 设置mPlanDimensions属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMPlanDimensions(Integer value) {
        this.mPlanDimensions = value;
    }

    /**
     * 获取mProgressRptType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMProgressRptType() {
        return mProgressRptType;
    }

    /**
     * 设置mProgressRptType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMProgressRptType(Integer value) {
        this.mProgressRptType = value;
    }

    /**
     * 获取mProjCategory属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMProjCategory() {
        return mProjCategory;
    }

    /**
     * 设置mProjCategory属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMProjCategory(Integer value) {
        this.mProjCategory = value;
    }

    /**
     * 获取mProjDimensionEnum属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMProjDimensionEnum() {
        return mProjDimensionEnum;
    }

    /**
     * 设置mProjDimensionEnum属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMProjDimensionEnum(Integer value) {
        this.mProjDimensionEnum = value;
    }

    /**
     * 获取mProjSrc属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMProjSrc() {
        return mProjSrc;
    }

    /**
     * 设置mProjSrc属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMProjSrc(Integer value) {
        this.mProjSrc = value;
    }

    /**
     * 获取mRespondDays属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMRespondDays() {
        return mRespondDays;
    }

    /**
     * 设置mRespondDays属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMRespondDays(Integer value) {
        this.mRespondDays = value;
    }

    /**
     * 获取mScheduleType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMScheduleType() {
        return mScheduleType;
    }

    /**
     * 设置mScheduleType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMScheduleType(Integer value) {
        this.mScheduleType = value;
    }

    /**
     * 获取mSequenceType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMSequenceType() {
        return mSequenceType;
    }

    /**
     * 设置mSequenceType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMSequenceType(Integer value) {
        this.mSequenceType = value;
    }

    /**
     * 获取mShortName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMShortName() {
        return mShortName;
    }

    /**
     * 设置mShortName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMShortName(JAXBElement<String> value) {
        this.mShortName = value;
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
     * 获取mTaskLevel属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMTaskLevel() {
        return mTaskLevel;
    }

    /**
     * 设置mTaskLevel属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMTaskLevel(Integer value) {
        this.mTaskLevel = value;
    }

    /**
     * 获取mTaskSequenceType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMTaskSequenceType() {
        return mTaskSequenceType;
    }

    /**
     * 设置mTaskSequenceType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMTaskSequenceType(Integer value) {
        this.mTaskSequenceType = value;
    }

    /**
     * 获取mTaskStartSequence属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMTaskStartSequence() {
        return mTaskStartSequence;
    }

    /**
     * 设置mTaskStartSequence属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMTaskStartSequence(Integer value) {
        this.mTaskStartSequence = value;
    }

    /**
     * 获取mTaskStepLength属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMTaskStepLength() {
        return mTaskStepLength;
    }

    /**
     * 设置mTaskStepLength属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMTaskStepLength(Integer value) {
        this.mTaskStepLength = value;
    }

    /**
     * 获取mwScheduleExceptionMode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMWScheduleExceptionMode() {
        return mwScheduleExceptionMode;
    }

    /**
     * 设置mwScheduleExceptionMode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMWScheduleExceptionMode(Integer value) {
        this.mwScheduleExceptionMode = value;
    }

}
