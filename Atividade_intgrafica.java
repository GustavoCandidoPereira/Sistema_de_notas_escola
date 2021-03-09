import javax.swing.*; //pacote com ferramentas gráficas
import java.awt.*; //pacote com ferrametnas gráficas
import java.awt.event.*; // pacote para tratar eventos(cliques na tela)

public class Atividade_intgrafica extends JPanel { //herança sobre a classe jpanel para poder programar as interfaces
	// criando os objetos gráficos;
	JLabel lb1, lb2, lb3, lb4, lb5, lb6; //label é uma ferramenta que permite acrescentar texto ou imagem à janela
	JButton bt1, bt2, bt3; //botões para janela
	ImageIcon img1, img2, img3;//imagem
	
public Atividade_intgrafica(){
	InicializarComponentes();//configurações de cada objeto gráfico
	//DefinirEventos();// programação de cada objeto (clique)
	
}

public void InicializarComponentes(){//método para configurar objetos gráficos
	 setLayout(null);
	 setBackground(Color.black);
	 lb1 = new JLabel("CSS");
	 lb2 = new JLabel("HTML");
	 lb3 = new JLabel("JavaScript");
	 lb1.setForeground(Color.blue);//troca a cor do texto
	 lb2.setForeground(Color.red);
	 lb3.setForeground(Color.yellow); 
	 img1 = new ImageIcon("C:\\Users\\Gustavo\\Desktop\\CSS.png");
	 img2 = new ImageIcon("C:\\Users\\Gustavo\\Desktop\\HTML.png");
	 img3 = new ImageIcon("C:\\Users\\Gustavo\\Desktop\\js.png");
	 lb4 = new JLabel(img1);
	 lb5 = new JLabel(img2);
	 lb6 = new JLabel(img3);
	 bt1 = new JButton("CSS");
	 bt2 = new JButton("HTML");
	 bt3 = new JButton("JS");
	 lb1.setBounds(87, 130, 200, 100);//setBounds posiciona em (posição x, posição y, comprimento, altura);
	 lb2.setBounds(217, 130, 200, 100);
	 lb3.setBounds(340, 130, 200, 100);
	 lb4.setBounds(0, 50, 200, 100);
	 lb5.setBounds(140, 50, 200, 100);
	 lb6.setBounds(270, 50, 200, 100);
	 bt1.setBounds(50, 200, 100, 30);
	 bt2.setBounds(185, 200, 100, 30);
	 bt3.setBounds(320, 200, 100, 30);
	 bt1.setBackground(Color.blue);
	 bt2.setBackground(Color.red);
	 bt3.setBackground(Color.yellow);
	 bt1.setForeground(Color.black);
	 bt2.setForeground(Color.black);
	 bt3.setForeground(Color.black);
	 add(lb1);
	 add(lb2);
	 add(lb3);
	 add(lb4);
	 add(lb5);
	 add(lb6);
	 add(bt1);
	 add(bt2);
	 add(bt3);
}
public void DefinirEventos(){//método para programar objetos gráficos
	bt1.addActionListener(new ActionListener(){//nas linhas 35 e 36 está sendo habilitado a opção do botão receber um clique e dentro das {} está a programação que deve acontecer quando o botão for clicado
		public void actionPerformed(ActionEvent arg0){	
			JOptionPane.showMessageDialog(null, "Janela feita com sucesso!");	
			}	
	});
	
	bt2.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){	
			System.exit(0);	
			}	
	});
	
}

public static void main(String args[]){
	 JFrame frame = new JFrame("Desenvolvimento de Software"); //declara a classe para criar uma janela
	 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//método para fechar a janela
	 frame.getContentPane().add(new Atividade_intgrafica()); //adiciona o construtor na janela
	 frame.setBounds(300,300,500,300);// define tamanho e posição da janela
	 frame.setVisible(true);//define se a janela irá ser visivel ou não
}
}