package com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.model;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
public class Texto extends Renderizavel{

    private String text;

    @Override
    public String toString() {
        return "Texto: { Meu ID é: "+this.getId() +" e meu texto é : "+ this.text +" }";
    }
}
