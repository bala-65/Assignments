package com.bharath.assignments;

public class Array_A2 {
	
	public static void main (String args []) {
		
	// declaration of 3D arrays
	String [][][] exams= {
			{ //semester 1
				//subjects
				{"Mathematics 1","Physics","Chemistry","Computer Programming","Engineering Drawing","Basic Electrical Engineering"},
				//marks
				{"78","85","91","74","88","79"}
			},
				{ //semester 2
					//subjects
					{"Mathematics 2","Mechanics","Environmental science","Basic Electronics","Engineering Physics","Engoineering Graphics"},
					//marks
					{"82","77","93","69","84","90"}
				},
			{ //semester 3
				//subjects
				{"Data Structures","Discrete Mathematics","Digital Electronics","Operating Systems","Signals and Systems","OOPs"},
				//marks
				{"88","81","76","92","85","78"}
			},
			
			{ //semester 4
				//subjects
				{"Algorithms","Computer Networks","Database Systems","Microprocessors","Communication Eng","Software Engineering"},
				//marks
				{"91","73","89","80","76","87"}
			},
			{ //semester 5
				//subjects
				{"Probability and Stats","Machine Learning","Computer Design","Theory of Computation","Embedded Systems and Systems","Computer Graphics"},
				//marks
				{"86","88","84","95","73","90"}
			},
	};
	        //printing semester 3 subject 4 names
			System.out.println("The semester 3 subject 4 is: " + exams[2][0][3]);
			//printing semester 3 subject 5 names 
			System.out.println("The semester 3 subject 5 is: " + exams[2][0][4]);
			
			//printing semester 5 subject 3 marks
			System.out.println("The semester 3 subject 4 is: " + exams[4][1][2]);
			//printing semester 5 subject 6 marks
			System.out.println("The semester 3 subject 5 is: " + exams[4][1][5]);
	
	
}}

