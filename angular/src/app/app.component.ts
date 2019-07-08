import { Component } from '@angular/core';
import { AuthService } from './auth.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
   constructor( private auth:AuthService,private router:Router){
        if ( auth.isLoggedIn() ){
          //  this.router.navigate['/home'];
        }
        // console.log('code ex');
   }
}
