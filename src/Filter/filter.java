package Filter;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter("/*")
public class filter implements javax.servlet.Filter {
	private String encoding ="UTF-8";
	public filter() {
		// TODO 自動生成されたコンストラクター・スタブ
	}

	@Override
	public void destroy() {
		// TODO 自動生成されたメソッド・スタブ

	}

	@Override
	public void doFilter(ServletRequest arg0, ServletResponse arg1, FilterChain arg2)
			throws IOException, ServletException {
		// TODO 自動生成されたメソッド・スタブ
		arg0.setCharacterEncoding(encoding);
		arg1.setContentType("text/html;charset="+encoding);
		arg2.doFilter(arg0, arg1);

	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO 自動生成されたメソッド・スタブ
	}
}