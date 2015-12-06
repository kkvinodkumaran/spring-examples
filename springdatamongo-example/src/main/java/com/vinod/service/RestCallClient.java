package com.vinod.service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.conn.ssl.AllowAllHostnameVerifier;
import org.apache.http.conn.ssl.SSLContextBuilder;
import org.apache.http.conn.ssl.TrustStrategy;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

@SuppressWarnings("deprecation")
public class RestCallClient {
	
	/**
	 * Method to execute ReST call.
	 * 
	 * @param url
	 * @param header
	 * @return String
	 * @throws KeyManagementException
	 * @throws NoSuchAlgorithmException
	 * @throws KeyStoreException
	 * @throws ClientProtocolException
	 * @throws IOException
	 */
	public static String excecuteRestPostCall(String url,String body)
			throws KeyManagementException, NoSuchAlgorithmException,
			KeyStoreException, ClientProtocolException, IOException {
		StringBuilder sb = new StringBuilder();
		BufferedReader br = null;
		try {
			CloseableHttpClient httpClient = getHttpClient();
			HttpPost request = new HttpPost(url);
			request.setHeader("Content-type", "application/json");
			StringEntity postingEntity = new StringEntity(body);
			request.setEntity(postingEntity);
			HttpResponse response = httpClient.execute(request);
			if (response != null) {
				br = new BufferedReader(new InputStreamReader(
						response.getEntity().getContent(), "UTF-8"));
				String line = "";
				while ((line = br.readLine()) != null) {
					sb.append(line);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				br.close();
			}
		}
		return sb.toString();
	}

	/**
	 * Method to create http client object.
	 * 
	 * @return CloseableHttpClient
	 * @throws NoSuchAlgorithmException
	 * @throws KeyManagementException
	 * @throws KeyStoreException
	 */
	private static CloseableHttpClient getHttpClient()
			throws NoSuchAlgorithmException, KeyManagementException,
			KeyStoreException {
		CloseableHttpClient httpClient = HttpClients.custom()
				.setHostnameVerifier(new AllowAllHostnameVerifier())
				.setSslcontext(new SSLContextBuilder()
						.loadTrustMaterial(null, new TrustStrategy() {
							public boolean isTrusted(X509Certificate[] arg0,
									String arg1) throws CertificateException {
								return true;
							}
						}).build())
				.build();
		return httpClient;
	}
}
