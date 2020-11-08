
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
 * &lt;p&gt;UFIDA.U9.CS.Workflow.WorkflowInstanceBE.FlowInstanceData complex type的 Java 类。
 * 
 * &lt;p&gt;以下模式片段指定包含在此类中的预期内容。
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="UFIDA.U9.CS.Workflow.WorkflowInstanceBE.FlowInstanceData"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://www.UFIDA.org/EntityData}UFSoft.UBF.Business.DataTransObjectBase"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="CloseUser" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="CloseUser_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="CurrentFlowStateName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="CurrentFlowState_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="FlowContext" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="FlowContext_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="MainFlow_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ManualAssignUser" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ManualAssignUser_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Memo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Multi_CurrentFlowStateName" type="{UFSoft.UBF.Util.Data}MultiLangDataDict" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Multi_Memo" type="{UFSoft.UBF.Util.Data}MultiLangDataDict" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Multi_Title" type="{UFSoft.UBF.Util.Data}MultiLangDataDict" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ParentFlow_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="SourceDept" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="SourceDept_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="SourceOrg" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="SourceOrg_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="SourceUser" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="SourceUser_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="StartUser" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="StartUser_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="SuspendUser" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="SuspendUser_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="WorkflowDefine" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="WorkflowDefine_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_abandonApprovalDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_abandonApprovalUser" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_approvalResult" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_businessType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_closeTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_createdBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_createdOn" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_currentFlowState" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CS.Workflow.WorkflowInstanceBE.FlowStateData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_defineResetRecord" type="{http://www.UFIDA.org/EntityData}ArrayOfUFIDA.U9.CS.Workflow.WorkflowInstanceBE.DefineResetRecordData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_defineXML" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_effective" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_flowInteroper" type="{http://www.UFIDA.org/EntityData}ArrayOfUFIDA.U9.CS.Workflow.WorkflowInstanceBE.FlowInteroperData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_flowState" type="{http://www.UFIDA.org/EntityData}ArrayOfUFIDA.U9.CS.Workflow.WorkflowInstanceBE.FlowStateData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_iD" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_innerDefineVersion" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_instance" type="{http://schemas.microsoft.com/2003/10/Serialization/}guid" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isAbandonApproval" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_isFreeFlow" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_mainFlow" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CS.Workflow.WorkflowInstanceBE.FlowInstanceData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_manualAssignProcessTrack" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_manualAssignState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_modifiedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_modifiedOn" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_ownerBranch" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_ownerEntity" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_ownerState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_parentFlow" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CS.Workflow.WorkflowInstanceBE.FlowInstanceData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_preInstance" type="{http://schemas.microsoft.com/2003/10/Serialization/}guid" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_sourceCulture" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_startCulture" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_startTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_startUserContext" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_startUserORG" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_state" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_suspendReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_suspendTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_sysVersion" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UFIDA.U9.CS.Workflow.WorkflowInstanceBE.FlowInstanceData", propOrder = {
    "closeUser",
    "closeUserSKey",
    "currentFlowStateName",
    "currentFlowStateSKey",
    "flowContext",
    "flowContextSKey",
    "mainFlowSKey",
    "manualAssignUser",
    "manualAssignUserSKey",
    "memo",
    "multiCurrentFlowStateName",
    "multiMemo",
    "multiTitle",
    "parentFlowSKey",
    "sourceDept",
    "sourceDeptSKey",
    "sourceOrg",
    "sourceOrgSKey",
    "sourceUser",
    "sourceUserSKey",
    "startUser",
    "startUserSKey",
    "suspendUser",
    "suspendUserSKey",
    "title",
    "workflowDefine",
    "workflowDefineSKey",
    "mAbandonApprovalDate",
    "mAbandonApprovalUser",
    "mApprovalResult",
    "mBusinessType",
    "mCloseTime",
    "mCreatedBy",
    "mCreatedOn",
    "mCurrentFlowState",
    "mDefineResetRecord",
    "mDefineXML",
    "mEffective",
    "mFlowInteroper",
    "mFlowState",
    "mid",
    "mInnerDefineVersion",
    "mInstance",
    "mIsAbandonApproval",
    "mIsFreeFlow",
    "mMainFlow",
    "mManualAssignProcessTrack",
    "mManualAssignState",
    "mModifiedBy",
    "mModifiedOn",
    "mOwnerBranch",
    "mOwnerEntity",
    "mOwnerState",
    "mParentFlow",
    "mPreInstance",
    "mSourceCulture",
    "mStartCulture",
    "mStartTime",
    "mStartUserContext",
    "mStartUserORG",
    "mState",
    "mSuspendReason",
    "mSuspendTime",
    "mSysVersion"
})
public class UFIDAU9CSWorkflowWorkflowInstanceBEFlowInstanceData
    extends UFSoftUBFBusinessDataTransObjectBase
{

    @XmlElement(name = "CloseUser")
    protected Long closeUser;
    @XmlElementRef(name = "CloseUser_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> closeUserSKey;
    @XmlElementRef(name = "CurrentFlowStateName", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> currentFlowStateName;
    @XmlElementRef(name = "CurrentFlowState_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> currentFlowStateSKey;
    @XmlElement(name = "FlowContext")
    protected Long flowContext;
    @XmlElementRef(name = "FlowContext_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> flowContextSKey;
    @XmlElementRef(name = "MainFlow_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> mainFlowSKey;
    @XmlElement(name = "ManualAssignUser")
    protected Long manualAssignUser;
    @XmlElementRef(name = "ManualAssignUser_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> manualAssignUserSKey;
    @XmlElementRef(name = "Memo", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> memo;
    @XmlElementRef(name = "Multi_CurrentFlowStateName", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<MultiLangDataDict> multiCurrentFlowStateName;
    @XmlElementRef(name = "Multi_Memo", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<MultiLangDataDict> multiMemo;
    @XmlElementRef(name = "Multi_Title", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<MultiLangDataDict> multiTitle;
    @XmlElementRef(name = "ParentFlow_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> parentFlowSKey;
    @XmlElement(name = "SourceDept")
    protected Long sourceDept;
    @XmlElementRef(name = "SourceDept_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> sourceDeptSKey;
    @XmlElement(name = "SourceOrg")
    protected Long sourceOrg;
    @XmlElementRef(name = "SourceOrg_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> sourceOrgSKey;
    @XmlElement(name = "SourceUser")
    protected Long sourceUser;
    @XmlElementRef(name = "SourceUser_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> sourceUserSKey;
    @XmlElement(name = "StartUser")
    protected Long startUser;
    @XmlElementRef(name = "StartUser_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> startUserSKey;
    @XmlElement(name = "SuspendUser")
    protected Long suspendUser;
    @XmlElementRef(name = "SuspendUser_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> suspendUserSKey;
    @XmlElementRef(name = "Title", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> title;
    @XmlElement(name = "WorkflowDefine")
    protected Long workflowDefine;
    @XmlElementRef(name = "WorkflowDefine_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> workflowDefineSKey;
    @XmlElement(name = "m_abandonApprovalDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mAbandonApprovalDate;
    @XmlElement(name = "m_abandonApprovalUser")
    protected Long mAbandonApprovalUser;
    @XmlElement(name = "m_approvalResult")
    protected Integer mApprovalResult;
    @XmlElementRef(name = "m_businessType", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mBusinessType;
    @XmlElement(name = "m_closeTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mCloseTime;
    @XmlElementRef(name = "m_createdBy", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mCreatedBy;
    @XmlElement(name = "m_createdOn")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mCreatedOn;
    @XmlElementRef(name = "m_currentFlowState", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9CSWorkflowWorkflowInstanceBEFlowStateData> mCurrentFlowState;
    @XmlElementRef(name = "m_defineResetRecord", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfUFIDAU9CSWorkflowWorkflowInstanceBEDefineResetRecordData> mDefineResetRecord;
    @XmlElementRef(name = "m_defineXML", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mDefineXML;
    @XmlElement(name = "m_effective")
    protected Boolean mEffective;
    @XmlElementRef(name = "m_flowInteroper", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfUFIDAU9CSWorkflowWorkflowInstanceBEFlowInteroperData> mFlowInteroper;
    @XmlElementRef(name = "m_flowState", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfUFIDAU9CSWorkflowWorkflowInstanceBEFlowStateData> mFlowState;
    @XmlElement(name = "m_iD")
    protected Long mid;
    @XmlElement(name = "m_innerDefineVersion")
    protected Integer mInnerDefineVersion;
    @XmlElement(name = "m_instance")
    protected String mInstance;
    @XmlElement(name = "m_isAbandonApproval")
    protected Boolean mIsAbandonApproval;
    @XmlElement(name = "m_isFreeFlow")
    protected Boolean mIsFreeFlow;
    @XmlElementRef(name = "m_mainFlow", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9CSWorkflowWorkflowInstanceBEFlowInstanceData> mMainFlow;
    @XmlElement(name = "m_manualAssignProcessTrack")
    protected Long mManualAssignProcessTrack;
    @XmlElementRef(name = "m_manualAssignState", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mManualAssignState;
    @XmlElementRef(name = "m_modifiedBy", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mModifiedBy;
    @XmlElement(name = "m_modifiedOn")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mModifiedOn;
    @XmlElementRef(name = "m_ownerBranch", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mOwnerBranch;
    @XmlElementRef(name = "m_ownerEntity", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> mOwnerEntity;
    @XmlElementRef(name = "m_ownerState", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mOwnerState;
    @XmlElementRef(name = "m_parentFlow", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9CSWorkflowWorkflowInstanceBEFlowInstanceData> mParentFlow;
    @XmlElement(name = "m_preInstance")
    protected String mPreInstance;
    @XmlElementRef(name = "m_sourceCulture", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mSourceCulture;
    @XmlElementRef(name = "m_startCulture", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mStartCulture;
    @XmlElement(name = "m_startTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mStartTime;
    @XmlElementRef(name = "m_startUserContext", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mStartUserContext;
    @XmlElement(name = "m_startUserORG")
    protected Long mStartUserORG;
    @XmlElement(name = "m_state")
    protected Integer mState;
    @XmlElementRef(name = "m_suspendReason", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mSuspendReason;
    @XmlElement(name = "m_suspendTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mSuspendTime;
    @XmlElement(name = "m_sysVersion")
    protected Long mSysVersion;

    /**
     * 获取closeUser属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCloseUser() {
        return closeUser;
    }

    /**
     * 设置closeUser属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCloseUser(Long value) {
        this.closeUser = value;
    }

    /**
     * 获取closeUserSKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getCloseUserSKey() {
        return closeUserSKey;
    }

    /**
     * 设置closeUserSKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setCloseUserSKey(JAXBElement<EntityKey> value) {
        this.closeUserSKey = value;
    }

    /**
     * 获取currentFlowStateName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCurrentFlowStateName() {
        return currentFlowStateName;
    }

    /**
     * 设置currentFlowStateName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCurrentFlowStateName(JAXBElement<String> value) {
        this.currentFlowStateName = value;
    }

    /**
     * 获取currentFlowStateSKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getCurrentFlowStateSKey() {
        return currentFlowStateSKey;
    }

    /**
     * 设置currentFlowStateSKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setCurrentFlowStateSKey(JAXBElement<EntityKey> value) {
        this.currentFlowStateSKey = value;
    }

    /**
     * 获取flowContext属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getFlowContext() {
        return flowContext;
    }

    /**
     * 设置flowContext属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFlowContext(Long value) {
        this.flowContext = value;
    }

    /**
     * 获取flowContextSKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getFlowContextSKey() {
        return flowContextSKey;
    }

    /**
     * 设置flowContextSKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setFlowContextSKey(JAXBElement<EntityKey> value) {
        this.flowContextSKey = value;
    }

    /**
     * 获取mainFlowSKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getMainFlowSKey() {
        return mainFlowSKey;
    }

    /**
     * 设置mainFlowSKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setMainFlowSKey(JAXBElement<EntityKey> value) {
        this.mainFlowSKey = value;
    }

    /**
     * 获取manualAssignUser属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getManualAssignUser() {
        return manualAssignUser;
    }

    /**
     * 设置manualAssignUser属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setManualAssignUser(Long value) {
        this.manualAssignUser = value;
    }

    /**
     * 获取manualAssignUserSKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getManualAssignUserSKey() {
        return manualAssignUserSKey;
    }

    /**
     * 设置manualAssignUserSKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setManualAssignUserSKey(JAXBElement<EntityKey> value) {
        this.manualAssignUserSKey = value;
    }

    /**
     * 获取memo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMemo() {
        return memo;
    }

    /**
     * 设置memo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMemo(JAXBElement<String> value) {
        this.memo = value;
    }

    /**
     * 获取multiCurrentFlowStateName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MultiLangDataDict }{@code >}
     *     
     */
    public JAXBElement<MultiLangDataDict> getMultiCurrentFlowStateName() {
        return multiCurrentFlowStateName;
    }

    /**
     * 设置multiCurrentFlowStateName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MultiLangDataDict }{@code >}
     *     
     */
    public void setMultiCurrentFlowStateName(JAXBElement<MultiLangDataDict> value) {
        this.multiCurrentFlowStateName = value;
    }

    /**
     * 获取multiMemo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MultiLangDataDict }{@code >}
     *     
     */
    public JAXBElement<MultiLangDataDict> getMultiMemo() {
        return multiMemo;
    }

    /**
     * 设置multiMemo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MultiLangDataDict }{@code >}
     *     
     */
    public void setMultiMemo(JAXBElement<MultiLangDataDict> value) {
        this.multiMemo = value;
    }

    /**
     * 获取multiTitle属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MultiLangDataDict }{@code >}
     *     
     */
    public JAXBElement<MultiLangDataDict> getMultiTitle() {
        return multiTitle;
    }

    /**
     * 设置multiTitle属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MultiLangDataDict }{@code >}
     *     
     */
    public void setMultiTitle(JAXBElement<MultiLangDataDict> value) {
        this.multiTitle = value;
    }

    /**
     * 获取parentFlowSKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getParentFlowSKey() {
        return parentFlowSKey;
    }

    /**
     * 设置parentFlowSKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setParentFlowSKey(JAXBElement<EntityKey> value) {
        this.parentFlowSKey = value;
    }

    /**
     * 获取sourceDept属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSourceDept() {
        return sourceDept;
    }

    /**
     * 设置sourceDept属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSourceDept(Long value) {
        this.sourceDept = value;
    }

    /**
     * 获取sourceDeptSKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getSourceDeptSKey() {
        return sourceDeptSKey;
    }

    /**
     * 设置sourceDeptSKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setSourceDeptSKey(JAXBElement<EntityKey> value) {
        this.sourceDeptSKey = value;
    }

    /**
     * 获取sourceOrg属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSourceOrg() {
        return sourceOrg;
    }

    /**
     * 设置sourceOrg属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSourceOrg(Long value) {
        this.sourceOrg = value;
    }

    /**
     * 获取sourceOrgSKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getSourceOrgSKey() {
        return sourceOrgSKey;
    }

    /**
     * 设置sourceOrgSKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setSourceOrgSKey(JAXBElement<EntityKey> value) {
        this.sourceOrgSKey = value;
    }

    /**
     * 获取sourceUser属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSourceUser() {
        return sourceUser;
    }

    /**
     * 设置sourceUser属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSourceUser(Long value) {
        this.sourceUser = value;
    }

    /**
     * 获取sourceUserSKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getSourceUserSKey() {
        return sourceUserSKey;
    }

    /**
     * 设置sourceUserSKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setSourceUserSKey(JAXBElement<EntityKey> value) {
        this.sourceUserSKey = value;
    }

    /**
     * 获取startUser属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getStartUser() {
        return startUser;
    }

    /**
     * 设置startUser属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setStartUser(Long value) {
        this.startUser = value;
    }

    /**
     * 获取startUserSKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getStartUserSKey() {
        return startUserSKey;
    }

    /**
     * 设置startUserSKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setStartUserSKey(JAXBElement<EntityKey> value) {
        this.startUserSKey = value;
    }

    /**
     * 获取suspendUser属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSuspendUser() {
        return suspendUser;
    }

    /**
     * 设置suspendUser属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSuspendUser(Long value) {
        this.suspendUser = value;
    }

    /**
     * 获取suspendUserSKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getSuspendUserSKey() {
        return suspendUserSKey;
    }

    /**
     * 设置suspendUserSKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setSuspendUserSKey(JAXBElement<EntityKey> value) {
        this.suspendUserSKey = value;
    }

    /**
     * 获取title属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTitle() {
        return title;
    }

    /**
     * 设置title属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTitle(JAXBElement<String> value) {
        this.title = value;
    }

    /**
     * 获取workflowDefine属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getWorkflowDefine() {
        return workflowDefine;
    }

    /**
     * 设置workflowDefine属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setWorkflowDefine(Long value) {
        this.workflowDefine = value;
    }

    /**
     * 获取workflowDefineSKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getWorkflowDefineSKey() {
        return workflowDefineSKey;
    }

    /**
     * 设置workflowDefineSKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setWorkflowDefineSKey(JAXBElement<EntityKey> value) {
        this.workflowDefineSKey = value;
    }

    /**
     * 获取mAbandonApprovalDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMAbandonApprovalDate() {
        return mAbandonApprovalDate;
    }

    /**
     * 设置mAbandonApprovalDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMAbandonApprovalDate(XMLGregorianCalendar value) {
        this.mAbandonApprovalDate = value;
    }

    /**
     * 获取mAbandonApprovalUser属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMAbandonApprovalUser() {
        return mAbandonApprovalUser;
    }

    /**
     * 设置mAbandonApprovalUser属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMAbandonApprovalUser(Long value) {
        this.mAbandonApprovalUser = value;
    }

    /**
     * 获取mApprovalResult属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMApprovalResult() {
        return mApprovalResult;
    }

    /**
     * 设置mApprovalResult属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMApprovalResult(Integer value) {
        this.mApprovalResult = value;
    }

    /**
     * 获取mBusinessType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMBusinessType() {
        return mBusinessType;
    }

    /**
     * 设置mBusinessType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMBusinessType(JAXBElement<String> value) {
        this.mBusinessType = value;
    }

    /**
     * 获取mCloseTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMCloseTime() {
        return mCloseTime;
    }

    /**
     * 设置mCloseTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMCloseTime(XMLGregorianCalendar value) {
        this.mCloseTime = value;
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
     * 获取mCurrentFlowState属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CSWorkflowWorkflowInstanceBEFlowStateData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9CSWorkflowWorkflowInstanceBEFlowStateData> getMCurrentFlowState() {
        return mCurrentFlowState;
    }

    /**
     * 设置mCurrentFlowState属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CSWorkflowWorkflowInstanceBEFlowStateData }{@code >}
     *     
     */
    public void setMCurrentFlowState(JAXBElement<UFIDAU9CSWorkflowWorkflowInstanceBEFlowStateData> value) {
        this.mCurrentFlowState = value;
    }

    /**
     * 获取mDefineResetRecord属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUFIDAU9CSWorkflowWorkflowInstanceBEDefineResetRecordData }{@code >}
     *     
     */
    public JAXBElement<ArrayOfUFIDAU9CSWorkflowWorkflowInstanceBEDefineResetRecordData> getMDefineResetRecord() {
        return mDefineResetRecord;
    }

    /**
     * 设置mDefineResetRecord属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUFIDAU9CSWorkflowWorkflowInstanceBEDefineResetRecordData }{@code >}
     *     
     */
    public void setMDefineResetRecord(JAXBElement<ArrayOfUFIDAU9CSWorkflowWorkflowInstanceBEDefineResetRecordData> value) {
        this.mDefineResetRecord = value;
    }

    /**
     * 获取mDefineXML属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMDefineXML() {
        return mDefineXML;
    }

    /**
     * 设置mDefineXML属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMDefineXML(JAXBElement<String> value) {
        this.mDefineXML = value;
    }

    /**
     * 获取mEffective属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMEffective() {
        return mEffective;
    }

    /**
     * 设置mEffective属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMEffective(Boolean value) {
        this.mEffective = value;
    }

    /**
     * 获取mFlowInteroper属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUFIDAU9CSWorkflowWorkflowInstanceBEFlowInteroperData }{@code >}
     *     
     */
    public JAXBElement<ArrayOfUFIDAU9CSWorkflowWorkflowInstanceBEFlowInteroperData> getMFlowInteroper() {
        return mFlowInteroper;
    }

    /**
     * 设置mFlowInteroper属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUFIDAU9CSWorkflowWorkflowInstanceBEFlowInteroperData }{@code >}
     *     
     */
    public void setMFlowInteroper(JAXBElement<ArrayOfUFIDAU9CSWorkflowWorkflowInstanceBEFlowInteroperData> value) {
        this.mFlowInteroper = value;
    }

    /**
     * 获取mFlowState属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUFIDAU9CSWorkflowWorkflowInstanceBEFlowStateData }{@code >}
     *     
     */
    public JAXBElement<ArrayOfUFIDAU9CSWorkflowWorkflowInstanceBEFlowStateData> getMFlowState() {
        return mFlowState;
    }

    /**
     * 设置mFlowState属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUFIDAU9CSWorkflowWorkflowInstanceBEFlowStateData }{@code >}
     *     
     */
    public void setMFlowState(JAXBElement<ArrayOfUFIDAU9CSWorkflowWorkflowInstanceBEFlowStateData> value) {
        this.mFlowState = value;
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
     * 获取mInnerDefineVersion属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMInnerDefineVersion() {
        return mInnerDefineVersion;
    }

    /**
     * 设置mInnerDefineVersion属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMInnerDefineVersion(Integer value) {
        this.mInnerDefineVersion = value;
    }

    /**
     * 获取mInstance属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMInstance() {
        return mInstance;
    }

    /**
     * 设置mInstance属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMInstance(String value) {
        this.mInstance = value;
    }

    /**
     * 获取mIsAbandonApproval属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsAbandonApproval() {
        return mIsAbandonApproval;
    }

    /**
     * 设置mIsAbandonApproval属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsAbandonApproval(Boolean value) {
        this.mIsAbandonApproval = value;
    }

    /**
     * 获取mIsFreeFlow属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMIsFreeFlow() {
        return mIsFreeFlow;
    }

    /**
     * 设置mIsFreeFlow属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMIsFreeFlow(Boolean value) {
        this.mIsFreeFlow = value;
    }

    /**
     * 获取mMainFlow属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CSWorkflowWorkflowInstanceBEFlowInstanceData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9CSWorkflowWorkflowInstanceBEFlowInstanceData> getMMainFlow() {
        return mMainFlow;
    }

    /**
     * 设置mMainFlow属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CSWorkflowWorkflowInstanceBEFlowInstanceData }{@code >}
     *     
     */
    public void setMMainFlow(JAXBElement<UFIDAU9CSWorkflowWorkflowInstanceBEFlowInstanceData> value) {
        this.mMainFlow = value;
    }

    /**
     * 获取mManualAssignProcessTrack属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMManualAssignProcessTrack() {
        return mManualAssignProcessTrack;
    }

    /**
     * 设置mManualAssignProcessTrack属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMManualAssignProcessTrack(Long value) {
        this.mManualAssignProcessTrack = value;
    }

    /**
     * 获取mManualAssignState属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMManualAssignState() {
        return mManualAssignState;
    }

    /**
     * 设置mManualAssignState属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMManualAssignState(JAXBElement<String> value) {
        this.mManualAssignState = value;
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
     * 获取mOwnerBranch属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMOwnerBranch() {
        return mOwnerBranch;
    }

    /**
     * 设置mOwnerBranch属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMOwnerBranch(JAXBElement<String> value) {
        this.mOwnerBranch = value;
    }

    /**
     * 获取mOwnerEntity属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getMOwnerEntity() {
        return mOwnerEntity;
    }

    /**
     * 设置mOwnerEntity属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setMOwnerEntity(JAXBElement<EntityKey> value) {
        this.mOwnerEntity = value;
    }

    /**
     * 获取mOwnerState属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMOwnerState() {
        return mOwnerState;
    }

    /**
     * 设置mOwnerState属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMOwnerState(JAXBElement<String> value) {
        this.mOwnerState = value;
    }

    /**
     * 获取mParentFlow属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CSWorkflowWorkflowInstanceBEFlowInstanceData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9CSWorkflowWorkflowInstanceBEFlowInstanceData> getMParentFlow() {
        return mParentFlow;
    }

    /**
     * 设置mParentFlow属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CSWorkflowWorkflowInstanceBEFlowInstanceData }{@code >}
     *     
     */
    public void setMParentFlow(JAXBElement<UFIDAU9CSWorkflowWorkflowInstanceBEFlowInstanceData> value) {
        this.mParentFlow = value;
    }

    /**
     * 获取mPreInstance属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMPreInstance() {
        return mPreInstance;
    }

    /**
     * 设置mPreInstance属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMPreInstance(String value) {
        this.mPreInstance = value;
    }

    /**
     * 获取mSourceCulture属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMSourceCulture() {
        return mSourceCulture;
    }

    /**
     * 设置mSourceCulture属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMSourceCulture(JAXBElement<String> value) {
        this.mSourceCulture = value;
    }

    /**
     * 获取mStartCulture属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMStartCulture() {
        return mStartCulture;
    }

    /**
     * 设置mStartCulture属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMStartCulture(JAXBElement<String> value) {
        this.mStartCulture = value;
    }

    /**
     * 获取mStartTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMStartTime() {
        return mStartTime;
    }

    /**
     * 设置mStartTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMStartTime(XMLGregorianCalendar value) {
        this.mStartTime = value;
    }

    /**
     * 获取mStartUserContext属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMStartUserContext() {
        return mStartUserContext;
    }

    /**
     * 设置mStartUserContext属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMStartUserContext(JAXBElement<String> value) {
        this.mStartUserContext = value;
    }

    /**
     * 获取mStartUserORG属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMStartUserORG() {
        return mStartUserORG;
    }

    /**
     * 设置mStartUserORG属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMStartUserORG(Long value) {
        this.mStartUserORG = value;
    }

    /**
     * 获取mState属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMState() {
        return mState;
    }

    /**
     * 设置mState属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMState(Integer value) {
        this.mState = value;
    }

    /**
     * 获取mSuspendReason属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMSuspendReason() {
        return mSuspendReason;
    }

    /**
     * 设置mSuspendReason属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMSuspendReason(JAXBElement<String> value) {
        this.mSuspendReason = value;
    }

    /**
     * 获取mSuspendTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMSuspendTime() {
        return mSuspendTime;
    }

    /**
     * 设置mSuspendTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMSuspendTime(XMLGregorianCalendar value) {
        this.mSuspendTime = value;
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

}
