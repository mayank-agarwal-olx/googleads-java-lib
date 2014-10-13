
package com.google.api.ads.adwords.jaxws.v201409.cm;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * 
 *       Service used to manage campaign feed links, and matching functions.
 *     
 * 
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.1
 * 
 */
@WebService(name = "CampaignFeedServiceInterface", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201409")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface CampaignFeedServiceInterface {


    /**
     * 
     *         Returns a list of CampaignFeeds that meet the selector criteria.
     *         
     *         @param selector Determines which CampaignFeeds to return. If empty all
     *         Campaign feeds are returned.
     *         @return The list of CampaignFeeds.
     *         @throws ApiException Indicates a problem with the request.
     *       
     * 
     * @param selector
     * @return
     *     returns com.google.api.ads.adwords.jaxws.v201409.cm.CampaignFeedPage
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201409")
    @RequestWrapper(localName = "get", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201409", className = "com.google.api.ads.adwords.jaxws.v201409.cm.CampaignFeedServiceInterfaceget")
    @ResponseWrapper(localName = "getResponse", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201409", className = "com.google.api.ads.adwords.jaxws.v201409.cm.CampaignFeedServiceInterfacegetResponse")
    public CampaignFeedPage get(
        @WebParam(name = "selector", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201409")
        Selector selector)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Adds, sets or removes CampaignFeeds.
     *         
     *         @param operations The operations to apply.
     *         @return The resulting Feeds.
     *         @throws ApiException Indicates a problem with the request.
     *       
     * 
     * @param operations
     * @return
     *     returns com.google.api.ads.adwords.jaxws.v201409.cm.CampaignFeedReturnValue
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201409")
    @RequestWrapper(localName = "mutate", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201409", className = "com.google.api.ads.adwords.jaxws.v201409.cm.CampaignFeedServiceInterfacemutate")
    @ResponseWrapper(localName = "mutateResponse", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201409", className = "com.google.api.ads.adwords.jaxws.v201409.cm.CampaignFeedServiceInterfacemutateResponse")
    public CampaignFeedReturnValue mutate(
        @WebParam(name = "operations", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201409")
        List<CampaignFeedOperation> operations)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Returns a list of {@link CampaignFeed}s inside a {@link CampaignFeedPage} that matches
     *         the query.
     *         
     *         @param query The SQL-like AWQL query string.
     *         @throws ApiException when there are one or more errors with the request.
     *       
     * 
     * @param query
     * @return
     *     returns com.google.api.ads.adwords.jaxws.v201409.cm.CampaignFeedPage
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201409")
    @RequestWrapper(localName = "query", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201409", className = "com.google.api.ads.adwords.jaxws.v201409.cm.CampaignFeedServiceInterfacequery")
    @ResponseWrapper(localName = "queryResponse", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201409", className = "com.google.api.ads.adwords.jaxws.v201409.cm.CampaignFeedServiceInterfacequeryResponse")
    public CampaignFeedPage query(
        @WebParam(name = "query", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201409")
        String query)
        throws ApiException_Exception
    ;

}
