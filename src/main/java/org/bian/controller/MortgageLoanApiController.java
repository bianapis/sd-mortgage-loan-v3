/**
 * @author Virtusa
 */
package org.bian.controller;

import java.util.List;
import org.bian.annotation.BianRestController;
import org.bian.annotation.BQ;
import org.bian.dto.BianRequest;
import org.bian.dto.BianResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.bian.dto.*;
import org.bian.service.*;
import org.bian.annotation.functionalpattern.Fulfill;

@BianRestController
public class MortgageLoanApiController {

	@Autowired
	MortgageLoanApiService service;
	
	@Fulfill.Activate
	public BianResponse<SDMortgageLoanActivateOutputModel> activate(@RequestBody BianRequest<SDMortgageLoanActivateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.activate(bianRequest.getData()));
	}
	
	@Fulfill.Configure
	public BianResponse<SDMortgageLoanConfigureOutputModel> configure(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<SDMortgageLoanConfigureInputModel> bianRequest) {
		return BianResponse.forSuccess(service.configure(sdReferenceId, bianRequest.getData()));
	}
	
	@Fulfill.Control
	public BianResponse<CRMortgageLoanArrangementControlOutputModel> control(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRMortgageLoanArrangementControlInputModel> bianRequest) {
		return BianResponse.forSuccess(service.control(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("billing")
	@Fulfill.Exchange
	public BianResponse<BQBillingExchangeOutputModel> exchangeBilling(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQBillingExchangeInputModel> bianRequest) {
		return BianResponse.forSuccess(service.exchangeBilling(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("fees")
	@Fulfill.Exchange
	public BianResponse<BQFeesExchangeOutputModel> exchangeFees(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQFeesExchangeInputModel> bianRequest) {
		return BianResponse.forSuccess(service.exchangeFees(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("lien")
	@Fulfill.Exchange
	public BianResponse<BQLienExchangeOutputModel> exchangeLien(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQLienExchangeInputModel> bianRequest) {
		return BianResponse.forSuccess(service.exchangeLien(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("payments")
	@Fulfill.Exchange
	public BianResponse<BQPaymentsExchangeOutputModel> exchangePayments(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQPaymentsExchangeInputModel> bianRequest) {
		return BianResponse.forSuccess(service.exchangePayments(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("sweep")
	@Fulfill.Exchange
	public BianResponse<BQSweepExchangeOutputModel> exchangeSweep(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQSweepExchangeInputModel> bianRequest) {
		return BianResponse.forSuccess(service.exchangeSweep(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@Fulfill.Exchange
	public BianResponse<CRMortgageLoanArrangementExchangeOutputModel> exchange(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRMortgageLoanArrangementExchangeInputModel> bianRequest) {
		return BianResponse.forSuccess(service.exchange(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@Fulfill.Execute
	public BianResponse<CRMortgageLoanArrangementExecuteOutputModel> execute(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRMortgageLoanArrangementExecuteInputModel> bianRequest) {
		return BianResponse.forSuccess(service.execute(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@Fulfill.Feedback
	public BianResponse<SDMortgageLoanFeedbackOutputModel> feedback(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<SDMortgageLoanFeedbackInputModel> bianRequest) {
		return BianResponse.forSuccess(service.feedback(sdReferenceId, bianRequest.getData()));
	}
	
	@Fulfill.Initiate
	public BianResponse<CRMortgageLoanArrangementInitiateOutputModel> initiate(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<CRMortgageLoanArrangementInitiateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.initiate(sdReferenceId, bianRequest.getData()));
	}
	
	@BQ("billing")
	@Fulfill.Initiate
	public BianResponse<BQBillingInitiateOutputModel> initiateBilling(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<BQBillingInitiateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.initiateBilling(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("collateral")
	@Fulfill.Initiate
	public BianResponse<BQCollateralInitiateOutputModel> initiateCollateral(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<BQCollateralInitiateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.initiateCollateral(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("deposits")
	@Fulfill.Initiate
	public BianResponse<BQDepositsInitiateOutputModel> initiateDeposits(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<BQDepositsInitiateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.initiateDeposits(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("fees")
	@Fulfill.Initiate
	public BianResponse<BQFeesInitiateOutputModel> initiateFees(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<BQFeesInitiateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.initiateFees(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("financialinstrument")
	@Fulfill.Initiate
	public BianResponse<BQFinancialInstrumentInitiateOutputModel> initiateFinancialinstrument(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<BQFinancialInstrumentInitiateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.initiateFinancialinstrument(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("issueddevice")
	@Fulfill.Initiate
	public BianResponse<BQIssuedDeviceInitiateOutputModel> initiateIssueddevice(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<BQIssuedDeviceInitiateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.initiateIssueddevice(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("lien")
	@Fulfill.Initiate
	public BianResponse<BQLienInitiateOutputModel> initiateLien(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<BQLienInitiateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.initiateLien(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("payments")
	@Fulfill.Initiate
	public BianResponse<BQPaymentsInitiateOutputModel> initiatePayments(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<BQPaymentsInitiateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.initiatePayments(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("sweep")
	@Fulfill.Initiate
	public BianResponse<BQSweepInitiateOutputModel> initiateSweep(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<BQSweepInitiateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.initiateSweep(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("withdrawals")
	@Fulfill.Initiate
	public BianResponse<BQWithdrawalsInitiateOutputModel> initiateWithdrawals(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<BQWithdrawalsInitiateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.initiateWithdrawals(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("collateral")
	@Fulfill.Request
	public BianResponse<BQCollateralRequestOutputModel> requestCollateral(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQCollateralRequestInputModel> bianRequest) {
		return BianResponse.forSuccess(service.requestCollateral(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("fees")
	@Fulfill.Request
	public BianResponse<BQFeesRequestOutputModel> requestFees(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQFeesRequestInputModel> bianRequest) {
		return BianResponse.forSuccess(service.requestFees(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@Fulfill.Request
	public BianResponse<CRMortgageLoanArrangementRequestOutputModel> request(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRMortgageLoanArrangementRequestInputModel> bianRequest) {
		return BianResponse.forSuccess(service.request(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@Fulfill.Retrieve
	public BianResponse<CRMortgageLoanArrangementRetrieveOutputModel> retrieve(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId) {
		return BianResponse.forSuccess(service.retrieve(sdReferenceId, crReferenceId));
	}
	
	@BQ("billing")
	@Fulfill.Retrieve
	public BianResponse<BQBillingRetrieveOutputModel> retrieveBilling(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveBilling(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("collateral")
	@Fulfill.Retrieve
	public BianResponse<BQCollateralRetrieveOutputModel> retrieveCollateral(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveCollateral(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("deposits")
	@Fulfill.Retrieve
	public BianResponse<BQDepositsRetrieveOutputModel> retrieveDeposits(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveDeposits(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("fees")
	@Fulfill.Retrieve
	public BianResponse<BQFeesRetrieveOutputModel> retrieveFees(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveFees(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("financialaccounting")
	@Fulfill.Retrieve
	public BianResponse<BQFinancialAccountingRetrieveOutputModel> retrieveFinancialaccounting(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveFinancialaccounting(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("financialinstrument")
	@Fulfill.Retrieve
	public BianResponse<BQFinancialInstrumentRetrieveOutputModel> retrieveFinancialinstrument(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveFinancialinstrument(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("interest")
	@Fulfill.Retrieve
	public BianResponse<BQInterestRetrieveOutputModel> retrieveInterest(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveInterest(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("issueddevice")
	@Fulfill.Retrieve
	public BianResponse<BQIssuedDeviceRetrieveOutputModel> retrieveIssueddevice(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveIssueddevice(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("lien")
	@Fulfill.Retrieve
	public BianResponse<BQLienRetrieveOutputModel> retrieveLien(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveLien(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("payments")
	@Fulfill.Retrieve
	public BianResponse<BQPaymentsRetrieveOutputModel> retrievePayments(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrievePayments(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("sweep")
	@Fulfill.Retrieve
	public BianResponse<BQSweepRetrieveOutputModel> retrieveSweep(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveSweep(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("withdrawals")
	@Fulfill.Retrieve
	public BianResponse<BQWithdrawalsRetrieveOutputModel> retrieveWithdrawals(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveWithdrawals(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@Fulfill.RetrieveBQIds
	public BianResponse<List<String>> retrieveBQIds(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("behavior-qualifier") String behaviorQualifier) {
		return BianResponse.forSuccess(service.retrieveBQIds(sdReferenceId, crReferenceId, behaviorQualifier));
	}
	
	@Fulfill.RetrieveBQs
	public BianResponse<List<String>> retrieveBQs() {
		return BianResponse.forSuccess(service.retrieveBQs());
	}
	
	@Fulfill.RetrieveRefIds
	public BianResponse<List<String>> retrieveRefIds(@PathVariable("sd-reference-id") String sdReferenceId) {
		return BianResponse.forSuccess(service.retrieveRefIds(sdReferenceId));
	}
	
	@Fulfill.RetrieveSD
	public BianResponse<SDMortgageLoanRetrieveOutputModel> retrieveSD(@PathVariable("sd-reference-id") String sdReferenceId) {
		return BianResponse.forSuccess(service.retrieveSD(sdReferenceId));
	}
	
	@Fulfill.Update
	public BianResponse<CRMortgageLoanArrangementUpdateOutputModel> update(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRMortgageLoanArrangementUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.update(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("billing")
	@Fulfill.Update
	public BianResponse<BQBillingUpdateOutputModel> updateBilling(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQBillingUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateBilling(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("collateral")
	@Fulfill.Update
	public BianResponse<BQCollateralUpdateOutputModel> updateCollateral(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQCollateralUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateCollateral(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("deposits")
	@Fulfill.Update
	public BianResponse<BQDepositsUpdateOutputModel> updateDeposits(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQDepositsUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateDeposits(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("fees")
	@Fulfill.Update
	public BianResponse<BQFeesUpdateOutputModel> updateFees(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQFeesUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateFees(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("financialaccounting")
	@Fulfill.Update
	public BianResponse<BQFinancialAccountingUpdateOutputModel> updateFinancialaccounting(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQFinancialAccountingUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateFinancialaccounting(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("financialinstrument")
	@Fulfill.Update
	public BianResponse<BQFinancialInstrumentUpdateOutputModel> updateFinancialinstrument(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQFinancialInstrumentUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateFinancialinstrument(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("interest")
	@Fulfill.Update
	public BianResponse<BQInterestUpdateOutputModel> updateInterest(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQInterestUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateInterest(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("issueddevice")
	@Fulfill.Update
	public BianResponse<BQIssuedDeviceUpdateOutputModel> updateIssueddevice(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQIssuedDeviceUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateIssueddevice(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("lien")
	@Fulfill.Update
	public BianResponse<BQLienUpdateOutputModel> updateLien(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQLienUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateLien(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("payments")
	@Fulfill.Update
	public BianResponse<BQPaymentsUpdateOutputModel> updatePayments(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQPaymentsUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updatePayments(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("sweep")
	@Fulfill.Update
	public BianResponse<BQSweepUpdateOutputModel> updateSweep(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQSweepUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateSweep(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("withdrawals")
	@Fulfill.Update
	public BianResponse<BQWithdrawalsUpdateOutputModel> updateWithdrawals(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQWithdrawalsUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateWithdrawals(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
}
