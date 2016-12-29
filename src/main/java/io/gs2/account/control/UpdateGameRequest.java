package io.gs2.account.control;

import io.gs2.account.Gs2Account;
import io.gs2.control.Gs2BasicRequest;

/**
 * ゲームの更新リクエスト。
 * 
 * @author Game Server Services, Inc.
 *
 */
@SuppressWarnings("serial")
public class UpdateGameRequest extends Gs2BasicRequest<UpdateGameRequest> {

	public static class Constant extends Gs2Account.Constant {
		public static final String FUNCTION = "UpdateGame";
	}

	/** ゲーム名 */
	String accountName;
	/** 説明文 */
	String description;
	/** サービスクラス */
	String serviceClass;

	/**
	 * ゲーム名を取得。
	 * 
	 * @return ゲーム名
	 */
	public String getGameName() {
		return accountName;
	}
	
	/**
	 * ゲーム名を設定。
	 * 
	 * @param accountName ゲーム名
	 */
	public void setGameName(String accountName) {
		this.accountName = accountName;
	}
	
	/**
	 * ゲーム名を設定。
	 * 
	 * @param accountName ゲーム名
	 * @return this
	 */
	public UpdateGameRequest withGameName(String accountName) {
		setGameName(accountName);
		return this;
	}
	
	/**
	 * 説明文を取得。
	 * 
	 * @return 説明文
	 */
	public String getDescription() {
		return description;
	}
	
	/**
	 * 説明文を設定。
	 * 
	 * @param description 説明文
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	
	/**
	 * 説明文を設定。
	 * 
	 * @param description 説明文
	 * @return this
	 */
	public UpdateGameRequest withDescription(String description) {
		setDescription(description);
		return this;
	}
	
	/**
	 * サービスクラスを取得。
	 * 
	 * @return サービスクラス
	 */
	public String getServiceClass() {
		return serviceClass;
	}
	
	/**
	 * サービスクラスを設定。
	 * 
	 * @param serviceClass サービスクラス
	 */
	public void setServiceClass(String serviceClass) {
		this.serviceClass = serviceClass;
	}
	
	/**
	 * サービスクラスを設定。
	 * 
	 * @param serviceClass サービスクラス
	 * @return this
	 */
	public UpdateGameRequest withServiceClass(String serviceClass) {
		setServiceClass(serviceClass);
		return this;
	}
}
