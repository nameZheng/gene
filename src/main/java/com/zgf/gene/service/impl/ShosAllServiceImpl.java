package com.zgf.gene.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zgf.gene.mapper.S1ChickenMapper;
import com.zgf.gene.mapper.S1HumanMapper;
import com.zgf.gene.mapper.S1MouseMapper;
import com.zgf.gene.mapper.S1XenopusMapper;
import com.zgf.gene.mapper.S1ZebrafishMapper;
import com.zgf.gene.mapper.S2KeggMapper;
import com.zgf.gene.mapper.S3OmimDiseaseMapper;
import com.zgf.gene.mapper.S5Sheet1Mapper;
import com.zgf.gene.mapper.S6ChickenMapper;
import com.zgf.gene.mapper.S6Human1Mapper;
import com.zgf.gene.mapper.S6Human2Mapper;
import com.zgf.gene.mapper.S6MouseMapper;
import com.zgf.gene.mapper.S6XeopusMapper;
import com.zgf.gene.mapper.S6Zebrafish1Mapper;
import com.zgf.gene.mapper.S6Zebrafish2Mapper;
import com.zgf.gene.mapper.S7ChickenMapper;
import com.zgf.gene.mapper.S7HumanMapper;
import com.zgf.gene.mapper.S7MouseMapper;
import com.zgf.gene.mapper.S7XenopusMapper;
import com.zgf.gene.mapper.S7ZebrafishMapper;
import com.zgf.gene.pojo.S1Chicken;
import com.zgf.gene.pojo.S1ChickenExample;
import com.zgf.gene.pojo.S1Human;
import com.zgf.gene.pojo.S1HumanExample;
import com.zgf.gene.pojo.S1Mouse;
import com.zgf.gene.pojo.S1MouseExample;
import com.zgf.gene.pojo.S1Xenopus;
import com.zgf.gene.pojo.S1XenopusExample;
import com.zgf.gene.pojo.S1Zebrafish;
import com.zgf.gene.pojo.S1ZebrafishExample;
import com.zgf.gene.pojo.S2Kegg;
import com.zgf.gene.pojo.S3OmimDisease;
import com.zgf.gene.pojo.S5Sheet1;
import com.zgf.gene.pojo.S6Chicken;
import com.zgf.gene.pojo.S6Human1;
import com.zgf.gene.pojo.S6Human2;
import com.zgf.gene.pojo.S6Mouse;
import com.zgf.gene.pojo.S6Xeopus;
import com.zgf.gene.pojo.S6Zebrafish1;
import com.zgf.gene.pojo.S6Zebrafish2;
import com.zgf.gene.pojo.S7Chicken;
import com.zgf.gene.pojo.S7ChickenExample;
import com.zgf.gene.pojo.S7Human;
import com.zgf.gene.pojo.S7HumanExample;
import com.zgf.gene.pojo.S7Mouse;
import com.zgf.gene.pojo.S7MouseExample;
import com.zgf.gene.pojo.S7Xenopus;
import com.zgf.gene.pojo.S7XenopusExample;
import com.zgf.gene.pojo.S7Zebrafish;
import com.zgf.gene.pojo.S7ZebrafishExample;
import com.zgf.gene.service.ShowAllService;

import com.zgf.gene.pojo.S1ChickenExample.Criteria;

@Service
public class ShosAllServiceImpl implements ShowAllService {

	@Autowired
	private S1ChickenMapper s1ChickenMapper;
	@Autowired
	private S1MouseMapper s1MouseMapper;
	@Autowired
	private S1HumanMapper s1HumanMapper;
	@Autowired
	private S1XenopusMapper s1XenopusMapper;
	@Autowired
	private S1ZebrafishMapper s1ZebrafishMapper;
	
	@Autowired
	private S2KeggMapper s2KeggMapper;
	@Autowired
	private S3OmimDiseaseMapper s3OmimDiseaseMapper;
	@Autowired
	private S5Sheet1Mapper s5Sheet1Mapper;
	@Autowired
	private S6ChickenMapper s6ChickenMapper;
	@Autowired
	private S6Human1Mapper s6Human1Mapper;
	@Autowired
	private S6Human2Mapper s6Human2Mapper;
	@Autowired
	private S6MouseMapper s6MouserMapper;
	@Autowired
	private S6XeopusMapper s6XeopusMapper;
	@Autowired
	private S6Zebrafish1Mapper s6Zebrafish1Mapper;
	@Autowired
	private S6Zebrafish2Mapper s6Zebrafish2Mapper;
	@Autowired
	private S7ChickenMapper s7ChickenMapper;
	@Autowired
	private S7HumanMapper s7HumanMapper;
	@Autowired
	private S7MouseMapper s7MouseMapper;
	@Autowired
	private S7XenopusMapper s7XenopusMapper;
	@Autowired
	private S7ZebrafishMapper s7ZebrafishMapper;
	
	@Override
	public List<S1Chicken> showS1Chcken(String id) {

		S1ChickenExample example = new S1ChickenExample();
		Criteria criteria = example.createCriteria();
		criteria.andEnsemblgeneidEqualTo(id);
		//criteria.andGenenameEqualTo(name);
		List<S1Chicken> list = s1ChickenMapper.selectByExample(example);
		return list;
	}

	@Override
	public List<S1Human> showS1Human(String id) {
		//
		S1HumanExample example = new S1HumanExample();
		com.zgf.gene.pojo.S1HumanExample.Criteria criteria = example.createCriteria();
		criteria.andEnsemblgeneidEqualTo(id);
		//criteria.andGenenameEqualTo(name);
		List<S1Human> list = s1HumanMapper.selectByExample(example);
		return list;
	}

