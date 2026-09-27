package defpackage;

import android.graphics.RectF;
import android.nfc.AvailableNfcAntenna;
import android.nfc.NfcAdapter;
import android.nfc.NfcAntennaInfo;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.DeleteGesture;
import android.view.inputmethod.DeleteRangeGesture;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InsertGesture;
import android.view.inputmethod.JoinOrSplitGesture;
import android.view.inputmethod.RemoveSpaceGesture;
import android.view.inputmethod.SelectGesture;
import android.view.inputmethod.SelectRangeGesture;
import java.util.List;
import java.util.Set;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class fg5 {
    public static /* bridge */ /* synthetic */ Class A() {
        return DeleteGesture.class;
    }

    public static /* bridge */ /* synthetic */ Class B() {
        return JoinOrSplitGesture.class;
    }

    public static /* bridge */ /* synthetic */ Class C() {
        return InsertGesture.class;
    }

    public static /* bridge */ /* synthetic */ Class D() {
        return RemoveSpaceGesture.class;
    }

    public static /* bridge */ /* synthetic */ int a(AvailableNfcAntenna availableNfcAntenna) {
        return availableNfcAntenna.getLocationX();
    }

    public static /* bridge */ /* synthetic */ int b(NfcAntennaInfo nfcAntennaInfo) {
        return nfcAntennaInfo.getDeviceHeight();
    }

    public static /* bridge */ /* synthetic */ int c(DeleteGesture deleteGesture) {
        return deleteGesture.getGranularity();
    }

    public static /* bridge */ /* synthetic */ int d(DeleteRangeGesture deleteRangeGesture) {
        return deleteRangeGesture.getGranularity();
    }

    public static /* bridge */ /* synthetic */ int e(SelectGesture selectGesture) {
        return selectGesture.getGranularity();
    }

    public static /* bridge */ /* synthetic */ int f(SelectRangeGesture selectRangeGesture) {
        return selectRangeGesture.getGranularity();
    }

    public static /* bridge */ /* synthetic */ RectF g(DeleteGesture deleteGesture) {
        return deleteGesture.getDeletionArea();
    }

    public static /* bridge */ /* synthetic */ RectF h(DeleteRangeGesture deleteRangeGesture) {
        return deleteRangeGesture.getDeletionStartArea();
    }

    public static /* bridge */ /* synthetic */ RectF i(SelectGesture selectGesture) {
        return selectGesture.getSelectionArea();
    }

    public static /* bridge */ /* synthetic */ AvailableNfcAntenna j(Object obj) {
        return (AvailableNfcAntenna) obj;
    }

    public static /* bridge */ /* synthetic */ NfcAntennaInfo k(NfcAdapter nfcAdapter) {
        return nfcAdapter.getNfcAntennaInfo();
    }

    public static /* bridge */ /* synthetic */ InsertGesture l(Object obj) {
        return (InsertGesture) obj;
    }

    public static /* bridge */ /* synthetic */ SelectGesture m(Object obj) {
        return (SelectGesture) obj;
    }

    public static /* bridge */ /* synthetic */ Class n() {
        return SelectGesture.class;
    }

    public static /* bridge */ /* synthetic */ List o(NfcAntennaInfo nfcAntennaInfo) {
        return nfcAntennaInfo.getAvailableNfcAntennas();
    }

    public static /* bridge */ /* synthetic */ void p(CursorAnchorInfo.Builder builder, float f, float f2, float f3, float f4) {
        builder.addVisibleLineBounds(f, f2, f3, f4);
    }

    public static /* bridge */ /* synthetic */ void q(EditorInfo editorInfo, List list) {
        editorInfo.setSupportedHandwritingGestures(list);
    }

    public static /* bridge */ /* synthetic */ void r(EditorInfo editorInfo, Set set) {
        editorInfo.setSupportedHandwritingGesturePreviews(set);
    }

    public static /* bridge */ /* synthetic */ boolean s(Object obj) {
        return obj instanceof SelectGesture;
    }

    public static /* bridge */ /* synthetic */ int t(AvailableNfcAntenna availableNfcAntenna) {
        return availableNfcAntenna.getLocationY();
    }

    public static /* bridge */ /* synthetic */ int u(NfcAntennaInfo nfcAntennaInfo) {
        return nfcAntennaInfo.getDeviceWidth();
    }

    public static /* bridge */ /* synthetic */ RectF v(DeleteRangeGesture deleteRangeGesture) {
        return deleteRangeGesture.getDeletionEndArea();
    }

    public static /* bridge */ /* synthetic */ Class w() {
        return SelectRangeGesture.class;
    }

    public static /* bridge */ /* synthetic */ boolean x(Object obj) {
        return obj instanceof InsertGesture;
    }

    public static /* bridge */ /* synthetic */ Class y() {
        return DeleteRangeGesture.class;
    }

    public static /* bridge */ /* synthetic */ boolean z(Object obj) {
        return obj instanceof RemoveSpaceGesture;
    }
}
