package defpackage;

import java.util.HashMap;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class y4l {
    public static final HashMap a;
    public static final HashMap b;

    static {
        HashMap hashMap = new HashMap();
        a = hashMap;
        HashMap hashMap2 = new HashMap();
        b = hashMap2;
        hashMap.put(-1, "The Play Store app is either not installed or not the official version.");
        hashMap.put(-2, "Call first requestReviewFlow to get the ReviewInfo.");
        hashMap.put(-100, "Retry with an exponential backoff. Consider filing a bug if fails consistently.");
        hashMap2.put(-1, "PLAY_STORE_NOT_FOUND");
        hashMap2.put(-2, "INVALID_REQUEST");
        hashMap2.put(-100, "INTERNAL_ERROR");
    }
}
