package com.example.leaderprofile;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycleView);

        List<Details> detailsList = new ArrayList<>();

        detailsList.add(new Details("Abraham Lincoln", R.drawable.abraham, "Abraham Lincoln was an American statesman and lawyer who served as the 16th president of the United States from March 1861 until his assassination in April 1865."));
        detailsList.add(new Details("Barack Obama", R.drawable.barack, "Barack Hussein Obama II is an American attorney and politician who served as the 44th president of the United States from 2009 to 2017."));
        detailsList.add(new Details("Bill Clinton", R.drawable.bill,"William Jefferson Clinton is an American politician who served as the 42nd president of the United States from 1993 to 2001."));
        detailsList.add(new Details("John F. Kennedy", R.drawable.jfk,"John Fitzgerald Kennedy, often referred to by the initials JFK and Jack, was an American politician who served as the 35th president of the United States from January 1961 until his assassination in November 1963."));
        detailsList.add(new Details("Ronald Regan", R.drawable.regan,"Ronald Wilson Reagan was an American politician who served as the 40th president of the United States from 1981 to 1989 and became the highly influential voice of modern conservatism. "));
        detailsList.add(new Details("George W. Bush", R.drawable.wbush,"George Walker Bush is an American politician and businessman who served as the 43rd president of the United States from 2001 to 2009. "));
        detailsList.add(new Details("Gerald Ford", R.drawable.gerald,"Gerald Rudolph Ford Jr. was an American politician who served as the 38th president of the United States from August 1974 to January 1977"));
        detailsList.add(new Details("Donald Trump", R.drawable.donald,"Donald John Trump is the 45th and current president of the United States. Before entering politics, he was a businessman and television personality."));

        DetailsAdapter detailsAdapter = new DetailsAdapter(this, detailsList);
        recyclerView.setAdapter(detailsAdapter);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 2));


    }


}
