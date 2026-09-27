package defpackage;

import android.hardware.camera2.CameraCaptureSession;
import android.media.ImageWriter;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class e03 extends CameraCaptureSession.StateCallback {
    public final /* synthetic */ int a;
    public final Object b;

    public e03(List list) {
        this.a = 0;
        this.b = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            CameraCaptureSession.StateCallback stateCallback = (CameraCaptureSession.StateCallback) it.next();
            if (!(stateCallback instanceof f03)) {
                ((ArrayList) this.b).add(stateCallback);
            }
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public void onActive(CameraCaptureSession cameraCaptureSession) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                Iterator it = ((ArrayList) obj).iterator();
                while (it.hasNext()) {
                    ((CameraCaptureSession.StateCallback) it.next()).onActive(cameraCaptureSession);
                }
                return;
            case 1:
                whi whiVar = (whi) obj;
                whiVar.j(cameraCaptureSession);
                whiVar.a(whiVar);
                return;
            default:
                super.onActive(cameraCaptureSession);
                return;
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public void onCaptureQueueEmpty(CameraCaptureSession cameraCaptureSession) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                Iterator it = ((ArrayList) obj).iterator();
                while (it.hasNext()) {
                    ((CameraCaptureSession.StateCallback) it.next()).onCaptureQueueEmpty(cameraCaptureSession);
                }
                return;
            case 1:
                whi whiVar = (whi) obj;
                whiVar.j(cameraCaptureSession);
                whiVar.b(whiVar);
                return;
            default:
                super.onCaptureQueueEmpty(cameraCaptureSession);
                return;
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public void onClosed(CameraCaptureSession cameraCaptureSession) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                Iterator it = ((ArrayList) obj).iterator();
                while (it.hasNext()) {
                    ((CameraCaptureSession.StateCallback) it.next()).onClosed(cameraCaptureSession);
                }
                return;
            case 1:
                whi whiVar = (whi) obj;
                whiVar.j(cameraCaptureSession);
                whiVar.c(whiVar);
                return;
            default:
                super.onClosed(cameraCaptureSession);
                return;
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
        cw2 cw2Var;
        switch (this.a) {
            case 0:
                Iterator it = ((ArrayList) this.b).iterator();
                while (it.hasNext()) {
                    ((CameraCaptureSession.StateCallback) it.next()).onConfigureFailed(cameraCaptureSession);
                }
                return;
            case 1:
                try {
                    ((whi) this.b).j(cameraCaptureSession);
                    whi whiVar = (whi) this.b;
                    whiVar.d(whiVar);
                    synchronized (((whi) this.b).a) {
                        grn.f(((whi) this.b).h, "OpenCaptureSession completer should not null");
                        whi whiVar2 = (whi) this.b;
                        cw2Var = whiVar2.h;
                        whiVar2.h = null;
                    }
                    cw2Var.b(new IllegalStateException("onConfigureFailed"));
                    return;
                } catch (Throwable th) {
                    synchronized (((whi) this.b).a) {
                        grn.f(((whi) this.b).h, "OpenCaptureSession completer should not null");
                        whi whiVar3 = (whi) this.b;
                        cw2 cw2Var2 = whiVar3.h;
                        whiVar3.h = null;
                        cw2Var2.b(new IllegalStateException("onConfigureFailed"));
                        throw th;
                    }
                }
            default:
                return;
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onConfigured(CameraCaptureSession cameraCaptureSession) {
        cw2 cw2Var;
        switch (this.a) {
            case 0:
                Iterator it = ((ArrayList) this.b).iterator();
                while (it.hasNext()) {
                    ((CameraCaptureSession.StateCallback) it.next()).onConfigured(cameraCaptureSession);
                }
                return;
            case 1:
                try {
                    ((whi) this.b).j(cameraCaptureSession);
                    whi whiVar = (whi) this.b;
                    whiVar.e(whiVar);
                    synchronized (((whi) this.b).a) {
                        grn.f(((whi) this.b).h, "OpenCaptureSession completer should not null");
                        whi whiVar2 = (whi) this.b;
                        cw2Var = whiVar2.h;
                        whiVar2.h = null;
                    }
                    cw2Var.a(null);
                    return;
                } catch (Throwable th) {
                    synchronized (((whi) this.b).a) {
                        grn.f(((whi) this.b).h, "OpenCaptureSession completer should not null");
                        whi whiVar3 = (whi) this.b;
                        cw2 cw2Var2 = whiVar3.h;
                        whiVar3.h = null;
                        cw2Var2.a(null);
                        throw th;
                    }
                }
            default:
                Surface inputSurface = cameraCaptureSession.getInputSurface();
                if (inputSurface != null) {
                    xwi xwiVar = (xwi) this.b;
                    ImageWriter newInstance = ImageWriter.newInstance(inputSurface, 1);
                    if (((AtomicBoolean) xwiVar.b).get()) {
                        if (((ImageWriter) xwiVar.a) != null) {
                            o9n.f("ZslControlImpl", "ImageWriter already existed in the ImageWriter holder. Closing the previous one.");
                            ((ImageWriter) xwiVar.a).close();
                        }
                        xwiVar.a = newInstance;
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public void onReady(CameraCaptureSession cameraCaptureSession) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                Iterator it = ((ArrayList) obj).iterator();
                while (it.hasNext()) {
                    ((CameraCaptureSession.StateCallback) it.next()).onReady(cameraCaptureSession);
                }
                return;
            case 1:
                whi whiVar = (whi) obj;
                whiVar.j(cameraCaptureSession);
                whiVar.f(whiVar);
                return;
            default:
                super.onReady(cameraCaptureSession);
                return;
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public void onSurfacePrepared(CameraCaptureSession cameraCaptureSession, Surface surface) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                Iterator it = ((ArrayList) obj).iterator();
                while (it.hasNext()) {
                    ((CameraCaptureSession.StateCallback) it.next()).onSurfacePrepared(cameraCaptureSession, surface);
                }
                return;
            case 1:
                whi whiVar = (whi) obj;
                whiVar.j(cameraCaptureSession);
                whiVar.h(whiVar, surface);
                return;
            default:
                super.onSurfacePrepared(cameraCaptureSession, surface);
                return;
        }
    }

    private final void a(CameraCaptureSession cameraCaptureSession) {
    }

    public /* synthetic */ e03(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }
}
