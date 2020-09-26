package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDMortgageLoanActivateInputModelMortgageLoanServiceConfigurationRecordMortgageLoanServiceConfigurationSetup;
import org.bian.dto.SDMortgageLoanActivateOutputModelMortgageLoanServiceConfigurationRecordMortgageLoanServiceAgreement;
import org.bian.dto.SDMortgageLoanActivateOutputModelMortgageLoanServiceConfigurationRecordMortgageLoanServiceSubscription;

import javax.validation.Valid;
  
/**
 * SDMortgageLoanActivateOutputModelMortgageLoanServiceConfigurationRecord
 */
public class SDMortgageLoanActivateOutputModelMortgageLoanServiceConfigurationRecord   {
  private String mortgageLoanServiceConfigurationSettingReference = null;

  private String mortgageLoanServiceConfigurationSettingDescription = null;

  private SDMortgageLoanActivateInputModelMortgageLoanServiceConfigurationRecordMortgageLoanServiceConfigurationSetup mortgageLoanServiceConfigurationSetup = null;

  private SDMortgageLoanActivateOutputModelMortgageLoanServiceConfigurationRecordMortgageLoanServiceSubscription mortgageLoanServiceSubscription = null;

  private SDMortgageLoanActivateOutputModelMortgageLoanServiceConfigurationRecordMortgageLoanServiceAgreement mortgageLoanServiceAgreement = null;

  private String mortgageLoanServiceStatus = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the configuration parameter, allowed values and processing impact 
   * @return mortgageLoanServiceConfigurationSettingDescription
  **/

  public String getMortgageLoanServiceConfigurationSettingDescription() {
    return mortgageLoanServiceConfigurationSettingDescription;
  }

  public void setMortgageLoanServiceConfigurationSettingDescription(String mortgageLoanServiceConfigurationSettingDescription) {
    this.mortgageLoanServiceConfigurationSettingDescription = mortgageLoanServiceConfigurationSettingDescription;
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


  /**
   * Get mortgageLoanServiceSubscription
   * @return mortgageLoanServiceSubscription
  **/

  public SDMortgageLoanActivateOutputModelMortgageLoanServiceConfigurationRecordMortgageLoanServiceSubscription getMortgageLoanServiceSubscription() {
    return mortgageLoanServiceSubscription;
  }

  public void setMortgageLoanServiceSubscription(SDMortgageLoanActivateOutputModelMortgageLoanServiceConfigurationRecordMortgageLoanServiceSubscription mortgageLoanServiceSubscription) {
    this.mortgageLoanServiceSubscription = mortgageLoanServiceSubscription;
  }


  /**
   * Get mortgageLoanServiceAgreement
   * @return mortgageLoanServiceAgreement
  **/

  public SDMortgageLoanActivateOutputModelMortgageLoanServiceConfigurationRecordMortgageLoanServiceAgreement getMortgageLoanServiceAgreement() {
    return mortgageLoanServiceAgreement;
  }

  public void setMortgageLoanServiceAgreement(SDMortgageLoanActivateOutputModelMortgageLoanServiceConfigurationRecordMortgageLoanServiceAgreement mortgageLoanServiceAgreement) {
    this.mortgageLoanServiceAgreement = mortgageLoanServiceAgreement;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the offered service (e.g. active, suspended, idle) 
   * @return mortgageLoanServiceStatus
  **/

  public String getMortgageLoanServiceStatus() {
    return mortgageLoanServiceStatus;
  }

  public void setMortgageLoanServiceStatus(String mortgageLoanServiceStatus) {
    this.mortgageLoanServiceStatus = mortgageLoanServiceStatus;
  }


}

