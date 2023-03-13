package listaExercicio1.exe7;

public class Main {
    public static void main(String[] args) {
        // Crie uma classe que represente um aluno considerando os atributos: nome, p1, p2. Em outra classe,no mesmo pacote crie uma classe principal (Main.java)

        // a. crie uma variável a1 do tipo aluno que receba a instância de Aluno;
        Aluno a1 = new Aluno();

        // b.atribua valores arbitrários;
        a1.setNome("Rafael");
        a1.setP1(8);
        a1.setP2(9);

        // c.mostre os valores;
        System.out.println("Aluno a1: " + a1.getNome() + " , P1: " + a1.getP1() + " , P2: " + a1.getP2() + "\n");

        // d.crie uma variável a2 que receba a1;
        Aluno a2  = new Aluno();
        a2 = a1;

        // e.altere os valores da p1 e p2 na variável a2 e mostre os valores dos atributos de a1 e a2;
        a2.setP1(10);
        a2.setP2(5);

        System.out.println("Aluno a1: " + a1.getNome() + " , P1: " + a1.getP1() + " , P2: " + a1.getP2());
        System.out.println("Aluno a2: " + a2.getNome() + " , P1: " + a2.getP1() + " , P2: " + a2.getP2());

        // f.os valores são diferentes? explique.

        /* R: Os valores são iguais porque ao criar a variavel "a2" recebendo "a1", o que ele recebe é
        a referencia de a1 e não os valores em si, então quando alteramos "a2" na verdade estamos alterando
        a variavel "a2" */
    }
}

