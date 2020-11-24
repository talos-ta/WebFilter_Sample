package backingbeans;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import entity.User;
import logic.UserLogic;

@Named
@RequestScoped
public class Bb00 {

	private String userId;
	private String password;

	@Inject
	private UserLogic lUser;

	/**
	 * ログインボタン押下時の処理。
	 * @return
	 */
	public String loginButton() {
		if (lUser.login(new User(userId, password))) {
			return "01.xhtml";
		}
		return null;
	}

	/**
	 * @return userId
	 */
	public String getUserId() {
		return userId;
	}

	/**
	 * @param userId セットする userId
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}

	/**
	 * @return password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password セットする password
	 */
	public void setPassword(String password) {
		this.password = password;
	}

}
