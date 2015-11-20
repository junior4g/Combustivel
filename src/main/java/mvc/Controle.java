package mvc;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(value = "/comb")
public class Controle extends HttpServlet {

  protected void service(
      HttpServletRequest req,
      HttpServletResponse resp)
      throws ServletException, IOException {

    String paramAlcool = req.getParameter("alcool");
    Double alcool = paramAlcool == null ? 0.0 : Double.parseDouble(paramAlcool);
    
    String paramGasolina = req.getParameter("gasolina");
    Double gasolina = paramGasolina == null ? 0.0 : Double.parseDouble(paramGasolina);
    
    //Chamar o JSP apenas para mostrar o resultado.
    req.getRequestDispatcher("mvc/comb.jsp").forward(req, resp);
  }

}
