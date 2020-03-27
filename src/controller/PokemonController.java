package controller;

import java.io.IOException;
import model.Bulbasaur;
import model.Charizard;
import model.Dragonite;
import model.Mew;
import model.Pikachu;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = { "/pokemon" })
public class PokemonController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public PokemonController() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher rd = this.getServletContext().getRequestDispatcher("/WEB-INF/views/pokemon.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String value1 = request.getParameter("card1"); 
		String value2 = request.getParameter("card2"); 
		String value3 = request.getParameter("card3"); 
		String value4 = request.getParameter("card4"); 
		String value5 = request.getParameter("card5"); 

		String msg = "";

		if (value1 != null) {
			
			// Create the object for Bulbasaur class and use getters to retrieve the values	
			Bulbasaur bb=new Bulbasaur("Bulbasaur",001);
			bb.getPokemonName();
			  
			msg = "<center>" + bb.getPokemonName() + "  #" + bb.getPokemonNumber();
			request.setAttribute("message1",msg);
			request.setAttribute("character1", bb.characteristics());
			request.setAttribute("type1",bb.type());
			request.setAttribute("evolution1", bb.evolution());
			request.setAttribute("baseExp1",bb.baseExp());
		}

		if (value2 != null) {
			// Create the object for Charizard class and use getters to retrieve the values	
			Charizard cz=new Charizard("Charizard",006);
				  
			msg = "<center>" + cz.getPokemonName() + "  #" + cz.getPokemonNumber();
			request.setAttribute("message2",msg);
			request.setAttribute("character2",cz.characteristics());
			request.setAttribute("type2",cz.type());
			request.setAttribute("evolution2", cz.evolution());
			request.setAttribute("baseExp2", cz.baseExp());
		}

		if (value3 != null) {

			// Create the object for Dragonite class and use getters to retrieve the values	

			Dragonite dt=new Dragonite("Dragonite",149);
			msg = "<center>" + dt.getPokemonName() + "  #" + dt.getPokemonNumber();
			request.setAttribute("message3",msg);
			request.setAttribute("character3", dt.characteristics());;
			request.setAttribute("type3",dt.type());
			request.setAttribute("evolution3", dt.evolution());
			request.setAttribute("baseExp3",dt.baseExp() );
		}
		if (value4 != null) {

			// Create the object for Mew class and use getters to retrieve the values	
			 Mew mw=new Mew("Mew",151);
			msg = "<center>" + mw.getPokemonName() + "  #" + mw.getPokemonNumber();
			request.setAttribute("message4",msg);
			request.setAttribute("character4", mw.characteristics());
			request.setAttribute("type4",mw.type());
			request.setAttribute("evolution4", mw.evolution());
			request.setAttribute("baseExp4", mw.baseExp());
		}

		if (value5 != null) {

			// Create the object for Pikachu class and use getters to retrieve the values	
/*getter*/
			Pikachu pk=new Pikachu("Pikachu",25);
			msg = "<center>" + pk.getPokemonName() + "  #" +pk.getPokemonNumber();
			request.setAttribute("message5",msg);
			request.setAttribute("character5", pk.characteristics());
			request.setAttribute("type5",pk.type());
			request.setAttribute("evolution5", pk.evolution());
			request.setAttribute("baseExp5", pk.baseExp());

		}

		RequestDispatcher rd = this.getServletContext().getRequestDispatcher("/WEB-INF/views/pokemon.jsp");
		rd.forward(request, response);

	}

}
