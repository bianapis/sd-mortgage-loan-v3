package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDMortgageLoanRetrieveOutputModelMortgageLoanRetrieveActionRecordControlRecordPortfolioAnalysis;
import org.bian.dto.SDMortgageLoanRetrieveOutputModelMortgageLoanRetrieveActionRecordMortgageLoanActivityAnalysis;
import org.bian.dto.SDMortgageLoanRetrieveOutputModelMortgageLoanRetrieveActionRecordMortgageLoanPerformanceAnalysis;

import javax.validation.Valid;
  
/**
 * SDMortgageLoanRetrieveOutputModelMortgageLoanRetrieveActionRecord
 */
public class SDMortgageLoanRetrieveOutputModelMortgageLoanRetrieveActionRecord   {
  private SDMortgageLoanRetrieveOutputModelMortgageLoanRetrieveActionRecordMortgageLoanActivityAnalysis mortgageLoanActivityAnalysis = null;

  private SDMortgageLoanRetrieveOutputModelMortgageLoanRetrieveActionRecordMortgageLoanPerformanceAnalysis mortgageLoanPerformanceAnalysis = null;

  private SDMortgageLoanRetrieveOutputModelMortgageLoanRetrieveActionRecordControlRecordPortfolioAnalysis controlRecordPortfolioAnalysis = null;


  /**
   * Get mortgageLoanActivityAnalysis
   * @return mortgageLoanActivityAnalysis
  **/

  public SDMortgageLoanRetrieveOutputModelMortgageLoanRetrieveActionRecordMortgageLoanActivityAnalysis getMortgageLoanActivityAnalysis() {
    return mortgageLoanActivityAnalysis;
  }

  public void setMortgageLoanActivityAnalysis(SDMortgageLoanRetrieveOutputModelMortgageLoanRetrieveActionRecordMortgageLoanActivityAnalysis mortgageLoanActivityAnalysis) {
    this.mortgageLoanActivityAnalysis = mortgageLoanActivityAnalysis;
  }


  /**
   * Get mortgageLoanPerformanceAnalysis
   * @return mortgageLoanPerformanceAnalysis
  **/

  public SDMortgageLoanRetrieveOutputModelMortgageLoanRetrieveActionRecordMortgageLoanPerformanceAnalysis getMortgageLoanPerformanceAnalysis() {
    return mortgageLoanPerformanceAnalysis;
  }

  public void setMortgageLoanPerformanceAnalysis(SDMortgageLoanRetrieveOutputModelMortgageLoanRetrieveActionRecordMortgageLoanPerformanceAnalysis mortgageLoanPerformanceAnalysis) {
    this.mortgageLoanPerformanceAnalysis = mortgageLoanPerformanceAnalysis;
  }


  /**
   * Get controlRecordPortfolioAnalysis
   * @return controlRecordPortfolioAnalysis
  **/

  public SDMortgageLoanRetrieveOutputModelMortgageLoanRetrieveActionRecordControlRecordPortfolioAnalysis getControlRecordPortfolioAnalysis() {
    return controlRecordPortfolioAnalysis;
  }

  public void setControlRecordPortfolioAnalysis(SDMortgageLoanRetrieveOutputModelMortgageLoanRetrieveActionRecordControlRecordPortfolioAnalysis controlRecordPortfolioAnalysis) {
    this.controlRecordPortfolioAnalysis = controlRecordPortfolioAnalysis;
  }


}

