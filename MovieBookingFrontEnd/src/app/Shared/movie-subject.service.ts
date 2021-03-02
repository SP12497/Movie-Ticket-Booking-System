import { Injectable } from '@angular/core';
import { BehaviorSubject, Subject } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class MovieSubjectService {

  constructor() { }

  DatesOfMovieShow = new Subject<any>();

  selectedMovie = new BehaviorSubject<any>("Selected Movie");

  selectedShow = new BehaviorSubject<any>("selected show when click on the theatre");

  MoviesList = new BehaviorSubject<any>("selected show not received");

}
