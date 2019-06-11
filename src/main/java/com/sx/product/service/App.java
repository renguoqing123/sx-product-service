package com.sx.product.service;

import com.sx.rpc.RpcProxy;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	//服务调用
    	RpcProxy proxy=new RpcProxy();
    	ProductService productService = (ProductService)proxy.remoreCall(ProductService.class,"localhost",9992);
    	System.out.println(productService.getProductById(111));
    }
}
