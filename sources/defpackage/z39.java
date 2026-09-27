package defpackage;

import android.adservices.measurement.MeasurementManager;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.RectF;
import android.net.Uri;
import android.view.InputEvent;
import android.view.SurfaceView;
import android.view.inputmethod.DeleteGesture;
import android.view.inputmethod.DeleteRangeGesture;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.InsertGesture;
import android.view.inputmethod.JoinOrSplitGesture;
import android.view.inputmethod.RemoveSpaceGesture;
import android.view.inputmethod.SelectRangeGesture;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class z39 {
    public static /* bridge */ /* synthetic */ HandwritingGesture A(Object obj) {
        return (HandwritingGesture) obj;
    }

    public static /* bridge */ /* synthetic */ boolean B(Object obj) {
        return obj instanceof DeleteGesture;
    }

    public static /* bridge */ /* synthetic */ boolean C(Object obj) {
        return obj instanceof SelectRangeGesture;
    }

    public static /* bridge */ /* synthetic */ boolean D(Object obj) {
        return obj instanceof DeleteRangeGesture;
    }

    public static /* bridge */ /* synthetic */ int a(DeleteGesture deleteGesture) {
        return deleteGesture.getGranularity();
    }

    public static /* bridge */ /* synthetic */ int b(DeleteRangeGesture deleteRangeGesture) {
        return deleteRangeGesture.getGranularity();
    }

    public static /* bridge */ /* synthetic */ MeasurementManager c(Context context) {
        return MeasurementManager.get(context);
    }

    public static /* bridge */ /* synthetic */ MeasurementManager d(Object obj) {
        return (MeasurementManager) obj;
    }

    public static /* bridge */ /* synthetic */ PointF e(InsertGesture insertGesture) {
        return insertGesture.getInsertionPoint();
    }

    public static /* bridge */ /* synthetic */ PointF f(JoinOrSplitGesture joinOrSplitGesture) {
        return joinOrSplitGesture.getJoinOrSplitPoint();
    }

    public static /* bridge */ /* synthetic */ PointF g(RemoveSpaceGesture removeSpaceGesture) {
        return removeSpaceGesture.getStartPoint();
    }

    public static /* bridge */ /* synthetic */ RectF h(DeleteGesture deleteGesture) {
        return deleteGesture.getDeletionArea();
    }

    public static /* bridge */ /* synthetic */ RectF i(DeleteRangeGesture deleteRangeGesture) {
        return deleteRangeGesture.getDeletionStartArea();
    }

    public static /* bridge */ /* synthetic */ RectF j(SelectRangeGesture selectRangeGesture) {
        return selectRangeGesture.getSelectionStartArea();
    }

    public static /* bridge */ /* synthetic */ DeleteGesture k(Object obj) {
        return (DeleteGesture) obj;
    }

    public static /* bridge */ /* synthetic */ DeleteRangeGesture l(Object obj) {
        return (DeleteRangeGesture) obj;
    }

    public static /* bridge */ /* synthetic */ HandwritingGesture m(Object obj) {
        return (HandwritingGesture) obj;
    }

    public static /* bridge */ /* synthetic */ JoinOrSplitGesture n(Object obj) {
        return (JoinOrSplitGesture) obj;
    }

    public static /* bridge */ /* synthetic */ RemoveSpaceGesture o(Object obj) {
        return (RemoveSpaceGesture) obj;
    }

    public static /* bridge */ /* synthetic */ SelectRangeGesture p(Object obj) {
        return (SelectRangeGesture) obj;
    }

    public static /* bridge */ /* synthetic */ Class q() {
        return MeasurementManager.class;
    }

    public static /* bridge */ /* synthetic */ String r(HandwritingGesture handwritingGesture) {
        return handwritingGesture.getFallbackText();
    }

    public static /* bridge */ /* synthetic */ String s(InsertGesture insertGesture) {
        return insertGesture.getTextToInsert();
    }

    public static /* bridge */ /* synthetic */ void t(MeasurementManager measurementManager, bk0 bk0Var, s55 s55Var) {
        measurementManager.getMeasurementApiStatus(bk0Var, s55Var);
    }

    public static /* bridge */ /* synthetic */ void u(MeasurementManager measurementManager, Uri uri, bk0 bk0Var, s55 s55Var) {
        measurementManager.registerTrigger(uri, bk0Var, s55Var);
    }

    public static /* bridge */ /* synthetic */ void v(MeasurementManager measurementManager, Uri uri, InputEvent inputEvent, bk0 bk0Var, s55 s55Var) {
        measurementManager.registerSource(uri, inputEvent, bk0Var, s55Var);
    }

    public static /* bridge */ /* synthetic */ void w(SurfaceView surfaceView) {
        surfaceView.setSurfaceLifecycle(2);
    }

    public static /* bridge */ /* synthetic */ boolean x(Object obj) {
        return obj instanceof JoinOrSplitGesture;
    }

    public static /* bridge */ /* synthetic */ PointF y(RemoveSpaceGesture removeSpaceGesture) {
        return removeSpaceGesture.getEndPoint();
    }

    public static /* bridge */ /* synthetic */ RectF z(SelectRangeGesture selectRangeGesture) {
        return selectRangeGesture.getSelectionEndArea();
    }
}
