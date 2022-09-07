package com.cydeo.category;

import java.time.LocalDate;
import java.util.UUID;

public abstract class Electronic extends Category{
    public Electronic(UUID id, String name) {
        super(id, name);
    }

    @Override
    public String generateCategoryCode() {
        return "EL-" + getId().toString().substring(0,8);
    }

    public LocalDate findDeliveryDueDate() {
        return null;
    }
}
