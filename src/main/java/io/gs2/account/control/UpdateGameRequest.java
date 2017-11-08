/*
 * Copyright 2016 Game Server Services, Inc. or its affiliates. All Rights
 * Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package io.gs2.account.control;

import org.json.JSONObject;
import java.util.List;
import io.gs2.account.Gs2Account;
import io.gs2.control.Gs2BasicRequest;

/**
 * @author Game Server Services, Inc.
 */
@SuppressWarnings("serial")
public class UpdateGameRequest extends Gs2BasicRequest<UpdateGameRequest> {

	public static class Constant extends Gs2Account.Constant {
		public static final String FUNCTION = "UpdateGame";
	}

	/** ゲームの名前を指定します。 */
	private String gameName;

	/** 引き継ぎ時にアカウントのパスワードを変更するか */
	private Boolean changePasswordIfTakeOver;

	/** ゲームのサービスクラス */
	private String serviceClass;

	/** ゲームの説明 */
	private String description;


	/**
	 * ゲームの名前を指定します。を取得
	 *
	 * @return ゲームの名前を指定します。
	 */
	public String getGameName() {
		return gameName;
	}

	/**
	 * ゲームの名前を指定します。を設定
	 *
	 * @param gameName ゲームの名前を指定します。
	 */
	public void setGameName(String gameName) {
		this.gameName = gameName;
	}

	/**
	 * ゲームの名前を指定します。を設定
	 *
	 * @param gameName ゲームの名前を指定します。
	 * @return this
	 */
	public UpdateGameRequest withGameName(String gameName) {
		setGameName(gameName);
		return this;
	}

	/**
	 * 引き継ぎ時にアカウントのパスワードを変更するかを取得
	 *
	 * @return 引き継ぎ時にアカウントのパスワードを変更するか
	 */
	public Boolean getChangePasswordIfTakeOver() {
		return changePasswordIfTakeOver;
	}

	/**
	 * 引き継ぎ時にアカウントのパスワードを変更するかを設定
	 *
	 * @param changePasswordIfTakeOver 引き継ぎ時にアカウントのパスワードを変更するか
	 */
	public void setChangePasswordIfTakeOver(Boolean changePasswordIfTakeOver) {
		this.changePasswordIfTakeOver = changePasswordIfTakeOver;
	}

	/**
	 * 引き継ぎ時にアカウントのパスワードを変更するかを設定
	 *
	 * @param changePasswordIfTakeOver 引き継ぎ時にアカウントのパスワードを変更するか
	 * @return this
	 */
	public UpdateGameRequest withChangePasswordIfTakeOver(Boolean changePasswordIfTakeOver) {
		setChangePasswordIfTakeOver(changePasswordIfTakeOver);
		return this;
	}

	/**
	 * ゲームのサービスクラスを取得
	 *
	 * @return ゲームのサービスクラス
	 */
	public String getServiceClass() {
		return serviceClass;
	}

	/**
	 * ゲームのサービスクラスを設定
	 *
	 * @param serviceClass ゲームのサービスクラス
	 */
	public void setServiceClass(String serviceClass) {
		this.serviceClass = serviceClass;
	}

	/**
	 * ゲームのサービスクラスを設定
	 *
	 * @param serviceClass ゲームのサービスクラス
	 * @return this
	 */
	public UpdateGameRequest withServiceClass(String serviceClass) {
		setServiceClass(serviceClass);
		return this;
	}

	/**
	 * ゲームの説明を取得
	 *
	 * @return ゲームの説明
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * ゲームの説明を設定
	 *
	 * @param description ゲームの説明
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * ゲームの説明を設定
	 *
	 * @param description ゲームの説明
	 * @return this
	 */
	public UpdateGameRequest withDescription(String description) {
		setDescription(description);
		return this;
	}

}