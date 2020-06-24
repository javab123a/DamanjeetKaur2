import { Component, OnInit } from '@angular/core';
import { User } from '../model/user';
import { UserService } from '../service/user-service.service';
import { UpdateService } from '../service/updateservice.service';
import { ActivatedRoute, Router } from '@angular/router';
import {MatDialog, MatDialogRef, MAT_DIALOG_DATA} from '@angular/material/dialog';
@Component({
  selector: 'app-user-list',
  templateUrl: './user-list.component.html',
  styleUrls: ['./user-list.component.css']
})
export class UserListComponent implements OnInit {
    users: User[];
user: User;
public dialog: MatDialog;
name: string='Data  Updated Successfully';
selectedStudent: User = new User();
  constructor(private route: ActivatedRoute,
private router: Router, 
	private userService: UserService,  private updateservice: UpdateService) {
		this.user = new User();
	 }
editStudent(user: User){
if (confirm(`Are you sure you want to update the id ${user.id}. This cannot be undone.`)){
     this.selectedStudent = new User();
     this.selectedStudent.id=user.id;
     this.selectedStudent.name=user.name;
this.selectedStudent.password=user.password;
     this.selectedStudent.email=user.email;
     this.selectedStudent.technology=user.technology;
     this.selectedStudent.batch=user.batch;
   }
}
   editselectedStudent(){
	console.log(this.selectedStudent.id);
	this.updateservice.save(this.selectedStudent).subscribe(data => {
	this.user = data;
	console.log(this.user);
	
});
alert('Data Updated!')
 /* this.dialog.open(UserListComponent, {
      width: '250px',
      data: {name: this.name}
    }); */
}	
  ngOnInit() {
	this.userService.findAll().subscribe(data => {
		 this.users = data;
	});
  }
deleteUser(user: User){
    if (confirm(`Are you sure you want to update the id ${user.id}. This cannot be undone.`)){
         this.userService.deleteById(user).subscribe(data => {
          this.user = data;
});
alert('Data Deleted!')
    }
}
/*editUser(user: User){
    if (confirm(`Are you sure you want to update the id ${user.id}. This cannot be undone.`)) {
       this.router.navigate(['updatefeedback']);
}
}*/
}
