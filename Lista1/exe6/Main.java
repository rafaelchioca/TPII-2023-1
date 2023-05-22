package listaExercicio1.exe6;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Crie um programa que permita calcular o valor do salário líquido de um funcionário considerando odesconto do INSS.

        Double salario = 0.0;
        Double inss = 0.0;
        Double salarioLiquido = 0.0;
        Double aliquotaInss = 7.5;

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o salário: ");
        salario = scan.nextDouble();
        scan.close();

        if (salario <= 1212.00) {
            aliquotaInss = 7.50;
            inss = salario * 0.075;
            salarioLiquido = salario - inss;

            System.out.println("##########################" + "\nCALCULADORA DE INSS" + "\n##########################"
                    + "\nSalário Bruto .....: " + salario + "\nAlíquota INSS (%) .: " + aliquotaInss + "\nDesconto INSS .....: " + inss
                    + "\nSalário Líquido ...: " + salarioLiquido + "\n##########################");
        } else if (salario <= 2427.35) {
            aliquotaInss = 9.00;
            inss = (salario * 0.09) - 18.18;
            salarioLiquido = salario - inss;

            System.out.println("##########################" + "\nCALCULADORA DE INSS" + "\n##########################"
                    + "\nSalário Bruto .....: " + salario + "\nAlíquota INSS (%) .: " + aliquotaInss + "\nDesconto INSS .....: " + inss
                    + "\nSalário Líquido ...: " + salarioLiquido + "\n##########################");
        } else if (salario <= 3641.03) {
            aliquotaInss = 12.00;
            inss = (salario * 0.12) - 91.00;
            salarioLiquido = salario - inss;

            System.out.println("##########################" + "\nCALCULADORA DE INSS" + "\n##########################"
                    + "\nSalário Bruto .....: " + salario + "\nAlíquota INSS (%) .: " + aliquotaInss + "\nDesconto INSS .....: " + inss
                    + "\nSalário Líquido ...: " + salarioLiquido + "\n##########################");
        } else if (salario <= 7087.22) {
            aliquotaInss = 14.00;
            inss = (salario * 0.14) - 163.82;
            salarioLiquido = salario - inss;

            System.out.println("##########################" + "\nCALCULADORA DE INSS" + "\n##########################"
                    + "\nSalário Bruto .....: " + salario + "\nAlíquota INSS (%) .: " + aliquotaInss + "\nDesconto INSS .....: " + inss
                    + "\nSalário Líquido ...: " + salarioLiquido + "\n##########################") ;
        } else {
            aliquotaInss = 14.00;
            inss = (7087.22 * 0.14) - 163.82;
            salarioLiquido = salario - inss;

            System.out.println("##########################" + "\nCALCULADORA DE INSS" + "\n##########################"
                    + "\nSalário Bruto ....: " + salario + "\nAlíquoa INSS (%) .: " + aliquotaInss + "\nDesconto INSS ... : " + inss
                    + "\nSalário Líquido ...: " + salarioLiquido + "\n##########################") ;
        }

    }
}
