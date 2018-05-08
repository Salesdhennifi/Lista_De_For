import javax.swing.JOptionPane;
public class Ex02{
    public static void main(String[] args){
       
        String valor_recebido = JOptionPane.showInputDialog("Olá...: ");
		
		for(int i = 0; i<11; i++){
			for(int j = 0; j<11; j++){
                
			valor_recebido += "   ||   " + i+ " x "+ j + " = " + (i*j);
		    }
            valor_recebido +=(" ");
				valor_recebido +=("\n");
		}
		JOptionPane.showMessageDialog(null,"\t" + valor_recebido);


    }
}