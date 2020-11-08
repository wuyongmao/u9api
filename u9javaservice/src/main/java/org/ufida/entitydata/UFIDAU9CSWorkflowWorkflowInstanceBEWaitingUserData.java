
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
 * &lt;p&gt;UFIDA.U9.CS.Workflow.WorkflowInstanceBE.WaitingUserData complex type�� Java �ࡣ
 * 
 * &lt;p&gt;����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="UFIDA.U9.CS.Workflow.WorkflowInstanceBE.WaitingUserData"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://www.UFIDA.org/EntityData}UFSoft.UBF.Business.DataTransObjectBase"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="AddAssignUser_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="AssignUser_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="FlowState_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_addAssignUser" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CS.Workflow.WorkflowInstanceBE.ProcessTrackData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_assignTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_assignUser" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CS.Workflow.WorkflowInstanceBE.WaitingUserData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_businessOrg" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_completePercent" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_createdBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_createdOn" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_deptID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_doFlag" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_doMode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_excludeSourceUser" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_excludeStartUser" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_expireTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_finishTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_flowState" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CS.Workflow.WorkflowInstanceBE.FlowStateData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_iD" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_modifiedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_modifiedOn" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_operatorID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_orderID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_processTrack" type="{http://www.UFIDA.org/EntityData}ArrayOfUFIDA.U9.CS.Workflow.WorkflowInstanceBE.ProcessTrackData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_realExpireTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_receiveMessageType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_sysVersion" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_timeLimit" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_uCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_uID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_uType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_userAction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_workCalendar" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_workOrg" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UFIDA.U9.CS.Workflow.WorkflowInstanceBE.WaitingUserData", propOrder = {
    "addAssignUserSKey",
    "assignUserSKey",
    "flowStateSKey",
    "mAddAssignUser",
    "mAssignTime",
    "mAssignUser",
    "mBusinessOrg",
    "mCompletePercent",
    "mCreatedBy",
    "mCreatedOn",
    "mDeptID",
    "mDoFlag",
    "mDoMode",
    "mExcludeSourceUser",
    "mExcludeStartUser",
    "mExpireTime",
    "mFinishTime",
    "mFlowState",
    "mid",
    "mModifiedBy",
    "mModifiedOn",
    "mOperatorID",
    "mOrderID",
    "mProcessTrack",
    "mRealExpireTime",
    "mReceiveMessageType",
    "mSysVersion",
    "mTimeLimit",
    "muCode",
    "muid",
    "muType",
    "mUserAction",
    "mWorkCalendar",
    "mWorkOrg"
})
public class UFIDAU9CSWorkflowWorkflowInstanceBEWaitingUserData
    extends UFSoftUBFBusinessDataTransObjectBase
{

    @XmlElementRef(name = "AddAssignUser_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> addAssignUserSKey;
    @XmlElementRef(name = "AssignUser_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> assignUserSKey;
    @XmlElementRef(name = "FlowState_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> flowStateSKey;
    @XmlElementRef(name = "m_addAssignUser", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9CSWorkflowWorkflowInstanceBEProcessTrackData> mAddAssignUser;
    @XmlElement(name = "m_assignTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mAssignTime;
    @XmlElementRef(name = "m_assignUser", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9CSWorkflowWorkflowInstanceBEWaitingUserData> mAssignUser;
    @XmlElement(name = "m_businessOrg")
    protected Long mBusinessOrg;
    @XmlElement(name = "m_completePercent")
    protected Integer mCompletePercent;
    @XmlElementRef(name = "m_createdBy", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mCreatedBy;
    @XmlElement(name = "m_createdOn")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mCreatedOn;
    @XmlElement(name = "m_deptID")
    protected Long mDeptID;
    @XmlElement(name = "m_doFlag")
    protected Integer mDoFlag;
    @XmlElement(name = "m_doMode")
    protected Integer mDoMode;
    @XmlElement(name = "m_excludeSourceUser")
    protected Boolean mExcludeSourceUser;
    @XmlElement(name = "m_excludeStartUser")
    protected Boolean mExcludeStartUser;
    @XmlElement(name = "m_expireTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mExpireTime;
    @XmlElement(name = "m_finishTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mFinishTime;
    @XmlElementRef(name = "m_flowState", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9CSWorkflowWorkflowInstanceBEFlowStateData> mFlowState;
    @XmlElement(name = "m_iD")
    protected Long mid;
    @XmlElementRef(name = "m_modifiedBy", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mModifiedBy;
    @XmlElement(name = "m_modifiedOn")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mModifiedOn;
    @XmlElementRef(name = "m_operatorID", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mOperatorID;
    @XmlElement(name = "m_orderID")
    protected Integer mOrderID;
    @XmlElementRef(name = "m_processTrack", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfUFIDAU9CSWorkflowWorkflowInstanceBEProcessTrackData> mProcessTrack;
    @XmlElement(name = "m_realExpireTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mRealExpireTime;
    @XmlElement(name = "m_receiveMessageType")
    protected Integer mReceiveMessageType;
    @XmlElement(name = "m_sysVersion")
    protected Long mSysVersion;
    @XmlElement(name = "m_timeLimit")
    protected Float mTimeLimit;
    @XmlElementRef(name = "m_uCode", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> muCode;
    @XmlElement(name = "m_uID")
    protected Long muid;
    @XmlElement(name = "m_uType")
    protected Integer muType;
    @XmlElementRef(name = "m_userAction", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mUserAction;
    @XmlElement(name = "m_workCalendar")
    protected Long mWorkCalendar;
    @XmlElement(name = "m_workOrg")
    protected Long mWorkOrg;

    /**
     * ��ȡaddAssignUserSKey���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getAddAssignUserSKey() {
        return addAssignUserSKey;
    }

    /**
     * ����addAssignUserSKey���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setAddAssignUserSKey(JAXBElement<EntityKey> value) {
        this.addAssignUserSKey = value;
    }

    /**
     * ��ȡassignUserSKey���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getAssignUserSKey() {
        return assignUserSKey;
    }

    /**
     * ����assignUserSKey���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setAssignUserSKey(JAXBElement<EntityKey> value) {
        this.assignUserSKey = value;
    }

    /**
     * ��ȡflowStateSKey���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getFlowStateSKey() {
        return flowStateSKey;
    }

    /**
     * ����flowStateSKey���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setFlowStateSKey(JAXBElement<EntityKey> value) {
        this.flowStateSKey = value;
    }

    /**
     * ��ȡmAddAssignUser���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CSWorkflowWorkflowInstanceBEProcessTrackData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9CSWorkflowWorkflowInstanceBEProcessTrackData> getMAddAssignUser() {
        return mAddAssignUser;
    }

    /**
     * ����mAddAssignUser���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CSWorkflowWorkflowInstanceBEProcessTrackData }{@code >}
     *     
     */
    public void setMAddAssignUser(JAXBElement<UFIDAU9CSWorkflowWorkflowInstanceBEProcessTrackData> value) {
        this.mAddAssignUser = value;
    }

    /**
     * ��ȡmAssignTime���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMAssignTime() {
        return mAssignTime;
    }

    /**
     * ����mAssignTime���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMAssignTime(XMLGregorianCalendar value) {
        this.mAssignTime = value;
    }

    /**
     * ��ȡmAssignUser���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CSWorkflowWorkflowInstanceBEWaitingUserData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9CSWorkflowWorkflowInstanceBEWaitingUserData> getMAssignUser() {
        return mAssignUser;
    }

    /**
     * ����mAssignUser���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CSWorkflowWorkflowInstanceBEWaitingUserData }{@code >}
     *     
     */
    public void setMAssignUser(JAXBElement<UFIDAU9CSWorkflowWorkflowInstanceBEWaitingUserData> value) {
        this.mAssignUser = value;
    }

    /**
     * ��ȡmBusinessOrg���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMBusinessOrg() {
        return mBusinessOrg;
    }

    /**
     * ����mBusinessOrg���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMBusinessOrg(Long value) {
        this.mBusinessOrg = value;
    }

    /**
     * ��ȡmCompletePercent���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMCompletePercent() {
        return mCompletePercent;
    }

    /**
     * ����mCompletePercent���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMCompletePercent(Integer value) {
        this.mCompletePercent = value;
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
     * ��ȡmDeptID���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMDeptID() {
        return mDeptID;
    }

    /**
     * ����mDeptID���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMDeptID(Long value) {
        this.mDeptID = value;
    }

    /**
     * ��ȡmDoFlag���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMDoFlag() {
        return mDoFlag;
    }

    /**
     * ����mDoFlag���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMDoFlag(Integer value) {
        this.mDoFlag = value;
    }

    /**
     * ��ȡmDoMode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMDoMode() {
        return mDoMode;
    }

    /**
     * ����mDoMode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMDoMode(Integer value) {
        this.mDoMode = value;
    }

    /**
     * ��ȡmExcludeSourceUser���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMExcludeSourceUser() {
        return mExcludeSourceUser;
    }

    /**
     * ����mExcludeSourceUser���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMExcludeSourceUser(Boolean value) {
        this.mExcludeSourceUser = value;
    }

    /**
     * ��ȡmExcludeStartUser���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMExcludeStartUser() {
        return mExcludeStartUser;
    }

    /**
     * ����mExcludeStartUser���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMExcludeStartUser(Boolean value) {
        this.mExcludeStartUser = value;
    }

    /**
     * ��ȡmExpireTime���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMExpireTime() {
        return mExpireTime;
    }

    /**
     * ����mExpireTime���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMExpireTime(XMLGregorianCalendar value) {
        this.mExpireTime = value;
    }

    /**
     * ��ȡmFinishTime���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMFinishTime() {
        return mFinishTime;
    }

    /**
     * ����mFinishTime���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMFinishTime(XMLGregorianCalendar value) {
        this.mFinishTime = value;
    }

    /**
     * ��ȡmFlowState���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CSWorkflowWorkflowInstanceBEFlowStateData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9CSWorkflowWorkflowInstanceBEFlowStateData> getMFlowState() {
        return mFlowState;
    }

    /**
     * ����mFlowState���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CSWorkflowWorkflowInstanceBEFlowStateData }{@code >}
     *     
     */
    public void setMFlowState(JAXBElement<UFIDAU9CSWorkflowWorkflowInstanceBEFlowStateData> value) {
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
     * ��ȡmOperatorID���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMOperatorID() {
        return mOperatorID;
    }

    /**
     * ����mOperatorID���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMOperatorID(JAXBElement<String> value) {
        this.mOperatorID = value;
    }

    /**
     * ��ȡmOrderID���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMOrderID() {
        return mOrderID;
    }

    /**
     * ����mOrderID���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMOrderID(Integer value) {
        this.mOrderID = value;
    }

    /**
     * ��ȡmProcessTrack���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUFIDAU9CSWorkflowWorkflowInstanceBEProcessTrackData }{@code >}
     *     
     */
    public JAXBElement<ArrayOfUFIDAU9CSWorkflowWorkflowInstanceBEProcessTrackData> getMProcessTrack() {
        return mProcessTrack;
    }

    /**
     * ����mProcessTrack���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUFIDAU9CSWorkflowWorkflowInstanceBEProcessTrackData }{@code >}
     *     
     */
    public void setMProcessTrack(JAXBElement<ArrayOfUFIDAU9CSWorkflowWorkflowInstanceBEProcessTrackData> value) {
        this.mProcessTrack = value;
    }

    /**
     * ��ȡmRealExpireTime���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMRealExpireTime() {
        return mRealExpireTime;
    }

    /**
     * ����mRealExpireTime���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMRealExpireTime(XMLGregorianCalendar value) {
        this.mRealExpireTime = value;
    }

    /**
     * ��ȡmReceiveMessageType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMReceiveMessageType() {
        return mReceiveMessageType;
    }

    /**
     * ����mReceiveMessageType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMReceiveMessageType(Integer value) {
        this.mReceiveMessageType = value;
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
     * ��ȡmTimeLimit���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getMTimeLimit() {
        return mTimeLimit;
    }

    /**
     * ����mTimeLimit���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setMTimeLimit(Float value) {
        this.mTimeLimit = value;
    }

    /**
     * ��ȡmuCode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMUCode() {
        return muCode;
    }

    /**
     * ����muCode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMUCode(JAXBElement<String> value) {
        this.muCode = value;
    }

    /**
     * ��ȡmuid���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMUID() {
        return muid;
    }

    /**
     * ����muid���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMUID(Long value) {
        this.muid = value;
    }

    /**
     * ��ȡmuType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMUType() {
        return muType;
    }

    /**
     * ����muType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMUType(Integer value) {
        this.muType = value;
    }

    /**
     * ��ȡmUserAction���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMUserAction() {
        return mUserAction;
    }

    /**
     * ����mUserAction���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMUserAction(JAXBElement<String> value) {
        this.mUserAction = value;
    }

    /**
     * ��ȡmWorkCalendar���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMWorkCalendar() {
        return mWorkCalendar;
    }

    /**
     * ����mWorkCalendar���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMWorkCalendar(Long value) {
        this.mWorkCalendar = value;
    }

    /**
     * ��ȡmWorkOrg���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMWorkOrg() {
        return mWorkOrg;
    }

    /**
     * ����mWorkOrg���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMWorkOrg(Long value) {
        this.mWorkOrg = value;
    }

}
