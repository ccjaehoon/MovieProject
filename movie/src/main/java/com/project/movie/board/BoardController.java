package com.project.movie.board;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Handles requests for the application home page.
 */
@Controller
public class BoardController {
	
	private static final Logger logger = LoggerFactory.getLogger(BoardController.class);
	
	@RequestMapping(value = "b_insert", method = RequestMethod.GET)
	public String b_insert() {
		logger.info("Welcome b_insert.do...");
		
		return null;
	}

	@RequestMapping(value = "b_insertOK", method = RequestMethod.GET)
	public String b_insertOK(BoardVO vo) {
		logger.info("Welcome b_insertOK.do...");
		
		return null;
	}
	@RequestMapping(value = "b_selectAll", method = RequestMethod.GET)
	public String b_selectAll(@RequestParam(
			defaultValue = "1") int cpage,
			@RequestParam(defaultValue = "5") int pageBlock, Model model) {
		logger.info("Welcome b_selectAll.do...");
		
		return null;
	}
	
	@RequestMapping(value = "b_searchList", method = RequestMethod.GET)
	public String b_searchList(
			@RequestParam(defaultValue = "1") int cpage,
			@RequestParam(defaultValue = "5") int pageBlock,
			Model model, String searchKey, String searchWord) {
		logger.info("Welcome b_searchList.do...");
		
		return null;
	}
	
	@RequestMapping(value = "b_selectOne", method = RequestMethod.GET)
	public String b_selectOne(BoardVO vo, Model model) {
		logger.info("Welcome b_insert.do...");
		
		return null;
	}
	
	@RequestMapping(value = "b_update", method = RequestMethod.GET)
	public String b_update(BoardVO vo, Model model) {
		logger.info("Welcome b_update.do...");
		
		return null;
	}
	
	@RequestMapping(value = "b_updateOK", method = RequestMethod.GET)
	public String b_updateOK(BoardVO vo) {
		logger.info("Welcome b_updateOK.do...");
		
		return null;
	}
	
	@RequestMapping(value = "b_delete", method = RequestMethod.GET)
	public String b_delete() {
		logger.info("Welcome b_delete.do...");
		
		return null;
	}
	
	@RequestMapping(value = "b_deleteOK", method = RequestMethod.GET)
	public String b_deleteOK(BoardVO vo) {
		logger.info("Welcome b_deleteOK.do...");
		
		return null;
	}
	
	@RequestMapping(value = "b_increaseGood", method = RequestMethod.GET)
	public String b_increaseGood(BoardVO vo) {
		logger.info("Welcome b_increaseGood.do...");
		
		return null;
	}
	
}
