package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDMortgageLoanActivateInputModelMortgageLoanServiceConfigurationRecord;

import javax.validation.Valid;
  
/**
 * SDMortgageLoanActivateInputModel
 */
public class SDMortgageLoanActivateInputModel   {
  private Object mortgageLoanActivationActionTaskRecord = null;

  private String mortgageLoanCenterReference = null;

  private String mortgageLoanServiceReference = null;

  private SDMortgageLoanActivateInputModelMortgageLoanServiceConfigurationRecord mortgageLoanServiceConfigurationRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the service center/operational unit 
   * @return mortgageLoanCenterReference
  **/

  public String getMortgageLoanCenterReference() {
    return mortgageLoanCenterReference;
  }

  public void setMortgageLoanCenterReference(String mortgageLoanCenterReference) {
    this.mortgageLoanCenterReference = mortgageLoanCenterReference;
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

  public SDMortgageLoanActivateInputModelMortgageLoanServiceConfigurationRecord getMortgageLoanServiceConfigurationRecord() {
    return mortgageLoanServiceConfigurationRecord;
  }

  public void setMortgageLoanServiceConfigurationRecord(SDMortgageLoanActivateInputModelMortgageLoanServiceConfigurationRecord mortgageLoanServiceConfigurationRecord) {
    this.mortgageLoanServiceConfigurationRecord = mortgageLoanServiceConfigurationRecord;
  }


}

