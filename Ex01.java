import javax.swing.JOptionPane;
public class Ex01{
	public static void main(String[] args) { 
		 Integer numero = 1;
		while(numero == 1){
			String entrada = JOptionPane.showInputDialog("digite o numero");  
			int valor_recebido = Integer.parseInt(entrada);   
			int[] tabuada= new int[11];  
			for(int i = 1; i<tabuada.length;i++){  
				tabuada[i] = i;  
				JOptionPane.showMessageDialog(null, valor_recebido +"x" + i+"="+ (valor_recebido*tabuada[i]));  
			}  
			String repetir = JOptionPane.showInputDialog("Deseja efetuar a tabuada novamente");
			if ("sim".equals(repetir) || "SIM".equals(repetir)){  
				numero = 1;
			}   
			else  {  
				numero = 0; 
			}  
		} 
	}
}