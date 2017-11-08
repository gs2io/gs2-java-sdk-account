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

package io.gs2.account;

import java.util.ArrayList;
import java.util.List;

import io.gs2.util.EncodingUtil;
import org.apache.http.NameValuePair;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.client.utils.URLEncodedUtils;
import org.apache.http.message.BasicNameValuePair;

import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;

import io.gs2.AbstractGs2Client;
import io.gs2.Gs2Constant;
import io.gs2.model.IGs2Credential;
import io.gs2.account.control.*;

/**
 * GS2 Account API クライアント
 *
 * @author Game Server Services, Inc.
 *
 */
public class Gs2AccountClient extends AbstractGs2Client<Gs2AccountClient> {

	public static String ENDPOINT = "account";

	/**
	 * コンストラクタ。
	 *
	 * @param credential 認証情報
	 */
	public Gs2AccountClient(IGs2Credential credential) {
		super(credential);
	}


	/**
	 * 認証処理を行います<br>
	 * <br>
	 * - 消費クオータ: 3<br>
	 * <br>
	 *
	 * @param request リクエストパラメータ
	 * @return 結果
	 */

	public AuthenticationResult authentication(AuthenticationRequest request) {

		ObjectNode body = JsonNodeFactory.instance.objectNode()
				.put("password", request.getPassword())
				.put("keyName", request.getKeyName());

		HttpPost post = createHttpPost(
				Gs2Constant.ENDPOINT_HOST + "/game/" + (request.getGameName() == null ? "null" : request.getGameName()) + "/account/" + (request.getUserId() == null ? "null" : request.getUserId()) + "",
				credential,
				ENDPOINT,
				AuthenticationRequest.Constant.MODULE,
				AuthenticationRequest.Constant.FUNCTION,
				body.toString());


		return doRequest(post, AuthenticationResult.class);

	}


	/**
	 * アカウントを登録します<br>
	 * <br>
	 * - 消費クオータ: 10<br>
	 * <br>
	 *
	 * @param request リクエストパラメータ
	 * @return 結果
	 */

	public CreateAccountResult createAccount(CreateAccountRequest request) {

		ObjectNode body = JsonNodeFactory.instance.objectNode();

		HttpPost post = createHttpPost(
				Gs2Constant.ENDPOINT_HOST + "/game/" + (request.getGameName() == null ? "null" : request.getGameName()) + "/account",
				credential,
				ENDPOINT,
				CreateAccountRequest.Constant.MODULE,
				CreateAccountRequest.Constant.FUNCTION,
				body.toString());


		return doRequest(post, CreateAccountResult.class);

	}


	/**
	 * ゲームを新規作成します<br>
	 * <br>
	 *
	 * @param request リクエストパラメータ
	 * @return 結果
	 */

	public CreateGameResult createGame(CreateGameRequest request) {

		ObjectNode body = JsonNodeFactory.instance.objectNode()
				.put("changePasswordIfTakeOver", request.getChangePasswordIfTakeOver())
				.put("serviceClass", request.getServiceClass())
				.put("name", request.getName());

        if(request.getDescription() != null) body.put("description", request.getDescription());
		HttpPost post = createHttpPost(
				Gs2Constant.ENDPOINT_HOST + "/game",
				credential,
				ENDPOINT,
				CreateGameRequest.Constant.MODULE,
				CreateGameRequest.Constant.FUNCTION,
				body.toString());


		return doRequest(post, CreateGameResult.class);

	}


	/**
	 * 引き継ぎ情報を登録します<br>
	 * <br>
	 * - 消費クオータ: 10<br>
	 * <br>
	 *
	 * @param request リクエストパラメータ
	 * @return 結果
	 */

