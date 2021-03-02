import { MovieSubjectService } from './../../../Shared/movie-subject.service';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-movie-header',
  templateUrl: './movie-header.component.html',
  styleUrls: ['./movie-header.component.scss']
})
export class MovieHeaderComponent implements OnInit {

  constructor(private _Moviesubject : MovieSubjectService) {
    this.getMovie();
  }

  ngOnInit(): void {
    console.log("In Movie Header " + this.movie.title)
  }



  movie:any;
  getMovie(){
    this._Moviesubject.selectedMovie.subscribe(data=>{
      this.movie = data;
    })
  }


}
