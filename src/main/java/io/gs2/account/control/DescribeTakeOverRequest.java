package io.gs2.account.control;

import io.gs2.account.Gs2Account;
import io.gs2.control.Gs2UserRequest;

/**
 * 引き継ぎ情報一覧の取得リクエスト。
 * 
 * @author TakeOver Server Services, Inc.
 *
 */
@SuppressWarnings("serial")
public class DescribeTakeOverRequest extends Gs2UserRequest<DescribeTakeOverRequest> {

	public static class Constant extends Gs2Account.Constant {
		public static final String FUNCTION = "DescribeTakeOver";
	}

	/** ゲーム名 */
	String gameName;
	/** 取得開始位置トークン */
	String pageToken;
	/** 取得件数 */
	Integer limit;

	/**
	 * ゲーム名を取得。
	 * 
	 * @return ゲーム名
	 */
	public String getGameName() {
		return gameName;
	}
	
	/**
	 * ゲーム名を設定。
	 * 
	 * @param gameName ゲーム名
	 */
	public void setGameName(String gameName) {
		this.gameName = gameName;
	}
	
	/**
	 * ゲーム名を設定。
	 * 
	 * @param gameName ゲーム名
	 * @return this
	 */
	public DescribeTakeOverRequest withGameName(String gameName) {
		setGameName(gameName);
		return this;
	}
	
	/**
	 * 取得開始位置トークンを取得。
	 * 
	 * @return 取得開始位置トークン
	 */
	public String getPageToken() {
		return pageToken;
	}
	
	/**
	 * 取得開始位置トークンを設定。
	 * 
	 * @param pageToken 取得開始位置トークン
	 */
	public void setPageToken(String pageToken) {
		this.pageToken = pageToken;
	}
	
	/**
	 * 取得開始位置トークンを設定。
	 * 
	 * @param pageToken 取得開始位置トークン
	 * @return this
	 */
	public DescribeTakeOverRequest withPageToken(String pageToken) {
		setPageToken(pageToken);
		return this;
	}

	/**
	 * 取得件数を取得。
	 * 
	 * @return 取得件数
	 */
	public Integer getLimit() {
		return limit;
	}
	
	/**
	 * 取得件数を設定。
	 * 
	 * @param limit 取得件数
	 */
	public void setLimit(Integer limit) {
		this.limit = limit;
	}
	
	/**
	 * 取得件数を設定。
	 * 
	 * @param limit 取得件数
	 * @return this
	 */
	public DescribeTakeOverRequest withLimit(Integer limit) {
		setLimit(limit);
		return this;
	}
}
