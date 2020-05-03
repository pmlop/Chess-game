package Ajed;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import GUI.Chess_board_panel.Casilla;

public class Queen extends Pieza {

	
	public Queen(Casilla tile, boolean isWhite) {
		super(tile, isWhite);
		type="Queen";
		if (isWhite) {
			this.isWhite=true;
			File whiteQueen=new File("C:/Users/pablo/Desktop/Java/workspace java/Ajedrez/src/GUI/chess_assets/white/white_Queen.png");
			try {						
				asset=ImageIO.read(whiteQueen);
			} catch (IOException e) {
				System.out.println("fallo al cargar asset de caballoblanco (no se ha asignado asset al objeto)");
				e.printStackTrace();
			}
		}
		else {
			this.isWhite=false;
			File queen=new File("C:/Users/pablo/Desktop/Java/workspace java"
					+ "/Ajedrez/src/GUI/chess_assets/black/black_queen.png");
			
			try {						
				asset=ImageIO.read(queen);
			} catch (IOException e) {
				System.out.println("fallo al cargar asset de caballoblanco (no se ha asignado asset al objeto)");
				e.printStackTrace();
			}}
			
		}
	
	
	
	
	
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
