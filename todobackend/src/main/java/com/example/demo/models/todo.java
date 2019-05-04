package com.example.demo.models;


import org.joda.time.DateTime;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class todo {
	private String topic;
	private String context;
	private DateTime creationTime;
	private DateTime modifiedTime;

}
