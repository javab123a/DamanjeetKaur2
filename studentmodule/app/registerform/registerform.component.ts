import { Component } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { UserserviceService } from '../services/userservice.service';
import { User } from '../model/user';
@Component({
  selector: 'app-registerform',
  templateUrl: './registerform.component.html',
  styleUrls: ['./registerform.component.css']
})
export class RegisterformComponent  {
user: User;
constructor(
private route: ActivatedRoute,
private router: Router,
private userService: UserserviceService) {
this.user = new User();
}
onSubmit() {
this.userService.save(this.user).subscribe(result => this.gotoUserList());
}
gotoUserList() {
this.router.navigate(['login']);
}
}
