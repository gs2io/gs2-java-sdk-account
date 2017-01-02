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
	String gameName;
	/** 説明文 */
	String description;
	/** サービスクラス */
	String serviceClass;
	/** データ引き継ぎ時にアカウントのパスワード変更するか */
	Boolean changePasswordIfTakeOver;

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
	public UpdateGameRequest withGameName(String gameName) {
		setGameName(gameName);
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
	
	/**
	 * データ引き継ぎ時にアカウントのパスワード変更するかを取得。
	 * 
	 * @return データ引き継ぎ時にアカウントのパスワード変更するか
	 */
	public Boolean getChangePasswordIfTakeOver() {
		return changePasswordIfTakeOver;
	}
	
	/**
	 * データ引き継ぎ時にアカウントのパスワード変更するかを設定。
	 * 
	 * @param changePasswordIfTakeOver データ引き継ぎ時にアカウントのパスワード変更するか
	 */
	public void setChangePasswordIfTakeOver(Boolean changePasswordIfTakeOver) {
		this.changePasswordIfTakeOver = changePasswordIfTakeOver;
	}
	
	/**
	 * データ引き継ぎ時にアカウントのパスワード変更するかを設定。
	 * 
	 * @param changePasswordIfTakeOver データ引き継ぎ時にアカウントのパスワード変更するか
	 * @return this
	 */
	public UpdateGameRequest withChangePasswordIfTakeOver(Boolean changePasswordIfTakeOver) {
		setChangePasswordIfTakeOver(changePasswordIfTakeOver);
		return this;
	}
}
