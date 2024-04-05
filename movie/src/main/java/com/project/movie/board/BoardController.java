package com.project.movie.board;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import lombok.extern.slf4j.Slf4j;

/**
 * Handles requests for the application home page.
 */
@Slf4j
@Controller
public class BoardController {
	
	@Autowired
	private BoardService service;
	
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		log.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	
	@RequestMapping(value = "b_insert", method = RequestMethod.GET)
	public String b_insert() {
		log.info("Welcome b_insert.do...");
		
		return "board/insert";
	}

	@RequestMapping(value = "b_insertOK", method = RequestMethod.GET)
	public String b_insertOK(BoardVO vo) {
		log.info("Welcome b_insertOK.do...");
		
		int result = service.b_insert(vo);
		if (result == 1) {
			return "redirect:board_selectAll.do";
		} else {
			return "redirect:board_insert.do";
		}
	}
	@RequestMapping(value = "b_selectAll", method = RequestMethod.GET)
	public String b_selectAll(@RequestParam(
			defaultValue = "1") int cpage,
			@RequestParam(defaultValue = "5") int pageBlock, Model model) {
		log.info("Welcome b_selectAll.do...");

		List<BoardVO> vos = service.b_selectAll(cpage, pageBlock);
		
		return "board/selectAll";
	}
	
	@RequestMapping(value = "b_searchList", method = RequestMethod.GET)
	public String b_searchList(
			@RequestParam(defaultValue = "1") int cpage,
			@RequestParam(defaultValue = "5") int pageBlock,
			Model model, String searchKey, String searchWord) {
		log.info("Welcome b_searchList.do...");
		
		List<BoardVO> vos = service.b_searchList(searchKey, searchWord,cpage,pageBlock);
		
		return "board/searchList";
	}
	
	@RequestMapping(value = "b_selectOne", method = RequestMethod.GET)
	public String b_selectOne(BoardVO vo, Model model) {
		log.info("Welcome b_insert.do...");
		
		BoardVO vo2 = service.b_selectOne(vo);
		
		return "board/selectOne";
	}
	
	@RequestMapping(value = "b_update", method = RequestMethod.GET)
	public String b_update(BoardVO vo, Model model) {
		log.info("Welcome b_update.do...");
		
		return "board/update";
	}
	
	@RequestMapping(value = "b_updateOK", method = RequestMethod.GET)
	public String b_updateOK(BoardVO vo) {
		log.info("Welcome b_updateOK.do...");
		
		return "board/updateOK";
	}
	
	@RequestMapping(value = "b_delete", method = RequestMethod.GET)
	public String b_delete() {
		log.info("Welcome b_delete.do...");
		
		return "board/delete";
	}
	
	@RequestMapping(value = "b_deleteOK", method = RequestMethod.GET)
	public String b_deleteOK(BoardVO vo) {
		log.info("Welcome b_deleteOK.do...");
		log.info("vo:{}", vo);

		int result = service.b_delete(vo);
		log.info("result:{}", result);

		if (result == 1) {
			return "redirect:board_selectAll.do";
		} else {
			return "redirect:board_delete.do?num=" + vo.getBoard_num();
		}
	}
	
	@RequestMapping(value = "b_increaseGood", method = RequestMethod.GET)
	public String b_increaseGood(BoardVO vo) {
		log.info("Welcome b_increaseGood.do...");
		
		return "board/increaseGood";
	}
	
}
