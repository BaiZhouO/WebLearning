第一次随堂作业：
--------------

1、jsp有哪些内置对象?作用分别是什么?                        <br>
2、下面是一段MyBean的源代码，其中有两个属性name,passwd。    <br>
Package bb;                                              <br>
public MyBean(){                                         <br>
String name,passwd;                                      <br>
public void setName(String name){                        <br>
this.name=name;                                          <br>
}                                                        <br>
public void setPasswd(String passwd){                    <br>
this.passwd=passwd;                                      <br>
}                                                        <br>
public String getName(){                                 <br>
return name;                                             <br>
}                                                        <br>
public String getPasswd(){                               <br>
return passwd;                                           <br>
}                                                        <br>
}                                                        <br>
编写简单的/<form>提交name, passwd参数给get.jsp。            <br>
使用< jsp:useBean class= "bb.MyBean" id= "bean" />编写get.jsp获取并显示name, passwd参数。  <br>
