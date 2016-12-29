package io.gs2.account.control;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * 認証結果。
 * 
 * @author Account Server Services, Inc.
 *
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class AuthenticationResult {
	
	String token;
	
	/**
	 * 認証トークンを取得。
	 * 
	 * @return 認証トークン
	 */
	public String getToken() {
		return token;
	}
	
	/**
	 * 認証トークンを設定。
	 * 
	 * @param token 認証トークン
	 */
	public void setToken(String token) {
		this.token = token;
	}
	
	/**
	 * 認証トークンを設定。
	 * 
	 * @param token 認証トークン
	 * @return this
	 */
	public AuthenticationResult withToken(String token) {
		setToken(token);
		return this;
	}
}
