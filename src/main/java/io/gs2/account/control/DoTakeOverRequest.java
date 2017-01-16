package io.gs2.account.control;

import io.gs2.account.Gs2Account;
import io.gs2.control.Gs2BasicRequest;

/**
 * 引き継ぎ情報の更新リクエスト。
 * 
 * @author TakeOver Server Services, Inc.
 *
 */
@SuppressWarnings("serial")
public class DoTakeOverRequest extends Gs2BasicRequest<DoTakeOverRequest> {

	public static class Constant extends Gs2Account.Constant {
		public static final String FUNCTION = "DoTakeOver";
	}

	/** ゲーム名 */
	String gameName;
	/** 引き継ぎ種別 */
	Integer type;
	/** ユーザ固有ID */
	String userIdentifier;
	/** 新しいパスワード */
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
	public DoTakeOverRequest withGameName(String gameName) {
		setGameName(gameName);
		return this;
	}
	
	/**
	 * 引き継ぎ種別を取得。
	 * 
	 * @return 引き継ぎ種別
	 */
	public Integer getType() {
		return type;
	}
	
	/**
	 * 引き継ぎ種別を設定。
	 * 
	 * @param type 引き継ぎ種別
	 */
	public void setType(Integer type) {
		this.type = type;
	}
	
	/**
	 * 引き継ぎ種別を設定。
	 * 
	 * @param type 引き継ぎ種別
	 * @return this
	 */
	public DoTakeOverRequest withType(Integer type) {
		setType(type);
		return this;
	}
	
	/**
	 * ユーザ固有IDを取得。
	 * 
	 * @return ユーザ固有ID
	 */
	public String getUserIdentifier() {
		return userIdentifier;
	}
	
	/**
	 * ユーザ固有IDを設定。
	 * 
	 * @param userIdentifier ユーザ固有ID
	 */
	public void setUserIdentifier(String userIdentifier) {
		this.userIdentifier = userIdentifier;
	}
	
	/**
	 * ユーザ固有IDを設定。
	 * 
	 * @param userIdentifier ユーザ固有ID
	 * @return this
	 */
	public DoTakeOverRequest withUserIdentifier(String userIdentifier) {
		setUserIdentifier(userIdentifier);
		return this;
	}
	
	/**
	 * 新しいパスワードを取得。
	 * 
	 * @return 新しいパスワード
	 */
	public String getPassword() {
		return password;
	}
	
	/**
	 * 新しいパスワードを設定。
	 * 
	 * @param password 新しいパスワード
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	
	/**
	 * 新しいパスワードを設定。
	 * 
	 * @param password 新しいパスワード
	 * @return this
	 */
	public DoTakeOverRequest withPassword(String password) {
		setPassword(password);
		return this;
	}
}
