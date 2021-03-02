import { BaseService } from './base.service';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class MoviesService {

  constructor(private _baseService : BaseService) { }

  getListOfMovies()
  {
    return this._baseService.getListOfMovies();
  }


}
