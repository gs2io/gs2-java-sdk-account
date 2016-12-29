package io.gs2.account.control;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * ゲームの状態取得結果。
 * 
 * @author Game Server Services, Inc.
 *
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class GetGameStatusResult {

	/** ゲームの状態 */
	String status;
	
	/**
	 * 取得したゲームの状態を取得。
	 * 
	 * @return ゲーム
	 */
	public String getStatus() {
		return status;
	}
	
	/**
	 * ゲームの状態を設定。
	 * 
	 * @param status ゲーム
	 */
	public void setStatus(String status) {
		this.status = status;
	}
}
