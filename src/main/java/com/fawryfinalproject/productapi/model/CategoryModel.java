package com.fawryfinalproject.productapi.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.ConstraintViolationException;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import org.springframework.web.bind.MethodArgumentNotValidException;

@Data
public class CategoryModel {
    public CategoryModel() {
    }

    public CategoryModel(String name) {
        this.name = name;
    }

//    @Min(value = 1, message = "Category ID must be a positive number")
    private int categoryId;

    @NotBlank(message = "Category name cannot be blank")
    @JsonProperty("CategoryName")
    private String name;


}
