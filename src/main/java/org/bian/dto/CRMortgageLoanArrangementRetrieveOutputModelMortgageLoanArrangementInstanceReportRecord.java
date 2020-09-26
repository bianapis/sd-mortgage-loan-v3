package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRMortgageLoanArrangementRetrieveOutputModelMortgageLoanArrangementInstanceReportRecord
 */
public class CRMortgageLoanArrangementRetrieveOutputModelMortgageLoanArrangementInstanceReportRecord   {
  private String mortgageLoanArrangementInstanceReportData = null;

  private String mortgageLoanArrangementInstanceReportType = null;

  private Object mortgageLoanArrangementInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return mortgageLoanArrangementInstanceReportData
  **/

  public String getMortgageLoanArrangementInstanceReportData() {
    return mortgageLoanArrangementInstanceReportData;
  }

  public void setMortgageLoanArrangementInstanceReportData(String mortgageLoanArrangementInstanceReportData) {
    this.mortgageLoanArrangementInstanceReportData = mortgageLoanArrangementInstanceReportData;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return mortgageLoanArrangementInstanceReportType
  **/

  public String getMortgageLoanArrangementInstanceReportType() {
    return mortgageLoanArrangementInstanceReportType;
  }

  public void setMortgageLoanArrangementInstanceReportType(String mortgageLoanArrangementInstanceReportType) {
    this.mortgageLoanArrangementInstanceReportType = mortgageLoanArrangementInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return mortgageLoanArrangementInstanceReport
  **/

  public Object getMortgageLoanArrangementInstanceReport() {
    return mortgageLoanArrangementInstanceReport;
  }

  public void setMortgageLoanArrangementInstanceReport(Object mortgageLoanArrangementInstanceReport) {
    this.mortgageLoanArrangementInstanceReport = mortgageLoanArrangementInstanceReport;
  }


}

