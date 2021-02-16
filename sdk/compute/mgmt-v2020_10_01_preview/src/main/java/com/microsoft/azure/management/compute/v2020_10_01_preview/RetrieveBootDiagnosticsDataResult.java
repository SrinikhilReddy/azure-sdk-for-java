/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2020_10_01_preview;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.compute.v2020_10_01_preview.implementation.ComputeManager;
import com.microsoft.azure.management.compute.v2020_10_01_preview.implementation.RetrieveBootDiagnosticsDataResultInner;

/**
 * Type representing RetrieveBootDiagnosticsDataResult.
 */
public interface RetrieveBootDiagnosticsDataResult extends HasInner<RetrieveBootDiagnosticsDataResultInner>, HasManager<ComputeManager> {
    /**
     * @return the consoleScreenshotBlobUri value.
     */
    String consoleScreenshotBlobUri();

    /**
     * @return the serialConsoleLogBlobUri value.
     */
    String serialConsoleLogBlobUri();

}
