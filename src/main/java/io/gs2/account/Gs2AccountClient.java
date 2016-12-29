package io.gs2.account;

import java.util.ArrayList;
import java.util.List;

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
import io.gs2.account.control.AuthenticationRequest;
import io.gs2.account.control.AuthenticationResult;
import io.gs2.account.control.CreateAccountRequest;
import io.gs2.account.control.CreateAccountResult;
import io.gs2.account.control.CreateGameRequest;
import io.gs2.account.control.CreateGameResult;
import io.gs2.account.control.DeleteAccountRequest;
import io.gs2.account.control.DeleteGameRequest;
import io.gs2.account.control.DescribeAccountRequest;
import io.gs2.account.control.DescribeAccountResult;
import io.gs2.account.control.DescribeGameRequest;
import io.gs2.account.control.DescribeGameResult;
import io.gs2.account.control.DescribeServiceClassRequest;
import io.gs2.account.control.DescribeServiceClassResult;
import io.gs2.account.control.GetGameRequest;
import io.gs2.account.control.GetGameResult;
import io.gs2.account.control.GetGameStatusRequest;
import io.gs2.account.control.GetGameStatusResult;
import io.gs2.account.control.UpdateGameRequest;
import io.gs2.account.control.UpdateGameResult;
import io.gs2.model.IGs2Credential;

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
	 * ゲームを作成。<br>
	 * <br>
	 * GS2-Account を利用するにはまずゲームを作成します。<br>
	 * ゲームを作成後、ゲームにアカウントを作成することが出来ます。<br>
	 * 
	 * @param request リクエストパラメータ
	 * @return 作成結果
	 */
	public CreateGameResult createGame(CreateGameRequest request) {
		ObjectNode body = JsonNodeFactory.instance.objectNode()
				.put("name", request.getName())
				.put("description", request.getDescription())
				.put("serviceClass", request.getServiceClass());
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
	 * ゲーム一覧を取得。
	 * 
	 * @param request リクエストパラメータ
	 * @return ゲーム一覧
	 */
	public DescribeGameResult describeGame(DescribeGameRequest request) {
		String url = Gs2Constant.ENDPOINT_HOST + "/game";
		List<NameValuePair> queryString = new ArrayList<>();
		if(request.getLimit() != null) queryString.add(new BasicNameValuePair("limit", String.valueOf(request.getLimit())));
		if(request.getPageToken() != null) queryString.add(new BasicNameValuePair("pageToken", request.getPageToken()));
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
	 * サービスクラス一覧を取得。
	 * 
	 * @param request リクエストパラメータ
	 * @return サービスクラス一覧
	 */
	public DescribeServiceClassResult describeServiceClass(DescribeServiceClassRequest request) {
		HttpGet get = createHttpGet(
				Gs2Constant.ENDPOINT_HOST + "/game/serviceClass", 
				credential, 
				ENDPOINT,
				DescribeServiceClassRequest.Constant.MODULE, 
				DescribeServiceClassRequest.Constant.FUNCTION);
		return doRequest(get, DescribeServiceClassResult.class);
	}

	/**
	 * ゲームを取得。
	 * 
	 * @param request リクエストパラメータ
	 * @return ゲーム
	 */
	public GetGameResult getGame(GetGameRequest request) {
		HttpGet get = createHttpGet(
				Gs2Constant.ENDPOINT_HOST + "/game/" + request.getGameName(), 
				credential, 
				ENDPOINT,
				GetGameRequest.Constant.MODULE, 
				GetGameRequest.Constant.FUNCTION);
		return doRequest(get, GetGameResult.class);
	}

	/**
	 * ゲームの状態を取得。
	 * 
	 * @param request リクエストパラメータ
	 * @return ゲームの状態
	 */
	public GetGameStatusResult getGameStatus(GetGameStatusRequest request) {
		HttpGet get = createHttpGet(
				Gs2Constant.ENDPOINT_HOST + "/game/" + request.getGameName() + "/status", 
				credential, 
				ENDPOINT,
				GetGameStatusRequest.Constant.MODULE, 
				GetGameStatusRequest.Constant.FUNCTION);
		return doRequest(get, GetGameStatusResult.class);
	}

	/**
	 * ゲームを更新。
	 * 
	 * @param request リクエストパラメータ
	 * @return 更新結果
	 */
	public UpdateGameResult updateGame(UpdateGameRequest request) {
		ObjectNode body = JsonNodeFactory.instance.objectNode()
				.put("description", request.getDescription())
				.put("serviceClass", request.getServiceClass());
		HttpPut put = createHttpPut(
				Gs2Constant.ENDPOINT_HOST + "/game/" + request.getGameName(), 
				credential, 
				ENDPOINT,
				UpdateGameRequest.Constant.MODULE, 
				UpdateGameRequest.Constant.FUNCTION,
				body.toString());
		return doRequest(put, UpdateGameResult.class);
	}

	/**
	 * ゲームを削除。
	 * 
	 * @param request リクエストパラメータ
	 */
	public void deleteGame(DeleteGameRequest request) {
		HttpDelete delete = createHttpDelete(
				Gs2Constant.ENDPOINT_HOST + "/game/" + request.getGameName(), 
				credential, 
				ENDPOINT,
				DeleteGameRequest.Constant.MODULE, 
				DeleteGameRequest.Constant.FUNCTION);
		doRequest(delete, null);
	}

	/**
	 * ユーザアカウントを作成。<br>
	 * <br>
	 * 戻り値に認証に利用するパスワードが返ります。<br>
	 * ユーザのパスワードはこのタイミング以外に再取得する手段は提供されませんのでご注意ください。<br>
	 * 
	 * @param request リクエストパラメータ
	 * @return 作成結果
	 */
	public CreateAccountResult createAccount(CreateAccountRequest request) {
		HttpPost post = createHttpPost(
				Gs2Constant.ENDPOINT_HOST + "/game/" + request.getGameName() + "/account", 
				credential, 
				ENDPOINT,
				CreateAccountRequest.Constant.MODULE, 
				CreateAccountRequest.Constant.FUNCTION,
				"");
		return doRequest(post, CreateAccountResult.class);
	}

	/**
	 * アカウント一覧を取得。
	 * 
	 * @param request リクエストパラメータ
	 * @return アカウント一覧
	 */
	public DescribeAccountResult describeAccount(DescribeAccountRequest request) {
		String url = Gs2Constant.ENDPOINT_HOST + "/game/" + request.getGameName() + "/account";
		List<NameValuePair> queryString = new ArrayList<>();
		if(request.getLimit() != null) queryString.add(new BasicNameValuePair("limit", String.valueOf(request.getLimit())));
		if(request.getPageToken() != null) queryString.add(new BasicNameValuePair("pageToken", request.getPageToken()));
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
	 * アカウントを削除。
	 * 
	 * @param request リクエストパラメータ
	 */
	public void deleteAccount(DeleteAccountRequest request) {
		HttpDelete delete = createHttpDelete(
				Gs2Constant.ENDPOINT_HOST + "/game/" + request.getGameName() + "/account/" + request.getUserId(), 
				credential, 
				ENDPOINT,
				DeleteAccountRequest.Constant.MODULE, 
				DeleteAccountRequest.Constant.FUNCTION);
		doRequest(delete, null);
	}

	/**
	 * 認証を実行。<br>
	 * <br>
	 * GS2-Account の認証処理を行います。<br>
	 * 認証した結果として、戻り値に JSON 形式で<br>
	 * ownerId: {GS2アカウントID}
	 * gameName: {ゲーム名}
	 * userId: {ユーザID}
	 * timestamp: {認証時刻(unixepoch)}<br>
	 * というデータの GS2-Key の暗号鍵で暗号化された文字列が返されます。<br>
	 * <br>
	 * この認証結果を GS2-Auth に渡すことで、アクセストークンを得ることが出来ますし、<br>
	 * GS2-Account の認証結果を独自のサーバで利用したい場合などにも利用できます。<br>
	 * 
	 * @param request リクエストパラメータ
	 * @return 認証結果
	 */
	public AuthenticationResult authentication(AuthenticationRequest request) {
		ObjectNode body = JsonNodeFactory.instance.objectNode()
				.put("keyName", request.getKeyName())
				.put("password", request.getPassword());
		HttpPost post = createHttpPost(
				Gs2Constant.ENDPOINT_HOST + "/game/" + request.getGameName() + "/account/" + request.getUserId(), 
				credential, 
				ENDPOINT,
				AuthenticationRequest.Constant.MODULE, 
				AuthenticationRequest.Constant.FUNCTION,
				body.toString());
		return doRequest(post, AuthenticationResult.class);
	}
	
}
