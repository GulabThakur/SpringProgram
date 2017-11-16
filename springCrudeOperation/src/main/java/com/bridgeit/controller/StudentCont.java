package com.bridgeit.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.bridgeit.bean.Students;
import com.bridgeit.model.StudentClass;
import com.bridgeit.service.StudentService;

@Controller
public class StudentCont {
	@Autowired
	 private StudentService employeeService;
	 
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public ModelAndView saveEmployee(@ModelAttribute("command")Students employeeBean, 
	   BindingResult result) {
	  StudentClass employee = prepareModel(employeeBean);
	  employeeService.addstudent(employee);
	  return new ModelAndView("redirect:/add.html");
	 }

	 @RequestMapping(value="/employees", method = RequestMethod.GET)
	 public ModelAndView listEmployees() {
	  Map<String ,Object> model = new HashMap<String, Object>();
	  model.put("employees",  prepareListofBean(employeeService.listEmployeess()));
	  return new ModelAndView("employeesList", model);
	 }

	 @RequestMapping(value = "/add", method = RequestMethod.GET)
	 public ModelAndView addEmployee(@ModelAttribute("command")Students employeeBean,
	   BindingResult result) {
	  Map<String, Object> model = new HashMap<String, Object>();
	  model.put("employees",  prepareListofBean(employeeService.listEmployeess()));
	  return new ModelAndView("addEmployee", model);
	 }
	 
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public ModelAndView welcome() {
	  return new ModelAndView("index");
	 }

	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	public ModelAndView editEmployee(@ModelAttribute("command")Students employeeBean,
	   BindingResult result) {
	  employeeService.deleteStudent(prepareModel(employeeBean));
	  Map<String, Object> model = new HashMap<String, Object>();
	  model.put("employee", null);
	  model.put("employees",  prepareListofBean(employeeService.listEmployeess()));
	  return new ModelAndView("addEmployee", model);
	 }
	 
	@RequestMapping(value = "/edit", method = RequestMethod.GET)
	public ModelAndView deleteEmployee(@ModelAttribute("command")Students employeeBean,
	   BindingResult result) {
	  Map<String, Object> model = new HashMap<String, Object>();
	  model.put("employee", prepareEmployeeBean(employeeService.getEmployee(employeeBean.getId())));
	  model.put("employees",  prepareListofBean(employeeService.listEmployeess()));
	  return new ModelAndView("addEmployee", model);
	 }
	 
	 private StudentClass prepareModel(Students employeeBean){
		 StudentClass employee = new StudentClass();
	  employee.setStudentName(employeeBean.getName());
	  employee.setStudentAge(employeeBean.getAge());
	  employee.setStudentId(employeeBean.getId());
	  employeeBean.setId(0);
	  return employee;
	 }
	
	 private List<Students> prepareListofBean(List<StudentClass> employees){
	  List<Students> beans = null;
	  if(employees != null && !employees.isEmpty()){
	   beans = new ArrayList<Students>();
	   Students bean = null;
	   for(StudentClass employee : employees){
	    bean = new Students();
	    bean.setName(employee.getStudentName());
	    bean.setId(employee.getStudentId());
	    bean.setAge(employee.getStudentAge());
	    beans.add(bean);
	   }
	  }
	  return beans;
	 }
	 
	 private Students prepareEmployeeBean(StudentClass employee){
	  Students bean = new Students();
	  bean.setAge(employee.getStudentAge());
	  bean.setName(employee.getStudentName());
	  bean.setId(employee.getStudentId());
	  return bean;
	 }
}
