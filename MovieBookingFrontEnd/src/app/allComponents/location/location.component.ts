import { City } from './../../classesEntity/City';
import { LocationService } from './../../Shared/location.service';
import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-location',
  templateUrl: './location.component.html',
  styleUrls: ['./location.component.css']
})
export class LocationComponent implements OnInit {

  constructor(private _city : LocationService , private router: Router) {
    console.log("Location Constructor");
  }

  cities:any;

  isShowCity=false;
  showCities()
  {
    this.isShowCity=true;
  }

  ngOnInit(): void {
    this.getAllCities();
  }


  getAllCities()
  {
    this._city.getCities()
    .subscribe(
      (data)=>{
        let jsoncities = JSON.stringify(data);
        this.cities = JSON.parse(jsoncities);
      },
      (error)=>{console.log("error : "+ error + " Cant get the cities...");}
      );
  }


  setCityName(city)
  {
   console.log("City : " + JSON.stringify(city))

   this._city.setCityName(city).subscribe(
     (data)=>{
       console.log("city setted : " + JSON.stringify(data))
     },
     (err)=>{
       console.log("Error : "+ err);
     }
   )


    alert("You selected " + city.cityname + " city.");
    this.router.navigateByUrl("/home");
  }



}
