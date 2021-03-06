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


package com.squareup.connect.models;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.squareup.connect.models.Error;
import com.squareup.connect.models.Transaction;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * Defines the fields that are included in the response body of a request to the [RetrieveTransaction](#endpont-retrievetransaction) endpoint.  One of &#x60;errors&#x60; or &#x60;transaction&#x60; is present in a given response (never both).
 */
@ApiModel(description = "Defines the fields that are included in the response body of a request to the [RetrieveTransaction](#endpont-retrievetransaction) endpoint.  One of `errors` or `transaction` is present in a given response (never both).")

public class RetrieveTransactionResponse {
  @JsonProperty("errors")
  private List<Error> errors = new ArrayList<Error>();

  @JsonProperty("transaction")
  private Transaction transaction = null;

  public RetrieveTransactionResponse errors(List<Error> errors) {
    this.errors = errors;
    return this;
  }

  public RetrieveTransactionResponse addErrorsItem(Error errorsItem) {
    this.errors.add(errorsItem);
    return this;
  }

   /**
   * Any errors that occurred during the request.
   * @return errors
  **/
  @ApiModelProperty(value = "Any errors that occurred during the request.")
  public List<Error> getErrors() {
    return errors;
  }

  public void setErrors(List<Error> errors) {
    this.errors = errors;
  }

  public RetrieveTransactionResponse transaction(Transaction transaction) {
    this.transaction = transaction;
    return this;
  }

   /**
   * The requested transaction.
   * @return transaction
  **/
  @ApiModelProperty(value = "The requested transaction.")
  public Transaction getTransaction() {
    return transaction;
  }

  public void setTransaction(Transaction transaction) {
    this.transaction = transaction;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RetrieveTransactionResponse retrieveTransactionResponse = (RetrieveTransactionResponse) o;
    return Objects.equals(this.errors, retrieveTransactionResponse.errors) &&
        Objects.equals(this.transaction, retrieveTransactionResponse.transaction);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errors, transaction);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetrieveTransactionResponse {\n");
    
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    transaction: ").append(toIndentedString(transaction)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}

