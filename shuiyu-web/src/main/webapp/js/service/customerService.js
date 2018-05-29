//客户类的服务层
app.service('customerService',function($http){
	    	

	//增加客户的方法
	this.add=function(entity,smscode){
		alert("将调用注册的客户的后台 , 客户：" + entity);
		return  $http.post('../customer/saveCustomer.action?smscode='+smscode,entity);
	}

	//发送验证码
	this.sendCode=function(phoneName){
		alert("发送短信的方法。。。");
		return $http.get('../customer/sendMessage.action?phoneName='+phoneName);
	}
	
});
