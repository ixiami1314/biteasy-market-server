package com.biteasy.market.repositories;

import com.biteasy.market.domain.MetalMarket;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by weijun on 16/3/25.
 */
public interface MetalMarketRepository extends CrudRepository <MetalMarket, Long> {
}
