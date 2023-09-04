package com.ceihtel.leetcode;

/**
 * https://leetcode.com/problems/invalid-tweets/
 */
public class InvalidTweets {
    /**
     * CHAR_LENGTH is better than LENGTH as some special characters can be encoded on multiple bytes, thus LENGTH would
     * return an incorrect result
     */
    public String solution() {
        return "select tweet_id from Tweets where char_length(content) > 15;";
    }
}
