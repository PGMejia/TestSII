import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class EmployeeService {

 private BASE_URL = 'http://localhost:9090';  // replace with your backend endpoint

  constructor(private http: HttpClient) { }

  getAllEmployees(): Observable<any> {
    return this.http.get(`${this.BASE_URL}/employees`);
  }

  getEmployeeById(id: string): Observable<any> {
    return this.http.get(`${this.BASE_URL}/employees/${id}`);
  }
}
