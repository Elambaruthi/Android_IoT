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

public class Registration_ViewBinding implements Unbinder {
  private Registration target;

  private View view2131230862;

  private View view2131230774;

  private View view2131230808;

  private View view2131230924;

  @UiThread
  public Registration_ViewBinding(Registration target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public Registration_ViewBinding(final Registration target, View source) {
    this.target = target;

    View view;
    target.mRegViewGroup = Utils.findRequiredViewAsType(source, R.id.reg_parent_lay, "field 'mRegViewGroup'", ViewGroup.class);
    target.mRegHeaderBgLay = Utils.findRequiredViewAsType(source, R.id.reg_header_bg_lay, "field 'mRegHeaderBgLay'", RelativeLayout.class);
    target.mRegHeaderImg = Utils.findRequiredViewAsType(source, R.id.reg_header_img, "field 'mRegHeaderImg'", ImageView.class);
    target.mHeaderTxt = Utils.findRequiredViewAsType(source, R.id.header_txt, "field 'mHeaderTxt'", TextView.class);
    target.mFirstNameEdt = Utils.findRequiredViewAsType(source, R.id.first_name_edt, "field 'mFirstNameEdt'", EditText.class);
    target.mLastNameEdt = Utils.findRequiredViewAsType(source, R.id.last_name_edt, "field 'mLastNameEdt'", EditText.class);
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
    target.mMobEdt = Utils.findRequiredViewAsType(source, R.id.mob_edt, "field 'mMobEdt'", EditText.class);
    view = Utils.findRequiredView(source, R.id.header_left_img_lay, "method 'onClick'");
    view2131230808 = view;
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
    Registration target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mRegViewGroup = null;
    target.mRegHeaderBgLay = null;
    target.mRegHeaderImg = null;
    target.mHeaderTxt = null;
    target.mFirstNameEdt = null;
    target.mLastNameEdt = null;
    target.mEmailAddressEdt = null;
    target.mPwdEdt = null;
    target.mPwdInVisibleImg = null;
    target.mConfirmPwdEdt = null;
    target.mConfirmPwdInVisibleImg = null;
    target.mMobEdt = null;

    view2131230862.setOnClickListener(null);
    view2131230862 = null;
    view2131230774.setOnClickListener(null);
    view2131230774 = null;
    view2131230808.setOnClickListener(null);
    view2131230808 = null;
    view2131230924.setOnClickListener(null);
    view2131230924 = null;
  }
}
