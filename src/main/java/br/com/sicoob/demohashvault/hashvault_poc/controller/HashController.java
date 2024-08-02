package br.com.sicoob.demohashvault.hashvault_poc.controller;

import br.com.sicoob.demohashvault.hashvault_poc.service.HashService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class HashController {

    @Autowired
    private HashService hashService;

   /** @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("hashes", hashService.getHashes());
        return "index";
    }*/

    @PostMapping("/addHash")
    public String addHash(@RequestParam("hash") String hash, Model model) {
        hashService.addHash(hash);
        return "redirect:/";
    }

   @GetMapping("/")
    public String index(Model model) {
        List<String> hashes = hashService.getHashes(); // Obter hashes do HashVault
        model.addAttribute("hashes", hashes); // Adicionar ao modelo
        return "index";
    }
}
