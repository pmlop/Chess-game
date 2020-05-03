package Ajed;
import java.awt.Image;

import GUI.Chess_board_panel.Casilla;

public abstract class Pieza {
	String type;
	boolean isWhite;
	int x,y;
	Image asset;
	
	public Pieza(Casilla casilla, boolean isWhite) {// pide por param un objeto de tipo casilla, luego le puedo dar board [i][j]
		this.x=casilla.getX();
		this.y=casilla.getY();
		
	}
	
	public abstract Casilla[] movementPath(Casilla finalTile, Casilla initialTile);//knights will not implement this method
	public abstract void moveTo(Casilla tile);
	public abstract boolean canMoveTo(Casilla finalTile, Casilla initialTile);
	public abstract boolean isPathUnobstructed(Casilla finalTile, Casilla initialTile);
	static public void getsCaptured(Pieza pieza) {pieza=null;};
	String getType() {return type;}
	public Image getAsset(){
		return asset;
	}
}
