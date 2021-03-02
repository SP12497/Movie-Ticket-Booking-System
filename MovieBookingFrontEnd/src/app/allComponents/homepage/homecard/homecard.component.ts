import { MovieSubjectService } from './../../../Shared/movie-subject.service';
import { MoviesService } from './../../../Shared/movies.service';
import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-homecard',
  templateUrl: './homecard.component.html',
  styleUrls: ['./homecard.component.scss']
})
export class HomecardComponent implements OnInit {

  constructor(private _movies : MoviesService,
              private _Moviesubject : MovieSubjectService,
              private router : Router
            ) {}

  ngOnInit(): void {
    this.getMoviesList();
  }

  movies : any;

  getMoviesList(){
    this._movies.getListOfMovies()
    .subscribe(
      (data)=>{
        this.movies = data;
        console.log(this.movies)

      },
      (error)=>{console.log("error : "+ error + " Cant get the Movies...");}
    )
  }

  selectedMovie(clickedmovie)
  {
    this._Moviesubject.selectedMovie.next(clickedmovie);

    this.router.navigate(['buyticket']);


  }












}
