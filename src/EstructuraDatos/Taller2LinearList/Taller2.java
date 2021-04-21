package EstructuraDatos.Taller2LinearList;

public class Taller2 {

    public static void main(String[] args) {

        PoemAnalysis poemAnalysis = new PoemAnalysis();

        poemAnalysis.loadFile("text.txt");

        poemAnalysis.Posiciones();

        poemAnalysis.countTimes("táctica");
       

       poemAnalysis.exchange("táctica", "estrategia");
      poemAnalysis.SaveFile("text.txt");
    }
    
}
