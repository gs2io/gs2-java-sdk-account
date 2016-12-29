package io.gs2.account.control;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import io.gs2.account.model.Game;

/**
 * ゲームの更新結果。
 * 
 * @author Game Server Services, Inc.
 *
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class UpdateGameResult {
	
	Game item;
	
	/**
	 * ゲームを取得。
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
	
	/**
	 * ゲームを設定。
	 * 
	 * @param item ゲーム
	 * @return this
	 */
	public UpdateGameResult withItem(Game item) {
		setItem(item);
		return this;
	}
}
