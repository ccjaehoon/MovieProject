package com.project.movie.announcement;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.project.movie.user.UserService;

import lombok.extern.slf4j.Slf4j;

/**
 * Handles requests for the application home page.
 */
@Slf4j
@Controller
public class AnnouncementController {
	
	@Autowired
	private AnnouncementService service;
	
	@Autowired
	private HttpSession session;

	@Autowired
	private ServletContext sContext;
	
	private static final Logger logger = LoggerFactory.getLogger(AnnouncementController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		log.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	
	@RequestMapping(value = "/a_selectOne.do", method = RequestMethod.GET)
	public String a_selectOne(int cpage, int pageBlock, Model model) {
		
	
		return "announcement/selectOne";
	}
	@RequestMapping(value = "/a_selectAll.do", method = RequestMethod.GET)
	public String a_selectAll(int cpage, int pageBlock, Model model) {
		logger.info("Welcome a_selectAll!");
	
		return "announcement/selectAll";
	}
	@RequestMapping(value = "a_searchList.do", method = RequestMethod.GET)
	public String a_searchList(@RequestParam(defaultValue = "1") int cpage,
			@RequestParam(defaultValue = "5") int pageBlock, Model model, String searchKey, String searchWord) {
		


		return "announcement/selectAll";
	}
	
}
