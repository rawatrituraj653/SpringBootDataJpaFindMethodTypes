package com.st.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@RequiredArgsConstructor
public class Product {
		@Id
		@NonNull
		private Integer prodId;
		@NonNull
		private String comName;
		@NonNull
		private String prodName;
		@NonNull
		private Double prodCost;
}
