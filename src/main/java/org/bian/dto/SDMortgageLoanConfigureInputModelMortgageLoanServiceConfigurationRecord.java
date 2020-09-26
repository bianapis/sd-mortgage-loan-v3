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
 * SDMortgageLoanConfigureInputModelMortgageLoanServiceConfigurationRecord
 */
public class SDMortgageLoanConfigureInputModelMortgageLoanServiceConfigurationRecord   {
  private String mortgageLoanServiceConfigurationSettingReference = null;

  private String mortgageLoanServiceConfigurationSettingType = null;

  private SDMortgageLoanConfigureInputModelMortgageLoanServiceConfigurationRecordMortgageLoanServiceConfigurationSetup mortgageLoanServiceConfigurationSetup = null;

  private SDMortgageLoanConfigureInputModelMortgageLoanServiceConfigurationRecordMortgageLoanServiceSubscription mortgageLoanServiceSubscription = null;

  private SDMortgageLoanConfigureInputModelMortgageLoanServiceConfigurationRecordMortgageLoanServiceAgreement mortgageLoanServiceAgreement = null;


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


}

