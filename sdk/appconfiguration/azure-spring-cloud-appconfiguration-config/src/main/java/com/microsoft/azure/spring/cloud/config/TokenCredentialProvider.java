// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
package com.microsoft.azure.spring.cloud.config;

import com.azure.core.credential.TokenCredential;

public interface TokenCredentialProvider {

    TokenCredential credentialForAppConfig(String uri);

    TokenCredential credentialForKeyVault(String uri);

}
