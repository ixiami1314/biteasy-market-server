package com.biteasy.market.repositories;

import com.biteasy.market.domain.MetalMarket;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by weijun on 16/3/25.
 */
public class MetalMarketRepository {

    private String INSERT_SQL = "INSERT INTO `test`.`METAL_MARKET`\n" +
            "(`Outcome`,\n" +
            "`Message`,\n" +
            "`Identity`,\n" +
            "`Delay`,\n" +
            "`Name`,\n" +
            "`Symbol`,\n" +
            "`Unit`,\n" +
            "`QuoteType`,\n" +
            "`Currency`,\n" +
            "`Date`,\n" +
            "`Time`,\n" +
            "`Bid`,\n" +
            "`Mid`,\n" +
            "`Ask`,\n" +
            "`Spread`,\n" +
            "`Source`)\n" +
            "VALUES\n" +
            "(:Outcome,\n" +
            ":Message,\n" +
            ":Identity,\n" +
            ":Delay,\n" +
            ":Name,\n" +
            ":Symbol,\n" +
            ":Unit,\n" +
            ":QuoteType,\n" +
            ":Currency,\n" +
            ":Date,\n" +
            ":Time,\n" +
            ":Bid,\n" +
            ":Mid,\n" +
            ":Ask,\n" +
            ":Spread,\n" +
            ":Source);\n";

    private JdbcTemplate jdbcTemplate;
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    public void save (MetalMarket market) throws Exception {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put ("Outcome", market.getOutcome());
        params.put ("Message", market.getMessage());
        params.put ("Identity", market.getIdentity());
        params.put ("Delay", market.getDelay());
        params.put ("Name", market.getName());
        params.put ("Symbol", market.getSymbol());
        params.put ("Unit", market.getUnit());
        params.put ("QuoteType", market.getQuoteType());
        params.put ("Currency", market.getCurrency());
        params.put ("Date", market.getDate());
        params.put ("Time", market.getTime());
        params.put ("Bid", market.getBid());
        params.put ("Mid", market.getMid());
        params.put ("Ask", market.getAsk());
        params.put ("Spread", market.getSpread());
        params.put ("Source", market.getSource ());

        namedParameterJdbcTemplate.update (INSERT_SQL, params);
    }

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
        this.namedParameterJdbcTemplate = new NamedParameterJdbcTemplate (this.jdbcTemplate.getDataSource ());
    }
}
