
package org.ufida;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.4.0
 * 2020-11-04T17:17:31.556+08:00
 * Generated source version: 3.4.0
 */

@WebFault(name = "ExceptionBase", targetNamespace = "http://schemas.datacontract.org/2004/07/UFSoft.UBF")
public class UFIDAU9ISVRCVICreateRCVSRVDoExceptionBaseFaultFaultMessage extends java.lang.Exception {

    private org.datacontract.schemas._2004._07.ufsoft.ExceptionBase exceptionBase;

    public UFIDAU9ISVRCVICreateRCVSRVDoExceptionBaseFaultFaultMessage() {
        super();
    }

    public UFIDAU9ISVRCVICreateRCVSRVDoExceptionBaseFaultFaultMessage(String message) {
        super(message);
    }

    public UFIDAU9ISVRCVICreateRCVSRVDoExceptionBaseFaultFaultMessage(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public UFIDAU9ISVRCVICreateRCVSRVDoExceptionBaseFaultFaultMessage(String message, org.datacontract.schemas._2004._07.ufsoft.ExceptionBase exceptionBase) {
        super(message);
        this.exceptionBase = exceptionBase;
    }

    public UFIDAU9ISVRCVICreateRCVSRVDoExceptionBaseFaultFaultMessage(String message, org.datacontract.schemas._2004._07.ufsoft.ExceptionBase exceptionBase, java.lang.Throwable cause) {
        super(message, cause);
        this.exceptionBase = exceptionBase;
    }

    public org.datacontract.schemas._2004._07.ufsoft.ExceptionBase getFaultInfo() {
        return this.exceptionBase;
    }
}
