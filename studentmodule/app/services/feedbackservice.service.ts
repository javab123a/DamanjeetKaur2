import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Admin } from '../model/admin';
import { Result } from '../model/result';
import { Observable } from 'rxjs';
@Injectable()
export class FeedbackserviceService {
private adminUrl: string;
private addressUrl: string;
public currentUser: Observable<Admin>;
public newUrl: any;
constructor(private http: HttpClient) {
this.adminUrl = '/alldata';
this.addressUrl = '/addresult';
this.newUrl="/result/{id}?id";
}
public findAll(): Observable<Admin[]> {
return this.http.get<Admin[]>(this.adminUrl);
}
public selectById(id: number) {
    console.log('inside service: ' + id);
    return this.http.get<any>(this.newUrl + id)
}
public save(result: Result) {
return this.http.post<Result>(this.addressUrl, result);
}
}
