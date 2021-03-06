/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2020_10_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The instance view of a virtual machine boot diagnostics.
 */
public class BootDiagnosticsInstanceView {
    /**
     * The console screenshot blob URI. &lt;br&gt;&lt;br&gt;NOTE: This will
     * **not** be set if boot diagnostics is currently enabled with managed
     * storage.
     */
    @JsonProperty(value = "consoleScreenshotBlobUri", access = JsonProperty.Access.WRITE_ONLY)
    private String consoleScreenshotBlobUri;

    /**
     * The serial console log blob Uri. &lt;br&gt;&lt;br&gt;NOTE: This will
     * **not** be set if boot diagnostics is currently enabled with managed
     * storage.
     */
    @JsonProperty(value = "serialConsoleLogBlobUri", access = JsonProperty.Access.WRITE_ONLY)
    private String serialConsoleLogBlobUri;

    /**
     * The boot diagnostics status information for the VM. &lt;br&gt;&lt;br&gt;
     * NOTE: It will be set only if there are errors encountered in enabling
     * boot diagnostics.
     */
    @JsonProperty(value = "status", access = JsonProperty.Access.WRITE_ONLY)
    private InstanceViewStatus status;

    /**
     * Get the console screenshot blob URI. &lt;br&gt;&lt;br&gt;NOTE: This will **not** be set if boot diagnostics is currently enabled with managed storage.
     *
     * @return the consoleScreenshotBlobUri value
     */
    public String consoleScreenshotBlobUri() {
        return this.consoleScreenshotBlobUri;
    }

    /**
     * Get the serial console log blob Uri. &lt;br&gt;&lt;br&gt;NOTE: This will **not** be set if boot diagnostics is currently enabled with managed storage.
     *
     * @return the serialConsoleLogBlobUri value
     */
    public String serialConsoleLogBlobUri() {
        return this.serialConsoleLogBlobUri;
    }

    /**
     * Get the boot diagnostics status information for the VM. &lt;br&gt;&lt;br&gt; NOTE: It will be set only if there are errors encountered in enabling boot diagnostics.
     *
     * @return the status value
     */
    public InstanceViewStatus status() {
        return this.status;
    }

}
