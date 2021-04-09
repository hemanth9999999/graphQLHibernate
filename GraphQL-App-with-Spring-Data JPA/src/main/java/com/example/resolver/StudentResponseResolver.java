package com.example.resolver;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.example.entity.Subject;
import com.example.response.StudentResponse;
import com.example.response.SubjectResponse;

@Service
public class StudentResponseResolver implements GraphQLResolver<StudentResponse>{
	
	public List<SubjectResponse> getLearningSubjects(StudentResponse resp) {
		
		System.out.println("List is : "+ resp.getStudent().getLearningSubjects()) ; 
		
		List<SubjectResponse> learningSubjects =  new ArrayList<SubjectResponse>(); ; 
		if (resp.getStudent().getLearningSubjects() != null) {
			for (Subject subject: resp.getStudent().getLearningSubjects()) {
				learningSubjects.add(new SubjectResponse(subject));
			}
		}
		
		return learningSubjects ; 
		
	}

}