	@Override
	public List<S1Mouse> showS1Mouse(String id) {
		S1MouseExample example = new S1MouseExample();
		com.zgf.gene.pojo.S1MouseExample.Criteria criteria = example.createCriteria();
		criteria.andEnsemblgeneidEqualTo(id);
		//criteria.andGenenameEqualTo(name);
		List<S1Mouse> list =  s1MouseMapper.selectByExample(example);
		return list;
	}

	@Override
	public List<S1Xenopus> showS1Xenopus(String id) {
		S1XenopusExample example = new S1XenopusExample();
		com.zgf.gene.pojo.S1XenopusExample.Criteria criteria = example.createCriteria();
		criteria.andEnsemblgeneidEqualTo(id);
		//criteria.andGenenameEqualTo(name);
		List<S1Xenopus> list =  s1XenopusMapper.selectByExample(example);
		return list;

	}

	@Override
	public List<S1Zebrafish> showS1Zebrafish(String id) {
		S1ZebrafishExample example = new S1ZebrafishExample();
		com.zgf.gene.pojo.S1ZebrafishExample.Criteria criteria = example.createCriteria();
		criteria.andEnsemblgeneidEqualTo(id);
		//criteria.andGenenameEqualTo(name);
		List<S1Zebrafish> list = s1ZebrafishMapper.selectByExample(example);
		return list;
	}

	@Override
	public List<S2Kegg> showS2() {
		// select *
		List<S2Kegg> list = s2KeggMapper.showAll();
		return list;
	}

	@Override
	public List<S3OmimDisease> showS3() {
		List<S3OmimDisease> list = s3OmimDiseaseMapper.showAll();
		return list;
	}

	@Override
	public List<S5Sheet1> showS5() {
		List<S5Sheet1> list = s5Sheet1Mapper.showAll();
		return list;
	}

	@Override
	public List<S6Chicken> showS6Chicken() {
		List<S6Chicken> list = s6ChickenMapper.showAll();
		return list;
	}

	@Override
	public List<S6Human1> showS6Human1() {
		List<S6Human1> list = s6Human1Mapper.showAll();
		return list;
	}

	@Override
	public List<S6Human2> showS6Human2() {
		List<S6Human2> list = s6Human2Mapper.showAll();
		return list;
	}

	@Override
	public List<S6Mouse> showS6Mouse() {
		List<S6Mouse> list = s6MouserMapper.showAll();
		return list;
	}

	@Override
	public List<S6Xeopus> showS6Xeopus() {
		List<S6Xeopus> list = s6XeopusMapper.showAll();
		return list;
	}

	@Override
	public List<S6Zebrafish1> showS6Zebrafish1() {
		List<S6Zebrafish1> list = s6Zebrafish1Mapper.showAll();
		return list;
	}

	@Override
	public List<S6Zebrafish2> showS6Zebrafish2() {
		List<S6Zebrafish2> list = s6Zebrafish2Mapper.showAll();
		return list;
	}

	@Override
	public List<S7Chicken> showS7Chicken(String id) {
		/*
		S1MouseExample example = new S1MouseExample();
		com.zgf.gene.pojo.S1MouseExample.Criteria criteria = example.createCriteria();
		criteria.andEnsemblgeneidEqualTo(id);
		criteria.andGenenameEqualTo(name);
		List<S1Mouse> list =  s1MouseMapper.selectByExample(example);
		return list;
		*/
		S7ChickenExample example = new S7ChickenExample();
		com.zgf.gene.pojo.S7ChickenExample.Criteria criteria = example.createCriteria();
		criteria.andAEqualTo(id);
		//criteria.andCEqualTo(name);
		List<S7Chicken> list = s7ChickenMapper.selectByExample(example);
		return list;
	}

	@Override
	public List<S7Human> showS7Human(String id) {
		S7HumanExample example = new S7HumanExample();
		com.zgf.gene.pojo.S7HumanExample.Criteria criteria = example.createCriteria();
		criteria.andAEqualTo(id);
		//criteria.andCEqualTo(name);
		List<S7Human> list = s7HumanMapper.selectByExample(example);
		return list;
	}

	@Override
	public List<S7Mouse> showS7Mouse(String id) {
		S7MouseExample example = new S7MouseExample();
		com.zgf.gene.pojo.S7MouseExample.Criteria criteria = example.createCriteria();
		criteria.andAEqualTo(id);
		//criteria.andCEqualTo(name);
		List<S7Mouse> list = s7MouseMapper.selectByExample(example);
		return list;
	}

	@Override
	public List<S7Xenopus> showS7Xenopus(String id) {
		S7XenopusExample example = new S7XenopusExample();
		com.zgf.gene.pojo.S7XenopusExample.Criteria criteria = example.createCriteria();
		criteria.andAEqualTo(id);
		//criteria.andCEqualTo(name);
		List<S7Xenopus> list = s7XenopusMapper.selectByExample(example);
		return list;
	}

	@Override
	public List<S7Zebrafish> showS7Zebrafish(String id) {
		S7ZebrafishExample example = new S7ZebrafishExample();
		com.zgf.gene.pojo.S7ZebrafishExample.Criteria criteria = example.createCriteria();
		criteria.andAEqualTo(id);
		//criteria.andCEqualTo(name);
		List<S7Zebrafish> list = s7ZebrafishMapper.selectByExample(example);
		return list;
	}

}
