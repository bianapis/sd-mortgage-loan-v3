package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDMortgageLoanRetrieveInputModelMortgageLoanRetrieveActionRecordControlRecordPortfolioAnalysis;
import org.bian.dto.SDMortgageLoanRetrieveInputModelMortgageLoanRetrieveActionRecordMortgageLoanActivityAnalysis;
import org.bian.dto.SDMortgageLoanRetrieveInputModelMortgageLoanRetrieveActionRecordMortgageLoanPerformanceAnalysis;

import javax.validation.Valid;
  
/**
 * SDMortgageLoanRetrieveInputModelMortgageLoanRetrieveActionRecord
 */
public class SDMortgageLoanRetrieveInputModelMortgageLoanRetrieveActionRecord   {
  private SDMortgageLoanRetrieveInputModelMortgageLoanRetrieveActionRecordMortgageLoanActivityAnalysis mortgageLoanActivityAnalysis = null;

  private SDMortgageLoanRetrieveInputModelMortgageLoanRetrieveActionRecordMortgageLoanPerformanceAnalysis mortgageLoanPerformanceAnalysis = null;

  private SDMortgageLoanRetrieveInputModelMortgageLoanRetrieveActionRecordControlRecordPortfolioAnalysis controlRecordPortfolioAnalysis = null;


  /**
   * Get mortgageLoanActivityAnalysis
   * @return mortgageLoanActivityAnalysis
  **/

  public SDMortgageLoanRetrieveInputModelMortgageLoanRetrieveActionRecordMortgageLoanActivityAnalysis getMortgageLoanActivityAnalysis() {
    return mortgageLoanActivityAnalysis;
  }

  public void setMortgageLoanActivityAnalysis(SDMortgageLoanRetrieveInputModelMortgageLoanRetrieveActionRecordMortgageLoanActivityAnalysis mortgageLoanActivityAnalysis) {
    this.mortgageLoanActivityAnalysis = mortgageLoanActivityAnalysis;
  }


  /**
   * Get mortgageLoanPerformanceAnalysis
   * @return mortgageLoanPerformanceAnalysis
  **/

  public SDMortgageLoanRetrieveInputModelMortgageLoanRetrieveActionRecordMortgageLoanPerformanceAnalysis getMortgageLoanPerformanceAnalysis() {
    return mortgageLoanPerformanceAnalysis;
  }

  public void setMortgageLoanPerformanceAnalysis(SDMortgageLoanRetrieveInputModelMortgageLoanRetrieveActionRecordMortgageLoanPerformanceAnalysis mortgageLoanPerformanceAnalysis) {
    this.mortgageLoanPerformanceAnalysis = mortgageLoanPerformanceAnalysis;
  }


  /**
   * Get controlRecordPortfolioAnalysis
   * @return controlRecordPortfolioAnalysis
  **/

  public SDMortgageLoanRetrieveInputModelMortgageLoanRetrieveActionRecordControlRecordPortfolioAnalysis getControlRecordPortfolioAnalysis() {
    return controlRecordPortfolioAnalysis;
  }

  public void setControlRecordPortfolioAnalysis(SDMortgageLoanRetrieveInputModelMortgageLoanRetrieveActionRecordControlRecordPortfolioAnalysis controlRecordPortfolioAnalysis) {
    this.controlRecordPortfolioAnalysis = controlRecordPortfolioAnalysis;
  }


}

