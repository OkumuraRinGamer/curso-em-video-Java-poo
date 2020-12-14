package aula011;

public class Aula011 {
    public static void main(String[] args) throws Exception {
        // Pessoa p1 = new Pessoa();
        // Visitante v1 = new Visitante();
        // v1.setNome("Adella");
        // v1.setIdade(22);
        // v1.setSexo("Feminino");
        // System.out.println(v1.toString());
        Aluno a1 = new Aluno();
        a1.setNome("Milton");
        a1.setMatricula(54159);
        a1.setCurso("Informática");
        a1.setIdade(16);
        a1.setSexo("Masculino");
        a1.PagarMensalidade();
        Bolsista b1 = new Bolsista();
        b1.setMatricula(72838);
        b1.setNome("Elbert");
        b1.setBolsa(12.5f);
        b1.setSexo("Masculino");
        b1.PagarMensalidade();
    }
}
