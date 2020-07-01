package com.note.controller;


import com.note.service.MynoteService;
import com.springcloud.commonapi.entities.Mynote;
import com.springcloud.commonapi.utils.ResultUtil;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Mynote)表控制层
 *
 * @author makejava
 * @since 2020-06-29 20:07:47
 */
@RestController
@Slf4j
@RequestMapping("/mynote")
@Api(value = "Note接口", tags = {"Note接口"})
public class MynoteController {
  /**
   * 服务对象
   */
  @Resource
  private MynoteService mynoteService;

  //查询所有记事本
    @GetMapping("/queryAllNote")
  public String queryAllNote() {
    List<Mynote> mynotes = mynoteService.queryAll(null);
    return ResultUtil.result("success",mynotes);
  }

  //根据笔记本创建者查询
    @GetMapping("/queryNoteByUser")
    public String queryNoteByUser(String user){
      Mynote mynote = new Mynote();
      mynote.setMynotecreateuser(user);
        List<Mynote> mynotes = mynoteService.queryAll(mynote);
        return ResultUtil.result("success",mynotes);
    }

    //多条件查询
    @GetMapping("/queryNoteByNote")
    public String queryNoteByNote(Mynote mynote){
        List<Mynote> mynotes = mynoteService.queryAll(mynote);
        return ResultUtil.result("success",mynotes);
    }

    //插入一条笔记
    @PostMapping("/insertNote")
    public String insertNote(Mynote mynote){
        Mynote insert = mynoteService.insert(mynote);
        return ResultUtil.result("success",insert);
    }

    //根据Id删除一条note信息
    @DeleteMapping("/deleteNoteById")
    public String deleteNoteById(Integer id){
        boolean b = mynoteService.deleteById(id);
        if (b) {
            return ResultUtil.result("success","删除ID为："+id+" 的数据成功");
        }
        return ResultUtil.result("error","删除失败");
    }

    //更新note信息
    @PutMapping("/updateNoteById")
    public String updateNoteById(Mynote mynote){
        Mynote update = mynoteService.update(mynote);
        return ResultUtil.result("success",update);
    }

}