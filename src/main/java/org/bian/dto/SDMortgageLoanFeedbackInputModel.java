package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDMortgageLoanFeedbackInputModelMortgageLoanFeedbackActionRecord;

import javax.validation.Valid;
  
/**
 * SDMortgageLoanFeedbackInputModel
 */
public class SDMortgageLoanFeedbackInputModel   {
  private Object mortgageLoanFeedbackActionTaskRecord = null;

  private SDMortgageLoanFeedbackInputModelMortgageLoanFeedbackActionRecord mortgageLoanFeedbackActionRecord = null;


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

  public SDMortgageLoanFeedbackInputModelMortgageLoanFeedbackActionRecord getMortgageLoanFeedbackActionRecord() {
    return mortgageLoanFeedbackActionRecord;
  }

  public void setMortgageLoanFeedbackActionRecord(SDMortgageLoanFeedbackInputModelMortgageLoanFeedbackActionRecord mortgageLoanFeedbackActionRecord) {
    this.mortgageLoanFeedbackActionRecord = mortgageLoanFeedbackActionRecord;
  }


}

