package com.mapbox.services.android.navigation.ui.v5;

import android.view.View;

public class SoundClickListener implements View.OnClickListener {
  NavigationViewEventDispatcher dispatcher;

  public SoundClickListener(NavigationViewEventDispatcher dispatcher) {
    this.dispatcher = dispatcher;
  }

  @Override
  public void onClick(View view) {
    dispatcher.onSoundClick(view);
  }
}
