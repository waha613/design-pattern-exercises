package com.exercises.util;

import com.exercises.factory.GifImageFactory;
import com.exercises.product.GifImageLoader;
import com.sun.xml.internal.ws.api.ResourceLoader;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Properties;
import java.util.PropertyResourceBundle;

/**
 * @author ll4859332@hotmail.com
 * @version V1.0
 * @title
 * @description
 */
public class PropertiesUtil {
    public static Object getBean() {
        try {
            Properties properties = new Properties();

            InputStream inputStreamReader = (ClassLoader.getSystemResourceAsStream ("imageFactoryBean.properties"));
            if (inputStreamReader == null){
                return null;
            }
            properties.load(inputStreamReader);

            //通过类名生成实例对象并将其返回
            String className = properties.getProperty("imageFactoryBean");
            if(className == null){
                return null;
            }
            Class c=Class.forName(className);
            Object obj=c.newInstance();
            return obj;
        }
        catch(Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
