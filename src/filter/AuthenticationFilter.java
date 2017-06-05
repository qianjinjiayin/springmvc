package filter;

import java.io.IOException;
import java.util.Enumeration;
import java.util.Map;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.filter.OncePerRequestFilter;
import org.springframework.web.util.UrlPathHelper;

public class AuthenticationFilter extends OncePerRequestFilter {
	private static final Logger LOGGER = LoggerFactory.getLogger(AuthenticationFilter.class);

	@Override
	protected void doFilterInternal(final HttpServletRequest httpRequest, final HttpServletResponse httpResponse,
			final FilterChain filterChain) throws ServletException, IOException {

		
		LOGGER.info("access AuthenticationFilter ...... ");

		UrlPathHelper urlPathHelper = new UrlPathHelper();
		final String servletPath = urlPathHelper.getServletPath(httpRequest);
		LOGGER.info("servletPath  ===>>>" + servletPath + "<<<");
		
		String path = httpRequest.getServletPath();
		LOGGER.info("path  ===>>>" + path + "<<<");

		final String appendURL = httpRequest.getScheme() + "://" + // "http" + "://
				httpRequest.getServerName() + // "myhost"
				":" + // ":"
				httpRequest.getServerPort() + // "8080"
				httpRequest.getServletContext().getContextPath();
		LOGGER.info("appendURL  ===>>>" + appendURL + "<<<");
		
		Enumeration<String> em = httpRequest.getParameterNames();
		while (em.hasMoreElements()) {
			String name = (String) em.nextElement();
			String value = httpRequest.getParameter(name);
			LOGGER.info(name + "===" + value);
		}

		if (StringUtils.containsIgnoreCase(path, "gotologin")) {
			httpResponse.sendRedirect(httpRequest.getContextPath() + "/login");
			return;
		}

		filterChain.doFilter(httpRequest, httpResponse);
	}

}