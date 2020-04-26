import { Component, OnInit } from '@angular/core';
import { ProductspringService } from '../productspring.service';
import { Product } from './Product';

@Component({
  selector: 'app-productspring',
  templateUrl: './productspring.component.html',
  styleUrls: ['./productspring.component.css']
})
export class ProductspringComponent implements OnInit {

  constructor(private myService: ProductspringService) { }

  prodId: number;
  prodName: string;
  prodPrice:number;
  queryString : string;
  products : Product[];
  product : Product;
  ngOnInit(): void {
    this.myService.getProducts().subscribe(data => {
      this.products = data;
    });
    
  }

  showProducts(){
    this.myService.getProducts().subscribe(data => {
      this.products = data;
    });
  }

  addProduct(){
    alert(this.prodName);
    this.product = new Product(this.prodId, this.prodName, this.prodPrice);
    this.queryString = '/?productId='+this.prodId+ '&productName=' + this.prodName+'&productPrice=' + this.prodPrice;
    // this.myService.addProduct(this.product).subscribe( data =>
    //   {
    //   alert("Product created successfully.");
    //   });
    this.myService.addProduct1(this.queryString).subscribe(data => {
    });
      alert("Product created successfully.");
       this.ngOnInit();
       location.reload();
    
  }

  deleteProduct(product1: any) : void {
    this.myService.deleteProduct(product1)
      .subscribe(data => {
      })
      alert(product1.productName +" Deleted");
      this.ngOnInit();
      location.reload();
  }
  

}
