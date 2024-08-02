package br.com.sicoob.demohashvault.hashvault_poc.service;



import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class HashService {

    // Simulando armazenamento em memória (substitua pela integração com o HashVault)
    private List<String> hashes = new ArrayList<>();

    public List<String> getHashes() {
        // Lógica para recuperar hashes do HashVault
        return hashes;
    }

    public void addHash(String hash) {
        // Lógica para adicionar hash ao HashVault
        hashes.add(hash);
    }
}

