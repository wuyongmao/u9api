
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
 * &lt;p&gt;UFIDA.U9.CBO.MFG.PMM.ProjTypeData complex type�� Java �ࡣ
 * 
 * &lt;p&gt;����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡcbs���Ե�ֵ��
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
     * ����cbs���Ե�ֵ��
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
     * ��ȡcbssKey���Ե�ֵ��
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
     * ����cbssKey���Ե�ֵ��
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
     * ��ȡkeyPathUOM���Ե�ֵ��
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
     * ����keyPathUOM���Ե�ֵ��
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
     * ��ȡkeyPathUOMSKey���Ե�ֵ��
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
     * ����keyPathUOMSKey���Ե�ֵ��
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
     * ��ȡmasterOrg���Ե�ֵ��
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
     * ����masterOrg���Ե�ֵ��
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
     * ��ȡmasterOrgSKey���Ե�ֵ��
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
     * ����masterOrgSKey���Ե�ֵ��
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
     * ��ȡmultiName���Ե�ֵ��
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
     * ����multiName���Ե�ֵ��
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
     * ��ȡname���Ե�ֵ��
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
     * ����name���Ե�ֵ��
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
     * ��ȡprojStage���Ե�ֵ��
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
     * ����projStage���Ե�ֵ��
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
     * ��ȡprojStageSKey���Ե�ֵ��
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
     * ����projStageSKey���Ե�ֵ��
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
     * ��ȡsequenceDef���Ե�ֵ��
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
     * ����sequenceDef���Ե�ֵ��
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
     * ��ȡsequenceDefSKey���Ե�ֵ��
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
     * ����sequenceDefSKey���Ե�ֵ��
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
     * ��ȡtaskControlType���Ե�ֵ��
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
     * ����taskControlType���Ե�ֵ��
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
     * ��ȡtaskControlTypeSKey���Ե�ֵ��
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
     * ����taskControlTypeSKey���Ե�ֵ��
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
     * ��ȡtaskSequenceDef���Ե�ֵ��
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
     * ����taskSequenceDef���Ե�ֵ��
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
     * ��ȡtaskSequenceDefSKey���Ե�ֵ��
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
     * ����taskSequenceDefSKey���Ե�ֵ��
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
     * ��ȡmBaseLineType���Ե�ֵ��
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
     * ����mBaseLineType���Ե�ֵ��
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
     * ��ȡmCode���Ե�ֵ��
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
     * ����mCode���Ե�ֵ��
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
     * ��ȡmConfirmType���Ե�ֵ��
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
     * ����mConfirmType���Ե�ֵ��
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
     * ��ȡmCreatedBy���Ե�ֵ��
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
     * ����mCreatedBy���Ե�ֵ��
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
     * ��ȡmCreatedOn���Ե�ֵ��
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
     * ����mCreatedOn���Ե�ֵ��
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
     * ��ȡmDefaultDepth���Ե�ֵ��
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
     * ����mDefaultDepth���Ե�ֵ��
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
     * ��ȡmDefaultPlanner���Ե�ֵ��
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
     * ����mDefaultPlanner���Ե�ֵ��
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
     * ��ȡmDescFlexField���Ե�ֵ��
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
     * ����mDescFlexField���Ե�ֵ��
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
     * ��ȡmDescription���Ե�ֵ��
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
     * ����mDescription���Ե�ֵ��
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
     * ��ȡmEstimatePeriodType���Ե�ֵ��
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
     * ����mEstimatePeriodType���Ե�ֵ��
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
     * ��ȡmExceptionHandle���Ե�ֵ��
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
     * ����mExceptionHandle���Ե�ֵ��
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
     * ��ȡmFinalExceptionMode���Ե�ֵ��
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
     * ����mFinalExceptionMode���Ե�ֵ��
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
     * ��ȡmid���Ե�ֵ��
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
     * ����mid���Ե�ֵ��
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
     * ��ȡmIsAccrueable���Ե�ֵ��
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
     * ����mIsAccrueable���Ե�ֵ��
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
     * ��ȡmIsAppNeedAgree���Ե�ֵ��
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
     * ����mIsAppNeedAgree���Ե�ֵ��
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
     * ��ȡmIsApprovable���Ե�ֵ��
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
     * ����mIsApprovable���Ե�ֵ��
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
     * ��ȡmIsApprovedModify���Ե�ֵ��
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
     * ����mIsApprovedModify���Ե�ֵ��
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
     * ��ȡmIsAutoSchedule���Ե�ֵ��
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
     * ����mIsAutoSchedule���Ե�ֵ��
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
     * ��ȡmIsDocNoEditable���Ե�ֵ��
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
     * ����mIsDocNoEditable���Ե�ֵ��
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
     * ��ȡmIsEditableByTask���Ե�ֵ��
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
     * ����mIsEditableByTask���Ե�ֵ��
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
     * ��ȡmIsInvoiceable���Ե�ֵ��
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
     * ����mIsInvoiceable���Ե�ֵ��
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
     * ��ȡmIsQuanxian���Ե�ֵ��
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
     * ����mIsQuanxian���Ե�ֵ��
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
     * ��ȡmIsSendMsg���Ե�ֵ��
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
     * ����mIsSendMsg���Ե�ֵ��
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
     * ��ȡmIsTaskDocNoEditable���Ե�ֵ��
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
     * ����mIsTaskDocNoEditable���Ե�ֵ��
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
     * ��ȡmIsTaskManagerRefControl���Ե�ֵ��
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
     * ����mIsTaskManagerRefControl���Ե�ֵ��
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
     * ��ȡmIsVersionControl���Ե�ֵ��
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
     * ����mIsVersionControl���Ե�ֵ��
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
     * ��ȡmIsWPlan���Ե�ֵ��
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
     * ����mIsWPlan���Ե�ֵ��
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
     * ��ȡmKeyPathDelayTime���Ե�ֵ��
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
     * ����mKeyPathDelayTime���Ե�ֵ��
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
     * ��ȡmModifiedBy���Ե�ֵ��
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
     * ����mModifiedBy���Ե�ֵ��
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
     * ��ȡmModifiedOn���Ե�ֵ��
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
     * ����mModifiedOn���Ե�ֵ��
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
     * ��ȡmPlanDimensions���Ե�ֵ��
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
     * ����mPlanDimensions���Ե�ֵ��
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
     * ��ȡmProgressRptType���Ե�ֵ��
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
     * ����mProgressRptType���Ե�ֵ��
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
     * ��ȡmProjCategory���Ե�ֵ��
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
     * ����mProjCategory���Ե�ֵ��
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
     * ��ȡmProjDimensionEnum���Ե�ֵ��
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
     * ����mProjDimensionEnum���Ե�ֵ��
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
     * ��ȡmProjSrc���Ե�ֵ��
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
     * ����mProjSrc���Ե�ֵ��
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
     * ��ȡmRespondDays���Ե�ֵ��
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
     * ����mRespondDays���Ե�ֵ��
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
     * ��ȡmScheduleType���Ե�ֵ��
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
     * ����mScheduleType���Ե�ֵ��
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
     * ��ȡmSequenceType���Ե�ֵ��
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
     * ����mSequenceType���Ե�ֵ��
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
     * ��ȡmShortName���Ե�ֵ��
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
     * ����mShortName���Ե�ֵ��
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
     * ��ȡmSysVersion���Ե�ֵ��
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
     * ����mSysVersion���Ե�ֵ��
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
     * ��ȡmTaskLevel���Ե�ֵ��
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
     * ����mTaskLevel���Ե�ֵ��
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
     * ��ȡmTaskSequenceType���Ե�ֵ��
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
     * ����mTaskSequenceType���Ե�ֵ��
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
     * ��ȡmTaskStartSequence���Ե�ֵ��
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
     * ����mTaskStartSequence���Ե�ֵ��
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
     * ��ȡmTaskStepLength���Ե�ֵ��
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
     * ����mTaskStepLength���Ե�ֵ��
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
     * ��ȡmwScheduleExceptionMode���Ե�ֵ��
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
     * ����mwScheduleExceptionMode���Ե�ֵ��
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
