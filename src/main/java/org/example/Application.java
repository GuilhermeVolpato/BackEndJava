package org.example;

import org.example.model.*;

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

        Venda venda01 = new Venda();
        venda01.setId(10L);
        venda01.setDataVenda(LocalDate.of(2023, 1, 1));
        venda01.setCliente(Bruno);
        venda01.setFormaPagamento(FormaPagamento.CARTAO_CREDITO);
        venda01.setObservacao("Venda de impressora 3D");

        System.out.println("Venda: " + venda01.getFormaPagamento());

        Produto produto01 = new Produto("Computador", "I5 8gb");
        ItemVenda itemVenda01 = new ItemVenda(produto01, 100.0, 1.0, 10.0);
        venda01.addItemVenda(itemVenda01);

        Produto produto02 = new Produto("Computador", "I7 8gb");
        ItemVenda itemVenda02 = new ItemVenda(produto02, 50.0, 1.0, 10.0);
        venda01.addItemVenda(itemVenda02);

        System.out.println("Valor total da venda: " + venda01.getItens());

    }
}
