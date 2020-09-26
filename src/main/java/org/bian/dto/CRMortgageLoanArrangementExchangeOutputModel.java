package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRMortgageLoanArrangementExchangeOutputModel
 */
public class CRMortgageLoanArrangementExchangeOutputModel   {
  private String mortgageLoanArrangementParameterType = null;

  private String mortgageLoanArrangementSelectedOption = null;

  private String mortgageLoanArrangementSchedule = null;

  private String mortgageLoanArrangementStatus = null;

  private String mortgageLoanArrangementExchangeActionTaskReference = null;

  private Object mortgageLoanArrangementExchangeActionTaskRecord = null;

  private String mortgageLoanArrangementExchangeActionResponse = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Mortgage Loan Arrangement instance exchange service call 
   * @return mortgageLoanArrangementExchangeActionTaskReference
  **/

  public String getMortgageLoanArrangementExchangeActionTaskReference() {
    return mortgageLoanArrangementExchangeActionTaskReference;
  }

  public void setMortgageLoanArrangementExchangeActionTaskReference(String mortgageLoanArrangementExchangeActionTaskReference) {
    this.mortgageLoanArrangementExchangeActionTaskReference = mortgageLoanArrangementExchangeActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record 
   * @return mortgageLoanArrangementExchangeActionTaskRecord
  **/

  public Object getMortgageLoanArrangementExchangeActionTaskRecord() {
    return mortgageLoanArrangementExchangeActionTaskRecord;
  }

  public void setMortgageLoanArrangementExchangeActionTaskRecord(Object mortgageLoanArrangementExchangeActionTaskRecord) {
    this.mortgageLoanArrangementExchangeActionTaskRecord = mortgageLoanArrangementExchangeActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the exchange action service response 
   * @return mortgageLoanArrangementExchangeActionResponse
  **/

  public String getMortgageLoanArrangementExchangeActionResponse() {
    return mortgageLoanArrangementExchangeActionResponse;
  }

  public void setMortgageLoanArrangementExchangeActionResponse(String mortgageLoanArrangementExchangeActionResponse) {
    this.mortgageLoanArrangementExchangeActionResponse = mortgageLoanArrangementExchangeActionResponse;
  }


}

