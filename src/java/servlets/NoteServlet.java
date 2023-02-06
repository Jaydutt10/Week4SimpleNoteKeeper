package servlets;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.File;
import java.io.PrintWriter;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import models.Note;


public class NoteServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String path = getServletContext().getRealPath("/WEB-INF/note.txt"); 
        BufferedReader br = new BufferedReader(new FileReader(new File(path)));
        
           String title = br.readLine();
           String contents = br.readLine();
        
        
           request.setAttribute("title",title);
           request.setAttribute("contents",contents);
        
    }
    

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
         String path = getServletContext().getRealPath("/WEB-INF/note.txt");
         PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(path, false)));
        
        String title = request.getParameter("titles");
        String contents = request.getParameter("content");

        if (title == null || title.equals("") || contents == null || contents.equals("")) {
            request.setAttribute("title", title);
            request.setAttribute("contents", contents);
            request.setAttribute("invalid", true);
            
            getServletContext().getRequestDispatcher("/WEB-INF/editnote.jsp")
                    .forward(request, response);
            return;
        }
        
        Note note = new Note(title, contents);
        request.setAttribute("note", note);

        getServletContext().getRequestDispatcher("/WEB-INF/note.txt")
                .forward(request, response);
    }
}