package com.zgf.gene.service;

import java.util.List;

import com.zgf.gene.pojo.S1Chicken;
import com.zgf.gene.pojo.S1Human;
import com.zgf.gene.pojo.S1Mouse;
import com.zgf.gene.pojo.S1Xenopus;
import com.zgf.gene.pojo.S1Zebrafish;
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
import com.zgf.gene.pojo.S7Human;
import com.zgf.gene.pojo.S7Mouse;
import com.zgf.gene.pojo.S7Xenopus;
import com.zgf.gene.pojo.S7Zebrafish;

public interface ShowAllService {
	
	List<S1Chicken> showS1Chcken(String id);
	
	List<S1Human> showS1Human(String id);
	
	List<S1Mouse> showS1Mouse(String id);
	
	List<S1Xenopus> showS1Xenopus(String id);
	
	List<S1Zebrafish> showS1Zebrafish(String id);
	
	List<S2Kegg> showS2();
	
	List<S3OmimDisease> showS3();
	
	List<S5Sheet1> showS5();
	
	List<S6Chicken> showS6Chicken();
	
	List<S6Human1> showS6Human1();
	
	List<S6Human2> showS6Human2();
	
	List<S6Mouse> showS6Mouse();
	
	List<S6Xeopus> showS6Xeopus();
	
	List<S6Zebrafish1> showS6Zebrafish1();
	
	List<S6Zebrafish2> showS6Zebrafish2();
	
	List<S7Chicken> showS7Chicken(String id);
	
	List<S7Human> showS7Human(String id);
	
	List<S7Mouse> showS7Mouse(String id);
	
	List<S7Xenopus> showS7Xenopus(String id);
	
	List<S7Zebrafish> showS7Zebrafish(String id);

}
