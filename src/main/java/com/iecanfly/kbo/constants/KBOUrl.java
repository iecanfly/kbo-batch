package com.iecanfly.kbo.constants;

/**
 * Created with IntelliJ IDEA.
 * User: iecanfly
 * Date: 8/1/13
 * Time: 4:38 PM
 * To change this template use File | Settings | File Templates.
 */
public enum KBOUrl {
    PLAYER_SEARCH_PITCHER("http://www.koreabaseball.com/Record/PlayerSearch.aspx?position=%ED%88%AC"),
    PLAYER_SEARCH_CATCHER("http://www.koreabaseball.com/Record/PlayerSearch.aspx?position=%ED%8F%AC"),
    PLAYER_SEARCH_INFIELDER("http://www.koreabaseball.com/Record/PlayerSearch.aspx?position=%EB%82%B4"),
    PLAYER_SEARCH_OUTFIELDER("http://www.koreabaseball.com/Record/PlayerSearch.aspx?position=%EC%99%B8");

    private KBOUrl(String url) {
        this.url = url;
    }

    private final String url;

    public String getUrl() {
        return url;
    }

}
