package io.gs2.account.control;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import io.gs2.account.model.Account;

/**
 * アカウントの作成結果。
 * 
 * @author Account Server Services, Inc.
 *
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class CreateAccountResult {
	
	Account item;
	
	/**
	 * ゲームを取得。
	 * 
	 * @return ゲーム
	 */
	public Account getItem() {
		return item;
	}
	
	/**
	 * ゲームを設定。
	 * 
	 * @param item ゲーム
	 */
	public void setItem(Account item) {
		this.item = item;
	}
	
	/**
	 * ゲームを設定。
	 * 
	 * @param item ゲーム
	 * @return this
	 */
	public CreateAccountResult withItem(Account item) {
		setItem(item);
		return this;
	}
}
