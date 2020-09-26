package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRMortgageLoanArrangementRetrieveInputModelMortgageLoanArrangementInstanceAnalysis;
import org.bian.dto.CRMortgageLoanArrangementRetrieveInputModelMortgageLoanArrangementInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRMortgageLoanArrangementRetrieveInputModel
 */
public class CRMortgageLoanArrangementRetrieveInputModel   {
  private Object mortgageLoanArrangementRetrieveActionTaskRecord = null;

  private String mortgageLoanArrangementRetrieveActionRequest = null;

  private CRMortgageLoanArrangementRetrieveInputModelMortgageLoanArrangementInstanceReportRecord mortgageLoanArrangementInstanceReportRecord = null;

  private CRMortgageLoanArrangementRetrieveInputModelMortgageLoanArrangementInstanceAnalysis mortgageLoanArrangementInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return mortgageLoanArrangementRetrieveActionTaskRecord
  **/

  public Object getMortgageLoanArrangementRetrieveActionTaskRecord() {
    return mortgageLoanArrangementRetrieveActionTaskRecord;
  }

  public void setMortgageLoanArrangementRetrieveActionTaskRecord(Object mortgageLoanArrangementRetrieveActionTaskRecord) {
    this.mortgageLoanArrangementRetrieveActionTaskRecord = mortgageLoanArrangementRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return mortgageLoanArrangementRetrieveActionRequest
  **/

  public String getMortgageLoanArrangementRetrieveActionRequest() {
    return mortgageLoanArrangementRetrieveActionRequest;
  }

  public void setMortgageLoanArrangementRetrieveActionRequest(String mortgageLoanArrangementRetrieveActionRequest) {
    this.mortgageLoanArrangementRetrieveActionRequest = mortgageLoanArrangementRetrieveActionRequest;
  }


  /**
   * Get mortgageLoanArrangementInstanceReportRecord
   * @return mortgageLoanArrangementInstanceReportRecord
  **/

  public CRMortgageLoanArrangementRetrieveInputModelMortgageLoanArrangementInstanceReportRecord getMortgageLoanArrangementInstanceReportRecord() {
    return mortgageLoanArrangementInstanceReportRecord;
  }

  public void setMortgageLoanArrangementInstanceReportRecord(CRMortgageLoanArrangementRetrieveInputModelMortgageLoanArrangementInstanceReportRecord mortgageLoanArrangementInstanceReportRecord) {
    this.mortgageLoanArrangementInstanceReportRecord = mortgageLoanArrangementInstanceReportRecord;
  }


  /**
   * Get mortgageLoanArrangementInstanceAnalysis
   * @return mortgageLoanArrangementInstanceAnalysis
  **/

  public CRMortgageLoanArrangementRetrieveInputModelMortgageLoanArrangementInstanceAnalysis getMortgageLoanArrangementInstanceAnalysis() {
    return mortgageLoanArrangementInstanceAnalysis;
  }

  public void setMortgageLoanArrangementInstanceAnalysis(CRMortgageLoanArrangementRetrieveInputModelMortgageLoanArrangementInstanceAnalysis mortgageLoanArrangementInstanceAnalysis) {
    this.mortgageLoanArrangementInstanceAnalysis = mortgageLoanArrangementInstanceAnalysis;
  }


}

