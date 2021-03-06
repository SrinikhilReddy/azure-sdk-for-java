/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.costmanagement.v2018_05_31.implementation;

import retrofit2.Retrofit;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.management.costmanagement.v2018_05_31.ErrorResponseException;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import java.util.List;
import okhttp3.ResponseBody;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in BillingAccountDimensions.
 */
public class BillingAccountDimensionsInner {
    /** The Retrofit service to perform REST calls. */
    private BillingAccountDimensionsService service;
    /** The service client containing this operation class. */
    private CostManagementClientImpl client;

    /**
     * Initializes an instance of BillingAccountDimensionsInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public BillingAccountDimensionsInner(Retrofit retrofit, CostManagementClientImpl client) {
        this.service = retrofit.create(BillingAccountDimensionsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for BillingAccountDimensions to be
     * used by Retrofit to perform actually REST calls.
     */
    interface BillingAccountDimensionsService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.costmanagement.v2018_05_31.BillingAccountDimensions list" })
        @GET("providers/Microsoft.Billing/billingAccounts/{billingAccountId}/providers/Microsoft.CostManagement/dimensions")
        Observable<Response<ResponseBody>> list(@Path("billingAccountId") String billingAccountId, @Query("api-version") String apiVersion, @Query("$filter") String filter, @Query("$expand") String expand, @Query("$skiptoken") String skiptoken, @Query("$top") Integer top, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Lists the dimensions by billingAccount Id.
     *
     * @param billingAccountId BillingAccount ID
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the List&lt;DimensionInner&gt; object if successful.
     */
    public List<DimensionInner> list(String billingAccountId) {
        return listWithServiceResponseAsync(billingAccountId).toBlocking().single().body();
    }

    /**
     * Lists the dimensions by billingAccount Id.
     *
     * @param billingAccountId BillingAccount ID
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<DimensionInner>> listAsync(String billingAccountId, final ServiceCallback<List<DimensionInner>> serviceCallback) {
        return ServiceFuture.fromResponse(listWithServiceResponseAsync(billingAccountId), serviceCallback);
    }

    /**
     * Lists the dimensions by billingAccount Id.
     *
     * @param billingAccountId BillingAccount ID
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;DimensionInner&gt; object
     */
    public Observable<List<DimensionInner>> listAsync(String billingAccountId) {
        return listWithServiceResponseAsync(billingAccountId).map(new Func1<ServiceResponse<List<DimensionInner>>, List<DimensionInner>>() {
            @Override
            public List<DimensionInner> call(ServiceResponse<List<DimensionInner>> response) {
                return response.body();
            }
        });
    }

    /**
     * Lists the dimensions by billingAccount Id.
     *
     * @param billingAccountId BillingAccount ID
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;DimensionInner&gt; object
     */
    public Observable<ServiceResponse<List<DimensionInner>>> listWithServiceResponseAsync(String billingAccountId) {
        if (billingAccountId == null) {
            throw new IllegalArgumentException("Parameter billingAccountId is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        final String filter = null;
        final String expand = null;
        final String skiptoken = null;
        final Integer top = null;
        return service.list(billingAccountId, this.client.apiVersion(), filter, expand, skiptoken, top, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<List<DimensionInner>>>>() {
                @Override
                public Observable<ServiceResponse<List<DimensionInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<DimensionInner>> result = listDelegate(response);
                        List<DimensionInner> items = null;
                        if (result.body() != null) {
                            items = result.body().items();
                        }
                        ServiceResponse<List<DimensionInner>> clientResponse = new ServiceResponse<List<DimensionInner>>(items, result.response());
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * Lists the dimensions by billingAccount Id.
     *
     * @param billingAccountId BillingAccount ID
     * @param filter May be used to filter dimensions by properties/category, properties/usageStart, properties/usageEnd. Supported operators are 'eq','lt', 'gt', 'le', 'ge'.
     * @param expand May be used to expand the properties/data within a dimension category. By default, data is not included when listing dimensions.
     * @param skiptoken Skiptoken is only used if a previous operation returned a partial result. If a previous response contains a nextLink element, the value of the nextLink element will include a skiptoken parameter that specifies a starting point to use for subsequent calls.
     * @param top May be used to limit the number of results to the most recent N dimension data.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the List&lt;DimensionInner&gt; object if successful.
     */
    public List<DimensionInner> list(String billingAccountId, String filter, String expand, String skiptoken, Integer top) {
        return listWithServiceResponseAsync(billingAccountId, filter, expand, skiptoken, top).toBlocking().single().body();
    }

    /**
     * Lists the dimensions by billingAccount Id.
     *
     * @param billingAccountId BillingAccount ID
     * @param filter May be used to filter dimensions by properties/category, properties/usageStart, properties/usageEnd. Supported operators are 'eq','lt', 'gt', 'le', 'ge'.
     * @param expand May be used to expand the properties/data within a dimension category. By default, data is not included when listing dimensions.
     * @param skiptoken Skiptoken is only used if a previous operation returned a partial result. If a previous response contains a nextLink element, the value of the nextLink element will include a skiptoken parameter that specifies a starting point to use for subsequent calls.
     * @param top May be used to limit the number of results to the most recent N dimension data.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<DimensionInner>> listAsync(String billingAccountId, String filter, String expand, String skiptoken, Integer top, final ServiceCallback<List<DimensionInner>> serviceCallback) {
        return ServiceFuture.fromResponse(listWithServiceResponseAsync(billingAccountId, filter, expand, skiptoken, top), serviceCallback);
    }

    /**
     * Lists the dimensions by billingAccount Id.
     *
     * @param billingAccountId BillingAccount ID
     * @param filter May be used to filter dimensions by properties/category, properties/usageStart, properties/usageEnd. Supported operators are 'eq','lt', 'gt', 'le', 'ge'.
     * @param expand May be used to expand the properties/data within a dimension category. By default, data is not included when listing dimensions.
     * @param skiptoken Skiptoken is only used if a previous operation returned a partial result. If a previous response contains a nextLink element, the value of the nextLink element will include a skiptoken parameter that specifies a starting point to use for subsequent calls.
     * @param top May be used to limit the number of results to the most recent N dimension data.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;DimensionInner&gt; object
     */
    public Observable<List<DimensionInner>> listAsync(String billingAccountId, String filter, String expand, String skiptoken, Integer top) {
        return listWithServiceResponseAsync(billingAccountId, filter, expand, skiptoken, top).map(new Func1<ServiceResponse<List<DimensionInner>>, List<DimensionInner>>() {
            @Override
            public List<DimensionInner> call(ServiceResponse<List<DimensionInner>> response) {
                return response.body();
            }
        });
    }

    /**
     * Lists the dimensions by billingAccount Id.
     *
     * @param billingAccountId BillingAccount ID
     * @param filter May be used to filter dimensions by properties/category, properties/usageStart, properties/usageEnd. Supported operators are 'eq','lt', 'gt', 'le', 'ge'.
     * @param expand May be used to expand the properties/data within a dimension category. By default, data is not included when listing dimensions.
     * @param skiptoken Skiptoken is only used if a previous operation returned a partial result. If a previous response contains a nextLink element, the value of the nextLink element will include a skiptoken parameter that specifies a starting point to use for subsequent calls.
     * @param top May be used to limit the number of results to the most recent N dimension data.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;DimensionInner&gt; object
     */
    public Observable<ServiceResponse<List<DimensionInner>>> listWithServiceResponseAsync(String billingAccountId, String filter, String expand, String skiptoken, Integer top) {
        if (billingAccountId == null) {
            throw new IllegalArgumentException("Parameter billingAccountId is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.list(billingAccountId, this.client.apiVersion(), filter, expand, skiptoken, top, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<List<DimensionInner>>>>() {
                @Override
                public Observable<ServiceResponse<List<DimensionInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<DimensionInner>> result = listDelegate(response);
                        List<DimensionInner> items = null;
                        if (result.body() != null) {
                            items = result.body().items();
                        }
                        ServiceResponse<List<DimensionInner>> clientResponse = new ServiceResponse<List<DimensionInner>>(items, result.response());
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<DimensionInner>> listDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<DimensionInner>, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<DimensionInner>>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

}
