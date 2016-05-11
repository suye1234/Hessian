/**
 * 
 */
package org.suye.hessian.client;

import com.caucho.hessian.client.HessianProxyFactory;

/**
 * @author ye.su
 * Email: suye@ehousechina.com
 * May 9, 2016
 *
 */
public class HessianClient {
	  interface Hello {
	        String hello(Object name);
	    }

	    interface SumSay {
	        String say(String msg);

	        int sum(int a, int b);

	        int hi(String hi);
	    }

	    public static void main(String[] args) throws Exception {
	        //TODO Actual URL
	        String url = "http://localhost:8283/hessiandemo/hello";
	        HessianProxyFactory factory = new HessianProxyFactory();
	        Hello basic = (Hello) factory.create(Hello.class, url);
	        System.out.println(basic.hello(123));

	        SumSay sumSay = (SumSay) factory.create(SumSay.class, url);
	        System.out.println(sumSay.say("Hello!"));

	        System.out.println("10+20=" + sumSay.sum(10, 20));
	    }
}
