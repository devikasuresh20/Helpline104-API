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
package com.iemr.helpline104.service.NKSHPscheme;



import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.iemr.helpline104.repository.scheme.SchemeRepository;
import com.iemr.helpline104.service.scheme.SchemeServiceImpl;

@ExtendWith(MockitoExtension.class)
public class NKSHPschemeServiceImplTest {
	
	@InjectMocks
	SchemeServiceImpl nKSHPschemeServiceImpl;
	
	@Mock
	SchemeRepository nkshpschemeRepository;
	
	@Test
	public void getNKSHPSchemeListTest()
	{
		/*
		try {
			List<Objects[]> list=nKSHPschemeServiceImpl.saveSchemeSearchHistory(Mockito.anyInt());
			assertFalse(!list.isEmpty());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} */
		
		
	}
}
