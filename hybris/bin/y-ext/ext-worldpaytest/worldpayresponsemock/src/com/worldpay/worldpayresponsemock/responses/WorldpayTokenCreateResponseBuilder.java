package com.worldpay.worldpayresponsemock.responses;

import com.worldpay.internal.model.PaymentService;

/**
 * Exposes methods to create a token in response to a token creation request.
 */
public interface WorldpayTokenCreateResponseBuilder {

    /**
     *
     * @param request
     * @return
     */
    PaymentService buildTokenResponse(PaymentService request);
}
