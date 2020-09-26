package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRMortgageLoanArrangementControlInputModelMortgageLoanArrangementControlActionRequest;

import javax.validation.Valid;
  
/**
 * CRMortgageLoanArrangementControlInputModel
 */
public class CRMortgageLoanArrangementControlInputModel   {
  private String mortgageLoanServicingSessionReference = null;

  private String mortgageLoanArrangementInstanceReference = null;

  private String mortgageLoanArrangementParameterType = null;

  private String mortgageLoanArrangementSelectedOption = null;

  private String mortgageLoanArrangementType = null;

  private String mortgageLoanArrangementReference = null;

  private String mortgageLoanArrangementSchedule = null;

  private String mortgageLoanArrangementStatus = null;

  private String mortgageLoanArrangementCurrency = null;

  private String mortgageLoanArrangementRegulationReference = null;

  private String mortgageLoanArrangementRegulationType = null;

  private String mortgageLoanArrangementJurisdiction = null;

  private String mortgageLoanArrangementBookingLocation = null;

  private String mortgageLoanArrangementAccountType = null;

  private String mortgageLoanArrangementAccountReference = null;

  private Object mortgageLoanArrangementControlActionTaskRecord = null;

  private CRMortgageLoanArrangementControlInputModelMortgageLoanArrangementControlActionRequest mortgageLoanArrangementControlActionRequest = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return mortgageLoanServicingSessionReference
  **/

  public String getMortgageLoanServicingSessionReference() {
    return mortgageLoanServicingSessionReference;
  }

  public void setMortgageLoanServicingSessionReference(String mortgageLoanServicingSessionReference) {
    this.mortgageLoanServicingSessionReference = mortgageLoanServicingSessionReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of Mortgage Loan Arrangement 
   * @return mortgageLoanArrangementType
  **/

  public String getMortgageLoanArrangementType() {
    return mortgageLoanArrangementType;
  }

  public void setMortgageLoanArrangementType(String mortgageLoanArrangementType) {
    this.mortgageLoanArrangementType = mortgageLoanArrangementType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to Mortgage Loan Arrangement 
   * @return mortgageLoanArrangementReference
  **/

  public String getMortgageLoanArrangementReference() {
    return mortgageLoanArrangementReference;
  }

  public void setMortgageLoanArrangementReference(String mortgageLoanArrangementReference) {
    this.mortgageLoanArrangementReference = mortgageLoanArrangementReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Currency  general-info: The curreny which is arranged in Mortgage Loan Arrangement 
   * @return mortgageLoanArrangementCurrency
  **/

  public String getMortgageLoanArrangementCurrency() {
    return mortgageLoanArrangementCurrency;
  }

  public void setMortgageLoanArrangementCurrency(String mortgageLoanArrangementCurrency) {
    this.mortgageLoanArrangementCurrency = mortgageLoanArrangementCurrency;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the regulation which is defined in Mortgage Loan Arrangement 
   * @return mortgageLoanArrangementRegulationReference
  **/

  public String getMortgageLoanArrangementRegulationReference() {
    return mortgageLoanArrangementRegulationReference;
  }

  public void setMortgageLoanArrangementRegulationReference(String mortgageLoanArrangementRegulationReference) {
    this.mortgageLoanArrangementRegulationReference = mortgageLoanArrangementRegulationReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: A Classification that distinguishes between the regularity domains of Mortgage Loan Arrangement 
   * @return mortgageLoanArrangementRegulationType
  **/

  public String getMortgageLoanArrangementRegulationType() {
    return mortgageLoanArrangementRegulationType;
  }

  public void setMortgageLoanArrangementRegulationType(String mortgageLoanArrangementRegulationType) {
    this.mortgageLoanArrangementRegulationType = mortgageLoanArrangementRegulationType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Reference to the jurisdiction that is assigned to Mortgage Loan Arrangement in case of legal dispute. 
   * @return mortgageLoanArrangementJurisdiction
  **/

  public String getMortgageLoanArrangementJurisdiction() {
    return mortgageLoanArrangementJurisdiction;
  }

  public void setMortgageLoanArrangementJurisdiction(String mortgageLoanArrangementJurisdiction) {
    this.mortgageLoanArrangementJurisdiction = mortgageLoanArrangementJurisdiction;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The financial accounting unit into which the financial events, with regard to the origination and fulfillment of the agreement in the context of Mortgage Loan Arrangement, are entered. 
   * @return mortgageLoanArrangementBookingLocation
  **/

  public String getMortgageLoanArrangementBookingLocation() {
    return mortgageLoanArrangementBookingLocation;
  }

  public void setMortgageLoanArrangementBookingLocation(String mortgageLoanArrangementBookingLocation) {
    this.mortgageLoanArrangementBookingLocation = mortgageLoanArrangementBookingLocation;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of account which is linked to Mortgage Loan Arrangement 
   * @return mortgageLoanArrangementAccountType
  **/

  public String getMortgageLoanArrangementAccountType() {
    return mortgageLoanArrangementAccountType;
  }

  public void setMortgageLoanArrangementAccountType(String mortgageLoanArrangementAccountType) {
    this.mortgageLoanArrangementAccountType = mortgageLoanArrangementAccountType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the account which is linked to Mortgage Loan Arrangement 
   * @return mortgageLoanArrangementAccountReference
  **/

  public String getMortgageLoanArrangementAccountReference() {
    return mortgageLoanArrangementAccountReference;
  }

  public void setMortgageLoanArrangementAccountReference(String mortgageLoanArrangementAccountReference) {
    this.mortgageLoanArrangementAccountReference = mortgageLoanArrangementAccountReference;
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
   * Get mortgageLoanArrangementControlActionRequest
   * @return mortgageLoanArrangementControlActionRequest
  **/

  public CRMortgageLoanArrangementControlInputModelMortgageLoanArrangementControlActionRequest getMortgageLoanArrangementControlActionRequest() {
    return mortgageLoanArrangementControlActionRequest;
  }

  public void setMortgageLoanArrangementControlActionRequest(CRMortgageLoanArrangementControlInputModelMortgageLoanArrangementControlActionRequest mortgageLoanArrangementControlActionRequest) {
    this.mortgageLoanArrangementControlActionRequest = mortgageLoanArrangementControlActionRequest;
  }


}

