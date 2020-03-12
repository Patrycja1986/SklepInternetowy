package users;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

import static users.LoginServlet.USER_SESSION_KEY;

@WebServlet(name = "UpdateUserDetailsServlet", value = "/update")
public class UpdateUserDetailsServlet extends HttpServlet {
    UserService userService= new UserService();
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String name = req.getParameter("name");
        String surname = req.getParameter("surname");
        String email = req.getParameter("email");
        String login = req.getParameter("login");
        String password = req.getParameter("password");

        HttpSession session= req.getSession();
        User loggedInUser = (User) session.getAttribute(USER_SESSION_KEY);

        loggedInUser.setName(name);
        loggedInUser.setSurname(surname);
        loggedInUser.setEmail(email);
        loggedInUser.setLogin(login);

        RequestDispatcher requestDispatcher= req.getRequestDispatcher("/users/updateConfirmation.jsp");
        requestDispatcher.forward(req,resp);



    }
}
