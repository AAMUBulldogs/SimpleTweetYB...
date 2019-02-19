package com.codepath.apps.restclienttemplate.models;

import org.json.JSONException;
import org.json.JSONObject;

public class Tweet {

    public String body;
    public long uid;
    public String createAt;
    public JSONObject user;

    public static Tweet fromJson(JSONObject jsonObject) throws JSONException {
        Tweet tweet = new Tweet();
        tweet.body = jsonObject.getString("text");
        tweet.body = String.valueOf(jsonObject.getLong("id"));
        tweet.createAt = jsonObject.getString("create at");
        tweet.user = (JSONObject) User.fromjsonObject.getJSONObject(Integer.parseInt("user")));

        return tweet;
    }
}
