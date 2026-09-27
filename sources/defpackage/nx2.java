package defpackage;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class nx2 extends CameraCaptureSession.CaptureCallback {
    public final /* synthetic */ int a;
    public final Object b;
    public Object c;

    /* JADX WARN: Type inference failed for: r0v0, types: [c3g, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, cw2] */
    public nx2(int i) {
        this.a = i;
        switch (i) {
            case 2:
                ?? obj = new Object();
                obj.c = new Object();
                gw2 gw2Var = new gw2(obj);
                obj.b = gw2Var;
                obj.a = ix2.class;
                try {
                    this.c = obj;
                    obj.a = "RequestCompleteListener[" + this + "]";
                } catch (Exception e) {
                    gw2Var.a(e);
                }
                this.b = gw2Var;
                return;
            default:
                this.c = null;
                this.b = new HashMap();
                return;
        }
    }

    public void a(CaptureRequest captureRequest, List list) {
        HashMap hashMap = (HashMap) this.b;
        List list2 = (List) hashMap.get(captureRequest);
        if (list2 != null) {
            ArrayList arrayList = new ArrayList(list2.size() + list.size());
            arrayList.addAll(list);
            arrayList.addAll(list2);
            hashMap.put(captureRequest, arrayList);
            return;
        }
        hashMap.put(captureRequest, list);
    }

    public void b() {
        cw2 cw2Var = (cw2) this.c;
        if (cw2Var != null) {
            cw2Var.a(null);
            this.c = null;
        }
    }

    public List c(CaptureRequest captureRequest) {
        List list = (List) ((HashMap) this.b).get(captureRequest);
        if (list != null) {
            return list;
        }
        return Collections.EMPTY_LIST;
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureBufferLost(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, Surface surface, long j) {
        switch (this.a) {
            case 1:
                Iterator it = c(captureRequest).iterator();
                while (it.hasNext()) {
                    ((CameraCaptureSession.CaptureCallback) it.next()).onCaptureBufferLost(cameraCaptureSession, captureRequest, surface, j);
                }
                return;
            default:
                super.onCaptureBufferLost(cameraCaptureSession, captureRequest, surface, j);
                return;
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        switch (this.a) {
            case 0:
                ((vwg) this.c).execute(new e10(10, this, totalCaptureResult));
                return;
            case 1:
                Iterator it = c(captureRequest).iterator();
                while (it.hasNext()) {
                    ((CameraCaptureSession.CaptureCallback) it.next()).onCaptureCompleted(cameraCaptureSession, captureRequest, totalCaptureResult);
                }
                return;
            default:
                b();
                return;
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
        switch (this.a) {
            case 1:
                Iterator it = c(captureRequest).iterator();
                while (it.hasNext()) {
                    ((CameraCaptureSession.CaptureCallback) it.next()).onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
                }
                return;
            case 2:
                b();
                return;
            default:
                super.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
                return;
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureProgressed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureResult captureResult) {
        switch (this.a) {
            case 1:
                Iterator it = c(captureRequest).iterator();
                while (it.hasNext()) {
                    ((CameraCaptureSession.CaptureCallback) it.next()).onCaptureProgressed(cameraCaptureSession, captureRequest, captureResult);
                }
                return;
            default:
                super.onCaptureProgressed(cameraCaptureSession, captureRequest, captureResult);
                return;
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureSequenceAborted(CameraCaptureSession cameraCaptureSession, int i) {
        switch (this.a) {
            case 1:
                Iterator it = ((HashMap) this.b).values().iterator();
                while (it.hasNext()) {
                    Iterator it2 = ((List) it.next()).iterator();
                    while (it2.hasNext()) {
                        ((CameraCaptureSession.CaptureCallback) it2.next()).onCaptureSequenceAborted(cameraCaptureSession, i);
                    }
                }
                m33 m33Var = (m33) this.c;
                if (m33Var != null) {
                    m33Var.a();
                    return;
                }
                return;
            case 2:
                b();
                return;
            default:
                super.onCaptureSequenceAborted(cameraCaptureSession, i);
                return;
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureSequenceCompleted(CameraCaptureSession cameraCaptureSession, int i, long j) {
        switch (this.a) {
            case 1:
                Iterator it = ((HashMap) this.b).values().iterator();
                while (it.hasNext()) {
                    Iterator it2 = ((List) it.next()).iterator();
                    while (it2.hasNext()) {
                        ((CameraCaptureSession.CaptureCallback) it2.next()).onCaptureSequenceCompleted(cameraCaptureSession, i, j);
                    }
                }
                m33 m33Var = (m33) this.c;
                if (m33Var != null) {
                    m33Var.a();
                    return;
                }
                return;
            case 2:
                b();
                return;
            default:
                super.onCaptureSequenceCompleted(cameraCaptureSession, i, j);
                return;
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureStarted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j, long j2) {
        switch (this.a) {
            case 1:
                Iterator it = c(captureRequest).iterator();
                while (it.hasNext()) {
                    ((CameraCaptureSession.CaptureCallback) it.next()).onCaptureStarted(cameraCaptureSession, captureRequest, j, j2);
                }
                return;
            case 2:
                b();
                return;
            default:
                super.onCaptureStarted(cameraCaptureSession, captureRequest, j, j2);
                return;
        }
    }

    public nx2(vwg vwgVar) {
        this.a = 0;
        this.b = new HashSet();
        this.c = vwgVar;
    }
}
