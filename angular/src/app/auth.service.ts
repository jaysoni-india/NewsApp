import { Injectable } from '@angular/core';
import { HttpService } from './http.service';
import { Router } from '@angular/router';

@Injectable({
  providedIn: 'root'
})
export class AuthService {

  constructor(private http:HttpService, private router:Router ) { }
 
    login(user:any){
       this.http.doPost('/login',user).subscribe( resp => {
         console.log(resp);
       });
    }

    register(userData){
      this.http.doPost('/login',userData).subscribe( resp => {
        console.log(resp);
      });

    }

    admninLogin(user){
      this.http.doPost('/login',user).subscribe( resp => {
        console.log(resp);
      });
     }
    
     logout(){
        localStorage.removeItem('token');
        this.router.navigate(['/']);
    }

    isAdmin(){

    }

    isLoggedIn(){
        return !! localStorage.getItem('token');
    }

}
