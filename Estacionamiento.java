public class Estacionamiento
{
    private Carro[] estacionamiento;
    
    public Estacionamiento()
    {
        estacionamiento = new Carro[150];
    }
    
    //metodos
    public int ingreso(int hrsL,int minL,String matL)
    {
        int i=0;
        while(i<150)
        {
            Carro nuevo =new Carro(hrsL,minL,matL);
            if (disponible()!=0)
            {
                estacionamiento[i]=nuevo;
            
            }
            i++;
        }
        return 0;
    }
    
    public int disponible()
    {
        for (int i =0;i<estacionamiento.length;i++)
        {
            if (estacionamiento[i]!=null)
            {
                return 1;
            }
        }
        return 0;
    }
    /*
    public int cobro(int hrS,int minS,String mat)
    {
        int total;
        int horasT;
        int minT;
        
        for(int i=0;i<estacionamiento.length;i++)
        {   
           if(estacionamiento[i].matricula==mat)
           {
               horasT=hrS-estacionamiento[i].horas;
               minT=minS-estacionamiento[i].min;

           }
         
            
        }
        return total;
    }*/
}