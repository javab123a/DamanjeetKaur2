import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { AppRoutingModule } from './app-routing.module';
import { Routes, RouterModule } from '@angular/router';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { MatToolbarModule } from '@angular/material/toolbar';
import { MatIconModule } from '@angular/material/icon';
import { MatCardModule } from '@angular/material/card';
import { MatButtonModule } from '@angular/material/button';
import { MatTableModule } from '@angular/material/table';
import { InterceptorService } from './services/interceptor.service';
import { MatProgressSpinnerModule } from '@angular/material/progress-spinner';
import { HttpClientModule } from '@angular/common/http';
import { ReactiveFormsModule, FormsModule } from '@angular/forms';
import { HTTP_INTERCEPTORS } from '@angular/common/http';
import { AppComponent } from './app.component';
import { HomeComponent } from './home/home.component';
import { LoginComponent } from './login/login.component';
import { FeedbackformComponent } from './feedbackform/feedbackform.component';
import { RegisterformComponent } from './registerform/registerform.component';
import { WelcomeComponent } from './welcome/welcome.component';
import { AboutComponent } from './about/about.component';
import { UserserviceService } from './services/userservice.service';
import { FeedbackserviceService } from './services/feedbackservice.service';
@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    LoginComponent,
    FeedbackformComponent,
    RegisterformComponent,
    WelcomeComponent,
    AboutComponent
  ],
  imports: [
BrowserModule,
RouterModule,
FormsModule,
ReactiveFormsModule,
BrowserAnimationsModule,
MatToolbarModule,
MatIconModule,
MatButtonModule,
MatCardModule,
MatTableModule,
MatProgressSpinnerModule,
AppRoutingModule,
HttpClientModule
],
  providers: [UserserviceService, FeedbackserviceService, { provide: HTTP_INTERCEPTORS, useClass: InterceptorService, multi: true } ],
exports: [RouterModule],  
bootstrap: [AppComponent]
})
export class AppModule { }
