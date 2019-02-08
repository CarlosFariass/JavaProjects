
package life;


public class Life {
    
  int MAX = 10; // Tamanho da m a t r i z
   int vizinhos;
    
int [] [] matriz = new int [MAX] [MAX];

    void inicializa( )
{
int i, j;

    for( i = 1; i<MAX - 1; i++);
    
    for(j = 1; j<MAX -1; j ++ );
    
matriz[i] [j] = (int)(Math.random() * 1.5);

}
  int imprimeTabuleiro(){

    int i, j = 0;
    
    for (i = 0; i<MAX; i ++)
{
    for (j = 0; j<MAX; j ++)
        if (matriz [i][j] == 1){
            
System.out.print( " ∗ " );}
        else{
System.out.print( " . " );
System.out.println();
}
    
System.out.println( );
}
    
    int vizinhos(int i,int j){


    return matriz [i-1] [j-1] + matriz [i-1] [j] + matriz [i-1] [j+1]+
           matriz [i] [j-1] + matriz [i] [j+1] + matriz [i+1] [j-1] +
           matriz [i+1] [j-1] + matriz [i+1] [j+1];
}


int[][] interacao(){
    
int [] [] aux = new int [MAX] [MAX];


for (i = 1; i<MAX - 1; i++);
for (j=1; j<MAX - 1; j++);
{
    if (matriz [i] [j] == 1){ 

    if ((vizinhos (i,j) < 2) || (vizinhos (i,j) > 3))
            aux [i] [j] = 0; 
        else
            aux [i] [j] = 1; 
}
       else {

    if (vizinhos (i,j) == 3)
        aux [i] [j] = 1; 
       else
        aux [i] [j] = 0; 
}
}
    return aux; 
}
        void simulaVida(int quant){
       
          int i;

    for (i = 0; i<quant; i ++){
        imprimeTabuleiro();
        matriz = interacao(); 
}
}
    
    

    
   



