
package icreateshipsv.org.ufida.entitydata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;UFIDA.U9.CBO.SCM.Package.ItemAttributeData complex type的 Java 类。
 * 
 * &lt;p&gt;以下模式片段指定包含在此类中的预期内容。
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="UFIDA.U9.CBO.SCM.Package.ItemAttributeData"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://www.UFIDA.org/EntityData}UFSoft.UBF.Business.DataTransObjectBase"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="m_code" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_grade" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_lot" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_manufacturer" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_potency" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_project" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_seiban" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_sn" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_version" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UFIDA.U9.CBO.SCM.Package.ItemAttributeData", propOrder = {
    "mCode",
    "mGrade",
    "mLot",
    "mManufacturer",
    "mPotency",
    "mProject",
    "mSeiban",
    "mSn",
    "mVersion"
})
public class UFIDAU9CBOSCMPackageItemAttributeData
    extends UFSoftUBFBusinessDataTransObjectBase
{

    @XmlElement(name = "m_code")
    protected Boolean mCode;
    @XmlElement(name = "m_grade")
    protected Boolean mGrade;
    @XmlElement(name = "m_lot")
    protected Boolean mLot;
    @XmlElement(name = "m_manufacturer")
    protected Boolean mManufacturer;
    @XmlElement(name = "m_potency")
    protected Boolean mPotency;
    @XmlElement(name = "m_project")
    protected Boolean mProject;
    @XmlElement(name = "m_seiban")
    protected Boolean mSeiban;
    @XmlElement(name = "m_sn")
    protected Boolean mSn;
    @XmlElement(name = "m_version")
    protected Boolean mVersion;

    /**
     * 获取mCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMCode() {
        return mCode;
    }

    /**
     * 设置mCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMCode(Boolean value) {
        this.mCode = value;
    }

    /**
     * 获取mGrade属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMGrade() {
        return mGrade;
    }

    /**
     * 设置mGrade属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMGrade(Boolean value) {
        this.mGrade = value;
    }

    /**
     * 获取mLot属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMLot() {
        return mLot;
    }

    /**
     * 设置mLot属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMLot(Boolean value) {
        this.mLot = value;
    }

    /**
     * 获取mManufacturer属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMManufacturer() {
        return mManufacturer;
    }

    /**
     * 设置mManufacturer属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMManufacturer(Boolean value) {
        this.mManufacturer = value;
    }

    /**
     * 获取mPotency属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMPotency() {
        return mPotency;
    }

    /**
     * 设置mPotency属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMPotency(Boolean value) {
        this.mPotency = value;
    }

    /**
     * 获取mProject属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMProject() {
        return mProject;
    }

    /**
     * 设置mProject属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMProject(Boolean value) {
        this.mProject = value;
    }

    /**
     * 获取mSeiban属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMSeiban() {
        return mSeiban;
    }

    /**
     * 设置mSeiban属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMSeiban(Boolean value) {
        this.mSeiban = value;
    }

    /**
     * 获取mSn属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMSn() {
        return mSn;
    }

    /**
     * 设置mSn属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMSn(Boolean value) {
        this.mSn = value;
    }

    /**
     * 获取mVersion属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMVersion() {
        return mVersion;
    }

    /**
     * 设置mVersion属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMVersion(Boolean value) {
        this.mVersion = value;
    }

}
