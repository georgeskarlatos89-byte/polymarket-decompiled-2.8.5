package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public abstract class on7 extends g85 {
    public static final /* synthetic */ int e = 0;
    public long b;
    public boolean c;
    public vk0 d;

    public final void A0(boolean z) {
        long j;
        long j2 = this.b;
        if (z) {
            j = 4294967296L;
        } else {
            j = 1;
        }
        long j3 = j2 - j;
        this.b = j3;
        if (j3 <= 0 && this.c) {
            shutdown();
        }
    }

    public final void C0(hv6 hv6Var) {
        vk0 vk0Var = this.d;
        if (vk0Var == null) {
            vk0Var = new vk0();
            this.d = vk0Var;
        }
        vk0Var.addLast(hv6Var);
    }

    public final void E0(boolean z) {
        long j;
        long j2 = this.b;
        if (z) {
            j = 4294967296L;
        } else {
            j = 1;
        }
        this.b = j + j2;
        if (!z) {
            this.c = true;
        }
    }

    public long I0() {
        if (!S0()) {
            return Long.MAX_VALUE;
        }
        return 0L;
    }

    public final boolean S0() {
        Object removeFirst;
        vk0 vk0Var = this.d;
        if (vk0Var != null) {
            if (vk0Var.isEmpty()) {
                removeFirst = null;
            } else {
                removeFirst = vk0Var.removeFirst();
            }
            hv6 hv6Var = (hv6) removeFirst;
            if (hv6Var == null) {
                return false;
            }
            hv6Var.run();
            return true;
        }
        return false;
    }

    @Override // defpackage.g85
    public final g85 y0(int i) {
        k6n.c(i);
        return this;
    }

    public void shutdown() {
    }
}
