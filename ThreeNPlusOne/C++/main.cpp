#include <stdio.h>      /* printf, fgets */
#include <stdlib.h> 
#include <iostream>
#include <fstream>
#include <string>
using namespace std;

int init = 0;
int posfinal = 0;
int * arreglo_valores;
//int arreglo_valores[8];
/*void inicialice(int v1, int v2){
	arreglo_valores[(v2-v1) + 1];
}*/
int higher(int hig, int value) {
    if (value > hig){
            return value;
        }else{
            return hig;
        }
    }
int secuence(int n){
        
        if(arreglo_valores[n - init] != 0 ){
            return arreglo_valores[n- init];
        }else{
            //System.out.println("antes de cont");
            int cont = 0;
            //int conad2 = 0;
            while (n!=1){
                //contad2++;
                //System.out.println("adentro del while");
                cont++;
                if(n%2 == 0){
                    n = n/2;
                    //n = (n-1) / 3;
                    if(n >= init && n <= posfinal){
                        if(arreglo_valores[n - init] != 0){
                            //System.out.println("Entro, cual fue?: "+(n-inicial)+" y cual es el valor?: "+arreglo_valores[n-inicial]);
                            return cont+arreglo_valores[n- init];
                        }
                    }
                    
                }else{
                     n = (3*n) + 1;
                    //n = 2 * n;
                    if(n >= init && n <= posfinal){
                        if(arreglo_valores[n - init] != 0){
                            //System.out.println("Entro, cual fue?: "+(n-inicial)+" y cual es el valor?: "+arreglo_valores[n-inicial]);
                            return cont+arreglo_valores[n- init];
                        }
                    }
                }
                //System.out.println("afuera del if del while");
                

            }
            //System.out.println("afuera del while");
            return cont+1;
        }

        
    }
int main(int argc, char * * argv){
	//cout << argv[1] << endl;
	ifstream myfile;
  	myfile.open ("test1.txt");
  	string lineone;
  	string linetwo;
  	while(!myfile.eof()){

  			myfile >> lineone >> linetwo;
      		//cout << lineone << " "<<linetwo << endl;

      		init = atoi(lineone.c_str());
      		posfinal = atoi(linetwo.c_str());
        	int heigh = 0;
        	int value = 0;
        	arreglo_valores = new int[(posfinal-init) + 1];
        	for(int i = init ; i <= posfinal ; i++){ 
                    
                        value = secuence(i);
                        arreglo_valores[i-init] = value; 
                        //values.add(i,value);
                        heigh = higher(heigh,value);
                        //cout << "POR CUAL VAMOS??: " << i << endl;
                    


                }
                cout << init << " " << posfinal << " " << heigh << endl;
  	}	



  	myfile.close();
	

	return 0;
}