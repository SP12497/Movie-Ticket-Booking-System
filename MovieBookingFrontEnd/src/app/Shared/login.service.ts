import { User } from './../classesEntity/User';
import { BaseService } from './base.service';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class LoginService {

  constructor(private baseService : BaseService) { }

  postLogin(loginForm:User){
    return this.baseService.postLogin(loginForm);
   }

   listofdates(movie)
   {

   }
}
