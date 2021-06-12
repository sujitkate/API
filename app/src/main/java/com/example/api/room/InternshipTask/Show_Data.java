package com.example.api.room.InternshipTask;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.example.api.R;
import com.example.api.room.Entity_class2;
import com.example.api.room.Internship_Api;
import java.util.List;

import static com.example.api.room.AddData.TAG;

public class Show_Data extends AppCompatActivity {
    private RecyclerView recyclerView2;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show__data);

        recyclerView2=findViewById(R.id.recyclerID2);
        recyclerView2.setHasFixedSize(true);
        recyclerView2.setLayoutManager(new LinearLayoutManager(this));

            getData2();

        }
   private void getData2()
    {
        Toast.makeText(this, "Called21", Toast.LENGTH_SHORT).show();


    class GetData extends AsyncTask<Void,Void, List<Entity_class2 >>
    {
        @Override
        protected List<Entity_class2> doInBackground(Void... voids)
        {
             List<Entity_class2> class2 = Internship_Api
                        .mydatabase2
                        .todoDao2()
                        .getAllCountries();
             return class2;
        }
        @Override
        protected void onPostExecute(List<Entity_class2> entity_class2s) {
            try {
                Adaptor4 adaptor4 = new Adaptor4(entity_class2s,Show_Data.this);
                recyclerView2.setAdapter(adaptor4);
                super.onPostExecute(entity_class2s);
            }catch (Exception r)
            {
                Log.e(TAG,"eror2"+r.getLocalizedMessage());
            }
        }

    }
    GetData getData1 = new GetData();
    getData1.execute();
    }
}