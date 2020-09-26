package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDMortgageLoanConfigureInputModelMortgageLoanServiceConfigurationRecord;

import javax.validation.Valid;
  
/**
 * SDMortgageLoanConfigureInputModel
 */
public class SDMortgageLoanConfigureInputModel   {
  private Object mortgageLoanConfigurationActionTaskRecord = null;

  private String mortgageLoanServicingSessionReference = null;

  private String mortgageLoanServiceReference = null;

  private SDMortgageLoanConfigureInputModelMortgageLoanServiceConfigurationRecord mortgageLoanServiceConfigurationRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a service offered by the service center 
   * @return mortgageLoanServiceReference
  **/

  public String getMortgageLoanServiceReference() {
    return mortgageLoanServiceReference;
  }

  public void setMortgageLoanServiceReference(String mortgageLoanServiceReference) {
    this.mortgageLoanServiceReference = mortgageLoanServiceReference;
  }


  /**
   * Get mortgageLoanServiceConfigurationRecord
   * @return mortgageLoanServiceConfigurationRecord
  **/

  public SDMortgageLoanConfigureInputModelMortgageLoanServiceConfigurationRecord getMortgageLoanServiceConfigurationRecord() {
    return mortgageLoanServiceConfigurationRecord;
  }

  public void setMortgageLoanServiceConfigurationRecord(SDMortgageLoanConfigureInputModelMortgageLoanServiceConfigurationRecord mortgageLoanServiceConfigurationRecord) {
    this.mortgageLoanServiceConfigurationRecord = mortgageLoanServiceConfigurationRecord;
  }


}

