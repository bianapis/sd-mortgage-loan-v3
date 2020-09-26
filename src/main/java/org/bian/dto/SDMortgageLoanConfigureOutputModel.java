package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDMortgageLoanConfigureOutputModelMortgageLoanServiceConfigurationRecord;

import javax.validation.Valid;
  
/**
 * SDMortgageLoanConfigureOutputModel
 */
public class SDMortgageLoanConfigureOutputModel   {
  private String mortgageLoanConfigurationActionTaskReference = null;

  private Object mortgageLoanConfigurationActionTaskRecord = null;

  private SDMortgageLoanConfigureOutputModelMortgageLoanServiceConfigurationRecord mortgageLoanServiceConfigurationRecord = null;

  private String mortgageLoanServicingSessionStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a service configuration service call 
   * @return mortgageLoanConfigurationActionTaskReference
  **/

  public String getMortgageLoanConfigurationActionTaskReference() {
    return mortgageLoanConfigurationActionTaskReference;
  }

  public void setMortgageLoanConfigurationActionTaskReference(String mortgageLoanConfigurationActionTaskReference) {
    this.mortgageLoanConfigurationActionTaskReference = mortgageLoanConfigurationActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The configuration service call consolidated processing record 
   * @return mortgageLoanConfigurationActionTaskRecord
  **/

  public Object getMortgageLoanConfigurationActionTaskRecord() {
    return mortgageLoanConfigurationActionTaskRecord;
  }

  public void setMortgageLoanConfigurationActionTaskRecord(Object mortgageLoanConfigurationActionTaskRecord) {
    this.mortgageLoanConfigurationActionTaskRecord = mortgageLoanConfigurationActionTaskRecord;
  }


  /**
   * Get mortgageLoanServiceConfigurationRecord
   * @return mortgageLoanServiceConfigurationRecord
  **/

  public SDMortgageLoanConfigureOutputModelMortgageLoanServiceConfigurationRecord getMortgageLoanServiceConfigurationRecord() {
    return mortgageLoanServiceConfigurationRecord;
  }

  public void setMortgageLoanServiceConfigurationRecord(SDMortgageLoanConfigureOutputModelMortgageLoanServiceConfigurationRecord mortgageLoanServiceConfigurationRecord) {
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

