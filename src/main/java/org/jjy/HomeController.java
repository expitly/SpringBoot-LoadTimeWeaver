package org.jjy;

import java.util.Date;

import javax.inject.Inject;
import javax.inject.Provider;

import org.jjy.entity.NaverPlaceMenuEntity;
import org.jjy.repository.NaverPlaceMenuRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Inject Provider<NaverPlaceMenuEntity> naverPlaceMenuEntityProvider;
	
	@Autowired NaverPlaceMenuRepository naverPlaceMenuRepository;

    @RequestMapping("")
    public String hello() {
    	this.save();
    	
        return "Hello World";
    }
    
    @Transactional
    public void save(){
    	NaverPlaceMenuEntity placeMenu = naverPlaceMenuEntityProvider.get();
		placeMenu.setPid(36259197);
		placeMenu.setName("test1");
		placeMenu.setPrice("10000");
		placeMenu.setRegDt(new Date());
		
		naverPlaceMenuRepository.saveAndFlush(placeMenu);
    
		if(true){
			throw new RuntimeException();
		}
    }
}
