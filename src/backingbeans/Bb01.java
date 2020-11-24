package backingbeans;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import logic.UserLogic;

@Named
@RequestScoped
public class Bb01 {

	@Inject
	private UserLogic lUser;

	/**
	 * ログアウトボタン押下後の処理。
	 */
	public String logoutButton() {
		lUser.logout();
		return "00.xhtml";
	}
}
