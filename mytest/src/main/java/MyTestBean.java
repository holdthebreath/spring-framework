/**
 * @ClassName MyTestBean
 * @Description
 * @Author hwd
 * @Date 2021/2/13 9:58 PM
 * @Version 1.0
 */
public class MyTestBean {
	
	private int index;
	private String testStr;

	public MyTestBean(){}
	
	public MyTestBean(int index){
		this.index = index;
	}
	
	public MyTestBean(String testStr){
		this.testStr = testStr;
	}
	
	public MyTestBean(int index, String testStr){
		this.index = index;
		this.testStr = testStr;
	}

	public String getTestStr() {
		return testStr;
	}

	public void setTestStr(String testStr) {
		this.testStr = testStr;
	}
}
