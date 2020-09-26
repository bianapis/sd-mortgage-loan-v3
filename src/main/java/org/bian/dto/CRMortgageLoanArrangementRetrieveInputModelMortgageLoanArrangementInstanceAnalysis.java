package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRMortgageLoanArrangementRetrieveInputModelMortgageLoanArrangementInstanceAnalysis
 */
public class CRMortgageLoanArrangementRetrieveInputModelMortgageLoanArrangementInstanceAnalysis   {
  private String mortgageLoanArrangementInstanceAnalysisReference = null;

  private String mortgageLoanArrangementInstanceAnalysisReportType = null;

  private String mortgageLoanArrangementInstanceAnalysisParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return mortgageLoanArrangementInstanceAnalysisReference
  **/

  public String getMortgageLoanArrangementInstanceAnalysisReference() {
    return mortgageLoanArrangementInstanceAnalysisReference;
  }

  public void setMortgageLoanArrangementInstanceAnalysisReference(String mortgageLoanArrangementInstanceAnalysisReference) {
    this.mortgageLoanArrangementInstanceAnalysisReference = mortgageLoanArrangementInstanceAnalysisReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return mortgageLoanArrangementInstanceAnalysisParameters
  **/

  public String getMortgageLoanArrangementInstanceAnalysisParameters() {
    return mortgageLoanArrangementInstanceAnalysisParameters;
  }

  public void setMortgageLoanArrangementInstanceAnalysisParameters(String mortgageLoanArrangementInstanceAnalysisParameters) {
    this.mortgageLoanArrangementInstanceAnalysisParameters = mortgageLoanArrangementInstanceAnalysisParameters;
  }


}

