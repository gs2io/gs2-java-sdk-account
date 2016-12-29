package io.gs2.account.control;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import io.gs2.account.Gs2Account;
import io.gs2.control.Gs2BasicRequest;

/**
 * アカウント削除リクエスト。
 * 
 * @author Game Server Services, Inc.
 *
 */
@SuppressWarnings("serial")
@JsonIgnoreProperties(ignoreUnknown=true)
public class DeleteAccountRequest extends Gs2BasicRequest<DeleteAccountRequest> {

	public static class Constant extends Gs2Account.Constant {
		public static final String FUNCTION = "DeleteAccount";
	}

	/** ゲーム名 */
	String gameName;
	/** アカウントID */
	String userId;

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
	public DeleteAccountRequest withGameName(String gameName) {
		setGameName(gameName);
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
	public DeleteAccountRequest withUserId(String userId) {
		setUserId(userId);
		return this;
	}
}
