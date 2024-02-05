package com.rania.minigestiondestock.repository;


import java.util.List;
import java.util.Optional;

import com.rania.minigestiondestock.model.CommandeClient;
import com.rania.minigestiondestock.model.CommandeFournisseur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommandeFournisseurRepository extends JpaRepository<CommandeFournisseur, Integer> {

  Optional<CommandeFournisseur> findCommandeFournisseurByCode(String code);

  List<CommandeClient> findAllByFournisseurId(Integer id);
}
