package com.project.productservice.dto;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

// so we may be confused why we created separate class for productresponse maybe cant we use the product
// class from model package instead of creating product response this is because its a good practise to separate your model entites and 
// dtos ideally we should not expose our model entities to outside world bcoz in future in this product class i have added two fields
// which are like necessary for buisneess model we should no expose those 2 fields which are not necessary to outside world so thats why its good practise to
// separete model entites and data transfer objects
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProductResponse {
	private String id;
	private String name;
	private String description;
	private BigDecimal price;
}
