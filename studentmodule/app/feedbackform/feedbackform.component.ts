import { Component, OnInit, Input} from '@angular/core';
import { FeedbackserviceService } from '../services/feedbackservice.service';
import { ActivatedRoute, Router } from '@angular/router';
import { Result } from '../model/result';
import { FormBuilder, FormGroup, FormControl} from '@angular/forms';
import { UserserviceService } from '../services/userservice.service';
import { Admin } from '../model/admin';
@Component({
  selector: 'app-feedbackform',
  templateUrl: './feedbackform.component.html',
  styleUrls: ['./feedbackform.component.css']
})
export class FeedbackformComponent implements OnInit {
/* form= new FormGroup({
	options: new FormControl("Validators.required")
});
get f(){
	return this.form.controls;
}*/
public currentUser: any;
feedback: Admin[];
    results: Result;
 arr: any=[100];
  constructor(private route: ActivatedRoute, 
private router: Router,
private userService: FeedbackserviceService, private admindataService: UserserviceService) { 
	this.results =new Result();
	console.log('inside feedbackform' + localStorage.getItem(' currentUser '));
this.currentUser = localStorage.getItem('currentUser') ? JSON.parse(localStorage.getItem('currentUser')) : '';
this.admindataService.currentUser.subscribe(x => this.currentUser = x);
console.log('CurrentUser=' + this.currentUser);
}
ngOnInit() {
	this.userService.findAll().subscribe(data => {
this.feedback = data;
});
}
changeOption(opt){
	console.log(opt.target.value);

	/* this.arr[this.i]=opt.target.value;
	this.i++;*/
}
/*onSelectionChange(opts) {
        Object.assign({}, this.selectedEntry, opts);
console.log(opts.target.value);

	this.arr[this.i]=opts.target.value;
	this.i++;
    }*/
/*onFormSubmit(id: number){
	this.userService.selectById(id).subscribe(data => {
this.results = data;
});
}*/

onSubmit() {
	this.results.id=this.currentUser.id;
	this.results.question1=this.arr[1];
	this.results.question2=this.arr[2];
	this.results.question3=this.arr[3];
	this.results.question4=this.arr[4];
	this.results.question5=this.arr[5];
	this.results.question6=this.arr[6];
	this.results.question7=this.arr[7];
	this.results.question8=this.arr[8];
	this.results.question9=this.arr[9];
	this.results.question10=this.arr[10];
	this.results.question11=this.arr[11];
	this.results.question12=this.arr[12];
	this.results.question13=this.arr[13];
	this.results.question14=this.arr[14];
	this.results.question15=this.arr[15];
	this.results.question16=this.arr[16];
	this.results.question17=this.arr[17];
	this.results.question18=this.arr[18];
	this.results.question19=this.arr[19];
	this.results.question20=this.arr[20];
	this.results.question21=this.arr[21];
	this.results.question22=this.arr[22];
	this.results.question23=this.arr[23];
	
this.userService.save(this.results).subscribe(result => this.gotoFeedbackForm());
alert('Feedback Submitted Successfully');
}
gotoFeedbackForm() {
this.router.navigate(['feedbackform']);
}
logout() {
this.admindataService.logout();
this.router.navigate(['login']);
}
}
