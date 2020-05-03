package Ajed;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import GUI.Chess_board_panel.Casilla;

public class Bishop extends Pieza {

	
	
	public Bishop(Casilla tile, boolean isWhite) {
		super(tile, isWhite);
		type="Bishop";
		if (isWhite) {
			this.isWhite=true;
			File bishop=new File("C:/Users/pablo/Desktop/Java/workspace java"
					+ "/Ajedrez/src/GUI/chess_assets/white/white_Bishop.png");
			try {						
				asset=ImageIO.read(bishop);
			} catch (IOException e) {
				System.out.println("fallo al cargar asset de caballoblanco ("
						+ "no se ha asignado asset al objeto)");
				e.printStackTrace();
			}
		}
		else {
			this.isWhite=false;
			File bishop=new File("C:/Users/pablo/Desktop/Java/workspace java"
					+ "/Ajedrez/src/GUI/chess_assets/black/black_Bishop.png");
			
			try {						
				asset=ImageIO.read(bishop);
			} catch (IOException e) {
				System.out.println("fallo al cargar asset de caballoblanco (no se ha asignado asset al objeto)");
				e.printStackTrace();
			}
			
		}
		
	}
	
	
	
	
		@Override
		public Casilla[] movementPath(Casilla finalTile, Casilla initialTile) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public void moveTo(Casilla tile) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public boolean canMoveTo(Casilla finalTile, Casilla initialTile) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean isPathUnobstructed(Casilla finalTile, Casilla initialTile) {
			// TODO Auto-generated method stub
			return false;
		}

	
	}




