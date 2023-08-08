import { Component } from '@angular/core';
import { EmployeeService } from 'src/app/services/employee.service';

@Component({
  selector: 'app-employee',
  templateUrl: './employee.component.html',
  styleUrls: ['./employee.component.css']
})
export class EmployeeComponent {

  employeeId: string = '';
  employees: any[] = [];

  constructor(private employeeService: EmployeeService) { }

  ngOnInit(): void {}

  fetchEmployeeData(): void {
    if (this.employeeId) {
      this.employeeService.getEmployeeById(this.employeeId).subscribe(data => {
        this.employees = [data];  // since it returns a single employee, convert it to an array
      });
    } else {
      this.employeeService.getAllEmployees().subscribe(data => {
        this.employees = data;
      });
    }
  }

}
