package com.biteasy.market.pool;

import com.biteasy.market.Constants;
import com.biteasy.market.domain.MetalMarket;
import com.biteasy.market.repositories.MetalMarketRepository;
import com.xignite.sdk.api.webservices.XigniteGlobalMetals.Models.MetalQuote;
import com.xignite.sdk.api.webservices.XigniteGlobalMetals.XigniteGlobalMetals;

/**
 * Created by Administrator on 2016/3/28.
 */
public class XigniteFetcherTask implements Runnable {

    private static String DOLLAR = "USD";

    private MetalMarketRepository repository;

    public XigniteFetcherTask(MetalMarketRepository res) {
        this.repository = res;
    }

    public void run () {
        try {
            XigniteGlobalMetals metals = new XigniteGlobalMetals (Constants.XIGNITE_API_TOKEN);
            MetalQuote[] quotes = metals.getRealTimeMetalQuotes (Constants.getMetals (), DOLLAR);
            for (MetalQuote quote : quotes) {
                MetalMarket m = new MetalMarket(quote);
                repository.save(m);
            }
        } catch (Exception ex) {

        }
    }
}
