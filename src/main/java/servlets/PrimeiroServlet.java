package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entidade.Pessoa;

@WebServlet(urlPatterns = "/testeServlet")
public class PrimeiroServlet extends HttpServlet{
	
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String nome = req.getParameter("nomeP");
		String especialidade = req.getParameter("especialidadeP");
		Pessoa pessoa = new Pessoa();
		
		pessoa.setNome(nome);
		pessoa.setEspecialidade(especialidade);
		System.out.println(pessoa.getNome());
		System.out.println(pessoa.getEspecialidade());
		

		PrintWriter saida = resp.getWriter();
		saida.write("<html lang=\"pt\">");
		saida.write("<head>");
		saida.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\" />");
		saida.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />");
		saida.write("    <link rel=\"preconnect\" href=\"https://fonts.googleapis.com\" />");
		saida.write("    <link rel=\"preconnect\" href=\"https://fonts.gstatic.com\" crossorigin />");
		saida.write("    <link href=\"https://fonts.googleapis.com/css2?family=Roboto:ital,wght@0,300;0,400;0,500;0,700;1,300;1,400;1,700&display=swap\" rel=\"stylesheet\"/>");
		saida.write("    <link rel=\"stylesheet\" href=\"style.css\" />");
		saida.write("  <title>Cadastro</title>");
		saida.write("</head>");
		saida.write("<body>");
		saida.write("  <section class=\"container\">");
		saida.write("    <aside>");
		saida.write("      <img class=\"imagem\" src=\"levir.jpg\" alt=\"minhaimagem\" />");
		saida.write("        <h1>Levir Cesar Ribeiro Lemos</h1>");
		saida.write("    </aside>");
		saida.write("    <section>");
		saida.write("<p style=\"font-weight: bold;font-style: italic;font-size:24px;\" >Bem vindo Dr. "+nome + " !</p></br>");
		saida.write("<p style=\"font-weight: bold;font-style: italic;font-size:24px;\" >Sua especialidade é "+especialidade + ".</p></br>");

		saida.write("<a href=\"index.html\">Voltar ao inicio</a>");
		saida.write("    </section>");
		saida.write("  </section>");
		saida.write("</body>");
		saida.write("</html>");
	}
}
