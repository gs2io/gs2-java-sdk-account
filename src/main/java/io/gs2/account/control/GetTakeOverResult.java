package io.gs2.account.control;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import io.gs2.account.model.TakeOver;

/**
 * 引き継ぎ情報取得結果。
 * 
 * @author TakeOver Server Services, Inc.
 *
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class GetTakeOverResult {

	/** 引き継ぎ情報 */
	TakeOver item;
	
	/**
	 * 取得した引き継ぎ情報を取得。
	 * 
	 * @return 引き継ぎ情報
	 */
	public TakeOver getItem() {
		return item;
	}
	
	/**
	 * 引き継ぎ情報を設定。
	 * 
	 * @param item 引き継ぎ情報
	 */
	public void setItem(TakeOver item) {
		this.item = item;
	}
}
