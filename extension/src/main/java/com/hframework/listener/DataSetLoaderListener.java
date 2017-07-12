package com.hframework.listener;

import com.hframework.base.service.DataSetLoaderService;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * ����hframe��Ŀ���������ɶ�Ӧ��dataset�ļ�
 * �ļ�·��Ϊ��D\://my_workspace/hframe-trunk/hframe-web/src/main/resources/program/hframe/data/set/*.xml
 * ����ʱ����ʧЧ�÷���
 * Created by zhangquanhong on 2016/6/13.
 */
public class DataSetLoaderListener  implements ServletContextListener {

    public DataSetLoaderListener() {
    }

    public void contextInitialized(ServletContextEvent event) {
        WebApplicationContext webappcontext = WebApplicationContextUtils
                .getRequiredWebApplicationContext(event.getServletContext());
        DataSetLoaderService dataSetLoaderService = (DataSetLoaderService) webappcontext.getBean("dataSetLoaderService");
//        dataSetLoaderService.load(event.getServletContext());
    }



    public void contextDestroyed(ServletContextEvent event) {
    }
}
