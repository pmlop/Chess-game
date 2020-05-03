package GUI;


import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

import Ajed.Bishop;
import Ajed.King;
import Ajed.Knight;
import Ajed.Pawn;
import Ajed.Pieza;
import Ajed.Queen;
import Ajed.Rook;





public class Chess_board_panel extends JPanel implements MouseListener {
		File file = new File("C:/Users/pablo/Desktop/Java/workspace "//tablero
				+ "java/Ajedrez/src/GUI/tablero.png");
	Image tablero;
	
	
	
	Casilla selectedTile=null;
	Casilla targetTile;
	final Casilla board[][]=new Casilla [8][8];
	
	
	public Chess_board_panel() {
		addMouseListener(this);
		
		byte y=0; 
		int coordinatex=0; int coordinatey=620-77;
		for(byte x=0;x<=7;x++) {
		for(y=0;y<=7; y++) {
			board[x][y]=new Casilla(x,y);
			board[x][y].setCoordinates(coordinatex,coordinatey);
			coordinatey-=77;
			
			}
		y=0; coordinatex+=77; coordinatey=620-77;
		}
		board[0][0].occupiedBy=new Rook(board[0][0], true);// colocación de las piezas en el tablero
		board[7][0].occupiedBy=new Rook(board[0][0], true);
		board[1][0].occupiedBy=new Knight(board[1][0], true);
		board[6][0].occupiedBy=new Knight(board[6][0], true);
		board[2][0].occupiedBy=new Bishop(board[2][0], true);
		board[5][0].occupiedBy=new Bishop(board[5][0], true);
		board[3][0].occupiedBy=new Queen(board[3][0], true);
		board[4][0].occupiedBy=new King(board[0][4], true);
		for (int i=0; i<8;i++) {
			board[i][1].occupiedBy=new Pawn(board[0][0], true);
		}
		board[0][7].occupiedBy=new Rook(board[0][0], false);
		board[7][7].occupiedBy=new Rook(board[0][0], false);
		board[1][7].occupiedBy=new Knight(board[1][0], false);
		board[6][7].occupiedBy=new Knight(board[6][0], false);
		board[2][7].occupiedBy=new Bishop(board[2][0], false);
		board[5][7].occupiedBy=new Bishop(board[5][0], false);
		board[3][7].occupiedBy=new Queen(board[3][0], false);
		board[4][7].occupiedBy=new King(board[0][4], false);
		for (int i=0; i<8;i++) {
			board[i][6].occupiedBy=new Pawn(board[0][0], false);
		}
	
	}
	
	
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		try {
			tablero = ImageIO.read(file);

			
		} catch (IOException e) {
			e.printStackTrace();
			System.out.print("no se ha leido tablero");
		}
		
		g.drawImage(tablero,0,0,null);
		for(int i=0;i<8;i++) {
			int j;
			for(j=0;j<8;j++) {
			if(board[i][j].getOccupiedBy()!=null) {
				g.drawImage(board[i][j].getOccupiedBy().getAsset(),
						board[i][j].getCoordinatex(),board[i][j].getCoordinatey(),null);
			}
			}
			j=0;
		}
		
		
	}
	
	public void mouseClicked(MouseEvent e) {	
	
	if (selectedTile==null) {
		selectedTile=board[e.getX()/77][7-(e.getY()/77)];	
	System.out.println("casilla"+e.getX()/77 +" "+ (7-(e.getY()/77))+"seleccionada");
		if (selectedTile.getOccupiedBy()==null) {
			selectedTile=null;
		}
	}
	else {
		targetTile=board[e.getX()/77][7-(e.getY()/77)];
		targetTile.setOccupiedBy(selectedTile.getOccupiedBy());
		if (targetTile!=selectedTile)selectedTile.setOccupiedBy(null);
		repaint();
		selectedTile=null;
	}
	
	}
	public void mouseEntered(MouseEvent e) {}
	public void mouseExited(MouseEvent e) {}
	public void mousePressed(MouseEvent e) {
		
	}
	public void mouseReleased(MouseEvent e) {
		
	}
	
	 public class Casilla  {
		public Casilla(byte x, byte y){
			this.x=x;
			this.y=y;
		}
	private byte x;// ESTA X E Y SON LAS XY DEL ARRAY
	private byte y;
	private int coordinatex;//ESTO SON LAS COORDENADAS
	private int coordinatey;
	private Pieza occupiedBy = null;

	private Pieza getOccupiedBy() {
		return this.occupiedBy;
		
		
		
	}


	public void setCoordinates(int x, int y) {
		coordinatex=x;
		coordinatey=y;
	}


	public void setOccupiedBy(Pieza p) {
		occupiedBy=p;
	}
	public void noLongerOccupiedBy (Pieza p) {
		occupiedBy=null;
	}

	public byte getX() {
		
		return x;
	}
	public byte getY() {
		
		return y;
	}
	public int getCoordinatex() {
		return coordinatex;
	}
	public int getCoordinatey() {
		return coordinatey;
	}
	
	}

	
}
