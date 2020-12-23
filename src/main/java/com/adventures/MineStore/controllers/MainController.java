package com.adventures.MineStore.controllers;

import com.adventures.MineStore.models.Purchase;
import com.adventures.MineStore.repo.ProductRepository;
import com.adventures.MineStore.repo.PurchaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class MainController {

    @Autowired
    private PurchaseRepository purchaseRepository;

    @Autowired
    private ProductRepository productRepository;

    @GetMapping("/")
    public String main(Model model) {
        String name = "MineStore Welcome!";
        model.addAttribute("name", name);
        return "Main";
    }

    @GetMapping("/{name}")
    public String checkName(@PathVariable String name, String product, Model model) {

        List<Purchase> purchases = purchaseRepository.findAllByPlayerLike(name);
        String purchase2 = purchases.get(0).getPlayer();
        model.addAttribute("name", purchase2);
        return "Main";
    }

    @GetMapping("/buy-token")
    public String buyToken(String name, String amount, Model model) {



        return "Main";
    }

}
