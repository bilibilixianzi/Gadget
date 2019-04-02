package httpcl;
import java.io.IOException;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicHeader;
import org.apache.http.protocol.HTTP;
import org.apache.http.util.EntityUtils;
public class Httpon {
	public static String doPost(String url,String jsonstr,String charset) {
		HttpClient httpClient=null;
		HttpPost httpPost=null;
		String result=null;
		try {
			httpClient=new SSLClient();
			httpPost=new HttpPost(url);
			httpPost.addHeader("Content-Type","application/json");
			StringEntity se=new StringEntity(jsonstr);
			se.setContentType("text/json");
			se.setContentEncoding(new BasicHeader("Content-Type","application/json"));
			httpPost.setEntity(se);
			HttpResponse response=httpClient.execute(httpPost);
			if(response!=null) {
				HttpEntity resEntity=response.getEntity();
				if(resEntity!=null) {
					result=EntityUtils.toString(resEntity,charset);
				}
			}
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		return result;
	}
	public static String doGet(String url,String charset) {
		HttpGet get=new HttpGet(url);
		try {
			HttpResponse response=HttpClients.createDefault().execute(get);
			HttpEntity entity=response.getEntity();
			String result=EntityUtils.toString(entity,charset);
			return result;
		}catch(ClientProtocolException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
		return null;
	}
}
