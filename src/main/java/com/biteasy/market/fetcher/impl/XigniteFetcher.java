package com.biteasy.market.fetcher.impl;

import com.biteasy.market.domain.MetalMarket;
import com.biteasy.market.fetcher.Fetcher;
import com.biteasy.market.repositories.MetalMarketRepository;
import com.xignite.sdk.api.webservices.XigniteGlobalMetals.Models.MetalQuote;
import com.xignite.sdk.api.webservices.XigniteGlobalMetals.XigniteGlobalMetals;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * Created by weijun on 16/3/25.
 */
@Component ("xigniteFetcher")
public class XigniteFetcher implements Fetcher {

    @Autowired
    private MetalMarketRepository repository;

    private static String API_TOKEN = "5C473A55CF7642C48BD1778220AF15E5";
    private static String METALS_LIST = "XAU, XAG, XPD";
    private static String DOLLAR = "USD";

    @PostConstruct
    public void init () {
        System.out.println("- xignite fetcher start");
    }

    public void fetch () throws Exception {
        XigniteGlobalMetals metals = new XigniteGlobalMetals (API_TOKEN);
        MetalQuote[] quotes = metals.getRealTimeMetalQuotes (METALS_LIST, DOLLAR);
        for (MetalQuote quote : quotes) {
            MetalMarket m = new MetalMarket (quote);
            repository.save (m);
        }
    }
}
