package com.project.movie.faq;

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
public class FaqController {
	
	private static final Logger logger = LoggerFactory.getLogger(FaqController.class);
	
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
	
	@RequestMapping(value = "/f_selectAll.do", method = RequestMethod.GET)
	public String f_selectAll(int cpage, int pageBlock, Model model) {
		logger.info("Welcome f_selectAll!");

		return "faq/selectAll";
	}
	
	@RequestMapping(value = "/f_searchList.do", method = RequestMethod.GET)
	public String f_searchList(int cpage, int pageBlock, Model model, String searchKey, String searchWord) {
		logger.info("Welcome f_searchList!");

		return "faq/searchList";
	}
	
	@RequestMapping(value = "/f_selectOne.do", method = RequestMethod.GET)
	public String f_selectOne(FaqVO vo, Model model) {
		logger.info("Welcome f_selectOne!");

		return "faq/selectOnectAll";
	}
	
}
