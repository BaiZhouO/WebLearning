第一次随堂作业：
------------------
1、jsp有哪些内置对象?作用分别是什么?

2、下面是一段MyBean的源代码，其中有两个属性name,passwd。

Package bb;

public MyBean(){

String name,passwd;

public void setName(String name){

this.name=name;

}

public void setPasswd(String passwd){

this.passwd=passwd;

}

public String getName(){

return name;

}

public String getPasswd(){

return passwd;

}

}

编写简单的\<form>提交name, passwd参数给get.jsp。

使用< jsp:useBean class= "bb.MyBean" id= "bean" />编写get.jsp获取并显示name, passwd参数。

