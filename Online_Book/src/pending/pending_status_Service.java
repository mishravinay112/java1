package pending;

import java.util.ArrayList;


public class pending_status_Service {
public ArrayList<pending_status_Dto> view()
{
  pending_statusDao s=new pending_statusDao();
  ArrayList<pending_status_Dto> al=s.view();
  return al;
}
}
