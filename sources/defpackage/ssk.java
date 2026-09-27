package defpackage;

import kotlin.Lazy;
import kotlin.LazyKt;
import okhttp3.MediaType;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class ssk {
    public static final MediaType c = MediaType.INSTANCE.get("application/cloudevents+json; charset=utf-8");
    public final Lazy a = LazyKt.lazy(lsk.h);
    public final String b;

    public ssk(String str) {
        this.b = str;
    }
}
