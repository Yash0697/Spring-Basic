export class Product{

prodId: number;
  prodName: string;
  prodPrice:number;

  constructor(prodId: number, prodName: string, prodPrice:number){
      this.prodId = prodId;
      this.prodName = prodName;
      this.prodPrice = prodPrice;
  }

  // constructor(){
  //   this.prodId = null;
  //   this.prodName = null;
  //   this.prodPrice = null;
  // }

}