package com.example.springboot1.Controller;

import com.example.springboot1.entities.Student;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;git 

@RestController
@RequestMapping("/student")
public class Studentcontroller {

    @GetMapping("/test")
    public ResponseEntity<?> TestAPI()
    {
        return ResponseEntity.ok("Method is created" );

    }
    @GetMapping("/std")
    public String std(){
        return "hello";
    }
    @GetMapping("/info")
    public ResponseEntity <Student> stdinfo(){
        Student st=new Student();
st.setId(1);
st.setAge(22);
st.setName("shreyas");
return ResponseEntity.status(HttpStatus.CREATED).body(st) ;

    }
    @PostMapping("/cts")
    public Student send(@RequestBody Student std ){
        Student st=new Student();
        st.setId(std.getId());
        st.setName(std.getName());
        st.setAge(std.getAge());
        return st;
    }

}
