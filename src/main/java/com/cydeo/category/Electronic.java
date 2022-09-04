package com.cydeo.category;

import java.time.LocalDate;
import java.util.UUID;

public abstract class Electronic extends Category{
    public Electronic(UUID id, String name) {
        super(id, name);
    }

    public abstract LocalDate findDeliveryDueDate();
}
