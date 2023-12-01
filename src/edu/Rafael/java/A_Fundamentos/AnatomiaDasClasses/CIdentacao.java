package edu.Rafael.java.A_Fundamentos.AnatomiaDasClasses;

public class CIdentacao {
    public static void main(String[] args) {
        //MODO SEM IDENTAÇÃO

//        if (mediaFinal<6)
//        System.out.println("REPROVADO");
//        else if (mediaFinal ==6)
//        System.out.println("PROVA MINERVA");
//        else
//        System.out.println("APROVADO");

        //Modo com Identação
        int mediaFinal = 6;
        if (mediaFinal < 6)
            System.out.println("REPROVADO");
        else if (mediaFinal == 6)
            System.out.println("PROVA MINERVA");
        else
            System.out.println("APROVADO");
    }
}
