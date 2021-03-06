package com.example.demo.models;


import org.joda.time.DateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class todo {
	private Long todoId; 
	private String topic;
	private String context;
	private DateTime creationTime;
	private DateTime modifiedTime;

}
