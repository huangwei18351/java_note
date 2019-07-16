//定义用户名校验的方法
//这个方法将使用XMLHttprequest对象来进行AJAX的异步数据交互
var xmlhttp;
function verify() {
    //①使用dom的方式获取文本框中的值
    //document.getElementById("username")是dom中获取元素节点的一种方法
    var username = document.getElementById("username").value;

    //②创建XMLHttprequest对象
    //这是XMLHttprequest对象元素使用中最复杂的一步
    //需要针对IE和其他类型的浏览器建立这个对象的不同方式的代码
    if(window.XMLHttpRequest){
        //针对火狐，mozillar，Opera，safari
        xmlhttp = new XMLHttpRequest();
        //针对某些特定版本的mozillar浏览器的bug进行修正
        if(xmlhttp.overrideMimeType){
            xmlhttp.overrideMimeType("text/xml");
        }
    }else if(window.ActiveXObject){
        //针对ie6以下
        //两个可以用于创建XMLHttprequst对象的挂件名称，保存在一个js的数组中
        //排在前面的版本较新
        var activexName = ["MSXML2.XMLHTTP", "Microsoft.XMLHTTP"];
        for(var i = 0; i < activexName.length; i++){
            try{
                //取出一个控件名进行创建，如果创建成功就终止循环
                //如果创建失败，会排出异常吗，然后可以继续循环，继续尝试创建
                xmlhttp = new ActiveXObject(activexName[i]);
                break;
            }catch (e){

            }
        }

    }

    //确认XMLHTTPrequest对象创建成功
    if(!xmlhttp){
        alert("XMLHTTPrequest对象创建失败");
        return;
    }else{
        //alert(xmlhttp);
    }

    //③注册回调函数
    //注册回调函数时，只需要函数名，不用加括号
    //我们需要将回调函数名注册，如果加上括号，就会把函数的返回值注册上，这是错误的
    xmlhttp.onreadystatechange = callback;

    //④设置连接信息
    //第一个参数表示http的请求方式，支持所有http的请求方式，主要使用get和post
    //第二个参数表示请求的url地址，get方式请求的参数也在url中
    //第三个参数表示采用异步还是同步方式交互，true表示异步
    //xmlhttp.open("get", "AJAXServer?name=" +username, true);

    //POST方式请求的代码
    xmlhttp.open("POST","AJAXXMLServer",true);
    //POST方式需要设置自己的请求头
    xmlhttp.setRequestHeader("Content-Type","application/x-www-form-urlencoded");
    //POST方式发送数据
    xmlhttp.send("name=" + username);

    //⑤发送数据，开始和服务器进行交互
    //同步方式下，send这句话会在服务器数据回来后执行
    //异步方式下，send这句话会立即执行
    //xmlhttp.send(null);
}

//回调函数
function callback(){
    //⑥接受响应的数据
    //判断对象的状态是否是交互完成
    if(xmlhttp.readyState == 4){
        //判断http的交互是否成功
        if(xmlhttp.status == 200){
            //使用responseXML方式来接受xml数据对象的dom对象
            var domObj = xmlhttp.responseXML;
            //<message>1234</message>
            //dom中利用getElementByTagName可以根据标签名来获取元素节点，返回的是一个数组
            var messageNodes = domObj.getElementsByTagName("message");
            if(messageNodes.length > 0){
                //获取message节点的文本内容
                //message标签中的文本在dom中是message标签对应的元素节点的子节点，firstChild可以获取当前节点的第一个子节点
                //通过以下方式就可以获取到文本内容所对硬的的节点
                var textNode = messageNodes[0].firstChild;
                //对于文本节点来说，可以通过nodeValue的方式返回文本节点的文本内容
                var responseMessage = textNode.nodeValue;

                //将数据显示在页面上
                //通过dom的方式找到div标签所对应的元素节点
                var divNode = document.getElementById("result");
                //设置元素节点中的html内容
                divNode.innerHTML = responseMessage;
            }else{
                alert("xml数据格式错误，原始文件内容为：" + xmlhttp.responseText);
            }
        }else{
            alert("出错了");
        }
    }
}