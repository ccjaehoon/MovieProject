package com.project.movie.info.review;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.project.movie.user.UserDAOimpl;

import lombok.extern.slf4j.Slf4j;

/**
 * Handles requests for the application home page.
 */
@Slf4j
@Controller
public class ReviewController {
	
	@Autowired
	ReviewService service;

	private static final Logger logger = LoggerFactory.getLogger(ReviewController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	
	@RequestMapping(value = "/Review_insert.do", method = RequestMethod.GET)
	public String Review_insert(ReviewVO vo) {
		
	
		return "Review_insert";
	}
	
	@RequestMapping(value = "/Review_insertOK.do", method = RequestMethod.GET)
	public String Review_insertOK(ReviewVO vo) {
		
	
		return "Review_insertOK";
	}
	
	@RequestMapping(value = "/Review_update.do", method = RequestMethod.GET)
	public String Review_update(ReviewVO vo) {
		
	
		return "Review_update";
	}
	
	@RequestMapping(value = "/Review_updateOK.do", method = RequestMethod.GET)
	public String Review_updateOK(ReviewVO vo) {
		
	
		return "Review_updateOK";
	}
	
	@RequestMapping(value = "/Review_delete.do", method = RequestMethod.GET)
	public String Review_delete(ReviewVO vo) {
		
	
		return "Review_delete";
	}
	
	@RequestMapping(value = "/Review_deleteOK.do", method = RequestMethod.GET)
	public String Review_deleteOK(ReviewVO vo) {
		
	
		return "Review_deleteOK";
	}
	
	
	@RequestMapping(value = "/Review_selectOne.do", method = RequestMethod.GET)
	public String Review_selectOne(int cpage, int pageBlock, Model model) {
		
	
		return "Review/selectOne";
	}
	@RequestMapping(value = "/Review_selectAll.do", method = RequestMethod.GET)
	public String Review_selectAll(int cpage, int pageBlock, Model model) {
		logger.info("Welcome Review_selectAll!");
	
		return "Review/selectAll";
	}
	@RequestMapping(value = "Review_searchList.do", method = RequestMethod.GET)
	public String Review_searchList(@RequestParam(defaultValue = "1") int cpage,
			@RequestParam(defaultValue = "5") int pageBlock, Model model, String searchKey, String searchWord) {
		


		return "Review/selectAll";
	}
	
	@RequestMapping(value = "/Review_increaseGood.do", method = RequestMethod.GET)
	public String Review_increaseGood(ReviewVO vo) {
		
	
		return "Review_increaseGood";
	}
	
	@RequestMapping(value = "/Review_increaseGoodOK.do", method = RequestMethod.GET)
	public String Review_increaseGoodOK(ReviewVO vo) {
		
	
		return "Review_increaseGoodOK";
	}
	
	
	
	
}
