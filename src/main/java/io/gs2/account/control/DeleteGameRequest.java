package io.gs2.account.control;

import io.gs2.account.Gs2Account;
import io.gs2.control.Gs2BasicRequest;

/**
 * ゲームの削除リクエスト。
 * 
 * @author Game Server Services, Inc.
 *
 */
@SuppressWarnings("serial")
public class DeleteGameRequest extends Gs2BasicRequest<DeleteGameRequest> {

	public static class Constant extends Gs2Account.Constant {
		public static final String FUNCTION = "DeleteGame";
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
	public DeleteGameRequest withGameName(String gameName) {
		setGameName(gameName);
		return this;
	}
}
