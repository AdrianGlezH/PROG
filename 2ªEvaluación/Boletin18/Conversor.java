
package convertirtemperatura;

public class Conversor {
    
    private final float excepcion = 80;
    
    public float centigradosAFharenheit(float tempcenti){
        float Fharen = (9.0f/5.0f*tempcenti+32.4f);
        return Fharen;
    }
    
    public float cent√≠gradosAReamur(float tempcenti){
        float Reamur = 4.0f/5.0f*tempcenti;
        return tempcenti;
    }
}