	public CreateTakeOverResult createTakeOver(CreateTakeOverRequest request) {

		ObjectNode body = JsonNodeFactory.instance.objectNode()
				.put("password", request.getPassword())
				.put("type", request.getType())
				.put("userIdentifier", request.getUserIdentifier());

		HttpPost post = createHttpPost(
				Gs2Constant.ENDPOINT_HOST + "/game/" + (request.getGameName() == null ? "null" : request.getGameName()) + "/takeover",
				credential,
				ENDPOINT,
				CreateTakeOverRequest.Constant.MODULE,
				CreateTakeOverRequest.Constant.FUNCTION,
				body.toString());

        post.setHeader("X-GS2-ACCESS-TOKEN", request.getAccessToken());

		return doRequest(post, CreateTakeOverResult.class);

	}


	/**
	 * アカウントを削除します<br>
	 * <br>
	 * - 消費クオータ: 10<br>
	 * <br>
	 *
	 * @param request リクエストパラメータ
	 */

	public void deleteAccount(DeleteAccountRequest request) {

	    String url = Gs2Constant.ENDPOINT_HOST + "/game/" + (request.getGameName() == null ? "null" : request.getGameName()) + "/account/" + (request.getUserId() == null ? "null" : request.getUserId()) + "";



		HttpDelete delete = createHttpDelete(
				url,
				credential,
				ENDPOINT,
				DeleteAccountRequest.Constant.MODULE,
				DeleteAccountRequest.Constant.FUNCTION);


		doRequest(delete, null);

	}


	/**
	 * ゲームを削除します<br>
	 * <br>
	 *
	 * @param request リクエストパラメータ
	 */

	public void deleteGame(DeleteGameRequest request) {

	    String url = Gs2Constant.ENDPOINT_HOST + "/game/" + (request.getGameName() == null ? "null" : request.getGameName()) + "";



		HttpDelete delete = createHttpDelete(
				url,
				credential,
				ENDPOINT,
				DeleteGameRequest.Constant.MODULE,
				DeleteGameRequest.Constant.FUNCTION);


		doRequest(delete, null);

	}


	/**
	 * 引き継ぎ情報を削除します<br>
	 * <br>
	 * - 消費クオータ: 10<br>
	 * <br>
	 *
	 * @param request リクエストパラメータ
	 */

	public void deleteTakeOver(DeleteTakeOverRequest request) {

	    String url = Gs2Constant.ENDPOINT_HOST + "/game/" + (request.getGameName() == null ? "null" : request.getGameName()) + "/takeover/" + (request.getType() == null ? "null" : request.getType()) + "/" + (request.getUserIdentifier() == null ? "null" : request.getUserIdentifier()) + "";



		HttpDelete delete = createHttpDelete(
				url,
				credential,
				ENDPOINT,
				DeleteTakeOverRequest.Constant.MODULE,
				DeleteTakeOverRequest.Constant.FUNCTION);

        delete.setHeader("X-GS2-ACCESS-TOKEN", request.getAccessToken());

		doRequest(delete, null);

	}


	/**
	 * アカウントを取得します<br>
	 * <br>
	 * - 消費クオータ: 50件あたり5<br>
	 * <br>
	 *
	 * @param request リクエストパラメータ
	 * @return 結果
	 */

	public DescribeAccountResult describeAccount(DescribeAccountRequest request) {

	    String url = Gs2Constant.ENDPOINT_HOST + "/game/" + (request.getGameName() == null ? "null" : request.getGameName()) + "/account";

        List<NameValuePair> queryString = new ArrayList<>();
        if(request.getPageToken() != null) queryString.add(new BasicNameValuePair("pageToken", String.valueOf(request.getPageToken())));
        if(request.getLimit() != null) queryString.add(new BasicNameValuePair("limit", String.valueOf(request.getLimit())));


		if(queryString.size() > 0) {
			url += "?" + URLEncodedUtils.format(queryString, "UTF-8");
		}
		HttpGet get = createHttpGet(
				url,
				credential,
				ENDPOINT,
				DescribeAccountRequest.Constant.MODULE,
				DescribeAccountRequest.Constant.FUNCTION);


		return doRequest(get, DescribeAccountResult.class);

	}


	/**
	 * ゲームの一覧を取得します<br>
	 * <br>
	 *
	 * @param request リクエストパラメータ
	 * @return 結果
	 */

