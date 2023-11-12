package com.atradius;

import java.math.BigDecimal;

public record Product(Long id, String code, String name, String description, BigDecimal price) {}