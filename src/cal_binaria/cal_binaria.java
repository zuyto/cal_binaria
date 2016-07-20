package cal_binaria;
import java.awt.*;
import java.awt.event.*;

public class cal_binaria extends Frame implements ActionListener{
    TextField resultado;
    Button suma;
    Button resta;
    Button multi;
    Button divi;
    Button clear;
    Button uno;
    Button ceros;
    Button igual;
    Label MAO;
    Label MAO2;
    String operando1;
    String operando2;
    String operador;
    int o1;
    int o2;
    int res;
    int h;

    public cal_binaria() {
        MAOLayout customLayout = new MAOLayout();

        setFont(new Font("Verdana", Font.PLAIN, 20));
        setLayout(customLayout);

        resultado = new TextField("");
        add(resultado);

        suma = new Button("+");
        add(suma);
        suma.addActionListener(this);

        resta = new Button("-");
        add(resta);
        resta.addActionListener(this);

        multi = new Button("x");
        add(multi);
        multi.addActionListener(this);        

        divi = new Button("/");
        add(divi);
        divi.addActionListener(this);        

        clear = new Button("CA");
        add(clear);
        clear.addActionListener(this);        

        uno = new Button("1");
        add(uno);
        uno.addActionListener(this);        

        ceros = new Button("0");
        add(ceros);
        ceros.addActionListener(this);

        igual = new Button("=");
        add(igual);
        igual.addActionListener(this);        

        MAO = new Label("Calculadora Binaria");
        add(MAO);
        
        setSize(getPreferredSize());
        
        MAO2 = new Label("RESULTADO");
        add(MAO2);
        
        setSize(getPreferredSize());
        
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }


 
    public void actionPerformed(ActionEvent ae) {


		if (ae.getSource() == ceros) 
			resultado.setText(resultado.getText()+"0");

		if (ae.getSource() == uno)
			resultado.setText(resultado.getText()+"1");

		if (ae.getSource() == suma){
				operando1 = resultado.getText();
				operador="+";
				MAO2.setText(operando1+" + ");
				resultado.setText("");		
		}
		if (ae.getSource() == resta){
				operando1 = resultado.getText();
				operador="-";
				MAO2.setText(operando1+" - ");
				resultado.setText("");		
		}
		if (ae.getSource() == multi){
				operando1 = resultado.getText();
				operador="x";
				MAO2.setText(operando1+" x ");
				resultado.setText("");		
		}
		if (ae.getSource() == divi){
				operando1 = resultado.getText();
				operador="/";
				MAO2.setText(operando1+" / ");
				resultado.setText("");		
		}

		if (ae.getSource() == clear){
				operando1 = "";
				operador="";
				operando1 = "";
				MAO2.setText("Sin Operacion!");
				resultado.setText("");		
		}
		
		if (ae.getSource() == igual){
			if (operando1 != "" && operador != "" && operando1 != "")
                         
			{
				operando2 = resultado.getText();
				MAO2.setText(operando1+" "+operador+" "+operando2);
				o1=conversor.a_decimal(operando1);
				o2=conversor.a_decimal(operando2);
		        if (operador == "+")
           			res = o1+o2;
           		else if (operador == "-")
           			     res = o1-o2;
					 else if(operador == "x")
					 		 res = o1*o2;
					 	  else if (operador == "/")	 
					 	  	       res = o1/o2;
                                                           
				MAO2.setText(Integer.toBinaryString(res));		
			}
		}
	}


	

    public static void main(String args[]){
        cal_binaria window = new cal_binaria();

        window.setTitle("Calculadora Binaria");
        window.pack();
        window.show();
    }
}







