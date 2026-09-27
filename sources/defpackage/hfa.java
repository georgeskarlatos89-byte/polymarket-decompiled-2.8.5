package defpackage;

import com.google.gson.stream.JsonToken;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract /* synthetic */ class hfa {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[JsonToken.values().length];
        a = iArr;
        try {
            iArr[JsonToken.BEGIN_ARRAY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            a[JsonToken.BEGIN_OBJECT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            a[JsonToken.STRING.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            a[JsonToken.NUMBER.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            a[JsonToken.BOOLEAN.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            a[JsonToken.NULL.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
    }
}