	public DescribeGameResult describeGame(DescribeGameRequest request) {

	    String url = Gs2Constant.ENDPOINT_HOST + "/game";

        List<NameValuePair> queryString = new ArrayList<>();
        if(request.getPageToken() != null) queryString.add(new BasicNameValuePair("pageToken", String.valueOf(request.getPageToken())));
        if(request.getLimit() != null) queryString.add(new BasicNameValuePair("limit", String.valueOf(request.getLimit())));


		if(queryString.size() > 0) {
			url += "?" + URLEncodedUtils.format(queryString, "UTF-8");
		}
		HttpGet get = createHttpGet(
				url,
				credential,
				ENDPOINT,
				DescribeGameRequest.Constant.MODULE,
				DescribeGameRequest.Constant.FUNCTION);


		return doRequest(get, DescribeGameResult.class);

	}


	/**
	 * サービスクラスの一覧を取得します<br>
	 * <br>
	 *
	 * @param request リクエストパラメータ
	 * @return 結果
	 */

	public DescribeServiceClassResult describeServiceClass(DescribeServiceClassRequest request) {

	    String url = Gs2Constant.ENDPOINT_HOST + "/game/serviceClass";



		HttpGet get = createHttpGet(
				url,
				credential,
				ENDPOINT,
				DescribeServiceClassRequest.Constant.MODULE,
				DescribeServiceClassRequest.Constant.FUNCTION);


		return doRequest(get, DescribeServiceClassResult.class);

	}


	/**
	 * 引き継ぎ情報を取得します<br>
	 * <br>
	 * - 消費クオータ: 50件あたり5<br>
	 * <br>
	 *
	 * @param request リクエストパラメータ
	 * @return 結果
	 */

	public DescribeTakeOverResult describeTakeOver(DescribeTakeOverRequest request) {

	    String url = Gs2Constant.ENDPOINT_HOST + "/game/" + (request.getGameName() == null ? "null" : request.getGameName()) + "/takeover";

        List<NameValuePair> queryString = new ArrayList<>();
        if(request.getPageToken() != null) queryString.add(new BasicNameValuePair("pageToken", String.valueOf(request.getPageToken())));
        if(request.getLimit() != null) queryString.add(new BasicNameValuePair("limit", String.valueOf(request.getLimit())));


		if(queryString.size() > 0) {
			url += "?" + URLEncodedUtils.format(queryString, "UTF-8");
		}
		HttpGet get = createHttpGet(
				url,
				credential,
				ENDPOINT,
				DescribeTakeOverRequest.Constant.MODULE,
				DescribeTakeOverRequest.Constant.FUNCTION);

        get.setHeader("X-GS2-ACCESS-TOKEN", request.getAccessToken());

		return doRequest(get, DescribeTakeOverResult.class);

	}


	/**
	 * 引き継ぎを実行します<br>
	 * <br>
	 * - 消費クオータ: 10<br>
	 * <br>
	 *
	 * @param request リクエストパラメータ
	 * @return 結果
	 */

	public DoTakeOverResult doTakeOver(DoTakeOverRequest request) {

		ObjectNode body = JsonNodeFactory.instance.objectNode()
				.put("password", request.getPassword())
				.put("userIdentifier", request.getUserIdentifier());

		HttpPost post = createHttpPost(
				Gs2Constant.ENDPOINT_HOST + "/game/" + (request.getGameName() == null ? "null" : request.getGameName()) + "/takeover/" + (request.getType() == null ? "null" : request.getType()) + "",
				credential,
				ENDPOINT,
				DoTakeOverRequest.Constant.MODULE,
				DoTakeOverRequest.Constant.FUNCTION,
				body.toString());


		return doRequest(post, DoTakeOverResult.class);

	}


	/**
	 * ゲームを取得します<br>
	 * <br>
	 *
	 * @param request リクエストパラメータ
	 * @return 結果
	 */

