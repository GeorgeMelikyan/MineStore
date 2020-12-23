package com.adventures.MineStore.repo;

import com.adventures.MineStore.models.Purchase;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PurchaseRepository extends CrudRepository<Purchase, Long> {
    List<Purchase> findAllByPlayerLike(String player);
}
