package users;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Optional;

@WebServlet(name = "LoginServlet", value = "/login")
public class LoginServlet extends HttpServlet {

    UserService userService= new UserService();
    public static String USER_SESSION_KEY="user";

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String login = req.getParameter("login");
        String password = req.getParameter("password");

        Optional<User> userByLoginAndPassword = userService.getUserByLoginAndPassword(login, password);
        System.out.println(userByLoginAndPassword);
        if(userByLoginAndPassword.isPresent()){
            User user = userByLoginAndPassword.get();
            HttpSession session=req.getSession();
            session.setAttribute(USER_SESSION_KEY,user);
            RequestDispatcher requestDispatcher=req.getRequestDispatcher("/users/confirmationPage.jsp");
            requestDispatcher.forward(req,resp);

        }else{
            resp.getOutputStream().println("Login failed. Entered data didn't match to any account! Try again");

        }

    }
}
