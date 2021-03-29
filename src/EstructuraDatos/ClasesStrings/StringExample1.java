package EstructuraDatos.ClasesStrings;

public class StringExample1 {

    public static void main(String[] args) {
        
        String texto = "Hello world";
        texto += "Whats wrong " + "How are you";  //aqui se concantena implicimamente pero recodermos que string es inmutable
        
        System.out.println(texto);

        StringBuilder textoBuilder = new StringBuilder();  // StringBuilder es mucho mas rapido que concatenar con "+"
        textoBuilder.append("Hi im pipe").append("with appened you can concatenar");
        System.out.println(textoBuilder.toString()); //con toString se imprime datos
        
        StringBuffer textobBuffer = new StringBuffer();
        textobBuffer.append("this is StringBuffer");
        System.out.println(textobBuffer.toString()); // con toString se imprime datos

        //String builder es mas rapida que StringBuffer


    }
}
