
package businessentity.business.ubf.ufsoft;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the businessentity.business.ubf.ufsoft package. 
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

    private final static QName _EntityKey_QNAME = new QName("UFSoft.UBF.Business.BusinessEntity", "EntityKey");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: businessentity.business.ubf.ufsoft
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link EntityKey }
     * 
     */
    public EntityKey createEntityKey() {
        return new EntityKey();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EntityKey }{@code >}
     */
    @XmlElementDecl(namespace = "UFSoft.UBF.Business.BusinessEntity", name = "EntityKey")
    public JAXBElement<EntityKey> createEntityKey(EntityKey value) {
        return new JAXBElement<EntityKey>(_EntityKey_QNAME, EntityKey.class, null, value);
    }

}
