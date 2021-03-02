import { UserService } from './../../Shared/user.service';
import { User } from './../../classesEntity/User';
import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { ToastrService } from 'ngx-toastr';

@Component({
  selector: 'app-user-register',
  templateUrl: './user-register.component.html',
  styleUrls: ['./user-register.component.css']
})
export class UserRegisterComponent implements OnInit {
userForm:FormGroup;
userdata:any;
RegisterData:User;

  constructor(private userService:UserService,
    private formBuilder:FormBuilder,private toasterService:ToastrService) { }

  ngOnInit(): void {
    this.userForm = this.formBuilder.group({
      userName: ['', [Validators.required]],
      userPassword: ['',[Validators.required]],
      email: ['', [Validators.required , Validators.email]],
      phone: ['', [Validators.required]],
    });
  }

  getRegisterData(){
    this.userService.getRegistration().subscribe((data)=>{
      this.RegisterData=data;
      console.log(this.RegisterData);

    })
  }

  onSubmit(){
    if(this.userForm.valid){
      this.userdata=this.userForm.value;
      this.userService.postRegistration(this.userdata).subscribe(
        (data)=>{
          console.log("Response arrive inside onSubmit() " + data)
          if(data!=null){
              this.RegisterData=data;
              console.log(this.RegisterData);
              this.toasterService.success("User Registration Sucessfully")
          }
          else{
          this.toasterService.warning("User Registration Failed")
          }
        },
        (error)=>{
          console.log("High "+ JSON.stringify(error) );
        }

      )

    } else {
      alert('User form is not valid!!')
    }
  }




}
