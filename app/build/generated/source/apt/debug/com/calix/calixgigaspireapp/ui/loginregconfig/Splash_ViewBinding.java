// Generated code from Butter Knife. Do not modify!
package com.calix.calixgigaspireapp.ui.loginregconfig;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.view.ViewGroup;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.calix.calixgigaspireapp.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class Splash_ViewBinding implements Unbinder {
  private Splash target;

  @UiThread
  public Splash_ViewBinding(Splash target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public Splash_ViewBinding(Splash target, View source) {
    this.target = target;

    target.mSplashViewGroup = Utils.findRequiredViewAsType(source, R.id.parent_lay, "field 'mSplashViewGroup'", ViewGroup.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    Splash target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mSplashViewGroup = null;
  }
}
