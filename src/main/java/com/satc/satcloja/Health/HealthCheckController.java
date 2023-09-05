package com.satc.satcloja.Health;

import com.satc.satcloja.model.Produto;
import com.satc.satcloja.model.Status;
import com.satc.satcloja.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
public class HealthCheckController {

    @Autowired
    public ProdutoRepository produtoRepository;

    @GetMapping("/health")
    public String healthCheck() {
        Produto produto = new Produto();
        produto.setDescricao("Intel Pentium I5");
        produto.setNome("PC Intel");
        produto.setValorUnitario(1000.00);
        produto.setDataPrazo(LocalDate.now());
        produto.setDataValidade(LocalDate.now());
        produto.setStatus(Status.DISPONIVEL);
        produto.setEstocavel(Boolean.TRUE);
        produto.setPrecoCompra(15000.00);

        produto = produtoRepository.save(produto);

        return "Comando Executado";
    }


}
