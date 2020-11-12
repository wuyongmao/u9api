
package icreateshipsv.org.datacontract.schemas._2004._07.ufsoft;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

import icreateshipsv.org.datacontract.schemas._2004._07.system.Exception;
import icreateshipsv.org.datacontract.schemas._2004._07.ufsoft_ubf.BusinessException;
import icreateshipsv.org.datacontract.schemas._2004._07.ufsoft_ubf.ServiceException;
import icreateshipsv.org.datacontract.schemas._2004._07.ufsoft_ubf.ServiceLostException;


/**
 * &lt;p&gt;ExceptionBase complex type的 Java 类。
 * 
 * &lt;p&gt;以下模式片段指定包含在此类中的预期内容。
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="ExceptionBase"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://schemas.datacontract.org/2004/07/System}Exception"&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExceptionBase")
@XmlSeeAlso({
    BusinessException.class,
    UnknownException.class,
    ServiceLostException.class,
    ServiceException.class
})
public class ExceptionBase
    extends Exception
{


}
