package org.jnosql.demo.se;

import jakarta.nosql.mapping.Repository;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public interface DrinkRepository extends Repository<Drink, String> {
}
