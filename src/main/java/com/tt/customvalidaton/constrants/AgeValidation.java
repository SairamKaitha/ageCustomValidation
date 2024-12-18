package com.tt.customvalidaton.constrants;

import java.time.LocalDate;
import java.time.Period;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class AgeValidation implements ConstraintValidator<Age, LocalDate> {

	@Override
	public boolean isValid(LocalDate value, ConstraintValidatorContext context) {
		//age must greater than or equal to 18 i.e here value is DOB given value and localdate is current date 
		return Period.between(value, LocalDate.now()).getYears()>=18;
	}

}