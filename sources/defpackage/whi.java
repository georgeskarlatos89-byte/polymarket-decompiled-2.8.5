package defpackage;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import android.view.Surface;
import androidx.camera.camera2.internal.compat.quirk.CaptureSessionOnClosedNotCalledQuirk;
import androidx.camera.camera2.internal.compat.quirk.CaptureSessionStuckQuirk;
import androidx.camera.camera2.internal.compat.quirk.ConfigureSurfaceToSecondarySessionFailQuirk;
import androidx.camera.camera2.internal.compat.quirk.IncorrectCaptureStateQuirk;
import androidx.camera.camera2.internal.compat.quirk.PreviewOrientationIncorrectQuirk;
import androidx.camera.camera2.internal.compat.quirk.TextureViewIsClosedQuirk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class whi extends thi {
    public final ofc b;
    public final vwg c;
    public final y39 d;
    public o33 e;
    public uhl f;
    public gw2 g;
    public cw2 h;
    public rq8 i;
    public final y39 n;
    public ArrayList p;
    public bjb q;
    public final bt0 r;
    public final me7 s;
    public final i0b t;
    public final us4 u;
    public final Object a = new Object();
    public List j = null;
    public boolean k = false;
    public boolean l = false;
    public boolean m = false;
    public final Object o = new Object();
    public final AtomicBoolean v = new AtomicBoolean(false);

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, me7] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, bt0] */
    public whi(c80 c80Var, c80 c80Var2, ofc ofcVar, vwg vwgVar, y39 y39Var, Handler handler) {
        this.b = ofcVar;
        this.c = vwgVar;
        this.d = y39Var;
        ?? obj = new Object();
        obj.a = c80Var2.e(TextureViewIsClosedQuirk.class);
        obj.b = c80Var.e(PreviewOrientationIncorrectQuirk.class);
        obj.c = c80Var.e(ConfigureSurfaceToSecondarySessionFailQuirk.class);
        this.r = obj;
        this.t = new i0b(c80Var.e(CaptureSessionStuckQuirk.class) || c80Var.e(IncorrectCaptureStateQuirk.class));
        ?? obj2 = new Object();
        obj2.a = (CaptureSessionOnClosedNotCalledQuirk) c80Var2.f(CaptureSessionOnClosedNotCalledQuirk.class);
        this.s = obj2;
        this.u = new us4(c80Var2, 3);
        this.n = y39Var;
    }

    public static void k() {
        o9n.e(3, "SyncCaptureSessionImpl");
    }

    @Override // defpackage.thi
    public final void a(whi whiVar) {
        Objects.requireNonNull(this.e);
        this.e.a(whiVar);
    }

    @Override // defpackage.thi
    public final void b(whi whiVar) {
        Objects.requireNonNull(this.e);
        this.e.b(whiVar);
    }

    @Override // defpackage.thi
    public final void c(whi whiVar) {
        gw2 gw2Var;
        synchronized (this.o) {
            this.r.c(this.p);
        }
        k();
        synchronized (this.a) {
            try {
                if (!this.k) {
                    this.k = true;
                    grn.f(this.g, "Need to call openCaptureSession before using this API.");
                    gw2Var = this.g;
                } else {
                    gw2Var = null;
                }
            } finally {
            }
        }
        synchronized (this.a) {
            try {
                List list = this.j;
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((gi6) it.next()).b();
                    }
                    this.j = null;
                }
            } finally {
            }
        }
        this.t.c();
        if (gw2Var != null) {
            gw2Var.b.addListener(new uhi(this, whiVar, 0), qt6.a());
        }
    }

    @Override // defpackage.thi
    public final void d(whi whiVar) {
        whi whiVar2;
        Objects.requireNonNull(this.e);
        synchronized (this.a) {
            try {
                List list = this.j;
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((gi6) it.next()).b();
                    }
                    this.j = null;
                }
            } finally {
            }
        }
        this.t.c();
        ofc ofcVar = this.b;
        Iterator it2 = ofcVar.R().iterator();
        while (it2.hasNext() && (whiVar2 = (whi) it2.next()) != this) {
            synchronized (whiVar2.a) {
                try {
                    List list2 = whiVar2.j;
                    if (list2 != null) {
                        Iterator it3 = list2.iterator();
                        while (it3.hasNext()) {
                            ((gi6) it3.next()).b();
                        }
                        whiVar2.j = null;
                    }
                } finally {
                }
            }
            whiVar2.t.c();
        }
        synchronized (ofcVar.b) {
            ((LinkedHashSet) ofcVar.e).remove(this);
        }
        this.e.d(whiVar);
    }

    @Override // defpackage.thi
    public final void e(whi whiVar) {
        ArrayList arrayList;
        whi whiVar2;
        whi whiVar3;
        whi whiVar4;
        k();
        me7 me7Var = this.s;
        ofc ofcVar = this.b;
        synchronized (ofcVar.b) {
            arrayList = new ArrayList((LinkedHashSet) ofcVar.e);
        }
        ArrayList M = this.b.M();
        if (((CaptureSessionOnClosedNotCalledQuirk) me7Var.a) != null) {
            LinkedHashSet<whi> linkedHashSet = new LinkedHashSet();
            Iterator it = arrayList.iterator();
            while (it.hasNext() && (whiVar4 = (whi) it.next()) != whiVar) {
                linkedHashSet.add(whiVar4);
            }
            for (whi whiVar5 : linkedHashSet) {
                whiVar5.getClass();
                whiVar5.d(whiVar5);
            }
        }
        Objects.requireNonNull(this.e);
        ofc ofcVar2 = this.b;
        synchronized (ofcVar2.b) {
            ((LinkedHashSet) ofcVar2.c).add(this);
            ((LinkedHashSet) ofcVar2.e).remove(this);
        }
        Iterator it2 = ofcVar2.R().iterator();
        while (it2.hasNext() && (whiVar3 = (whi) it2.next()) != this) {
            synchronized (whiVar3.a) {
                try {
                    List list = whiVar3.j;
                    if (list != null) {
                        Iterator it3 = list.iterator();
                        while (it3.hasNext()) {
                            ((gi6) it3.next()).b();
                        }
                        whiVar3.j = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            whiVar3.t.c();
        }
        this.e.e(whiVar);
        if (((CaptureSessionOnClosedNotCalledQuirk) me7Var.a) != null) {
            LinkedHashSet<whi> linkedHashSet2 = new LinkedHashSet();
            Iterator it4 = M.iterator();
            while (it4.hasNext() && (whiVar2 = (whi) it4.next()) != whiVar) {
                linkedHashSet2.add(whiVar2);
            }
            for (whi whiVar6 : linkedHashSet2) {
                whiVar6.getClass();
                whiVar6.c(whiVar6);
            }
        }
    }

    @Override // defpackage.thi
    public final void f(whi whiVar) {
        Objects.requireNonNull(this.e);
        this.e.f(whiVar);
    }

    @Override // defpackage.thi
    public final void g(whi whiVar) {
        gw2 gw2Var;
        synchronized (this.a) {
            try {
                if (!this.m) {
                    this.m = true;
                    grn.f(this.g, "Need to call openCaptureSession before using this API.");
                    gw2Var = this.g;
                } else {
                    gw2Var = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (gw2Var != null) {
            gw2Var.b.addListener(new uhi(this, whiVar, 1), qt6.a());
        }
    }

    @Override // defpackage.thi
    public final void h(whi whiVar, Surface surface) {
        Objects.requireNonNull(this.e);
        this.e.h(whiVar, surface);
    }

    public final void i() {
        if (!this.v.compareAndSet(false, true)) {
            k();
            return;
        }
        if (this.u.b) {
            try {
                k();
                grn.f(this.f, "Need to call openCaptureSession before using this API.");
                ((CameraCaptureSession) ((x71) this.f.b).b).abortCaptures();
            } catch (Exception e) {
                e.toString();
                k();
            }
        }
        k();
        this.t.b().addListener(new vhi(this, 1), this.c);
    }

    public final void j(CameraCaptureSession cameraCaptureSession) {
        if (this.f == null) {
            this.f = new uhl(cameraCaptureSession);
        }
    }

    public final boolean l() {
        boolean z;
        synchronized (this.a) {
            if (this.g != null) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    public final ujb m(CameraDevice cameraDevice, syg sygVar, List list) {
        ujb e;
        synchronized (this.o) {
            try {
                ArrayList M = this.b.M();
                ArrayList arrayList = new ArrayList();
                Iterator it = M.iterator();
                while (it.hasNext()) {
                    whi whiVar = (whi) it.next();
                    arrayList.add(kkn.a(new uq8(whiVar.t.b(), whiVar.n, 1500L, 1)));
                }
                bjb bjbVar = new bjb(new ArrayList(arrayList), false, qt6.a());
                this.q = bjbVar;
                e = t79.e(t79.i(rq8.a(bjbVar), new yc5(this, cameraDevice, sygVar, list, 5), this.c));
            } catch (Throwable th) {
                throw th;
            }
        }
        return e;
    }

    public final int n(List list, CameraCaptureSession.CaptureCallback captureCallback) {
        grn.f(this.f, "Need to call openCaptureSession before using this API.");
        return ((CameraCaptureSession) ((x71) this.f.b).b).setRepeatingBurstRequests(list, this.c, captureCallback);
    }

    public final int o(CaptureRequest captureRequest, CameraCaptureSession.CaptureCallback captureCallback) {
        CameraCaptureSession.CaptureCallback a = this.t.a(captureCallback);
        grn.f(this.f, "Need to call openCaptureSession before using this API.");
        return ((CameraCaptureSession) ((x71) this.f.b).b).setSingleRepeatingRequest(captureRequest, this.c, a);
    }

    public final ujb p(ArrayList arrayList) {
        synchronized (this.a) {
            try {
                if (this.l) {
                    return new nq9(new CancellationException("Opener is disabled"), 1);
                }
                ac3 i = t79.i(rq8.a(hvn.b(arrayList, this.c, this.d)), new k0i(this, arrayList), this.c);
                this.i = i;
                return t79.e(i);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean q() {
        boolean z;
        synchronized (this.o) {
            try {
                if (l()) {
                    this.r.c(this.p);
                } else {
                    bjb bjbVar = this.q;
                    if (bjbVar != null) {
                        bjbVar.cancel(true);
                    }
                }
                rq8 rq8Var = null;
                try {
                    synchronized (this.a) {
                        try {
                            if (!this.l) {
                                rq8 rq8Var2 = this.i;
                                if (rq8Var2 != null) {
                                    rq8Var = rq8Var2;
                                }
                                this.l = true;
                            }
                            z = !l();
                        } finally {
                        }
                    }
                } finally {
                    if (rq8Var != null) {
                        rq8Var.cancel(true);
                    }
                }
            } finally {
            }
        }
        return z;
    }

    public final uhl r() {
        this.f.getClass();
        return this.f;
    }
}
