
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
 * &lt;p&gt;UFIDA.U9.CS.Workflow.WorkflowInstanceBE.WaitingUserData complex type的 Java 类。
 * 
 * &lt;p&gt;以下模式片段指定包含在此类中的预期内容。
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
     * 获取addAssignUserSKey属性的值。
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
     * 设置addAssignUserSKey属性的值。
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
     * 获取assignUserSKey属性的值。
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
     * 设置assignUserSKey属性的值。
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
     * 获取flowStateSKey属性的值。
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
     * 设置flowStateSKey属性的值。
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
     * 获取mAddAssignUser属性的值。
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
     * 设置mAddAssignUser属性的值。
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
     * 获取mAssignTime属性的值。
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
     * 设置mAssignTime属性的值。
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
     * 获取mAssignUser属性的值。
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
     * 设置mAssignUser属性的值。
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
     * 获取mBusinessOrg属性的值。
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
     * 设置mBusinessOrg属性的值。
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
     * 获取mCompletePercent属性的值。
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
     * 设置mCompletePercent属性的值。
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
     * 获取mDeptID属性的值。
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
     * 设置mDeptID属性的值。
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
     * 获取mDoFlag属性的值。
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
     * 设置mDoFlag属性的值。
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
     * 获取mDoMode属性的值。
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
     * 设置mDoMode属性的值。
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
     * 获取mExcludeSourceUser属性的值。
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
     * 设置mExcludeSourceUser属性的值。
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
     * 获取mExcludeStartUser属性的值。
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
     * 设置mExcludeStartUser属性的值。
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
     * 获取mExpireTime属性的值。
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
     * 设置mExpireTime属性的值。
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
     * 获取mFinishTime属性的值。
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
     * 设置mFinishTime属性的值。
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
     * 获取mFlowState属性的值。
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
     * 设置mFlowState属性的值。
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
     * 获取mOperatorID属性的值。
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
     * 设置mOperatorID属性的值。
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
     * 获取mOrderID属性的值。
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
     * 设置mOrderID属性的值。
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
     * 获取mProcessTrack属性的值。
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
     * 设置mProcessTrack属性的值。
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
     * 获取mRealExpireTime属性的值。
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
     * 设置mRealExpireTime属性的值。
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
     * 获取mReceiveMessageType属性的值。
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
     * 设置mReceiveMessageType属性的值。
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
     * 获取mTimeLimit属性的值。
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
     * 设置mTimeLimit属性的值。
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
     * 获取muCode属性的值。
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
     * 设置muCode属性的值。
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
     * 获取muid属性的值。
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
     * 设置muid属性的值。
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
     * 获取muType属性的值。
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
     * 设置muType属性的值。
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
     * 获取mUserAction属性的值。
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
     * 设置mUserAction属性的值。
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
     * 获取mWorkCalendar属性的值。
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
     * 设置mWorkCalendar属性的值。
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
     * 获取mWorkOrg属性的值。
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
     * 设置mWorkOrg属性的值。
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
