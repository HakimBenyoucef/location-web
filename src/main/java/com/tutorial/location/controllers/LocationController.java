package com.tutorial.location.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.tutorial.location.entities.Location;
import com.tutorial.location.service.LocationService;

@Controller
public class LocationController {

	@Autowired
	LocationService locationService;
	
	@RequestMapping("/showCreate")
	public String showCreated()
	{
		return "createLocation";
	}
	
	@RequestMapping("saveLocation")
	public String saveLocation(@ModelAttribute("location") Location location, ModelMap modelMap){
		Location savedLocation = locationService.saveLocation(location);
		String msg = "Location saved with id "+savedLocation.getId();
		
		modelMap.addAttribute("msg", msg);
		return "createLocation";
	}
	
	@RequestMapping("displayLocations")
	public String displayLocations(ModelMap modelMap) {
		List<Location> list = locationService.getAllLocation();
		modelMap.addAttribute("locations", list);
		return "displayLocations";
	}
	
	@RequestMapping("deleteLocation")
	public String deleteLocation(@RequestParam("id") int id, ModelMap modelMap) {
		locationService.deleteLocation(locationService.getLocation(id));
		String msg = "Location "+ id + " deleted";
		List<Location> list = locationService.getAllLocation();
		modelMap.addAttribute("locations", list);
		modelMap.addAttribute("msg", msg);
		return "displayLocations";
	}
	
	@RequestMapping("/showUpdate")
	public String showUpdate(@RequestParam("id") int id, ModelMap modelMap)
	{
		Location location = locationService.getLocation(id);
		modelMap.addAttribute("location", location);
		return "updateLocation";
	}
	
	@RequestMapping("updateLocation")
	public String updateLocation(@ModelAttribute("location") Location location, ModelMap modelMap){
		locationService.updateLocation(location);
		List<Location> allLocation = locationService.getAllLocation();
		modelMap.addAttribute("locations", allLocation);
		return "displayLocations";
	}
}
