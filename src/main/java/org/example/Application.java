package org.example;

import org.example.model.Cliente;
import org.example.model.Fornecedor;
import org.example.model.Produto;
import org.example.model.Status;

import java.time.LocalDate;

public class Application {

    public static void main(String[] args) {
//        Produto produto = new Produto(10, "Impressora 3D HP", "Impressora 3D filamento XYZ",
//                1200.00, 1400.00,
//                LocalDate.of(2023, 01, 15),
//                LocalDate.of(2023, 01, 15),
//                Status.DISPONIVEL);
        Produto produto = new Produto();
        produto.setNome("Impressora 3D HP");
        produto.setDescicao("Impressora 3D filamento XYZ");
        produto.setDataPrazo(LocalDate.of(2023, 01, 15));
        produto.setPrecoCompra(1200.00);
        produto.setPrecoVenda(1400.00);
        produto.setStatus(Status.DISPONIVEL);

        System.out.println("Margem: " + produto.calcularMargemDeLucro() + "%");

        Fornecedor dell = new Fornecedor();
        dell.setNome("Dell Computadores");
        dell.setCnpj("123456789");
        dell.setInscricaoEstadual("123456789");
        dell.setEmail("comercial@dell.com.br");
        dell.setEndereco("Rua 1, 123");

        System.out.println("Fornecedor: " + dell.getNome());

        Cliente Bruno = new Cliente();
        Bruno.setNome("Bruno");
        Bruno.setCpf("123456789");
        Bruno.setRg("123456789");
        Bruno.setEmail("bruno.kurzawe@betha.com.br");
        Bruno.setTelefone("48 999089410");
        Bruno.setEndereco("Rua 1, 123");

        System.out.println("Cliente: " + Bruno.getNome());
    }
}
