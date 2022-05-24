package org.study.sample.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.study.sample.model.BoardDTO;
import org.study.sample.service.BoardService;

@Controller
public class BoardController {
	
	@Autowired
	private BoardService BoardService;

	@GetMapping("/boardList")
	public String boardList(Model model) {
		
		List<BoardDTO> list= BoardService.boardList();
		model.addAttribute("list", list);
		
		return "board/boardList";
	}
	
	@GetMapping("/boardInsert")
	public String boardInsert() {
		
		return "board/boardInsert";
	}
	
	@PostMapping("/boardInsert")
	public String boardInsertProcess(BoardDTO dto) {
		
		BoardService.boardInsert(dto);
		
		return "redirect:/boardList";
		
		
		
	}
	
	@GetMapping("/boardRead")
	public String boardRead(@RequestParam("b_no")String b_no,Model model) {
		
		BoardDTO dto = BoardService.boardRead(b_no);
		model.addAttribute("dto",dto);
		
		return "board/boardRead";
	}
	
	@GetMapping("/boardUpdate")
	public String boardUpdate(@RequestParam("b_no")String b_no,Model model) {
		BoardDTO dto = BoardService.boardRead(b_no);
		model.addAttribute("dto",dto);
		return "board/boardUpdate";
	}
	
	@PostMapping("/boardUpdate")
	public String boardUpdateProcess(BoardDTO dto) {
		
		BoardService.boardUpdate(dto);
		System.out.println("aa");
		return "redirect:/boardRead?b_no="+dto.getB_no();
	}
	
	@GetMapping("/boardDelete")
	public String boardDelete(@RequestParam("b_no")String b_no) {
		BoardService.boardDelete(b_no);
		return "redirect:/boardList";
	}
	@GetMapping("/boardComment")
	public String boardComment(Model model) {
		
		List<BoardDTO> list= BoardService.boardList();
		model.addAttribute("list", list);
		
		return "board/boardComment";
	}
	
	
	
	
	
}
