import io.restassured.response.Response;
import org.json.JSONObject;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.get;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;


// This is one test branch

public class GetRequestFromGithubTest {
    String stringURL = "https://api.github.com/users/rusakov66";
    Response response = get(stringURL);
    public JSONObject jsonResponse = new JSONObject(response.asString());

    String name = jsonResponse.getString("name");
    String login = jsonResponse.getString("login");

    @Test
    public void getRequestFromGithubTest() {
        System.out.println(name + login);
        /*int i = response.getStatusCode();
        System.out.println("----------- Status code is "+i);
        String statusLine = response.getStatusLine();
        assertThat(statusLine , is("HTTP/1.1 200 OK"));
        System.out.println(statusLine);*/


        assertAll(
                () -> assertThat("Iurii Rusakov", is(name)),
                () -> assertThat("rusakov66EEEEE", is(login))
        );
        System.out.println(name + login);
        /*int id = jsonResponse.getInt("id");
        assertThat(id, equalTo(16705398));

        String node_id = jsonResponse.getString("node_id");
        assertThat(node_id, is("MDQ6VXNlcjE2NzA1Mzk4"));
        String url = jsonResponse.getString("url");
        assertThat(url, is("https://api.github.com/users/rusakov66"));
        String html_url = jsonResponse.getString("html_url");
        assertThat(html_url, is("https://github.com/rusakov66"));
        String followers_url = jsonResponse.getString("followers_url");
        assertThat(followers_url, is("https://api.github.com/users/rusakov66/followers"));
        String following_url = jsonResponse.getString("following_url");
        assertThat(following_url, is("https://api.github.com/users/rusakov66/following{/other_user}"));
        String gists_url = jsonResponse.getString("gists_url");
        assertThat(gists_url, is("https://api.github.com/users/rusakov66/gists{/gist_id}"));
        String starred_url = jsonResponse.getString("starred_url");
        assertThat(starred_url, is("https://api.github.com/users/rusakov66/starred{/owner}{/repo}"));
        String subscriptions_url = jsonResponse.getString("subscriptions_url");
        assertThat(subscriptions_url, is("https://api.github.com/users/rusakov66/subscriptions"));
        String organizations_url = jsonResponse.getString("organizations_url");
        assertThat(organizations_url, is("https://api.github.com/users/rusakov66/orgs"));
        String repos_url = jsonResponse.getString("repos_url");
        assertThat(repos_url, is("https://api.github.com/users/rusakov66/repos"));
        String events_url = jsonResponse.getString("events_url");
        assertThat(events_url, is("https://api.github.com/users/rusakov66/events{/privacy}"));
        String received_events_url = jsonResponse.getString("received_events_url");
        assertThat(received_events_url, is("https://api.github.com/users/rusakov66/received_events"));
        String type = jsonResponse.getString("type");
        assertThat(type, is("User"));
        Boolean site_admin = jsonResponse.getBoolean("site_admin");
        assertThat(site_admin, is(false));
        String company = jsonResponse.getString("company");
        assertThat(company, is(notNullValue()));
        String blog = jsonResponse.getString("blog");
        assertThat(blog, is(""));
        String location = jsonResponse.getString("location");
        assertThat(location, is(notNullValue()));
        String email = jsonResponse.getString("email");
        assertThat(email, is(notNullValue()));
        String hireable = jsonResponse.getString("hireable");
        assertThat(hireable, is(notNullValue()));
        String bio = jsonResponse.getString("bio");
        assertThat(bio, is(notNullValue()));
        int public_repos = jsonResponse.getInt("public_repos");
        assertThat(public_repos, is(4));
        int public_gists = jsonResponse.getInt("public_gists");
        assertThat(public_gists, is(0));
        int followers = jsonResponse.getInt("followers");
        assertThat(followers, is(0));
        int following = jsonResponse.getInt("following");
        assertThat(following, is(0));

        int id = jsonResponse.getInt("id");
        assertThat(id, equalTo(16705398));

        String created_at = jsonResponse.getString("created_at");
        assertThat(created_at, is("2016-01-14T15:18:18Z"));

        String updated_at = jsonResponse.getString("updated_at");
        SimpleDateFormat format = new SimpleDateFormat();
        format.applyPattern("yyyy-MM-dd'T'HH:mm:ss");
        Date docDate = format.parse(updated_at);
        System.out.println(docDate); // Tue May 28 07:39:14 EEST 2019
        assertThat(updated_at, is("2019-05-21T08:12:28Z"));

        String gravatar_id = jsonResponse.getString("gravatar_id");
        assertThat(gravatar_id, is(""));
        System.out.println(gravatar_id);

        String avatar_url = jsonResponse.getString("avatar_url");
        assertThat(avatar_url, is("https://avatars1.githubusercontent.com/u/16705398?v=4"));
        Response response2 = get(avatar_url);

        int i = response2.getStatusCode();
        System.out.println("----------- Status code is " + i);
        String statusLine = response2.getStatusLine();
        assertThat(statusLine, is("HTTP/1.1 200 OK"));
        System.out.println(statusLine);*/
    }
}
