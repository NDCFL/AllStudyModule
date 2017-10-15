package arg.com.common;

import javax.servlet.http.HttpServletRequest;

/**
 * Web工具类
 * 创建于2017-08-16
 *
 * @author 陈飞龙
 * @version 1.0
 */
public class WebUtils {

    /**
     * 获取网站根路径
     * @param request HttpServletRequest对象
     * @return 网站根路径
     */
    public static String getRootPath(HttpServletRequest request) {
        return request.getServletContext().getRealPath("/");
    }

    /**
     * 获取HTTP请求URL的最后/部分的内容
     * @param request HttpServletRequest对象
     * @return 请求URL中最后/部分的内容
     */
    public static String getReqMethod(HttpServletRequest request) {
        String uri = request.getRequestURI();
        return uri.substring(uri.lastIndexOf("/") + 1);
    }

}
