package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDMortgageLoanRetrieveInputModelMortgageLoanOfferedService;
import org.bian.dto.SDMortgageLoanRetrieveInputModelMortgageLoanRetrieveActionRecord;

import javax.validation.Valid;
  
/**
 * SDMortgageLoanRetrieveInputModel
 */
public class SDMortgageLoanRetrieveInputModel   {
  private Object mortgageLoanRetrieveActionTaskRecord = null;

  private String mortgageLoanRetrieveActionRequest = null;

  private SDMortgageLoanRetrieveInputModelMortgageLoanRetrieveActionRecord mortgageLoanRetrieveActionRecord = null;

  private SDMortgageLoanRetrieveInputModelMortgageLoanOfferedService mortgageLoanOfferedService = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return mortgageLoanRetrieveActionTaskRecord
  **/

  public Object getMortgageLoanRetrieveActionTaskRecord() {
    return mortgageLoanRetrieveActionTaskRecord;
  }

  public void setMortgageLoanRetrieveActionTaskRecord(Object mortgageLoanRetrieveActionTaskRecord) {
    this.mortgageLoanRetrieveActionTaskRecord = mortgageLoanRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return mortgageLoanRetrieveActionRequest
  **/

  public String getMortgageLoanRetrieveActionRequest() {
    return mortgageLoanRetrieveActionRequest;
  }

  public void setMortgageLoanRetrieveActionRequest(String mortgageLoanRetrieveActionRequest) {
    this.mortgageLoanRetrieveActionRequest = mortgageLoanRetrieveActionRequest;
  }


  /**
   * Get mortgageLoanRetrieveActionRecord
   * @return mortgageLoanRetrieveActionRecord
  **/

  public SDMortgageLoanRetrieveInputModelMortgageLoanRetrieveActionRecord getMortgageLoanRetrieveActionRecord() {
    return mortgageLoanRetrieveActionRecord;
  }

  public void setMortgageLoanRetrieveActionRecord(SDMortgageLoanRetrieveInputModelMortgageLoanRetrieveActionRecord mortgageLoanRetrieveActionRecord) {
    this.mortgageLoanRetrieveActionRecord = mortgageLoanRetrieveActionRecord;
  }


  /**
   * Get mortgageLoanOfferedService
   * @return mortgageLoanOfferedService
  **/

  public SDMortgageLoanRetrieveInputModelMortgageLoanOfferedService getMortgageLoanOfferedService() {
    return mortgageLoanOfferedService;
  }

  public void setMortgageLoanOfferedService(SDMortgageLoanRetrieveInputModelMortgageLoanOfferedService mortgageLoanOfferedService) {
    this.mortgageLoanOfferedService = mortgageLoanOfferedService;
  }


}

