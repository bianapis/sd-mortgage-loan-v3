package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRMortgageLoanArrangementInitiateOutputModel
 */
public class CRMortgageLoanArrangementInitiateOutputModel   {
  private String mortgageLoanArrangementInstanceReference = null;

  private String mortgageLoanArrangementInitiateActionReference = null;

  private Object mortgageLoanArrangementInitiateActionRecord = null;

  private String mortgageLoanArrangementInstanceStatus = null;

  private String mortgageLoanArrangementParameterType = null;

  private String mortgageLoanArrangementSelectedOption = null;

  private String mortgageLoanArrangementSchedule = null;

  private String mortgageLoanArrangementStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Mortgage Loan Arrangement instance 
   * @return mortgageLoanArrangementInstanceReference
  **/

  public String getMortgageLoanArrangementInstanceReference() {
    return mortgageLoanArrangementInstanceReference;
  }

  public void setMortgageLoanArrangementInstanceReference(String mortgageLoanArrangementInstanceReference) {
    this.mortgageLoanArrangementInstanceReference = mortgageLoanArrangementInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Initiate service call 
   * @return mortgageLoanArrangementInitiateActionReference
  **/

  public String getMortgageLoanArrangementInitiateActionReference() {
    return mortgageLoanArrangementInitiateActionReference;
  }

  public void setMortgageLoanArrangementInitiateActionReference(String mortgageLoanArrangementInitiateActionReference) {
    this.mortgageLoanArrangementInitiateActionReference = mortgageLoanArrangementInitiateActionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return mortgageLoanArrangementInitiateActionRecord
  **/

  public Object getMortgageLoanArrangementInitiateActionRecord() {
    return mortgageLoanArrangementInitiateActionRecord;
  }

  public void setMortgageLoanArrangementInitiateActionRecord(Object mortgageLoanArrangementInitiateActionRecord) {
    this.mortgageLoanArrangementInitiateActionRecord = mortgageLoanArrangementInitiateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Mortgage Loan Arrangement instance (e.g. initialised, pending, active) 
   * @return mortgageLoanArrangementInstanceStatus
  **/

  public String getMortgageLoanArrangementInstanceStatus() {
    return mortgageLoanArrangementInstanceStatus;
  }

  public void setMortgageLoanArrangementInstanceStatus(String mortgageLoanArrangementInstanceStatus) {
    this.mortgageLoanArrangementInstanceStatus = mortgageLoanArrangementInstanceStatus;
  }


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


}

