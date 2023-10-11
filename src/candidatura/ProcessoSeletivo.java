package candidatura;

import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) throws Exception {
        System.out.println("PROCESSO SELETIVO");

        analisarCandidato(2000.0);
        selecaoCandidatos();
        imprimirSelecionados();
    }

    static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido){
            System.out.println("Ligar para candidato");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("Ligar para candidato com contra-proposta");
        } else {
            System.out.println("Aguardando demais candidatos");
        }
    }

    static void selecaoCandidatos(){
        String[] candidatos={"Ana", "Ivo", "João", "Otto", "Maia", "Lua", "Pedro", "Luana"};

        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;

        while (candidatosSelecionados<5 && candidatoAtual < candidatos.length){
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();
            
            System.out.println("O(A) candidato(a) " + candidato + " solicitou " + salarioPretendido);

            if (salarioBase>=salarioPretendido){
                System.out.println("O candidato " + candidato + " foi selecionado");
                candidatosSelecionados++;
            }

            candidatoAtual++;
        }
    }

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800,2200);
    }

    static void imprimirSelecionados(){
        String[] candidatosSelecionados = {"Ana", "Ivo", "João", "Otto", "Maia"};

        for (int i=0; i<candidatosSelecionados.length; i++) {
            System.out.println("O candidato de nº " + (i+1) + " é o candidato " + candidatosSelecionados[i] );
        }
    }
}
