public class Main {
    public static void ObterMemoriaUsada(){
        final int MB = 1024 * 1024;
        Runtime runtime = Runtime.getRuntime();
        System.out.println((runtime.totalMemory() - runtime.freeMemory())/ MB); //memória utilizada pela aplicação (Em Megas)
    }
    public static void main(String[] args) {
    Contatos[] contatos = new Contatos[1000000]; // Criação de n espaços "Contato"
    Contatos contato; 
//Cada espaço em contatos, agora vai receber seus respéctivos valores
    for (int i=0; i< contatos.length; i++){
        contato = new Contatos("contato" + i,"1234-56789" + i, "Contato" + i + "@gmail.com");
        contatos[i] = contato;
    }
        // MBs usados sem o Garbage Colector
        System.out.println("Contatos criados");
        ObterMemoriaUsada();
        
        contatos = null; //atribui null á todas as instâncias em "contatos"

        
        Runtime.getRuntime().gc(); // ativação do Garbage Collector
        
        // MBs usados com o Garbage Collector
        System.out.println("Contatos removidos da memória");
        ObterMemoriaUsada();

    
    
    
    
    
       // for (int i = 0; i < contatos.length; i = i + 2){
            
         //   contatos[i] = null;
        //}
    }

}
