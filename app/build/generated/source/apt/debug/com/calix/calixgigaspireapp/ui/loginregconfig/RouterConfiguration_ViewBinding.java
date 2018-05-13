// Generated code from Butter Knife. Do not modify!
package com.calix.calixgigaspireapp.ui.loginregconfig;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.calix.calixgigaspireapp.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class RouterConfiguration_ViewBinding implements Unbinder {
  private RouterConfiguration target;

  private View view2131230808;

  private View view2131230835;

  private View view2131230904;

  private View view2131230863;

  private View view2131230924;

  @UiThread
  public RouterConfiguration_ViewBinding(RouterConfiguration target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public RouterConfiguration_ViewBinding(final RouterConfiguration target, View source) {
    this.target = target;

    View view;
    target.mRouterConfigViewGroup = Utils.findRequiredViewAsType(source, R.id.router_config_parent_lay, "field 'mRouterConfigViewGroup'", ViewGroup.class);
    target.mRouterConfigHeaderBgLay = Utils.findRequiredViewAsType(source, R.id.router_config_header_bg_lay, "field 'mRouterConfigHeaderBgLay'", RelativeLayout.class);
    target.mRouterConfigHeaderImg = Utils.findRequiredViewAsType(source, R.id.router_config_header_img, "field 'mRouterConfigHeaderImg'", ImageView.class);
    target.mHeaderTxt = Utils.findRequiredViewAsType(source, R.id.header_txt, "field 'mHeaderTxt'", TextView.class);
    view = Utils.findRequiredView(source, R.id.header_left_img_lay, "field 'mHeaderLeftImgLay' and method 'onClick'");
    target.mHeaderLeftImgLay = Utils.castView(view, R.id.header_left_img_lay, "field 'mHeaderLeftImgLay'", RelativeLayout.class);
    view2131230808 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    target.mMacAddressEdt = Utils.findRequiredViewAsType(source, R.id.mac_address_edt, "field 'mMacAddressEdt'", EditText.class);
    target.mSerialNumberEdt = Utils.findRequiredViewAsType(source, R.id.serial_number_edt, "field 'mSerialNumberEdt'", EditText.class);
    view = Utils.findRequiredView(source, R.id.mac_address_img, "method 'onClick'");
    view2131230835 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.serial_number_img, "method 'onClick'");
    view2131230904 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.qr_code_scanner_img, "method 'onClick'");
    view2131230863 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.submit_btn, "method 'onClick'");
    view2131230924 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    RouterConfiguration target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mRouterConfigViewGroup = null;
    target.mRouterConfigHeaderBgLay = null;
    target.mRouterConfigHeaderImg = null;
    target.mHeaderTxt = null;
    target.mHeaderLeftImgLay = null;
    target.mMacAddressEdt = null;
    target.mSerialNumberEdt = null;

    view2131230808.setOnClickListener(null);
    view2131230808 = null;
    view2131230835.setOnClickListener(null);
    view2131230835 = null;
    view2131230904.setOnClickListener(null);
    view2131230904 = null;
    view2131230863.setOnClickListener(null);
    view2131230863 = null;
    view2131230924.setOnClickListener(null);
    view2131230924 = null;
  }
}
