package com.customermanage.restapi;

import com.customermanage.service.CustInfoService;
import com.springcloud.commonapi.entities.Custinfo;
import com.springcloud.commonapi.utils.ResultUtil;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author zhou
 * @date 2020/6/27 2:01
 */
@RestController
@RequestMapping("/customer")
@Api(value = "CustomerRestApi客户信息相关接口", tags = {"CustomerRestApi客户信息相关接口"})
public class CustomerRestApi {
  //获取配置文件信息
  @Value("${config.info}")
  private String configInfo;
  //版本查询，@RefreshScope自动更新测试
  @GetMapping("/config/info")
  public String getConfigInfo() {
    return configInfo;
  }
  //服务提供
  @Resource
  private CustInfoService custInfoService;

  //查询所有客户信息
  @GetMapping("/queryAll")
  public String queryAll(){
    List<Custinfo> custinfos = custInfoService.queryAll(null);
    return ResultUtil.result("success",custinfos);
  }

  //查询用户客户
  @GetMapping("/queryCustByAsc")
  public String queryCustByAsc(String ascription){
    List<Custinfo> custinfos = custInfoService.queryCustByAsc(ascription);
    return ResultUtil.result("success",custinfos);
  }

  //添加客户信息
  @PostMapping("/insert")
  public String insert(Custinfo custinfo){
    Custinfo insert = custInfoService.insert(custinfo);
    return ResultUtil.result("success",insert);
  }

  //更新客户信息
  @PutMapping("/update")
  public String update(Custinfo custinfo){
    Custinfo update = custInfoService.update(custinfo);
    return ResultUtil.result("success",update);
  }

  //删除客户
  @DeleteMapping("/delete")
  public String delete(Integer id){
    custInfoService.deleteById(id);
    return ResultUtil.result("success",id);
  }

  //根据entity查询
  @GetMapping("/queryCust")
  public String queryCust(Custinfo custinfo){
    List<Custinfo> custinfos = custInfoService.queryAll(custinfo);
    return ResultUtil.result("success",custinfo);
  }

  @GetMapping("/queryAllByLimit")
  public String queryAllByLimit(Integer offset,Integer limit){
    List<Custinfo> custinfos = custInfoService.queryAllByLimit(offset, limit);
    return ResultUtil.result("success",custinfos);
  }
}
