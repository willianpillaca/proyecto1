package com.ginnet.modulo.visa.demo.utils;

import java.io.IOException;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.core.MediaType;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

public class ExecutorUtil {
    
    /**
     * Enviar request
     *
     * @param method
     * @param input
     * @param endpoint
     * @param mediaType
     * @param authHeader
     * @param authValue
     * @return
     * @throws IOException
     */
    public static HttpResponse sendRequest(String method, String input, String endpoint, String mediaType, String authHeader, String authValue) throws IOException {
        try {
            try (CloseableHttpClient httpclient = HttpClients.createDefault()) {

                String url = String.format("%s", endpoint);
                
                StringEntity entity = new StringEntity(input);
                //
                HttpRequestBase httpRequest;
                
                if (method.equalsIgnoreCase("POST")) {
                    httpRequest = new HttpPost(url);
                    ((HttpPost) httpRequest).setEntity(entity);
                } else {
                    httpRequest = new HttpGet(url);
                }
                // 
                httpRequest.setHeader("Content-Type", mediaType);
                if (authHeader != null && !authHeader.isEmpty()) {
                    httpRequest.setHeader(authHeader, authValue);
                }               

                try (CloseableHttpResponse httpresponse = httpclient.execute(httpRequest)) {
                    String output = EntityUtils.toString(httpresponse.getEntity());

                    return HttpResponse.builder().withHttpCode(httpresponse.getStatusLine().getStatusCode())
                            .withResponse(output).build();
                }
            }
        } catch (Exception ex) {
            return HttpResponse.builder().withHttpCode(500)
                    .withResponse(ex.getLocalizedMessage()).build();
        }

    }
    
    public static String getClientIp(HttpServletRequest request) {

        String remoteAddr = "";

        if (request != null) {
            remoteAddr = request.getHeader("X-FORWARDED-FOR");
            if (remoteAddr == null || "".equals(remoteAddr)) {
                remoteAddr = request.getRemoteAddr();
            }
        }

        return remoteAddr;
    }
}

