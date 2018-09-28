package com.ginnet.modulo.visa.demo.utils;

public class HttpResponse {
    private int httpCode;
    private String response;

    public HttpResponse(int httpCode, String response) {
        this.httpCode = httpCode;
        this.response = response;
    }
    
    public int getHttpCode() {
        return httpCode;
    }

    public void setHttpCode(int httpCode) {
        this.httpCode = httpCode;
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    @Override
    public String toString() {
        return httpCode + " - " + response;
    }
        
    public static Builder builder() {
        return new Builder(-1, "Not initialized");
    }
    
    public static final class Builder {
        private int httpCode;
        private String response;
        
        public Builder(int httpCode, String response) {
            this.httpCode = httpCode;
            this.response = response;
        }

        public Builder withHttpCode(int httpCode) {
            this.httpCode = httpCode;
            return this;
        }
        
        public Builder withResponse(String response) {
            this.response = response;
            return this;
        }

        public HttpResponse build() {            
            return new HttpResponse(httpCode, response);
        }
    }
}

