import { TheatreListComponent } from './allComponents/buytickets/theatre-list/theatre-list.component';
import { BuyticketsComponent } from './allComponents/buytickets/buytickets.component';
import { LocationComponent } from './allComponents/location/location.component';
import { HomepageComponent } from './allComponents/homepage/homepage.component';
import { UserRegisterComponent } from './allComponents/user-register/user-register.component';
import { UserSigninComponent } from './allComponents/user-signin/user-signin.component';
import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { SeatlayoutComponent } from './allComponents/seatlayout/seatlayout.component';


const routes: Routes = [
  {path:"" , component: HomepageComponent },
  {path:"signin" , component : UserSigninComponent},
  {path:"register" , component : UserRegisterComponent},
  {path:"location" , component : LocationComponent},
  {path:"buyticket" , component : BuyticketsComponent},
  {path:"theatres" , component : TheatreListComponent},
  {path:"home" , component: HomepageComponent },
  {path: "seat", component: SeatlayoutComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
