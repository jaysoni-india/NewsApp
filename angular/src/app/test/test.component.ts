import { Component, OnInit } from '@angular/core';
import { HttpService } from '../http.service';
// import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-test',
  templateUrl: './test.component.html',
  styleUrls: ['./test.component.css']
})
export class TestComponent implements OnInit {

  // credentials = { email : 'asdflj@dflj.com', password : 'sdlfjlsd' };
   credentials = {
    "email": "eve.holt@reqres.in",
    "password": "cityslicka"
};
    form : any;

  constructor( private http:HttpService) { 
    //  this.http.get('https://reqres.in/api/users?page=2').subscribe(res => {
    //       console.log(res);
    //  });
     localStorage.setItem('token','1sdfsdfsdfsdf');
    // this.enviroment
    //  this.http.doGet('/users?page=3').subscribe( res => {
    //       console.log(res);
    // });
    //  this.http.doPost('/login', this.credentials).subscribe( res => {
    //   console.log(res)
    //   } ,
    //    error => {
    //    console.log(error);
    // });
  }

  ngOnInit() {
  }

  login(e){
    e.preventDefault();
    this.form = e.target;
    console.log(e.target.name.value);
  }

}
