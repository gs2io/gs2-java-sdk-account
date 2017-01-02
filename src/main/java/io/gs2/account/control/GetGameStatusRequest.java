package io.gs2.account.control;

import io.gs2.account.Gs2Account;
import io.gs2.control.Gs2BasicRequest;

/**
 * ゲームの状態取得リクエスト。
 * 
 * @author Game Server Services, Inc.
 *
 */
@SuppressWarnings("serial")
public class GetGameStatusRequest extends Gs2BasicRequest<GetGameStatusRequest> {

	public static class Constant extends Gs2Account.Constant {
		public static final String FUNCTION = "GetGameStatus";
	}
	
	/** ゲーム名 */
	String gameName;
	
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
	public GetGameStatusRequest withGameName(String gameName) {
		setGameName(gameName);
		return this;
	}
}
