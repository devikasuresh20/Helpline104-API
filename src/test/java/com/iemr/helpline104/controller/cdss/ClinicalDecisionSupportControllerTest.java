/*
* AMRIT – Accessible Medical Records via Integrated Technology
* Integrated EHR (Electronic Health Records) Solution
*
* Copyright (C) "Piramal Swasthya Management and Research Institute"
*
* This file is part of AMRIT.
*
* This program is free software: you can redistribute it and/or modify
* it under the terms of the GNU General Public License as published by
* the Free Software Foundation, either version 3 of the License, or
* (at your option) any later version.
*
* This program is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
* GNU General Public License for more details.
*
* You should have received a copy of the GNU General Public License
* along with this program.  If not, see https://www.gnu.org/licenses/.
*/
package com.iemr.helpline104.controller.cdss;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.doThrow;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import com.google.gson.stream.JsonReader;
import com.iemr.helpline104.data.cdss.SymptomsWrapper;
import com.iemr.helpline104.service.cdss.CDSSServiceImpl;

@ExtendWith(MockitoExtension.class)
public class ClinicalDecisionSupportControllerTest {

	@InjectMocks
	ClinicalDecisionSupportController cDSSController;
	
	@Mock
	CDSSServiceImpl cDSSServiceImpl;

	@Test
	public void getQuestionTest()
	{
		SymptomsWrapper symptomsDetail=Mockito.mock(SymptomsWrapper.class,Mockito.CALLS_REAL_METHODS);
		symptomsDetail.setSymptom("101");
		String response=cDSSController.getQuestion(symptomsDetail);
		assertTrue(response.contains("Failed with generic error"));
	}
	@Test
	public void getQuestionTest1()
	{
		SymptomsWrapper symptomsDetail=Mockito.mock(SymptomsWrapper.class,Mockito.CALLS_REAL_METHODS);
		symptomsDetail.setSymptom("101");
		symptomsDetail.setGender("Male");
		symptomsDetail.setAge(47);
		doReturn("Message").when(cDSSServiceImpl).getQuestions(Mockito.anyString(),Mockito.anyInt(),Mockito.anyString());
		String response=cDSSController.getQuestion(symptomsDetail);
		assertTrue(response.contains("\"status\":\"Success\""));
	}
	@Test
	public void getResultTest()
	{
		//JsonReader.setLenient(true);
		//cDSSController.getResult("\"complaintId\":101".toString());
		//assertTrue(response.contains("\"beneficiaryRegID\":201"));
	}
	@Test
	public void saveSymptomTest()
	{
		doReturn("Sucess").when(cDSSServiceImpl).saveSymptom(Mockito.anyString());
		String response=cDSSController.saveSymptom(Mockito.anyString());
		assertTrue(response.contains("Sucess"));
	}
	@Test
	public void saveSymptomExceptionTest()
	{
		doThrow(Exception.class).when(cDSSServiceImpl).saveSymptom(Mockito.anyString());
		String response=cDSSController.saveSymptom(Mockito.anyString());
		assertFalse(response.contains("Sucess"));
	}
}
