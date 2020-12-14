package projetolivro;

public class Livro implements Publicacao {
    // Atributos
    private String titulo, autor;
    private int totPaginas, pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    // Métodos Públicos
    public String detalhes() {
        return "Livro \n[" + "\ntitulo=" + titulo + ", \nautor=" + autor + ", \ntotPaginas=" + totPaginas
                + ", pagAtual=" + pagAtual + ", aberto=" + aberto + ", \nleitor=" + leitor.getNome() + ", idade="
                + leitor.getIdade() + ", sexo=" + leitor.getSexo() + "\n]";
    }
    // Métodos Especiais

    public Livro(String titulo, String autor, int totPaginas, Pessoa leitor) {
        this.setTitulo(titulo);
        this.setAutor(autor);
        this.setTotPaginas(totPaginas);
        this.setAberto(false);
        this.setPagAtual(0);
        this.setLeitor(leitor);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotPaginas() {
        return totPaginas;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    @Override
    public void abrir() {
        this.setAberto(true);
    }

    @Override
    public void fechar() {
        this.setAberto(false);
    }

    @Override
    public void folhear(int pagina) {
        if (pagina > this.getTotPaginas()) {
            this.setPagAtual(0);
        } else {
            this.setPagAtual(pagina);
        }
    }

    @Override
    public void avancarPag() {
        this.setPagAtual(this.getPagAtual() + 1);
    }

    @Override
    public void voltarPag() {
        this.setPagAtual(this.getPagAtual() - 1);
    }
}
