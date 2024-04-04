package com.project.movie.report;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
public class ReportController {
	
	@Autowired
	private ReportService service;
	
	@RequestMapping(value = "/report_selectAll.do", method = RequestMethod.GET)
	public String rp_selectAll(@RequestParam(defaultValue = "1") int cpage,
			@RequestParam(defaultValue = "5") int pageBlock, Model model) {
		log.info("report_selectAll.do...");
		
		List<ReportVO> vos = service.rp_selectAll(cpage, pageBlock);
		
		return "report/selectAll";
	}
	@RequestMapping(value = "/report_selectOne.do", method = RequestMethod.GET)
	public String rp_selectOne(ReportVO vo, Model model) {
		log.info("report_selectOne.do");
		ReportVO vo2 = service.rp_selectOne(vo);

		return "report/selectOne";
	}
	@RequestMapping(value = "/report_searchList.do", method = RequestMethod.GET)
	public String rp_searchList(@RequestParam(defaultValue = "1") int cpage,
			@RequestParam(defaultValue = "5") int pageBlock, Model model, String searchKey, String searchWord) {
		log.info("report_searchList.do");
		List<ReportVO> vos = service.rp_searchList(searchKey, searchWord,cpage,pageBlock);

		return "report/selectAll";
	}
	@RequestMapping(value = "/report_insert.do", method = RequestMethod.GET)
	public String rp_insert() {
		log.info("report_selectOne.do");

		return "report/insert";
	}
	@RequestMapping(value = "/report_insertOK.do", method = RequestMethod.GET)
	public String rp_insertOK(ReportVO vo) {
		log.info("report_insert...");
		
		int result = service.rp_insert(vo);
		if (result == 1) {
			return "redirect:report_selectAll.do";
		} else {
			return "redirect:report_insert.do";
		}
	}
	@RequestMapping(value = "/report_delete.do", method = RequestMethod.GET)
	public String rp_delete() {
		log.info("report_delete.do");

		return "report/delete";
	}
	@RequestMapping(value = "/report_deleteOK.do", method = RequestMethod.POST)
	public String rp_deleteOK(ReportVO vo) {
		log.info("Welcome report_deleteOK...");
		log.info("vo:{}", vo);

		int result = service.rp_delete(vo);
		log.info("result:{}", result);

		if (result == 1) {
			return "redirect:report_selectAll.do";
		} else {
			return "redirect:report_delete.do?num=" + vo.getReport_num();
		}

	}
	@RequestMapping(value = "/report_update.do", method = RequestMethod.GET)
	public String rp_update() {
		log.info("report_update.do");

		return "report/update";
	}
	@RequestMapping(value = "/report_updateOK.do", method = RequestMethod.GET)
	public String rp_updateOK(ReportVO vo, Model model) {
		log.info("report_selectOne.do");
		List<ReportVO> vos = service.rp_update(vo);

		return "report/selectOne";
	}
	
}
