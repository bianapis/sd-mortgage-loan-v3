package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRMortgageLoanArrangementRetrieveOutputModelMortgageLoanArrangementInstanceAnalysis
 */
public class CRMortgageLoanArrangementRetrieveOutputModelMortgageLoanArrangementInstanceAnalysis   {
  private String mortgageLoanArrangementInstanceAnalysisData = null;

  private String mortgageLoanArrangementInstanceAnalysisReportType = null;

  private Object mortgageLoanArrangementInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return mortgageLoanArrangementInstanceAnalysisData
  **/

  public String getMortgageLoanArrangementInstanceAnalysisData() {
    return mortgageLoanArrangementInstanceAnalysisData;
  }

  public void setMortgageLoanArrangementInstanceAnalysisData(String mortgageLoanArrangementInstanceAnalysisData) {
    this.mortgageLoanArrangementInstanceAnalysisData = mortgageLoanArrangementInstanceAnalysisData;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return mortgageLoanArrangementInstanceAnalysisReportType
  **/

  public String getMortgageLoanArrangementInstanceAnalysisReportType() {
    return mortgageLoanArrangementInstanceAnalysisReportType;
  }

  public void setMortgageLoanArrangementInstanceAnalysisReportType(String mortgageLoanArrangementInstanceAnalysisReportType) {
    this.mortgageLoanArrangementInstanceAnalysisReportType = mortgageLoanArrangementInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return mortgageLoanArrangementInstanceAnalysisReport
  **/

  public Object getMortgageLoanArrangementInstanceAnalysisReport() {
    return mortgageLoanArrangementInstanceAnalysisReport;
  }

  public void setMortgageLoanArrangementInstanceAnalysisReport(Object mortgageLoanArrangementInstanceAnalysisReport) {
    this.mortgageLoanArrangementInstanceAnalysisReport = mortgageLoanArrangementInstanceAnalysisReport;
  }


}

