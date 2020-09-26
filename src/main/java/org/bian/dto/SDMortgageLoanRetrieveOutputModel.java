package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDMortgageLoanRetrieveOutputModelMortgageLoanOfferedService;
import org.bian.dto.SDMortgageLoanRetrieveOutputModelMortgageLoanRetrieveActionRecord;

import javax.validation.Valid;
  
/**
 * SDMortgageLoanRetrieveOutputModel
 */
public class SDMortgageLoanRetrieveOutputModel   {
  private String mortgageLoanRetrieveActionTaskReference = null;

  private Object mortgageLoanRetrieveActionTaskRecord = null;

  private String mortgageLoanRetrieveActionResponse = null;

  private SDMortgageLoanRetrieveOutputModelMortgageLoanRetrieveActionRecord mortgageLoanRetrieveActionRecord = null;

  private SDMortgageLoanRetrieveOutputModelMortgageLoanOfferedService mortgageLoanOfferedService = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a retrieve service call 
   * @return mortgageLoanRetrieveActionTaskReference
  **/

  public String getMortgageLoanRetrieveActionTaskReference() {
    return mortgageLoanRetrieveActionTaskReference;
  }

  public void setMortgageLoanRetrieveActionTaskReference(String mortgageLoanRetrieveActionTaskReference) {
    this.mortgageLoanRetrieveActionTaskReference = mortgageLoanRetrieveActionTaskReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return mortgageLoanRetrieveActionResponse
  **/

  public String getMortgageLoanRetrieveActionResponse() {
    return mortgageLoanRetrieveActionResponse;
  }

  public void setMortgageLoanRetrieveActionResponse(String mortgageLoanRetrieveActionResponse) {
    this.mortgageLoanRetrieveActionResponse = mortgageLoanRetrieveActionResponse;
  }


  /**
   * Get mortgageLoanRetrieveActionRecord
   * @return mortgageLoanRetrieveActionRecord
  **/

  public SDMortgageLoanRetrieveOutputModelMortgageLoanRetrieveActionRecord getMortgageLoanRetrieveActionRecord() {
    return mortgageLoanRetrieveActionRecord;
  }

  public void setMortgageLoanRetrieveActionRecord(SDMortgageLoanRetrieveOutputModelMortgageLoanRetrieveActionRecord mortgageLoanRetrieveActionRecord) {
    this.mortgageLoanRetrieveActionRecord = mortgageLoanRetrieveActionRecord;
  }


  /**
   * Get mortgageLoanOfferedService
   * @return mortgageLoanOfferedService
  **/

  public SDMortgageLoanRetrieveOutputModelMortgageLoanOfferedService getMortgageLoanOfferedService() {
    return mortgageLoanOfferedService;
  }

  public void setMortgageLoanOfferedService(SDMortgageLoanRetrieveOutputModelMortgageLoanOfferedService mortgageLoanOfferedService) {
    this.mortgageLoanOfferedService = mortgageLoanOfferedService;
  }


}

