import { Router } from '@angular/router';
import { UserService } from './../../Shared/user.service';
import { Component, OnInit, SimpleChanges } from '@angular/core';

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.css']
})
export class HeaderComponent implements OnInit {

  constructor(public _user : UserService,
              private router : Router) { }

  ngOnInit(): void {
  }



  logout()
  {
    this._user.logout();
    this.router.navigateByUrl("/signin");
  }

}
