
/**
 * PlaceSellTicketActionClassNotFoundExceptionException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.4  Built on : Dec 28, 2015 (10:03:39 GMT)
 */

package ws;

public class PlaceSellTicketActionClassNotFoundExceptionException extends java.lang.Exception{

    private static final long serialVersionUID = 1458359063398L;
    
    private ws.PlaceSellTicketActionStub.PlaceSellTicketActionClassNotFoundException faultMessage;

    
        public PlaceSellTicketActionClassNotFoundExceptionException() {
            super("PlaceSellTicketActionClassNotFoundExceptionException");
        }

        public PlaceSellTicketActionClassNotFoundExceptionException(java.lang.String s) {
           super(s);
        }

        public PlaceSellTicketActionClassNotFoundExceptionException(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public PlaceSellTicketActionClassNotFoundExceptionException(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(ws.PlaceSellTicketActionStub.PlaceSellTicketActionClassNotFoundException msg){
       faultMessage = msg;
    }
    
    public ws.PlaceSellTicketActionStub.PlaceSellTicketActionClassNotFoundException getFaultMessage(){
       return faultMessage;
    }
}
    