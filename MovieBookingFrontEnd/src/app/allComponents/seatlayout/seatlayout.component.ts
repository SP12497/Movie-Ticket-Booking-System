import { Component, OnInit } from '@angular/core';
import { SeatService } from './../../Shared/seat.service';
import { MovieSubjectService } from 'src/app/Shared/movie-subject.service';

@Component({
  selector: 'app-seatlayout',
  templateUrl: './seatlayout.component.html',
  styleUrls: ['./seatlayout.component.scss']
})
export class SeatlayoutComponent implements OnInit {


  constructor(private _Seat : SeatService,
    private _movieSubject : MovieSubjectService)
    {
    this._movieSubject.selectedShow.subscribe(
      (data)=>{this.myShow=data;}
    )
    }


  myShow:any;


ngOnInit(): void {
  this.getSeats(this.myShow);

  console.log("SeatShow : "+ JSON.stringify(this.myShow))

  //initialize isSelectedArray:
for (let i = 0; i < 200; i++) {
  this.isSelectedArray.push(false);

}
}


isSelectedArray: Array<boolean> =new Array();
MySeat=[];
count:number = 0;



seats:any;

seatClick(index , seat){
    // console.log("index : " + index );
      if(this.isSelectedArray[index] == false){    //if selecting the seat

        this.isSelectedArray[index] = true;
        this.MySeat.push(seat);
        this.count++;
      }

      else{                                        //when unselecting the seat
        this.isSelectedArray[index] = false;

        let arrindex = 0;
        let myseatindex : any;
        for(let arrseat of this.MySeat)         // find the index of seat object
        {
            if(arrseat.seatNumber == seat.seatNumber)
            {
              myseatindex = arrindex;
            }
            arrindex++;
        }

        this.MySeat.splice(myseatindex, 1);      //pop the seat from mysql
        this.count--;
      }
    // console.log(JSON.stringify("MySeat"+ JSON.stringify(this.MySeat)))

    // console.log("Count : " + this.count );

  }


  isChoose(){
    // console.log("length : " + this.MySeat.length)
    return this.MySeat.length ==0;
  }

  maketrue(){
    for(let seat of this.MySeat)
    {
      seat.isBooked=true;
    }
  }

  popAll(){      // remove data from MySeat
    let aarrindex = 0;
    for(let arrseat of this.MySeat)
    {
      this.MySeat.splice(aarrindex, 1);
      aarrindex++;
    }

    console.log("After pop : "  + JSON.stringify(this.MySeat))

  }

  BookTicket()
  {
    this.maketrue();
    // console.log("maketrue() : " + JSON.stringify(this.MySeat))

    this._Seat.setListOfSeats(this.MySeat).subscribe(
      (data)=>{
        console.log("new Seats : " + JSON.stringify(data));
        alert("Your ticket booked successfully...");
        this.popAll();
        this.popAll();
        this.count = 0;
      },
      (error)=>{
        console.log("error seat : "+ error );
      }
    )

  }





  seatsList:any;

  getSeats(currentshow)
  {
    this._Seat.getListOfSeats(currentshow)
    .subscribe(
      (data)=>{
        this.seatsList=data;
        // console.log("seat list:"+ JSON.stringify(data))
        this.fun();
        // console.log(this.myarray)
      },
      (error)=>{console.log("error : "+ error + " Cant get the seats...");}
      );
  }

  myarray = [];      //2D seat list
  // toalseats=50;

  checkSeat(){
    for (let seats of this.myarray)
    {
      // for (let seat of this.seats)
      // {
        if(seats.isBooked==true)
        {
          seats.isBooked=false
        }
        else{
          seats.isBooked=true;
        }
      // }
    }
  }

//convert 1D into 2D array
  fun()
  {
      let arr =[];

      for (let seat of this.seatsList)
      {
        arr.push(seat)

        if(seat.seatNumber % 10 == 0)
        {
          this.myarray.push(arr);
          arr = new Array();
        }
      }
    }

}


