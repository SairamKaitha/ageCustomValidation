package com.tt.customvalidaton.constrants;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class PanValidate implements ConstraintValidator<Pan, String> {

	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		
		return value.matches("[A-Z]{5}[1-9]{4}[A-Z]{1}");
	}

}
