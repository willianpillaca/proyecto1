package com.ginnet.modulo.visa.demo;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.ginnet.modulo.visa.demo.utils.ExecutorConstants;
import com.ginnet.modulo.visa.demo.utils.ExecutorUtil;
import com.ginnet.modulo.visa.demo.utils.HttpResponse;
import com.ginnet.modulo.visa.dtos.SessionToken;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.core.MediaType;

@WebServlet("/build")
public class BuildServlet extends HttpServlet{
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
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    @Override
    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response) throws ServletException, IOException {
      PrintWriter out = response.getWriter();
      HttpResponse security = ExecutorUtil.sendRequest("GET", "", ExecutorConstants.API_SECURITY, MediaType.TEXT_PLAIN, "Authorization", AUTH);
      response.setContentType("text/html");
      if (security.getHttpCode() == 201) {
        String clientIp = ExecutorUtil.getClientIp(request);
        String merchant = request.getParameter("merchantid");
        String channel = request.getParameter("channel");
        String amount = request.getParameter("amount");
        String maxamount = request.getParameter("recurrencemaxamount");
        String recurrence = request.getParameter("recurrence");
        String purchasenumber = request.getParameter("purchasenumber");
        String merchantlogo = request.getParameter("merchantlogo");
        String productid = request.getParameter("productid");
        
        String frequency = request.getParameter("frequency");
        String recurrencetype = request.getParameter("recurrencetype");
        String recurrenceamount = request.getParameter("recurrenceamount");
        String recurrencemaxamount = request.getParameter("recurrencemaxamount");
        
        String beneficiaryid = request.getParameter("beneficiaryid");
        String documenttype = request.getParameter("documenttype");
        String documentnumber = request.getParameter("documentnumber");
        
        String expirationminutes = request.getParameter("expirationminutes");
        String timeouturl = request.getParameter("timeouturl");
        String formbuttoncolor = request.getParameter("formbuttoncolor");
        String usertoken = request.getParameter("usertoken");
        
        boolean isRecurrence = recurrence.equalsIgnoreCase("true");
        
        String sessionRequest = String.format(ExecutorConstants.SESSION_REQUEST, channel,  amount, maxamount, clientIp);
        
        
        String api = String.format(ExecutorConstants.API_SESSION_TOKEN, merchant);
        HttpResponse sessionResponse = ExecutorUtil.sendRequest("POST",sessionRequest, api, MediaType.APPLICATION_JSON, ExecutorConstants.AUTHORIZATION, security.getResponse());
        
        if (sessionResponse.getHttpCode() == 200) {
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            SessionToken token = gson.fromJson(sessionResponse.getResponse(), SessionToken.class);
            
            String buttonScript = String.format(ExecutorConstants.BUTTON_SCRIPT, token.getSessionKey(), channel, merchant, merchantlogo,
                                 purchasenumber, productid, amount, recurrence, frequency, recurrencetype, recurrenceamount, recurrencemaxamount,
                                 documentnumber, beneficiaryid, documenttype, formbuttoncolor, expirationminutes, timeouturl, usertoken);
            

            out.println(
                        "<div class=\"body\"> <div class=\"sky-form\">"
                        + "<fieldset>\n" 
                        + "<div class=\"row\">"
                        +"<label class=\"label col col-2\">Session Token: </label>"
                        +"<label class=\"label col col-10\">" + token.getSessionKey() +" </label>"
                        + "<br/>"
                        + "</div>" 
                        + "<div class=\"row\">"
                        + buttonScript
                        + "</div>" 
                        +"</fieldset> </div> </div>");
        } else {
             out.println(security.getHttpCode() + " - " + security.getResponse());
        }
      } else {
          
          out.println(security.getHttpCode() + " - " + security.getResponse());
      }
      out.flush();
    }
}
