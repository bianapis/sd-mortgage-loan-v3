package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * SDMortgageLoanActivateOutputModelMortgageLoanServiceConfigurationRecordMortgageLoanServiceSubscription
 */
public class SDMortgageLoanActivateOutputModelMortgageLoanServiceConfigurationRecordMortgageLoanServiceSubscription   {
  private String mortgageLoanServiceSubscriberReference = null;

  private String mortgageLoanServiceSubscriberAccessProfile = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Maintains reference to allowed users or subscribers to the service which can be any known party 
   * @return mortgageLoanServiceSubscriberReference
  **/

  public String getMortgageLoanServiceSubscriberReference() {
    return mortgageLoanServiceSubscriberReference;
  }

  public void setMortgageLoanServiceSubscriberReference(String mortgageLoanServiceSubscriberReference) {
    this.mortgageLoanServiceSubscriberReference = mortgageLoanServiceSubscriberReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The allowed service access for a user or subscriber to the service which can be any known party 
   * @return mortgageLoanServiceSubscriberAccessProfile
  **/

  public String getMortgageLoanServiceSubscriberAccessProfile() {
    return mortgageLoanServiceSubscriberAccessProfile;
  }

  public void setMortgageLoanServiceSubscriberAccessProfile(String mortgageLoanServiceSubscriberAccessProfile) {
    this.mortgageLoanServiceSubscriberAccessProfile = mortgageLoanServiceSubscriberAccessProfile;
  }


}

