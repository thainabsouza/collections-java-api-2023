package Map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {

    //atributos
    private static Map<String, Integer> AgendaContatosMap;

    public  AgendaContatos(){
        this.AgendaContatosMap = new HashMap<>();

        }

        public static void adicionarContato(String nome, Integer telefone) {
            AgendaContatosMap.put(nome, telefone);
        }

        public void removerContato(String nome) {
            if(!AgendaContatosMap.isEmpty()){
                AgendaContatosMap.remove(nome);
            }
        }
        public void exibirContatos(){
            System.out.println(AgendaContatosMap);
        }

        public  Integer pesquisarPorNome(String nome) {
            Integer numeroPorNome = null;
            if(!AgendaContatosMap.isEmpty()){
               numeroPorNome = AgendaContatosMap.get(nome);
            }
            return numeroPorNome;
        }

        public static void main(String[] args) {
            AgendaContatos agendaContatos = new AgendaContatos();


            AgendaContatos.adicionarContato("Camila",123456);
            AgendaContatos.adicionarContato("Camila",5665);
            AgendaContatos.adicionarContato("Camila Cabalcante",11111111);
            AgendaContatos.adicionarContato("Camila dio",654987);
            AgendaContatos.adicionarContato("Maria Silva",1111111);
            AgendaContatos.adicionarContato("Camila",44444);


            agendaContatos.exibirContatos();
            agendaContatos.removerContato("Maria Silva");
            agendaContatos.exibirContatos();
        }

    }

