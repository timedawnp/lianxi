package lianxi;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class UpLoad {

	public static void main(String[] args) throws IOException, Exception {

		Socket socket = new Socket("127.0.0.1",8888);

		//PrintWriter bw = new PrintWriter(socket.getOutputStream(),true);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));//获取输入流
		String path = br.readLine();//将客户端传过来的数据保存到path中
		File file = new File(path);

		
		

		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file));//将file中指定的文件的内容读取出来，保存在bis流中

		BufferedOutputStream pw = new BufferedOutputStream(socket.getOutputStream());//根据socket获取一个输出流

		byte[] by = new byte[1024];
		int len = 0;
		while((len = bis.read(by))!=-1){//将bis流中的内容读取出来
			pw.write(by,0,len);//将读取出来的内容输出到客户端
			
		}

		pw.close();
		bis.close();
		//bw.close();
		br.close();
		socket.close();

	}
}
