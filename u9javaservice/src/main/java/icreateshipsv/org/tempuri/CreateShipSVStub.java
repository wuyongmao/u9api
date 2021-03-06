package icreateshipsv.org.tempuri;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;

import icreateshipsv.org.ufida.UFIDAU9ISVSMICreateShipSV;

import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.4.0
 * 2020-11-11T11:45:25.303+08:00
 * Generated source version: 3.4.0
 *
 */
@WebServiceClient(name = "CreateShipSVStub",
                  wsdlLocation = "http://36.154.167.2:9000/u9/services/UFIDA.U9.ISV.SM.ICreateShipSV.svc?wsdl",
                  targetNamespace = "http://tempuri.org/")
public class CreateShipSVStub extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://tempuri.org/", "CreateShipSVStub");
    public final static QName BasicHttpBindingUFIDAU9ISVSMICreateShipSV = new QName("http://tempuri.org/", "BasicHttpBinding_UFIDA.U9.ISV.SM.ICreateShipSV");
    static {
        URL url = null;
        try {
            url = new URL("http://36.154.167.2:9000/u9/services/UFIDA.U9.ISV.SM.ICreateShipSV.svc?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(CreateShipSVStub.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "http://36.154.167.2:9000/u9/services/UFIDA.U9.ISV.SM.ICreateShipSV.svc?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public CreateShipSVStub(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public CreateShipSVStub(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public CreateShipSVStub() {
        super(WSDL_LOCATION, SERVICE);
    }

    public CreateShipSVStub(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public CreateShipSVStub(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public CreateShipSVStub(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns UFIDAU9ISVSMICreateShipSV
     */
    @WebEndpoint(name = "BasicHttpBinding_UFIDA.U9.ISV.SM.ICreateShipSV")
    public UFIDAU9ISVSMICreateShipSV getBasicHttpBindingUFIDAU9ISVSMICreateShipSV() {
        return super.getPort(BasicHttpBindingUFIDAU9ISVSMICreateShipSV, UFIDAU9ISVSMICreateShipSV.class);
    }

    /**
     *
     * @param features
     *     A list of {@link WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns UFIDAU9ISVSMICreateShipSV
     */
    @WebEndpoint(name = "BasicHttpBinding_UFIDA.U9.ISV.SM.ICreateShipSV")
    public UFIDAU9ISVSMICreateShipSV getBasicHttpBindingUFIDAU9ISVSMICreateShipSV(WebServiceFeature... features) {
        return super.getPort(BasicHttpBindingUFIDAU9ISVSMICreateShipSV, UFIDAU9ISVSMICreateShipSV.class, features);
    }

}
