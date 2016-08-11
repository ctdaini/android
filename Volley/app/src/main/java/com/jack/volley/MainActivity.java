package com.jack.volley;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.jack.volley.amap.AmapMainActivity;
import com.xys.libzxing.zxing.activity.CaptureActivity;

public class MainActivity extends AppCompatActivity {
    private static final int ZXING_CAMERA_PERMISSION = 1;
    private Class<?> mClss;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        volleyGet();
//        volleyJson();
//        volleyPost();
//        volleyPostJson();
//setupToolbar();
//        startForQrScan();
    }

    public void amapActivity(View view) {
        //高德地图
        Intent intent =new Intent(this,AmapMainActivity.class);
        startActivity(intent);
    }

    //    public void setupToolbar() {
//        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);
//    }
//private void startForQrScan() {
//    startActivityForResult(new Intent(this, CaptureActivity.class), 0);
//}

    public void launchSimpleActivity(View v) {
        //二维码扫描测试
//        Intent intent =new Intent(this,SimpleScannerActivity.class);
//        startActivity(intent);
        startActivityForResult(new Intent(this, CaptureActivity.class), 0);

    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        //二维码数据回传
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == RESULT_OK){
            Bundle bundle = data.getExtras();
            String result = bundle.getString("result");
//            L.d("result: " + result);
            Toast.makeText(MainActivity.this,
                    result.toString(),
                                Toast.LENGTH_LONG).show();
        }
    }
    public void btn_listview(View view) {
        //列表功能
        Intent intent=new Intent(this,ListviewActivity.class);
        startActivity(intent);
//        startActivityForResult(new Intent(this, CaptureActivity.class), 0);

    }



    //private void volleyGson() {
//
//        GsonRequest<Weather> gsonRequest = new GsonRequest<Weather>(
//                "https://tcc.taobao.com/cc/json/mobile_tel_segment.htm?tel=13025552655", Weather.class,
//                new Response.Listener<Weather>() {
//                    @Override
//                    public void onResponse(Weather weather) {
//                        WeatherInfo weatherInfo = weather.getWeatherinfo();
//                        Toast.makeText(MainActivity.this,
//                                weatherInfo.getTelString().toString(),
//                                Toast.LENGTH_LONG).show();
////                        Log.d("TAG", "city is " + weatherInfo.getTelString());
////                        Log.d("TAG", "temp is " + weatherInfo.getCarrier());
////                        Log.d("TAG", "time is " + weatherInfo.getProvince());
//                    }
//                }, new Response.ErrorListener() {
//            @Override
//            public void onErrorResponse(VolleyError error) {
////                Log.e("TAG", error.getMessage(), error);
//                Toast.makeText(MainActivity.this,
//                        error.getMessage().toString(),
//                        Toast.LENGTH_LONG).show();
//            }
//        });
////        mQueue.add(gsonRequest);



