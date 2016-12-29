package io.gs2.account.control;

import io.gs2.account.Gs2Account;
import io.gs2.control.Gs2BasicRequest;

/**
 * 認証リクエスト。
 * 
 * @author Game Server Services, Inc.
 *
 */
@SuppressWarnings("serial")
public class AuthenticationRequest extends Gs2BasicRequest<AuthenticationRequest> {

	public static class Constant extends Gs2Account.Constant {
		public static final String FUNCTION = "Authentication";
	}

	/** ゲーム名 */
	String gameName;
	/** 暗号鍵名 */
	String keyName;
	/** アカウントID */
	String userId;
	/** パスワード */
	String password;

	/**
	 * ゲーム名を取得。
	 * 
	 * @return ゲーム名
	 */
	public String getGameName() {
		return gameName;
	}
	
	/**
	 * ゲーム名を設定。
	 * 
	 * @param gameName ゲーム名
	 */
	public void setGameName(String gameName) {
		this.gameName = gameName;
	}
	
	/**
	 * ゲーム名を設定。
	 * 
	 * @param gameName ゲーム名
	 * @return this
	 */
	public AuthenticationRequest withGameName(String gameName) {
		setGameName(gameName);
		return this;
	}

	/**
	 * 暗号鍵名を取得。
	 * 
	 * @return 暗号鍵名
	 */
	public String getKeyName() {
		return keyName;
	}
	
	/**
	 * 暗号鍵名を設定。
	 * 
	 * @param keyName 暗号鍵名
	 */
	public void setKeyName(String keyName) {
		this.keyName = keyName;
	}
	
	/**
	 * 暗号鍵名を設定。
	 * 
	 * @param keyName 暗号鍵名
	 * @return this
	 */
	public AuthenticationRequest withKeyName(String keyName) {
		setKeyName(keyName);
		return this;
	}

	/**
	 * アカウントIDを取得。
	 * 
	 * @return アカウントID
	 */
	public String getUserId() {
		return userId;
	}
	
	/**
	 * アカウントIDを設定。
	 * 
	 * @param userId アカウントID
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	/**
	 * アカウントIDを設定。
	 * 
	 * @param userId アカウントID
	 * @return this
	 */
	public AuthenticationRequest withUserId(String userId) {
		setUserId(userId);
		return this;
	}

	/**
	 * パスワードを取得。
	 * 
	 * @return パスワード
	 */
	public String getPassword() {
		return password;
	}
	
	/**
	 * パスワードを設定。
	 * 
	 * @param password パスワード
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	
	/**
	 * パスワードを設定。
	 * 
	 * @param password パスワード
	 * @return this
	 */
	public AuthenticationRequest withPassword(String password) {
		setPassword(password);
		return this;
	}
}
