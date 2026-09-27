package defpackage;

import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class qem extends pdl {
    public static final /* synthetic */ int d = 0;
    public final AtomicLong c = new AtomicLong(-1);

    static {
        new bdl(3);
    }

    @Override // defpackage.pdl
    public final void a() {
        AtomicLong atomicLong = this.c;
        atomicLong.set(Math.max(-atomicLong.get(), 0L));
    }
}
