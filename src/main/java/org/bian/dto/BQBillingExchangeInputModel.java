package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRMortgageLoanArrangementExchangeInputModelMortgageLoanArrangementExchangeActionRequest;

import javax.validation.Valid;
  
/**
 * BQBillingExchangeInputModel
 */
public class BQBillingExchangeInputModel   {
  private String mortgageLoanArrangementInstanceReference = null;

  private String billingInstanceReference = null;

  private String billingPreconditions = null;

  private String billingFeatureSchedule = null;

  private String businessService = null;

  private String billingPostconditions = null;

  private String billingServiceType = null;

  private String billingServiceDescription = null;

  private String billingServiceInputsandOuputs = null;

  private String billingServiceWorkProduct = null;

  private String billingServiceName = null;

  private Object billingExchangeActionTaskRecord = null;

  private CRMortgageLoanArrangementExchangeInputModelMortgageLoanArrangementExchangeActionRequest billingExchangeActionRequest = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Billing instance 
   * @return billingInstanceReference
  **/

  public String getBillingInstanceReference() {
    return billingInstanceReference;
  }

  public void setBillingInstanceReference(String billingInstanceReference) {
    this.billingInstanceReference = billingInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The required status/situation prior to the implementation of the feature 
   * @return billingPreconditions
  **/

  public String getBillingPreconditions() {
    return billingPreconditions;
  }

  public void setBillingPreconditions(String billingPreconditions) {
    this.billingPreconditions = billingPreconditions;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The timing and key actions/milestones involved in completing the fulfillment feature instance 
   * @return billingFeatureSchedule
  **/

  public String getBillingFeatureSchedule() {
    return billingFeatureSchedule;
  }

  public void setBillingFeatureSchedule(String billingFeatureSchedule) {
    this.billingFeatureSchedule = billingFeatureSchedule;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The Mortgage Loan Arrangement specific Business Service 
   * @return businessService
  **/

  public String getBusinessService() {
    return businessService;
  }

  public void setBusinessService(String businessService) {
    this.businessService = businessService;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The completion status and any triggered/dependent actions once the feature instance has been fulfilled 
   * @return billingPostconditions
  **/

  public String getBillingPostconditions() {
    return billingPostconditions;
  }

  public void setBillingPostconditions(String billingPostconditions) {
    this.billingPostconditions = billingPostconditions;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Reference to the specific business service type 
   * @return billingServiceType
  **/

  public String getBillingServiceType() {
    return billingServiceType;
  }

  public void setBillingServiceType(String billingServiceType) {
    this.billingServiceType = billingServiceType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the performed business service 
   * @return billingServiceDescription
  **/

  public String getBillingServiceDescription() {
    return billingServiceDescription;
  }

  public void setBillingServiceDescription(String billingServiceDescription) {
    this.billingServiceDescription = billingServiceDescription;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Mandatory and optional inputs and output information for the business service 
   * @return billingServiceInputsandOuputs
  **/

  public String getBillingServiceInputsandOuputs() {
    return billingServiceInputsandOuputs;
  }

  public void setBillingServiceInputsandOuputs(String billingServiceInputsandOuputs) {
    this.billingServiceInputsandOuputs = billingServiceInputsandOuputs;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service 
   * @return billingServiceWorkProduct
  **/

  public String getBillingServiceWorkProduct() {
    return billingServiceWorkProduct;
  }

  public void setBillingServiceWorkProduct(String billingServiceWorkProduct) {
    this.billingServiceWorkProduct = billingServiceWorkProduct;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info:  
   * @return billingServiceName
  **/

  public String getBillingServiceName() {
    return billingServiceName;
  }

  public void setBillingServiceName(String billingServiceName) {
    this.billingServiceName = billingServiceName;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record 
   * @return billingExchangeActionTaskRecord
  **/

  public Object getBillingExchangeActionTaskRecord() {
    return billingExchangeActionTaskRecord;
  }

  public void setBillingExchangeActionTaskRecord(Object billingExchangeActionTaskRecord) {
    this.billingExchangeActionTaskRecord = billingExchangeActionTaskRecord;
  }


  /**
   * Get billingExchangeActionRequest
   * @return billingExchangeActionRequest
  **/

  public CRMortgageLoanArrangementExchangeInputModelMortgageLoanArrangementExchangeActionRequest getBillingExchangeActionRequest() {
    return billingExchangeActionRequest;
  }

  public void setBillingExchangeActionRequest(CRMortgageLoanArrangementExchangeInputModelMortgageLoanArrangementExchangeActionRequest billingExchangeActionRequest) {
    this.billingExchangeActionRequest = billingExchangeActionRequest;
  }


}

