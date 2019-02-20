package com.linjb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.linjb.model.PoliticalStatus;
import com.linjb.model.PoliticalStatusRepository;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value="/politicalStatus") 
public class Controller {

	@Autowired
	private PoliticalStatusRepository politicalStatusRepository;
	
	@ApiOperation(value="获取政治面貌列表", notes="查询所有")
	@RequestMapping(value={"/findAll"},method=RequestMethod.POST)
	public List<PoliticalStatus> findAll(){
		return politicalStatusRepository.findAll();
	}
	
	@ApiOperation(value="创建政治面貌", notes="根据 PoliticalStatus 对象创建政治面貌")
    @ApiImplicitParam(name = "politicalStatus", value = "政治面貌对象", required = true, dataType = "PoliticalStatus")
	@RequestMapping(value="/save",method=RequestMethod.POST)
	public String save(@RequestBody PoliticalStatus politicalStatus){
		if(politicalStatus==null){
			return "politicalStatus==null";
		}
		System.out.println(politicalStatus);
		politicalStatusRepository.save(politicalStatus);
		return "success";
	}
	
	@ApiOperation(value="根据名称获取政治面貌列表", notes="全名查询")
	@RequestMapping(value="/findByPoliticalStatusName",method=RequestMethod.POST)
	public PoliticalStatus findByPoliticalStatusName(@RequestBody String politicalStatusName){
		System.out.println("politicalStatusName="+politicalStatusName);
		return politicalStatusRepository.findByPoliticalStatusName(politicalStatusName);
	}
	
	@ApiOperation(value="根据名称获取政治面貌列表", notes="模糊查询")
	@RequestMapping(value="/fuzzyQueryByPoliticalStatusName",method=RequestMethod.POST)
	public List<PoliticalStatus> fuzzyQueryByPoliticalStatusName(@RequestBody String politicalStatusName){
		System.out.println("politicalStatusName="+politicalStatusName);
		return politicalStatusRepository.fuzzyQueryByPoliticalStatusName(politicalStatusName);
	}
	
	@ApiOperation(value="根据Id获取政治面貌", notes="Id查询")
	@RequestMapping(value="/findByPoliticalStatusId",method=RequestMethod.POST)
	public PoliticalStatus findByPoliticalStatusId(@RequestBody Integer politicalStatusId){
		System.out.println("politicalStatusId="+politicalStatusId);
		return politicalStatusRepository.findByPoliticalStatusId(politicalStatusId);
	}
}
