import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { User } from './model/user';
import { UserserviceService } from './services/userservice.service';
@Component({
selector: 'app-root',
templateUrl: './app.component.html',
styleUrls: ['./app.component.css']
})
export class AppComponent {
currentUser: User;
title: string;
constructor(private router: Router, private admindataService: UserserviceService )
{
this.title = 'BTES FEEDBACK PORTAL';
this.admindataService.currentUser.subscribe(x => this.currentUser = x);
console.log('CurrentUser=' + this.currentUser);
}
}
