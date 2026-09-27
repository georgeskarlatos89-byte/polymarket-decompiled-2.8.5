package defpackage;

import android.util.SparseIntArray;
import android.view.FrameMetrics;
import android.view.Window;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class oo8 implements Window.OnFrameMetricsAvailableListener {
    public final /* synthetic */ pxn a;

    public oo8(pxn pxnVar) {
        this.a = pxnVar;
    }

    @Override // android.view.Window.OnFrameMetricsAvailableListener
    public final void onFrameMetricsAvailable(Window window, FrameMetrics frameMetrics, int i) {
        pxn pxnVar = this.a;
        int i2 = pxnVar.a;
        if ((i2 & 1) != 0) {
            pxn.a(((SparseIntArray[]) pxnVar.b)[0], frameMetrics.getMetric(8));
        }
        if ((i2 & 2) != 0) {
            pxn.a(((SparseIntArray[]) pxnVar.b)[1], frameMetrics.getMetric(1));
        }
        if ((i2 & 4) != 0) {
            pxn.a(((SparseIntArray[]) pxnVar.b)[2], frameMetrics.getMetric(3));
        }
        if ((i2 & 8) != 0) {
            pxn.a(((SparseIntArray[]) pxnVar.b)[3], frameMetrics.getMetric(4));
        }
        if ((i2 & 16) != 0) {
            pxn.a(((SparseIntArray[]) pxnVar.b)[4], frameMetrics.getMetric(5));
        }
        if ((i2 & 64) != 0) {
            pxn.a(((SparseIntArray[]) pxnVar.b)[6], frameMetrics.getMetric(7));
        }
        if ((i2 & 32) != 0) {
            pxn.a(((SparseIntArray[]) pxnVar.b)[5], frameMetrics.getMetric(6));
        }
        if ((i2 & 128) != 0) {
            pxn.a(((SparseIntArray[]) pxnVar.b)[7], frameMetrics.getMetric(0));
        }
        if ((i2 & 256) != 0) {
            pxn.a(((SparseIntArray[]) pxnVar.b)[8], frameMetrics.getMetric(2));
        }
    }
}
