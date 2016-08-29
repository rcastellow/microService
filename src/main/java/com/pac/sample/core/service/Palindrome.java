package com.pac.sample.core.service;

import org.apache.commons.lang3.StringUtils;

/**
 * Created by RobCastellow on 8/20/16.
 */
public class Palindrome {

    private final long id;
    private final String content;
    private final Boolean isPalindrome;

    public Palindrome(long id, String content) {
        this.id = id;
        this.content = content;
        this.isPalindrome = isPalindrome(content);
    }

    private Boolean isPalindrome(String content) {
        String reversedString = (null != content) ? StringUtils.reverse(content.trim()) : StringUtils.EMPTY;
        return StringUtils.equalsIgnoreCase(content, reversedString);
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public Boolean getPalindrome() {
        return isPalindrome;
    }
}
