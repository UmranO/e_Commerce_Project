package com.cydeo.category;

import java.time.LocalDateTime;

public class SkinCare extends Category{

    @Override
    public LocalDateTime findDeliveryDueDate() {
        return LocalDateTime.now();
    }
}
