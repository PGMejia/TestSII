package com.thales.entity;

public class EmployeeResponseWrapper {
	 	private String status;
	    private String message;
	    private Employee data;
	    
	    
		public String getStatus() {
			return status;
		}
		public void setStatus(String status) {
			this.status = status;
		}
		public String getMessage() {
			return message;
		}
		public void setMessage(String message) {
			this.message = message;
		}
		public Employee getData() {
			return data;
		}
		public void setData(Employee data) {
			this.data = data;
		}

}
