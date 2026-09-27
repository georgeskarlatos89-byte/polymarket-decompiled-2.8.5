package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class trl extends ofn {
    @Override // defpackage.ofn
    public final qrl n(wrl wrlVar) {
        qrl qrlVar;
        qrl qrlVar2 = qrl.d;
        synchronized (wrlVar) {
            try {
                qrlVar = wrlVar.b;
                if (qrlVar != qrlVar2) {
                    wrlVar.b = qrlVar2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return qrlVar;
    }

    @Override // defpackage.ofn
    public final vrl o(wrl wrlVar) {
        vrl vrlVar;
        vrl vrlVar2 = vrl.c;
        synchronized (wrlVar) {
            try {
                vrlVar = wrlVar.c;
                if (vrlVar != vrlVar2) {
                    wrlVar.c = vrlVar2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return vrlVar;
    }

    @Override // defpackage.ofn
    public final void p(vrl vrlVar, vrl vrlVar2) {
        vrlVar.b = vrlVar2;
    }

    @Override // defpackage.ofn
    public final void q(vrl vrlVar, Thread thread) {
        vrlVar.a = thread;
    }

    @Override // defpackage.ofn
    public final boolean r(wrl wrlVar, qrl qrlVar, qrl qrlVar2) {
        synchronized (wrlVar) {
            try {
                if (wrlVar.b == qrlVar) {
                    wrlVar.b = qrlVar2;
                    return true;
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.ofn
    public final boolean s(wrl wrlVar, Object obj, Object obj2) {
        synchronized (wrlVar) {
            try {
                if (wrlVar.a == obj) {
                    wrlVar.a = obj2;
                    return true;
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.ofn
    public final boolean t(wrl wrlVar, vrl vrlVar, vrl vrlVar2) {
        synchronized (wrlVar) {
            try {
                if (wrlVar.c == vrlVar) {
                    wrlVar.c = vrlVar2;
                    return true;
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
