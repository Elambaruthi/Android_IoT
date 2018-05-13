// Generated code from Butter Knife. Do not modify!
package com.calix.calixgigaspireapp.ui.loginregconfig;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.SurfaceView;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.calix.calixgigaspireapp.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class QRBarcodeScanner_ViewBinding implements Unbinder {
  private QRBarcodeScanner target;

  @UiThread
  public QRBarcodeScanner_ViewBinding(QRBarcodeScanner target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public QRBarcodeScanner_ViewBinding(QRBarcodeScanner target, View source) {
    this.target = target;

    target.mScanQRBarCodeParLay = Utils.findRequiredViewAsType(source, R.id.scan_qr_bar_code_lay, "field 'mScanQRBarCodeParLay'", RelativeLayout.class);
    target.mSurfaceView = Utils.findRequiredViewAsType(source, R.id.surfaceView, "field 'mSurfaceView'", SurfaceView.class);
    target.mBarcodeResultTxt = Utils.findRequiredViewAsType(source, R.id.txtBarcodeValue, "field 'mBarcodeResultTxt'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    QRBarcodeScanner target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mScanQRBarCodeParLay = null;
    target.mSurfaceView = null;
    target.mBarcodeResultTxt = null;
  }
}
