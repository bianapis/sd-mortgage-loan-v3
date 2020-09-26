package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQLienUpdateOutputModel
 */
public class BQLienUpdateOutputModel   {
  private String lienPreconditions = null;

  private String lienFeatureSchedule = null;

  private String businessService = null;

  private String lienPostconditions = null;

  private String lienServiceType = null;

  private String lienServiceDescription = null;

  private String lienServiceInputsandOuputs = null;

  private String lienServiceWorkProduct = null;

  private String lienServiceName = null;

  private String lienUpdateActionTaskReference = null;

  private Object lienUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The required status/situation prior to the implementation of the feature 
   * @return lienPreconditions
  **/

  public String getLienPreconditions() {
    return lienPreconditions;
  }

  public void setLienPreconditions(String lienPreconditions) {
    this.lienPreconditions = lienPreconditions;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The timing and key actions/milestones involved in completing the fulfillment feature instance 
   * @return lienFeatureSchedule
  **/

  public String getLienFeatureSchedule() {
    return lienFeatureSchedule;
  }

  public void setLienFeatureSchedule(String lienFeatureSchedule) {
    this.lienFeatureSchedule = lienFeatureSchedule;
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
   * @return lienPostconditions
  **/

  public String getLienPostconditions() {
    return lienPostconditions;
  }

  public void setLienPostconditions(String lienPostconditions) {
    this.lienPostconditions = lienPostconditions;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Reference to the specific business service type 
   * @return lienServiceType
  **/

  public String getLienServiceType() {
    return lienServiceType;
  }

  public void setLienServiceType(String lienServiceType) {
    this.lienServiceType = lienServiceType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the performed business service 
   * @return lienServiceDescription
  **/

  public String getLienServiceDescription() {
    return lienServiceDescription;
  }

  public void setLienServiceDescription(String lienServiceDescription) {
    this.lienServiceDescription = lienServiceDescription;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Mandatory and optional inputs and output information for the business service 
   * @return lienServiceInputsandOuputs
  **/

  public String getLienServiceInputsandOuputs() {
    return lienServiceInputsandOuputs;
  }

  public void setLienServiceInputsandOuputs(String lienServiceInputsandOuputs) {
    this.lienServiceInputsandOuputs = lienServiceInputsandOuputs;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service 
   * @return lienServiceWorkProduct
  **/

  public String getLienServiceWorkProduct() {
    return lienServiceWorkProduct;
  }

  public void setLienServiceWorkProduct(String lienServiceWorkProduct) {
    this.lienServiceWorkProduct = lienServiceWorkProduct;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info:  
   * @return lienServiceName
  **/

  public String getLienServiceName() {
    return lienServiceName;
  }

  public void setLienServiceName(String lienServiceName) {
    this.lienServiceName = lienServiceName;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return lienUpdateActionTaskReference
  **/

  public String getLienUpdateActionTaskReference() {
    return lienUpdateActionTaskReference;
  }

  public void setLienUpdateActionTaskReference(String lienUpdateActionTaskReference) {
    this.lienUpdateActionTaskReference = lienUpdateActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return lienUpdateActionTaskRecord
  **/

  public Object getLienUpdateActionTaskRecord() {
    return lienUpdateActionTaskRecord;
  }

  public void setLienUpdateActionTaskRecord(Object lienUpdateActionTaskRecord) {
    this.lienUpdateActionTaskRecord = lienUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the Update action service response 
   * @return updateResponseRecord
  **/

  public Object getUpdateResponseRecord() {
    return updateResponseRecord;
  }

  public void setUpdateResponseRecord(Object updateResponseRecord) {
    this.updateResponseRecord = updateResponseRecord;
  }


}

