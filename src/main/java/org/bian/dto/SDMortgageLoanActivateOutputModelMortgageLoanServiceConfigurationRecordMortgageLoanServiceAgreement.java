package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * SDMortgageLoanActivateOutputModelMortgageLoanServiceConfigurationRecordMortgageLoanServiceAgreement
 */
public class SDMortgageLoanActivateOutputModelMortgageLoanServiceConfigurationRecordMortgageLoanServiceAgreement   {
  private String mortgageLoanServiceAgreementReference = null;

  private String mortgageLoanServiceUserReference = null;

  private String mortgageLoanServiceAgreementTermsandConditions = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the offered service agreement 
   * @return mortgageLoanServiceAgreementReference
  **/

  public String getMortgageLoanServiceAgreementReference() {
    return mortgageLoanServiceAgreementReference;
  }

  public void setMortgageLoanServiceAgreementReference(String mortgageLoanServiceAgreementReference) {
    this.mortgageLoanServiceAgreementReference = mortgageLoanServiceAgreementReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the user covered by the contract 
   * @return mortgageLoanServiceUserReference
  **/

  public String getMortgageLoanServiceUserReference() {
    return mortgageLoanServiceUserReference;
  }

  public void setMortgageLoanServiceUserReference(String mortgageLoanServiceUserReference) {
    this.mortgageLoanServiceUserReference = mortgageLoanServiceUserReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Terms and conditions covering the service agreement 
   * @return mortgageLoanServiceAgreementTermsandConditions
  **/

  public String getMortgageLoanServiceAgreementTermsandConditions() {
    return mortgageLoanServiceAgreementTermsandConditions;
  }

  public void setMortgageLoanServiceAgreementTermsandConditions(String mortgageLoanServiceAgreementTermsandConditions) {
    this.mortgageLoanServiceAgreementTermsandConditions = mortgageLoanServiceAgreementTermsandConditions;
  }


}

