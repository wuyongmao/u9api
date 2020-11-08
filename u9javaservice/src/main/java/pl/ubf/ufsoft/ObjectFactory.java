
package pl.ubf.ufsoft;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the pl.ubf.ufsoft package. 
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

    private final static QName _ObjectKeyX_QNAME = new QName("UFSoft.UBF.PL", "ObjectKeyX");
    private final static QName _ObjectKeyXEntityType_QNAME = new QName("UFSoft.UBF.PL", "EntityType");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: pl.ubf.ufsoft
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ObjectKeyX }
     * 
     */
    public ObjectKeyX createObjectKeyX() {
        return new ObjectKeyX();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObjectKeyX }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ObjectKeyX }{@code >}
     */
    @XmlElementDecl(namespace = "UFSoft.UBF.PL", name = "ObjectKeyX")
    public JAXBElement<ObjectKeyX> createObjectKeyX(ObjectKeyX value) {
        return new JAXBElement<ObjectKeyX>(_ObjectKeyX_QNAME, ObjectKeyX.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "UFSoft.UBF.PL", name = "EntityType", scope = ObjectKeyX.class)
    public JAXBElement<String> createObjectKeyXEntityType(String value) {
        return new JAXBElement<String>(_ObjectKeyXEntityType_QNAME, String.class, ObjectKeyX.class, value);
    }

}
