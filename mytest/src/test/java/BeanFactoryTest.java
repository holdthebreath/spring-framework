import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import static org.junit.jupiter.api.Assertions.assertEquals;


/**
 * @ClassName BeanFactoryTest
 * @Description
 * @Author hwd
 * @Date 2021/2/13 10:01 PM
 * @Version 1.0
 */
@SuppressWarnings("deprecation")
public class BeanFactoryTest {
	@Test
	public void testSimpleLoad(){
		BeanFactory bf = new XmlBeanFactory(new ClassPathResource("beanFactoryTest.xml"));
		MyTestBean bean = (MyTestBean) bf.getBean("myTestBean");
		assertEquals("Hello", bean.getTestStr());
	}
}
