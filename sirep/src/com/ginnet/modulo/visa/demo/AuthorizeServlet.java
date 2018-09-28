package com.ginnet.modulo.visa.demo;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.ginnet.modulo.visa.demo.utils.ExecutorConstants;
import com.ginnet.modulo.visa.demo.utils.ExecutorUtil;
import com.ginnet.modulo.visa.demo.utils.HttpResponse;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.core.MediaType;



@WebServlet("/authorize")
public class AuthorizeServlet extends HttpServlet {

    /**
     *
     */
    private static final long serialVersionUID = -5308353652899057537L;
    private static final String AUTH = "Basic Z2lhbmNhZ2FsbGFyZG9AZ21haWwuY29tOkF2MyR0cnV6";

    /**
     * @param request
     * @param response
     * @throws javax.servlet.ServletException
     * @throws java.io.IOException
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
     * response)
     */
    @Override
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        HttpResponse security = ExecutorUtil.sendRequest("GET", "", ExecutorConstants.API_SECURITY, MediaType.TEXT_PLAIN, "Authorization", AUTH);
        response.setContentType("application/json");
        if (security.getHttpCode() == 201) {            
            String clientIp = ExecutorUtil.getClientIp(request);;
            String transactionToken = request.getParameter("transactionToken");
            String merchant = request.getParameter("merchantid");
            String channel = request.getParameter("channel");
            String amount = request.getParameter("amount");
            String currency = request.getParameter("currency");

            String recurrence = request.getParameter("recurrence");
            String purchasenumber = request.getParameter("purchasenumber");
            String productid = request.getParameter("productid");

            String frequency = request.getParameter("frequency");
            String recurrencetype = request.getParameter("recurrencetype");
            String recurrenceamount = request.getParameter("recurrenceamount");
            String recurrencemaxamount = request.getParameter("recurrencemaxamount");

            String beneficiaryid = request.getParameter("beneficiaryid");
            String documenttype = request.getParameter("documenttype");
            String documentnumber = request.getParameter("documentnumber");
            
            String authRequest = String.format(ExecutorConstants.AUTHORIZE_JSON, channel, transactionToken, productid, 
                                purchasenumber, amount, currency, documenttype, documentnumber, beneficiaryid, recurrencetype, frequency,
                                recurrencemaxamount, recurrenceamount, clientIp);
            
            String url_auth = String.format(ExecutorConstants.API_AUTHORIZE, merchant);
            
            HttpResponse authResponse = ExecutorUtil.sendRequest("POST", authRequest, url_auth, MediaType.APPLICATION_JSON, ExecutorConstants.AUTHORIZATION, security.getResponse());

            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            Object o = gson.fromJson(authResponse.getResponse(), Object.class);
            out.println(gson.toJson(o));

        } else {

            out.println(security.getHttpCode() + " - " + security.getResponse());
        }
        out.flush();
    }
}

