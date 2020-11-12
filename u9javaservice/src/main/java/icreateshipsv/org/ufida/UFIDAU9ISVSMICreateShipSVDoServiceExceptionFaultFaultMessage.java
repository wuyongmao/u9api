
package icreateshipsv.org.ufida;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.4.0
 * 2020-11-11T11:45:24.940+08:00
 * Generated source version: 3.4.0
 */

@WebFault(name = "ServiceException", targetNamespace = "http://schemas.datacontract.org/2004/07/UFSoft.UBF.Service")
public class UFIDAU9ISVSMICreateShipSVDoServiceExceptionFaultFaultMessage extends Exception {

    private icreateshipsv.org.datacontract.schemas._2004._07.ufsoft_ubf.ServiceException serviceException;

    public UFIDAU9ISVSMICreateShipSVDoServiceExceptionFaultFaultMessage() {
        super();
    }

    public UFIDAU9ISVSMICreateShipSVDoServiceExceptionFaultFaultMessage(String message) {
        super(message);
    }

    public UFIDAU9ISVSMICreateShipSVDoServiceExceptionFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public UFIDAU9ISVSMICreateShipSVDoServiceExceptionFaultFaultMessage(String message, icreateshipsv.org.datacontract.schemas._2004._07.ufsoft_ubf.ServiceException serviceException) {
        super(message);
        this.serviceException = serviceException;
    }

    public UFIDAU9ISVSMICreateShipSVDoServiceExceptionFaultFaultMessage(String message, icreateshipsv.org.datacontract.schemas._2004._07.ufsoft_ubf.ServiceException serviceException, Throwable cause) {
        super(message, cause);
        this.serviceException = serviceException;
    }

    public icreateshipsv.org.datacontract.schemas._2004._07.ufsoft_ubf.ServiceException getFaultInfo() {
        return this.serviceException;
    }
}
