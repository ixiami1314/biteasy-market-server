package com.biteasy.market;

import com.xignite.sdk.api.webservices.XigniteGlobalMetals.Models.Metal;
import com.xignite.sdk.api.webservices.XigniteGlobalMetals.Models.Metals;
import com.xignite.sdk.api.webservices.XigniteGlobalMetals.XigniteGlobalMetals;

/**
 * Created by Administrator on 2016/3/28.
 */
public class Constants {
    public static String XIGNITE_API_TOKEN = "5C473A55CF7642C48BD1778220AF15E5";
    private static String METALS = null;

    public static String getMetals () {
        if (null == METALS) {
            try {
                XigniteGlobalMetals metals = new XigniteGlobalMetals(Constants.XIGNITE_API_TOKEN);
                Metals metals_list = metals.listMetals();
                StringBuffer sb = new StringBuffer();
                for (Metal m : metals_list.MetalList) {
                    sb.append (m.Symbol).append (",");
                }
                if (sb.length() > 1)
                    METALS = sb.substring (0, sb.length() - 1);
            } catch (Exception ex) {
            }
        }
        return METALS;
    }
}
