package google;

package com.jspservletcookbook;    

import java.io.IOException;  
import java.io.PrintWriter;     

import javax.servlet.*;
import javax.servlet.http.*;

public class GoogleServlet extends HttpServlet {
    
  public void doGet(HttpServletRequest request, 
    HttpServletResponse response)
    throws ServletException, java.io.IOException {
    
      response.setContentType("text/html");
        
      java.io.PrintWriter out = response.getWriter( );
        
      out.println("<html><head>");
      out.println("<title>Initiate a Google Search</title></head><body>");
      out.println("<h2>Please enter your search terms</h2>");
   
      //Make sure method="POST" so that the servlet service method
      //calls doPost in the response to this form submit
      out.println(
        "<form method=\"POST\" action =\"" + request.getContextPath( ) +
            "/googleservlet\" >");

      out.println("<table border=\"0\"><tr><td valign=\"top\">");
      out.println("Search terms: </td>  <td valign=\"top\">");
      out.println("<input type=\"text\" name=\"query\" size=\"15\">");
      out.println("</td></tr><tr><td valign=\"top\">");
          out.println(
      "Restrict to Google sub-site... </td>  <td valign=\"top\">");
      out.println(
        "<select name=\"restrict\"><option>unclesam</option>"+
        "<option>linux</option>option>mac</option><option>bsd</option>"+
        "</select>");
      out.println("</td></tr><tr><td valign=\"top\">");
      out.println(
      "<input type=\"submit\" value=\"Submit Info\"></td></tr>");
      out.println("</table></form>");
      out.println("</body></html>");
     } //doGet
         
  public void doPost(HttpServletRequest request, 
    HttpServletResponse response)
    throws ServletException,java.io.IOException{
           
      String query = request.getParameter("query");
      String restrict = request.getParameter("restrict");
      boolean isValid = (query == null || query.length( ) < 1) ?
          false : true;

      //set the MIME type of the response, "text/html"
      response.setContentType("text/html");
 
      java.io.PrintWriter out = response.getWriter( );

      out.println("<html><head>");
      out.println("<title>Google results</title></head><body>");
 
      if (! isValid){
              out.println(
          "<h2>Sorry, the query parameter was either empty or null</h2>");
          } else {
              out.println("<h2>Here are your search results</h2>");
              GoogleBean gb = new GoogleBean( );
              gb.setFilter(true);
              //Configure for web display 
              gb.setLineSep("<br />");
              if (restrict != null && restrict.length( ) > 0)
              gb.setRestrict(restrict);
              gb.setQuery(query);
              try {
                  out.println( gb.getSearchResults( ) );
              } catch (Exception e){
                  throw new ServletException( e.getMessage( ) );
              }
      }//if
          out.println("</body></html>");
        
  }// doPost
}//GoogleServlet