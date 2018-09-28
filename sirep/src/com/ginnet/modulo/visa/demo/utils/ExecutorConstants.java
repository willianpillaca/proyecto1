package com.ginnet.modulo.visa.demo.utils;

public class ExecutorConstants {

    public static final String AUTHORIZATION = "Authorization";
    public static final String API_SECURITY = "https://apitestenv.vnforapps.com/api.security/v1/security";
    public static final String API_SESSION_TOKEN = "https://apitestenv.vnforapps.com/api.ecommerce/v2/ecommerce/token/session/%s";
    public static final String API_AUTHORIZE = "https://apitestenv.vnforapps.com/api.authorization/v3/authorization/ecommerce/%s";
    public static final String CLIENT_IP_API = "https://apitestenv.vnforapps.com/api.ecommerce/v2/clientip";
    public static final String SESSION_REQUEST = "{\n"
            + "  \"channel\": \"%s\",\n"
            + "  \"amount\": %s,\n"
            + "  \"recurrentMaxAmount\": %s,\n"
            + "  \"antifraud\": {\n"
            + "    \"clientIp\": \"%s\"\n"
            + "    }\n"
            + "  }\n"
            + "}";

    public static final String BUTTON_SCRIPT = "<form action=\"/visanet-demo/complete\" method='post'>\n"
            + "        <script id=\"javascriptBoton\" src='https://static-origin.vnforapps.com/v2/js/checkout.js?qa=true' \n"
            + "            data-sessiontoken='%s'\n"
            + "            data-channel='%s'\n"
            + "            data-merchantid='%s'\n"
            + "            data-merchantlogo='%s'\n"
            + "            data-purchasenumber='%s'\n"
            + "            data-productid ='%s'\n"
            + "            data-amount='%s'\n"
            + "            data-recurrence='%s'\n"
            + "            data-frequency='%s'\n"
            + "            data-recurrencetype='%s'\n"
            + "            data-recurrenceamount ='%s'\n"
            + "            data-recurrencemaxamount='%s'\n"
            + "            data-documentnumber='%s'\n"
            + "            data-beneficiaryid='%s'\n"
            + "            data-documenttype ='%s'\n"
            + "            data-formbuttoncolor='#%s'\n"
            + "            data-expirationminutes='%s'\n"
            + "            data-timeouturl = '%s'\n"
            + "            data-usertoken='%s'\n"
            + "        ></script>\n"
            + "        </form>";

    public static final String AUTHORIZE_JSON = "{\n"
            + "	\"terminalId\": \"1\",\n"
            + "	\"channel\": \"%s\",\n"
            + "	\"terminalUnattended\": false,\n"
            + "	\"captureType\": \"manual\",\n"
            + "	\"countable\": true,\n"
            + "	\"order\" : {\n"
            + "		\"tokenId\": \"%s\",\n"
            + "		\"productId\": \"%s\",\n"
            + "		\"purchaseNumber\": \"%s\",\n"
            + "		\"amount\": %s,\n"
            + "		\"currency\": \"%s\"\n"
            + "	},\n"
            + "	\"cardHolder\": {\n"
            + "		\"documentType\": \"%s\",\n"
            + "		\"documentNumber\": \"%s\"\n"
            + "	},\n"
            + "	\"recurrence\": {\n"
            + "		\"beneficiaryId\": \"%s\",\n"
            + "		\"type\": \"%s\",\n"
            + "		\"frequency\": \"%s\",\n"
            + "		\"maximum\": %s,\n"
            + "		\"recurrenceAmount\": %s\n"
            + "	},\n"
            + "	\"authentication\": null,\n"
            + "	\"antifraud\": {\n"
            + "		\"clientIp\": \"%s\"\n"
            + "	}"
            + "}";
}

