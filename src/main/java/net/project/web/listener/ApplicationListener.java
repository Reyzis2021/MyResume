package net.project.web.listener;

import net.project.web.filter.ApplicationFilter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class ApplicationListener implements ServletContextListener {
    public static final Logger LOGGER = LoggerFactory.getLogger(ApplicationFilter.class);
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        LOGGER.info("Application started");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        LOGGER.info("Application destroyed");
    }
}
