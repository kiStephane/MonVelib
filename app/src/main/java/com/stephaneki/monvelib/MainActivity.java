package com.stephaneki.monvelib;

import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

import com.stephaneki.monvelib.fragments.FavoritesFragment;
import com.stephaneki.monvelib.fragments.MapsFragment;
import com.stephaneki.monvelib.fragments.ProfileFragment;
import com.stephaneki.monvelib.services.JcDecauxAPIservices;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity
        implements FavoritesFragment.OnFavoritesFragmentInteractionListener
        , MapsFragment.OnMapsFragmentInteractionListener
        , ProfileFragment.OnProfileFragmentInteractionListener {

    private Retrofit velibRetrofit;
    private Retrofit backOfficeRetrofit;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            Fragment fragment;
            switch (item.getItemId()) {
                case R.id.navigation_maps:
                    fragment = getSupportFragmentManager().findFragmentByTag(MapsFragment.TAG);
                    if (fragment == null) {
                        fragment = MapsFragment.newInstance("", "");
                    }
                    replaceFragment(fragment, MapsFragment.TAG);
                    return true;
                case R.id.navigation_dashboard:
                    fragment = getSupportFragmentManager().findFragmentByTag(FavoritesFragment.TAG);
                    if (fragment == null) {
                        fragment = FavoritesFragment.newInstance("", "");
                    }
                    replaceFragment(fragment, FavoritesFragment.TAG);

                    return true;
                case R.id.navigation_notifications:
                    fragment = getSupportFragmentManager().findFragmentByTag(ProfileFragment.TAG);
                    if (fragment == null) {
                        fragment = ProfileFragment.newInstance("", "");
                    }
                    replaceFragment(fragment, ProfileFragment.TAG);
                    return true;
            }
            return false;
        }
    };

    private void replaceFragment(Fragment fragment, String tag) {
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.menu_fragments_containers, fragment, tag);
        transaction.addToBackStack(null);
        transaction.commit();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (findViewById(R.id.menu_fragments_containers) != null) {

            if (savedInstanceState != null) {
                return;
            }

            MapsFragment mapsFragment = MapsFragment.newInstance("", "");

            getSupportFragmentManager()
                    .beginTransaction()
                    .add(R.id.menu_fragments_containers, mapsFragment, MapsFragment.TAG)
                    .commit();

        }

        BottomNavigationView navigation = findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        velibRetrofit = new Retrofit.Builder()
                .baseUrl(JcDecauxAPIservices.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }


}
