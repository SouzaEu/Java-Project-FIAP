public class app {

        //Atributos
        public int volume;
        public float estacao;

        //Metodos
        public void aummentarVolume (){
            volume++;
        }

        public void diminuirVolume (){
            volume--;
        }

        public void trocarEstacao (float station){
            estacao = station;
        }
        public void mostrar (){
            System.out.println("Volume: " + volume);
            System.out.println("Estacao: " + estacao);
        }
    }