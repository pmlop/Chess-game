package Ajed;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import GUI.Chess_board_panel.Casilla;

public class Rook extends Pieza {

	public Rook(Casilla tile, boolean isWhite) {
		super(tile, isWhite);
		type="Rook";
		if (isWhite) {
			this.isWhite=true;
			File whiteRook=new File("C:/Users/pablo/Desktop/Java/workspace java/Ajedrez/src/GUI/chess_assets/white/white_Rook.png");
			try {						
				asset=ImageIO.read(whiteRook);
			} catch (IOException e) {
				System.out.println("fallo al cargar asset de caballoblanco (no se ha asignado asset al objeto)");
				e.printStackTrace();
			}
		}
		else {
			this.isWhite=false;
			File rook=new File("C:/Users/pablo/Desktop/Java/workspace java"
					+ "/Ajedrez/src/GUI/chess_assets/black/black_rook.png");
			
			try {						
				asset=ImageIO.read(rook);
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
