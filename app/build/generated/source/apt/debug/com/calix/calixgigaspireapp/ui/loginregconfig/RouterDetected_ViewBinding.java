// Generated code from Butter Knife. Do not modify!
package com.calix.calixgigaspireapp.ui.loginregconfig;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.calix.calixgigaspireapp.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class RouterDetected_ViewBinding implements Unbinder {
  private RouterDetected target;

  private View view2131230808;

  private View view2131230862;

  private View view2131230774;

  private View view2131230914;

  private View view2131230924;

  @UiThread
  public RouterDetected_ViewBinding(RouterDetected target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public RouterDetected_ViewBinding(final RouterDetected target, View source) {
    this.target = target;

    View view;
    target.mRouterDetectedViewGroup = Utils.findRequiredViewAsType(source, R.id.router_detected_parent_lay, "field 'mRouterDetectedViewGroup'", ViewGroup.class);
    target.mRouterDetectedHeaderBgLay = Utils.findRequiredViewAsType(source, R.id.router_detected_header_bg_lay, "field 'mRouterDetectedHeaderBgLay'", RelativeLayout.class);
    target.mRouterDetectedHeaderImg = Utils.findRequiredViewAsType(source, R.id.router_detected_header_img, "field 'mRouterDetectedHeaderImg'", ImageView.class);
    view = Utils.findRequiredView(source, R.id.header_left_img_lay, "field 'mHeaderLeftImgLay' and method 'onClick'");
    target.mHeaderLeftImgLay = Utils.castView(view, R.id.header_left_img_lay, "field 'mHeaderLeftImgLay'", RelativeLayout.class);
    view2131230808 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    target.mHeaderTxt = Utils.findRequiredViewAsType(source, R.id.header_txt, "field 'mHeaderTxt'", TextView.class);
    target.mNetworkNameEdt = Utils.findRequiredViewAsType(source, R.id.network_name_edt, "field 'mNetworkNameEdt'", EditText.class);
    target.mRouterNameEdt = Utils.findRequiredViewAsType(source, R.id.router_name_edt, "field 'mRouterNameEdt'", EditText.class);
    target.mAuthTypeSpinner = Utils.findRequiredViewAsType(source, R.id.auth_type_spinner, "field 'mAuthTypeSpinner'", Spinner.class);
    target.mPwdConfirmPwdLay = Utils.findRequiredViewAsType(source, R.id.pwd_confirm_pwd_lay, "field 'mPwdConfirmPwdLay'", LinearLayout.class);
    target.mPwdEdt = Utils.findRequiredViewAsType(source, R.id.pwd_edt, "field 'mPwdEdt'", EditText.class);
    view = Utils.findRequiredView(source, R.id.pwd_in_visible_img, "field 'mPwdInVisibleImg' and method 'onClick'");
    target.mPwdInVisibleImg = Utils.castView(view, R.id.pwd_in_visible_img, "field 'mPwdInVisibleImg'", ImageView.class);
    view2131230862 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    target.mConfirmPwdEdt = Utils.findRequiredViewAsType(source, R.id.confirm_pwd_edt, "field 'mConfirmPwdEdt'", EditText.class);
    view = Utils.findRequiredView(source, R.id.confirm_pwd_in_visible_img, "field 'mConfirmPwdInVisibleImg' and method 'onClick'");
    target.mConfirmPwdInVisibleImg = Utils.castView(view, R.id.confirm_pwd_in_visible_img, "field 'mConfirmPwdInVisibleImg'", ImageView.class);
    view2131230774 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.spinner_drop_down_img, "method 'onClick'");
    view2131230914 = view;
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
    RouterDetected target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mRouterDetectedViewGroup = null;
    target.mRouterDetectedHeaderBgLay = null;
    target.mRouterDetectedHeaderImg = null;
    target.mHeaderLeftImgLay = null;
    target.mHeaderTxt = null;
    target.mNetworkNameEdt = null;
    target.mRouterNameEdt = null;
    target.mAuthTypeSpinner = null;
    target.mPwdConfirmPwdLay = null;
    target.mPwdEdt = null;
    target.mPwdInVisibleImg = null;
    target.mConfirmPwdEdt = null;
    target.mConfirmPwdInVisibleImg = null;

    view2131230808.setOnClickListener(null);
    view2131230808 = null;
    view2131230862.setOnClickListener(null);
    view2131230862 = null;
    view2131230774.setOnClickListener(null);
    view2131230774 = null;
    view2131230914.setOnClickListener(null);
    view2131230914 = null;
    view2131230924.setOnClickListener(null);
    view2131230924 = null;
  }
}
