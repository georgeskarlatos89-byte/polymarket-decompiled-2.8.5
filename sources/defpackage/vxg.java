package defpackage;

import java.util.Date;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class vxg {
    public volatile long c;
    public volatile long e;
    public volatile long f;
    public final Function0 a = new ljg(19);
    public final Object b = new Object();
    public volatile long d = Long.MAX_VALUE;

    public final Date a() {
        return new Date(((Number) this.a.invoke()).longValue() - this.c);
    }
}
