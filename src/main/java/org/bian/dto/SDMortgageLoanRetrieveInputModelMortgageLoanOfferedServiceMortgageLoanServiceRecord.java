package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * SDMortgageLoanRetrieveInputModelMortgageLoanOfferedServiceMortgageLoanServiceRecord
 */
public class SDMortgageLoanRetrieveInputModelMortgageLoanOfferedServiceMortgageLoanServiceRecord   {
  private String mortgageLoanServiceVersion = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The version details of the service when appropriate 
   * @return mortgageLoanServiceVersion
  **/

  public String getMortgageLoanServiceVersion() {
    return mortgageLoanServiceVersion;
  }

  public void setMortgageLoanServiceVersion(String mortgageLoanServiceVersion) {
    this.mortgageLoanServiceVersion = mortgageLoanServiceVersion;
  }


}

