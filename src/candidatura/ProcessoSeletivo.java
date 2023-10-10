package candidatura;

public class ProcessoSeletivo {
    public static void main(String[] args) throws Exception {
        System.out.println("Processo seletivo");

        analisarCandidato(2000.0);
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
}
