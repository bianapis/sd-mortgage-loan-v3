package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQFinancialAccountingRetrieveOutputModelFinancialAccountingInstanceReport
 */
public class BQFinancialAccountingRetrieveOutputModelFinancialAccountingInstanceReport   {
  private Object financialAccountingInstanceReportRecord = null;

  private String financialAccountingInstanceReportType = null;

  private String financialAccountingInstanceReportParameters = null;

  private Object financialAccountingInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return financialAccountingInstanceReportRecord
  **/

  public Object getFinancialAccountingInstanceReportRecord() {
    return financialAccountingInstanceReportRecord;
  }

  public void setFinancialAccountingInstanceReportRecord(Object financialAccountingInstanceReportRecord) {
    this.financialAccountingInstanceReportRecord = financialAccountingInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return financialAccountingInstanceReportType
  **/

  public String getFinancialAccountingInstanceReportType() {
    return financialAccountingInstanceReportType;
  }

  public void setFinancialAccountingInstanceReportType(String financialAccountingInstanceReportType) {
    this.financialAccountingInstanceReportType = financialAccountingInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return financialAccountingInstanceReportParameters
  **/

  public String getFinancialAccountingInstanceReportParameters() {
    return financialAccountingInstanceReportParameters;
  }

  public void setFinancialAccountingInstanceReportParameters(String financialAccountingInstanceReportParameters) {
    this.financialAccountingInstanceReportParameters = financialAccountingInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return financialAccountingInstanceReport
  **/

  public Object getFinancialAccountingInstanceReport() {
    return financialAccountingInstanceReport;
  }

  public void setFinancialAccountingInstanceReport(Object financialAccountingInstanceReport) {
    this.financialAccountingInstanceReport = financialAccountingInstanceReport;
  }


}

