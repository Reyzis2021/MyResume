package net.project.web.filter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.net.HttpRetryException;

@WebFilter("/*")
public class ApplicationFilter implements Filter {

    public static final Logger LOGGER = LoggerFactory.getLogger(ApplicationFilter.class);

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) request;
        LOGGER.debug("Before url processing: " + req.getRequestURI());
        chain.doFilter(req, response);
        LOGGER.debug("After url processing: " + req.getRequestURI());
    }

    @Override
    public void destroy() {

    }
}
