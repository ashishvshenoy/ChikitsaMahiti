package org.example.mymap;

import java.util.List;

import org.example.mymap.R;

import android.graphics.drawable.Drawable;
import android.os.Bundle;

import com.google.android.maps.GeoPoint;
import com.google.android.maps.MapActivity;
import com.google.android.maps.MapController;
import com.google.android.maps.MapView;
import com.google.android.maps.Overlay;
import com.google.android.maps.OverlayItem;

public class GMapsActivity extends MapActivity {
    
    private MapView mapView;
    
    private static int latitudeE6;
    private static int longitudeE6;
    private static String name, address, phone;
   
    @Override
    public void onCreate(Bundle savedInstanceState) {
    	 Bundle bundle = this.getIntent().getExtras();
         String lat = bundle.getString("lat");
         String longitude = bundle.getString("longitude");
         name = bundle.getString("name");
         address = bundle.getString("address");
         phone = bundle.getString("phone");
         latitudeE6 = Integer.parseInt( lat );
         longitudeE6 = Integer.parseInt( longitude );
        
        super.onCreate(savedInstanceState);
        setContentView(R.layout.overlay);
        
        mapView = (MapView) findViewById(R.id.map_view);       
        mapView.setBuiltInZoomControls(true);
        mapView.setStreetView(true);
        
        List<Overlay> mapOverlays = mapView.getOverlays();
        Drawable drawable = this.getResources().getDrawable(R.drawable.hospital);
        CustomItemizedOverlay itemizedOverlay = 
             new CustomItemizedOverlay(drawable, this);
        
        GeoPoint point = new GeoPoint(latitudeE6, longitudeE6);
        
        OverlayItem overlayitem = 
             new OverlayItem(point, "Hospital: "+ name, address + " " + phone);
        
        
        itemizedOverlay.addOverlay(overlayitem);
        mapOverlays.add(itemizedOverlay);
        
        
        MapController mapController = mapView.getController();
        
        mapController.animateTo(point);
        mapController.setZoom(15);
        
    }

    @Override
    protected boolean isRouteDisplayed() {
        return false;
    }
    
}
