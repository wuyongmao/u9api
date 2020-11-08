
package org.ufida;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import exceptions.ubf.ufsoft.ArrayOfMessageBase;
import org.ufida.entitydata.ArrayOfUFIDAU9ISVRCVDTOOBAReceivementDTOData;
import org.ufida.entitydata.ArrayOfUFIDAU9PMRcvReceivementData;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.ufida package. 
 * &lt;p&gt;An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _DoContext_QNAME = new QName("http://www.UFIDA.org", "context");
    private final static QName _DoRCVList_QNAME = new QName("http://www.UFIDA.org", "rCVList");
    private final static QName _DoResponseDoResult_QNAME = new QName("http://www.UFIDA.org", "DoResult");
    private final static QName _DoResponseOutMessages_QNAME = new QName("http://www.UFIDA.org", "outMessages");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.ufida
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Do }
     * 
     */
    public Do createDo() {
        return new Do();
    }

    /**
     * Create an instance of {@link DoResponse }
     * 
     */
    public DoResponse createDoResponse() {
        return new DoResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.UFIDA.org", name = "context", scope = Do.class)
    public JAXBElement<Object> createDoContext(Object value) {
        return new JAXBElement<Object>(_DoContext_QNAME, Object.class, Do.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfUFIDAU9ISVRCVDTOOBAReceivementDTOData }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfUFIDAU9ISVRCVDTOOBAReceivementDTOData }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.UFIDA.org", name = "rCVList", scope = Do.class)
    public JAXBElement<ArrayOfUFIDAU9ISVRCVDTOOBAReceivementDTOData> createDoRCVList(ArrayOfUFIDAU9ISVRCVDTOOBAReceivementDTOData value) {
        return new JAXBElement<ArrayOfUFIDAU9ISVRCVDTOOBAReceivementDTOData>(_DoRCVList_QNAME, ArrayOfUFIDAU9ISVRCVDTOOBAReceivementDTOData.class, Do.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfUFIDAU9PMRcvReceivementData }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfUFIDAU9PMRcvReceivementData }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.UFIDA.org", name = "DoResult", scope = DoResponse.class)
    public JAXBElement<ArrayOfUFIDAU9PMRcvReceivementData> createDoResponseDoResult(ArrayOfUFIDAU9PMRcvReceivementData value) {
        return new JAXBElement<ArrayOfUFIDAU9PMRcvReceivementData>(_DoResponseDoResult_QNAME, ArrayOfUFIDAU9PMRcvReceivementData.class, DoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfMessageBase }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfMessageBase }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.UFIDA.org", name = "outMessages", scope = DoResponse.class)
    public JAXBElement<ArrayOfMessageBase> createDoResponseOutMessages(ArrayOfMessageBase value) {
        return new JAXBElement<ArrayOfMessageBase>(_DoResponseOutMessages_QNAME, ArrayOfMessageBase.class, DoResponse.class, value);
    }

}
