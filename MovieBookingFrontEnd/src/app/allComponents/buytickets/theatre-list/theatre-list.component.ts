import { MovieShowService } from './../../../Shared/movie-show.service';
import { MovieSubjectService } from './../../../Shared/movie-subject.service';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-theatre-list',
  templateUrl: './theatre-list.component.html',
  styleUrls: ['./theatre-list.component.scss'],
})
export class TheatreListComponent implements OnInit {


  constructor(
    private _Moviesubject: MovieSubjectService,
    private _movieShow: MovieShowService,

  ) {
    this.getMovie();
    // this.getListOfDates(this.movie);
  }

  ngOnInit(): void {
    this.getListOfDates(this.movie);

  }


//get one movie :
  movie: any;
  getMovie() {
    this._Moviesubject.selectedMovie.subscribe((data) => {
      this.movie = data;
    });
  }

//get list of dates of the selected movie :
  showDates: any;
  getListOfDates(movie) {
    this._movieShow.listOfShowDates(movie)
    .subscribe(
      (dates) => {
        this.showDates = dates;
        this._Moviesubject.DatesOfMovieShow.next(dates);
      },
      (error) => {
        console.log('error : ' + error + ' Cant get the Movies...');
      }
      );
    }





  DateMovie={
    "date":"",
    "movieid" : ""
  }

  isDateAvailable:Boolean =false;    //hide the show tables
  ShowDetails:any;      //list of show theathre

  //get list of theatre at a perticular date :
  GetShowList(mydate){
    this.DateMovie.date = mydate;
    this.DateMovie.movieid = this.movie.movieId;

    this._movieShow.getShowsList(this.DateMovie)
    .subscribe(
      (data)=>{
        // console.log(data);
        this.ShowDetails = data;
        this.isDateAvailable = true;
      },
      (error)=>{
        console.log("error : " + error)
      }
    )


    // console.log("Date and Movie :" + this.DateMovie.movieid + " " + this.DateMovie.date)
  }

  //when click on the theatre :
  selectshow(show)
  {
    console.log("theatre list selected show: "+ show);
    this._Moviesubject.selectedShow.next(show);
  }
}
