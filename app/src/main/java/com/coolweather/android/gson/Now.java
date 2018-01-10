package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by SweetSalt on 2018/1/10.
 */

public class Now {

    @SerializedName("tmp")
    public String temperture;

    @SerializedName("cond")
    public More more;

    public class More{

        @SerializedName("txt")
        public String info;
    }
}
