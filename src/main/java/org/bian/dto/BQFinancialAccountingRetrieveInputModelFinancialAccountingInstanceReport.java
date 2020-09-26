package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQFinancialAccountingRetrieveInputModelFinancialAccountingInstanceReport
 */
public class BQFinancialAccountingRetrieveInputModelFinancialAccountingInstanceReport   {
  private String financialAccountingInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return financialAccountingInstanceReportReference
  **/

  public String getFinancialAccountingInstanceReportReference() {
    return financialAccountingInstanceReportReference;
  }

  public void setFinancialAccountingInstanceReportReference(String financialAccountingInstanceReportReference) {
    this.financialAccountingInstanceReportReference = financialAccountingInstanceReportReference;
  }


}

