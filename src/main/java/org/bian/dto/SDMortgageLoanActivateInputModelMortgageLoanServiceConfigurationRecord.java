package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDMortgageLoanActivateInputModelMortgageLoanServiceConfigurationRecordMortgageLoanServiceConfigurationSetup;

import javax.validation.Valid;
  
/**
 * SDMortgageLoanActivateInputModelMortgageLoanServiceConfigurationRecord
 */
public class SDMortgageLoanActivateInputModelMortgageLoanServiceConfigurationRecord   {
  private String mortgageLoanServiceConfigurationSettingReference = null;

  private String mortgageLoanServiceConfigurationSettingType = null;

  private SDMortgageLoanActivateInputModelMortgageLoanServiceConfigurationRecordMortgageLoanServiceConfigurationSetup mortgageLoanServiceConfigurationSetup = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Refers to the service configuration parameter for the service 
   * @return mortgageLoanServiceConfigurationSettingReference
  **/

  public String getMortgageLoanServiceConfigurationSettingReference() {
    return mortgageLoanServiceConfigurationSettingReference;
  }

  public void setMortgageLoanServiceConfigurationSettingReference(String mortgageLoanServiceConfigurationSettingReference) {
    this.mortgageLoanServiceConfigurationSettingReference = mortgageLoanServiceConfigurationSettingReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of service configuration parameter 
   * @return mortgageLoanServiceConfigurationSettingType
  **/

  public String getMortgageLoanServiceConfigurationSettingType() {
    return mortgageLoanServiceConfigurationSettingType;
  }

  public void setMortgageLoanServiceConfigurationSettingType(String mortgageLoanServiceConfigurationSettingType) {
    this.mortgageLoanServiceConfigurationSettingType = mortgageLoanServiceConfigurationSettingType;
  }


  /**
   * Get mortgageLoanServiceConfigurationSetup
   * @return mortgageLoanServiceConfigurationSetup
  **/

  public SDMortgageLoanActivateInputModelMortgageLoanServiceConfigurationRecordMortgageLoanServiceConfigurationSetup getMortgageLoanServiceConfigurationSetup() {
    return mortgageLoanServiceConfigurationSetup;
  }

  public void setMortgageLoanServiceConfigurationSetup(SDMortgageLoanActivateInputModelMortgageLoanServiceConfigurationRecordMortgageLoanServiceConfigurationSetup mortgageLoanServiceConfigurationSetup) {
    this.mortgageLoanServiceConfigurationSetup = mortgageLoanServiceConfigurationSetup;
  }


}

