package pieces;

import java.util.ArrayList;

import chess.Cell;

/**
 * Esta es la Clase Torre heredada de la clase abstracta Pieza (Piece).
 * @author sergio
 * @version 1.0
 * @since 5-05-2023
 */
public class Rook extends Piece{
	
	/**
	 * Instància una nova torrre
	 *
	 * @param i the i
	 * @param p the p
	 * @param c the c
	 */
	//Constructor
	public Rook(String i,String p,int c)
	{
		setId(i);
		setPath(p);
		setColor(c);
	}
	
	/**
	 * Moviment
	 *
	 * @param state the state
	 * @param x the x
	 * @param y the y
	 * @return the array list
	 */
	//Move function defined
	public ArrayList<Cell> move(Cell state[][],int x,int y)
	{
		//Rook can move only horizontally or vertically
		possiblemoves.clear();
		int tempx=x-1;
		while(tempx>=0)
		{
			if(state[tempx][y].getpiece()==null)
				possiblemoves.add(state[tempx][y]);
			else if(state[tempx][y].getpiece().getcolor()==this.getcolor())
				break;
			else
			{
				possiblemoves.add(state[tempx][y]);
				break;
			}
			tempx--;
		}
		tempx=x+1;
		while(tempx<8)
		{
			if(state[tempx][y].getpiece()==null)
				possiblemoves.add(state[tempx][y]);
			else if(state[tempx][y].getpiece().getcolor()==this.getcolor())
				break;
			else
			{
				possiblemoves.add(state[tempx][y]);
				break;
			}
			tempx++;
		}
		int tempy=y-1;
		while(tempy>=0)
		{
			if(state[x][tempy].getpiece()==null)
				possiblemoves.add(state[x][tempy]);
			else if(state[x][tempy].getpiece().getcolor()==this.getcolor())
				break;
			else
			{
				possiblemoves.add(state[x][tempy]);
				break;
			}
			tempy--;
		}
		tempy=y+1;
		while(tempy<8)
		{
			if(state[x][tempy].getpiece()==null)
				possiblemoves.add(state[x][tempy]);
			else if(state[x][tempy].getpiece().getcolor()==this.getcolor())
				break;
			else
			{
				possiblemoves.add(state[x][tempy]);
				break;
			}
			tempy++;
		}
		return possiblemoves;
	}
}
