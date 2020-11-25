package filter;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import logic.UserLogic;

public class LoginFilter implements Filter {

	@Inject
	private UserLogic lUser;

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		// TODO 自動生成されたメソッド・スタブ

		if (!lUser.loginStatus()) {
			// ログインしていない場合はトップページにリダイレクト
			HttpServletRequest req = (HttpServletRequest) request;
			HttpServletResponse res = (HttpServletResponse) response;
			res.sendRedirect(req.getContextPath() + "/faces/00.xhtml");
		} else {
			// ログインしている場合は次のフィルタへ
			chain.doFilter(request, response);
		}
	}

}
