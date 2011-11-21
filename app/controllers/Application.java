package controllers;

import java.util.List;

import models.Tweet;
import play.mvc.Controller;

public class Application extends Controller {

	public static void index() {
		List tweets = Tweet.findLatest();
		render(tweets);
	}

	public static void create(String msg) {
		Tweet tweet = new Tweet();
		tweet.tweet = msg;
		tweet.save();
		render(tweet);
	}

	public static void tweets() {
		List tweets = Tweet.findLatest();
		renderJSON(tweets);
	}
}
