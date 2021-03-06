package com.validators;

import com.services.APIException;

/**
 * Created by Hari Rao on 05/01/17.
 */

/**
 * Method in this interface  should be implemented by the validators that will validate the api name from the user
 */
public interface LoadInputQueryValidator {
    void validate(String api, String movie, String music)throws APIException;
}
