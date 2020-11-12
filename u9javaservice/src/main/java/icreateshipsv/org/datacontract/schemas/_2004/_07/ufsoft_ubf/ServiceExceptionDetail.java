
package icreateshipsv.org.datacontract.schemas._2004._07.ufsoft_ubf;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;

import icreateshipsv.org.datacontract.schemas._2004._07.system.ExceptionDetail;
import icreateshipsv.org.datacontract.schemas._2004._07.ufsoft.ExceptionBase;


/**
 * &lt;p&gt;ServiceExceptionDetail complex type的 Java 类。
 * 
 * &lt;p&gt;以下模式片段指定包含在此类中的预期内容。
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="ServiceExceptionDetail"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://schemas.datacontract.org/2004/07/System.ServiceModel}ExceptionDetail"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="Exception" type="{http://schemas.datacontract.org/2004/07/UFSoft.UBF}ExceptionBase" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceExceptionDetail", namespace = "http://schemas.datacontract.org/2004/07/UFSoft.UBF.Service", propOrder = {
    "exception"
})
public class ServiceExceptionDetail
    extends ExceptionDetail
{

    @XmlElementRef(name = "Exception", namespace = "http://schemas.datacontract.org/2004/07/UFSoft.UBF.Service", type = JAXBElement.class, required = false)
    protected JAXBElement<ExceptionBase> exception;

    /**
     * 获取exception属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ExceptionBase }{@code >}
     *     
     */
    public JAXBElement<ExceptionBase> getException() {
        return exception;
    }

    /**
     * 设置exception属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ExceptionBase }{@code >}
     *     
     */
    public void setException(JAXBElement<ExceptionBase> value) {
        this.exception = value;
    }

}
