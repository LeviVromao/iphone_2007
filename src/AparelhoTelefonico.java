public class AparelhoTelefonico {
    public void ligar(String numero) {
        if (numero.length() < 1) {
            System.out.println("precisa colocar um numero pra ligar para alguem");
        }

        System.out.println("ligando para o numero " + numero);
    }

    public void atender() {
        System.out.println("Chamada atendida");
    }

    public void iniciarCorreioVoz() {
        System.out.println("Correio de voz iniciado");
    }
}