package com.project.movie.story.comments;

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
public class SCommentsController {
	
	private static final Logger logger = LoggerFactory.getLogger(SCommentsController.class);
	
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
	
	@RequestMapping(value = "/sc_insert.do", method = RequestMethod.GET)
	public String sc_insert() {
		logger.info("Welcome sc_insert...");

		return "story/comments/insert";
	}
	
	@RequestMapping(value = "/sc_insertOK.do", method = RequestMethod.GET)
	public String sc_insertOK(SCommentsVO vo) {
		logger.info("Welcome sc_insertOK...");

		return "story/comments/insertOK";
	}
	
	@RequestMapping(value = "/sc_update.do", method = RequestMethod.GET)
	public String sc_update(SCommentsVO vo, Model model) {
		logger.info("Welcome sc_update...");

		return "story/comments/update";
	}
	@RequestMapping(value = "/sc_updateOK.do", method = RequestMethod.GET)
	public String sc_updateOK(SCommentsVO vo, Model model) {
		logger.info("Welcome sc_updateOK...");

		return "story/comments/updateOK";
	}
	@RequestMapping(value = "/sc_delete.do", method = RequestMethod.GET)
	public String sc_delete() {
		logger.info("Welcome sc_delete...");

		return "story/comments/delete";
	}
	@RequestMapping(value = "/sc_deleteOK.do", method = RequestMethod.GET)
	public String sc_deleteOK(SCommentsVO vo) {
		logger.info("Welcome sc_deleteOK...");

		return "story/comments/deleteOK";
	}
	
	@RequestMapping(value = "/sc_selectAll.do", method = RequestMethod.GET)
	public String sc_selectAll(int cpage, int pageBlock, Model model) {
		logger.info("Welcome sc_selectAll...");

		return "story/comments/selectAll";
	}

	
	
	
	
}
