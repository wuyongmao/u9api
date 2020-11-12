
package icreateshipsv.org.ufida.entitydata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;UFIDA.U9.Base.PropertyTypes.RoundData complex type的 Java 类。
 * 
 * &lt;p&gt;以下模式片段指定包含在此类中的预期内容。
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="UFIDA.U9.Base.PropertyTypes.RoundData"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://www.UFIDA.org/EntityData}UFSoft.UBF.Business.DataTransObjectBase"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="m_precision" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_roundType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="m_roundValue" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UFIDA.U9.Base.PropertyTypes.RoundData", propOrder = {
    "mPrecision",
    "mRoundType",
    "mRoundValue"
})
public class UFIDAU9BasePropertyTypesRoundData
    extends UFSoftUBFBusinessDataTransObjectBase
{

    @XmlElement(name = "m_precision")
    protected Integer mPrecision;
    @XmlElement(name = "m_roundType")
    protected Integer mRoundType;
    @XmlElement(name = "m_roundValue")
    protected Integer mRoundValue;

    /**
     * 获取mPrecision属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMPrecision() {
        return mPrecision;
    }

    /**
     * 设置mPrecision属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMPrecision(Integer value) {
        this.mPrecision = value;
    }

    /**
     * 获取mRoundType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMRoundType() {
        return mRoundType;
    }

    /**
     * 设置mRoundType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMRoundType(Integer value) {
        this.mRoundType = value;
    }

    /**
     * 获取mRoundValue属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMRoundValue() {
        return mRoundValue;
    }

    /**
     * 设置mRoundValue属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMRoundValue(Integer value) {
        this.mRoundValue = value;
    }

}
