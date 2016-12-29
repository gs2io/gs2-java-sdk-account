package io.gs2.account.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * ゲーム
 * 
 * @author Game Server Services, Inc.
 *
 */
@SuppressWarnings("serial")
@JsonIgnoreProperties(ignoreUnknown=true)
public class Game implements Serializable {

	/** ゲームID */
	String gameId;
	/** オーナーID */
	String ownerId;
	/** ゲーム名 */
	String name;
	/** サービスクラス */
	String serviceClass;
	/** 説明文 */
	String description;
	/** 作成日時 */
	Long createAt;
	
	/**
	 * ゲームIDを取得
	 * 
	 * @return ゲームID
	 */
	public String getGameId() {
		return gameId;
	}
	
	/**
	 * ゲームIDを設定
	 * 
	 * @param gameId ゲームID
	 */
	public void setGameId(String gameId) {
		this.gameId = gameId;
	}
	
	/**
	 * オーナーIDを取得
	 * 
	 * @return オーナーID
	 */
	public String getOwnerId() {
		return ownerId;
	}
	
	/**
	 * オーナーIDを設定
	 * 
	 * @param ownerId オーナーID
	 */
	public void setOwnerId(String ownerId) {
		this.ownerId = ownerId;
	}
	
	/**
	 * ゲーム名を取得
	 * 
	 * @return ゲーム名
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * ゲーム名を設定
	 * 
	 * @param name ゲーム名
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * サービスクラスを取得
	 * 
	 * @return サービスクラス
	 */
	public String getServiceClass() {
		return serviceClass;
	}
	
	/**
	 * サービスクラスを設定
	 * 
	 * @param serviceClass サービスクラス
	 */
	public void setServiceClass(String serviceClass) {
		this.serviceClass = serviceClass;
	}
	
	/**
	 * 開封時自動削除を取得
	 * 
	 * @return 開封時自動削除
	 */
	public String getDescription() {
		return description;
	}
	
	/**
	 * 説明文を設定
	 * 
	 * @param description 説明文
	 */
	public void setDescription(String description) {
		this.description = description;
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
