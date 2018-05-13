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

public class Login_ViewBinding implements Unbinder {
  private Login target;

  private View view2131230862;

  private View view2131230805;

  private View view2131230846;

  private View view2131230924;

  @UiThread
  public Login_ViewBinding(Login target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public Login_ViewBinding(final Login target, View source) {
    this.target = target;

    View view;
    target.mLoginViewGroup = Utils.findRequiredViewAsType(source, R.id.login_parent_lay, "field 'mLoginViewGroup'", ViewGroup.class);
    target.mLoginHeaderBgLay = Utils.findRequiredViewAsType(source, R.id.login_header_bg_lay, "field 'mLoginHeaderBgLay'", RelativeLayout.class);
    target.mLoginHeaderImg = Utils.findRequiredViewAsType(source, R.id.login_header_img, "field 'mLoginHeaderImg'", ImageView.class);
    target.mHeaderTxt = Utils.findRequiredViewAsType(source, R.id.header_txt, "field 'mHeaderTxt'", TextView.class);
    target.mHeaderLeftImgLay = Utils.findRequiredViewAsType(source, R.id.header_left_img_lay, "field 'mHeaderLeftImgLay'", RelativeLayout.class);
    target.mEmailAddressEdt = Utils.findRequiredViewAsType(source, R.id.email_id_edt, "field 'mEmailAddressEdt'", EditText.class);
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
    view = Utils.findRequiredView(source, R.id.forgot_pwd_txt, "method 'onClick'");
    view2131230805 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.new_user_txt, "method 'onClick'");
    view2131230846 = view;
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
    Login target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mLoginViewGroup = null;
    target.mLoginHeaderBgLay = null;
    target.mLoginHeaderImg = null;
    target.mHeaderTxt = null;
    target.mHeaderLeftImgLay = null;
    target.mEmailAddressEdt = null;
    target.mPwdEdt = null;
    target.mPwdInVisibleImg = null;

    view2131230862.setOnClickListener(null);
    view2131230862 = null;
    view2131230805.setOnClickListener(null);
    view2131230805 = null;
    view2131230846.setOnClickListener(null);
    view2131230846 = null;
    view2131230924.setOnClickListener(null);
    view2131230924 = null;
  }
}
