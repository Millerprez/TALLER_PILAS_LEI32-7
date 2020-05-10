/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilas;

/**
 *
 * @author mp6-9
 */
public class Stack {
    private Node tope, q; //Memory address
    
    public Stack(){
        tope = q = null; //initialize the variables
    }
    
    public boolean isEmpty(){
        return tope == null;
    }

    //Apila o almacena la información.
    public void push(Object data){
        tope = new Node(data, tope);
        
    }
    public Node getTope(){
        return tope;
    }

    //Desapila o extrae la información.
    public Object pop(){
        Object d=null;
        if(!isEmpty()){ //Verifica si existen nodos en la Pila como lista simple.
            if(tope.getNext() == null){ //Solo se utiliza cuando existe un nodo.
                d = tope.getDato();
                tope = null;
            }
            else{ //Si existen varios nodos.
                d = tope.getDato();
                q = tope;
                tope = tope.getNext();
                q = null;
            }
        }
        return d;
    }
}
