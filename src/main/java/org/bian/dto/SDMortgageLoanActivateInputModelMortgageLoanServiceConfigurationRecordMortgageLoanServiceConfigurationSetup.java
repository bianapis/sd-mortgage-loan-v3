package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * SDMortgageLoanActivateInputModelMortgageLoanServiceConfigurationRecordMortgageLoanServiceConfigurationSetup
 */
public class SDMortgageLoanActivateInputModelMortgageLoanServiceConfigurationRecordMortgageLoanServiceConfigurationSetup   {
  private String mortgageLoanServiceConfigurationParameter = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The default activation setting for the offered service configuration parameter  
   * @return mortgageLoanServiceConfigurationParameter
  **/

  public String getMortgageLoanServiceConfigurationParameter() {
    return mortgageLoanServiceConfigurationParameter;
  }

  public void setMortgageLoanServiceConfigurationParameter(String mortgageLoanServiceConfigurationParameter) {
    this.mortgageLoanServiceConfigurationParameter = mortgageLoanServiceConfigurationParameter;
  }


}

