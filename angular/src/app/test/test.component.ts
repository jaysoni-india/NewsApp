import { Component, OnInit } from '@angular/core';
import { HttpService } from '../http.service';
// import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-test',
  templateUrl: './test.component.html',
  styleUrls: ['./test.component.css']
})
export class TestComponent implements OnInit {

  constructor( private http:HttpService) { 
     console.log('hi roshni');
    //  this.http.get('https://reqres.in/api/users?page=2').subscribe(res => {
    //       console.log(res);
    //  });
    //  localStorage.setItem('token','1sdfsdfsdfsdf');
    // this.enviroment
  }

  ngOnInit() {
  }

}
