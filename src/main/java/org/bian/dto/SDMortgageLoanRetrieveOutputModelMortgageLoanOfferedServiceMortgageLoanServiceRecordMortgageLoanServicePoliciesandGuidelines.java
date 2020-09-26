package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * SDMortgageLoanRetrieveOutputModelMortgageLoanOfferedServiceMortgageLoanServiceRecordMortgageLoanServicePoliciesandGuidelines
 */
public class SDMortgageLoanRetrieveOutputModelMortgageLoanOfferedServiceMortgageLoanServiceRecordMortgageLoanServicePoliciesandGuidelines   {
  private String mortgageLoanServiceEligibility = null;

  private String mortgageLoanServiceIntendedUses = null;

  private String mortgageLoanServicePricingandTerms = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Policies and rules governing access to the offered service, includes eligibility and qualifications 
   * @return mortgageLoanServiceEligibility
  **/

  public String getMortgageLoanServiceEligibility() {
    return mortgageLoanServiceEligibility;
  }

  public void setMortgageLoanServiceEligibility(String mortgageLoanServiceEligibility) {
    this.mortgageLoanServiceEligibility = mortgageLoanServiceEligibility;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Guidelines covering allowed, intended use of the service 
   * @return mortgageLoanServiceIntendedUses
  **/

  public String getMortgageLoanServiceIntendedUses() {
    return mortgageLoanServiceIntendedUses;
  }

  public void setMortgageLoanServiceIntendedUses(String mortgageLoanServiceIntendedUses) {
    this.mortgageLoanServiceIntendedUses = mortgageLoanServiceIntendedUses;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Terms, prices, penalties associated with use of the service 
   * @return mortgageLoanServicePricingandTerms
  **/

  public String getMortgageLoanServicePricingandTerms() {
    return mortgageLoanServicePricingandTerms;
  }

  public void setMortgageLoanServicePricingandTerms(String mortgageLoanServicePricingandTerms) {
    this.mortgageLoanServicePricingandTerms = mortgageLoanServicePricingandTerms;
  }


}

