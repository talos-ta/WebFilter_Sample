package util;

import java.util.ArrayList;

import javax.enterprise.context.RequestScoped;

import entity.User;
import master.UserMaster;

@RequestScoped
public class UserUtil {

	/**
	 * ログイン可能かチェックを行う。
	 * @param user
	 * @return
	 */
	public boolean loginCheck(User user) {
		ArrayList<User> userList = UserMaster.getUserList();
		for (User tmpUser : userList) {
			if (user.getUserId().equals(tmpUser.getUserId())
					&& user.getPassword().equals(tmpUser.getPassword())) {
				return true;
			}
		}
		return false;
	}

}
