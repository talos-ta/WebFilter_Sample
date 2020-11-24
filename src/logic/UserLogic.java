package logic;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

import entity.User;
import holder.LoginUser;
import util.UserUtil;

@RequestScoped
public class UserLogic {

	@Inject
	private UserUtil uUtil;

	@Inject
	private LoginUser loginUser;

	/**
	 * ログイン処理を行う。
	 * @param user
	 * @return
	 */
	public boolean login(User user) {
		if (uUtil.loginCheck(user)) {
			loginUser.setUser(user);
			return true;
		}
		return false;
	}

	/**
	 * ログアウト処理を行う。
	 */
	public void logout() {
		loginUser.setUser(null);
	}

	/**
	 * ログイン状態を取得する。
	 * @return
	 */
	public boolean loginStatus() {
		if (loginUser.getUser() != null) {
			return true;
		}
		return false;
	}
}
