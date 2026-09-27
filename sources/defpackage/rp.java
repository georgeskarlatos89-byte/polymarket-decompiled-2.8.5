package defpackage;

import java.util.UUID;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.text.e;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class rp {
    public static final Lazy i = LazyKt.lazy(vo.k);
    public vhb a;
    public Boolean b;
    public Boolean c;
    public Boolean d;
    public String e;
    public Boolean f;
    public String g;
    public final String h;

    public rp() {
        String uuid = UUID.randomUUID().toString();
        uuid.getClass();
        this.h = e.s(uuid, "-", "");
    }

    public final void a() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
    }
}
