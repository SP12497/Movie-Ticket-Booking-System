import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { User } from '../classesEntity/User';

@Injectable({
  providedIn: 'root'
})
export class BaseService {



  Url='http://localhost:8082/'
  constructor(private http:HttpClient) { }

  postRegister(userForm:any):Observable<any>{
    console.log(JSON.stringify(userForm));
    return this.http.post<any>("http://localhost:8082/register",userForm);
  }

  getRegister():Observable<User>{
    return this.http.get<User>(this.Url+'GetRegister');
  }
  deleteRegister(userId:any):Observable<any>{
    return this.http.delete(this.Url+'DeleteRegister'+userId);
  }


  //User Login :
  postLogin(userLogin:any):Observable<any>{
    return this.http.post<any>('http://localhost:8082/login',userLogin);
  }

 //City location :
  //Get Citites :
  getCities():Observable<any>{
    return this.http.get<any>(this.Url+"city");
  }

  //Set City :
  setCityName(city:any):Observable<any>{
    return this.http.post<any>(this.Url+'setcity',city);
  }

//Movies :
  getListOfMovies():Observable<any>{
    return this.http.get<any>(this.Url+"getmovielist");
  }

  listOfShowDates(movie:any):Observable<any>{
    return this.http.post<any>(this.Url+"listofdates",movie);
  }

//getShowsByMoviesAndDate :
  getShowsList(DateMovie:any):Observable<any>{
    return this.http.post<any>(this.Url+"getShowsByMovies",DateMovie);
  }

//getListOfSeats :
  getListOfSeats(show:any):Observable<any>{
    return this.http.post<any>(this.Url+"listofseats",show);
  }

//setListOfSeats :
setListOfSeats(MySeat:any):Observable<any>{
  return this.http.post<any>(this.Url+"setseat",MySeat);
}


















}











