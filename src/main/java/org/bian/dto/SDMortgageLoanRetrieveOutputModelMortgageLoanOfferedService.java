package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDMortgageLoanRetrieveOutputModelMortgageLoanOfferedServiceMortgageLoanServiceRecord;

import javax.validation.Valid;
  
/**
 * SDMortgageLoanRetrieveOutputModelMortgageLoanOfferedService
 */
public class SDMortgageLoanRetrieveOutputModelMortgageLoanOfferedService   {
  private String mortgageLoanServiceReference = null;

  private SDMortgageLoanRetrieveOutputModelMortgageLoanOfferedServiceMortgageLoanServiceRecord mortgageLoanServiceRecord = null;


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
   * Get mortgageLoanServiceRecord
   * @return mortgageLoanServiceRecord
  **/

  public SDMortgageLoanRetrieveOutputModelMortgageLoanOfferedServiceMortgageLoanServiceRecord getMortgageLoanServiceRecord() {
    return mortgageLoanServiceRecord;
  }

  public void setMortgageLoanServiceRecord(SDMortgageLoanRetrieveOutputModelMortgageLoanOfferedServiceMortgageLoanServiceRecord mortgageLoanServiceRecord) {
    this.mortgageLoanServiceRecord = mortgageLoanServiceRecord;
  }


}

