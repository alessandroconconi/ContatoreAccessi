package conconi;


import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Prova extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response)
    throws IOException, ServletException
    {
		Integer x;
		HttpSession session = request.getSession();
		PrintWriter out = response.getWriter();
		
		if(session.isNew()){

			session.putValue("contatore", 1);

			x =new Integer(1);

		}else{

			x =(Integer)session.getValue("contatore");

			session.putValue("contatore", new Integer(x.intValue()+1));
			
			
    }
	out.println("Access n: "+x);
	}
}