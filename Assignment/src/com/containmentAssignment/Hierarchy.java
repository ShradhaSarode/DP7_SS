package com.containmentAssignment;

public class Hierarchy
{
	public static void main(String[] args)
	{
		Institute i1=new Institute();
		Branch b=new Branch();
		Subject s=new Subject();
		Topic t=new Topic();
		SubTopic st=new SubTopic();
		Question q=new Question();
		
		q.setqId(1);
		q.setqName("WAP in Java?");
		
		q.setSt(st);
		
		q.getSt().settId(101);
		q.getSt().settName("2D-Array");
		
		q.getSt().setT(t);
		
		q.getSt().getT().settId(159);
		q.getSt().getT().settName("Array");
		
		q.getSt().getT().setS(s);
		
		q.getSt().getT().getS().setsId(753);
		q.getSt().getT().getS().setsName("Java");
		
		q.getSt().getT().getS().setBranch(b);
		
		q.getSt().getT().getS().getBranch().setbId(963);
		q.getSt().getT().getS().getBranch().setbName("Computer Science");
		
		q.getSt().getT().getS().getBranch().setI(i1);
		
		q.getSt().getT().getS().getBranch().getI().setiId(555);
		q.getSt().getT().getS().getBranch().getI().setiName("IIMS");
		
		System.out.println("Question id :"+q.getqId()+"\n"
				                     +"question:"+q.getqName()+"\n"
				                    +"SubTopic id:" +q.getSt().gettId()+"\n"
				                    +"SubTopic:"+q.getSt().gettName()+"\n"
				                    +"Topic id:"+q.getSt().getT().gettId()+"\n"
				                    +"Topic Name:"+q.getSt().getT().gettName()+"\n"
				                    +"Subject id:"+q.getSt().getT().getS().getsId()+"\n"
				                    +"Subject Name:"+q.getSt().getT().getS().getsName()+"\n"
				                    +"Branch id:"+q.getSt().getT().getS().getBranch().getbId()+"\n"
				                    +"Branch Name:"+q.getSt().getT().getS().getBranch().getbName()+"\n"
				                    +"Institute id:"+q.getSt().getT().getS().getBranch().getI().getiId()+"\n"
				                    +"Indtitute name:"+q.getSt().getT().getS().getBranch().getI().getiName()+"\n"
				                    );
		
	}
}
