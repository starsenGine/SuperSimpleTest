import java.beans.Encoder;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Text {
	public static void main(String []args){
		    try {
		    	Gson g = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
		    	
		    	JPAUser u = new JPAUser();
		    	u.account="ddd";
		    	u.answer="d";
		    	u.dperformer="d";
		    	u.dsign=0;
		    	u.dtime=new Date().getTime();
		    	u.email="d";
		    	u.imageurl="d";
		    	u.introduction="d";
		    	u.mtime=new Date().getTime();
		    	u.name="d";
		    	u.nick="d";
		    	u.password="d";
		    	u.phone="d";
		    	u.profession="d";
		    	u.question="d";
		    	u.sex=0;
		    	//u.id = 6;
		    	
		    	Comment c = new Comment();
		    	//c.id=3;
		    	c.content="wtf12312312312";
		    	c.ctime = new Date();
		    	c.state = 1;
		    	c.uid = 1;
		    	c.vid = 3;
		    	
		    	Menu menu = new Menu();
		    	menu.id= 13;
		    	menu.descpt = "haha";
		    	menu.mperformer = "perform33";
		    	menu.mtime = new Date();
		    	menu.name = "哎哟喂";
		    	menu.pic = "picture3";
		    	menu.pid = 3;
		    	
		    	Video video = new Video();
		    	video.id = 6;
		    	video.banned= 2;
		    	video.mid = 1;
		    	//video.saddr = "add2111r";
		    	video.state = 1;
		    	video.stime = new Date();
		    	video.title = "尼玛";
		    	video.uid = 1;
		    	video.usetime = new Date();
		    	//video.vaddr = "vaddr12312";
		    	
		    	Online o = new Online();
		    	o.id = 7;
		    	o.ip="12131.12232123.1223.1223";
		    	o.sstate = 0;
		    	o.state = 1;
		    	o.uid = 1;
		    	o.vid = 1;
		    	o.ltime = new Date();
		    	o.flower = 1;
		    	
		    	
		    	Praise p = new Praise();
		    	p.id = 2;
		    	p.ltime = new Date();
		    	p.time = new Date();
		    	p.vid = 1;
		    	p.uid = 4;
		    	
		    	Report rp = new Report();
		    	//rp.id = 3;
		    	rp.content ="ccc";
		    	rp.pic = "as";
		    	rp.rtime = new Date().getTime();
		    	rp.state = 0;
		    	rp.uid = 1;
		    	rp.vid = 1;
		    	
		    	Subscibe sc = new Subscibe();
		    	sc.id = 1;
		    	sc.time = new Date();
		    	sc.uid = 1;
		    	sc.vid = 3;
		    	
		    	
		    	
		    	String s = g.toJson(sc);
		    	
		    	DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		    	Date myDate = new Date();
		    	try {
					myDate = dateFormat.parse("2016-10-30 22:36:01");
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		    	//System.out.println("http://localhost:8080/qyserver/WEBVideo?action=add&&data="+s);
		        //URL url = new URL("http://localhost:8080/qyserver/WEBMenu?action=add&&data="+s); 
		        //System.out.println("http://localhost:8080/qyserver/WEBMenu?action=add&&data="+s);
		    	URL url = new URL("http://123.207.232.246:8080/qylive/sc/insert?data="+s); 
		        HttpURLConnection connection = (HttpURLConnection)url.openConnection();
		        
		        InputStream is = connection.getInputStream();
		        
		       
		        BufferedReader reader = new BufferedReader(  
	                    new InputStreamReader(is));  
		        String sCurrentLine = null;
		        String sTotalString = "";
	            while ((sCurrentLine = reader.readLine()) != null)  
	                if (sCurrentLine.length() > 0)  
	                    sTotalString = sTotalString + sCurrentLine.trim();  
		        
	            //ReportBean rb = g.fromJson(sTotalString, ReportBean.class);
	            System.out.println(sTotalString);
		    } catch (IOException e) {  
		        e.printStackTrace();  
		    }  
	}
}


class JPAUser{
	public long id;			//long 锟斤拷锟斤拷, 锟斤拷识, Not null ID
	public String account;		//varchar(255) Not null 锟剿猴拷
	public String password; 	//varchar(255) Not null 锟斤拷锟斤拷
	public String nick;		//varchar(255) Not null 锟角筹拷
	public String name;		//varchar(255) Not null 锟斤拷实锟斤拷锟斤拷
	public long sex;			//long Not null 锟皆憋拷, 0为锟斤拷 1为女
	public String profession;	//varchar(255) Not null 职位, 学锟斤拷锟斤拷锟斤拷师
	public String phone;		//varchar(255) Not null 锟界话锟斤拷锟斤拷
	public String email;		//varchar(255) Not null 锟斤拷锟斤拷
	public String introduction;//varchar(255) null	锟斤拷锟�
	public String imageurl;	//varchar(255) null 头锟斤拷锟斤拷锟接碉拷址
	public String question;	//varchar(255) Not null 锟杰憋拷锟斤拷锟斤拷
	public String answer;		//varchar(255) Not null 锟杰憋拷锟斤拷
	public long dsign;			//long Not null	删锟斤拷锟斤拷志, 默锟斤拷为0,0为未删锟斤拷,1为锟斤拷删锟斤拷
	public long dtime;			//date null	删锟斤拷时锟斤拷
	public String dperformer;	//varchar(255) null 删锟斤拷锟斤拷
	public long mtime;			//date null 锟斤拷锟揭伙拷锟斤拷薷锟绞憋拷锟�
}

class Comment{
	public long id;
	public String content;
	public Date ctime;
	public long state;
	public long uid;
	public long vid;
}

class Menu{
	public long id;
	public String descpt;
	public String mperformer;
	public Date mtime;
	public String name;
	public String pic;
	public long pid;
}

class Video{
	public long id;
	public long banned;
	public String saddr;
	public long state;
	public Date stime;
	public String title;
	public Date usetime;
	public String vaddr;
	public long mid;
	public long uid;
}

class Online{
	public long id;
	public String ip;
	public long sstate;
	public long state;
	public long uid;
	public long vid;
	public long flower;
	public Date ltime;
}

class Praise{
	public long id;
	public Date ltime;
	public Date time;
	public long uid;
	public long vid;
}

class ReportBean{
	public boolean success;
	public Report data;
	public String msg;
}

class Report{
	public long id;
	public String content;
	public String pic;
	public long rtime;
	public long state;
	public long uid;
	public long vid;
}

class Subscibe{
	public long id;
	public Date time;
	public long uid;
	public long vid;
}