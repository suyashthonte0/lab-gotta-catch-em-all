package controller;

import java.io.IOException;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Bulbasaur;
import model.Charizard;
import model.Dragonite;
import model.Mew;
import model.Pikachu;

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
		
		String pokemonName = "";
		int pokemonNumber = 0;
		String characteristics = "";
		String type = "";
		String evolution = "";
		int baseExp = 0;

		if (value1 != null) {
			
			// Create the object for Bulbasaur class and use getters to retrieve the values	
			Bulbasaur bulb = new Bulbasaur(pokemonName, pokemonNumber, characteristics, type, evolution, baseExp);  
			
			msg = "<center>" + bulb.getPokemonName() + "  #" + bulb.getPokemonNumber();
			request.setAttribute("message1", msg);
			request.setAttribute("character1", bulb.getCharacteristics());
			request.setAttribute("type1",bulb.getType());
			request.setAttribute("evolution1", bulb.getEvolution());
			request.setAttribute("baseExp1", bulb.getBaseExp());
		}

		if (value2 != null) {
			// Create the object for Charizard class and use getters to retrieve the values	
			Charizard chari = new Charizard(pokemonName, pokemonNumber, characteristics, type, evolution, baseExp);
			
			msg = "<center>" + chari.getPokemonName() + "  #" + chari.getPokemonNumber();
			request.setAttribute("message2", msg);
			request.setAttribute("character2", chari.getCharacteristics());
			request.setAttribute("type2", chari.getType());
			request.setAttribute("evolution2", chari.getEvolution());
			request.setAttribute("baseExp2", chari.getBaseExp());
		}

		if (value3 != null) {

			// Create the object for Dragonite class and use getters to retrieve the values	
			Dragonite drag = new Dragonite(pokemonName, pokemonNumber, characteristics, type, evolution, baseExp);
			
			msg = "<center>" + drag.getPokemonName() + "  #" + drag.getPokemonNumber();
			request.setAttribute("message3", msg);
			request.setAttribute("character3", drag.getCharacteristics());
			request.setAttribute("type3", drag.getType());
			request.setAttribute("evolution3", drag.getEvolution());
			request.setAttribute("baseExp3", drag.getBaseExp());
		}
		if (value4 != null) {

			// Create the object for Mew class and use getters to retrieve the values	
			Mew mew = new Mew(pokemonName, pokemonNumber, characteristics, type, evolution, baseExp);
			
			msg = "<center>" + mew.getPokemonName() + "  #" + mew.getPokemonNumber();
			request.setAttribute("message4", msg);
			request.setAttribute("character4", mew.getCharacteristics());
			request.setAttribute("type4", mew.getType());
			request.setAttribute("evolution4", mew.getEvolution());
			request.setAttribute("baseExp4", mew.getBaseExp());
		}

		if (value5 != null) {

			// Create the object for Pikachu class and use getters to retrieve the values	
			Pikachu pika = new Pikachu(pokemonName, pokemonNumber, characteristics, type, evolution, baseExp);
			
			msg = "<center>" + pika.getPokemonName() + "  #" + pika.getPokemonNumber();
			request.setAttribute("message5", msg);
			request.setAttribute("character5", pika.getCharacteristics());
			request.setAttribute("type5", pika.getType());
			request.setAttribute("evolution5", pika.getEvolution());
			request.setAttribute("baseExp5", pika.getBaseExp());

		}

		RequestDispatcher rd = this.getServletContext().getRequestDispatcher("/WEB-INF/views/pokemon.jsp");
		rd.forward(request, response);

	}

}
