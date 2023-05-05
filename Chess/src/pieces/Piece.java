package pieces;

import java.util.ArrayList;

import chess.Cell;

/**
 * Esta és la Classe Peça (Piece). És una classe abstracta de la qual s'hereten
 * totes les peces reals del joc d'escacs.
 * 
 * Defineix totes les funcions comunes a totes les peces. La funció move() és
 * una funció abstracta que ha de ser sobreescrita en totes les classes
 * heretades. Implementa la interfície Cloneable ja que sovint es requereix una
 * còpia de la peça.
 * 
 * @author sergio
 * @version 1.0
 * @ssince 5-05-2023
 * 
 */
public abstract class Piece implements Cloneable {

	/** The color. */
	// Member Variables
	private int color;
	
	/** The id. */
	private String id = null;
	
	/** The path. */
	private String path;
	
	/** The possiblemoves. */
	protected ArrayList<Cell> possiblemoves = new ArrayList<Cell>(); // Protected (access from child classes)

	/**
	 * Moviment
	 *
	 * @param pos the pos
	 * @param x the x
	 * @param y the y
	 * @return the array list
	 */
	public abstract ArrayList<Cell> move(Cell pos[][], int x, int y); // Abstract Function. Must be overridden

	/**
	 * Set el id
	 *
	 * @param el nou id
	 */
	// Id Setter
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * Estableix la ruta.
	 *
	 * @param traça la nova ruta
	 */
	// Path Setter
	public void setPath(String path) {
		this.path = path;
	}

	/**
	 * Sets tel color
	 *
	 * @param c el nou color
	 */
	// Color Setter
	public void setColor(int c) {
		this.color = c;
	}

	/**
	 * GetConsegueix la ruta
	 *
	 * @return la ruta
	 */
	// Path getter
	public String getPath() {
		return path;
	}

	/**
	 * Get el id
	 *
	 * @return el id
	 */
	// Id getter
	public String getId() {
		return id;
	}

	/**
	 * Gets el color
	 *
	 * @return el color
	 */
	// Color Getter
	public int getcolor() {
		return this.color;
	}

	// Function to return the a "shallow" copy of the object. The copy has exact
	/**
	 * Gets la copia
	 *
	 * @return la copia
	 * @throws CloneNotSupportedException la excepcio de conació no soportada
	 */
	// same variable value but different reference
	public Piece getcopy() throws CloneNotSupportedException {
		return (Piece) this.clone();
	}
}