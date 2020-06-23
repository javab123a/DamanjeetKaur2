import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { User } from '../model/user';
import { BehaviorSubject, Observable } from 'rxjs';
import { map } from 'rxjs/operators';
@Injectable()
export class UserserviceService {
private addressUrl: string;
private currentUserSubject: BehaviorSubject<User>;
public currentUser: Observable<User>;
constructor(private http: HttpClient) {
this.addressUrl = '/add';
this.currentUserSubject = new BehaviorSubject<User>(JSON.parse(localStorage.getItem('currentUser')));
this.currentUser = this.currentUserSubject.asObservable();
}
public save(user: User) {
return this.http.post<User>(this.addressUrl, user);
}
public get currentUserValue(): User {
    return this.currentUserSubject.value;
}
login(id: string, password: string) {
    console.log('inside service: ' + id + password);
    return this.http.get<any>('/logindata/{id,password}?id=' + id + '&password=' + password)
    .pipe(map(user => {
        console.log('inside service: ' + user);
        if (user) {
            console.log('inside service: ' + user);
            localStorage.setItem('currentUser', JSON.stringify(user));
            this.currentUserSubject.next(user);
    }
        return user;
}));
}
logout() {
// remove user data from local storage for log out
localStorage.removeItem('currentUser');
this.currentUserSubject.next(null);
}
}
