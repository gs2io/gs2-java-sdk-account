package io.gs2.account.control;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import io.gs2.account.model.Account;

/**
 * アカウント一覧取得結果。
 * 
 * @author Game Server Services, Inc.
 *
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class DescribeAccountResult {

	/** アカウント一覧 */
	List<Account> items;
	/** 次のページを取得するためのトークン */
	String nextPageToken;
	
	/**
	 * 取得したアカウント数を取得。
	 * 
	 * @return 取得したアカウント数
	 */
	public Integer getCount() {
		return items == null ? null : items.size();
	}

	@Deprecated
	public void setCount(Integer count){ }
	
	/**
	 * 取得したアカウント一覧を取得。
	 * 
	 * @return アカウント一覧
	 */
	public List<Account> getItems() {
		return items;
	}
	
	/**
	 * アカウント一覧を設定。
	 * 
	 * @param items アカウント一覧
	 */
	public void setItems(List<Account> items) {
		this.items = items;
	}
	
	/**
	 * 次のページを取得するためのトークンを取得。
	 * 
	 * {@link DescribeAccountRequest} に指定することで、次のページを取得できます。
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
