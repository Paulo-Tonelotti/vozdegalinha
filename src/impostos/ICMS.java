package impostos;

public class ICMS implements calcula{
    public float ICMS = 0.17f;


    @Override
    public void calcular(float preco) {
        setICMS(preco * 0.17f);   
    }

    public void setICMS(float iCMS) {
        ICMS = iCMS;
    }

    public float getICMS() {
        return ICMS;
    }
}
