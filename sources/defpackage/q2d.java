package defpackage;

import okhttp3.MediaType;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract class q2d {
    public static final MediaType a;
    public static final MediaType b;

    static {
        MediaType.Companion companion = MediaType.INSTANCE;
        a = companion.get("application/json; charset=utf-8");
        b = companion.get("application/json");
    }
}
