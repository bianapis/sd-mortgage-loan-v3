package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQBillingRetrieveOutputModelBillingInstanceAnalysis;
import org.bian.dto.BQBillingRetrieveOutputModelBillingInstanceReport;

import javax.validation.Valid;
  
/**
 * BQBillingRetrieveOutputModel
 */
public class BQBillingRetrieveOutputModel   {
  private String billingPreconditions = null;

  private String billingFeatureSchedule = null;

  private String businessService = null;

  private String billingPostconditions = null;

  private String billingServiceType = null;

  private String billingServiceDescription = null;

  private String billingServiceInputsandOuputs = null;

  private String billingServiceWorkProduct = null;

  private String billingServiceName = null;

  private String billingRetrieveActionTaskReference = null;

  private Object billingRetrieveActionTaskRecord = null;

  private String billingRetrieveActionResponse = null;

  private BQBillingRetrieveOutputModelBillingInstanceReport billingInstanceReport = null;

  private BQBillingRetrieveOutputModelBillingInstanceAnalysis billingInstanceAnalysis = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Billing instance retrieve service call 
   * @return billingRetrieveActionTaskReference
  **/

  public String getBillingRetrieveActionTaskReference() {
    return billingRetrieveActionTaskReference;
  }

  public void setBillingRetrieveActionTaskReference(String billingRetrieveActionTaskReference) {
    this.billingRetrieveActionTaskReference = billingRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return billingRetrieveActionTaskRecord
  **/

  public Object getBillingRetrieveActionTaskRecord() {
    return billingRetrieveActionTaskRecord;
  }

  public void setBillingRetrieveActionTaskRecord(Object billingRetrieveActionTaskRecord) {
    this.billingRetrieveActionTaskRecord = billingRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return billingRetrieveActionResponse
  **/

  public String getBillingRetrieveActionResponse() {
    return billingRetrieveActionResponse;
  }

  public void setBillingRetrieveActionResponse(String billingRetrieveActionResponse) {
    this.billingRetrieveActionResponse = billingRetrieveActionResponse;
  }


  /**
   * Get billingInstanceReport
   * @return billingInstanceReport
  **/

  public BQBillingRetrieveOutputModelBillingInstanceReport getBillingInstanceReport() {
    return billingInstanceReport;
  }

  public void setBillingInstanceReport(BQBillingRetrieveOutputModelBillingInstanceReport billingInstanceReport) {
    this.billingInstanceReport = billingInstanceReport;
  }


  /**
   * Get billingInstanceAnalysis
   * @return billingInstanceAnalysis
  **/

  public BQBillingRetrieveOutputModelBillingInstanceAnalysis getBillingInstanceAnalysis() {
    return billingInstanceAnalysis;
  }

  public void setBillingInstanceAnalysis(BQBillingRetrieveOutputModelBillingInstanceAnalysis billingInstanceAnalysis) {
    this.billingInstanceAnalysis = billingInstanceAnalysis;
  }


}

