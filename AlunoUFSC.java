package aluno;

import java.util.Scanner;

public class AlunoUFSC extends Pessoa{
    Scanner input = new Scanner(System.in);
    private double prova1;
    private double prova2;
    private double prova3;

    public double getProva1() {
        return prova1;
    }
    public void setProva1(double prova1) {
        this.prova1 = prova1;
    }
    public double getProva2() {
        return prova2;
    }
    public void setProva2(double prova2) {
        this.prova2 = prova2;
    }
    public double getProva3() {
        return prova3;
    }
    public void setProva3(double prova3) {
        this.prova3 = prova3;
    }

    @Override
    public String toString() {
        return "AluboUFSC{" +
                "prova1=" + prova1 +
                ", prova2=" + prova2 +
                ", prova3=" + prova3 +
                '}';
    }

    public void Aluno(double prova1, double prova2){
        setProva1(prova1);
        setProva2(prova2);
    }

    public void Aluno(double prova1, double prova2, double prova3){
        setProva1(prova1);
        setProva2(prova2);
        setProva3(prova3);
    }

    public double calcMedia(){
        double media = (prova1+prova2)/2;
        if(media>=7){
            System.out.println("Aprovado!");
        }else {
            System.out.println("Informe a terceira prova: ");
            prova3 = input.nextDouble();
            if (prova3>=7){
                System.out.println("Aprovado!");
            }else {
                System.out.println("Reprovado!");
            }}
        return 0;
    }
    public AlunoUFSC(){}

    public AlunoUFSC(double prova1, double prova2, double prova3) {
        this.prova1 = prova1;
        this.prova2 = prova2;
        this.prova3 = prova3;
    }
}
