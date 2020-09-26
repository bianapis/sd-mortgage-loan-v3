package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRMortgageLoanArrangementRetrieveInputModelMortgageLoanArrangementInstanceReportRecord
 */
public class CRMortgageLoanArrangementRetrieveInputModelMortgageLoanArrangementInstanceReportRecord   {
  private String mortgageLoanArrangementInstanceReportReference = null;

  private String mortgageLoanArrangementInstanceReportType = null;

  private String mortgageLoanArrangementInstanceReportParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return mortgageLoanArrangementInstanceReportReference
  **/

  public String getMortgageLoanArrangementInstanceReportReference() {
    return mortgageLoanArrangementInstanceReportReference;
  }

  public void setMortgageLoanArrangementInstanceReportReference(String mortgageLoanArrangementInstanceReportReference) {
    this.mortgageLoanArrangementInstanceReportReference = mortgageLoanArrangementInstanceReportReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return mortgageLoanArrangementInstanceReportParameters
  **/

  public String getMortgageLoanArrangementInstanceReportParameters() {
    return mortgageLoanArrangementInstanceReportParameters;
  }

  public void setMortgageLoanArrangementInstanceReportParameters(String mortgageLoanArrangementInstanceReportParameters) {
    this.mortgageLoanArrangementInstanceReportParameters = mortgageLoanArrangementInstanceReportParameters;
  }


}

