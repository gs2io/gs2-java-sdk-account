package io.gs2.account.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * 引き継ぎ情報
 * 
 * @author Game Server Services, Inc.
 *
 */
@SuppressWarnings("serial")
@JsonIgnoreProperties(ignoreUnknown=true)
public class TakeOver implements Serializable {

	/** ゲーム名 */
	String gameName;
	/** ユーザID */
	String userId;
	/** 引き継ぎ種別 */
	Integer type;
	/** ユーザ固有ID */
	String userIdentifier;
	/** 作成日時 */
	Long createAt;
	
	/**
	 * ゲーム名を取得
	 * 
	 * @return ゲーム名
	 */
	public String getGameName() {
		return gameName;
	}
	
	/**
	 * ゲーム名を設定
	 * 
	 * @param gameName ゲーム名
	 */
	public void setGameName(String gameName) {
		this.gameName = gameName;
	}
	
	/**
	 * ユーザIDを取得
	 * 
	 * @return ユーザID
	 */
	public String getUserId() {
		return userId;
	}
	
	/**
	 * ユーザIDを設定
	 * 
	 * @param userId ユーザID
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	/**
	 * 引き継ぎ種別を取得
	 * 
	 * @return 引き継ぎ種別
	 */
	public Integer getType() {
		return type;
	}
	
	/**
	 * 引き継ぎ種別を設定
	 * 
	 * @param type 引き継ぎ種別
	 */
	public void setType(Integer type) {
		this.type = type;
	}
	
	/**
	 * ユーザ固有IDを取得
	 * 
	 * @return ユーザ固有ID
	 */
	public String getUserIdentifier() {
		return userIdentifier;
	}
	
	/**
	 * ユーザ固有IDを設定
	 * 
	 * @param userIdentifier ユーザ固有ID
	 */
	public void setUserIdentifier(String userIdentifier) {
		this.userIdentifier = userIdentifier;
	}
	
	/**
	 * 作成日時を取得
	 * 
	 * @return 作成日時
	 */
	public Long getCreateAt() {
		return createAt;
	}
	
	/**
	 * 作成日時を設定
	 * 
	 * @param createAt 作成日時
	 */
	public void setCreateAt(Long createAt) {
		this.createAt = createAt;
	}
}
