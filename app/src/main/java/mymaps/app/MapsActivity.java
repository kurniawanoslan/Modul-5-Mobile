package mymaps.app;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;


        LatLng sma5 = new LatLng(-1.242293, 116.897379);
        mMap.addMarker(new MarkerOptions().position(sma5).title("SMA Negeri 5 Balikpapan"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sma5));

        LatLng smk4 = new LatLng(-1.239118, 116.884837);
        mMap.addMarker(new MarkerOptions().position(smk4).title("SMK Negeri 4 Balikpapan"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(smk4));

        LatLng smk3 = new LatLng(-1.239840, 116.885554  );
        mMap.addMarker(new MarkerOptions().position(smk3).title("SMK Negeri 3 Balikpapan"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(smk3));

        LatLng smp14 = new LatLng(-1.244513, 116.887825  );
        mMap.addMarker(new MarkerOptions().position(smp14).title("SMP Negeri 14 Balikpapan"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(smp14));

        LatLng smp18 = new LatLng(-1.244590, 116.900048  );
        mMap.addMarker(new MarkerOptions().position(smp18).title("SMP Negeri 18 Balikpapan"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(smp18));


    }
}
