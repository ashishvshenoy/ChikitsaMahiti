
package org.example.mymap;

import org.example.mymap.R;

import android.os.Bundle;

import com.google.android.maps.GeoPoint;
import com.google.android.maps.MapActivity;
import com.google.android.maps.MapController;
import com.google.android.maps.MapView;
import com.google.android.maps.MyLocationOverlay;

public class MyMap extends MapActivity {
   private MapView map;
   private MapController controller;
   

   @Override
   public void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      setContentView(R.layout.main);
      initMapView();
      initMyLocation();
   }

   /** Find and initialize the map view. */
   private void initMapView() {
      map = (MapView) findViewById(R.id.map);
      controller = map.getController();
      map.setStreetView(true); 
      map.setBuiltInZoomControls(true);
   }

   /** Start tracking the position on the map. */
   private void initMyLocation() {
      final MyLocationOverlay overlay = new MyLocationOverlay(this, map);
      Bundle bundle = this.getIntent().getExtras();
      String lat = bundle.getString("lat");
      String longitude = bundle.getString("longitude");
      int x = Integer.parseInt( lat );
      int y = Integer.parseInt( longitude );
      final GeoPoint p = new GeoPoint (x,y);
      overlay.enableMyLocation();
      //overlay.enableCompass(); // does not work in emulator
      overlay.runOnFirstFix(new Runnable() {
         public void run() {
            // Zoom in to current location
            controller.setZoom(10);
            controller.animateTo(p);
         }
      });
      map.getOverlays().add(overlay);
   }

   @Override
   protected boolean isRouteDisplayed() {
      // Required by MapActivity
      return false;
   }
}
