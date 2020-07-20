package com.sandeep.RestClient2.exeutable;

import java.util.ArrayList;
import java.util.List;

import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

public class LoginPostClient {
	
	
	public void execute() {
		
		try {
			
			HttpPost request = new HttpPost("http://localhost:801/login");
			
			List<NameValuePair> paramList = new ArrayList();
			
			paramList.add(new BasicNameValuePair("user","admin"));
			paramList.add(new BasicNameValuePair("pwd","admin"));
			
			request.setEntity(new UrlEncodedFormEntity(paramList));
			
			CloseableHttpClient client = HttpClients.createDefault();
			
			CloseableHttpResponse response = client.execute(request);
			
			System.out.println("Http Protocol-"+response.getProtocolVersion());
			System.out.println("Call Status="+response.getStatusLine().getStatusCode());
			HttpEntity responseEntity = response.getEntity();
			System.out.println("Response Entity-"+responseEntity);
			
			if(responseEntity != null) {
				String result = EntityUtils.toString(responseEntity);
				System.out.println("Result String is "+result);
			}
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
