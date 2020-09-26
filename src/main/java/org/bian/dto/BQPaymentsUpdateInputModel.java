package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQPaymentsUpdateInputModel
 */
public class BQPaymentsUpdateInputModel   {
  private String mortgageLoanArrangementInstanceReference = null;

  private String paymentsInstanceReference = null;

  private String paymentsPreconditions = null;

  private String paymentsFeatureSchedule = null;

  private String businessService = null;

  private String paymentsPostconditions = null;

  private String paymentsServiceType = null;

  private String paymentsServiceDescription = null;

  private String paymentsServiceInputsandOuputs = null;

  private String paymentsServiceWorkProduct = null;

  private String paymentsServiceName = null;

  private Object paymentsUpdateActionTaskRecord = null;

  private String paymentsUpdateActionRequest = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Payments instance 
   * @return paymentsInstanceReference
  **/

  public String getPaymentsInstanceReference() {
    return paymentsInstanceReference;
  }

  public void setPaymentsInstanceReference(String paymentsInstanceReference) {
    this.paymentsInstanceReference = paymentsInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The required status/situation prior to the implementation of the feature 
   * @return paymentsPreconditions
  **/

  public String getPaymentsPreconditions() {
    return paymentsPreconditions;
  }

  public void setPaymentsPreconditions(String paymentsPreconditions) {
    this.paymentsPreconditions = paymentsPreconditions;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The timing and key actions/milestones involved in completing the fulfillment feature instance 
   * @return paymentsFeatureSchedule
  **/

  public String getPaymentsFeatureSchedule() {
    return paymentsFeatureSchedule;
  }

  public void setPaymentsFeatureSchedule(String paymentsFeatureSchedule) {
    this.paymentsFeatureSchedule = paymentsFeatureSchedule;
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
   * @return paymentsPostconditions
  **/

  public String getPaymentsPostconditions() {
    return paymentsPostconditions;
  }

  public void setPaymentsPostconditions(String paymentsPostconditions) {
    this.paymentsPostconditions = paymentsPostconditions;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Reference to the specific business service type 
   * @return paymentsServiceType
  **/

  public String getPaymentsServiceType() {
    return paymentsServiceType;
  }

  public void setPaymentsServiceType(String paymentsServiceType) {
    this.paymentsServiceType = paymentsServiceType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the performed business service 
   * @return paymentsServiceDescription
  **/

  public String getPaymentsServiceDescription() {
    return paymentsServiceDescription;
  }

  public void setPaymentsServiceDescription(String paymentsServiceDescription) {
    this.paymentsServiceDescription = paymentsServiceDescription;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Mandatory and optional inputs and output information for the business service 
   * @return paymentsServiceInputsandOuputs
  **/

  public String getPaymentsServiceInputsandOuputs() {
    return paymentsServiceInputsandOuputs;
  }

  public void setPaymentsServiceInputsandOuputs(String paymentsServiceInputsandOuputs) {
    this.paymentsServiceInputsandOuputs = paymentsServiceInputsandOuputs;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service 
   * @return paymentsServiceWorkProduct
  **/

  public String getPaymentsServiceWorkProduct() {
    return paymentsServiceWorkProduct;
  }

  public void setPaymentsServiceWorkProduct(String paymentsServiceWorkProduct) {
    this.paymentsServiceWorkProduct = paymentsServiceWorkProduct;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info:  
   * @return paymentsServiceName
  **/

  public String getPaymentsServiceName() {
    return paymentsServiceName;
  }

  public void setPaymentsServiceName(String paymentsServiceName) {
    this.paymentsServiceName = paymentsServiceName;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return paymentsUpdateActionTaskRecord
  **/

  public Object getPaymentsUpdateActionTaskRecord() {
    return paymentsUpdateActionTaskRecord;
  }

  public void setPaymentsUpdateActionTaskRecord(Object paymentsUpdateActionTaskRecord) {
    this.paymentsUpdateActionTaskRecord = paymentsUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return paymentsUpdateActionRequest
  **/

  public String getPaymentsUpdateActionRequest() {
    return paymentsUpdateActionRequest;
  }

  public void setPaymentsUpdateActionRequest(String paymentsUpdateActionRequest) {
    this.paymentsUpdateActionRequest = paymentsUpdateActionRequest;
  }


}

