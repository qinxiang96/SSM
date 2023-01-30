import com.flora.spring.proxy.Calculator;
import com.flora.spring.proxy.CalculatorImpl;
import com.flora.spring.proxy.CalculatorStaticProxy;
import com.flora.spring.proxy.ProxyFactory;
import org.junit.Test;

/**
 * @Author qinxiang
 * @Date 2022/8/4-下午8:02
 */
public class ProxyTest {
    @Test
    public void testProxy() {
//        CalculatorStaticProxy proxy = new CalculatorStaticProxy(new CalculatorImpl());
//        int add = proxy.add(1, 5);
//        System.out.println(add);
        ProxyFactory proxyFactory = new ProxyFactory(new CalculatorImpl());
        Calculator proxy = (Calculator) proxyFactory.getProxy();
        proxy.add(1, 4);

    }
}
