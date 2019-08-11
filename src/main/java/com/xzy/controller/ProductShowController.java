package com.xzy.controller;

import com.xzy.beans.ProductShow;
import com.xzy.service.CollectService;
import com.xzy.service.ProductDiscussService;
import com.xzy.service.ProductShowService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;

/**
 * Create by Shuai on 2019/8/4 10:54
 */
@RestController
public class ProductShowController {
    @Autowired
    private ProductShowService productService;
    @Autowired
    private ProductDiscussService productDiscussService;
    @Autowired
    private CollectService collectService;
    @RequestMapping("/ProductAll/{productId}")
    public ProductShow ProductAll(HttpSession session, @PathVariable("productId") Integer productId)  {
        int userId=1;
        if(productId != null ){
            ProductShow p=  productService.selectProductAll(productId);
            int num = collectService.isCollect(productId,userId);
            boolean like = false;
            if(num==1){
                like = true;
            }
            p.setDiscussCount(productDiscussService.countDiscuss(productId));
            p.setCollect(like);
            return p;
        }else {
            return  null;
        }

    }
}