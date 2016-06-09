import org.serial.DSerialPort;


public class test{

	private static String PORT_NAME="COM2";
	public static void main(String[] args) {
			DSerialPort sp = new DSerialPort();
			
			//列出电脑上的所有端口
			sp.listPort();
			//选择端口
			sp.selectPort(PORT_NAME);
			//发送消息
			sp.write("123213123123");
			sp.write("123123123123213");
			//接受消息，设定最长等待时间120 * 1000 秒
			sp.startRead(120);
		}
}