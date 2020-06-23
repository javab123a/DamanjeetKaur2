import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AuthGuard } from './helpers/authgaurd';
import { HomeComponent } from './home/home.component';
import { LoginComponent } from './login/login.component';
import { FeedbackformComponent } from './feedbackform/feedbackform.component';
import { WelcomeComponent } from './welcome/welcome.component';
import { AboutComponent } from './about/about.component';
import { RegisterformComponent } from './registerform/registerform.component';
const routes: Routes = [
{ path: '', redirectTo: 'home', pathMatch: 'full'},
{ path: 'home', component: HomeComponent},
{ path: 'login', component: LoginComponent },
{ path: 'feedbackform', component: FeedbackformComponent, canActivate: [AuthGuard]},
{ path: 'welcome', component: WelcomeComponent },
{ path: 'registerform', component: RegisterformComponent },
{ path: 'about', component: AboutComponent }
];
@NgModule({
imports: [RouterModule.forRoot(routes)],
exports: [RouterModule]
})
export class AppRoutingModule { }
