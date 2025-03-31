package scu.wcc.mydynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyUtil {

    /*
     *
     *用于创建代理
     *
     */

    public static Star createProxy(BigStar bigStar){

        //调用Proxy.newProxyInstance(ClassLoader, Class<?>[] interfaces, InvocationHandler)来创建代理
        /*
         *参数1：用哪个类的加载器去加载生成的代理。
         * 参数2：指定接口，这个接口指明代理需要完成什么事。
         * 参数3：指定代理要干的具体事件
         */
        Star star = (Star) Proxy.newProxyInstance(
                ProxyUtil.class.getClassLoader(),
                new Class[]{Star.class},
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        /*
                         *参数1：代理对象
                         * 参数2：代理要运行的方法
                         * 参数3：代理运行方法时要传递的参数
                         */
                        //代理做的前置工作
                        if("sing".equals(method.getName())){
                            System.out.println("准备话筒，收钱");
                        }else if("dance".equals(method.getName())){
                            System.out.println("准备场地，收钱");
                        }

                        //调用大明星中对应的方法
                        return method.invoke(bigStar,args);

                    }
                }
        );

        return star;
    }

}
