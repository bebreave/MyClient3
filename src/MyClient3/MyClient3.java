//测试github
package MyClient3;
import javax.swing.*;
import java.io.*;
import java.net.*;
public class MyClient3 extends JFrame{

	/**
	 * @param args
	 */
	JTextArea jta=null;
	JTextField jtf=null;
	JButton jb=null;
	JPanel jp1=null;
	JScrollPane jsp=null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyClient3 ms3=new MyClient3();
	}
	//构造函数
	public MyClient3()
	{
		//创建组件
		jtf=new JTextField(20);
		jta=new JTextArea();
		jb=new JButton("发送");
		jsp=new JScrollPane(jta);
		jp1=new JPanel();//默认流布局
		//添加组件
		jp1.add(jtf);
		jp1.add(jb);
		this.add(jsp,"Center");
		this.add(jp1,"South");
		//设置窗口
		this.setSize(400,300);
		this.setLocation(200,200);
		this.setVisible(true);
		this.setTitle("客户端对话窗口");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
