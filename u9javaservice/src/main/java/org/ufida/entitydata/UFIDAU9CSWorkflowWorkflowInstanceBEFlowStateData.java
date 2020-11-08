
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
 * &lt;p&gt;UFIDA.U9.CS.Workflow.WorkflowInstanceBE.FlowStateData complex type�� Java �ࡣ
 * 
 * &lt;p&gt;����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡcurrentStateName���Ե�ֵ��
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
     * ����currentStateName���Ե�ֵ��
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
     * ��ȡflowInstanceSKey���Ե�ֵ��
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
     * ����flowInstanceSKey���Ե�ֵ��
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
     * ��ȡmultiCurrentStateName���Ե�ֵ��
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
     * ����multiCurrentStateName���Ե�ֵ��
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
     * ��ȡpreStateSKey���Ե�ֵ��
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
     * ����preStateSKey���Ե�ֵ��
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
     * ��ȡmChildFlowInfo���Ե�ֵ��
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
     * ����mChildFlowInfo���Ե�ֵ��
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
     * ��ȡmCurrentState���Ե�ֵ��
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
     * ����mCurrentState���Ե�ֵ��
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
     * ��ȡmEndTime���Ե�ֵ��
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
     * ����mEndTime���Ե�ֵ��
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
     * ��ȡmFlowInstance���Ե�ֵ��
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
     * ����mFlowInstance���Ե�ֵ��
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
     * ��ȡmOutAction���Ե�ֵ��
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
     * ����mOutAction���Ե�ֵ��
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
     * ��ȡmPreState���Ե�ֵ��
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
     * ����mPreState���Ե�ֵ��
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
     * ��ȡmStateInfo���Ե�ֵ��
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
     * ����mStateInfo���Ե�ֵ��
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
     * ��ȡmStateQueueID���Ե�ֵ��
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
     * ����mStateQueueID���Ե�ֵ��
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
     * ��ȡmStateQueueName���Ե�ֵ��
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
     * ����mStateQueueName���Ե�ֵ��
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
     * ��ȡmStateType���Ե�ֵ��
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
     * ����mStateType���Ե�ֵ��
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
     * ��ȡmWaitingUser���Ե�ֵ��
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
     * ����mWaitingUser���Ե�ֵ��
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

}
