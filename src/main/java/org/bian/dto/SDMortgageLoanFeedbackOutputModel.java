package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDMortgageLoanFeedbackOutputModelMortgageLoanFeedbackActionRecord;

import javax.validation.Valid;
  
/**
 * SDMortgageLoanFeedbackOutputModel
 */
public class SDMortgageLoanFeedbackOutputModel   {
  private String mortgageLoanFeedbackActionTaskReference = null;

  private Object mortgageLoanFeedbackActionTaskRecord = null;

  private SDMortgageLoanFeedbackOutputModelMortgageLoanFeedbackActionRecord mortgageLoanFeedbackActionRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a feedback service call 
   * @return mortgageLoanFeedbackActionTaskReference
  **/

  public String getMortgageLoanFeedbackActionTaskReference() {
    return mortgageLoanFeedbackActionTaskReference;
  }

  public void setMortgageLoanFeedbackActionTaskReference(String mortgageLoanFeedbackActionTaskReference) {
    this.mortgageLoanFeedbackActionTaskReference = mortgageLoanFeedbackActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The feedback service call consolidated processing record 
   * @return mortgageLoanFeedbackActionTaskRecord
  **/

  public Object getMortgageLoanFeedbackActionTaskRecord() {
    return mortgageLoanFeedbackActionTaskRecord;
  }

  public void setMortgageLoanFeedbackActionTaskRecord(Object mortgageLoanFeedbackActionTaskRecord) {
    this.mortgageLoanFeedbackActionTaskRecord = mortgageLoanFeedbackActionTaskRecord;
  }


  /**
   * Get mortgageLoanFeedbackActionRecord
   * @return mortgageLoanFeedbackActionRecord
  **/

  public SDMortgageLoanFeedbackOutputModelMortgageLoanFeedbackActionRecord getMortgageLoanFeedbackActionRecord() {
    return mortgageLoanFeedbackActionRecord;
  }

  public void setMortgageLoanFeedbackActionRecord(SDMortgageLoanFeedbackOutputModelMortgageLoanFeedbackActionRecord mortgageLoanFeedbackActionRecord) {
    this.mortgageLoanFeedbackActionRecord = mortgageLoanFeedbackActionRecord;
  }


}

