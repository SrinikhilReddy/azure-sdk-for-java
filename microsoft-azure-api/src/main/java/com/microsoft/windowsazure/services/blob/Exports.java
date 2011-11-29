package com.microsoft.windowsazure.services.blob;

import com.microsoft.windowsazure.services.blob.implementation.BlobExceptionProcessor;
import com.microsoft.windowsazure.services.blob.implementation.BlobRestProxy;
import com.microsoft.windowsazure.services.blob.implementation.SharedKeyFilter;
import com.microsoft.windowsazure.services.blob.implementation.SharedKeyLiteFilter;
import com.microsoft.windowsazure.services.core.Builder;

public class Exports implements Builder.Exports {
    @Override
    public void register(Builder.Registry registry) {
        registry.add(BlobContract.class, BlobExceptionProcessor.class);
        registry.add(BlobExceptionProcessor.class);
        registry.add(BlobRestProxy.class);
        registry.add(SharedKeyLiteFilter.class);
        registry.add(SharedKeyFilter.class);
    }
}
