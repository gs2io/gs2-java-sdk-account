package io.gs2.account.control;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import io.gs2.account.model.Game;

/**
 * ゲーム一覧取得結果。
 * 
 * @author Game Server Services, Inc.
 *
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class DescribeGameResult {

	/** ゲーム一覧 */
	List<Game> items;
	/** 次のページを取得するためのトークン */
	String nextPageToken;
	
	/**
	 * 取得したゲーム数を取得。
	 * 
	 * @return 取得したゲーム数
	 */
	public Integer getCount() {
		return items == null ? null : items.size();
	}
	
	@Deprecated
	public void setCount(Integer count){ }
	
	/**
	 * 取得したゲーム一覧を取得。
	 * 
	 * @return ゲーム一覧
	 */
	public List<Game> getItems() {
		return items;
	}
	
	/**
	 * ゲーム一覧を設定。
	 * 
	 * @param items ゲーム一覧
	 */
	public void setItems(List<Game> items) {
		this.items = items;
	}
	
	/**
	 * 次のページを取得するためのトークンを取得。
	 * 
	 * {@link DescribeGameRequest} に指定することで、次のページを取得できます。
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
