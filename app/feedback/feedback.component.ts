import { Component, OnInit } from '@angular/core';
import { Admin } from '../model/admin';
import { AdminService } from '../service/adminservice.service';
import { ActivatedRoute, Router } from '@angular/router';
@Component({
  selector: 'app-feedback',
  templateUrl: './feedback.component.html',
  styleUrls: ['./feedback.component.css']
})
export class FeedbackComponent implements OnInit {
    admins: Admin[];
admin: Admin;
selectedQuestion: Admin = new Admin();
  constructor(private route: ActivatedRoute,
private router: Router,
	private adminService: AdminService) {
		this.admin = new Admin();
	 }

  ngOnInit() {
	this.adminService.findAll().subscribe(data => {
		 this.admins = data;
	});
  }

editQuestions(){
	console.log(this.selectedQuestion.id);
	this.adminService.save(this.selectedQuestion).subscribe(data => this.gotoFeedback());
	console.log(this.admin);
}
gotoFeedback() {
this.router.navigate(['feedback']);
}
deleteUser(admin: Admin){
    if (confirm(`Are you sure you want to update the id ${admin.id}. This cannot be undone.`)){
         this.adminService.deleteById(admin).subscribe(data => {
this.admins = data;
});
    }
}
editUser(admin: Admin){
    if (confirm(`Are you sure you want to update the id ${admin.id}. This cannot be undone.`)) {
       this.selectedQuestion = new Admin();
     this.selectedQuestion.id=admin.id;
     this.selectedQuestion.questions=admin.questions;
}
}
}
