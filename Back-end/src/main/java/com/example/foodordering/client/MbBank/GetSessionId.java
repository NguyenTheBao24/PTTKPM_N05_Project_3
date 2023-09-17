package com.example.foodordering.client.MbBank;

import com.example.foodordering.client.ApiCallTemplate;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class GetSessionId {
    private static final String apiUrl = "https://online.mbbank.com.vn/api/retail_web/internetbanking/doLogin";

    public String getSessionId(String requestJson){
        RestTemplate restTemplate = new RestTemplate();
        ApiCallTemplate apiCallTemplate = new ApiCallTemplate(restTemplate, apiUrl, getRequestJson(requestJson));
        return apiCallTemplate.callApi("sessionId", HttpMethod.POST);
    }

    private String getRequestJson(String account){
        return "{" + account + ",\"refNo\": \"2023091400484893\", \"deviceIdCommon\": \"oankw8vh-mbib-0000-0000-2023090618002619\", \"sessionId\": \"\"}";
    }


}
