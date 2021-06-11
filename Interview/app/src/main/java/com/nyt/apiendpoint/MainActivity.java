package com.nyt.apiendpoint;

import android.os.Bundle;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.appcompat.app.AppCompatActivity;

import android.view.Menu;
import android.view.MenuItem;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.nyt.apiendpoint.adapter.NewsAdapter;
import com.nyt.apiendpoint.models.News;
import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    RecyclerView PopularNews;
    RequestQueue requestQueue;
    NewsAdapter adapter;
    List<News> popularnews = new ArrayList<News>();
    void GetPopularNews() {
        String url = "https://api.nytimes.com/svc/mostpopular/v2/viewed/1.json?api-key=iDWGnTdTtTIEd87sjQT2fbS1LWUtCBbs";

        JsonArrayRequest jsonArrayRequest = new JsonArrayRequest(Request.Method.GET, url, null, new Response.Listener<JSONArray>() {
            @Override
            public void onResponse(JSONArray response) {
                JSONArray jsonArray = response;
                try {
                    for(int i=0;i<jsonArray.length();i++)
                    {
                        JSONObject jsonObject = jsonArray.getJSONObject(i);
                        String id = jsonObject.getString("id");
                        String uri = jsonObject.getString("uri");
                        String url = jsonObject.getString("url");
                        String asset_id = jsonObject.getString("asset_id");
                        String source = jsonObject.getString("source");
                        String published_date = jsonObject.getString("published_date");

                        String section = jsonObject.getString("section");
                        String subsection = jsonObject.getString("subsection");
                        String nytdsection = jsonObject.getString("nytdsection");
                        String adx_keywords = jsonObject.getString("adx_keywords");
                        String updated = jsonObject.getString("published_date");
                        String column = jsonObject.getString("column");
                        String byline = jsonObject.getString("byline");
                        String type = jsonObject.getString("type");
                        String title = jsonObject.getString("title");
                        String abstractinfo = jsonObject.getString("abstract");

                        String des_facet = jsonObject.getString("des_facet");


                        popularnews.add(new News(id,  uri, url,  asset_id,  source,  published_date,  updated, section, subsection,  nytdsection,  adx_keywords,  column, byline,type,  title, abstractinfo,  column, des_facet));



                    }
                    adapter.notifyDataSetChanged();//To prevent app from crashing when updating
                    //UI through background Thread
                }
                catch (Exception w)
                {
                    //Toast.makeText(MainActivity.this,w.getMessage(),Toast.LENGTH_LONG).show();
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

            }
        });
        requestQueue.add(jsonArrayRequest);
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        GetPopularNews();


        PopularNews = findViewById(R.id.popularnews);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this, LinearLayoutManager.HORIZONTAL, false);
        PopularNews.setLayoutManager(layoutManager);
        PopularNews.setItemAnimator(new DefaultItemAnimator());



        PopularNews.setAdapter(adapter);














    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}