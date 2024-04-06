package com.project.movie.news.comments;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class NCommentsRestController {
	
	private static final Logger logger = LoggerFactory.getLogger(NCommentsRestController.class);
	
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
	
	@RequestMapping(value = "/nc_increaseGood.do", method = RequestMethod.GET)
	public String nc_increaseGood(NCommentsVO vo) {
		logger.info("Welcome nc_increaseGood!");

		return "news/comments/increaseGood";
	}
	
	@RequestMapping(value = "/nc_increaseReport.do", method = RequestMethod.GET)
	public String nc_increaseReport(NCommentsVO vo) {
		logger.info("Welcome nc_increaseReport!");

		return "news/comments/increaseReport";
	}

	
}