//    }
//    private void volleyPostJson() {
//        String url = "http://118.244.214.126:8080/login";
//        Map<String,String> map = new HashMap<>();
//         map.put("userName","hlpadmin");
//         map.put("password","qwerasdf");
//        //将map转化为JSONObject对象
//        JSONObject jsonObject = new JSONObject(map);
//
//        JsonObjectRequest request = new JsonObjectRequest(Request.Method.POST, url, jsonObject,
//                new Response.Listener<JSONObject>() {
//                    @Override
//                    public void onResponse(JSONObject jsonObject) {//jsonObject为请求返回的Json格式数据
//                        Toast.makeText(MainActivity.this,jsonObject.toString(),Toast.LENGTH_LONG).show();
//                    }
//                },
//                new Response.ErrorListener() {
//                    @Override
//                    public void onErrorResponse(VolleyError volleyError) {
//                        Toast.makeText(MainActivity.this,volleyError.toString(),Toast.LENGTH_LONG).show();
//                    }
//                });
//        //设置请求的Tag标签，可以在全局请求队列中通过Tag标签进行请求的查找
//        request.setTag("testPost");
//        //将请求加入全局队列中
//        MyApplication.getHttpQueues().add(request);
//    }
//    private void volleyPostJson() {
//    String url ="http://118.244.214.126:8080/login";
//        //将map转化为JSONObject对象
//        Map<String,String> map=new HashMap<>();
//        map.put("userName","hlpadmin");
//        map.put("password","qwerasdf");
//
//        JSONObject jsonObject=new JSONObject(map);
//        JsonObjectRequest request =new JsonObjectRequest(Request.Method.POST, url, jsonObject,
//                new Response.Listener<JSONObject>() {
//                    @Override
//                    public void onResponse(JSONObject jsonObject) {
//                        Toast.makeText(MainActivity.this,jsonObject.toString(),Toast.LENGTH_LONG).show();
//                    }
//                },
//                new Response.ErrorListener() {
//                    @Override
//                    public void onErrorResponse(VolleyError volleyError) {
//                        Toast.makeText(MainActivity.this,volleyError.toString(),Toast.LENGTH_LONG).show();
//                    }
//                });
//        request.setTag("postJSON");
//        MyApplication.getHttpQueues().add(request);
//
//
//    }

    /*
     * 使用Post方式返回String类型的请求结果数据
     *
     *  new StringRequest(int method,String url,Listener listener,ErrorListener errorListener)
     *  method：请求方式，Get请求为Method.GET，Post请求为Method.POST
     *  url：请求地址
     *  listener：请求成功后的回调
     *  errorListener：请求失败的回调
     */
//    private void volleyPost() {
//
//        String url="http://www.app2vr.com/capp/model/select_index.php?n=0";
////        String url = "http://118.244.214.126:8080/login";
//       // String url = "http://baike.baidu.com/api/openapi/BaikeLemmaCardApi?scope=103&format=json&appid=379020&bk_key=生活";
//                StringRequest request=new StringRequest(Request.Method.POST, url, new Response.Listener<String>() {
//            @Override
//            public void onResponse(String s) {
//                Toast.makeText(MainActivity.this,s,Toast.LENGTH_LONG).show();
//                parseJsonWithGson(s);
//
//            }
//        },
//                new Response.ErrorListener() {
//                    @Override
//                    public void onErrorResponse(VolleyError volleyError) {
//                        Toast.makeText(MainActivity.this,volleyError.toString(),Toast.LENGTH_LONG).show();
//
//                    }
//                }){
//                    @Override
//                    protected Map<String, String> getParams() throws AuthFailureError {
//                        Map<String,String> map = new HashMap<>();
//                        //将请求参数名与参数值放入map中
////                        map.put("tel","13025552655");
////                        map.put("n","0");
//                        return map;
//                    }
//
//                }
//
//
//
//                        ;
//        //设置TAG标签,可以在全局请求队列中通过Tag标签进行请求的查找
//        request.setTag("phonePost");
//    MyApplication.getHttpQueues().add(request);
//
//
//    }

//    private void parseJsonWithGson(String jsonData) {
//        Gson gson= new Gson();
//        loginInfo logininfo=gson.fromJson(jsonData,loginInfo.class);
////        List<baidu> loginInfoList=gson.fromJson(jsonData,new TypeToken<List<baidu>>(){}.getType());
////        for (baidu bd:loginInfoList ){
////           // Toast.makeText(MainActivity.this,logininfo.getMsg(),Toast.LENGTH_LONG).show();
////            Log.d("MainActivity","id is "+bd.getDesc());
////            Toast.makeText(MainActivity.this,bd.getDesc(),Toast.LENGTH_LONG).show();
////        }
//        Toast.makeText(MainActivity.this,logininfo.getMsg(),Toast.LENGTH_LONG).show();
//    }

    /*
     *  new JsonObjectRequest(int method,String url,JsonObject jsonObject,Listener listener,ErrorListener errorListener)
     *  method：请求方式，Get请求为Method.GET，Post请求为Method.POST
     *  url：请求地址
     *  JsonObject：Json格式的请求参数。如果使用的是Get请求方式，请求参数已经包含在url中，所以可以将此参数置为null
     *  listener：请求成功后的回调
     *  errorListener：请求失败的回调
     */
