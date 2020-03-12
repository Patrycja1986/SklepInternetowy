package users;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet(name = "AddUserServlet", value = "/addUser")
public class AddUserServlet extends HttpServlet {

    UserService userService= new UserService();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String surname = req.getParameter("surname");
        String email = req.getParameter("email");
        String login = req.getParameter("login");
        String password = req.getParameter("password");

        User user= new User(name,surname,email,login,password);

        if(userService.addUser(user)){
            req.setAttribute("users",user);
            RequestDispatcher requestDispatcher= req.getRequestDispatcher("/index.jsp");
            requestDispatcher.forward(req,resp);

        }else{
            resp.getOutputStream().println("Registration failed!");
        }

    }
}
