import { Injectable } from '@angular/core';
import { BaseService } from './base.service';
import {Movieshow} from '../classesEntity/Movieshow';


@Injectable({
  providedIn: 'root'
})
export class SeatService {

  constructor(private _baseService : BaseService) { }

  getListOfSeats(showid){
    return this._baseService.getListOfSeats(showid);
  }

  setListOfSeats(MySeat:any){
    return this._baseService.setListOfSeats(MySeat);
  }
}
