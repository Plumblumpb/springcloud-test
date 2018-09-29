package com.plumblum.eurekazuulclient.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.http.HttpServletRequest;

import static org.springframework.cloud.netflix.zuul.filters.support.FilterConstants.PRE_TYPE;

/**
 * @Auther: cpb
 * @Date: 2018/9/29 13:54
 * @Description:
 */
public class MyFilter  extends ZuulFilter {


    private Logger logger = LoggerFactory.getLogger(MyFilter.class);


    @Override
    public String filterType() {
        return PRE_TYPE;
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        RequestContext requestContext = RequestContext.getCurrentContext();

        HttpServletRequest request = requestContext.getRequest();

        logger.info(String.format("%s >>> %s", request.getMethod(), request.getRequestURL().toString()));

        Object accessToken = request.getParameter("token");
        if(accessToken == null) {
            logger.warn("token is empty");
//            ctx.setSendZuulResponse(false);
//            ctx.setResponseStatusCode(401);
//            try {
//                ctx.getResponse().getWriter().write("token is empty");
//            }catch (Exception e){}

            return null;
        }
        logger.info("ok");
        return null;
    }
}
