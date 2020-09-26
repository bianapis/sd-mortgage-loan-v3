package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDMortgageLoanActivateOutputModelMortgageLoanServiceConfigurationRecord;

import javax.validation.Valid;
  
/**
 * SDMortgageLoanActivateOutputModel
 */
public class SDMortgageLoanActivateOutputModel   {
  private String mortgageLoanActivationActionTaskReference = null;

  private Object mortgageLoanActivationActionTaskRecord = null;

  private String mortgageLoanServicingSessionReference = null;

  private Object mortgageLoanServicingSessionRecord = null;

  private SDMortgageLoanActivateOutputModelMortgageLoanServiceConfigurationRecord mortgageLoanServiceConfigurationRecord = null;

  private String mortgageLoanServicingSessionStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a service activation service call 
   * @return mortgageLoanActivationActionTaskReference
  **/

  public String getMortgageLoanActivationActionTaskReference() {
    return mortgageLoanActivationActionTaskReference;
  }

  public void setMortgageLoanActivationActionTaskReference(String mortgageLoanActivationActionTaskReference) {
    this.mortgageLoanActivationActionTaskReference = mortgageLoanActivationActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The activation service call consolidated processing record 
   * @return mortgageLoanActivationActionTaskRecord
  **/

  public Object getMortgageLoanActivationActionTaskRecord() {
    return mortgageLoanActivationActionTaskRecord;
  }

  public void setMortgageLoanActivationActionTaskRecord(Object mortgageLoanActivationActionTaskRecord) {
    this.mortgageLoanActivationActionTaskRecord = mortgageLoanActivationActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return mortgageLoanServicingSessionReference
  **/

  public String getMortgageLoanServicingSessionReference() {
    return mortgageLoanServicingSessionReference;
  }

  public void setMortgageLoanServicingSessionReference(String mortgageLoanServicingSessionReference) {
    this.mortgageLoanServicingSessionReference = mortgageLoanServicingSessionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Consolidated information record for the servicing session 
   * @return mortgageLoanServicingSessionRecord
  **/

  public Object getMortgageLoanServicingSessionRecord() {
    return mortgageLoanServicingSessionRecord;
  }

  public void setMortgageLoanServicingSessionRecord(Object mortgageLoanServicingSessionRecord) {
    this.mortgageLoanServicingSessionRecord = mortgageLoanServicingSessionRecord;
  }


  /**
   * Get mortgageLoanServiceConfigurationRecord
   * @return mortgageLoanServiceConfigurationRecord
  **/

  public SDMortgageLoanActivateOutputModelMortgageLoanServiceConfigurationRecord getMortgageLoanServiceConfigurationRecord() {
    return mortgageLoanServiceConfigurationRecord;
  }

  public void setMortgageLoanServiceConfigurationRecord(SDMortgageLoanActivateOutputModelMortgageLoanServiceConfigurationRecord mortgageLoanServiceConfigurationRecord) {
    this.mortgageLoanServiceConfigurationRecord = mortgageLoanServiceConfigurationRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The current operating status of the overall servicing session 
   * @return mortgageLoanServicingSessionStatus
  **/

  public String getMortgageLoanServicingSessionStatus() {
    return mortgageLoanServicingSessionStatus;
  }

  public void setMortgageLoanServicingSessionStatus(String mortgageLoanServicingSessionStatus) {
    this.mortgageLoanServicingSessionStatus = mortgageLoanServicingSessionStatus;
  }


}

