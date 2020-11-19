import {Injectable} from '@angular/core';
import {HttpClient} from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class ApiService {

  constructor(private http: HttpClient) {

  }

  sendOrder(order: string): void {
    this.http.post<any>(`http://back:8080/add/order`, order).subscribe((data) => {
      console.log(data);
    });
  }

}
