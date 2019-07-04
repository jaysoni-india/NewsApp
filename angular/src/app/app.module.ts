import { NgModule } from '@angular/core';
import { BrowserModule }    from '@angular/platform-browser';
import { HttpClientModule } from '@angular/common/http';

import { AppComponent } from './app.component';
import { AdminComponent } from './admin/admin.component';
import { DashboardComponent } from './admin/dashboard/dashboard.component';
import { AnalystComponent } from './analyst/analyst.component';
import { LoginComponent } from './analyst/login/login.component';
import { RegisterComponent } from './analyst/register/register.component';
import { HomeComponent } from './analyst/home/home.component';
import { AppRoutingModule } from './app-routing.module';
import { FrontComponent } from './front/front.component';

@NgModule({
  declarations: [
    AppComponent,
    AdminComponent,
    DashboardComponent,
    AnalystComponent,
    LoginComponent,
    RegisterComponent,
    HomeComponent,
    FrontComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
