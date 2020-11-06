package aplicacao;

import entidades.ProcessarBoletos;

public class Principal {
    public static void main(String[] args) {

        System.out.println("Banco do Brasil");
        ProcessarBoletos processador = new ProcessarBoletos(ProcessarBoletos::lerBancoBrasil);
        String bb = "./resources/banco-brasil-1.csv";
        processador.processar(bb);


        System.out.println("\nBradesco");
        ProcessarBoletos processarBoletos = new ProcessarBoletos(ProcessarBoletos::lerBradesco);
        String bradesco = "./resources/banco-bradesco-1.csv";
        processarBoletos.processar(bradesco);

    }
}
