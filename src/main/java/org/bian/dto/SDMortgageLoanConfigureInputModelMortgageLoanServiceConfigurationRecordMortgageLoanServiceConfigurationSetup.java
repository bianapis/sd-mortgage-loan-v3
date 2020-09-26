package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * SDMortgageLoanConfigureInputModelMortgageLoanServiceConfigurationRecordMortgageLoanServiceConfigurationSetup
 */
public class SDMortgageLoanConfigureInputModelMortgageLoanServiceConfigurationRecordMortgageLoanServiceConfigurationSetup   {
  private String mortgageLoanServiceConfigurationParameter = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The requested and current activation values for the service configuration parameter  
   * @return mortgageLoanServiceConfigurationParameter
  **/

  public String getMortgageLoanServiceConfigurationParameter() {
    return mortgageLoanServiceConfigurationParameter;
  }

  public void setMortgageLoanServiceConfigurationParameter(String mortgageLoanServiceConfigurationParameter) {
    this.mortgageLoanServiceConfigurationParameter = mortgageLoanServiceConfigurationParameter;
  }


}

