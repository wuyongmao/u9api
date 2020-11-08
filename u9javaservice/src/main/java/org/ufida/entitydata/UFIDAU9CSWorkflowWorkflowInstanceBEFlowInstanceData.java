
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
 * &lt;p&gt;UFIDA.U9.CS.Workflow.WorkflowInstanceBE.FlowInstanceData complex type�� Java �ࡣ
 * 
 * &lt;p&gt;����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡcloseUser���Ե�ֵ��
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
     * ����closeUser���Ե�ֵ��
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
     * ��ȡcloseUserSKey���Ե�ֵ��
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
     * ����closeUserSKey���Ե�ֵ��
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
     * ��ȡcurrentFlowStateName���Ե�ֵ��
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
     * ����currentFlowStateName���Ե�ֵ��
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
     * ��ȡcurrentFlowStateSKey���Ե�ֵ��
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
     * ����currentFlowStateSKey���Ե�ֵ��
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
     * ��ȡflowContext���Ե�ֵ��
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
     * ����flowContext���Ե�ֵ��
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
     * ��ȡflowContextSKey���Ե�ֵ��
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
     * ����flowContextSKey���Ե�ֵ��
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
     * ��ȡmainFlowSKey���Ե�ֵ��
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
     * ����mainFlowSKey���Ե�ֵ��
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
     * ��ȡmanualAssignUser���Ե�ֵ��
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
     * ����manualAssignUser���Ե�ֵ��
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
     * ��ȡmanualAssignUserSKey���Ե�ֵ��
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
     * ����manualAssignUserSKey���Ե�ֵ��
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
     * ��ȡmemo���Ե�ֵ��
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
     * ����memo���Ե�ֵ��
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
     * ��ȡmultiCurrentFlowStateName���Ե�ֵ��
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
     * ����multiCurrentFlowStateName���Ե�ֵ��
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
     * ��ȡmultiMemo���Ե�ֵ��
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
     * ����multiMemo���Ե�ֵ��
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
     * ��ȡmultiTitle���Ե�ֵ��
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
     * ����multiTitle���Ե�ֵ��
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
     * ��ȡparentFlowSKey���Ե�ֵ��
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
     * ����parentFlowSKey���Ե�ֵ��
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
     * ��ȡsourceDept���Ե�ֵ��
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
     * ����sourceDept���Ե�ֵ��
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
     * ��ȡsourceDeptSKey���Ե�ֵ��
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
     * ����sourceDeptSKey���Ե�ֵ��
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
     * ��ȡsourceOrg���Ե�ֵ��
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
     * ����sourceOrg���Ե�ֵ��
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
     * ��ȡsourceOrgSKey���Ե�ֵ��
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
     * ����sourceOrgSKey���Ե�ֵ��
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
     * ��ȡsourceUser���Ե�ֵ��
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
     * ����sourceUser���Ե�ֵ��
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
     * ��ȡsourceUserSKey���Ե�ֵ��
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
     * ����sourceUserSKey���Ե�ֵ��
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
     * ��ȡstartUser���Ե�ֵ��
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
     * ����startUser���Ե�ֵ��
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
     * ��ȡstartUserSKey���Ե�ֵ��
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
     * ����startUserSKey���Ե�ֵ��
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
     * ��ȡsuspendUser���Ե�ֵ��
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
     * ����suspendUser���Ե�ֵ��
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
     * ��ȡsuspendUserSKey���Ե�ֵ��
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
     * ����suspendUserSKey���Ե�ֵ��
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
     * ��ȡtitle���Ե�ֵ��
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
     * ����title���Ե�ֵ��
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
     * ��ȡworkflowDefine���Ե�ֵ��
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
     * ����workflowDefine���Ե�ֵ��
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
     * ��ȡworkflowDefineSKey���Ե�ֵ��
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
     * ����workflowDefineSKey���Ե�ֵ��
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
     * ��ȡmAbandonApprovalDate���Ե�ֵ��
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
     * ����mAbandonApprovalDate���Ե�ֵ��
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
     * ��ȡmAbandonApprovalUser���Ե�ֵ��
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
     * ����mAbandonApprovalUser���Ե�ֵ��
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
     * ��ȡmApprovalResult���Ե�ֵ��
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
     * ����mApprovalResult���Ե�ֵ��
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
     * ��ȡmBusinessType���Ե�ֵ��
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
     * ����mBusinessType���Ե�ֵ��
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
     * ��ȡmCloseTime���Ե�ֵ��
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
     * ����mCloseTime���Ե�ֵ��
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
     * ��ȡmCurrentFlowState���Ե�ֵ��
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
     * ����mCurrentFlowState���Ե�ֵ��
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
     * ��ȡmDefineResetRecord���Ե�ֵ��
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
     * ����mDefineResetRecord���Ե�ֵ��
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
     * ��ȡmDefineXML���Ե�ֵ��
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
     * ����mDefineXML���Ե�ֵ��
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
     * ��ȡmEffective���Ե�ֵ��
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
     * ����mEffective���Ե�ֵ��
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
     * ��ȡmFlowInteroper���Ե�ֵ��
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
     * ����mFlowInteroper���Ե�ֵ��
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
     * ��ȡmFlowState���Ե�ֵ��
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
     * ����mFlowState���Ե�ֵ��
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
     * ��ȡmInnerDefineVersion���Ե�ֵ��
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
     * ����mInnerDefineVersion���Ե�ֵ��
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
     * ��ȡmInstance���Ե�ֵ��
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
     * ����mInstance���Ե�ֵ��
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
     * ��ȡmIsAbandonApproval���Ե�ֵ��
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
     * ����mIsAbandonApproval���Ե�ֵ��
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
     * ��ȡmIsFreeFlow���Ե�ֵ��
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
     * ����mIsFreeFlow���Ե�ֵ��
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
     * ��ȡmMainFlow���Ե�ֵ��
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
     * ����mMainFlow���Ե�ֵ��
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
     * ��ȡmManualAssignProcessTrack���Ե�ֵ��
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
     * ����mManualAssignProcessTrack���Ե�ֵ��
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
     * ��ȡmManualAssignState���Ե�ֵ��
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
     * ����mManualAssignState���Ե�ֵ��
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
     * ��ȡmOwnerBranch���Ե�ֵ��
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
     * ����mOwnerBranch���Ե�ֵ��
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
     * ��ȡmOwnerEntity���Ե�ֵ��
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
     * ����mOwnerEntity���Ե�ֵ��
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
     * ��ȡmOwnerState���Ե�ֵ��
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
     * ����mOwnerState���Ե�ֵ��
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
     * ��ȡmParentFlow���Ե�ֵ��
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
     * ����mParentFlow���Ե�ֵ��
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
     * ��ȡmPreInstance���Ե�ֵ��
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
     * ����mPreInstance���Ե�ֵ��
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
     * ��ȡmSourceCulture���Ե�ֵ��
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
     * ����mSourceCulture���Ե�ֵ��
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
     * ��ȡmStartCulture���Ե�ֵ��
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
     * ����mStartCulture���Ե�ֵ��
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
     * ��ȡmStartTime���Ե�ֵ��
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
     * ����mStartTime���Ե�ֵ��
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
     * ��ȡmStartUserContext���Ե�ֵ��
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
     * ����mStartUserContext���Ե�ֵ��
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
     * ��ȡmStartUserORG���Ե�ֵ��
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
     * ����mStartUserORG���Ե�ֵ��
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
     * ��ȡmState���Ե�ֵ��
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
     * ����mState���Ե�ֵ��
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
     * ��ȡmSuspendReason���Ե�ֵ��
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
     * ����mSuspendReason���Ե�ֵ��
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
     * ��ȡmSuspendTime���Ե�ֵ��
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
     * ����mSuspendTime���Ե�ֵ��
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

}
