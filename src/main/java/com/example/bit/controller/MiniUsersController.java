package com.example.bit.controller;

//import com.itcast.service.MiniUsersService;
import java.util.List;

import com.example.bit.common.Result;
import com.example.bit.common.StatusCode;
import com.example.bit.service.MiniUsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;


@RestController
@RequestMapping("/miniUsers")
public class MiniUsersController {

	@Autowired
	private MiniUsersService miniUsersService;


/** 查询全部方法*/
	@GetMapping("/findAll")
	@ResponseBody
	public Result findAll() {
		return new Result(true, StatusCode.OK,"查询成功",miniUsersService.getAll());
	}



/** 多条件分页查询方法 *//*

	@RequestMapping("/list")
	public List<MiniUsers> list(Model model){
		List<MiniUsers> usersRecordList = miniUsersService.userRecord();
		model.addAttribute("pageInfo",usersRecordList);
		return usersRecordList;
	}

	*/
/** 根据主键id查询方法 *//*

	@GetMapping("/findOne")
	public MiniUsers findOne(Long id) {
		try {
			return miniUsersService.findOne(id);
		}catch (Exception ex){
			ex.printStackTrace();
		}
		return null;
	}

	*/
/** 添加方法 *//*

	@PostMapping("/save")
	public boolean save(@RequestBody MiniUsers miniUsers) {
		try {
			miniUsersService.save(miniUsers);
			return true;
		}catch (Exception ex){
			ex.printStackTrace();
		}
		return false;
	}

	*/
/** 修改方法 *//*

	@PostMapping("/update")
	public boolean update(@RequestBody MiniUsers miniUsers) {
		try {
			miniUsersService.update(miniUsers);
			return true;
		}catch (Exception ex){
			ex.printStackTrace();
		}
		return false;
	}

	*/
/** 删除方法 *//*

	@GetMapping("/delete")
	public boolean delete(Long[] ids) {
		try {
			miniUsersService.deleteAll(ids);
			return true;
		}catch (Exception ex){
			ex.printStackTrace();
		}
		return false;
	}

	@RequestMapping()
	public MiniUsers usersCount(){
		List<MiniUsers> users = miniUsersService.userCount();

		return null;
	}
*/

}
