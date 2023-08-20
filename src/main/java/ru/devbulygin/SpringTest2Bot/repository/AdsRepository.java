package ru.devbulygin.SpringTest2Bot.repository;

import org.springframework.data.repository.CrudRepository;
import ru.devbulygin.SpringTest2Bot.model.Ads;

public interface AdsRepository extends CrudRepository<Ads, Long> {
}
