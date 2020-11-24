package holder;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;

import entity.User;

@SessionScoped
public class LoginUser implements Serializable {

	private User user;

	/**
	 * @return user
	 */
	public User getUser() {
		return user;
	}

	/**
	 * @param user セットする user
	 */
	public void setUser(User user) {
		this.user = user;
	}
}
