import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Product } from './productspring/Product';


@Injectable({
  providedIn: 'root'
})
export class ProductspringService {

  constructor(private http: HttpClient) { }

  private baseUrl = "http://localhost:8074/product/";
 
  getProducts() : Observable<any>{
    return this.http.get<Product>(`${this.baseUrl}` + `products`)
  }

  addProduct(product:any) :Observable<Object>{
    alert(product.productName);
    const httpOptions = {
      headers: new HttpHeaders({
        'Content-Type': 'application/json',
        'Authorization': 'my-auth-token'
      })
    };
    return this.http.post(`${this.baseUrl}` + `addProduct1`, product, httpOptions);
  }

  addProduct1(query:string):Observable<Object>{
    return this.http.get(`${this.baseUrl}` + 'addProduct' + query);
  }

  deleteProduct(product){
    return this.http.delete(`${this.baseUrl}` + product.productId)
  }
}
