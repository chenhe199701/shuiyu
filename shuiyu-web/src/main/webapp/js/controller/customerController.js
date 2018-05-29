 //客户注册的Service层
app.controller('customerController' ,function($scope,$controller,customerService){

	//注册用户
	$scope.reg=function(){
         alert("abc");
		alert("用户：" + $scope.entity.nickname);
		//比较两次输入的密码是否一致
		if($scope.password!=$scope.entity.password){
			alert("两次输入密码不一致，请重新输入");
			$scope.entity.password="";
			$scope.password="";
			return ;			
		}
		//新增
		customerService.add($scope.entity,$scope.smscode).success(
			function(response){
				alert(response.message);
			}		
		);
	}
    
	//发送验证码
	$scope.sendCode=function(){
		//验证手机号码是否为空
		/*if($scope.entity.phone==null || $scope.entity.phone==""){
			alert("请填写手机号码");
			return ;
		}*/

		//调用Service层的方法 ， 进行短信的发送
		/*customerService.sendCode($scope.entity.phoneName).success(
			function(response){
				alert(response.message);
			}
		);*/
        if($scope.phoneName==null || $scope.phoneName==""){
            alert("请填写手机号码");
            return ;
        }
        customerService.sendCode($scope.phoneName).success(
            function(response){
                alert(response.message);
            }
        );
    }
	
});	
