package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQWithdrawalsUpdateInputModel
 */
public class BQWithdrawalsUpdateInputModel   {
  private String mortgageLoanArrangementInstanceReference = null;

  private String withdrawalsInstanceReference = null;

  private String withdrawalsPreconditions = null;

  private String withdrawalsFeatureSchedule = null;

  private String withdrawalProcessing = null;

  private String withdrawalsPostconditions = null;

  private String withdrawalsWithdrawalProcessingServiceType = null;

  private String withdrawalsWithdrawalProcessingServiceDescription = null;

  private String withdrawalsWithdrawalProcessingServiceInputsandOuputs = null;

  private String withdrawalsWithdrawalProcessingServiceWorkProduct = null;

  private String withdrawalsWithdrawalProcessingServiceName = null;

  private Object withdrawalsUpdateActionTaskRecord = null;

  private String withdrawalsUpdateActionRequest = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Withdrawals instance 
   * @return withdrawalsInstanceReference
  **/

  public String getWithdrawalsInstanceReference() {
    return withdrawalsInstanceReference;
  }

  public void setWithdrawalsInstanceReference(String withdrawalsInstanceReference) {
    this.withdrawalsInstanceReference = withdrawalsInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The required status/situation prior to the implementation of the feature 
   * @return withdrawalsPreconditions
  **/

  public String getWithdrawalsPreconditions() {
    return withdrawalsPreconditions;
  }

  public void setWithdrawalsPreconditions(String withdrawalsPreconditions) {
    this.withdrawalsPreconditions = withdrawalsPreconditions;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The timing and key actions/milestones involved in completing the fulfillment feature instance 
   * @return withdrawalsFeatureSchedule
  **/

  public String getWithdrawalsFeatureSchedule() {
    return withdrawalsFeatureSchedule;
  }

  public void setWithdrawalsFeatureSchedule(String withdrawalsFeatureSchedule) {
    this.withdrawalsFeatureSchedule = withdrawalsFeatureSchedule;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The Mortgage Loan Arrangement specific Business Service 
   * @return withdrawalProcessing
  **/

  public String getWithdrawalProcessing() {
    return withdrawalProcessing;
  }

  public void setWithdrawalProcessing(String withdrawalProcessing) {
    this.withdrawalProcessing = withdrawalProcessing;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The completion status and any triggered/dependent actions once the feature instance has been fulfilled 
   * @return withdrawalsPostconditions
  **/

  public String getWithdrawalsPostconditions() {
    return withdrawalsPostconditions;
  }

  public void setWithdrawalsPostconditions(String withdrawalsPostconditions) {
    this.withdrawalsPostconditions = withdrawalsPostconditions;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Reference to the specific business service type 
   * @return withdrawalsWithdrawalProcessingServiceType
  **/

  public String getWithdrawalsWithdrawalProcessingServiceType() {
    return withdrawalsWithdrawalProcessingServiceType;
  }

  public void setWithdrawalsWithdrawalProcessingServiceType(String withdrawalsWithdrawalProcessingServiceType) {
    this.withdrawalsWithdrawalProcessingServiceType = withdrawalsWithdrawalProcessingServiceType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the performed business service 
   * @return withdrawalsWithdrawalProcessingServiceDescription
  **/

  public String getWithdrawalsWithdrawalProcessingServiceDescription() {
    return withdrawalsWithdrawalProcessingServiceDescription;
  }

  public void setWithdrawalsWithdrawalProcessingServiceDescription(String withdrawalsWithdrawalProcessingServiceDescription) {
    this.withdrawalsWithdrawalProcessingServiceDescription = withdrawalsWithdrawalProcessingServiceDescription;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Mandatory and optional inputs and output information for the business service 
   * @return withdrawalsWithdrawalProcessingServiceInputsandOuputs
  **/

  public String getWithdrawalsWithdrawalProcessingServiceInputsandOuputs() {
    return withdrawalsWithdrawalProcessingServiceInputsandOuputs;
  }

  public void setWithdrawalsWithdrawalProcessingServiceInputsandOuputs(String withdrawalsWithdrawalProcessingServiceInputsandOuputs) {
    this.withdrawalsWithdrawalProcessingServiceInputsandOuputs = withdrawalsWithdrawalProcessingServiceInputsandOuputs;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service 
   * @return withdrawalsWithdrawalProcessingServiceWorkProduct
  **/

  public String getWithdrawalsWithdrawalProcessingServiceWorkProduct() {
    return withdrawalsWithdrawalProcessingServiceWorkProduct;
  }

  public void setWithdrawalsWithdrawalProcessingServiceWorkProduct(String withdrawalsWithdrawalProcessingServiceWorkProduct) {
    this.withdrawalsWithdrawalProcessingServiceWorkProduct = withdrawalsWithdrawalProcessingServiceWorkProduct;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info:  
   * @return withdrawalsWithdrawalProcessingServiceName
  **/

  public String getWithdrawalsWithdrawalProcessingServiceName() {
    return withdrawalsWithdrawalProcessingServiceName;
  }

  public void setWithdrawalsWithdrawalProcessingServiceName(String withdrawalsWithdrawalProcessingServiceName) {
    this.withdrawalsWithdrawalProcessingServiceName = withdrawalsWithdrawalProcessingServiceName;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return withdrawalsUpdateActionTaskRecord
  **/

  public Object getWithdrawalsUpdateActionTaskRecord() {
    return withdrawalsUpdateActionTaskRecord;
  }

  public void setWithdrawalsUpdateActionTaskRecord(Object withdrawalsUpdateActionTaskRecord) {
    this.withdrawalsUpdateActionTaskRecord = withdrawalsUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return withdrawalsUpdateActionRequest
  **/

  public String getWithdrawalsUpdateActionRequest() {
    return withdrawalsUpdateActionRequest;
  }

  public void setWithdrawalsUpdateActionRequest(String withdrawalsUpdateActionRequest) {
    this.withdrawalsUpdateActionRequest = withdrawalsUpdateActionRequest;
  }


}

