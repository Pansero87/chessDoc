package pieces;

import java.util.ArrayList;

import chess.Cell;

/**
 * Esta es la Clase caball heretada de la clase abstracta Peça
 * @author sergio 
 * @version 1.0
 * @since 5-05-2023
 */
public class Knight extends Piece{
	
	/**
	 * Instancia un nou caball
	 *
	 * @param i the i
	 * @param p the p
	 * @param c the c
	 */
	//Constructor
	public Knight(String i,String p,int c)
	{
		setId(i);
		setPath(p);
		setColor(c);
	}
	
	//Move Function overridden
	//There are at max 8 possible moves for a knight at any point of time.
	/**
	 * Moviments
	 *
	 * @param state the state
	 * @param x the x
	 * @param y the y
	 * @return the array list
	 */
	//Knight moves only 2(1/2) steps
	public ArrayList<Cell> move(Cell state[][],int x,int y)
	{
		possiblemoves.clear();
		int posx[]={x+1,x+1,x+2,x+2,x-1,x-1,x-2,x-2};
		int posy[]={y-2,y+2,y-1,y+1,y-2,y+2,y-1,y+1};
		for(int i=0;i<8;i++)
			if((posx[i]>=0&&posx[i]<8&&posy[i]>=0&&posy[i]<8))
				if((state[posx[i]][posy[i]].getpiece()==null||state[posx[i]][posy[i]].getpiece().getcolor()!=this.getcolor()))
				{
					possiblemoves.add(state[posx[i]][posy[i]]);
				}
		return possiblemoves;
	}
}