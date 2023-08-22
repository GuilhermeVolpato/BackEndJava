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
        produto.setDescricao("Impressora 3D filamento XYZ");
        produto.setDataPrazo(LocalDate.of(2023, 01, 15));
        produto.setPrecoCompra(1200.00);
        produto.setValorUnitario(1400.00);
        produto.setStatus(Status.DISPONIVEL);

        //System.out.println("Margem: " + produto.calcularMargemDeLucro() + "%");

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

        Servico servico = new Servico("Instalação Office", 2.0, 100.00);
        ItemVenda itemVenda2 = new ItemVenda(servico, 100.00, 981.0, 10.0);
        venda01.addItemVenda(itemVenda2);

//        Pessoa bruno = new Pessoa();
//        bruno.setNome("Bruno Kurzawe");
//        bruno.setEmail("bruno.kurzawe@betha.com.br");
//        bruno.setEndereco("Rua Almirante B");
//        bruno.setTelefone("48 99934-8723");

        Produto produto1 = new Produto("Computador", "i5 8gb");
        System.out.println("Prod: " + produto1.getEstocavel());

        Servico servico1 = new Servico("Instalação Office", 2.0, 100.00);
        System.out.println("Serv: "+ servico1.getEstocavel());

        System.out.println("Valor total da venda: " + venda01.getItens());


        //Declaração de fornecedor
        Fornecedor fornecedor = new Fornecedor();
        fornecedor.setNome("Dell Ltda");


//Declaração de cliente
        Cliente cliente = new Cliente();
        cliente.setNome("Bruno Kurzawe");


//Declaração de Produto
        Produto produto21 = new Produto("Computador", "I5 8gb");
        Servico servico21 = new Servico("Instalação Office", 2.0, 100.00);


//Declaração de Compras
        Compra compra = new Compra();
        compra.setDataCompra(LocalDate.now());
        compra.setFornecedor(fornecedor);
        ItemCompra itemC1 = new ItemCompra(produto21, 1000.00, 10.0, 10.0);
        compra.addItemCompra(itemC1);


//Declaração de Vendas
        Venda venda = new Venda();
        venda.setDataVenda(LocalDate.now());
        venda.setCliente(cliente);
        ItemVenda item = new ItemVenda(produto, 1500.00, 1.0, 10.0);
        venda.addItemVenda(item);


        Venda venda2 = new Venda();
        venda2.setDataVenda(LocalDate.now());
        venda2.setCliente(cliente);
        ItemVenda item2 = new ItemVenda(produto, 1500.00, 1.0, 10.0);
        venda2.addItemVenda(item2);
        ItemVenda item3 = new ItemVenda(servico, 150.00, 1.0, 10.0);
        venda2.addItemVenda(item3);


//Declaração de Lotacao
        Locacao locacao = new Locacao();
        locacao.setCliente(cliente);
        locacao.setDataLocacao(LocalDate.now());
        ItemLocacao itemL1 = new ItemLocacao(produto, 150.00, 10.0, 0.0);
        locacao.addItemLocacao(itemL1);


        Balanco balanco = new Balanco();
        balanco.setId(321L);
        balanco.setDataBalanco(LocalDate.now());
        balanco.setResponsavel("Maria Luiza");
        balanco.addOperacao(venda);
        balanco.addOperacao(venda2);
        balanco.addOperacao(compra);
        balanco.addOperacao(locacao);
        balanco.imprimirBalanco();
    }
}
