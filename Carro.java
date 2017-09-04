public class Carro
{
    private int horas;
    private int minutos;
    private String matricula;
    
    public Carro(int hrs,int min,String mat)
    {
        if(hrs>0 && hrs<24)
        {
            horas = hrs;
        }
        if (min>=0 && min<60)
        {
            minutos=min;
        }
        matricula=mat;       
        
    }
}