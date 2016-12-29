package io.gs2.account.control;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import io.gs2.account.model.Game;

/**
 * ゲーム取得結果。
 * 
 * @author Game Server Services, Inc.
 *
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class GetGameResult {

	/** ゲーム */
	Game item;
	
	/**
	 * 取得したゲームを取得。
	 * 
	 * @return ゲーム
	 */
	public Game getItem() {
		return item;
	}
	
	/**
	 * ゲームを設定。
	 * 
	 * @param item ゲーム
	 */
	public void setItem(Game item) {
		this.item = item;
	}
}
