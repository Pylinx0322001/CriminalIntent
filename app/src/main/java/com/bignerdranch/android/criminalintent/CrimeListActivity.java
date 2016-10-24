package com.bignerdranch.android.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by DIY on 2016/10/24.
 */
public class CrimeListActivity extends SingleFragmentActivity{

    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
