package io.gs2.account.control;

import io.gs2.account.Gs2Account;
import io.gs2.control.Gs2UserRequest;

/**
 * 引き継ぎ情報の作成リクエスト。
 * 
 * @author TakeOver Server Services, Inc.
 *
 */
@SuppressWarnings("serial")
public class CreateTakeOverRequest extends Gs2UserRequest<CreateTakeOverRequest> {

	public static class Constant extends Gs2Account.Constant {
		public static final String FUNCTION = "CreateTakeOver";
	}
	
	/** ゲーム名 */
	String gameName;
	/** 引き継ぎ種別 */
	Integer type;
	/** ユーザ固有ID */
	String userIdentifier;
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
	public CreateTakeOverRequest withGameName(String gameName) {
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
	public CreateTakeOverRequest withType(Integer type) {
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
	public CreateTakeOverRequest withUserIdentifier(String userIdentifier) {
		setUserIdentifier(userIdentifier);
		return this;
	}
	
	/**
	 * パスワードを取得。
	 * 
	 * @return ユーザ固有ID
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
	public CreateTakeOverRequest withPassword(String password) {
		setPassword(password);
		return this;
	}
}
