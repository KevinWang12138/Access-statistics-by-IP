package Filter;

import javax.servlet.*;
import java.io.IOException;
import java.util.Map;


/**
 * 从application中获取Map
 * 从request中获取IP
 * 进行统计工作
 */
public class AllFilter implements Filter {
    private FilterConfig config;
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        this.config=filterConfig;
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        /**
         * 从application中得到map
         * 从request中得到ip
         * 在map中查看ip是否已经存在，如果存在，次数++，如果不存在，添加进去
         */
        ServletContext app=config.getServletContext();
        Map<String,Integer> map=(Map<String, Integer>) app.getAttribute("Map");
        String IP=servletRequest.getRemoteAddr();
        if(map.containsKey(IP)){
            int cnt=map.get(IP);
            map.put(IP,cnt+1);
        }else{
            map.put(IP,1);
        }
        app.setAttribute("Map",map);
        filterChain.doFilter(servletRequest,servletResponse);
    }

    @Override
    public void destroy() {

    }
}
