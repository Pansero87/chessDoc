package pieces;

import java.util.ArrayList;

import chess.Cell;

/**
 * Esta es la Clase de Alfil. La Función de Movimiento define las reglas básicas
 * para el movimiento del Alfil en un tablero de ajedrez.
 * 
 * @author sergio 
 * @version1.0
 * @since 5-05-2023
 */
public class Bishop extends Piece {

	// Constructor
	public Bishop(String i, String p, int c) {
		setId(i);
		setPath(p);
		setColor(c);
	}

	// move function defined. It returns a list of all the possible destinations of
	// a Bishop
	// The basic principle of Bishop Movement on chess board has been implemented
	public ArrayList<Cell> move(Cell state[][], int x, int y) {
		// Bishop can Move diagonally in all 4 direction (NW,NE,SW,SE)
		// This function defines that logic
		possiblemoves.clear();
		int tempx = x + 1, tempy = y - 1;
		while (tempx < 8 && tempy >= 0) {
			if (state[tempx][tempy].getpiece() == null) {
				possiblemoves.add(state[tempx][tempy]);
			} else if (state[tempx][tempy].getpiece().getcolor() == this.getcolor())
				break;
			else {
				possiblemoves.add(state[tempx][tempy]);
				break;
			}
			tempx++;
			tempy--;
		}
		tempx = x - 1;
		tempy = y + 1;
		while (tempx >= 0 && tempy < 8) {
			if (state[tempx][tempy].getpiece() == null)
				possiblemoves.add(state[tempx][tempy]);
			else if (state[tempx][tempy].getpiece().getcolor() == this.getcolor())
				break;
			else {
				possiblemoves.add(state[tempx][tempy]);
				break;
			}
			tempx--;
			tempy++;
		}
		tempx = x - 1;
		tempy = y - 1;
		while (tempx >= 0 && tempy >= 0) {
			if (state[tempx][tempy].getpiece() == null)
				possiblemoves.add(state[tempx][tempy]);
			else if (state[tempx][tempy].getpiece().getcolor() == this.getcolor())
				break;
			else {
				possiblemoves.add(state[tempx][tempy]);
				break;
			}
			tempx--;
			tempy--;
		}
		tempx = x + 1;
		tempy = y + 1;
		while (tempx < 8 && tempy < 8) {
			if (state[tempx][tempy].getpiece() == null)
				possiblemoves.add(state[tempx][tempy]);
			else if (state[tempx][tempy].getpiece().getcolor() == this.getcolor())
				break;
			else {
				possiblemoves.add(state[tempx][tempy]);
				break;
			}
			tempx++;
			tempy++;
		}
		return possiblemoves;
	}
}