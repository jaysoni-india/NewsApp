import { Injectable } from '@angular/core';

import { HttpClient } from '@angular/common/http';
import { environment } from 'src/environments/environment';

@Injectable({
  providedIn: 'root'
})
export class HttpService {

  newsUrl:string;
  apiUrl:string;

  constructor( private http:HttpClient ) {
        this.newsUrl = environment.newsUrl;
        this.apiUrl = environment.apiUrl;
   }

  doPost(url,data){
      return this.http.post(this.apiUrl+url,data);
  }

  doGet(url){
      return this.http.get(this.apiUrl + url)
  }

  newsGet(url,data){
      return this.http.post(this.newsUrl+url,data);
  }

  newsPost(url){
      return this.http.get(this.newsUrl + url);
  }


}
