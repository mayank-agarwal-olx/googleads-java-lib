
package com.google.api.ads.adwords.jaxws.v201607.cm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Represents a product ad (known as a <a href=
 *             "//support.google.com/adwords/answer/2456103">product
 *             listing ad</a> in the AdWords user interface). A product ad displays
 *             product data (managed using the Google Merchant Center) that is
 *             pulled from the Google base product feed specified in the parent campaign's
 *             {@linkplain ShoppingSetting shopping setting}.
 *             
 *             <p class="caution"><b>Caution:</b> Product ads do not use {@link #url url},
 *             {@link #finalUrls finalUrls}, {@link #finalMobileUrls finalMobileUrls},
 *             {@link #finalAppUrls finalAppUrls}, or {@link #displayUrl displayUrl};
 *             setting these fields on a product ad will cause an error.
 *             {@link #urlCustomParameters urlCustomParameters} and
 *             {@link #trackingUrlTemplate trackingUrlTemplate} can be set, but it is not
 *             recommended, as they will not be used; they should be set at the ad group or
 *             campaign level instead.</p>
 *             <span class="constraint AdxEnabled">This is disabled for AdX when it is contained within Operators: ADD, SET.</span>
 *           
 * 
 * <p>Java class for ProductAd complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductAd">
 *   &lt;complexContent>
 *     &lt;extension base="{https://adwords.google.com/api/adwords/cm/v201607}Ad">
 *       &lt;sequence>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductAd")
public class ProductAd
    extends Ad
{


}