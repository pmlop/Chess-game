package Ajed;
import javax.swing.JFrame;

import GUI.Chess_board_panel;



public class Chess_main {
	
	
	
	
		

	

	public static void main(String[] args) {
		
	
	    JFrame ventana = new JFrame();
		Chess_board_panel lamina=new Chess_board_panel();
		ventana.add(lamina);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.setVisible(true);
		ventana.setBounds(700,50,630,650);
		ventana.setResizable(false);
	

			
		/*while (true) {
		Scanner sc= new Scanner(System.in);
		int a =sc.nextInt();
		int b =sc.nextInt();
		System.out.println(board [a][b].getCoordinatex()+"////"+board[a][b].getCoordinatey());
		}*/
		
	}
	
	}


