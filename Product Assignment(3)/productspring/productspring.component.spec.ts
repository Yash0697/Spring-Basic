import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ProductspringComponent } from './productspring.component';

describe('ProductspringComponent', () => {
  let component: ProductspringComponent;
  let fixture: ComponentFixture<ProductspringComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ProductspringComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ProductspringComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
