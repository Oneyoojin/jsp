import java.io.ByteArrayInputStream;
import java.io.CharArrayReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/student")
public class StudnetServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html; charset=utf-8");
		PrintWriter pw = resp.getWriter();
		pw.println("<body>");
		pw.println("<h1>안녕 세상</h1>");
		pw.println("<body>");
		
		for(int i = 2; i < 9; i++) {
			
		}

		ByteArrayInputStream bais = new ByteArrayInputStream(new byte[] { 10, 20, 30 });
		CharArrayReader car = new CharArrayReader(new char[] { '가', '나' });
		StringReader sr = new StringReader("가나다라");

		System.out.println((char) sr.read());
		System.out.println((char) sr.read());
		System.out.println((char) sr.read());
		System.out.println((char) sr.read());
	}

}

//보조기억장치- 하드디스크, 렘.
//프로그램을 실행을 한다. <- 메모리 렘 주기억장치에 실행시에 확보한다.
//변수 선언 (프로그램 실행) -> 프로세스 실행시 반납.
//프로세스가 반납되어야 다음 프로그렘 실행된다. (순차적)
//응답 받을 때 시계, 응답할때 반시계반향.
//