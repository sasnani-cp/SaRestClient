package com.sandeep.RestClient2.exeutable;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import com.sandeep.RestClient2.util.Constants;

public class SchoolGetter {
	
	
	public void execute() {
		
		
		CloseableHttpClient client = HttpClients.createDefault();
		
		try {
			
			String SchoolGetURL = Constants.baseURL + "/schools";
			
			HttpGet request = new HttpGet(SchoolGetURL);
			CloseableHttpResponse response = client.execute(request);
			
			System.out.println("Http Protocol-"+response.getProtocolVersion());
			System.out.println("Call Status="+response.getStatusLine().getStatusCode());
			HttpEntity responseEntity = response.getEntity();
			System.out.println("Response Entity-"+responseEntity);
			
			if(responseEntity != null) {
				String result = EntityUtils.toString(responseEntity);
				System.out.println("Result String is "+result);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
