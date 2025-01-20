public class Main {
    public static void ObterMemoriaUsada(){
        final int MB = 1024 * 1024;
        Runtime runtime = Runtime.getRuntime();
        System.out.println((runtime.totalMemory() - runtime.freeMemory())/ MB);
    }
    public static void main(String[] args) {
    Contatos[] contatos = new Contatos[10000000];
    Contatos contato;

    for (int i=0; i< contatos.length; i++){
        contato = new Contatos("contato" + i,"1234-56789" + i, "Contato" + i + "@gmail.com");
        contatos[i] = contato;
    }
        System.out.println("Contatos criados");
        ObterMemoriaUsada();
        contatos = null;
        Runtime.getRuntime().gc();
        System.out.println("Contatos removidos da memória");
        ObterMemoriaUsada();



    }

}