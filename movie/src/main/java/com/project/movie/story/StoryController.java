package com.project.movie.story;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.project.movie.story.comments.SCommentsVO;

/**
 * Handles requests for the application home page.
 */
@Controller
public class StoryController {
	
	private static final Logger logger = LoggerFactory.getLogger(StoryController.class);
	
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
	
	@RequestMapping(value = "/story_insert.do", method = RequestMethod.GET)
	public String story_insert() {
		logger.info("Welcome story_insert...");

		return "story/comments/insert";
	}
	
	@RequestMapping(value = "/story_insertOK.do", method = RequestMethod.GET)
	public String story_insertOK(StoryVO vo) {
		logger.info("Welcome story_insertOK...");

		return "story/insertOK";
	}
	
	@RequestMapping(value = "/story_update.do", method = RequestMethod.GET)
	public String story_update() {
		logger.info("Welcome story_update...");

		return "story/update";
	}
	@RequestMapping(value = "/story_updateOK.do", method = RequestMethod.GET)
	public String story_updateOK(StoryVO vo) {
		logger.info("Welcome story_updateOK...");

		return "story/updateOK";
	}
	@RequestMapping(value = "/story_delete.do", method = RequestMethod.GET)
	public String story_delete() {
		logger.info("Welcome story_delete...");

		return "story/delete";
	}
	@RequestMapping(value = "/story_deleteOK.do", method = RequestMethod.GET)
	public String story_deleteOK(StoryVO vo) {
		logger.info("Welcome story_deleteOK...");

		return "story/deleteOK";
	}
	
	@RequestMapping(value = "/story_selectOneRandom.do", method = RequestMethod.GET)
	public String story_selectOneRandom(StoryVO vo, Model model) {
		logger.info("Welcome story_selectOneRandom...");

		return "story/selectOneRandom";
	}
	
	@RequestMapping(value = "/story_selectAll.do", method = RequestMethod.GET)
	public String story_selectAll(int cpage, int pageBlock, Model model) {
		logger.info("Welcome story_selectAll...");

		return "story/selectAll";
	}
	
	
	
	
}