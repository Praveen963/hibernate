package in.nit.controller;

import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

@Path("/tab")
public class TableRestController {

	@POST
	public String table(@FormParam("number")int num,@FormParam("range")int range)
	{
		String message=null;
		String result="";
		if(num>0) {
			for(int i=1;i<=range;++i)
			{
				result=num+"*"+i+"="+num*i;
				System.out.println(result=num+"*"+i+"="+num*i);
			}
		}
		message="table"+num+" "+"result is:"+result;
		return message;
	}
}
