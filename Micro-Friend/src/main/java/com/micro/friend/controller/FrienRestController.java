package com.micro.friend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.micro.friend.entity.Friend;
import com.micro.friend.service.IFriendService;

@RestController
public class FrienRestController {
@Autowired
IFriendService service;
@PostMapping("/addFriend")
public String addFriend(@RequestBody Friend friend)
{
	return service.addFriendService(friend);
}
@GetMapping("/{phoneNumber}")
public List<Long> getFriendsContacts(@PathVariable Long phoneNumber)
{
	return service.readFriendsContact(phoneNumber);
}
@DeleteMapping("/removeFriend/{phoneNumber}/{friendNumber}")
public Integer removeFriend(@PathVariable Long phoneNumber,@PathVariable Long friendNumber)
{
	System.out.println("phonenumber"+phoneNumber+"FriendNumber"+friendNumber);
	return service.removeFriend(phoneNumber, friendNumber);
}
}