	public GetGameResult getGame(GetGameRequest request) {

	    String url = Gs2Constant.ENDPOINT_HOST + "/game/" + (request.getGameName() == null ? "null" : request.getGameName()) + "";



		HttpGet get = createHttpGet(
				url,
				credential,
				ENDPOINT,
				GetGameRequest.Constant.MODULE,
				GetGameRequest.Constant.FUNCTION);


		return doRequest(get, GetGameResult.class);

	}


	/**
	 * ゲームのステータスを取得します<br>
	 * <br>
	 *
	 * @param request リクエストパラメータ
	 * @return 結果
	 */

	public GetGameStatusResult getGameStatus(GetGameStatusRequest request) {

	    String url = Gs2Constant.ENDPOINT_HOST + "/game/" + (request.getGameName() == null ? "null" : request.getGameName()) + "/status";



		HttpGet get = createHttpGet(
				url,
				credential,
				ENDPOINT,
				GetGameStatusRequest.Constant.MODULE,
				GetGameStatusRequest.Constant.FUNCTION);


		return doRequest(get, GetGameStatusResult.class);

	}


	/**
	 * 引き継ぎ情報を取得します<br>
	 * <br>
	 * - 消費クオータ: 5<br>
	 * <br>
	 *
	 * @param request リクエストパラメータ
	 * @return 結果
	 */

	public GetTakeOverResult getTakeOver(GetTakeOverRequest request) {

	    String url = Gs2Constant.ENDPOINT_HOST + "/game/" + (request.getGameName() == null ? "null" : request.getGameName()) + "/takeover/" + (request.getType() == null ? "null" : request.getType()) + "/" + (request.getUserIdentifier() == null ? "null" : request.getUserIdentifier()) + "";



		HttpGet get = createHttpGet(
				url,
				credential,
				ENDPOINT,
				GetTakeOverRequest.Constant.MODULE,
				GetTakeOverRequest.Constant.FUNCTION);

        get.setHeader("X-GS2-ACCESS-TOKEN", request.getAccessToken());

		return doRequest(get, GetTakeOverResult.class);

	}


	/**
	 * ゲームを更新します<br>
	 * <br>
	 *
	 * @param request リクエストパラメータ
	 * @return 結果
	 */

	public UpdateGameResult updateGame(UpdateGameRequest request) {

		ObjectNode body = JsonNodeFactory.instance.objectNode()
				.put("changePasswordIfTakeOver", request.getChangePasswordIfTakeOver())
				.put("serviceClass", request.getServiceClass());

        if(request.getDescription() != null) body.put("description", request.getDescription());
		HttpPut put = createHttpPut(
				Gs2Constant.ENDPOINT_HOST + "/game/" + (request.getGameName() == null ? "null" : request.getGameName()) + "",
				credential,
				ENDPOINT,
				UpdateGameRequest.Constant.MODULE,
				UpdateGameRequest.Constant.FUNCTION,
				body.toString());


		return doRequest(put, UpdateGameResult.class);

	}


	/**
	 * 引き継ぎ情報を更新します<br>
	 * <br>
	 * - 消費クオータ: 10<br>
	 * <br>
	 *
	 * @param request リクエストパラメータ
	 * @return 結果
	 */

	public UpdateTakeOverResult updateTakeOver(UpdateTakeOverRequest request) {

		ObjectNode body = JsonNodeFactory.instance.objectNode()
				.put("password", request.getPassword())
				.put("oldPassword", request.getOldPassword());

		HttpPut put = createHttpPut(
				Gs2Constant.ENDPOINT_HOST + "/game/" + (request.getGameName() == null ? "null" : request.getGameName()) + "/takeover/" + (request.getType() == null ? "null" : request.getType()) + "/" + (request.getUserIdentifier() == null ? "null" : request.getUserIdentifier()) + "",
				credential,
				ENDPOINT,
				UpdateTakeOverRequest.Constant.MODULE,
				UpdateTakeOverRequest.Constant.FUNCTION,
				body.toString());

        put.setHeader("X-GS2-ACCESS-TOKEN", request.getAccessToken());

		return doRequest(put, UpdateTakeOverResult.class);

	}


}