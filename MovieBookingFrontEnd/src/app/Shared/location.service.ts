import { BaseService } from './base.service';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class LocationService {


  constructor(private _baseService : BaseService) { }

  getCities(){
    return this._baseService.getCities();
   }

   setCityName(cityname:any){
    return this._baseService.setCityName(cityname);
   }




}
