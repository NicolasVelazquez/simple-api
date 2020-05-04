package com.apiapp.payroll;

public class EmployeeNotFoundException extends RuntimeException {

	private static final long serialVersionUID = -8179769824945344417L;

public EmployeeNotFoundException(Long id) {
    super("Could not find employee " + id);
  }
}