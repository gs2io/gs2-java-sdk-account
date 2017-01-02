package io.gs2.account.control;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import io.gs2.account.model.Account;

/**
 * 引き継ぎ情報の更新結果。
 * 
 * @author TakeOver Server Services, Inc.
 *
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class DoTakeOverResult {
	
	Account item;
	
	/**
	 * アカウントを取得。
	 * 
	 * @return アカウント
	 */
	public Account getItem() {
		return item;
	}
	
	/**
	 * アカウントを設定。
	 * 
	 * @param item アカウント
	 */
	public void setItem(Account item) {
		this.item = item;
	}
	
	/**
	 * アカウントを設定。
	 * 
	 * @param item アカウント
	 * @return this
	 */
	public DoTakeOverResult withItem(Account item) {
		setItem(item);
		return this;
	}
}
