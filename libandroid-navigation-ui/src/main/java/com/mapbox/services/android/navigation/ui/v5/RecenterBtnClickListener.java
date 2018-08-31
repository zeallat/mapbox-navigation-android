package com.mapbox.services.android.navigation.ui.v5;

import android.view.View;

class RecenterBtnClickListener implements View.OnClickListener {

  private NavigationPresenter presenter;
  private NavigationViewEventDispatcher dispatcher;

  RecenterBtnClickListener(NavigationPresenter presenter, NavigationViewEventDispatcher dispatcher) {
    this.presenter = presenter;
    this.dispatcher = dispatcher;
  }

  @Override
  public void onClick(View view) {
    presenter.onRecenterClick();
    dispatcher.onRecenterClick(view);
  }
}
