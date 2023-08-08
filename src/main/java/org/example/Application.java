package org.example;

import org.example.model.Produto;
import org.example.model.Status;

import java.time.LocalDate;

public class Application {

    public static void main(String[] args) {
        Produto produto = new Produto(10, "Impressora 3D HP", "Impressora 3D filamento XYZ",
                1200.00, 1500.00,
                LocalDate.of(2023, 01, 15),
                LocalDate.of(2023, 01, 15),
                Status.DISPONIVEL);

//        produto.setNome("Impressora 3D HP");;
//        produto.setDescicao("Impressora 3D filamento XYZ");
//        produto.setDataPrazo(LocalDate.of(2023, 01, 15));
//        produto.setPrecoCompra(1200.00);
//        produto.setPrecoVenda(1500.00);
//        produto.setStatus(Status.DISPONIVEL);


        System.out.println("Margem: " + produto.calcularMargemDeLucro() + "%");
    }
}
