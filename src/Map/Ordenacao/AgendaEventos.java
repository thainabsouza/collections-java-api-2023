package Map.Ordenacao;

import java.time.LocalDate;
import java.time.Month;
import java.util.*;


public class AgendaEventos {
    //atributo

    private static Map<LocalDate, Evento> eventosMap;

    public AgendaEventos() {
        this.eventosMap = new HashMap<>();
    }

    public static void adicionarEvento(LocalDate data, String nome, String atracao) {
        //Evento evento = new Evento(nome, atracao);
        eventosMap.put(data, new Evento(nome, atracao));
    }


    public void exibirAgenda() {
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
        System.out.println(eventosTreeMap);
    }

    public void obterProximoEvento(){
        LocalDate dataAtual = LocalDate.now();
        LocalDate proximaData = null;
        Evento proximoEvento = null;
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
        for(Map.Entry<LocalDate, Evento> entry : eventosTreeMap.entrySet()){
            if(entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)){
                proximaData = entry.getKey();
                proximoEvento = entry.getValue();
                System.out.println("O proximo evento: " + proximoEvento + " acontecerá na data " + proximaData);

                break;
            }
        }
    }

    public static void main(String[] args){
        AgendaEventos agendaEventos = new AgendaEventos();
        AgendaEventos.adicionarEvento(LocalDate.of(2022, Month.JULY, 15),"Evento 1", "Atração 1");
        AgendaEventos.adicionarEvento(LocalDate.of(2022, 7, 9),"Evento 2", "Atração 2");
        AgendaEventos.adicionarEvento(LocalDate.of(2000, Month.JANUARY, 10),"Evento 3", "Atração 3");
       // AgendaEventos.adicionarEvento(LocalDate.of(2024, Month.JUNE, 12),"Evento 5", "Atração 5");
        AgendaEventos.adicionarEvento(LocalDate.of(2025, Month.SEPTEMBER, 20),"Evento 6", "Atração 6");

        agendaEventos.exibirAgenda();

        agendaEventos.obterProximoEvento();

        //System.out.println(LocalDate.now());
    }


}
