import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

import { FrontComponent } from './front/front.component';
import { AdminComponent } from './admin/admin.component';
import { DashboardComponent } from './admin/dashboard/dashboard.component';
import { RegisterComponent } from './analyst/register/register.component';
import { LoginComponent } from './analyst/login/login.component';
import { HomeComponent } from './analyst/home/home.component';

const routes: Routes = [
  { path: '', component: FrontComponent },
  { path: 'login', component: LoginComponent },
  { path: 'register', component: RegisterComponent },
  { path: 'home', component: HomeComponent },
  { path: 'admin', component: AdminComponent },
  { path: 'dashboard', component: DashboardComponent },
];

@NgModule({
  exports: [ RouterModule ],
  imports: [ RouterModule.forRoot(routes) ],
})
export class AppRoutingModule {}