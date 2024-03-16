public class UsaRadio {
    public static void main(String[] args) {

        //declarar e instanciar de um objeto da classe
        app radio1 = new app();
        radio1.volume = 5;
        radio1.estacao = 85.1f;
        radio1.mostrar();
        radio1.trocarEstacao(92.5f);
        radio1.aummentarVolume();
        radio1.aummentarVolume();
        radio1.aummentarVolume();
        radio1.mostrar();
    }
}

