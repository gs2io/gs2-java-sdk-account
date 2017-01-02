package io.gs2.account.control;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import io.gs2.account.model.TakeOver;

/**
 * 引き継ぎ情報一覧取得結果。
 * 
 * @author TakeOver Server Services, Inc.
 *
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class DescribeTakeOverResult {

	/** 引き継ぎ情報一覧 */
	List<TakeOver> items;
	/** 次のページを取得するためのトークン */
	String nextPageToken;
	
	/**
	 * 取得した引き継ぎ情報数を取得。
	 * 
	 * @return 取得した引き継ぎ情報数
	 */
	public Integer getCount() {
		return items == null ? null : items.size();
	}
	
	@Deprecated
	public void setCount(Integer count){ }
	
	/**
	 * 取得した引き継ぎ情報一覧を取得。
	 * 
	 * @return 引き継ぎ情報一覧
	 */
	public List<TakeOver> getItems() {
		return items;
	}
	
	/**
	 * 引き継ぎ情報一覧を設定。
	 * 
	 * @param items 引き継ぎ情報一覧
	 */
	public void setItems(List<TakeOver> items) {
		this.items = items;
	}
	
	/**
	 * 次のページを取得するためのトークンを取得。
	 * 
	 * {@link DescribeTakeOverRequest} に指定することで、次のページを取得できます。
	 * 
	 * @return トークン
	 */
	public String getNextPageToken() {
		return nextPageToken;
	}
	
	public void setNextPageToken(String nextPageToken) {
		this.nextPageToken = nextPageToken;
	}
}
