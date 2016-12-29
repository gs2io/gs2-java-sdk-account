package io.gs2.account.control;

import java.util.List;

/**
 * カテゴリ一覧取得結果。
 * 
 * @author Game Server Services, Inc.
 *
 */
public class DescribeServiceClassResult {

	/** カテゴリ一覧 */
	List<String> items;
	
	/**
	 * 取得したカテゴリ数を取得。
	 * 
	 * @return 取得したカテゴリ数
	 */
	public Integer getCount() {
		return items == null ? null : items.size();
	}
	
	@Deprecated
	public void setCount(Integer count){ }
	
	/**
	 * 取得したカテゴリ一覧を取得。
	 * 
	 * @return カテゴリ一覧
	 */
	public List<String> getItems() {
		return items;
	}
	
	/**
	 * カテゴリ一覧を設定。
	 * 
	 * @param items カテゴリ一覧
	 */
	public void setItems(List<String> items) {
		this.items = items;
	}
}
