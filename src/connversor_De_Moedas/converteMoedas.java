package connversor_De_Moedas;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class converteMoedas {
	
    public static void main(String[] args) {

        String opcao = JOptionPane.showInputDialog("escolha: Opção 1 (Moeda) ou Opção 2 (Temperatura)");
        DecimalFormat fCasas = new DecimalFormat("#.##");

        switch (opcao) {
        case "1":
            opcao = JOptionPane.showInputDialog("Escolha euro ou dolar");
            System.out.println("Voce escolheu " + opcao);

            if (opcao.equals("dolar")) {
                opcao = JOptionPane.showInputDialog("Digite o valor que deseja" + "" + "" + " converter");
                float dolar = Float.parseFloat(opcao);
                float real = dolar * 5.19f;

                JOptionPane.showMessageDialog(null,
                        " Convertendo $" + dolar + " dolar para Real temos R$ " + real + " reais");

            } else if (opcao.equals("euro")) {
                opcao = JOptionPane.showInputDialog("Digite o valor que deseja converter");
                float euro = Float.parseFloat(opcao);
                float real = euro * 5.59f;

                JOptionPane.showMessageDialog(null,
                        " Convertendo $" + euro + " euros para Real temos R$ " + real + " reais");

            } else {
                System.out.println("Opção inválida");
            }
            break;

        case "2":
            opcao = JOptionPane.showInputDialog("Digite a temperatura");
            float farenheit = Float.parseFloat(opcao);
            Float celsius = (farenheit - 32) / 1.8f;

            JOptionPane.showMessageDialog(null, " Convertendo " + farenheit + " ºFarenheit  para ºCelsius temos "
                    + fCasas.format(celsius) + "ºCelsius");
            break;

        default:

            JOptionPane.showMessageDialog(null, "Opção inválida ! escolha: Opção 1 (Moeda) ou Opção 2 (Temperatura)");
            break;

        }

    }

}


