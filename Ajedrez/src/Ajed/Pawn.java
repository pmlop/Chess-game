package Ajed;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import GUI.Chess_board_panel.Casilla;

public class Pawn extends Pieza {
	public Pawn(Casilla tile, boolean isWhite) {
		super(tile, isWhite);
		type="Pawn";
		if (isWhite) {
			this.isWhite=true;
			File whitePawn=new File("C:/Users/pablo/Desktop/Java/workspace java/Ajedrez/src/GUI/chess_assets/white/white_Pawn.png");
			try {						
				asset=ImageIO.read(whitePawn);
			} catch (IOException e) {
				System.out.println("fallo al cargar asset de caballoblanco (no se ha asignado asset al objeto)");
				e.printStackTrace();
			}
		}
		else {
			this.isWhite=false;
			File pawn=new File("C:/Users/pablo/Desktop/Java/workspace java"
					+ "/Ajedrez/src/GUI/chess_assets/black/black_pawn.png");
			
			try {						
				asset=ImageIO.read(pawn);
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
