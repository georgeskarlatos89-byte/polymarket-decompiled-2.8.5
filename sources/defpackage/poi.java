package defpackage;

import com.stripe.stripeterminal.external.models.TapToPayUxConfiguration;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public abstract class poi {
    public static final long a = hpn.c(4278221567L);

    public static final void a(hg6 hg6Var, vl4 vl4Var, pq4 pq4Var, int i) {
        int i2;
        boolean z;
        h6i h6iVar;
        long c;
        long c2;
        sr8 sr8Var = (sr8) pq4Var;
        sr8Var.g0(-1203340882);
        if (sr8Var.h(hg6Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i3 = i2 | i;
        if ((i3 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (sr8Var.V(i3 & 1, z)) {
            n9i n9iVar = noi.a;
            boolean a2 = ztn.a(sr8Var);
            Object Q = sr8Var.Q();
            if (Q == oq4.a) {
                h6i h6iVar2 = g9i.a;
                if (a2) {
                    h6iVar = g9i.b;
                } else {
                    h6iVar = g9i.a;
                }
                h6i h6iVar3 = h6iVar;
                hc4 hc4Var = h6iVar3.i;
                if (a2) {
                    c = hpn.c(4286611584L);
                } else {
                    c = hpn.c(4285890447L);
                }
                long j = c;
                if (a2) {
                    c2 = hpn.c(4293125091L);
                } else {
                    c2 = hpn.c(4285890447L);
                }
                Q = h6i.a(h6iVar3, 0L, 0L, 0L, 0L, 0L, 0L, 0L, hc4.a(hc4Var, 0L, j, c2, hpn.c(4294115328L), 8117), 255);
                sr8Var.o0(Q);
            }
            k9i.a((h6i) Q, null, noi.a, null, null, null, null, sel.d(696781380, new ooi(hg6Var, vl4Var), sr8Var), sr8Var, 12582912, 122);
        } else {
            sr8Var.Y();
        }
        nrf u = sr8Var.u();
        if (u != null) {
            u.d = new ooi(hg6Var, vl4Var, i);
        }
    }

    public static final TapToPayUxConfiguration b() {
        return new TapToPayUxConfiguration.Builder().darkMode(TapToPayUxConfiguration.DarkMode.SYSTEM).colors(new TapToPayUxConfiguration.ColorScheme.Builder().primary(new TapToPayUxConfiguration.Color.Value(hpn.k(a))).build()).build();
    }
}
