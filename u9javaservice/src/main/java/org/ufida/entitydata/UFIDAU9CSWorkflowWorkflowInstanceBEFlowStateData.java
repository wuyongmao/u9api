
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
 * &lt;p&gt;UFIDA.U9.CS.Workflow.WorkflowInstanceBE.FlowStateData complex type的 Java 类。
 * 
 * &lt;p&gt;以下模式片段指定包含在此类中的预期内容。
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="UFIDA.U9.CS.Workflow.WorkflowInstanceBE.FlowStateData"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://www.UFIDA.org/EntityData}UFSoft.UBF.Business.DataTransObjectBase"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="CurrentStateName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="FlowInstance_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Multi_CurrentStateName" type="{UFSoft.UBF.Util.Data}MultiLangDataDict" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="PreState_SKey" type="{UFSoft.UBF.Business.BusinessEntity}EntityKey" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_childFlowInfo" type="{http://www.UFIDA.org/EntityData}ArrayOfUFIDA.U9.CS.Workflow.WorkflowInstanceBE.ChildFlowInfoData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_createdBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_createdOn" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_currentState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_doMode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_endTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_expireTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_flowInstance" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CS.Workflow.WorkflowInstanceBE.FlowInstanceData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_iD" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_modifiedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_modifiedOn" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_outAction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_preState" type="{http://www.UFIDA.org/EntityData}UFIDA.U9.CS.Workflow.WorkflowInstanceBE.FlowStateData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_startTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_stateInfo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_stateQueueID" type="{http://schemas.microsoft.com/2003/10/Serialization/}guid" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_stateQueueName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_stateType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_sysVersion" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_timeLimit" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_waitingUser" type="{http://www.UFIDA.org/EntityData}ArrayOfUFIDA.U9.CS.Workflow.WorkflowInstanceBE.WaitingUserData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_workCalendar" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UFIDA.U9.CS.Workflow.WorkflowInstanceBE.FlowStateData", propOrder = {
    "currentStateName",
    "flowInstanceSKey",
    "multiCurrentStateName",
    "preStateSKey",
    "mChildFlowInfo",
    "mCreatedBy",
    "mCreatedOn",
    "mCurrentState",
    "mDoMode",
    "mEndTime",
    "mExpireTime",
    "mFlowInstance",
    "mid",
    "mModifiedBy",
    "mModifiedOn",
    "mOutAction",
    "mPreState",
    "mStartTime",
    "mStateInfo",
    "mStateQueueID",
    "mStateQueueName",
    "mStateType",
    "mSysVersion",
    "mTimeLimit",
    "mWaitingUser",
    "mWorkCalendar"
})
public class UFIDAU9CSWorkflowWorkflowInstanceBEFlowStateData
    extends UFSoftUBFBusinessDataTransObjectBase
{

    @XmlElementRef(name = "CurrentStateName", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> currentStateName;
    @XmlElementRef(name = "FlowInstance_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> flowInstanceSKey;
    @XmlElementRef(name = "Multi_CurrentStateName", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<MultiLangDataDict> multiCurrentStateName;
    @XmlElementRef(name = "PreState_SKey", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityKey> preStateSKey;
    @XmlElementRef(name = "m_childFlowInfo", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfUFIDAU9CSWorkflowWorkflowInstanceBEChildFlowInfoData> mChildFlowInfo;
    @XmlElementRef(name = "m_createdBy", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mCreatedBy;
    @XmlElement(name = "m_createdOn")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mCreatedOn;
    @XmlElementRef(name = "m_currentState", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mCurrentState;
    @XmlElement(name = "m_doMode")
    protected Integer mDoMode;
    @XmlElement(name = "m_endTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mEndTime;
    @XmlElement(name = "m_expireTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mExpireTime;
    @XmlElementRef(name = "m_flowInstance", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9CSWorkflowWorkflowInstanceBEFlowInstanceData> mFlowInstance;
    @XmlElement(name = "m_iD")
    protected Long mid;
    @XmlElementRef(name = "m_modifiedBy", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mModifiedBy;
    @XmlElement(name = "m_modifiedOn")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mModifiedOn;
    @XmlElementRef(name = "m_outAction", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mOutAction;
    @XmlElementRef(name = "m_preState", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<UFIDAU9CSWorkflowWorkflowInstanceBEFlowStateData> mPreState;
    @XmlElement(name = "m_startTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mStartTime;
    @XmlElement(name = "m_stateInfo")
    protected Integer mStateInfo;
    @XmlElement(name = "m_stateQueueID")
    protected String mStateQueueID;
    @XmlElementRef(name = "m_stateQueueName", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mStateQueueName;
    @XmlElement(name = "m_stateType")
    protected Integer mStateType;
    @XmlElement(name = "m_sysVersion")
    protected Long mSysVersion;
    @XmlElement(name = "m_timeLimit")
    protected Float mTimeLimit;
    @XmlElementRef(name = "m_waitingUser", namespace = "http://www.UFIDA.org/EntityData", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfUFIDAU9CSWorkflowWorkflowInstanceBEWaitingUserData> mWaitingUser;
    @XmlElement(name = "m_workCalendar")
    protected Long mWorkCalendar;

    /**
     * 获取currentStateName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCurrentStateName() {
        return currentStateName;
    }

    /**
     * 设置currentStateName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCurrentStateName(JAXBElement<String> value) {
        this.currentStateName = value;
    }

    /**
     * 获取flowInstanceSKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getFlowInstanceSKey() {
        return flowInstanceSKey;
    }

    /**
     * 设置flowInstanceSKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setFlowInstanceSKey(JAXBElement<EntityKey> value) {
        this.flowInstanceSKey = value;
    }

    /**
     * 获取multiCurrentStateName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MultiLangDataDict }{@code >}
     *     
     */
    public JAXBElement<MultiLangDataDict> getMultiCurrentStateName() {
        return multiCurrentStateName;
    }

    /**
     * 设置multiCurrentStateName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MultiLangDataDict }{@code >}
     *     
     */
    public void setMultiCurrentStateName(JAXBElement<MultiLangDataDict> value) {
        this.multiCurrentStateName = value;
    }

    /**
     * 获取preStateSKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public JAXBElement<EntityKey> getPreStateSKey() {
        return preStateSKey;
    }

    /**
     * 设置preStateSKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     *     
     */
    public void setPreStateSKey(JAXBElement<EntityKey> value) {
        this.preStateSKey = value;
    }

    /**
     * 获取mChildFlowInfo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUFIDAU9CSWorkflowWorkflowInstanceBEChildFlowInfoData }{@code >}
     *     
     */
    public JAXBElement<ArrayOfUFIDAU9CSWorkflowWorkflowInstanceBEChildFlowInfoData> getMChildFlowInfo() {
        return mChildFlowInfo;
    }

    /**
     * 设置mChildFlowInfo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUFIDAU9CSWorkflowWorkflowInstanceBEChildFlowInfoData }{@code >}
     *     
     */
    public void setMChildFlowInfo(JAXBElement<ArrayOfUFIDAU9CSWorkflowWorkflowInstanceBEChildFlowInfoData> value) {
        this.mChildFlowInfo = value;
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
     * 获取mCurrentState属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMCurrentState() {
        return mCurrentState;
    }

    /**
     * 设置mCurrentState属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMCurrentState(JAXBElement<String> value) {
        this.mCurrentState = value;
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
     * 获取mEndTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMEndTime() {
        return mEndTime;
    }

    /**
     * 设置mEndTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMEndTime(XMLGregorianCalendar value) {
        this.mEndTime = value;
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
     * 获取mFlowInstance属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CSWorkflowWorkflowInstanceBEFlowInstanceData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9CSWorkflowWorkflowInstanceBEFlowInstanceData> getMFlowInstance() {
        return mFlowInstance;
    }

    /**
     * 设置mFlowInstance属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CSWorkflowWorkflowInstanceBEFlowInstanceData }{@code >}
     *     
     */
    public void setMFlowInstance(JAXBElement<UFIDAU9CSWorkflowWorkflowInstanceBEFlowInstanceData> value) {
        this.mFlowInstance = value;
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
     * 获取mOutAction属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMOutAction() {
        return mOutAction;
    }

    /**
     * 设置mOutAction属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMOutAction(JAXBElement<String> value) {
        this.mOutAction = value;
    }

    /**
     * 获取mPreState属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CSWorkflowWorkflowInstanceBEFlowStateData }{@code >}
     *     
     */
    public JAXBElement<UFIDAU9CSWorkflowWorkflowInstanceBEFlowStateData> getMPreState() {
        return mPreState;
    }

    /**
     * 设置mPreState属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UFIDAU9CSWorkflowWorkflowInstanceBEFlowStateData }{@code >}
     *     
     */
    public void setMPreState(JAXBElement<UFIDAU9CSWorkflowWorkflowInstanceBEFlowStateData> value) {
        this.mPreState = value;
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
     * 获取mStateInfo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMStateInfo() {
        return mStateInfo;
    }

    /**
     * 设置mStateInfo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMStateInfo(Integer value) {
        this.mStateInfo = value;
    }

    /**
     * 获取mStateQueueID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMStateQueueID() {
        return mStateQueueID;
    }

    /**
     * 设置mStateQueueID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMStateQueueID(String value) {
        this.mStateQueueID = value;
    }

    /**
     * 获取mStateQueueName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMStateQueueName() {
        return mStateQueueName;
    }

    /**
     * 设置mStateQueueName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMStateQueueName(JAXBElement<String> value) {
        this.mStateQueueName = value;
    }

    /**
     * 获取mStateType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMStateType() {
        return mStateType;
    }

    /**
     * 设置mStateType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMStateType(Integer value) {
        this.mStateType = value;
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
     * 获取mWaitingUser属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUFIDAU9CSWorkflowWorkflowInstanceBEWaitingUserData }{@code >}
     *     
     */
    public JAXBElement<ArrayOfUFIDAU9CSWorkflowWorkflowInstanceBEWaitingUserData> getMWaitingUser() {
        return mWaitingUser;
    }

    /**
     * 设置mWaitingUser属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUFIDAU9CSWorkflowWorkflowInstanceBEWaitingUserData }{@code >}
     *     
     */
    public void setMWaitingUser(JAXBElement<ArrayOfUFIDAU9CSWorkflowWorkflowInstanceBEWaitingUserData> value) {
        this.mWaitingUser = value;
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

}
