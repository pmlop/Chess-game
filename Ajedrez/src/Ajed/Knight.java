package Ajed;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import GUI.Chess_board_panel.Casilla;

public class Knight extends Pieza {

	public Knight(Casilla tile, boolean isWhite) {
		super(tile, isWhite);
		type="knight";
		if (isWhite) {
			this.isWhite=true;
			File whiteknight=new File("C:/Users/pablo/Desktop/Java/workspace java/Ajedrez/src/GUI/chess_assets/white/white_knight.png");
			try {						
				asset=ImageIO.read(whiteknight);
			} catch (IOException e) {
				System.out.println("fallo al cargar asset de caballoblanco (no se ha asignado asset al objeto)");
				e.printStackTrace();
			}
		}
		else {
			this.isWhite=false;
			File knight=new File("C:/Users/pablo/Desktop/Java/workspace java"
					+ "/Ajedrez/src/GUI/chess_assets/black/black_knight.png");
			
			try {						
				asset=ImageIO.read(knight);
			} catch (IOException e) {
				System.out.println("fallo al cargar asset de caballoblanco (no se ha asignado asset al objeto)");
				e.printStackTrace();
			}}
			
		}
		
	
		
	

	public void moveTo(Casilla finalTile) {
	
	}


	public boolean canMoveTo(Casilla finalTile ,Casilla initialTile) {
		if ((initialTile.getX()+2==finalTile.getX()||initialTile.getX()-2==finalTile.getX())&&(initialTile.getY()+1==finalTile.getY()||initialTile.getY()-1==finalTile.getY())) {
			return true;// knight "horizontal" movement
		}
		if ((initialTile.getX()+1==finalTile.getX()||initialTile.getX()-1==finalTile.getX())&&(initialTile.getY()+2==finalTile.getY()||initialTile.getY()-2==finalTile.getY())) {
			return true;//knight "vertical" movement
		}
		
		else return false;
	}

	public boolean isPathUnobstructed(Casilla finalTile, Casilla initialTile) {
		//not needed, it is a horse, jumps over pieces
		return true;
	}

	
	public Casilla[] movementPath(Casilla finalTile, Casilla initialTile) {
		// TODO Auto-generated method stub
		return null;
	}

}
