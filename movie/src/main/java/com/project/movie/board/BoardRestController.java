package com.project.movie.board;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import lombok.extern.slf4j.Slf4j;

/**
 * Handles requests for the application home page.
 */
@Slf4j
@Controller
public class BoardRestController {
	
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		log.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	
	@RequestMapping(value = "/b_increaseGood.do", method = RequestMethod.GET)
	public String b_increaseGood(BoardVO vo) {
		log.info("Welcome b_increaseGood!");

		return "board/increaseGood";
	}
	
	@RequestMapping(value = "/b_increaseReport.do", method = RequestMethod.GET)
	public String b_increaseReport(BoardVO vo) {
		log.info("Welcome b_increaseReport!");

		return "board/increaseReport";
	}
	
}
