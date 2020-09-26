package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRMortgageLoanArrangementControlOutputModel
 */
public class CRMortgageLoanArrangementControlOutputModel   {
  private String mortgageLoanArrangementParameterType = null;

  private String mortgageLoanArrangementSelectedOption = null;

  private String mortgageLoanArrangementSchedule = null;

  private String mortgageLoanArrangementStatus = null;

  private String mortgageLoanArrangementControlActionTaskReference = null;

  private Object mortgageLoanArrangementControlActionTaskRecord = null;

  private String mortgageLoanArrangementControlActionResponse = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: A Classification value that distinguishes between arrangements according to the type of business services within Mortgage Loan Arrangement 
   * @return mortgageLoanArrangementParameterType
  **/

  public String getMortgageLoanArrangementParameterType() {
    return mortgageLoanArrangementParameterType;
  }

  public void setMortgageLoanArrangementParameterType(String mortgageLoanArrangementParameterType) {
    this.mortgageLoanArrangementParameterType = mortgageLoanArrangementParameterType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: A selected optional business service as subject matter of Mortgage Loan Arrangement 
   * @return mortgageLoanArrangementSelectedOption
  **/

  public String getMortgageLoanArrangementSelectedOption() {
    return mortgageLoanArrangementSelectedOption;
  }

  public void setMortgageLoanArrangementSelectedOption(String mortgageLoanArrangementSelectedOption) {
    this.mortgageLoanArrangementSelectedOption = mortgageLoanArrangementSelectedOption;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Timetable to fulfill Mortgage Loan Arrangement 
   * @return mortgageLoanArrangementSchedule
  **/

  public String getMortgageLoanArrangementSchedule() {
    return mortgageLoanArrangementSchedule;
  }

  public void setMortgageLoanArrangementSchedule(String mortgageLoanArrangementSchedule) {
    this.mortgageLoanArrangementSchedule = mortgageLoanArrangementSchedule;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of Mortgage Loan Arrangement 
   * @return mortgageLoanArrangementStatus
  **/

  public String getMortgageLoanArrangementStatus() {
    return mortgageLoanArrangementStatus;
  }

  public void setMortgageLoanArrangementStatus(String mortgageLoanArrangementStatus) {
    this.mortgageLoanArrangementStatus = mortgageLoanArrangementStatus;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Mortgage Loan Arrangement instance control processing service call 
   * @return mortgageLoanArrangementControlActionTaskReference
  **/

  public String getMortgageLoanArrangementControlActionTaskReference() {
    return mortgageLoanArrangementControlActionTaskReference;
  }

  public void setMortgageLoanArrangementControlActionTaskReference(String mortgageLoanArrangementControlActionTaskReference) {
    this.mortgageLoanArrangementControlActionTaskReference = mortgageLoanArrangementControlActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The processing control service call consolidated processing record 
   * @return mortgageLoanArrangementControlActionTaskRecord
  **/

  public Object getMortgageLoanArrangementControlActionTaskRecord() {
    return mortgageLoanArrangementControlActionTaskRecord;
  }

  public void setMortgageLoanArrangementControlActionTaskRecord(Object mortgageLoanArrangementControlActionTaskRecord) {
    this.mortgageLoanArrangementControlActionTaskRecord = mortgageLoanArrangementControlActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the control action service response 
   * @return mortgageLoanArrangementControlActionResponse
  **/

  public String getMortgageLoanArrangementControlActionResponse() {
    return mortgageLoanArrangementControlActionResponse;
  }

  public void setMortgageLoanArrangementControlActionResponse(String mortgageLoanArrangementControlActionResponse) {
    this.mortgageLoanArrangementControlActionResponse = mortgageLoanArrangementControlActionResponse;
  }


}

