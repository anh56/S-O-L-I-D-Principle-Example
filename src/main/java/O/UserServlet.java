package O;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


/* When a new Url is need to be called inside this servlet, we just need to add another constant from the UrlConstant
*  Without UrlConstant, we need to so something like:
*  @WebServlet(name = "UserServlet", urlPatterns = {"/user" ,  "/action"} )
* */
@WebServlet(name = "UserServlet", urlPatterns = {UrlConstant.URL_USER,
                                                    UrlConstant.URL_USER_ACTION} )
public class UserServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String currentPageServletPath = req.getServletPath();
        switch (currentPageServletPath){
            case UrlConstant.URL_USER:
                // do something
                break;
            case UrlConstant.URL_USER_ACTION:
                // do something else
                break;
            default: break;
/* If we did not use the constant, every time there is a change to the path, we will need to find all of the
*   servlet path and modify it, which is against the rule of Open - Close principle
* */
        }
    }
}