//    private void volleyJson() {
////        String url="https://tcc.taobao.com/cc/json/mobile_tel_segment.htm?tel=13025552655";
////        String url = "http://int.dpool.sina.com.cn/iplookup/iplookup.php?format=json&ip=218.4.255.255";
//        String url="http://118.244.214.126:8080/data/flashStatus?_=1469672041130";
//        JsonObjectRequest request =new JsonObjectRequest(Request.Method.GET, url, null,
//                new Response.Listener<JSONObject>() {
//                    @Override
//                    public void onResponse(JSONObject jsonObject) {
//                        Toast.makeText(MainActivity.this,jsonObject.toString(),Toast.LENGTH_LONG).show();
////                        Log.d("TAG", jsonObject.toString());
//                    }
//                },
//                new Response.ErrorListener() {
//                    @Override
//                    public void onErrorResponse(VolleyError volleyError) {
//                        Toast.makeText(MainActivity.this,volleyError.toString(),Toast.LENGTH_LONG).show();
//                    }
//                });
//        request.setTag("jsonGET");
//        MyApplication.getHttpQueues().add(request);
//    }
//

    /*
     *  new StringRequest(int method,String url,Listener listener,ErrorListener errorListener)
     *  method：请求方式，Get请求为Method.GET，Post请求为Method.POST
     *  url：请求地址
     *  listener：请求成功后的回调
     *  errorListener：请求失败的回调
     */
//    private void volleyGet() {
//        String url="http://www.app2vr.com/capp/model/select_index.php";
//       // String url="http://118.244.214.126:8080/data/flashStatus?_=1469672041130";
//        StringRequest request=new StringRequest(Request.Method.GET, url, new Response.Listener<String>() {
//            @Override
//            public void onResponse(String s) {
//                Toast.makeText(MainActivity.this,s,Toast.LENGTH_LONG).show();
//                parseJsonWithGson(s);
//            }
//        },
//                new Response.ErrorListener() {
//                    @Override
//                    public void onErrorResponse(VolleyError volleyError) {
//                        Toast.makeText(MainActivity.this,volleyError.toString(),Toast.LENGTH_LONG).show();
//
//                    }
//                });
//        //设置TAG标签,可以在全局请求队列中通过Tag标签进行请求的查找
//        request.setTag("phoneGET");
//    MyApplication.getHttpQueues().add(request);
//
//    }
//    private void parseJsonWithGson(String jsonData) {
//        Gson gson= new Gson();
//        // json数据解析
//        // loginInfo logininfo=gson.fromJson(jsonData,loginInfo.class);
//        //json数组解析
//        List<app2vr> loginInfoList=gson.fromJson(jsonData,new TypeToken<List<app2vr>>(){}.getType());
//        for (app2vr vr:loginInfoList ){
//            Toast.makeText(MainActivity.this,vr.getAnswer(),Toast.LENGTH_SHORT).show();
//        }
//    }


//    在Activity关闭时取消请求队列中的请求
//    protected void onStop(){
//        super.onStop();
//        MyApplication.getHttpQueues().cancelAll("phonePost");
//    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        //在activity执行onDestroy时执行mMapView.onDestroy()，实现地图生命周期管理
    }
    @Override
    protected void onResume() {
        super.onResume();
        //在activity执行onResume时执行mMapView.onResume ()，实现地图生命周期管理
    }
    @Override
    protected void onPause() {
        super.onPause();
        //在activity执行onPause时执行mMapView.onPause ()，实现地图生命周期管理
    }
    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        //在activity执行onSaveInstanceState时执行mMapView.onSaveInstanceState (outState)，实现地图生命周期管理
    }
}
