package judge.tool;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

// 生成验证码
public class ValiImage extends HttpServlet {
    public static String codeText = null;
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        VerifyCode vc = new VerifyCode();
        vc.drawImage(resp.getOutputStream());
        resp.setHeader("Pragma","no-cache");
        resp.setHeader("Cache-Control","no-cache");
        codeText = vc.getCode();
    }
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req,resp);
    }
}
