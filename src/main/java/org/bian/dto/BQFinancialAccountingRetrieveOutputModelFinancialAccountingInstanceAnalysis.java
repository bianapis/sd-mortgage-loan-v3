package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQFinancialAccountingRetrieveOutputModelFinancialAccountingInstanceAnalysis
 */
public class BQFinancialAccountingRetrieveOutputModelFinancialAccountingInstanceAnalysis   {
  private Object financialAccountingInstanceAnalysisRecord = null;

  private String financialAccountingInstanceAnalysisReportType = null;

  private String financialAccountingInstanceAnalysisParameters = null;

  private Object financialAccountingInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return financialAccountingInstanceAnalysisRecord
  **/

  public Object getFinancialAccountingInstanceAnalysisRecord() {
    return financialAccountingInstanceAnalysisRecord;
  }

  public void setFinancialAccountingInstanceAnalysisRecord(Object financialAccountingInstanceAnalysisRecord) {
    this.financialAccountingInstanceAnalysisRecord = financialAccountingInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return financialAccountingInstanceAnalysisReportType
  **/

  public String getFinancialAccountingInstanceAnalysisReportType() {
    return financialAccountingInstanceAnalysisReportType;
  }

  public void setFinancialAccountingInstanceAnalysisReportType(String financialAccountingInstanceAnalysisReportType) {
    this.financialAccountingInstanceAnalysisReportType = financialAccountingInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return financialAccountingInstanceAnalysisParameters
  **/

  public String getFinancialAccountingInstanceAnalysisParameters() {
    return financialAccountingInstanceAnalysisParameters;
  }

  public void setFinancialAccountingInstanceAnalysisParameters(String financialAccountingInstanceAnalysisParameters) {
    this.financialAccountingInstanceAnalysisParameters = financialAccountingInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return financialAccountingInstanceAnalysisReport
  **/

  public Object getFinancialAccountingInstanceAnalysisReport() {
    return financialAccountingInstanceAnalysisReport;
  }

  public void setFinancialAccountingInstanceAnalysisReport(Object financialAccountingInstanceAnalysisReport) {
    this.financialAccountingInstanceAnalysisReport = financialAccountingInstanceAnalysisReport;
  }


}

