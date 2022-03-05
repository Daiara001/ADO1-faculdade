
package com.ado1.daiaravieiraado1;

/**
 *
 * @author Daiara Vieira
 */
public class Dragão {

//Atributos
private String nomedoAnimal = "Draco";
private String Asas;
private String Cauda;
private String Garras;
private String Dentes;
private String voar;
private String cospirFogo;

//Metodos acessores
public String nomedoAnimal(){
    return this.nomedoAnimal;
};
public void setnomedoAnimal(int pnovonomedoAnimal){
    String novonomedoAnimal = null;
    this.nomedoAnimal = novonomedoAnimal; 
};
public String getAsas(){
    return this.Asas;
};
public void setAsas (int pnovasAsas){
};
public String getCauda(){
    return this.Cauda;
};
public String setCauda (int pnovaCauda){
    return this.Cauda;
};
public String getGarras(){
    return this.Garras;
};
public String setGarras (int pnovaGarra){
    return this.Garras;
};
public String getDentes(){
    return this.Dentes;
};
public String setDentes(int pnovosDentes){
    return this.Dentes;
};
public String getvoar(){
    return this.voar;
};
public String setvoar(int pvoar){
    return this.voar;
}
public String getcospirFogo(){
    return this.cospirFogo;
};
public String cospirFogo(int pcospirFogo){
    return this.cospirFogo;
};
//Método construtor 
public Dragão(){
}


public Dragão (String animalDragão){
    this.nomedoAnimal = animalDragão;
}

//Métodos
public void voar(){
    this.voar += 10;
}
public void cospirFogo(){
    this.cospirFogo += 15;
}

public static void main(String[] args) {
    Dragão dragao1 = new Dragão();
        Dragão dragao2 = new Dragão();
};
};

