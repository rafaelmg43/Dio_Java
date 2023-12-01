package edu.Rafael.java.A_Fundamentos.AnatomiaDasClasses;

public class BVariaveisEMetodos {
    public static void main(String[] args) {
        //Estrutura de variaveis
//    Tipo NomeBemDefinido = Atribuição(opcional em alguns casos)
//    String meuNome = "Rafael";
//
//    int anoFabicacao = 2022;
//
//    boolean simNao = true ; //false
//
//    //anoFabicacao = 2018;

        // Estruturas de Metodos
        //TipoRetorno NomeObjetivoNoInfinito Parametro(s)

//    int somar (int numeroUm, int numero2)
//    String formatarCep (long cep)
        String primeiroNome = "Rafael";
        String segundoNome = " Cruz";
        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto(String primeiroNome, String segundoNome) {
        return "Resultado do método " + primeiroNome + (" ") + segundoNome;
    }
}
