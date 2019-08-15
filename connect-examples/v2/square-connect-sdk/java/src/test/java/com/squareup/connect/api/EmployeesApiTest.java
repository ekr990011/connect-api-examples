/*
 * Square Connect API
 * Client library for accessing the Square Connect APIs
 *
 * OpenAPI spec version: 2.0
 * Contact: developers@squareup.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.squareup.connect.api;

import com.squareup.connect.ApiException;
import com.squareup.connect.models.ListEmployeesResponse;
import com.squareup.connect.models.RetrieveEmployeeResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for EmployeesApi
 */
@Ignore
public class EmployeesApiTest {

    private final EmployeesApi api = new EmployeesApi();


    /**
     * ListEmployees
     *
     * Gets a list of &#x60;Employee&#x60; objects for a business.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listEmployeesTest() throws ApiException {
        String locationId = null;
        String status = null;
        Integer limit = null;
        String cursor = null;
        ListEmployeesResponse response = api.listEmployees(locationId, status, limit, cursor);

        // TODO: test validations
    }

    /**
     * RetrieveEmployee
     *
     * Gets an &#x60;Employee&#x60; by Square-assigned employee &#x60;ID&#x60; (UUID)
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void retrieveEmployeeTest() throws ApiException {
        String id = null;
        RetrieveEmployeeResponse response = api.retrieveEmployee(id);

        // TODO: test validations
    }

}
