/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.vision.contentmoderator;

import com.microsoft.azure.cognitiveservices.vision.contentmoderator.models.GetAllTermsOptionalParameter;
import com.microsoft.azure.cognitiveservices.vision.contentmoderator.models.APIErrorException;
import com.microsoft.azure.cognitiveservices.vision.contentmoderator.models.Terms;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in ListManagementTerms.
 */
public interface ListManagementTerms {

    /**
     * Add a term to the term list with list Id equal to list Id passed.
     *
     * @param listId List Id of the image list.
     * @param term Term to be deleted.
     * @param language Language of the terms.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws APIErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    Object addTerm(String listId, String term, String language);

    /**
     * Add a term to the term list with list Id equal to list Id passed.
     *
     * @param listId List Id of the image list.
     * @param term Term to be deleted.
     * @param language Language of the terms.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<Object> addTermAsync(String listId, String term, String language);



    /**
     * Deletes a term from the list with list Id equal to the list Id passed.
     *
     * @param listId List Id of the image list.
     * @param term Term to be deleted.
     * @param language Language of the terms.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws APIErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the String object if successful.
     */
    String deleteTerm(String listId, String term, String language);

    /**
     * Deletes a term from the list with list Id equal to the list Id passed.
     *
     * @param listId List Id of the image list.
     * @param term Term to be deleted.
     * @param language Language of the terms.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the String object
     */
    Observable<String> deleteTermAsync(String listId, String term, String language);


    /**
     * Gets all terms from the list with list Id equal to the list Id passed.
     *
     * @param listId List Id of the image list.
     * @param language Language of the terms.
     * @param getAllTermsOptionalParameter the object representing the optional parameters to be set before calling this API
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws APIErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Terms object if successful.
     */
    
    Terms getAllTerms(String listId, String language, GetAllTermsOptionalParameter getAllTermsOptionalParameter);

    /**
     * Gets all terms from the list with list Id equal to the list Id passed.
     *
     * @param listId List Id of the image list.
     * @param language Language of the terms.
     * @param getAllTermsOptionalParameter the object representing the optional parameters to be set before calling this API
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Terms object
     */
    
    Observable<Terms> getAllTermsAsync(String listId, String language, GetAllTermsOptionalParameter getAllTermsOptionalParameter);

    /**
     * Gets all terms from the list with list Id equal to the list Id passed.
     *
     * @return the first stage of the getAllTerms call
     */
    ListManagementTermsGetAllTermsDefinitionStages.WithListId getAllTerms();

    /**
     * Grouping of getAllTerms definition stages.
     */
    interface ListManagementTermsGetAllTermsDefinitionStages {
        /**
         * The stage of the definition to be specify listId.
         */
        interface WithListId {
            /**
             * List Id of the image list.
             *
             * @return next definition stage
             */
            WithLanguage withListId(String listId);
        }
        /**
         * The stage of the definition to be specify language.
         */
        interface WithLanguage {
            /**
             * Language of the terms.
             *
             * @return next definition stage
             */
            ListManagementTermsGetAllTermsDefinitionStages.WithExecute withLanguage(String language);
        }

        /**
         * The stage of the definition which allows for any other optional settings to be specified.
         */
        interface WithAllOptions {
            /**
             * The pagination start index.
             *
             * @return next definition stage
             */
            ListManagementTermsGetAllTermsDefinitionStages.WithExecute withOffset(Integer offset);

            /**
             * The max limit.
             *
             * @return next definition stage
             */
            ListManagementTermsGetAllTermsDefinitionStages.WithExecute withLimit(Integer limit);

        }

        /**
         * The last stage of the definition which will make the operation call.
        */
        interface WithExecute extends ListManagementTermsGetAllTermsDefinitionStages.WithAllOptions {
            /**
             * Execute the request.
             *
             * @return the Terms object if successful.
             */
            Terms execute();

            /**
             * Execute the request asynchronously.
             *
             * @return the observable to the Terms object
             */
            Observable<Terms> executeAsync();
        }
    }

    /**
     * The entirety of getAllTerms definition.
     */
    interface ListManagementTermsGetAllTermsDefinition extends
        ListManagementTermsGetAllTermsDefinitionStages.WithListId,
        ListManagementTermsGetAllTermsDefinitionStages.WithLanguage,
        ListManagementTermsGetAllTermsDefinitionStages.WithExecute {
    }


    /**
     * Deletes all terms from the list with list Id equal to the list Id passed.
     *
     * @param listId List Id of the image list.
     * @param language Language of the terms.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws APIErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the String object if successful.
     */
    String deleteAllTerms(String listId, String language);

    /**
     * Deletes all terms from the list with list Id equal to the list Id passed.
     *
     * @param listId List Id of the image list.
     * @param language Language of the terms.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the String object
     */
    Observable<String> deleteAllTermsAsync(String listId, String language);


}