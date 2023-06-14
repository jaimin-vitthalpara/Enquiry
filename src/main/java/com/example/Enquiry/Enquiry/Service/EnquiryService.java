package com.example.Enquiry.Enquiry.Service;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Enquiry.Enquiry.Model.EnquiryForm;
import com.example.Enquiry.Enquiry.Repository.EnquiryRepo;

@Service
public class EnquiryService {

	@Autowired
	EnquiryRepo enquiryrepo;

	public List<EnquiryForm> getFormDetails() {
		List<EnquiryForm> enquiryform = new ArrayList<>();
		enquiryrepo.findAll().forEach(ef -> enquiryform.add(ef));
		return enquiryform;
	}

	public Optional<EnquiryForm> getFormDetailsById(int id) {
		Optional<EnquiryForm> enquiryform  = enquiryrepo.findById(id);
			return enquiryform;
	}

	public void saveOrUpdate(EnquiryForm ef) {
		enquiryrepo.save(ef);
	}

	public void updateDetails(int id, EnquiryForm ef) {
		EnquiryForm form = enquiryrepo.findById(id).get();
		form.setName(ef.getName());
		form.setEmail(ef.getEmail());
		form.setAddress(ef.getAddress());
		form.setCollegename(ef.getCollegename());
		form.setContactno(ef.getContactno());
		form.setQualification(ef.getQualification());
		form.setDOB(ef.getDOB());
		form.setPassoutyear(ef.getPassoutyear());
		form.setCoursename(ef.getCoursename());
		form.setExperience(ef.getExperience());
		form.setCurrentjobtitle(ef.getCurrentjobtitle());
		form.setWhenyouwanttostart(ef.getWhenyouwanttostart());
		form.setPrefferbatchtime(ef.getPrefferbatchtime());
		form.setLookingforplacement(ef.isLookingforplacement());
		form.setGoodinenglish(ef.getGoodinenglish());
		
		
		enquiryrepo.save(form);
	}

	public void deleteByID(int id) {
		enquiryrepo.deleteById(id);
	}

	public List<EnquiryForm> findByName(EnquiryForm ef) {
		return enquiryrepo.findByName(ef.getName());
	}

//	public class IncrementTimeExample {
//		public static void main(String[] args) {
//			LocalTime currenttime = LocalTime.now();
//			LocalTime updatedtime = currenttime.plusHours(1);
//			System.out.println("current time = " + currenttime + "updated time = " + updatedtime);
//		}
//	}
	
	private ArrayList<String> getTimeslot(boolean isCurrentDay) {
		ArrayList result = new ArrayList<String>();
		SimpleDateFormat sdf = new SimpleDateFormat("hh:mm");
		Calendar calendar = new GregorianCalendar();
		calendar.set(Calendar.HOUR_OF_DAY, 0);
		if(!isCurrentDay) {
			calendar.set(Calendar.HOUR_OF_DAY, 9);
			calendar.set(Calendar.MINUTE, 0);
			calendar.set(Calendar.SECOND, 0);
		}
		for (int i = 0; i < 9; i++) {
			String day1 = sdf.format(calendar.getTime());
			
			// add 30 minute to the current time
			calendar.add(Calendar.MINUTE, 30);
			String day2 = sdf.format(calendar.getTime());
			
			String day = day1 + " - " + day2;
			result.add(i, day);
		}
		return result;
	}
}

