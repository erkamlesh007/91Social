package com.socail.cycles.service;

import java.util.concurrent.CompletableFuture;

import com.socail.cycles.model.PricingRequest;
import com.socail.cycles.model.PricingResponse;

public interface PriceService {
	
	CompletableFuture<PricingResponse> getPrices(PricingRequest request);

}
