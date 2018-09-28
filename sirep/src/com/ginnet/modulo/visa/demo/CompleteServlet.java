package com.ginnet.modulo.visa.demo;
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


@WebServlet("/complete")
public class CompleteServlet extends HttpServlet {

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
        response.setContentType("text/html");
        if (security.getHttpCode() == 201) {
            String transactionToken = request.getParameter("transactionToken");
            String customerEmail = request.getParameter("customerEmail");
            String channel = request.getParameter("channel");

            out.println(" <link rel=\"stylesheet\" href=\"css/demo.css\">\n"
                    + "        <link rel=\"stylesheet\" href=\"css/font-awesome.css\">\n"
                    + "        <link rel=\"stylesheet\" href=\"css/sky-forms.css\">\n"
                    + "        <link rel=\"stylesheet\" href=\"css/sky-forms-red.css\">"
                    + "<div class=\"body\"> <form action='authorize' method='post' id='auth-form' class=\"sky-form\">"
                    + "<header>Transaction Token</header>"
                    + "<fieldset>\n"
                    + "<div class=\"row\">"
                    + "<label class=\"label col col-2\">Channel: </label>"
                    + "<label class=\"label col col-10\">" + channel + " </label>"
                    + "</div>"
                    + "<div class=\"row\">"
                    + "<label class=\"label col col-2\">Token: </label>"
                    + "<label class=\"label col col-10\">" + transactionToken + " </label>"
                    + "<input id='transactionToken' name='transactionToken' type='hidden' value='" + transactionToken + "'>"
                    + "</div>"
                    + "<div class=\"row\">"
                    + "<label class=\"label col col-2\">Email: </label>"
                    + "<label class=\"label col col-10\">" + customerEmail + " </label>"
                    + "</div>"
                    + "</fieldset> "
                    + "<fieldset>					\n" +
"                    <div class=\"row\">\n" +
"                        <label class=\"label col col-2\">Channel</label>\n" +
"                        <section class=\"col col-4\">\n" +
"                            <label class=\"select\">\n" +
"                                <i class=\"icon-append fa fa-user\"></i>\n" +
"                                <select id=\"channel\" name=\"channel\">\n" +
"                                    <option value=\"web\" selected>Web</option>\n" +
"                                    <option value=\"mobile\">Mobile</option>\n" +
"                                    <option value=\"callcenter\">Call Center</option>\n" +
"                                    <option value=\"recurrent\">Recurrent</option>\n" +
"                                </select>\n" +
"                            </label>\n" +
"                        </section>\n" +
"                        <label class=\"label col col-2\">Merchant</label>\n" +
"                        <section class=\"col col-4\">\n" +
"                            <label class=\"input\">\n" +
"                                <i class=\"icon-append fa fa-briefcase\"></i>\n" +
"                                <input id=\"merchantid\" type=\"text\" name=\"merchantid\" value=\"341198210\" placeholder=\"Merchant Id\">\n" +
"                            </label>\n" +
"                        </section>\n" +
"                    </div>\n" +
"                    <div class=\"row\">\n" +
"                        <label class=\"label col col-2\">Amount</label>\n" +
"                        <section class=\"col col-4\">\n" +
"                            <label class=\"input\">\n" +
"                                <i class=\"icon-append fa fa-dollar\"></i>\n" +
"                                <input id=\"amount\" type=\"text\" name=\"amount\" value=\"19.13\" placeholder=\"Amount\">\n" +
"                            </label>\n" +
"                        </section>\n" +
"                        <label class=\"label col col-2\">Currency</label>\n" +
"                        <section class=\"col col-4\">\n" +
"                            <label class=\"select\">\n" +                      
"                                <i class=\"icon-append fa fa-user\"></i>\n" +
"                                <select id=\"currency\" name=\"currency\">\n" +
"                                    <option value=\"PEN\" selected>PEN</option>\n" +
"                                    <option value=\"USD\">USD</option>\n" +
"                                </select>\n" +
"                            </label>\n" +
"                        </section>\n" +
"                    </div>\n" +
"\n" +
"                    <div class=\"row\">\n" +
"                        <label class=\"label col col-2\">Purchase Number</label>\n" +
"                        <section class=\"col col-4\">\n" +
"                            <label class=\"input\">\n" +
"                                <i class=\"icon-append fa fa-barcode\"></i>\n" +
"                                <input id=\"purchasenumber\" type=\"text\" name=\"purchasenumber\" value=\"84335\" placeholder=\"Purchase Number\">\n" +
"                            </label>\n" +
"                        </section>\n" +
"                        <label class=\"label col col-2\">Product Id</label>\n" +
"                        <section class=\"col col-4\">\n" +
"                            <label class=\"input\">\n" +
"                                <i class=\"icon-append fa fa-print\"></i>\n" +
"                                <input id=\"productid\" type=\"text\" name=\"productid\" value=\"Whatsapp\" placeholder=\"Product\">\n" +
"                            </label>\n" +
"                        </section>\n" +
"                    </div>\n" +
"                </fieldset>\n" +
"\n" +
"                <fieldset>\n" +
"                    <div class=\"row\">\n" +
"                        <label class=\"label col col-2\">Recurrence</label>\n" +
"                        <section class=\"col col-4\">\n" +
"                            <label class=\"select\">\n" +
"                                <select id=\"recurrence\" name=\"recurrence\">\n" +
"                                    <option value=\"false\" selected>False</option>\n" +
"                                    <option value=\"true\">True</option>\n" +
"                                </select>\n" +
"                                <i></i>\n" +
"                            </label>\n" +
"                        </section>\n" +
"                        <label class=\"label col col-2\">Frequency</label>\n" +
"                        <section class=\"col col-4\">\n" +
"                            <label class=\"select\">\n" +
"                                <select id=\"frequency\" name=\"frequency\">\n" +
"                                    <option value=\"monthly\" selected>Monthly</option>\n" +
"                                    <option value=\"quarterly\">Quarterly</option>\n" +
"                                    <option value=\"annual\">Annual</option>\n" +
"                                    <option value=\"biannual\">Biannual</option>\n" +
"                                </select>\n" +
"                                <i></i>\n" +
"                            </label>\n" +
"                        </section>\n" +
"                    </div>\n" +
"\n" +
"                    <div class=\"row\">\n" +
"                        <label class=\"label col col-2\">Recurrence Type</label>\n" +
"                        <section class=\"col col-4\">\n" +
"                            <label class=\"select\">\n" +
"                                <select id=\"recurrencetype\" name=\"recurrencetype\">\n" +
"                                    <option value=\"fixed\" selected>Fixed</option>\n" +
"                                    <option value=\"fixedinitial\">Fixed Initial</option>\n" +
"                                    <option value=\"variable\">Variable</option>\n" +
"                                    <option value=\"variableinitial\">Variable Initial</option>\n" +
"                                </select>\n" +
"                                <i></i>\n" +
"                            </label>\n" +
"                        </section>\n" +
"                        <label class=\"label col col-2\">Recurrence Amount</label>\n" +
"                        <section class=\"col col-4\">\n" +
"                            <label class=\"input\">\n" +
"                                <i class=\"icon-append fa fa-dollar\"></i>\n" +
"                                <input id=\"recurrenceamount\" type=\"text\" name=\"recurrenceamount\" value=\"0.00\" placeholder=\"Recurrence Amount\">\n" +
"                            </label>\n" +
"                        </section>\n" +
"                    </div>\n" +
"\n" +
"                    <div class=\"row\">\n" +
"                        <label class=\"label col col-2\">Max Amount</label>\n" +
"                        <section class=\"col col-4\">\n" +
"                            <label class=\"input\">\n" +
"                                <i class=\"icon-append fa fa-dollar\"></i>\n" +
"                                <input id=\"recurrencemaxamount\" type=\"text\" name=\"recurrencemaxamount\" value=\"0.00\" placeholder=\"Max Amount\">\n" +
"                            </label>\n" +
"                        </section>\n" +
"                        <label class=\"label col col-2\">Beneficiary Id</label>\n" +
"                        <section class=\"col col-4\">\n" +
"                            <label class=\"input\">\n" +
"                                <i class=\"icon-append fa fa-user\"></i>\n" +
"                                <input id=\"beneficiaryid\" type=\"text\" name=\"beneficiaryid\" value=\"0.00\" placeholder=\"Beneficiary Id\">\n" +
"                            </label>\n" +
"                        </section>\n" +
"                    </div>\n" +
"\n" +
"                    <div class=\"row\">\n" +
"                        <label class=\"label col col-2\">Document Type</label>\n" +
"                        <section class=\"col col-4\">\n" +
"                            <label class=\"select\">\n" +
"                                <select id=\"documenttype\" name=\"documenttype\">\n" +
"                                    <option value=\"0\" selected>0</option>\n" +
"                                    <option value=\"1\">1</option>\n" +
"                                    <option value=\"2\">2</option>\n" +
"                                </select>\n" +
"                                <i></i>\n" +
"                            </label>\n" +
"                        </section>\n" +
"                        <label class=\"label col col-2\">Document Number</label>\n" +
"                        <section class=\"col col-4\">\n" +
"                            <label class=\"input\">\n" +
"                                <i class=\"icon-append fa fa-desktop\"></i>\n" +
"                                <input id=\"documentnumber\" type=\"text\" name=\"documentnumber\" value=\"\" placeholder=\"Document Number\">\n" +
"                            </label>\n" +
"                        </section>\n" +
"                    </div>\n" +
"                </fieldset>"
                    + "<footer>\n"
                    + "<button type=\"submit\" class=\"button\">Authorize</button>\n"
                    + "<div class=\"progress\"></div>\n"
                    + "</footer>"
                    + "</div>"
                    + " </div>");
            

        } else {

            out.println(security.getHttpCode() + " - " + security.getResponse());
        }
        out.flush();
    }
}

