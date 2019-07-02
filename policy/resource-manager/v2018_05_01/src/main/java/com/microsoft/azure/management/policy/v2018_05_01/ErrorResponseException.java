/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

<<<<<<< HEAD:eventhubs/resource-manager/v2017_04_01/src/main/java/com/microsoft/azure/management/eventhubs/v2017_04_01/ErrorResponseException.java
package com.microsoft.azure.management.eventhubs.v2017_04_01;
=======
package com.microsoft.azure.management.policy.v2018_05_01;
>>>>>>> upstream/master:policy/resource-manager/v2018_05_01/src/main/java/com/microsoft/azure/management/policy/v2018_05_01/ErrorResponseException.java

import com.microsoft.rest.RestException;
import okhttp3.ResponseBody;
import retrofit2.Response;

/**
 * Exception thrown for an invalid response with ErrorResponse information.
 */
public class ErrorResponseException extends RestException {
    /**
     * Initializes a new instance of the ErrorResponseException class.
     *
     * @param message the exception message or the response content if a message is not available
     * @param response the HTTP response
     */
    public ErrorResponseException(final String message, final Response<ResponseBody> response) {
        super(message, response);
    }

    /**
     * Initializes a new instance of the ErrorResponseException class.
     *
     * @param message the exception message or the response content if a message is not available
     * @param response the HTTP response
     * @param body the deserialized response body
     */
    public ErrorResponseException(final String message, final Response<ResponseBody> response, final ErrorResponse body) {
        super(message, response, body);
    }

    @Override
    public ErrorResponse body() {
        return (ErrorResponse) super.body();
    }
}