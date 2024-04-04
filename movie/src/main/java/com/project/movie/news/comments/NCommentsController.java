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
public class NCommentsController {
	
	private static final Logger logger = LoggerFactory.getLogger(NCommentsController.class);
	
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
	
	@RequestMapping(value = "/nc_insert.do", method = RequestMethod.GET)
	public String nc_insert() {
		logger.info("Welcome nc_insert!");

		return "news/comments/insert";
	}
	
	@RequestMapping(value = "/nc_insertOK.do", method = RequestMethod.GET)
	public String nc_insertOK(NCommentsVO vo) {
		logger.info("Welcome nc_insertOK!");

		return "news/comments/insertOK";
	}
	
	@RequestMapping(value = "/nc_selectAll.do", method = RequestMethod.GET)
	public String nc_selectAll(int cpage, int pageBlock, Model model) {
		logger.info("Welcome nc_selectAll!");

		return "news/comments/selectAll";
	}
	@RequestMapping(value = "/nc_update.do", method = RequestMethod.GET)
	public String nc_update(NCommentsVO vo, Model model) {
		logger.info("Welcome nc_update!");

		return "news/comments/update";
	}
	@RequestMapping(value = "/nc_updateOK.do", method = RequestMethod.GET)
	public String nc_updateOK(NCommentsVO vo, Model model) {
		logger.info("Welcome nc_updateOK!");

		return "news/comments/updateOK";
	}
	@RequestMapping(value = "/nc_delete.do", method = RequestMethod.GET)
	public String nc_delete() {
		logger.info("Welcome nc_delete!");

		return "news/comments/delete";
	}
	@RequestMapping(value = "/nc_deleteOK.do", method = RequestMethod.GET)
	public String nc_deleteOK(NCommentsVO vo) {
		logger.info("Welcome nc_deleteOK!");

		return "news/comments/deleteOK";
	}
	
	
}
