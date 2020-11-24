package master;

import java.io.Serializable;
import java.util.ArrayList;

import javax.enterprise.context.ApplicationScoped;

import entity.User;

@ApplicationScoped
public class UserMaster implements Serializable {

	/**
	 * 登録されたユーザーのリスト
	 */
	private static ArrayList<User> userList;

	static {
		userList = new ArrayList<User>();
		userList.add(new User("test", "test"));
	}

	/**
	 * @return userList
	 */
	public static ArrayList<User> getUserList() {
		return userList;
	}

	/**
	 * @param userList セットする userList
	 */
	public static void setUserList(ArrayList<User> userList) {
		UserMaster.userList = userList;
	}

}
