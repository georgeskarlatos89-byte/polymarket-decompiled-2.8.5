package defpackage;

import java.util.Map;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class bpg implements xog {
    public final Map a;

    public bpg(Map map) {
        this.a = map;
    }

    @Override // defpackage.xog
    public final Object a(String str) {
        return this.a.get(str);
    }
}
