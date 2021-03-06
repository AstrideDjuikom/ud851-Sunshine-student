package com.example.android.sunshine.data;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.android.sunshine.R;

public class ForecastAdapter extends RecyclerView.Adapter<ForecastAdapter.ForecastAdapterViewHolder> {

    private String[] mWeatherData;

    public ForecastAdapter() {
    }


    public class ForecastAdapterViewHolder extends RecyclerView.ViewHolder {
        public final TextView mWeatherTextView;


        public ForecastAdapterViewHolder(View itemView) {
            super(itemView);
            mWeatherTextView = (TextView) itemView.findViewById(R.id.tv_weather_data);
        }

    }

    @Override
    public ForecastAdapterViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        Context viewGroupContext = parent.getContext();
        int layoutIdListItem = R.layout.forecast_list_item;
        LayoutInflater inflater = LayoutInflater.from(viewGroupContext);
        boolean shouldAttachToParentImmediately = false;

        View view = inflater.inflate(layoutIdListItem, parent, shouldAttachToParentImmediately);
        return new ForecastAdapterViewHolder(view);
    }



    @Override
    public void onBindViewHolder(ForecastAdapterViewHolder holder, int position) {
        String todayWeather = mWeatherData[position];
        holder.mWeatherTextView.setText(todayWeather);
    }

    @Override
    public int getItemCount() {
        if (mWeatherData == null) {
            return 0;
        } else
            return mWeatherData.length;
    }


    public void setWeatherData(String[] weatherData) {
        mWeatherData = weatherData;
        notifyDataSetChanged();
    }
}
