import { MovieShowService } from './../../Shared/movie-show.service';
import { MovieSubjectService } from './../../Shared/movie-subject.service';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-buytickets',
  templateUrl: './buytickets.component.html',
  styleUrls: ['./buytickets.component.css']
})
export class BuyticketsComponent implements OnInit {


  constructor(private _Moviesubject : MovieSubjectService,
              private _movieShow : MovieShowService)
  {
    this.getMovie();
  }

  ngOnInit(): void {
    console.log("In Movie Theathre " + this.movie.title)
  }



  movie:any;
  getMovie(){
    this._Moviesubject.selectedMovie.subscribe(data=>{
      this.movie = data;
    })
  }


  showDates:any;
  getListOfDates(movie){
     this._movieShow.listOfShowDates(movie)
      .subscribe(
        (dates)=>{
          this.showDates = dates ;
          this._Moviesubject.DatesOfMovieShow.next(dates)
          console.log(dates)
        },
        (error)=>{console.log("error : "+ error + " Cant get the Movies...");}
      )
  }




}
