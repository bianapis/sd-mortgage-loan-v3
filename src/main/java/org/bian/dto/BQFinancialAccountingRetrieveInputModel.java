package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQFinancialAccountingRetrieveInputModelFinancialAccountingInstanceAnalysis;
import org.bian.dto.BQFinancialAccountingRetrieveInputModelFinancialAccountingInstanceReport;

import javax.validation.Valid;
  
/**
 * BQFinancialAccountingRetrieveInputModel
 */
public class BQFinancialAccountingRetrieveInputModel   {
  private Object financialAccountingRetrieveActionTaskRecord = null;

  private String financialAccountingRetrieveActionRequest = null;

  private BQFinancialAccountingRetrieveInputModelFinancialAccountingInstanceReport financialAccountingInstanceReport = null;

  private BQFinancialAccountingRetrieveInputModelFinancialAccountingInstanceAnalysis financialAccountingInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return financialAccountingRetrieveActionTaskRecord
  **/

  public Object getFinancialAccountingRetrieveActionTaskRecord() {
    return financialAccountingRetrieveActionTaskRecord;
  }

  public void setFinancialAccountingRetrieveActionTaskRecord(Object financialAccountingRetrieveActionTaskRecord) {
    this.financialAccountingRetrieveActionTaskRecord = financialAccountingRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return financialAccountingRetrieveActionRequest
  **/

  public String getFinancialAccountingRetrieveActionRequest() {
    return financialAccountingRetrieveActionRequest;
  }

  public void setFinancialAccountingRetrieveActionRequest(String financialAccountingRetrieveActionRequest) {
    this.financialAccountingRetrieveActionRequest = financialAccountingRetrieveActionRequest;
  }


  /**
   * Get financialAccountingInstanceReport
   * @return financialAccountingInstanceReport
  **/

  public BQFinancialAccountingRetrieveInputModelFinancialAccountingInstanceReport getFinancialAccountingInstanceReport() {
    return financialAccountingInstanceReport;
  }

  public void setFinancialAccountingInstanceReport(BQFinancialAccountingRetrieveInputModelFinancialAccountingInstanceReport financialAccountingInstanceReport) {
    this.financialAccountingInstanceReport = financialAccountingInstanceReport;
  }


  /**
   * Get financialAccountingInstanceAnalysis
   * @return financialAccountingInstanceAnalysis
  **/

  public BQFinancialAccountingRetrieveInputModelFinancialAccountingInstanceAnalysis getFinancialAccountingInstanceAnalysis() {
    return financialAccountingInstanceAnalysis;
  }

  public void setFinancialAccountingInstanceAnalysis(BQFinancialAccountingRetrieveInputModelFinancialAccountingInstanceAnalysis financialAccountingInstanceAnalysis) {
    this.financialAccountingInstanceAnalysis = financialAccountingInstanceAnalysis;
  }


}

