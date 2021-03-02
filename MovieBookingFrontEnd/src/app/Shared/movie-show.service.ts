import { BaseService } from './base.service';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class MovieShowService {

  constructor(private _baseService : BaseService) { }

  listOfShowDates(movie){
    return this._baseService.listOfShowDates(movie);
  }



  getShowsList(DateMovie:any){
    return this._baseService.getShowsList(DateMovie);
  }

}
