import { Injectable } from '@angular/core';
import { Router, CanActivate, ActivatedRouteSnapshot, RouterStateSnapshot } from '@angular/router';
import { UserserviceService } from '../services/userservice.service';
@Injectable({ providedIn: 'root' })
export class AuthGuard implements CanActivate {
constructor(
private router: Router,
private admindataService: UserserviceService
) {}
canActivate(route: ActivatedRouteSnapshot, state: RouterStateSnapshot) {
const currentUser = this.admindataService.currentUserValue;
if (currentUser) {
// authorised so return true
return true;
}
// not logged in so redirect to login page
this.router.navigate(['feedbackform'], { queryParams: { returnUrl: state.url }});
return false;
}
}
