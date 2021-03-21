package Listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * 在服务器启动时创建map
 */
public class AListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        Map<String,Integer> map=new LinkedHashMap<String,Integer>();
        ServletContext application=servletContextEvent.getServletContext();
        application.setAttribute("Map",map);
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {

    }
}
