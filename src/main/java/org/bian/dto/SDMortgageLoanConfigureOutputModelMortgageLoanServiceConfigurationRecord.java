package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDMortgageLoanConfigureInputModelMortgageLoanServiceConfigurationRecordMortgageLoanServiceAgreement;
import org.bian.dto.SDMortgageLoanConfigureInputModelMortgageLoanServiceConfigurationRecordMortgageLoanServiceConfigurationSetup;
import org.bian.dto.SDMortgageLoanConfigureInputModelMortgageLoanServiceConfigurationRecordMortgageLoanServiceSubscription;

import javax.validation.Valid;
  
/**
 * SDMortgageLoanConfigureOutputModelMortgageLoanServiceConfigurationRecord
 */
public class SDMortgageLoanConfigureOutputModelMortgageLoanServiceConfigurationRecord   {
  private String mortgageLoanServiceConfigurationSettingDescription = null;

  private SDMortgageLoanConfigureInputModelMortgageLoanServiceConfigurationRecordMortgageLoanServiceConfigurationSetup mortgageLoanServiceConfigurationSetup = null;

  private SDMortgageLoanConfigureInputModelMortgageLoanServiceConfigurationRecordMortgageLoanServiceSubscription mortgageLoanServiceSubscription = null;

  private SDMortgageLoanConfigureInputModelMortgageLoanServiceConfigurationRecordMortgageLoanServiceAgreement mortgageLoanServiceAgreement = null;

  private String mortgageLoanServiceStatus = null;


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

  public SDMortgageLoanConfigureInputModelMortgageLoanServiceConfigurationRecordMortgageLoanServiceConfigurationSetup getMortgageLoanServiceConfigurationSetup() {
    return mortgageLoanServiceConfigurationSetup;
  }

  public void setMortgageLoanServiceConfigurationSetup(SDMortgageLoanConfigureInputModelMortgageLoanServiceConfigurationRecordMortgageLoanServiceConfigurationSetup mortgageLoanServiceConfigurationSetup) {
    this.mortgageLoanServiceConfigurationSetup = mortgageLoanServiceConfigurationSetup;
  }


  /**
   * Get mortgageLoanServiceSubscription
   * @return mortgageLoanServiceSubscription
  **/

  public SDMortgageLoanConfigureInputModelMortgageLoanServiceConfigurationRecordMortgageLoanServiceSubscription getMortgageLoanServiceSubscription() {
    return mortgageLoanServiceSubscription;
  }

  public void setMortgageLoanServiceSubscription(SDMortgageLoanConfigureInputModelMortgageLoanServiceConfigurationRecordMortgageLoanServiceSubscription mortgageLoanServiceSubscription) {
    this.mortgageLoanServiceSubscription = mortgageLoanServiceSubscription;
  }


  /**
   * Get mortgageLoanServiceAgreement
   * @return mortgageLoanServiceAgreement
  **/

  public SDMortgageLoanConfigureInputModelMortgageLoanServiceConfigurationRecordMortgageLoanServiceAgreement getMortgageLoanServiceAgreement() {
    return mortgageLoanServiceAgreement;
  }

  public void setMortgageLoanServiceAgreement(SDMortgageLoanConfigureInputModelMortgageLoanServiceConfigurationRecordMortgageLoanServiceAgreement mortgageLoanServiceAgreement) {
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

