package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDMortgageLoanRetrieveOutputModelMortgageLoanOfferedServiceMortgageLoanServiceRecordMortgageLoanServicePoliciesandGuidelines;

import javax.validation.Valid;
  
/**
 * SDMortgageLoanRetrieveOutputModelMortgageLoanOfferedServiceMortgageLoanServiceRecord
 */
public class SDMortgageLoanRetrieveOutputModelMortgageLoanOfferedServiceMortgageLoanServiceRecord   {
  private String mortgageLoanServiceType = null;

  private String mortgageLoanServiceVersion = null;

  private String mortgageLoanServiceDescription = null;

  private SDMortgageLoanRetrieveOutputModelMortgageLoanOfferedServiceMortgageLoanServiceRecordMortgageLoanServicePoliciesandGuidelines mortgageLoanServicePoliciesandGuidelines = null;

  private String mortgageLoanServiceSchedule = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Refers to the different types of services offered 
   * @return mortgageLoanServiceType
  **/

  public String getMortgageLoanServiceType() {
    return mortgageLoanServiceType;
  }

  public void setMortgageLoanServiceType(String mortgageLoanServiceType) {
    this.mortgageLoanServiceType = mortgageLoanServiceType;
  }


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


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the offered service  
   * @return mortgageLoanServiceDescription
  **/

  public String getMortgageLoanServiceDescription() {
    return mortgageLoanServiceDescription;
  }

  public void setMortgageLoanServiceDescription(String mortgageLoanServiceDescription) {
    this.mortgageLoanServiceDescription = mortgageLoanServiceDescription;
  }


  /**
   * Get mortgageLoanServicePoliciesandGuidelines
   * @return mortgageLoanServicePoliciesandGuidelines
  **/

  public SDMortgageLoanRetrieveOutputModelMortgageLoanOfferedServiceMortgageLoanServiceRecordMortgageLoanServicePoliciesandGuidelines getMortgageLoanServicePoliciesandGuidelines() {
    return mortgageLoanServicePoliciesandGuidelines;
  }

  public void setMortgageLoanServicePoliciesandGuidelines(SDMortgageLoanRetrieveOutputModelMortgageLoanOfferedServiceMortgageLoanServiceRecordMortgageLoanServicePoliciesandGuidelines mortgageLoanServicePoliciesandGuidelines) {
    this.mortgageLoanServicePoliciesandGuidelines = mortgageLoanServicePoliciesandGuidelines;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Schedule defining when the accessed service is available 
   * @return mortgageLoanServiceSchedule
  **/

  public String getMortgageLoanServiceSchedule() {
    return mortgageLoanServiceSchedule;
  }

  public void setMortgageLoanServiceSchedule(String mortgageLoanServiceSchedule) {
    this.mortgageLoanServiceSchedule = mortgageLoanServiceSchedule;
  }


}

