package toyproject.todolist.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;

import java.io.IOException;

@Slf4j
@WebServlet(name = "todoRegisterController", urlPatterns = "/todo/register")
public class TodoReigsterController extends HttpServlet {
    String LINK = "/WEB-INF/todo/register.jsp";

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        log.info("입력페이지 (get)");

        RequestDispatcher dispatcher = request.getRequestDispatcher(LINK);
        dispatcher.forward(request, response);


    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        log.info("입력페이지 (post)");

        // 브라우저가 호출해야하는 주소 < RPG패턴 >
        response.sendRedirect("/todo/list");
    }
}
