import { MovieSubjectService } from './Shared/movie-subject.service';
import { LocationService } from './Shared/location.service';
import { MoviesService } from './Shared/movies.service';
import { UserService } from './Shared/user.service';
import { BaseService } from './Shared/base.service';
import { LoginService } from './Shared/login.service';
import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';

import { ToastrModule } from 'ngx-toastr';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HttpClientModule } from '@angular/common/http';
import { HeaderComponent } from './allComponents/header/header.component';
import { UserRegisterComponent } from './allComponents/user-register/user-register.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { UserSigninComponent } from './allComponents/user-signin/user-signin.component';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';
import { HomepageComponent } from './allComponents/homepage/homepage.component';
import { LocationComponent } from './allComponents/location/location.component';
import { HomecarouselComponent } from './allComponents/homepage/homecarousel/homecarousel.component';
import { HomecardComponent } from './allComponents/homepage/homecard/homecard.component';
import { BuyticketsComponent } from './allComponents/buytickets/buytickets.component';
import { MovieHeaderComponent } from './allComponents/buytickets/movie-header/movie-header.component';
import { TheatreListComponent } from './allComponents/buytickets/theatre-list/theatre-list.component';
import { SeatlayoutComponent } from './allComponents/seatlayout/seatlayout.component';


@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    UserRegisterComponent,
    UserSigninComponent,
    HomepageComponent,
    LocationComponent,
    HomecarouselComponent,
    HomecardComponent,
    BuyticketsComponent,
    MovieHeaderComponent,
    TheatreListComponent,
    SeatlayoutComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    ReactiveFormsModule,
    HttpClientModule,
    BrowserAnimationsModule,
    ToastrModule.forRoot(),
    NgbModule
  ],
  providers: [
    BaseService,
    LocationService,
    LoginService,
    UserService,
    MoviesService,
    MovieSubjectService
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
