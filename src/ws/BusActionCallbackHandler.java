
/**
 * BusActionCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.4  Built on : Dec 28, 2015 (10:03:39 GMT)
 */

    package ws;

    /**
     *  BusActionCallbackHandler Callback class, Users can extend this class and implement
     *  their own receiveResult and receiveError methods.
     */
    public abstract class BusActionCallbackHandler{



    protected Object clientData;

    /**
    * User can pass in any object that needs to be accessed once the NonBlocking
    * Web service call is finished and appropriate method of this CallBack is called.
    * @param clientData Object mechanism by which the user can pass in user data
    * that will be avilable at the time this callback is called.
    */
    public BusActionCallbackHandler(Object clientData){
        this.clientData = clientData;
    }

    /**
    * Please use this constructor if you don't want to set any clientData
    */
    public BusActionCallbackHandler(){
        this.clientData = null;
    }

    /**
     * Get the client data
     */

     public Object getClientData() {
        return clientData;
     }

        
           /**
            * auto generated Axis2 call back method for getBusStopByName method
            * override this method for handling normal response from getBusStopByName operation
            */
           public void receiveResultgetBusStopByName(
                    ws.BusActionStub.GetBusStopByNameResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getBusStopByName operation
           */
            public void receiveErrorgetBusStopByName(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getListBusByName method
            * override this method for handling normal response from getListBusByName operation
            */
           public void receiveResultgetListBusByName(
                    ws.BusActionStub.GetListBusByNameResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getListBusByName operation
           */
            public void receiveErrorgetListBusByName(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getNearestBusStop method
            * override this method for handling normal response from getNearestBusStop operation
            */
           public void receiveResultgetNearestBusStop(
                    ws.BusActionStub.GetNearestBusStopResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getNearestBusStop operation
           */
            public void receiveErrorgetNearestBusStop(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getBusStopOpposite method
            * override this method for handling normal response from getBusStopOpposite operation
            */
           public void receiveResultgetBusStopOpposite(
                    ws.BusActionStub.GetBusStopOppositeResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getBusStopOpposite operation
           */
            public void receiveErrorgetBusStopOpposite(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getListBusBy2Position method
            * override this method for handling normal response from getListBusBy2Position operation
            */
           public void receiveResultgetListBusBy2Position(
                    ws.BusActionStub.GetListBusBy2PositionResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getListBusBy2Position operation
           */
            public void receiveErrorgetListBusBy2Position(java.lang.Exception e) {
            }
                


    }
    