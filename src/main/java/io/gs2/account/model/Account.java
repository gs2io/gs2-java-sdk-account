package io.gs2.account.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * アカウント
 * 
 * @author Game Server Services, Inc.
 *
 */
@SuppressWarnings("serial")
@JsonIgnoreProperties(ignoreUnknown=true)
public class Account implements Serializable {

	/** アカウントID */
	String userId;
	/** パスワード */
	String password;
	/** 受信日時 */
	Long createAt;
	
	/**
	 * アカウントIDを取得
	 * 
	 * @return アカウントID
	 */
	public String getUserId() {
		return userId;
	}
	
	/**
	 * アカウントIDを設定
	 * 
	 * @param userId アカウントID
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	/**
	 * パスワードを取得
	 * 
	 * @return パスワード
	 */
	public String getPassword() {
		return password;
	}
	
	/**
	 * パスワードを設定
	 * 
	 * @param password パスワード
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	
	/**
	 * 受信日時を取得
	 * 
	 * @return 受信日時
	 */
	public Long getCreateAt() {
		return createAt;
	}
	
	/**
	 * 受信日時を設定
	 * 
	 * @param createAt 受信日時
	 */
	public void setCreateAt(Long createAt) {
		this.createAt = createAt;
	}
}
