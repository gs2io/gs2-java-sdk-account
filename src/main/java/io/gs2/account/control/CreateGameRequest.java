package io.gs2.account.control;

import io.gs2.control.Gs2BasicRequest;
import io.gs2.account.Gs2Account;

/**
 * ゲームの作成リクエスト。
 * 
 * @author Game Server Services, Inc.
 *
 */
@SuppressWarnings("serial")
public class CreateGameRequest extends Gs2BasicRequest<CreateGameRequest> {

	public static class Constant extends Gs2Account.Constant {
		public static final String FUNCTION = "CreateGame";
	}
	
	/** ゲーム名 */
	String name;
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
	public String getName() {
		return name;
	}
	
	/**
	 * ゲーム名を設定。
	 * 
	 * @param name ゲーム名
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * ゲーム名を設定。
	 * 
	 * @param name ゲーム名
	 * @return this
	 */
	public CreateGameRequest withName(String name) {
		setName(name);
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
	public CreateGameRequest withDescription(String description) {
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
	public CreateGameRequest withServiceClass(String serviceClass) {
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
	public CreateGameRequest withChangePasswordIfTakeOver(Boolean changePasswordIfTakeOver) {
		setChangePasswordIfTakeOver(changePasswordIfTakeOver);
		return this;
	}
}
