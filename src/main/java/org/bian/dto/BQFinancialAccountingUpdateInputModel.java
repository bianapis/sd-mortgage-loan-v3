package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQFinancialAccountingUpdateInputModel
 */
public class BQFinancialAccountingUpdateInputModel   {
  private String mortgageLoanArrangementInstanceReference = null;

  private String financialAccountingInstanceReference = null;

  private String financialAccountingPreconditions = null;

  private String financialAccountingFeatureSchedule = null;

  private String financialAccountingPostconditions = null;

  private String financialAccountingFinancialAccountingServiceType = null;

  private String financialAccountingFinancialAccountingServiceDescription = null;

  private String financialAccountingFinancialAccountingServiceInputsandOuputs = null;

  private String financialAccountingFinancialAccountingServiceWorkProduct = null;

  private String financialAccountingFinancialAccountingServiceName = null;

  private Object financialAccountingUpdateActionTaskRecord = null;

  private String financialAccountingUpdateActionRequest = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent Mortgage Loan Arrangement instance 
   * @return mortgageLoanArrangementInstanceReference
  **/

  public String getMortgageLoanArrangementInstanceReference() {
    return mortgageLoanArrangementInstanceReference;
  }

  public void setMortgageLoanArrangementInstanceReference(String mortgageLoanArrangementInstanceReference) {
    this.mortgageLoanArrangementInstanceReference = mortgageLoanArrangementInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Financial Accounting instance 
   * @return financialAccountingInstanceReference
  **/

  public String getFinancialAccountingInstanceReference() {
    return financialAccountingInstanceReference;
  }

  public void setFinancialAccountingInstanceReference(String financialAccountingInstanceReference) {
    this.financialAccountingInstanceReference = financialAccountingInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The required status/situation prior to the implementation of the feature 
   * @return financialAccountingPreconditions
  **/

  public String getFinancialAccountingPreconditions() {
    return financialAccountingPreconditions;
  }

  public void setFinancialAccountingPreconditions(String financialAccountingPreconditions) {
    this.financialAccountingPreconditions = financialAccountingPreconditions;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The timing and key actions/milestones involved in completing the fulfillment feature instance 
   * @return financialAccountingFeatureSchedule
  **/

  public String getFinancialAccountingFeatureSchedule() {
    return financialAccountingFeatureSchedule;
  }

  public void setFinancialAccountingFeatureSchedule(String financialAccountingFeatureSchedule) {
    this.financialAccountingFeatureSchedule = financialAccountingFeatureSchedule;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The completion status and any triggered/dependent actions once the feature instance has been fulfilled 
   * @return financialAccountingPostconditions
  **/

  public String getFinancialAccountingPostconditions() {
    return financialAccountingPostconditions;
  }

  public void setFinancialAccountingPostconditions(String financialAccountingPostconditions) {
    this.financialAccountingPostconditions = financialAccountingPostconditions;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Reference to the specific business service type 
   * @return financialAccountingFinancialAccountingServiceType
  **/

  public String getFinancialAccountingFinancialAccountingServiceType() {
    return financialAccountingFinancialAccountingServiceType;
  }

  public void setFinancialAccountingFinancialAccountingServiceType(String financialAccountingFinancialAccountingServiceType) {
    this.financialAccountingFinancialAccountingServiceType = financialAccountingFinancialAccountingServiceType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the performed business service 
   * @return financialAccountingFinancialAccountingServiceDescription
  **/

  public String getFinancialAccountingFinancialAccountingServiceDescription() {
    return financialAccountingFinancialAccountingServiceDescription;
  }

  public void setFinancialAccountingFinancialAccountingServiceDescription(String financialAccountingFinancialAccountingServiceDescription) {
    this.financialAccountingFinancialAccountingServiceDescription = financialAccountingFinancialAccountingServiceDescription;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Mandatory and optional inputs and output information for the business service 
   * @return financialAccountingFinancialAccountingServiceInputsandOuputs
  **/

  public String getFinancialAccountingFinancialAccountingServiceInputsandOuputs() {
    return financialAccountingFinancialAccountingServiceInputsandOuputs;
  }

  public void setFinancialAccountingFinancialAccountingServiceInputsandOuputs(String financialAccountingFinancialAccountingServiceInputsandOuputs) {
    this.financialAccountingFinancialAccountingServiceInputsandOuputs = financialAccountingFinancialAccountingServiceInputsandOuputs;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service 
   * @return financialAccountingFinancialAccountingServiceWorkProduct
  **/

  public String getFinancialAccountingFinancialAccountingServiceWorkProduct() {
    return financialAccountingFinancialAccountingServiceWorkProduct;
  }

  public void setFinancialAccountingFinancialAccountingServiceWorkProduct(String financialAccountingFinancialAccountingServiceWorkProduct) {
    this.financialAccountingFinancialAccountingServiceWorkProduct = financialAccountingFinancialAccountingServiceWorkProduct;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info:  
   * @return financialAccountingFinancialAccountingServiceName
  **/

  public String getFinancialAccountingFinancialAccountingServiceName() {
    return financialAccountingFinancialAccountingServiceName;
  }

  public void setFinancialAccountingFinancialAccountingServiceName(String financialAccountingFinancialAccountingServiceName) {
    this.financialAccountingFinancialAccountingServiceName = financialAccountingFinancialAccountingServiceName;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return financialAccountingUpdateActionTaskRecord
  **/

  public Object getFinancialAccountingUpdateActionTaskRecord() {
    return financialAccountingUpdateActionTaskRecord;
  }

  public void setFinancialAccountingUpdateActionTaskRecord(Object financialAccountingUpdateActionTaskRecord) {
    this.financialAccountingUpdateActionTaskRecord = financialAccountingUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return financialAccountingUpdateActionRequest
  **/

  public String getFinancialAccountingUpdateActionRequest() {
    return financialAccountingUpdateActionRequest;
  }

  public void setFinancialAccountingUpdateActionRequest(String financialAccountingUpdateActionRequest) {
    this.financialAccountingUpdateActionRequest = financialAccountingUpdateActionRequest;
  }


}

