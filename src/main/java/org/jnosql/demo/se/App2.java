/*
 * Copyright (c) 2022 Contributors to the Eclipse Foundation
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  and Apache License v2.0 which accompanies this distribution.
 *  The Eclipse Public License is available at http://www.eclipse.org/legal/epl-v10.html
 *  and the Apache License v2.0 is available at http://www.opensource.org/licenses/apache2.0.php.
 *
 * You may elect to redistribute this code under either of these licenses.
 */

package org.jnosql.demo.se;


import jakarta.nosql.mapping.document.DocumentTemplate;

import javax.enterprise.inject.se.SeContainer;
import javax.enterprise.inject.se.SeContainerInitializer;
import java.math.BigDecimal;
import java.util.Optional;

public class App2 {


    public static void main(String[] args) {

        try (SeContainer container = SeContainerInitializer.newInstance().initialize()) {
            DrinkRepository repository = container.select(DrinkRepository.class).get();
            MeasurementValue measurement = MeasurementValue.of("L", BigDecimal.valueOf(1L));
            Drink drink = new Drink("water", "Bottled water\n", measurement);
            repository.save(drink);
            Optional<Drink> water = repository.findById("water");
            System.out.println("The water " + water);

        }
    }

    private App2() {
    }
}
