package net.codejava;
 
import java.util.ArrayList;
 
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
 
import com.google.gson.Gson;

import dto.Course;
import model.AccessManager;


@Path("/courseService")
public class CourseService
{
@GET
@Path("/courses/{id}")
@Produces("application/json")
public String courses(@PathParam("id") int id)
{
String courses = null;
ArrayList<Course> courseList = new ArrayList<Course>();
try
{
courseList = new AccessManager().getCourses(id);
Gson gson = new Gson();
courses = gson.toJson(courseList);
} catch (Exception e)
{
e.printStackTrace();
}
return courses;
}
}