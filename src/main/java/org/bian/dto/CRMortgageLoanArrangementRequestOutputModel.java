package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRMortgageLoanArrangementRequestOutputModel
 */
public class CRMortgageLoanArrangementRequestOutputModel   {
  private String mortgageLoanArrangementParameterType = null;

  private String mortgageLoanArrangementSelectedOption = null;

  private String mortgageLoanArrangementSchedule = null;

  private String mortgageLoanArrangementStatus = null;

  private String mortgageLoanArrangementRequestActionTaskReference = null;

  private Object mortgageLoanArrangementRequestActionTaskRecord = null;

  private String requestRecordReference = null;

  private Object requestResponseRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Mortgage Loan Arrangement instance request service call 
   * @return mortgageLoanArrangementRequestActionTaskReference
  **/

  public String getMortgageLoanArrangementRequestActionTaskReference() {
    return mortgageLoanArrangementRequestActionTaskReference;
  }

  public void setMortgageLoanArrangementRequestActionTaskReference(String mortgageLoanArrangementRequestActionTaskReference) {
    this.mortgageLoanArrangementRequestActionTaskReference = mortgageLoanArrangementRequestActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return mortgageLoanArrangementRequestActionTaskRecord
  **/

  public Object getMortgageLoanArrangementRequestActionTaskRecord() {
    return mortgageLoanArrangementRequestActionTaskRecord;
  }

  public void setMortgageLoanArrangementRequestActionTaskRecord(Object mortgageLoanArrangementRequestActionTaskRecord) {
    this.mortgageLoanArrangementRequestActionTaskRecord = mortgageLoanArrangementRequestActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the service request record 
   * @return requestRecordReference
  **/

  public String getRequestRecordReference() {
    return requestRecordReference;
  }

  public void setRequestRecordReference(String requestRecordReference) {
    this.requestRecordReference = requestRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the request action service response 
   * @return requestResponseRecord
  **/

  public Object getRequestResponseRecord() {
    return requestResponseRecord;
  }

  public void setRequestResponseRecord(Object requestResponseRecord) {
    this.requestResponseRecord = requestResponseRecord;
  }


}

