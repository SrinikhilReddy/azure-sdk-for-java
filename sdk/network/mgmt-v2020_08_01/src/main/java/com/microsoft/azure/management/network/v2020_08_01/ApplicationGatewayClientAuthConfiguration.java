/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_08_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Application gateway client authentication configuration.
 */
public class ApplicationGatewayClientAuthConfiguration {
    /**
     * Verify client certificate issuer name on the application gateway.
     */
    @JsonProperty(value = "verifyClientCertIssuerDN")
    private Boolean verifyClientCertIssuerDN;

    /**
     * Get verify client certificate issuer name on the application gateway.
     *
     * @return the verifyClientCertIssuerDN value
     */
    public Boolean verifyClientCertIssuerDN() {
        return this.verifyClientCertIssuerDN;
    }

    /**
     * Set verify client certificate issuer name on the application gateway.
     *
     * @param verifyClientCertIssuerDN the verifyClientCertIssuerDN value to set
     * @return the ApplicationGatewayClientAuthConfiguration object itself.
     */
    public ApplicationGatewayClientAuthConfiguration withVerifyClientCertIssuerDN(Boolean verifyClientCertIssuerDN) {
        this.verifyClientCertIssuerDN = verifyClientCertIssuerDN;
        return this;
    }

}
